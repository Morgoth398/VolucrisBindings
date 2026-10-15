/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
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

public final class VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV
		implements Struct<VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SPHERES_HANDLE;
	public static final VarHandle LINEAR_SWEPT_SPHERES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SPHERES_BYTE_OFFSET;
	public static final long LINEAR_SWEPT_SPHERES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("spheres"),
		    JAVA_INT.withName("linearSweptSpheres")
		).withName("VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SPHERES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("spheres"));
		LINEAR_SWEPT_SPHERES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("linearSweptSpheres"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SPHERES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("spheres"));
		LINEAR_SWEPT_SPHERES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linearSweptSpheres"));
		//@formatter:on
	}

	public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #spheres()
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV spheres(int spheres) {
    	SPHERES_HANDLE.set(segment, 0L, spheres);
    	return this;
    }
    
    public int spheres() {
    	return (int) SPHERES_HANDLE.get(segment, 0L);
    }
    
    /// @see #linearSweptSpheres()
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV linearSweptSpheres(int linearSweptSpheres) {
    	LINEAR_SWEPT_SPHERES_HANDLE.set(segment, 0L, linearSweptSpheres);
    	return this;
    }
    
    public int linearSweptSpheres() {
    	return (int) LINEAR_SWEPT_SPHERES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV set(VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV> array(Arena arena, VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(segment)
        );
    }

}