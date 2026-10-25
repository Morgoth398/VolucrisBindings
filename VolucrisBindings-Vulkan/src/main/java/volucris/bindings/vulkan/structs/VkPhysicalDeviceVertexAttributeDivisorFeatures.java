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

public final class VkPhysicalDeviceVertexAttributeDivisorFeatures
		implements Struct<VkPhysicalDeviceVertexAttributeDivisorFeatures> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle VERTEX_ATTRIBUTE_INSTANCE_RATE_DIVISOR_HANDLE;
	public static final VarHandle VERTEX_ATTRIBUTE_INSTANCE_RATE_ZERO_DIVISOR_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long VERTEX_ATTRIBUTE_INSTANCE_RATE_DIVISOR_BYTE_OFFSET;
	public static final long VERTEX_ATTRIBUTE_INSTANCE_RATE_ZERO_DIVISOR_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("vertexAttributeInstanceRateDivisor"),
		    JAVA_INT.withName("vertexAttributeInstanceRateZeroDivisor")
		).withName("VkPhysicalDeviceVertexAttributeDivisorFeatures").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		VERTEX_ATTRIBUTE_INSTANCE_RATE_DIVISOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexAttributeInstanceRateDivisor"));
		VERTEX_ATTRIBUTE_INSTANCE_RATE_ZERO_DIVISOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		VERTEX_ATTRIBUTE_INSTANCE_RATE_DIVISOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexAttributeInstanceRateDivisor"));
		VERTEX_ATTRIBUTE_INSTANCE_RATE_ZERO_DIVISOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor"));
		//@formatter:on
	}

	public VkPhysicalDeviceVertexAttributeDivisorFeatures() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceVertexAttributeDivisorFeatures(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceVertexAttributeDivisorFeatures(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceVertexAttributeDivisorFeatures sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceVertexAttributeDivisorFeatures pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #vertexAttributeInstanceRateDivisor()
    public VkPhysicalDeviceVertexAttributeDivisorFeatures vertexAttributeInstanceRateDivisor(int vertexAttributeInstanceRateDivisor) {
    	VERTEX_ATTRIBUTE_INSTANCE_RATE_DIVISOR_HANDLE.set(segment, 0L, vertexAttributeInstanceRateDivisor);
    	return this;
    }
    
    public int vertexAttributeInstanceRateDivisor() {
    	return (int) VERTEX_ATTRIBUTE_INSTANCE_RATE_DIVISOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexAttributeInstanceRateZeroDivisor()
    public VkPhysicalDeviceVertexAttributeDivisorFeatures vertexAttributeInstanceRateZeroDivisor(int vertexAttributeInstanceRateZeroDivisor) {
    	VERTEX_ATTRIBUTE_INSTANCE_RATE_ZERO_DIVISOR_HANDLE.set(segment, 0L, vertexAttributeInstanceRateZeroDivisor);
    	return this;
    }
    
    public int vertexAttributeInstanceRateZeroDivisor() {
    	return (int) VERTEX_ATTRIBUTE_INSTANCE_RATE_ZERO_DIVISOR_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceVertexAttributeDivisorFeatures set(VkPhysicalDeviceVertexAttributeDivisorFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceVertexAttributeDivisorFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceVertexAttributeDivisorFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceVertexAttributeDivisorFeatures> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceVertexAttributeDivisorFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceVertexAttributeDivisorFeatures> array(SegmentAllocator allocator, VkPhysicalDeviceVertexAttributeDivisorFeatures... structs) {
        NativeStructArray<VkPhysicalDeviceVertexAttributeDivisorFeatures> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceVertexAttributeDivisorFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceVertexAttributeDivisorFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceVertexAttributeDivisorFeatures(segment)
        );
    }

}