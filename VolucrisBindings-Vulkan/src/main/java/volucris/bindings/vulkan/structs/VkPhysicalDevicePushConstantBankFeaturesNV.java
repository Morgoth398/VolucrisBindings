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

public final class VkPhysicalDevicePushConstantBankFeaturesNV
		implements Struct<VkPhysicalDevicePushConstantBankFeaturesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PUSH_CONSTANT_BANK_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PUSH_CONSTANT_BANK_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("pushConstantBank"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDevicePushConstantBankFeaturesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PUSH_CONSTANT_BANK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushConstantBank"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PUSH_CONSTANT_BANK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushConstantBank"));
		//@formatter:on
	}

	public VkPhysicalDevicePushConstantBankFeaturesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDevicePushConstantBankFeaturesNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDevicePushConstantBankFeaturesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDevicePushConstantBankFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDevicePushConstantBankFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pushConstantBank()
    public VkPhysicalDevicePushConstantBankFeaturesNV pushConstantBank(int pushConstantBank) {
    	PUSH_CONSTANT_BANK_HANDLE.set(segment, 0L, pushConstantBank);
    	return this;
    }
    
    public int pushConstantBank() {
    	return (int) PUSH_CONSTANT_BANK_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDevicePushConstantBankFeaturesNV set(VkPhysicalDevicePushConstantBankFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDevicePushConstantBankFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDevicePushConstantBankFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDevicePushConstantBankFeaturesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevicePushConstantBankFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDevicePushConstantBankFeaturesNV> array(Arena arena, VkPhysicalDevicePushConstantBankFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDevicePushConstantBankFeaturesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevicePushConstantBankFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDevicePushConstantBankFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDevicePushConstantBankFeaturesNV(segment)
        );
    }

}