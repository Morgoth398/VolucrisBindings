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

public final class VkPhysicalDeviceExtendedDynamicState2FeaturesEXT
		implements Struct<VkPhysicalDeviceExtendedDynamicState2FeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE2_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE2_LOGIC_OP_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE2_PATCH_CONTROL_POINTS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE2_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE2_LOGIC_OP_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE2_PATCH_CONTROL_POINTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("extendedDynamicState2"),
		    JAVA_INT.withName("extendedDynamicState2LogicOp"),
		    JAVA_INT.withName("extendedDynamicState2PatchControlPoints"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceExtendedDynamicState2FeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		EXTENDED_DYNAMIC_STATE2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState2"));
		EXTENDED_DYNAMIC_STATE2_LOGIC_OP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState2LogicOp"));
		EXTENDED_DYNAMIC_STATE2_PATCH_CONTROL_POINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState2PatchControlPoints"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		EXTENDED_DYNAMIC_STATE2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState2"));
		EXTENDED_DYNAMIC_STATE2_LOGIC_OP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState2LogicOp"));
		EXTENDED_DYNAMIC_STATE2_PATCH_CONTROL_POINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState2PatchControlPoints"));
		//@formatter:on
	}

	public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #extendedDynamicState2()
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2(int extendedDynamicState2) {
    	EXTENDED_DYNAMIC_STATE2_HANDLE.set(segment, 0L, extendedDynamicState2);
    	return this;
    }
    
    public int extendedDynamicState2() {
    	return (int) EXTENDED_DYNAMIC_STATE2_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState2LogicOp()
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2LogicOp(int extendedDynamicState2LogicOp) {
    	EXTENDED_DYNAMIC_STATE2_LOGIC_OP_HANDLE.set(segment, 0L, extendedDynamicState2LogicOp);
    	return this;
    }
    
    public int extendedDynamicState2LogicOp() {
    	return (int) EXTENDED_DYNAMIC_STATE2_LOGIC_OP_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState2PatchControlPoints()
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2PatchControlPoints(int extendedDynamicState2PatchControlPoints) {
    	EXTENDED_DYNAMIC_STATE2_PATCH_CONTROL_POINTS_HANDLE.set(segment, 0L, extendedDynamicState2PatchControlPoints);
    	return this;
    }
    
    public int extendedDynamicState2PatchControlPoints() {
    	return (int) EXTENDED_DYNAMIC_STATE2_PATCH_CONTROL_POINTS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT set(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceExtendedDynamicState2FeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceExtendedDynamicState2FeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceExtendedDynamicState2FeaturesEXT> array(Arena arena, VkPhysicalDeviceExtendedDynamicState2FeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceExtendedDynamicState2FeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceExtendedDynamicState2FeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(segment)
        );
    }

}