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

public final class VkVideoEncodeH265SessionParametersFeedbackInfoKHR
		implements Struct<VkVideoEncodeH265SessionParametersFeedbackInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle HAS_STD_VPSOVERRIDES_HANDLE;
    public static final VarHandle HAS_STD_SPSOVERRIDES_HANDLE;
    public static final VarHandle HAS_STD_PPSOVERRIDES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long HAS_STD_VPSOVERRIDES_BYTE_OFFSET;
    public static final long HAS_STD_SPSOVERRIDES_BYTE_OFFSET;
    public static final long HAS_STD_PPSOVERRIDES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("hasStdVPSOverrides"),
            JAVA_INT.withName("hasStdSPSOverrides"),
            JAVA_INT.withName("hasStdPPSOverrides"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkVideoEncodeH265SessionParametersFeedbackInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        HAS_STD_VPSOVERRIDES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hasStdVPSOverrides"));
        HAS_STD_SPSOVERRIDES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hasStdSPSOverrides"));
        HAS_STD_PPSOVERRIDES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hasStdPPSOverrides"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        HAS_STD_VPSOVERRIDES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hasStdVPSOverrides"));
        HAS_STD_SPSOVERRIDES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hasStdSPSOverrides"));
        HAS_STD_PPSOVERRIDES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hasStdPPSOverrides"));
        //@formatter:on
    }

    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #hasStdVPSOverrides()
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR hasStdVPSOverrides(int hasStdVPSOverrides) {
    	HAS_STD_VPSOVERRIDES_HANDLE.set(segment, 0L, hasStdVPSOverrides);
    	return this;
    }
    
    public int hasStdVPSOverrides() {
    	return (int) HAS_STD_VPSOVERRIDES_HANDLE.get(segment, 0L);
    }
    
    /// @see #hasStdSPSOverrides()
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR hasStdSPSOverrides(int hasStdSPSOverrides) {
    	HAS_STD_SPSOVERRIDES_HANDLE.set(segment, 0L, hasStdSPSOverrides);
    	return this;
    }
    
    public int hasStdSPSOverrides() {
    	return (int) HAS_STD_SPSOVERRIDES_HANDLE.get(segment, 0L);
    }
    
    /// @see #hasStdPPSOverrides()
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR hasStdPPSOverrides(int hasStdPPSOverrides) {
    	HAS_STD_PPSOVERRIDES_HANDLE.set(segment, 0L, hasStdPPSOverrides);
    	return this;
    }
    
    public int hasStdPPSOverrides() {
    	return (int) HAS_STD_PPSOVERRIDES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR set(VkVideoEncodeH265SessionParametersFeedbackInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeH265SessionParametersFeedbackInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeH265SessionParametersFeedbackInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeH265SessionParametersFeedbackInfoKHR> array(Arena arena, VkVideoEncodeH265SessionParametersFeedbackInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeH265SessionParametersFeedbackInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeH265SessionParametersFeedbackInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(segment)
        );
    }
    
}