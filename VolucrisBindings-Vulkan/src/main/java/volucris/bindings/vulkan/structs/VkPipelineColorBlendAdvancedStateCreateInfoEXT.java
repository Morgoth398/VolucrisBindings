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

public final class VkPipelineColorBlendAdvancedStateCreateInfoEXT
		implements Struct<VkPipelineColorBlendAdvancedStateCreateInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SRC_PREMULTIPLIED_HANDLE;
	public static final VarHandle DST_PREMULTIPLIED_HANDLE;
	public static final VarHandle BLEND_OVERLAP_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SRC_PREMULTIPLIED_BYTE_OFFSET;
	public static final long DST_PREMULTIPLIED_BYTE_OFFSET;
	public static final long BLEND_OVERLAP_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("srcPremultiplied"),
		    JAVA_INT.withName("dstPremultiplied"),
		    JAVA_INT.withName("blendOverlap"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPipelineColorBlendAdvancedStateCreateInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SRC_PREMULTIPLIED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcPremultiplied"));
		DST_PREMULTIPLIED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstPremultiplied"));
		BLEND_OVERLAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blendOverlap"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SRC_PREMULTIPLIED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcPremultiplied"));
		DST_PREMULTIPLIED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstPremultiplied"));
		BLEND_OVERLAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blendOverlap"));
		//@formatter:on
	}

	public VkPipelineColorBlendAdvancedStateCreateInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineColorBlendAdvancedStateCreateInfoEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPipelineColorBlendAdvancedStateCreateInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #srcPremultiplied()
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT srcPremultiplied(int srcPremultiplied) {
    	SRC_PREMULTIPLIED_HANDLE.set(segment, 0L, srcPremultiplied);
    	return this;
    }
    
    public int srcPremultiplied() {
    	return (int) SRC_PREMULTIPLIED_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstPremultiplied()
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT dstPremultiplied(int dstPremultiplied) {
    	DST_PREMULTIPLIED_HANDLE.set(segment, 0L, dstPremultiplied);
    	return this;
    }
    
    public int dstPremultiplied() {
    	return (int) DST_PREMULTIPLIED_HANDLE.get(segment, 0L);
    }
    
    /// @see #blendOverlap()
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT blendOverlap(int blendOverlap) {
    	BLEND_OVERLAP_HANDLE.set(segment, 0L, blendOverlap);
    	return this;
    }
    
    public int blendOverlap() {
    	return (int) BLEND_OVERLAP_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT set(VkPipelineColorBlendAdvancedStateCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineColorBlendAdvancedStateCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineColorBlendAdvancedStateCreateInfoEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineColorBlendAdvancedStateCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineColorBlendAdvancedStateCreateInfoEXT> array(SegmentAllocator allocator, VkPipelineColorBlendAdvancedStateCreateInfoEXT... structs) {
        NativeStructArray<VkPipelineColorBlendAdvancedStateCreateInfoEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineColorBlendAdvancedStateCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineColorBlendAdvancedStateCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineColorBlendAdvancedStateCreateInfoEXT(segment)
        );
    }

}