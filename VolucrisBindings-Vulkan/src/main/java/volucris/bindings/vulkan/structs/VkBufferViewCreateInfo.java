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

public final class VkBufferViewCreateInfo
		implements Struct<VkBufferViewCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle BUFFER_HANDLE;
	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle OFFSET_HANDLE;
	public static final VarHandle RANGE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long BUFFER_BYTE_OFFSET;
	public static final long FORMAT_BYTE_OFFSET;
	public static final long OFFSET_BYTE_OFFSET;
	public static final long RANGE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("buffer"),
		    JAVA_INT.withName("format"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("offset"),
		    JAVA_LONG.withName("range")
		).withName("VkBufferViewCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("buffer"));
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
		RANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("range"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
		RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("range"));
		//@formatter:on
	}

	public VkBufferViewCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkBufferViewCreateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkBufferViewCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkBufferViewCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBufferViewCreateInfo pNext(MemorySegment pNext) {
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
    public VkBufferViewCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #buffer()
    public VkBufferViewCreateInfo buffer(VkBuffer buffer) {
    	BUFFER_HANDLE.set(segment, 0L, buffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkBuffer buffer() {
    	MemorySegment segment = (MemorySegment) BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkBuffer(segment);
    }
    
    /// @see #format()
    public VkBufferViewCreateInfo format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #offset()
    public VkBufferViewCreateInfo offset(long offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public long offset() {
    	return (long) OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #range()
    public VkBufferViewCreateInfo range(long range) {
    	RANGE_HANDLE.set(segment, 0L, range);
    	return this;
    }
    
    public long range() {
    	return (long) RANGE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkBufferViewCreateInfo set(VkBufferViewCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkBufferViewCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBufferViewCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBufferViewCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBufferViewCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBufferViewCreateInfo> array(Arena arena, VkBufferViewCreateInfo... structs) {
        NativeStructArray<VkBufferViewCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBufferViewCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBufferViewCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBufferViewCreateInfo(segment)
        );
    }

}