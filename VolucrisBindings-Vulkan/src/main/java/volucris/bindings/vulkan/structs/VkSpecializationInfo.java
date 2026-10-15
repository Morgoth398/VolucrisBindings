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

public final class VkSpecializationInfo
		implements Struct<VkSpecializationInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle MAP_ENTRY_COUNT_HANDLE;
	public static final VarHandle P_MAP_ENTRIES_HANDLE;
	public static final VarHandle DATA_SIZE_HANDLE;
	public static final VarHandle P_DATA_HANDLE;

	public static final long MAP_ENTRY_COUNT_BYTE_OFFSET;
	public static final long P_MAP_ENTRIES_BYTE_OFFSET;
	public static final long DATA_SIZE_BYTE_OFFSET;
	public static final long P_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("mapEntryCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pMapEntries"),
		    JAVA_LONG.withName("dataSize"),
		    UNBOUNDED_ADDRESS.withName("pData")
		).withName("VkSpecializationInfo").withByteAlignment(8);
		
		MAP_ENTRY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mapEntryCount"));
		P_MAP_ENTRIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pMapEntries"));
		DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dataSize"));
		P_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pData"));
		
		MAP_ENTRY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mapEntryCount"));
		P_MAP_ENTRIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pMapEntries"));
		DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dataSize"));
		P_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pData"));
		//@formatter:on
	}

	public VkSpecializationInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkSpecializationInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkSpecializationInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #mapEntryCount()
    public VkSpecializationInfo mapEntryCount(int mapEntryCount) {
    	MAP_ENTRY_COUNT_HANDLE.set(segment, 0L, mapEntryCount);
    	return this;
    }
    
    public int mapEntryCount() {
    	return (int) MAP_ENTRY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pMapEntries()
    public VkSpecializationInfo pMapEntries(NativeStructArray<VkSpecializationMapEntry> pMapEntries) {
    	P_MAP_ENTRIES_HANDLE.set(segment, 0L, pMapEntries.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkSpecializationMapEntry> pMapEntries() {
    	MemorySegment segment = (MemorySegment) P_MAP_ENTRIES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkSpecializationMapEntry.array(segment);
    }
    
    /// @see #dataSize()
    public VkSpecializationInfo dataSize(long dataSize) {
    	DATA_SIZE_HANDLE.set(segment, 0L, dataSize);
    	return this;
    }
    
    public long dataSize() {
    	return (long) DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pData()
    public VkSpecializationInfo pData(MemorySegment pData) {
    	P_DATA_HANDLE.set(segment, 0L, pData);
    	return this;
    }
    
    public @Nullable MemorySegment pData() {
    	MemorySegment segment = (MemorySegment) P_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VkSpecializationInfo set(VkSpecializationInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkSpecializationInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSpecializationInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSpecializationInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSpecializationInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSpecializationInfo> array(Arena arena, VkSpecializationInfo... structs) {
        NativeStructArray<VkSpecializationInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSpecializationInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSpecializationInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSpecializationInfo(segment)
        );
    }

}