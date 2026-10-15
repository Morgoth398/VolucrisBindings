/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkGeometryDataNV
		implements Struct<VkGeometryDataNV> {

	public static final StructLayout LAYOUT;

	public static final long TRIANGLES_BYTE_OFFSET;
	public static final long AABBS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkGeometryTrianglesNV triangles;
	private final VkGeometryAABBNV aabbs;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    VkGeometryTrianglesNV.LAYOUT.withName("triangles"),
		    VkGeometryAABBNV.LAYOUT.withName("aabbs")
		).withName("VkGeometryDataNV").withByteAlignment(8);
		
		TRIANGLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangles"));
		AABBS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aabbs"));
		//@formatter:on
	}

	public VkGeometryDataNV() {
	    this(Arena.ofAuto());
	}
	
	public VkGeometryDataNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkGeometryDataNV(MemorySegment segment) {
	    this.segment = segment;
	
	    triangles = new VkGeometryTrianglesNV(segment.asSlice(TRIANGLES_BYTE_OFFSET, VkGeometryTrianglesNV.LAYOUT));
	    aabbs = new VkGeometryAABBNV(segment.asSlice(AABBS_BYTE_OFFSET, VkGeometryAABBNV.LAYOUT));
	}

    /// @see #triangles()
    public VkGeometryDataNV triangles(Consumer<VkGeometryTrianglesNV> consumer) {
    	consumer.accept(triangles);
    	return this;
    }
    
    /// @see #triangles()
    public VkGeometryDataNV triangles(VkGeometryTrianglesNV other) {
    	triangles.set(other);
    	return this;
    }
    
    public VkGeometryTrianglesNV triangles() {
    	return triangles;
    }
    
    /// @see #aabbs()
    public VkGeometryDataNV aabbs(Consumer<VkGeometryAABBNV> consumer) {
    	consumer.accept(aabbs);
    	return this;
    }
    
    /// @see #aabbs()
    public VkGeometryDataNV aabbs(VkGeometryAABBNV other) {
    	aabbs.set(other);
    	return this;
    }
    
    public VkGeometryAABBNV aabbs() {
    	return aabbs;
    }
    
    @Override
    public VkGeometryDataNV set(VkGeometryDataNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkGeometryDataNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkGeometryDataNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkGeometryDataNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGeometryDataNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkGeometryDataNV> array(Arena arena, VkGeometryDataNV... structs) {
        NativeStructArray<VkGeometryDataNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGeometryDataNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkGeometryDataNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkGeometryDataNV(segment)
        );
    }

}