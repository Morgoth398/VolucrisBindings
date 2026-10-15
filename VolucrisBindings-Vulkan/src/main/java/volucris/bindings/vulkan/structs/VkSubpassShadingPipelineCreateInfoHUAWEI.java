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

public final class VkSubpassShadingPipelineCreateInfoHUAWEI
		implements Struct<VkSubpassShadingPipelineCreateInfoHUAWEI> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle RENDER_PASS_HANDLE;
	public static final VarHandle SUBPASS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long RENDER_PASS_BYTE_OFFSET;
	public static final long SUBPASS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("renderPass"),
		    JAVA_INT.withName("subpass"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkSubpassShadingPipelineCreateInfoHUAWEI").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		RENDER_PASS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("renderPass"));
		SUBPASS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subpass"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		RENDER_PASS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("renderPass"));
		SUBPASS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subpass"));
		//@formatter:on
	}

	public VkSubpassShadingPipelineCreateInfoHUAWEI() {
	    this(Arena.ofAuto());
	}
	
	public VkSubpassShadingPipelineCreateInfoHUAWEI(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkSubpassShadingPipelineCreateInfoHUAWEI(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkSubpassShadingPipelineCreateInfoHUAWEI sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSubpassShadingPipelineCreateInfoHUAWEI pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #renderPass()
    public VkSubpassShadingPipelineCreateInfoHUAWEI renderPass(VkRenderPass renderPass) {
    	RENDER_PASS_HANDLE.set(segment, 0L, renderPass.memorySegment());
    	return this;
    }
    
    public @Nullable VkRenderPass renderPass() {
    	MemorySegment segment = (MemorySegment) RENDER_PASS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkRenderPass(segment);
    }
    
    /// @see #subpass()
    public VkSubpassShadingPipelineCreateInfoHUAWEI subpass(int subpass) {
    	SUBPASS_HANDLE.set(segment, 0L, subpass);
    	return this;
    }
    
    public int subpass() {
    	return (int) SUBPASS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSubpassShadingPipelineCreateInfoHUAWEI set(VkSubpassShadingPipelineCreateInfoHUAWEI other) {
        return set(other.segment);
    }
    
    @Override
    public VkSubpassShadingPipelineCreateInfoHUAWEI set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSubpassShadingPipelineCreateInfoHUAWEI> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSubpassShadingPipelineCreateInfoHUAWEI> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSubpassShadingPipelineCreateInfoHUAWEI(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSubpassShadingPipelineCreateInfoHUAWEI> array(Arena arena, VkSubpassShadingPipelineCreateInfoHUAWEI... structs) {
        NativeStructArray<VkSubpassShadingPipelineCreateInfoHUAWEI> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSubpassShadingPipelineCreateInfoHUAWEI(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSubpassShadingPipelineCreateInfoHUAWEI> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSubpassShadingPipelineCreateInfoHUAWEI(segment)
        );
    }

}