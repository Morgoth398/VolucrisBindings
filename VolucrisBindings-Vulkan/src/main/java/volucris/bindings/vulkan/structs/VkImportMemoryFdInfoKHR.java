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

public final class VkImportMemoryFdInfoKHR
		implements Struct<VkImportMemoryFdInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle HANDLE_TYPE_HANDLE;
	public static final VarHandle FD_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long HANDLE_TYPE_BYTE_OFFSET;
	public static final long FD_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("handleType"),
		    JAVA_INT.withName("fd")
		).withName("VkImportMemoryFdInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		HANDLE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("handleType"));
		FD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fd"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		HANDLE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
		FD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fd"));
		//@formatter:on
	}

	public VkImportMemoryFdInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkImportMemoryFdInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkImportMemoryFdInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkImportMemoryFdInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImportMemoryFdInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #handleType()
    public VkImportMemoryFdInfoKHR handleType(int handleType) {
    	HANDLE_TYPE_HANDLE.set(segment, 0L, handleType);
    	return this;
    }
    
    public int handleType() {
    	return (int) HANDLE_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #fd()
    public VkImportMemoryFdInfoKHR fd(int fd) {
    	FD_HANDLE.set(segment, 0L, fd);
    	return this;
    }
    
    public int fd() {
    	return (int) FD_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkImportMemoryFdInfoKHR set(VkImportMemoryFdInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkImportMemoryFdInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImportMemoryFdInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImportMemoryFdInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImportMemoryFdInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImportMemoryFdInfoKHR> array(Arena arena, VkImportMemoryFdInfoKHR... structs) {
        NativeStructArray<VkImportMemoryFdInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImportMemoryFdInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImportMemoryFdInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImportMemoryFdInfoKHR(segment)
        );
    }

}