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

public final class VkVideoEncodeSessionIntraRefreshCreateInfoKHR
		implements Struct<VkVideoEncodeSessionIntraRefreshCreateInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle INTRA_REFRESH_MODE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long INTRA_REFRESH_MODE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("intraRefreshMode"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkVideoEncodeSessionIntraRefreshCreateInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		INTRA_REFRESH_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("intraRefreshMode"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		INTRA_REFRESH_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("intraRefreshMode"));
		//@formatter:on
	}

	public VkVideoEncodeSessionIntraRefreshCreateInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeSessionIntraRefreshCreateInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoEncodeSessionIntraRefreshCreateInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #intraRefreshMode()
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR intraRefreshMode(int intraRefreshMode) {
    	INTRA_REFRESH_MODE_HANDLE.set(segment, 0L, intraRefreshMode);
    	return this;
    }
    
    public int intraRefreshMode() {
    	return (int) INTRA_REFRESH_MODE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR set(VkVideoEncodeSessionIntraRefreshCreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeSessionIntraRefreshCreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeSessionIntraRefreshCreateInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeSessionIntraRefreshCreateInfoKHR> array(Arena arena, VkVideoEncodeSessionIntraRefreshCreateInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeSessionIntraRefreshCreateInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeSessionIntraRefreshCreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(segment)
        );
    }

}