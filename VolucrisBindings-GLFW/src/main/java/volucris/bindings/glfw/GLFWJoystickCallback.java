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

/// ```
/// @brief The function pointer type for joystick configuration callbacks.
/// 
/// This is the function pointer type for joystick configuration callbacks.
/// A joystick configuration callback function has the following signature:
/// @code
/// void function_name(int jid, int event)
/// @endcode
/// 
/// @param[in] jid The joystick that was connected or disconnected.
/// @param[in] event One of `GLFW_CONNECTED` or `GLFW_DISCONNECTED`.  Future
/// releases may add more events.
/// 
/// @sa @ref joystick_event
/// @sa @ref glfwSetJoystickCallback
/// 
/// @since Added in version 3.2.
/// 
/// @ingroup input
/// ```
public abstract class GLFWJoystickCallback {

    private static final Map<Long, WeakReference<GLFWJoystickCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            JAVA_INT, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(GLFWJoystickCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWJoystickCallback() {
        this(Arena.ofAuto());
    }

    public GLFWJoystickCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        int jid,
        int event
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWJoystickCallback."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWJoystickCallback get(MemorySegment segment) {
        WeakReference<GLFWJoystickCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}