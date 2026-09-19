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

public final class VkDataGraphPipelinePropertyQueryResultARM
		implements Struct<VkDataGraphPipelinePropertyQueryResultARM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PROPERTY_HANDLE;
    public static final VarHandle IS_TEXT_HANDLE;
    public static final VarHandle DATA_SIZE_HANDLE;
    public static final VarHandle P_DATA_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PROPERTY_BYTE_OFFSET;
    public static final long IS_TEXT_BYTE_OFFSET;
    public static final long DATA_SIZE_BYTE_OFFSET;
    public static final long P_DATA_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("property"),
            JAVA_INT.withName("isText"),
            JAVA_LONG.withName("dataSize"),
            UNBOUNDED_ADDRESS.withName("pData")
        ).withName("VkDataGraphPipelinePropertyQueryResultARM").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PROPERTY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("property"));
        IS_TEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isText"));
        DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dataSize"));
        P_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pData"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PROPERTY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("property"));
        IS_TEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isText"));
        DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dataSize"));
        P_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pData"));
        //@formatter:on
    }

    public VkDataGraphPipelinePropertyQueryResultARM() {
        this(Arena.ofAuto());
    }
    
    public VkDataGraphPipelinePropertyQueryResultARM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDataGraphPipelinePropertyQueryResultARM(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDataGraphPipelinePropertyQueryResultARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDataGraphPipelinePropertyQueryResultARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #property()
    public VkDataGraphPipelinePropertyQueryResultARM property(int property) {
    	PROPERTY_HANDLE.set(segment, 0L, property);
    	return this;
    }
    
    public int property() {
    	return (int) PROPERTY_HANDLE.get(segment, 0L);
    }
    
    /// @see #isText()
    public VkDataGraphPipelinePropertyQueryResultARM isText(int isText) {
    	IS_TEXT_HANDLE.set(segment, 0L, isText);
    	return this;
    }
    
    public int isText() {
    	return (int) IS_TEXT_HANDLE.get(segment, 0L);
    }
    
    /// @see #dataSize()
    public VkDataGraphPipelinePropertyQueryResultARM dataSize(long dataSize) {
    	DATA_SIZE_HANDLE.set(segment, 0L, dataSize);
    	return this;
    }
    
    public long dataSize() {
    	return (long) DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pData()
    public VkDataGraphPipelinePropertyQueryResultARM pData(MemorySegment pData) {
    	P_DATA_HANDLE.set(segment, 0L, pData);
    	return this;
    }
    
    public @Nullable MemorySegment pData() {
    	MemorySegment segment = (MemorySegment) P_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VkDataGraphPipelinePropertyQueryResultARM set(VkDataGraphPipelinePropertyQueryResultARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDataGraphPipelinePropertyQueryResultARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDataGraphPipelinePropertyQueryResultARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDataGraphPipelinePropertyQueryResultARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelinePropertyQueryResultARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDataGraphPipelinePropertyQueryResultARM> array(Arena arena, VkDataGraphPipelinePropertyQueryResultARM... structs) {
        NativeStructArray<VkDataGraphPipelinePropertyQueryResultARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelinePropertyQueryResultARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDataGraphPipelinePropertyQueryResultARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDataGraphPipelinePropertyQueryResultARM(segment)
        );
    }
    
}