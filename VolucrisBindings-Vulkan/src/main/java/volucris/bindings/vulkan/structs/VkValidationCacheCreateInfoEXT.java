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

public final class VkValidationCacheCreateInfoEXT
		implements Struct<VkValidationCacheCreateInfoEXT> {

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
		).withName("VkValidationCacheCreateInfoEXT").withByteAlignment(8);
		
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

	public VkValidationCacheCreateInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkValidationCacheCreateInfoEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkValidationCacheCreateInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkValidationCacheCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkValidationCacheCreateInfoEXT pNext(MemorySegment pNext) {
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
    public VkValidationCacheCreateInfoEXT flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #initialDataSize()
    public VkValidationCacheCreateInfoEXT initialDataSize(long initialDataSize) {
    	INITIAL_DATA_SIZE_HANDLE.set(segment, 0L, initialDataSize);
    	return this;
    }
    
    public long initialDataSize() {
    	return (long) INITIAL_DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pInitialData()
    public VkValidationCacheCreateInfoEXT pInitialData(MemorySegment pInitialData) {
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
    public VkValidationCacheCreateInfoEXT set(VkValidationCacheCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkValidationCacheCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkValidationCacheCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkValidationCacheCreateInfoEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkValidationCacheCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkValidationCacheCreateInfoEXT> array(SegmentAllocator allocator, VkValidationCacheCreateInfoEXT... structs) {
        NativeStructArray<VkValidationCacheCreateInfoEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkValidationCacheCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkValidationCacheCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkValidationCacheCreateInfoEXT(segment)
        );
    }

}