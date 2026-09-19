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
/// @brief The function pointer type for memory reallocation callbacks.
/// 
/// This is the function pointer type for memory reallocation callbacks.
/// A memory reallocation callback function has the following signature:
/// @code
/// void* function_name(void* block, size_t size, void* user)
/// @endcode
/// 
/// This function must return a memory block at least `size` bytes long, or
/// `NULL` if allocation failed.  Note that not all parts of GLFW handle allocation
/// failures gracefully yet.
/// 
/// This function must support being called during @ref glfwInit but before the library is
/// flagged as initialized, as well as during @ref glfwTerminate after the library is no
/// longer flagged as initialized.
/// 
/// Any memory allocated via this function will be deallocated via the same allocator
/// during library termination or earlier.
/// 
/// Any memory allocated via this function must be suitably aligned for any object type.
/// If you are using C99 or earlier, this alignment is platform-dependent but will be the
/// same as what `realloc` provides.  If you are using C11 or later, this is the value of
/// `alignof(max_align_t)`.
/// 
/// The block address will never be `NULL` and the size will always be greater than zero.
/// Reallocations of a block to size zero are converted into deallocations before reaching
/// the custom allocator.  Reallocations of `NULL` to a non-zero size are converted into
/// regular allocations before reaching the custom allocator.
/// 
/// If this function returns `NULL`, GLFW will emit @ref GLFW_OUT_OF_MEMORY.
/// 
/// This function must not call any GLFW function.
/// 
/// @param[in] block The address of the memory block to reallocate.
/// @param[in] size The new minimum size, in bytes, of the memory block.
/// @param[in] user The user-defined pointer from the allocator.
/// @return The address of the newly allocated or resized memory block, or
/// `NULL` if an error occurred.
/// 
/// @pointer_lifetime The returned memory block must be valid at least until it
/// is deallocated.
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
public abstract class GLFWreallocatefun {

    private static final Map<Long, WeakReference<GLFWreallocatefun>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_LONG, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(GLFWreallocatefun.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWreallocatefun() {
        this(Arena.ofAuto());
    }

    public GLFWreallocatefun(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public MemorySegment invoke(
        MemorySegment block,
        long size,
        MemorySegment user
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWreallocatefun."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWreallocatefun get(MemorySegment segment) {
        WeakReference<GLFWreallocatefun> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}