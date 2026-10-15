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
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkDeviceQueueCreateInfo
		implements Struct<VkDeviceQueueCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle QUEUE_FAMILY_INDEX_HANDLE;
	public static final VarHandle QUEUE_COUNT_HANDLE;
	public static final VarHandle P_QUEUE_PRIORITIES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long QUEUE_FAMILY_INDEX_BYTE_OFFSET;
	public static final long QUEUE_COUNT_BYTE_OFFSET;
	public static final long P_QUEUE_PRIORITIES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("queueFamilyIndex"),
		    JAVA_INT.withName("queueCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pQueuePriorities")
		).withName("VkDeviceQueueCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		QUEUE_FAMILY_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queueFamilyIndex"));
		QUEUE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queueCount"));
		P_QUEUE_PRIORITIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pQueuePriorities"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		QUEUE_FAMILY_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndex"));
		QUEUE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queueCount"));
		P_QUEUE_PRIORITIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pQueuePriorities"));
		//@formatter:on
	}

	public VkDeviceQueueCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkDeviceQueueCreateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDeviceQueueCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDeviceQueueCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceQueueCreateInfo pNext(MemorySegment pNext) {
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
    public VkDeviceQueueCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #queueFamilyIndex()
    public VkDeviceQueueCreateInfo queueFamilyIndex(int queueFamilyIndex) {
    	QUEUE_FAMILY_INDEX_HANDLE.set(segment, 0L, queueFamilyIndex);
    	return this;
    }
    
    public int queueFamilyIndex() {
    	return (int) QUEUE_FAMILY_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #queueCount()
    public VkDeviceQueueCreateInfo queueCount(int queueCount) {
    	QUEUE_COUNT_HANDLE.set(segment, 0L, queueCount);
    	return this;
    }
    
    public int queueCount() {
    	return (int) QUEUE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pQueuePriorities()
    public VkDeviceQueueCreateInfo pQueuePriorities(NativeFloatArray pQueuePriorities) {
    	P_QUEUE_PRIORITIES_HANDLE.set(segment, 0L, pQueuePriorities.memorySegment());
    	return this;
    }
    
    public @Nullable NativeFloatArray pQueuePriorities() {
    	MemorySegment segment = (MemorySegment) P_QUEUE_PRIORITIES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeFloatArray(segment);
    }
    
    @Override
    public VkDeviceQueueCreateInfo set(VkDeviceQueueCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceQueueCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceQueueCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceQueueCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceQueueCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceQueueCreateInfo> array(Arena arena, VkDeviceQueueCreateInfo... structs) {
        NativeStructArray<VkDeviceQueueCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceQueueCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceQueueCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceQueueCreateInfo(segment)
        );
    }

}