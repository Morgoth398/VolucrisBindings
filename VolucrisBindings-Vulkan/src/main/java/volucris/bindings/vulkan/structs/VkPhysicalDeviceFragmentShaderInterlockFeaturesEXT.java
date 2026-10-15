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

public final class VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT
		implements Struct<VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FRAGMENT_SHADER_SAMPLE_INTERLOCK_HANDLE;
	public static final VarHandle FRAGMENT_SHADER_PIXEL_INTERLOCK_HANDLE;
	public static final VarHandle FRAGMENT_SHADER_SHADING_RATE_INTERLOCK_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FRAGMENT_SHADER_SAMPLE_INTERLOCK_BYTE_OFFSET;
	public static final long FRAGMENT_SHADER_PIXEL_INTERLOCK_BYTE_OFFSET;
	public static final long FRAGMENT_SHADER_SHADING_RATE_INTERLOCK_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("fragmentShaderSampleInterlock"),
		    JAVA_INT.withName("fragmentShaderPixelInterlock"),
		    JAVA_INT.withName("fragmentShaderShadingRateInterlock"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FRAGMENT_SHADER_SAMPLE_INTERLOCK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentShaderSampleInterlock"));
		FRAGMENT_SHADER_PIXEL_INTERLOCK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentShaderPixelInterlock"));
		FRAGMENT_SHADER_SHADING_RATE_INTERLOCK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentShaderShadingRateInterlock"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FRAGMENT_SHADER_SAMPLE_INTERLOCK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentShaderSampleInterlock"));
		FRAGMENT_SHADER_PIXEL_INTERLOCK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentShaderPixelInterlock"));
		FRAGMENT_SHADER_SHADING_RATE_INTERLOCK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentShaderShadingRateInterlock"));
		//@formatter:on
	}

	public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #fragmentShaderSampleInterlock()
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderSampleInterlock(int fragmentShaderSampleInterlock) {
    	FRAGMENT_SHADER_SAMPLE_INTERLOCK_HANDLE.set(segment, 0L, fragmentShaderSampleInterlock);
    	return this;
    }
    
    public int fragmentShaderSampleInterlock() {
    	return (int) FRAGMENT_SHADER_SAMPLE_INTERLOCK_HANDLE.get(segment, 0L);
    }
    
    /// @see #fragmentShaderPixelInterlock()
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderPixelInterlock(int fragmentShaderPixelInterlock) {
    	FRAGMENT_SHADER_PIXEL_INTERLOCK_HANDLE.set(segment, 0L, fragmentShaderPixelInterlock);
    	return this;
    }
    
    public int fragmentShaderPixelInterlock() {
    	return (int) FRAGMENT_SHADER_PIXEL_INTERLOCK_HANDLE.get(segment, 0L);
    }
    
    /// @see #fragmentShaderShadingRateInterlock()
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderShadingRateInterlock(int fragmentShaderShadingRateInterlock) {
    	FRAGMENT_SHADER_SHADING_RATE_INTERLOCK_HANDLE.set(segment, 0L, fragmentShaderShadingRateInterlock);
    	return this;
    }
    
    public int fragmentShaderShadingRateInterlock() {
    	return (int) FRAGMENT_SHADER_SHADING_RATE_INTERLOCK_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT set(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT> array(Arena arena, VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(segment)
        );
    }

}