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

public final class VkPipelineRasterizationProvokingVertexStateCreateInfoEXT
		implements Struct<VkPipelineRasterizationProvokingVertexStateCreateInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PROVOKING_VERTEX_MODE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PROVOKING_VERTEX_MODE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("provokingVertexMode"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPipelineRasterizationProvokingVertexStateCreateInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PROVOKING_VERTEX_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("provokingVertexMode"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PROVOKING_VERTEX_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("provokingVertexMode"));
		//@formatter:on
	}

	public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #provokingVertexMode()
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT provokingVertexMode(int provokingVertexMode) {
    	PROVOKING_VERTEX_MODE_HANDLE.set(segment, 0L, provokingVertexMode);
    	return this;
    }
    
    public int provokingVertexMode() {
    	return (int) PROVOKING_VERTEX_MODE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT set(VkPipelineRasterizationProvokingVertexStateCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineRasterizationProvokingVertexStateCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineRasterizationProvokingVertexStateCreateInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineRasterizationProvokingVertexStateCreateInfoEXT> array(Arena arena, VkPipelineRasterizationProvokingVertexStateCreateInfoEXT... structs) {
        NativeStructArray<VkPipelineRasterizationProvokingVertexStateCreateInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineRasterizationProvokingVertexStateCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(segment)
        );
    }

}