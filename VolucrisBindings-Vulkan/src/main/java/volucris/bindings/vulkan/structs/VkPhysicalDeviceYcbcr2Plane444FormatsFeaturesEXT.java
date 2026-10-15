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

public final class VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT
		implements Struct<VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle YCBCR2PLANE444_FORMATS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long YCBCR2PLANE444_FORMATS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("ycbcr2plane444Formats"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		YCBCR2PLANE444_FORMATS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ycbcr2plane444Formats"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		YCBCR2PLANE444_FORMATS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ycbcr2plane444Formats"));
		//@formatter:on
	}

	public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #ycbcr2plane444Formats()
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT ycbcr2plane444Formats(int ycbcr2plane444Formats) {
    	YCBCR2PLANE444_FORMATS_HANDLE.set(segment, 0L, ycbcr2plane444Formats);
    	return this;
    }
    
    public int ycbcr2plane444Formats() {
    	return (int) YCBCR2PLANE444_FORMATS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT set(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT> array(Arena arena, VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(segment)
        );
    }

}