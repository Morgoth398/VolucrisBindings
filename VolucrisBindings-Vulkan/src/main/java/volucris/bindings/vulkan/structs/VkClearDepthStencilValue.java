/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkClearDepthStencilValue
		implements Struct<VkClearDepthStencilValue> {

	public static final StructLayout LAYOUT;

	public static final VarHandle DEPTH_HANDLE;
	public static final VarHandle STENCIL_HANDLE;

	public static final long DEPTH_BYTE_OFFSET;
	public static final long STENCIL_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_FLOAT.withName("depth"),
		    JAVA_INT.withName("stencil")
		).withName("VkClearDepthStencilValue").withByteAlignment(4);
		
		DEPTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depth"));
		STENCIL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stencil"));
		
		DEPTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depth"));
		STENCIL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stencil"));
		//@formatter:on
	}

	public VkClearDepthStencilValue() {
	    this(Arena.ofAuto());
	}
	
	public VkClearDepthStencilValue(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkClearDepthStencilValue(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #depth()
    public VkClearDepthStencilValue depth(float depth) {
    	DEPTH_HANDLE.set(segment, 0L, depth);
    	return this;
    }
    
    public float depth() {
    	return (float) DEPTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #stencil()
    public VkClearDepthStencilValue stencil(int stencil) {
    	STENCIL_HANDLE.set(segment, 0L, stencil);
    	return this;
    }
    
    public int stencil() {
    	return (int) STENCIL_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkClearDepthStencilValue set(VkClearDepthStencilValue other) {
        return set(other.segment);
    }
    
    @Override
    public VkClearDepthStencilValue set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkClearDepthStencilValue> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkClearDepthStencilValue> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClearDepthStencilValue(segment),
            count
        );
    }
    
    public static NativeStructArray<VkClearDepthStencilValue> array(Arena arena, VkClearDepthStencilValue... structs) {
        NativeStructArray<VkClearDepthStencilValue> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClearDepthStencilValue(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkClearDepthStencilValue> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkClearDepthStencilValue(segment)
        );
    }

}