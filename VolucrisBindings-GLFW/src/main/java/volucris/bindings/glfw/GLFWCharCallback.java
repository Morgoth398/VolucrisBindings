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
/// @brief The function pointer type for Unicode character callbacks.
/// 
/// This is the function pointer type for Unicode character callbacks.
/// A Unicode character callback function has the following signature:
/// @code
/// void function_name(GLFWwindow* window, unsigned int codepoint)
/// @endcode
/// 
/// @param[in] window The window that received the event.
/// @param[in] codepoint The Unicode code point of the character.
/// 
/// @sa @ref input_char
/// @sa @ref glfwSetCharCallback
/// 
/// @since Added in version 2.4.
/// __GLFW 3:__ Added window handle parameter.
/// 
/// @ingroup input
/// ```
public abstract class GLFWCharCallback {

    private static final Map<Long, WeakReference<GLFWCharCallback>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(GLFWCharCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWCharCallback() {
        this(Arena.ofAuto());
    }

    public GLFWCharCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment window,
        int codepoint
    ) {
        invoke(
            new GLFWwindow(window),
            codepoint
        );
    }

    public void invoke(
        GLFWwindow window,
        int codepoint
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWCharCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWCharCallback get(MemorySegment segment) {
        WeakReference<GLFWCharCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}