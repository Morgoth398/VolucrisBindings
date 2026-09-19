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
/// @brief The function pointer type for window position callbacks.
/// 
/// This is the function pointer type for window position callbacks.  A window
/// position callback function has the following signature:
/// @code
/// void callback_name(GLFWwindow* window, int xpos, int ypos)
/// @endcode
/// 
/// @param[in] window The window that was moved.
/// @param[in] xpos The new x-coordinate, in screen coordinates, of the
/// upper-left corner of the content area of the window.
/// @param[in] ypos The new y-coordinate, in screen coordinates, of the
/// upper-left corner of the content area of the window.
/// 
/// @sa @ref window_pos
/// @sa @ref glfwSetWindowPosCallback
/// 
/// @since Added in version 3.0.
/// 
/// @ingroup window
/// ```
public abstract class GLFWWindowPosCallback {

    private static final Map<Long, WeakReference<GLFWWindowPosCallback>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(GLFWWindowPosCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWWindowPosCallback() {
        this(Arena.ofAuto());
    }

    public GLFWWindowPosCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment window,
        int xpos,
        int ypos
    ) {
        invoke(
            new GLFWwindow(window),
            xpos,
            ypos
        );
    }

    public void invoke(
        GLFWwindow window,
        int xpos,
        int ypos
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWWindowPosCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWWindowPosCallback get(MemorySegment segment) {
        WeakReference<GLFWWindowPosCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}