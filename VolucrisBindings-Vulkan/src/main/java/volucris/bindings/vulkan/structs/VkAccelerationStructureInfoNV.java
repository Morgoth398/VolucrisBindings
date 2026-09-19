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

public final class VkAccelerationStructureInfoNV
		implements Struct<VkAccelerationStructureInfoNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle TYPE_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle INSTANCE_COUNT_HANDLE;
    public static final VarHandle GEOMETRY_COUNT_HANDLE;
    public static final VarHandle P_GEOMETRIES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long TYPE_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long INSTANCE_COUNT_BYTE_OFFSET;
    public static final long GEOMETRY_COUNT_BYTE_OFFSET;
    public static final long P_GEOMETRIES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("type"),
            JAVA_INT.withName("flags"),
            JAVA_INT.withName("instanceCount"),
            JAVA_INT.withName("geometryCount"),
            UNBOUNDED_ADDRESS.withName("pGeometries")
        ).withName("VkAccelerationStructureInfoNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        INSTANCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("instanceCount"));
        GEOMETRY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("geometryCount"));
        P_GEOMETRIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pGeometries"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        INSTANCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("instanceCount"));
        GEOMETRY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("geometryCount"));
        P_GEOMETRIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pGeometries"));
        //@formatter:on
    }

    public VkAccelerationStructureInfoNV() {
        this(Arena.ofAuto());
    }
    
    public VkAccelerationStructureInfoNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkAccelerationStructureInfoNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkAccelerationStructureInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAccelerationStructureInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #type()
    public VkAccelerationStructureInfoNV type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VkAccelerationStructureInfoNV flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #instanceCount()
    public VkAccelerationStructureInfoNV instanceCount(int instanceCount) {
    	INSTANCE_COUNT_HANDLE.set(segment, 0L, instanceCount);
    	return this;
    }
    
    public int instanceCount() {
    	return (int) INSTANCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #geometryCount()
    public VkAccelerationStructureInfoNV geometryCount(int geometryCount) {
    	GEOMETRY_COUNT_HANDLE.set(segment, 0L, geometryCount);
    	return this;
    }
    
    public int geometryCount() {
    	return (int) GEOMETRY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pGeometries()
    public VkAccelerationStructureInfoNV pGeometries(NativeStructArray<VkGeometryNV> pGeometries) {
    	P_GEOMETRIES_HANDLE.set(segment, 0L, pGeometries.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkGeometryNV> pGeometries() {
    	MemorySegment segment = (MemorySegment) P_GEOMETRIES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkGeometryNV.array(segment);
    }
    
    @Override
    public VkAccelerationStructureInfoNV set(VkAccelerationStructureInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureInfoNV> array(Arena arena, VkAccelerationStructureInfoNV... structs) {
        NativeStructArray<VkAccelerationStructureInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureInfoNV(segment)
        );
    }
    
}