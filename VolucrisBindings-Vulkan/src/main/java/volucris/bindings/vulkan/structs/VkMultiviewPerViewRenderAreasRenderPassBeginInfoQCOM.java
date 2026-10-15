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

public final class VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM
		implements Struct<VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PER_VIEW_RENDER_AREA_COUNT_HANDLE;
	public static final VarHandle P_PER_VIEW_RENDER_AREAS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PER_VIEW_RENDER_AREA_COUNT_BYTE_OFFSET;
	public static final long P_PER_VIEW_RENDER_AREAS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("perViewRenderAreaCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pPerViewRenderAreas")
		).withName("VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PER_VIEW_RENDER_AREA_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("perViewRenderAreaCount"));
		P_PER_VIEW_RENDER_AREAS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPerViewRenderAreas"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PER_VIEW_RENDER_AREA_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("perViewRenderAreaCount"));
		P_PER_VIEW_RENDER_AREAS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPerViewRenderAreas"));
		//@formatter:on
	}

	public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM() {
	    this(Arena.ofAuto());
	}
	
	public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #perViewRenderAreaCount()
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM perViewRenderAreaCount(int perViewRenderAreaCount) {
    	PER_VIEW_RENDER_AREA_COUNT_HANDLE.set(segment, 0L, perViewRenderAreaCount);
    	return this;
    }
    
    public int perViewRenderAreaCount() {
    	return (int) PER_VIEW_RENDER_AREA_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPerViewRenderAreas()
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM pPerViewRenderAreas(NativeStructArray<VkRect2D> pPerViewRenderAreas) {
    	P_PER_VIEW_RENDER_AREAS_HANDLE.set(segment, 0L, pPerViewRenderAreas.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkRect2D> pPerViewRenderAreas() {
    	MemorySegment segment = (MemorySegment) P_PER_VIEW_RENDER_AREAS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkRect2D.array(segment);
    }
    
    @Override
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM set(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM> array(Arena arena, VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM... structs) {
        NativeStructArray<VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(segment)
        );
    }

}