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

public final class VkAccelerationStructureGeometryKHR
		implements Struct<VkAccelerationStructureGeometryKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle GEOMETRY_TYPE_HANDLE;
	public static final VarHandle FLAGS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long GEOMETRY_TYPE_BYTE_OFFSET;
	public static final long GEOMETRY_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkAccelerationStructureGeometryDataKHR geometry;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("geometryType"),
		    MemoryLayout.paddingLayout(4),
		    VkAccelerationStructureGeometryDataKHR.LAYOUT.withName("geometry"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkAccelerationStructureGeometryKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		GEOMETRY_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("geometryType"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		GEOMETRY_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("geometryType"));
		GEOMETRY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("geometry"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		//@formatter:on
	}

	public VkAccelerationStructureGeometryKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkAccelerationStructureGeometryKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkAccelerationStructureGeometryKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    geometry = new VkAccelerationStructureGeometryDataKHR(segment.asSlice(GEOMETRY_BYTE_OFFSET, VkAccelerationStructureGeometryDataKHR.LAYOUT));
	}

    /// @see #sType()
    public VkAccelerationStructureGeometryKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAccelerationStructureGeometryKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #geometryType()
    public VkAccelerationStructureGeometryKHR geometryType(int geometryType) {
    	GEOMETRY_TYPE_HANDLE.set(segment, 0L, geometryType);
    	return this;
    }
    
    public int geometryType() {
    	return (int) GEOMETRY_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #geometry()
    public VkAccelerationStructureGeometryKHR geometry(Consumer<VkAccelerationStructureGeometryDataKHR> consumer) {
    	consumer.accept(geometry);
    	return this;
    }
    
    /// @see #geometry()
    public VkAccelerationStructureGeometryKHR geometry(VkAccelerationStructureGeometryDataKHR other) {
    	geometry.set(other);
    	return this;
    }
    
    public VkAccelerationStructureGeometryDataKHR geometry() {
    	return geometry;
    }
    
    /// @see #flags()
    public VkAccelerationStructureGeometryKHR flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkAccelerationStructureGeometryKHR set(VkAccelerationStructureGeometryKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureGeometryKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureGeometryKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryKHR> array(Arena arena, VkAccelerationStructureGeometryKHR... structs) {
        NativeStructArray<VkAccelerationStructureGeometryKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryKHR(segment)
        );
    }

}