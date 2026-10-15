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

public final class VkRenderPassStripeSubmitInfoARM
		implements Struct<VkRenderPassStripeSubmitInfoARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle STRIPE_SEMAPHORE_INFO_COUNT_HANDLE;
	public static final VarHandle P_STRIPE_SEMAPHORE_INFOS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long STRIPE_SEMAPHORE_INFO_COUNT_BYTE_OFFSET;
	public static final long P_STRIPE_SEMAPHORE_INFOS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("stripeSemaphoreInfoCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pStripeSemaphoreInfos")
		).withName("VkRenderPassStripeSubmitInfoARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		STRIPE_SEMAPHORE_INFO_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stripeSemaphoreInfoCount"));
		P_STRIPE_SEMAPHORE_INFOS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStripeSemaphoreInfos"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		STRIPE_SEMAPHORE_INFO_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stripeSemaphoreInfoCount"));
		P_STRIPE_SEMAPHORE_INFOS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStripeSemaphoreInfos"));
		//@formatter:on
	}

	public VkRenderPassStripeSubmitInfoARM() {
	    this(Arena.ofAuto());
	}
	
	public VkRenderPassStripeSubmitInfoARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkRenderPassStripeSubmitInfoARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkRenderPassStripeSubmitInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRenderPassStripeSubmitInfoARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #stripeSemaphoreInfoCount()
    public VkRenderPassStripeSubmitInfoARM stripeSemaphoreInfoCount(int stripeSemaphoreInfoCount) {
    	STRIPE_SEMAPHORE_INFO_COUNT_HANDLE.set(segment, 0L, stripeSemaphoreInfoCount);
    	return this;
    }
    
    public int stripeSemaphoreInfoCount() {
    	return (int) STRIPE_SEMAPHORE_INFO_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pStripeSemaphoreInfos()
    public VkRenderPassStripeSubmitInfoARM pStripeSemaphoreInfos(NativeStructArray<VkSemaphoreSubmitInfo> pStripeSemaphoreInfos) {
    	P_STRIPE_SEMAPHORE_INFOS_HANDLE.set(segment, 0L, pStripeSemaphoreInfos.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkSemaphoreSubmitInfo> pStripeSemaphoreInfos() {
    	MemorySegment segment = (MemorySegment) P_STRIPE_SEMAPHORE_INFOS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkSemaphoreSubmitInfo.array(segment);
    }
    
    @Override
    public VkRenderPassStripeSubmitInfoARM set(VkRenderPassStripeSubmitInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderPassStripeSubmitInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderPassStripeSubmitInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderPassStripeSubmitInfoARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderPassStripeSubmitInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderPassStripeSubmitInfoARM> array(Arena arena, VkRenderPassStripeSubmitInfoARM... structs) {
        NativeStructArray<VkRenderPassStripeSubmitInfoARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderPassStripeSubmitInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderPassStripeSubmitInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderPassStripeSubmitInfoARM(segment)
        );
    }

}