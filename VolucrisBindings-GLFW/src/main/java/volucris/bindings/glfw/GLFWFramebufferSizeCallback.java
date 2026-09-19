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
/// @brief The function pointer type for framebuffer size callbacks.
/// 
/// This is the function pointer type for framebuffer size callbacks.
/// A framebuffer size callback function has the following signature:
/// @code
/// void function_name(GLFWwindow* window, int width, int height)
/// @endcode
/// 
/// @param[in] window The window whose framebuffer was resized.
/// @param[in] width The new width, in pixels, of the framebuffer.
/// @param[in] height The new height, in pixels, of the framebuffer.
/// 
/// @sa @ref window_fbsize
/// @sa @ref glfwSetFramebufferSizeCallback
/// 
/// @since Added in version 3.0.
/// 
/// @ingroup window
/// ```
public abstract class GLFWFramebufferSizeCallback {

    private static final Map<Long, WeakReference<GLFWFramebufferSizeCallback>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(GLFWFramebufferSizeCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWFramebufferSizeCallback() {
        this(Arena.ofAuto());
    }

    public GLFWFramebufferSizeCallback(Arena arena) {
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
            "Override either the typed or raw callback method in GLFWFramebufferSizeCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWFramebufferSizeCallback get(MemorySegment segment) {
        WeakReference<GLFWFramebufferSizeCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}