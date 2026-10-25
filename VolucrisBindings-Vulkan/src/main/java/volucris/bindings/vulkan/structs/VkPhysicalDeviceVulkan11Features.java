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

public final class VkPhysicalDeviceVulkan11Features
		implements Struct<VkPhysicalDeviceVulkan11Features> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle STORAGE_BUFFER16_BIT_ACCESS_HANDLE;
	public static final VarHandle UNIFORM_AND_STORAGE_BUFFER16_BIT_ACCESS_HANDLE;
	public static final VarHandle STORAGE_PUSH_CONSTANT16_HANDLE;
	public static final VarHandle STORAGE_INPUT_OUTPUT16_HANDLE;
	public static final VarHandle MULTIVIEW_HANDLE;
	public static final VarHandle MULTIVIEW_GEOMETRY_SHADER_HANDLE;
	public static final VarHandle MULTIVIEW_TESSELLATION_SHADER_HANDLE;
	public static final VarHandle VARIABLE_POINTERS_STORAGE_BUFFER_HANDLE;
	public static final VarHandle VARIABLE_POINTERS_HANDLE;
	public static final VarHandle PROTECTED_MEMORY_HANDLE;
	public static final VarHandle SAMPLER_YCBCR_CONVERSION_HANDLE;
	public static final VarHandle SHADER_DRAW_PARAMETERS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long STORAGE_BUFFER16_BIT_ACCESS_BYTE_OFFSET;
	public static final long UNIFORM_AND_STORAGE_BUFFER16_BIT_ACCESS_BYTE_OFFSET;
	public static final long STORAGE_PUSH_CONSTANT16_BYTE_OFFSET;
	public static final long STORAGE_INPUT_OUTPUT16_BYTE_OFFSET;
	public static final long MULTIVIEW_BYTE_OFFSET;
	public static final long MULTIVIEW_GEOMETRY_SHADER_BYTE_OFFSET;
	public static final long MULTIVIEW_TESSELLATION_SHADER_BYTE_OFFSET;
	public static final long VARIABLE_POINTERS_STORAGE_BUFFER_BYTE_OFFSET;
	public static final long VARIABLE_POINTERS_BYTE_OFFSET;
	public static final long PROTECTED_MEMORY_BYTE_OFFSET;
	public static final long SAMPLER_YCBCR_CONVERSION_BYTE_OFFSET;
	public static final long SHADER_DRAW_PARAMETERS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("storageBuffer16BitAccess"),
		    JAVA_INT.withName("uniformAndStorageBuffer16BitAccess"),
		    JAVA_INT.withName("storagePushConstant16"),
		    JAVA_INT.withName("storageInputOutput16"),
		    JAVA_INT.withName("multiview"),
		    JAVA_INT.withName("multiviewGeometryShader"),
		    JAVA_INT.withName("multiviewTessellationShader"),
		    JAVA_INT.withName("variablePointersStorageBuffer"),
		    JAVA_INT.withName("variablePointers"),
		    JAVA_INT.withName("protectedMemory"),
		    JAVA_INT.withName("samplerYcbcrConversion"),
		    JAVA_INT.withName("shaderDrawParameters")
		).withName("VkPhysicalDeviceVulkan11Features").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		STORAGE_BUFFER16_BIT_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storageBuffer16BitAccess"));
		UNIFORM_AND_STORAGE_BUFFER16_BIT_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("uniformAndStorageBuffer16BitAccess"));
		STORAGE_PUSH_CONSTANT16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storagePushConstant16"));
		STORAGE_INPUT_OUTPUT16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storageInputOutput16"));
		MULTIVIEW_HANDLE = LAYOUT.varHandle(PathElement.groupElement("multiview"));
		MULTIVIEW_GEOMETRY_SHADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("multiviewGeometryShader"));
		MULTIVIEW_TESSELLATION_SHADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("multiviewTessellationShader"));
		VARIABLE_POINTERS_STORAGE_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("variablePointersStorageBuffer"));
		VARIABLE_POINTERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("variablePointers"));
		PROTECTED_MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("protectedMemory"));
		SAMPLER_YCBCR_CONVERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerYcbcrConversion"));
		SHADER_DRAW_PARAMETERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderDrawParameters"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		STORAGE_BUFFER16_BIT_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storageBuffer16BitAccess"));
		UNIFORM_AND_STORAGE_BUFFER16_BIT_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("uniformAndStorageBuffer16BitAccess"));
		STORAGE_PUSH_CONSTANT16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storagePushConstant16"));
		STORAGE_INPUT_OUTPUT16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storageInputOutput16"));
		MULTIVIEW_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("multiview"));
		MULTIVIEW_GEOMETRY_SHADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("multiviewGeometryShader"));
		MULTIVIEW_TESSELLATION_SHADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("multiviewTessellationShader"));
		VARIABLE_POINTERS_STORAGE_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("variablePointersStorageBuffer"));
		VARIABLE_POINTERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("variablePointers"));
		PROTECTED_MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("protectedMemory"));
		SAMPLER_YCBCR_CONVERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerYcbcrConversion"));
		SHADER_DRAW_PARAMETERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderDrawParameters"));
		//@formatter:on
	}

	public VkPhysicalDeviceVulkan11Features() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceVulkan11Features(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceVulkan11Features(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceVulkan11Features sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceVulkan11Features pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #storageBuffer16BitAccess()
    public VkPhysicalDeviceVulkan11Features storageBuffer16BitAccess(int storageBuffer16BitAccess) {
    	STORAGE_BUFFER16_BIT_ACCESS_HANDLE.set(segment, 0L, storageBuffer16BitAccess);
    	return this;
    }
    
    public int storageBuffer16BitAccess() {
    	return (int) STORAGE_BUFFER16_BIT_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #uniformAndStorageBuffer16BitAccess()
    public VkPhysicalDeviceVulkan11Features uniformAndStorageBuffer16BitAccess(int uniformAndStorageBuffer16BitAccess) {
    	UNIFORM_AND_STORAGE_BUFFER16_BIT_ACCESS_HANDLE.set(segment, 0L, uniformAndStorageBuffer16BitAccess);
    	return this;
    }
    
    public int uniformAndStorageBuffer16BitAccess() {
    	return (int) UNIFORM_AND_STORAGE_BUFFER16_BIT_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #storagePushConstant16()
    public VkPhysicalDeviceVulkan11Features storagePushConstant16(int storagePushConstant16) {
    	STORAGE_PUSH_CONSTANT16_HANDLE.set(segment, 0L, storagePushConstant16);
    	return this;
    }
    
    public int storagePushConstant16() {
    	return (int) STORAGE_PUSH_CONSTANT16_HANDLE.get(segment, 0L);
    }
    
    /// @see #storageInputOutput16()
    public VkPhysicalDeviceVulkan11Features storageInputOutput16(int storageInputOutput16) {
    	STORAGE_INPUT_OUTPUT16_HANDLE.set(segment, 0L, storageInputOutput16);
    	return this;
    }
    
    public int storageInputOutput16() {
    	return (int) STORAGE_INPUT_OUTPUT16_HANDLE.get(segment, 0L);
    }
    
    /// @see #multiview()
    public VkPhysicalDeviceVulkan11Features multiview(int multiview) {
    	MULTIVIEW_HANDLE.set(segment, 0L, multiview);
    	return this;
    }
    
    public int multiview() {
    	return (int) MULTIVIEW_HANDLE.get(segment, 0L);
    }
    
    /// @see #multiviewGeometryShader()
    public VkPhysicalDeviceVulkan11Features multiviewGeometryShader(int multiviewGeometryShader) {
    	MULTIVIEW_GEOMETRY_SHADER_HANDLE.set(segment, 0L, multiviewGeometryShader);
    	return this;
    }
    
    public int multiviewGeometryShader() {
    	return (int) MULTIVIEW_GEOMETRY_SHADER_HANDLE.get(segment, 0L);
    }
    
    /// @see #multiviewTessellationShader()
    public VkPhysicalDeviceVulkan11Features multiviewTessellationShader(int multiviewTessellationShader) {
    	MULTIVIEW_TESSELLATION_SHADER_HANDLE.set(segment, 0L, multiviewTessellationShader);
    	return this;
    }
    
    public int multiviewTessellationShader() {
    	return (int) MULTIVIEW_TESSELLATION_SHADER_HANDLE.get(segment, 0L);
    }
    
    /// @see #variablePointersStorageBuffer()
    public VkPhysicalDeviceVulkan11Features variablePointersStorageBuffer(int variablePointersStorageBuffer) {
    	VARIABLE_POINTERS_STORAGE_BUFFER_HANDLE.set(segment, 0L, variablePointersStorageBuffer);
    	return this;
    }
    
    public int variablePointersStorageBuffer() {
    	return (int) VARIABLE_POINTERS_STORAGE_BUFFER_HANDLE.get(segment, 0L);
    }
    
    /// @see #variablePointers()
    public VkPhysicalDeviceVulkan11Features variablePointers(int variablePointers) {
    	VARIABLE_POINTERS_HANDLE.set(segment, 0L, variablePointers);
    	return this;
    }
    
    public int variablePointers() {
    	return (int) VARIABLE_POINTERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #protectedMemory()
    public VkPhysicalDeviceVulkan11Features protectedMemory(int protectedMemory) {
    	PROTECTED_MEMORY_HANDLE.set(segment, 0L, protectedMemory);
    	return this;
    }
    
    public int protectedMemory() {
    	return (int) PROTECTED_MEMORY_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerYcbcrConversion()
    public VkPhysicalDeviceVulkan11Features samplerYcbcrConversion(int samplerYcbcrConversion) {
    	SAMPLER_YCBCR_CONVERSION_HANDLE.set(segment, 0L, samplerYcbcrConversion);
    	return this;
    }
    
    public int samplerYcbcrConversion() {
    	return (int) SAMPLER_YCBCR_CONVERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderDrawParameters()
    public VkPhysicalDeviceVulkan11Features shaderDrawParameters(int shaderDrawParameters) {
    	SHADER_DRAW_PARAMETERS_HANDLE.set(segment, 0L, shaderDrawParameters);
    	return this;
    }
    
    public int shaderDrawParameters() {
    	return (int) SHADER_DRAW_PARAMETERS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceVulkan11Features set(VkPhysicalDeviceVulkan11Features other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceVulkan11Features set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceVulkan11Features> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan11Features> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan11Features(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan11Features> array(SegmentAllocator allocator, VkPhysicalDeviceVulkan11Features... structs) {
        NativeStructArray<VkPhysicalDeviceVulkan11Features> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan11Features(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan11Features> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan11Features(segment)
        );
    }

}