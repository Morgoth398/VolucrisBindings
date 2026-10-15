/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkGpaPerfBlockPropertiesAMD
		implements Struct<VkGpaPerfBlockPropertiesAMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BLOCK_TYPE_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle INSTANCE_COUNT_HANDLE;
	public static final VarHandle MAX_EVENT_ID_HANDLE;
	public static final VarHandle MAX_GLOBAL_ONLY_COUNTERS_HANDLE;
	public static final VarHandle MAX_GLOBAL_SHARED_COUNTERS_HANDLE;
	public static final VarHandle MAX_STREAMING_COUNTERS_HANDLE;

	public static final long BLOCK_TYPE_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long INSTANCE_COUNT_BYTE_OFFSET;
	public static final long MAX_EVENT_ID_BYTE_OFFSET;
	public static final long MAX_GLOBAL_ONLY_COUNTERS_BYTE_OFFSET;
	public static final long MAX_GLOBAL_SHARED_COUNTERS_BYTE_OFFSET;
	public static final long MAX_STREAMING_COUNTERS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("blockType"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("instanceCount"),
		    JAVA_INT.withName("maxEventID"),
		    JAVA_INT.withName("maxGlobalOnlyCounters"),
		    JAVA_INT.withName("maxGlobalSharedCounters"),
		    JAVA_INT.withName("maxStreamingCounters")
		).withName("VkGpaPerfBlockPropertiesAMD").withByteAlignment(4);
		
		BLOCK_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blockType"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		INSTANCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("instanceCount"));
		MAX_EVENT_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxEventID"));
		MAX_GLOBAL_ONLY_COUNTERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxGlobalOnlyCounters"));
		MAX_GLOBAL_SHARED_COUNTERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxGlobalSharedCounters"));
		MAX_STREAMING_COUNTERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxStreamingCounters"));
		
		BLOCK_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blockType"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		INSTANCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("instanceCount"));
		MAX_EVENT_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxEventID"));
		MAX_GLOBAL_ONLY_COUNTERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxGlobalOnlyCounters"));
		MAX_GLOBAL_SHARED_COUNTERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxGlobalSharedCounters"));
		MAX_STREAMING_COUNTERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxStreamingCounters"));
		//@formatter:on
	}

	public VkGpaPerfBlockPropertiesAMD() {
	    this(Arena.ofAuto());
	}
	
	public VkGpaPerfBlockPropertiesAMD(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkGpaPerfBlockPropertiesAMD(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #blockType()
    public VkGpaPerfBlockPropertiesAMD blockType(int blockType) {
    	BLOCK_TYPE_HANDLE.set(segment, 0L, blockType);
    	return this;
    }
    
    public int blockType() {
    	return (int) BLOCK_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VkGpaPerfBlockPropertiesAMD flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #instanceCount()
    public VkGpaPerfBlockPropertiesAMD instanceCount(int instanceCount) {
    	INSTANCE_COUNT_HANDLE.set(segment, 0L, instanceCount);
    	return this;
    }
    
    public int instanceCount() {
    	return (int) INSTANCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxEventID()
    public VkGpaPerfBlockPropertiesAMD maxEventID(int maxEventID) {
    	MAX_EVENT_ID_HANDLE.set(segment, 0L, maxEventID);
    	return this;
    }
    
    public int maxEventID() {
    	return (int) MAX_EVENT_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxGlobalOnlyCounters()
    public VkGpaPerfBlockPropertiesAMD maxGlobalOnlyCounters(int maxGlobalOnlyCounters) {
    	MAX_GLOBAL_ONLY_COUNTERS_HANDLE.set(segment, 0L, maxGlobalOnlyCounters);
    	return this;
    }
    
    public int maxGlobalOnlyCounters() {
    	return (int) MAX_GLOBAL_ONLY_COUNTERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxGlobalSharedCounters()
    public VkGpaPerfBlockPropertiesAMD maxGlobalSharedCounters(int maxGlobalSharedCounters) {
    	MAX_GLOBAL_SHARED_COUNTERS_HANDLE.set(segment, 0L, maxGlobalSharedCounters);
    	return this;
    }
    
    public int maxGlobalSharedCounters() {
    	return (int) MAX_GLOBAL_SHARED_COUNTERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxStreamingCounters()
    public VkGpaPerfBlockPropertiesAMD maxStreamingCounters(int maxStreamingCounters) {
    	MAX_STREAMING_COUNTERS_HANDLE.set(segment, 0L, maxStreamingCounters);
    	return this;
    }
    
    public int maxStreamingCounters() {
    	return (int) MAX_STREAMING_COUNTERS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkGpaPerfBlockPropertiesAMD set(VkGpaPerfBlockPropertiesAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkGpaPerfBlockPropertiesAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkGpaPerfBlockPropertiesAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkGpaPerfBlockPropertiesAMD> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGpaPerfBlockPropertiesAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkGpaPerfBlockPropertiesAMD> array(Arena arena, VkGpaPerfBlockPropertiesAMD... structs) {
        NativeStructArray<VkGpaPerfBlockPropertiesAMD> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGpaPerfBlockPropertiesAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkGpaPerfBlockPropertiesAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkGpaPerfBlockPropertiesAMD(segment)
        );
    }

}