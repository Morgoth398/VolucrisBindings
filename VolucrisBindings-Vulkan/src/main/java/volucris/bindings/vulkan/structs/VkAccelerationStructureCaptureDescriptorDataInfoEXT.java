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

public final class VkAccelerationStructureCaptureDescriptorDataInfoEXT
		implements Struct<VkAccelerationStructureCaptureDescriptorDataInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle ACCELERATION_STRUCTURE_HANDLE;
    public static final VarHandle ACCELERATION_STRUCTURE_NV_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long ACCELERATION_STRUCTURE_BYTE_OFFSET;
    public static final long ACCELERATION_STRUCTURE_NV_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("accelerationStructure"),
            UNBOUNDED_ADDRESS.withName("accelerationStructureNV")
        ).withName("VkAccelerationStructureCaptureDescriptorDataInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        ACCELERATION_STRUCTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("accelerationStructure"));
        ACCELERATION_STRUCTURE_NV_HANDLE = LAYOUT.varHandle(PathElement.groupElement("accelerationStructureNV"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        ACCELERATION_STRUCTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
        ACCELERATION_STRUCTURE_NV_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureNV"));
        //@formatter:on
    }

    public VkAccelerationStructureCaptureDescriptorDataInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #accelerationStructure()
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT accelerationStructure(VkAccelerationStructureKHR accelerationStructure) {
    	ACCELERATION_STRUCTURE_HANDLE.set(segment, 0L, accelerationStructure.memorySegment());
    	return this;
    }
    
    public @Nullable VkAccelerationStructureKHR accelerationStructure() {
    	MemorySegment segment = (MemorySegment) ACCELERATION_STRUCTURE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkAccelerationStructureKHR(segment);
    }
    
    /// @see #accelerationStructureNV()
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT accelerationStructureNV(VkAccelerationStructureNV accelerationStructureNV) {
    	ACCELERATION_STRUCTURE_NV_HANDLE.set(segment, 0L, accelerationStructureNV.memorySegment());
    	return this;
    }
    
    public @Nullable VkAccelerationStructureNV accelerationStructureNV() {
    	MemorySegment segment = (MemorySegment) ACCELERATION_STRUCTURE_NV_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkAccelerationStructureNV(segment);
    }
    
    @Override
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT set(VkAccelerationStructureCaptureDescriptorDataInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureCaptureDescriptorDataInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureCaptureDescriptorDataInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureCaptureDescriptorDataInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureCaptureDescriptorDataInfoEXT> array(Arena arena, VkAccelerationStructureCaptureDescriptorDataInfoEXT... structs) {
        NativeStructArray<VkAccelerationStructureCaptureDescriptorDataInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAccelerationStructureCaptureDescriptorDataInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureCaptureDescriptorDataInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureCaptureDescriptorDataInfoEXT(segment)
        );
    }
    
}