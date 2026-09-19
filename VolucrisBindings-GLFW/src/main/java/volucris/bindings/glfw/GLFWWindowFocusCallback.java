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
/// @brief The function pointer type for window focus callbacks.
/// 
/// This is the function pointer type for window focus callbacks.  A window
/// focus callback function has the following signature:
/// @code
/// void function_name(GLFWwindow* window, int focused)
/// @endcode
/// 
/// @param[in] window The window that gained or lost input focus.
/// @param[in] focused `GLFW_TRUE` if the window was given input focus, or
/// `GLFW_FALSE` if it lost it.
/// 
/// @sa @ref window_focus
/// @sa @ref glfwSetWindowFocusCallback
/// 
/// @since Added in version 3.0.
/// 
/// @ingroup window
/// ```
public abstract class GLFWWindowFocusCallback {

    private static final Map<Long, WeakReference<GLFWWindowFocusCallback>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(GLFWWindowFocusCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWWindowFocusCallback() {
        this(Arena.ofAuto());
    }

    public GLFWWindowFocusCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment window,
        int focused
    ) {
        invoke(
            new GLFWwindow(window),
            focused
        );
    }

    public void invoke(
        GLFWwindow window,
        int focused
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWWindowFocusCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWWindowFocusCallback get(MemorySegment segment) {
        WeakReference<GLFWWindowFocusCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}