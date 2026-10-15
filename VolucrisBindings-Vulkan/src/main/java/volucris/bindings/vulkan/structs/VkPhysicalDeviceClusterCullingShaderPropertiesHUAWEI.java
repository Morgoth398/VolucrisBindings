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

public final class VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI
		implements Struct<VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAX_WORK_GROUP_COUNT_HANDLE;
	public static final VarHandle MAX_WORK_GROUP_SIZE_HANDLE;
	public static final VarHandle MAX_OUTPUT_CLUSTER_COUNT_HANDLE;
	public static final VarHandle INDIRECT_BUFFER_OFFSET_ALIGNMENT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAX_WORK_GROUP_COUNT_BYTE_OFFSET;
	public static final long MAX_WORK_GROUP_SIZE_BYTE_OFFSET;
	public static final long MAX_OUTPUT_CLUSTER_COUNT_BYTE_OFFSET;
	public static final long INDIRECT_BUFFER_OFFSET_ALIGNMENT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    MemoryLayout.sequenceLayout(3, JAVA_INT).withName("maxWorkGroupCount"),
		    MemoryLayout.sequenceLayout(3, JAVA_INT).withName("maxWorkGroupSize"),
		    JAVA_INT.withName("maxOutputClusterCount"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("indirectBufferOffsetAlignment")
		).withName("VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAX_WORK_GROUP_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxWorkGroupCount"), PathElement.sequenceElement());
		MAX_WORK_GROUP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxWorkGroupSize"), PathElement.sequenceElement());
		MAX_OUTPUT_CLUSTER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxOutputClusterCount"));
		INDIRECT_BUFFER_OFFSET_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indirectBufferOffsetAlignment"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAX_WORK_GROUP_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxWorkGroupCount"));
		MAX_WORK_GROUP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxWorkGroupSize"));
		MAX_OUTPUT_CLUSTER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxOutputClusterCount"));
		INDIRECT_BUFFER_OFFSET_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indirectBufferOffsetAlignment"));
		//@formatter:on
	}

	public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxWorkGroupCount(int)
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxWorkGroupCount(int maxWorkGroupCount, int index0) {
    	MAX_WORK_GROUP_COUNT_HANDLE.set(segment, 0L, index0, maxWorkGroupCount);
    	return this;
    }
    
    public int maxWorkGroupCount(int index0) {
    	return (int) MAX_WORK_GROUP_COUNT_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #maxWorkGroupSize(int)
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxWorkGroupSize(int maxWorkGroupSize, int index0) {
    	MAX_WORK_GROUP_SIZE_HANDLE.set(segment, 0L, index0, maxWorkGroupSize);
    	return this;
    }
    
    public int maxWorkGroupSize(int index0) {
    	return (int) MAX_WORK_GROUP_SIZE_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #maxOutputClusterCount()
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxOutputClusterCount(int maxOutputClusterCount) {
    	MAX_OUTPUT_CLUSTER_COUNT_HANDLE.set(segment, 0L, maxOutputClusterCount);
    	return this;
    }
    
    public int maxOutputClusterCount() {
    	return (int) MAX_OUTPUT_CLUSTER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #indirectBufferOffsetAlignment()
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI indirectBufferOffsetAlignment(long indirectBufferOffsetAlignment) {
    	INDIRECT_BUFFER_OFFSET_ALIGNMENT_HANDLE.set(segment, 0L, indirectBufferOffsetAlignment);
    	return this;
    }
    
    public long indirectBufferOffsetAlignment() {
    	return (long) INDIRECT_BUFFER_OFFSET_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI set(VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI> array(Arena arena, VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI... structs) {
        NativeStructArray<VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(segment)
        );
    }

}