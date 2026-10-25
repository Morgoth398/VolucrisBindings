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

public final class VkPhysicalDeviceCooperativeMatrixInfo2EXT
		implements Struct<VkPhysicalDeviceCooperativeMatrixInfo2EXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SCOPE_HANDLE;
	public static final VarHandle INVOCATIONS_HANDLE;
	public static final VarHandle SUBGROUP_SIZE_HANDLE;
	public static final VarHandle FLAGS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SCOPE_BYTE_OFFSET;
	public static final long INVOCATIONS_BYTE_OFFSET;
	public static final long SUBGROUP_SIZE_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("scope"),
		    JAVA_INT.withName("invocations"),
		    JAVA_INT.withName("subgroupSize"),
		    JAVA_INT.withName("flags")
		).withName("VkPhysicalDeviceCooperativeMatrixInfo2EXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SCOPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("scope"));
		INVOCATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("invocations"));
		SUBGROUP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subgroupSize"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SCOPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("scope"));
		INVOCATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("invocations"));
		SUBGROUP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subgroupSize"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		//@formatter:on
	}

	public VkPhysicalDeviceCooperativeMatrixInfo2EXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceCooperativeMatrixInfo2EXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceCooperativeMatrixInfo2EXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceCooperativeMatrixInfo2EXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceCooperativeMatrixInfo2EXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #scope()
    public VkPhysicalDeviceCooperativeMatrixInfo2EXT scope(int scope) {
    	SCOPE_HANDLE.set(segment, 0L, scope);
    	return this;
    }
    
    public int scope() {
    	return (int) SCOPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #invocations()
    public VkPhysicalDeviceCooperativeMatrixInfo2EXT invocations(int invocations) {
    	INVOCATIONS_HANDLE.set(segment, 0L, invocations);
    	return this;
    }
    
    public int invocations() {
    	return (int) INVOCATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #subgroupSize()
    public VkPhysicalDeviceCooperativeMatrixInfo2EXT subgroupSize(int subgroupSize) {
    	SUBGROUP_SIZE_HANDLE.set(segment, 0L, subgroupSize);
    	return this;
    }
    
    public int subgroupSize() {
    	return (int) SUBGROUP_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VkPhysicalDeviceCooperativeMatrixInfo2EXT flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceCooperativeMatrixInfo2EXT set(VkPhysicalDeviceCooperativeMatrixInfo2EXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceCooperativeMatrixInfo2EXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceCooperativeMatrixInfo2EXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeMatrixInfo2EXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeMatrixInfo2EXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeMatrixInfo2EXT> array(SegmentAllocator allocator, VkPhysicalDeviceCooperativeMatrixInfo2EXT... structs) {
        NativeStructArray<VkPhysicalDeviceCooperativeMatrixInfo2EXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeMatrixInfo2EXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeMatrixInfo2EXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeMatrixInfo2EXT(segment)
        );
    }

}