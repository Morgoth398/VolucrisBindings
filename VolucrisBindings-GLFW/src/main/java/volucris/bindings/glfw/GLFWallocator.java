/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.glfw;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// @brief Custom heap memory allocator.
/// 
/// This describes a custom heap memory allocator for GLFW.  To set an allocator, pass it
/// to @ref glfwInitAllocator before initializing the library.
/// 
/// @sa @ref init_allocator
/// @sa @ref glfwInitAllocator
/// 
/// @since Added in version 3.4.
/// 
/// @ingroup init
/// ```
public final class GLFWallocator
		implements Struct<GLFWallocator> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ALLOCATE_HANDLE;
	public static final VarHandle REALLOCATE_HANDLE;
	public static final VarHandle DEALLOCATE_HANDLE;
	public static final VarHandle USER_HANDLE;

	public static final long ALLOCATE_BYTE_OFFSET;
	public static final long REALLOCATE_BYTE_OFFSET;
	public static final long DEALLOCATE_BYTE_OFFSET;
	public static final long USER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("allocate"),
		    UNBOUNDED_ADDRESS.withName("reallocate"),
		    UNBOUNDED_ADDRESS.withName("deallocate"),
		    UNBOUNDED_ADDRESS.withName("user")
		).withName("GLFWallocator").withByteAlignment(8);
		
		ALLOCATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("allocate"));
		REALLOCATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reallocate"));
		DEALLOCATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deallocate"));
		USER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("user"));
		
		ALLOCATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocate"));
		REALLOCATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reallocate"));
		DEALLOCATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deallocate"));
		USER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("user"));
		//@formatter:on
	}

	public GLFWallocator() {
	    this(Arena.ofAuto());
	}
	
	public GLFWallocator(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public GLFWallocator(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #allocate()
    public GLFWallocator allocate(GLFWallocatefun allocate) {
    	ALLOCATE_HANDLE.set(segment, 0L, allocate.memorySegment());
    	return this;
    }
    
    /// ```
    /// The memory allocation function.  See @ref GLFWallocatefun for details about
    /// allocation function.
    /// ```
    public @Nullable GLFWallocatefun allocate() {
    	MemorySegment segment = (MemorySegment) ALLOCATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return GLFWallocatefun.get(segment);
    }
    
    /// @see #reallocate()
    public GLFWallocator reallocate(GLFWreallocatefun reallocate) {
    	REALLOCATE_HANDLE.set(segment, 0L, reallocate.memorySegment());
    	return this;
    }
    
    /// ```
    /// The memory reallocation function.  See @ref GLFWreallocatefun for details about
    /// reallocation function.
    /// ```
    public @Nullable GLFWreallocatefun reallocate() {
    	MemorySegment segment = (MemorySegment) REALLOCATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return GLFWreallocatefun.get(segment);
    }
    
    /// @see #deallocate()
    public GLFWallocator deallocate(GLFWdeallocatefun deallocate) {
    	DEALLOCATE_HANDLE.set(segment, 0L, deallocate.memorySegment());
    	return this;
    }
    
    /// ```
    /// The memory deallocation function.  See @ref GLFWdeallocatefun for details about
    /// deallocation function.
    /// ```
    public @Nullable GLFWdeallocatefun deallocate() {
    	MemorySegment segment = (MemorySegment) DEALLOCATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return GLFWdeallocatefun.get(segment);
    }
    
    /// @see #user()
    public GLFWallocator user(MemorySegment user) {
    	USER_HANDLE.set(segment, 0L, user);
    	return this;
    }
    
    /// ```
    /// The user pointer for this custom allocator.  This value will be passed to the
    /// allocator functions.
    /// ```
    public @Nullable MemorySegment user() {
    	MemorySegment segment = (MemorySegment) USER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public GLFWallocator set(GLFWallocator other) {
        return set(other.segment);
    }
    
    @Override
    public GLFWallocator set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<GLFWallocator> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<GLFWallocator> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new GLFWallocator(segment),
            count
        );
    }
    
    public static NativeStructArray<GLFWallocator> array(Arena arena, GLFWallocator... structs) {
        NativeStructArray<GLFWallocator> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new GLFWallocator(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<GLFWallocator> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new GLFWallocator(segment)
        );
    }

}