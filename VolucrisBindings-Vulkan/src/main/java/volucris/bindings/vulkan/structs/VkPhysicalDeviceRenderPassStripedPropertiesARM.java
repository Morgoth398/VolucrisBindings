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

public final class VkPhysicalDeviceRenderPassStripedPropertiesARM
		implements Struct<VkPhysicalDeviceRenderPassStripedPropertiesARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAX_RENDER_PASS_STRIPES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long RENDER_PASS_STRIPE_GRANULARITY_BYTE_OFFSET;
	public static final long MAX_RENDER_PASS_STRIPES_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent2D renderPassStripeGranularity;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkExtent2D.LAYOUT.withName("renderPassStripeGranularity"),
		    JAVA_INT.withName("maxRenderPassStripes"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceRenderPassStripedPropertiesARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAX_RENDER_PASS_STRIPES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxRenderPassStripes"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		RENDER_PASS_STRIPE_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("renderPassStripeGranularity"));
		MAX_RENDER_PASS_STRIPES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxRenderPassStripes"));
		//@formatter:on
	}

	public VkPhysicalDeviceRenderPassStripedPropertiesARM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceRenderPassStripedPropertiesARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceRenderPassStripedPropertiesARM(MemorySegment segment) {
	    this.segment = segment;
	
	    renderPassStripeGranularity = new VkExtent2D(segment.asSlice(RENDER_PASS_STRIPE_GRANULARITY_BYTE_OFFSET, VkExtent2D.LAYOUT));
	}

    /// @see #sType()
    public VkPhysicalDeviceRenderPassStripedPropertiesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceRenderPassStripedPropertiesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #renderPassStripeGranularity()
    public VkPhysicalDeviceRenderPassStripedPropertiesARM renderPassStripeGranularity(Consumer<VkExtent2D> consumer) {
    	consumer.accept(renderPassStripeGranularity);
    	return this;
    }
    
    /// @see #renderPassStripeGranularity()
    public VkPhysicalDeviceRenderPassStripedPropertiesARM renderPassStripeGranularity(VkExtent2D other) {
    	renderPassStripeGranularity.set(other);
    	return this;
    }
    
    public VkExtent2D renderPassStripeGranularity() {
    	return renderPassStripeGranularity;
    }
    
    /// @see #maxRenderPassStripes()
    public VkPhysicalDeviceRenderPassStripedPropertiesARM maxRenderPassStripes(int maxRenderPassStripes) {
    	MAX_RENDER_PASS_STRIPES_HANDLE.set(segment, 0L, maxRenderPassStripes);
    	return this;
    }
    
    public int maxRenderPassStripes() {
    	return (int) MAX_RENDER_PASS_STRIPES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceRenderPassStripedPropertiesARM set(VkPhysicalDeviceRenderPassStripedPropertiesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceRenderPassStripedPropertiesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceRenderPassStripedPropertiesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceRenderPassStripedPropertiesARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceRenderPassStripedPropertiesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceRenderPassStripedPropertiesARM> array(SegmentAllocator allocator, VkPhysicalDeviceRenderPassStripedPropertiesARM... structs) {
        NativeStructArray<VkPhysicalDeviceRenderPassStripedPropertiesARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceRenderPassStripedPropertiesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceRenderPassStripedPropertiesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceRenderPassStripedPropertiesARM(segment)
        );
    }

}