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

public final class VkPhysicalDeviceVertexAttributeDivisorProperties
		implements Struct<VkPhysicalDeviceVertexAttributeDivisorProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAX_VERTEX_ATTRIB_DIVISOR_HANDLE;
	public static final VarHandle SUPPORTS_NON_ZERO_FIRST_INSTANCE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAX_VERTEX_ATTRIB_DIVISOR_BYTE_OFFSET;
	public static final long SUPPORTS_NON_ZERO_FIRST_INSTANCE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("maxVertexAttribDivisor"),
		    JAVA_INT.withName("supportsNonZeroFirstInstance")
		).withName("VkPhysicalDeviceVertexAttributeDivisorProperties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAX_VERTEX_ATTRIB_DIVISOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxVertexAttribDivisor"));
		SUPPORTS_NON_ZERO_FIRST_INSTANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportsNonZeroFirstInstance"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAX_VERTEX_ATTRIB_DIVISOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxVertexAttribDivisor"));
		SUPPORTS_NON_ZERO_FIRST_INSTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportsNonZeroFirstInstance"));
		//@formatter:on
	}

	public VkPhysicalDeviceVertexAttributeDivisorProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceVertexAttributeDivisorProperties(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceVertexAttributeDivisorProperties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceVertexAttributeDivisorProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceVertexAttributeDivisorProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxVertexAttribDivisor()
    public VkPhysicalDeviceVertexAttributeDivisorProperties maxVertexAttribDivisor(int maxVertexAttribDivisor) {
    	MAX_VERTEX_ATTRIB_DIVISOR_HANDLE.set(segment, 0L, maxVertexAttribDivisor);
    	return this;
    }
    
    public int maxVertexAttribDivisor() {
    	return (int) MAX_VERTEX_ATTRIB_DIVISOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportsNonZeroFirstInstance()
    public VkPhysicalDeviceVertexAttributeDivisorProperties supportsNonZeroFirstInstance(int supportsNonZeroFirstInstance) {
    	SUPPORTS_NON_ZERO_FIRST_INSTANCE_HANDLE.set(segment, 0L, supportsNonZeroFirstInstance);
    	return this;
    }
    
    public int supportsNonZeroFirstInstance() {
    	return (int) SUPPORTS_NON_ZERO_FIRST_INSTANCE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceVertexAttributeDivisorProperties set(VkPhysicalDeviceVertexAttributeDivisorProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceVertexAttributeDivisorProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceVertexAttributeDivisorProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceVertexAttributeDivisorProperties> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceVertexAttributeDivisorProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceVertexAttributeDivisorProperties> array(SegmentAllocator allocator, VkPhysicalDeviceVertexAttributeDivisorProperties... structs) {
        NativeStructArray<VkPhysicalDeviceVertexAttributeDivisorProperties> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceVertexAttributeDivisorProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceVertexAttributeDivisorProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceVertexAttributeDivisorProperties(segment)
        );
    }

}