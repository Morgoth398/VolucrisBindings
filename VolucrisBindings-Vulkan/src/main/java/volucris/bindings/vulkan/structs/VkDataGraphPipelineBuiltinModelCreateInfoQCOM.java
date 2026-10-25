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

public final class VkDataGraphPipelineBuiltinModelCreateInfoQCOM
		implements Struct<VkDataGraphPipelineBuiltinModelCreateInfoQCOM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_OPERATION_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_OPERATION_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pOperation")
		).withName("VkDataGraphPipelineBuiltinModelCreateInfoQCOM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_OPERATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pOperation"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_OPERATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pOperation"));
		//@formatter:on
	}

	public VkDataGraphPipelineBuiltinModelCreateInfoQCOM() {
	    this(Arena.ofAuto());
	}
	
	public VkDataGraphPipelineBuiltinModelCreateInfoQCOM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDataGraphPipelineBuiltinModelCreateInfoQCOM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pOperation()
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM pOperation(VkPhysicalDeviceDataGraphOperationSupportARM pOperation) {
    	P_OPERATION_HANDLE.set(segment, 0L, pOperation.memorySegment());
    	return this;
    }
    
    public @Nullable VkPhysicalDeviceDataGraphOperationSupportARM pOperation() {
    	MemorySegment segment = (MemorySegment) P_OPERATION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPhysicalDeviceDataGraphOperationSupportARM(segment);
    }
    
    @Override
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM set(VkDataGraphPipelineBuiltinModelCreateInfoQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDataGraphPipelineBuiltinModelCreateInfoQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDataGraphPipelineBuiltinModelCreateInfoQCOM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDataGraphPipelineBuiltinModelCreateInfoQCOM> array(SegmentAllocator allocator, VkDataGraphPipelineBuiltinModelCreateInfoQCOM... structs) {
        NativeStructArray<VkDataGraphPipelineBuiltinModelCreateInfoQCOM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDataGraphPipelineBuiltinModelCreateInfoQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(segment)
        );
    }

}