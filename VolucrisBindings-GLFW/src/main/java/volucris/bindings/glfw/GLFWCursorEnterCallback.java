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
/// @brief The function pointer type for cursor enter/leave callbacks.
/// 
/// This is the function pointer type for cursor enter/leave callbacks.
/// A cursor enter/leave callback function has the following signature:
/// @code
/// void function_name(GLFWwindow* window, int entered)
/// @endcode
/// 
/// @param[in] window The window that received the event.
/// @param[in] entered `GLFW_TRUE` if the cursor entered the window's content
/// area, or `GLFW_FALSE` if it left it.
/// 
/// @sa @ref cursor_enter
/// @sa @ref glfwSetCursorEnterCallback
/// 
/// @since Added in version 3.0.
/// 
/// @ingroup input
/// ```
public abstract class GLFWCursorEnterCallback {

    private static final Map<Long, WeakReference<GLFWCursorEnterCallback>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(GLFWCursorEnterCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWCursorEnterCallback() {
        this(Arena.ofAuto());
    }

    public GLFWCursorEnterCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment window,
        int entered
    ) {
        invoke(
            new GLFWwindow(window),
            entered
        );
    }

    public void invoke(
        GLFWwindow window,
        int entered
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWCursorEnterCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWCursorEnterCallback get(MemorySegment segment) {
        WeakReference<GLFWCursorEnterCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}