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

public final class VkAccelerationStructureCreateInfo2KHR
		implements Struct<VkAccelerationStructureCreateInfo2KHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle CREATE_FLAGS_HANDLE;
    public static final VarHandle ADDRESS_FLAGS_HANDLE;
    public static final VarHandle TYPE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long CREATE_FLAGS_BYTE_OFFSET;
    public static final long ADDRESS_RANGE_BYTE_OFFSET;
    public static final long ADDRESS_FLAGS_BYTE_OFFSET;
    public static final long TYPE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkDeviceAddressRangeKHR addressRange;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("createFlags"),
            MemoryLayout.paddingLayout(4),
            VkDeviceAddressRangeKHR.LAYOUT.withName("addressRange"),
            JAVA_INT.withName("addressFlags"),
            JAVA_INT.withName("type")
        ).withName("VkAccelerationStructureCreateInfo2KHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        CREATE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("createFlags"));
        ADDRESS_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("addressFlags"));
        TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        CREATE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("createFlags"));
        ADDRESS_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressRange"));
        ADDRESS_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressFlags"));
        TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
        //@formatter:on
    }

    public VkAccelerationStructureCreateInfo2KHR() {
        this(Arena.ofAuto());
    }
    
    public VkAccelerationStructureCreateInfo2KHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkAccelerationStructureCreateInfo2KHR(MemorySegment segment) {
        this.segment = segment;
    
        addressRange = new VkDeviceAddressRangeKHR(segment.asSlice(ADDRESS_RANGE_BYTE_OFFSET, VkDeviceAddressRangeKHR.LAYOUT));
    }

    /// @see #sType()
    public VkAccelerationStructureCreateInfo2KHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAccelerationStructureCreateInfo2KHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #createFlags()
    public VkAccelerationStructureCreateInfo2KHR createFlags(int createFlags) {
    	CREATE_FLAGS_HANDLE.set(segment, 0L, createFlags);
    	return this;
    }
    
    public int createFlags() {
    	return (int) CREATE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #addressFlags()
    public VkAccelerationStructureCreateInfo2KHR addressFlags(int addressFlags) {
    	ADDRESS_FLAGS_HANDLE.set(segment, 0L, addressFlags);
    	return this;
    }
    
    public int addressFlags() {
    	return (int) ADDRESS_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #type()
    public VkAccelerationStructureCreateInfo2KHR type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #addressRange()
    public VkAccelerationStructureCreateInfo2KHR addressRange(Consumer<VkDeviceAddressRangeKHR> consumer) {
    	consumer.accept(addressRange);
    	return this;
    }
    
    /// @see #addressRange()
    public VkAccelerationStructureCreateInfo2KHR addressRange(VkDeviceAddressRangeKHR other) {
    	addressRange.set(other);
    	return this;
    }
    
    public VkDeviceAddressRangeKHR addressRange() {
    	return addressRange;
    }
    
    @Override
    public VkAccelerationStructureCreateInfo2KHR set(VkAccelerationStructureCreateInfo2KHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureCreateInfo2KHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureCreateInfo2KHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureCreateInfo2KHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureCreateInfo2KHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureCreateInfo2KHR> array(Arena arena, VkAccelerationStructureCreateInfo2KHR... structs) {
        NativeStructArray<VkAccelerationStructureCreateInfo2KHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureCreateInfo2KHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureCreateInfo2KHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureCreateInfo2KHR(segment)
        );
    }
    
}