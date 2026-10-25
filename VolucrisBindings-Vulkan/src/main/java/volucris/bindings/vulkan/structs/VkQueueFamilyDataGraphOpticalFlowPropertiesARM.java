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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkQueueFamilyDataGraphOpticalFlowPropertiesARM
		implements Struct<VkQueueFamilyDataGraphOpticalFlowPropertiesARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SUPPORTED_OUTPUT_GRID_SIZES_HANDLE;
	public static final VarHandle SUPPORTED_HINT_GRID_SIZES_HANDLE;
	public static final VarHandle HINT_SUPPORTED_HANDLE;
	public static final VarHandle COST_SUPPORTED_HANDLE;
	public static final VarHandle MIN_WIDTH_HANDLE;
	public static final VarHandle MIN_HEIGHT_HANDLE;
	public static final VarHandle MAX_WIDTH_HANDLE;
	public static final VarHandle MAX_HEIGHT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SUPPORTED_OUTPUT_GRID_SIZES_BYTE_OFFSET;
	public static final long SUPPORTED_HINT_GRID_SIZES_BYTE_OFFSET;
	public static final long HINT_SUPPORTED_BYTE_OFFSET;
	public static final long COST_SUPPORTED_BYTE_OFFSET;
	public static final long MIN_WIDTH_BYTE_OFFSET;
	public static final long MIN_HEIGHT_BYTE_OFFSET;
	public static final long MAX_WIDTH_BYTE_OFFSET;
	public static final long MAX_HEIGHT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("supportedOutputGridSizes"),
		    JAVA_INT.withName("supportedHintGridSizes"),
		    JAVA_INT.withName("hintSupported"),
		    JAVA_INT.withName("costSupported"),
		    JAVA_INT.withName("minWidth"),
		    JAVA_INT.withName("minHeight"),
		    JAVA_INT.withName("maxWidth"),
		    JAVA_INT.withName("maxHeight")
		).withName("VkQueueFamilyDataGraphOpticalFlowPropertiesARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SUPPORTED_OUTPUT_GRID_SIZES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedOutputGridSizes"));
		SUPPORTED_HINT_GRID_SIZES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedHintGridSizes"));
		HINT_SUPPORTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hintSupported"));
		COST_SUPPORTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("costSupported"));
		MIN_WIDTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minWidth"));
		MIN_HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minHeight"));
		MAX_WIDTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxWidth"));
		MAX_HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxHeight"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SUPPORTED_OUTPUT_GRID_SIZES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedOutputGridSizes"));
		SUPPORTED_HINT_GRID_SIZES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedHintGridSizes"));
		HINT_SUPPORTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hintSupported"));
		COST_SUPPORTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("costSupported"));
		MIN_WIDTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minWidth"));
		MIN_HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minHeight"));
		MAX_WIDTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxWidth"));
		MAX_HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxHeight"));
		//@formatter:on
	}

	public VkQueueFamilyDataGraphOpticalFlowPropertiesARM() {
	    this(Arena.ofAuto());
	}
	
	public VkQueueFamilyDataGraphOpticalFlowPropertiesARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkQueueFamilyDataGraphOpticalFlowPropertiesARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkQueueFamilyDataGraphOpticalFlowPropertiesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkQueueFamilyDataGraphOpticalFlowPropertiesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #supportedOutputGridSizes()
    public VkQueueFamilyDataGraphOpticalFlowPropertiesARM supportedOutputGridSizes(int supportedOutputGridSizes) {
    	SUPPORTED_OUTPUT_GRID_SIZES_HANDLE.set(segment, 0L, supportedOutputGridSizes);
    	return this;
    }
    
    public int supportedOutputGridSizes() {
    	return (int) SUPPORTED_OUTPUT_GRID_SIZES_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedHintGridSizes()
    public VkQueueFamilyDataGraphOpticalFlowPropertiesARM supportedHintGridSizes(int supportedHintGridSizes) {
    	SUPPORTED_HINT_GRID_SIZES_HANDLE.set(segment, 0L, supportedHintGridSizes);
    	return this;
    }
    
    public int supportedHintGridSizes() {
    	return (int) SUPPORTED_HINT_GRID_SIZES_HANDLE.get(segment, 0L);
    }
    
    /// @see #hintSupported()
    public VkQueueFamilyDataGraphOpticalFlowPropertiesARM hintSupported(int hintSupported) {
    	HINT_SUPPORTED_HANDLE.set(segment, 0L, hintSupported);
    	return this;
    }
    
    public int hintSupported() {
    	return (int) HINT_SUPPORTED_HANDLE.get(segment, 0L);
    }
    
    /// @see #costSupported()
    public VkQueueFamilyDataGraphOpticalFlowPropertiesARM costSupported(int costSupported) {
    	COST_SUPPORTED_HANDLE.set(segment, 0L, costSupported);
    	return this;
    }
    
    public int costSupported() {
    	return (int) COST_SUPPORTED_HANDLE.get(segment, 0L);
    }
    
    /// @see #minWidth()
    public VkQueueFamilyDataGraphOpticalFlowPropertiesARM minWidth(int minWidth) {
    	MIN_WIDTH_HANDLE.set(segment, 0L, minWidth);
    	return this;
    }
    
    public int minWidth() {
    	return (int) MIN_WIDTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #minHeight()
    public VkQueueFamilyDataGraphOpticalFlowPropertiesARM minHeight(int minHeight) {
    	MIN_HEIGHT_HANDLE.set(segment, 0L, minHeight);
    	return this;
    }
    
    public int minHeight() {
    	return (int) MIN_HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxWidth()
    public VkQueueFamilyDataGraphOpticalFlowPropertiesARM maxWidth(int maxWidth) {
    	MAX_WIDTH_HANDLE.set(segment, 0L, maxWidth);
    	return this;
    }
    
    public int maxWidth() {
    	return (int) MAX_WIDTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxHeight()
    public VkQueueFamilyDataGraphOpticalFlowPropertiesARM maxHeight(int maxHeight) {
    	MAX_HEIGHT_HANDLE.set(segment, 0L, maxHeight);
    	return this;
    }
    
    public int maxHeight() {
    	return (int) MAX_HEIGHT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkQueueFamilyDataGraphOpticalFlowPropertiesARM set(VkQueueFamilyDataGraphOpticalFlowPropertiesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkQueueFamilyDataGraphOpticalFlowPropertiesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkQueueFamilyDataGraphOpticalFlowPropertiesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkQueueFamilyDataGraphOpticalFlowPropertiesARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkQueueFamilyDataGraphOpticalFlowPropertiesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkQueueFamilyDataGraphOpticalFlowPropertiesARM> array(SegmentAllocator allocator, VkQueueFamilyDataGraphOpticalFlowPropertiesARM... structs) {
        NativeStructArray<VkQueueFamilyDataGraphOpticalFlowPropertiesARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkQueueFamilyDataGraphOpticalFlowPropertiesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkQueueFamilyDataGraphOpticalFlowPropertiesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkQueueFamilyDataGraphOpticalFlowPropertiesARM(segment)
        );
    }

}