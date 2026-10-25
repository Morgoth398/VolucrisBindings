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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkPipelineCacheHeaderVersionOne
		implements Struct<VkPipelineCacheHeaderVersionOne> {

	public static final StructLayout LAYOUT;

	public static final VarHandle HEADER_SIZE_HANDLE;
	public static final VarHandle HEADER_VERSION_HANDLE;
	public static final VarHandle VENDOR_ID_HANDLE;
	public static final VarHandle DEVICE_ID_HANDLE;
	public static final VarHandle PIPELINE_CACHE_UUID_HANDLE;

	public static final long HEADER_SIZE_BYTE_OFFSET;
	public static final long HEADER_VERSION_BYTE_OFFSET;
	public static final long VENDOR_ID_BYTE_OFFSET;
	public static final long DEVICE_ID_BYTE_OFFSET;
	public static final long PIPELINE_CACHE_UUID_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("headerSize"),
		    JAVA_INT.withName("headerVersion"),
		    JAVA_INT.withName("vendorID"),
		    JAVA_INT.withName("deviceID"),
		    MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("pipelineCacheUUID")
		).withName("VkPipelineCacheHeaderVersionOne").withByteAlignment(4);
		
		HEADER_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("headerSize"));
		HEADER_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("headerVersion"));
		VENDOR_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vendorID"));
		DEVICE_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceID"));
		PIPELINE_CACHE_UUID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineCacheUUID"), PathElement.sequenceElement());
		
		HEADER_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("headerSize"));
		HEADER_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("headerVersion"));
		VENDOR_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vendorID"));
		DEVICE_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceID"));
		PIPELINE_CACHE_UUID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineCacheUUID"));
		//@formatter:on
	}

	public VkPipelineCacheHeaderVersionOne() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineCacheHeaderVersionOne(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPipelineCacheHeaderVersionOne(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #headerSize()
    public VkPipelineCacheHeaderVersionOne headerSize(int headerSize) {
    	HEADER_SIZE_HANDLE.set(segment, 0L, headerSize);
    	return this;
    }
    
    public int headerSize() {
    	return (int) HEADER_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #headerVersion()
    public VkPipelineCacheHeaderVersionOne headerVersion(int headerVersion) {
    	HEADER_VERSION_HANDLE.set(segment, 0L, headerVersion);
    	return this;
    }
    
    public int headerVersion() {
    	return (int) HEADER_VERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #vendorID()
    public VkPipelineCacheHeaderVersionOne vendorID(int vendorID) {
    	VENDOR_ID_HANDLE.set(segment, 0L, vendorID);
    	return this;
    }
    
    public int vendorID() {
    	return (int) VENDOR_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceID()
    public VkPipelineCacheHeaderVersionOne deviceID(int deviceID) {
    	DEVICE_ID_HANDLE.set(segment, 0L, deviceID);
    	return this;
    }
    
    public int deviceID() {
    	return (int) DEVICE_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #pipelineCacheUUID(int)
    public VkPipelineCacheHeaderVersionOne pipelineCacheUUID(byte pipelineCacheUUID, int index0) {
    	PIPELINE_CACHE_UUID_HANDLE.set(segment, 0L, index0, pipelineCacheUUID);
    	return this;
    }
    
    public byte pipelineCacheUUID(int index0) {
    	return (byte) PIPELINE_CACHE_UUID_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public VkPipelineCacheHeaderVersionOne set(VkPipelineCacheHeaderVersionOne other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineCacheHeaderVersionOne set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineCacheHeaderVersionOne> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineCacheHeaderVersionOne> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineCacheHeaderVersionOne(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineCacheHeaderVersionOne> array(SegmentAllocator allocator, VkPipelineCacheHeaderVersionOne... structs) {
        NativeStructArray<VkPipelineCacheHeaderVersionOne> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineCacheHeaderVersionOne(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineCacheHeaderVersionOne> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineCacheHeaderVersionOne(segment)
        );
    }

}