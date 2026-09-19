/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.fastNoise2.metadata;

import volucris.bindings.fastNoise2.Metadata;
import volucris.bindings.fastNoise2.Variable;

public final class DomainRotatePlane extends Metadata {

    public static final Variable.Enum ROTATION_TYPE = new Variable.Enum("ROTATION_TYPE", 0);
    public static final Variable.NodeLookup SOURCE = new Variable.NodeLookup("SOURCE", 0);

    public static final class ROTATION_TYPE_ENUMS {
        public static final int IMPROVE_XY_PLANES = 0;
        public static final int IMPROVE_XZ_PLANES = 1;
    }

    public DomainRotatePlane() {
        super("DomainRotatePlane", 46);
    }
}