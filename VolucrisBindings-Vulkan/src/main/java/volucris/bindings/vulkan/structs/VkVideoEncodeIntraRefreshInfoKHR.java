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

public final class VkVideoEncodeIntraRefreshInfoKHR
		implements Struct<VkVideoEncodeIntraRefreshInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle INTRA_REFRESH_CYCLE_DURATION_HANDLE;
    public static final VarHandle INTRA_REFRESH_INDEX_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long INTRA_REFRESH_CYCLE_DURATION_BYTE_OFFSET;
    public static final long INTRA_REFRESH_INDEX_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("intraRefreshCycleDuration"),
            JAVA_INT.withName("intraRefreshIndex")
        ).withName("VkVideoEncodeIntraRefreshInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        INTRA_REFRESH_CYCLE_DURATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("intraRefreshCycleDuration"));
        INTRA_REFRESH_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("intraRefreshIndex"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        INTRA_REFRESH_CYCLE_DURATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("intraRefreshCycleDuration"));
        INTRA_REFRESH_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("intraRefreshIndex"));
        //@formatter:on
    }

    public VkVideoEncodeIntraRefreshInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoEncodeIntraRefreshInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoEncodeIntraRefreshInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkVideoEncodeIntraRefreshInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeIntraRefreshInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #intraRefreshCycleDuration()
    public VkVideoEncodeIntraRefreshInfoKHR intraRefreshCycleDuration(int intraRefreshCycleDuration) {
    	INTRA_REFRESH_CYCLE_DURATION_HANDLE.set(segment, 0L, intraRefreshCycleDuration);
    	return this;
    }
    
    public int intraRefreshCycleDuration() {
    	return (int) INTRA_REFRESH_CYCLE_DURATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #intraRefreshIndex()
    public VkVideoEncodeIntraRefreshInfoKHR intraRefreshIndex(int intraRefreshIndex) {
    	INTRA_REFRESH_INDEX_HANDLE.set(segment, 0L, intraRefreshIndex);
    	return this;
    }
    
    public int intraRefreshIndex() {
    	return (int) INTRA_REFRESH_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeIntraRefreshInfoKHR set(VkVideoEncodeIntraRefreshInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeIntraRefreshInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeIntraRefreshInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeIntraRefreshInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeIntraRefreshInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeIntraRefreshInfoKHR> array(Arena arena, VkVideoEncodeIntraRefreshInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeIntraRefreshInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeIntraRefreshInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeIntraRefreshInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeIntraRefreshInfoKHR(segment)
        );
    }
    
}