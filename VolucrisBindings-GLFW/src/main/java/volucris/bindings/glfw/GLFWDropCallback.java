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
/// @brief The function pointer type for path drop callbacks.
/// 
/// This is the function pointer type for path drop callbacks.  A path drop
/// callback function has the following signature:
/// @code
/// void function_name(GLFWwindow* window, int path_count, const char* paths[])
/// @endcode
/// 
/// @param[in] window The window that received the event.
/// @param[in] path_count The number of dropped paths.
/// @param[in] paths The UTF-8 encoded file and/or directory path names.
/// 
/// @pointer_lifetime The path array and its strings are valid until the
/// callback function returns.
/// 
/// @sa @ref path_drop
/// @sa @ref glfwSetDropCallback
/// 
/// @since Added in version 3.1.
/// 
/// @ingroup input
/// ```
public abstract class GLFWDropCallback {

    private static final Map<Long, WeakReference<GLFWDropCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(GLFWDropCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWDropCallback() {
        this(Arena.ofAuto());
    }

    public GLFWDropCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment window,
        int path_count,
        MemorySegment paths
    ) {
        invoke(
            new GLFWwindow(window),
            path_count,
            paths
        );
    }

    public void invoke(
        GLFWwindow window,
        int path_count,
        MemorySegment paths
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWDropCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWDropCallback get(MemorySegment segment) {
        WeakReference<GLFWDropCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}