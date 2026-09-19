package volucris.bindings.generator.generation.methods;

import java.util.HashMap;
import java.util.Map;

import freemarker.template.Template;
import volucris.bindings.generator.config.ClassConfig.Symbol;
import volucris.bindings.generator.generation.Modifier;
import volucris.bindings.generator.generation.fields.SymbolField;

public class SymbolMethod extends Method {

	public SymbolMethod(Template template, SymbolField field, Symbol symbol, String symbolName) {
		Map<String, Object> dataModel = new HashMap<String, Object>();
		dataModel.put("symbolName", symbolName);
		dataModel.put("fieldName", field.getName());
		dataModel.put("modifiers", new Modifier[] { Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL });
		dataModel.put("type", symbol.getType().contains("boolean") ? "boolean" : symbol.getType());

		super(template, dataModel);
	}

}
