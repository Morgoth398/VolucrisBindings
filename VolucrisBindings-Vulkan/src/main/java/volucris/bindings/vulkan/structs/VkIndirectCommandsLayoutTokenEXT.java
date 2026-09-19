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

public final class VkIndirectCommandsLayoutTokenEXT
		implements Struct<VkIndirectCommandsLayoutTokenEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle TYPE_HANDLE;
    public static final VarHandle OFFSET_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long TYPE_BYTE_OFFSET;
    public static final long DATA_BYTE_OFFSET;
    public static final long OFFSET_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkIndirectCommandsTokenDataEXT data;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            VkIndirectCommandsTokenDataEXT.LAYOUT.withName("data"),
            JAVA_INT.withName("offset"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkIndirectCommandsLayoutTokenEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
        OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
        DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
        OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
        //@formatter:on
    }

    public VkIndirectCommandsLayoutTokenEXT() {
        this(Arena.ofAuto());
    }
    
    public VkIndirectCommandsLayoutTokenEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkIndirectCommandsLayoutTokenEXT(MemorySegment segment) {
        this.segment = segment;
    
        data = new VkIndirectCommandsTokenDataEXT(segment.asSlice(DATA_BYTE_OFFSET, VkIndirectCommandsTokenDataEXT.LAYOUT));
    }

    /// @see #sType()
    public VkIndirectCommandsLayoutTokenEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkIndirectCommandsLayoutTokenEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #type()
    public VkIndirectCommandsLayoutTokenEXT type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #offset()
    public VkIndirectCommandsLayoutTokenEXT offset(int offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public int offset() {
    	return (int) OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #data()
    public VkIndirectCommandsLayoutTokenEXT data(Consumer<VkIndirectCommandsTokenDataEXT> consumer) {
    	consumer.accept(data);
    	return this;
    }
    
    /// @see #data()
    public VkIndirectCommandsLayoutTokenEXT data(VkIndirectCommandsTokenDataEXT other) {
    	data.set(other);
    	return this;
    }
    
    public VkIndirectCommandsTokenDataEXT data() {
    	return data;
    }
    
    @Override
    public VkIndirectCommandsLayoutTokenEXT set(VkIndirectCommandsLayoutTokenEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkIndirectCommandsLayoutTokenEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkIndirectCommandsLayoutTokenEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkIndirectCommandsLayoutTokenEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectCommandsLayoutTokenEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkIndirectCommandsLayoutTokenEXT> array(Arena arena, VkIndirectCommandsLayoutTokenEXT... structs) {
        NativeStructArray<VkIndirectCommandsLayoutTokenEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectCommandsLayoutTokenEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkIndirectCommandsLayoutTokenEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkIndirectCommandsLayoutTokenEXT(segment)
        );
    }
    
}