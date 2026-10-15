/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPhysicalDeviceCooperativeMatrixFeaturesKHR
		implements Struct<VkPhysicalDeviceCooperativeMatrixFeaturesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle COOPERATIVE_MATRIX_HANDLE;
	public static final VarHandle COOPERATIVE_MATRIX_ROBUST_BUFFER_ACCESS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long COOPERATIVE_MATRIX_BYTE_OFFSET;
	public static final long COOPERATIVE_MATRIX_ROBUST_BUFFER_ACCESS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("cooperativeMatrix"),
		    JAVA_INT.withName("cooperativeMatrixRobustBufferAccess")
		).withName("VkPhysicalDeviceCooperativeMatrixFeaturesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		COOPERATIVE_MATRIX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeMatrix"));
		COOPERATIVE_MATRIX_ROBUST_BUFFER_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeMatrixRobustBufferAccess"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		COOPERATIVE_MATRIX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrix"));
		COOPERATIVE_MATRIX_ROBUST_BUFFER_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixRobustBufferAccess"));
		//@formatter:on
	}

	public VkPhysicalDeviceCooperativeMatrixFeaturesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceCooperativeMatrixFeaturesKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceCooperativeMatrixFeaturesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #cooperativeMatrix()
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR cooperativeMatrix(int cooperativeMatrix) {
    	COOPERATIVE_MATRIX_HANDLE.set(segment, 0L, cooperativeMatrix);
    	return this;
    }
    
    public int cooperativeMatrix() {
    	return (int) COOPERATIVE_MATRIX_HANDLE.get(segment, 0L);
    }
    
    /// @see #cooperativeMatrixRobustBufferAccess()
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR cooperativeMatrixRobustBufferAccess(int cooperativeMatrixRobustBufferAccess) {
    	COOPERATIVE_MATRIX_ROBUST_BUFFER_ACCESS_HANDLE.set(segment, 0L, cooperativeMatrixRobustBufferAccess);
    	return this;
    }
    
    public int cooperativeMatrixRobustBufferAccess() {
    	return (int) COOPERATIVE_MATRIX_ROBUST_BUFFER_ACCESS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR set(VkPhysicalDeviceCooperativeMatrixFeaturesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceCooperativeMatrixFeaturesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeMatrixFeaturesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeMatrixFeaturesKHR> array(Arena arena, VkPhysicalDeviceCooperativeMatrixFeaturesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceCooperativeMatrixFeaturesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeMatrixFeaturesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(segment)
        );
    }

}