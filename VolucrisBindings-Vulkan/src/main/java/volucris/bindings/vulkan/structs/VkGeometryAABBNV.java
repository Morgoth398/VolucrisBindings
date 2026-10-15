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

public final class VkGeometryAABBNV
		implements Struct<VkGeometryAABBNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle AABB_DATA_HANDLE;
	public static final VarHandle NUM_AABBS_HANDLE;
	public static final VarHandle STRIDE_HANDLE;
	public static final VarHandle OFFSET_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long AABB_DATA_BYTE_OFFSET;
	public static final long NUM_AABBS_BYTE_OFFSET;
	public static final long STRIDE_BYTE_OFFSET;
	public static final long OFFSET_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("aabbData"),
		    JAVA_INT.withName("numAABBs"),
		    JAVA_INT.withName("stride"),
		    JAVA_LONG.withName("offset")
		).withName("VkGeometryAABBNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		AABB_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("aabbData"));
		NUM_AABBS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numAABBs"));
		STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stride"));
		OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		AABB_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aabbData"));
		NUM_AABBS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numAABBs"));
		STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stride"));
		OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
		//@formatter:on
	}

	public VkGeometryAABBNV() {
	    this(Arena.ofAuto());
	}
	
	public VkGeometryAABBNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkGeometryAABBNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkGeometryAABBNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkGeometryAABBNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #aabbData()
    public VkGeometryAABBNV aabbData(VkBuffer aabbData) {
    	AABB_DATA_HANDLE.set(segment, 0L, aabbData.memorySegment());
    	return this;
    }
    
    public @Nullable VkBuffer aabbData() {
    	MemorySegment segment = (MemorySegment) AABB_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkBuffer(segment);
    }
    
    /// @see #numAABBs()
    public VkGeometryAABBNV numAABBs(int numAABBs) {
    	NUM_AABBS_HANDLE.set(segment, 0L, numAABBs);
    	return this;
    }
    
    public int numAABBs() {
    	return (int) NUM_AABBS_HANDLE.get(segment, 0L);
    }
    
    /// @see #stride()
    public VkGeometryAABBNV stride(int stride) {
    	STRIDE_HANDLE.set(segment, 0L, stride);
    	return this;
    }
    
    public int stride() {
    	return (int) STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #offset()
    public VkGeometryAABBNV offset(long offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public long offset() {
    	return (long) OFFSET_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkGeometryAABBNV set(VkGeometryAABBNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkGeometryAABBNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkGeometryAABBNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkGeometryAABBNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGeometryAABBNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkGeometryAABBNV> array(Arena arena, VkGeometryAABBNV... structs) {
        NativeStructArray<VkGeometryAABBNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGeometryAABBNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkGeometryAABBNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkGeometryAABBNV(segment)
        );
    }

}