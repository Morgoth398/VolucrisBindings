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

public final class VkTileMemoryRequirementsQCOM
		implements Struct<VkTileMemoryRequirementsQCOM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SIZE_HANDLE;
	public static final VarHandle ALIGNMENT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SIZE_BYTE_OFFSET;
	public static final long ALIGNMENT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("size"),
		    JAVA_LONG.withName("alignment")
		).withName("VkTileMemoryRequirementsQCOM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("alignment"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("alignment"));
		//@formatter:on
	}

	public VkTileMemoryRequirementsQCOM() {
	    this(Arena.ofAuto());
	}
	
	public VkTileMemoryRequirementsQCOM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkTileMemoryRequirementsQCOM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkTileMemoryRequirementsQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkTileMemoryRequirementsQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #size()
    public VkTileMemoryRequirementsQCOM size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #alignment()
    public VkTileMemoryRequirementsQCOM alignment(long alignment) {
    	ALIGNMENT_HANDLE.set(segment, 0L, alignment);
    	return this;
    }
    
    public long alignment() {
    	return (long) ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkTileMemoryRequirementsQCOM set(VkTileMemoryRequirementsQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkTileMemoryRequirementsQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkTileMemoryRequirementsQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkTileMemoryRequirementsQCOM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkTileMemoryRequirementsQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkTileMemoryRequirementsQCOM> array(Arena arena, VkTileMemoryRequirementsQCOM... structs) {
        NativeStructArray<VkTileMemoryRequirementsQCOM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkTileMemoryRequirementsQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkTileMemoryRequirementsQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkTileMemoryRequirementsQCOM(segment)
        );
    }

}