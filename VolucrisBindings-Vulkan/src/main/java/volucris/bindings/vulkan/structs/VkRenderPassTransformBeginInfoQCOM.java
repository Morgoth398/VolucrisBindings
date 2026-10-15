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

public final class VkRenderPassTransformBeginInfoQCOM
		implements Struct<VkRenderPassTransformBeginInfoQCOM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle TRANSFORM_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TRANSFORM_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("transform"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkRenderPassTransformBeginInfoQCOM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		TRANSFORM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("transform"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TRANSFORM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transform"));
		//@formatter:on
	}

	public VkRenderPassTransformBeginInfoQCOM() {
	    this(Arena.ofAuto());
	}
	
	public VkRenderPassTransformBeginInfoQCOM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkRenderPassTransformBeginInfoQCOM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkRenderPassTransformBeginInfoQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRenderPassTransformBeginInfoQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #transform()
    public VkRenderPassTransformBeginInfoQCOM transform(int transform) {
    	TRANSFORM_HANDLE.set(segment, 0L, transform);
    	return this;
    }
    
    public int transform() {
    	return (int) TRANSFORM_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkRenderPassTransformBeginInfoQCOM set(VkRenderPassTransformBeginInfoQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderPassTransformBeginInfoQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderPassTransformBeginInfoQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderPassTransformBeginInfoQCOM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderPassTransformBeginInfoQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderPassTransformBeginInfoQCOM> array(Arena arena, VkRenderPassTransformBeginInfoQCOM... structs) {
        NativeStructArray<VkRenderPassTransformBeginInfoQCOM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderPassTransformBeginInfoQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderPassTransformBeginInfoQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderPassTransformBeginInfoQCOM(segment)
        );
    }

}