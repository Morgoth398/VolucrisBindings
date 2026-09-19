/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.fastNoise2.metadata;

import volucris.bindings.fastNoise2.Metadata;
import volucris.bindings.fastNoise2.Variable;

public final class DomainWarpSuperSimplex extends Metadata {

    public static final Variable.Float FEATURE_SCALE = new Variable.Float("FEATURE_SCALE", 0);
    public static final Variable.Int SEED_OFFSET = new Variable.Int("SEED_OFFSET", 1);
    public static final Variable.Float AMPLITUDE_SCALING = new Variable.Float("AMPLITUDE_SCALING", 2);
    public static final Variable.Float AMPLITUDE_SCALING_3 = new Variable.Float("AMPLITUDE_SCALING_3", 3);
    public static final Variable.Float AMPLITUDE_SCALING_4 = new Variable.Float("AMPLITUDE_SCALING_4", 4);
    public static final Variable.Float AMPLITUDE_SCALING_5 = new Variable.Float("AMPLITUDE_SCALING_5", 5);
    public static final Variable.Enum VECTORIZATION_SCHEME = new Variable.Enum("VECTORIZATION_SCHEME", 6);
    public static final Variable.Hybrid WARP_AMPLITUDE = new Variable.Hybrid("WARP_AMPLITUDE", 0);
    public static final Variable.NodeLookup SOURCE = new Variable.NodeLookup("SOURCE", 0);

    public static final class VECTORIZATION_SCHEME_ENUMS {
        public static final int ORTHOGONAL_GRADIENT_MATRIX = 0;
        public static final int GRADIENT_OUTER_PRODUCT = 1;
    }

    public DomainWarpSuperSimplex() {
        super("DomainWarpSuperSimplex", 17);
    }
}