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

public final class VkPushDescriptorSetInfo
		implements Struct<VkPushDescriptorSetInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle STAGE_FLAGS_HANDLE;
	public static final VarHandle LAYOUT_HANDLE;
	public static final VarHandle SET_HANDLE;
	public static final VarHandle DESCRIPTOR_WRITE_COUNT_HANDLE;
	public static final VarHandle P_DESCRIPTOR_WRITES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long STAGE_FLAGS_BYTE_OFFSET;
	public static final long LAYOUT_BYTE_OFFSET;
	public static final long SET_BYTE_OFFSET;
	public static final long DESCRIPTOR_WRITE_COUNT_BYTE_OFFSET;
	public static final long P_DESCRIPTOR_WRITES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("stageFlags"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("layout"),
		    JAVA_INT.withName("set"),
		    JAVA_INT.withName("descriptorWriteCount"),
		    UNBOUNDED_ADDRESS.withName("pDescriptorWrites")
		).withName("VkPushDescriptorSetInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		STAGE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stageFlags"));
		LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layout"));
		SET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("set"));
		DESCRIPTOR_WRITE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorWriteCount"));
		P_DESCRIPTOR_WRITES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDescriptorWrites"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		STAGE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stageFlags"));
		LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layout"));
		SET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("set"));
		DESCRIPTOR_WRITE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorWriteCount"));
		P_DESCRIPTOR_WRITES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDescriptorWrites"));
		//@formatter:on
	}

	public VkPushDescriptorSetInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkPushDescriptorSetInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPushDescriptorSetInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPushDescriptorSetInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPushDescriptorSetInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #stageFlags()
    public VkPushDescriptorSetInfo stageFlags(int stageFlags) {
    	STAGE_FLAGS_HANDLE.set(segment, 0L, stageFlags);
    	return this;
    }
    
    public int stageFlags() {
    	return (int) STAGE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #layout()
    public VkPushDescriptorSetInfo layout(VkPipelineLayout layout) {
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
    public VkPushDescriptorSetInfo set(int set) {
    	SET_HANDLE.set(segment, 0L, set);
    	return this;
    }
    
    public int set() {
    	return (int) SET_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorWriteCount()
    public VkPushDescriptorSetInfo descriptorWriteCount(int descriptorWriteCount) {
    	DESCRIPTOR_WRITE_COUNT_HANDLE.set(segment, 0L, descriptorWriteCount);
    	return this;
    }
    
    public int descriptorWriteCount() {
    	return (int) DESCRIPTOR_WRITE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDescriptorWrites()
    public VkPushDescriptorSetInfo pDescriptorWrites(NativeStructArray<VkWriteDescriptorSet> pDescriptorWrites) {
    	P_DESCRIPTOR_WRITES_HANDLE.set(segment, 0L, pDescriptorWrites.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkWriteDescriptorSet> pDescriptorWrites() {
    	MemorySegment segment = (MemorySegment) P_DESCRIPTOR_WRITES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkWriteDescriptorSet.array(segment);
    }
    
    @Override
    public VkPushDescriptorSetInfo set(VkPushDescriptorSetInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkPushDescriptorSetInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPushDescriptorSetInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPushDescriptorSetInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPushDescriptorSetInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPushDescriptorSetInfo> array(Arena arena, VkPushDescriptorSetInfo... structs) {
        NativeStructArray<VkPushDescriptorSetInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPushDescriptorSetInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPushDescriptorSetInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPushDescriptorSetInfo(segment)
        );
    }

}