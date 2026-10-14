package volucris.bindings.generator.generation;

import java.util.ArrayList;
import java.util.List;

import volucris.bindings.generator.config.ClassConfig.Symbol;
import volucris.bindings.generator.generation.fields.SymbolField;

public class StaticBlock {

	private final List<String> recordLayout;
	private final List<String> symbolFieldsInitializations;
	private final List<String> functionFieldsInitializations;
	private final List<String> varHandleFieldsInitializations;
	private final List<String> offsetFieldsInitializations;

	public StaticBlock() {
		recordLayout = new ArrayList<String>();
		symbolFieldsInitializations = new ArrayList<String>();
		functionFieldsInitializations = new ArrayList<String>();
		varHandleFieldsInitializations = new ArrayList<String>();
		offsetFieldsInitializations = new ArrayList<String>();
	}

	public StaticBlock addFunctionLoading(String functionLoading) {
		this.functionFieldsInitializations.addAll(functionLoading.lines().toList());
		return this;
	}
	
	public StaticBlock addSymbolFieldInitialization(SymbolField field, Symbol symbol) {
		String type = symbol.getType();

		if (type.equals("int")) {
			symbolFieldsInitializations.add(field.getName() + " = intSymbol(\"" + symbol.getName() + "\");");
		} else if (type.equals("long")) {
			symbolFieldsInitializations.add(field.getName() + " = longSymbol(\"" + symbol.getName() + "\");");
		} else if (type.equals("float")) {
			symbolFieldsInitializations.add(field.getName() + " = floatSymbol(\"" + symbol.getName() + "\");");
		} else if (type.equals("double")) {
			symbolFieldsInitializations.add(field.getName() + " = doubleSymbol(\"" + symbol.getName() + "\");");
		} else if (type.equals("String")) {
			symbolFieldsInitializations.add(field.getName() + " = stringSymbol(\"" + symbol.getName() + "\");");
		} else if (type.equals("MemorySegment")) {
			symbolFieldsInitializations.add(field.getName() + " = symbol(\"" + symbol.getName() + "\");");
		} else if (type.contains("boolean")) {
			if (type.equals("int-boolean")) {
				symbolFieldsInitializations.add(field.getName() + " = booleanSymbol(\"" + symbol.getName() + "\", true);");
			} else {
				symbolFieldsInitializations.add(field.getName() + " = booleanSymbol(\"" + symbol.getName() + "\", false);");
			}
		} else {
			throw new RuntimeException("Invalid symbol type.");
		}
		return this;
	}

	public StaticBlock addRecordLayout(String recordLayout) {
		this.recordLayout.addAll(recordLayout.lines().toList());
		return this;
	}

	public StaticBlock addVarHandleFieldsInitializations(List<String> varHandleFieldsInitializations) {
		this.varHandleFieldsInitializations.addAll(varHandleFieldsInitializations);
		return this;
	}

	public StaticBlock addOffsetFieldsInitializations(List<String> offsetFieldsInitializations) {
		this.offsetFieldsInitializations.addAll(offsetFieldsInitializations);
		return this;
	}

	public List<String> getElements() {
		List<List<String>> lists = List.of(
				recordLayout,
				symbolFieldsInitializations,
				functionFieldsInitializations,
				varHandleFieldsInitializations,
				offsetFieldsInitializations
		);

		List<String> elements = new ArrayList<>();

		for (List<String> list : lists) {
			if (list.isEmpty())
				continue;

			if (!elements.isEmpty())
				elements.add("");

			elements.addAll(list);
		}

		return elements;
	}

}
