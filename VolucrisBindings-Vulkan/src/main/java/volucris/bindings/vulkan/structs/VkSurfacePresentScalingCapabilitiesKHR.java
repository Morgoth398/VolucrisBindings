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

public final class VkSurfacePresentScalingCapabilitiesKHR
		implements Struct<VkSurfacePresentScalingCapabilitiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SUPPORTED_PRESENT_SCALING_HANDLE;
	public static final VarHandle SUPPORTED_PRESENT_GRAVITY_X_HANDLE;
	public static final VarHandle SUPPORTED_PRESENT_GRAVITY_Y_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SUPPORTED_PRESENT_SCALING_BYTE_OFFSET;
	public static final long SUPPORTED_PRESENT_GRAVITY_X_BYTE_OFFSET;
	public static final long SUPPORTED_PRESENT_GRAVITY_Y_BYTE_OFFSET;
	public static final long MIN_SCALED_IMAGE_EXTENT_BYTE_OFFSET;
	public static final long MAX_SCALED_IMAGE_EXTENT_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent2D minScaledImageExtent;
	private final VkExtent2D maxScaledImageExtent;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("supportedPresentScaling"),
		    JAVA_INT.withName("supportedPresentGravityX"),
		    JAVA_INT.withName("supportedPresentGravityY"),
		    VkExtent2D.LAYOUT.withName("minScaledImageExtent"),
		    VkExtent2D.LAYOUT.withName("maxScaledImageExtent"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkSurfacePresentScalingCapabilitiesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SUPPORTED_PRESENT_SCALING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedPresentScaling"));
		SUPPORTED_PRESENT_GRAVITY_X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedPresentGravityX"));
		SUPPORTED_PRESENT_GRAVITY_Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedPresentGravityY"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SUPPORTED_PRESENT_SCALING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedPresentScaling"));
		SUPPORTED_PRESENT_GRAVITY_X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedPresentGravityX"));
		SUPPORTED_PRESENT_GRAVITY_Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedPresentGravityY"));
		MIN_SCALED_IMAGE_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minScaledImageExtent"));
		MAX_SCALED_IMAGE_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxScaledImageExtent"));
		//@formatter:on
	}

	public VkSurfacePresentScalingCapabilitiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkSurfacePresentScalingCapabilitiesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkSurfacePresentScalingCapabilitiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    minScaledImageExtent = new VkExtent2D(segment.asSlice(MIN_SCALED_IMAGE_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
	    maxScaledImageExtent = new VkExtent2D(segment.asSlice(MAX_SCALED_IMAGE_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
	}

    /// @see #sType()
    public VkSurfacePresentScalingCapabilitiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSurfacePresentScalingCapabilitiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #supportedPresentScaling()
    public VkSurfacePresentScalingCapabilitiesKHR supportedPresentScaling(int supportedPresentScaling) {
    	SUPPORTED_PRESENT_SCALING_HANDLE.set(segment, 0L, supportedPresentScaling);
    	return this;
    }
    
    public int supportedPresentScaling() {
    	return (int) SUPPORTED_PRESENT_SCALING_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedPresentGravityX()
    public VkSurfacePresentScalingCapabilitiesKHR supportedPresentGravityX(int supportedPresentGravityX) {
    	SUPPORTED_PRESENT_GRAVITY_X_HANDLE.set(segment, 0L, supportedPresentGravityX);
    	return this;
    }
    
    public int supportedPresentGravityX() {
    	return (int) SUPPORTED_PRESENT_GRAVITY_X_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedPresentGravityY()
    public VkSurfacePresentScalingCapabilitiesKHR supportedPresentGravityY(int supportedPresentGravityY) {
    	SUPPORTED_PRESENT_GRAVITY_Y_HANDLE.set(segment, 0L, supportedPresentGravityY);
    	return this;
    }
    
    public int supportedPresentGravityY() {
    	return (int) SUPPORTED_PRESENT_GRAVITY_Y_HANDLE.get(segment, 0L);
    }
    
    /// @see #minScaledImageExtent()
    public VkSurfacePresentScalingCapabilitiesKHR minScaledImageExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(minScaledImageExtent);
    	return this;
    }
    
    /// @see #minScaledImageExtent()
    public VkSurfacePresentScalingCapabilitiesKHR minScaledImageExtent(VkExtent2D other) {
    	minScaledImageExtent.set(other);
    	return this;
    }
    
    public VkExtent2D minScaledImageExtent() {
    	return minScaledImageExtent;
    }
    
    /// @see #maxScaledImageExtent()
    public VkSurfacePresentScalingCapabilitiesKHR maxScaledImageExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxScaledImageExtent);
    	return this;
    }
    
    /// @see #maxScaledImageExtent()
    public VkSurfacePresentScalingCapabilitiesKHR maxScaledImageExtent(VkExtent2D other) {
    	maxScaledImageExtent.set(other);
    	return this;
    }
    
    public VkExtent2D maxScaledImageExtent() {
    	return maxScaledImageExtent;
    }
    
    @Override
    public VkSurfacePresentScalingCapabilitiesKHR set(VkSurfacePresentScalingCapabilitiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkSurfacePresentScalingCapabilitiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSurfacePresentScalingCapabilitiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSurfacePresentScalingCapabilitiesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSurfacePresentScalingCapabilitiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSurfacePresentScalingCapabilitiesKHR> array(SegmentAllocator allocator, VkSurfacePresentScalingCapabilitiesKHR... structs) {
        NativeStructArray<VkSurfacePresentScalingCapabilitiesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSurfacePresentScalingCapabilitiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSurfacePresentScalingCapabilitiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSurfacePresentScalingCapabilitiesKHR(segment)
        );
    }

}