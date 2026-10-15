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

public final class VkFilterCubicImageViewImageFormatPropertiesEXT
		implements Struct<VkFilterCubicImageViewImageFormatPropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FILTER_CUBIC_HANDLE;
	public static final VarHandle FILTER_CUBIC_MINMAX_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FILTER_CUBIC_BYTE_OFFSET;
	public static final long FILTER_CUBIC_MINMAX_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("filterCubic"),
		    JAVA_INT.withName("filterCubicMinmax")
		).withName("VkFilterCubicImageViewImageFormatPropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FILTER_CUBIC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("filterCubic"));
		FILTER_CUBIC_MINMAX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("filterCubicMinmax"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FILTER_CUBIC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("filterCubic"));
		FILTER_CUBIC_MINMAX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("filterCubicMinmax"));
		//@formatter:on
	}

	public VkFilterCubicImageViewImageFormatPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkFilterCubicImageViewImageFormatPropertiesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkFilterCubicImageViewImageFormatPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkFilterCubicImageViewImageFormatPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkFilterCubicImageViewImageFormatPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #filterCubic()
    public VkFilterCubicImageViewImageFormatPropertiesEXT filterCubic(int filterCubic) {
    	FILTER_CUBIC_HANDLE.set(segment, 0L, filterCubic);
    	return this;
    }
    
    public int filterCubic() {
    	return (int) FILTER_CUBIC_HANDLE.get(segment, 0L);
    }
    
    /// @see #filterCubicMinmax()
    public VkFilterCubicImageViewImageFormatPropertiesEXT filterCubicMinmax(int filterCubicMinmax) {
    	FILTER_CUBIC_MINMAX_HANDLE.set(segment, 0L, filterCubicMinmax);
    	return this;
    }
    
    public int filterCubicMinmax() {
    	return (int) FILTER_CUBIC_MINMAX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkFilterCubicImageViewImageFormatPropertiesEXT set(VkFilterCubicImageViewImageFormatPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkFilterCubicImageViewImageFormatPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkFilterCubicImageViewImageFormatPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkFilterCubicImageViewImageFormatPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkFilterCubicImageViewImageFormatPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkFilterCubicImageViewImageFormatPropertiesEXT> array(Arena arena, VkFilterCubicImageViewImageFormatPropertiesEXT... structs) {
        NativeStructArray<VkFilterCubicImageViewImageFormatPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkFilterCubicImageViewImageFormatPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkFilterCubicImageViewImageFormatPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkFilterCubicImageViewImageFormatPropertiesEXT(segment)
        );
    }

}