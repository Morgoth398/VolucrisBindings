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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPipelineDynamicStateCreateInfo
		implements Struct<VkPipelineDynamicStateCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle DYNAMIC_STATE_COUNT_HANDLE;
	public static final VarHandle P_DYNAMIC_STATES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long DYNAMIC_STATE_COUNT_BYTE_OFFSET;
	public static final long P_DYNAMIC_STATES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("dynamicStateCount"),
		    UNBOUNDED_ADDRESS.withName("pDynamicStates")
		).withName("VkPipelineDynamicStateCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		DYNAMIC_STATE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dynamicStateCount"));
		P_DYNAMIC_STATES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDynamicStates"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		DYNAMIC_STATE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dynamicStateCount"));
		P_DYNAMIC_STATES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDynamicStates"));
		//@formatter:on
	}

	public VkPipelineDynamicStateCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineDynamicStateCreateInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPipelineDynamicStateCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineDynamicStateCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineDynamicStateCreateInfo pNext(MemorySegment pNext) {
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
    public VkPipelineDynamicStateCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #dynamicStateCount()
    public VkPipelineDynamicStateCreateInfo dynamicStateCount(int dynamicStateCount) {
    	DYNAMIC_STATE_COUNT_HANDLE.set(segment, 0L, dynamicStateCount);
    	return this;
    }
    
    public int dynamicStateCount() {
    	return (int) DYNAMIC_STATE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDynamicStates()
    public VkPipelineDynamicStateCreateInfo pDynamicStates(NativeIntArray pDynamicStates) {
    	P_DYNAMIC_STATES_HANDLE.set(segment, 0L, pDynamicStates.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pDynamicStates() {
    	MemorySegment segment = (MemorySegment) P_DYNAMIC_STATES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkPipelineDynamicStateCreateInfo set(VkPipelineDynamicStateCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineDynamicStateCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineDynamicStateCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineDynamicStateCreateInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineDynamicStateCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineDynamicStateCreateInfo> array(SegmentAllocator allocator, VkPipelineDynamicStateCreateInfo... structs) {
        NativeStructArray<VkPipelineDynamicStateCreateInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineDynamicStateCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineDynamicStateCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineDynamicStateCreateInfo(segment)
        );
    }

}