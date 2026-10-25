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

public final class VkDisplayModeStereoPropertiesNV
		implements Struct<VkDisplayModeStereoPropertiesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle HDMI3_DSUPPORTED_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long HDMI3_DSUPPORTED_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("hdmi3DSupported"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDisplayModeStereoPropertiesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		HDMI3_DSUPPORTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hdmi3DSupported"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		HDMI3_DSUPPORTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hdmi3DSupported"));
		//@formatter:on
	}

	public VkDisplayModeStereoPropertiesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkDisplayModeStereoPropertiesNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDisplayModeStereoPropertiesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDisplayModeStereoPropertiesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDisplayModeStereoPropertiesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #hdmi3DSupported()
    public VkDisplayModeStereoPropertiesNV hdmi3DSupported(int hdmi3DSupported) {
    	HDMI3_DSUPPORTED_HANDLE.set(segment, 0L, hdmi3DSupported);
    	return this;
    }
    
    public int hdmi3DSupported() {
    	return (int) HDMI3_DSUPPORTED_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDisplayModeStereoPropertiesNV set(VkDisplayModeStereoPropertiesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkDisplayModeStereoPropertiesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDisplayModeStereoPropertiesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDisplayModeStereoPropertiesNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDisplayModeStereoPropertiesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDisplayModeStereoPropertiesNV> array(SegmentAllocator allocator, VkDisplayModeStereoPropertiesNV... structs) {
        NativeStructArray<VkDisplayModeStereoPropertiesNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDisplayModeStereoPropertiesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDisplayModeStereoPropertiesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDisplayModeStereoPropertiesNV(segment)
        );
    }

}