/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.fastNoise2.metadata;

import volucris.bindings.fastNoise2.Metadata;
import volucris.bindings.fastNoise2.Variable;

public final class CellularValue extends Metadata {

    public static final Variable.Float FEATURE_SCALE = new Variable.Float("FEATURE_SCALE", 0);
    public static final Variable.Int SEED_OFFSET = new Variable.Int("SEED_OFFSET", 1);
    public static final Variable.Float OUTPUT_MIN = new Variable.Float("OUTPUT_MIN", 2);
    public static final Variable.Float OUTPUT_MAX = new Variable.Float("OUTPUT_MAX", 3);
    public static final Variable.Enum DISTANCE_FUNCTION = new Variable.Enum("DISTANCE_FUNCTION", 4);
    public static final Variable.Int VALUE_INDEX = new Variable.Int("VALUE_INDEX", 5);
    public static final Variable.Hybrid MINKOWSKI_P = new Variable.Hybrid("MINKOWSKI_P", 0);
    public static final Variable.Hybrid GRID_JITTER = new Variable.Hybrid("GRID_JITTER", 1);
    public static final Variable.Hybrid SIZE_JITTER = new Variable.Hybrid("SIZE_JITTER", 2);

    public static final class DISTANCE_FUNCTION_ENUMS {
        public static final int EUCLIDEAN = 0;
        public static final int EUCLIDEAN_SQUARED = 1;
        public static final int MANHATTAN = 2;
        public static final int HYBRID = 3;
        public static final int MAX_AXIS = 4;
        public static final int MINKOWSKI = 5;
    }

    public CellularValue() {
        super("CellularValue", 10);
    }
}