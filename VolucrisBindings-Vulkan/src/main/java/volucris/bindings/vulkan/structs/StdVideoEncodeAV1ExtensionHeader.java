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

public final class StdVideoEncodeAV1ExtensionHeader
		implements Struct<StdVideoEncodeAV1ExtensionHeader> {

    public static final StructLayout LAYOUT;

    public static final VarHandle TEMPORAL_ID_HANDLE;
    public static final VarHandle SPATIAL_ID_HANDLE;

    public static final long TEMPORAL_ID_BYTE_OFFSET;
    public static final long SPATIAL_ID_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_BYTE.withName("temporal_id"),
            JAVA_BYTE.withName("spatial_id")
        ).withName("StdVideoEncodeAV1ExtensionHeader").withByteAlignment(1);
        
        TEMPORAL_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("temporal_id"));
        SPATIAL_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("spatial_id"));
        
        TEMPORAL_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("temporal_id"));
        SPATIAL_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("spatial_id"));
        //@formatter:on
    }

    public StdVideoEncodeAV1ExtensionHeader() {
        this(Arena.ofAuto());
    }
    
    public StdVideoEncodeAV1ExtensionHeader(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoEncodeAV1ExtensionHeader(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #temporal_id()
    public StdVideoEncodeAV1ExtensionHeader temporal_id(byte temporal_id) {
    	TEMPORAL_ID_HANDLE.set(segment, 0L, temporal_id);
    	return this;
    }
    
    public byte temporal_id() {
    	return (byte) TEMPORAL_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #spatial_id()
    public StdVideoEncodeAV1ExtensionHeader spatial_id(byte spatial_id) {
    	SPATIAL_ID_HANDLE.set(segment, 0L, spatial_id);
    	return this;
    }
    
    public byte spatial_id() {
    	return (byte) SPATIAL_ID_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoEncodeAV1ExtensionHeader set(StdVideoEncodeAV1ExtensionHeader other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeAV1ExtensionHeader set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeAV1ExtensionHeader> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeAV1ExtensionHeader> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeAV1ExtensionHeader(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeAV1ExtensionHeader> array(Arena arena, StdVideoEncodeAV1ExtensionHeader... structs) {
        NativeStructArray<StdVideoEncodeAV1ExtensionHeader> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeAV1ExtensionHeader(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeAV1ExtensionHeader> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeAV1ExtensionHeader(segment)
        );
    }
    
}