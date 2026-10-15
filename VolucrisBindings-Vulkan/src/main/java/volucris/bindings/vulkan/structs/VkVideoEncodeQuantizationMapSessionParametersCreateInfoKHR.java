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

public final class VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR
		implements Struct<VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long QUANTIZATION_MAP_TEXEL_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent2D quantizationMapTexelSize;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkExtent2D.LAYOUT.withName("quantizationMapTexelSize")
		).withName("VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		QUANTIZATION_MAP_TEXEL_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("quantizationMapTexelSize"));
		//@formatter:on
	}

	public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    quantizationMapTexelSize = new VkExtent2D(segment.asSlice(QUANTIZATION_MAP_TEXEL_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
	}

    /// @see #sType()
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #quantizationMapTexelSize()
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR quantizationMapTexelSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(quantizationMapTexelSize);
    	return this;
    }
    
    /// @see #quantizationMapTexelSize()
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR quantizationMapTexelSize(VkExtent2D other) {
    	quantizationMapTexelSize.set(other);
    	return this;
    }
    
    public VkExtent2D quantizationMapTexelSize() {
    	return quantizationMapTexelSize;
    }
    
    @Override
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR set(VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR> array(Arena arena, VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(segment)
        );
    }

}