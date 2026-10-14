package volucris.bindings.generator.generation.record;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.jspecify.annotations.Nullable;

import freemarker.template.Configuration;
import freemarker.template.Template;
import volucris.bindings.generator.config.ClassConfig.StructDescription;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.generator.config.GlobalConfig;
import volucris.bindings.generator.generation.Clazz;
import volucris.bindings.generator.generation.GeneratorUtils;
import volucris.bindings.generator.generation.Modifier;
import volucris.bindings.generator.generation.constructors.Constructor;
import volucris.bindings.generator.generation.fields.ArrayField;
import volucris.bindings.generator.generation.fields.Field;
import volucris.bindings.generator.generation.fields.GenericField;
import volucris.bindings.generator.generation.fields.MemberOffsetField;
import volucris.bindings.generator.generation.fields.MemorySegmentField;
import volucris.bindings.generator.generation.fields.RecordLayoutField;
import volucris.bindings.generator.generation.fields.VarHandleField;
import volucris.bindings.generator.generation.methods.Method;
import volucris.bindings.generator.parsing.NativeFunctionPointer;
import volucris.bindings.generator.parsing.NativeRecord;
import volucris.bindings.generator.parsing.NativeRecord.FunctionPointerField;
import volucris.bindings.generator.parsing.NativeType;
import volucris.bindings.generator.parsing.NativeTypeKind;
import volucris.bindings.generator.parsing.NativeType.ArrayType;
import volucris.bindings.generator.parsing.NativeType.TypeResult;

public class NativeRecordHandler {

	private static final Configuration CONFIG;

	private static final Template RECORD_LAYOUT_TEMPLATE;
	private static final Template PRIMITIVE_VAR_HANDLE_METHOD_TEMPLATE;
	private static final Template POINTER_VAR_HANDLE_METHOD_TEMPLATE;
	private static final Template RECORD_MEMBER_ACCESSOR_METHOD_TEMPLATE;
	private static final Template NESTED_CLASS_TEMPLATE;
	private static final Template RECORD_UTILITY_METHODS_TEMPLATE;
	private static final Template RECORD_CONSTRUCTOR_TEMPLATE;

