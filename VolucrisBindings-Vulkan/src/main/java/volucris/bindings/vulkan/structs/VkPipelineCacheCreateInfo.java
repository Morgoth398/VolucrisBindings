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

public final class VkPipelineCacheCreateInfo
		implements Struct<VkPipelineCacheCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle INITIAL_DATA_SIZE_HANDLE;
	public static final VarHandle P_INITIAL_DATA_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long INITIAL_DATA_SIZE_BYTE_OFFSET;
	public static final long P_INITIAL_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("initialDataSize"),
		    UNBOUNDED_ADDRESS.withName("pInitialData")
		).withName("VkPipelineCacheCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		INITIAL_DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("initialDataSize"));
		P_INITIAL_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pInitialData"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		INITIAL_DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("initialDataSize"));
		P_INITIAL_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pInitialData"));
		//@formatter:on
	}

	public VkPipelineCacheCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineCacheCreateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPipelineCacheCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineCacheCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineCacheCreateInfo pNext(MemorySegment pNext) {
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
    public VkPipelineCacheCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #initialDataSize()
    public VkPipelineCacheCreateInfo initialDataSize(long initialDataSize) {
    	INITIAL_DATA_SIZE_HANDLE.set(segment, 0L, initialDataSize);
    	return this;
    }
    
    public long initialDataSize() {
    	return (long) INITIAL_DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pInitialData()
    public VkPipelineCacheCreateInfo pInitialData(MemorySegment pInitialData) {
    	P_INITIAL_DATA_HANDLE.set(segment, 0L, pInitialData);
    	return this;
    }
    
    public @Nullable MemorySegment pInitialData() {
    	MemorySegment segment = (MemorySegment) P_INITIAL_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VkPipelineCacheCreateInfo set(VkPipelineCacheCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineCacheCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineCacheCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineCacheCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineCacheCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineCacheCreateInfo> array(Arena arena, VkPipelineCacheCreateInfo... structs) {
        NativeStructArray<VkPipelineCacheCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineCacheCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineCacheCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineCacheCreateInfo(segment)
        );
    }

}