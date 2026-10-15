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

public final class VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT
		implements Struct<VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle VERTEX_INPUT_DYNAMIC_STATE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long VERTEX_INPUT_DYNAMIC_STATE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("vertexInputDynamicState"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		VERTEX_INPUT_DYNAMIC_STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexInputDynamicState"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		VERTEX_INPUT_DYNAMIC_STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexInputDynamicState"));
		//@formatter:on
	}

	public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #vertexInputDynamicState()
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT vertexInputDynamicState(int vertexInputDynamicState) {
    	VERTEX_INPUT_DYNAMIC_STATE_HANDLE.set(segment, 0L, vertexInputDynamicState);
    	return this;
    }
    
    public int vertexInputDynamicState() {
    	return (int) VERTEX_INPUT_DYNAMIC_STATE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT set(VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT> array(Arena arena, VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT(segment)
        );
    }

}