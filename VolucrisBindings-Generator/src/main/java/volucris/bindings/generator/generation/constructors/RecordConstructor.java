package volucris.bindings.generator.generation.constructors;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Template;
import volucris.bindings.generator.generation.fields.ArrayField;
import volucris.bindings.generator.generation.fields.Field;

public class RecordConstructor extends Constructor {

	private RecordConstructor(Template template, Builder builder) {
		super(template, builder.dataModel);

		requiredImports.add(MemorySegment.class.getCanonicalName());
		requiredImports.add(Arena.class.getCanonicalName());
	}

	public static class Builder {

		private final Map<String, Object> dataModel;

		private final List<Data> data;

		public Builder() {
			dataModel = new HashMap<String, Object>();

			data = new ArrayList<Data>();
		}

		public Builder setClassName(String className) {
			dataModel.put("className", className);
			return this;
		}

		public Builder addNestedStructureField(Field field, Field offsetField) {
			data.add(new SimpleData(field, offsetField));
			return this;
		}

		public Builder addNestedStructureField(ArrayField field, Field offsetField, List<Integer> dimensions) {
			data.add(new ArrayData(field, offsetField, dimensions));
			return this;
		}

		public RecordConstructor build(Template template) {
			dataModel.put("data", data);
			return new RecordConstructor(template, this);
		}

	}

	public static interface Data {
		Field field();

		Field offsetField();

		boolean array();
	}

	public static record SimpleData(Field field, Field offsetField) implements Data {
		@Override
		public boolean array() {
			return false;
		}
	}

	public static record ArrayData(ArrayField field, Field offsetField, List<Integer> dimensions) implements Data {

		public boolean array() {
			return true;
		}

	}

}
