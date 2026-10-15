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

public final class VkVideoEncodeUsageInfoKHR
		implements Struct<VkVideoEncodeUsageInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle VIDEO_USAGE_HINTS_HANDLE;
	public static final VarHandle VIDEO_CONTENT_HINTS_HANDLE;
	public static final VarHandle TUNING_MODE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long VIDEO_USAGE_HINTS_BYTE_OFFSET;
	public static final long VIDEO_CONTENT_HINTS_BYTE_OFFSET;
	public static final long TUNING_MODE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("videoUsageHints"),
		    JAVA_INT.withName("videoContentHints"),
		    JAVA_INT.withName("tuningMode"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkVideoEncodeUsageInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		VIDEO_USAGE_HINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("videoUsageHints"));
		VIDEO_CONTENT_HINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("videoContentHints"));
		TUNING_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tuningMode"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		VIDEO_USAGE_HINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("videoUsageHints"));
		VIDEO_CONTENT_HINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("videoContentHints"));
		TUNING_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tuningMode"));
		//@formatter:on
	}

	public VkVideoEncodeUsageInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeUsageInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoEncodeUsageInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeUsageInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeUsageInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #videoUsageHints()
    public VkVideoEncodeUsageInfoKHR videoUsageHints(int videoUsageHints) {
    	VIDEO_USAGE_HINTS_HANDLE.set(segment, 0L, videoUsageHints);
    	return this;
    }
    
    public int videoUsageHints() {
    	return (int) VIDEO_USAGE_HINTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #videoContentHints()
    public VkVideoEncodeUsageInfoKHR videoContentHints(int videoContentHints) {
    	VIDEO_CONTENT_HINTS_HANDLE.set(segment, 0L, videoContentHints);
    	return this;
    }
    
    public int videoContentHints() {
    	return (int) VIDEO_CONTENT_HINTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #tuningMode()
    public VkVideoEncodeUsageInfoKHR tuningMode(int tuningMode) {
    	TUNING_MODE_HANDLE.set(segment, 0L, tuningMode);
    	return this;
    }
    
    public int tuningMode() {
    	return (int) TUNING_MODE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeUsageInfoKHR set(VkVideoEncodeUsageInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeUsageInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeUsageInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeUsageInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeUsageInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeUsageInfoKHR> array(Arena arena, VkVideoEncodeUsageInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeUsageInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeUsageInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeUsageInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeUsageInfoKHR(segment)
        );
    }

}