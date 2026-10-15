/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.unions;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.structs.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPerformanceValueDataINTEL
		implements Struct<VkPerformanceValueDataINTEL> {

	public static final UnionLayout LAYOUT;

	public static final VarHandle VALUE32_HANDLE;
	public static final VarHandle VALUE64_HANDLE;
	public static final VarHandle VALUE_FLOAT_HANDLE;
	public static final VarHandle VALUE_BOOL_HANDLE;
	public static final VarHandle VALUE_STRING_HANDLE;

	public static final long VALUE32_BYTE_OFFSET;
	public static final long VALUE64_BYTE_OFFSET;
	public static final long VALUE_FLOAT_BYTE_OFFSET;
	public static final long VALUE_BOOL_BYTE_OFFSET;
	public static final long VALUE_STRING_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.unionLayout(
		    JAVA_INT.withName("value32"),
		    JAVA_LONG.withName("value64"),
		    JAVA_FLOAT.withName("valueFloat"),
		    JAVA_INT.withName("valueBool"),
		    UNBOUNDED_ADDRESS.withName("valueString")
		).withName("VkPerformanceValueDataINTEL").withByteAlignment(8);
		
		VALUE32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("value32"));
		VALUE64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("value64"));
		VALUE_FLOAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("valueFloat"));
		VALUE_BOOL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("valueBool"));
		VALUE_STRING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("valueString"));
		
		VALUE32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("value32"));
		VALUE64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("value64"));
		VALUE_FLOAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("valueFloat"));
		VALUE_BOOL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("valueBool"));
		VALUE_STRING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("valueString"));
		//@formatter:on
	}

	public VkPerformanceValueDataINTEL() {
	    this(Arena.ofAuto());
	}
	
	public VkPerformanceValueDataINTEL(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPerformanceValueDataINTEL(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #value32()
    public VkPerformanceValueDataINTEL value32(int value32) {
    	VALUE32_HANDLE.set(segment, 0L, value32);
    	return this;
    }
    
    public int value32() {
    	return (int) VALUE32_HANDLE.get(segment, 0L);
    }
    
    /// @see #value64()
    public VkPerformanceValueDataINTEL value64(long value64) {
    	VALUE64_HANDLE.set(segment, 0L, value64);
    	return this;
    }
    
    public long value64() {
    	return (long) VALUE64_HANDLE.get(segment, 0L);
    }
    
    /// @see #valueFloat()
    public VkPerformanceValueDataINTEL valueFloat(float valueFloat) {
    	VALUE_FLOAT_HANDLE.set(segment, 0L, valueFloat);
    	return this;
    }
    
    public float valueFloat() {
    	return (float) VALUE_FLOAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #valueBool()
    public VkPerformanceValueDataINTEL valueBool(int valueBool) {
    	VALUE_BOOL_HANDLE.set(segment, 0L, valueBool);
    	return this;
    }
    
    public int valueBool() {
    	return (int) VALUE_BOOL_HANDLE.get(segment, 0L);
    }
    
    /// @see #valueString()
    public VkPerformanceValueDataINTEL valueString(Arena arena, String valueString) {
    	VALUE_STRING_HANDLE.set(segment, 0L, arena.allocateFrom(valueString));
    	return this;
    }
    
    public @Nullable String valueString() {
    	MemorySegment segment = (MemorySegment) VALUE_STRING_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    @Override
    public VkPerformanceValueDataINTEL set(VkPerformanceValueDataINTEL other) {
        return set(other.segment);
    }
    
    @Override
    public VkPerformanceValueDataINTEL set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPerformanceValueDataINTEL> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPerformanceValueDataINTEL> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPerformanceValueDataINTEL(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPerformanceValueDataINTEL> array(Arena arena, VkPerformanceValueDataINTEL... structs) {
        NativeStructArray<VkPerformanceValueDataINTEL> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPerformanceValueDataINTEL(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPerformanceValueDataINTEL> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPerformanceValueDataINTEL(segment)
        );
    }

}