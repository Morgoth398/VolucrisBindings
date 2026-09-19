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

public final class VkDataGraphPipelineSessionMemoryRequirementsInfoARM
		implements Struct<VkDataGraphPipelineSessionMemoryRequirementsInfoARM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SESSION_HANDLE;
    public static final VarHandle BIND_POINT_HANDLE;
    public static final VarHandle OBJECT_INDEX_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SESSION_BYTE_OFFSET;
    public static final long BIND_POINT_BYTE_OFFSET;
    public static final long OBJECT_INDEX_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("session"),
            JAVA_INT.withName("bindPoint"),
            JAVA_INT.withName("objectIndex")
        ).withName("VkDataGraphPipelineSessionMemoryRequirementsInfoARM").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SESSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("session"));
        BIND_POINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bindPoint"));
        OBJECT_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("objectIndex"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SESSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("session"));
        BIND_POINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bindPoint"));
        OBJECT_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("objectIndex"));
        //@formatter:on
    }

    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM() {
        this(Arena.ofAuto());
    }
    
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM pNext(MemorySegment pNext) {
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
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM session(VkDataGraphPipelineSessionARM session) {
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
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM bindPoint(int bindPoint) {
    	BIND_POINT_HANDLE.set(segment, 0L, bindPoint);
    	return this;
    }
    
    public int bindPoint() {
    	return (int) BIND_POINT_HANDLE.get(segment, 0L);
    }
    
    /// @see #objectIndex()
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM objectIndex(int objectIndex) {
    	OBJECT_INDEX_HANDLE.set(segment, 0L, objectIndex);
    	return this;
    }
    
    public int objectIndex() {
    	return (int) OBJECT_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM set(VkDataGraphPipelineSessionMemoryRequirementsInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDataGraphPipelineSessionMemoryRequirementsInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDataGraphPipelineSessionMemoryRequirementsInfoARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDataGraphPipelineSessionMemoryRequirementsInfoARM> array(Arena arena, VkDataGraphPipelineSessionMemoryRequirementsInfoARM... structs) {
        NativeStructArray<VkDataGraphPipelineSessionMemoryRequirementsInfoARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDataGraphPipelineSessionMemoryRequirementsInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(segment)
        );
    }
    
}