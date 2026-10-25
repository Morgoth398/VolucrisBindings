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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkVideoEncodeFeedback2CapabilitiesKHR
		implements Struct<VkVideoEncodeFeedback2CapabilitiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAX_PER_PARTITION_FEEDBACK_ENTRIES_HANDLE;
	public static final VarHandle SUPPORTED_PER_PARTITION_ENCODE_FEEDBACK_FLAGS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAX_PER_PARTITION_FEEDBACK_ENTRIES_BYTE_OFFSET;
	public static final long SUPPORTED_PER_PARTITION_ENCODE_FEEDBACK_FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("maxPerPartitionFeedbackEntries"),
		    JAVA_INT.withName("supportedPerPartitionEncodeFeedbackFlags")
		).withName("VkVideoEncodeFeedback2CapabilitiesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAX_PER_PARTITION_FEEDBACK_ENTRIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerPartitionFeedbackEntries"));
		SUPPORTED_PER_PARTITION_ENCODE_FEEDBACK_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedPerPartitionEncodeFeedbackFlags"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAX_PER_PARTITION_FEEDBACK_ENTRIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerPartitionFeedbackEntries"));
		SUPPORTED_PER_PARTITION_ENCODE_FEEDBACK_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedPerPartitionEncodeFeedbackFlags"));
		//@formatter:on
	}

	public VkVideoEncodeFeedback2CapabilitiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeFeedback2CapabilitiesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoEncodeFeedback2CapabilitiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeFeedback2CapabilitiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeFeedback2CapabilitiesKHR pNext(MemorySegment pNext) {
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
    public VkVideoEncodeFeedback2CapabilitiesKHR maxPerPartitionFeedbackEntries(int maxPerPartitionFeedbackEntries) {
    	MAX_PER_PARTITION_FEEDBACK_ENTRIES_HANDLE.set(segment, 0L, maxPerPartitionFeedbackEntries);
    	return this;
    }
    
    public int maxPerPartitionFeedbackEntries() {
    	return (int) MAX_PER_PARTITION_FEEDBACK_ENTRIES_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedPerPartitionEncodeFeedbackFlags()
    public VkVideoEncodeFeedback2CapabilitiesKHR supportedPerPartitionEncodeFeedbackFlags(int supportedPerPartitionEncodeFeedbackFlags) {
    	SUPPORTED_PER_PARTITION_ENCODE_FEEDBACK_FLAGS_HANDLE.set(segment, 0L, supportedPerPartitionEncodeFeedbackFlags);
    	return this;
    }
    
    public int supportedPerPartitionEncodeFeedbackFlags() {
    	return (int) SUPPORTED_PER_PARTITION_ENCODE_FEEDBACK_FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeFeedback2CapabilitiesKHR set(VkVideoEncodeFeedback2CapabilitiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeFeedback2CapabilitiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeFeedback2CapabilitiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeFeedback2CapabilitiesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeFeedback2CapabilitiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeFeedback2CapabilitiesKHR> array(SegmentAllocator allocator, VkVideoEncodeFeedback2CapabilitiesKHR... structs) {
        NativeStructArray<VkVideoEncodeFeedback2CapabilitiesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeFeedback2CapabilitiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeFeedback2CapabilitiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeFeedback2CapabilitiesKHR(segment)
        );
    }

}