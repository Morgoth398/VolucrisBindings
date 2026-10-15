/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkDescriptorMappingSourceIndirectAddressEXT
		implements Struct<VkDescriptorMappingSourceIndirectAddressEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle PUSH_OFFSET_HANDLE;
	public static final VarHandle ADDRESS_OFFSET_HANDLE;

	public static final long PUSH_OFFSET_BYTE_OFFSET;
	public static final long ADDRESS_OFFSET_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("pushOffset"),
		    JAVA_INT.withName("addressOffset")
		).withName("VkDescriptorMappingSourceIndirectAddressEXT").withByteAlignment(4);
		
		PUSH_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushOffset"));
		ADDRESS_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("addressOffset"));
		
		PUSH_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushOffset"));
		ADDRESS_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressOffset"));
		//@formatter:on
	}

	public VkDescriptorMappingSourceIndirectAddressEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDescriptorMappingSourceIndirectAddressEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDescriptorMappingSourceIndirectAddressEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #pushOffset()
    public VkDescriptorMappingSourceIndirectAddressEXT pushOffset(int pushOffset) {
    	PUSH_OFFSET_HANDLE.set(segment, 0L, pushOffset);
    	return this;
    }
    
    public int pushOffset() {
    	return (int) PUSH_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #addressOffset()
    public VkDescriptorMappingSourceIndirectAddressEXT addressOffset(int addressOffset) {
    	ADDRESS_OFFSET_HANDLE.set(segment, 0L, addressOffset);
    	return this;
    }
    
    public int addressOffset() {
    	return (int) ADDRESS_OFFSET_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDescriptorMappingSourceIndirectAddressEXT set(VkDescriptorMappingSourceIndirectAddressEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorMappingSourceIndirectAddressEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorMappingSourceIndirectAddressEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorMappingSourceIndirectAddressEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorMappingSourceIndirectAddressEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorMappingSourceIndirectAddressEXT> array(Arena arena, VkDescriptorMappingSourceIndirectAddressEXT... structs) {
        NativeStructArray<VkDescriptorMappingSourceIndirectAddressEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorMappingSourceIndirectAddressEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorMappingSourceIndirectAddressEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorMappingSourceIndirectAddressEXT(segment)
        );
    }

}