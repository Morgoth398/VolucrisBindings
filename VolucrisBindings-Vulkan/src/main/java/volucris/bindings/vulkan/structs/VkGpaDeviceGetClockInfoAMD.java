/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
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

public final class VkGpaDeviceGetClockInfoAMD
		implements Struct<VkGpaDeviceGetClockInfoAMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MEMORY_CLOCK_RATIO_TO_PEAK_HANDLE;
	public static final VarHandle ENGINE_CLOCK_RATIO_TO_PEAK_HANDLE;
	public static final VarHandle MEMORY_CLOCK_FREQUENCY_HANDLE;
	public static final VarHandle ENGINE_CLOCK_FREQUENCY_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MEMORY_CLOCK_RATIO_TO_PEAK_BYTE_OFFSET;
	public static final long ENGINE_CLOCK_RATIO_TO_PEAK_BYTE_OFFSET;
	public static final long MEMORY_CLOCK_FREQUENCY_BYTE_OFFSET;
	public static final long ENGINE_CLOCK_FREQUENCY_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_FLOAT.withName("memoryClockRatioToPeak"),
		    JAVA_FLOAT.withName("engineClockRatioToPeak"),
		    JAVA_INT.withName("memoryClockFrequency"),
		    JAVA_INT.withName("engineClockFrequency")
		).withName("VkGpaDeviceGetClockInfoAMD").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MEMORY_CLOCK_RATIO_TO_PEAK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryClockRatioToPeak"));
		ENGINE_CLOCK_RATIO_TO_PEAK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("engineClockRatioToPeak"));
		MEMORY_CLOCK_FREQUENCY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryClockFrequency"));
		ENGINE_CLOCK_FREQUENCY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("engineClockFrequency"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MEMORY_CLOCK_RATIO_TO_PEAK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryClockRatioToPeak"));
		ENGINE_CLOCK_RATIO_TO_PEAK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("engineClockRatioToPeak"));
		MEMORY_CLOCK_FREQUENCY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryClockFrequency"));
		ENGINE_CLOCK_FREQUENCY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("engineClockFrequency"));
		//@formatter:on
	}

	public VkGpaDeviceGetClockInfoAMD() {
	    this(Arena.ofAuto());
	}
	
	public VkGpaDeviceGetClockInfoAMD(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkGpaDeviceGetClockInfoAMD(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkGpaDeviceGetClockInfoAMD sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkGpaDeviceGetClockInfoAMD pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #memoryClockRatioToPeak()
    public VkGpaDeviceGetClockInfoAMD memoryClockRatioToPeak(float memoryClockRatioToPeak) {
    	MEMORY_CLOCK_RATIO_TO_PEAK_HANDLE.set(segment, 0L, memoryClockRatioToPeak);
    	return this;
    }
    
    public float memoryClockRatioToPeak() {
    	return (float) MEMORY_CLOCK_RATIO_TO_PEAK_HANDLE.get(segment, 0L);
    }
    
    /// @see #engineClockRatioToPeak()
    public VkGpaDeviceGetClockInfoAMD engineClockRatioToPeak(float engineClockRatioToPeak) {
    	ENGINE_CLOCK_RATIO_TO_PEAK_HANDLE.set(segment, 0L, engineClockRatioToPeak);
    	return this;
    }
    
    public float engineClockRatioToPeak() {
    	return (float) ENGINE_CLOCK_RATIO_TO_PEAK_HANDLE.get(segment, 0L);
    }
    
    /// @see #memoryClockFrequency()
    public VkGpaDeviceGetClockInfoAMD memoryClockFrequency(int memoryClockFrequency) {
    	MEMORY_CLOCK_FREQUENCY_HANDLE.set(segment, 0L, memoryClockFrequency);
    	return this;
    }
    
    public int memoryClockFrequency() {
    	return (int) MEMORY_CLOCK_FREQUENCY_HANDLE.get(segment, 0L);
    }
    
    /// @see #engineClockFrequency()
    public VkGpaDeviceGetClockInfoAMD engineClockFrequency(int engineClockFrequency) {
    	ENGINE_CLOCK_FREQUENCY_HANDLE.set(segment, 0L, engineClockFrequency);
    	return this;
    }
    
    public int engineClockFrequency() {
    	return (int) ENGINE_CLOCK_FREQUENCY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkGpaDeviceGetClockInfoAMD set(VkGpaDeviceGetClockInfoAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkGpaDeviceGetClockInfoAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkGpaDeviceGetClockInfoAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkGpaDeviceGetClockInfoAMD> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkGpaDeviceGetClockInfoAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkGpaDeviceGetClockInfoAMD> array(SegmentAllocator allocator, VkGpaDeviceGetClockInfoAMD... structs) {
        NativeStructArray<VkGpaDeviceGetClockInfoAMD> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkGpaDeviceGetClockInfoAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkGpaDeviceGetClockInfoAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkGpaDeviceGetClockInfoAMD(segment)
        );
    }

}