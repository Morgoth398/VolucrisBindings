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

public final class VkPhysicalDeviceTileMemoryHeapPropertiesQCOM
		implements Struct<VkPhysicalDeviceTileMemoryHeapPropertiesQCOM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle QUEUE_SUBMIT_BOUNDARY_HANDLE;
	public static final VarHandle TILE_BUFFER_TRANSFERS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long QUEUE_SUBMIT_BOUNDARY_BYTE_OFFSET;
	public static final long TILE_BUFFER_TRANSFERS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("queueSubmitBoundary"),
		    JAVA_INT.withName("tileBufferTransfers")
		).withName("VkPhysicalDeviceTileMemoryHeapPropertiesQCOM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		QUEUE_SUBMIT_BOUNDARY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queueSubmitBoundary"));
		TILE_BUFFER_TRANSFERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tileBufferTransfers"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		QUEUE_SUBMIT_BOUNDARY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queueSubmitBoundary"));
		TILE_BUFFER_TRANSFERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tileBufferTransfers"));
		//@formatter:on
	}

	public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #queueSubmitBoundary()
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM queueSubmitBoundary(int queueSubmitBoundary) {
    	QUEUE_SUBMIT_BOUNDARY_HANDLE.set(segment, 0L, queueSubmitBoundary);
    	return this;
    }
    
    public int queueSubmitBoundary() {
    	return (int) QUEUE_SUBMIT_BOUNDARY_HANDLE.get(segment, 0L);
    }
    
    /// @see #tileBufferTransfers()
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM tileBufferTransfers(int tileBufferTransfers) {
    	TILE_BUFFER_TRANSFERS_HANDLE.set(segment, 0L, tileBufferTransfers);
    	return this;
    }
    
    public int tileBufferTransfers() {
    	return (int) TILE_BUFFER_TRANSFERS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM set(VkPhysicalDeviceTileMemoryHeapPropertiesQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceTileMemoryHeapPropertiesQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceTileMemoryHeapPropertiesQCOM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceTileMemoryHeapPropertiesQCOM> array(Arena arena, VkPhysicalDeviceTileMemoryHeapPropertiesQCOM... structs) {
        NativeStructArray<VkPhysicalDeviceTileMemoryHeapPropertiesQCOM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceTileMemoryHeapPropertiesQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(segment)
        );
    }

}