/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkCommandBufferInheritanceRenderPassTransformInfoQCOM
		implements Struct<VkCommandBufferInheritanceRenderPassTransformInfoQCOM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle TRANSFORM_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TRANSFORM_BYTE_OFFSET;
	public static final long RENDER_AREA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkRect2D renderArea;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("transform"),
		    VkRect2D.LAYOUT.withName("renderArea"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkCommandBufferInheritanceRenderPassTransformInfoQCOM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		TRANSFORM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("transform"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TRANSFORM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transform"));
		RENDER_AREA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("renderArea"));
		//@formatter:on
	}

	public VkCommandBufferInheritanceRenderPassTransformInfoQCOM() {
	    this(Arena.ofAuto());
	}
	
	public VkCommandBufferInheritanceRenderPassTransformInfoQCOM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkCommandBufferInheritanceRenderPassTransformInfoQCOM(MemorySegment segment) {
	    this.segment = segment;
	
	    renderArea = new VkRect2D(segment.asSlice(RENDER_AREA_BYTE_OFFSET, VkRect2D.LAYOUT));
	}

    /// @see #sType()
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM pNext(MemorySegment pNext) {
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
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM transform(int transform) {
    	TRANSFORM_HANDLE.set(segment, 0L, transform);
    	return this;
    }
    
    public int transform() {
    	return (int) TRANSFORM_HANDLE.get(segment, 0L);
    }
    
    /// @see #renderArea()
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM renderArea(Consumer<VkRect2D> consumer) {
    	consumer.accept(renderArea);
    	return this;
    }
    
    /// @see #renderArea()
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM renderArea(VkRect2D other) {
    	renderArea.set(other);
    	return this;
    }
    
    public VkRect2D renderArea() {
    	return renderArea;
    }
    
    @Override
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM set(VkCommandBufferInheritanceRenderPassTransformInfoQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCommandBufferInheritanceRenderPassTransformInfoQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCommandBufferInheritanceRenderPassTransformInfoQCOM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCommandBufferInheritanceRenderPassTransformInfoQCOM> array(Arena arena, VkCommandBufferInheritanceRenderPassTransformInfoQCOM... structs) {
        NativeStructArray<VkCommandBufferInheritanceRenderPassTransformInfoQCOM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCommandBufferInheritanceRenderPassTransformInfoQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(segment)
        );
    }

}