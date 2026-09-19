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

public final class VkVideoEncodeAV1DpbSlotInfoKHR
		implements Struct<VkVideoEncodeAV1DpbSlotInfoKHR> {

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
        ).withName("VkVideoEncodeAV1DpbSlotInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        P_STD_REFERENCE_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdReferenceInfo"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        P_STD_REFERENCE_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdReferenceInfo"));
        //@formatter:on
    }

    public VkVideoEncodeAV1DpbSlotInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoEncodeAV1DpbSlotInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoEncodeAV1DpbSlotInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkVideoEncodeAV1DpbSlotInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeAV1DpbSlotInfoKHR pNext(MemorySegment pNext) {
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
    public VkVideoEncodeAV1DpbSlotInfoKHR pStdReferenceInfo(StdVideoEncodeAV1ReferenceInfo pStdReferenceInfo) {
    	P_STD_REFERENCE_INFO_HANDLE.set(segment, 0L, pStdReferenceInfo.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoEncodeAV1ReferenceInfo pStdReferenceInfo() {
    	MemorySegment segment = (MemorySegment) P_STD_REFERENCE_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoEncodeAV1ReferenceInfo(segment);
    }
    
    @Override
    public VkVideoEncodeAV1DpbSlotInfoKHR set(VkVideoEncodeAV1DpbSlotInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeAV1DpbSlotInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeAV1DpbSlotInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeAV1DpbSlotInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeAV1DpbSlotInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeAV1DpbSlotInfoKHR> array(Arena arena, VkVideoEncodeAV1DpbSlotInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeAV1DpbSlotInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeAV1DpbSlotInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeAV1DpbSlotInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeAV1DpbSlotInfoKHR(segment)
        );
    }
    
}