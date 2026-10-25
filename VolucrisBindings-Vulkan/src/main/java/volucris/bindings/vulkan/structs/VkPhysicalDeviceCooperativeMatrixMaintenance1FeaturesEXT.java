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

public final class VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT
		implements Struct<VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle COOPERATIVE_MATRIX_PROPERTIES2_HANDLE;
	public static final VarHandle COOPERATIVE_MATRIX_REDUCTIONS_HANDLE;
	public static final VarHandle COOPERATIVE_MATRIX_CONVERSIONS_HANDLE;
	public static final VarHandle COOPERATIVE_MATRIX_PER_ELEMENT_OPERATIONS_HANDLE;
	public static final VarHandle COOPERATIVE_MATRIX_GET_COORDINATE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long COOPERATIVE_MATRIX_PROPERTIES2_BYTE_OFFSET;
	public static final long COOPERATIVE_MATRIX_REDUCTIONS_BYTE_OFFSET;
	public static final long COOPERATIVE_MATRIX_CONVERSIONS_BYTE_OFFSET;
	public static final long COOPERATIVE_MATRIX_PER_ELEMENT_OPERATIONS_BYTE_OFFSET;
	public static final long COOPERATIVE_MATRIX_GET_COORDINATE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("cooperativeMatrixProperties2"),
		    JAVA_INT.withName("cooperativeMatrixReductions"),
		    JAVA_INT.withName("cooperativeMatrixConversions"),
		    JAVA_INT.withName("cooperativeMatrixPerElementOperations"),
		    JAVA_INT.withName("cooperativeMatrixGetCoordinate"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		COOPERATIVE_MATRIX_PROPERTIES2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeMatrixProperties2"));
		COOPERATIVE_MATRIX_REDUCTIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeMatrixReductions"));
		COOPERATIVE_MATRIX_CONVERSIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeMatrixConversions"));
		COOPERATIVE_MATRIX_PER_ELEMENT_OPERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeMatrixPerElementOperations"));
		COOPERATIVE_MATRIX_GET_COORDINATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeMatrixGetCoordinate"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		COOPERATIVE_MATRIX_PROPERTIES2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixProperties2"));
		COOPERATIVE_MATRIX_REDUCTIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixReductions"));
		COOPERATIVE_MATRIX_CONVERSIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixConversions"));
		COOPERATIVE_MATRIX_PER_ELEMENT_OPERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixPerElementOperations"));
		COOPERATIVE_MATRIX_GET_COORDINATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixGetCoordinate"));
		//@formatter:on
	}

	public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #cooperativeMatrixProperties2()
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT cooperativeMatrixProperties2(int cooperativeMatrixProperties2) {
    	COOPERATIVE_MATRIX_PROPERTIES2_HANDLE.set(segment, 0L, cooperativeMatrixProperties2);
    	return this;
    }
    
    public int cooperativeMatrixProperties2() {
    	return (int) COOPERATIVE_MATRIX_PROPERTIES2_HANDLE.get(segment, 0L);
    }
    
    /// @see #cooperativeMatrixReductions()
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT cooperativeMatrixReductions(int cooperativeMatrixReductions) {
    	COOPERATIVE_MATRIX_REDUCTIONS_HANDLE.set(segment, 0L, cooperativeMatrixReductions);
    	return this;
    }
    
    public int cooperativeMatrixReductions() {
    	return (int) COOPERATIVE_MATRIX_REDUCTIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #cooperativeMatrixConversions()
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT cooperativeMatrixConversions(int cooperativeMatrixConversions) {
    	COOPERATIVE_MATRIX_CONVERSIONS_HANDLE.set(segment, 0L, cooperativeMatrixConversions);
    	return this;
    }
    
    public int cooperativeMatrixConversions() {
    	return (int) COOPERATIVE_MATRIX_CONVERSIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #cooperativeMatrixPerElementOperations()
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT cooperativeMatrixPerElementOperations(int cooperativeMatrixPerElementOperations) {
    	COOPERATIVE_MATRIX_PER_ELEMENT_OPERATIONS_HANDLE.set(segment, 0L, cooperativeMatrixPerElementOperations);
    	return this;
    }
    
    public int cooperativeMatrixPerElementOperations() {
    	return (int) COOPERATIVE_MATRIX_PER_ELEMENT_OPERATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #cooperativeMatrixGetCoordinate()
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT cooperativeMatrixGetCoordinate(int cooperativeMatrixGetCoordinate) {
    	COOPERATIVE_MATRIX_GET_COORDINATE_HANDLE.set(segment, 0L, cooperativeMatrixGetCoordinate);
    	return this;
    }
    
    public int cooperativeMatrixGetCoordinate() {
    	return (int) COOPERATIVE_MATRIX_GET_COORDINATE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT set(VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeMatrixMaintenance1FeaturesEXT(segment)
        );
    }

}