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
/// @brief The function pointer type for monitor configuration callbacks.
/// 
/// This is the function pointer type for monitor configuration callbacks.
/// A monitor callback function has the following signature:
/// @code
/// void function_name(GLFWmonitor* monitor, int event)
/// @endcode
/// 
/// @param[in] monitor The monitor that was connected or disconnected.
/// @param[in] event One of `GLFW_CONNECTED` or `GLFW_DISCONNECTED`.  Future
/// releases may add more events.
/// 
/// @sa @ref monitor_event
/// @sa @ref glfwSetMonitorCallback
/// 
/// @since Added in version 3.0.
/// 
/// @ingroup monitor
/// ```
public abstract class GLFWMonitorCallback {

    private static final Map<Long, WeakReference<GLFWMonitorCallback>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(GLFWMonitorCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWMonitorCallback() {
        this(Arena.ofAuto());
    }

    public GLFWMonitorCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment monitor,
        int event
    ) {
        invoke(
            new GLFWmonitor(monitor),
            event
        );
    }

    public void invoke(
        GLFWmonitor monitor,
        int event
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWMonitorCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWMonitorCallback get(MemorySegment segment) {
        WeakReference<GLFWMonitorCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}