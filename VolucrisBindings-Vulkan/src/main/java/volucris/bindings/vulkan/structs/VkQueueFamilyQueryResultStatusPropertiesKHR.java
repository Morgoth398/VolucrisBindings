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

public final class VkQueueFamilyQueryResultStatusPropertiesKHR
		implements Struct<VkQueueFamilyQueryResultStatusPropertiesKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle QUERY_RESULT_STATUS_SUPPORT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long QUERY_RESULT_STATUS_SUPPORT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("queryResultStatusSupport"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkQueueFamilyQueryResultStatusPropertiesKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        QUERY_RESULT_STATUS_SUPPORT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queryResultStatusSupport"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        QUERY_RESULT_STATUS_SUPPORT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queryResultStatusSupport"));
        //@formatter:on
    }

    public VkQueueFamilyQueryResultStatusPropertiesKHR() {
        this(Arena.ofAuto());
    }
    
    public VkQueueFamilyQueryResultStatusPropertiesKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkQueueFamilyQueryResultStatusPropertiesKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkQueueFamilyQueryResultStatusPropertiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkQueueFamilyQueryResultStatusPropertiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #queryResultStatusSupport()
    public VkQueueFamilyQueryResultStatusPropertiesKHR queryResultStatusSupport(int queryResultStatusSupport) {
    	QUERY_RESULT_STATUS_SUPPORT_HANDLE.set(segment, 0L, queryResultStatusSupport);
    	return this;
    }
    
    public int queryResultStatusSupport() {
    	return (int) QUERY_RESULT_STATUS_SUPPORT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkQueueFamilyQueryResultStatusPropertiesKHR set(VkQueueFamilyQueryResultStatusPropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkQueueFamilyQueryResultStatusPropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkQueueFamilyQueryResultStatusPropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkQueueFamilyQueryResultStatusPropertiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkQueueFamilyQueryResultStatusPropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkQueueFamilyQueryResultStatusPropertiesKHR> array(Arena arena, VkQueueFamilyQueryResultStatusPropertiesKHR... structs) {
        NativeStructArray<VkQueueFamilyQueryResultStatusPropertiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkQueueFamilyQueryResultStatusPropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkQueueFamilyQueryResultStatusPropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkQueueFamilyQueryResultStatusPropertiesKHR(segment)
        );
    }
    
}