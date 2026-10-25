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

public final class VkExternalTensorPropertiesARM
		implements Struct<VkExternalTensorPropertiesARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long EXTERNAL_MEMORY_PROPERTIES_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExternalMemoryProperties externalMemoryProperties;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkExternalMemoryProperties.LAYOUT.withName("externalMemoryProperties"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkExternalTensorPropertiesARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		EXTERNAL_MEMORY_PROPERTIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("externalMemoryProperties"));
		//@formatter:on
	}

	public VkExternalTensorPropertiesARM() {
	    this(Arena.ofAuto());
	}
	
	public VkExternalTensorPropertiesARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkExternalTensorPropertiesARM(MemorySegment segment) {
	    this.segment = segment;
	
	    externalMemoryProperties = new VkExternalMemoryProperties(segment.asSlice(EXTERNAL_MEMORY_PROPERTIES_BYTE_OFFSET, VkExternalMemoryProperties.LAYOUT));
	}

    /// @see #sType()
    public VkExternalTensorPropertiesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkExternalTensorPropertiesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #externalMemoryProperties()
    public VkExternalTensorPropertiesARM externalMemoryProperties(Consumer<VkExternalMemoryProperties> consumer) {
    	consumer.accept(externalMemoryProperties);
    	return this;
    }
    
    /// @see #externalMemoryProperties()
    public VkExternalTensorPropertiesARM externalMemoryProperties(VkExternalMemoryProperties other) {
    	externalMemoryProperties.set(other);
    	return this;
    }
    
    public VkExternalMemoryProperties externalMemoryProperties() {
    	return externalMemoryProperties;
    }
    
    @Override
    public VkExternalTensorPropertiesARM set(VkExternalTensorPropertiesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkExternalTensorPropertiesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkExternalTensorPropertiesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkExternalTensorPropertiesARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkExternalTensorPropertiesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkExternalTensorPropertiesARM> array(SegmentAllocator allocator, VkExternalTensorPropertiesARM... structs) {
        NativeStructArray<VkExternalTensorPropertiesARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkExternalTensorPropertiesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkExternalTensorPropertiesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkExternalTensorPropertiesARM(segment)
        );
    }

}