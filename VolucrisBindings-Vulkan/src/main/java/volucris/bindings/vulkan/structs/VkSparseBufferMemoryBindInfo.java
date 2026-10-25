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

public final class VkSparseBufferMemoryBindInfo
		implements Struct<VkSparseBufferMemoryBindInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BUFFER_HANDLE;
	public static final VarHandle BIND_COUNT_HANDLE;
	public static final VarHandle P_BINDS_HANDLE;

	public static final long BUFFER_BYTE_OFFSET;
	public static final long BIND_COUNT_BYTE_OFFSET;
	public static final long P_BINDS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("buffer"),
		    JAVA_INT.withName("bindCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pBinds")
		).withName("VkSparseBufferMemoryBindInfo").withByteAlignment(8);
		
		BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("buffer"));
		BIND_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bindCount"));
		P_BINDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBinds"));
		
		BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
		BIND_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bindCount"));
		P_BINDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBinds"));
		//@formatter:on
	}

	public VkSparseBufferMemoryBindInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkSparseBufferMemoryBindInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkSparseBufferMemoryBindInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #buffer()
    public VkSparseBufferMemoryBindInfo buffer(VkBuffer buffer) {
    	BUFFER_HANDLE.set(segment, 0L, buffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkBuffer buffer() {
    	MemorySegment segment = (MemorySegment) BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkBuffer(segment);
    }
    
    /// @see #bindCount()
    public VkSparseBufferMemoryBindInfo bindCount(int bindCount) {
    	BIND_COUNT_HANDLE.set(segment, 0L, bindCount);
    	return this;
    }
    
    public int bindCount() {
    	return (int) BIND_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pBinds()
    public VkSparseBufferMemoryBindInfo pBinds(NativeStructArray<VkSparseMemoryBind> pBinds) {
    	P_BINDS_HANDLE.set(segment, 0L, pBinds.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkSparseMemoryBind> pBinds() {
    	MemorySegment segment = (MemorySegment) P_BINDS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkSparseMemoryBind.array(segment);
    }
    
    @Override
    public VkSparseBufferMemoryBindInfo set(VkSparseBufferMemoryBindInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkSparseBufferMemoryBindInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSparseBufferMemoryBindInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSparseBufferMemoryBindInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSparseBufferMemoryBindInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSparseBufferMemoryBindInfo> array(SegmentAllocator allocator, VkSparseBufferMemoryBindInfo... structs) {
        NativeStructArray<VkSparseBufferMemoryBindInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSparseBufferMemoryBindInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSparseBufferMemoryBindInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSparseBufferMemoryBindInfo(segment)
        );
    }

}