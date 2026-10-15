/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
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

public final class VkPhysicalDevice4444FormatsFeaturesEXT
		implements Struct<VkPhysicalDevice4444FormatsFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FORMAT_A4_R4_G4_B4_HANDLE;
	public static final VarHandle FORMAT_A4_B4_G4_R4_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FORMAT_A4_R4_G4_B4_BYTE_OFFSET;
	public static final long FORMAT_A4_B4_G4_R4_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("formatA4R4G4B4"),
		    JAVA_INT.withName("formatA4B4G4R4")
		).withName("VkPhysicalDevice4444FormatsFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FORMAT_A4_R4_G4_B4_HANDLE = LAYOUT.varHandle(PathElement.groupElement("formatA4R4G4B4"));
		FORMAT_A4_B4_G4_R4_HANDLE = LAYOUT.varHandle(PathElement.groupElement("formatA4B4G4R4"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FORMAT_A4_R4_G4_B4_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("formatA4R4G4B4"));
		FORMAT_A4_B4_G4_R4_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("formatA4B4G4R4"));
		//@formatter:on
	}

	public VkPhysicalDevice4444FormatsFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDevice4444FormatsFeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDevice4444FormatsFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDevice4444FormatsFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDevice4444FormatsFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #formatA4R4G4B4()
    public VkPhysicalDevice4444FormatsFeaturesEXT formatA4R4G4B4(int formatA4R4G4B4) {
    	FORMAT_A4_R4_G4_B4_HANDLE.set(segment, 0L, formatA4R4G4B4);
    	return this;
    }
    
    public int formatA4R4G4B4() {
    	return (int) FORMAT_A4_R4_G4_B4_HANDLE.get(segment, 0L);
    }
    
    /// @see #formatA4B4G4R4()
    public VkPhysicalDevice4444FormatsFeaturesEXT formatA4B4G4R4(int formatA4B4G4R4) {
    	FORMAT_A4_B4_G4_R4_HANDLE.set(segment, 0L, formatA4B4G4R4);
    	return this;
    }
    
    public int formatA4B4G4R4() {
    	return (int) FORMAT_A4_B4_G4_R4_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDevice4444FormatsFeaturesEXT set(VkPhysicalDevice4444FormatsFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDevice4444FormatsFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDevice4444FormatsFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDevice4444FormatsFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevice4444FormatsFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDevice4444FormatsFeaturesEXT> array(Arena arena, VkPhysicalDevice4444FormatsFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDevice4444FormatsFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevice4444FormatsFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDevice4444FormatsFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDevice4444FormatsFeaturesEXT(segment)
        );
    }

}