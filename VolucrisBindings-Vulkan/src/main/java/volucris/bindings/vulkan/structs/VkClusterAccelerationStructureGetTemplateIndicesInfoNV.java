/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkClusterAccelerationStructureGetTemplateIndicesInfoNV
		implements Struct<VkClusterAccelerationStructureGetTemplateIndicesInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CLUSTER_TEMPLATE_ADDRESS_HANDLE;

	public static final long CLUSTER_TEMPLATE_ADDRESS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_LONG.withName("clusterTemplateAddress")
		).withName("VkClusterAccelerationStructureGetTemplateIndicesInfoNV").withByteAlignment(8);
		
		CLUSTER_TEMPLATE_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clusterTemplateAddress"));
		
		CLUSTER_TEMPLATE_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clusterTemplateAddress"));
		//@formatter:on
	}

	public VkClusterAccelerationStructureGetTemplateIndicesInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkClusterAccelerationStructureGetTemplateIndicesInfoNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkClusterAccelerationStructureGetTemplateIndicesInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #clusterTemplateAddress()
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV clusterTemplateAddress(long clusterTemplateAddress) {
    	CLUSTER_TEMPLATE_ADDRESS_HANDLE.set(segment, 0L, clusterTemplateAddress);
    	return this;
    }
    
    public long clusterTemplateAddress() {
    	return (long) CLUSTER_TEMPLATE_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV set(VkClusterAccelerationStructureGetTemplateIndicesInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkClusterAccelerationStructureGetTemplateIndicesInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureGetTemplateIndicesInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureGetTemplateIndicesInfoNV> array(Arena arena, VkClusterAccelerationStructureGetTemplateIndicesInfoNV... structs) {
        NativeStructArray<VkClusterAccelerationStructureGetTemplateIndicesInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureGetTemplateIndicesInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(segment)
        );
    }

}