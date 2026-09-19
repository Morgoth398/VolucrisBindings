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

public final class VkPhysicalDeviceCoverageReductionModeFeaturesNV
		implements Struct<VkPhysicalDeviceCoverageReductionModeFeaturesNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle COVERAGE_REDUCTION_MODE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long COVERAGE_REDUCTION_MODE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("coverageReductionMode"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceCoverageReductionModeFeaturesNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        COVERAGE_REDUCTION_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("coverageReductionMode"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        COVERAGE_REDUCTION_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coverageReductionMode"));
        //@formatter:on
    }

    public VkPhysicalDeviceCoverageReductionModeFeaturesNV() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #coverageReductionMode()
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV coverageReductionMode(int coverageReductionMode) {
    	COVERAGE_REDUCTION_MODE_HANDLE.set(segment, 0L, coverageReductionMode);
    	return this;
    }
    
    public int coverageReductionMode() {
    	return (int) COVERAGE_REDUCTION_MODE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV set(VkPhysicalDeviceCoverageReductionModeFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceCoverageReductionModeFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceCoverageReductionModeFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceCoverageReductionModeFeaturesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceCoverageReductionModeFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceCoverageReductionModeFeaturesNV> array(Arena arena, VkPhysicalDeviceCoverageReductionModeFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceCoverageReductionModeFeaturesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceCoverageReductionModeFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceCoverageReductionModeFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceCoverageReductionModeFeaturesNV(segment)
        );
    }
    
}