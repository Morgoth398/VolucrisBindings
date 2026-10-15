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

public final class VkDataGraphOpticalFlowImageFormatPropertiesARM
		implements Struct<VkDataGraphOpticalFlowImageFormatPropertiesARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FORMAT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FORMAT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("format"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDataGraphOpticalFlowImageFormatPropertiesARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		//@formatter:on
	}

	public VkDataGraphOpticalFlowImageFormatPropertiesARM() {
	    this(Arena.ofAuto());
	}
	
	public VkDataGraphOpticalFlowImageFormatPropertiesARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDataGraphOpticalFlowImageFormatPropertiesARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDataGraphOpticalFlowImageFormatPropertiesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDataGraphOpticalFlowImageFormatPropertiesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #format()
    public VkDataGraphOpticalFlowImageFormatPropertiesARM format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDataGraphOpticalFlowImageFormatPropertiesARM set(VkDataGraphOpticalFlowImageFormatPropertiesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDataGraphOpticalFlowImageFormatPropertiesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDataGraphOpticalFlowImageFormatPropertiesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDataGraphOpticalFlowImageFormatPropertiesARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphOpticalFlowImageFormatPropertiesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDataGraphOpticalFlowImageFormatPropertiesARM> array(Arena arena, VkDataGraphOpticalFlowImageFormatPropertiesARM... structs) {
        NativeStructArray<VkDataGraphOpticalFlowImageFormatPropertiesARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphOpticalFlowImageFormatPropertiesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDataGraphOpticalFlowImageFormatPropertiesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDataGraphOpticalFlowImageFormatPropertiesARM(segment)
        );
    }

}