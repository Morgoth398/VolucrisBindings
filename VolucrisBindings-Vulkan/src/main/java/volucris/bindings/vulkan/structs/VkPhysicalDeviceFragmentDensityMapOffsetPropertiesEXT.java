/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT
		implements Struct<VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FRAGMENT_DENSITY_OFFSET_GRANULARITY_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent2D fragmentDensityOffsetGranularity;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkExtent2D.LAYOUT.withName("fragmentDensityOffsetGranularity")
		).withName("VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FRAGMENT_DENSITY_OFFSET_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityOffsetGranularity"));
		//@formatter:on
	}

	public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	    fragmentDensityOffsetGranularity = new VkExtent2D(segment.asSlice(FRAGMENT_DENSITY_OFFSET_GRANULARITY_BYTE_OFFSET, VkExtent2D.LAYOUT));
	}

    /// @see #sType()
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #fragmentDensityOffsetGranularity()
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT fragmentDensityOffsetGranularity(Consumer<VkExtent2D> consumer) {
    	consumer.accept(fragmentDensityOffsetGranularity);
    	return this;
    }
    
    /// @see #fragmentDensityOffsetGranularity()
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT fragmentDensityOffsetGranularity(VkExtent2D other) {
    	fragmentDensityOffsetGranularity.set(other);
    	return this;
    }
    
    public VkExtent2D fragmentDensityOffsetGranularity() {
    	return fragmentDensityOffsetGranularity;
    }
    
    @Override
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT set(VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT> array(Arena arena, VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT(segment)
        );
    }

}