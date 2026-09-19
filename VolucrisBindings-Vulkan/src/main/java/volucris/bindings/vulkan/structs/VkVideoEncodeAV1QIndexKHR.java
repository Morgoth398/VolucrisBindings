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

public final class VkVideoEncodeAV1QIndexKHR
		implements Struct<VkVideoEncodeAV1QIndexKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle INTRA_QINDEX_HANDLE;
    public static final VarHandle PREDICTIVE_QINDEX_HANDLE;
    public static final VarHandle BIPREDICTIVE_QINDEX_HANDLE;

    public static final long INTRA_QINDEX_BYTE_OFFSET;
    public static final long PREDICTIVE_QINDEX_BYTE_OFFSET;
    public static final long BIPREDICTIVE_QINDEX_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("intraQIndex"),
            JAVA_INT.withName("predictiveQIndex"),
            JAVA_INT.withName("bipredictiveQIndex")
        ).withName("VkVideoEncodeAV1QIndexKHR").withByteAlignment(4);
        
        INTRA_QINDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("intraQIndex"));
        PREDICTIVE_QINDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("predictiveQIndex"));
        BIPREDICTIVE_QINDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bipredictiveQIndex"));
        
        INTRA_QINDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("intraQIndex"));
        PREDICTIVE_QINDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("predictiveQIndex"));
        BIPREDICTIVE_QINDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bipredictiveQIndex"));
        //@formatter:on
    }

    public VkVideoEncodeAV1QIndexKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoEncodeAV1QIndexKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoEncodeAV1QIndexKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #intraQIndex()
    public VkVideoEncodeAV1QIndexKHR intraQIndex(int intraQIndex) {
    	INTRA_QINDEX_HANDLE.set(segment, 0L, intraQIndex);
    	return this;
    }
    
    public int intraQIndex() {
    	return (int) INTRA_QINDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #predictiveQIndex()
    public VkVideoEncodeAV1QIndexKHR predictiveQIndex(int predictiveQIndex) {
    	PREDICTIVE_QINDEX_HANDLE.set(segment, 0L, predictiveQIndex);
    	return this;
    }
    
    public int predictiveQIndex() {
    	return (int) PREDICTIVE_QINDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #bipredictiveQIndex()
    public VkVideoEncodeAV1QIndexKHR bipredictiveQIndex(int bipredictiveQIndex) {
    	BIPREDICTIVE_QINDEX_HANDLE.set(segment, 0L, bipredictiveQIndex);
    	return this;
    }
    
    public int bipredictiveQIndex() {
    	return (int) BIPREDICTIVE_QINDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeAV1QIndexKHR set(VkVideoEncodeAV1QIndexKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeAV1QIndexKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeAV1QIndexKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeAV1QIndexKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeAV1QIndexKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeAV1QIndexKHR> array(Arena arena, VkVideoEncodeAV1QIndexKHR... structs) {
        NativeStructArray<VkVideoEncodeAV1QIndexKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeAV1QIndexKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeAV1QIndexKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeAV1QIndexKHR(segment)
        );
    }
    
}