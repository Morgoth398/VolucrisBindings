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

public final class VkGpaDeviceClockModeInfoAMD
		implements Struct<VkGpaDeviceClockModeInfoAMD> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle CLOCK_MODE_HANDLE;
    public static final VarHandle MEMORY_CLOCK_RATIO_TO_PEAK_HANDLE;
    public static final VarHandle ENGINE_CLOCK_RATIO_TO_PEAK_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long CLOCK_MODE_BYTE_OFFSET;
    public static final long MEMORY_CLOCK_RATIO_TO_PEAK_BYTE_OFFSET;
    public static final long ENGINE_CLOCK_RATIO_TO_PEAK_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("clockMode"),
            JAVA_FLOAT.withName("memoryClockRatioToPeak"),
            JAVA_FLOAT.withName("engineClockRatioToPeak"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkGpaDeviceClockModeInfoAMD").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        CLOCK_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clockMode"));
        MEMORY_CLOCK_RATIO_TO_PEAK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryClockRatioToPeak"));
        ENGINE_CLOCK_RATIO_TO_PEAK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("engineClockRatioToPeak"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        CLOCK_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clockMode"));
        MEMORY_CLOCK_RATIO_TO_PEAK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryClockRatioToPeak"));
        ENGINE_CLOCK_RATIO_TO_PEAK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("engineClockRatioToPeak"));
        //@formatter:on
    }

    public VkGpaDeviceClockModeInfoAMD() {
        this(Arena.ofAuto());
    }
    
    public VkGpaDeviceClockModeInfoAMD(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkGpaDeviceClockModeInfoAMD(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkGpaDeviceClockModeInfoAMD sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkGpaDeviceClockModeInfoAMD pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #clockMode()
    public VkGpaDeviceClockModeInfoAMD clockMode(int clockMode) {
    	CLOCK_MODE_HANDLE.set(segment, 0L, clockMode);
    	return this;
    }
    
    public int clockMode() {
    	return (int) CLOCK_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #memoryClockRatioToPeak()
    public VkGpaDeviceClockModeInfoAMD memoryClockRatioToPeak(float memoryClockRatioToPeak) {
    	MEMORY_CLOCK_RATIO_TO_PEAK_HANDLE.set(segment, 0L, memoryClockRatioToPeak);
    	return this;
    }
    
    public float memoryClockRatioToPeak() {
    	return (float) MEMORY_CLOCK_RATIO_TO_PEAK_HANDLE.get(segment, 0L);
    }
    
    /// @see #engineClockRatioToPeak()
    public VkGpaDeviceClockModeInfoAMD engineClockRatioToPeak(float engineClockRatioToPeak) {
    	ENGINE_CLOCK_RATIO_TO_PEAK_HANDLE.set(segment, 0L, engineClockRatioToPeak);
    	return this;
    }
    
    public float engineClockRatioToPeak() {
    	return (float) ENGINE_CLOCK_RATIO_TO_PEAK_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkGpaDeviceClockModeInfoAMD set(VkGpaDeviceClockModeInfoAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkGpaDeviceClockModeInfoAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkGpaDeviceClockModeInfoAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkGpaDeviceClockModeInfoAMD> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGpaDeviceClockModeInfoAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkGpaDeviceClockModeInfoAMD> array(Arena arena, VkGpaDeviceClockModeInfoAMD... structs) {
        NativeStructArray<VkGpaDeviceClockModeInfoAMD> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGpaDeviceClockModeInfoAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkGpaDeviceClockModeInfoAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkGpaDeviceClockModeInfoAMD(segment)
        );
    }
    
}