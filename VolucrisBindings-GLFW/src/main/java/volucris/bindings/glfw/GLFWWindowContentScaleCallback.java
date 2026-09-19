/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.glfw;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// @brief The function pointer type for window content scale callbacks.
/// 
/// This is the function pointer type for window content scale callbacks.
/// A window content scale callback function has the following signature:
/// @code
/// void function_name(GLFWwindow* window, float xscale, float yscale)
/// @endcode
/// 
/// @param[in] window The window whose content scale changed.
/// @param[in] xscale The new x-axis content scale of the window.
/// @param[in] yscale The new y-axis content scale of the window.
/// 
/// @sa @ref window_scale
/// @sa @ref glfwSetWindowContentScaleCallback
/// 
/// @since Added in version 3.3.
/// 
/// @ingroup window
/// ```
public abstract class GLFWWindowContentScaleCallback {

    private static final Map<Long, WeakReference<GLFWWindowContentScaleCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            JAVA_FLOAT, 
            JAVA_FLOAT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(GLFWWindowContentScaleCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWWindowContentScaleCallback() {
        this(Arena.ofAuto());
    }

    public GLFWWindowContentScaleCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment window,
        float xscale,
        float yscale
    ) {
        invoke(
            new GLFWwindow(window),
            xscale,
            yscale
        );
    }

    public void invoke(
        GLFWwindow window,
        float xscale,
        float yscale
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWWindowContentScaleCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWWindowContentScaleCallback get(MemorySegment segment) {
        WeakReference<GLFWWindowContentScaleCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}