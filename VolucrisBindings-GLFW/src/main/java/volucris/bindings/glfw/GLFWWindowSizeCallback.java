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
/// @brief The function pointer type for window size callbacks.
/// 
/// This is the function pointer type for window size callbacks.  A window size
/// callback function has the following signature:
/// @code
/// void callback_name(GLFWwindow* window, int width, int height)
/// @endcode
/// 
/// @param[in] window The window that was resized.
/// @param[in] width The new width, in screen coordinates, of the window.
/// @param[in] height The new height, in screen coordinates, of the window.
/// 
/// @sa @ref window_size
/// @sa @ref glfwSetWindowSizeCallback
/// 
/// @since Added in version 1.0.
/// @glfw3 Added window handle parameter.
/// 
/// @ingroup window
/// ```
public abstract class GLFWWindowSizeCallback {

    private static final Map<Long, WeakReference<GLFWWindowSizeCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(GLFWWindowSizeCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWWindowSizeCallback() {
        this(Arena.ofAuto());
    }

    public GLFWWindowSizeCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment window,
        int width,
        int height
    ) {
        invoke(
            new GLFWwindow(window),
            width,
            height
        );
    }

    public void invoke(
        GLFWwindow window,
        int width,
        int height
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWWindowSizeCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWWindowSizeCallback get(MemorySegment segment) {
        WeakReference<GLFWWindowSizeCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}