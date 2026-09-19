package volucris.bindings.fastNoise2;

public class Variable {

	private final String name;

	private final int variableIndex;

	public Variable(String name, int variableIndex) {
		this.name = name;
		this.variableIndex = variableIndex;
	}

	@Override
	public String toString() {
		return "Variable " + name + ", Index: " + variableIndex;
	}
	
	public String getName() {
		return name;
	}

	public int getVariableIndex() {
		return variableIndex;
	}

	public static class Int extends Variable {

		public Int(String name, int variableIndex) {
			super(name, variableIndex);
		}

	}

	public static class Enum extends Variable {

		public Enum(String name, int variableIndex) {
			super(name, variableIndex);
		}

	}
	
	public static class Float extends Variable {

		public Float(String name, int variableIndex) {
			super(name, variableIndex);
		}

	}

	public static class Hybrid extends Variable {

		public Hybrid(String name, int variableIndex) {
			super(name, variableIndex);
		}

	}

	public static class NodeLookup extends Variable {

		public NodeLookup(String name, int variableIndex) {
			super(name, variableIndex);
		}

	}

}
