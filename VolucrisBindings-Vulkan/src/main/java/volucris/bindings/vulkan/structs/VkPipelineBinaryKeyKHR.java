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

public final class VkPipelineBinaryKeyKHR
		implements Struct<VkPipelineBinaryKeyKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle KEY_SIZE_HANDLE;
	public static final VarHandle KEY_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long KEY_SIZE_BYTE_OFFSET;
	public static final long KEY_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("keySize"),
		    MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("key"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPipelineBinaryKeyKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		KEY_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("keySize"));
		KEY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("key"), PathElement.sequenceElement());
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		KEY_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("keySize"));
		KEY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("key"));
		//@formatter:on
	}

	public VkPipelineBinaryKeyKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineBinaryKeyKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPipelineBinaryKeyKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineBinaryKeyKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineBinaryKeyKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #keySize()
    public VkPipelineBinaryKeyKHR keySize(int keySize) {
    	KEY_SIZE_HANDLE.set(segment, 0L, keySize);
    	return this;
    }
    
    public int keySize() {
    	return (int) KEY_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #key(int)
    public VkPipelineBinaryKeyKHR key(byte key, int index0) {
    	KEY_HANDLE.set(segment, 0L, index0, key);
    	return this;
    }
    
    public byte key(int index0) {
    	return (byte) KEY_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public VkPipelineBinaryKeyKHR set(VkPipelineBinaryKeyKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineBinaryKeyKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineBinaryKeyKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineBinaryKeyKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineBinaryKeyKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineBinaryKeyKHR> array(Arena arena, VkPipelineBinaryKeyKHR... structs) {
        NativeStructArray<VkPipelineBinaryKeyKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineBinaryKeyKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineBinaryKeyKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineBinaryKeyKHR(segment)
        );
    }

}