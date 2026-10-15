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

public final class VkPhysicalDeviceMaintenance5Properties
		implements Struct<VkPhysicalDeviceMaintenance5Properties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle EARLY_FRAGMENT_MULTISAMPLE_COVERAGE_AFTER_SAMPLE_COUNTING_HANDLE;
	public static final VarHandle EARLY_FRAGMENT_SAMPLE_MASK_TEST_BEFORE_SAMPLE_COUNTING_HANDLE;
	public static final VarHandle DEPTH_STENCIL_SWIZZLE_ONE_SUPPORT_HANDLE;
	public static final VarHandle POLYGON_MODE_POINT_SIZE_HANDLE;
	public static final VarHandle NON_STRICT_SINGLE_PIXEL_WIDE_LINES_USE_PARALLELOGRAM_HANDLE;
	public static final VarHandle NON_STRICT_WIDE_LINES_USE_PARALLELOGRAM_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long EARLY_FRAGMENT_MULTISAMPLE_COVERAGE_AFTER_SAMPLE_COUNTING_BYTE_OFFSET;
	public static final long EARLY_FRAGMENT_SAMPLE_MASK_TEST_BEFORE_SAMPLE_COUNTING_BYTE_OFFSET;
	public static final long DEPTH_STENCIL_SWIZZLE_ONE_SUPPORT_BYTE_OFFSET;
	public static final long POLYGON_MODE_POINT_SIZE_BYTE_OFFSET;
	public static final long NON_STRICT_SINGLE_PIXEL_WIDE_LINES_USE_PARALLELOGRAM_BYTE_OFFSET;
	public static final long NON_STRICT_WIDE_LINES_USE_PARALLELOGRAM_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("earlyFragmentMultisampleCoverageAfterSampleCounting"),
		    JAVA_INT.withName("earlyFragmentSampleMaskTestBeforeSampleCounting"),
		    JAVA_INT.withName("depthStencilSwizzleOneSupport"),
		    JAVA_INT.withName("polygonModePointSize"),
		    JAVA_INT.withName("nonStrictSinglePixelWideLinesUseParallelogram"),
		    JAVA_INT.withName("nonStrictWideLinesUseParallelogram")
		).withName("VkPhysicalDeviceMaintenance5Properties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		EARLY_FRAGMENT_MULTISAMPLE_COVERAGE_AFTER_SAMPLE_COUNTING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("earlyFragmentMultisampleCoverageAfterSampleCounting"));
		EARLY_FRAGMENT_SAMPLE_MASK_TEST_BEFORE_SAMPLE_COUNTING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("earlyFragmentSampleMaskTestBeforeSampleCounting"));
		DEPTH_STENCIL_SWIZZLE_ONE_SUPPORT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthStencilSwizzleOneSupport"));
		POLYGON_MODE_POINT_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("polygonModePointSize"));
		NON_STRICT_SINGLE_PIXEL_WIDE_LINES_USE_PARALLELOGRAM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nonStrictSinglePixelWideLinesUseParallelogram"));
		NON_STRICT_WIDE_LINES_USE_PARALLELOGRAM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nonStrictWideLinesUseParallelogram"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		EARLY_FRAGMENT_MULTISAMPLE_COVERAGE_AFTER_SAMPLE_COUNTING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("earlyFragmentMultisampleCoverageAfterSampleCounting"));
		EARLY_FRAGMENT_SAMPLE_MASK_TEST_BEFORE_SAMPLE_COUNTING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("earlyFragmentSampleMaskTestBeforeSampleCounting"));
		DEPTH_STENCIL_SWIZZLE_ONE_SUPPORT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthStencilSwizzleOneSupport"));
		POLYGON_MODE_POINT_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("polygonModePointSize"));
		NON_STRICT_SINGLE_PIXEL_WIDE_LINES_USE_PARALLELOGRAM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nonStrictSinglePixelWideLinesUseParallelogram"));
		NON_STRICT_WIDE_LINES_USE_PARALLELOGRAM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nonStrictWideLinesUseParallelogram"));
		//@formatter:on
	}

	public VkPhysicalDeviceMaintenance5Properties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceMaintenance5Properties(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceMaintenance5Properties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceMaintenance5Properties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMaintenance5Properties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #earlyFragmentMultisampleCoverageAfterSampleCounting()
    public VkPhysicalDeviceMaintenance5Properties earlyFragmentMultisampleCoverageAfterSampleCounting(int earlyFragmentMultisampleCoverageAfterSampleCounting) {
    	EARLY_FRAGMENT_MULTISAMPLE_COVERAGE_AFTER_SAMPLE_COUNTING_HANDLE.set(segment, 0L, earlyFragmentMultisampleCoverageAfterSampleCounting);
    	return this;
    }
    
    public int earlyFragmentMultisampleCoverageAfterSampleCounting() {
    	return (int) EARLY_FRAGMENT_MULTISAMPLE_COVERAGE_AFTER_SAMPLE_COUNTING_HANDLE.get(segment, 0L);
    }
    
    /// @see #earlyFragmentSampleMaskTestBeforeSampleCounting()
    public VkPhysicalDeviceMaintenance5Properties earlyFragmentSampleMaskTestBeforeSampleCounting(int earlyFragmentSampleMaskTestBeforeSampleCounting) {
    	EARLY_FRAGMENT_SAMPLE_MASK_TEST_BEFORE_SAMPLE_COUNTING_HANDLE.set(segment, 0L, earlyFragmentSampleMaskTestBeforeSampleCounting);
    	return this;
    }
    
    public int earlyFragmentSampleMaskTestBeforeSampleCounting() {
    	return (int) EARLY_FRAGMENT_SAMPLE_MASK_TEST_BEFORE_SAMPLE_COUNTING_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthStencilSwizzleOneSupport()
    public VkPhysicalDeviceMaintenance5Properties depthStencilSwizzleOneSupport(int depthStencilSwizzleOneSupport) {
    	DEPTH_STENCIL_SWIZZLE_ONE_SUPPORT_HANDLE.set(segment, 0L, depthStencilSwizzleOneSupport);
    	return this;
    }
    
    public int depthStencilSwizzleOneSupport() {
    	return (int) DEPTH_STENCIL_SWIZZLE_ONE_SUPPORT_HANDLE.get(segment, 0L);
    }
    
    /// @see #polygonModePointSize()
    public VkPhysicalDeviceMaintenance5Properties polygonModePointSize(int polygonModePointSize) {
    	POLYGON_MODE_POINT_SIZE_HANDLE.set(segment, 0L, polygonModePointSize);
    	return this;
    }
    
    public int polygonModePointSize() {
    	return (int) POLYGON_MODE_POINT_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #nonStrictSinglePixelWideLinesUseParallelogram()
    public VkPhysicalDeviceMaintenance5Properties nonStrictSinglePixelWideLinesUseParallelogram(int nonStrictSinglePixelWideLinesUseParallelogram) {
    	NON_STRICT_SINGLE_PIXEL_WIDE_LINES_USE_PARALLELOGRAM_HANDLE.set(segment, 0L, nonStrictSinglePixelWideLinesUseParallelogram);
    	return this;
    }
    
    public int nonStrictSinglePixelWideLinesUseParallelogram() {
    	return (int) NON_STRICT_SINGLE_PIXEL_WIDE_LINES_USE_PARALLELOGRAM_HANDLE.get(segment, 0L);
    }
    
    /// @see #nonStrictWideLinesUseParallelogram()
    public VkPhysicalDeviceMaintenance5Properties nonStrictWideLinesUseParallelogram(int nonStrictWideLinesUseParallelogram) {
    	NON_STRICT_WIDE_LINES_USE_PARALLELOGRAM_HANDLE.set(segment, 0L, nonStrictWideLinesUseParallelogram);
    	return this;
    }
    
    public int nonStrictWideLinesUseParallelogram() {
    	return (int) NON_STRICT_WIDE_LINES_USE_PARALLELOGRAM_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance5Properties set(VkPhysicalDeviceMaintenance5Properties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance5Properties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMaintenance5Properties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance5Properties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance5Properties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance5Properties> array(Arena arena, VkPhysicalDeviceMaintenance5Properties... structs) {
        NativeStructArray<VkPhysicalDeviceMaintenance5Properties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance5Properties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance5Properties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance5Properties(segment)
        );
    }

}