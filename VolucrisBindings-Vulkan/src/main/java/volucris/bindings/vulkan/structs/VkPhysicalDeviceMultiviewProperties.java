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

public final class VkPhysicalDeviceMultiviewProperties
		implements Struct<VkPhysicalDeviceMultiviewProperties> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_MULTIVIEW_VIEW_COUNT_HANDLE;
    public static final VarHandle MAX_MULTIVIEW_INSTANCE_INDEX_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_MULTIVIEW_VIEW_COUNT_BYTE_OFFSET;
    public static final long MAX_MULTIVIEW_INSTANCE_INDEX_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maxMultiviewViewCount"),
            JAVA_INT.withName("maxMultiviewInstanceIndex")
        ).withName("VkPhysicalDeviceMultiviewProperties").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_MULTIVIEW_VIEW_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMultiviewViewCount"));
        MAX_MULTIVIEW_INSTANCE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMultiviewInstanceIndex"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_MULTIVIEW_VIEW_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMultiviewViewCount"));
        MAX_MULTIVIEW_INSTANCE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMultiviewInstanceIndex"));
        //@formatter:on
    }

    public VkPhysicalDeviceMultiviewProperties() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceMultiviewProperties(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceMultiviewProperties(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceMultiviewProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMultiviewProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxMultiviewViewCount()
    public VkPhysicalDeviceMultiviewProperties maxMultiviewViewCount(int maxMultiviewViewCount) {
    	MAX_MULTIVIEW_VIEW_COUNT_HANDLE.set(segment, 0L, maxMultiviewViewCount);
    	return this;
    }
    
    public int maxMultiviewViewCount() {
    	return (int) MAX_MULTIVIEW_VIEW_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMultiviewInstanceIndex()
    public VkPhysicalDeviceMultiviewProperties maxMultiviewInstanceIndex(int maxMultiviewInstanceIndex) {
    	MAX_MULTIVIEW_INSTANCE_INDEX_HANDLE.set(segment, 0L, maxMultiviewInstanceIndex);
    	return this;
    }
    
    public int maxMultiviewInstanceIndex() {
    	return (int) MAX_MULTIVIEW_INSTANCE_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceMultiviewProperties set(VkPhysicalDeviceMultiviewProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMultiviewProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMultiviewProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMultiviewProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMultiviewProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMultiviewProperties> array(Arena arena, VkPhysicalDeviceMultiviewProperties... structs) {
        NativeStructArray<VkPhysicalDeviceMultiviewProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMultiviewProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMultiviewProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMultiviewProperties(segment)
        );
    }
    
}