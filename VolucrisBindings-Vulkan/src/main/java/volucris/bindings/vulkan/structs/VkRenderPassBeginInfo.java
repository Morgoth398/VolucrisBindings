/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
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

public final class VkRenderPassBeginInfo
		implements Struct<VkRenderPassBeginInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle RENDER_PASS_HANDLE;
	public static final VarHandle FRAMEBUFFER_HANDLE;
	public static final VarHandle CLEAR_VALUE_COUNT_HANDLE;
	public static final VarHandle P_CLEAR_VALUES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long RENDER_PASS_BYTE_OFFSET;
	public static final long FRAMEBUFFER_BYTE_OFFSET;
	public static final long RENDER_AREA_BYTE_OFFSET;
	public static final long CLEAR_VALUE_COUNT_BYTE_OFFSET;
	public static final long P_CLEAR_VALUES_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkRect2D renderArea;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("renderPass"),
		    UNBOUNDED_ADDRESS.withName("framebuffer"),
		    VkRect2D.LAYOUT.withName("renderArea"),
		    JAVA_INT.withName("clearValueCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pClearValues")
		).withName("VkRenderPassBeginInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		RENDER_PASS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("renderPass"));
		FRAMEBUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("framebuffer"));
		CLEAR_VALUE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clearValueCount"));
		P_CLEAR_VALUES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pClearValues"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		RENDER_PASS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("renderPass"));
		FRAMEBUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("framebuffer"));
		RENDER_AREA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("renderArea"));
		CLEAR_VALUE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clearValueCount"));
		P_CLEAR_VALUES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pClearValues"));
		//@formatter:on
	}

	public VkRenderPassBeginInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkRenderPassBeginInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkRenderPassBeginInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    renderArea = new VkRect2D(segment.asSlice(RENDER_AREA_BYTE_OFFSET, VkRect2D.LAYOUT));
	}

    /// @see #sType()
    public VkRenderPassBeginInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRenderPassBeginInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #renderPass()
    public VkRenderPassBeginInfo renderPass(VkRenderPass renderPass) {
    	RENDER_PASS_HANDLE.set(segment, 0L, renderPass.memorySegment());
    	return this;
    }
    
    public @Nullable VkRenderPass renderPass() {
    	MemorySegment segment = (MemorySegment) RENDER_PASS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkRenderPass(segment);
    }
    
    /// @see #framebuffer()
    public VkRenderPassBeginInfo framebuffer(VkFramebuffer framebuffer) {
    	FRAMEBUFFER_HANDLE.set(segment, 0L, framebuffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkFramebuffer framebuffer() {
    	MemorySegment segment = (MemorySegment) FRAMEBUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkFramebuffer(segment);
    }
    
    /// @see #renderArea()
    public VkRenderPassBeginInfo renderArea(Consumer<VkRect2D> consumer) {
    	consumer.accept(renderArea);
    	return this;
    }
    
    /// @see #renderArea()
    public VkRenderPassBeginInfo renderArea(VkRect2D other) {
    	renderArea.set(other);
    	return this;
    }
    
    public VkRect2D renderArea() {
    	return renderArea;
    }
    
    /// @see #clearValueCount()
    public VkRenderPassBeginInfo clearValueCount(int clearValueCount) {
    	CLEAR_VALUE_COUNT_HANDLE.set(segment, 0L, clearValueCount);
    	return this;
    }
    
    public int clearValueCount() {
    	return (int) CLEAR_VALUE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pClearValues()
    public VkRenderPassBeginInfo pClearValues(NativeStructArray<VkClearValue> pClearValues) {
    	P_CLEAR_VALUES_HANDLE.set(segment, 0L, pClearValues.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkClearValue> pClearValues() {
    	MemorySegment segment = (MemorySegment) P_CLEAR_VALUES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkClearValue.array(segment);
    }
    
    @Override
    public VkRenderPassBeginInfo set(VkRenderPassBeginInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderPassBeginInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderPassBeginInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderPassBeginInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkRenderPassBeginInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderPassBeginInfo> array(SegmentAllocator allocator, VkRenderPassBeginInfo... structs) {
        NativeStructArray<VkRenderPassBeginInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkRenderPassBeginInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderPassBeginInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderPassBeginInfo(segment)
        );
    }

}