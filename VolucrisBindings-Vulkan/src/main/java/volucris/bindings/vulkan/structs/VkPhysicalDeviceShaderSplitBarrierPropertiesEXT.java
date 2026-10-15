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

public final class VkPhysicalDeviceShaderSplitBarrierPropertiesEXT
		implements Struct<VkPhysicalDeviceShaderSplitBarrierPropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SPLIT_BARRIER_RESERVED_SHARED_MEMORY_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SPLIT_BARRIER_RESERVED_SHARED_MEMORY_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("splitBarrierReservedSharedMemory"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceShaderSplitBarrierPropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SPLIT_BARRIER_RESERVED_SHARED_MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("splitBarrierReservedSharedMemory"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SPLIT_BARRIER_RESERVED_SHARED_MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("splitBarrierReservedSharedMemory"));
		//@formatter:on
	}

	public VkPhysicalDeviceShaderSplitBarrierPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceShaderSplitBarrierPropertiesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceShaderSplitBarrierPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceShaderSplitBarrierPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderSplitBarrierPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #splitBarrierReservedSharedMemory()
    public VkPhysicalDeviceShaderSplitBarrierPropertiesEXT splitBarrierReservedSharedMemory(int splitBarrierReservedSharedMemory) {
    	SPLIT_BARRIER_RESERVED_SHARED_MEMORY_HANDLE.set(segment, 0L, splitBarrierReservedSharedMemory);
    	return this;
    }
    
    public int splitBarrierReservedSharedMemory() {
    	return (int) SPLIT_BARRIER_RESERVED_SHARED_MEMORY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderSplitBarrierPropertiesEXT set(VkPhysicalDeviceShaderSplitBarrierPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderSplitBarrierPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderSplitBarrierPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderSplitBarrierPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderSplitBarrierPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderSplitBarrierPropertiesEXT> array(Arena arena, VkPhysicalDeviceShaderSplitBarrierPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceShaderSplitBarrierPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderSplitBarrierPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderSplitBarrierPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderSplitBarrierPropertiesEXT(segment)
        );
    }

}