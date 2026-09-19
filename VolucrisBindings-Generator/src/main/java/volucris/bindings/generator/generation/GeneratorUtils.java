package volucris.bindings.generator.generation;

import org.jspecify.annotations.Nullable;
import volucris.bindings.generator.config.GlobalConfig;
import volucris.bindings.generator.parsing.NativeTypeKind;
import volucris.bindings.generator.parsing.NativeType.TypeResult;

public final class GeneratorUtils {

	private GeneratorUtils() {

	}

	public static String getRecordLayout(GlobalConfig globalConfig, TypeResult typeResult) {
		if (typeResult.typeKind() != NativeTypeKind.RECORD)
			throw new RuntimeException("Type is not a record.");

		String typeName = GeneratorUtils.transformName(globalConfig, typeResult.typeName(), false);

		return typeName + ".LAYOUT";
	}

	public static String stripPrefixesAndPostfixes(GlobalConfig config, String name, boolean lowerCamelCase) {
		name = stripPrefixes(config, name, false);
		name = stripPostfixes(config, name, false);

		if (lowerCamelCase)
			return Character.toLowerCase(name.charAt(0)) + name.substring(1);

		return name;
	}

	public static String stripPrefixes(GlobalConfig config, String name, boolean lowerCamelCase) {
		for (String prefix : config.getNaming().getStripPrefixes()) {
			if (name.startsWith(prefix)) {
				String newName = name.substring(prefix.length());

				if (lowerCamelCase)
					return Character.toLowerCase(newName.charAt(0)) + newName.substring(1);

				return newName;
			}
		}

		if (lowerCamelCase)
			return Character.toLowerCase(name.charAt(0)) + name.substring(1);

		return name;
	}

	public static String stripPostfixes(GlobalConfig config, String name, boolean lowerCamelCase) {
		for (String postfix : config.getNaming().getStripPostfixes()) {
			if (name.endsWith(postfix)) {
				String newName = name.substring(0, name.length() - postfix.length());

				if (lowerCamelCase)
					return Character.toLowerCase(newName.charAt(0)) + newName.substring(1);

				return newName;
			}
		}

		if (lowerCamelCase)
			return Character.toLowerCase(name.charAt(0)) + name.substring(1);

		return name;
	}

	public static String applyTypeRename(GlobalConfig config, String name, boolean lowerCamelCase) {
		if (config.getNaming().getTypeRenames().containsKey(name)) {
			String newName = config.getNaming().getTypeRenames().get(name);

			if (lowerCamelCase)
				return Character.toLowerCase(newName.charAt(0)) + newName.substring(1);

			return newName;
		}

		if (lowerCamelCase)
			return Character.toLowerCase(name.charAt(0)) + name.substring(1);

		return name;
	}

	/// Transforms the given name using the given global config.
	/// 
	/// If the name is listed under `typeRenames` the name will be transformed accordingly.
	/// After that transformation the method returns.
	/// 
	/// If the name is not listed under `typeRenames` the method [#stripPrefixesAndPostfixes(GlobalConfig, String, boolean)]
	/// will be called.
	public static String transformName(GlobalConfig config, String name, boolean lowerCamelCase) {
		if (config.getNaming().getTypeRenames().containsKey(name)) {
			String newName = config.getNaming().getTypeRenames().get(name);

			if (lowerCamelCase)
				return Character.toLowerCase(newName.charAt(0)) + newName.substring(1);

			return newName;
		}

		return stripPrefixesAndPostfixes(config, name, lowerCamelCase);
	}

	public static @Nullable String getJavadoc(String comment) {
		if (comment == null) {
			return null;
		}

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("/// ```\n");
		comment.lines().forEach(line -> {
			stringBuilder.append("/// ").append(line).append("\n");
		});
		stringBuilder.append("/// ```");

		return stringBuilder.toString();
	}

}
