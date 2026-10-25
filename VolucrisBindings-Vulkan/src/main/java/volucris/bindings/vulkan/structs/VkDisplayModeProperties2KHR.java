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

public final class VkDisplayModeProperties2KHR
		implements Struct<VkDisplayModeProperties2KHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DISPLAY_MODE_PROPERTIES_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkDisplayModePropertiesKHR displayModeProperties;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkDisplayModePropertiesKHR.LAYOUT.withName("displayModeProperties")
		).withName("VkDisplayModeProperties2KHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DISPLAY_MODE_PROPERTIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("displayModeProperties"));
		//@formatter:on
	}

	public VkDisplayModeProperties2KHR() {
	    this(Arena.ofAuto());
	}
	
	public VkDisplayModeProperties2KHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDisplayModeProperties2KHR(MemorySegment segment) {
	    this.segment = segment;
	
	    displayModeProperties = new VkDisplayModePropertiesKHR(segment.asSlice(DISPLAY_MODE_PROPERTIES_BYTE_OFFSET, VkDisplayModePropertiesKHR.LAYOUT));
	}

    /// @see #sType()
    public VkDisplayModeProperties2KHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDisplayModeProperties2KHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #displayModeProperties()
    public VkDisplayModeProperties2KHR displayModeProperties(Consumer<VkDisplayModePropertiesKHR> consumer) {
    	consumer.accept(displayModeProperties);
    	return this;
    }
    
    /// @see #displayModeProperties()
    public VkDisplayModeProperties2KHR displayModeProperties(VkDisplayModePropertiesKHR other) {
    	displayModeProperties.set(other);
    	return this;
    }
    
    public VkDisplayModePropertiesKHR displayModeProperties() {
    	return displayModeProperties;
    }
    
    @Override
    public VkDisplayModeProperties2KHR set(VkDisplayModeProperties2KHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDisplayModeProperties2KHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDisplayModeProperties2KHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDisplayModeProperties2KHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDisplayModeProperties2KHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDisplayModeProperties2KHR> array(SegmentAllocator allocator, VkDisplayModeProperties2KHR... structs) {
        NativeStructArray<VkDisplayModeProperties2KHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDisplayModeProperties2KHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDisplayModeProperties2KHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDisplayModeProperties2KHR(segment)
        );
    }

}