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

public final class VkCooperativeMatrixProperties2EXT
		implements Struct<VkCooperativeMatrixProperties2EXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MGRANULARITY_HANDLE;
	public static final VarHandle NGRANULARITY_HANDLE;
	public static final VarHandle KGRANULARITY_HANDLE;
	public static final VarHandle ATYPE_HANDLE;
	public static final VarHandle BTYPE_HANDLE;
	public static final VarHandle CTYPE_HANDLE;
	public static final VarHandle RESULT_TYPE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MGRANULARITY_BYTE_OFFSET;
	public static final long NGRANULARITY_BYTE_OFFSET;
	public static final long KGRANULARITY_BYTE_OFFSET;
	public static final long ATYPE_BYTE_OFFSET;
	public static final long BTYPE_BYTE_OFFSET;
	public static final long CTYPE_BYTE_OFFSET;
	public static final long RESULT_TYPE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("MGranularity"),
		    JAVA_INT.withName("NGranularity"),
		    JAVA_INT.withName("KGranularity"),
		    JAVA_INT.withName("AType"),
		    JAVA_INT.withName("BType"),
		    JAVA_INT.withName("CType"),
		    JAVA_INT.withName("ResultType"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkCooperativeMatrixProperties2EXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MGRANULARITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("MGranularity"));
		NGRANULARITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("NGranularity"));
		KGRANULARITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("KGranularity"));
		ATYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("AType"));
		BTYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("BType"));
		CTYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CType"));
		RESULT_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ResultType"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MGRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("MGranularity"));
		NGRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("NGranularity"));
		KGRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("KGranularity"));
		ATYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("AType"));
		BTYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("BType"));
		CTYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CType"));
		RESULT_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ResultType"));
		//@formatter:on
	}

	public VkCooperativeMatrixProperties2EXT() {
	    this(Arena.ofAuto());
	}
	
	public VkCooperativeMatrixProperties2EXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkCooperativeMatrixProperties2EXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkCooperativeMatrixProperties2EXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCooperativeMatrixProperties2EXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #mGranularity()
    public VkCooperativeMatrixProperties2EXT mGranularity(int mGranularity) {
    	MGRANULARITY_HANDLE.set(segment, 0L, mGranularity);
    	return this;
    }
    
    public int mGranularity() {
    	return (int) MGRANULARITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #nGranularity()
    public VkCooperativeMatrixProperties2EXT nGranularity(int nGranularity) {
    	NGRANULARITY_HANDLE.set(segment, 0L, nGranularity);
    	return this;
    }
    
    public int nGranularity() {
    	return (int) NGRANULARITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #kGranularity()
    public VkCooperativeMatrixProperties2EXT kGranularity(int kGranularity) {
    	KGRANULARITY_HANDLE.set(segment, 0L, kGranularity);
    	return this;
    }
    
    public int kGranularity() {
    	return (int) KGRANULARITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #aType()
    public VkCooperativeMatrixProperties2EXT aType(int aType) {
    	ATYPE_HANDLE.set(segment, 0L, aType);
    	return this;
    }
    
    public int aType() {
    	return (int) ATYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #bType()
    public VkCooperativeMatrixProperties2EXT bType(int bType) {
    	BTYPE_HANDLE.set(segment, 0L, bType);
    	return this;
    }
    
    public int bType() {
    	return (int) BTYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #cType()
    public VkCooperativeMatrixProperties2EXT cType(int cType) {
    	CTYPE_HANDLE.set(segment, 0L, cType);
    	return this;
    }
    
    public int cType() {
    	return (int) CTYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #resultType()
    public VkCooperativeMatrixProperties2EXT resultType(int resultType) {
    	RESULT_TYPE_HANDLE.set(segment, 0L, resultType);
    	return this;
    }
    
    public int resultType() {
    	return (int) RESULT_TYPE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkCooperativeMatrixProperties2EXT set(VkCooperativeMatrixProperties2EXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkCooperativeMatrixProperties2EXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCooperativeMatrixProperties2EXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCooperativeMatrixProperties2EXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCooperativeMatrixProperties2EXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCooperativeMatrixProperties2EXT> array(SegmentAllocator allocator, VkCooperativeMatrixProperties2EXT... structs) {
        NativeStructArray<VkCooperativeMatrixProperties2EXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCooperativeMatrixProperties2EXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCooperativeMatrixProperties2EXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCooperativeMatrixProperties2EXT(segment)
        );
    }

}