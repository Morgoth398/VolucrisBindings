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

public final class VkCopyImageToMemoryInfo
		implements Struct<VkCopyImageToMemoryInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle SRC_IMAGE_HANDLE;
    public static final VarHandle SRC_IMAGE_LAYOUT_HANDLE;
    public static final VarHandle REGION_COUNT_HANDLE;
    public static final VarHandle P_REGIONS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long SRC_IMAGE_BYTE_OFFSET;
    public static final long SRC_IMAGE_LAYOUT_BYTE_OFFSET;
    public static final long REGION_COUNT_BYTE_OFFSET;
    public static final long P_REGIONS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("srcImage"),
            JAVA_INT.withName("srcImageLayout"),
            JAVA_INT.withName("regionCount"),
            UNBOUNDED_ADDRESS.withName("pRegions")
        ).withName("VkCopyImageToMemoryInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        SRC_IMAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcImage"));
        SRC_IMAGE_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcImageLayout"));
        REGION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("regionCount"));
        P_REGIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pRegions"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        SRC_IMAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcImage"));
        SRC_IMAGE_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcImageLayout"));
        REGION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("regionCount"));
        P_REGIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pRegions"));
        //@formatter:on
    }

    public VkCopyImageToMemoryInfo() {
        this(Arena.ofAuto());
    }
    
    public VkCopyImageToMemoryInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkCopyImageToMemoryInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkCopyImageToMemoryInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCopyImageToMemoryInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkCopyImageToMemoryInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcImage()
    public VkCopyImageToMemoryInfo srcImage(VkImage srcImage) {
    	SRC_IMAGE_HANDLE.set(segment, 0L, srcImage.memorySegment());
    	return this;
    }
    
    public @Nullable VkImage srcImage() {
    	MemorySegment segment = (MemorySegment) SRC_IMAGE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImage(segment);
    }
    
    /// @see #srcImageLayout()
    public VkCopyImageToMemoryInfo srcImageLayout(int srcImageLayout) {
    	SRC_IMAGE_LAYOUT_HANDLE.set(segment, 0L, srcImageLayout);
    	return this;
    }
    
    public int srcImageLayout() {
    	return (int) SRC_IMAGE_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #regionCount()
    public VkCopyImageToMemoryInfo regionCount(int regionCount) {
    	REGION_COUNT_HANDLE.set(segment, 0L, regionCount);
    	return this;
    }
    
    public int regionCount() {
    	return (int) REGION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pRegions()
    public VkCopyImageToMemoryInfo pRegions(NativeStructArray<VkImageToMemoryCopy> pRegions) {
    	P_REGIONS_HANDLE.set(segment, 0L, pRegions.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkImageToMemoryCopy> pRegions() {
    	MemorySegment segment = (MemorySegment) P_REGIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkImageToMemoryCopy.array(segment);
    }
    
    @Override
    public VkCopyImageToMemoryInfo set(VkCopyImageToMemoryInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkCopyImageToMemoryInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCopyImageToMemoryInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCopyImageToMemoryInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCopyImageToMemoryInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCopyImageToMemoryInfo> array(Arena arena, VkCopyImageToMemoryInfo... structs) {
        NativeStructArray<VkCopyImageToMemoryInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCopyImageToMemoryInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCopyImageToMemoryInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCopyImageToMemoryInfo(segment)
        );
    }
    
}