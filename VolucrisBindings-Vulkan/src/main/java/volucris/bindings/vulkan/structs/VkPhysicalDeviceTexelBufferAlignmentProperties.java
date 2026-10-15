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

public final class VkPhysicalDeviceTexelBufferAlignmentProperties
		implements Struct<VkPhysicalDeviceTexelBufferAlignmentProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle STORAGE_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_HANDLE;
	public static final VarHandle STORAGE_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_HANDLE;
	public static final VarHandle UNIFORM_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_HANDLE;
	public static final VarHandle UNIFORM_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long STORAGE_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_BYTE_OFFSET;
	public static final long STORAGE_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_BYTE_OFFSET;
	public static final long UNIFORM_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_BYTE_OFFSET;
	public static final long UNIFORM_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("storageTexelBufferOffsetAlignmentBytes"),
		    JAVA_INT.withName("storageTexelBufferOffsetSingleTexelAlignment"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("uniformTexelBufferOffsetAlignmentBytes"),
		    JAVA_INT.withName("uniformTexelBufferOffsetSingleTexelAlignment"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceTexelBufferAlignmentProperties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		STORAGE_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
		STORAGE_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
		UNIFORM_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
		UNIFORM_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		STORAGE_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
		STORAGE_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
		UNIFORM_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
		UNIFORM_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));
		//@formatter:on
	}

	public VkPhysicalDeviceTexelBufferAlignmentProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceTexelBufferAlignmentProperties(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceTexelBufferAlignmentProperties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceTexelBufferAlignmentProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceTexelBufferAlignmentProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #storageTexelBufferOffsetAlignmentBytes()
    public VkPhysicalDeviceTexelBufferAlignmentProperties storageTexelBufferOffsetAlignmentBytes(long storageTexelBufferOffsetAlignmentBytes) {
    	STORAGE_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_HANDLE.set(segment, 0L, storageTexelBufferOffsetAlignmentBytes);
    	return this;
    }
    
    public long storageTexelBufferOffsetAlignmentBytes() {
    	return (long) STORAGE_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_HANDLE.get(segment, 0L);
    }
    
    /// @see #storageTexelBufferOffsetSingleTexelAlignment()
    public VkPhysicalDeviceTexelBufferAlignmentProperties storageTexelBufferOffsetSingleTexelAlignment(int storageTexelBufferOffsetSingleTexelAlignment) {
    	STORAGE_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_HANDLE.set(segment, 0L, storageTexelBufferOffsetSingleTexelAlignment);
    	return this;
    }
    
    public int storageTexelBufferOffsetSingleTexelAlignment() {
    	return (int) STORAGE_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #uniformTexelBufferOffsetAlignmentBytes()
    public VkPhysicalDeviceTexelBufferAlignmentProperties uniformTexelBufferOffsetAlignmentBytes(long uniformTexelBufferOffsetAlignmentBytes) {
    	UNIFORM_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_HANDLE.set(segment, 0L, uniformTexelBufferOffsetAlignmentBytes);
    	return this;
    }
    
    public long uniformTexelBufferOffsetAlignmentBytes() {
    	return (long) UNIFORM_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_HANDLE.get(segment, 0L);
    }
    
    /// @see #uniformTexelBufferOffsetSingleTexelAlignment()
    public VkPhysicalDeviceTexelBufferAlignmentProperties uniformTexelBufferOffsetSingleTexelAlignment(int uniformTexelBufferOffsetSingleTexelAlignment) {
    	UNIFORM_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_HANDLE.set(segment, 0L, uniformTexelBufferOffsetSingleTexelAlignment);
    	return this;
    }
    
    public int uniformTexelBufferOffsetSingleTexelAlignment() {
    	return (int) UNIFORM_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceTexelBufferAlignmentProperties set(VkPhysicalDeviceTexelBufferAlignmentProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceTexelBufferAlignmentProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceTexelBufferAlignmentProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceTexelBufferAlignmentProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceTexelBufferAlignmentProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceTexelBufferAlignmentProperties> array(Arena arena, VkPhysicalDeviceTexelBufferAlignmentProperties... structs) {
        NativeStructArray<VkPhysicalDeviceTexelBufferAlignmentProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceTexelBufferAlignmentProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceTexelBufferAlignmentProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceTexelBufferAlignmentProperties(segment)
        );
    }

}