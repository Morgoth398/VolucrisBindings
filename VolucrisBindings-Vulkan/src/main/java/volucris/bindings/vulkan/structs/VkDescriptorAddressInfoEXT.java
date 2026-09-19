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

public final class VkDescriptorAddressInfoEXT
		implements Struct<VkDescriptorAddressInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle ADDRESS_HANDLE;
    public static final VarHandle RANGE_HANDLE;
    public static final VarHandle FORMAT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long ADDRESS_BYTE_OFFSET;
    public static final long RANGE_BYTE_OFFSET;
    public static final long FORMAT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_LONG.withName("address"),
            JAVA_LONG.withName("range"),
            JAVA_INT.withName("format"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkDescriptorAddressInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("address"));
        RANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("range"));
        FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("address"));
        RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("range"));
        FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
        //@formatter:on
    }

    public VkDescriptorAddressInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkDescriptorAddressInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDescriptorAddressInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDescriptorAddressInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDescriptorAddressInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #address()
    public VkDescriptorAddressInfoEXT address(long address) {
    	ADDRESS_HANDLE.set(segment, 0L, address);
    	return this;
    }
    
    public long address() {
    	return (long) ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #range()
    public VkDescriptorAddressInfoEXT range(long range) {
    	RANGE_HANDLE.set(segment, 0L, range);
    	return this;
    }
    
    public long range() {
    	return (long) RANGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #format()
    public VkDescriptorAddressInfoEXT format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDescriptorAddressInfoEXT set(VkDescriptorAddressInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorAddressInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorAddressInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorAddressInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorAddressInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorAddressInfoEXT> array(Arena arena, VkDescriptorAddressInfoEXT... structs) {
        NativeStructArray<VkDescriptorAddressInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorAddressInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorAddressInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorAddressInfoEXT(segment)
        );
    }
    
}