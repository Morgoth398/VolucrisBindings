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

public final class VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT
		implements Struct<VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PAGEABLE_DEVICE_LOCAL_MEMORY_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PAGEABLE_DEVICE_LOCAL_MEMORY_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("pageableDeviceLocalMemory"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PAGEABLE_DEVICE_LOCAL_MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pageableDeviceLocalMemory"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PAGEABLE_DEVICE_LOCAL_MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pageableDeviceLocalMemory"));
		//@formatter:on
	}

	public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pageableDeviceLocalMemory()
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT pageableDeviceLocalMemory(int pageableDeviceLocalMemory) {
    	PAGEABLE_DEVICE_LOCAL_MEMORY_HANDLE.set(segment, 0L, pageableDeviceLocalMemory);
    	return this;
    }
    
    public int pageableDeviceLocalMemory() {
    	return (int) PAGEABLE_DEVICE_LOCAL_MEMORY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT set(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT> array(Arena arena, VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(segment)
        );
    }

}