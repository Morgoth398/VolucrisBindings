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

public final class VkVideoDecodeH264SessionParametersCreateInfoKHR
		implements Struct<VkVideoDecodeH264SessionParametersCreateInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_STD_SPSCOUNT_HANDLE;
    public static final VarHandle MAX_STD_PPSCOUNT_HANDLE;
    public static final VarHandle P_PARAMETERS_ADD_INFO_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_STD_SPSCOUNT_BYTE_OFFSET;
    public static final long MAX_STD_PPSCOUNT_BYTE_OFFSET;
    public static final long P_PARAMETERS_ADD_INFO_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maxStdSPSCount"),
            JAVA_INT.withName("maxStdPPSCount"),
            UNBOUNDED_ADDRESS.withName("pParametersAddInfo")
        ).withName("VkVideoDecodeH264SessionParametersCreateInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_STD_SPSCOUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxStdSPSCount"));
        MAX_STD_PPSCOUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxStdPPSCount"));
        P_PARAMETERS_ADD_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pParametersAddInfo"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_STD_SPSCOUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxStdSPSCount"));
        MAX_STD_PPSCOUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxStdPPSCount"));
        P_PARAMETERS_ADD_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pParametersAddInfo"));
        //@formatter:on
    }

    public VkVideoDecodeH264SessionParametersCreateInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoDecodeH264SessionParametersCreateInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoDecodeH264SessionParametersCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkVideoDecodeH264SessionParametersCreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoDecodeH264SessionParametersCreateInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxStdSPSCount()
    public VkVideoDecodeH264SessionParametersCreateInfoKHR maxStdSPSCount(int maxStdSPSCount) {
    	MAX_STD_SPSCOUNT_HANDLE.set(segment, 0L, maxStdSPSCount);
    	return this;
    }
    
    public int maxStdSPSCount() {
    	return (int) MAX_STD_SPSCOUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxStdPPSCount()
    public VkVideoDecodeH264SessionParametersCreateInfoKHR maxStdPPSCount(int maxStdPPSCount) {
    	MAX_STD_PPSCOUNT_HANDLE.set(segment, 0L, maxStdPPSCount);
    	return this;
    }
    
    public int maxStdPPSCount() {
    	return (int) MAX_STD_PPSCOUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pParametersAddInfo()
    public VkVideoDecodeH264SessionParametersCreateInfoKHR pParametersAddInfo(VkVideoDecodeH264SessionParametersAddInfoKHR pParametersAddInfo) {
    	P_PARAMETERS_ADD_INFO_HANDLE.set(segment, 0L, pParametersAddInfo.memorySegment());
    	return this;
    }
    
    public @Nullable VkVideoDecodeH264SessionParametersAddInfoKHR pParametersAddInfo() {
    	MemorySegment segment = (MemorySegment) P_PARAMETERS_ADD_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkVideoDecodeH264SessionParametersAddInfoKHR(segment);
    }
    
    @Override
    public VkVideoDecodeH264SessionParametersCreateInfoKHR set(VkVideoDecodeH264SessionParametersCreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoDecodeH264SessionParametersCreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoDecodeH264SessionParametersCreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoDecodeH264SessionParametersCreateInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoDecodeH264SessionParametersCreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoDecodeH264SessionParametersCreateInfoKHR> array(Arena arena, VkVideoDecodeH264SessionParametersCreateInfoKHR... structs) {
        NativeStructArray<VkVideoDecodeH264SessionParametersCreateInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoDecodeH264SessionParametersCreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoDecodeH264SessionParametersCreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoDecodeH264SessionParametersCreateInfoKHR(segment)
        );
    }
    
}