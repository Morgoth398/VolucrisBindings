/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkPushConstantRange
		implements Struct<VkPushConstantRange> {

	public static final StructLayout LAYOUT;

	public static final VarHandle STAGE_FLAGS_HANDLE;
	public static final VarHandle OFFSET_HANDLE;
	public static final VarHandle SIZE_HANDLE;

	public static final long STAGE_FLAGS_BYTE_OFFSET;
	public static final long OFFSET_BYTE_OFFSET;
	public static final long SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("stageFlags"),
		    JAVA_INT.withName("offset"),
		    JAVA_INT.withName("size")
		).withName("VkPushConstantRange").withByteAlignment(4);
		
		STAGE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stageFlags"));
		OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		
		STAGE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stageFlags"));
		OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		//@formatter:on
	}

	public VkPushConstantRange() {
	    this(Arena.ofAuto());
	}
	
	public VkPushConstantRange(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPushConstantRange(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #stageFlags()
    public VkPushConstantRange stageFlags(int stageFlags) {
    	STAGE_FLAGS_HANDLE.set(segment, 0L, stageFlags);
    	return this;
    }
    
    public int stageFlags() {
    	return (int) STAGE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #offset()
    public VkPushConstantRange offset(int offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public int offset() {
    	return (int) OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkPushConstantRange size(int size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public int size() {
    	return (int) SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPushConstantRange set(VkPushConstantRange other) {
        return set(other.segment);
    }
    
    @Override
    public VkPushConstantRange set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPushConstantRange> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPushConstantRange> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPushConstantRange(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPushConstantRange> array(Arena arena, VkPushConstantRange... structs) {
        NativeStructArray<VkPushConstantRange> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPushConstantRange(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPushConstantRange> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPushConstantRange(segment)
        );
    }

}