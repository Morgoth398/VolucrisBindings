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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkAttachmentSampleLocationsEXT
		implements Struct<VkAttachmentSampleLocationsEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ATTACHMENT_INDEX_HANDLE;

	public static final long ATTACHMENT_INDEX_BYTE_OFFSET;
	public static final long SAMPLE_LOCATIONS_INFO_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkSampleLocationsInfoEXT sampleLocationsInfo;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("attachmentIndex"),
		    MemoryLayout.paddingLayout(4),
		    VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
		).withName("VkAttachmentSampleLocationsEXT").withByteAlignment(8);
		
		ATTACHMENT_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("attachmentIndex"));
		
		ATTACHMENT_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("attachmentIndex"));
		SAMPLE_LOCATIONS_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsInfo"));
		//@formatter:on
	}

	public VkAttachmentSampleLocationsEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkAttachmentSampleLocationsEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkAttachmentSampleLocationsEXT(MemorySegment segment) {
	    this.segment = segment;
	
	    sampleLocationsInfo = new VkSampleLocationsInfoEXT(segment.asSlice(SAMPLE_LOCATIONS_INFO_BYTE_OFFSET, VkSampleLocationsInfoEXT.LAYOUT));
	}

    /// @see #attachmentIndex()
    public VkAttachmentSampleLocationsEXT attachmentIndex(int attachmentIndex) {
    	ATTACHMENT_INDEX_HANDLE.set(segment, 0L, attachmentIndex);
    	return this;
    }
    
    public int attachmentIndex() {
    	return (int) ATTACHMENT_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleLocationsInfo()
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo(Consumer<VkSampleLocationsInfoEXT> consumer) {
    	consumer.accept(sampleLocationsInfo);
    	return this;
    }
    
    /// @see #sampleLocationsInfo()
    public VkAttachmentSampleLocationsEXT sampleLocationsInfo(VkSampleLocationsInfoEXT other) {
    	sampleLocationsInfo.set(other);
    	return this;
    }
    
    public VkSampleLocationsInfoEXT sampleLocationsInfo() {
    	return sampleLocationsInfo;
    }
    
    @Override
    public VkAttachmentSampleLocationsEXT set(VkAttachmentSampleLocationsEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkAttachmentSampleLocationsEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAttachmentSampleLocationsEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAttachmentSampleLocationsEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAttachmentSampleLocationsEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAttachmentSampleLocationsEXT> array(Arena arena, VkAttachmentSampleLocationsEXT... structs) {
        NativeStructArray<VkAttachmentSampleLocationsEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAttachmentSampleLocationsEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAttachmentSampleLocationsEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAttachmentSampleLocationsEXT(segment)
        );
    }

}