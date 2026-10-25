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

public final class VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR
		implements Struct<VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle WORKGROUP_MEMORY_EXPLICIT_LAYOUT_HANDLE;
	public static final VarHandle WORKGROUP_MEMORY_EXPLICIT_LAYOUT_SCALAR_BLOCK_LAYOUT_HANDLE;
	public static final VarHandle WORKGROUP_MEMORY_EXPLICIT_LAYOUT8_BIT_ACCESS_HANDLE;
	public static final VarHandle WORKGROUP_MEMORY_EXPLICIT_LAYOUT16_BIT_ACCESS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long WORKGROUP_MEMORY_EXPLICIT_LAYOUT_BYTE_OFFSET;
	public static final long WORKGROUP_MEMORY_EXPLICIT_LAYOUT_SCALAR_BLOCK_LAYOUT_BYTE_OFFSET;
	public static final long WORKGROUP_MEMORY_EXPLICIT_LAYOUT8_BIT_ACCESS_BYTE_OFFSET;
	public static final long WORKGROUP_MEMORY_EXPLICIT_LAYOUT16_BIT_ACCESS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("workgroupMemoryExplicitLayout"),
		    JAVA_INT.withName("workgroupMemoryExplicitLayoutScalarBlockLayout"),
		    JAVA_INT.withName("workgroupMemoryExplicitLayout8BitAccess"),
		    JAVA_INT.withName("workgroupMemoryExplicitLayout16BitAccess")
		).withName("VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		WORKGROUP_MEMORY_EXPLICIT_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("workgroupMemoryExplicitLayout"));
		WORKGROUP_MEMORY_EXPLICIT_LAYOUT_SCALAR_BLOCK_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("workgroupMemoryExplicitLayoutScalarBlockLayout"));
		WORKGROUP_MEMORY_EXPLICIT_LAYOUT8_BIT_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("workgroupMemoryExplicitLayout8BitAccess"));
		WORKGROUP_MEMORY_EXPLICIT_LAYOUT16_BIT_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("workgroupMemoryExplicitLayout16BitAccess"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		WORKGROUP_MEMORY_EXPLICIT_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("workgroupMemoryExplicitLayout"));
		WORKGROUP_MEMORY_EXPLICIT_LAYOUT_SCALAR_BLOCK_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("workgroupMemoryExplicitLayoutScalarBlockLayout"));
		WORKGROUP_MEMORY_EXPLICIT_LAYOUT8_BIT_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("workgroupMemoryExplicitLayout8BitAccess"));
		WORKGROUP_MEMORY_EXPLICIT_LAYOUT16_BIT_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("workgroupMemoryExplicitLayout16BitAccess"));
		//@formatter:on
	}

	public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #workgroupMemoryExplicitLayout()
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout(int workgroupMemoryExplicitLayout) {
    	WORKGROUP_MEMORY_EXPLICIT_LAYOUT_HANDLE.set(segment, 0L, workgroupMemoryExplicitLayout);
    	return this;
    }
    
    public int workgroupMemoryExplicitLayout() {
    	return (int) WORKGROUP_MEMORY_EXPLICIT_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #workgroupMemoryExplicitLayoutScalarBlockLayout()
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayoutScalarBlockLayout(int workgroupMemoryExplicitLayoutScalarBlockLayout) {
    	WORKGROUP_MEMORY_EXPLICIT_LAYOUT_SCALAR_BLOCK_LAYOUT_HANDLE.set(segment, 0L, workgroupMemoryExplicitLayoutScalarBlockLayout);
    	return this;
    }
    
    public int workgroupMemoryExplicitLayoutScalarBlockLayout() {
    	return (int) WORKGROUP_MEMORY_EXPLICIT_LAYOUT_SCALAR_BLOCK_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #workgroupMemoryExplicitLayout8BitAccess()
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout8BitAccess(int workgroupMemoryExplicitLayout8BitAccess) {
    	WORKGROUP_MEMORY_EXPLICIT_LAYOUT8_BIT_ACCESS_HANDLE.set(segment, 0L, workgroupMemoryExplicitLayout8BitAccess);
    	return this;
    }
    
    public int workgroupMemoryExplicitLayout8BitAccess() {
    	return (int) WORKGROUP_MEMORY_EXPLICIT_LAYOUT8_BIT_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #workgroupMemoryExplicitLayout16BitAccess()
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout16BitAccess(int workgroupMemoryExplicitLayout16BitAccess) {
    	WORKGROUP_MEMORY_EXPLICIT_LAYOUT16_BIT_ACCESS_HANDLE.set(segment, 0L, workgroupMemoryExplicitLayout16BitAccess);
    	return this;
    }
    
    public int workgroupMemoryExplicitLayout16BitAccess() {
    	return (int) WORKGROUP_MEMORY_EXPLICIT_LAYOUT16_BIT_ACCESS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR set(VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR> array(SegmentAllocator allocator, VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(segment)
        );
    }

}