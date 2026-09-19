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

public final class VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM
		implements Struct<VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle DIMENSION_HANDLE;
    public static final VarHandle ZERO_COUNT_HANDLE;
    public static final VarHandle GROUP_SIZE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long DIMENSION_BYTE_OFFSET;
    public static final long ZERO_COUNT_BYTE_OFFSET;
    public static final long GROUP_SIZE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("dimension"),
            JAVA_INT.withName("zeroCount"),
            JAVA_INT.withName("groupSize"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        DIMENSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dimension"));
        ZERO_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("zeroCount"));
        GROUP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("groupSize"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        DIMENSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dimension"));
        ZERO_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("zeroCount"));
        GROUP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("groupSize"));
        //@formatter:on
    }

    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM() {
        this(Arena.ofAuto());
    }
    
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #dimension()
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM dimension(int dimension) {
    	DIMENSION_HANDLE.set(segment, 0L, dimension);
    	return this;
    }
    
    public int dimension() {
    	return (int) DIMENSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #zeroCount()
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM zeroCount(int zeroCount) {
    	ZERO_COUNT_HANDLE.set(segment, 0L, zeroCount);
    	return this;
    }
    
    public int zeroCount() {
    	return (int) ZERO_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #groupSize()
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM groupSize(int groupSize) {
    	GROUP_SIZE_HANDLE.set(segment, 0L, groupSize);
    	return this;
    }
    
    public int groupSize() {
    	return (int) GROUP_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM set(VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM> array(Arena arena, VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM... structs) {
        NativeStructArray<VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDataGraphPipelineConstantTensorSemiStructuredSparsityInfoARM(segment)
        );
    }
    
}