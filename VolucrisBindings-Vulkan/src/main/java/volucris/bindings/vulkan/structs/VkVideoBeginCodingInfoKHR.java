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

public final class VkVideoBeginCodingInfoKHR
		implements Struct<VkVideoBeginCodingInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle VIDEO_SESSION_HANDLE;
	public static final VarHandle VIDEO_SESSION_PARAMETERS_HANDLE;
	public static final VarHandle REFERENCE_SLOT_COUNT_HANDLE;
	public static final VarHandle P_REFERENCE_SLOTS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long VIDEO_SESSION_BYTE_OFFSET;
	public static final long VIDEO_SESSION_PARAMETERS_BYTE_OFFSET;
	public static final long REFERENCE_SLOT_COUNT_BYTE_OFFSET;
	public static final long P_REFERENCE_SLOTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("videoSession"),
		    UNBOUNDED_ADDRESS.withName("videoSessionParameters"),
		    JAVA_INT.withName("referenceSlotCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pReferenceSlots")
		).withName("VkVideoBeginCodingInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		VIDEO_SESSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("videoSession"));
		VIDEO_SESSION_PARAMETERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("videoSessionParameters"));
		REFERENCE_SLOT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("referenceSlotCount"));
		P_REFERENCE_SLOTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pReferenceSlots"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		VIDEO_SESSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("videoSession"));
		VIDEO_SESSION_PARAMETERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("videoSessionParameters"));
		REFERENCE_SLOT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("referenceSlotCount"));
		P_REFERENCE_SLOTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pReferenceSlots"));
		//@formatter:on
	}

	public VkVideoBeginCodingInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoBeginCodingInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoBeginCodingInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoBeginCodingInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoBeginCodingInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkVideoBeginCodingInfoKHR flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #videoSession()
    public VkVideoBeginCodingInfoKHR videoSession(VkVideoSessionKHR videoSession) {
    	VIDEO_SESSION_HANDLE.set(segment, 0L, videoSession.memorySegment());
    	return this;
    }
    
    public @Nullable VkVideoSessionKHR videoSession() {
    	MemorySegment segment = (MemorySegment) VIDEO_SESSION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkVideoSessionKHR(segment);
    }
    
    /// @see #videoSessionParameters()
    public VkVideoBeginCodingInfoKHR videoSessionParameters(VkVideoSessionParametersKHR videoSessionParameters) {
    	VIDEO_SESSION_PARAMETERS_HANDLE.set(segment, 0L, videoSessionParameters.memorySegment());
    	return this;
    }
    
    public @Nullable VkVideoSessionParametersKHR videoSessionParameters() {
    	MemorySegment segment = (MemorySegment) VIDEO_SESSION_PARAMETERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkVideoSessionParametersKHR(segment);
    }
    
    /// @see #referenceSlotCount()
    public VkVideoBeginCodingInfoKHR referenceSlotCount(int referenceSlotCount) {
    	REFERENCE_SLOT_COUNT_HANDLE.set(segment, 0L, referenceSlotCount);
    	return this;
    }
    
    public int referenceSlotCount() {
    	return (int) REFERENCE_SLOT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pReferenceSlots()
    public VkVideoBeginCodingInfoKHR pReferenceSlots(NativeStructArray<VkVideoReferenceSlotInfoKHR> pReferenceSlots) {
    	P_REFERENCE_SLOTS_HANDLE.set(segment, 0L, pReferenceSlots.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkVideoReferenceSlotInfoKHR> pReferenceSlots() {
    	MemorySegment segment = (MemorySegment) P_REFERENCE_SLOTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkVideoReferenceSlotInfoKHR.array(segment);
    }
    
    @Override
    public VkVideoBeginCodingInfoKHR set(VkVideoBeginCodingInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoBeginCodingInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoBeginCodingInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoBeginCodingInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoBeginCodingInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoBeginCodingInfoKHR> array(Arena arena, VkVideoBeginCodingInfoKHR... structs) {
        NativeStructArray<VkVideoBeginCodingInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoBeginCodingInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoBeginCodingInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoBeginCodingInfoKHR(segment)
        );
    }

}