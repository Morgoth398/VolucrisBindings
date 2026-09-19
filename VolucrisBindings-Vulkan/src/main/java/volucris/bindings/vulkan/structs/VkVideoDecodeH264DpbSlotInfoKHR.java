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

public final class VkVideoDecodeH264DpbSlotInfoKHR
		implements Struct<VkVideoDecodeH264DpbSlotInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle P_STD_REFERENCE_INFO_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long P_STD_REFERENCE_INFO_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("pStdReferenceInfo")
        ).withName("VkVideoDecodeH264DpbSlotInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        P_STD_REFERENCE_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdReferenceInfo"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        P_STD_REFERENCE_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdReferenceInfo"));
        //@formatter:on
    }

    public VkVideoDecodeH264DpbSlotInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoDecodeH264DpbSlotInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoDecodeH264DpbSlotInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkVideoDecodeH264DpbSlotInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoDecodeH264DpbSlotInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pStdReferenceInfo()
    public VkVideoDecodeH264DpbSlotInfoKHR pStdReferenceInfo(StdVideoDecodeH264ReferenceInfo pStdReferenceInfo) {
    	P_STD_REFERENCE_INFO_HANDLE.set(segment, 0L, pStdReferenceInfo.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoDecodeH264ReferenceInfo pStdReferenceInfo() {
    	MemorySegment segment = (MemorySegment) P_STD_REFERENCE_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoDecodeH264ReferenceInfo(segment);
    }
    
    @Override
    public VkVideoDecodeH264DpbSlotInfoKHR set(VkVideoDecodeH264DpbSlotInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoDecodeH264DpbSlotInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoDecodeH264DpbSlotInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoDecodeH264DpbSlotInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoDecodeH264DpbSlotInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoDecodeH264DpbSlotInfoKHR> array(Arena arena, VkVideoDecodeH264DpbSlotInfoKHR... structs) {
        NativeStructArray<VkVideoDecodeH264DpbSlotInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoDecodeH264DpbSlotInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoDecodeH264DpbSlotInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoDecodeH264DpbSlotInfoKHR(segment)
        );
    }
    
}