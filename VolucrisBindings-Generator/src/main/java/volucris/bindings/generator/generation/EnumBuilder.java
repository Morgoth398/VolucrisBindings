package volucris.bindings.generator.generation;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jspecify.annotations.Nullable;
import freemarker.template.Template;
import volucris.bindings.generator.config.EnumsConfig.EnumConfig;
import volucris.bindings.generator.config.GlobalConfig;
import volucris.bindings.generator.parsing.NativeEnum;
import volucris.bindings.generator.parsing.NativeEnum.NativeEnumConstant;

public class EnumBuilder {

	private final String packageName;

	private final String name;

	private final List<ConstantInfo> constantsInfos;

	public EnumBuilder(
			GlobalConfig globalConfig,
			EnumConfig enumConfig,
			NativeEnum nativeEnum,
			String packageName,
			boolean transformNames
	) {
		this.packageName = packageName;

		Map<String, String> nameMappings = enumConfig.getNameMappings();

		if (nameMappings.containsKey(nativeEnum.getName())) {
			this.name = nameMappings.get(nativeEnum.getName());
		} else {
			this.name = GeneratorUtils.transformName(globalConfig, nativeEnum.getName(), false);
		}

		this.constantsInfos = new ArrayList<ConstantInfo>();

		nativeEnum.getConstants().forEach(constant -> {
			ConstantInfo info = getConstantInfo(nameMappings, constant, transformNames);

			if (info != null)
				constantsInfos.add(info);
		});
	}

	private @Nullable ConstantInfo getConstantInfo(
			Map<String, String> nameMappings,
			NativeEnumConstant constant,
			boolean transformName
	) {

		if (constant.getName().startsWith("_"))
			return null;

		String name;

		if (nameMappings.containsKey(constant.getName())) {
			name = nameMappings.get(constant.getName());
		} else if (transformName) {
			name = constant.getName()
					.replaceAll("([\\p{Ll}\\p{Nd}])(\\p{Lu})", "$1_$2")
					.replaceAll("(\\p{Lu})(\\p{Lu}\\p{Ll})", "$1_$2")
					.toUpperCase();
		} else {
			name = constant.getName();
		}
		
		return new ConstantInfo(name, GeneratorUtils.getJavadoc(constant.getComment()), constant.getValue());
	}

	public String build(Template template) {
		Map<String, Object> dataModel = new HashMap<String, Object>();
		dataModel.put("packageName", packageName);
		dataModel.put("name", name);
		dataModel.put("infos", constantsInfos);

		try {
			StringWriter stringWriter = new StringWriter();
			template.process(dataModel, stringWriter);

			return stringWriter.toString();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public String getClassName() {
		return name;
	}

	public static record ConstantInfo(String name, @Nullable String javadoc, int value) {

	}

}
