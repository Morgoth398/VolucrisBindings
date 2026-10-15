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

public final class VkSamplerCustomBorderColorCreateInfoEXT
		implements Struct<VkSamplerCustomBorderColorCreateInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FORMAT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long CUSTOM_BORDER_COLOR_BYTE_OFFSET;
	public static final long FORMAT_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkClearColorValue customBorderColor;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkClearColorValue.LAYOUT.withName("customBorderColor"),
		    JAVA_INT.withName("format"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkSamplerCustomBorderColorCreateInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		CUSTOM_BORDER_COLOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("customBorderColor"));
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		//@formatter:on
	}

	public VkSamplerCustomBorderColorCreateInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkSamplerCustomBorderColorCreateInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkSamplerCustomBorderColorCreateInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	    customBorderColor = new VkClearColorValue(segment.asSlice(CUSTOM_BORDER_COLOR_BYTE_OFFSET, VkClearColorValue.LAYOUT));
	}

    /// @see #sType()
    public VkSamplerCustomBorderColorCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSamplerCustomBorderColorCreateInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #customBorderColor()
    public VkSamplerCustomBorderColorCreateInfoEXT customBorderColor(Consumer<VkClearColorValue> consumer) {
    	consumer.accept(customBorderColor);
    	return this;
    }
    
    /// @see #customBorderColor()
    public VkSamplerCustomBorderColorCreateInfoEXT customBorderColor(VkClearColorValue other) {
    	customBorderColor.set(other);
    	return this;
    }
    
    public VkClearColorValue customBorderColor() {
    	return customBorderColor;
    }
    
    /// @see #format()
    public VkSamplerCustomBorderColorCreateInfoEXT format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSamplerCustomBorderColorCreateInfoEXT set(VkSamplerCustomBorderColorCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkSamplerCustomBorderColorCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSamplerCustomBorderColorCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSamplerCustomBorderColorCreateInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSamplerCustomBorderColorCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSamplerCustomBorderColorCreateInfoEXT> array(Arena arena, VkSamplerCustomBorderColorCreateInfoEXT... structs) {
        NativeStructArray<VkSamplerCustomBorderColorCreateInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSamplerCustomBorderColorCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSamplerCustomBorderColorCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSamplerCustomBorderColorCreateInfoEXT(segment)
        );
    }

}