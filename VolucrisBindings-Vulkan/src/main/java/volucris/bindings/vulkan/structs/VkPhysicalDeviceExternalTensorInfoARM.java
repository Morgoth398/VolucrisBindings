/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
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

public final class VkPhysicalDeviceExternalTensorInfoARM
		implements Struct<VkPhysicalDeviceExternalTensorInfoARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle P_DESCRIPTION_HANDLE;
	public static final VarHandle HANDLE_TYPE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long P_DESCRIPTION_BYTE_OFFSET;
	public static final long HANDLE_TYPE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("flags"),
		    UNBOUNDED_ADDRESS.withName("pDescription"),
		    JAVA_INT.withName("handleType"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceExternalTensorInfoARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		P_DESCRIPTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDescription"));
		HANDLE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("handleType"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		P_DESCRIPTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDescription"));
		HANDLE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
		//@formatter:on
	}

	public VkPhysicalDeviceExternalTensorInfoARM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceExternalTensorInfoARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceExternalTensorInfoARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceExternalTensorInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceExternalTensorInfoARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkPhysicalDeviceExternalTensorInfoARM flags(long flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public long flags() {
    	return (long) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDescription()
    public VkPhysicalDeviceExternalTensorInfoARM pDescription(VkTensorDescriptionARM pDescription) {
    	P_DESCRIPTION_HANDLE.set(segment, 0L, pDescription.memorySegment());
    	return this;
    }
    
    public @Nullable VkTensorDescriptionARM pDescription() {
    	MemorySegment segment = (MemorySegment) P_DESCRIPTION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkTensorDescriptionARM(segment);
    }
    
    /// @see #handleType()
    public VkPhysicalDeviceExternalTensorInfoARM handleType(int handleType) {
    	HANDLE_TYPE_HANDLE.set(segment, 0L, handleType);
    	return this;
    }
    
    public int handleType() {
    	return (int) HANDLE_TYPE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceExternalTensorInfoARM set(VkPhysicalDeviceExternalTensorInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceExternalTensorInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceExternalTensorInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceExternalTensorInfoARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceExternalTensorInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceExternalTensorInfoARM> array(SegmentAllocator allocator, VkPhysicalDeviceExternalTensorInfoARM... structs) {
        NativeStructArray<VkPhysicalDeviceExternalTensorInfoARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceExternalTensorInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceExternalTensorInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceExternalTensorInfoARM(segment)
        );
    }

}