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

public final class VkDepthBiasRepresentationInfoEXT
		implements Struct<VkDepthBiasRepresentationInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DEPTH_BIAS_REPRESENTATION_HANDLE;
	public static final VarHandle DEPTH_BIAS_EXACT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DEPTH_BIAS_REPRESENTATION_BYTE_OFFSET;
	public static final long DEPTH_BIAS_EXACT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("depthBiasRepresentation"),
		    JAVA_INT.withName("depthBiasExact")
		).withName("VkDepthBiasRepresentationInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DEPTH_BIAS_REPRESENTATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthBiasRepresentation"));
		DEPTH_BIAS_EXACT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthBiasExact"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DEPTH_BIAS_REPRESENTATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthBiasRepresentation"));
		DEPTH_BIAS_EXACT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthBiasExact"));
		//@formatter:on
	}

	public VkDepthBiasRepresentationInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDepthBiasRepresentationInfoEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDepthBiasRepresentationInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDepthBiasRepresentationInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDepthBiasRepresentationInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #depthBiasRepresentation()
    public VkDepthBiasRepresentationInfoEXT depthBiasRepresentation(int depthBiasRepresentation) {
    	DEPTH_BIAS_REPRESENTATION_HANDLE.set(segment, 0L, depthBiasRepresentation);
    	return this;
    }
    
    public int depthBiasRepresentation() {
    	return (int) DEPTH_BIAS_REPRESENTATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthBiasExact()
    public VkDepthBiasRepresentationInfoEXT depthBiasExact(int depthBiasExact) {
    	DEPTH_BIAS_EXACT_HANDLE.set(segment, 0L, depthBiasExact);
    	return this;
    }
    
    public int depthBiasExact() {
    	return (int) DEPTH_BIAS_EXACT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDepthBiasRepresentationInfoEXT set(VkDepthBiasRepresentationInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDepthBiasRepresentationInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDepthBiasRepresentationInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDepthBiasRepresentationInfoEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDepthBiasRepresentationInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDepthBiasRepresentationInfoEXT> array(SegmentAllocator allocator, VkDepthBiasRepresentationInfoEXT... structs) {
        NativeStructArray<VkDepthBiasRepresentationInfoEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDepthBiasRepresentationInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDepthBiasRepresentationInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDepthBiasRepresentationInfoEXT(segment)
        );
    }

}