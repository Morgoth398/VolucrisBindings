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

public final class VkPastPresentationTimingPropertiesEXT
		implements Struct<VkPastPresentationTimingPropertiesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle TIMING_PROPERTIES_COUNTER_HANDLE;
    public static final VarHandle TIME_DOMAINS_COUNTER_HANDLE;
    public static final VarHandle PRESENTATION_TIMING_COUNT_HANDLE;
    public static final VarHandle P_PRESENTATION_TIMINGS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long TIMING_PROPERTIES_COUNTER_BYTE_OFFSET;
    public static final long TIME_DOMAINS_COUNTER_BYTE_OFFSET;
    public static final long PRESENTATION_TIMING_COUNT_BYTE_OFFSET;
    public static final long P_PRESENTATION_TIMINGS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_LONG.withName("timingPropertiesCounter"),
            JAVA_LONG.withName("timeDomainsCounter"),
            JAVA_INT.withName("presentationTimingCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pPresentationTimings")
        ).withName("VkPastPresentationTimingPropertiesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        TIMING_PROPERTIES_COUNTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("timingPropertiesCounter"));
        TIME_DOMAINS_COUNTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("timeDomainsCounter"));
        PRESENTATION_TIMING_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentationTimingCount"));
        P_PRESENTATION_TIMINGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPresentationTimings"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        TIMING_PROPERTIES_COUNTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("timingPropertiesCounter"));
        TIME_DOMAINS_COUNTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("timeDomainsCounter"));
        PRESENTATION_TIMING_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentationTimingCount"));
        P_PRESENTATION_TIMINGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPresentationTimings"));
        //@formatter:on
    }

    public VkPastPresentationTimingPropertiesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPastPresentationTimingPropertiesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPastPresentationTimingPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPastPresentationTimingPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPastPresentationTimingPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #timingPropertiesCounter()
    public VkPastPresentationTimingPropertiesEXT timingPropertiesCounter(long timingPropertiesCounter) {
    	TIMING_PROPERTIES_COUNTER_HANDLE.set(segment, 0L, timingPropertiesCounter);
    	return this;
    }
    
    public long timingPropertiesCounter() {
    	return (long) TIMING_PROPERTIES_COUNTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #timeDomainsCounter()
    public VkPastPresentationTimingPropertiesEXT timeDomainsCounter(long timeDomainsCounter) {
    	TIME_DOMAINS_COUNTER_HANDLE.set(segment, 0L, timeDomainsCounter);
    	return this;
    }
    
    public long timeDomainsCounter() {
    	return (long) TIME_DOMAINS_COUNTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #presentationTimingCount()
    public VkPastPresentationTimingPropertiesEXT presentationTimingCount(int presentationTimingCount) {
    	PRESENTATION_TIMING_COUNT_HANDLE.set(segment, 0L, presentationTimingCount);
    	return this;
    }
    
    public int presentationTimingCount() {
    	return (int) PRESENTATION_TIMING_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPresentationTimings()
    public VkPastPresentationTimingPropertiesEXT pPresentationTimings(NativeStructArray<VkPastPresentationTimingEXT> pPresentationTimings) {
    	P_PRESENTATION_TIMINGS_HANDLE.set(segment, 0L, pPresentationTimings.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkPastPresentationTimingEXT> pPresentationTimings() {
    	MemorySegment segment = (MemorySegment) P_PRESENTATION_TIMINGS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkPastPresentationTimingEXT.array(segment);
    }
    
    @Override
    public VkPastPresentationTimingPropertiesEXT set(VkPastPresentationTimingPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPastPresentationTimingPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPastPresentationTimingPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPastPresentationTimingPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPastPresentationTimingPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPastPresentationTimingPropertiesEXT> array(Arena arena, VkPastPresentationTimingPropertiesEXT... structs) {
        NativeStructArray<VkPastPresentationTimingPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPastPresentationTimingPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPastPresentationTimingPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPastPresentationTimingPropertiesEXT(segment)
        );
    }
    
}