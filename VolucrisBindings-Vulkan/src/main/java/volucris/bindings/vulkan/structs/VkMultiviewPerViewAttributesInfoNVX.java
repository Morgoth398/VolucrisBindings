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

public final class VkMultiviewPerViewAttributesInfoNVX
		implements Struct<VkMultiviewPerViewAttributesInfoNVX> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PER_VIEW_ATTRIBUTES_HANDLE;
    public static final VarHandle PER_VIEW_ATTRIBUTES_POSITION_XONLY_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PER_VIEW_ATTRIBUTES_BYTE_OFFSET;
    public static final long PER_VIEW_ATTRIBUTES_POSITION_XONLY_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("perViewAttributes"),
            JAVA_INT.withName("perViewAttributesPositionXOnly")
        ).withName("VkMultiviewPerViewAttributesInfoNVX").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PER_VIEW_ATTRIBUTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("perViewAttributes"));
        PER_VIEW_ATTRIBUTES_POSITION_XONLY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("perViewAttributesPositionXOnly"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PER_VIEW_ATTRIBUTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("perViewAttributes"));
        PER_VIEW_ATTRIBUTES_POSITION_XONLY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("perViewAttributesPositionXOnly"));
        //@formatter:on
    }

    public VkMultiviewPerViewAttributesInfoNVX() {
        this(Arena.ofAuto());
    }
    
    public VkMultiviewPerViewAttributesInfoNVX(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkMultiviewPerViewAttributesInfoNVX(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkMultiviewPerViewAttributesInfoNVX sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkMultiviewPerViewAttributesInfoNVX pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #perViewAttributes()
    public VkMultiviewPerViewAttributesInfoNVX perViewAttributes(int perViewAttributes) {
    	PER_VIEW_ATTRIBUTES_HANDLE.set(segment, 0L, perViewAttributes);
    	return this;
    }
    
    public int perViewAttributes() {
    	return (int) PER_VIEW_ATTRIBUTES_HANDLE.get(segment, 0L);
    }
    
    /// @see #perViewAttributesPositionXOnly()
    public VkMultiviewPerViewAttributesInfoNVX perViewAttributesPositionXOnly(int perViewAttributesPositionXOnly) {
    	PER_VIEW_ATTRIBUTES_POSITION_XONLY_HANDLE.set(segment, 0L, perViewAttributesPositionXOnly);
    	return this;
    }
    
    public int perViewAttributesPositionXOnly() {
    	return (int) PER_VIEW_ATTRIBUTES_POSITION_XONLY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkMultiviewPerViewAttributesInfoNVX set(VkMultiviewPerViewAttributesInfoNVX other) {
        return set(other.segment);
    }
    
    @Override
    public VkMultiviewPerViewAttributesInfoNVX set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMultiviewPerViewAttributesInfoNVX> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMultiviewPerViewAttributesInfoNVX> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMultiviewPerViewAttributesInfoNVX(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMultiviewPerViewAttributesInfoNVX> array(Arena arena, VkMultiviewPerViewAttributesInfoNVX... structs) {
        NativeStructArray<VkMultiviewPerViewAttributesInfoNVX> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMultiviewPerViewAttributesInfoNVX(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMultiviewPerViewAttributesInfoNVX> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMultiviewPerViewAttributesInfoNVX(segment)
        );
    }
    
}