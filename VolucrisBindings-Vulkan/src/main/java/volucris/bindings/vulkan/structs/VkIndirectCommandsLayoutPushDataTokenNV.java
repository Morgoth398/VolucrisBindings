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

public final class VkIndirectCommandsLayoutPushDataTokenNV
		implements Struct<VkIndirectCommandsLayoutPushDataTokenNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PUSH_DATA_OFFSET_HANDLE;
    public static final VarHandle PUSH_DATA_SIZE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PUSH_DATA_OFFSET_BYTE_OFFSET;
    public static final long PUSH_DATA_SIZE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("pushDataOffset"),
            JAVA_INT.withName("pushDataSize")
        ).withName("VkIndirectCommandsLayoutPushDataTokenNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PUSH_DATA_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushDataOffset"));
        PUSH_DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushDataSize"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PUSH_DATA_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushDataOffset"));
        PUSH_DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushDataSize"));
        //@formatter:on
    }

    public VkIndirectCommandsLayoutPushDataTokenNV() {
        this(Arena.ofAuto());
    }
    
    public VkIndirectCommandsLayoutPushDataTokenNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkIndirectCommandsLayoutPushDataTokenNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkIndirectCommandsLayoutPushDataTokenNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkIndirectCommandsLayoutPushDataTokenNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pushDataOffset()
    public VkIndirectCommandsLayoutPushDataTokenNV pushDataOffset(int pushDataOffset) {
    	PUSH_DATA_OFFSET_HANDLE.set(segment, 0L, pushDataOffset);
    	return this;
    }
    
    public int pushDataOffset() {
    	return (int) PUSH_DATA_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #pushDataSize()
    public VkIndirectCommandsLayoutPushDataTokenNV pushDataSize(int pushDataSize) {
    	PUSH_DATA_SIZE_HANDLE.set(segment, 0L, pushDataSize);
    	return this;
    }
    
    public int pushDataSize() {
    	return (int) PUSH_DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkIndirectCommandsLayoutPushDataTokenNV set(VkIndirectCommandsLayoutPushDataTokenNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkIndirectCommandsLayoutPushDataTokenNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkIndirectCommandsLayoutPushDataTokenNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkIndirectCommandsLayoutPushDataTokenNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectCommandsLayoutPushDataTokenNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkIndirectCommandsLayoutPushDataTokenNV> array(Arena arena, VkIndirectCommandsLayoutPushDataTokenNV... structs) {
        NativeStructArray<VkIndirectCommandsLayoutPushDataTokenNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectCommandsLayoutPushDataTokenNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkIndirectCommandsLayoutPushDataTokenNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkIndirectCommandsLayoutPushDataTokenNV(segment)
        );
    }
    
}