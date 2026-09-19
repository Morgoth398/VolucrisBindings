package volucris.bindings.generator.generation.constructors;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import freemarker.template.Template;

public class Constructor {

	protected final List<String> requiredImports;

	protected final String source;

	public Constructor(Template template, Map<String, Object> dataModel) {
		requiredImports = new ArrayList<String>();
		
		try {
			StringWriter stringWriter = new StringWriter();
			template.process(dataModel, stringWriter);

			source = stringWriter.toString();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public Constructor(String source, List<String> requiredImports) {
		this.source = source;
		
		this.requiredImports = new ArrayList<String>(requiredImports);
	}
	
	public List<String> getSource() {
		return source.lines().toList();
	}

	public List<String> getRequiredImports() {
		return requiredImports;
	}

}
