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

public final class VkFormatProperties2
		implements Struct<VkFormatProperties2> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FORMAT_PROPERTIES_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkFormatProperties formatProperties;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkFormatProperties.LAYOUT.withName("formatProperties"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkFormatProperties2").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FORMAT_PROPERTIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("formatProperties"));
		//@formatter:on
	}

	public VkFormatProperties2() {
	    this(Arena.ofAuto());
	}
	
	public VkFormatProperties2(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkFormatProperties2(MemorySegment segment) {
	    this.segment = segment;
	
	    formatProperties = new VkFormatProperties(segment.asSlice(FORMAT_PROPERTIES_BYTE_OFFSET, VkFormatProperties.LAYOUT));
	}

    /// @see #sType()
    public VkFormatProperties2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkFormatProperties2 pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #formatProperties()
    public VkFormatProperties2 formatProperties(Consumer<VkFormatProperties> consumer) {
    	consumer.accept(formatProperties);
    	return this;
    }
    
    /// @see #formatProperties()
    public VkFormatProperties2 formatProperties(VkFormatProperties other) {
    	formatProperties.set(other);
    	return this;
    }
    
    public VkFormatProperties formatProperties() {
    	return formatProperties;
    }
    
    @Override
    public VkFormatProperties2 set(VkFormatProperties2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkFormatProperties2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkFormatProperties2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkFormatProperties2> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkFormatProperties2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkFormatProperties2> array(Arena arena, VkFormatProperties2... structs) {
        NativeStructArray<VkFormatProperties2> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkFormatProperties2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkFormatProperties2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkFormatProperties2(segment)
        );
    }

}