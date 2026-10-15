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

public final class VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT
		implements Struct<VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle LEGACY_VERTEX_ATTRIBUTES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long LEGACY_VERTEX_ATTRIBUTES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("legacyVertexAttributes"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		LEGACY_VERTEX_ATTRIBUTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("legacyVertexAttributes"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		LEGACY_VERTEX_ATTRIBUTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("legacyVertexAttributes"));
		//@formatter:on
	}

	public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #legacyVertexAttributes()
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT legacyVertexAttributes(int legacyVertexAttributes) {
    	LEGACY_VERTEX_ATTRIBUTES_HANDLE.set(segment, 0L, legacyVertexAttributes);
    	return this;
    }
    
    public int legacyVertexAttributes() {
    	return (int) LEGACY_VERTEX_ATTRIBUTES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT set(VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT> array(Arena arena, VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(segment)
        );
    }

}