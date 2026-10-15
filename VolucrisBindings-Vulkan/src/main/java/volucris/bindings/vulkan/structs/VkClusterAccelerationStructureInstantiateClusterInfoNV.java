/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkClusterAccelerationStructureInstantiateClusterInfoNV
		implements Struct<VkClusterAccelerationStructureInstantiateClusterInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CLUSTER_ID_OFFSET_HANDLE;
	public static final VarHandle BIT_FIELDS0_HANDLE;
	public static final VarHandle CLUSTER_TEMPLATE_ADDRESS_HANDLE;

	public static final long CLUSTER_ID_OFFSET_BYTE_OFFSET;
	public static final long BIT_FIELDS0_BYTE_OFFSET;
	public static final long CLUSTER_TEMPLATE_ADDRESS_BYTE_OFFSET;
	public static final long VERTEX_BUFFER_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkStridedDeviceAddressNV vertexBuffer;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("clusterIdOffset"),
		    JAVA_INT.withName("bitFields0"),
		    JAVA_LONG.withName("clusterTemplateAddress"),
		    VkStridedDeviceAddressNV.LAYOUT.withName("vertexBuffer")
		).withName("VkClusterAccelerationStructureInstantiateClusterInfoNV").withByteAlignment(8);
		
		CLUSTER_ID_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clusterIdOffset"));
		BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
		CLUSTER_TEMPLATE_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clusterTemplateAddress"));
		
		CLUSTER_ID_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clusterIdOffset"));
		BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
		CLUSTER_TEMPLATE_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clusterTemplateAddress"));
		VERTEX_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexBuffer"));
		//@formatter:on
	}

	public VkClusterAccelerationStructureInstantiateClusterInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkClusterAccelerationStructureInstantiateClusterInfoNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkClusterAccelerationStructureInstantiateClusterInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	    vertexBuffer = new VkStridedDeviceAddressNV(segment.asSlice(VERTEX_BUFFER_BYTE_OFFSET, VkStridedDeviceAddressNV.LAYOUT));
	}

    /// @see #clusterIdOffset()
    public VkClusterAccelerationStructureInstantiateClusterInfoNV clusterIdOffset(int clusterIdOffset) {
    	CLUSTER_ID_OFFSET_HANDLE.set(segment, 0L, clusterIdOffset);
    	return this;
    }
    
    public int clusterIdOffset() {
    	return (int) CLUSTER_ID_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #bitFields0()
    public VkClusterAccelerationStructureInstantiateClusterInfoNV bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// geometryIndexOffset : 24
    /// reserved : 8
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    /// @see #clusterTemplateAddress()
    public VkClusterAccelerationStructureInstantiateClusterInfoNV clusterTemplateAddress(long clusterTemplateAddress) {
    	CLUSTER_TEMPLATE_ADDRESS_HANDLE.set(segment, 0L, clusterTemplateAddress);
    	return this;
    }
    
    public long clusterTemplateAddress() {
    	return (long) CLUSTER_TEMPLATE_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexBuffer()
    public VkClusterAccelerationStructureInstantiateClusterInfoNV vertexBuffer(Consumer<VkStridedDeviceAddressNV> consumer) {
    	consumer.accept(vertexBuffer);
    	return this;
    }
    
    /// @see #vertexBuffer()
    public VkClusterAccelerationStructureInstantiateClusterInfoNV vertexBuffer(VkStridedDeviceAddressNV other) {
    	vertexBuffer.set(other);
    	return this;
    }
    
    public VkStridedDeviceAddressNV vertexBuffer() {
    	return vertexBuffer;
    }
    
    @Override
    public VkClusterAccelerationStructureInstantiateClusterInfoNV set(VkClusterAccelerationStructureInstantiateClusterInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkClusterAccelerationStructureInstantiateClusterInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkClusterAccelerationStructureInstantiateClusterInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureInstantiateClusterInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureInstantiateClusterInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureInstantiateClusterInfoNV> array(Arena arena, VkClusterAccelerationStructureInstantiateClusterInfoNV... structs) {
        NativeStructArray<VkClusterAccelerationStructureInstantiateClusterInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureInstantiateClusterInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureInstantiateClusterInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureInstantiateClusterInfoNV(segment)
        );
    }

}