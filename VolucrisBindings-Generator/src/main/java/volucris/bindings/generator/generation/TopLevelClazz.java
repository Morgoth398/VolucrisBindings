package volucris.bindings.generator.generation;

import java.util.LinkedHashSet;
import java.util.List;

import volucris.bindings.core.Struct;
import volucris.bindings.generator.config.ClassConfig.ClassDescription;

public class TopLevelClazz extends Clazz {

	private final ClassDescription classDescription;

	private final String header;

	public TopLevelClazz(ClassDescription classDescription, boolean classHasStruct) {
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

		super(classDescription.getName(), List.copyOf(modifiers));

		this.classDescription = classDescription;

		this.header = getHeader(classDescription, classHasStruct);

		if (classHasStruct)
			addImport(Struct.class.getCanonicalName());
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

	public String getClassHeader() {
		return header;
	}

	public ClassDescription getDescription() {
		return classDescription;
	}

	public String getPackageName() {
		return classDescription.getPackageName();
	}

}
