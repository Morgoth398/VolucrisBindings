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

public final class VkPipelineLayoutCreateInfo
		implements Struct<VkPipelineLayoutCreateInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle SET_LAYOUT_COUNT_HANDLE;
    public static final VarHandle P_SET_LAYOUTS_HANDLE;
    public static final VarHandle PUSH_CONSTANT_RANGE_COUNT_HANDLE;
    public static final VarHandle P_PUSH_CONSTANT_RANGES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long SET_LAYOUT_COUNT_BYTE_OFFSET;
    public static final long P_SET_LAYOUTS_BYTE_OFFSET;
    public static final long PUSH_CONSTANT_RANGE_COUNT_BYTE_OFFSET;
    public static final long P_PUSH_CONSTANT_RANGES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            JAVA_INT.withName("setLayoutCount"),
            UNBOUNDED_ADDRESS.withName("pSetLayouts"),
            JAVA_INT.withName("pushConstantRangeCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pPushConstantRanges")
        ).withName("VkPipelineLayoutCreateInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        SET_LAYOUT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("setLayoutCount"));
        P_SET_LAYOUTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSetLayouts"));
        PUSH_CONSTANT_RANGE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushConstantRangeCount"));
        P_PUSH_CONSTANT_RANGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPushConstantRanges"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        SET_LAYOUT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("setLayoutCount"));
        P_SET_LAYOUTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSetLayouts"));
        PUSH_CONSTANT_RANGE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushConstantRangeCount"));
        P_PUSH_CONSTANT_RANGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPushConstantRanges"));
        //@formatter:on
    }

    public VkPipelineLayoutCreateInfo() {
        this(Arena.ofAuto());
    }
    
    public VkPipelineLayoutCreateInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPipelineLayoutCreateInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPipelineLayoutCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineLayoutCreateInfo pNext(MemorySegment pNext) {
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
    public VkPipelineLayoutCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #setLayoutCount()
    public VkPipelineLayoutCreateInfo setLayoutCount(int setLayoutCount) {
    	SET_LAYOUT_COUNT_HANDLE.set(segment, 0L, setLayoutCount);
    	return this;
    }
    
    public int setLayoutCount() {
    	return (int) SET_LAYOUT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSetLayouts()
    public VkPipelineLayoutCreateInfo pSetLayouts(NativePointerArray pSetLayouts) {
    	P_SET_LAYOUTS_HANDLE.set(segment, 0L, pSetLayouts.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pSetLayouts() {
    	MemorySegment segment = (MemorySegment) P_SET_LAYOUTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #pushConstantRangeCount()
    public VkPipelineLayoutCreateInfo pushConstantRangeCount(int pushConstantRangeCount) {
    	PUSH_CONSTANT_RANGE_COUNT_HANDLE.set(segment, 0L, pushConstantRangeCount);
    	return this;
    }
    
    public int pushConstantRangeCount() {
    	return (int) PUSH_CONSTANT_RANGE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPushConstantRanges()
    public VkPipelineLayoutCreateInfo pPushConstantRanges(NativeStructArray<VkPushConstantRange> pPushConstantRanges) {
    	P_PUSH_CONSTANT_RANGES_HANDLE.set(segment, 0L, pPushConstantRanges.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkPushConstantRange> pPushConstantRanges() {
    	MemorySegment segment = (MemorySegment) P_PUSH_CONSTANT_RANGES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkPushConstantRange.array(segment);
    }
    
    @Override
    public VkPipelineLayoutCreateInfo set(VkPipelineLayoutCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineLayoutCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineLayoutCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineLayoutCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineLayoutCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineLayoutCreateInfo> array(Arena arena, VkPipelineLayoutCreateInfo... structs) {
        NativeStructArray<VkPipelineLayoutCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineLayoutCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineLayoutCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineLayoutCreateInfo(segment)
        );
    }
    
}