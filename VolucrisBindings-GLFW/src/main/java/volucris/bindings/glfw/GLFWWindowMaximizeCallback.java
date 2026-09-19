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
/// @brief The function pointer type for window maximize callbacks.
/// 
/// This is the function pointer type for window maximize callbacks.  A window
/// maximize callback function has the following signature:
/// @code
/// void function_name(GLFWwindow* window, int maximized)
/// @endcode
/// 
/// @param[in] window The window that was maximized or restored.
/// @param[in] maximized `GLFW_TRUE` if the window was maximized, or
/// `GLFW_FALSE` if it was restored.
/// 
/// @sa @ref window_maximize
/// @sa glfwSetWindowMaximizeCallback
/// 
/// @since Added in version 3.3.
/// 
/// @ingroup window
/// ```
public abstract class GLFWWindowMaximizeCallback {

    private static final Map<Long, WeakReference<GLFWWindowMaximizeCallback>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(GLFWWindowMaximizeCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWWindowMaximizeCallback() {
        this(Arena.ofAuto());
    }

    public GLFWWindowMaximizeCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment window,
        int maximized
    ) {
        invoke(
            new GLFWwindow(window),
            maximized
        );
    }

    public void invoke(
        GLFWwindow window,
        int maximized
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWWindowMaximizeCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWWindowMaximizeCallback get(MemorySegment segment) {
        WeakReference<GLFWWindowMaximizeCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}