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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPhysicalDeviceMultiviewFeatures
		implements Struct<VkPhysicalDeviceMultiviewFeatures> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MULTIVIEW_HANDLE;
	public static final VarHandle MULTIVIEW_GEOMETRY_SHADER_HANDLE;
	public static final VarHandle MULTIVIEW_TESSELLATION_SHADER_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MULTIVIEW_BYTE_OFFSET;
	public static final long MULTIVIEW_GEOMETRY_SHADER_BYTE_OFFSET;
	public static final long MULTIVIEW_TESSELLATION_SHADER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("multiview"),
		    JAVA_INT.withName("multiviewGeometryShader"),
		    JAVA_INT.withName("multiviewTessellationShader"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceMultiviewFeatures").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MULTIVIEW_HANDLE = LAYOUT.varHandle(PathElement.groupElement("multiview"));
		MULTIVIEW_GEOMETRY_SHADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("multiviewGeometryShader"));
		MULTIVIEW_TESSELLATION_SHADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("multiviewTessellationShader"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MULTIVIEW_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("multiview"));
		MULTIVIEW_GEOMETRY_SHADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("multiviewGeometryShader"));
		MULTIVIEW_TESSELLATION_SHADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("multiviewTessellationShader"));
		//@formatter:on
	}

	public VkPhysicalDeviceMultiviewFeatures() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceMultiviewFeatures(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceMultiviewFeatures(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceMultiviewFeatures sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMultiviewFeatures pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #multiview()
    public VkPhysicalDeviceMultiviewFeatures multiview(int multiview) {
    	MULTIVIEW_HANDLE.set(segment, 0L, multiview);
    	return this;
    }
    
    public int multiview() {
    	return (int) MULTIVIEW_HANDLE.get(segment, 0L);
    }
    
    /// @see #multiviewGeometryShader()
    public VkPhysicalDeviceMultiviewFeatures multiviewGeometryShader(int multiviewGeometryShader) {
    	MULTIVIEW_GEOMETRY_SHADER_HANDLE.set(segment, 0L, multiviewGeometryShader);
    	return this;
    }
    
    public int multiviewGeometryShader() {
    	return (int) MULTIVIEW_GEOMETRY_SHADER_HANDLE.get(segment, 0L);
    }
    
    /// @see #multiviewTessellationShader()
    public VkPhysicalDeviceMultiviewFeatures multiviewTessellationShader(int multiviewTessellationShader) {
    	MULTIVIEW_TESSELLATION_SHADER_HANDLE.set(segment, 0L, multiviewTessellationShader);
    	return this;
    }
    
    public int multiviewTessellationShader() {
    	return (int) MULTIVIEW_TESSELLATION_SHADER_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceMultiviewFeatures set(VkPhysicalDeviceMultiviewFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMultiviewFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMultiviewFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMultiviewFeatures> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceMultiviewFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMultiviewFeatures> array(SegmentAllocator allocator, VkPhysicalDeviceMultiviewFeatures... structs) {
        NativeStructArray<VkPhysicalDeviceMultiviewFeatures> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceMultiviewFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMultiviewFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMultiviewFeatures(segment)
        );
    }

}