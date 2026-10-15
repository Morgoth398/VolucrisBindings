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

public final class VkPhysicalDeviceDepthBiasControlFeaturesEXT
		implements Struct<VkPhysicalDeviceDepthBiasControlFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DEPTH_BIAS_CONTROL_HANDLE;
	public static final VarHandle LEAST_REPRESENTABLE_VALUE_FORCE_UNORM_REPRESENTATION_HANDLE;
	public static final VarHandle FLOAT_REPRESENTATION_HANDLE;
	public static final VarHandle DEPTH_BIAS_EXACT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DEPTH_BIAS_CONTROL_BYTE_OFFSET;
	public static final long LEAST_REPRESENTABLE_VALUE_FORCE_UNORM_REPRESENTATION_BYTE_OFFSET;
	public static final long FLOAT_REPRESENTATION_BYTE_OFFSET;
	public static final long DEPTH_BIAS_EXACT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("depthBiasControl"),
		    JAVA_INT.withName("leastRepresentableValueForceUnormRepresentation"),
		    JAVA_INT.withName("floatRepresentation"),
		    JAVA_INT.withName("depthBiasExact")
		).withName("VkPhysicalDeviceDepthBiasControlFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DEPTH_BIAS_CONTROL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthBiasControl"));
		LEAST_REPRESENTABLE_VALUE_FORCE_UNORM_REPRESENTATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("leastRepresentableValueForceUnormRepresentation"));
		FLOAT_REPRESENTATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("floatRepresentation"));
		DEPTH_BIAS_EXACT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthBiasExact"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DEPTH_BIAS_CONTROL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthBiasControl"));
		LEAST_REPRESENTABLE_VALUE_FORCE_UNORM_REPRESENTATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("leastRepresentableValueForceUnormRepresentation"));
		FLOAT_REPRESENTATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("floatRepresentation"));
		DEPTH_BIAS_EXACT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthBiasExact"));
		//@formatter:on
	}

	public VkPhysicalDeviceDepthBiasControlFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceDepthBiasControlFeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceDepthBiasControlFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #depthBiasControl()
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT depthBiasControl(int depthBiasControl) {
    	DEPTH_BIAS_CONTROL_HANDLE.set(segment, 0L, depthBiasControl);
    	return this;
    }
    
    public int depthBiasControl() {
    	return (int) DEPTH_BIAS_CONTROL_HANDLE.get(segment, 0L);
    }
    
    /// @see #leastRepresentableValueForceUnormRepresentation()
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT leastRepresentableValueForceUnormRepresentation(int leastRepresentableValueForceUnormRepresentation) {
    	LEAST_REPRESENTABLE_VALUE_FORCE_UNORM_REPRESENTATION_HANDLE.set(segment, 0L, leastRepresentableValueForceUnormRepresentation);
    	return this;
    }
    
    public int leastRepresentableValueForceUnormRepresentation() {
    	return (int) LEAST_REPRESENTABLE_VALUE_FORCE_UNORM_REPRESENTATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #floatRepresentation()
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT floatRepresentation(int floatRepresentation) {
    	FLOAT_REPRESENTATION_HANDLE.set(segment, 0L, floatRepresentation);
    	return this;
    }
    
    public int floatRepresentation() {
    	return (int) FLOAT_REPRESENTATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthBiasExact()
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT depthBiasExact(int depthBiasExact) {
    	DEPTH_BIAS_EXACT_HANDLE.set(segment, 0L, depthBiasExact);
    	return this;
    }
    
    public int depthBiasExact() {
    	return (int) DEPTH_BIAS_EXACT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT set(VkPhysicalDeviceDepthBiasControlFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDepthBiasControlFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDepthBiasControlFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDepthBiasControlFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDepthBiasControlFeaturesEXT> array(Arena arena, VkPhysicalDeviceDepthBiasControlFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceDepthBiasControlFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDepthBiasControlFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDepthBiasControlFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDepthBiasControlFeaturesEXT(segment)
        );
    }

}