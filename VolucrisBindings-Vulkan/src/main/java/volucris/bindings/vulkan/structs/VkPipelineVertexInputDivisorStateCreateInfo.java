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

public final class VkPipelineVertexInputDivisorStateCreateInfo
		implements Struct<VkPipelineVertexInputDivisorStateCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle VERTEX_BINDING_DIVISOR_COUNT_HANDLE;
	public static final VarHandle P_VERTEX_BINDING_DIVISORS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long VERTEX_BINDING_DIVISOR_COUNT_BYTE_OFFSET;
	public static final long P_VERTEX_BINDING_DIVISORS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("vertexBindingDivisorCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pVertexBindingDivisors")
		).withName("VkPipelineVertexInputDivisorStateCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		VERTEX_BINDING_DIVISOR_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexBindingDivisorCount"));
		P_VERTEX_BINDING_DIVISORS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pVertexBindingDivisors"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		VERTEX_BINDING_DIVISOR_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexBindingDivisorCount"));
		P_VERTEX_BINDING_DIVISORS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pVertexBindingDivisors"));
		//@formatter:on
	}

	public VkPipelineVertexInputDivisorStateCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineVertexInputDivisorStateCreateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPipelineVertexInputDivisorStateCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineVertexInputDivisorStateCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineVertexInputDivisorStateCreateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #vertexBindingDivisorCount()
    public VkPipelineVertexInputDivisorStateCreateInfo vertexBindingDivisorCount(int vertexBindingDivisorCount) {
    	VERTEX_BINDING_DIVISOR_COUNT_HANDLE.set(segment, 0L, vertexBindingDivisorCount);
    	return this;
    }
    
    public int vertexBindingDivisorCount() {
    	return (int) VERTEX_BINDING_DIVISOR_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pVertexBindingDivisors()
    public VkPipelineVertexInputDivisorStateCreateInfo pVertexBindingDivisors(NativeStructArray<VkVertexInputBindingDivisorDescription> pVertexBindingDivisors) {
    	P_VERTEX_BINDING_DIVISORS_HANDLE.set(segment, 0L, pVertexBindingDivisors.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkVertexInputBindingDivisorDescription> pVertexBindingDivisors() {
    	MemorySegment segment = (MemorySegment) P_VERTEX_BINDING_DIVISORS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkVertexInputBindingDivisorDescription.array(segment);
    }
    
    @Override
    public VkPipelineVertexInputDivisorStateCreateInfo set(VkPipelineVertexInputDivisorStateCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineVertexInputDivisorStateCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineVertexInputDivisorStateCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineVertexInputDivisorStateCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineVertexInputDivisorStateCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineVertexInputDivisorStateCreateInfo> array(Arena arena, VkPipelineVertexInputDivisorStateCreateInfo... structs) {
        NativeStructArray<VkPipelineVertexInputDivisorStateCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineVertexInputDivisorStateCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineVertexInputDivisorStateCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineVertexInputDivisorStateCreateInfo(segment)
        );
    }

}