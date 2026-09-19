package volucris.bindings.generator.generation.methods;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import freemarker.template.Template;

public class Method {

	protected final List<String> requiredImports;

	protected final String source;

	public Method(Template template, Map<String, Object> dataModel) {
		this(template, dataModel, List.of());
	}
	
	public Method(Template template, Map<String, Object> dataModel, List<String> requiredImports) {
		this.requiredImports = new ArrayList<String>(requiredImports);
		
		try {
			StringWriter stringWriter = new StringWriter();
			template.process(dataModel, stringWriter);

			source = stringWriter.toString();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public Method(String source, List<String> requiredImports) {
		this.source = source;
		
		this.requiredImports = new ArrayList<String>(requiredImports);
	}
	
	public String getSource2() {
		return source;
	}
	
	public List<String> getSource() {
		return source.lines().toList();
	}

	public List<String> getRequiredImports() {
		return requiredImports;
	}

}
