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

public final class VkDataGraphPipelineSingleNodeCreateInfoARM
		implements Struct<VkDataGraphPipelineSingleNodeCreateInfoARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle NODE_TYPE_HANDLE;
	public static final VarHandle CONNECTION_COUNT_HANDLE;
	public static final VarHandle P_CONNECTIONS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long NODE_TYPE_BYTE_OFFSET;
	public static final long CONNECTION_COUNT_BYTE_OFFSET;
	public static final long P_CONNECTIONS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("nodeType"),
		    JAVA_INT.withName("connectionCount"),
		    UNBOUNDED_ADDRESS.withName("pConnections")
		).withName("VkDataGraphPipelineSingleNodeCreateInfoARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		NODE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nodeType"));
		CONNECTION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("connectionCount"));
		P_CONNECTIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pConnections"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		NODE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodeType"));
		CONNECTION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("connectionCount"));
		P_CONNECTIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pConnections"));
		//@formatter:on
	}

	public VkDataGraphPipelineSingleNodeCreateInfoARM() {
	    this(Arena.ofAuto());
	}
	
	public VkDataGraphPipelineSingleNodeCreateInfoARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDataGraphPipelineSingleNodeCreateInfoARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDataGraphPipelineSingleNodeCreateInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDataGraphPipelineSingleNodeCreateInfoARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #nodeType()
    public VkDataGraphPipelineSingleNodeCreateInfoARM nodeType(int nodeType) {
    	NODE_TYPE_HANDLE.set(segment, 0L, nodeType);
    	return this;
    }
    
    public int nodeType() {
    	return (int) NODE_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #connectionCount()
    public VkDataGraphPipelineSingleNodeCreateInfoARM connectionCount(int connectionCount) {
    	CONNECTION_COUNT_HANDLE.set(segment, 0L, connectionCount);
    	return this;
    }
    
    public int connectionCount() {
    	return (int) CONNECTION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pConnections()
    public VkDataGraphPipelineSingleNodeCreateInfoARM pConnections(NativeStructArray<VkDataGraphPipelineSingleNodeConnectionARM> pConnections) {
    	P_CONNECTIONS_HANDLE.set(segment, 0L, pConnections.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkDataGraphPipelineSingleNodeConnectionARM> pConnections() {
    	MemorySegment segment = (MemorySegment) P_CONNECTIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkDataGraphPipelineSingleNodeConnectionARM.array(segment);
    }
    
    @Override
    public VkDataGraphPipelineSingleNodeCreateInfoARM set(VkDataGraphPipelineSingleNodeCreateInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDataGraphPipelineSingleNodeCreateInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDataGraphPipelineSingleNodeCreateInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDataGraphPipelineSingleNodeCreateInfoARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDataGraphPipelineSingleNodeCreateInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDataGraphPipelineSingleNodeCreateInfoARM> array(SegmentAllocator allocator, VkDataGraphPipelineSingleNodeCreateInfoARM... structs) {
        NativeStructArray<VkDataGraphPipelineSingleNodeCreateInfoARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDataGraphPipelineSingleNodeCreateInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDataGraphPipelineSingleNodeCreateInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDataGraphPipelineSingleNodeCreateInfoARM(segment)
        );
    }

}