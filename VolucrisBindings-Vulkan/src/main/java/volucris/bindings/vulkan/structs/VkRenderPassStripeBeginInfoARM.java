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

public final class VkRenderPassStripeBeginInfoARM
		implements Struct<VkRenderPassStripeBeginInfoARM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle STRIPE_INFO_COUNT_HANDLE;
    public static final VarHandle P_STRIPE_INFOS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long STRIPE_INFO_COUNT_BYTE_OFFSET;
    public static final long P_STRIPE_INFOS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("stripeInfoCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pStripeInfos")
        ).withName("VkRenderPassStripeBeginInfoARM").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        STRIPE_INFO_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stripeInfoCount"));
        P_STRIPE_INFOS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStripeInfos"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        STRIPE_INFO_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stripeInfoCount"));
        P_STRIPE_INFOS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStripeInfos"));
        //@formatter:on
    }

    public VkRenderPassStripeBeginInfoARM() {
        this(Arena.ofAuto());
    }
    
    public VkRenderPassStripeBeginInfoARM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkRenderPassStripeBeginInfoARM(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkRenderPassStripeBeginInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRenderPassStripeBeginInfoARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #stripeInfoCount()
    public VkRenderPassStripeBeginInfoARM stripeInfoCount(int stripeInfoCount) {
    	STRIPE_INFO_COUNT_HANDLE.set(segment, 0L, stripeInfoCount);
    	return this;
    }
    
    public int stripeInfoCount() {
    	return (int) STRIPE_INFO_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pStripeInfos()
    public VkRenderPassStripeBeginInfoARM pStripeInfos(NativeStructArray<VkRenderPassStripeInfoARM> pStripeInfos) {
    	P_STRIPE_INFOS_HANDLE.set(segment, 0L, pStripeInfos.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkRenderPassStripeInfoARM> pStripeInfos() {
    	MemorySegment segment = (MemorySegment) P_STRIPE_INFOS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkRenderPassStripeInfoARM.array(segment);
    }
    
    @Override
    public VkRenderPassStripeBeginInfoARM set(VkRenderPassStripeBeginInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderPassStripeBeginInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderPassStripeBeginInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderPassStripeBeginInfoARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderPassStripeBeginInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderPassStripeBeginInfoARM> array(Arena arena, VkRenderPassStripeBeginInfoARM... structs) {
        NativeStructArray<VkRenderPassStripeBeginInfoARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderPassStripeBeginInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderPassStripeBeginInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderPassStripeBeginInfoARM(segment)
        );
    }
    
}