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

public final class VkTensorFormatPropertiesARM
		implements Struct<VkTensorFormatPropertiesARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle OPTIMAL_TILING_TENSOR_FEATURES_HANDLE;
	public static final VarHandle LINEAR_TILING_TENSOR_FEATURES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long OPTIMAL_TILING_TENSOR_FEATURES_BYTE_OFFSET;
	public static final long LINEAR_TILING_TENSOR_FEATURES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("optimalTilingTensorFeatures"),
		    JAVA_LONG.withName("linearTilingTensorFeatures")
		).withName("VkTensorFormatPropertiesARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		OPTIMAL_TILING_TENSOR_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("optimalTilingTensorFeatures"));
		LINEAR_TILING_TENSOR_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("linearTilingTensorFeatures"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		OPTIMAL_TILING_TENSOR_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("optimalTilingTensorFeatures"));
		LINEAR_TILING_TENSOR_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linearTilingTensorFeatures"));
		//@formatter:on
	}

	public VkTensorFormatPropertiesARM() {
	    this(Arena.ofAuto());
	}
	
	public VkTensorFormatPropertiesARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkTensorFormatPropertiesARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkTensorFormatPropertiesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkTensorFormatPropertiesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #optimalTilingTensorFeatures()
    public VkTensorFormatPropertiesARM optimalTilingTensorFeatures(long optimalTilingTensorFeatures) {
    	OPTIMAL_TILING_TENSOR_FEATURES_HANDLE.set(segment, 0L, optimalTilingTensorFeatures);
    	return this;
    }
    
    public long optimalTilingTensorFeatures() {
    	return (long) OPTIMAL_TILING_TENSOR_FEATURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #linearTilingTensorFeatures()
    public VkTensorFormatPropertiesARM linearTilingTensorFeatures(long linearTilingTensorFeatures) {
    	LINEAR_TILING_TENSOR_FEATURES_HANDLE.set(segment, 0L, linearTilingTensorFeatures);
    	return this;
    }
    
    public long linearTilingTensorFeatures() {
    	return (long) LINEAR_TILING_TENSOR_FEATURES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkTensorFormatPropertiesARM set(VkTensorFormatPropertiesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkTensorFormatPropertiesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkTensorFormatPropertiesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkTensorFormatPropertiesARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkTensorFormatPropertiesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkTensorFormatPropertiesARM> array(Arena arena, VkTensorFormatPropertiesARM... structs) {
        NativeStructArray<VkTensorFormatPropertiesARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkTensorFormatPropertiesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkTensorFormatPropertiesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkTensorFormatPropertiesARM(segment)
        );
    }

}