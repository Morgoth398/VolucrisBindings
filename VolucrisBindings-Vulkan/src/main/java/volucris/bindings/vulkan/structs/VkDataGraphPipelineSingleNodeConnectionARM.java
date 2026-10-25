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

public final class VkDataGraphPipelineSingleNodeConnectionARM
		implements Struct<VkDataGraphPipelineSingleNodeConnectionARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SET_HANDLE;
	public static final VarHandle BINDING_HANDLE;
	public static final VarHandle CONNECTION_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SET_BYTE_OFFSET;
	public static final long BINDING_BYTE_OFFSET;
	public static final long CONNECTION_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("set"),
		    JAVA_INT.withName("binding"),
		    JAVA_INT.withName("connection"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDataGraphPipelineSingleNodeConnectionARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("set"));
		BINDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("binding"));
		CONNECTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("connection"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("set"));
		BINDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("binding"));
		CONNECTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("connection"));
		//@formatter:on
	}

	public VkDataGraphPipelineSingleNodeConnectionARM() {
	    this(Arena.ofAuto());
	}
	
	public VkDataGraphPipelineSingleNodeConnectionARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDataGraphPipelineSingleNodeConnectionARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDataGraphPipelineSingleNodeConnectionARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDataGraphPipelineSingleNodeConnectionARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #set()
    public VkDataGraphPipelineSingleNodeConnectionARM set(int set) {
    	SET_HANDLE.set(segment, 0L, set);
    	return this;
    }
    
    public int set() {
    	return (int) SET_HANDLE.get(segment, 0L);
    }
    
    /// @see #binding()
    public VkDataGraphPipelineSingleNodeConnectionARM binding(int binding) {
    	BINDING_HANDLE.set(segment, 0L, binding);
    	return this;
    }
    
    public int binding() {
    	return (int) BINDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #connection()
    public VkDataGraphPipelineSingleNodeConnectionARM connection(int connection) {
    	CONNECTION_HANDLE.set(segment, 0L, connection);
    	return this;
    }
    
    public int connection() {
    	return (int) CONNECTION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDataGraphPipelineSingleNodeConnectionARM set(VkDataGraphPipelineSingleNodeConnectionARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDataGraphPipelineSingleNodeConnectionARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDataGraphPipelineSingleNodeConnectionARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDataGraphPipelineSingleNodeConnectionARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDataGraphPipelineSingleNodeConnectionARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDataGraphPipelineSingleNodeConnectionARM> array(SegmentAllocator allocator, VkDataGraphPipelineSingleNodeConnectionARM... structs) {
        NativeStructArray<VkDataGraphPipelineSingleNodeConnectionARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDataGraphPipelineSingleNodeConnectionARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDataGraphPipelineSingleNodeConnectionARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDataGraphPipelineSingleNodeConnectionARM(segment)
        );
    }

}