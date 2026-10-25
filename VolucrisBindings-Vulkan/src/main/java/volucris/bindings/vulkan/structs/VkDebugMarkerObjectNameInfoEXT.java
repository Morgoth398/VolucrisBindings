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

public final class VkDebugMarkerObjectNameInfoEXT
		implements Struct<VkDebugMarkerObjectNameInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle OBJECT_TYPE_HANDLE;
	public static final VarHandle OBJECT_HANDLE;
	public static final VarHandle P_OBJECT_NAME_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long OBJECT_TYPE_BYTE_OFFSET;
	public static final long OBJECT_BYTE_OFFSET;
	public static final long P_OBJECT_NAME_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("objectType"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("object"),
		    UNBOUNDED_ADDRESS.withName("pObjectName")
		).withName("VkDebugMarkerObjectNameInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		OBJECT_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("objectType"));
		OBJECT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("object"));
		P_OBJECT_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pObjectName"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		OBJECT_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("objectType"));
		OBJECT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("object"));
		P_OBJECT_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pObjectName"));
		//@formatter:on
	}

	public VkDebugMarkerObjectNameInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDebugMarkerObjectNameInfoEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDebugMarkerObjectNameInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDebugMarkerObjectNameInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDebugMarkerObjectNameInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #objectType()
    public VkDebugMarkerObjectNameInfoEXT objectType(int objectType) {
    	OBJECT_TYPE_HANDLE.set(segment, 0L, objectType);
    	return this;
    }
    
    public int objectType() {
    	return (int) OBJECT_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #object()
    public VkDebugMarkerObjectNameInfoEXT object(long object) {
    	OBJECT_HANDLE.set(segment, 0L, object);
    	return this;
    }
    
    public long object() {
    	return (long) OBJECT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pObjectName()
    public VkDebugMarkerObjectNameInfoEXT pObjectName(SegmentAllocator allocator, String pObjectName) {
    	P_OBJECT_NAME_HANDLE.set(segment, 0L, allocator.allocateFrom(pObjectName));
    	return this;
    }
    
    public @Nullable String pObjectName() {
    	MemorySegment segment = (MemorySegment) P_OBJECT_NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    @Override
    public VkDebugMarkerObjectNameInfoEXT set(VkDebugMarkerObjectNameInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDebugMarkerObjectNameInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDebugMarkerObjectNameInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDebugMarkerObjectNameInfoEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDebugMarkerObjectNameInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDebugMarkerObjectNameInfoEXT> array(SegmentAllocator allocator, VkDebugMarkerObjectNameInfoEXT... structs) {
        NativeStructArray<VkDebugMarkerObjectNameInfoEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDebugMarkerObjectNameInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDebugMarkerObjectNameInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDebugMarkerObjectNameInfoEXT(segment)
        );
    }

}