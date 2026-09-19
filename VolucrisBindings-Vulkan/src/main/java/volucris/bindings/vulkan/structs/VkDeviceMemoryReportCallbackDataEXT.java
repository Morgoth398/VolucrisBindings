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

public final class VkDeviceMemoryReportCallbackDataEXT
		implements Struct<VkDeviceMemoryReportCallbackDataEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle TYPE_HANDLE;
    public static final VarHandle MEMORY_OBJECT_ID_HANDLE;
    public static final VarHandle SIZE_HANDLE;
    public static final VarHandle OBJECT_TYPE_HANDLE;
    public static final VarHandle OBJECT_HANDLE_HANDLE;
    public static final VarHandle HEAP_INDEX_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long TYPE_BYTE_OFFSET;
    public static final long MEMORY_OBJECT_ID_BYTE_OFFSET;
    public static final long SIZE_BYTE_OFFSET;
    public static final long OBJECT_TYPE_BYTE_OFFSET;
    public static final long OBJECT_HANDLE_BYTE_OFFSET;
    public static final long HEAP_INDEX_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            JAVA_INT.withName("type"),
            JAVA_LONG.withName("memoryObjectId"),
            JAVA_LONG.withName("size"),
            JAVA_INT.withName("objectType"),
            MemoryLayout.paddingLayout(4),
            JAVA_LONG.withName("objectHandle"),
            JAVA_INT.withName("heapIndex"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkDeviceMemoryReportCallbackDataEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
        MEMORY_OBJECT_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryObjectId"));
        SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
        OBJECT_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("objectType"));
        OBJECT_HANDLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("objectHandle"));
        HEAP_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heapIndex"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
        MEMORY_OBJECT_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryObjectId"));
        SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
        OBJECT_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("objectType"));
        OBJECT_HANDLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("objectHandle"));
        HEAP_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heapIndex"));
        //@formatter:on
    }

    public VkDeviceMemoryReportCallbackDataEXT() {
        this(Arena.ofAuto());
    }
    
    public VkDeviceMemoryReportCallbackDataEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDeviceMemoryReportCallbackDataEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDeviceMemoryReportCallbackDataEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceMemoryReportCallbackDataEXT pNext(MemorySegment pNext) {
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
    public VkDeviceMemoryReportCallbackDataEXT flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #type()
    public VkDeviceMemoryReportCallbackDataEXT type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #memoryObjectId()
    public VkDeviceMemoryReportCallbackDataEXT memoryObjectId(long memoryObjectId) {
    	MEMORY_OBJECT_ID_HANDLE.set(segment, 0L, memoryObjectId);
    	return this;
    }
    
    public long memoryObjectId() {
    	return (long) MEMORY_OBJECT_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkDeviceMemoryReportCallbackDataEXT size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #objectType()
    public VkDeviceMemoryReportCallbackDataEXT objectType(int objectType) {
    	OBJECT_TYPE_HANDLE.set(segment, 0L, objectType);
    	return this;
    }
    
    public int objectType() {
    	return (int) OBJECT_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #objectHandle()
    public VkDeviceMemoryReportCallbackDataEXT objectHandle(long objectHandle) {
    	OBJECT_HANDLE_HANDLE.set(segment, 0L, objectHandle);
    	return this;
    }
    
    public long objectHandle() {
    	return (long) OBJECT_HANDLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #heapIndex()
    public VkDeviceMemoryReportCallbackDataEXT heapIndex(int heapIndex) {
    	HEAP_INDEX_HANDLE.set(segment, 0L, heapIndex);
    	return this;
    }
    
    public int heapIndex() {
    	return (int) HEAP_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDeviceMemoryReportCallbackDataEXT set(VkDeviceMemoryReportCallbackDataEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceMemoryReportCallbackDataEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceMemoryReportCallbackDataEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceMemoryReportCallbackDataEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceMemoryReportCallbackDataEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceMemoryReportCallbackDataEXT> array(Arena arena, VkDeviceMemoryReportCallbackDataEXT... structs) {
        NativeStructArray<VkDeviceMemoryReportCallbackDataEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceMemoryReportCallbackDataEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceMemoryReportCallbackDataEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceMemoryReportCallbackDataEXT(segment)
        );
    }
    
}