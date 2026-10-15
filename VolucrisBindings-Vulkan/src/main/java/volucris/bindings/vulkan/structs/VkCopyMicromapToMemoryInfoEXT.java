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

public final class VkCopyMicromapToMemoryInfoEXT
		implements Struct<VkCopyMicromapToMemoryInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SRC_HANDLE;
	public static final VarHandle MODE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SRC_BYTE_OFFSET;
	public static final long DST_BYTE_OFFSET;
	public static final long MODE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkDeviceOrHostAddressKHR dst;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("src"),
		    VkDeviceOrHostAddressKHR.LAYOUT.withName("dst"),
		    JAVA_INT.withName("mode"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkCopyMicromapToMemoryInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SRC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("src"));
		MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mode"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SRC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("src"));
		DST_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dst"));
		MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mode"));
		//@formatter:on
	}

	public VkCopyMicromapToMemoryInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkCopyMicromapToMemoryInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkCopyMicromapToMemoryInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	    dst = new VkDeviceOrHostAddressKHR(segment.asSlice(DST_BYTE_OFFSET, VkDeviceOrHostAddressKHR.LAYOUT));
	}

    /// @see #sType()
    public VkCopyMicromapToMemoryInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCopyMicromapToMemoryInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #src()
    public VkCopyMicromapToMemoryInfoEXT src(VkMicromapEXT src) {
    	SRC_HANDLE.set(segment, 0L, src.memorySegment());
    	return this;
    }
    
    public @Nullable VkMicromapEXT src() {
    	MemorySegment segment = (MemorySegment) SRC_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkMicromapEXT(segment);
    }
    
    /// @see #dst()
    public VkCopyMicromapToMemoryInfoEXT dst(Consumer<VkDeviceOrHostAddressKHR> consumer) {
    	consumer.accept(dst);
    	return this;
    }
    
    /// @see #dst()
    public VkCopyMicromapToMemoryInfoEXT dst(VkDeviceOrHostAddressKHR other) {
    	dst.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressKHR dst() {
    	return dst;
    }
    
    /// @see #mode()
    public VkCopyMicromapToMemoryInfoEXT mode(int mode) {
    	MODE_HANDLE.set(segment, 0L, mode);
    	return this;
    }
    
    public int mode() {
    	return (int) MODE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkCopyMicromapToMemoryInfoEXT set(VkCopyMicromapToMemoryInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkCopyMicromapToMemoryInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCopyMicromapToMemoryInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCopyMicromapToMemoryInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCopyMicromapToMemoryInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCopyMicromapToMemoryInfoEXT> array(Arena arena, VkCopyMicromapToMemoryInfoEXT... structs) {
        NativeStructArray<VkCopyMicromapToMemoryInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCopyMicromapToMemoryInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCopyMicromapToMemoryInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCopyMicromapToMemoryInfoEXT(segment)
        );
    }

}