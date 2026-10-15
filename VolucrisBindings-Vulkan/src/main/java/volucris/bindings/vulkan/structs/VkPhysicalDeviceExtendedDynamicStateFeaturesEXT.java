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

public final class VkPhysicalDeviceExtendedDynamicStateFeaturesEXT
		implements Struct<VkPhysicalDeviceExtendedDynamicStateFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("extendedDynamicState"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceExtendedDynamicStateFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		EXTENDED_DYNAMIC_STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		EXTENDED_DYNAMIC_STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState"));
		//@formatter:on
	}

	public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #extendedDynamicState()
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT extendedDynamicState(int extendedDynamicState) {
    	EXTENDED_DYNAMIC_STATE_HANDLE.set(segment, 0L, extendedDynamicState);
    	return this;
    }
    
    public int extendedDynamicState() {
    	return (int) EXTENDED_DYNAMIC_STATE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT set(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceExtendedDynamicStateFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceExtendedDynamicStateFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceExtendedDynamicStateFeaturesEXT> array(Arena arena, VkPhysicalDeviceExtendedDynamicStateFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceExtendedDynamicStateFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceExtendedDynamicStateFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(segment)
        );
    }

}