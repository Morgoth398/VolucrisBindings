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

public final class VkAccelerationStructureCreateInfoKHR
		implements Struct<VkAccelerationStructureCreateInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle CREATE_FLAGS_HANDLE;
	public static final VarHandle BUFFER_HANDLE;
	public static final VarHandle OFFSET_HANDLE;
	public static final VarHandle SIZE_HANDLE;
	public static final VarHandle TYPE_HANDLE;
	public static final VarHandle DEVICE_ADDRESS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long CREATE_FLAGS_BYTE_OFFSET;
	public static final long BUFFER_BYTE_OFFSET;
	public static final long OFFSET_BYTE_OFFSET;
	public static final long SIZE_BYTE_OFFSET;
	public static final long TYPE_BYTE_OFFSET;
	public static final long DEVICE_ADDRESS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("createFlags"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("buffer"),
		    JAVA_LONG.withName("offset"),
		    JAVA_LONG.withName("size"),
		    JAVA_INT.withName("type"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("deviceAddress")
		).withName("VkAccelerationStructureCreateInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		CREATE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("createFlags"));
		BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("buffer"));
		OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
		DEVICE_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceAddress"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		CREATE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("createFlags"));
		BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
		OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
		DEVICE_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceAddress"));
		//@formatter:on
	}

	public VkAccelerationStructureCreateInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkAccelerationStructureCreateInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkAccelerationStructureCreateInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkAccelerationStructureCreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAccelerationStructureCreateInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #createFlags()
    public VkAccelerationStructureCreateInfoKHR createFlags(int createFlags) {
    	CREATE_FLAGS_HANDLE.set(segment, 0L, createFlags);
    	return this;
    }
    
    public int createFlags() {
    	return (int) CREATE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #buffer()
    public VkAccelerationStructureCreateInfoKHR buffer(VkBuffer buffer) {
    	BUFFER_HANDLE.set(segment, 0L, buffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkBuffer buffer() {
    	MemorySegment segment = (MemorySegment) BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkBuffer(segment);
    }
    
    /// @see #offset()
    public VkAccelerationStructureCreateInfoKHR offset(long offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public long offset() {
    	return (long) OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkAccelerationStructureCreateInfoKHR size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #type()
    public VkAccelerationStructureCreateInfoKHR type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceAddress()
    public VkAccelerationStructureCreateInfoKHR deviceAddress(long deviceAddress) {
    	DEVICE_ADDRESS_HANDLE.set(segment, 0L, deviceAddress);
    	return this;
    }
    
    public long deviceAddress() {
    	return (long) DEVICE_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkAccelerationStructureCreateInfoKHR set(VkAccelerationStructureCreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureCreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureCreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureCreateInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAccelerationStructureCreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureCreateInfoKHR> array(SegmentAllocator allocator, VkAccelerationStructureCreateInfoKHR... structs) {
        NativeStructArray<VkAccelerationStructureCreateInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAccelerationStructureCreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureCreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureCreateInfoKHR(segment)
        );
    }

}