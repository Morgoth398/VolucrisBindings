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

public final class VkDescriptorUpdateTemplateCreateInfo
		implements Struct<VkDescriptorUpdateTemplateCreateInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle DESCRIPTOR_UPDATE_ENTRY_COUNT_HANDLE;
    public static final VarHandle P_DESCRIPTOR_UPDATE_ENTRIES_HANDLE;
    public static final VarHandle TEMPLATE_TYPE_HANDLE;
    public static final VarHandle DESCRIPTOR_SET_LAYOUT_HANDLE;
    public static final VarHandle PIPELINE_BIND_POINT_HANDLE;
    public static final VarHandle PIPELINE_LAYOUT_HANDLE;
    public static final VarHandle SET_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long DESCRIPTOR_UPDATE_ENTRY_COUNT_BYTE_OFFSET;
    public static final long P_DESCRIPTOR_UPDATE_ENTRIES_BYTE_OFFSET;
    public static final long TEMPLATE_TYPE_BYTE_OFFSET;
    public static final long DESCRIPTOR_SET_LAYOUT_BYTE_OFFSET;
    public static final long PIPELINE_BIND_POINT_BYTE_OFFSET;
    public static final long PIPELINE_LAYOUT_BYTE_OFFSET;
    public static final long SET_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            JAVA_INT.withName("descriptorUpdateEntryCount"),
            UNBOUNDED_ADDRESS.withName("pDescriptorUpdateEntries"),
            JAVA_INT.withName("templateType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("descriptorSetLayout"),
            JAVA_INT.withName("pipelineBindPoint"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pipelineLayout"),
            JAVA_INT.withName("set"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkDescriptorUpdateTemplateCreateInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        DESCRIPTOR_UPDATE_ENTRY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorUpdateEntryCount"));
        P_DESCRIPTOR_UPDATE_ENTRIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDescriptorUpdateEntries"));
        TEMPLATE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("templateType"));
        DESCRIPTOR_SET_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorSetLayout"));
        PIPELINE_BIND_POINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineBindPoint"));
        PIPELINE_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineLayout"));
        SET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("set"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        DESCRIPTOR_UPDATE_ENTRY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorUpdateEntryCount"));
        P_DESCRIPTOR_UPDATE_ENTRIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDescriptorUpdateEntries"));
        TEMPLATE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("templateType"));
        DESCRIPTOR_SET_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetLayout"));
        PIPELINE_BIND_POINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineBindPoint"));
        PIPELINE_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineLayout"));
        SET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("set"));
        //@formatter:on
    }

    public VkDescriptorUpdateTemplateCreateInfo() {
        this(Arena.ofAuto());
    }
    
    public VkDescriptorUpdateTemplateCreateInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDescriptorUpdateTemplateCreateInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDescriptorUpdateTemplateCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDescriptorUpdateTemplateCreateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkDescriptorUpdateTemplateCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorUpdateEntryCount()
    public VkDescriptorUpdateTemplateCreateInfo descriptorUpdateEntryCount(int descriptorUpdateEntryCount) {
    	DESCRIPTOR_UPDATE_ENTRY_COUNT_HANDLE.set(segment, 0L, descriptorUpdateEntryCount);
    	return this;
    }
    
    public int descriptorUpdateEntryCount() {
    	return (int) DESCRIPTOR_UPDATE_ENTRY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDescriptorUpdateEntries()
    public VkDescriptorUpdateTemplateCreateInfo pDescriptorUpdateEntries(NativeStructArray<VkDescriptorUpdateTemplateEntry> pDescriptorUpdateEntries) {
    	P_DESCRIPTOR_UPDATE_ENTRIES_HANDLE.set(segment, 0L, pDescriptorUpdateEntries.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkDescriptorUpdateTemplateEntry> pDescriptorUpdateEntries() {
    	MemorySegment segment = (MemorySegment) P_DESCRIPTOR_UPDATE_ENTRIES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkDescriptorUpdateTemplateEntry.array(segment);
    }
    
    /// @see #templateType()
    public VkDescriptorUpdateTemplateCreateInfo templateType(int templateType) {
    	TEMPLATE_TYPE_HANDLE.set(segment, 0L, templateType);
    	return this;
    }
    
    public int templateType() {
    	return (int) TEMPLATE_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorSetLayout()
    public VkDescriptorUpdateTemplateCreateInfo descriptorSetLayout(VkDescriptorSetLayout descriptorSetLayout) {
    	DESCRIPTOR_SET_LAYOUT_HANDLE.set(segment, 0L, descriptorSetLayout.memorySegment());
    	return this;
    }
    
    public @Nullable VkDescriptorSetLayout descriptorSetLayout() {
    	MemorySegment segment = (MemorySegment) DESCRIPTOR_SET_LAYOUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDescriptorSetLayout(segment);
    }
    
    /// @see #pipelineBindPoint()
    public VkDescriptorUpdateTemplateCreateInfo pipelineBindPoint(int pipelineBindPoint) {
    	PIPELINE_BIND_POINT_HANDLE.set(segment, 0L, pipelineBindPoint);
    	return this;
    }
    
    public int pipelineBindPoint() {
    	return (int) PIPELINE_BIND_POINT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pipelineLayout()
    public VkDescriptorUpdateTemplateCreateInfo pipelineLayout(VkPipelineLayout pipelineLayout) {
    	PIPELINE_LAYOUT_HANDLE.set(segment, 0L, pipelineLayout.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineLayout pipelineLayout() {
    	MemorySegment segment = (MemorySegment) PIPELINE_LAYOUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineLayout(segment);
    }
    
    /// @see #set()
    public VkDescriptorUpdateTemplateCreateInfo set(int set) {
    	SET_HANDLE.set(segment, 0L, set);
    	return this;
    }
    
    public int set() {
    	return (int) SET_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDescriptorUpdateTemplateCreateInfo set(VkDescriptorUpdateTemplateCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorUpdateTemplateCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorUpdateTemplateCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorUpdateTemplateCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorUpdateTemplateCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorUpdateTemplateCreateInfo> array(Arena arena, VkDescriptorUpdateTemplateCreateInfo... structs) {
        NativeStructArray<VkDescriptorUpdateTemplateCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorUpdateTemplateCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorUpdateTemplateCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorUpdateTemplateCreateInfo(segment)
        );
    }
    
}