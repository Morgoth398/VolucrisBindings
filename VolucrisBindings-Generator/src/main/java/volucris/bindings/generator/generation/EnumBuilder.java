package volucris.bindings.generator.generation;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jspecify.annotations.Nullable;
import freemarker.template.Template;
import volucris.bindings.generator.config.GlobalConfig;
import volucris.bindings.generator.parsing.NativeEnum;
import volucris.bindings.generator.parsing.NativeEnum.NativeEnumConstant;

public class EnumBuilder {

	private final String packageName;

	private final String name;

	private final List<ConstantInfo> constantsInfos;

	public EnumBuilder(GlobalConfig globalConfig, NativeEnum nativeEnum, String packageName, boolean transformNames) {
		this.packageName = packageName;

		String name = nativeEnum.getName();

		name = GeneratorUtils.transformName(globalConfig, name, false);

		this.name = name;

		this.constantsInfos = new ArrayList<ConstantInfo>();

		nativeEnum.getConstants().forEach(constant -> {
			ConstantInfo info = getConstantInfo(globalConfig, constant, transformNames);

			if (info != null)
				constantsInfos.add(info);
		});
	}

	private @Nullable ConstantInfo getConstantInfo(
			GlobalConfig globalConfig, NativeEnumConstant constant, boolean transformName
	) {

		if (constant.getName().startsWith("_"))
			return null;

		String name = constant.getName();

		name = GeneratorUtils.transformName(globalConfig, name, false);

		if (transformName) {
			name = name.replaceAll("([\\p{Ll}\\p{Nd}])(\\p{Lu})", "$1_$2").toUpperCase();
		}

		String javadoc = null;

		if (constant.getComment() != null) {
			javadoc = "/// ```" + constant.getComment() + "```";
		}

		return new ConstantInfo(name, javadoc, constant.getValue());
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
