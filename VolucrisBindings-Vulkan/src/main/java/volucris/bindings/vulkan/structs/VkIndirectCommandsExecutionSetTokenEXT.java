/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkIndirectCommandsExecutionSetTokenEXT
		implements Struct<VkIndirectCommandsExecutionSetTokenEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle TYPE_HANDLE;
	public static final VarHandle SHADER_STAGES_HANDLE;

	public static final long TYPE_BYTE_OFFSET;
	public static final long SHADER_STAGES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("type"),
		    JAVA_INT.withName("shaderStages")
		).withName("VkIndirectCommandsExecutionSetTokenEXT").withByteAlignment(4);
		
		TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
		SHADER_STAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStages"));
		
		TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
		SHADER_STAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStages"));
		//@formatter:on
	}

	public VkIndirectCommandsExecutionSetTokenEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkIndirectCommandsExecutionSetTokenEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkIndirectCommandsExecutionSetTokenEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #type()
    public VkIndirectCommandsExecutionSetTokenEXT type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStages()
    public VkIndirectCommandsExecutionSetTokenEXT shaderStages(int shaderStages) {
    	SHADER_STAGES_HANDLE.set(segment, 0L, shaderStages);
    	return this;
    }
    
    public int shaderStages() {
    	return (int) SHADER_STAGES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkIndirectCommandsExecutionSetTokenEXT set(VkIndirectCommandsExecutionSetTokenEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkIndirectCommandsExecutionSetTokenEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkIndirectCommandsExecutionSetTokenEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkIndirectCommandsExecutionSetTokenEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkIndirectCommandsExecutionSetTokenEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkIndirectCommandsExecutionSetTokenEXT> array(SegmentAllocator allocator, VkIndirectCommandsExecutionSetTokenEXT... structs) {
        NativeStructArray<VkIndirectCommandsExecutionSetTokenEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkIndirectCommandsExecutionSetTokenEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkIndirectCommandsExecutionSetTokenEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkIndirectCommandsExecutionSetTokenEXT(segment)
        );
    }

}