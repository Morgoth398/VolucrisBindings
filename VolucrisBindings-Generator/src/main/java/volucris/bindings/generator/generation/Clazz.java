package volucris.bindings.generator.generation;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.jspecify.annotations.Nullable;

import freemarker.template.Template;
import volucris.bindings.generator.generation.constructors.Constructor;
import volucris.bindings.generator.generation.fields.Field;
import volucris.bindings.generator.generation.fields.FieldCategory;
import volucris.bindings.generator.generation.methods.Method;

public class Clazz {

	private final Set<String> imports;
	private final Set<String> staticImports;

	private final List<Field> fields;

	private final List<Method> methods;
	private final List<Modifier> modifiers;
	private final List<Constructor> constructors;

	private final List<String> nestedClasses;

	private final StaticBlock staticBlock;

	private final String clazzName;

	private String javadoc;

	public Clazz(String clazzName, List<Modifier> modifiers) {
		this.clazzName = clazzName;
		this.modifiers = List.copyOf(modifiers);

		this.imports = new HashSet<String>();
		this.staticImports = new HashSet<String>();

		this.fields = new ArrayList<Field>();

		this.methods = new ArrayList<Method>();
		this.constructors = new ArrayList<Constructor>();

		this.nestedClasses = new ArrayList<String>();

		this.staticBlock = new StaticBlock();
	}

	public StaticBlock getStaticBlock() {
		return staticBlock;
	}

	public Clazz addField(Field field) {
		imports.addAll(field.getRequiredImports());
		staticImports.addAll(field.getRequiredStaticImports());

		fields.add(field);
		return this;
	}

	public Clazz addFields(List<? extends Field> fields) {
		fields.forEach(field -> addField(field));
		return this;
	}

	public Clazz addMethod(Method method) {
		imports.addAll(method.getRequiredImports());
		methods.add(method);
		return this;
	}

	public Clazz addMethods(List<? extends Method> methods) {
		methods.forEach(method -> addMethod(method));
		return this;
	}

	public Clazz addConstructor(Constructor constructor) {
		imports.addAll(constructor.getRequiredImports());
		constructors.add(constructor);
		return this;
	}

	public Clazz addConstructors(List<? extends Constructor> constructors) {
		constructors.forEach(cosntructor -> addConstructor(cosntructor));
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

	public Clazz addNestedClazz(Clazz clazzModel, Template template) {
		addImports(clazzModel.getImports());
		addStaticImports(clazzModel.getStaticImports());

		try {
			Map<String, Object> dataModel = new HashMap<>();
			dataModel.put("clazz", clazzModel);

			StringWriter stringWriter = new StringWriter();
			template.process(dataModel, stringWriter);

			nestedClasses.add(stringWriter.toString());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return this;
	}

	public Clazz addNestedClazzes(List<? extends Clazz> clazzModels, Template template) {
		clazzModels.forEach(clazzModel -> addNestedClazz(clazzModel, template));
		return this;
	}

	public Clazz setJavadoc(@Nullable String nativeComment) {
		this.javadoc = GeneratorUtils.getJavadoc(nativeComment);
		return this;
	}

	/// Returns the fields of this model grouped by their [FieldCategory].
	public List<List<Field>> getFields() {
		return fields.stream()
				.collect(
						Collectors.groupingBy(
								Field::getFieldCategory,
								() -> new EnumMap<>(FieldCategory.class),
								Collectors.toList()
						)
				)
				.values()
				.stream()
				.toList();
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

	public List<String> getImports() {
		return imports.stream().sorted().toList();
	}

	public List<String> getStaticImports() {
		return staticImports.stream().sorted().toList();
	}

	public List<String> getNestedClasses() {
		return Collections.unmodifiableList(nestedClasses);
	}

	public @Nullable String getJavadoc() {
		return javadoc;
	}

	public String getClazzName() {
		return clazzName;
	}

}
