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

public final class VkDeviceQueueInfo2
		implements Struct<VkDeviceQueueInfo2> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle QUEUE_FAMILY_INDEX_HANDLE;
	public static final VarHandle QUEUE_INDEX_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long QUEUE_FAMILY_INDEX_BYTE_OFFSET;
	public static final long QUEUE_INDEX_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("queueFamilyIndex"),
		    JAVA_INT.withName("queueIndex"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDeviceQueueInfo2").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		QUEUE_FAMILY_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queueFamilyIndex"));
		QUEUE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queueIndex"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		QUEUE_FAMILY_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndex"));
		QUEUE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queueIndex"));
		//@formatter:on
	}

	public VkDeviceQueueInfo2() {
	    this(Arena.ofAuto());
	}
	
	public VkDeviceQueueInfo2(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDeviceQueueInfo2(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDeviceQueueInfo2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceQueueInfo2 pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkDeviceQueueInfo2 flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #queueFamilyIndex()
    public VkDeviceQueueInfo2 queueFamilyIndex(int queueFamilyIndex) {
    	QUEUE_FAMILY_INDEX_HANDLE.set(segment, 0L, queueFamilyIndex);
    	return this;
    }
    
    public int queueFamilyIndex() {
    	return (int) QUEUE_FAMILY_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #queueIndex()
    public VkDeviceQueueInfo2 queueIndex(int queueIndex) {
    	QUEUE_INDEX_HANDLE.set(segment, 0L, queueIndex);
    	return this;
    }
    
    public int queueIndex() {
    	return (int) QUEUE_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDeviceQueueInfo2 set(VkDeviceQueueInfo2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceQueueInfo2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceQueueInfo2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceQueueInfo2> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceQueueInfo2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceQueueInfo2> array(Arena arena, VkDeviceQueueInfo2... structs) {
        NativeStructArray<VkDeviceQueueInfo2> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceQueueInfo2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceQueueInfo2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceQueueInfo2(segment)
        );
    }

}