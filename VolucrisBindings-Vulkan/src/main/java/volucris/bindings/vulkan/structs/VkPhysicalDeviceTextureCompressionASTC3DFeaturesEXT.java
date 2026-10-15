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

public final class VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT
		implements Struct<VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle TEXTURE_COMPRESSION_ASTC_3_D_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TEXTURE_COMPRESSION_ASTC_3_D_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("textureCompressionASTC_3D"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		TEXTURE_COMPRESSION_ASTC_3_D_HANDLE = LAYOUT.varHandle(PathElement.groupElement("textureCompressionASTC_3D"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TEXTURE_COMPRESSION_ASTC_3_D_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("textureCompressionASTC_3D"));
		//@formatter:on
	}

	public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #textureCompressionASTC_3D()
    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT textureCompressionASTC_3D(int textureCompressionASTC_3D) {
    	TEXTURE_COMPRESSION_ASTC_3_D_HANDLE.set(segment, 0L, textureCompressionASTC_3D);
    	return this;
    }
    
    public int textureCompressionASTC_3D() {
    	return (int) TEXTURE_COMPRESSION_ASTC_3_D_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT set(VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT> array(Arena arena, VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(segment)
        );
    }

}