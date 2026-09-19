/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.fastNoise2.metadata;

import volucris.bindings.fastNoise2.Metadata;
import volucris.bindings.fastNoise2.Variable;

public final class Fade extends Metadata {

    public static final Variable.Enum INTERPOLATION = new Variable.Enum("INTERPOLATION", 0);
    public static final Variable.Hybrid FADE = new Variable.Hybrid("FADE", 0);
    public static final Variable.Hybrid FADE_MIN = new Variable.Hybrid("FADE_MIN", 1);
    public static final Variable.Hybrid FADE_MAX = new Variable.Hybrid("FADE_MAX", 2);
    public static final Variable.NodeLookup A = new Variable.NodeLookup("A", 0);
    public static final Variable.NodeLookup B = new Variable.NodeLookup("B", 1);

    public static final class INTERPOLATION_ENUMS {
        public static final int LINEAR = 0;
        public static final int HERMITE = 1;
        public static final int QUINTIC = 2;
    }

    public Fade() {
        super("Fade", 40);
    }
}