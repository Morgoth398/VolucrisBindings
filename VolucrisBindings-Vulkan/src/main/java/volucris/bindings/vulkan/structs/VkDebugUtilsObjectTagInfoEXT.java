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

public final class VkDebugUtilsObjectTagInfoEXT
		implements Struct<VkDebugUtilsObjectTagInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle OBJECT_TYPE_HANDLE;
	public static final VarHandle OBJECT_HANDLE_HANDLE;
	public static final VarHandle TAG_NAME_HANDLE;
	public static final VarHandle TAG_SIZE_HANDLE;
	public static final VarHandle P_TAG_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long OBJECT_TYPE_BYTE_OFFSET;
	public static final long OBJECT_HANDLE_BYTE_OFFSET;
	public static final long TAG_NAME_BYTE_OFFSET;
	public static final long TAG_SIZE_BYTE_OFFSET;
	public static final long P_TAG_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("objectType"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("objectHandle"),
		    JAVA_LONG.withName("tagName"),
		    JAVA_LONG.withName("tagSize"),
		    UNBOUNDED_ADDRESS.withName("pTag")
		).withName("VkDebugUtilsObjectTagInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		OBJECT_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("objectType"));
		OBJECT_HANDLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("objectHandle"));
		TAG_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tagName"));
		TAG_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tagSize"));
		P_TAG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTag"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		OBJECT_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("objectType"));
		OBJECT_HANDLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("objectHandle"));
		TAG_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tagName"));
		TAG_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tagSize"));
		P_TAG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTag"));
		//@formatter:on
	}

	public VkDebugUtilsObjectTagInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDebugUtilsObjectTagInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDebugUtilsObjectTagInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDebugUtilsObjectTagInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDebugUtilsObjectTagInfoEXT pNext(MemorySegment pNext) {
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
    public VkDebugUtilsObjectTagInfoEXT objectType(int objectType) {
    	OBJECT_TYPE_HANDLE.set(segment, 0L, objectType);
    	return this;
    }
    
    public int objectType() {
    	return (int) OBJECT_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #objectHandle()
    public VkDebugUtilsObjectTagInfoEXT objectHandle(long objectHandle) {
    	OBJECT_HANDLE_HANDLE.set(segment, 0L, objectHandle);
    	return this;
    }
    
    public long objectHandle() {
    	return (long) OBJECT_HANDLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #tagName()
    public VkDebugUtilsObjectTagInfoEXT tagName(long tagName) {
    	TAG_NAME_HANDLE.set(segment, 0L, tagName);
    	return this;
    }
    
    public long tagName() {
    	return (long) TAG_NAME_HANDLE.get(segment, 0L);
    }
    
    /// @see #tagSize()
    public VkDebugUtilsObjectTagInfoEXT tagSize(long tagSize) {
    	TAG_SIZE_HANDLE.set(segment, 0L, tagSize);
    	return this;
    }
    
    public long tagSize() {
    	return (long) TAG_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pTag()
    public VkDebugUtilsObjectTagInfoEXT pTag(MemorySegment pTag) {
    	P_TAG_HANDLE.set(segment, 0L, pTag);
    	return this;
    }
    
    public @Nullable MemorySegment pTag() {
    	MemorySegment segment = (MemorySegment) P_TAG_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VkDebugUtilsObjectTagInfoEXT set(VkDebugUtilsObjectTagInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDebugUtilsObjectTagInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDebugUtilsObjectTagInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDebugUtilsObjectTagInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDebugUtilsObjectTagInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDebugUtilsObjectTagInfoEXT> array(Arena arena, VkDebugUtilsObjectTagInfoEXT... structs) {
        NativeStructArray<VkDebugUtilsObjectTagInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDebugUtilsObjectTagInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDebugUtilsObjectTagInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDebugUtilsObjectTagInfoEXT(segment)
        );
    }

}