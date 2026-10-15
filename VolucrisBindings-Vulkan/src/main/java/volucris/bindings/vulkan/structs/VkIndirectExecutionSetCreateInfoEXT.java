/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkIndirectExecutionSetCreateInfoEXT
		implements Struct<VkIndirectExecutionSetCreateInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle TYPE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TYPE_BYTE_OFFSET;
	public static final long INFO_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkIndirectExecutionSetInfoEXT info;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("type"),
		    MemoryLayout.paddingLayout(4),
		    VkIndirectExecutionSetInfoEXT.LAYOUT.withName("info")
		).withName("VkIndirectExecutionSetCreateInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
		INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("info"));
		//@formatter:on
	}

	public VkIndirectExecutionSetCreateInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkIndirectExecutionSetCreateInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkIndirectExecutionSetCreateInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	    info = new VkIndirectExecutionSetInfoEXT(segment.asSlice(INFO_BYTE_OFFSET, VkIndirectExecutionSetInfoEXT.LAYOUT));
	}

    /// @see #sType()
    public VkIndirectExecutionSetCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkIndirectExecutionSetCreateInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #type()
    public VkIndirectExecutionSetCreateInfoEXT type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #info()
    public VkIndirectExecutionSetCreateInfoEXT info(Consumer<VkIndirectExecutionSetInfoEXT> consumer) {
    	consumer.accept(info);
    	return this;
    }
    
    /// @see #info()
    public VkIndirectExecutionSetCreateInfoEXT info(VkIndirectExecutionSetInfoEXT other) {
    	info.set(other);
    	return this;
    }
    
    public VkIndirectExecutionSetInfoEXT info() {
    	return info;
    }
    
    @Override
    public VkIndirectExecutionSetCreateInfoEXT set(VkIndirectExecutionSetCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkIndirectExecutionSetCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkIndirectExecutionSetCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkIndirectExecutionSetCreateInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectExecutionSetCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkIndirectExecutionSetCreateInfoEXT> array(Arena arena, VkIndirectExecutionSetCreateInfoEXT... structs) {
        NativeStructArray<VkIndirectExecutionSetCreateInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkIndirectExecutionSetCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkIndirectExecutionSetCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkIndirectExecutionSetCreateInfoEXT(segment)
        );
    }

}