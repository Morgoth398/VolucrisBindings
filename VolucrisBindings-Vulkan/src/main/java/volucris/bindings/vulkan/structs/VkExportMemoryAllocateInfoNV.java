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

public final class VkExportMemoryAllocateInfoNV
		implements Struct<VkExportMemoryAllocateInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle HANDLE_TYPES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long HANDLE_TYPES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("handleTypes"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkExportMemoryAllocateInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		HANDLE_TYPES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("handleTypes"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		HANDLE_TYPES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("handleTypes"));
		//@formatter:on
	}

	public VkExportMemoryAllocateInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkExportMemoryAllocateInfoNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkExportMemoryAllocateInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkExportMemoryAllocateInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkExportMemoryAllocateInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #handleTypes()
    public VkExportMemoryAllocateInfoNV handleTypes(int handleTypes) {
    	HANDLE_TYPES_HANDLE.set(segment, 0L, handleTypes);
    	return this;
    }
    
    public int handleTypes() {
    	return (int) HANDLE_TYPES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkExportMemoryAllocateInfoNV set(VkExportMemoryAllocateInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkExportMemoryAllocateInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkExportMemoryAllocateInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkExportMemoryAllocateInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExportMemoryAllocateInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkExportMemoryAllocateInfoNV> array(Arena arena, VkExportMemoryAllocateInfoNV... structs) {
        NativeStructArray<VkExportMemoryAllocateInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExportMemoryAllocateInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkExportMemoryAllocateInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkExportMemoryAllocateInfoNV(segment)
        );
    }

}