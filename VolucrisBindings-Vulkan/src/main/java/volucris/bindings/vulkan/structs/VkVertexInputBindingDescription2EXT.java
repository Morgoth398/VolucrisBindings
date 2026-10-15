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

public final class VkVertexInputBindingDescription2EXT
		implements Struct<VkVertexInputBindingDescription2EXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle BINDING_HANDLE;
	public static final VarHandle STRIDE_HANDLE;
	public static final VarHandle INPUT_RATE_HANDLE;
	public static final VarHandle DIVISOR_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long BINDING_BYTE_OFFSET;
	public static final long STRIDE_BYTE_OFFSET;
	public static final long INPUT_RATE_BYTE_OFFSET;
	public static final long DIVISOR_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("binding"),
		    JAVA_INT.withName("stride"),
		    JAVA_INT.withName("inputRate"),
		    JAVA_INT.withName("divisor")
		).withName("VkVertexInputBindingDescription2EXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		BINDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("binding"));
		STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stride"));
		INPUT_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inputRate"));
		DIVISOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("divisor"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		BINDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("binding"));
		STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stride"));
		INPUT_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inputRate"));
		DIVISOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("divisor"));
		//@formatter:on
	}

	public VkVertexInputBindingDescription2EXT() {
	    this(Arena.ofAuto());
	}
	
	public VkVertexInputBindingDescription2EXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVertexInputBindingDescription2EXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVertexInputBindingDescription2EXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVertexInputBindingDescription2EXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #binding()
    public VkVertexInputBindingDescription2EXT binding(int binding) {
    	BINDING_HANDLE.set(segment, 0L, binding);
    	return this;
    }
    
    public int binding() {
    	return (int) BINDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #stride()
    public VkVertexInputBindingDescription2EXT stride(int stride) {
    	STRIDE_HANDLE.set(segment, 0L, stride);
    	return this;
    }
    
    public int stride() {
    	return (int) STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #inputRate()
    public VkVertexInputBindingDescription2EXT inputRate(int inputRate) {
    	INPUT_RATE_HANDLE.set(segment, 0L, inputRate);
    	return this;
    }
    
    public int inputRate() {
    	return (int) INPUT_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #divisor()
    public VkVertexInputBindingDescription2EXT divisor(int divisor) {
    	DIVISOR_HANDLE.set(segment, 0L, divisor);
    	return this;
    }
    
    public int divisor() {
    	return (int) DIVISOR_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVertexInputBindingDescription2EXT set(VkVertexInputBindingDescription2EXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkVertexInputBindingDescription2EXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVertexInputBindingDescription2EXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVertexInputBindingDescription2EXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVertexInputBindingDescription2EXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVertexInputBindingDescription2EXT> array(Arena arena, VkVertexInputBindingDescription2EXT... structs) {
        NativeStructArray<VkVertexInputBindingDescription2EXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVertexInputBindingDescription2EXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVertexInputBindingDescription2EXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVertexInputBindingDescription2EXT(segment)
        );
    }

}