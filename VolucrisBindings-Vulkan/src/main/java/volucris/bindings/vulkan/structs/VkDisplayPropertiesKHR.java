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

public final class VkDisplayPropertiesKHR
		implements Struct<VkDisplayPropertiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle DISPLAY_HANDLE;
	public static final VarHandle DISPLAY_NAME_HANDLE;
	public static final VarHandle SUPPORTED_TRANSFORMS_HANDLE;
	public static final VarHandle PLANE_REORDER_POSSIBLE_HANDLE;
	public static final VarHandle PERSISTENT_CONTENT_HANDLE;

	public static final long DISPLAY_BYTE_OFFSET;
	public static final long DISPLAY_NAME_BYTE_OFFSET;
	public static final long PHYSICAL_DIMENSIONS_BYTE_OFFSET;
	public static final long PHYSICAL_RESOLUTION_BYTE_OFFSET;
	public static final long SUPPORTED_TRANSFORMS_BYTE_OFFSET;
	public static final long PLANE_REORDER_POSSIBLE_BYTE_OFFSET;
	public static final long PERSISTENT_CONTENT_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent2D physicalDimensions;
	private final VkExtent2D physicalResolution;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("display"),
		    UNBOUNDED_ADDRESS.withName("displayName"),
		    VkExtent2D.LAYOUT.withName("physicalDimensions"),
		    VkExtent2D.LAYOUT.withName("physicalResolution"),
		    JAVA_INT.withName("supportedTransforms"),
		    JAVA_INT.withName("planeReorderPossible"),
		    JAVA_INT.withName("persistentContent"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDisplayPropertiesKHR").withByteAlignment(8);
		
		DISPLAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("display"));
		DISPLAY_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("displayName"));
		SUPPORTED_TRANSFORMS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedTransforms"));
		PLANE_REORDER_POSSIBLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("planeReorderPossible"));
		PERSISTENT_CONTENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("persistentContent"));
		
		DISPLAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("display"));
		DISPLAY_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("displayName"));
		PHYSICAL_DIMENSIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("physicalDimensions"));
		PHYSICAL_RESOLUTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("physicalResolution"));
		SUPPORTED_TRANSFORMS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedTransforms"));
		PLANE_REORDER_POSSIBLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("planeReorderPossible"));
		PERSISTENT_CONTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("persistentContent"));
		//@formatter:on
	}

	public VkDisplayPropertiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkDisplayPropertiesKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDisplayPropertiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    physicalDimensions = new VkExtent2D(segment.asSlice(PHYSICAL_DIMENSIONS_BYTE_OFFSET, VkExtent2D.LAYOUT));
	    physicalResolution = new VkExtent2D(segment.asSlice(PHYSICAL_RESOLUTION_BYTE_OFFSET, VkExtent2D.LAYOUT));
	}

    /// @see #display()
    public VkDisplayPropertiesKHR display(VkDisplayKHR display) {
    	DISPLAY_HANDLE.set(segment, 0L, display.memorySegment());
    	return this;
    }
    
    public @Nullable VkDisplayKHR display() {
    	MemorySegment segment = (MemorySegment) DISPLAY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDisplayKHR(segment);
    }
    
    /// @see #displayName()
    public VkDisplayPropertiesKHR displayName(Arena arena, String displayName) {
    	DISPLAY_NAME_HANDLE.set(segment, 0L, arena.allocateFrom(displayName));
    	return this;
    }
    
    public @Nullable String displayName() {
    	MemorySegment segment = (MemorySegment) DISPLAY_NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// @see #physicalDimensions()
    public VkDisplayPropertiesKHR physicalDimensions(Consumer<VkExtent2D> consumer) {
    	consumer.accept(physicalDimensions);
    	return this;
    }
    
    /// @see #physicalDimensions()
    public VkDisplayPropertiesKHR physicalDimensions(VkExtent2D other) {
    	physicalDimensions.set(other);
    	return this;
    }
    
    public VkExtent2D physicalDimensions() {
    	return physicalDimensions;
    }
    
    /// @see #physicalResolution()
    public VkDisplayPropertiesKHR physicalResolution(Consumer<VkExtent2D> consumer) {
    	consumer.accept(physicalResolution);
    	return this;
    }
    
    /// @see #physicalResolution()
    public VkDisplayPropertiesKHR physicalResolution(VkExtent2D other) {
    	physicalResolution.set(other);
    	return this;
    }
    
    public VkExtent2D physicalResolution() {
    	return physicalResolution;
    }
    
    /// @see #supportedTransforms()
    public VkDisplayPropertiesKHR supportedTransforms(int supportedTransforms) {
    	SUPPORTED_TRANSFORMS_HANDLE.set(segment, 0L, supportedTransforms);
    	return this;
    }
    
    public int supportedTransforms() {
    	return (int) SUPPORTED_TRANSFORMS_HANDLE.get(segment, 0L);
    }
    
    /// @see #planeReorderPossible()
    public VkDisplayPropertiesKHR planeReorderPossible(int planeReorderPossible) {
    	PLANE_REORDER_POSSIBLE_HANDLE.set(segment, 0L, planeReorderPossible);
    	return this;
    }
    
    public int planeReorderPossible() {
    	return (int) PLANE_REORDER_POSSIBLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #persistentContent()
    public VkDisplayPropertiesKHR persistentContent(int persistentContent) {
    	PERSISTENT_CONTENT_HANDLE.set(segment, 0L, persistentContent);
    	return this;
    }
    
    public int persistentContent() {
    	return (int) PERSISTENT_CONTENT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDisplayPropertiesKHR set(VkDisplayPropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDisplayPropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDisplayPropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDisplayPropertiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplayPropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDisplayPropertiesKHR> array(Arena arena, VkDisplayPropertiesKHR... structs) {
        NativeStructArray<VkDisplayPropertiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplayPropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDisplayPropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDisplayPropertiesKHR(segment)
        );
    }

}