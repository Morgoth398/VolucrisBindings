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

public final class VkBindShaderGroupIndirectCommandNV
		implements Struct<VkBindShaderGroupIndirectCommandNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle GROUP_INDEX_HANDLE;

	public static final long GROUP_INDEX_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("groupIndex")
		).withName("VkBindShaderGroupIndirectCommandNV").withByteAlignment(4);
		
		GROUP_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("groupIndex"));
		
		GROUP_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("groupIndex"));
		//@formatter:on
	}

	public VkBindShaderGroupIndirectCommandNV() {
	    this(Arena.ofAuto());
	}
	
	public VkBindShaderGroupIndirectCommandNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkBindShaderGroupIndirectCommandNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #groupIndex()
    public VkBindShaderGroupIndirectCommandNV groupIndex(int groupIndex) {
    	GROUP_INDEX_HANDLE.set(segment, 0L, groupIndex);
    	return this;
    }
    
    public int groupIndex() {
    	return (int) GROUP_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkBindShaderGroupIndirectCommandNV set(VkBindShaderGroupIndirectCommandNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkBindShaderGroupIndirectCommandNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBindShaderGroupIndirectCommandNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBindShaderGroupIndirectCommandNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBindShaderGroupIndirectCommandNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBindShaderGroupIndirectCommandNV> array(SegmentAllocator allocator, VkBindShaderGroupIndirectCommandNV... structs) {
        NativeStructArray<VkBindShaderGroupIndirectCommandNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBindShaderGroupIndirectCommandNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBindShaderGroupIndirectCommandNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBindShaderGroupIndirectCommandNV(segment)
        );
    }

}