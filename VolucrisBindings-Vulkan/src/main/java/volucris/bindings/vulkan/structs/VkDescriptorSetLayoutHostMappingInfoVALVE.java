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

public final class VkDescriptorSetLayoutHostMappingInfoVALVE
		implements Struct<VkDescriptorSetLayoutHostMappingInfoVALVE> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle DESCRIPTOR_OFFSET_HANDLE;
    public static final VarHandle DESCRIPTOR_SIZE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long DESCRIPTOR_OFFSET_BYTE_OFFSET;
    public static final long DESCRIPTOR_SIZE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_LONG.withName("descriptorOffset"),
            JAVA_INT.withName("descriptorSize"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkDescriptorSetLayoutHostMappingInfoVALVE").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        DESCRIPTOR_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorOffset"));
        DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorSize"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        DESCRIPTOR_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorOffset"));
        DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorSize"));
        //@formatter:on
    }

    public VkDescriptorSetLayoutHostMappingInfoVALVE() {
        this(Arena.ofAuto());
    }
    
    public VkDescriptorSetLayoutHostMappingInfoVALVE(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDescriptorSetLayoutHostMappingInfoVALVE(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDescriptorSetLayoutHostMappingInfoVALVE sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDescriptorSetLayoutHostMappingInfoVALVE pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #descriptorOffset()
    public VkDescriptorSetLayoutHostMappingInfoVALVE descriptorOffset(long descriptorOffset) {
    	DESCRIPTOR_OFFSET_HANDLE.set(segment, 0L, descriptorOffset);
    	return this;
    }
    
    public long descriptorOffset() {
    	return (long) DESCRIPTOR_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorSize()
    public VkDescriptorSetLayoutHostMappingInfoVALVE descriptorSize(int descriptorSize) {
    	DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, descriptorSize);
    	return this;
    }
    
    public int descriptorSize() {
    	return (int) DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDescriptorSetLayoutHostMappingInfoVALVE set(VkDescriptorSetLayoutHostMappingInfoVALVE other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorSetLayoutHostMappingInfoVALVE set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorSetLayoutHostMappingInfoVALVE> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorSetLayoutHostMappingInfoVALVE> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorSetLayoutHostMappingInfoVALVE(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorSetLayoutHostMappingInfoVALVE> array(Arena arena, VkDescriptorSetLayoutHostMappingInfoVALVE... structs) {
        NativeStructArray<VkDescriptorSetLayoutHostMappingInfoVALVE> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorSetLayoutHostMappingInfoVALVE(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorSetLayoutHostMappingInfoVALVE> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorSetLayoutHostMappingInfoVALVE(segment)
        );
    }
    
}