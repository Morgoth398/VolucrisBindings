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

public final class StdVideoAV1GlobalMotion
		implements Struct<StdVideoAV1GlobalMotion> {

    public static final StructLayout LAYOUT;

    public static final VarHandle GM_TYPE_HANDLE;
    public static final VarHandle GM_PARAMS_HANDLE;

    public static final long GM_TYPE_BYTE_OFFSET;
    public static final long GM_PARAMS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("GmType"),
            MemoryLayout.sequenceLayout(8, MemoryLayout.sequenceLayout(6, JAVA_INT)).withName("gm_params")
        ).withName("StdVideoAV1GlobalMotion").withByteAlignment(4);
        
        GM_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("GmType"), PathElement.sequenceElement());
        GM_PARAMS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gm_params"), PathElement.sequenceElement(), PathElement.sequenceElement());
        
        GM_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("GmType"));
        GM_PARAMS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gm_params"));
        //@formatter:on
    }

    public StdVideoAV1GlobalMotion() {
        this(Arena.ofAuto());
    }
    
    public StdVideoAV1GlobalMotion(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoAV1GlobalMotion(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #gmType(int)
    public StdVideoAV1GlobalMotion gmType(byte gmType, int index0) {
    	GM_TYPE_HANDLE.set(segment, 0L, index0, gmType);
    	return this;
    }
    
    public byte gmType(int index0) {
    	return (byte) GM_TYPE_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #gm_params(int, int)
    public StdVideoAV1GlobalMotion gm_params(int gm_params, int index0, int index1) {
    	GM_PARAMS_HANDLE.set(segment, 0L, index0, index1, gm_params);
    	return this;
    }
    
    public int gm_params(int index0, int index1) {
    	return (int) GM_PARAMS_HANDLE.get(segment, 0L, index0, index1);
    }
    
    @Override
    public StdVideoAV1GlobalMotion set(StdVideoAV1GlobalMotion other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoAV1GlobalMotion set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoAV1GlobalMotion> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoAV1GlobalMotion> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoAV1GlobalMotion(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoAV1GlobalMotion> array(Arena arena, StdVideoAV1GlobalMotion... structs) {
        NativeStructArray<StdVideoAV1GlobalMotion> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoAV1GlobalMotion(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoAV1GlobalMotion> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoAV1GlobalMotion(segment)
        );
    }
    
}