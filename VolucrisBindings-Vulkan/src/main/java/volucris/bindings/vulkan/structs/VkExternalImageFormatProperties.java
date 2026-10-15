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

public final class VkExternalImageFormatProperties
		implements Struct<VkExternalImageFormatProperties> {

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
		).withName("VkExternalImageFormatProperties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		EXTERNAL_MEMORY_PROPERTIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("externalMemoryProperties"));
		//@formatter:on
	}

	public VkExternalImageFormatProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkExternalImageFormatProperties(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkExternalImageFormatProperties(MemorySegment segment) {
	    this.segment = segment;
	
	    externalMemoryProperties = new VkExternalMemoryProperties(segment.asSlice(EXTERNAL_MEMORY_PROPERTIES_BYTE_OFFSET, VkExternalMemoryProperties.LAYOUT));
	}

    /// @see #sType()
    public VkExternalImageFormatProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkExternalImageFormatProperties pNext(MemorySegment pNext) {
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
    public VkExternalImageFormatProperties externalMemoryProperties(Consumer<VkExternalMemoryProperties> consumer) {
    	consumer.accept(externalMemoryProperties);
    	return this;
    }
    
    /// @see #externalMemoryProperties()
    public VkExternalImageFormatProperties externalMemoryProperties(VkExternalMemoryProperties other) {
    	externalMemoryProperties.set(other);
    	return this;
    }
    
    public VkExternalMemoryProperties externalMemoryProperties() {
    	return externalMemoryProperties;
    }
    
    @Override
    public VkExternalImageFormatProperties set(VkExternalImageFormatProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkExternalImageFormatProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkExternalImageFormatProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkExternalImageFormatProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExternalImageFormatProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkExternalImageFormatProperties> array(Arena arena, VkExternalImageFormatProperties... structs) {
        NativeStructArray<VkExternalImageFormatProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExternalImageFormatProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkExternalImageFormatProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkExternalImageFormatProperties(segment)
        );
    }

}