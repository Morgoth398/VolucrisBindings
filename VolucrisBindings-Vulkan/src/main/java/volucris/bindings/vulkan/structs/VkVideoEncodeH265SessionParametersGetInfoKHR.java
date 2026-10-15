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

public final class VkVideoEncodeH265SessionParametersGetInfoKHR
		implements Struct<VkVideoEncodeH265SessionParametersGetInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle WRITE_STD_VPS_HANDLE;
	public static final VarHandle WRITE_STD_SPS_HANDLE;
	public static final VarHandle WRITE_STD_PPS_HANDLE;
	public static final VarHandle STD_VPSID_HANDLE;
	public static final VarHandle STD_SPSID_HANDLE;
	public static final VarHandle STD_PPSID_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long WRITE_STD_VPS_BYTE_OFFSET;
	public static final long WRITE_STD_SPS_BYTE_OFFSET;
	public static final long WRITE_STD_PPS_BYTE_OFFSET;
	public static final long STD_VPSID_BYTE_OFFSET;
	public static final long STD_SPSID_BYTE_OFFSET;
	public static final long STD_PPSID_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("writeStdVPS"),
		    JAVA_INT.withName("writeStdSPS"),
		    JAVA_INT.withName("writeStdPPS"),
		    JAVA_INT.withName("stdVPSId"),
		    JAVA_INT.withName("stdSPSId"),
		    JAVA_INT.withName("stdPPSId")
		).withName("VkVideoEncodeH265SessionParametersGetInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		WRITE_STD_VPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("writeStdVPS"));
		WRITE_STD_SPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("writeStdSPS"));
		WRITE_STD_PPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("writeStdPPS"));
		STD_VPSID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stdVPSId"));
		STD_SPSID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stdSPSId"));
		STD_PPSID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stdPPSId"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		WRITE_STD_VPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("writeStdVPS"));
		WRITE_STD_SPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("writeStdSPS"));
		WRITE_STD_PPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("writeStdPPS"));
		STD_VPSID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stdVPSId"));
		STD_SPSID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stdSPSId"));
		STD_PPSID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stdPPSId"));
		//@formatter:on
	}

	public VkVideoEncodeH265SessionParametersGetInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeH265SessionParametersGetInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoEncodeH265SessionParametersGetInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeH265SessionParametersGetInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeH265SessionParametersGetInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #writeStdVPS()
    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdVPS(int writeStdVPS) {
    	WRITE_STD_VPS_HANDLE.set(segment, 0L, writeStdVPS);
    	return this;
    }
    
    public int writeStdVPS() {
    	return (int) WRITE_STD_VPS_HANDLE.get(segment, 0L);
    }
    
    /// @see #writeStdSPS()
    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdSPS(int writeStdSPS) {
    	WRITE_STD_SPS_HANDLE.set(segment, 0L, writeStdSPS);
    	return this;
    }
    
    public int writeStdSPS() {
    	return (int) WRITE_STD_SPS_HANDLE.get(segment, 0L);
    }
    
    /// @see #writeStdPPS()
    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdPPS(int writeStdPPS) {
    	WRITE_STD_PPS_HANDLE.set(segment, 0L, writeStdPPS);
    	return this;
    }
    
    public int writeStdPPS() {
    	return (int) WRITE_STD_PPS_HANDLE.get(segment, 0L);
    }
    
    /// @see #stdVPSId()
    public VkVideoEncodeH265SessionParametersGetInfoKHR stdVPSId(int stdVPSId) {
    	STD_VPSID_HANDLE.set(segment, 0L, stdVPSId);
    	return this;
    }
    
    public int stdVPSId() {
    	return (int) STD_VPSID_HANDLE.get(segment, 0L);
    }
    
    /// @see #stdSPSId()
    public VkVideoEncodeH265SessionParametersGetInfoKHR stdSPSId(int stdSPSId) {
    	STD_SPSID_HANDLE.set(segment, 0L, stdSPSId);
    	return this;
    }
    
    public int stdSPSId() {
    	return (int) STD_SPSID_HANDLE.get(segment, 0L);
    }
    
    /// @see #stdPPSId()
    public VkVideoEncodeH265SessionParametersGetInfoKHR stdPPSId(int stdPPSId) {
    	STD_PPSID_HANDLE.set(segment, 0L, stdPPSId);
    	return this;
    }
    
    public int stdPPSId() {
    	return (int) STD_PPSID_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeH265SessionParametersGetInfoKHR set(VkVideoEncodeH265SessionParametersGetInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeH265SessionParametersGetInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeH265SessionParametersGetInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeH265SessionParametersGetInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH265SessionParametersGetInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeH265SessionParametersGetInfoKHR> array(Arena arena, VkVideoEncodeH265SessionParametersGetInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeH265SessionParametersGetInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH265SessionParametersGetInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeH265SessionParametersGetInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeH265SessionParametersGetInfoKHR(segment)
        );
    }

}