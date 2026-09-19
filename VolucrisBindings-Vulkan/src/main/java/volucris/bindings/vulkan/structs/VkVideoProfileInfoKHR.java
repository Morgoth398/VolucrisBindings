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

public final class VkVideoProfileInfoKHR
		implements Struct<VkVideoProfileInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle VIDEO_CODEC_OPERATION_HANDLE;
    public static final VarHandle CHROMA_SUBSAMPLING_HANDLE;
    public static final VarHandle LUMA_BIT_DEPTH_HANDLE;
    public static final VarHandle CHROMA_BIT_DEPTH_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long VIDEO_CODEC_OPERATION_BYTE_OFFSET;
    public static final long CHROMA_SUBSAMPLING_BYTE_OFFSET;
    public static final long LUMA_BIT_DEPTH_BYTE_OFFSET;
    public static final long CHROMA_BIT_DEPTH_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("videoCodecOperation"),
            JAVA_INT.withName("chromaSubsampling"),
            JAVA_INT.withName("lumaBitDepth"),
            JAVA_INT.withName("chromaBitDepth")
        ).withName("VkVideoProfileInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        VIDEO_CODEC_OPERATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("videoCodecOperation"));
        CHROMA_SUBSAMPLING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chromaSubsampling"));
        LUMA_BIT_DEPTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lumaBitDepth"));
        CHROMA_BIT_DEPTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chromaBitDepth"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        VIDEO_CODEC_OPERATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("videoCodecOperation"));
        CHROMA_SUBSAMPLING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chromaSubsampling"));
        LUMA_BIT_DEPTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lumaBitDepth"));
        CHROMA_BIT_DEPTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chromaBitDepth"));
        //@formatter:on
    }

    public VkVideoProfileInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoProfileInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoProfileInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkVideoProfileInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoProfileInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #videoCodecOperation()
    public VkVideoProfileInfoKHR videoCodecOperation(int videoCodecOperation) {
    	VIDEO_CODEC_OPERATION_HANDLE.set(segment, 0L, videoCodecOperation);
    	return this;
    }
    
    public int videoCodecOperation() {
    	return (int) VIDEO_CODEC_OPERATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #chromaSubsampling()
    public VkVideoProfileInfoKHR chromaSubsampling(int chromaSubsampling) {
    	CHROMA_SUBSAMPLING_HANDLE.set(segment, 0L, chromaSubsampling);
    	return this;
    }
    
    public int chromaSubsampling() {
    	return (int) CHROMA_SUBSAMPLING_HANDLE.get(segment, 0L);
    }
    
    /// @see #lumaBitDepth()
    public VkVideoProfileInfoKHR lumaBitDepth(int lumaBitDepth) {
    	LUMA_BIT_DEPTH_HANDLE.set(segment, 0L, lumaBitDepth);
    	return this;
    }
    
    public int lumaBitDepth() {
    	return (int) LUMA_BIT_DEPTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #chromaBitDepth()
    public VkVideoProfileInfoKHR chromaBitDepth(int chromaBitDepth) {
    	CHROMA_BIT_DEPTH_HANDLE.set(segment, 0L, chromaBitDepth);
    	return this;
    }
    
    public int chromaBitDepth() {
    	return (int) CHROMA_BIT_DEPTH_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoProfileInfoKHR set(VkVideoProfileInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoProfileInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoProfileInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoProfileInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoProfileInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoProfileInfoKHR> array(Arena arena, VkVideoProfileInfoKHR... structs) {
        NativeStructArray<VkVideoProfileInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoProfileInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoProfileInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoProfileInfoKHR(segment)
        );
    }
    
}