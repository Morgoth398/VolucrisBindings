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

public final class VkPhysicalDeviceLayeredApiPropertiesListKHR
		implements Struct<VkPhysicalDeviceLayeredApiPropertiesListKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle LAYERED_API_COUNT_HANDLE;
	public static final VarHandle P_LAYERED_APIS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long LAYERED_API_COUNT_BYTE_OFFSET;
	public static final long P_LAYERED_APIS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("layeredApiCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pLayeredApis")
		).withName("VkPhysicalDeviceLayeredApiPropertiesListKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		LAYERED_API_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layeredApiCount"));
		P_LAYERED_APIS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLayeredApis"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		LAYERED_API_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layeredApiCount"));
		P_LAYERED_APIS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLayeredApis"));
		//@formatter:on
	}

	public VkPhysicalDeviceLayeredApiPropertiesListKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceLayeredApiPropertiesListKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceLayeredApiPropertiesListKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceLayeredApiPropertiesListKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceLayeredApiPropertiesListKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #layeredApiCount()
    public VkPhysicalDeviceLayeredApiPropertiesListKHR layeredApiCount(int layeredApiCount) {
    	LAYERED_API_COUNT_HANDLE.set(segment, 0L, layeredApiCount);
    	return this;
    }
    
    public int layeredApiCount() {
    	return (int) LAYERED_API_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pLayeredApis()
    public VkPhysicalDeviceLayeredApiPropertiesListKHR pLayeredApis(NativeStructArray<VkPhysicalDeviceLayeredApiPropertiesKHR> pLayeredApis) {
    	P_LAYERED_APIS_HANDLE.set(segment, 0L, pLayeredApis.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkPhysicalDeviceLayeredApiPropertiesKHR> pLayeredApis() {
    	MemorySegment segment = (MemorySegment) P_LAYERED_APIS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkPhysicalDeviceLayeredApiPropertiesKHR.array(segment);
    }
    
    @Override
    public VkPhysicalDeviceLayeredApiPropertiesListKHR set(VkPhysicalDeviceLayeredApiPropertiesListKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceLayeredApiPropertiesListKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceLayeredApiPropertiesListKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceLayeredApiPropertiesListKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceLayeredApiPropertiesListKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceLayeredApiPropertiesListKHR> array(Arena arena, VkPhysicalDeviceLayeredApiPropertiesListKHR... structs) {
        NativeStructArray<VkPhysicalDeviceLayeredApiPropertiesListKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceLayeredApiPropertiesListKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceLayeredApiPropertiesListKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceLayeredApiPropertiesListKHR(segment)
        );
    }

}