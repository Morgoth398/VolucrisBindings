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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkMutableDescriptorTypeListEXT
		implements Struct<VkMutableDescriptorTypeListEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle DESCRIPTOR_TYPE_COUNT_HANDLE;
	public static final VarHandle P_DESCRIPTOR_TYPES_HANDLE;

	public static final long DESCRIPTOR_TYPE_COUNT_BYTE_OFFSET;
	public static final long P_DESCRIPTOR_TYPES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("descriptorTypeCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pDescriptorTypes")
		).withName("VkMutableDescriptorTypeListEXT").withByteAlignment(8);
		
		DESCRIPTOR_TYPE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorTypeCount"));
		P_DESCRIPTOR_TYPES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDescriptorTypes"));
		
		DESCRIPTOR_TYPE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorTypeCount"));
		P_DESCRIPTOR_TYPES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDescriptorTypes"));
		//@formatter:on
	}

	public VkMutableDescriptorTypeListEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkMutableDescriptorTypeListEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkMutableDescriptorTypeListEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #descriptorTypeCount()
    public VkMutableDescriptorTypeListEXT descriptorTypeCount(int descriptorTypeCount) {
    	DESCRIPTOR_TYPE_COUNT_HANDLE.set(segment, 0L, descriptorTypeCount);
    	return this;
    }
    
    public int descriptorTypeCount() {
    	return (int) DESCRIPTOR_TYPE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDescriptorTypes()
    public VkMutableDescriptorTypeListEXT pDescriptorTypes(NativeIntArray pDescriptorTypes) {
    	P_DESCRIPTOR_TYPES_HANDLE.set(segment, 0L, pDescriptorTypes.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pDescriptorTypes() {
    	MemorySegment segment = (MemorySegment) P_DESCRIPTOR_TYPES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkMutableDescriptorTypeListEXT set(VkMutableDescriptorTypeListEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkMutableDescriptorTypeListEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMutableDescriptorTypeListEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMutableDescriptorTypeListEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMutableDescriptorTypeListEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMutableDescriptorTypeListEXT> array(Arena arena, VkMutableDescriptorTypeListEXT... structs) {
        NativeStructArray<VkMutableDescriptorTypeListEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMutableDescriptorTypeListEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMutableDescriptorTypeListEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMutableDescriptorTypeListEXT(segment)
        );
    }

}