	static {
		CONFIG = new Configuration(Configuration.VERSION_2_3_35);
		CONFIG.setDefaultEncoding("UTF-8");
		CONFIG.setClassForTemplateLoading(NativeRecordHandler.class, "/templates");

		try {
			RECORD_LAYOUT_TEMPLATE = CONFIG.getTemplate("/record/RecordLayoutTemplate.ftl");
			PRIMITIVE_VAR_HANDLE_METHOD_TEMPLATE = CONFIG.getTemplate("/record/PrimitiveMethodTemplate.ftl");
			POINTER_VAR_HANDLE_METHOD_TEMPLATE = CONFIG.getTemplate("/record/PointerMethodTemplate.ftl");
			RECORD_MEMBER_ACCESSOR_METHOD_TEMPLATE = CONFIG.getTemplate("/record/RecordMemberAccessorMethodTemplate.ftl");
			NESTED_CLASS_TEMPLATE = CONFIG.getTemplate("/record/NestedClassTemplate.ftl");
			RECORD_UTILITY_METHODS_TEMPLATE = CONFIG.getTemplate("/record/RecordUtilityMethodsTemplate.ftl");
			RECORD_CONSTRUCTOR_TEMPLATE = CONFIG.getTemplate("/record/RecordConstructorTemplate.ftl");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public NativeRecordHandler(
			Clazz clazz,
			StructDescription structDescription,
			NativeRecord nativeRecord,
			GlobalConfig globalConfig
	) {
		Objects.requireNonNull(nativeRecord);

		clazz.setJavadoc(nativeRecord.getComment());

		RecordLayoutField layoutField = new RecordLayoutField(nativeRecord.isUnion());

		clazz.addField(layoutField);

		NativeRecordLayoutBuilder layoutBuilder = new NativeRecordLayoutBuilder(
				globalConfig, nativeRecord, layoutField, RECORD_LAYOUT_TEMPLATE
		);
		clazz.addStaticImports(layoutBuilder.getRequiredStaticImports());
		clazz.getStaticBlock().addRecordLayout(layoutBuilder.getLayout());

		List<MemberInformation> memberInformations = getMemberInformations(
				nativeRecord,
				structDescription,
				layoutField,
				globalConfig,
				clazz.getClazzName(),
				List.of()
		);

		clazz.addField(new MemorySegmentField(Modifier.PRIVATE, Modifier.FINAL));

		clazz.addFields(
				memberInformations.stream()
						.flatMap(memberInformation -> memberInformation.varHandleFields().stream())
						.toList()
		);
		clazz.addFields(
				memberInformations.stream()
						.flatMap(memberInformation -> memberInformation.offsetFields().stream())
						.toList()
		);
		clazz.addFields(
				memberInformations.stream()
						.flatMap(memberInformation -> memberInformation.otherFields().stream())
						.toList()
		);

		clazz.addMethods(
				memberInformations.stream()
						.flatMap(memberInformation -> memberInformation.methods().stream())
						.toList()
		);

		clazz.addNestedClazzes(
				memberInformations.stream()
						.flatMap(memberInformation -> memberInformation.clazzes().stream())
						.toList(),
				NESTED_CLASS_TEMPLATE
		);

		clazz.getStaticBlock().addOffsetFieldsInitializations(
				memberInformations.stream()
						.flatMap(memberInformation -> memberInformation.offsetFieldsInitializations().stream())
						.toList()
		);

		clazz.getStaticBlock().addVarHandleFieldsInitializations(
				memberInformations.stream()
						.flatMap(memberInformation -> memberInformation.varHandleFieldsInitializations().stream())
						.toList()
		);

		clazz.addMethod(
				new Method(RECORD_UTILITY_METHODS_TEMPLATE, Map.of("className", clazz.getClazzName()))
		);
		clazz.addImport(Arena.class.getCanonicalName());
		clazz.addImport(NativeStructArray.class.getCanonicalName());
		clazz.addImport(MemorySegment.class.getCanonicalName());

		List<String> constructorElements = memberInformations.stream()
				.flatMap(memberInformation -> memberInformation.otherFieldsInitializations().stream())
				.toList();
		
		try {
			Template constructorTemplate = structDescription.getTemplate() == null
					? RECORD_CONSTRUCTOR_TEMPLATE
					: CONFIG.getTemplate(structDescription.getTemplate());
			
			clazz.addConstructor(
					new Constructor(
							constructorTemplate,
							Map.ofEntries(
									Map.entry("className", clazz.getClazzName()),
									Map.entry("layoutFieldName", layoutField.getName()),
									Map.entry("elements", constructorElements)
							)
					)
			);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static List<MemberInformation> getMemberInformations(
			NativeRecord nativeRecord,
			StructDescription structDescription,
			RecordLayoutField recordLayoutField,
			GlobalConfig globalConfig,
			String className,
			List<String> additionalPathElements
	) {
		List<MemberInformation> memberInformations = new ArrayList<MemberInformation>();

		nativeRecord.getMembers().forEach(nativeMember -> {
			switch (nativeMember) {
				case NativeRecord.Padding _ -> {
					// Nothing to do here
				}
				case NativeRecord.AnonymousRecord anonymousRecordMember -> {
					memberInformations.add(
							new AnonymousRecordMemberInformation(
									anonymousRecordMember,
									recordLayoutField,
									globalConfig,
									className,
									additionalPathElements
							)
					);
				}
				case NativeRecord.NativeField nativeField -> {
					TypeResult typeResult = nativeField.getType();

					NativeTypeKind typeKind = typeResult.typeKind();

					if (typeResult.typeKind() == NativeTypeKind.RECORD) {
						memberInformations.add(
								new RecordMemberInformation(
										nativeField,
										recordLayoutField,
										globalConfig,
										className,
										additionalPathElements
								)
						);
					} else if (typeKind == NativeTypeKind.ARRAY) {
						ArrayInformation arrayInformation = getArrayInformation((ArrayType) typeResult);

						NativeTypeKind elementTypeKind = arrayInformation.elementType().typeKind();

						if (elementTypeKind.isPrimitive()) {
							memberInformations.add(
									new PrimitiveMemberInformation(
											arrayInformation,
											nativeField,
											recordLayoutField,
											className,
											additionalPathElements,
											structDescription
									)
							);
						} else if (elementTypeKind.isPointer()) {
							memberInformations.add(
									new PointerMemberInformation(
											arrayInformation,
											nativeField,
											recordLayoutField,
											globalConfig,
											className,
											structDescription,
											additionalPathElements
									)
							);
						} else if (elementTypeKind == NativeTypeKind.RECORD) {
							memberInformations.add(
									new RecordMemberInformation(
											arrayInformation,
											nativeField,
											recordLayoutField,
											globalConfig,
											className,
											additionalPathElements
									)
							);
						} else {
							throw new RuntimeException(
									"Unsupported array element type kind "
											+ arrayInformation.elementType().typeKind()
							);
						}
					} else if (typeKind != NativeTypeKind.UNKNOWN && typeKind != NativeTypeKind.VOID) {
						if (typeKind.isPrimitive()) {
							memberInformations.add(
									new PrimitiveMemberInformation(
											nativeField,
											recordLayoutField,
											className,
											additionalPathElements
									)
							);
						} else if (typeKind.isPointer()) {
							memberInformations.add(
									new PointerMemberInformation(
											nativeField,
											recordLayoutField,
											globalConfig,
											className,
											structDescription,
											additionalPathElements
									)
							);
						}
					} else {
						throw new RuntimeException("Unsupported field type kind " + typeKind);
					}
				}
			}
		});

		return Collections.unmodifiableList(memberInformations);
	}

	private static interface MemberInformation {

		List<MemberOffsetField> offsetFields();

		List<String> offsetFieldsInitializations();

		List<VarHandleField> varHandleFields();

		List<String> varHandleFieldsInitializations();

		List<Field> otherFields();

		List<String> otherFieldsInitializations();

		List<Method> methods();

		List<Clazz> clazzes();
	}

	/// Information of a primitive member or an array of primitives member.
	private static class PrimitiveMemberInformation implements MemberInformation {

		private final MemberOffsetField memberOffsetField;

		private final VarHandleField varHandleField;

		private final Method varHandleMethod;

		private final String memberOffsetFieldInitialization;

		private final String varHandleFieldInitialization;

		private @Nullable Method byteArrayStringMethod;

		public PrimitiveMemberInformation(
				ArrayInformation arrayInformation,
				NativeRecord.NativeField nativeField,
				RecordLayoutField recordLayoutField,
				String className,
				List<String> additionalPathElements,
				StructDescription structDescription
		) {
			if (!arrayInformation.elementType().typeKind().isPrimitive())
				throw new RuntimeException("Array does not contain a primitive.");
			if (arrayInformation.depth() < 1)
				throw new RuntimeException("Array depth msut be at least 1.");

			this(
					arrayInformation.elementType().typeKind(),
					arrayInformation.depth(),
					nativeField,
					recordLayoutField,
					className,
					additionalPathElements
			);

			if (arrayInformation.elementType().typeKind() != NativeTypeKind.BYTE)
				return;

			if (!structDescription.getStringFields().contains(nativeField.getName()))
				return;

			String methodSource = """
					public String %s() {
					    return segment.getString(%s);
					}
					""".formatted(nativeField.getName(), memberOffsetField.getName());

			byteArrayStringMethod = new Method(methodSource, List.of());
		}

		public PrimitiveMemberInformation(
				NativeRecord.NativeField nativeField,
				RecordLayoutField recordLayoutField,
				String className,
				List<String> additionalPathElements
		) {
			if (!nativeField.getType().typeKind().isPrimitive())
				throw new RuntimeException("Field type is not a primitive.");

			this(
					nativeField.getType().typeKind(),
					0,
					nativeField,
					recordLayoutField,
					className,
					additionalPathElements
			);
		}

		private PrimitiveMemberInformation(
				NativeTypeKind primitiveKind,
				int arrayDepth,
				NativeRecord.NativeField nativeField,
				RecordLayoutField recordLayoutField,
				String className,
				List<String> additionalPathElements
		) {
			this.memberOffsetField = new MemberOffsetField(nativeField.getName());

			this.varHandleField = new VarHandleField(nativeField.getName());

			Map<String, Object> dataModel = new HashMap<String, Object>();
			dataModel.put("className", className);
			dataModel.put("memberName", GeneratorUtils.makeFirstCharacterLowerCase(nativeField.getName()));
			dataModel.put("varHandleFieldName", varHandleField.getName());
			dataModel.put("javadoc", GeneratorUtils.getJavadoc(nativeField.getComment()));
			dataModel.put("primitiveType", NativeTypeKind.getPrimitiveType(primitiveKind));
			dataModel.put("arrayDepth", arrayDepth);

			this.varHandleMethod = new Method(PRIMITIVE_VAR_HANDLE_METHOD_TEMPLATE, dataModel);

			List<String> pathElements = new ArrayList<String>();
			pathElements.addAll(additionalPathElements);
			pathElements.add("PathElement.groupElement(\"%s\")".formatted(nativeField.getName()));

			this.memberOffsetFieldInitialization = "%s = %s.byteOffset(%s);"
					.formatted(
							memberOffsetField.getName(),
							recordLayoutField.getName(),
							String.join(", ", pathElements)
					);

			pathElements.addAll(Collections.nCopies(arrayDepth, "PathElement.sequenceElement()"));

			this.varHandleFieldInitialization = "%s = %s.varHandle(%s);"
					.formatted(
							varHandleField.getName(),
							recordLayoutField.getName(),
							String.join(", ", pathElements)
					);
		}

		@Override
		public List<MemberOffsetField> offsetFields() {
			return List.of(memberOffsetField);
		}

		@Override
		public List<String> offsetFieldsInitializations() {
			return List.of(memberOffsetFieldInitialization);
		}

		@Override
		public List<VarHandleField> varHandleFields() {
			return List.of(varHandleField);
		}

		@Override
		public List<String> varHandleFieldsInitializations() {
			return List.of(varHandleFieldInitialization);
		}

		@Override
		public List<Field> otherFields() {
			return List.of();
		}

		@Override
		public List<String> otherFieldsInitializations() {
			return List.of();
		}

		@Override
		public List<Method> methods() {
			if (byteArrayStringMethod == null)
				return List.of(varHandleMethod);
			else
				return List.of(varHandleMethod, byteArrayStringMethod);
		}

		@Override
		public List<Clazz> clazzes() {
			return List.of();
		}

	}

	/// Information of a pointer member or an array of pointers member.
	private static class PointerMemberInformation implements MemberInformation {

		private final MemberOffsetField memberOffsetField;

		private final VarHandleField varHandleField;

		private final Method varHandleMethod;

		private final String memberOffsetFieldInitialization;

		private final String varHandleFieldInitialization;

		public PointerMemberInformation(
				ArrayInformation arrayInformation,
				NativeRecord.NativeField nativeField,
				RecordLayoutField recordLayoutField,
				GlobalConfig globalConfig,
				String className,
				StructDescription structDescription,
				List<String> additionalPathElements
		) {
			if (!arrayInformation.elementType().typeKind().isPointer())
				throw new RuntimeException("Array does not contain a pointer.");
			if (arrayInformation.depth() < 1)
				throw new RuntimeException("Array depth must be at least 1.");

			this(
					arrayInformation.elementType(),
					arrayInformation.depth(),
					nativeField,
					recordLayoutField,
					globalConfig,
					className,
					structDescription,
					additionalPathElements
			);
		}

		public PointerMemberInformation(
				NativeRecord.NativeField nativeField,
				RecordLayoutField recordLayoutField,
				GlobalConfig globalConfig,
				String className,
				StructDescription structDescription,
				List<String> additionalPathElements
		) {

			if (!nativeField.getType().typeKind().isPointer())
				throw new RuntimeException("Field type is not a pointer.");

			this(
					nativeField.getType(),
					0,
					nativeField,
					recordLayoutField,
					globalConfig,
					className,
					structDescription,
					additionalPathElements
			);
		}

		private PointerMemberInformation(
				NativeType.TypeResult pointerType,
				int arrayDepth,
				NativeRecord.NativeField nativeField,
				RecordLayoutField recordLayoutField,
				GlobalConfig globalConfig,
				String className,
				StructDescription structDescription,
				List<String> additionalPathElements
		) {
			this.varHandleField = new VarHandleField(nativeField.getName());

			this.memberOffsetField = new MemberOffsetField(nativeField.getName());

			List<String> requiredImports = new ArrayList<String>();
			requiredImports.add(Nullable.class.getCanonicalName());

			Map<String, Object> dataModel = new HashMap<String, Object>();
			dataModel.put("className", className);
			dataModel.put("memberName", GeneratorUtils.makeFirstCharacterLowerCase(nativeField.getName()));
			dataModel.put("varHandleFieldName", varHandleField.getName());
			dataModel.put("javadoc", GeneratorUtils.getJavadoc(nativeField.getComment()));
			dataModel.put("arrayDepth", arrayDepth);

			getAdditionalData(
					globalConfig,
					nativeField,
					pointerType,
					dataModel,
					requiredImports,
					structDescription.getStringFields().contains(nativeField.getName()),
					structDescription.getStructArrays().contains(nativeField.getName())
			);

			this.varHandleMethod = new Method(POINTER_VAR_HANDLE_METHOD_TEMPLATE, dataModel, requiredImports);

			List<String> pathElements = new ArrayList<String>();
			pathElements.addAll(additionalPathElements);
			pathElements.add("PathElement.groupElement(\"%s\")".formatted(nativeField.getName()));

			this.memberOffsetFieldInitialization = "%s = %s.byteOffset(%s);"
					.formatted(
							memberOffsetField.getName(),
							recordLayoutField.getName(),
							String.join(", ", pathElements)
					);

			pathElements.addAll(Collections.nCopies(arrayDepth, "PathElement.sequenceElement()"));

			this.varHandleFieldInitialization = "%s = %s.varHandle(%s);"
					.formatted(
							varHandleField.getName(),
							recordLayoutField.getName(),
							String.join(", ", pathElements)
					);
		}

		private void getAdditionalData(
				GlobalConfig globalConfig,
				NativeRecord.NativeField nativeField,
				NativeType.TypeResult pointerType,
				Map<String, Object> dataModel,
				List<String> requiredImports,
				boolean isString,
				boolean isStructArray
		) {
			switch (pointerType.typeKind()) {
				case POINTER, VOID_POINTER -> {
					dataModel.put("isRawSegment", true);
					dataModel.put(
							"pointerType",
							NativeTypeKind.getPointerTypeClass(pointerType.typeKind(), requiredImports)
					);
				}
				case BYTE_POINTER -> {
					if (isString) {
						dataModel.put("isString", true);
						dataModel.put(
								"pointerType",
								NativeTypeKind.getPointerTypeClass(NativeTypeKind.STRING, requiredImports)
						);
					} else {
						dataModel.put(
								"pointerType",
								NativeTypeKind.getPointerTypeClass(pointerType.typeKind(), requiredImports)
						);
					}
				}
				case RECORD_POINTER -> {
					dataModel.put("isStructArray", isStructArray);

					dataModel.put(
							"pointerType",
							GeneratorUtils.transformName(globalConfig, pointerType.typeName(), false)
					);
				}
				case FUNCTION_POINTER -> {
					if (nativeField instanceof FunctionPointerField functionPointerField) {
						NativeFunctionPointer functionPointer = functionPointerField.getFunctionPointer();

						String typeName = GeneratorUtils.transformName(globalConfig, functionPointer.getName(), false);
						dataModel.put("pointerType", typeName);
					} else {
						String typeName = GeneratorUtils.transformName(globalConfig, pointerType.typeName(), false);
						dataModel.put("pointerType", typeName);
					}
					dataModel.put("isFunctionPointer", true);
				}
				default -> {
					dataModel.put(
							"pointerType",
							NativeTypeKind.getPointerTypeClass(pointerType.typeKind(), requiredImports)
					);
				}
			}
		}

		@Override
		public List<MemberOffsetField> offsetFields() {
			return List.of(memberOffsetField);
		}

		@Override
		public List<String> offsetFieldsInitializations() {
			return List.of(memberOffsetFieldInitialization);
		}

		@Override
		public List<VarHandleField> varHandleFields() {
			return List.of(varHandleField);
		}

		@Override
		public List<String> varHandleFieldsInitializations() {
			return List.of(varHandleFieldInitialization);
		}

		@Override
		public List<Field> otherFields() {
			return List.of();
		}

		@Override
		public List<String> otherFieldsInitializations() {
			return List.of();
		}

		@Override
		public List<Method> methods() {
			return List.of(varHandleMethod);
		}

		@Override
		public List<Clazz> clazzes() {
			return List.of();
		}

	}

	/// Information of a record member (the type of the member is a record) or an array of records member.
	private static class RecordMemberInformation implements MemberInformation {

		private final MemberOffsetField memberOffsetField;

		private final Field memberField;

		private final Method accessorMethod;

		private final String memberOffsetFieldInitialization;

		private final String memberFieldInitialization;

		private final @Nullable Clazz clazzModel;

		public RecordMemberInformation(
				ArrayInformation arrayInformation,
				NativeRecord.NativeField nativeField,
				RecordLayoutField recordLayoutField,
				GlobalConfig globalConfig,
				String className,
				List<String> additionalPathElements
		) {
			if (arrayInformation.elementType().typeKind() != NativeTypeKind.RECORD)
				throw new RuntimeException("Array does not contain records.");
			if (arrayInformation.depth() < 1)
				throw new RuntimeException("Array depth must be at least 1.");
			if (arrayInformation.depth() > 1) {
				String m1 = "Building accessor for multi dimensional arrays of record types is currently not supported.";
				throw new RuntimeException(m1);
			}

			this(
					arrayInformation.elementType(),
					arrayInformation.dimensions(),
					nativeField,
					recordLayoutField,
					globalConfig,
					className,
					additionalPathElements
			);
		}

		public RecordMemberInformation(
				NativeRecord.NativeField nativeField,
				RecordLayoutField recordLayoutField,
				GlobalConfig globalConfig,
				String className,
				List<String> additionalPathElements
		) {
			if (nativeField.getType().typeKind() != NativeTypeKind.RECORD)
				throw new RuntimeException("Field type is not a record.");

			this(
					nativeField.getType(),
					List.of(),
					nativeField,
					recordLayoutField,
					globalConfig,
					className,
					additionalPathElements
			);
		}

		private RecordMemberInformation(
				NativeType.TypeResult recordType,
				List<Integer> arrayDimensions,
				NativeRecord.NativeField nativeField,
				RecordLayoutField recordLayoutField,
				GlobalConfig globalConfig,
				String className,
				List<String> additionalPathElements
		) {
			int arrayDepth = arrayDimensions.size();
			
			this.memberOffsetField = new MemberOffsetField(nativeField.getName());

			List<String> pathElements = new ArrayList<String>();
			pathElements.addAll(additionalPathElements);
			pathElements.add("PathElement.groupElement(\"%s\")".formatted(nativeField.getName()));

			this.memberOffsetFieldInitialization = "%s = %s.byteOffset(%s);"
					.formatted(
							memberOffsetField.getName(),
							recordLayoutField.getName(),
							String.join(", ", pathElements)
					);

			String fieldName = Character.toLowerCase(nativeField.getName().charAt(0))
					+ nativeField.getName().substring(1);

			String recordTypeName;

			if (nativeField instanceof NativeRecord.UnnamedRecordField unnamedRecordField) {
				recordTypeName = unnamedRecordField.getNativeRecord().getName();

				this.clazzModel = new Clazz(
						unnamedRecordField.getNativeRecord().getName(),
						List.of(Modifier.PUBLIC, Modifier.STATIC)
				);

				new NativeRecordHandler(
						clazzModel,
						new StructDescription(),
						unnamedRecordField.getNativeRecord(),
						globalConfig
				);

			} else {
				recordTypeName = GeneratorUtils.transformName(globalConfig, recordType.typeName(), false);

				this.clazzModel = null;
			}

			if (arrayDepth == 0) {
				this.memberField = new GenericField(
						fieldName,
						recordTypeName,
						Modifier.PRIVATE, Modifier.FINAL
				);

				this.memberFieldInitialization = "%s = new %s(segment.asSlice(%s, %s.LAYOUT));"
						.formatted(memberField.getName(), recordTypeName, memberOffsetField.getName(), recordTypeName);
			} else {
				this.memberField = new ArrayField(
						fieldName,
						recordTypeName,
						arrayDepth,
						Modifier.PRIVATE, Modifier.FINAL
				);

				this.memberFieldInitialization = """
						%1$s = new %2$s[%4$s];
						for (int i = 0; i < %4$s; i++) {
						    long offset = %3$s + i * %2$s.LAYOUT.byteSize();
						    %1$s[i] = new %2$s(segment.asSlice(offset, %2$s.LAYOUT));
						}
						"""
						.formatted(memberField.getName(), recordTypeName, memberOffsetField.getName(), arrayDimensions.get(0));
			}

			Map<String, Object> dataModel = new HashMap<>();
			dataModel.put("className", className);
			dataModel.put("memberName", GeneratorUtils.makeFirstCharacterLowerCase(nativeField.getName()));
			dataModel.put("javadoc", GeneratorUtils.getJavadoc(nativeField.getComment()));
			dataModel.put("typeName", recordTypeName);
			dataModel.put("isArray", arrayDepth != 0);

			accessorMethod = new Method(RECORD_MEMBER_ACCESSOR_METHOD_TEMPLATE, dataModel, List.of(Consumer.class.getCanonicalName()));
		}

		@Override
		public List<MemberOffsetField> offsetFields() {
			return List.of(memberOffsetField);
		}

		@Override
		public List<String> offsetFieldsInitializations() {
			return List.of(memberOffsetFieldInitialization);
		}

		@Override
		public List<VarHandleField> varHandleFields() {
			return List.of();
		}

		@Override
		public List<String> varHandleFieldsInitializations() {
			return List.of();
		}

		@Override
		public List<Field> otherFields() {
			return List.of(memberField);
		}

		@Override
		public List<String> otherFieldsInitializations() {
			return List.of(memberFieldInitialization);
		}

		@Override
		public List<Method> methods() {
			return List.of(accessorMethod);
		}

		@Override
		public List<Clazz> clazzes() {
			if (clazzModel == null)
				return List.of();
			else
				return List.of(clazzModel);
		}

	}

	private static class AnonymousRecordMemberInformation implements MemberInformation {

		private final List<MemberInformation> memberInformations;

		public AnonymousRecordMemberInformation(
				NativeRecord.AnonymousRecord anonymousRecord,
				RecordLayoutField recordLayoutField,
				GlobalConfig globalConfig,
				String className,
				List<String> additionalPathElements
		) {
			String pathElement = "PathElement.groupElement(\"%s\")".formatted(anonymousRecord.getArtificalName());

			additionalPathElements = Stream.concat(additionalPathElements.stream(), Stream.of(pathElement)).toList();

			this.memberInformations = getMemberInformations(
					anonymousRecord.getNativeRecord(),
					new StructDescription(),
					recordLayoutField,
					globalConfig,
					className,
					additionalPathElements
			);
		}

		@Override
		public List<MemberOffsetField> offsetFields() {
			return memberInformations.stream()
					.flatMap(memberInformation -> memberInformation.offsetFields().stream())
					.toList();
		}

		@Override
		public List<String> offsetFieldsInitializations() {
			return memberInformations.stream()
					.flatMap(memberInformation -> memberInformation.offsetFieldsInitializations().stream())
					.toList();
		}

		@Override
		public List<VarHandleField> varHandleFields() {
			return memberInformations.stream()
					.flatMap(memberInformation -> memberInformation.varHandleFields().stream())
					.toList();
		}

		@Override
		public List<String> varHandleFieldsInitializations() {
			return memberInformations.stream()
					.flatMap(memberInformation -> memberInformation.varHandleFieldsInitializations().stream())
					.toList();
		}

		@Override
		public List<Field> otherFields() {
			return memberInformations.stream()
					.flatMap(memberInformation -> memberInformation.otherFields().stream())
					.toList();
		}

		@Override
		public List<String> otherFieldsInitializations() {
			return memberInformations.stream()
					.flatMap(memberInformation -> memberInformation.otherFieldsInitializations().stream())
					.toList();
		}

		@Override
		public List<Method> methods() {
			return memberInformations.stream()
					.flatMap(memberInformation -> memberInformation.methods().stream())
					.toList();
		}

		@Override
		public List<Clazz> clazzes() {
			return memberInformations.stream()
					.flatMap(memberInformation -> memberInformation.clazzes().stream())
					.toList();
		}

	}

	private static ArrayInformation getArrayInformation(NativeType.ArrayType arrayType) {
		List<Integer> dimensions = new ArrayList<Integer>();
		dimensions.add((int) arrayType.elementCount());

		while (arrayType.elementKind() == NativeTypeKind.ARRAY) {
			arrayType = (ArrayType) arrayType.elementType();
			dimensions.add((int) arrayType.elementCount());
		}

		return new ArrayInformation(arrayType.elementType(), List.copyOf(dimensions), dimensions.size());
	}

	private static record ArrayInformation(NativeType.TypeResult elementType, List<Integer> dimensions, int depth) {

	}

}
