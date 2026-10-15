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

public final class VkMemoryPriorityAllocateInfoEXT
		implements Struct<VkMemoryPriorityAllocateInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PRIORITY_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PRIORITY_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_FLOAT.withName("priority"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkMemoryPriorityAllocateInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PRIORITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("priority"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PRIORITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("priority"));
		//@formatter:on
	}

	public VkMemoryPriorityAllocateInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkMemoryPriorityAllocateInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkMemoryPriorityAllocateInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkMemoryPriorityAllocateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkMemoryPriorityAllocateInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #priority()
    public VkMemoryPriorityAllocateInfoEXT priority(float priority) {
    	PRIORITY_HANDLE.set(segment, 0L, priority);
    	return this;
    }
    
    public float priority() {
    	return (float) PRIORITY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkMemoryPriorityAllocateInfoEXT set(VkMemoryPriorityAllocateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkMemoryPriorityAllocateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMemoryPriorityAllocateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMemoryPriorityAllocateInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryPriorityAllocateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMemoryPriorityAllocateInfoEXT> array(Arena arena, VkMemoryPriorityAllocateInfoEXT... structs) {
        NativeStructArray<VkMemoryPriorityAllocateInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryPriorityAllocateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMemoryPriorityAllocateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMemoryPriorityAllocateInfoEXT(segment)
        );
    }

}