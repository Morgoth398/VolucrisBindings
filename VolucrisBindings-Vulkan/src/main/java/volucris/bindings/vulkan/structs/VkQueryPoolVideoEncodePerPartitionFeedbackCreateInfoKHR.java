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

public final class VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR
		implements Struct<VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_PER_PARTITION_FEEDBACK_ENTRIES_HANDLE;
    public static final VarHandle PER_PARTITION_ENCODE_FEEDBACK_FLAGS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_PER_PARTITION_FEEDBACK_ENTRIES_BYTE_OFFSET;
    public static final long PER_PARTITION_ENCODE_FEEDBACK_FLAGS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maxPerPartitionFeedbackEntries"),
            JAVA_INT.withName("perPartitionEncodeFeedbackFlags")
        ).withName("VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_PER_PARTITION_FEEDBACK_ENTRIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerPartitionFeedbackEntries"));
        PER_PARTITION_ENCODE_FEEDBACK_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("perPartitionEncodeFeedbackFlags"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_PER_PARTITION_FEEDBACK_ENTRIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerPartitionFeedbackEntries"));
        PER_PARTITION_ENCODE_FEEDBACK_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("perPartitionEncodeFeedbackFlags"));
        //@formatter:on
    }

    public VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxPerPartitionFeedbackEntries()
    public VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR maxPerPartitionFeedbackEntries(int maxPerPartitionFeedbackEntries) {
    	MAX_PER_PARTITION_FEEDBACK_ENTRIES_HANDLE.set(segment, 0L, maxPerPartitionFeedbackEntries);
    	return this;
    }
    
    public int maxPerPartitionFeedbackEntries() {
    	return (int) MAX_PER_PARTITION_FEEDBACK_ENTRIES_HANDLE.get(segment, 0L);
    }
    
    /// @see #perPartitionEncodeFeedbackFlags()
    public VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR perPartitionEncodeFeedbackFlags(int perPartitionEncodeFeedbackFlags) {
    	PER_PARTITION_ENCODE_FEEDBACK_FLAGS_HANDLE.set(segment, 0L, perPartitionEncodeFeedbackFlags);
    	return this;
    }
    
    public int perPartitionEncodeFeedbackFlags() {
    	return (int) PER_PARTITION_ENCODE_FEEDBACK_FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR set(VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR> array(Arena arena, VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR... structs) {
        NativeStructArray<VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkQueryPoolVideoEncodePerPartitionFeedbackCreateInfoKHR(segment)
        );
    }
    
}