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

public final class VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL
		implements Struct<VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADER_INTEGER_FUNCTIONS2_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADER_INTEGER_FUNCTIONS2_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("shaderIntegerFunctions2"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADER_INTEGER_FUNCTIONS2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderIntegerFunctions2"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADER_INTEGER_FUNCTIONS2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderIntegerFunctions2"));
		//@formatter:on
	}

	public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderIntegerFunctions2()
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL shaderIntegerFunctions2(int shaderIntegerFunctions2) {
    	SHADER_INTEGER_FUNCTIONS2_HANDLE.set(segment, 0L, shaderIntegerFunctions2);
    	return this;
    }
    
    public int shaderIntegerFunctions2() {
    	return (int) SHADER_INTEGER_FUNCTIONS2_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL set(VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL> array(SegmentAllocator allocator, VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL... structs) {
        NativeStructArray<VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(segment)
        );
    }

}