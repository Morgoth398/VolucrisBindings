package volucris.bindings.generator.generation;

import java.util.ArrayList;
import java.util.List;

import volucris.bindings.generator.config.ClassConfig.Symbol;
import volucris.bindings.generator.generation.fields.Field;
import volucris.bindings.generator.generation.fields.SymbolField;
import volucris.bindings.generator.parsing.NativeRecord.TypedField;

public class StaticBlock {

	private final List<String> recordLayout;
	private final List<String> symbolLoading;
	private final List<String> functionLoading;
	private final List<String> varHandleLoading;
	private final List<String> fieldOffsetLoading;

	public StaticBlock() {
		functionLoading = new ArrayList<String>();
		symbolLoading = new ArrayList<String>();
		recordLayout = new ArrayList<String>();
		varHandleLoading = new ArrayList<String>();
		fieldOffsetLoading = new ArrayList<String>();
	}

	public StaticBlock addFunctionLoading(String functionLoading) {
		this.functionLoading.addAll(functionLoading.lines().toList());
		return this;
	}
	
	public StaticBlock addSymbolLoading(SymbolField field, Symbol symbol) {
		String type = symbol.getType();

		if (type.equals("int")) {
			symbolLoading.add(field.getName() + " = intSymbol(\"" + symbol.getName() + "\");");
		} else if (type.equals("long")) {
			symbolLoading.add(field.getName() + " = longSymbol(\"" + symbol.getName() + "\");");
		} else if (type.equals("float")) {
			symbolLoading.add(field.getName() + " = floatSymbol(\"" + symbol.getName() + "\");");
		} else if (type.equals("double")) {
			symbolLoading.add(field.getName() + " = doubleSymbol(\"" + symbol.getName() + "\");");
		} else if (type.equals("String")) {
			symbolLoading.add(field.getName() + " = stringSymbol(\"" + symbol.getName() + "\");");
		} else if (type.equals("MemorySegment")) {
			symbolLoading.add(field.getName() + " = symbol(\"" + symbol.getName() + "\");");
		} else if (type.contains("boolean")) {
			if (type.equals("int-boolean")) {
				symbolLoading.add(field.getName() + " = booleanSymbol(\"" + symbol.getName() + "\", true);");
			} else {
				symbolLoading.add(field.getName() + " = booleanSymbol(\"" + symbol.getName() + "\", false);");
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

	public StaticBlock addVarHandleLoading(List<String> varHandleLoading) {
		this.varHandleLoading.addAll(varHandleLoading);
		return this;
	}

	public StaticBlock addFieldOffsetLoading(Field field, TypedField nativeField) {
		fieldOffsetLoading.add(
				String.join(
						"",
						field.getName(),
						" = LAYOUT.byteOffset(PathElement.groupElement(\"",
						nativeField.getName(),
						"\"));"
				)
		);
		return this;
	}

	public List<String> getElements() {
		List<List<String>> lists = List.of(
				recordLayout,
				symbolLoading,
				functionLoading,
				varHandleLoading,
				fieldOffsetLoading
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

	public List<String> getRecordLayout() {
		return recordLayout;
	}

	public List<String> getSymbolLoading() {
		return symbolLoading;
	}

	public List<String> getFunctionLoading() {
		return functionLoading;
	}

	public List<String> getVarHandleLoading() {
		return varHandleLoading;
	}

	public List<String> getFieldOffsetLoading() {
		return fieldOffsetLoading;
	}

}
