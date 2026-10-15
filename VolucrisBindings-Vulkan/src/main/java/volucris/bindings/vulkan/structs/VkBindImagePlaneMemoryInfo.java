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

public final class VkBindImagePlaneMemoryInfo
		implements Struct<VkBindImagePlaneMemoryInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PLANE_ASPECT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PLANE_ASPECT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("planeAspect"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkBindImagePlaneMemoryInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PLANE_ASPECT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("planeAspect"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PLANE_ASPECT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("planeAspect"));
		//@formatter:on
	}

	public VkBindImagePlaneMemoryInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkBindImagePlaneMemoryInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkBindImagePlaneMemoryInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkBindImagePlaneMemoryInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBindImagePlaneMemoryInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #planeAspect()
    public VkBindImagePlaneMemoryInfo planeAspect(int planeAspect) {
    	PLANE_ASPECT_HANDLE.set(segment, 0L, planeAspect);
    	return this;
    }
    
    public int planeAspect() {
    	return (int) PLANE_ASPECT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkBindImagePlaneMemoryInfo set(VkBindImagePlaneMemoryInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkBindImagePlaneMemoryInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBindImagePlaneMemoryInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBindImagePlaneMemoryInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindImagePlaneMemoryInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBindImagePlaneMemoryInfo> array(Arena arena, VkBindImagePlaneMemoryInfo... structs) {
        NativeStructArray<VkBindImagePlaneMemoryInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindImagePlaneMemoryInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBindImagePlaneMemoryInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBindImagePlaneMemoryInfo(segment)
        );
    }

}