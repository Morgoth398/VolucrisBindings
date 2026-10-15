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

public final class VkPhysicalDeviceQueuePerfHintFeaturesQCOM
		implements Struct<VkPhysicalDeviceQueuePerfHintFeaturesQCOM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle QUEUE_PERF_HINT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long QUEUE_PERF_HINT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("queuePerfHint"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceQueuePerfHintFeaturesQCOM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		QUEUE_PERF_HINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queuePerfHint"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		QUEUE_PERF_HINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queuePerfHint"));
		//@formatter:on
	}

	public VkPhysicalDeviceQueuePerfHintFeaturesQCOM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceQueuePerfHintFeaturesQCOM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceQueuePerfHintFeaturesQCOM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceQueuePerfHintFeaturesQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceQueuePerfHintFeaturesQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #queuePerfHint()
    public VkPhysicalDeviceQueuePerfHintFeaturesQCOM queuePerfHint(int queuePerfHint) {
    	QUEUE_PERF_HINT_HANDLE.set(segment, 0L, queuePerfHint);
    	return this;
    }
    
    public int queuePerfHint() {
    	return (int) QUEUE_PERF_HINT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceQueuePerfHintFeaturesQCOM set(VkPhysicalDeviceQueuePerfHintFeaturesQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceQueuePerfHintFeaturesQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceQueuePerfHintFeaturesQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceQueuePerfHintFeaturesQCOM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceQueuePerfHintFeaturesQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceQueuePerfHintFeaturesQCOM> array(Arena arena, VkPhysicalDeviceQueuePerfHintFeaturesQCOM... structs) {
        NativeStructArray<VkPhysicalDeviceQueuePerfHintFeaturesQCOM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceQueuePerfHintFeaturesQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceQueuePerfHintFeaturesQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceQueuePerfHintFeaturesQCOM(segment)
        );
    }

}