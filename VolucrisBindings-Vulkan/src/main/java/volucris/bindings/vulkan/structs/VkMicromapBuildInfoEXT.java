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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkMicromapBuildInfoEXT
		implements Struct<VkMicromapBuildInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle TYPE_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle MODE_HANDLE;
    public static final VarHandle DST_MICROMAP_HANDLE;
    public static final VarHandle USAGE_COUNTS_COUNT_HANDLE;
    public static final VarHandle P_USAGE_COUNTS_HANDLE;
    public static final VarHandle PP_USAGE_COUNTS_HANDLE;
    public static final VarHandle TRIANGLE_ARRAY_STRIDE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long TYPE_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long MODE_BYTE_OFFSET;
    public static final long DST_MICROMAP_BYTE_OFFSET;
    public static final long USAGE_COUNTS_COUNT_BYTE_OFFSET;
    public static final long P_USAGE_COUNTS_BYTE_OFFSET;
    public static final long PP_USAGE_COUNTS_BYTE_OFFSET;
    public static final long DATA_BYTE_OFFSET;
    public static final long SCRATCH_DATA_BYTE_OFFSET;
    public static final long TRIANGLE_ARRAY_BYTE_OFFSET;
    public static final long TRIANGLE_ARRAY_STRIDE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkDeviceOrHostAddressConstKHR data;
    private final VkDeviceOrHostAddressKHR scratchData;
    private final VkDeviceOrHostAddressConstKHR triangleArray;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("type"),
            JAVA_INT.withName("flags"),
            JAVA_INT.withName("mode"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("dstMicromap"),
            JAVA_INT.withName("usageCountsCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pUsageCounts"),
            UNBOUNDED_ADDRESS.withName("ppUsageCounts"),
            VkDeviceOrHostAddressConstKHR.LAYOUT.withName("data"),
            VkDeviceOrHostAddressKHR.LAYOUT.withName("scratchData"),
            VkDeviceOrHostAddressConstKHR.LAYOUT.withName("triangleArray"),
            JAVA_LONG.withName("triangleArrayStride")
        ).withName("VkMicromapBuildInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mode"));
        DST_MICROMAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstMicromap"));
        USAGE_COUNTS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("usageCountsCount"));
        P_USAGE_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUsageCounts"));
        PP_USAGE_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ppUsageCounts"));
        TRIANGLE_ARRAY_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("triangleArrayStride"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mode"));
        DST_MICROMAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstMicromap"));
        USAGE_COUNTS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("usageCountsCount"));
        P_USAGE_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUsageCounts"));
        PP_USAGE_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ppUsageCounts"));
        DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
        SCRATCH_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("scratchData"));
        TRIANGLE_ARRAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangleArray"));
        TRIANGLE_ARRAY_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangleArrayStride"));
        //@formatter:on
    }

    public VkMicromapBuildInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkMicromapBuildInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkMicromapBuildInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
        data = new VkDeviceOrHostAddressConstKHR(segment.asSlice(DATA_BYTE_OFFSET, VkDeviceOrHostAddressConstKHR.LAYOUT));
        scratchData = new VkDeviceOrHostAddressKHR(segment.asSlice(SCRATCH_DATA_BYTE_OFFSET, VkDeviceOrHostAddressKHR.LAYOUT));
        triangleArray = new VkDeviceOrHostAddressConstKHR(segment.asSlice(TRIANGLE_ARRAY_BYTE_OFFSET, VkDeviceOrHostAddressConstKHR.LAYOUT));
    }

    /// @see #sType()
    public VkMicromapBuildInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkMicromapBuildInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #type()
    public VkMicromapBuildInfoEXT type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VkMicromapBuildInfoEXT flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mode()
    public VkMicromapBuildInfoEXT mode(int mode) {
    	MODE_HANDLE.set(segment, 0L, mode);
    	return this;
    }
    
    public int mode() {
    	return (int) MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstMicromap()
    public VkMicromapBuildInfoEXT dstMicromap(VkMicromapEXT dstMicromap) {
    	DST_MICROMAP_HANDLE.set(segment, 0L, dstMicromap.memorySegment());
    	return this;
    }
    
    public @Nullable VkMicromapEXT dstMicromap() {
    	MemorySegment segment = (MemorySegment) DST_MICROMAP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkMicromapEXT(segment);
    }
    
    /// @see #usageCountsCount()
    public VkMicromapBuildInfoEXT usageCountsCount(int usageCountsCount) {
    	USAGE_COUNTS_COUNT_HANDLE.set(segment, 0L, usageCountsCount);
    	return this;
    }
    
    public int usageCountsCount() {
    	return (int) USAGE_COUNTS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pUsageCounts()
    public VkMicromapBuildInfoEXT pUsageCounts(NativeStructArray<VkMicromapUsageEXT> pUsageCounts) {
    	P_USAGE_COUNTS_HANDLE.set(segment, 0L, pUsageCounts.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkMicromapUsageEXT> pUsageCounts() {
    	MemorySegment segment = (MemorySegment) P_USAGE_COUNTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkMicromapUsageEXT.array(segment);
    }
    
    /// @see #ppUsageCounts()
    public VkMicromapBuildInfoEXT ppUsageCounts(NativePointerArray ppUsageCounts) {
    	PP_USAGE_COUNTS_HANDLE.set(segment, 0L, ppUsageCounts.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray ppUsageCounts() {
    	MemorySegment segment = (MemorySegment) PP_USAGE_COUNTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #triangleArrayStride()
    public VkMicromapBuildInfoEXT triangleArrayStride(long triangleArrayStride) {
    	TRIANGLE_ARRAY_STRIDE_HANDLE.set(segment, 0L, triangleArrayStride);
    	return this;
    }
    
    public long triangleArrayStride() {
    	return (long) TRIANGLE_ARRAY_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #data()
    public VkMicromapBuildInfoEXT data(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
    	consumer.accept(data);
    	return this;
    }
    
    /// @see #data()
    public VkMicromapBuildInfoEXT data(VkDeviceOrHostAddressConstKHR other) {
    	data.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressConstKHR data() {
    	return data;
    }
    
    /// @see #scratchData()
    public VkMicromapBuildInfoEXT scratchData(Consumer<VkDeviceOrHostAddressKHR> consumer) {
    	consumer.accept(scratchData);
    	return this;
    }
    
    /// @see #scratchData()
    public VkMicromapBuildInfoEXT scratchData(VkDeviceOrHostAddressKHR other) {
    	scratchData.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressKHR scratchData() {
    	return scratchData;
    }
    
    /// @see #triangleArray()
    public VkMicromapBuildInfoEXT triangleArray(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
    	consumer.accept(triangleArray);
    	return this;
    }
    
    /// @see #triangleArray()
    public VkMicromapBuildInfoEXT triangleArray(VkDeviceOrHostAddressConstKHR other) {
    	triangleArray.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressConstKHR triangleArray() {
    	return triangleArray;
    }
    
    @Override
    public VkMicromapBuildInfoEXT set(VkMicromapBuildInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkMicromapBuildInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMicromapBuildInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMicromapBuildInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMicromapBuildInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMicromapBuildInfoEXT> array(Arena arena, VkMicromapBuildInfoEXT... structs) {
        NativeStructArray<VkMicromapBuildInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMicromapBuildInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMicromapBuildInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMicromapBuildInfoEXT(segment)
        );
    }
    
}