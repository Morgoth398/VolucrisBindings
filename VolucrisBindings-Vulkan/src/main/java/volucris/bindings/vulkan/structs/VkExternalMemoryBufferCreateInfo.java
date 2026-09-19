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

public final class VkExternalMemoryBufferCreateInfo
		implements Struct<VkExternalMemoryBufferCreateInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle HANDLE_TYPES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long HANDLE_TYPES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("handleTypes"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkExternalMemoryBufferCreateInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        HANDLE_TYPES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("handleTypes"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        HANDLE_TYPES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("handleTypes"));
        //@formatter:on
    }

    public VkExternalMemoryBufferCreateInfo() {
        this(Arena.ofAuto());
    }
    
    public VkExternalMemoryBufferCreateInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkExternalMemoryBufferCreateInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkExternalMemoryBufferCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkExternalMemoryBufferCreateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #handleTypes()
    public VkExternalMemoryBufferCreateInfo handleTypes(int handleTypes) {
    	HANDLE_TYPES_HANDLE.set(segment, 0L, handleTypes);
    	return this;
    }
    
    public int handleTypes() {
    	return (int) HANDLE_TYPES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkExternalMemoryBufferCreateInfo set(VkExternalMemoryBufferCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkExternalMemoryBufferCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkExternalMemoryBufferCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkExternalMemoryBufferCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExternalMemoryBufferCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkExternalMemoryBufferCreateInfo> array(Arena arena, VkExternalMemoryBufferCreateInfo... structs) {
        NativeStructArray<VkExternalMemoryBufferCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExternalMemoryBufferCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkExternalMemoryBufferCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkExternalMemoryBufferCreateInfo(segment)
        );
    }
    
}