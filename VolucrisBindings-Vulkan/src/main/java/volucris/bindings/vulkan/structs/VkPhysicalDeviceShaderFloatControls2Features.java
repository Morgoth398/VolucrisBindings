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

public final class VkPhysicalDeviceShaderFloatControls2Features
		implements Struct<VkPhysicalDeviceShaderFloatControls2Features> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADER_FLOAT_CONTROLS2_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADER_FLOAT_CONTROLS2_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("shaderFloatControls2"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceShaderFloatControls2Features").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADER_FLOAT_CONTROLS2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderFloatControls2"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADER_FLOAT_CONTROLS2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderFloatControls2"));
		//@formatter:on
	}

	public VkPhysicalDeviceShaderFloatControls2Features() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceShaderFloatControls2Features(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceShaderFloatControls2Features(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceShaderFloatControls2Features sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderFloatControls2Features pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderFloatControls2()
    public VkPhysicalDeviceShaderFloatControls2Features shaderFloatControls2(int shaderFloatControls2) {
    	SHADER_FLOAT_CONTROLS2_HANDLE.set(segment, 0L, shaderFloatControls2);
    	return this;
    }
    
    public int shaderFloatControls2() {
    	return (int) SHADER_FLOAT_CONTROLS2_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderFloatControls2Features set(VkPhysicalDeviceShaderFloatControls2Features other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderFloatControls2Features set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderFloatControls2Features> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderFloatControls2Features> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderFloatControls2Features(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderFloatControls2Features> array(SegmentAllocator allocator, VkPhysicalDeviceShaderFloatControls2Features... structs) {
        NativeStructArray<VkPhysicalDeviceShaderFloatControls2Features> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderFloatControls2Features(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderFloatControls2Features> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderFloatControls2Features(segment)
        );
    }

}