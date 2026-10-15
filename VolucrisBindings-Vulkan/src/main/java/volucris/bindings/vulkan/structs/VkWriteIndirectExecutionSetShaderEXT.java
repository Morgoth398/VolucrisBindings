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

public final class VkWriteIndirectExecutionSetShaderEXT
		implements Struct<VkWriteIndirectExecutionSetShaderEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle INDEX_HANDLE;
	public static final VarHandle SHADER_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long INDEX_BYTE_OFFSET;
	public static final long SHADER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("index"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("shader")
		).withName("VkWriteIndirectExecutionSetShaderEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("index"));
		SHADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shader"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("index"));
		SHADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shader"));
		//@formatter:on
	}

	public VkWriteIndirectExecutionSetShaderEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkWriteIndirectExecutionSetShaderEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkWriteIndirectExecutionSetShaderEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkWriteIndirectExecutionSetShaderEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkWriteIndirectExecutionSetShaderEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #index()
    public VkWriteIndirectExecutionSetShaderEXT index(int index) {
    	INDEX_HANDLE.set(segment, 0L, index);
    	return this;
    }
    
    public int index() {
    	return (int) INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #shader()
    public VkWriteIndirectExecutionSetShaderEXT shader(VkShaderEXT shader) {
    	SHADER_HANDLE.set(segment, 0L, shader.memorySegment());
    	return this;
    }
    
    public @Nullable VkShaderEXT shader() {
    	MemorySegment segment = (MemorySegment) SHADER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkShaderEXT(segment);
    }
    
    @Override
    public VkWriteIndirectExecutionSetShaderEXT set(VkWriteIndirectExecutionSetShaderEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkWriteIndirectExecutionSetShaderEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkWriteIndirectExecutionSetShaderEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkWriteIndirectExecutionSetShaderEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkWriteIndirectExecutionSetShaderEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkWriteIndirectExecutionSetShaderEXT> array(Arena arena, VkWriteIndirectExecutionSetShaderEXT... structs) {
        NativeStructArray<VkWriteIndirectExecutionSetShaderEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkWriteIndirectExecutionSetShaderEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkWriteIndirectExecutionSetShaderEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkWriteIndirectExecutionSetShaderEXT(segment)
        );
    }

}