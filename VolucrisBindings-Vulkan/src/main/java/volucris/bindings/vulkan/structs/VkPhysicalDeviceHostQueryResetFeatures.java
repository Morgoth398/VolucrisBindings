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

public final class VkPhysicalDeviceHostQueryResetFeatures
		implements Struct<VkPhysicalDeviceHostQueryResetFeatures> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle HOST_QUERY_RESET_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long HOST_QUERY_RESET_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("hostQueryReset"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceHostQueryResetFeatures").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		HOST_QUERY_RESET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hostQueryReset"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		HOST_QUERY_RESET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hostQueryReset"));
		//@formatter:on
	}

	public VkPhysicalDeviceHostQueryResetFeatures() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceHostQueryResetFeatures(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceHostQueryResetFeatures(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceHostQueryResetFeatures sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceHostQueryResetFeatures pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #hostQueryReset()
    public VkPhysicalDeviceHostQueryResetFeatures hostQueryReset(int hostQueryReset) {
    	HOST_QUERY_RESET_HANDLE.set(segment, 0L, hostQueryReset);
    	return this;
    }
    
    public int hostQueryReset() {
    	return (int) HOST_QUERY_RESET_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceHostQueryResetFeatures set(VkPhysicalDeviceHostQueryResetFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceHostQueryResetFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceHostQueryResetFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceHostQueryResetFeatures> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceHostQueryResetFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceHostQueryResetFeatures> array(Arena arena, VkPhysicalDeviceHostQueryResetFeatures... structs) {
        NativeStructArray<VkPhysicalDeviceHostQueryResetFeatures> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceHostQueryResetFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceHostQueryResetFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceHostQueryResetFeatures(segment)
        );
    }

}