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

public final class VkRenderPassSampleLocationsBeginInfoEXT
		implements Struct<VkRenderPassSampleLocationsBeginInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ATTACHMENT_INITIAL_SAMPLE_LOCATIONS_COUNT_HANDLE;
	public static final VarHandle P_ATTACHMENT_INITIAL_SAMPLE_LOCATIONS_HANDLE;
	public static final VarHandle POST_SUBPASS_SAMPLE_LOCATIONS_COUNT_HANDLE;
	public static final VarHandle P_POST_SUBPASS_SAMPLE_LOCATIONS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ATTACHMENT_INITIAL_SAMPLE_LOCATIONS_COUNT_BYTE_OFFSET;
	public static final long P_ATTACHMENT_INITIAL_SAMPLE_LOCATIONS_BYTE_OFFSET;
	public static final long POST_SUBPASS_SAMPLE_LOCATIONS_COUNT_BYTE_OFFSET;
	public static final long P_POST_SUBPASS_SAMPLE_LOCATIONS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("attachmentInitialSampleLocationsCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pAttachmentInitialSampleLocations"),
		    JAVA_INT.withName("postSubpassSampleLocationsCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pPostSubpassSampleLocations")
		).withName("VkRenderPassSampleLocationsBeginInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ATTACHMENT_INITIAL_SAMPLE_LOCATIONS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("attachmentInitialSampleLocationsCount"));
		P_ATTACHMENT_INITIAL_SAMPLE_LOCATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pAttachmentInitialSampleLocations"));
		POST_SUBPASS_SAMPLE_LOCATIONS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("postSubpassSampleLocationsCount"));
		P_POST_SUBPASS_SAMPLE_LOCATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPostSubpassSampleLocations"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ATTACHMENT_INITIAL_SAMPLE_LOCATIONS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("attachmentInitialSampleLocationsCount"));
		P_ATTACHMENT_INITIAL_SAMPLE_LOCATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pAttachmentInitialSampleLocations"));
		POST_SUBPASS_SAMPLE_LOCATIONS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("postSubpassSampleLocationsCount"));
		P_POST_SUBPASS_SAMPLE_LOCATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPostSubpassSampleLocations"));
		//@formatter:on
	}

	public VkRenderPassSampleLocationsBeginInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkRenderPassSampleLocationsBeginInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkRenderPassSampleLocationsBeginInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkRenderPassSampleLocationsBeginInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRenderPassSampleLocationsBeginInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #attachmentInitialSampleLocationsCount()
    public VkRenderPassSampleLocationsBeginInfoEXT attachmentInitialSampleLocationsCount(int attachmentInitialSampleLocationsCount) {
    	ATTACHMENT_INITIAL_SAMPLE_LOCATIONS_COUNT_HANDLE.set(segment, 0L, attachmentInitialSampleLocationsCount);
    	return this;
    }
    
    public int attachmentInitialSampleLocationsCount() {
    	return (int) ATTACHMENT_INITIAL_SAMPLE_LOCATIONS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pAttachmentInitialSampleLocations()
    public VkRenderPassSampleLocationsBeginInfoEXT pAttachmentInitialSampleLocations(NativeStructArray<VkAttachmentSampleLocationsEXT> pAttachmentInitialSampleLocations) {
    	P_ATTACHMENT_INITIAL_SAMPLE_LOCATIONS_HANDLE.set(segment, 0L, pAttachmentInitialSampleLocations.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkAttachmentSampleLocationsEXT> pAttachmentInitialSampleLocations() {
    	MemorySegment segment = (MemorySegment) P_ATTACHMENT_INITIAL_SAMPLE_LOCATIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkAttachmentSampleLocationsEXT.array(segment);
    }
    
    /// @see #postSubpassSampleLocationsCount()
    public VkRenderPassSampleLocationsBeginInfoEXT postSubpassSampleLocationsCount(int postSubpassSampleLocationsCount) {
    	POST_SUBPASS_SAMPLE_LOCATIONS_COUNT_HANDLE.set(segment, 0L, postSubpassSampleLocationsCount);
    	return this;
    }
    
    public int postSubpassSampleLocationsCount() {
    	return (int) POST_SUBPASS_SAMPLE_LOCATIONS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPostSubpassSampleLocations()
    public VkRenderPassSampleLocationsBeginInfoEXT pPostSubpassSampleLocations(NativeStructArray<VkSubpassSampleLocationsEXT> pPostSubpassSampleLocations) {
    	P_POST_SUBPASS_SAMPLE_LOCATIONS_HANDLE.set(segment, 0L, pPostSubpassSampleLocations.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkSubpassSampleLocationsEXT> pPostSubpassSampleLocations() {
    	MemorySegment segment = (MemorySegment) P_POST_SUBPASS_SAMPLE_LOCATIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkSubpassSampleLocationsEXT.array(segment);
    }
    
    @Override
    public VkRenderPassSampleLocationsBeginInfoEXT set(VkRenderPassSampleLocationsBeginInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderPassSampleLocationsBeginInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderPassSampleLocationsBeginInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderPassSampleLocationsBeginInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderPassSampleLocationsBeginInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderPassSampleLocationsBeginInfoEXT> array(Arena arena, VkRenderPassSampleLocationsBeginInfoEXT... structs) {
        NativeStructArray<VkRenderPassSampleLocationsBeginInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderPassSampleLocationsBeginInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderPassSampleLocationsBeginInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderPassSampleLocationsBeginInfoEXT(segment)
        );
    }

}