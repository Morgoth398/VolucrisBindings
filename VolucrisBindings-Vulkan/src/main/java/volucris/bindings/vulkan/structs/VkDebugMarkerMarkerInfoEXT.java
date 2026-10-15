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

public final class VkDebugMarkerMarkerInfoEXT
		implements Struct<VkDebugMarkerMarkerInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_MARKER_NAME_HANDLE;
	public static final VarHandle COLOR_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_MARKER_NAME_BYTE_OFFSET;
	public static final long COLOR_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pMarkerName"),
		    MemoryLayout.sequenceLayout(4, JAVA_FLOAT).withName("color")
		).withName("VkDebugMarkerMarkerInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_MARKER_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pMarkerName"));
		COLOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("color"), PathElement.sequenceElement());
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_MARKER_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pMarkerName"));
		COLOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("color"));
		//@formatter:on
	}

	public VkDebugMarkerMarkerInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDebugMarkerMarkerInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDebugMarkerMarkerInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDebugMarkerMarkerInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDebugMarkerMarkerInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pMarkerName()
    public VkDebugMarkerMarkerInfoEXT pMarkerName(Arena arena, String pMarkerName) {
    	P_MARKER_NAME_HANDLE.set(segment, 0L, arena.allocateFrom(pMarkerName));
    	return this;
    }
    
    public @Nullable String pMarkerName() {
    	MemorySegment segment = (MemorySegment) P_MARKER_NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// @see #color(int)
    public VkDebugMarkerMarkerInfoEXT color(float color, int index0) {
    	COLOR_HANDLE.set(segment, 0L, index0, color);
    	return this;
    }
    
    public float color(int index0) {
    	return (float) COLOR_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public VkDebugMarkerMarkerInfoEXT set(VkDebugMarkerMarkerInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDebugMarkerMarkerInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDebugMarkerMarkerInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDebugMarkerMarkerInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDebugMarkerMarkerInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDebugMarkerMarkerInfoEXT> array(Arena arena, VkDebugMarkerMarkerInfoEXT... structs) {
        NativeStructArray<VkDebugMarkerMarkerInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDebugMarkerMarkerInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDebugMarkerMarkerInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDebugMarkerMarkerInfoEXT(segment)
        );
    }

}