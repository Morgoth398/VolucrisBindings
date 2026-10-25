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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkShaderCreateInfoEXT
		implements Struct<VkShaderCreateInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle STAGE_HANDLE;
	public static final VarHandle NEXT_STAGE_HANDLE;
	public static final VarHandle CODE_TYPE_HANDLE;
	public static final VarHandle CODE_SIZE_HANDLE;
	public static final VarHandle P_CODE_HANDLE;
	public static final VarHandle P_NAME_HANDLE;
	public static final VarHandle SET_LAYOUT_COUNT_HANDLE;
	public static final VarHandle P_SET_LAYOUTS_HANDLE;
	public static final VarHandle PUSH_CONSTANT_RANGE_COUNT_HANDLE;
	public static final VarHandle P_PUSH_CONSTANT_RANGES_HANDLE;
	public static final VarHandle P_SPECIALIZATION_INFO_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long STAGE_BYTE_OFFSET;
	public static final long NEXT_STAGE_BYTE_OFFSET;
	public static final long CODE_TYPE_BYTE_OFFSET;
	public static final long CODE_SIZE_BYTE_OFFSET;
	public static final long P_CODE_BYTE_OFFSET;
	public static final long P_NAME_BYTE_OFFSET;
	public static final long SET_LAYOUT_COUNT_BYTE_OFFSET;
	public static final long P_SET_LAYOUTS_BYTE_OFFSET;
	public static final long PUSH_CONSTANT_RANGE_COUNT_BYTE_OFFSET;
	public static final long P_PUSH_CONSTANT_RANGES_BYTE_OFFSET;
	public static final long P_SPECIALIZATION_INFO_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("stage"),
		    JAVA_INT.withName("nextStage"),
		    JAVA_INT.withName("codeType"),
		    JAVA_LONG.withName("codeSize"),
		    UNBOUNDED_ADDRESS.withName("pCode"),
		    UNBOUNDED_ADDRESS.withName("pName"),
		    JAVA_INT.withName("setLayoutCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pSetLayouts"),
		    JAVA_INT.withName("pushConstantRangeCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pPushConstantRanges"),
		    UNBOUNDED_ADDRESS.withName("pSpecializationInfo")
		).withName("VkShaderCreateInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		STAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stage"));
		NEXT_STAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nextStage"));
		CODE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("codeType"));
		CODE_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("codeSize"));
		P_CODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCode"));
		P_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pName"));
		SET_LAYOUT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("setLayoutCount"));
		P_SET_LAYOUTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSetLayouts"));
		PUSH_CONSTANT_RANGE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushConstantRangeCount"));
		P_PUSH_CONSTANT_RANGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPushConstantRanges"));
		P_SPECIALIZATION_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSpecializationInfo"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		STAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stage"));
		NEXT_STAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nextStage"));
		CODE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("codeType"));
		CODE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("codeSize"));
		P_CODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCode"));
		P_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pName"));
		SET_LAYOUT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("setLayoutCount"));
		P_SET_LAYOUTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSetLayouts"));
		PUSH_CONSTANT_RANGE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushConstantRangeCount"));
		P_PUSH_CONSTANT_RANGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPushConstantRanges"));
		P_SPECIALIZATION_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSpecializationInfo"));
		//@formatter:on
	}

	public VkShaderCreateInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkShaderCreateInfoEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkShaderCreateInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkShaderCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkShaderCreateInfoEXT pNext(MemorySegment pNext) {
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
    public VkShaderCreateInfoEXT flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #stage()
    public VkShaderCreateInfoEXT stage(int stage) {
    	STAGE_HANDLE.set(segment, 0L, stage);
    	return this;
    }
    
    public int stage() {
    	return (int) STAGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #nextStage()
    public VkShaderCreateInfoEXT nextStage(int nextStage) {
    	NEXT_STAGE_HANDLE.set(segment, 0L, nextStage);
    	return this;
    }
    
    public int nextStage() {
    	return (int) NEXT_STAGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #codeType()
    public VkShaderCreateInfoEXT codeType(int codeType) {
    	CODE_TYPE_HANDLE.set(segment, 0L, codeType);
    	return this;
    }
    
    public int codeType() {
    	return (int) CODE_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #codeSize()
    public VkShaderCreateInfoEXT codeSize(long codeSize) {
    	CODE_SIZE_HANDLE.set(segment, 0L, codeSize);
    	return this;
    }
    
    public long codeSize() {
    	return (long) CODE_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pCode()
    public VkShaderCreateInfoEXT pCode(MemorySegment pCode) {
    	P_CODE_HANDLE.set(segment, 0L, pCode);
    	return this;
    }
    
    public @Nullable MemorySegment pCode() {
    	MemorySegment segment = (MemorySegment) P_CODE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pName()
    public VkShaderCreateInfoEXT pName(SegmentAllocator allocator, String pName) {
    	P_NAME_HANDLE.set(segment, 0L, allocator.allocateFrom(pName));
    	return this;
    }
    
    public @Nullable String pName() {
    	MemorySegment segment = (MemorySegment) P_NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// @see #setLayoutCount()
    public VkShaderCreateInfoEXT setLayoutCount(int setLayoutCount) {
    	SET_LAYOUT_COUNT_HANDLE.set(segment, 0L, setLayoutCount);
    	return this;
    }
    
    public int setLayoutCount() {
    	return (int) SET_LAYOUT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSetLayouts()
    public VkShaderCreateInfoEXT pSetLayouts(NativePointerArray pSetLayouts) {
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
    public VkShaderCreateInfoEXT pushConstantRangeCount(int pushConstantRangeCount) {
    	PUSH_CONSTANT_RANGE_COUNT_HANDLE.set(segment, 0L, pushConstantRangeCount);
    	return this;
    }
    
    public int pushConstantRangeCount() {
    	return (int) PUSH_CONSTANT_RANGE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPushConstantRanges()
    public VkShaderCreateInfoEXT pPushConstantRanges(NativeStructArray<VkPushConstantRange> pPushConstantRanges) {
    	P_PUSH_CONSTANT_RANGES_HANDLE.set(segment, 0L, pPushConstantRanges.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkPushConstantRange> pPushConstantRanges() {
    	MemorySegment segment = (MemorySegment) P_PUSH_CONSTANT_RANGES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkPushConstantRange.array(segment);
    }
    
    /// @see #pSpecializationInfo()
    public VkShaderCreateInfoEXT pSpecializationInfo(VkSpecializationInfo pSpecializationInfo) {
    	P_SPECIALIZATION_INFO_HANDLE.set(segment, 0L, pSpecializationInfo.memorySegment());
    	return this;
    }
    
    public @Nullable VkSpecializationInfo pSpecializationInfo() {
    	MemorySegment segment = (MemorySegment) P_SPECIALIZATION_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkSpecializationInfo(segment);
    }
    
    @Override
    public VkShaderCreateInfoEXT set(VkShaderCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkShaderCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkShaderCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkShaderCreateInfoEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkShaderCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkShaderCreateInfoEXT> array(SegmentAllocator allocator, VkShaderCreateInfoEXT... structs) {
        NativeStructArray<VkShaderCreateInfoEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkShaderCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkShaderCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkShaderCreateInfoEXT(segment)
        );
    }

}