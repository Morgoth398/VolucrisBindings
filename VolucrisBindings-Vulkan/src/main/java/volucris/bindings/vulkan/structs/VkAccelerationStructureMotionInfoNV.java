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

public final class VkAccelerationStructureMotionInfoNV
		implements Struct<VkAccelerationStructureMotionInfoNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_INSTANCES_HANDLE;
    public static final VarHandle FLAGS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_INSTANCES_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maxInstances"),
            JAVA_INT.withName("flags")
        ).withName("VkAccelerationStructureMotionInfoNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_INSTANCES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxInstances"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_INSTANCES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxInstances"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        //@formatter:on
    }

    public VkAccelerationStructureMotionInfoNV() {
        this(Arena.ofAuto());
    }
    
    public VkAccelerationStructureMotionInfoNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkAccelerationStructureMotionInfoNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkAccelerationStructureMotionInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAccelerationStructureMotionInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxInstances()
    public VkAccelerationStructureMotionInfoNV maxInstances(int maxInstances) {
    	MAX_INSTANCES_HANDLE.set(segment, 0L, maxInstances);
    	return this;
    }
    
    public int maxInstances() {
    	return (int) MAX_INSTANCES_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VkAccelerationStructureMotionInfoNV flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkAccelerationStructureMotionInfoNV set(VkAccelerationStructureMotionInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureMotionInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureMotionInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureMotionInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureMotionInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureMotionInfoNV> array(Arena arena, VkAccelerationStructureMotionInfoNV... structs) {
        NativeStructArray<VkAccelerationStructureMotionInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureMotionInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureMotionInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureMotionInfoNV(segment)
        );
    }
    
}