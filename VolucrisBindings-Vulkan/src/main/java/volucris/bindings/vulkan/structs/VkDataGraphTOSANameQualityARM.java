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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkDataGraphTOSANameQualityARM
		implements Struct<VkDataGraphTOSANameQualityARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle NAME_HANDLE;
	public static final VarHandle QUALITY_FLAGS_HANDLE;

	public static final long NAME_BYTE_OFFSET;
	public static final long QUALITY_FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MemoryLayout.sequenceLayout(128, JAVA_BYTE).withName("name"),
		    JAVA_INT.withName("qualityFlags")
		).withName("VkDataGraphTOSANameQualityARM").withByteAlignment(4);
		
		NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("name"), PathElement.sequenceElement());
		QUALITY_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("qualityFlags"));
		
		NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("name"));
		QUALITY_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("qualityFlags"));
		//@formatter:on
	}

	public VkDataGraphTOSANameQualityARM() {
	    this(Arena.ofAuto());
	}
	
	public VkDataGraphTOSANameQualityARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDataGraphTOSANameQualityARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #name(int)
    public VkDataGraphTOSANameQualityARM name(byte name, int index0) {
    	NAME_HANDLE.set(segment, 0L, index0, name);
    	return this;
    }
    
    public byte name(int index0) {
    	return (byte) NAME_HANDLE.get(segment, 0L, index0);
    }
    
    public String name() {
        return segment.getString(NAME_BYTE_OFFSET);
    }
    
    /// @see #qualityFlags()
    public VkDataGraphTOSANameQualityARM qualityFlags(int qualityFlags) {
    	QUALITY_FLAGS_HANDLE.set(segment, 0L, qualityFlags);
    	return this;
    }
    
    public int qualityFlags() {
    	return (int) QUALITY_FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDataGraphTOSANameQualityARM set(VkDataGraphTOSANameQualityARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDataGraphTOSANameQualityARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDataGraphTOSANameQualityARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDataGraphTOSANameQualityARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDataGraphTOSANameQualityARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDataGraphTOSANameQualityARM> array(SegmentAllocator allocator, VkDataGraphTOSANameQualityARM... structs) {
        NativeStructArray<VkDataGraphTOSANameQualityARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDataGraphTOSANameQualityARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDataGraphTOSANameQualityARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDataGraphTOSANameQualityARM(segment)
        );
    }

}