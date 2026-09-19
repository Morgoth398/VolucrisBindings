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
/// @brief The function pointer type for cursor position callbacks.
/// 
/// This is the function pointer type for cursor position callbacks.  A cursor
/// position callback function has the following signature:
/// @code
/// void function_name(GLFWwindow* window, double xpos, double ypos);
/// @endcode
/// 
/// @param[in] window The window that received the event.
/// @param[in] xpos The new cursor x-coordinate, relative to the left edge of
/// the content area.
/// @param[in] ypos The new cursor y-coordinate, relative to the top edge of the
/// content area.
/// 
/// @sa @ref cursor_pos
/// @sa @ref glfwSetCursorPosCallback
/// 
/// @since Added in version 3.0.  Replaces `GLFWmouseposfun`.
/// 
/// @ingroup input
/// ```
public abstract class GLFWCursorPosCallback {

    private static final Map<Long, WeakReference<GLFWCursorPosCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            JAVA_DOUBLE, 
            JAVA_DOUBLE
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(GLFWCursorPosCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWCursorPosCallback() {
        this(Arena.ofAuto());
    }

    public GLFWCursorPosCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment window,
        double xpos,
        double ypos
    ) {
        invoke(
            new GLFWwindow(window),
            xpos,
            ypos
        );
    }

    public void invoke(
        GLFWwindow window,
        double xpos,
        double ypos
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWCursorPosCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWCursorPosCallback get(MemorySegment segment) {
        WeakReference<GLFWCursorPosCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}