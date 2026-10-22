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
/// @brief The function pointer type for mouse button callbacks.
/// 
/// This is the function pointer type for mouse button callback functions.
/// A mouse button callback function has the following signature:
/// @code
/// void function_name(GLFWwindow* window, int button, int action, int mods)
/// @endcode
/// 
/// @param[in] window The window that received the event.
/// @param[in] button The [mouse button](@ref buttons) that was pressed or
/// released.
/// @param[in] action One of `GLFW_PRESS` or `GLFW_RELEASE`.  Future releases
/// may add more actions.
/// @param[in] mods Bit field describing which [modifier keys](@ref mods) were
/// held down.
/// 
/// @sa @ref input_mouse_button
/// @sa @ref glfwSetMouseButtonCallback
/// 
/// @since Added in version 1.0.
/// __GLFW 3:__ Added window handle and modifier mask parameters.
/// 
/// @ingroup input
/// ```
public abstract class GLFWMouseButtonCallback {

    private static final Map<Long, WeakReference<GLFWMouseButtonCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
            JAVA_INT, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(GLFWMouseButtonCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWMouseButtonCallback() {
        this(Arena.ofAuto());
    }

    public GLFWMouseButtonCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment window,
        int button,
        int action,
        int mods
    ) {
        invoke(
            new GLFWwindow(window),
            button,
            action,
            mods
        );
    }

    public void invoke(
        GLFWwindow window,
        int button,
        int action,
        int mods
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWMouseButtonCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWMouseButtonCallback get(MemorySegment segment) {
        WeakReference<GLFWMouseButtonCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}