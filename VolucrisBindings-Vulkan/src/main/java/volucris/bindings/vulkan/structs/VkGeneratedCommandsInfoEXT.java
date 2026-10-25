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

public final class VkGeneratedCommandsInfoEXT
		implements Struct<VkGeneratedCommandsInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADER_STAGES_HANDLE;
	public static final VarHandle INDIRECT_EXECUTION_SET_HANDLE;
	public static final VarHandle INDIRECT_COMMANDS_LAYOUT_HANDLE;
	public static final VarHandle INDIRECT_ADDRESS_HANDLE;
	public static final VarHandle INDIRECT_ADDRESS_SIZE_HANDLE;
	public static final VarHandle PREPROCESS_ADDRESS_HANDLE;
	public static final VarHandle PREPROCESS_SIZE_HANDLE;
	public static final VarHandle MAX_SEQUENCE_COUNT_HANDLE;
	public static final VarHandle SEQUENCE_COUNT_ADDRESS_HANDLE;
	public static final VarHandle MAX_DRAW_COUNT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADER_STAGES_BYTE_OFFSET;
	public static final long INDIRECT_EXECUTION_SET_BYTE_OFFSET;
	public static final long INDIRECT_COMMANDS_LAYOUT_BYTE_OFFSET;
	public static final long INDIRECT_ADDRESS_BYTE_OFFSET;
	public static final long INDIRECT_ADDRESS_SIZE_BYTE_OFFSET;
	public static final long PREPROCESS_ADDRESS_BYTE_OFFSET;
	public static final long PREPROCESS_SIZE_BYTE_OFFSET;
	public static final long MAX_SEQUENCE_COUNT_BYTE_OFFSET;
	public static final long SEQUENCE_COUNT_ADDRESS_BYTE_OFFSET;
	public static final long MAX_DRAW_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("shaderStages"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("indirectExecutionSet"),
		    UNBOUNDED_ADDRESS.withName("indirectCommandsLayout"),
		    JAVA_LONG.withName("indirectAddress"),
		    JAVA_LONG.withName("indirectAddressSize"),
		    JAVA_LONG.withName("preprocessAddress"),
		    JAVA_LONG.withName("preprocessSize"),
		    JAVA_INT.withName("maxSequenceCount"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("sequenceCountAddress"),
		    JAVA_INT.withName("maxDrawCount"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkGeneratedCommandsInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADER_STAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStages"));
		INDIRECT_EXECUTION_SET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indirectExecutionSet"));
		INDIRECT_COMMANDS_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indirectCommandsLayout"));
		INDIRECT_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indirectAddress"));
		INDIRECT_ADDRESS_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indirectAddressSize"));
		PREPROCESS_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preprocessAddress"));
		PREPROCESS_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preprocessSize"));
		MAX_SEQUENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSequenceCount"));
		SEQUENCE_COUNT_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sequenceCountAddress"));
		MAX_DRAW_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDrawCount"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADER_STAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStages"));
		INDIRECT_EXECUTION_SET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indirectExecutionSet"));
		INDIRECT_COMMANDS_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indirectCommandsLayout"));
		INDIRECT_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indirectAddress"));
		INDIRECT_ADDRESS_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indirectAddressSize"));
		PREPROCESS_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preprocessAddress"));
		PREPROCESS_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preprocessSize"));
		MAX_SEQUENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSequenceCount"));
		SEQUENCE_COUNT_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sequenceCountAddress"));
		MAX_DRAW_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDrawCount"));
		//@formatter:on
	}

	public VkGeneratedCommandsInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkGeneratedCommandsInfoEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkGeneratedCommandsInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkGeneratedCommandsInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkGeneratedCommandsInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderStages()
    public VkGeneratedCommandsInfoEXT shaderStages(int shaderStages) {
    	SHADER_STAGES_HANDLE.set(segment, 0L, shaderStages);
    	return this;
    }
    
    public int shaderStages() {
    	return (int) SHADER_STAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #indirectExecutionSet()
    public VkGeneratedCommandsInfoEXT indirectExecutionSet(VkIndirectExecutionSetEXT indirectExecutionSet) {
    	INDIRECT_EXECUTION_SET_HANDLE.set(segment, 0L, indirectExecutionSet.memorySegment());
    	return this;
    }
    
    public @Nullable VkIndirectExecutionSetEXT indirectExecutionSet() {
    	MemorySegment segment = (MemorySegment) INDIRECT_EXECUTION_SET_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkIndirectExecutionSetEXT(segment);
    }
    
    /// @see #indirectCommandsLayout()
    public VkGeneratedCommandsInfoEXT indirectCommandsLayout(VkIndirectCommandsLayoutEXT indirectCommandsLayout) {
    	INDIRECT_COMMANDS_LAYOUT_HANDLE.set(segment, 0L, indirectCommandsLayout.memorySegment());
    	return this;
    }
    
    public @Nullable VkIndirectCommandsLayoutEXT indirectCommandsLayout() {
    	MemorySegment segment = (MemorySegment) INDIRECT_COMMANDS_LAYOUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkIndirectCommandsLayoutEXT(segment);
    }
    
    /// @see #indirectAddress()
    public VkGeneratedCommandsInfoEXT indirectAddress(long indirectAddress) {
    	INDIRECT_ADDRESS_HANDLE.set(segment, 0L, indirectAddress);
    	return this;
    }
    
    public long indirectAddress() {
    	return (long) INDIRECT_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #indirectAddressSize()
    public VkGeneratedCommandsInfoEXT indirectAddressSize(long indirectAddressSize) {
    	INDIRECT_ADDRESS_SIZE_HANDLE.set(segment, 0L, indirectAddressSize);
    	return this;
    }
    
    public long indirectAddressSize() {
    	return (long) INDIRECT_ADDRESS_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #preprocessAddress()
    public VkGeneratedCommandsInfoEXT preprocessAddress(long preprocessAddress) {
    	PREPROCESS_ADDRESS_HANDLE.set(segment, 0L, preprocessAddress);
    	return this;
    }
    
    public long preprocessAddress() {
    	return (long) PREPROCESS_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #preprocessSize()
    public VkGeneratedCommandsInfoEXT preprocessSize(long preprocessSize) {
    	PREPROCESS_SIZE_HANDLE.set(segment, 0L, preprocessSize);
    	return this;
    }
    
    public long preprocessSize() {
    	return (long) PREPROCESS_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSequenceCount()
    public VkGeneratedCommandsInfoEXT maxSequenceCount(int maxSequenceCount) {
    	MAX_SEQUENCE_COUNT_HANDLE.set(segment, 0L, maxSequenceCount);
    	return this;
    }
    
    public int maxSequenceCount() {
    	return (int) MAX_SEQUENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #sequenceCountAddress()
    public VkGeneratedCommandsInfoEXT sequenceCountAddress(long sequenceCountAddress) {
    	SEQUENCE_COUNT_ADDRESS_HANDLE.set(segment, 0L, sequenceCountAddress);
    	return this;
    }
    
    public long sequenceCountAddress() {
    	return (long) SEQUENCE_COUNT_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDrawCount()
    public VkGeneratedCommandsInfoEXT maxDrawCount(int maxDrawCount) {
    	MAX_DRAW_COUNT_HANDLE.set(segment, 0L, maxDrawCount);
    	return this;
    }
    
    public int maxDrawCount() {
    	return (int) MAX_DRAW_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkGeneratedCommandsInfoEXT set(VkGeneratedCommandsInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkGeneratedCommandsInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkGeneratedCommandsInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkGeneratedCommandsInfoEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkGeneratedCommandsInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkGeneratedCommandsInfoEXT> array(SegmentAllocator allocator, VkGeneratedCommandsInfoEXT... structs) {
        NativeStructArray<VkGeneratedCommandsInfoEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkGeneratedCommandsInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkGeneratedCommandsInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkGeneratedCommandsInfoEXT(segment)
        );
    }

}