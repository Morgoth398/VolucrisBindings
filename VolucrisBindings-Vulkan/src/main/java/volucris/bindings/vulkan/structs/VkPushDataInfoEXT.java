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

public final class VkPushDataInfoEXT
		implements Struct<VkPushDataInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle OFFSET_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long OFFSET_BYTE_OFFSET;
    public static final long DATA_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkHostAddressRangeConstEXT data;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("offset"),
            MemoryLayout.paddingLayout(4),
            VkHostAddressRangeConstEXT.LAYOUT.withName("data")
        ).withName("VkPushDataInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
        DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
        //@formatter:on
    }

    public VkPushDataInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPushDataInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPushDataInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
        data = new VkHostAddressRangeConstEXT(segment.asSlice(DATA_BYTE_OFFSET, VkHostAddressRangeConstEXT.LAYOUT));
    }

    /// @see #sType()
    public VkPushDataInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPushDataInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #offset()
    public VkPushDataInfoEXT offset(int offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public int offset() {
    	return (int) OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #data()
    public VkPushDataInfoEXT data(Consumer<VkHostAddressRangeConstEXT> consumer) {
    	consumer.accept(data);
    	return this;
    }
    
    /// @see #data()
    public VkPushDataInfoEXT data(VkHostAddressRangeConstEXT other) {
    	data.set(other);
    	return this;
    }
    
    public VkHostAddressRangeConstEXT data() {
    	return data;
    }
    
    @Override
    public VkPushDataInfoEXT set(VkPushDataInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPushDataInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPushDataInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPushDataInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPushDataInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPushDataInfoEXT> array(Arena arena, VkPushDataInfoEXT... structs) {
        NativeStructArray<VkPushDataInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPushDataInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPushDataInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPushDataInfoEXT(segment)
        );
    }
    
}