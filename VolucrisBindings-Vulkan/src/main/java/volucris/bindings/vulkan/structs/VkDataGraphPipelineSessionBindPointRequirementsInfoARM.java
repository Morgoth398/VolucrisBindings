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

public final class VkDataGraphPipelineSessionBindPointRequirementsInfoARM
		implements Struct<VkDataGraphPipelineSessionBindPointRequirementsInfoARM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SESSION_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SESSION_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("session")
        ).withName("VkDataGraphPipelineSessionBindPointRequirementsInfoARM").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SESSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("session"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SESSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("session"));
        //@formatter:on
    }

    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM() {
        this(Arena.ofAuto());
    }
    
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM pNext(MemorySegment pNext) {
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
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM session(VkDataGraphPipelineSessionARM session) {
    	SESSION_HANDLE.set(segment, 0L, session.memorySegment());
    	return this;
    }
    
    public @Nullable VkDataGraphPipelineSessionARM session() {
    	MemorySegment segment = (MemorySegment) SESSION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDataGraphPipelineSessionARM(segment);
    }
    
    @Override
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM set(VkDataGraphPipelineSessionBindPointRequirementsInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDataGraphPipelineSessionBindPointRequirementsInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDataGraphPipelineSessionBindPointRequirementsInfoARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDataGraphPipelineSessionBindPointRequirementsInfoARM> array(Arena arena, VkDataGraphPipelineSessionBindPointRequirementsInfoARM... structs) {
        NativeStructArray<VkDataGraphPipelineSessionBindPointRequirementsInfoARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDataGraphPipelineSessionBindPointRequirementsInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(segment)
        );
    }
    
}