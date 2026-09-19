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

public final class VkVideoSessionCreateInfoKHR
		implements Struct<VkVideoSessionCreateInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle QUEUE_FAMILY_INDEX_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle P_VIDEO_PROFILE_HANDLE;
    public static final VarHandle PICTURE_FORMAT_HANDLE;
    public static final VarHandle REFERENCE_PICTURE_FORMAT_HANDLE;
    public static final VarHandle MAX_DPB_SLOTS_HANDLE;
    public static final VarHandle MAX_ACTIVE_REFERENCE_PICTURES_HANDLE;
    public static final VarHandle P_STD_HEADER_VERSION_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long QUEUE_FAMILY_INDEX_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long P_VIDEO_PROFILE_BYTE_OFFSET;
    public static final long PICTURE_FORMAT_BYTE_OFFSET;
    public static final long MAX_CODED_EXTENT_BYTE_OFFSET;
    public static final long REFERENCE_PICTURE_FORMAT_BYTE_OFFSET;
    public static final long MAX_DPB_SLOTS_BYTE_OFFSET;
    public static final long MAX_ACTIVE_REFERENCE_PICTURES_BYTE_OFFSET;
    public static final long P_STD_HEADER_VERSION_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkExtent2D maxCodedExtent;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("queueFamilyIndex"),
            JAVA_INT.withName("flags"),
            UNBOUNDED_ADDRESS.withName("pVideoProfile"),
            JAVA_INT.withName("pictureFormat"),
            VkExtent2D.LAYOUT.withName("maxCodedExtent"),
            JAVA_INT.withName("referencePictureFormat"),
            JAVA_INT.withName("maxDpbSlots"),
            JAVA_INT.withName("maxActiveReferencePictures"),
            UNBOUNDED_ADDRESS.withName("pStdHeaderVersion")
        ).withName("VkVideoSessionCreateInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        QUEUE_FAMILY_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queueFamilyIndex"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        P_VIDEO_PROFILE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pVideoProfile"));
        PICTURE_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pictureFormat"));
        REFERENCE_PICTURE_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("referencePictureFormat"));
        MAX_DPB_SLOTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDpbSlots"));
        MAX_ACTIVE_REFERENCE_PICTURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxActiveReferencePictures"));
        P_STD_HEADER_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdHeaderVersion"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        QUEUE_FAMILY_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndex"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        P_VIDEO_PROFILE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pVideoProfile"));
        PICTURE_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pictureFormat"));
        MAX_CODED_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxCodedExtent"));
        REFERENCE_PICTURE_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("referencePictureFormat"));
        MAX_DPB_SLOTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDpbSlots"));
        MAX_ACTIVE_REFERENCE_PICTURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxActiveReferencePictures"));
        P_STD_HEADER_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdHeaderVersion"));
        //@formatter:on
    }

    public VkVideoSessionCreateInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoSessionCreateInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoSessionCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
        maxCodedExtent = new VkExtent2D(segment.asSlice(MAX_CODED_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
    }

    /// @see #sType()
    public VkVideoSessionCreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoSessionCreateInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #queueFamilyIndex()
    public VkVideoSessionCreateInfoKHR queueFamilyIndex(int queueFamilyIndex) {
    	QUEUE_FAMILY_INDEX_HANDLE.set(segment, 0L, queueFamilyIndex);
    	return this;
    }
    
    public int queueFamilyIndex() {
    	return (int) QUEUE_FAMILY_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VkVideoSessionCreateInfoKHR flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pVideoProfile()
    public VkVideoSessionCreateInfoKHR pVideoProfile(VkVideoProfileInfoKHR pVideoProfile) {
    	P_VIDEO_PROFILE_HANDLE.set(segment, 0L, pVideoProfile.memorySegment());
    	return this;
    }
    
    public @Nullable VkVideoProfileInfoKHR pVideoProfile() {
    	MemorySegment segment = (MemorySegment) P_VIDEO_PROFILE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkVideoProfileInfoKHR(segment);
    }
    
    /// @see #pictureFormat()
    public VkVideoSessionCreateInfoKHR pictureFormat(int pictureFormat) {
    	PICTURE_FORMAT_HANDLE.set(segment, 0L, pictureFormat);
    	return this;
    }
    
    public int pictureFormat() {
    	return (int) PICTURE_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #referencePictureFormat()
    public VkVideoSessionCreateInfoKHR referencePictureFormat(int referencePictureFormat) {
    	REFERENCE_PICTURE_FORMAT_HANDLE.set(segment, 0L, referencePictureFormat);
    	return this;
    }
    
    public int referencePictureFormat() {
    	return (int) REFERENCE_PICTURE_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDpbSlots()
    public VkVideoSessionCreateInfoKHR maxDpbSlots(int maxDpbSlots) {
    	MAX_DPB_SLOTS_HANDLE.set(segment, 0L, maxDpbSlots);
    	return this;
    }
    
    public int maxDpbSlots() {
    	return (int) MAX_DPB_SLOTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxActiveReferencePictures()
    public VkVideoSessionCreateInfoKHR maxActiveReferencePictures(int maxActiveReferencePictures) {
    	MAX_ACTIVE_REFERENCE_PICTURES_HANDLE.set(segment, 0L, maxActiveReferencePictures);
    	return this;
    }
    
    public int maxActiveReferencePictures() {
    	return (int) MAX_ACTIVE_REFERENCE_PICTURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #pStdHeaderVersion()
    public VkVideoSessionCreateInfoKHR pStdHeaderVersion(VkExtensionProperties pStdHeaderVersion) {
    	P_STD_HEADER_VERSION_HANDLE.set(segment, 0L, pStdHeaderVersion.memorySegment());
    	return this;
    }
    
    public @Nullable VkExtensionProperties pStdHeaderVersion() {
    	MemorySegment segment = (MemorySegment) P_STD_HEADER_VERSION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkExtensionProperties(segment);
    }
    
    /// @see #maxCodedExtent()
    public VkVideoSessionCreateInfoKHR maxCodedExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxCodedExtent);
    	return this;
    }
    
    /// @see #maxCodedExtent()
    public VkVideoSessionCreateInfoKHR maxCodedExtent(VkExtent2D other) {
    	maxCodedExtent.set(other);
    	return this;
    }
    
    public VkExtent2D maxCodedExtent() {
    	return maxCodedExtent;
    }
    
    @Override
    public VkVideoSessionCreateInfoKHR set(VkVideoSessionCreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoSessionCreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoSessionCreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoSessionCreateInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoSessionCreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoSessionCreateInfoKHR> array(Arena arena, VkVideoSessionCreateInfoKHR... structs) {
        NativeStructArray<VkVideoSessionCreateInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoSessionCreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoSessionCreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoSessionCreateInfoKHR(segment)
        );
    }
    
}