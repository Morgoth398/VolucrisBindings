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

public final class VkAabbPositionsKHR
		implements Struct<VkAabbPositionsKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MIN_X_HANDLE;
    public static final VarHandle MIN_Y_HANDLE;
    public static final VarHandle MIN_Z_HANDLE;
    public static final VarHandle MAX_X_HANDLE;
    public static final VarHandle MAX_Y_HANDLE;
    public static final VarHandle MAX_Z_HANDLE;

    public static final long MIN_X_BYTE_OFFSET;
    public static final long MIN_Y_BYTE_OFFSET;
    public static final long MIN_Z_BYTE_OFFSET;
    public static final long MAX_X_BYTE_OFFSET;
    public static final long MAX_Y_BYTE_OFFSET;
    public static final long MAX_Z_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("minX"),
            JAVA_FLOAT.withName("minY"),
            JAVA_FLOAT.withName("minZ"),
            JAVA_FLOAT.withName("maxX"),
            JAVA_FLOAT.withName("maxY"),
            JAVA_FLOAT.withName("maxZ")
        ).withName("VkAabbPositionsKHR").withByteAlignment(4);
        
        MIN_X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minX"));
        MIN_Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minY"));
        MIN_Z_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minZ"));
        MAX_X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxX"));
        MAX_Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxY"));
        MAX_Z_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxZ"));
        
        MIN_X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minX"));
        MIN_Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minY"));
        MIN_Z_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minZ"));
        MAX_X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxX"));
        MAX_Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxY"));
        MAX_Z_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxZ"));
        //@formatter:on
    }

    public VkAabbPositionsKHR() {
        this(Arena.ofAuto());
    }
    
    public VkAabbPositionsKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkAabbPositionsKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #minX()
    public VkAabbPositionsKHR minX(float minX) {
    	MIN_X_HANDLE.set(segment, 0L, minX);
    	return this;
    }
    
    public float minX() {
    	return (float) MIN_X_HANDLE.get(segment, 0L);
    }
    
    /// @see #minY()
    public VkAabbPositionsKHR minY(float minY) {
    	MIN_Y_HANDLE.set(segment, 0L, minY);
    	return this;
    }
    
    public float minY() {
    	return (float) MIN_Y_HANDLE.get(segment, 0L);
    }
    
    /// @see #minZ()
    public VkAabbPositionsKHR minZ(float minZ) {
    	MIN_Z_HANDLE.set(segment, 0L, minZ);
    	return this;
    }
    
    public float minZ() {
    	return (float) MIN_Z_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxX()
    public VkAabbPositionsKHR maxX(float maxX) {
    	MAX_X_HANDLE.set(segment, 0L, maxX);
    	return this;
    }
    
    public float maxX() {
    	return (float) MAX_X_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxY()
    public VkAabbPositionsKHR maxY(float maxY) {
    	MAX_Y_HANDLE.set(segment, 0L, maxY);
    	return this;
    }
    
    public float maxY() {
    	return (float) MAX_Y_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxZ()
    public VkAabbPositionsKHR maxZ(float maxZ) {
    	MAX_Z_HANDLE.set(segment, 0L, maxZ);
    	return this;
    }
    
    public float maxZ() {
    	return (float) MAX_Z_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkAabbPositionsKHR set(VkAabbPositionsKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkAabbPositionsKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAabbPositionsKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAabbPositionsKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAabbPositionsKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAabbPositionsKHR> array(Arena arena, VkAabbPositionsKHR... structs) {
        NativeStructArray<VkAabbPositionsKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAabbPositionsKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAabbPositionsKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAabbPositionsKHR(segment)
        );
    }
    
}