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

public final class VkPipelineViewportStateCreateInfo
		implements Struct<VkPipelineViewportStateCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle VIEWPORT_COUNT_HANDLE;
	public static final VarHandle P_VIEWPORTS_HANDLE;
	public static final VarHandle SCISSOR_COUNT_HANDLE;
	public static final VarHandle P_SCISSORS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long VIEWPORT_COUNT_BYTE_OFFSET;
	public static final long P_VIEWPORTS_BYTE_OFFSET;
	public static final long SCISSOR_COUNT_BYTE_OFFSET;
	public static final long P_SCISSORS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("viewportCount"),
		    UNBOUNDED_ADDRESS.withName("pViewports"),
		    JAVA_INT.withName("scissorCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pScissors")
		).withName("VkPipelineViewportStateCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		VIEWPORT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("viewportCount"));
		P_VIEWPORTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pViewports"));
		SCISSOR_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("scissorCount"));
		P_SCISSORS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pScissors"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		VIEWPORT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("viewportCount"));
		P_VIEWPORTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pViewports"));
		SCISSOR_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("scissorCount"));
		P_SCISSORS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pScissors"));
		//@formatter:on
	}

	public VkPipelineViewportStateCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineViewportStateCreateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPipelineViewportStateCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineViewportStateCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineViewportStateCreateInfo pNext(MemorySegment pNext) {
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
    public VkPipelineViewportStateCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #viewportCount()
    public VkPipelineViewportStateCreateInfo viewportCount(int viewportCount) {
    	VIEWPORT_COUNT_HANDLE.set(segment, 0L, viewportCount);
    	return this;
    }
    
    public int viewportCount() {
    	return (int) VIEWPORT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pViewports()
    public VkPipelineViewportStateCreateInfo pViewports(NativeStructArray<VkViewport> pViewports) {
    	P_VIEWPORTS_HANDLE.set(segment, 0L, pViewports.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkViewport> pViewports() {
    	MemorySegment segment = (MemorySegment) P_VIEWPORTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkViewport.array(segment);
    }
    
    /// @see #scissorCount()
    public VkPipelineViewportStateCreateInfo scissorCount(int scissorCount) {
    	SCISSOR_COUNT_HANDLE.set(segment, 0L, scissorCount);
    	return this;
    }
    
    public int scissorCount() {
    	return (int) SCISSOR_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pScissors()
    public VkPipelineViewportStateCreateInfo pScissors(NativeStructArray<VkRect2D> pScissors) {
    	P_SCISSORS_HANDLE.set(segment, 0L, pScissors.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkRect2D> pScissors() {
    	MemorySegment segment = (MemorySegment) P_SCISSORS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkRect2D.array(segment);
    }
    
    @Override
    public VkPipelineViewportStateCreateInfo set(VkPipelineViewportStateCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineViewportStateCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineViewportStateCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineViewportStateCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineViewportStateCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineViewportStateCreateInfo> array(Arena arena, VkPipelineViewportStateCreateInfo... structs) {
        NativeStructArray<VkPipelineViewportStateCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineViewportStateCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineViewportStateCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineViewportStateCreateInfo(segment)
        );
    }

}