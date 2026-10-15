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

public final class VkAntiLagDataAMD
		implements Struct<VkAntiLagDataAMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MODE_HANDLE;
	public static final VarHandle MAX_FPS_HANDLE;
	public static final VarHandle P_PRESENTATION_INFO_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MODE_BYTE_OFFSET;
	public static final long MAX_FPS_BYTE_OFFSET;
	public static final long P_PRESENTATION_INFO_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("mode"),
		    JAVA_INT.withName("maxFPS"),
		    UNBOUNDED_ADDRESS.withName("pPresentationInfo")
		).withName("VkAntiLagDataAMD").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mode"));
		MAX_FPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxFPS"));
		P_PRESENTATION_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPresentationInfo"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mode"));
		MAX_FPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFPS"));
		P_PRESENTATION_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPresentationInfo"));
		//@formatter:on
	}

	public VkAntiLagDataAMD() {
	    this(Arena.ofAuto());
	}
	
	public VkAntiLagDataAMD(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkAntiLagDataAMD(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkAntiLagDataAMD sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAntiLagDataAMD pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #mode()
    public VkAntiLagDataAMD mode(int mode) {
    	MODE_HANDLE.set(segment, 0L, mode);
    	return this;
    }
    
    public int mode() {
    	return (int) MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxFPS()
    public VkAntiLagDataAMD maxFPS(int maxFPS) {
    	MAX_FPS_HANDLE.set(segment, 0L, maxFPS);
    	return this;
    }
    
    public int maxFPS() {
    	return (int) MAX_FPS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPresentationInfo()
    public VkAntiLagDataAMD pPresentationInfo(VkAntiLagPresentationInfoAMD pPresentationInfo) {
    	P_PRESENTATION_INFO_HANDLE.set(segment, 0L, pPresentationInfo.memorySegment());
    	return this;
    }
    
    public @Nullable VkAntiLagPresentationInfoAMD pPresentationInfo() {
    	MemorySegment segment = (MemorySegment) P_PRESENTATION_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkAntiLagPresentationInfoAMD(segment);
    }
    
    @Override
    public VkAntiLagDataAMD set(VkAntiLagDataAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkAntiLagDataAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAntiLagDataAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAntiLagDataAMD> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAntiLagDataAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAntiLagDataAMD> array(Arena arena, VkAntiLagDataAMD... structs) {
        NativeStructArray<VkAntiLagDataAMD> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAntiLagDataAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAntiLagDataAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAntiLagDataAMD(segment)
        );
    }

}