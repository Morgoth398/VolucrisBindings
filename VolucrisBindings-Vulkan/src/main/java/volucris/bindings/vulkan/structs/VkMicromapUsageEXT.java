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

public final class VkMicromapUsageEXT
		implements Struct<VkMicromapUsageEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle COUNT_HANDLE;
	public static final VarHandle SUBDIVISION_LEVEL_HANDLE;
	public static final VarHandle FORMAT_HANDLE;

	public static final long COUNT_BYTE_OFFSET;
	public static final long SUBDIVISION_LEVEL_BYTE_OFFSET;
	public static final long FORMAT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("count"),
		    JAVA_INT.withName("subdivisionLevel"),
		    JAVA_INT.withName("format")
		).withName("VkMicromapUsageEXT").withByteAlignment(4);
		
		COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("count"));
		SUBDIVISION_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subdivisionLevel"));
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		
		COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("count"));
		SUBDIVISION_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subdivisionLevel"));
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		//@formatter:on
	}

	public VkMicromapUsageEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkMicromapUsageEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkMicromapUsageEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #count()
    public VkMicromapUsageEXT count(int count) {
    	COUNT_HANDLE.set(segment, 0L, count);
    	return this;
    }
    
    public int count() {
    	return (int) COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #subdivisionLevel()
    public VkMicromapUsageEXT subdivisionLevel(int subdivisionLevel) {
    	SUBDIVISION_LEVEL_HANDLE.set(segment, 0L, subdivisionLevel);
    	return this;
    }
    
    public int subdivisionLevel() {
    	return (int) SUBDIVISION_LEVEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #format()
    public VkMicromapUsageEXT format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkMicromapUsageEXT set(VkMicromapUsageEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkMicromapUsageEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMicromapUsageEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMicromapUsageEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMicromapUsageEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMicromapUsageEXT> array(Arena arena, VkMicromapUsageEXT... structs) {
        NativeStructArray<VkMicromapUsageEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMicromapUsageEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMicromapUsageEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMicromapUsageEXT(segment)
        );
    }

}