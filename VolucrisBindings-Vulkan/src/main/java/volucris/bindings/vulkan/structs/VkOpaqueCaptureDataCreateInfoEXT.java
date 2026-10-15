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

public final class VkOpaqueCaptureDataCreateInfoEXT
		implements Struct<VkOpaqueCaptureDataCreateInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_DATA_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pData")
		).withName("VkOpaqueCaptureDataCreateInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pData"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pData"));
		//@formatter:on
	}

	public VkOpaqueCaptureDataCreateInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkOpaqueCaptureDataCreateInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkOpaqueCaptureDataCreateInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkOpaqueCaptureDataCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkOpaqueCaptureDataCreateInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pData()
    public VkOpaqueCaptureDataCreateInfoEXT pData(VkHostAddressRangeConstEXT pData) {
    	P_DATA_HANDLE.set(segment, 0L, pData.memorySegment());
    	return this;
    }
    
    public @Nullable VkHostAddressRangeConstEXT pData() {
    	MemorySegment segment = (MemorySegment) P_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkHostAddressRangeConstEXT(segment);
    }
    
    @Override
    public VkOpaqueCaptureDataCreateInfoEXT set(VkOpaqueCaptureDataCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkOpaqueCaptureDataCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkOpaqueCaptureDataCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkOpaqueCaptureDataCreateInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkOpaqueCaptureDataCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkOpaqueCaptureDataCreateInfoEXT> array(Arena arena, VkOpaqueCaptureDataCreateInfoEXT... structs) {
        NativeStructArray<VkOpaqueCaptureDataCreateInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkOpaqueCaptureDataCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkOpaqueCaptureDataCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkOpaqueCaptureDataCreateInfoEXT(segment)
        );
    }

}