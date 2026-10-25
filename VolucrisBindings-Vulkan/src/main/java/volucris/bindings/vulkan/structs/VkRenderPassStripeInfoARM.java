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

public final class VkRenderPassStripeInfoARM
		implements Struct<VkRenderPassStripeInfoARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long STRIPE_AREA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkRect2D stripeArea;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkRect2D.LAYOUT.withName("stripeArea")
		).withName("VkRenderPassStripeInfoARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		STRIPE_AREA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stripeArea"));
		//@formatter:on
	}

	public VkRenderPassStripeInfoARM() {
	    this(Arena.ofAuto());
	}
	
	public VkRenderPassStripeInfoARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkRenderPassStripeInfoARM(MemorySegment segment) {
	    this.segment = segment;
	
	    stripeArea = new VkRect2D(segment.asSlice(STRIPE_AREA_BYTE_OFFSET, VkRect2D.LAYOUT));
	}

    /// @see #sType()
    public VkRenderPassStripeInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRenderPassStripeInfoARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #stripeArea()
    public VkRenderPassStripeInfoARM stripeArea(Consumer<VkRect2D> consumer) {
    	consumer.accept(stripeArea);
    	return this;
    }
    
    /// @see #stripeArea()
    public VkRenderPassStripeInfoARM stripeArea(VkRect2D other) {
    	stripeArea.set(other);
    	return this;
    }
    
    public VkRect2D stripeArea() {
    	return stripeArea;
    }
    
    @Override
    public VkRenderPassStripeInfoARM set(VkRenderPassStripeInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderPassStripeInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderPassStripeInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderPassStripeInfoARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkRenderPassStripeInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderPassStripeInfoARM> array(SegmentAllocator allocator, VkRenderPassStripeInfoARM... structs) {
        NativeStructArray<VkRenderPassStripeInfoARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkRenderPassStripeInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderPassStripeInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderPassStripeInfoARM(segment)
        );
    }

}