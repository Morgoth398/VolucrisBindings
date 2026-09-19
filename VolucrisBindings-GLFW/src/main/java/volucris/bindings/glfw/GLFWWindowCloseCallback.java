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

import static volucris.bindings.core.FFMUtils.*;

/// ```
/// @brief The function pointer type for window close callbacks.
/// 
/// This is the function pointer type for window close callbacks.  A window
/// close callback function has the following signature:
/// @code
/// void function_name(GLFWwindow* window)
/// @endcode
/// 
/// @param[in] window The window that the user attempted to close.
/// 
/// @sa @ref window_close
/// @sa @ref glfwSetWindowCloseCallback
/// 
/// @since Added in version 2.5.
/// @glfw3 Added window handle parameter.
/// 
/// @ingroup window
/// ```
public abstract class GLFWWindowCloseCallback {

    private static final Map<Long, WeakReference<GLFWWindowCloseCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(GLFWWindowCloseCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWWindowCloseCallback() {
        this(Arena.ofAuto());
    }

    public GLFWWindowCloseCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment window
    ) {
        invoke(
            new GLFWwindow(window)
        );
    }

    public void invoke(
        GLFWwindow window
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWWindowCloseCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWWindowCloseCallback get(MemorySegment segment) {
        WeakReference<GLFWWindowCloseCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}