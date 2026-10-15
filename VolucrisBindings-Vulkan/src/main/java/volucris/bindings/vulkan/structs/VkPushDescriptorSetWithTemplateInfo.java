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

public final class VkPushDescriptorSetWithTemplateInfo
		implements Struct<VkPushDescriptorSetWithTemplateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DESCRIPTOR_UPDATE_TEMPLATE_HANDLE;
	public static final VarHandle LAYOUT_HANDLE;
	public static final VarHandle SET_HANDLE;
	public static final VarHandle P_DATA_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DESCRIPTOR_UPDATE_TEMPLATE_BYTE_OFFSET;
	public static final long LAYOUT_BYTE_OFFSET;
	public static final long SET_BYTE_OFFSET;
	public static final long P_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("descriptorUpdateTemplate"),
		    UNBOUNDED_ADDRESS.withName("layout"),
		    JAVA_INT.withName("set"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pData")
		).withName("VkPushDescriptorSetWithTemplateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DESCRIPTOR_UPDATE_TEMPLATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorUpdateTemplate"));
		LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layout"));
		SET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("set"));
		P_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pData"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DESCRIPTOR_UPDATE_TEMPLATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorUpdateTemplate"));
		LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layout"));
		SET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("set"));
		P_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pData"));
		//@formatter:on
	}

	public VkPushDescriptorSetWithTemplateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkPushDescriptorSetWithTemplateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPushDescriptorSetWithTemplateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPushDescriptorSetWithTemplateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPushDescriptorSetWithTemplateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #descriptorUpdateTemplate()
    public VkPushDescriptorSetWithTemplateInfo descriptorUpdateTemplate(VkDescriptorUpdateTemplate descriptorUpdateTemplate) {
    	DESCRIPTOR_UPDATE_TEMPLATE_HANDLE.set(segment, 0L, descriptorUpdateTemplate.memorySegment());
    	return this;
    }
    
    public @Nullable VkDescriptorUpdateTemplate descriptorUpdateTemplate() {
    	MemorySegment segment = (MemorySegment) DESCRIPTOR_UPDATE_TEMPLATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDescriptorUpdateTemplate(segment);
    }
    
    /// @see #layout()
    public VkPushDescriptorSetWithTemplateInfo layout(VkPipelineLayout layout) {
    	LAYOUT_HANDLE.set(segment, 0L, layout.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineLayout layout() {
    	MemorySegment segment = (MemorySegment) LAYOUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineLayout(segment);
    }
    
    /// @see #set()
    public VkPushDescriptorSetWithTemplateInfo set(int set) {
    	SET_HANDLE.set(segment, 0L, set);
    	return this;
    }
    
    public int set() {
    	return (int) SET_HANDLE.get(segment, 0L);
    }
    
    /// @see #pData()
    public VkPushDescriptorSetWithTemplateInfo pData(MemorySegment pData) {
    	P_DATA_HANDLE.set(segment, 0L, pData);
    	return this;
    }
    
    public @Nullable MemorySegment pData() {
    	MemorySegment segment = (MemorySegment) P_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VkPushDescriptorSetWithTemplateInfo set(VkPushDescriptorSetWithTemplateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkPushDescriptorSetWithTemplateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPushDescriptorSetWithTemplateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPushDescriptorSetWithTemplateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPushDescriptorSetWithTemplateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPushDescriptorSetWithTemplateInfo> array(Arena arena, VkPushDescriptorSetWithTemplateInfo... structs) {
        NativeStructArray<VkPushDescriptorSetWithTemplateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPushDescriptorSetWithTemplateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPushDescriptorSetWithTemplateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPushDescriptorSetWithTemplateInfo(segment)
        );
    }

}