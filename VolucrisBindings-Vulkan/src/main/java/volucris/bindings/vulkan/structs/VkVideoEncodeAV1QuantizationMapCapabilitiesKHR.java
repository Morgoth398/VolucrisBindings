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

public final class VkVideoEncodeAV1QuantizationMapCapabilitiesKHR
		implements Struct<VkVideoEncodeAV1QuantizationMapCapabilitiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MIN_QINDEX_DELTA_HANDLE;
	public static final VarHandle MAX_QINDEX_DELTA_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MIN_QINDEX_DELTA_BYTE_OFFSET;
	public static final long MAX_QINDEX_DELTA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("minQIndexDelta"),
		    JAVA_INT.withName("maxQIndexDelta")
		).withName("VkVideoEncodeAV1QuantizationMapCapabilitiesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MIN_QINDEX_DELTA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minQIndexDelta"));
		MAX_QINDEX_DELTA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxQIndexDelta"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MIN_QINDEX_DELTA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minQIndexDelta"));
		MAX_QINDEX_DELTA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxQIndexDelta"));
		//@formatter:on
	}

	public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #minQIndexDelta()
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR minQIndexDelta(int minQIndexDelta) {
    	MIN_QINDEX_DELTA_HANDLE.set(segment, 0L, minQIndexDelta);
    	return this;
    }
    
    public int minQIndexDelta() {
    	return (int) MIN_QINDEX_DELTA_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxQIndexDelta()
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR maxQIndexDelta(int maxQIndexDelta) {
    	MAX_QINDEX_DELTA_HANDLE.set(segment, 0L, maxQIndexDelta);
    	return this;
    }
    
    public int maxQIndexDelta() {
    	return (int) MAX_QINDEX_DELTA_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR set(VkVideoEncodeAV1QuantizationMapCapabilitiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeAV1QuantizationMapCapabilitiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeAV1QuantizationMapCapabilitiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeAV1QuantizationMapCapabilitiesKHR> array(Arena arena, VkVideoEncodeAV1QuantizationMapCapabilitiesKHR... structs) {
        NativeStructArray<VkVideoEncodeAV1QuantizationMapCapabilitiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeAV1QuantizationMapCapabilitiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(segment)
        );
    }

}