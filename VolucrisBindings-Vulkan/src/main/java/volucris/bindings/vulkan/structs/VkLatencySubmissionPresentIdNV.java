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

public final class VkLatencySubmissionPresentIdNV
		implements Struct<VkLatencySubmissionPresentIdNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PRESENT_ID_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PRESENT_ID_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_LONG.withName("presentID")
        ).withName("VkLatencySubmissionPresentIdNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PRESENT_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentID"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PRESENT_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentID"));
        //@formatter:on
    }

    public VkLatencySubmissionPresentIdNV() {
        this(Arena.ofAuto());
    }
    
    public VkLatencySubmissionPresentIdNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkLatencySubmissionPresentIdNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkLatencySubmissionPresentIdNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkLatencySubmissionPresentIdNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #presentID()
    public VkLatencySubmissionPresentIdNV presentID(long presentID) {
    	PRESENT_ID_HANDLE.set(segment, 0L, presentID);
    	return this;
    }
    
    public long presentID() {
    	return (long) PRESENT_ID_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkLatencySubmissionPresentIdNV set(VkLatencySubmissionPresentIdNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkLatencySubmissionPresentIdNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkLatencySubmissionPresentIdNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkLatencySubmissionPresentIdNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkLatencySubmissionPresentIdNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkLatencySubmissionPresentIdNV> array(Arena arena, VkLatencySubmissionPresentIdNV... structs) {
        NativeStructArray<VkLatencySubmissionPresentIdNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkLatencySubmissionPresentIdNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkLatencySubmissionPresentIdNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkLatencySubmissionPresentIdNV(segment)
        );
    }
    
}