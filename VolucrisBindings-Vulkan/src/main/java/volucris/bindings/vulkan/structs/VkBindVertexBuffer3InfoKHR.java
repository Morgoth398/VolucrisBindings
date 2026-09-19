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

public final class VkBindVertexBuffer3InfoKHR
		implements Struct<VkBindVertexBuffer3InfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SET_STRIDE_HANDLE;
    public static final VarHandle ADDRESS_FLAGS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SET_STRIDE_BYTE_OFFSET;
    public static final long ADDRESS_RANGE_BYTE_OFFSET;
    public static final long ADDRESS_FLAGS_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkStridedDeviceAddressRangeKHR addressRange;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("setStride"),
            MemoryLayout.paddingLayout(4),
            VkStridedDeviceAddressRangeKHR.LAYOUT.withName("addressRange"),
            JAVA_INT.withName("addressFlags"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkBindVertexBuffer3InfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SET_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("setStride"));
        ADDRESS_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("addressFlags"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SET_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("setStride"));
        ADDRESS_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressRange"));
        ADDRESS_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressFlags"));
        //@formatter:on
    }

    public VkBindVertexBuffer3InfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkBindVertexBuffer3InfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkBindVertexBuffer3InfoKHR(MemorySegment segment) {
        this.segment = segment;
    
        addressRange = new VkStridedDeviceAddressRangeKHR(segment.asSlice(ADDRESS_RANGE_BYTE_OFFSET, VkStridedDeviceAddressRangeKHR.LAYOUT));
    }

    /// @see #sType()
    public VkBindVertexBuffer3InfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBindVertexBuffer3InfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #setStride()
    public VkBindVertexBuffer3InfoKHR setStride(int setStride) {
    	SET_STRIDE_HANDLE.set(segment, 0L, setStride);
    	return this;
    }
    
    public int setStride() {
    	return (int) SET_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #addressFlags()
    public VkBindVertexBuffer3InfoKHR addressFlags(int addressFlags) {
    	ADDRESS_FLAGS_HANDLE.set(segment, 0L, addressFlags);
    	return this;
    }
    
    public int addressFlags() {
    	return (int) ADDRESS_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #addressRange()
    public VkBindVertexBuffer3InfoKHR addressRange(Consumer<VkStridedDeviceAddressRangeKHR> consumer) {
    	consumer.accept(addressRange);
    	return this;
    }
    
    /// @see #addressRange()
    public VkBindVertexBuffer3InfoKHR addressRange(VkStridedDeviceAddressRangeKHR other) {
    	addressRange.set(other);
    	return this;
    }
    
    public VkStridedDeviceAddressRangeKHR addressRange() {
    	return addressRange;
    }
    
    @Override
    public VkBindVertexBuffer3InfoKHR set(VkBindVertexBuffer3InfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkBindVertexBuffer3InfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBindVertexBuffer3InfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBindVertexBuffer3InfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindVertexBuffer3InfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBindVertexBuffer3InfoKHR> array(Arena arena, VkBindVertexBuffer3InfoKHR... structs) {
        NativeStructArray<VkBindVertexBuffer3InfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindVertexBuffer3InfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBindVertexBuffer3InfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBindVertexBuffer3InfoKHR(segment)
        );
    }
    
}