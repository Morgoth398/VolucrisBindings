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

public final class VkVideoEncodeQuantizationMapCapabilitiesKHR
		implements Struct<VkVideoEncodeQuantizationMapCapabilitiesKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_QUANTIZATION_MAP_EXTENT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkExtent2D maxQuantizationMapExtent;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkExtent2D.LAYOUT.withName("maxQuantizationMapExtent")
        ).withName("VkVideoEncodeQuantizationMapCapabilitiesKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_QUANTIZATION_MAP_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxQuantizationMapExtent"));
        //@formatter:on
    }

    public VkVideoEncodeQuantizationMapCapabilitiesKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoEncodeQuantizationMapCapabilitiesKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoEncodeQuantizationMapCapabilitiesKHR(MemorySegment segment) {
        this.segment = segment;
    
        maxQuantizationMapExtent = new VkExtent2D(segment.asSlice(MAX_QUANTIZATION_MAP_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
    }

    /// @see #sType()
    public VkVideoEncodeQuantizationMapCapabilitiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeQuantizationMapCapabilitiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxQuantizationMapExtent()
    public VkVideoEncodeQuantizationMapCapabilitiesKHR maxQuantizationMapExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxQuantizationMapExtent);
    	return this;
    }
    
    /// @see #maxQuantizationMapExtent()
    public VkVideoEncodeQuantizationMapCapabilitiesKHR maxQuantizationMapExtent(VkExtent2D other) {
    	maxQuantizationMapExtent.set(other);
    	return this;
    }
    
    public VkExtent2D maxQuantizationMapExtent() {
    	return maxQuantizationMapExtent;
    }
    
    @Override
    public VkVideoEncodeQuantizationMapCapabilitiesKHR set(VkVideoEncodeQuantizationMapCapabilitiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeQuantizationMapCapabilitiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeQuantizationMapCapabilitiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeQuantizationMapCapabilitiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeQuantizationMapCapabilitiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeQuantizationMapCapabilitiesKHR> array(Arena arena, VkVideoEncodeQuantizationMapCapabilitiesKHR... structs) {
        NativeStructArray<VkVideoEncodeQuantizationMapCapabilitiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeQuantizationMapCapabilitiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeQuantizationMapCapabilitiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeQuantizationMapCapabilitiesKHR(segment)
        );
    }
    
}