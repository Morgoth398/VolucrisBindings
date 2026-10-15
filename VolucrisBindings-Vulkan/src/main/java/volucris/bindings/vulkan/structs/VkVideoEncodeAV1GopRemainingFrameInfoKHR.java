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

public final class VkVideoEncodeAV1GopRemainingFrameInfoKHR
		implements Struct<VkVideoEncodeAV1GopRemainingFrameInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle USE_GOP_REMAINING_FRAMES_HANDLE;
	public static final VarHandle GOP_REMAINING_INTRA_HANDLE;
	public static final VarHandle GOP_REMAINING_PREDICTIVE_HANDLE;
	public static final VarHandle GOP_REMAINING_BIPREDICTIVE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long USE_GOP_REMAINING_FRAMES_BYTE_OFFSET;
	public static final long GOP_REMAINING_INTRA_BYTE_OFFSET;
	public static final long GOP_REMAINING_PREDICTIVE_BYTE_OFFSET;
	public static final long GOP_REMAINING_BIPREDICTIVE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("useGopRemainingFrames"),
		    JAVA_INT.withName("gopRemainingIntra"),
		    JAVA_INT.withName("gopRemainingPredictive"),
		    JAVA_INT.withName("gopRemainingBipredictive")
		).withName("VkVideoEncodeAV1GopRemainingFrameInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		USE_GOP_REMAINING_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("useGopRemainingFrames"));
		GOP_REMAINING_INTRA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gopRemainingIntra"));
		GOP_REMAINING_PREDICTIVE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gopRemainingPredictive"));
		GOP_REMAINING_BIPREDICTIVE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gopRemainingBipredictive"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		USE_GOP_REMAINING_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("useGopRemainingFrames"));
		GOP_REMAINING_INTRA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gopRemainingIntra"));
		GOP_REMAINING_PREDICTIVE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gopRemainingPredictive"));
		GOP_REMAINING_BIPREDICTIVE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gopRemainingBipredictive"));
		//@formatter:on
	}

	public VkVideoEncodeAV1GopRemainingFrameInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeAV1GopRemainingFrameInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoEncodeAV1GopRemainingFrameInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #useGopRemainingFrames()
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR useGopRemainingFrames(int useGopRemainingFrames) {
    	USE_GOP_REMAINING_FRAMES_HANDLE.set(segment, 0L, useGopRemainingFrames);
    	return this;
    }
    
    public int useGopRemainingFrames() {
    	return (int) USE_GOP_REMAINING_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #gopRemainingIntra()
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingIntra(int gopRemainingIntra) {
    	GOP_REMAINING_INTRA_HANDLE.set(segment, 0L, gopRemainingIntra);
    	return this;
    }
    
    public int gopRemainingIntra() {
    	return (int) GOP_REMAINING_INTRA_HANDLE.get(segment, 0L);
    }
    
    /// @see #gopRemainingPredictive()
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingPredictive(int gopRemainingPredictive) {
    	GOP_REMAINING_PREDICTIVE_HANDLE.set(segment, 0L, gopRemainingPredictive);
    	return this;
    }
    
    public int gopRemainingPredictive() {
    	return (int) GOP_REMAINING_PREDICTIVE_HANDLE.get(segment, 0L);
    }
    
    /// @see #gopRemainingBipredictive()
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR gopRemainingBipredictive(int gopRemainingBipredictive) {
    	GOP_REMAINING_BIPREDICTIVE_HANDLE.set(segment, 0L, gopRemainingBipredictive);
    	return this;
    }
    
    public int gopRemainingBipredictive() {
    	return (int) GOP_REMAINING_BIPREDICTIVE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR set(VkVideoEncodeAV1GopRemainingFrameInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeAV1GopRemainingFrameInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeAV1GopRemainingFrameInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeAV1GopRemainingFrameInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeAV1GopRemainingFrameInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeAV1GopRemainingFrameInfoKHR> array(Arena arena, VkVideoEncodeAV1GopRemainingFrameInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeAV1GopRemainingFrameInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeAV1GopRemainingFrameInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeAV1GopRemainingFrameInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeAV1GopRemainingFrameInfoKHR(segment)
        );
    }

}