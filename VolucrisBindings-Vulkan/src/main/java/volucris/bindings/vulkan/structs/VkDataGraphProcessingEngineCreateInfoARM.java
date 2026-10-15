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

public final class VkDataGraphProcessingEngineCreateInfoARM
		implements Struct<VkDataGraphProcessingEngineCreateInfoARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PROCESSING_ENGINE_COUNT_HANDLE;
	public static final VarHandle P_PROCESSING_ENGINES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PROCESSING_ENGINE_COUNT_BYTE_OFFSET;
	public static final long P_PROCESSING_ENGINES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("processingEngineCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pProcessingEngines")
		).withName("VkDataGraphProcessingEngineCreateInfoARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PROCESSING_ENGINE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("processingEngineCount"));
		P_PROCESSING_ENGINES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pProcessingEngines"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PROCESSING_ENGINE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("processingEngineCount"));
		P_PROCESSING_ENGINES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pProcessingEngines"));
		//@formatter:on
	}

	public VkDataGraphProcessingEngineCreateInfoARM() {
	    this(Arena.ofAuto());
	}
	
	public VkDataGraphProcessingEngineCreateInfoARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDataGraphProcessingEngineCreateInfoARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDataGraphProcessingEngineCreateInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDataGraphProcessingEngineCreateInfoARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #processingEngineCount()
    public VkDataGraphProcessingEngineCreateInfoARM processingEngineCount(int processingEngineCount) {
    	PROCESSING_ENGINE_COUNT_HANDLE.set(segment, 0L, processingEngineCount);
    	return this;
    }
    
    public int processingEngineCount() {
    	return (int) PROCESSING_ENGINE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pProcessingEngines()
    public VkDataGraphProcessingEngineCreateInfoARM pProcessingEngines(NativeStructArray<VkPhysicalDeviceDataGraphProcessingEngineARM> pProcessingEngines) {
    	P_PROCESSING_ENGINES_HANDLE.set(segment, 0L, pProcessingEngines.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkPhysicalDeviceDataGraphProcessingEngineARM> pProcessingEngines() {
    	MemorySegment segment = (MemorySegment) P_PROCESSING_ENGINES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkPhysicalDeviceDataGraphProcessingEngineARM.array(segment);
    }
    
    @Override
    public VkDataGraphProcessingEngineCreateInfoARM set(VkDataGraphProcessingEngineCreateInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDataGraphProcessingEngineCreateInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDataGraphProcessingEngineCreateInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDataGraphProcessingEngineCreateInfoARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphProcessingEngineCreateInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDataGraphProcessingEngineCreateInfoARM> array(Arena arena, VkDataGraphProcessingEngineCreateInfoARM... structs) {
        NativeStructArray<VkDataGraphProcessingEngineCreateInfoARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphProcessingEngineCreateInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDataGraphProcessingEngineCreateInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDataGraphProcessingEngineCreateInfoARM(segment)
        );
    }

}