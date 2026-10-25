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

public final class VkPhysicalDeviceSparseImageFormatInfo2
		implements Struct<VkPhysicalDeviceSparseImageFormatInfo2> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle TYPE_HANDLE;
	public static final VarHandle SAMPLES_HANDLE;
	public static final VarHandle USAGE_HANDLE;
	public static final VarHandle TILING_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FORMAT_BYTE_OFFSET;
	public static final long TYPE_BYTE_OFFSET;
	public static final long SAMPLES_BYTE_OFFSET;
	public static final long USAGE_BYTE_OFFSET;
	public static final long TILING_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("type"),
		    JAVA_INT.withName("samples"),
		    JAVA_INT.withName("usage"),
		    JAVA_INT.withName("tiling"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceSparseImageFormatInfo2").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
		SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samples"));
		USAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("usage"));
		TILING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tiling"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
		SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samples"));
		USAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("usage"));
		TILING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tiling"));
		//@formatter:on
	}

	public VkPhysicalDeviceSparseImageFormatInfo2() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceSparseImageFormatInfo2(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceSparseImageFormatInfo2(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceSparseImageFormatInfo2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceSparseImageFormatInfo2 pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #format()
    public VkPhysicalDeviceSparseImageFormatInfo2 format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #type()
    public VkPhysicalDeviceSparseImageFormatInfo2 type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #samples()
    public VkPhysicalDeviceSparseImageFormatInfo2 samples(int samples) {
    	SAMPLES_HANDLE.set(segment, 0L, samples);
    	return this;
    }
    
    public int samples() {
    	return (int) SAMPLES_HANDLE.get(segment, 0L);
    }
    
    /// @see #usage()
    public VkPhysicalDeviceSparseImageFormatInfo2 usage(int usage) {
    	USAGE_HANDLE.set(segment, 0L, usage);
    	return this;
    }
    
    public int usage() {
    	return (int) USAGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #tiling()
    public VkPhysicalDeviceSparseImageFormatInfo2 tiling(int tiling) {
    	TILING_HANDLE.set(segment, 0L, tiling);
    	return this;
    }
    
    public int tiling() {
    	return (int) TILING_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceSparseImageFormatInfo2 set(VkPhysicalDeviceSparseImageFormatInfo2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceSparseImageFormatInfo2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceSparseImageFormatInfo2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceSparseImageFormatInfo2> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceSparseImageFormatInfo2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceSparseImageFormatInfo2> array(SegmentAllocator allocator, VkPhysicalDeviceSparseImageFormatInfo2... structs) {
        NativeStructArray<VkPhysicalDeviceSparseImageFormatInfo2> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceSparseImageFormatInfo2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceSparseImageFormatInfo2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceSparseImageFormatInfo2(segment)
        );
    }

}