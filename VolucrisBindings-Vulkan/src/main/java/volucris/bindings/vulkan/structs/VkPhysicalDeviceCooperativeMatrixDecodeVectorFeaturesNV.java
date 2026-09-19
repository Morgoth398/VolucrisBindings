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

public final class VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV
		implements Struct<VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle COOPERATIVE_MATRIX_DECODE_VECTOR_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long COOPERATIVE_MATRIX_DECODE_VECTOR_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("cooperativeMatrixDecodeVector"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        COOPERATIVE_MATRIX_DECODE_VECTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cooperativeMatrixDecodeVector"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        COOPERATIVE_MATRIX_DECODE_VECTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixDecodeVector"));
        //@formatter:on
    }

    public VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #cooperativeMatrixDecodeVector()
    public VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV cooperativeMatrixDecodeVector(int cooperativeMatrixDecodeVector) {
    	COOPERATIVE_MATRIX_DECODE_VECTOR_HANDLE.set(segment, 0L, cooperativeMatrixDecodeVector);
    	return this;
    }
    
    public int cooperativeMatrixDecodeVector() {
    	return (int) COOPERATIVE_MATRIX_DECODE_VECTOR_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV set(VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV> array(Arena arena, VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV(segment)
        );
    }
    
}