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

import static volucris.bindings.core.FFMUtils.*;

/// ```
/// @brief The function pointer type for memory deallocation callbacks.
/// 
/// This is the function pointer type for memory deallocation callbacks.
/// A memory deallocation callback function has the following signature:
/// @code
/// void function_name(void* block, void* user)
/// @endcode
/// 
/// This function may deallocate the specified memory block.  This memory block
/// will have been allocated with the same allocator.
/// 
/// This function must support being called during @ref glfwInit but before the library is
/// flagged as initialized, as well as during @ref glfwTerminate after the library is no
/// longer flagged as initialized.
/// 
/// The block address will never be `NULL`.  Deallocations of `NULL` are filtered out
/// before reaching the custom allocator.
/// 
/// If this function returns `NULL`, GLFW will emit @ref GLFW_OUT_OF_MEMORY.
/// 
/// This function must not call any GLFW function.
/// 
/// @param[in] block The address of the memory block to deallocate.
/// @param[in] user The user-defined pointer from the allocator.
/// 
/// @pointer_lifetime The specified memory block will not be accessed by GLFW
/// after this function is called.
/// 
/// @reentrancy This function should not call any GLFW function.
/// 
/// @thread_safety This function must support being called from any thread that calls GLFW
/// functions.
/// 
/// @sa @ref init_allocator
/// @sa @ref GLFWallocator
/// 
/// @since Added in version 3.4.
/// 
/// @ingroup init
/// ```
public abstract class GLFWdeallocatefun {

    private static final Map<Long, WeakReference<GLFWdeallocatefun>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(GLFWdeallocatefun.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWdeallocatefun() {
        this(Arena.ofAuto());
    }

    public GLFWdeallocatefun(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment block,
        MemorySegment user
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWdeallocatefun."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWdeallocatefun get(MemorySegment segment) {
        WeakReference<GLFWdeallocatefun> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}