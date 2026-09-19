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

public final class VkGeneratedCommandsMemoryRequirementsInfoEXT
		implements Struct<VkGeneratedCommandsMemoryRequirementsInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle INDIRECT_EXECUTION_SET_HANDLE;
    public static final VarHandle INDIRECT_COMMANDS_LAYOUT_HANDLE;
    public static final VarHandle MAX_SEQUENCE_COUNT_HANDLE;
    public static final VarHandle MAX_DRAW_COUNT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long INDIRECT_EXECUTION_SET_BYTE_OFFSET;
    public static final long INDIRECT_COMMANDS_LAYOUT_BYTE_OFFSET;
    public static final long MAX_SEQUENCE_COUNT_BYTE_OFFSET;
    public static final long MAX_DRAW_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("indirectExecutionSet"),
            UNBOUNDED_ADDRESS.withName("indirectCommandsLayout"),
            JAVA_INT.withName("maxSequenceCount"),
            JAVA_INT.withName("maxDrawCount")
        ).withName("VkGeneratedCommandsMemoryRequirementsInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        INDIRECT_EXECUTION_SET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indirectExecutionSet"));
        INDIRECT_COMMANDS_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indirectCommandsLayout"));
        MAX_SEQUENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSequenceCount"));
        MAX_DRAW_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDrawCount"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        INDIRECT_EXECUTION_SET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indirectExecutionSet"));
        INDIRECT_COMMANDS_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indirectCommandsLayout"));
        MAX_SEQUENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSequenceCount"));
        MAX_DRAW_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDrawCount"));
        //@formatter:on
    }

    public VkGeneratedCommandsMemoryRequirementsInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkGeneratedCommandsMemoryRequirementsInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkGeneratedCommandsMemoryRequirementsInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkGeneratedCommandsMemoryRequirementsInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkGeneratedCommandsMemoryRequirementsInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #indirectExecutionSet()
    public VkGeneratedCommandsMemoryRequirementsInfoEXT indirectExecutionSet(VkIndirectExecutionSetEXT indirectExecutionSet) {
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
    public VkGeneratedCommandsMemoryRequirementsInfoEXT indirectCommandsLayout(VkIndirectCommandsLayoutEXT indirectCommandsLayout) {
    	INDIRECT_COMMANDS_LAYOUT_HANDLE.set(segment, 0L, indirectCommandsLayout.memorySegment());
    	return this;
    }
    
    public @Nullable VkIndirectCommandsLayoutEXT indirectCommandsLayout() {
    	MemorySegment segment = (MemorySegment) INDIRECT_COMMANDS_LAYOUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkIndirectCommandsLayoutEXT(segment);
    }
    
    /// @see #maxSequenceCount()
    public VkGeneratedCommandsMemoryRequirementsInfoEXT maxSequenceCount(int maxSequenceCount) {
    	MAX_SEQUENCE_COUNT_HANDLE.set(segment, 0L, maxSequenceCount);
    	return this;
    }
    
    public int maxSequenceCount() {
    	return (int) MAX_SEQUENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDrawCount()
    public VkGeneratedCommandsMemoryRequirementsInfoEXT maxDrawCount(int maxDrawCount) {
    	MAX_DRAW_COUNT_HANDLE.set(segment, 0L, maxDrawCount);
    	return this;
    }
    
    public int maxDrawCount() {
    	return (int) MAX_DRAW_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkGeneratedCommandsMemoryRequirementsInfoEXT set(VkGeneratedCommandsMemoryRequirementsInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkGeneratedCommandsMemoryRequirementsInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkGeneratedCommandsMemoryRequirementsInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkGeneratedCommandsMemoryRequirementsInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGeneratedCommandsMemoryRequirementsInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkGeneratedCommandsMemoryRequirementsInfoEXT> array(Arena arena, VkGeneratedCommandsMemoryRequirementsInfoEXT... structs) {
        NativeStructArray<VkGeneratedCommandsMemoryRequirementsInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGeneratedCommandsMemoryRequirementsInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkGeneratedCommandsMemoryRequirementsInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkGeneratedCommandsMemoryRequirementsInfoEXT(segment)
        );
    }
    
}