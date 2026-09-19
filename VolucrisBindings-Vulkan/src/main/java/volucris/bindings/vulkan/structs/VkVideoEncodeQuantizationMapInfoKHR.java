/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkVideoEncodeQuantizationMapInfoKHR
		implements Struct<VkVideoEncodeQuantizationMapInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle QUANTIZATION_MAP_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long QUANTIZATION_MAP_BYTE_OFFSET;
    public static final long QUANTIZATION_MAP_EXTENT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkExtent2D quantizationMapExtent;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("quantizationMap"),
            VkExtent2D.LAYOUT.withName("quantizationMapExtent")
        ).withName("VkVideoEncodeQuantizationMapInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        QUANTIZATION_MAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("quantizationMap"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        QUANTIZATION_MAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("quantizationMap"));
        QUANTIZATION_MAP_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("quantizationMapExtent"));
        //@formatter:on
    }

    public VkVideoEncodeQuantizationMapInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoEncodeQuantizationMapInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoEncodeQuantizationMapInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
        quantizationMapExtent = new VkExtent2D(segment.asSlice(QUANTIZATION_MAP_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
    }

    /// @see #sType()
    public VkVideoEncodeQuantizationMapInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeQuantizationMapInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #quantizationMap()
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMap(VkImageView quantizationMap) {
    	QUANTIZATION_MAP_HANDLE.set(segment, 0L, quantizationMap.memorySegment());
    	return this;
    }
    
    public @Nullable VkImageView quantizationMap() {
    	MemorySegment segment = (MemorySegment) QUANTIZATION_MAP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImageView(segment);
    }
    
    /// @see #quantizationMapExtent()
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMapExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(quantizationMapExtent);
    	return this;
    }
    
    /// @see #quantizationMapExtent()
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMapExtent(VkExtent2D other) {
    	quantizationMapExtent.set(other);
    	return this;
    }
    
    public VkExtent2D quantizationMapExtent() {
    	return quantizationMapExtent;
    }
    
    @Override
    public VkVideoEncodeQuantizationMapInfoKHR set(VkVideoEncodeQuantizationMapInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeQuantizationMapInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeQuantizationMapInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeQuantizationMapInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeQuantizationMapInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeQuantizationMapInfoKHR> array(Arena arena, VkVideoEncodeQuantizationMapInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeQuantizationMapInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeQuantizationMapInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeQuantizationMapInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeQuantizationMapInfoKHR(segment)
        );
    }
    
}