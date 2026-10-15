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

public final class VkOpticalFlowSessionCreatePrivateDataInfoNV
		implements Struct<VkOpticalFlowSessionCreatePrivateDataInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ID_HANDLE;
	public static final VarHandle SIZE_HANDLE;
	public static final VarHandle P_PRIVATE_DATA_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ID_BYTE_OFFSET;
	public static final long SIZE_BYTE_OFFSET;
	public static final long P_PRIVATE_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("id"),
		    JAVA_INT.withName("size"),
		    UNBOUNDED_ADDRESS.withName("pPrivateData")
		).withName("VkOpticalFlowSessionCreatePrivateDataInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("id"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		P_PRIVATE_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPrivateData"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("id"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		P_PRIVATE_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPrivateData"));
		//@formatter:on
	}

	public VkOpticalFlowSessionCreatePrivateDataInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkOpticalFlowSessionCreatePrivateDataInfoNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkOpticalFlowSessionCreatePrivateDataInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkOpticalFlowSessionCreatePrivateDataInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkOpticalFlowSessionCreatePrivateDataInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #id()
    public VkOpticalFlowSessionCreatePrivateDataInfoNV id(int id) {
    	ID_HANDLE.set(segment, 0L, id);
    	return this;
    }
    
    public int id() {
    	return (int) ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkOpticalFlowSessionCreatePrivateDataInfoNV size(int size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public int size() {
    	return (int) SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPrivateData()
    public VkOpticalFlowSessionCreatePrivateDataInfoNV pPrivateData(MemorySegment pPrivateData) {
    	P_PRIVATE_DATA_HANDLE.set(segment, 0L, pPrivateData);
    	return this;
    }
    
    public @Nullable MemorySegment pPrivateData() {
    	MemorySegment segment = (MemorySegment) P_PRIVATE_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VkOpticalFlowSessionCreatePrivateDataInfoNV set(VkOpticalFlowSessionCreatePrivateDataInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkOpticalFlowSessionCreatePrivateDataInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkOpticalFlowSessionCreatePrivateDataInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkOpticalFlowSessionCreatePrivateDataInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkOpticalFlowSessionCreatePrivateDataInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkOpticalFlowSessionCreatePrivateDataInfoNV> array(Arena arena, VkOpticalFlowSessionCreatePrivateDataInfoNV... structs) {
        NativeStructArray<VkOpticalFlowSessionCreatePrivateDataInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkOpticalFlowSessionCreatePrivateDataInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkOpticalFlowSessionCreatePrivateDataInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkOpticalFlowSessionCreatePrivateDataInfoNV(segment)
        );
    }

}