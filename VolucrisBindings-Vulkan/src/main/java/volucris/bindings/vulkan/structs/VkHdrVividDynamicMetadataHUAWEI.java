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

public final class VkHdrVividDynamicMetadataHUAWEI
		implements Struct<VkHdrVividDynamicMetadataHUAWEI> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DYNAMIC_METADATA_SIZE_HANDLE;
	public static final VarHandle P_DYNAMIC_METADATA_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DYNAMIC_METADATA_SIZE_BYTE_OFFSET;
	public static final long P_DYNAMIC_METADATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("dynamicMetadataSize"),
		    UNBOUNDED_ADDRESS.withName("pDynamicMetadata")
		).withName("VkHdrVividDynamicMetadataHUAWEI").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DYNAMIC_METADATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dynamicMetadataSize"));
		P_DYNAMIC_METADATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDynamicMetadata"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DYNAMIC_METADATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dynamicMetadataSize"));
		P_DYNAMIC_METADATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDynamicMetadata"));
		//@formatter:on
	}

	public VkHdrVividDynamicMetadataHUAWEI() {
	    this(Arena.ofAuto());
	}
	
	public VkHdrVividDynamicMetadataHUAWEI(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkHdrVividDynamicMetadataHUAWEI(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkHdrVividDynamicMetadataHUAWEI sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkHdrVividDynamicMetadataHUAWEI pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #dynamicMetadataSize()
    public VkHdrVividDynamicMetadataHUAWEI dynamicMetadataSize(long dynamicMetadataSize) {
    	DYNAMIC_METADATA_SIZE_HANDLE.set(segment, 0L, dynamicMetadataSize);
    	return this;
    }
    
    public long dynamicMetadataSize() {
    	return (long) DYNAMIC_METADATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDynamicMetadata()
    public VkHdrVividDynamicMetadataHUAWEI pDynamicMetadata(MemorySegment pDynamicMetadata) {
    	P_DYNAMIC_METADATA_HANDLE.set(segment, 0L, pDynamicMetadata);
    	return this;
    }
    
    public @Nullable MemorySegment pDynamicMetadata() {
    	MemorySegment segment = (MemorySegment) P_DYNAMIC_METADATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VkHdrVividDynamicMetadataHUAWEI set(VkHdrVividDynamicMetadataHUAWEI other) {
        return set(other.segment);
    }
    
    @Override
    public VkHdrVividDynamicMetadataHUAWEI set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkHdrVividDynamicMetadataHUAWEI> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkHdrVividDynamicMetadataHUAWEI> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkHdrVividDynamicMetadataHUAWEI(segment),
            count
        );
    }
    
    public static NativeStructArray<VkHdrVividDynamicMetadataHUAWEI> array(Arena arena, VkHdrVividDynamicMetadataHUAWEI... structs) {
        NativeStructArray<VkHdrVividDynamicMetadataHUAWEI> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkHdrVividDynamicMetadataHUAWEI(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkHdrVividDynamicMetadataHUAWEI> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkHdrVividDynamicMetadataHUAWEI(segment)
        );
    }

}