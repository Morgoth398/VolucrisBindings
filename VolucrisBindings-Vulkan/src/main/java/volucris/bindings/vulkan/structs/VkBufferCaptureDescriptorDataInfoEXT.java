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

public final class VkBufferCaptureDescriptorDataInfoEXT
		implements Struct<VkBufferCaptureDescriptorDataInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle BUFFER_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long BUFFER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("buffer")
		).withName("VkBufferCaptureDescriptorDataInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("buffer"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
		//@formatter:on
	}

	public VkBufferCaptureDescriptorDataInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkBufferCaptureDescriptorDataInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkBufferCaptureDescriptorDataInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkBufferCaptureDescriptorDataInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBufferCaptureDescriptorDataInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #buffer()
    public VkBufferCaptureDescriptorDataInfoEXT buffer(VkBuffer buffer) {
    	BUFFER_HANDLE.set(segment, 0L, buffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkBuffer buffer() {
    	MemorySegment segment = (MemorySegment) BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkBuffer(segment);
    }
    
    @Override
    public VkBufferCaptureDescriptorDataInfoEXT set(VkBufferCaptureDescriptorDataInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkBufferCaptureDescriptorDataInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBufferCaptureDescriptorDataInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBufferCaptureDescriptorDataInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBufferCaptureDescriptorDataInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBufferCaptureDescriptorDataInfoEXT> array(Arena arena, VkBufferCaptureDescriptorDataInfoEXT... structs) {
        NativeStructArray<VkBufferCaptureDescriptorDataInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBufferCaptureDescriptorDataInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBufferCaptureDescriptorDataInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBufferCaptureDescriptorDataInfoEXT(segment)
        );
    }

}