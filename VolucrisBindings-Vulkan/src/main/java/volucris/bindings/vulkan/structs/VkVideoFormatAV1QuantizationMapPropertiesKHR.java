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

public final class VkVideoFormatAV1QuantizationMapPropertiesKHR
		implements Struct<VkVideoFormatAV1QuantizationMapPropertiesKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle COMPATIBLE_SUPERBLOCK_SIZES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long COMPATIBLE_SUPERBLOCK_SIZES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("compatibleSuperblockSizes"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkVideoFormatAV1QuantizationMapPropertiesKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        COMPATIBLE_SUPERBLOCK_SIZES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("compatibleSuperblockSizes"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        COMPATIBLE_SUPERBLOCK_SIZES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("compatibleSuperblockSizes"));
        //@formatter:on
    }

    public VkVideoFormatAV1QuantizationMapPropertiesKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoFormatAV1QuantizationMapPropertiesKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoFormatAV1QuantizationMapPropertiesKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkVideoFormatAV1QuantizationMapPropertiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoFormatAV1QuantizationMapPropertiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #compatibleSuperblockSizes()
    public VkVideoFormatAV1QuantizationMapPropertiesKHR compatibleSuperblockSizes(int compatibleSuperblockSizes) {
    	COMPATIBLE_SUPERBLOCK_SIZES_HANDLE.set(segment, 0L, compatibleSuperblockSizes);
    	return this;
    }
    
    public int compatibleSuperblockSizes() {
    	return (int) COMPATIBLE_SUPERBLOCK_SIZES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoFormatAV1QuantizationMapPropertiesKHR set(VkVideoFormatAV1QuantizationMapPropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoFormatAV1QuantizationMapPropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoFormatAV1QuantizationMapPropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoFormatAV1QuantizationMapPropertiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoFormatAV1QuantizationMapPropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoFormatAV1QuantizationMapPropertiesKHR> array(Arena arena, VkVideoFormatAV1QuantizationMapPropertiesKHR... structs) {
        NativeStructArray<VkVideoFormatAV1QuantizationMapPropertiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoFormatAV1QuantizationMapPropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoFormatAV1QuantizationMapPropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoFormatAV1QuantizationMapPropertiesKHR(segment)
        );
    }
    
}