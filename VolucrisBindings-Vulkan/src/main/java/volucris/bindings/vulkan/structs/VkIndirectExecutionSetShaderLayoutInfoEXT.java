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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkIndirectExecutionSetShaderLayoutInfoEXT
		implements Struct<VkIndirectExecutionSetShaderLayoutInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SET_LAYOUT_COUNT_HANDLE;
	public static final VarHandle P_SET_LAYOUTS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SET_LAYOUT_COUNT_BYTE_OFFSET;
	public static final long P_SET_LAYOUTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("setLayoutCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pSetLayouts")
		).withName("VkIndirectExecutionSetShaderLayoutInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SET_LAYOUT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("setLayoutCount"));
		P_SET_LAYOUTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSetLayouts"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SET_LAYOUT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("setLayoutCount"));
		P_SET_LAYOUTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSetLayouts"));
		//@formatter:on
	}

	public VkIndirectExecutionSetShaderLayoutInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkIndirectExecutionSetShaderLayoutInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkIndirectExecutionSetShaderLayoutInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkIndirectExecutionSetShaderLayoutInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkIndirectExecutionSetShaderLayoutInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #setLayoutCount()
    public VkIndirectExecutionSetShaderLayoutInfoEXT setLayoutCount(int setLayoutCount) {
    	SET_LAYOUT_COUNT_HANDLE.set(segment, 0L, setLayoutCount);
    	return this;
    }
    
    public int setLayoutCount() {
    	return (int) SET_LAYOUT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSetLayouts()
    public VkIndirectExecutionSetShaderLayoutInfoEXT pSetLayouts(NativePointerArray pSetLayouts) {
    	P_SET_LAYOUTS_HANDLE.set(segment, 0L, pSetLayouts.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pSetLayouts() {
    	MemorySegment segment = (MemorySegment) P_SET_LAYOUTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    @Override
    public VkIndirectExecutionSetShaderLayoutInfoEXT set(VkIndirectExecutionSetShaderLayoutInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkIndirectExecutionSetShaderLayoutInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkIndirectExecutionSetShaderLayoutInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkIndirectExecutionSetShaderLayoutInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectExecutionSetShaderLayoutInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkIndirectExecutionSetShaderLayoutInfoEXT> array(Arena arena, VkIndirectExecutionSetShaderLayoutInfoEXT... structs) {
        NativeStructArray<VkIndirectExecutionSetShaderLayoutInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectExecutionSetShaderLayoutInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkIndirectExecutionSetShaderLayoutInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkIndirectExecutionSetShaderLayoutInfoEXT(segment)
        );
    }

}