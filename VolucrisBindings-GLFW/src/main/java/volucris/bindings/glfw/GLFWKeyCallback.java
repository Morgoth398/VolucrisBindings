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
/// @brief The function pointer type for keyboard key callbacks.
/// 
/// This is the function pointer type for keyboard key callbacks.  A keyboard
/// key callback function has the following signature:
/// @code
/// void function_name(GLFWwindow* window, int key, int scancode, int action, int mods)
/// @endcode
/// 
/// @param[in] window The window that received the event.
/// @param[in] key The [keyboard key](@ref keys) that was pressed or released.
/// @param[in] scancode The platform-specific scancode of the key.
/// @param[in] action `GLFW_PRESS`, `GLFW_RELEASE` or `GLFW_REPEAT`.  Future
/// releases may add more actions.
/// @param[in] mods Bit field describing which [modifier keys](@ref mods) were
/// held down.
/// 
/// @sa @ref input_key
/// @sa @ref glfwSetKeyCallback
/// 
/// @since Added in version 1.0.
/// @glfw3 Added window handle, scancode and modifier mask parameters.
/// 
/// @ingroup input
/// ```
public abstract class GLFWKeyCallback {

    private static final Map<Long, WeakReference<GLFWKeyCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
            JAVA_INT, 
            JAVA_INT, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(GLFWKeyCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWKeyCallback() {
        this(Arena.ofAuto());
    }

    public GLFWKeyCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment window,
        int key,
        int scancode,
        int action,
        int mods
    ) {
        invoke(
            new GLFWwindow(window),
            key,
            scancode,
            action,
            mods
        );
    }

    public void invoke(
        GLFWwindow window,
        int key,
        int scancode,
        int action,
        int mods
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWKeyCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWKeyCallback get(MemorySegment segment) {
        WeakReference<GLFWKeyCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}