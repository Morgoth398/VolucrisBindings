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

public final class VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM
		implements Struct<VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle QUEUE_FAMILY_INDEX_HANDLE;
	public static final VarHandle ENGINE_TYPE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long QUEUE_FAMILY_INDEX_BYTE_OFFSET;
	public static final long ENGINE_TYPE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("queueFamilyIndex"),
		    JAVA_INT.withName("engineType")
		).withName("VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		QUEUE_FAMILY_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queueFamilyIndex"));
		ENGINE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("engineType"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		QUEUE_FAMILY_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndex"));
		ENGINE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("engineType"));
		//@formatter:on
	}

	public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #queueFamilyIndex()
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM queueFamilyIndex(int queueFamilyIndex) {
    	QUEUE_FAMILY_INDEX_HANDLE.set(segment, 0L, queueFamilyIndex);
    	return this;
    }
    
    public int queueFamilyIndex() {
    	return (int) QUEUE_FAMILY_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #engineType()
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM engineType(int engineType) {
    	ENGINE_TYPE_HANDLE.set(segment, 0L, engineType);
    	return this;
    }
    
    public int engineType() {
    	return (int) ENGINE_TYPE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM set(VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM> array(Arena arena, VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM... structs) {
        NativeStructArray<VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(segment)
        );
    }

}