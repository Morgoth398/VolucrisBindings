/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
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

public final class VkHdrMetadataEXT
		implements Struct<VkHdrMetadataEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAX_LUMINANCE_HANDLE;
	public static final VarHandle MIN_LUMINANCE_HANDLE;
	public static final VarHandle MAX_CONTENT_LIGHT_LEVEL_HANDLE;
	public static final VarHandle MAX_FRAME_AVERAGE_LIGHT_LEVEL_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DISPLAY_PRIMARY_RED_BYTE_OFFSET;
	public static final long DISPLAY_PRIMARY_GREEN_BYTE_OFFSET;
	public static final long DISPLAY_PRIMARY_BLUE_BYTE_OFFSET;
	public static final long WHITE_POINT_BYTE_OFFSET;
	public static final long MAX_LUMINANCE_BYTE_OFFSET;
	public static final long MIN_LUMINANCE_BYTE_OFFSET;
	public static final long MAX_CONTENT_LIGHT_LEVEL_BYTE_OFFSET;
	public static final long MAX_FRAME_AVERAGE_LIGHT_LEVEL_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkXYColorEXT displayPrimaryRed;
	private final VkXYColorEXT displayPrimaryGreen;
	private final VkXYColorEXT displayPrimaryBlue;
	private final VkXYColorEXT whitePoint;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkXYColorEXT.LAYOUT.withName("displayPrimaryRed"),
		    VkXYColorEXT.LAYOUT.withName("displayPrimaryGreen"),
		    VkXYColorEXT.LAYOUT.withName("displayPrimaryBlue"),
		    VkXYColorEXT.LAYOUT.withName("whitePoint"),
		    JAVA_FLOAT.withName("maxLuminance"),
		    JAVA_FLOAT.withName("minLuminance"),
		    JAVA_FLOAT.withName("maxContentLightLevel"),
		    JAVA_FLOAT.withName("maxFrameAverageLightLevel")
		).withName("VkHdrMetadataEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAX_LUMINANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxLuminance"));
		MIN_LUMINANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minLuminance"));
		MAX_CONTENT_LIGHT_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxContentLightLevel"));
		MAX_FRAME_AVERAGE_LIGHT_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxFrameAverageLightLevel"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DISPLAY_PRIMARY_RED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("displayPrimaryRed"));
		DISPLAY_PRIMARY_GREEN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("displayPrimaryGreen"));
		DISPLAY_PRIMARY_BLUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("displayPrimaryBlue"));
		WHITE_POINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("whitePoint"));
		MAX_LUMINANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxLuminance"));
		MIN_LUMINANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minLuminance"));
		MAX_CONTENT_LIGHT_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxContentLightLevel"));
		MAX_FRAME_AVERAGE_LIGHT_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFrameAverageLightLevel"));
		//@formatter:on
	}

	public VkHdrMetadataEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkHdrMetadataEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkHdrMetadataEXT(MemorySegment segment) {
	    this.segment = segment;
	
	    displayPrimaryRed = new VkXYColorEXT(segment.asSlice(DISPLAY_PRIMARY_RED_BYTE_OFFSET, VkXYColorEXT.LAYOUT));
	    displayPrimaryGreen = new VkXYColorEXT(segment.asSlice(DISPLAY_PRIMARY_GREEN_BYTE_OFFSET, VkXYColorEXT.LAYOUT));
	    displayPrimaryBlue = new VkXYColorEXT(segment.asSlice(DISPLAY_PRIMARY_BLUE_BYTE_OFFSET, VkXYColorEXT.LAYOUT));
	    whitePoint = new VkXYColorEXT(segment.asSlice(WHITE_POINT_BYTE_OFFSET, VkXYColorEXT.LAYOUT));
	}

    /// @see #sType()
    public VkHdrMetadataEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkHdrMetadataEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #displayPrimaryRed()
    public VkHdrMetadataEXT displayPrimaryRed(Consumer<VkXYColorEXT> consumer) {
    	consumer.accept(displayPrimaryRed);
    	return this;
    }
    
    /// @see #displayPrimaryRed()
    public VkHdrMetadataEXT displayPrimaryRed(VkXYColorEXT other) {
    	displayPrimaryRed.set(other);
    	return this;
    }
    
    public VkXYColorEXT displayPrimaryRed() {
    	return displayPrimaryRed;
    }
    
    /// @see #displayPrimaryGreen()
    public VkHdrMetadataEXT displayPrimaryGreen(Consumer<VkXYColorEXT> consumer) {
    	consumer.accept(displayPrimaryGreen);
    	return this;
    }
    
    /// @see #displayPrimaryGreen()
    public VkHdrMetadataEXT displayPrimaryGreen(VkXYColorEXT other) {
    	displayPrimaryGreen.set(other);
    	return this;
    }
    
    public VkXYColorEXT displayPrimaryGreen() {
    	return displayPrimaryGreen;
    }
    
    /// @see #displayPrimaryBlue()
    public VkHdrMetadataEXT displayPrimaryBlue(Consumer<VkXYColorEXT> consumer) {
    	consumer.accept(displayPrimaryBlue);
    	return this;
    }
    
    /// @see #displayPrimaryBlue()
    public VkHdrMetadataEXT displayPrimaryBlue(VkXYColorEXT other) {
    	displayPrimaryBlue.set(other);
    	return this;
    }
    
    public VkXYColorEXT displayPrimaryBlue() {
    	return displayPrimaryBlue;
    }
    
    /// @see #whitePoint()
    public VkHdrMetadataEXT whitePoint(Consumer<VkXYColorEXT> consumer) {
    	consumer.accept(whitePoint);
    	return this;
    }
    
    /// @see #whitePoint()
    public VkHdrMetadataEXT whitePoint(VkXYColorEXT other) {
    	whitePoint.set(other);
    	return this;
    }
    
    public VkXYColorEXT whitePoint() {
    	return whitePoint;
    }
    
    /// @see #maxLuminance()
    public VkHdrMetadataEXT maxLuminance(float maxLuminance) {
    	MAX_LUMINANCE_HANDLE.set(segment, 0L, maxLuminance);
    	return this;
    }
    
    public float maxLuminance() {
    	return (float) MAX_LUMINANCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #minLuminance()
    public VkHdrMetadataEXT minLuminance(float minLuminance) {
    	MIN_LUMINANCE_HANDLE.set(segment, 0L, minLuminance);
    	return this;
    }
    
    public float minLuminance() {
    	return (float) MIN_LUMINANCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxContentLightLevel()
    public VkHdrMetadataEXT maxContentLightLevel(float maxContentLightLevel) {
    	MAX_CONTENT_LIGHT_LEVEL_HANDLE.set(segment, 0L, maxContentLightLevel);
    	return this;
    }
    
    public float maxContentLightLevel() {
    	return (float) MAX_CONTENT_LIGHT_LEVEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxFrameAverageLightLevel()
    public VkHdrMetadataEXT maxFrameAverageLightLevel(float maxFrameAverageLightLevel) {
    	MAX_FRAME_AVERAGE_LIGHT_LEVEL_HANDLE.set(segment, 0L, maxFrameAverageLightLevel);
    	return this;
    }
    
    public float maxFrameAverageLightLevel() {
    	return (float) MAX_FRAME_AVERAGE_LIGHT_LEVEL_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkHdrMetadataEXT set(VkHdrMetadataEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkHdrMetadataEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkHdrMetadataEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkHdrMetadataEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkHdrMetadataEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkHdrMetadataEXT> array(SegmentAllocator allocator, VkHdrMetadataEXT... structs) {
        NativeStructArray<VkHdrMetadataEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkHdrMetadataEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkHdrMetadataEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkHdrMetadataEXT(segment)
        );
    }

}