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

public final class VkPastPresentationTimingEXT
		implements Struct<VkPastPresentationTimingEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PRESENT_ID_HANDLE;
    public static final VarHandle TARGET_TIME_HANDLE;
    public static final VarHandle PRESENT_STAGE_COUNT_HANDLE;
    public static final VarHandle P_PRESENT_STAGES_HANDLE;
    public static final VarHandle TIME_DOMAIN_HANDLE;
    public static final VarHandle TIME_DOMAIN_ID_HANDLE;
    public static final VarHandle REPORT_COMPLETE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PRESENT_ID_BYTE_OFFSET;
    public static final long TARGET_TIME_BYTE_OFFSET;
    public static final long PRESENT_STAGE_COUNT_BYTE_OFFSET;
    public static final long P_PRESENT_STAGES_BYTE_OFFSET;
    public static final long TIME_DOMAIN_BYTE_OFFSET;
    public static final long TIME_DOMAIN_ID_BYTE_OFFSET;
    public static final long REPORT_COMPLETE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_LONG.withName("presentId"),
            JAVA_LONG.withName("targetTime"),
            JAVA_INT.withName("presentStageCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pPresentStages"),
            JAVA_INT.withName("timeDomain"),
            MemoryLayout.paddingLayout(4),
            JAVA_LONG.withName("timeDomainId"),
            JAVA_INT.withName("reportComplete"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPastPresentationTimingEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PRESENT_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentId"));
        TARGET_TIME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("targetTime"));
        PRESENT_STAGE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentStageCount"));
        P_PRESENT_STAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPresentStages"));
        TIME_DOMAIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("timeDomain"));
        TIME_DOMAIN_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("timeDomainId"));
        REPORT_COMPLETE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reportComplete"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PRESENT_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentId"));
        TARGET_TIME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("targetTime"));
        PRESENT_STAGE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentStageCount"));
        P_PRESENT_STAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPresentStages"));
        TIME_DOMAIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("timeDomain"));
        TIME_DOMAIN_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("timeDomainId"));
        REPORT_COMPLETE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reportComplete"));
        //@formatter:on
    }

    public VkPastPresentationTimingEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPastPresentationTimingEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPastPresentationTimingEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPastPresentationTimingEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPastPresentationTimingEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #presentId()
    public VkPastPresentationTimingEXT presentId(long presentId) {
    	PRESENT_ID_HANDLE.set(segment, 0L, presentId);
    	return this;
    }
    
    public long presentId() {
    	return (long) PRESENT_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #targetTime()
    public VkPastPresentationTimingEXT targetTime(long targetTime) {
    	TARGET_TIME_HANDLE.set(segment, 0L, targetTime);
    	return this;
    }
    
    public long targetTime() {
    	return (long) TARGET_TIME_HANDLE.get(segment, 0L);
    }
    
    /// @see #presentStageCount()
    public VkPastPresentationTimingEXT presentStageCount(int presentStageCount) {
    	PRESENT_STAGE_COUNT_HANDLE.set(segment, 0L, presentStageCount);
    	return this;
    }
    
    public int presentStageCount() {
    	return (int) PRESENT_STAGE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPresentStages()
    public VkPastPresentationTimingEXT pPresentStages(NativeStructArray<VkPresentStageTimeEXT> pPresentStages) {
    	P_PRESENT_STAGES_HANDLE.set(segment, 0L, pPresentStages.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkPresentStageTimeEXT> pPresentStages() {
    	MemorySegment segment = (MemorySegment) P_PRESENT_STAGES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkPresentStageTimeEXT.array(segment);
    }
    
    /// @see #timeDomain()
    public VkPastPresentationTimingEXT timeDomain(int timeDomain) {
    	TIME_DOMAIN_HANDLE.set(segment, 0L, timeDomain);
    	return this;
    }
    
    public int timeDomain() {
    	return (int) TIME_DOMAIN_HANDLE.get(segment, 0L);
    }
    
    /// @see #timeDomainId()
    public VkPastPresentationTimingEXT timeDomainId(long timeDomainId) {
    	TIME_DOMAIN_ID_HANDLE.set(segment, 0L, timeDomainId);
    	return this;
    }
    
    public long timeDomainId() {
    	return (long) TIME_DOMAIN_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #reportComplete()
    public VkPastPresentationTimingEXT reportComplete(int reportComplete) {
    	REPORT_COMPLETE_HANDLE.set(segment, 0L, reportComplete);
    	return this;
    }
    
    public int reportComplete() {
    	return (int) REPORT_COMPLETE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPastPresentationTimingEXT set(VkPastPresentationTimingEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPastPresentationTimingEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPastPresentationTimingEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPastPresentationTimingEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPastPresentationTimingEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPastPresentationTimingEXT> array(Arena arena, VkPastPresentationTimingEXT... structs) {
        NativeStructArray<VkPastPresentationTimingEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPastPresentationTimingEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPastPresentationTimingEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPastPresentationTimingEXT(segment)
        );
    }
    
}