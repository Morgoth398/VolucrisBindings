/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.opengl.extensions;


import static volucris.bindings.core.FFMUtils.*;

public final class GLAnisotropicFiltering {

    public static final int GL_TEXTURE_MAX_ANISOTROPY_EXT = 0x84FE;
    public static final int GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT = 0x84FF;

    private static final LazyConstant<Boolean> GL_EXT_TEXTURE_FILTER_ANISOTROPIC;

    static {
        //@formatter:off
        GL_EXT_TEXTURE_FILTER_ANISOTROPIC = booleanSymbol("GLAD_GL_EXT_texture_filter_anisotropic", true);
        //@formatter:on
    }

    private GLAnisotropicFiltering() {
    }

    public static final boolean GL_EXT_texture_filter_anisotropic() {
        return GL_EXT_TEXTURE_FILTER_ANISOTROPIC.get();
    }
    
}