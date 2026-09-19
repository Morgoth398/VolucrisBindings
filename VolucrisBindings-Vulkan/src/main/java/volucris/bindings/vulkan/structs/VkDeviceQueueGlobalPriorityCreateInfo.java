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

public final class VkDeviceQueueGlobalPriorityCreateInfo
		implements Struct<VkDeviceQueueGlobalPriorityCreateInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle GLOBAL_PRIORITY_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long GLOBAL_PRIORITY_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("globalPriority"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkDeviceQueueGlobalPriorityCreateInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        GLOBAL_PRIORITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("globalPriority"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        GLOBAL_PRIORITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("globalPriority"));
        //@formatter:on
    }

    public VkDeviceQueueGlobalPriorityCreateInfo() {
        this(Arena.ofAuto());
    }
    
    public VkDeviceQueueGlobalPriorityCreateInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDeviceQueueGlobalPriorityCreateInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDeviceQueueGlobalPriorityCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceQueueGlobalPriorityCreateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #globalPriority()
    public VkDeviceQueueGlobalPriorityCreateInfo globalPriority(int globalPriority) {
    	GLOBAL_PRIORITY_HANDLE.set(segment, 0L, globalPriority);
    	return this;
    }
    
    public int globalPriority() {
    	return (int) GLOBAL_PRIORITY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDeviceQueueGlobalPriorityCreateInfo set(VkDeviceQueueGlobalPriorityCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceQueueGlobalPriorityCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceQueueGlobalPriorityCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceQueueGlobalPriorityCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceQueueGlobalPriorityCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceQueueGlobalPriorityCreateInfo> array(Arena arena, VkDeviceQueueGlobalPriorityCreateInfo... structs) {
        NativeStructArray<VkDeviceQueueGlobalPriorityCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceQueueGlobalPriorityCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceQueueGlobalPriorityCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceQueueGlobalPriorityCreateInfo(segment)
        );
    }
    
}