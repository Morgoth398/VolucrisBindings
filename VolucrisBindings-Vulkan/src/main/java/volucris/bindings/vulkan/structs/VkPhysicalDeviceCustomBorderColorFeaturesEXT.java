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

public final class VkPhysicalDeviceCustomBorderColorFeaturesEXT
		implements Struct<VkPhysicalDeviceCustomBorderColorFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle CUSTOM_BORDER_COLORS_HANDLE;
	public static final VarHandle CUSTOM_BORDER_COLOR_WITHOUT_FORMAT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long CUSTOM_BORDER_COLORS_BYTE_OFFSET;
	public static final long CUSTOM_BORDER_COLOR_WITHOUT_FORMAT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("customBorderColors"),
		    JAVA_INT.withName("customBorderColorWithoutFormat")
		).withName("VkPhysicalDeviceCustomBorderColorFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		CUSTOM_BORDER_COLORS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("customBorderColors"));
		CUSTOM_BORDER_COLOR_WITHOUT_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("customBorderColorWithoutFormat"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		CUSTOM_BORDER_COLORS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("customBorderColors"));
		CUSTOM_BORDER_COLOR_WITHOUT_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("customBorderColorWithoutFormat"));
		//@formatter:on
	}

	public VkPhysicalDeviceCustomBorderColorFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceCustomBorderColorFeaturesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceCustomBorderColorFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #customBorderColors()
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColors(int customBorderColors) {
    	CUSTOM_BORDER_COLORS_HANDLE.set(segment, 0L, customBorderColors);
    	return this;
    }
    
    public int customBorderColors() {
    	return (int) CUSTOM_BORDER_COLORS_HANDLE.get(segment, 0L);
    }
    
    /// @see #customBorderColorWithoutFormat()
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColorWithoutFormat(int customBorderColorWithoutFormat) {
    	CUSTOM_BORDER_COLOR_WITHOUT_FORMAT_HANDLE.set(segment, 0L, customBorderColorWithoutFormat);
    	return this;
    }
    
    public int customBorderColorWithoutFormat() {
    	return (int) CUSTOM_BORDER_COLOR_WITHOUT_FORMAT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT set(VkPhysicalDeviceCustomBorderColorFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceCustomBorderColorFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceCustomBorderColorFeaturesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceCustomBorderColorFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceCustomBorderColorFeaturesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceCustomBorderColorFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceCustomBorderColorFeaturesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceCustomBorderColorFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceCustomBorderColorFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceCustomBorderColorFeaturesEXT(segment)
        );
    }

}