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

public final class VkDisplayProperties2KHR
		implements Struct<VkDisplayProperties2KHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DISPLAY_PROPERTIES_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkDisplayPropertiesKHR displayProperties;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkDisplayPropertiesKHR.LAYOUT.withName("displayProperties")
		).withName("VkDisplayProperties2KHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DISPLAY_PROPERTIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("displayProperties"));
		//@formatter:on
	}

	public VkDisplayProperties2KHR() {
	    this(Arena.ofAuto());
	}
	
	public VkDisplayProperties2KHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDisplayProperties2KHR(MemorySegment segment) {
	    this.segment = segment;
	
	    displayProperties = new VkDisplayPropertiesKHR(segment.asSlice(DISPLAY_PROPERTIES_BYTE_OFFSET, VkDisplayPropertiesKHR.LAYOUT));
	}

    /// @see #sType()
    public VkDisplayProperties2KHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDisplayProperties2KHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #displayProperties()
    public VkDisplayProperties2KHR displayProperties(Consumer<VkDisplayPropertiesKHR> consumer) {
    	consumer.accept(displayProperties);
    	return this;
    }
    
    /// @see #displayProperties()
    public VkDisplayProperties2KHR displayProperties(VkDisplayPropertiesKHR other) {
    	displayProperties.set(other);
    	return this;
    }
    
    public VkDisplayPropertiesKHR displayProperties() {
    	return displayProperties;
    }
    
    @Override
    public VkDisplayProperties2KHR set(VkDisplayProperties2KHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDisplayProperties2KHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDisplayProperties2KHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDisplayProperties2KHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDisplayProperties2KHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDisplayProperties2KHR> array(SegmentAllocator allocator, VkDisplayProperties2KHR... structs) {
        NativeStructArray<VkDisplayProperties2KHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDisplayProperties2KHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDisplayProperties2KHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDisplayProperties2KHR(segment)
        );
    }

}