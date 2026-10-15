/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.unions;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.structs.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkPerformanceCounterResultKHR
		implements Struct<VkPerformanceCounterResultKHR> {

	public static final UnionLayout LAYOUT;

	public static final VarHandle INT32_HANDLE;
	public static final VarHandle INT64_HANDLE;
	public static final VarHandle UINT32_HANDLE;
	public static final VarHandle UINT64_HANDLE;
	public static final VarHandle FLOAT32_HANDLE;
	public static final VarHandle FLOAT64_HANDLE;

	public static final long INT32_BYTE_OFFSET;
	public static final long INT64_BYTE_OFFSET;
	public static final long UINT32_BYTE_OFFSET;
	public static final long UINT64_BYTE_OFFSET;
	public static final long FLOAT32_BYTE_OFFSET;
	public static final long FLOAT64_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.unionLayout(
		    JAVA_INT.withName("int32"),
		    JAVA_LONG.withName("int64"),
		    JAVA_INT.withName("uint32"),
		    JAVA_LONG.withName("uint64"),
		    JAVA_FLOAT.withName("float32"),
		    JAVA_DOUBLE.withName("float64")
		).withName("VkPerformanceCounterResultKHR").withByteAlignment(8);
		
		INT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("int32"));
		INT64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("int64"));
		UINT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("uint32"));
		UINT64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("uint64"));
		FLOAT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("float32"));
		FLOAT64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("float64"));
		
		INT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("int32"));
		INT64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("int64"));
		UINT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("uint32"));
		UINT64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("uint64"));
		FLOAT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("float32"));
		FLOAT64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("float64"));
		//@formatter:on
	}

	public VkPerformanceCounterResultKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPerformanceCounterResultKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPerformanceCounterResultKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #int32()
    public VkPerformanceCounterResultKHR int32(int int32) {
    	INT32_HANDLE.set(segment, 0L, int32);
    	return this;
    }
    
    public int int32() {
    	return (int) INT32_HANDLE.get(segment, 0L);
    }
    
    /// @see #int64()
    public VkPerformanceCounterResultKHR int64(long int64) {
    	INT64_HANDLE.set(segment, 0L, int64);
    	return this;
    }
    
    public long int64() {
    	return (long) INT64_HANDLE.get(segment, 0L);
    }
    
    /// @see #uint32()
    public VkPerformanceCounterResultKHR uint32(int uint32) {
    	UINT32_HANDLE.set(segment, 0L, uint32);
    	return this;
    }
    
    public int uint32() {
    	return (int) UINT32_HANDLE.get(segment, 0L);
    }
    
    /// @see #uint64()
    public VkPerformanceCounterResultKHR uint64(long uint64) {
    	UINT64_HANDLE.set(segment, 0L, uint64);
    	return this;
    }
    
    public long uint64() {
    	return (long) UINT64_HANDLE.get(segment, 0L);
    }
    
    /// @see #float32()
    public VkPerformanceCounterResultKHR float32(float float32) {
    	FLOAT32_HANDLE.set(segment, 0L, float32);
    	return this;
    }
    
    public float float32() {
    	return (float) FLOAT32_HANDLE.get(segment, 0L);
    }
    
    /// @see #float64()
    public VkPerformanceCounterResultKHR float64(double float64) {
    	FLOAT64_HANDLE.set(segment, 0L, float64);
    	return this;
    }
    
    public double float64() {
    	return (double) FLOAT64_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPerformanceCounterResultKHR set(VkPerformanceCounterResultKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPerformanceCounterResultKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPerformanceCounterResultKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPerformanceCounterResultKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPerformanceCounterResultKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPerformanceCounterResultKHR> array(Arena arena, VkPerformanceCounterResultKHR... structs) {
        NativeStructArray<VkPerformanceCounterResultKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPerformanceCounterResultKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPerformanceCounterResultKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPerformanceCounterResultKHR(segment)
        );
    }

}