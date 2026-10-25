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

public final class VkDebugUtilsLabelEXT
		implements Struct<VkDebugUtilsLabelEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_LABEL_NAME_HANDLE;
	public static final VarHandle COLOR_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_LABEL_NAME_BYTE_OFFSET;
	public static final long COLOR_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pLabelName"),
		    MemoryLayout.sequenceLayout(4, JAVA_FLOAT).withName("color")
		).withName("VkDebugUtilsLabelEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_LABEL_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLabelName"));
		COLOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("color"), PathElement.sequenceElement());
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_LABEL_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLabelName"));
		COLOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("color"));
		//@formatter:on
	}

	public VkDebugUtilsLabelEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDebugUtilsLabelEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDebugUtilsLabelEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDebugUtilsLabelEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDebugUtilsLabelEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pLabelName()
    public VkDebugUtilsLabelEXT pLabelName(SegmentAllocator allocator, String pLabelName) {
    	P_LABEL_NAME_HANDLE.set(segment, 0L, allocator.allocateFrom(pLabelName));
    	return this;
    }
    
    public @Nullable String pLabelName() {
    	MemorySegment segment = (MemorySegment) P_LABEL_NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// @see #color(int)
    public VkDebugUtilsLabelEXT color(float color, int index0) {
    	COLOR_HANDLE.set(segment, 0L, index0, color);
    	return this;
    }
    
    public float color(int index0) {
    	return (float) COLOR_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public VkDebugUtilsLabelEXT set(VkDebugUtilsLabelEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDebugUtilsLabelEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDebugUtilsLabelEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDebugUtilsLabelEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDebugUtilsLabelEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDebugUtilsLabelEXT> array(SegmentAllocator allocator, VkDebugUtilsLabelEXT... structs) {
        NativeStructArray<VkDebugUtilsLabelEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDebugUtilsLabelEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDebugUtilsLabelEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDebugUtilsLabelEXT(segment)
        );
    }

}