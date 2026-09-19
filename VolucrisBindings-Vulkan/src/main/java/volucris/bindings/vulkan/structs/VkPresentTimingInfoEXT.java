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

public final class VkPresentTimingInfoEXT
		implements Struct<VkPresentTimingInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle TARGET_TIME_HANDLE;
    public static final VarHandle TIME_DOMAIN_ID_HANDLE;
    public static final VarHandle PRESENT_STAGE_QUERIES_HANDLE;
    public static final VarHandle TARGET_TIME_DOMAIN_PRESENT_STAGE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long TARGET_TIME_BYTE_OFFSET;
    public static final long TIME_DOMAIN_ID_BYTE_OFFSET;
    public static final long PRESENT_STAGE_QUERIES_BYTE_OFFSET;
    public static final long TARGET_TIME_DOMAIN_PRESENT_STAGE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            MemoryLayout.paddingLayout(4),
            JAVA_LONG.withName("targetTime"),
            JAVA_LONG.withName("timeDomainId"),
            JAVA_INT.withName("presentStageQueries"),
            JAVA_INT.withName("targetTimeDomainPresentStage")
        ).withName("VkPresentTimingInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        TARGET_TIME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("targetTime"));
        TIME_DOMAIN_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("timeDomainId"));
        PRESENT_STAGE_QUERIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentStageQueries"));
        TARGET_TIME_DOMAIN_PRESENT_STAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("targetTimeDomainPresentStage"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        TARGET_TIME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("targetTime"));
        TIME_DOMAIN_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("timeDomainId"));
        PRESENT_STAGE_QUERIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentStageQueries"));
        TARGET_TIME_DOMAIN_PRESENT_STAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("targetTimeDomainPresentStage"));
        //@formatter:on
    }

    public VkPresentTimingInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPresentTimingInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPresentTimingInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPresentTimingInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPresentTimingInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkPresentTimingInfoEXT flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #targetTime()
    public VkPresentTimingInfoEXT targetTime(long targetTime) {
    	TARGET_TIME_HANDLE.set(segment, 0L, targetTime);
    	return this;
    }
    
    public long targetTime() {
    	return (long) TARGET_TIME_HANDLE.get(segment, 0L);
    }
    
    /// @see #timeDomainId()
    public VkPresentTimingInfoEXT timeDomainId(long timeDomainId) {
    	TIME_DOMAIN_ID_HANDLE.set(segment, 0L, timeDomainId);
    	return this;
    }
    
    public long timeDomainId() {
    	return (long) TIME_DOMAIN_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #presentStageQueries()
    public VkPresentTimingInfoEXT presentStageQueries(int presentStageQueries) {
    	PRESENT_STAGE_QUERIES_HANDLE.set(segment, 0L, presentStageQueries);
    	return this;
    }
    
    public int presentStageQueries() {
    	return (int) PRESENT_STAGE_QUERIES_HANDLE.get(segment, 0L);
    }
    
    /// @see #targetTimeDomainPresentStage()
    public VkPresentTimingInfoEXT targetTimeDomainPresentStage(int targetTimeDomainPresentStage) {
    	TARGET_TIME_DOMAIN_PRESENT_STAGE_HANDLE.set(segment, 0L, targetTimeDomainPresentStage);
    	return this;
    }
    
    public int targetTimeDomainPresentStage() {
    	return (int) TARGET_TIME_DOMAIN_PRESENT_STAGE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPresentTimingInfoEXT set(VkPresentTimingInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPresentTimingInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPresentTimingInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPresentTimingInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPresentTimingInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPresentTimingInfoEXT> array(Arena arena, VkPresentTimingInfoEXT... structs) {
        NativeStructArray<VkPresentTimingInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPresentTimingInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPresentTimingInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPresentTimingInfoEXT(segment)
        );
    }
    
}