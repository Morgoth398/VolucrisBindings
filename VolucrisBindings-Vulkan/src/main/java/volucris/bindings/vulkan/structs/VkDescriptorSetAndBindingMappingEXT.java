/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkDescriptorSetAndBindingMappingEXT
		implements Struct<VkDescriptorSetAndBindingMappingEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DESCRIPTOR_SET_HANDLE;
	public static final VarHandle FIRST_BINDING_HANDLE;
	public static final VarHandle BINDING_COUNT_HANDLE;
	public static final VarHandle RESOURCE_MASK_HANDLE;
	public static final VarHandle SOURCE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DESCRIPTOR_SET_BYTE_OFFSET;
	public static final long FIRST_BINDING_BYTE_OFFSET;
	public static final long BINDING_COUNT_BYTE_OFFSET;
	public static final long RESOURCE_MASK_BYTE_OFFSET;
	public static final long SOURCE_BYTE_OFFSET;
	public static final long SOURCE_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkDescriptorMappingSourceDataEXT sourceData;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("descriptorSet"),
		    JAVA_INT.withName("firstBinding"),
		    JAVA_INT.withName("bindingCount"),
		    JAVA_INT.withName("resourceMask"),
		    JAVA_INT.withName("source"),
		    MemoryLayout.paddingLayout(4),
		    VkDescriptorMappingSourceDataEXT.LAYOUT.withName("sourceData")
		).withName("VkDescriptorSetAndBindingMappingEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DESCRIPTOR_SET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorSet"));
		FIRST_BINDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("firstBinding"));
		BINDING_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bindingCount"));
		RESOURCE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("resourceMask"));
		SOURCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("source"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DESCRIPTOR_SET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorSet"));
		FIRST_BINDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("firstBinding"));
		BINDING_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bindingCount"));
		RESOURCE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resourceMask"));
		SOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("source"));
		SOURCE_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sourceData"));
		//@formatter:on
	}

	public VkDescriptorSetAndBindingMappingEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDescriptorSetAndBindingMappingEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDescriptorSetAndBindingMappingEXT(MemorySegment segment) {
	    this.segment = segment;
	
	    sourceData = new VkDescriptorMappingSourceDataEXT(segment.asSlice(SOURCE_DATA_BYTE_OFFSET, VkDescriptorMappingSourceDataEXT.LAYOUT));
	}

    /// @see #sType()
    public VkDescriptorSetAndBindingMappingEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDescriptorSetAndBindingMappingEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #descriptorSet()
    public VkDescriptorSetAndBindingMappingEXT descriptorSet(int descriptorSet) {
    	DESCRIPTOR_SET_HANDLE.set(segment, 0L, descriptorSet);
    	return this;
    }
    
    public int descriptorSet() {
    	return (int) DESCRIPTOR_SET_HANDLE.get(segment, 0L);
    }
    
    /// @see #firstBinding()
    public VkDescriptorSetAndBindingMappingEXT firstBinding(int firstBinding) {
    	FIRST_BINDING_HANDLE.set(segment, 0L, firstBinding);
    	return this;
    }
    
    public int firstBinding() {
    	return (int) FIRST_BINDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #bindingCount()
    public VkDescriptorSetAndBindingMappingEXT bindingCount(int bindingCount) {
    	BINDING_COUNT_HANDLE.set(segment, 0L, bindingCount);
    	return this;
    }
    
    public int bindingCount() {
    	return (int) BINDING_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #resourceMask()
    public VkDescriptorSetAndBindingMappingEXT resourceMask(int resourceMask) {
    	RESOURCE_MASK_HANDLE.set(segment, 0L, resourceMask);
    	return this;
    }
    
    public int resourceMask() {
    	return (int) RESOURCE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #source()
    public VkDescriptorSetAndBindingMappingEXT source(int source) {
    	SOURCE_HANDLE.set(segment, 0L, source);
    	return this;
    }
    
    public int source() {
    	return (int) SOURCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #sourceData()
    public VkDescriptorSetAndBindingMappingEXT sourceData(Consumer<VkDescriptorMappingSourceDataEXT> consumer) {
    	consumer.accept(sourceData);
    	return this;
    }
    
    /// @see #sourceData()
    public VkDescriptorSetAndBindingMappingEXT sourceData(VkDescriptorMappingSourceDataEXT other) {
    	sourceData.set(other);
    	return this;
    }
    
    public VkDescriptorMappingSourceDataEXT sourceData() {
    	return sourceData;
    }
    
    @Override
    public VkDescriptorSetAndBindingMappingEXT set(VkDescriptorSetAndBindingMappingEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorSetAndBindingMappingEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorSetAndBindingMappingEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorSetAndBindingMappingEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorSetAndBindingMappingEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorSetAndBindingMappingEXT> array(Arena arena, VkDescriptorSetAndBindingMappingEXT... structs) {
        NativeStructArray<VkDescriptorSetAndBindingMappingEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorSetAndBindingMappingEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorSetAndBindingMappingEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorSetAndBindingMappingEXT(segment)
        );
    }

}