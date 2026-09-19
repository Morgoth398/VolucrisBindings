/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.fastNoise2.metadata;

import volucris.bindings.fastNoise2.Metadata;
import volucris.bindings.fastNoise2.Variable;

public final class DistanceToPoint extends Metadata {

    public static final Variable.Enum DISTANCE_FUNCTION = new Variable.Enum("DISTANCE_FUNCTION", 0);
    public static final Variable.Hybrid POINT = new Variable.Hybrid("POINT", 0);
    public static final Variable.Hybrid POINT_1 = new Variable.Hybrid("POINT_1", 1);
    public static final Variable.Hybrid POINT_2 = new Variable.Hybrid("POINT_2", 2);
    public static final Variable.Hybrid POINT_3 = new Variable.Hybrid("POINT_3", 3);
    public static final Variable.Hybrid MINKOWSKI_P = new Variable.Hybrid("MINKOWSKI_P", 4);

    public static final class DISTANCE_FUNCTION_ENUMS {
        public static final int EUCLIDEAN = 0;
        public static final int EUCLIDEAN_SQUARED = 1;
        public static final int MANHATTAN = 2;
        public static final int HYBRID = 3;
        public static final int MAX_AXIS = 4;
        public static final int MINKOWSKI = 5;
    }

    public DistanceToPoint() {
        super("DistanceToPoint", 5);
    }
}