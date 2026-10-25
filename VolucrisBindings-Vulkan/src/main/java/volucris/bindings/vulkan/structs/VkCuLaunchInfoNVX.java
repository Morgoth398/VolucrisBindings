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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkCuLaunchInfoNVX
		implements Struct<VkCuLaunchInfoNVX> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FUNCTION_HANDLE;
	public static final VarHandle GRID_DIM_X_HANDLE;
	public static final VarHandle GRID_DIM_Y_HANDLE;
	public static final VarHandle GRID_DIM_Z_HANDLE;
	public static final VarHandle BLOCK_DIM_X_HANDLE;
	public static final VarHandle BLOCK_DIM_Y_HANDLE;
	public static final VarHandle BLOCK_DIM_Z_HANDLE;
	public static final VarHandle SHARED_MEM_BYTES_HANDLE;
	public static final VarHandle PARAM_COUNT_HANDLE;
	public static final VarHandle P_PARAMS_HANDLE;
	public static final VarHandle EXTRA_COUNT_HANDLE;
	public static final VarHandle P_EXTRAS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FUNCTION_BYTE_OFFSET;
	public static final long GRID_DIM_X_BYTE_OFFSET;
	public static final long GRID_DIM_Y_BYTE_OFFSET;
	public static final long GRID_DIM_Z_BYTE_OFFSET;
	public static final long BLOCK_DIM_X_BYTE_OFFSET;
	public static final long BLOCK_DIM_Y_BYTE_OFFSET;
	public static final long BLOCK_DIM_Z_BYTE_OFFSET;
	public static final long SHARED_MEM_BYTES_BYTE_OFFSET;
	public static final long PARAM_COUNT_BYTE_OFFSET;
	public static final long P_PARAMS_BYTE_OFFSET;
	public static final long EXTRA_COUNT_BYTE_OFFSET;
	public static final long P_EXTRAS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("function"),
		    JAVA_INT.withName("gridDimX"),
		    JAVA_INT.withName("gridDimY"),
		    JAVA_INT.withName("gridDimZ"),
		    JAVA_INT.withName("blockDimX"),
		    JAVA_INT.withName("blockDimY"),
		    JAVA_INT.withName("blockDimZ"),
		    JAVA_INT.withName("sharedMemBytes"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("paramCount"),
		    UNBOUNDED_ADDRESS.withName("pParams"),
		    JAVA_LONG.withName("extraCount"),
		    UNBOUNDED_ADDRESS.withName("pExtras")
		).withName("VkCuLaunchInfoNVX").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FUNCTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("function"));
		GRID_DIM_X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gridDimX"));
		GRID_DIM_Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gridDimY"));
		GRID_DIM_Z_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gridDimZ"));
		BLOCK_DIM_X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blockDimX"));
		BLOCK_DIM_Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blockDimY"));
		BLOCK_DIM_Z_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blockDimZ"));
		SHARED_MEM_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sharedMemBytes"));
		PARAM_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("paramCount"));
		P_PARAMS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pParams"));
		EXTRA_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extraCount"));
		P_EXTRAS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pExtras"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FUNCTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("function"));
		GRID_DIM_X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gridDimX"));
		GRID_DIM_Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gridDimY"));
		GRID_DIM_Z_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gridDimZ"));
		BLOCK_DIM_X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blockDimX"));
		BLOCK_DIM_Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blockDimY"));
		BLOCK_DIM_Z_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blockDimZ"));
		SHARED_MEM_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sharedMemBytes"));
		PARAM_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("paramCount"));
		P_PARAMS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pParams"));
		EXTRA_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extraCount"));
		P_EXTRAS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pExtras"));
		//@formatter:on
	}

	public VkCuLaunchInfoNVX() {
	    this(Arena.ofAuto());
	}
	
	public VkCuLaunchInfoNVX(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkCuLaunchInfoNVX(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkCuLaunchInfoNVX sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCuLaunchInfoNVX pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #function()
    public VkCuLaunchInfoNVX function(VkCuFunctionNVX function) {
    	FUNCTION_HANDLE.set(segment, 0L, function.memorySegment());
    	return this;
    }
    
    public @Nullable VkCuFunctionNVX function() {
    	MemorySegment segment = (MemorySegment) FUNCTION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkCuFunctionNVX(segment);
    }
    
    /// @see #gridDimX()
    public VkCuLaunchInfoNVX gridDimX(int gridDimX) {
    	GRID_DIM_X_HANDLE.set(segment, 0L, gridDimX);
    	return this;
    }
    
    public int gridDimX() {
    	return (int) GRID_DIM_X_HANDLE.get(segment, 0L);
    }
    
    /// @see #gridDimY()
    public VkCuLaunchInfoNVX gridDimY(int gridDimY) {
    	GRID_DIM_Y_HANDLE.set(segment, 0L, gridDimY);
    	return this;
    }
    
    public int gridDimY() {
    	return (int) GRID_DIM_Y_HANDLE.get(segment, 0L);
    }
    
    /// @see #gridDimZ()
    public VkCuLaunchInfoNVX gridDimZ(int gridDimZ) {
    	GRID_DIM_Z_HANDLE.set(segment, 0L, gridDimZ);
    	return this;
    }
    
    public int gridDimZ() {
    	return (int) GRID_DIM_Z_HANDLE.get(segment, 0L);
    }
    
    /// @see #blockDimX()
    public VkCuLaunchInfoNVX blockDimX(int blockDimX) {
    	BLOCK_DIM_X_HANDLE.set(segment, 0L, blockDimX);
    	return this;
    }
    
    public int blockDimX() {
    	return (int) BLOCK_DIM_X_HANDLE.get(segment, 0L);
    }
    
    /// @see #blockDimY()
    public VkCuLaunchInfoNVX blockDimY(int blockDimY) {
    	BLOCK_DIM_Y_HANDLE.set(segment, 0L, blockDimY);
    	return this;
    }
    
    public int blockDimY() {
    	return (int) BLOCK_DIM_Y_HANDLE.get(segment, 0L);
    }
    
    /// @see #blockDimZ()
    public VkCuLaunchInfoNVX blockDimZ(int blockDimZ) {
    	BLOCK_DIM_Z_HANDLE.set(segment, 0L, blockDimZ);
    	return this;
    }
    
    public int blockDimZ() {
    	return (int) BLOCK_DIM_Z_HANDLE.get(segment, 0L);
    }
    
    /// @see #sharedMemBytes()
    public VkCuLaunchInfoNVX sharedMemBytes(int sharedMemBytes) {
    	SHARED_MEM_BYTES_HANDLE.set(segment, 0L, sharedMemBytes);
    	return this;
    }
    
    public int sharedMemBytes() {
    	return (int) SHARED_MEM_BYTES_HANDLE.get(segment, 0L);
    }
    
    /// @see #paramCount()
    public VkCuLaunchInfoNVX paramCount(long paramCount) {
    	PARAM_COUNT_HANDLE.set(segment, 0L, paramCount);
    	return this;
    }
    
    public long paramCount() {
    	return (long) PARAM_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pParams()
    public VkCuLaunchInfoNVX pParams(NativePointerArray pParams) {
    	P_PARAMS_HANDLE.set(segment, 0L, pParams.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pParams() {
    	MemorySegment segment = (MemorySegment) P_PARAMS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #extraCount()
    public VkCuLaunchInfoNVX extraCount(long extraCount) {
    	EXTRA_COUNT_HANDLE.set(segment, 0L, extraCount);
    	return this;
    }
    
    public long extraCount() {
    	return (long) EXTRA_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pExtras()
    public VkCuLaunchInfoNVX pExtras(NativePointerArray pExtras) {
    	P_EXTRAS_HANDLE.set(segment, 0L, pExtras.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pExtras() {
    	MemorySegment segment = (MemorySegment) P_EXTRAS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    @Override
    public VkCuLaunchInfoNVX set(VkCuLaunchInfoNVX other) {
        return set(other.segment);
    }
    
    @Override
    public VkCuLaunchInfoNVX set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCuLaunchInfoNVX> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCuLaunchInfoNVX> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCuLaunchInfoNVX(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCuLaunchInfoNVX> array(SegmentAllocator allocator, VkCuLaunchInfoNVX... structs) {
        NativeStructArray<VkCuLaunchInfoNVX> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCuLaunchInfoNVX(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCuLaunchInfoNVX> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCuLaunchInfoNVX(segment)
        );
    }

}