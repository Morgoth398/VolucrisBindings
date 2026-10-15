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

public final class VkExternalMemoryAcquireUnmodifiedEXT
		implements Struct<VkExternalMemoryAcquireUnmodifiedEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ACQUIRE_UNMODIFIED_MEMORY_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ACQUIRE_UNMODIFIED_MEMORY_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("acquireUnmodifiedMemory"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkExternalMemoryAcquireUnmodifiedEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ACQUIRE_UNMODIFIED_MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("acquireUnmodifiedMemory"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ACQUIRE_UNMODIFIED_MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("acquireUnmodifiedMemory"));
		//@formatter:on
	}

	public VkExternalMemoryAcquireUnmodifiedEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkExternalMemoryAcquireUnmodifiedEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkExternalMemoryAcquireUnmodifiedEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkExternalMemoryAcquireUnmodifiedEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkExternalMemoryAcquireUnmodifiedEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #acquireUnmodifiedMemory()
    public VkExternalMemoryAcquireUnmodifiedEXT acquireUnmodifiedMemory(int acquireUnmodifiedMemory) {
    	ACQUIRE_UNMODIFIED_MEMORY_HANDLE.set(segment, 0L, acquireUnmodifiedMemory);
    	return this;
    }
    
    public int acquireUnmodifiedMemory() {
    	return (int) ACQUIRE_UNMODIFIED_MEMORY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkExternalMemoryAcquireUnmodifiedEXT set(VkExternalMemoryAcquireUnmodifiedEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkExternalMemoryAcquireUnmodifiedEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkExternalMemoryAcquireUnmodifiedEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkExternalMemoryAcquireUnmodifiedEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExternalMemoryAcquireUnmodifiedEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkExternalMemoryAcquireUnmodifiedEXT> array(Arena arena, VkExternalMemoryAcquireUnmodifiedEXT... structs) {
        NativeStructArray<VkExternalMemoryAcquireUnmodifiedEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExternalMemoryAcquireUnmodifiedEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkExternalMemoryAcquireUnmodifiedEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkExternalMemoryAcquireUnmodifiedEXT(segment)
        );
    }

}