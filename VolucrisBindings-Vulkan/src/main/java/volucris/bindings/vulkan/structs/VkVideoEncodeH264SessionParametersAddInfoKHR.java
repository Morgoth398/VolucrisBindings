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

public final class VkVideoEncodeH264SessionParametersAddInfoKHR
		implements Struct<VkVideoEncodeH264SessionParametersAddInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle STD_SPSCOUNT_HANDLE;
    public static final VarHandle P_STD_SPSS_HANDLE;
    public static final VarHandle STD_PPSCOUNT_HANDLE;
    public static final VarHandle P_STD_PPSS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long STD_SPSCOUNT_BYTE_OFFSET;
    public static final long P_STD_SPSS_BYTE_OFFSET;
    public static final long STD_PPSCOUNT_BYTE_OFFSET;
    public static final long P_STD_PPSS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("stdSPSCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pStdSPSs"),
            JAVA_INT.withName("stdPPSCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pStdPPSs")
        ).withName("VkVideoEncodeH264SessionParametersAddInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        STD_SPSCOUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stdSPSCount"));
        P_STD_SPSS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdSPSs"));
        STD_PPSCOUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stdPPSCount"));
        P_STD_PPSS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdPPSs"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        STD_SPSCOUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stdSPSCount"));
        P_STD_SPSS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdSPSs"));
        STD_PPSCOUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stdPPSCount"));
        P_STD_PPSS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdPPSs"));
        //@formatter:on
    }

    public VkVideoEncodeH264SessionParametersAddInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoEncodeH264SessionParametersAddInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoEncodeH264SessionParametersAddInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkVideoEncodeH264SessionParametersAddInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeH264SessionParametersAddInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #stdSPSCount()
    public VkVideoEncodeH264SessionParametersAddInfoKHR stdSPSCount(int stdSPSCount) {
    	STD_SPSCOUNT_HANDLE.set(segment, 0L, stdSPSCount);
    	return this;
    }
    
    public int stdSPSCount() {
    	return (int) STD_SPSCOUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pStdSPSs()
    public VkVideoEncodeH264SessionParametersAddInfoKHR pStdSPSs(NativeStructArray<StdVideoH264SequenceParameterSet> pStdSPSs) {
    	P_STD_SPSS_HANDLE.set(segment, 0L, pStdSPSs.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<StdVideoH264SequenceParameterSet> pStdSPSs() {
    	MemorySegment segment = (MemorySegment) P_STD_SPSS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return StdVideoH264SequenceParameterSet.array(segment);
    }
    
    /// @see #stdPPSCount()
    public VkVideoEncodeH264SessionParametersAddInfoKHR stdPPSCount(int stdPPSCount) {
    	STD_PPSCOUNT_HANDLE.set(segment, 0L, stdPPSCount);
    	return this;
    }
    
    public int stdPPSCount() {
    	return (int) STD_PPSCOUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pStdPPSs()
    public VkVideoEncodeH264SessionParametersAddInfoKHR pStdPPSs(NativeStructArray<StdVideoH264PictureParameterSet> pStdPPSs) {
    	P_STD_PPSS_HANDLE.set(segment, 0L, pStdPPSs.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<StdVideoH264PictureParameterSet> pStdPPSs() {
    	MemorySegment segment = (MemorySegment) P_STD_PPSS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return StdVideoH264PictureParameterSet.array(segment);
    }
    
    @Override
    public VkVideoEncodeH264SessionParametersAddInfoKHR set(VkVideoEncodeH264SessionParametersAddInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeH264SessionParametersAddInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeH264SessionParametersAddInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeH264SessionParametersAddInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH264SessionParametersAddInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeH264SessionParametersAddInfoKHR> array(Arena arena, VkVideoEncodeH264SessionParametersAddInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeH264SessionParametersAddInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH264SessionParametersAddInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeH264SessionParametersAddInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeH264SessionParametersAddInfoKHR(segment)
        );
    }
    
}