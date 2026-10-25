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

public final class VkPhysicalDeviceAccelerationStructureFeaturesKHR
		implements Struct<VkPhysicalDeviceAccelerationStructureFeaturesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ACCELERATION_STRUCTURE_HANDLE;
	public static final VarHandle ACCELERATION_STRUCTURE_CAPTURE_REPLAY_HANDLE;
	public static final VarHandle ACCELERATION_STRUCTURE_INDIRECT_BUILD_HANDLE;
	public static final VarHandle ACCELERATION_STRUCTURE_HOST_COMMANDS_HANDLE;
	public static final VarHandle DESCRIPTOR_BINDING_ACCELERATION_STRUCTURE_UPDATE_AFTER_BIND_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ACCELERATION_STRUCTURE_BYTE_OFFSET;
	public static final long ACCELERATION_STRUCTURE_CAPTURE_REPLAY_BYTE_OFFSET;
	public static final long ACCELERATION_STRUCTURE_INDIRECT_BUILD_BYTE_OFFSET;
	public static final long ACCELERATION_STRUCTURE_HOST_COMMANDS_BYTE_OFFSET;
	public static final long DESCRIPTOR_BINDING_ACCELERATION_STRUCTURE_UPDATE_AFTER_BIND_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("accelerationStructure"),
		    JAVA_INT.withName("accelerationStructureCaptureReplay"),
		    JAVA_INT.withName("accelerationStructureIndirectBuild"),
		    JAVA_INT.withName("accelerationStructureHostCommands"),
		    JAVA_INT.withName("descriptorBindingAccelerationStructureUpdateAfterBind"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceAccelerationStructureFeaturesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ACCELERATION_STRUCTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("accelerationStructure"));
		ACCELERATION_STRUCTURE_CAPTURE_REPLAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("accelerationStructureCaptureReplay"));
		ACCELERATION_STRUCTURE_INDIRECT_BUILD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("accelerationStructureIndirectBuild"));
		ACCELERATION_STRUCTURE_HOST_COMMANDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("accelerationStructureHostCommands"));
		DESCRIPTOR_BINDING_ACCELERATION_STRUCTURE_UPDATE_AFTER_BIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingAccelerationStructureUpdateAfterBind"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ACCELERATION_STRUCTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
		ACCELERATION_STRUCTURE_CAPTURE_REPLAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureCaptureReplay"));
		ACCELERATION_STRUCTURE_INDIRECT_BUILD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureIndirectBuild"));
		ACCELERATION_STRUCTURE_HOST_COMMANDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureHostCommands"));
		DESCRIPTOR_BINDING_ACCELERATION_STRUCTURE_UPDATE_AFTER_BIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingAccelerationStructureUpdateAfterBind"));
		//@formatter:on
	}

	public VkPhysicalDeviceAccelerationStructureFeaturesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceAccelerationStructureFeaturesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceAccelerationStructureFeaturesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #accelerationStructure()
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructure(int accelerationStructure) {
    	ACCELERATION_STRUCTURE_HANDLE.set(segment, 0L, accelerationStructure);
    	return this;
    }
    
    public int accelerationStructure() {
    	return (int) ACCELERATION_STRUCTURE_HANDLE.get(segment, 0L);
    }
    
    /// @see #accelerationStructureCaptureReplay()
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureCaptureReplay(int accelerationStructureCaptureReplay) {
    	ACCELERATION_STRUCTURE_CAPTURE_REPLAY_HANDLE.set(segment, 0L, accelerationStructureCaptureReplay);
    	return this;
    }
    
    public int accelerationStructureCaptureReplay() {
    	return (int) ACCELERATION_STRUCTURE_CAPTURE_REPLAY_HANDLE.get(segment, 0L);
    }
    
    /// @see #accelerationStructureIndirectBuild()
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureIndirectBuild(int accelerationStructureIndirectBuild) {
    	ACCELERATION_STRUCTURE_INDIRECT_BUILD_HANDLE.set(segment, 0L, accelerationStructureIndirectBuild);
    	return this;
    }
    
    public int accelerationStructureIndirectBuild() {
    	return (int) ACCELERATION_STRUCTURE_INDIRECT_BUILD_HANDLE.get(segment, 0L);
    }
    
    /// @see #accelerationStructureHostCommands()
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureHostCommands(int accelerationStructureHostCommands) {
    	ACCELERATION_STRUCTURE_HOST_COMMANDS_HANDLE.set(segment, 0L, accelerationStructureHostCommands);
    	return this;
    }
    
    public int accelerationStructureHostCommands() {
    	return (int) ACCELERATION_STRUCTURE_HOST_COMMANDS_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingAccelerationStructureUpdateAfterBind()
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR descriptorBindingAccelerationStructureUpdateAfterBind(int descriptorBindingAccelerationStructureUpdateAfterBind) {
    	DESCRIPTOR_BINDING_ACCELERATION_STRUCTURE_UPDATE_AFTER_BIND_HANDLE.set(segment, 0L, descriptorBindingAccelerationStructureUpdateAfterBind);
    	return this;
    }
    
    public int descriptorBindingAccelerationStructureUpdateAfterBind() {
    	return (int) DESCRIPTOR_BINDING_ACCELERATION_STRUCTURE_UPDATE_AFTER_BIND_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR set(VkPhysicalDeviceAccelerationStructureFeaturesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceAccelerationStructureFeaturesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceAccelerationStructureFeaturesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceAccelerationStructureFeaturesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceAccelerationStructureFeaturesKHR> array(SegmentAllocator allocator, VkPhysicalDeviceAccelerationStructureFeaturesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceAccelerationStructureFeaturesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceAccelerationStructureFeaturesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceAccelerationStructureFeaturesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceAccelerationStructureFeaturesKHR(segment)
        );
    }

}