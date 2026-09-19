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
/// @brief The function pointer type for memory allocation callbacks.
/// 
/// This is the function pointer type for memory allocation callbacks.  A memory
/// allocation callback function has the following signature:
/// @code
/// void* function_name(size_t size, void* user)
/// @endcode
/// 
/// This function must return either a memory block at least `size` bytes long,
/// or `NULL` if allocation failed.  Note that not all parts of GLFW handle allocation
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
/// same as what `malloc` provides.  If you are using C11 or later, this is the value of
/// `alignof(max_align_t)`.
/// 
/// The size will always be greater than zero.  Allocations of size zero are filtered out
/// before reaching the custom allocator.
/// 
/// If this function returns `NULL`, GLFW will emit @ref GLFW_OUT_OF_MEMORY.
/// 
/// This function must not call any GLFW function.
/// 
/// @param[in] size The minimum size, in bytes, of the memory block.
/// @param[in] user The user-defined pointer from the allocator.
/// @return The address of the newly allocated memory block, or `NULL` if an
/// error occurred.
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
public abstract class GLFWallocatefun {

    private static final Map<Long, WeakReference<GLFWallocatefun>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            UNBOUNDED_ADDRESS, 
            JAVA_LONG, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(GLFWallocatefun.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLFWallocatefun() {
        this(Arena.ofAuto());
    }

    public GLFWallocatefun(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public MemorySegment invoke(
        long size,
        MemorySegment user
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLFWallocatefun."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLFWallocatefun get(MemorySegment segment) {
        WeakReference<GLFWallocatefun> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}