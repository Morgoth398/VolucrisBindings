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

public final class VkConditionalRenderingBeginInfo2EXT
		implements Struct<VkConditionalRenderingBeginInfo2EXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ADDRESS_FLAGS_HANDLE;
	public static final VarHandle FLAGS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ADDRESS_RANGE_BYTE_OFFSET;
	public static final long ADDRESS_FLAGS_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;

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
		    JAVA_INT.withName("flags")
		).withName("VkConditionalRenderingBeginInfo2EXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ADDRESS_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("addressFlags"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ADDRESS_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressRange"));
		ADDRESS_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressFlags"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		//@formatter:on
	}

	public VkConditionalRenderingBeginInfo2EXT() {
	    this(Arena.ofAuto());
	}
	
	public VkConditionalRenderingBeginInfo2EXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkConditionalRenderingBeginInfo2EXT(MemorySegment segment) {
	    this.segment = segment;
	
	    addressRange = new VkDeviceAddressRangeKHR(segment.asSlice(ADDRESS_RANGE_BYTE_OFFSET, VkDeviceAddressRangeKHR.LAYOUT));
	}

    /// @see #sType()
    public VkConditionalRenderingBeginInfo2EXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkConditionalRenderingBeginInfo2EXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #addressRange()
    public VkConditionalRenderingBeginInfo2EXT addressRange(Consumer<VkDeviceAddressRangeKHR> consumer) {
    	consumer.accept(addressRange);
    	return this;
    }
    
    /// @see #addressRange()
    public VkConditionalRenderingBeginInfo2EXT addressRange(VkDeviceAddressRangeKHR other) {
    	addressRange.set(other);
    	return this;
    }
    
    public VkDeviceAddressRangeKHR addressRange() {
    	return addressRange;
    }
    
    /// @see #addressFlags()
    public VkConditionalRenderingBeginInfo2EXT addressFlags(int addressFlags) {
    	ADDRESS_FLAGS_HANDLE.set(segment, 0L, addressFlags);
    	return this;
    }
    
    public int addressFlags() {
    	return (int) ADDRESS_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VkConditionalRenderingBeginInfo2EXT flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkConditionalRenderingBeginInfo2EXT set(VkConditionalRenderingBeginInfo2EXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkConditionalRenderingBeginInfo2EXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkConditionalRenderingBeginInfo2EXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkConditionalRenderingBeginInfo2EXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkConditionalRenderingBeginInfo2EXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkConditionalRenderingBeginInfo2EXT> array(Arena arena, VkConditionalRenderingBeginInfo2EXT... structs) {
        NativeStructArray<VkConditionalRenderingBeginInfo2EXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkConditionalRenderingBeginInfo2EXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkConditionalRenderingBeginInfo2EXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkConditionalRenderingBeginInfo2EXT(segment)
        );
    }

}