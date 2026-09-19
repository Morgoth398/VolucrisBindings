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

public final class VkCopyDeviceMemoryImageInfoKHR
		implements Struct<VkCopyDeviceMemoryImageInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle IMAGE_HANDLE;
    public static final VarHandle REGION_COUNT_HANDLE;
    public static final VarHandle P_REGIONS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long IMAGE_BYTE_OFFSET;
    public static final long REGION_COUNT_BYTE_OFFSET;
    public static final long P_REGIONS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("image"),
            JAVA_INT.withName("regionCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pRegions")
        ).withName("VkCopyDeviceMemoryImageInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        IMAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("image"));
        REGION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("regionCount"));
        P_REGIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pRegions"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        IMAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("image"));
        REGION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("regionCount"));
        P_REGIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pRegions"));
        //@formatter:on
    }

    public VkCopyDeviceMemoryImageInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkCopyDeviceMemoryImageInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkCopyDeviceMemoryImageInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkCopyDeviceMemoryImageInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCopyDeviceMemoryImageInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #image()
    public VkCopyDeviceMemoryImageInfoKHR image(VkImage image) {
    	IMAGE_HANDLE.set(segment, 0L, image.memorySegment());
    	return this;
    }
    
    public @Nullable VkImage image() {
    	MemorySegment segment = (MemorySegment) IMAGE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImage(segment);
    }
    
    /// @see #regionCount()
    public VkCopyDeviceMemoryImageInfoKHR regionCount(int regionCount) {
    	REGION_COUNT_HANDLE.set(segment, 0L, regionCount);
    	return this;
    }
    
    public int regionCount() {
    	return (int) REGION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pRegions()
    public VkCopyDeviceMemoryImageInfoKHR pRegions(NativeStructArray<VkDeviceMemoryImageCopyKHR> pRegions) {
    	P_REGIONS_HANDLE.set(segment, 0L, pRegions.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkDeviceMemoryImageCopyKHR> pRegions() {
    	MemorySegment segment = (MemorySegment) P_REGIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkDeviceMemoryImageCopyKHR.array(segment);
    }
    
    @Override
    public VkCopyDeviceMemoryImageInfoKHR set(VkCopyDeviceMemoryImageInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkCopyDeviceMemoryImageInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCopyDeviceMemoryImageInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCopyDeviceMemoryImageInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCopyDeviceMemoryImageInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCopyDeviceMemoryImageInfoKHR> array(Arena arena, VkCopyDeviceMemoryImageInfoKHR... structs) {
        NativeStructArray<VkCopyDeviceMemoryImageInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCopyDeviceMemoryImageInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCopyDeviceMemoryImageInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCopyDeviceMemoryImageInfoKHR(segment)
        );
    }
    
}