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

public final class VkDataGraphPipelineSessionBindPointRequirementARM
		implements Struct<VkDataGraphPipelineSessionBindPointRequirementARM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle BIND_POINT_HANDLE;
    public static final VarHandle BIND_POINT_TYPE_HANDLE;
    public static final VarHandle NUM_OBJECTS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long BIND_POINT_BYTE_OFFSET;
    public static final long BIND_POINT_TYPE_BYTE_OFFSET;
    public static final long NUM_OBJECTS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("bindPoint"),
            JAVA_INT.withName("bindPointType"),
            JAVA_INT.withName("numObjects"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkDataGraphPipelineSessionBindPointRequirementARM").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        BIND_POINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bindPoint"));
        BIND_POINT_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bindPointType"));
        NUM_OBJECTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numObjects"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        BIND_POINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bindPoint"));
        BIND_POINT_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bindPointType"));
        NUM_OBJECTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numObjects"));
        //@formatter:on
    }

    public VkDataGraphPipelineSessionBindPointRequirementARM() {
        this(Arena.ofAuto());
    }
    
    public VkDataGraphPipelineSessionBindPointRequirementARM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDataGraphPipelineSessionBindPointRequirementARM(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDataGraphPipelineSessionBindPointRequirementARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDataGraphPipelineSessionBindPointRequirementARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #bindPoint()
    public VkDataGraphPipelineSessionBindPointRequirementARM bindPoint(int bindPoint) {
    	BIND_POINT_HANDLE.set(segment, 0L, bindPoint);
    	return this;
    }
    
    public int bindPoint() {
    	return (int) BIND_POINT_HANDLE.get(segment, 0L);
    }
    
    /// @see #bindPointType()
    public VkDataGraphPipelineSessionBindPointRequirementARM bindPointType(int bindPointType) {
    	BIND_POINT_TYPE_HANDLE.set(segment, 0L, bindPointType);
    	return this;
    }
    
    public int bindPointType() {
    	return (int) BIND_POINT_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #numObjects()
    public VkDataGraphPipelineSessionBindPointRequirementARM numObjects(int numObjects) {
    	NUM_OBJECTS_HANDLE.set(segment, 0L, numObjects);
    	return this;
    }
    
    public int numObjects() {
    	return (int) NUM_OBJECTS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDataGraphPipelineSessionBindPointRequirementARM set(VkDataGraphPipelineSessionBindPointRequirementARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDataGraphPipelineSessionBindPointRequirementARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDataGraphPipelineSessionBindPointRequirementARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDataGraphPipelineSessionBindPointRequirementARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelineSessionBindPointRequirementARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDataGraphPipelineSessionBindPointRequirementARM> array(Arena arena, VkDataGraphPipelineSessionBindPointRequirementARM... structs) {
        NativeStructArray<VkDataGraphPipelineSessionBindPointRequirementARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelineSessionBindPointRequirementARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDataGraphPipelineSessionBindPointRequirementARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDataGraphPipelineSessionBindPointRequirementARM(segment)
        );
    }
    
}