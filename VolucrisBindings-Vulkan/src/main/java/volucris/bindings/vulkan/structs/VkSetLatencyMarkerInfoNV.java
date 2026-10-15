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

public final class VkSetLatencyMarkerInfoNV
		implements Struct<VkSetLatencyMarkerInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PRESENT_ID_HANDLE;
	public static final VarHandle MARKER_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PRESENT_ID_BYTE_OFFSET;
	public static final long MARKER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("presentID"),
		    JAVA_INT.withName("marker"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkSetLatencyMarkerInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PRESENT_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentID"));
		MARKER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("marker"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PRESENT_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentID"));
		MARKER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("marker"));
		//@formatter:on
	}

	public VkSetLatencyMarkerInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkSetLatencyMarkerInfoNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkSetLatencyMarkerInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkSetLatencyMarkerInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSetLatencyMarkerInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #presentID()
    public VkSetLatencyMarkerInfoNV presentID(long presentID) {
    	PRESENT_ID_HANDLE.set(segment, 0L, presentID);
    	return this;
    }
    
    public long presentID() {
    	return (long) PRESENT_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #marker()
    public VkSetLatencyMarkerInfoNV marker(int marker) {
    	MARKER_HANDLE.set(segment, 0L, marker);
    	return this;
    }
    
    public int marker() {
    	return (int) MARKER_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSetLatencyMarkerInfoNV set(VkSetLatencyMarkerInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkSetLatencyMarkerInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSetLatencyMarkerInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSetLatencyMarkerInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSetLatencyMarkerInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSetLatencyMarkerInfoNV> array(Arena arena, VkSetLatencyMarkerInfoNV... structs) {
        NativeStructArray<VkSetLatencyMarkerInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSetLatencyMarkerInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSetLatencyMarkerInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSetLatencyMarkerInfoNV(segment)
        );
    }

}