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
/// @brief The function pointer type for error callbacks.
/// 
/// This is the function pointer type for error callbacks.  An error callback
/// function has the following signature:
/// @code
/// void callback_name(int error_code, const char* description)
/// @endcode
/// 
/// @param[in] error_code An [error code](@ref errors).  Future releases may add
/// more error codes.
/// @param[in] description A UTF-8 encoded string describing the error.
/// 
/// @pointer_lifetime The error description string is valid until the callback
/// function returns.
/// 
/// @sa @ref error_handling
/// @sa @ref glfwSetErrorCallback
/// 
/// @since Added in version 3.0.
/// 
/// @ingroup init
/// ```
public abstract class GLFWErrorCallback {

    private static final Map<Long, WeakReference<GLFWErrorCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            JAVA_INT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(GLFWErrorCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWErrorCallback() {
        this(Arena.ofAuto());
    }

    public GLFWErrorCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        int error_code,
        MemorySegment description
    ) {
        invoke(
            error_code,
            description.getString(0)
        );
    }

    public void invoke(
        int error_code,
        String description
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWErrorCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWErrorCallback get(MemorySegment segment) {
        WeakReference<GLFWErrorCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}