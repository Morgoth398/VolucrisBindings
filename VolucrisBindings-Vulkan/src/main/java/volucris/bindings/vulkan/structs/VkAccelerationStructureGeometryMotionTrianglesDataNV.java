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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkAccelerationStructureGeometryMotionTrianglesDataNV
		implements Struct<VkAccelerationStructureGeometryMotionTrianglesDataNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long VERTEX_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkDeviceOrHostAddressConstKHR vertexData;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkDeviceOrHostAddressConstKHR.LAYOUT.withName("vertexData")
		).withName("VkAccelerationStructureGeometryMotionTrianglesDataNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		VERTEX_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexData"));
		//@formatter:on
	}

	public VkAccelerationStructureGeometryMotionTrianglesDataNV() {
	    this(Arena.ofAuto());
	}
	
	public VkAccelerationStructureGeometryMotionTrianglesDataNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkAccelerationStructureGeometryMotionTrianglesDataNV(MemorySegment segment) {
	    this.segment = segment;
	
	    vertexData = new VkDeviceOrHostAddressConstKHR(segment.asSlice(VERTEX_DATA_BYTE_OFFSET, VkDeviceOrHostAddressConstKHR.LAYOUT));
	}

    /// @see #sType()
    public VkAccelerationStructureGeometryMotionTrianglesDataNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAccelerationStructureGeometryMotionTrianglesDataNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #vertexData()
    public VkAccelerationStructureGeometryMotionTrianglesDataNV vertexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
    	consumer.accept(vertexData);
    	return this;
    }
    
    /// @see #vertexData()
    public VkAccelerationStructureGeometryMotionTrianglesDataNV vertexData(VkDeviceOrHostAddressConstKHR other) {
    	vertexData.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressConstKHR vertexData() {
    	return vertexData;
    }
    
    @Override
    public VkAccelerationStructureGeometryMotionTrianglesDataNV set(VkAccelerationStructureGeometryMotionTrianglesDataNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureGeometryMotionTrianglesDataNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureGeometryMotionTrianglesDataNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryMotionTrianglesDataNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryMotionTrianglesDataNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryMotionTrianglesDataNV> array(Arena arena, VkAccelerationStructureGeometryMotionTrianglesDataNV... structs) {
        NativeStructArray<VkAccelerationStructureGeometryMotionTrianglesDataNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryMotionTrianglesDataNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryMotionTrianglesDataNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryMotionTrianglesDataNV(segment)
        );
    }

}