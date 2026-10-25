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

public final class VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV
		implements Struct<VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle REPRESENTATIVE_FRAGMENT_TEST_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long REPRESENTATIVE_FRAGMENT_TEST_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("representativeFragmentTest"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		REPRESENTATIVE_FRAGMENT_TEST_HANDLE = LAYOUT.varHandle(PathElement.groupElement("representativeFragmentTest"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		REPRESENTATIVE_FRAGMENT_TEST_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("representativeFragmentTest"));
		//@formatter:on
	}

	public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #representativeFragmentTest()
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV representativeFragmentTest(int representativeFragmentTest) {
    	REPRESENTATIVE_FRAGMENT_TEST_HANDLE.set(segment, 0L, representativeFragmentTest);
    	return this;
    }
    
    public int representativeFragmentTest() {
    	return (int) REPRESENTATIVE_FRAGMENT_TEST_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV set(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV> array(SegmentAllocator allocator, VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(segment)
        );
    }

}