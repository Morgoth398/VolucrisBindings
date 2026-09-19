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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkBindMemoryStatus
		implements Struct<VkBindMemoryStatus> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle P_RESULT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long P_RESULT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("pResult")
        ).withName("VkBindMemoryStatus").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        P_RESULT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pResult"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        P_RESULT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pResult"));
        //@formatter:on
    }

    public VkBindMemoryStatus() {
        this(Arena.ofAuto());
    }
    
    public VkBindMemoryStatus(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkBindMemoryStatus(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkBindMemoryStatus sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBindMemoryStatus pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pResult()
    public VkBindMemoryStatus pResult(NativeIntArray pResult) {
    	P_RESULT_HANDLE.set(segment, 0L, pResult.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pResult() {
    	MemorySegment segment = (MemorySegment) P_RESULT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkBindMemoryStatus set(VkBindMemoryStatus other) {
        return set(other.segment);
    }
    
    @Override
    public VkBindMemoryStatus set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBindMemoryStatus> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBindMemoryStatus> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindMemoryStatus(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBindMemoryStatus> array(Arena arena, VkBindMemoryStatus... structs) {
        NativeStructArray<VkBindMemoryStatus> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindMemoryStatus(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBindMemoryStatus> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBindMemoryStatus(segment)
        );
    }
    
}