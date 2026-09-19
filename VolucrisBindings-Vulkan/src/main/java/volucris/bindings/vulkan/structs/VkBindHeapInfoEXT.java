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

public final class VkBindHeapInfoEXT
		implements Struct<VkBindHeapInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle RESERVED_RANGE_OFFSET_HANDLE;
    public static final VarHandle RESERVED_RANGE_SIZE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long HEAP_RANGE_BYTE_OFFSET;
    public static final long RESERVED_RANGE_OFFSET_BYTE_OFFSET;
    public static final long RESERVED_RANGE_SIZE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkDeviceAddressRangeKHR heapRange;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkDeviceAddressRangeKHR.LAYOUT.withName("heapRange"),
            JAVA_LONG.withName("reservedRangeOffset"),
            JAVA_LONG.withName("reservedRangeSize")
        ).withName("VkBindHeapInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        RESERVED_RANGE_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reservedRangeOffset"));
        RESERVED_RANGE_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reservedRangeSize"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        HEAP_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heapRange"));
        RESERVED_RANGE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reservedRangeOffset"));
        RESERVED_RANGE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reservedRangeSize"));
        //@formatter:on
    }

    public VkBindHeapInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkBindHeapInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkBindHeapInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
        heapRange = new VkDeviceAddressRangeKHR(segment.asSlice(HEAP_RANGE_BYTE_OFFSET, VkDeviceAddressRangeKHR.LAYOUT));
    }

    /// @see #sType()
    public VkBindHeapInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBindHeapInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #reservedRangeOffset()
    public VkBindHeapInfoEXT reservedRangeOffset(long reservedRangeOffset) {
    	RESERVED_RANGE_OFFSET_HANDLE.set(segment, 0L, reservedRangeOffset);
    	return this;
    }
    
    public long reservedRangeOffset() {
    	return (long) RESERVED_RANGE_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #reservedRangeSize()
    public VkBindHeapInfoEXT reservedRangeSize(long reservedRangeSize) {
    	RESERVED_RANGE_SIZE_HANDLE.set(segment, 0L, reservedRangeSize);
    	return this;
    }
    
    public long reservedRangeSize() {
    	return (long) RESERVED_RANGE_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #heapRange()
    public VkBindHeapInfoEXT heapRange(Consumer<VkDeviceAddressRangeKHR> consumer) {
    	consumer.accept(heapRange);
    	return this;
    }
    
    /// @see #heapRange()
    public VkBindHeapInfoEXT heapRange(VkDeviceAddressRangeKHR other) {
    	heapRange.set(other);
    	return this;
    }
    
    public VkDeviceAddressRangeKHR heapRange() {
    	return heapRange;
    }
    
    @Override
    public VkBindHeapInfoEXT set(VkBindHeapInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkBindHeapInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBindHeapInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBindHeapInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindHeapInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBindHeapInfoEXT> array(Arena arena, VkBindHeapInfoEXT... structs) {
        NativeStructArray<VkBindHeapInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindHeapInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBindHeapInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBindHeapInfoEXT(segment)
        );
    }
    
}