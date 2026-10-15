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

public final class VkPhysicalDeviceImage2DViewOf3DFeaturesEXT
		implements Struct<VkPhysicalDeviceImage2DViewOf3DFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle IMAGE2_DVIEW_OF3_D_HANDLE;
	public static final VarHandle SAMPLER2_DVIEW_OF3_D_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long IMAGE2_DVIEW_OF3_D_BYTE_OFFSET;
	public static final long SAMPLER2_DVIEW_OF3_D_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("image2DViewOf3D"),
		    JAVA_INT.withName("sampler2DViewOf3D")
		).withName("VkPhysicalDeviceImage2DViewOf3DFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		IMAGE2_DVIEW_OF3_D_HANDLE = LAYOUT.varHandle(PathElement.groupElement("image2DViewOf3D"));
		SAMPLER2_DVIEW_OF3_D_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampler2DViewOf3D"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		IMAGE2_DVIEW_OF3_D_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("image2DViewOf3D"));
		SAMPLER2_DVIEW_OF3_D_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampler2DViewOf3D"));
		//@formatter:on
	}

	public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #image2DViewOf3D()
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT image2DViewOf3D(int image2DViewOf3D) {
    	IMAGE2_DVIEW_OF3_D_HANDLE.set(segment, 0L, image2DViewOf3D);
    	return this;
    }
    
    public int image2DViewOf3D() {
    	return (int) IMAGE2_DVIEW_OF3_D_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampler2DViewOf3D()
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT sampler2DViewOf3D(int sampler2DViewOf3D) {
    	SAMPLER2_DVIEW_OF3_D_HANDLE.set(segment, 0L, sampler2DViewOf3D);
    	return this;
    }
    
    public int sampler2DViewOf3D() {
    	return (int) SAMPLER2_DVIEW_OF3_D_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT set(VkPhysicalDeviceImage2DViewOf3DFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceImage2DViewOf3DFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceImage2DViewOf3DFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceImage2DViewOf3DFeaturesEXT> array(Arena arena, VkPhysicalDeviceImage2DViewOf3DFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceImage2DViewOf3DFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceImage2DViewOf3DFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(segment)
        );
    }

}