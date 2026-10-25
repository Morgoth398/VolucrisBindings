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

public final class VkPhysicalDeviceDataGraphFeaturesARM
		implements Struct<VkPhysicalDeviceDataGraphFeaturesARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DATA_GRAPH_HANDLE;
	public static final VarHandle DATA_GRAPH_UPDATE_AFTER_BIND_HANDLE;
	public static final VarHandle DATA_GRAPH_SPECIALIZATION_CONSTANTS_HANDLE;
	public static final VarHandle DATA_GRAPH_DESCRIPTOR_BUFFER_HANDLE;
	public static final VarHandle DATA_GRAPH_SHADER_MODULE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DATA_GRAPH_BYTE_OFFSET;
	public static final long DATA_GRAPH_UPDATE_AFTER_BIND_BYTE_OFFSET;
	public static final long DATA_GRAPH_SPECIALIZATION_CONSTANTS_BYTE_OFFSET;
	public static final long DATA_GRAPH_DESCRIPTOR_BUFFER_BYTE_OFFSET;
	public static final long DATA_GRAPH_SHADER_MODULE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("dataGraph"),
		    JAVA_INT.withName("dataGraphUpdateAfterBind"),
		    JAVA_INT.withName("dataGraphSpecializationConstants"),
		    JAVA_INT.withName("dataGraphDescriptorBuffer"),
		    JAVA_INT.withName("dataGraphShaderModule"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceDataGraphFeaturesARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DATA_GRAPH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dataGraph"));
		DATA_GRAPH_UPDATE_AFTER_BIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dataGraphUpdateAfterBind"));
		DATA_GRAPH_SPECIALIZATION_CONSTANTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dataGraphSpecializationConstants"));
		DATA_GRAPH_DESCRIPTOR_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dataGraphDescriptorBuffer"));
		DATA_GRAPH_SHADER_MODULE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dataGraphShaderModule"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DATA_GRAPH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dataGraph"));
		DATA_GRAPH_UPDATE_AFTER_BIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dataGraphUpdateAfterBind"));
		DATA_GRAPH_SPECIALIZATION_CONSTANTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dataGraphSpecializationConstants"));
		DATA_GRAPH_DESCRIPTOR_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dataGraphDescriptorBuffer"));
		DATA_GRAPH_SHADER_MODULE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dataGraphShaderModule"));
		//@formatter:on
	}

	public VkPhysicalDeviceDataGraphFeaturesARM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceDataGraphFeaturesARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceDataGraphFeaturesARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceDataGraphFeaturesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDataGraphFeaturesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #dataGraph()
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraph(int dataGraph) {
    	DATA_GRAPH_HANDLE.set(segment, 0L, dataGraph);
    	return this;
    }
    
    public int dataGraph() {
    	return (int) DATA_GRAPH_HANDLE.get(segment, 0L);
    }
    
    /// @see #dataGraphUpdateAfterBind()
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphUpdateAfterBind(int dataGraphUpdateAfterBind) {
    	DATA_GRAPH_UPDATE_AFTER_BIND_HANDLE.set(segment, 0L, dataGraphUpdateAfterBind);
    	return this;
    }
    
    public int dataGraphUpdateAfterBind() {
    	return (int) DATA_GRAPH_UPDATE_AFTER_BIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #dataGraphSpecializationConstants()
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphSpecializationConstants(int dataGraphSpecializationConstants) {
    	DATA_GRAPH_SPECIALIZATION_CONSTANTS_HANDLE.set(segment, 0L, dataGraphSpecializationConstants);
    	return this;
    }
    
    public int dataGraphSpecializationConstants() {
    	return (int) DATA_GRAPH_SPECIALIZATION_CONSTANTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #dataGraphDescriptorBuffer()
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphDescriptorBuffer(int dataGraphDescriptorBuffer) {
    	DATA_GRAPH_DESCRIPTOR_BUFFER_HANDLE.set(segment, 0L, dataGraphDescriptorBuffer);
    	return this;
    }
    
    public int dataGraphDescriptorBuffer() {
    	return (int) DATA_GRAPH_DESCRIPTOR_BUFFER_HANDLE.get(segment, 0L);
    }
    
    /// @see #dataGraphShaderModule()
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphShaderModule(int dataGraphShaderModule) {
    	DATA_GRAPH_SHADER_MODULE_HANDLE.set(segment, 0L, dataGraphShaderModule);
    	return this;
    }
    
    public int dataGraphShaderModule() {
    	return (int) DATA_GRAPH_SHADER_MODULE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDataGraphFeaturesARM set(VkPhysicalDeviceDataGraphFeaturesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDataGraphFeaturesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDataGraphFeaturesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDataGraphFeaturesARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceDataGraphFeaturesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDataGraphFeaturesARM> array(SegmentAllocator allocator, VkPhysicalDeviceDataGraphFeaturesARM... structs) {
        NativeStructArray<VkPhysicalDeviceDataGraphFeaturesARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceDataGraphFeaturesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDataGraphFeaturesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDataGraphFeaturesARM(segment)
        );
    }

}