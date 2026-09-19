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
/// @brief The function pointer type for Unicode character with modifiers
/// callbacks.
/// 
/// This is the function pointer type for Unicode character with modifiers
/// callbacks.  It is called for each input character, regardless of what
/// modifier keys are held down.  A Unicode character with modifiers callback
/// function has the following signature:
/// @code
/// void function_name(GLFWwindow* window, unsigned int codepoint, int mods)
/// @endcode
/// 
/// @param[in] window The window that received the event.
/// @param[in] codepoint The Unicode code point of the character.
/// @param[in] mods Bit field describing which [modifier keys](@ref mods) were
/// held down.
/// 
/// @sa @ref input_char
/// @sa @ref glfwSetCharModsCallback
/// 
/// @deprecated Scheduled for removal in version 4.0.
/// 
/// @since Added in version 3.1.
/// 
/// @ingroup input
/// ```
public abstract class GLFWCharModsCallback {

    private static final Map<Long, WeakReference<GLFWCharModsCallback>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(GLFWCharModsCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWCharModsCallback() {
        this(Arena.ofAuto());
    }

    public GLFWCharModsCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment window,
        int codepoint,
        int mods
    ) {
        invoke(
            new GLFWwindow(window),
            codepoint,
            mods
        );
    }

    public void invoke(
        GLFWwindow window,
        int codepoint,
        int mods
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWCharModsCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWCharModsCallback get(MemorySegment segment) {
        WeakReference<GLFWCharModsCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}