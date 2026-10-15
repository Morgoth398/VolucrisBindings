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

public final class VkPhysicalDeviceCooperativeMatrixPropertiesNV
		implements Struct<VkPhysicalDeviceCooperativeMatrixPropertiesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle COOPERATIVE_MATRIX_SUPPORTED_STAGES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long COOPERATIVE_MATRIX_SUPPORTED_STAGES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("cooperativeMatrixSupportedStages"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceCooperativeMatrixPropertiesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		COOPERATIVE_MATRIX_SUPPORTED_STAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeMatrixSupportedStages"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		COOPERATIVE_MATRIX_SUPPORTED_STAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixSupportedStages"));
		//@formatter:on
	}

	public VkPhysicalDeviceCooperativeMatrixPropertiesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceCooperativeMatrixPropertiesNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceCooperativeMatrixPropertiesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #cooperativeMatrixSupportedStages()
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV cooperativeMatrixSupportedStages(int cooperativeMatrixSupportedStages) {
    	COOPERATIVE_MATRIX_SUPPORTED_STAGES_HANDLE.set(segment, 0L, cooperativeMatrixSupportedStages);
    	return this;
    }
    
    public int cooperativeMatrixSupportedStages() {
    	return (int) COOPERATIVE_MATRIX_SUPPORTED_STAGES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV set(VkPhysicalDeviceCooperativeMatrixPropertiesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceCooperativeMatrixPropertiesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeMatrixPropertiesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeMatrixPropertiesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeMatrixPropertiesNV> array(Arena arena, VkPhysicalDeviceCooperativeMatrixPropertiesNV... structs) {
        NativeStructArray<VkPhysicalDeviceCooperativeMatrixPropertiesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeMatrixPropertiesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeMatrixPropertiesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeMatrixPropertiesNV(segment)
        );
    }

}