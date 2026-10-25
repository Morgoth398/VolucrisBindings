/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
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

public final class VkTextureLODGatherFormatPropertiesAMD
		implements Struct<VkTextureLODGatherFormatPropertiesAMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SUPPORTS_TEXTURE_GATHER_LODBIAS_AMD_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SUPPORTS_TEXTURE_GATHER_LODBIAS_AMD_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("supportsTextureGatherLODBiasAMD"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkTextureLODGatherFormatPropertiesAMD").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SUPPORTS_TEXTURE_GATHER_LODBIAS_AMD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportsTextureGatherLODBiasAMD"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SUPPORTS_TEXTURE_GATHER_LODBIAS_AMD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportsTextureGatherLODBiasAMD"));
		//@formatter:on
	}

	public VkTextureLODGatherFormatPropertiesAMD() {
	    this(Arena.ofAuto());
	}
	
	public VkTextureLODGatherFormatPropertiesAMD(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkTextureLODGatherFormatPropertiesAMD(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkTextureLODGatherFormatPropertiesAMD sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkTextureLODGatherFormatPropertiesAMD pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #supportsTextureGatherLODBiasAMD()
    public VkTextureLODGatherFormatPropertiesAMD supportsTextureGatherLODBiasAMD(int supportsTextureGatherLODBiasAMD) {
    	SUPPORTS_TEXTURE_GATHER_LODBIAS_AMD_HANDLE.set(segment, 0L, supportsTextureGatherLODBiasAMD);
    	return this;
    }
    
    public int supportsTextureGatherLODBiasAMD() {
    	return (int) SUPPORTS_TEXTURE_GATHER_LODBIAS_AMD_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkTextureLODGatherFormatPropertiesAMD set(VkTextureLODGatherFormatPropertiesAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkTextureLODGatherFormatPropertiesAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkTextureLODGatherFormatPropertiesAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkTextureLODGatherFormatPropertiesAMD> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkTextureLODGatherFormatPropertiesAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkTextureLODGatherFormatPropertiesAMD> array(SegmentAllocator allocator, VkTextureLODGatherFormatPropertiesAMD... structs) {
        NativeStructArray<VkTextureLODGatherFormatPropertiesAMD> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkTextureLODGatherFormatPropertiesAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkTextureLODGatherFormatPropertiesAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkTextureLODGatherFormatPropertiesAMD(segment)
        );
    }

}