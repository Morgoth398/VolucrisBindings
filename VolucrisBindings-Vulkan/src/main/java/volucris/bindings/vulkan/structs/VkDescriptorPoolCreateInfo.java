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

public final class VkDescriptorPoolCreateInfo
		implements Struct<VkDescriptorPoolCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle MAX_SETS_HANDLE;
	public static final VarHandle POOL_SIZE_COUNT_HANDLE;
	public static final VarHandle P_POOL_SIZES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long MAX_SETS_BYTE_OFFSET;
	public static final long POOL_SIZE_COUNT_BYTE_OFFSET;
	public static final long P_POOL_SIZES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("maxSets"),
		    JAVA_INT.withName("poolSizeCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pPoolSizes")
		).withName("VkDescriptorPoolCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		MAX_SETS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSets"));
		POOL_SIZE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("poolSizeCount"));
		P_POOL_SIZES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPoolSizes"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		MAX_SETS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSets"));
		POOL_SIZE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("poolSizeCount"));
		P_POOL_SIZES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPoolSizes"));
		//@formatter:on
	}

	public VkDescriptorPoolCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkDescriptorPoolCreateInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDescriptorPoolCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDescriptorPoolCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDescriptorPoolCreateInfo pNext(MemorySegment pNext) {
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
    public VkDescriptorPoolCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSets()
    public VkDescriptorPoolCreateInfo maxSets(int maxSets) {
    	MAX_SETS_HANDLE.set(segment, 0L, maxSets);
    	return this;
    }
    
    public int maxSets() {
    	return (int) MAX_SETS_HANDLE.get(segment, 0L);
    }
    
    /// @see #poolSizeCount()
    public VkDescriptorPoolCreateInfo poolSizeCount(int poolSizeCount) {
    	POOL_SIZE_COUNT_HANDLE.set(segment, 0L, poolSizeCount);
    	return this;
    }
    
    public int poolSizeCount() {
    	return (int) POOL_SIZE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPoolSizes()
    public VkDescriptorPoolCreateInfo pPoolSizes(NativeStructArray<VkDescriptorPoolSize> pPoolSizes) {
    	P_POOL_SIZES_HANDLE.set(segment, 0L, pPoolSizes.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkDescriptorPoolSize> pPoolSizes() {
    	MemorySegment segment = (MemorySegment) P_POOL_SIZES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkDescriptorPoolSize.array(segment);
    }
    
    @Override
    public VkDescriptorPoolCreateInfo set(VkDescriptorPoolCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorPoolCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorPoolCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorPoolCreateInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDescriptorPoolCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorPoolCreateInfo> array(SegmentAllocator allocator, VkDescriptorPoolCreateInfo... structs) {
        NativeStructArray<VkDescriptorPoolCreateInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDescriptorPoolCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorPoolCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorPoolCreateInfo(segment)
        );
    }

}