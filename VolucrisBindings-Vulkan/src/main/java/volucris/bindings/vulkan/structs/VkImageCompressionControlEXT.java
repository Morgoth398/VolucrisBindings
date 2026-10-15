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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkImageCompressionControlEXT
		implements Struct<VkImageCompressionControlEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle COMPRESSION_CONTROL_PLANE_COUNT_HANDLE;
	public static final VarHandle P_FIXED_RATE_FLAGS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long COMPRESSION_CONTROL_PLANE_COUNT_BYTE_OFFSET;
	public static final long P_FIXED_RATE_FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("compressionControlPlaneCount"),
		    UNBOUNDED_ADDRESS.withName("pFixedRateFlags")
		).withName("VkImageCompressionControlEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		COMPRESSION_CONTROL_PLANE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("compressionControlPlaneCount"));
		P_FIXED_RATE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pFixedRateFlags"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		COMPRESSION_CONTROL_PLANE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("compressionControlPlaneCount"));
		P_FIXED_RATE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pFixedRateFlags"));
		//@formatter:on
	}

	public VkImageCompressionControlEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkImageCompressionControlEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkImageCompressionControlEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkImageCompressionControlEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImageCompressionControlEXT pNext(MemorySegment pNext) {
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
    public VkImageCompressionControlEXT flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #compressionControlPlaneCount()
    public VkImageCompressionControlEXT compressionControlPlaneCount(int compressionControlPlaneCount) {
    	COMPRESSION_CONTROL_PLANE_COUNT_HANDLE.set(segment, 0L, compressionControlPlaneCount);
    	return this;
    }
    
    public int compressionControlPlaneCount() {
    	return (int) COMPRESSION_CONTROL_PLANE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pFixedRateFlags()
    public VkImageCompressionControlEXT pFixedRateFlags(NativeIntArray pFixedRateFlags) {
    	P_FIXED_RATE_FLAGS_HANDLE.set(segment, 0L, pFixedRateFlags.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pFixedRateFlags() {
    	MemorySegment segment = (MemorySegment) P_FIXED_RATE_FLAGS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkImageCompressionControlEXT set(VkImageCompressionControlEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageCompressionControlEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageCompressionControlEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageCompressionControlEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageCompressionControlEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageCompressionControlEXT> array(Arena arena, VkImageCompressionControlEXT... structs) {
        NativeStructArray<VkImageCompressionControlEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageCompressionControlEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageCompressionControlEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageCompressionControlEXT(segment)
        );
    }

}