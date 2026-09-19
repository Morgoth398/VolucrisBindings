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

public final class VkPipelineExecutableStatisticKHR
		implements Struct<VkPipelineExecutableStatisticKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle NAME_HANDLE;
    public static final VarHandle DESCRIPTION_HANDLE;
    public static final VarHandle FORMAT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long NAME_BYTE_OFFSET;
    public static final long DESCRIPTION_BYTE_OFFSET;
    public static final long FORMAT_BYTE_OFFSET;
    public static final long VALUE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkPipelineExecutableStatisticValueKHR value;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("name"),
            MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("description"),
            JAVA_INT.withName("format"),
            MemoryLayout.paddingLayout(4),
            VkPipelineExecutableStatisticValueKHR.LAYOUT.withName("value")
        ).withName("VkPipelineExecutableStatisticKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("name"), PathElement.sequenceElement());
        DESCRIPTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
        FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("name"));
        DESCRIPTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("description"));
        FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
        VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("value"));
        //@formatter:on
    }

    public VkPipelineExecutableStatisticKHR() {
        this(Arena.ofAuto());
    }
    
    public VkPipelineExecutableStatisticKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPipelineExecutableStatisticKHR(MemorySegment segment) {
        this.segment = segment;
    
        value = new VkPipelineExecutableStatisticValueKHR(segment.asSlice(VALUE_BYTE_OFFSET, VkPipelineExecutableStatisticValueKHR.LAYOUT));
    }

    /// @see #sType()
    public VkPipelineExecutableStatisticKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineExecutableStatisticKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #name(int)
    public VkPipelineExecutableStatisticKHR name(byte name, int index0) {
    	NAME_HANDLE.set(segment, 0L, index0, name);
    	return this;
    }
    
    public byte name(int index0) {
    	return (byte) NAME_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #description(int)
    public VkPipelineExecutableStatisticKHR description(byte description, int index0) {
    	DESCRIPTION_HANDLE.set(segment, 0L, index0, description);
    	return this;
    }
    
    public byte description(int index0) {
    	return (byte) DESCRIPTION_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #format()
    public VkPipelineExecutableStatisticKHR format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #value()
    public VkPipelineExecutableStatisticKHR value(Consumer<VkPipelineExecutableStatisticValueKHR> consumer) {
    	consumer.accept(value);
    	return this;
    }
    
    /// @see #value()
    public VkPipelineExecutableStatisticKHR value(VkPipelineExecutableStatisticValueKHR other) {
    	value.set(other);
    	return this;
    }
    
    public VkPipelineExecutableStatisticValueKHR value() {
    	return value;
    }
    
    public String name() {
        return segment.getString(NAME_BYTE_OFFSET);
    }
    
    public String description() {
        return segment.getString(DESCRIPTION_BYTE_OFFSET);
    }
    
    @Override
    public VkPipelineExecutableStatisticKHR set(VkPipelineExecutableStatisticKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineExecutableStatisticKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineExecutableStatisticKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineExecutableStatisticKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineExecutableStatisticKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineExecutableStatisticKHR> array(Arena arena, VkPipelineExecutableStatisticKHR... structs) {
        NativeStructArray<VkPipelineExecutableStatisticKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineExecutableStatisticKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineExecutableStatisticKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineExecutableStatisticKHR(segment)
        );
    }
    
}