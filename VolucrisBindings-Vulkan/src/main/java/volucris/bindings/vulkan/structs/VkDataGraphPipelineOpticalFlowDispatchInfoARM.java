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

public final class VkDataGraphPipelineOpticalFlowDispatchInfoARM
		implements Struct<VkDataGraphPipelineOpticalFlowDispatchInfoARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle MEAN_FLOW_L1_NORM_HINT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long MEAN_FLOW_L1_NORM_HINT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("meanFlowL1NormHint")
		).withName("VkDataGraphPipelineOpticalFlowDispatchInfoARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		MEAN_FLOW_L1_NORM_HINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("meanFlowL1NormHint"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		MEAN_FLOW_L1_NORM_HINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("meanFlowL1NormHint"));
		//@formatter:on
	}

	public VkDataGraphPipelineOpticalFlowDispatchInfoARM() {
	    this(Arena.ofAuto());
	}
	
	public VkDataGraphPipelineOpticalFlowDispatchInfoARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDataGraphPipelineOpticalFlowDispatchInfoARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDataGraphPipelineOpticalFlowDispatchInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDataGraphPipelineOpticalFlowDispatchInfoARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkDataGraphPipelineOpticalFlowDispatchInfoARM flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #meanFlowL1NormHint()
    public VkDataGraphPipelineOpticalFlowDispatchInfoARM meanFlowL1NormHint(int meanFlowL1NormHint) {
    	MEAN_FLOW_L1_NORM_HINT_HANDLE.set(segment, 0L, meanFlowL1NormHint);
    	return this;
    }
    
    public int meanFlowL1NormHint() {
    	return (int) MEAN_FLOW_L1_NORM_HINT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDataGraphPipelineOpticalFlowDispatchInfoARM set(VkDataGraphPipelineOpticalFlowDispatchInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDataGraphPipelineOpticalFlowDispatchInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDataGraphPipelineOpticalFlowDispatchInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDataGraphPipelineOpticalFlowDispatchInfoARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelineOpticalFlowDispatchInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDataGraphPipelineOpticalFlowDispatchInfoARM> array(Arena arena, VkDataGraphPipelineOpticalFlowDispatchInfoARM... structs) {
        NativeStructArray<VkDataGraphPipelineOpticalFlowDispatchInfoARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelineOpticalFlowDispatchInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDataGraphPipelineOpticalFlowDispatchInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDataGraphPipelineOpticalFlowDispatchInfoARM(segment)
        );
    }

}