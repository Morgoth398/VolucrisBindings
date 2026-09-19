/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.fastNoise2.metadata;

import volucris.bindings.fastNoise2.Metadata;
import volucris.bindings.fastNoise2.Variable;

public final class Remap extends Metadata {

    public static final Variable.Enum CLAMP_OUTPUT = new Variable.Enum("CLAMP_OUTPUT", 0);
    public static final Variable.Hybrid FROM_MIN = new Variable.Hybrid("FROM_MIN", 0);
    public static final Variable.Hybrid FROM_MAX = new Variable.Hybrid("FROM_MAX", 1);
    public static final Variable.Hybrid TO_MIN = new Variable.Hybrid("TO_MIN", 2);
    public static final Variable.Hybrid TO_MAX = new Variable.Hybrid("TO_MAX", 3);
    public static final Variable.NodeLookup SOURCE = new Variable.NodeLookup("SOURCE", 0);

    public static final class CLAMP_OUTPUT_ENUMS {
        public static final int FALSE = 0;
        public static final int TRUE = 1;
    }

    public Remap() {
        super("Remap", 41);
    }
}