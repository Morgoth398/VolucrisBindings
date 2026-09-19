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

public final class VkDeviceMemoryCopyKHR
		implements Struct<VkDeviceMemoryCopyKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SRC_FLAGS_HANDLE;
    public static final VarHandle DST_FLAGS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SRC_RANGE_BYTE_OFFSET;
    public static final long SRC_FLAGS_BYTE_OFFSET;
    public static final long DST_RANGE_BYTE_OFFSET;
    public static final long DST_FLAGS_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkDeviceAddressRangeKHR srcRange;
    private final VkDeviceAddressRangeKHR dstRange;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkDeviceAddressRangeKHR.LAYOUT.withName("srcRange"),
            JAVA_INT.withName("srcFlags"),
            MemoryLayout.paddingLayout(4),
            VkDeviceAddressRangeKHR.LAYOUT.withName("dstRange"),
            JAVA_INT.withName("dstFlags"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkDeviceMemoryCopyKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SRC_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcFlags"));
        DST_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstFlags"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SRC_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcRange"));
        SRC_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcFlags"));
        DST_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstRange"));
        DST_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstFlags"));
        //@formatter:on
    }

    public VkDeviceMemoryCopyKHR() {
        this(Arena.ofAuto());
    }
    
    public VkDeviceMemoryCopyKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDeviceMemoryCopyKHR(MemorySegment segment) {
        this.segment = segment;
    
        srcRange = new VkDeviceAddressRangeKHR(segment.asSlice(SRC_RANGE_BYTE_OFFSET, VkDeviceAddressRangeKHR.LAYOUT));
        dstRange = new VkDeviceAddressRangeKHR(segment.asSlice(DST_RANGE_BYTE_OFFSET, VkDeviceAddressRangeKHR.LAYOUT));
    }

    /// @see #sType()
    public VkDeviceMemoryCopyKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceMemoryCopyKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #srcFlags()
    public VkDeviceMemoryCopyKHR srcFlags(int srcFlags) {
    	SRC_FLAGS_HANDLE.set(segment, 0L, srcFlags);
    	return this;
    }
    
    public int srcFlags() {
    	return (int) SRC_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstFlags()
    public VkDeviceMemoryCopyKHR dstFlags(int dstFlags) {
    	DST_FLAGS_HANDLE.set(segment, 0L, dstFlags);
    	return this;
    }
    
    public int dstFlags() {
    	return (int) DST_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcRange()
    public VkDeviceMemoryCopyKHR srcRange(Consumer<VkDeviceAddressRangeKHR> consumer) {
    	consumer.accept(srcRange);
    	return this;
    }
    
    /// @see #srcRange()
    public VkDeviceMemoryCopyKHR srcRange(VkDeviceAddressRangeKHR other) {
    	srcRange.set(other);
    	return this;
    }
    
    public VkDeviceAddressRangeKHR srcRange() {
    	return srcRange;
    }
    
    /// @see #dstRange()
    public VkDeviceMemoryCopyKHR dstRange(Consumer<VkDeviceAddressRangeKHR> consumer) {
    	consumer.accept(dstRange);
    	return this;
    }
    
    /// @see #dstRange()
    public VkDeviceMemoryCopyKHR dstRange(VkDeviceAddressRangeKHR other) {
    	dstRange.set(other);
    	return this;
    }
    
    public VkDeviceAddressRangeKHR dstRange() {
    	return dstRange;
    }
    
    @Override
    public VkDeviceMemoryCopyKHR set(VkDeviceMemoryCopyKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceMemoryCopyKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceMemoryCopyKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceMemoryCopyKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceMemoryCopyKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceMemoryCopyKHR> array(Arena arena, VkDeviceMemoryCopyKHR... structs) {
        NativeStructArray<VkDeviceMemoryCopyKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceMemoryCopyKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceMemoryCopyKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceMemoryCopyKHR(segment)
        );
    }
    
}