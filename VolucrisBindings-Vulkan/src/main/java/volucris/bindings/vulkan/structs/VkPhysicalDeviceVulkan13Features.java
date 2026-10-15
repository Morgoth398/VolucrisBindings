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

public final class VkPhysicalDeviceVulkan13Features
		implements Struct<VkPhysicalDeviceVulkan13Features> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ROBUST_IMAGE_ACCESS_HANDLE;
	public static final VarHandle INLINE_UNIFORM_BLOCK_HANDLE;
	public static final VarHandle DESCRIPTOR_BINDING_INLINE_UNIFORM_BLOCK_UPDATE_AFTER_BIND_HANDLE;
	public static final VarHandle PIPELINE_CREATION_CACHE_CONTROL_HANDLE;
	public static final VarHandle PRIVATE_DATA_HANDLE;
	public static final VarHandle SHADER_DEMOTE_TO_HELPER_INVOCATION_HANDLE;
	public static final VarHandle SHADER_TERMINATE_INVOCATION_HANDLE;
	public static final VarHandle SUBGROUP_SIZE_CONTROL_HANDLE;
	public static final VarHandle COMPUTE_FULL_SUBGROUPS_HANDLE;
	public static final VarHandle SYNCHRONIZATION2_HANDLE;
	public static final VarHandle TEXTURE_COMPRESSION_ASTC_HDR_HANDLE;
	public static final VarHandle SHADER_ZERO_INITIALIZE_WORKGROUP_MEMORY_HANDLE;
	public static final VarHandle DYNAMIC_RENDERING_HANDLE;
	public static final VarHandle SHADER_INTEGER_DOT_PRODUCT_HANDLE;
	public static final VarHandle MAINTENANCE4_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ROBUST_IMAGE_ACCESS_BYTE_OFFSET;
	public static final long INLINE_UNIFORM_BLOCK_BYTE_OFFSET;
	public static final long DESCRIPTOR_BINDING_INLINE_UNIFORM_BLOCK_UPDATE_AFTER_BIND_BYTE_OFFSET;
	public static final long PIPELINE_CREATION_CACHE_CONTROL_BYTE_OFFSET;
	public static final long PRIVATE_DATA_BYTE_OFFSET;
	public static final long SHADER_DEMOTE_TO_HELPER_INVOCATION_BYTE_OFFSET;
	public static final long SHADER_TERMINATE_INVOCATION_BYTE_OFFSET;
	public static final long SUBGROUP_SIZE_CONTROL_BYTE_OFFSET;
	public static final long COMPUTE_FULL_SUBGROUPS_BYTE_OFFSET;
	public static final long SYNCHRONIZATION2_BYTE_OFFSET;
	public static final long TEXTURE_COMPRESSION_ASTC_HDR_BYTE_OFFSET;
	public static final long SHADER_ZERO_INITIALIZE_WORKGROUP_MEMORY_BYTE_OFFSET;
	public static final long DYNAMIC_RENDERING_BYTE_OFFSET;
	public static final long SHADER_INTEGER_DOT_PRODUCT_BYTE_OFFSET;
	public static final long MAINTENANCE4_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("robustImageAccess"),
		    JAVA_INT.withName("inlineUniformBlock"),
		    JAVA_INT.withName("descriptorBindingInlineUniformBlockUpdateAfterBind"),
		    JAVA_INT.withName("pipelineCreationCacheControl"),
		    JAVA_INT.withName("privateData"),
		    JAVA_INT.withName("shaderDemoteToHelperInvocation"),
		    JAVA_INT.withName("shaderTerminateInvocation"),
		    JAVA_INT.withName("subgroupSizeControl"),
		    JAVA_INT.withName("computeFullSubgroups"),
		    JAVA_INT.withName("synchronization2"),
		    JAVA_INT.withName("textureCompressionASTC_HDR"),
		    JAVA_INT.withName("shaderZeroInitializeWorkgroupMemory"),
		    JAVA_INT.withName("dynamicRendering"),
		    JAVA_INT.withName("shaderIntegerDotProduct"),
		    JAVA_INT.withName("maintenance4"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceVulkan13Features").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ROBUST_IMAGE_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("robustImageAccess"));
		INLINE_UNIFORM_BLOCK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inlineUniformBlock"));
		DESCRIPTOR_BINDING_INLINE_UNIFORM_BLOCK_UPDATE_AFTER_BIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind"));
		PIPELINE_CREATION_CACHE_CONTROL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineCreationCacheControl"));
		PRIVATE_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("privateData"));
		SHADER_DEMOTE_TO_HELPER_INVOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderDemoteToHelperInvocation"));
		SHADER_TERMINATE_INVOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderTerminateInvocation"));
		SUBGROUP_SIZE_CONTROL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subgroupSizeControl"));
		COMPUTE_FULL_SUBGROUPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("computeFullSubgroups"));
		SYNCHRONIZATION2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("synchronization2"));
		TEXTURE_COMPRESSION_ASTC_HDR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("textureCompressionASTC_HDR"));
		SHADER_ZERO_INITIALIZE_WORKGROUP_MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderZeroInitializeWorkgroupMemory"));
		DYNAMIC_RENDERING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dynamicRendering"));
		SHADER_INTEGER_DOT_PRODUCT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderIntegerDotProduct"));
		MAINTENANCE4_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maintenance4"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ROBUST_IMAGE_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("robustImageAccess"));
		INLINE_UNIFORM_BLOCK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inlineUniformBlock"));
		DESCRIPTOR_BINDING_INLINE_UNIFORM_BLOCK_UPDATE_AFTER_BIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind"));
		PIPELINE_CREATION_CACHE_CONTROL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineCreationCacheControl"));
		PRIVATE_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("privateData"));
		SHADER_DEMOTE_TO_HELPER_INVOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderDemoteToHelperInvocation"));
		SHADER_TERMINATE_INVOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderTerminateInvocation"));
		SUBGROUP_SIZE_CONTROL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subgroupSizeControl"));
		COMPUTE_FULL_SUBGROUPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("computeFullSubgroups"));
		SYNCHRONIZATION2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("synchronization2"));
		TEXTURE_COMPRESSION_ASTC_HDR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("textureCompressionASTC_HDR"));
		SHADER_ZERO_INITIALIZE_WORKGROUP_MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderZeroInitializeWorkgroupMemory"));
		DYNAMIC_RENDERING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dynamicRendering"));
		SHADER_INTEGER_DOT_PRODUCT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderIntegerDotProduct"));
		MAINTENANCE4_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maintenance4"));
		//@formatter:on
	}

	public VkPhysicalDeviceVulkan13Features() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceVulkan13Features(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceVulkan13Features(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceVulkan13Features sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceVulkan13Features pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #robustImageAccess()
    public VkPhysicalDeviceVulkan13Features robustImageAccess(int robustImageAccess) {
    	ROBUST_IMAGE_ACCESS_HANDLE.set(segment, 0L, robustImageAccess);
    	return this;
    }
    
    public int robustImageAccess() {
    	return (int) ROBUST_IMAGE_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #inlineUniformBlock()
    public VkPhysicalDeviceVulkan13Features inlineUniformBlock(int inlineUniformBlock) {
    	INLINE_UNIFORM_BLOCK_HANDLE.set(segment, 0L, inlineUniformBlock);
    	return this;
    }
    
    public int inlineUniformBlock() {
    	return (int) INLINE_UNIFORM_BLOCK_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingInlineUniformBlockUpdateAfterBind()
    public VkPhysicalDeviceVulkan13Features descriptorBindingInlineUniformBlockUpdateAfterBind(int descriptorBindingInlineUniformBlockUpdateAfterBind) {
    	DESCRIPTOR_BINDING_INLINE_UNIFORM_BLOCK_UPDATE_AFTER_BIND_HANDLE.set(segment, 0L, descriptorBindingInlineUniformBlockUpdateAfterBind);
    	return this;
    }
    
    public int descriptorBindingInlineUniformBlockUpdateAfterBind() {
    	return (int) DESCRIPTOR_BINDING_INLINE_UNIFORM_BLOCK_UPDATE_AFTER_BIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #pipelineCreationCacheControl()
    public VkPhysicalDeviceVulkan13Features pipelineCreationCacheControl(int pipelineCreationCacheControl) {
    	PIPELINE_CREATION_CACHE_CONTROL_HANDLE.set(segment, 0L, pipelineCreationCacheControl);
    	return this;
    }
    
    public int pipelineCreationCacheControl() {
    	return (int) PIPELINE_CREATION_CACHE_CONTROL_HANDLE.get(segment, 0L);
    }
    
    /// @see #privateData()
    public VkPhysicalDeviceVulkan13Features privateData(int privateData) {
    	PRIVATE_DATA_HANDLE.set(segment, 0L, privateData);
    	return this;
    }
    
    public int privateData() {
    	return (int) PRIVATE_DATA_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderDemoteToHelperInvocation()
    public VkPhysicalDeviceVulkan13Features shaderDemoteToHelperInvocation(int shaderDemoteToHelperInvocation) {
    	SHADER_DEMOTE_TO_HELPER_INVOCATION_HANDLE.set(segment, 0L, shaderDemoteToHelperInvocation);
    	return this;
    }
    
    public int shaderDemoteToHelperInvocation() {
    	return (int) SHADER_DEMOTE_TO_HELPER_INVOCATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderTerminateInvocation()
    public VkPhysicalDeviceVulkan13Features shaderTerminateInvocation(int shaderTerminateInvocation) {
    	SHADER_TERMINATE_INVOCATION_HANDLE.set(segment, 0L, shaderTerminateInvocation);
    	return this;
    }
    
    public int shaderTerminateInvocation() {
    	return (int) SHADER_TERMINATE_INVOCATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #subgroupSizeControl()
    public VkPhysicalDeviceVulkan13Features subgroupSizeControl(int subgroupSizeControl) {
    	SUBGROUP_SIZE_CONTROL_HANDLE.set(segment, 0L, subgroupSizeControl);
    	return this;
    }
    
    public int subgroupSizeControl() {
    	return (int) SUBGROUP_SIZE_CONTROL_HANDLE.get(segment, 0L);
    }
    
    /// @see #computeFullSubgroups()
    public VkPhysicalDeviceVulkan13Features computeFullSubgroups(int computeFullSubgroups) {
    	COMPUTE_FULL_SUBGROUPS_HANDLE.set(segment, 0L, computeFullSubgroups);
    	return this;
    }
    
    public int computeFullSubgroups() {
    	return (int) COMPUTE_FULL_SUBGROUPS_HANDLE.get(segment, 0L);
    }
    
    /// @see #synchronization2()
    public VkPhysicalDeviceVulkan13Features synchronization2(int synchronization2) {
    	SYNCHRONIZATION2_HANDLE.set(segment, 0L, synchronization2);
    	return this;
    }
    
    public int synchronization2() {
    	return (int) SYNCHRONIZATION2_HANDLE.get(segment, 0L);
    }
    
    /// @see #textureCompressionASTC_HDR()
    public VkPhysicalDeviceVulkan13Features textureCompressionASTC_HDR(int textureCompressionASTC_HDR) {
    	TEXTURE_COMPRESSION_ASTC_HDR_HANDLE.set(segment, 0L, textureCompressionASTC_HDR);
    	return this;
    }
    
    public int textureCompressionASTC_HDR() {
    	return (int) TEXTURE_COMPRESSION_ASTC_HDR_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderZeroInitializeWorkgroupMemory()
    public VkPhysicalDeviceVulkan13Features shaderZeroInitializeWorkgroupMemory(int shaderZeroInitializeWorkgroupMemory) {
    	SHADER_ZERO_INITIALIZE_WORKGROUP_MEMORY_HANDLE.set(segment, 0L, shaderZeroInitializeWorkgroupMemory);
    	return this;
    }
    
    public int shaderZeroInitializeWorkgroupMemory() {
    	return (int) SHADER_ZERO_INITIALIZE_WORKGROUP_MEMORY_HANDLE.get(segment, 0L);
    }
    
    /// @see #dynamicRendering()
    public VkPhysicalDeviceVulkan13Features dynamicRendering(int dynamicRendering) {
    	DYNAMIC_RENDERING_HANDLE.set(segment, 0L, dynamicRendering);
    	return this;
    }
    
    public int dynamicRendering() {
    	return (int) DYNAMIC_RENDERING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderIntegerDotProduct()
    public VkPhysicalDeviceVulkan13Features shaderIntegerDotProduct(int shaderIntegerDotProduct) {
    	SHADER_INTEGER_DOT_PRODUCT_HANDLE.set(segment, 0L, shaderIntegerDotProduct);
    	return this;
    }
    
    public int shaderIntegerDotProduct() {
    	return (int) SHADER_INTEGER_DOT_PRODUCT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maintenance4()
    public VkPhysicalDeviceVulkan13Features maintenance4(int maintenance4) {
    	MAINTENANCE4_HANDLE.set(segment, 0L, maintenance4);
    	return this;
    }
    
    public int maintenance4() {
    	return (int) MAINTENANCE4_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceVulkan13Features set(VkPhysicalDeviceVulkan13Features other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceVulkan13Features set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceVulkan13Features> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan13Features> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan13Features(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan13Features> array(Arena arena, VkPhysicalDeviceVulkan13Features... structs) {
        NativeStructArray<VkPhysicalDeviceVulkan13Features> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan13Features(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan13Features> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan13Features(segment)
        );
    }

}