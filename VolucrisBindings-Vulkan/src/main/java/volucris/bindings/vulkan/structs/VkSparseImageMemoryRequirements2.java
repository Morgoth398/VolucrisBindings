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
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkSparseImageMemoryRequirements2
		implements Struct<VkSparseImageMemoryRequirements2> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MEMORY_REQUIREMENTS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkSparseImageMemoryRequirements memoryRequirements;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkSparseImageMemoryRequirements.LAYOUT.withName("memoryRequirements")
		).withName("VkSparseImageMemoryRequirements2").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MEMORY_REQUIREMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryRequirements"));
		//@formatter:on
	}

	public VkSparseImageMemoryRequirements2() {
	    this(Arena.ofAuto());
	}
	
	public VkSparseImageMemoryRequirements2(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkSparseImageMemoryRequirements2(MemorySegment segment) {
	    this.segment = segment;
	
	    memoryRequirements = new VkSparseImageMemoryRequirements(segment.asSlice(MEMORY_REQUIREMENTS_BYTE_OFFSET, VkSparseImageMemoryRequirements.LAYOUT));
	}

    /// @see #sType()
    public VkSparseImageMemoryRequirements2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSparseImageMemoryRequirements2 pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #memoryRequirements()
    public VkSparseImageMemoryRequirements2 memoryRequirements(Consumer<VkSparseImageMemoryRequirements> consumer) {
    	consumer.accept(memoryRequirements);
    	return this;
    }
    
    /// @see #memoryRequirements()
    public VkSparseImageMemoryRequirements2 memoryRequirements(VkSparseImageMemoryRequirements other) {
    	memoryRequirements.set(other);
    	return this;
    }
    
    public VkSparseImageMemoryRequirements memoryRequirements() {
    	return memoryRequirements;
    }
    
    @Override
    public VkSparseImageMemoryRequirements2 set(VkSparseImageMemoryRequirements2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkSparseImageMemoryRequirements2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSparseImageMemoryRequirements2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSparseImageMemoryRequirements2> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSparseImageMemoryRequirements2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSparseImageMemoryRequirements2> array(SegmentAllocator allocator, VkSparseImageMemoryRequirements2... structs) {
        NativeStructArray<VkSparseImageMemoryRequirements2> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSparseImageMemoryRequirements2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSparseImageMemoryRequirements2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSparseImageMemoryRequirements2(segment)
        );
    }

}