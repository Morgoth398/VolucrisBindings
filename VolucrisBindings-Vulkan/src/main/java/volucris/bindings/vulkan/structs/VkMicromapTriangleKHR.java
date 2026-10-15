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

public final class VkMicromapTriangleKHR
		implements Struct<VkMicromapTriangleKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle DATA_OFFSET_HANDLE;
	public static final VarHandle SUBDIVISION_LEVEL_HANDLE;
	public static final VarHandle FORMAT_HANDLE;

	public static final long DATA_OFFSET_BYTE_OFFSET;
	public static final long SUBDIVISION_LEVEL_BYTE_OFFSET;
	public static final long FORMAT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("dataOffset"),
		    JAVA_SHORT.withName("subdivisionLevel"),
		    JAVA_SHORT.withName("format")
		).withName("VkMicromapTriangleKHR").withByteAlignment(4);
		
		DATA_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dataOffset"));
		SUBDIVISION_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subdivisionLevel"));
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		
		DATA_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dataOffset"));
		SUBDIVISION_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subdivisionLevel"));
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		//@formatter:on
	}

	public VkMicromapTriangleKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkMicromapTriangleKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkMicromapTriangleKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #dataOffset()
    public VkMicromapTriangleKHR dataOffset(int dataOffset) {
    	DATA_OFFSET_HANDLE.set(segment, 0L, dataOffset);
    	return this;
    }
    
    public int dataOffset() {
    	return (int) DATA_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #subdivisionLevel()
    public VkMicromapTriangleKHR subdivisionLevel(short subdivisionLevel) {
    	SUBDIVISION_LEVEL_HANDLE.set(segment, 0L, subdivisionLevel);
    	return this;
    }
    
    public short subdivisionLevel() {
    	return (short) SUBDIVISION_LEVEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #format()
    public VkMicromapTriangleKHR format(short format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public short format() {
    	return (short) FORMAT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkMicromapTriangleKHR set(VkMicromapTriangleKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkMicromapTriangleKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMicromapTriangleKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMicromapTriangleKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMicromapTriangleKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMicromapTriangleKHR> array(Arena arena, VkMicromapTriangleKHR... structs) {
        NativeStructArray<VkMicromapTriangleKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMicromapTriangleKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMicromapTriangleKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMicromapTriangleKHR(segment)
        );
    }

}