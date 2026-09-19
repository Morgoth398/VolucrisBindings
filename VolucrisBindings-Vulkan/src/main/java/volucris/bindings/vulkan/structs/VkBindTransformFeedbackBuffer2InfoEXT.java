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

public final class VkBindTransformFeedbackBuffer2InfoEXT
		implements Struct<VkBindTransformFeedbackBuffer2InfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle ADDRESS_FLAGS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long ADDRESS_RANGE_BYTE_OFFSET;
    public static final long ADDRESS_FLAGS_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkDeviceAddressRangeKHR addressRange;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkDeviceAddressRangeKHR.LAYOUT.withName("addressRange"),
            JAVA_INT.withName("addressFlags"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkBindTransformFeedbackBuffer2InfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        ADDRESS_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("addressFlags"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        ADDRESS_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressRange"));
        ADDRESS_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressFlags"));
        //@formatter:on
    }

    public VkBindTransformFeedbackBuffer2InfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkBindTransformFeedbackBuffer2InfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkBindTransformFeedbackBuffer2InfoEXT(MemorySegment segment) {
        this.segment = segment;
    
        addressRange = new VkDeviceAddressRangeKHR(segment.asSlice(ADDRESS_RANGE_BYTE_OFFSET, VkDeviceAddressRangeKHR.LAYOUT));
    }

    /// @see #sType()
    public VkBindTransformFeedbackBuffer2InfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBindTransformFeedbackBuffer2InfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #addressFlags()
    public VkBindTransformFeedbackBuffer2InfoEXT addressFlags(int addressFlags) {
    	ADDRESS_FLAGS_HANDLE.set(segment, 0L, addressFlags);
    	return this;
    }
    
    public int addressFlags() {
    	return (int) ADDRESS_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #addressRange()
    public VkBindTransformFeedbackBuffer2InfoEXT addressRange(Consumer<VkDeviceAddressRangeKHR> consumer) {
    	consumer.accept(addressRange);
    	return this;
    }
    
    /// @see #addressRange()
    public VkBindTransformFeedbackBuffer2InfoEXT addressRange(VkDeviceAddressRangeKHR other) {
    	addressRange.set(other);
    	return this;
    }
    
    public VkDeviceAddressRangeKHR addressRange() {
    	return addressRange;
    }
    
    @Override
    public VkBindTransformFeedbackBuffer2InfoEXT set(VkBindTransformFeedbackBuffer2InfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkBindTransformFeedbackBuffer2InfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBindTransformFeedbackBuffer2InfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBindTransformFeedbackBuffer2InfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindTransformFeedbackBuffer2InfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBindTransformFeedbackBuffer2InfoEXT> array(Arena arena, VkBindTransformFeedbackBuffer2InfoEXT... structs) {
        NativeStructArray<VkBindTransformFeedbackBuffer2InfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindTransformFeedbackBuffer2InfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBindTransformFeedbackBuffer2InfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBindTransformFeedbackBuffer2InfoEXT(segment)
        );
    }
    
}