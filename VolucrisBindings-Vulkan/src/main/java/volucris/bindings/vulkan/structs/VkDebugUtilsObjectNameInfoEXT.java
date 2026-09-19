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

public final class VkDebugUtilsObjectNameInfoEXT
		implements Struct<VkDebugUtilsObjectNameInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle OBJECT_TYPE_HANDLE;
    public static final VarHandle OBJECT_HANDLE_HANDLE;
    public static final VarHandle P_OBJECT_NAME_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long OBJECT_TYPE_BYTE_OFFSET;
    public static final long OBJECT_HANDLE_BYTE_OFFSET;
    public static final long P_OBJECT_NAME_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("objectType"),
            MemoryLayout.paddingLayout(4),
            JAVA_LONG.withName("objectHandle"),
            UNBOUNDED_ADDRESS.withName("pObjectName")
        ).withName("VkDebugUtilsObjectNameInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        OBJECT_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("objectType"));
        OBJECT_HANDLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("objectHandle"));
        P_OBJECT_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pObjectName"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        OBJECT_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("objectType"));
        OBJECT_HANDLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("objectHandle"));
        P_OBJECT_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pObjectName"));
        //@formatter:on
    }

    public VkDebugUtilsObjectNameInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkDebugUtilsObjectNameInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDebugUtilsObjectNameInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDebugUtilsObjectNameInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDebugUtilsObjectNameInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #objectType()
    public VkDebugUtilsObjectNameInfoEXT objectType(int objectType) {
    	OBJECT_TYPE_HANDLE.set(segment, 0L, objectType);
    	return this;
    }
    
    public int objectType() {
    	return (int) OBJECT_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #objectHandle()
    public VkDebugUtilsObjectNameInfoEXT objectHandle(long objectHandle) {
    	OBJECT_HANDLE_HANDLE.set(segment, 0L, objectHandle);
    	return this;
    }
    
    public long objectHandle() {
    	return (long) OBJECT_HANDLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pObjectName()
    public VkDebugUtilsObjectNameInfoEXT pObjectName(Arena arena, String pObjectName) {
    	P_OBJECT_NAME_HANDLE.set(segment, 0L, arena.allocateFrom(pObjectName));
    	return this;
    }
    
    public @Nullable String pObjectName() {
    	MemorySegment segment = (MemorySegment) P_OBJECT_NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    @Override
    public VkDebugUtilsObjectNameInfoEXT set(VkDebugUtilsObjectNameInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDebugUtilsObjectNameInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDebugUtilsObjectNameInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDebugUtilsObjectNameInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDebugUtilsObjectNameInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDebugUtilsObjectNameInfoEXT> array(Arena arena, VkDebugUtilsObjectNameInfoEXT... structs) {
        NativeStructArray<VkDebugUtilsObjectNameInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDebugUtilsObjectNameInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDebugUtilsObjectNameInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDebugUtilsObjectNameInfoEXT(segment)
        );
    }
    
}