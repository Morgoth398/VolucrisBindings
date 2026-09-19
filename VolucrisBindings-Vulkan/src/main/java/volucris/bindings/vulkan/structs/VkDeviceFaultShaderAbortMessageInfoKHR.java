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

public final class VkDeviceFaultShaderAbortMessageInfoKHR
		implements Struct<VkDeviceFaultShaderAbortMessageInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MESSAGE_DATA_SIZE_HANDLE;
    public static final VarHandle P_MESSAGE_DATA_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MESSAGE_DATA_SIZE_BYTE_OFFSET;
    public static final long P_MESSAGE_DATA_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_LONG.withName("messageDataSize"),
            UNBOUNDED_ADDRESS.withName("pMessageData")
        ).withName("VkDeviceFaultShaderAbortMessageInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MESSAGE_DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("messageDataSize"));
        P_MESSAGE_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pMessageData"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MESSAGE_DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("messageDataSize"));
        P_MESSAGE_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pMessageData"));
        //@formatter:on
    }

    public VkDeviceFaultShaderAbortMessageInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkDeviceFaultShaderAbortMessageInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDeviceFaultShaderAbortMessageInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDeviceFaultShaderAbortMessageInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceFaultShaderAbortMessageInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #messageDataSize()
    public VkDeviceFaultShaderAbortMessageInfoKHR messageDataSize(long messageDataSize) {
    	MESSAGE_DATA_SIZE_HANDLE.set(segment, 0L, messageDataSize);
    	return this;
    }
    
    public long messageDataSize() {
    	return (long) MESSAGE_DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pMessageData()
    public VkDeviceFaultShaderAbortMessageInfoKHR pMessageData(MemorySegment pMessageData) {
    	P_MESSAGE_DATA_HANDLE.set(segment, 0L, pMessageData);
    	return this;
    }
    
    public @Nullable MemorySegment pMessageData() {
    	MemorySegment segment = (MemorySegment) P_MESSAGE_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VkDeviceFaultShaderAbortMessageInfoKHR set(VkDeviceFaultShaderAbortMessageInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceFaultShaderAbortMessageInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceFaultShaderAbortMessageInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceFaultShaderAbortMessageInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceFaultShaderAbortMessageInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceFaultShaderAbortMessageInfoKHR> array(Arena arena, VkDeviceFaultShaderAbortMessageInfoKHR... structs) {
        NativeStructArray<VkDeviceFaultShaderAbortMessageInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceFaultShaderAbortMessageInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceFaultShaderAbortMessageInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceFaultShaderAbortMessageInfoKHR(segment)
        );
    }
    
}