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

public final class VkBindDataGraphPipelineSessionMemoryInfoARM
		implements Struct<VkBindDataGraphPipelineSessionMemoryInfoARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SESSION_HANDLE;
	public static final VarHandle BIND_POINT_HANDLE;
	public static final VarHandle OBJECT_INDEX_HANDLE;
	public static final VarHandle MEMORY_HANDLE;
	public static final VarHandle MEMORY_OFFSET_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SESSION_BYTE_OFFSET;
	public static final long BIND_POINT_BYTE_OFFSET;
	public static final long OBJECT_INDEX_BYTE_OFFSET;
	public static final long MEMORY_BYTE_OFFSET;
	public static final long MEMORY_OFFSET_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("session"),
		    JAVA_INT.withName("bindPoint"),
		    JAVA_INT.withName("objectIndex"),
		    UNBOUNDED_ADDRESS.withName("memory"),
		    JAVA_LONG.withName("memoryOffset")
		).withName("VkBindDataGraphPipelineSessionMemoryInfoARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SESSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("session"));
		BIND_POINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bindPoint"));
		OBJECT_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("objectIndex"));
		MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memory"));
		MEMORY_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryOffset"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SESSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("session"));
		BIND_POINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bindPoint"));
		OBJECT_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("objectIndex"));
		MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memory"));
		MEMORY_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryOffset"));
		//@formatter:on
	}

	public VkBindDataGraphPipelineSessionMemoryInfoARM() {
	    this(Arena.ofAuto());
	}
	
	public VkBindDataGraphPipelineSessionMemoryInfoARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkBindDataGraphPipelineSessionMemoryInfoARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkBindDataGraphPipelineSessionMemoryInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBindDataGraphPipelineSessionMemoryInfoARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #session()
    public VkBindDataGraphPipelineSessionMemoryInfoARM session(VkDataGraphPipelineSessionARM session) {
    	SESSION_HANDLE.set(segment, 0L, session.memorySegment());
    	return this;
    }
    
    public @Nullable VkDataGraphPipelineSessionARM session() {
    	MemorySegment segment = (MemorySegment) SESSION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDataGraphPipelineSessionARM(segment);
    }
    
    /// @see #bindPoint()
    public VkBindDataGraphPipelineSessionMemoryInfoARM bindPoint(int bindPoint) {
    	BIND_POINT_HANDLE.set(segment, 0L, bindPoint);
    	return this;
    }
    
    public int bindPoint() {
    	return (int) BIND_POINT_HANDLE.get(segment, 0L);
    }
    
    /// @see #objectIndex()
    public VkBindDataGraphPipelineSessionMemoryInfoARM objectIndex(int objectIndex) {
    	OBJECT_INDEX_HANDLE.set(segment, 0L, objectIndex);
    	return this;
    }
    
    public int objectIndex() {
    	return (int) OBJECT_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #memory()
    public VkBindDataGraphPipelineSessionMemoryInfoARM memory(VkDeviceMemory memory) {
    	MEMORY_HANDLE.set(segment, 0L, memory.memorySegment());
    	return this;
    }
    
    public @Nullable VkDeviceMemory memory() {
    	MemorySegment segment = (MemorySegment) MEMORY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDeviceMemory(segment);
    }
    
    /// @see #memoryOffset()
    public VkBindDataGraphPipelineSessionMemoryInfoARM memoryOffset(long memoryOffset) {
    	MEMORY_OFFSET_HANDLE.set(segment, 0L, memoryOffset);
    	return this;
    }
    
    public long memoryOffset() {
    	return (long) MEMORY_OFFSET_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkBindDataGraphPipelineSessionMemoryInfoARM set(VkBindDataGraphPipelineSessionMemoryInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkBindDataGraphPipelineSessionMemoryInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBindDataGraphPipelineSessionMemoryInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBindDataGraphPipelineSessionMemoryInfoARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindDataGraphPipelineSessionMemoryInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBindDataGraphPipelineSessionMemoryInfoARM> array(Arena arena, VkBindDataGraphPipelineSessionMemoryInfoARM... structs) {
        NativeStructArray<VkBindDataGraphPipelineSessionMemoryInfoARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindDataGraphPipelineSessionMemoryInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBindDataGraphPipelineSessionMemoryInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBindDataGraphPipelineSessionMemoryInfoARM(segment)
        );
    }

}