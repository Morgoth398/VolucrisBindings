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
/// @brief The function pointer type for scroll callbacks.
/// 
/// This is the function pointer type for scroll callbacks.  A scroll callback
/// function has the following signature:
/// @code
/// void function_name(GLFWwindow* window, double xoffset, double yoffset)
/// @endcode
/// 
/// @param[in] window The window that received the event.
/// @param[in] xoffset The scroll offset along the x-axis.
/// @param[in] yoffset The scroll offset along the y-axis.
/// 
/// @sa @ref scrolling
/// @sa @ref glfwSetScrollCallback
/// 
/// @since Added in version 3.0.  Replaces `GLFWmousewheelfun`.
/// 
/// @ingroup input
/// ```
public abstract class GLFWScrollCallback {

    private static final Map<Long, WeakReference<GLFWScrollCallback>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(GLFWScrollCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWScrollCallback() {
        this(Arena.ofAuto());
    }

    public GLFWScrollCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment window,
        double xoffset,
        double yoffset
    ) {
        invoke(
            new GLFWwindow(window),
            xoffset,
            yoffset
        );
    }

    public void invoke(
        GLFWwindow window,
        double xoffset,
        double yoffset
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWScrollCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWScrollCallback get(MemorySegment segment) {
        WeakReference<GLFWScrollCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}