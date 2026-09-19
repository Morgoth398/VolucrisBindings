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
/// @brief The function pointer type for window iconify callbacks.
/// 
/// This is the function pointer type for window iconify callbacks.  A window
/// iconify callback function has the following signature:
/// @code
/// void function_name(GLFWwindow* window, int iconified)
/// @endcode
/// 
/// @param[in] window The window that was iconified or restored.
/// @param[in] iconified `GLFW_TRUE` if the window was iconified, or
/// `GLFW_FALSE` if it was restored.
/// 
/// @sa @ref window_iconify
/// @sa @ref glfwSetWindowIconifyCallback
/// 
/// @since Added in version 3.0.
/// 
/// @ingroup window
/// ```
public abstract class GLFWWindowIconifyCallback {

    private static final Map<Long, WeakReference<GLFWWindowIconifyCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(GLFWWindowIconifyCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWWindowIconifyCallback() {
        this(Arena.ofAuto());
    }

    public GLFWWindowIconifyCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment window,
        int iconified
    ) {
        invoke(
            new GLFWwindow(window),
            iconified
        );
    }

    public void invoke(
        GLFWwindow window,
        int iconified
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWWindowIconifyCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWWindowIconifyCallback get(MemorySegment segment) {
        WeakReference<GLFWWindowIconifyCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}