/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.fastNoise2.metadata;

import volucris.bindings.fastNoise2.Metadata;
import volucris.bindings.fastNoise2.Variable;

public final class DomainWarpFractalIndependent extends Metadata {

    public static final Variable.Int OCTAVES = new Variable.Int("OCTAVES", 0);
    public static final Variable.Float LACUNARITY = new Variable.Float("LACUNARITY", 1);
    public static final Variable.Hybrid GAIN = new Variable.Hybrid("GAIN", 0);
    public static final Variable.Hybrid WEIGHTED_STRENGTH = new Variable.Hybrid("WEIGHTED_STRENGTH", 1);
    public static final Variable.NodeLookup DOMAIN_WARP_SOURCE = new Variable.NodeLookup("DOMAIN_WARP_SOURCE", 0);


    public DomainWarpFractalIndependent() {
        super("DomainWarpFractalIndependent", 20);
    }
}