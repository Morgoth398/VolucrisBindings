package volucris.bindings.generator.generation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import org.jspecify.annotations.Nullable;
import volucris.bindings.core.Struct;
import volucris.bindings.generator.config.ClassConfig.ClassDescription;
import volucris.bindings.generator.generation.constructors.Constructor;
import volucris.bindings.generator.generation.fields.Field;
import volucris.bindings.generator.generation.methods.Method;

public class Clazz {

	private final Set<String> imports;
	private final Set<String> staticImports;

	private final List<Field> fields;
	private final List<Field> nestedStructureFields;

	private final List<Method> methods;
	private final List<Modifier> modifiers;
	private final List<Constructor> constructors;
	
	private final ClassDescription classDescription;

	private final StaticBlock staticBlock;

	private final String header;

	private String javadoc;

	public Clazz(ClassDescription classDescription, boolean classHasStruct) {
		this.classDescription = classDescription;

		this.staticBlock = new StaticBlock();

		this.imports = new HashSet<String>();
		this.staticImports = new HashSet<String>();

		this.fields = new ArrayList<Field>();
		this.methods = new ArrayList<Method>();
		this.constructors = new ArrayList<Constructor>();
		this.nestedStructureFields = new ArrayList<Field>();

		this.header = getHeader(classDescription, classHasStruct);

		if (classHasStruct)
			imports.add(Struct.class.getCanonicalName());

		boolean isSealed = classDescription.getIsSealed() && !classDescription.getPermits().isEmpty();
		boolean isAbstract = classDescription.getIsAbstract();
		boolean isFinal = classDescription.getIsFinal();

		if (isFinal && isAbstract)
			throw new RuntimeException("Class cannot be final and abstract at the same time.");
		if (isFinal && isSealed)
			throw new RuntimeException("Class cannot be final and sealed at the same time.");

		LinkedHashSet<Modifier> modifiers = new LinkedHashSet<Modifier>();
		modifiers.add(Modifier.PUBLIC);
		if (isAbstract)
			modifiers.add(Modifier.ABSTRACT);
		if (isSealed)
			modifiers.add(Modifier.SEALED);
		if (isFinal)
			modifiers.add(Modifier.FINAL);

		this.modifiers = List.copyOf(modifiers);
	}

	private String getHeader(ClassDescription classDescription, boolean classHasStruct) {
		StringBuilder stringBuilder = new StringBuilder();

		if (!classDescription.getParent().isBlank())
			stringBuilder.append(" extends ").append(classDescription.getParent());
		if (!classDescription.getInterfaces().isEmpty()) {
			stringBuilder.append("\n\t\timplements ");

			if (classHasStruct)
				stringBuilder.append("Struct<" + classDescription.getName() + ">,\n\t\t");

			for (int i = 0; i < classDescription.getInterfaces().size(); i++) {
				if (i == 0)
					stringBuilder.append(classDescription.getInterfaces().get(i));
				else
					stringBuilder.append(",\n\t\t").append(classDescription.getInterfaces().get(i));
			}
		} else if (classHasStruct) {
			stringBuilder.append("\n\t\timplements Struct<" + classDescription.getName() + ">");
		}
		if (classDescription.getIsSealed() && !classDescription.getPermits().isEmpty()) {
			stringBuilder.append("\n\t\tpermits ");
			for (int i = 0; i < classDescription.getPermits().size(); i++) {
				if (i == 0)
					stringBuilder.append(classDescription.getPermits().get(i));
				else
					stringBuilder.append(",\n\t\t").append(classDescription.getPermits().get(i));
			}
		}
		return stringBuilder.toString();
	}

	public Clazz addField(Field field) {
		imports.addAll(field.getRequiredImports());
		fields.add(field);
		return this;
	}

	public Clazz addFields(List<Field> fields) {
		fields.forEach(field -> imports.addAll(field.getRequiredImports()));
		this.fields.addAll(fields);
		return this;
	}

	public Clazz addNestedStructureField(Field field) {
		imports.addAll(field.getRequiredImports());
		nestedStructureFields.add(field);
		return this;
	}

	public Clazz addNestedStructureFields(List<Field> fields) {
		fields.forEach(field -> imports.addAll(field.getRequiredImports()));
		this.nestedStructureFields.addAll(fields);
		return this;
	}
	
	public Clazz updateLastField(Consumer<Field> consumer) {

		if (!fields.isEmpty())
			consumer.accept(fields.getLast());

		return this;
	}

	public Clazz addImport(String importName) {
		imports.add(importName);
		return this;
	}

	public Clazz addImports(Collection<String> imports) {
		this.imports.addAll(imports);
		return this;
	}

	public Clazz addStaticImport(String staticImport) {
		staticImports.add(staticImport);
		return this;
	}

	public Clazz addStaticImports(Collection<String> imports) {
		staticImports.addAll(imports);
		return this;
	}

	public Clazz addMethod(Method method) {
		imports.addAll(method.getRequiredImports());
		methods.add(method);
		return this;
	}

	public Clazz addMethods(List<Method> methods) {
		methods.forEach(method -> imports.addAll(method.getRequiredImports()));
		this.methods.addAll(methods);
		return this;
	}
	
	public Clazz addConstructor(Constructor constructor) {
		imports.addAll(constructor.getRequiredImports());
		constructors.add(constructor);
		return this;
	}

	public Clazz setJavadoc(@Nullable String nativeComment) {
		if (nativeComment == null) {
			this.javadoc = null;
			return this;
		}

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("/// ```\n");
		nativeComment.lines().forEach(line -> {
			stringBuilder.append("/// ").append(line).append("\n");
		});
		stringBuilder.append("/// ```");
		
		this.javadoc = stringBuilder.toString();
		return this;
	}

	public String getClassHeader() {
		return header;
	}

	public List<Field> getFields() {
		return Collections.unmodifiableList(fields);
	}

	public List<Field> getNestedStructureFields() {
		return Collections.unmodifiableList(nestedStructureFields);
	}

	public List<Method> getMethods() {
		return Collections.unmodifiableList(methods);
	}

	public List<Constructor> getConstructors() {
		return Collections.unmodifiableList(constructors);
	}

	public List<Modifier> getModifiers() {
		return modifiers;
	}

	public ClassDescription getDescription() {
		return classDescription;
	}

	public String getPackageName() {
		return classDescription.getPackageName();
	}

	public List<String> getImports() {
		List<String> list = new ArrayList<>(imports);
		list.sort(String::compareTo);
		return list;
	}

	public List<String> getStaticImports() {
		List<String> list = new ArrayList<>(staticImports);
		list.sort(String::compareTo);
		return list;
	}

	public StaticBlock getStaticBlock() {
		return staticBlock;
	}

	public @Nullable String getJavadoc() {
		return javadoc;
	}

}
