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

public final class VkTensorViewCreateInfoARM
		implements Struct<VkTensorViewCreateInfoARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle TENSOR_HANDLE;
	public static final VarHandle FORMAT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long TENSOR_BYTE_OFFSET;
	public static final long FORMAT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("flags"),
		    UNBOUNDED_ADDRESS.withName("tensor"),
		    JAVA_INT.withName("format"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkTensorViewCreateInfoARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		TENSOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tensor"));
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		TENSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tensor"));
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		//@formatter:on
	}

	public VkTensorViewCreateInfoARM() {
	    this(Arena.ofAuto());
	}
	
	public VkTensorViewCreateInfoARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkTensorViewCreateInfoARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkTensorViewCreateInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkTensorViewCreateInfoARM pNext(MemorySegment pNext) {
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
    public VkTensorViewCreateInfoARM flags(long flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public long flags() {
    	return (long) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #tensor()
    public VkTensorViewCreateInfoARM tensor(VkTensorARM tensor) {
    	TENSOR_HANDLE.set(segment, 0L, tensor.memorySegment());
    	return this;
    }
    
    public @Nullable VkTensorARM tensor() {
    	MemorySegment segment = (MemorySegment) TENSOR_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkTensorARM(segment);
    }
    
    /// @see #format()
    public VkTensorViewCreateInfoARM format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkTensorViewCreateInfoARM set(VkTensorViewCreateInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkTensorViewCreateInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkTensorViewCreateInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkTensorViewCreateInfoARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkTensorViewCreateInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkTensorViewCreateInfoARM> array(Arena arena, VkTensorViewCreateInfoARM... structs) {
        NativeStructArray<VkTensorViewCreateInfoARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkTensorViewCreateInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkTensorViewCreateInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkTensorViewCreateInfoARM(segment)
        );
    }

}