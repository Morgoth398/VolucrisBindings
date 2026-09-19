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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkBindDescriptorSetsInfo
		implements Struct<VkBindDescriptorSetsInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle STAGE_FLAGS_HANDLE;
    public static final VarHandle LAYOUT_HANDLE;
    public static final VarHandle FIRST_SET_HANDLE;
    public static final VarHandle DESCRIPTOR_SET_COUNT_HANDLE;
    public static final VarHandle P_DESCRIPTOR_SETS_HANDLE;
    public static final VarHandle DYNAMIC_OFFSET_COUNT_HANDLE;
    public static final VarHandle P_DYNAMIC_OFFSETS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long STAGE_FLAGS_BYTE_OFFSET;
    public static final long LAYOUT_BYTE_OFFSET;
    public static final long FIRST_SET_BYTE_OFFSET;
    public static final long DESCRIPTOR_SET_COUNT_BYTE_OFFSET;
    public static final long P_DESCRIPTOR_SETS_BYTE_OFFSET;
    public static final long DYNAMIC_OFFSET_COUNT_BYTE_OFFSET;
    public static final long P_DYNAMIC_OFFSETS_BYTE_OFFSET;

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
            JAVA_INT.withName("firstSet"),
            JAVA_INT.withName("descriptorSetCount"),
            UNBOUNDED_ADDRESS.withName("pDescriptorSets"),
            JAVA_INT.withName("dynamicOffsetCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pDynamicOffsets")
        ).withName("VkBindDescriptorSetsInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        STAGE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stageFlags"));
        LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layout"));
        FIRST_SET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("firstSet"));
        DESCRIPTOR_SET_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorSetCount"));
        P_DESCRIPTOR_SETS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDescriptorSets"));
        DYNAMIC_OFFSET_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dynamicOffsetCount"));
        P_DYNAMIC_OFFSETS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDynamicOffsets"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        STAGE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stageFlags"));
        LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layout"));
        FIRST_SET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("firstSet"));
        DESCRIPTOR_SET_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetCount"));
        P_DESCRIPTOR_SETS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDescriptorSets"));
        DYNAMIC_OFFSET_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dynamicOffsetCount"));
        P_DYNAMIC_OFFSETS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDynamicOffsets"));
        //@formatter:on
    }

    public VkBindDescriptorSetsInfo() {
        this(Arena.ofAuto());
    }
    
    public VkBindDescriptorSetsInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkBindDescriptorSetsInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkBindDescriptorSetsInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBindDescriptorSetsInfo pNext(MemorySegment pNext) {
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
    public VkBindDescriptorSetsInfo stageFlags(int stageFlags) {
    	STAGE_FLAGS_HANDLE.set(segment, 0L, stageFlags);
    	return this;
    }
    
    public int stageFlags() {
    	return (int) STAGE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #layout()
    public VkBindDescriptorSetsInfo layout(VkPipelineLayout layout) {
    	LAYOUT_HANDLE.set(segment, 0L, layout.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineLayout layout() {
    	MemorySegment segment = (MemorySegment) LAYOUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineLayout(segment);
    }
    
    /// @see #firstSet()
    public VkBindDescriptorSetsInfo firstSet(int firstSet) {
    	FIRST_SET_HANDLE.set(segment, 0L, firstSet);
    	return this;
    }
    
    public int firstSet() {
    	return (int) FIRST_SET_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorSetCount()
    public VkBindDescriptorSetsInfo descriptorSetCount(int descriptorSetCount) {
    	DESCRIPTOR_SET_COUNT_HANDLE.set(segment, 0L, descriptorSetCount);
    	return this;
    }
    
    public int descriptorSetCount() {
    	return (int) DESCRIPTOR_SET_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDescriptorSets()
    public VkBindDescriptorSetsInfo pDescriptorSets(NativePointerArray pDescriptorSets) {
    	P_DESCRIPTOR_SETS_HANDLE.set(segment, 0L, pDescriptorSets.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pDescriptorSets() {
    	MemorySegment segment = (MemorySegment) P_DESCRIPTOR_SETS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #dynamicOffsetCount()
    public VkBindDescriptorSetsInfo dynamicOffsetCount(int dynamicOffsetCount) {
    	DYNAMIC_OFFSET_COUNT_HANDLE.set(segment, 0L, dynamicOffsetCount);
    	return this;
    }
    
    public int dynamicOffsetCount() {
    	return (int) DYNAMIC_OFFSET_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDynamicOffsets()
    public VkBindDescriptorSetsInfo pDynamicOffsets(NativeIntArray pDynamicOffsets) {
    	P_DYNAMIC_OFFSETS_HANDLE.set(segment, 0L, pDynamicOffsets.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pDynamicOffsets() {
    	MemorySegment segment = (MemorySegment) P_DYNAMIC_OFFSETS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkBindDescriptorSetsInfo set(VkBindDescriptorSetsInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkBindDescriptorSetsInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBindDescriptorSetsInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBindDescriptorSetsInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindDescriptorSetsInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBindDescriptorSetsInfo> array(Arena arena, VkBindDescriptorSetsInfo... structs) {
        NativeStructArray<VkBindDescriptorSetsInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindDescriptorSetsInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBindDescriptorSetsInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBindDescriptorSetsInfo(segment)
        );
    }
    
}