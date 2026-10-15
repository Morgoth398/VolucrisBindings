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

public final class VkBindBufferMemoryDeviceGroupInfo
		implements Struct<VkBindBufferMemoryDeviceGroupInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DEVICE_INDEX_COUNT_HANDLE;
	public static final VarHandle P_DEVICE_INDICES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DEVICE_INDEX_COUNT_BYTE_OFFSET;
	public static final long P_DEVICE_INDICES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("deviceIndexCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pDeviceIndices")
		).withName("VkBindBufferMemoryDeviceGroupInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DEVICE_INDEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceIndexCount"));
		P_DEVICE_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDeviceIndices"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DEVICE_INDEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceIndexCount"));
		P_DEVICE_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDeviceIndices"));
		//@formatter:on
	}

	public VkBindBufferMemoryDeviceGroupInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkBindBufferMemoryDeviceGroupInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkBindBufferMemoryDeviceGroupInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkBindBufferMemoryDeviceGroupInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBindBufferMemoryDeviceGroupInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #deviceIndexCount()
    public VkBindBufferMemoryDeviceGroupInfo deviceIndexCount(int deviceIndexCount) {
    	DEVICE_INDEX_COUNT_HANDLE.set(segment, 0L, deviceIndexCount);
    	return this;
    }
    
    public int deviceIndexCount() {
    	return (int) DEVICE_INDEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDeviceIndices()
    public VkBindBufferMemoryDeviceGroupInfo pDeviceIndices(NativeIntArray pDeviceIndices) {
    	P_DEVICE_INDICES_HANDLE.set(segment, 0L, pDeviceIndices.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pDeviceIndices() {
    	MemorySegment segment = (MemorySegment) P_DEVICE_INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkBindBufferMemoryDeviceGroupInfo set(VkBindBufferMemoryDeviceGroupInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkBindBufferMemoryDeviceGroupInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBindBufferMemoryDeviceGroupInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBindBufferMemoryDeviceGroupInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindBufferMemoryDeviceGroupInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBindBufferMemoryDeviceGroupInfo> array(Arena arena, VkBindBufferMemoryDeviceGroupInfo... structs) {
        NativeStructArray<VkBindBufferMemoryDeviceGroupInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindBufferMemoryDeviceGroupInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBindBufferMemoryDeviceGroupInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBindBufferMemoryDeviceGroupInfo(segment)
        );
    }

}