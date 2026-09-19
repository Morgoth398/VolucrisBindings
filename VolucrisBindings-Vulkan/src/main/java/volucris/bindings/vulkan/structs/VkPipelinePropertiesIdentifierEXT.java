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

public final class VkPipelinePropertiesIdentifierEXT
		implements Struct<VkPipelinePropertiesIdentifierEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PIPELINE_IDENTIFIER_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PIPELINE_IDENTIFIER_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("pipelineIdentifier")
        ).withName("VkPipelinePropertiesIdentifierEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PIPELINE_IDENTIFIER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineIdentifier"), PathElement.sequenceElement());
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PIPELINE_IDENTIFIER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineIdentifier"));
        //@formatter:on
    }

    public VkPipelinePropertiesIdentifierEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPipelinePropertiesIdentifierEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPipelinePropertiesIdentifierEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPipelinePropertiesIdentifierEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelinePropertiesIdentifierEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pipelineIdentifier(int)
    public VkPipelinePropertiesIdentifierEXT pipelineIdentifier(byte pipelineIdentifier, int index0) {
    	PIPELINE_IDENTIFIER_HANDLE.set(segment, 0L, index0, pipelineIdentifier);
    	return this;
    }
    
    public byte pipelineIdentifier(int index0) {
    	return (byte) PIPELINE_IDENTIFIER_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public VkPipelinePropertiesIdentifierEXT set(VkPipelinePropertiesIdentifierEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelinePropertiesIdentifierEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelinePropertiesIdentifierEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelinePropertiesIdentifierEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelinePropertiesIdentifierEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelinePropertiesIdentifierEXT> array(Arena arena, VkPipelinePropertiesIdentifierEXT... structs) {
        NativeStructArray<VkPipelinePropertiesIdentifierEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelinePropertiesIdentifierEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelinePropertiesIdentifierEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelinePropertiesIdentifierEXT(segment)
        );
    }
    
}