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

public final class VkGeometryNV
		implements Struct<VkGeometryNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle GEOMETRY_TYPE_HANDLE;
    public static final VarHandle FLAGS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long GEOMETRY_TYPE_BYTE_OFFSET;
    public static final long GEOMETRY_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkGeometryDataNV geometry;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("geometryType"),
            MemoryLayout.paddingLayout(4),
            VkGeometryDataNV.LAYOUT.withName("geometry"),
            JAVA_INT.withName("flags"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkGeometryNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        GEOMETRY_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("geometryType"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        GEOMETRY_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("geometryType"));
        GEOMETRY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("geometry"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        //@formatter:on
    }

    public VkGeometryNV() {
        this(Arena.ofAuto());
    }
    
    public VkGeometryNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkGeometryNV(MemorySegment segment) {
        this.segment = segment;
    
        geometry = new VkGeometryDataNV(segment.asSlice(GEOMETRY_BYTE_OFFSET, VkGeometryDataNV.LAYOUT));
    }

    /// @see #sType()
    public VkGeometryNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkGeometryNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #geometryType()
    public VkGeometryNV geometryType(int geometryType) {
    	GEOMETRY_TYPE_HANDLE.set(segment, 0L, geometryType);
    	return this;
    }
    
    public int geometryType() {
    	return (int) GEOMETRY_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VkGeometryNV flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #geometry()
    public VkGeometryNV geometry(Consumer<VkGeometryDataNV> consumer) {
    	consumer.accept(geometry);
    	return this;
    }
    
    /// @see #geometry()
    public VkGeometryNV geometry(VkGeometryDataNV other) {
    	geometry.set(other);
    	return this;
    }
    
    public VkGeometryDataNV geometry() {
    	return geometry;
    }
    
    @Override
    public VkGeometryNV set(VkGeometryNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkGeometryNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkGeometryNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkGeometryNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGeometryNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkGeometryNV> array(Arena arena, VkGeometryNV... structs) {
        NativeStructArray<VkGeometryNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGeometryNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkGeometryNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkGeometryNV(segment)
        );
    }
    
}