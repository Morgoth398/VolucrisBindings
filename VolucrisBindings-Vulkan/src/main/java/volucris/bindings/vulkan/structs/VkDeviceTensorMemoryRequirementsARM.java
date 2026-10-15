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

public final class VkDeviceTensorMemoryRequirementsARM
		implements Struct<VkDeviceTensorMemoryRequirementsARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_CREATE_INFO_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_CREATE_INFO_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pCreateInfo")
		).withName("VkDeviceTensorMemoryRequirementsARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_CREATE_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCreateInfo"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_CREATE_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCreateInfo"));
		//@formatter:on
	}

	public VkDeviceTensorMemoryRequirementsARM() {
	    this(Arena.ofAuto());
	}
	
	public VkDeviceTensorMemoryRequirementsARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDeviceTensorMemoryRequirementsARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDeviceTensorMemoryRequirementsARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceTensorMemoryRequirementsARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pCreateInfo()
    public VkDeviceTensorMemoryRequirementsARM pCreateInfo(VkTensorCreateInfoARM pCreateInfo) {
    	P_CREATE_INFO_HANDLE.set(segment, 0L, pCreateInfo.memorySegment());
    	return this;
    }
    
    public @Nullable VkTensorCreateInfoARM pCreateInfo() {
    	MemorySegment segment = (MemorySegment) P_CREATE_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkTensorCreateInfoARM(segment);
    }
    
    @Override
    public VkDeviceTensorMemoryRequirementsARM set(VkDeviceTensorMemoryRequirementsARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceTensorMemoryRequirementsARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceTensorMemoryRequirementsARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceTensorMemoryRequirementsARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceTensorMemoryRequirementsARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceTensorMemoryRequirementsARM> array(Arena arena, VkDeviceTensorMemoryRequirementsARM... structs) {
        NativeStructArray<VkDeviceTensorMemoryRequirementsARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceTensorMemoryRequirementsARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceTensorMemoryRequirementsARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceTensorMemoryRequirementsARM(segment)
        );
    }

}