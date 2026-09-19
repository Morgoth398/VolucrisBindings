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

public final class VkPhysicalDeviceDescriptorIndexingFeatures
		implements Struct<VkPhysicalDeviceDescriptorIndexingFeatures> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SHADER_INPUT_ATTACHMENT_ARRAY_DYNAMIC_INDEXING_HANDLE;
    public static final VarHandle SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE;
    public static final VarHandle SHADER_STORAGE_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE;
    public static final VarHandle SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE;
    public static final VarHandle SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_HANDLE;
    public static final VarHandle SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE;
    public static final VarHandle SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_HANDLE;
    public static final VarHandle SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_HANDLE;
    public static final VarHandle SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE;
    public static final VarHandle SHADER_STORAGE_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE;
    public static final VarHandle DESCRIPTOR_BINDING_UNIFORM_BUFFER_UPDATE_AFTER_BIND_HANDLE;
    public static final VarHandle DESCRIPTOR_BINDING_SAMPLED_IMAGE_UPDATE_AFTER_BIND_HANDLE;
    public static final VarHandle DESCRIPTOR_BINDING_STORAGE_IMAGE_UPDATE_AFTER_BIND_HANDLE;
    public static final VarHandle DESCRIPTOR_BINDING_STORAGE_BUFFER_UPDATE_AFTER_BIND_HANDLE;
    public static final VarHandle DESCRIPTOR_BINDING_UNIFORM_TEXEL_BUFFER_UPDATE_AFTER_BIND_HANDLE;
    public static final VarHandle DESCRIPTOR_BINDING_STORAGE_TEXEL_BUFFER_UPDATE_AFTER_BIND_HANDLE;
    public static final VarHandle DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_HANDLE;
    public static final VarHandle DESCRIPTOR_BINDING_PARTIALLY_BOUND_HANDLE;
    public static final VarHandle DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_HANDLE;
    public static final VarHandle RUNTIME_DESCRIPTOR_ARRAY_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SHADER_INPUT_ATTACHMENT_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET;
    public static final long SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET;
    public static final long SHADER_STORAGE_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET;
    public static final long SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET;
    public static final long SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET;
    public static final long SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET;
    public static final long SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET;
    public static final long SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET;
    public static final long SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET;
    public static final long SHADER_STORAGE_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET;
    public static final long DESCRIPTOR_BINDING_UNIFORM_BUFFER_UPDATE_AFTER_BIND_BYTE_OFFSET;
    public static final long DESCRIPTOR_BINDING_SAMPLED_IMAGE_UPDATE_AFTER_BIND_BYTE_OFFSET;
    public static final long DESCRIPTOR_BINDING_STORAGE_IMAGE_UPDATE_AFTER_BIND_BYTE_OFFSET;
    public static final long DESCRIPTOR_BINDING_STORAGE_BUFFER_UPDATE_AFTER_BIND_BYTE_OFFSET;
    public static final long DESCRIPTOR_BINDING_UNIFORM_TEXEL_BUFFER_UPDATE_AFTER_BIND_BYTE_OFFSET;
    public static final long DESCRIPTOR_BINDING_STORAGE_TEXEL_BUFFER_UPDATE_AFTER_BIND_BYTE_OFFSET;
    public static final long DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BYTE_OFFSET;
    public static final long DESCRIPTOR_BINDING_PARTIALLY_BOUND_BYTE_OFFSET;
    public static final long DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BYTE_OFFSET;
    public static final long RUNTIME_DESCRIPTOR_ARRAY_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("shaderInputAttachmentArrayDynamicIndexing"),
            JAVA_INT.withName("shaderUniformTexelBufferArrayDynamicIndexing"),
            JAVA_INT.withName("shaderStorageTexelBufferArrayDynamicIndexing"),
            JAVA_INT.withName("shaderUniformBufferArrayNonUniformIndexing"),
            JAVA_INT.withName("shaderSampledImageArrayNonUniformIndexing"),
            JAVA_INT.withName("shaderStorageBufferArrayNonUniformIndexing"),
            JAVA_INT.withName("shaderStorageImageArrayNonUniformIndexing"),
            JAVA_INT.withName("shaderInputAttachmentArrayNonUniformIndexing"),
            JAVA_INT.withName("shaderUniformTexelBufferArrayNonUniformIndexing"),
            JAVA_INT.withName("shaderStorageTexelBufferArrayNonUniformIndexing"),
            JAVA_INT.withName("descriptorBindingUniformBufferUpdateAfterBind"),
            JAVA_INT.withName("descriptorBindingSampledImageUpdateAfterBind"),
            JAVA_INT.withName("descriptorBindingStorageImageUpdateAfterBind"),
            JAVA_INT.withName("descriptorBindingStorageBufferUpdateAfterBind"),
            JAVA_INT.withName("descriptorBindingUniformTexelBufferUpdateAfterBind"),
            JAVA_INT.withName("descriptorBindingStorageTexelBufferUpdateAfterBind"),
            JAVA_INT.withName("descriptorBindingUpdateUnusedWhilePending"),
            JAVA_INT.withName("descriptorBindingPartiallyBound"),
            JAVA_INT.withName("descriptorBindingVariableDescriptorCount"),
            JAVA_INT.withName("runtimeDescriptorArray")
        ).withName("VkPhysicalDeviceDescriptorIndexingFeatures").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SHADER_INPUT_ATTACHMENT_ARRAY_DYNAMIC_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderInputAttachmentArrayDynamicIndexing"));
        SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderUniformTexelBufferArrayDynamicIndexing"));
        SHADER_STORAGE_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStorageTexelBufferArrayDynamicIndexing"));
        SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexing"));
        SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexing"));
        SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexing"));
        SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexing"));
        SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexing"));
        SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderUniformTexelBufferArrayNonUniformIndexing"));
        SHADER_STORAGE_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStorageTexelBufferArrayNonUniformIndexing"));
        DESCRIPTOR_BINDING_UNIFORM_BUFFER_UPDATE_AFTER_BIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingUniformBufferUpdateAfterBind"));
        DESCRIPTOR_BINDING_SAMPLED_IMAGE_UPDATE_AFTER_BIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingSampledImageUpdateAfterBind"));
        DESCRIPTOR_BINDING_STORAGE_IMAGE_UPDATE_AFTER_BIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingStorageImageUpdateAfterBind"));
        DESCRIPTOR_BINDING_STORAGE_BUFFER_UPDATE_AFTER_BIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingStorageBufferUpdateAfterBind"));
        DESCRIPTOR_BINDING_UNIFORM_TEXEL_BUFFER_UPDATE_AFTER_BIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingUniformTexelBufferUpdateAfterBind"));
        DESCRIPTOR_BINDING_STORAGE_TEXEL_BUFFER_UPDATE_AFTER_BIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingStorageTexelBufferUpdateAfterBind"));
        DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingUpdateUnusedWhilePending"));
        DESCRIPTOR_BINDING_PARTIALLY_BOUND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingPartiallyBound"));
        DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingVariableDescriptorCount"));
        RUNTIME_DESCRIPTOR_ARRAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("runtimeDescriptorArray"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SHADER_INPUT_ATTACHMENT_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderInputAttachmentArrayDynamicIndexing"));
        SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformTexelBufferArrayDynamicIndexing"));
        SHADER_STORAGE_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageTexelBufferArrayDynamicIndexing"));
        SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexing"));
        SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexing"));
        SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexing"));
        SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexing"));
        SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexing"));
        SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformTexelBufferArrayNonUniformIndexing"));
        SHADER_STORAGE_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageTexelBufferArrayNonUniformIndexing"));
        DESCRIPTOR_BINDING_UNIFORM_BUFFER_UPDATE_AFTER_BIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingUniformBufferUpdateAfterBind"));
        DESCRIPTOR_BINDING_SAMPLED_IMAGE_UPDATE_AFTER_BIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingSampledImageUpdateAfterBind"));
        DESCRIPTOR_BINDING_STORAGE_IMAGE_UPDATE_AFTER_BIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingStorageImageUpdateAfterBind"));
        DESCRIPTOR_BINDING_STORAGE_BUFFER_UPDATE_AFTER_BIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingStorageBufferUpdateAfterBind"));
        DESCRIPTOR_BINDING_UNIFORM_TEXEL_BUFFER_UPDATE_AFTER_BIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingUniformTexelBufferUpdateAfterBind"));
        DESCRIPTOR_BINDING_STORAGE_TEXEL_BUFFER_UPDATE_AFTER_BIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingStorageTexelBufferUpdateAfterBind"));
        DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingUpdateUnusedWhilePending"));
        DESCRIPTOR_BINDING_PARTIALLY_BOUND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingPartiallyBound"));
        DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingVariableDescriptorCount"));
        RUNTIME_DESCRIPTOR_ARRAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("runtimeDescriptorArray"));
        //@formatter:on
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceDescriptorIndexingFeatures(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceDescriptorIndexingFeatures(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceDescriptorIndexingFeatures sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDescriptorIndexingFeatures pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderInputAttachmentArrayDynamicIndexing()
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayDynamicIndexing(int shaderInputAttachmentArrayDynamicIndexing) {
    	SHADER_INPUT_ATTACHMENT_ARRAY_DYNAMIC_INDEXING_HANDLE.set(segment, 0L, shaderInputAttachmentArrayDynamicIndexing);
    	return this;
    }
    
    public int shaderInputAttachmentArrayDynamicIndexing() {
    	return (int) SHADER_INPUT_ATTACHMENT_ARRAY_DYNAMIC_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderUniformTexelBufferArrayDynamicIndexing()
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayDynamicIndexing(int shaderUniformTexelBufferArrayDynamicIndexing) {
    	SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE.set(segment, 0L, shaderUniformTexelBufferArrayDynamicIndexing);
    	return this;
    }
    
    public int shaderUniformTexelBufferArrayDynamicIndexing() {
    	return (int) SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageTexelBufferArrayDynamicIndexing()
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayDynamicIndexing(int shaderStorageTexelBufferArrayDynamicIndexing) {
    	SHADER_STORAGE_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE.set(segment, 0L, shaderStorageTexelBufferArrayDynamicIndexing);
    	return this;
    }
    
    public int shaderStorageTexelBufferArrayDynamicIndexing() {
    	return (int) SHADER_STORAGE_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderUniformBufferArrayNonUniformIndexing()
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformBufferArrayNonUniformIndexing(int shaderUniformBufferArrayNonUniformIndexing) {
    	SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE.set(segment, 0L, shaderUniformBufferArrayNonUniformIndexing);
    	return this;
    }
    
    public int shaderUniformBufferArrayNonUniformIndexing() {
    	return (int) SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSampledImageArrayNonUniformIndexing()
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderSampledImageArrayNonUniformIndexing(int shaderSampledImageArrayNonUniformIndexing) {
    	SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_HANDLE.set(segment, 0L, shaderSampledImageArrayNonUniformIndexing);
    	return this;
    }
    
    public int shaderSampledImageArrayNonUniformIndexing() {
    	return (int) SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageBufferArrayNonUniformIndexing()
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageBufferArrayNonUniformIndexing(int shaderStorageBufferArrayNonUniformIndexing) {
    	SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE.set(segment, 0L, shaderStorageBufferArrayNonUniformIndexing);
    	return this;
    }
    
    public int shaderStorageBufferArrayNonUniformIndexing() {
    	return (int) SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageImageArrayNonUniformIndexing()
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageImageArrayNonUniformIndexing(int shaderStorageImageArrayNonUniformIndexing) {
    	SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_HANDLE.set(segment, 0L, shaderStorageImageArrayNonUniformIndexing);
    	return this;
    }
    
    public int shaderStorageImageArrayNonUniformIndexing() {
    	return (int) SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderInputAttachmentArrayNonUniformIndexing()
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayNonUniformIndexing(int shaderInputAttachmentArrayNonUniformIndexing) {
    	SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_HANDLE.set(segment, 0L, shaderInputAttachmentArrayNonUniformIndexing);
    	return this;
    }
    
    public int shaderInputAttachmentArrayNonUniformIndexing() {
    	return (int) SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderUniformTexelBufferArrayNonUniformIndexing()
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayNonUniformIndexing(int shaderUniformTexelBufferArrayNonUniformIndexing) {
    	SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE.set(segment, 0L, shaderUniformTexelBufferArrayNonUniformIndexing);
    	return this;
    }
    
    public int shaderUniformTexelBufferArrayNonUniformIndexing() {
    	return (int) SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageTexelBufferArrayNonUniformIndexing()
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayNonUniformIndexing(int shaderStorageTexelBufferArrayNonUniformIndexing) {
    	SHADER_STORAGE_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE.set(segment, 0L, shaderStorageTexelBufferArrayNonUniformIndexing);
    	return this;
    }
    
    public int shaderStorageTexelBufferArrayNonUniformIndexing() {
    	return (int) SHADER_STORAGE_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingUniformBufferUpdateAfterBind()
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformBufferUpdateAfterBind(int descriptorBindingUniformBufferUpdateAfterBind) {
    	DESCRIPTOR_BINDING_UNIFORM_BUFFER_UPDATE_AFTER_BIND_HANDLE.set(segment, 0L, descriptorBindingUniformBufferUpdateAfterBind);
    	return this;
    }
    
    public int descriptorBindingUniformBufferUpdateAfterBind() {
    	return (int) DESCRIPTOR_BINDING_UNIFORM_BUFFER_UPDATE_AFTER_BIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingSampledImageUpdateAfterBind()
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingSampledImageUpdateAfterBind(int descriptorBindingSampledImageUpdateAfterBind) {
    	DESCRIPTOR_BINDING_SAMPLED_IMAGE_UPDATE_AFTER_BIND_HANDLE.set(segment, 0L, descriptorBindingSampledImageUpdateAfterBind);
    	return this;
    }
    
    public int descriptorBindingSampledImageUpdateAfterBind() {
    	return (int) DESCRIPTOR_BINDING_SAMPLED_IMAGE_UPDATE_AFTER_BIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingStorageImageUpdateAfterBind()
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageImageUpdateAfterBind(int descriptorBindingStorageImageUpdateAfterBind) {
    	DESCRIPTOR_BINDING_STORAGE_IMAGE_UPDATE_AFTER_BIND_HANDLE.set(segment, 0L, descriptorBindingStorageImageUpdateAfterBind);
    	return this;
    }
    
    public int descriptorBindingStorageImageUpdateAfterBind() {
    	return (int) DESCRIPTOR_BINDING_STORAGE_IMAGE_UPDATE_AFTER_BIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingStorageBufferUpdateAfterBind()
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageBufferUpdateAfterBind(int descriptorBindingStorageBufferUpdateAfterBind) {
    	DESCRIPTOR_BINDING_STORAGE_BUFFER_UPDATE_AFTER_BIND_HANDLE.set(segment, 0L, descriptorBindingStorageBufferUpdateAfterBind);
    	return this;
    }
    
    public int descriptorBindingStorageBufferUpdateAfterBind() {
    	return (int) DESCRIPTOR_BINDING_STORAGE_BUFFER_UPDATE_AFTER_BIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingUniformTexelBufferUpdateAfterBind()
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformTexelBufferUpdateAfterBind(int descriptorBindingUniformTexelBufferUpdateAfterBind) {
    	DESCRIPTOR_BINDING_UNIFORM_TEXEL_BUFFER_UPDATE_AFTER_BIND_HANDLE.set(segment, 0L, descriptorBindingUniformTexelBufferUpdateAfterBind);
    	return this;
    }
    
    public int descriptorBindingUniformTexelBufferUpdateAfterBind() {
    	return (int) DESCRIPTOR_BINDING_UNIFORM_TEXEL_BUFFER_UPDATE_AFTER_BIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingStorageTexelBufferUpdateAfterBind()
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageTexelBufferUpdateAfterBind(int descriptorBindingStorageTexelBufferUpdateAfterBind) {
    	DESCRIPTOR_BINDING_STORAGE_TEXEL_BUFFER_UPDATE_AFTER_BIND_HANDLE.set(segment, 0L, descriptorBindingStorageTexelBufferUpdateAfterBind);
    	return this;
    }
    
    public int descriptorBindingStorageTexelBufferUpdateAfterBind() {
    	return (int) DESCRIPTOR_BINDING_STORAGE_TEXEL_BUFFER_UPDATE_AFTER_BIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingUpdateUnusedWhilePending()
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUpdateUnusedWhilePending(int descriptorBindingUpdateUnusedWhilePending) {
    	DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_HANDLE.set(segment, 0L, descriptorBindingUpdateUnusedWhilePending);
    	return this;
    }
    
    public int descriptorBindingUpdateUnusedWhilePending() {
    	return (int) DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingPartiallyBound()
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingPartiallyBound(int descriptorBindingPartiallyBound) {
    	DESCRIPTOR_BINDING_PARTIALLY_BOUND_HANDLE.set(segment, 0L, descriptorBindingPartiallyBound);
    	return this;
    }
    
    public int descriptorBindingPartiallyBound() {
    	return (int) DESCRIPTOR_BINDING_PARTIALLY_BOUND_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingVariableDescriptorCount()
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingVariableDescriptorCount(int descriptorBindingVariableDescriptorCount) {
    	DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_HANDLE.set(segment, 0L, descriptorBindingVariableDescriptorCount);
    	return this;
    }
    
    public int descriptorBindingVariableDescriptorCount() {
    	return (int) DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #runtimeDescriptorArray()
    public VkPhysicalDeviceDescriptorIndexingFeatures runtimeDescriptorArray(int runtimeDescriptorArray) {
    	RUNTIME_DESCRIPTOR_ARRAY_HANDLE.set(segment, 0L, runtimeDescriptorArray);
    	return this;
    }
    
    public int runtimeDescriptorArray() {
    	return (int) RUNTIME_DESCRIPTOR_ARRAY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeatures set(VkPhysicalDeviceDescriptorIndexingFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDescriptorIndexingFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorIndexingFeatures> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorIndexingFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorIndexingFeatures> array(Arena arena, VkPhysicalDeviceDescriptorIndexingFeatures... structs) {
        NativeStructArray<VkPhysicalDeviceDescriptorIndexingFeatures> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorIndexingFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorIndexingFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorIndexingFeatures(segment)
        );
    }
    
}