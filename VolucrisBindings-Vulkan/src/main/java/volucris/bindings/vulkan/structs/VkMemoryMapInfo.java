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

public final class VkMemoryMapInfo
		implements Struct<VkMemoryMapInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle MEMORY_HANDLE;
	public static final VarHandle OFFSET_HANDLE;
	public static final VarHandle SIZE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long MEMORY_BYTE_OFFSET;
	public static final long OFFSET_BYTE_OFFSET;
	public static final long SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("memory"),
		    JAVA_LONG.withName("offset"),
		    JAVA_LONG.withName("size")
		).withName("VkMemoryMapInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memory"));
		OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memory"));
		OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		//@formatter:on
	}

	public VkMemoryMapInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkMemoryMapInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkMemoryMapInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkMemoryMapInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkMemoryMapInfo pNext(MemorySegment pNext) {
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
    public VkMemoryMapInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #memory()
    public VkMemoryMapInfo memory(VkDeviceMemory memory) {
    	MEMORY_HANDLE.set(segment, 0L, memory.memorySegment());
    	return this;
    }
    
    public @Nullable VkDeviceMemory memory() {
    	MemorySegment segment = (MemorySegment) MEMORY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDeviceMemory(segment);
    }
    
    /// @see #offset()
    public VkMemoryMapInfo offset(long offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public long offset() {
    	return (long) OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkMemoryMapInfo size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkMemoryMapInfo set(VkMemoryMapInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkMemoryMapInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMemoryMapInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMemoryMapInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryMapInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMemoryMapInfo> array(Arena arena, VkMemoryMapInfo... structs) {
        NativeStructArray<VkMemoryMapInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryMapInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMemoryMapInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMemoryMapInfo(segment)
        );
    }

}