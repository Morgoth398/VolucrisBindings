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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkAttachmentSampleCountInfoAMD
		implements Struct<VkAttachmentSampleCountInfoAMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle COLOR_ATTACHMENT_COUNT_HANDLE;
	public static final VarHandle P_COLOR_ATTACHMENT_SAMPLES_HANDLE;
	public static final VarHandle DEPTH_STENCIL_ATTACHMENT_SAMPLES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long COLOR_ATTACHMENT_COUNT_BYTE_OFFSET;
	public static final long P_COLOR_ATTACHMENT_SAMPLES_BYTE_OFFSET;
	public static final long DEPTH_STENCIL_ATTACHMENT_SAMPLES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("colorAttachmentCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pColorAttachmentSamples"),
		    JAVA_INT.withName("depthStencilAttachmentSamples"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkAttachmentSampleCountInfoAMD").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		COLOR_ATTACHMENT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("colorAttachmentCount"));
		P_COLOR_ATTACHMENT_SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pColorAttachmentSamples"));
		DEPTH_STENCIL_ATTACHMENT_SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthStencilAttachmentSamples"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		COLOR_ATTACHMENT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
		P_COLOR_ATTACHMENT_SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachmentSamples"));
		DEPTH_STENCIL_ATTACHMENT_SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthStencilAttachmentSamples"));
		//@formatter:on
	}

	public VkAttachmentSampleCountInfoAMD() {
	    this(Arena.ofAuto());
	}
	
	public VkAttachmentSampleCountInfoAMD(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkAttachmentSampleCountInfoAMD(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkAttachmentSampleCountInfoAMD sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAttachmentSampleCountInfoAMD pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #colorAttachmentCount()
    public VkAttachmentSampleCountInfoAMD colorAttachmentCount(int colorAttachmentCount) {
    	COLOR_ATTACHMENT_COUNT_HANDLE.set(segment, 0L, colorAttachmentCount);
    	return this;
    }
    
    public int colorAttachmentCount() {
    	return (int) COLOR_ATTACHMENT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pColorAttachmentSamples()
    public VkAttachmentSampleCountInfoAMD pColorAttachmentSamples(NativeIntArray pColorAttachmentSamples) {
    	P_COLOR_ATTACHMENT_SAMPLES_HANDLE.set(segment, 0L, pColorAttachmentSamples.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pColorAttachmentSamples() {
    	MemorySegment segment = (MemorySegment) P_COLOR_ATTACHMENT_SAMPLES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #depthStencilAttachmentSamples()
    public VkAttachmentSampleCountInfoAMD depthStencilAttachmentSamples(int depthStencilAttachmentSamples) {
    	DEPTH_STENCIL_ATTACHMENT_SAMPLES_HANDLE.set(segment, 0L, depthStencilAttachmentSamples);
    	return this;
    }
    
    public int depthStencilAttachmentSamples() {
    	return (int) DEPTH_STENCIL_ATTACHMENT_SAMPLES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkAttachmentSampleCountInfoAMD set(VkAttachmentSampleCountInfoAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkAttachmentSampleCountInfoAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAttachmentSampleCountInfoAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAttachmentSampleCountInfoAMD> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAttachmentSampleCountInfoAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAttachmentSampleCountInfoAMD> array(Arena arena, VkAttachmentSampleCountInfoAMD... structs) {
        NativeStructArray<VkAttachmentSampleCountInfoAMD> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAttachmentSampleCountInfoAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAttachmentSampleCountInfoAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAttachmentSampleCountInfoAMD(segment)
        );
    }

}