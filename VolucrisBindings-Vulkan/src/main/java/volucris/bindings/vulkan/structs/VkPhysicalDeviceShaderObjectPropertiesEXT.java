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

public final class VkPhysicalDeviceShaderObjectPropertiesEXT
		implements Struct<VkPhysicalDeviceShaderObjectPropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADER_BINARY_UUID_HANDLE;
	public static final VarHandle SHADER_BINARY_VERSION_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADER_BINARY_UUID_BYTE_OFFSET;
	public static final long SHADER_BINARY_VERSION_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("shaderBinaryUUID"),
		    JAVA_INT.withName("shaderBinaryVersion"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceShaderObjectPropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADER_BINARY_UUID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderBinaryUUID"), PathElement.sequenceElement());
		SHADER_BINARY_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderBinaryVersion"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADER_BINARY_UUID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderBinaryUUID"));
		SHADER_BINARY_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderBinaryVersion"));
		//@formatter:on
	}

	public VkPhysicalDeviceShaderObjectPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceShaderObjectPropertiesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceShaderObjectPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceShaderObjectPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderObjectPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderBinaryUUID(int)
    public VkPhysicalDeviceShaderObjectPropertiesEXT shaderBinaryUUID(byte shaderBinaryUUID, int index0) {
    	SHADER_BINARY_UUID_HANDLE.set(segment, 0L, index0, shaderBinaryUUID);
    	return this;
    }
    
    public byte shaderBinaryUUID(int index0) {
    	return (byte) SHADER_BINARY_UUID_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #shaderBinaryVersion()
    public VkPhysicalDeviceShaderObjectPropertiesEXT shaderBinaryVersion(int shaderBinaryVersion) {
    	SHADER_BINARY_VERSION_HANDLE.set(segment, 0L, shaderBinaryVersion);
    	return this;
    }
    
    public int shaderBinaryVersion() {
    	return (int) SHADER_BINARY_VERSION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderObjectPropertiesEXT set(VkPhysicalDeviceShaderObjectPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderObjectPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderObjectPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderObjectPropertiesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderObjectPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderObjectPropertiesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceShaderObjectPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceShaderObjectPropertiesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderObjectPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderObjectPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderObjectPropertiesEXT(segment)
        );
    }

}