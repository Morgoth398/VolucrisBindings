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

public final class VkDecompressMemoryInfoEXT
		implements Struct<VkDecompressMemoryInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle DECOMPRESSION_METHOD_HANDLE;
    public static final VarHandle REGION_COUNT_HANDLE;
    public static final VarHandle P_REGIONS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long DECOMPRESSION_METHOD_BYTE_OFFSET;
    public static final long REGION_COUNT_BYTE_OFFSET;
    public static final long P_REGIONS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_LONG.withName("decompressionMethod"),
            JAVA_INT.withName("regionCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pRegions")
        ).withName("VkDecompressMemoryInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        DECOMPRESSION_METHOD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("decompressionMethod"));
        REGION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("regionCount"));
        P_REGIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pRegions"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        DECOMPRESSION_METHOD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("decompressionMethod"));
        REGION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("regionCount"));
        P_REGIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pRegions"));
        //@formatter:on
    }

    public VkDecompressMemoryInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkDecompressMemoryInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDecompressMemoryInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDecompressMemoryInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDecompressMemoryInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #decompressionMethod()
    public VkDecompressMemoryInfoEXT decompressionMethod(long decompressionMethod) {
    	DECOMPRESSION_METHOD_HANDLE.set(segment, 0L, decompressionMethod);
    	return this;
    }
    
    public long decompressionMethod() {
    	return (long) DECOMPRESSION_METHOD_HANDLE.get(segment, 0L);
    }
    
    /// @see #regionCount()
    public VkDecompressMemoryInfoEXT regionCount(int regionCount) {
    	REGION_COUNT_HANDLE.set(segment, 0L, regionCount);
    	return this;
    }
    
    public int regionCount() {
    	return (int) REGION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pRegions()
    public VkDecompressMemoryInfoEXT pRegions(NativeStructArray<VkDecompressMemoryRegionEXT> pRegions) {
    	P_REGIONS_HANDLE.set(segment, 0L, pRegions.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkDecompressMemoryRegionEXT> pRegions() {
    	MemorySegment segment = (MemorySegment) P_REGIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkDecompressMemoryRegionEXT.array(segment);
    }
    
    @Override
    public VkDecompressMemoryInfoEXT set(VkDecompressMemoryInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDecompressMemoryInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDecompressMemoryInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDecompressMemoryInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDecompressMemoryInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDecompressMemoryInfoEXT> array(Arena arena, VkDecompressMemoryInfoEXT... structs) {
        NativeStructArray<VkDecompressMemoryInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDecompressMemoryInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDecompressMemoryInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDecompressMemoryInfoEXT(segment)
        );
    }
    
}