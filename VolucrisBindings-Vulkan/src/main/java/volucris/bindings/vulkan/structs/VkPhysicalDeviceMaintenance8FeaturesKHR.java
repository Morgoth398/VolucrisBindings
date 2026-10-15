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

public final class VkPhysicalDeviceMaintenance8FeaturesKHR
		implements Struct<VkPhysicalDeviceMaintenance8FeaturesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAINTENANCE8_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAINTENANCE8_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("maintenance8"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceMaintenance8FeaturesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAINTENANCE8_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maintenance8"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAINTENANCE8_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maintenance8"));
		//@formatter:on
	}

	public VkPhysicalDeviceMaintenance8FeaturesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceMaintenance8FeaturesKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceMaintenance8FeaturesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceMaintenance8FeaturesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMaintenance8FeaturesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maintenance8()
    public VkPhysicalDeviceMaintenance8FeaturesKHR maintenance8(int maintenance8) {
    	MAINTENANCE8_HANDLE.set(segment, 0L, maintenance8);
    	return this;
    }
    
    public int maintenance8() {
    	return (int) MAINTENANCE8_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance8FeaturesKHR set(VkPhysicalDeviceMaintenance8FeaturesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance8FeaturesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMaintenance8FeaturesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance8FeaturesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance8FeaturesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance8FeaturesKHR> array(Arena arena, VkPhysicalDeviceMaintenance8FeaturesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceMaintenance8FeaturesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance8FeaturesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance8FeaturesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance8FeaturesKHR(segment)
        );
    }

}