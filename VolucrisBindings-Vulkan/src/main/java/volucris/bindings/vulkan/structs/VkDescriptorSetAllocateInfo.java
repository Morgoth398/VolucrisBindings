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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkDescriptorSetAllocateInfo
		implements Struct<VkDescriptorSetAllocateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DESCRIPTOR_POOL_HANDLE;
	public static final VarHandle DESCRIPTOR_SET_COUNT_HANDLE;
	public static final VarHandle P_SET_LAYOUTS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DESCRIPTOR_POOL_BYTE_OFFSET;
	public static final long DESCRIPTOR_SET_COUNT_BYTE_OFFSET;
	public static final long P_SET_LAYOUTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("descriptorPool"),
		    JAVA_INT.withName("descriptorSetCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pSetLayouts")
		).withName("VkDescriptorSetAllocateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DESCRIPTOR_POOL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorPool"));
		DESCRIPTOR_SET_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorSetCount"));
		P_SET_LAYOUTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSetLayouts"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DESCRIPTOR_POOL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorPool"));
		DESCRIPTOR_SET_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetCount"));
		P_SET_LAYOUTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSetLayouts"));
		//@formatter:on
	}

	public VkDescriptorSetAllocateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkDescriptorSetAllocateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDescriptorSetAllocateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDescriptorSetAllocateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDescriptorSetAllocateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #descriptorPool()
    public VkDescriptorSetAllocateInfo descriptorPool(VkDescriptorPool descriptorPool) {
    	DESCRIPTOR_POOL_HANDLE.set(segment, 0L, descriptorPool.memorySegment());
    	return this;
    }
    
    public @Nullable VkDescriptorPool descriptorPool() {
    	MemorySegment segment = (MemorySegment) DESCRIPTOR_POOL_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDescriptorPool(segment);
    }
    
    /// @see #descriptorSetCount()
    public VkDescriptorSetAllocateInfo descriptorSetCount(int descriptorSetCount) {
    	DESCRIPTOR_SET_COUNT_HANDLE.set(segment, 0L, descriptorSetCount);
    	return this;
    }
    
    public int descriptorSetCount() {
    	return (int) DESCRIPTOR_SET_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSetLayouts()
    public VkDescriptorSetAllocateInfo pSetLayouts(NativePointerArray pSetLayouts) {
    	P_SET_LAYOUTS_HANDLE.set(segment, 0L, pSetLayouts.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pSetLayouts() {
    	MemorySegment segment = (MemorySegment) P_SET_LAYOUTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    @Override
    public VkDescriptorSetAllocateInfo set(VkDescriptorSetAllocateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorSetAllocateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorSetAllocateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorSetAllocateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorSetAllocateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorSetAllocateInfo> array(Arena arena, VkDescriptorSetAllocateInfo... structs) {
        NativeStructArray<VkDescriptorSetAllocateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorSetAllocateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorSetAllocateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorSetAllocateInfo(segment)
        );
    }

}