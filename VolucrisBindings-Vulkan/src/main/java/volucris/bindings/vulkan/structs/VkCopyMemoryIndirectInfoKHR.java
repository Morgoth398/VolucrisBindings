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

public final class VkCopyMemoryIndirectInfoKHR
		implements Struct<VkCopyMemoryIndirectInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SRC_COPY_FLAGS_HANDLE;
    public static final VarHandle DST_COPY_FLAGS_HANDLE;
    public static final VarHandle COPY_COUNT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SRC_COPY_FLAGS_BYTE_OFFSET;
    public static final long DST_COPY_FLAGS_BYTE_OFFSET;
    public static final long COPY_COUNT_BYTE_OFFSET;
    public static final long COPY_ADDRESS_RANGE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkStridedDeviceAddressRangeKHR copyAddressRange;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("srcCopyFlags"),
            JAVA_INT.withName("dstCopyFlags"),
            JAVA_INT.withName("copyCount"),
            MemoryLayout.paddingLayout(4),
            VkStridedDeviceAddressRangeKHR.LAYOUT.withName("copyAddressRange")
        ).withName("VkCopyMemoryIndirectInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SRC_COPY_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcCopyFlags"));
        DST_COPY_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstCopyFlags"));
        COPY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("copyCount"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SRC_COPY_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcCopyFlags"));
        DST_COPY_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstCopyFlags"));
        COPY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("copyCount"));
        COPY_ADDRESS_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("copyAddressRange"));
        //@formatter:on
    }

    public VkCopyMemoryIndirectInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkCopyMemoryIndirectInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkCopyMemoryIndirectInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
        copyAddressRange = new VkStridedDeviceAddressRangeKHR(segment.asSlice(COPY_ADDRESS_RANGE_BYTE_OFFSET, VkStridedDeviceAddressRangeKHR.LAYOUT));
    }

    /// @see #sType()
    public VkCopyMemoryIndirectInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCopyMemoryIndirectInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #srcCopyFlags()
    public VkCopyMemoryIndirectInfoKHR srcCopyFlags(int srcCopyFlags) {
    	SRC_COPY_FLAGS_HANDLE.set(segment, 0L, srcCopyFlags);
    	return this;
    }
    
    public int srcCopyFlags() {
    	return (int) SRC_COPY_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstCopyFlags()
    public VkCopyMemoryIndirectInfoKHR dstCopyFlags(int dstCopyFlags) {
    	DST_COPY_FLAGS_HANDLE.set(segment, 0L, dstCopyFlags);
    	return this;
    }
    
    public int dstCopyFlags() {
    	return (int) DST_COPY_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #copyCount()
    public VkCopyMemoryIndirectInfoKHR copyCount(int copyCount) {
    	COPY_COUNT_HANDLE.set(segment, 0L, copyCount);
    	return this;
    }
    
    public int copyCount() {
    	return (int) COPY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #copyAddressRange()
    public VkCopyMemoryIndirectInfoKHR copyAddressRange(Consumer<VkStridedDeviceAddressRangeKHR> consumer) {
    	consumer.accept(copyAddressRange);
    	return this;
    }
    
    /// @see #copyAddressRange()
    public VkCopyMemoryIndirectInfoKHR copyAddressRange(VkStridedDeviceAddressRangeKHR other) {
    	copyAddressRange.set(other);
    	return this;
    }
    
    public VkStridedDeviceAddressRangeKHR copyAddressRange() {
    	return copyAddressRange;
    }
    
    @Override
    public VkCopyMemoryIndirectInfoKHR set(VkCopyMemoryIndirectInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkCopyMemoryIndirectInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCopyMemoryIndirectInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCopyMemoryIndirectInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCopyMemoryIndirectInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCopyMemoryIndirectInfoKHR> array(Arena arena, VkCopyMemoryIndirectInfoKHR... structs) {
        NativeStructArray<VkCopyMemoryIndirectInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCopyMemoryIndirectInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCopyMemoryIndirectInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCopyMemoryIndirectInfoKHR(segment)
        );
    }
    
}