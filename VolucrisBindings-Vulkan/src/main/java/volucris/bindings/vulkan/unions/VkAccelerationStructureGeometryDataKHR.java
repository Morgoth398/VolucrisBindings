/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.unions;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.UnionLayout;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.structs.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkAccelerationStructureGeometryDataKHR
		implements Struct<VkAccelerationStructureGeometryDataKHR> {

    public static final UnionLayout LAYOUT;

    public static final long TRIANGLES_BYTE_OFFSET;
    public static final long AABBS_BYTE_OFFSET;
    public static final long INSTANCES_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkAccelerationStructureGeometryTrianglesDataKHR triangles;
    private final VkAccelerationStructureGeometryAabbsDataKHR aabbs;
    private final VkAccelerationStructureGeometryInstancesDataKHR instances;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.unionLayout(
            VkAccelerationStructureGeometryTrianglesDataKHR.LAYOUT.withName("triangles"),
            VkAccelerationStructureGeometryAabbsDataKHR.LAYOUT.withName("aabbs"),
            VkAccelerationStructureGeometryInstancesDataKHR.LAYOUT.withName("instances")
        ).withName("VkAccelerationStructureGeometryDataKHR").withByteAlignment(8);
        
        TRIANGLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangles"));
        AABBS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aabbs"));
        INSTANCES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("instances"));
        //@formatter:on
    }

    public VkAccelerationStructureGeometryDataKHR() {
        this(Arena.ofAuto());
    }
    
    public VkAccelerationStructureGeometryDataKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkAccelerationStructureGeometryDataKHR(MemorySegment segment) {
        this.segment = segment;
    
        triangles = new VkAccelerationStructureGeometryTrianglesDataKHR(segment.asSlice(TRIANGLES_BYTE_OFFSET, VkAccelerationStructureGeometryTrianglesDataKHR.LAYOUT));
        aabbs = new VkAccelerationStructureGeometryAabbsDataKHR(segment.asSlice(AABBS_BYTE_OFFSET, VkAccelerationStructureGeometryAabbsDataKHR.LAYOUT));
        instances = new VkAccelerationStructureGeometryInstancesDataKHR(segment.asSlice(INSTANCES_BYTE_OFFSET, VkAccelerationStructureGeometryInstancesDataKHR.LAYOUT));
    }

    /// @see #triangles()
    public VkAccelerationStructureGeometryDataKHR triangles(Consumer<VkAccelerationStructureGeometryTrianglesDataKHR> consumer) {
    	consumer.accept(triangles);
    	return this;
    }
    
    /// @see #triangles()
    public VkAccelerationStructureGeometryDataKHR triangles(VkAccelerationStructureGeometryTrianglesDataKHR other) {
    	triangles.set(other);
    	return this;
    }
    
    public VkAccelerationStructureGeometryTrianglesDataKHR triangles() {
    	return triangles;
    }
    
    /// @see #aabbs()
    public VkAccelerationStructureGeometryDataKHR aabbs(Consumer<VkAccelerationStructureGeometryAabbsDataKHR> consumer) {
    	consumer.accept(aabbs);
    	return this;
    }
    
    /// @see #aabbs()
    public VkAccelerationStructureGeometryDataKHR aabbs(VkAccelerationStructureGeometryAabbsDataKHR other) {
    	aabbs.set(other);
    	return this;
    }
    
    public VkAccelerationStructureGeometryAabbsDataKHR aabbs() {
    	return aabbs;
    }
    
    /// @see #instances()
    public VkAccelerationStructureGeometryDataKHR instances(Consumer<VkAccelerationStructureGeometryInstancesDataKHR> consumer) {
    	consumer.accept(instances);
    	return this;
    }
    
    /// @see #instances()
    public VkAccelerationStructureGeometryDataKHR instances(VkAccelerationStructureGeometryInstancesDataKHR other) {
    	instances.set(other);
    	return this;
    }
    
    public VkAccelerationStructureGeometryInstancesDataKHR instances() {
    	return instances;
    }
    
    @Override
    public VkAccelerationStructureGeometryDataKHR set(VkAccelerationStructureGeometryDataKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureGeometryDataKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureGeometryDataKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryDataKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryDataKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryDataKHR> array(Arena arena, VkAccelerationStructureGeometryDataKHR... structs) {
        NativeStructArray<VkAccelerationStructureGeometryDataKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryDataKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureGeometryDataKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureGeometryDataKHR(segment)
        );
    }
    
}