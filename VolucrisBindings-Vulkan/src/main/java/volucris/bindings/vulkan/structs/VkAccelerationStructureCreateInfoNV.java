/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkAccelerationStructureCreateInfoNV
		implements Struct<VkAccelerationStructureCreateInfoNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle COMPACTED_SIZE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long COMPACTED_SIZE_BYTE_OFFSET;
    public static final long INFO_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkAccelerationStructureInfoNV info;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_LONG.withName("compactedSize"),
            VkAccelerationStructureInfoNV.LAYOUT.withName("info")
        ).withName("VkAccelerationStructureCreateInfoNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        COMPACTED_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("compactedSize"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        COMPACTED_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("compactedSize"));
        INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("info"));
        //@formatter:on
    }

    public VkAccelerationStructureCreateInfoNV() {
        this(Arena.ofAuto());
    }
    
    public VkAccelerationStructureCreateInfoNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkAccelerationStructureCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
    
        info = new VkAccelerationStructureInfoNV(segment.asSlice(INFO_BYTE_OFFSET, VkAccelerationStructureInfoNV.LAYOUT));
    }

    /// @see #sType()
    public VkAccelerationStructureCreateInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAccelerationStructureCreateInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #compactedSize()
    public VkAccelerationStructureCreateInfoNV compactedSize(long compactedSize) {
    	COMPACTED_SIZE_HANDLE.set(segment, 0L, compactedSize);
    	return this;
    }
    
    public long compactedSize() {
    	return (long) COMPACTED_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #info()
    public VkAccelerationStructureCreateInfoNV info(Consumer<VkAccelerationStructureInfoNV> consumer) {
    	consumer.accept(info);
    	return this;
    }
    
    /// @see #info()
    public VkAccelerationStructureCreateInfoNV info(VkAccelerationStructureInfoNV other) {
    	info.set(other);
    	return this;
    }
    
    public VkAccelerationStructureInfoNV info() {
    	return info;
    }
    
    @Override
    public VkAccelerationStructureCreateInfoNV set(VkAccelerationStructureCreateInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureCreateInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureCreateInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureCreateInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureCreateInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureCreateInfoNV> array(Arena arena, VkAccelerationStructureCreateInfoNV... structs) {
        NativeStructArray<VkAccelerationStructureCreateInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureCreateInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureCreateInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureCreateInfoNV(segment)
        );
    }
    
}