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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkShaderResourceUsageAMD
		implements Struct<VkShaderResourceUsageAMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle NUM_USED_VGPRS_HANDLE;
	public static final VarHandle NUM_USED_SGPRS_HANDLE;
	public static final VarHandle LDS_SIZE_PER_LOCAL_WORK_GROUP_HANDLE;
	public static final VarHandle LDS_USAGE_SIZE_IN_BYTES_HANDLE;
	public static final VarHandle SCRATCH_MEM_USAGE_IN_BYTES_HANDLE;

	public static final long NUM_USED_VGPRS_BYTE_OFFSET;
	public static final long NUM_USED_SGPRS_BYTE_OFFSET;
	public static final long LDS_SIZE_PER_LOCAL_WORK_GROUP_BYTE_OFFSET;
	public static final long LDS_USAGE_SIZE_IN_BYTES_BYTE_OFFSET;
	public static final long SCRATCH_MEM_USAGE_IN_BYTES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("numUsedVgprs"),
		    JAVA_INT.withName("numUsedSgprs"),
		    JAVA_INT.withName("ldsSizePerLocalWorkGroup"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("ldsUsageSizeInBytes"),
		    JAVA_LONG.withName("scratchMemUsageInBytes")
		).withName("VkShaderResourceUsageAMD").withByteAlignment(8);
		
		NUM_USED_VGPRS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numUsedVgprs"));
		NUM_USED_SGPRS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numUsedSgprs"));
		LDS_SIZE_PER_LOCAL_WORK_GROUP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ldsSizePerLocalWorkGroup"));
		LDS_USAGE_SIZE_IN_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ldsUsageSizeInBytes"));
		SCRATCH_MEM_USAGE_IN_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("scratchMemUsageInBytes"));
		
		NUM_USED_VGPRS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numUsedVgprs"));
		NUM_USED_SGPRS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numUsedSgprs"));
		LDS_SIZE_PER_LOCAL_WORK_GROUP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ldsSizePerLocalWorkGroup"));
		LDS_USAGE_SIZE_IN_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ldsUsageSizeInBytes"));
		SCRATCH_MEM_USAGE_IN_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("scratchMemUsageInBytes"));
		//@formatter:on
	}

	public VkShaderResourceUsageAMD() {
	    this(Arena.ofAuto());
	}
	
	public VkShaderResourceUsageAMD(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkShaderResourceUsageAMD(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #numUsedVgprs()
    public VkShaderResourceUsageAMD numUsedVgprs(int numUsedVgprs) {
    	NUM_USED_VGPRS_HANDLE.set(segment, 0L, numUsedVgprs);
    	return this;
    }
    
    public int numUsedVgprs() {
    	return (int) NUM_USED_VGPRS_HANDLE.get(segment, 0L);
    }
    
    /// @see #numUsedSgprs()
    public VkShaderResourceUsageAMD numUsedSgprs(int numUsedSgprs) {
    	NUM_USED_SGPRS_HANDLE.set(segment, 0L, numUsedSgprs);
    	return this;
    }
    
    public int numUsedSgprs() {
    	return (int) NUM_USED_SGPRS_HANDLE.get(segment, 0L);
    }
    
    /// @see #ldsSizePerLocalWorkGroup()
    public VkShaderResourceUsageAMD ldsSizePerLocalWorkGroup(int ldsSizePerLocalWorkGroup) {
    	LDS_SIZE_PER_LOCAL_WORK_GROUP_HANDLE.set(segment, 0L, ldsSizePerLocalWorkGroup);
    	return this;
    }
    
    public int ldsSizePerLocalWorkGroup() {
    	return (int) LDS_SIZE_PER_LOCAL_WORK_GROUP_HANDLE.get(segment, 0L);
    }
    
    /// @see #ldsUsageSizeInBytes()
    public VkShaderResourceUsageAMD ldsUsageSizeInBytes(long ldsUsageSizeInBytes) {
    	LDS_USAGE_SIZE_IN_BYTES_HANDLE.set(segment, 0L, ldsUsageSizeInBytes);
    	return this;
    }
    
    public long ldsUsageSizeInBytes() {
    	return (long) LDS_USAGE_SIZE_IN_BYTES_HANDLE.get(segment, 0L);
    }
    
    /// @see #scratchMemUsageInBytes()
    public VkShaderResourceUsageAMD scratchMemUsageInBytes(long scratchMemUsageInBytes) {
    	SCRATCH_MEM_USAGE_IN_BYTES_HANDLE.set(segment, 0L, scratchMemUsageInBytes);
    	return this;
    }
    
    public long scratchMemUsageInBytes() {
    	return (long) SCRATCH_MEM_USAGE_IN_BYTES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkShaderResourceUsageAMD set(VkShaderResourceUsageAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkShaderResourceUsageAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkShaderResourceUsageAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkShaderResourceUsageAMD> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkShaderResourceUsageAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkShaderResourceUsageAMD> array(SegmentAllocator allocator, VkShaderResourceUsageAMD... structs) {
        NativeStructArray<VkShaderResourceUsageAMD> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkShaderResourceUsageAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkShaderResourceUsageAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkShaderResourceUsageAMD(segment)
        );
    }

}