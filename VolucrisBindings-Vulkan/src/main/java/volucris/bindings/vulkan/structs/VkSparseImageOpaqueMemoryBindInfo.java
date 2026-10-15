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

public final class VkSparseImageOpaqueMemoryBindInfo
		implements Struct<VkSparseImageOpaqueMemoryBindInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle IMAGE_HANDLE;
	public static final VarHandle BIND_COUNT_HANDLE;
	public static final VarHandle P_BINDS_HANDLE;

	public static final long IMAGE_BYTE_OFFSET;
	public static final long BIND_COUNT_BYTE_OFFSET;
	public static final long P_BINDS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("image"),
		    JAVA_INT.withName("bindCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pBinds")
		).withName("VkSparseImageOpaqueMemoryBindInfo").withByteAlignment(8);
		
		IMAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("image"));
		BIND_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bindCount"));
		P_BINDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBinds"));
		
		IMAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("image"));
		BIND_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bindCount"));
		P_BINDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBinds"));
		//@formatter:on
	}

	public VkSparseImageOpaqueMemoryBindInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkSparseImageOpaqueMemoryBindInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkSparseImageOpaqueMemoryBindInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #image()
    public VkSparseImageOpaqueMemoryBindInfo image(VkImage image) {
    	IMAGE_HANDLE.set(segment, 0L, image.memorySegment());
    	return this;
    }
    
    public @Nullable VkImage image() {
    	MemorySegment segment = (MemorySegment) IMAGE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImage(segment);
    }
    
    /// @see #bindCount()
    public VkSparseImageOpaqueMemoryBindInfo bindCount(int bindCount) {
    	BIND_COUNT_HANDLE.set(segment, 0L, bindCount);
    	return this;
    }
    
    public int bindCount() {
    	return (int) BIND_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pBinds()
    public VkSparseImageOpaqueMemoryBindInfo pBinds(NativeStructArray<VkSparseMemoryBind> pBinds) {
    	P_BINDS_HANDLE.set(segment, 0L, pBinds.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkSparseMemoryBind> pBinds() {
    	MemorySegment segment = (MemorySegment) P_BINDS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkSparseMemoryBind.array(segment);
    }
    
    @Override
    public VkSparseImageOpaqueMemoryBindInfo set(VkSparseImageOpaqueMemoryBindInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkSparseImageOpaqueMemoryBindInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSparseImageOpaqueMemoryBindInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSparseImageOpaqueMemoryBindInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSparseImageOpaqueMemoryBindInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSparseImageOpaqueMemoryBindInfo> array(Arena arena, VkSparseImageOpaqueMemoryBindInfo... structs) {
        NativeStructArray<VkSparseImageOpaqueMemoryBindInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSparseImageOpaqueMemoryBindInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSparseImageOpaqueMemoryBindInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSparseImageOpaqueMemoryBindInfo(segment)
        );
    }

}