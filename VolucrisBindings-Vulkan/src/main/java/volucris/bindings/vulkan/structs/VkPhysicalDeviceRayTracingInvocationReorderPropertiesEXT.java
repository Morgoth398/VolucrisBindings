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

public final class VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT
		implements Struct<VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle RAY_TRACING_INVOCATION_REORDER_REORDERING_HINT_HANDLE;
	public static final VarHandle MAX_SHADER_BINDING_TABLE_RECORD_INDEX_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long RAY_TRACING_INVOCATION_REORDER_REORDERING_HINT_BYTE_OFFSET;
	public static final long MAX_SHADER_BINDING_TABLE_RECORD_INDEX_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("rayTracingInvocationReorderReorderingHint"),
		    JAVA_INT.withName("maxShaderBindingTableRecordIndex")
		).withName("VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		RAY_TRACING_INVOCATION_REORDER_REORDERING_HINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rayTracingInvocationReorderReorderingHint"));
		MAX_SHADER_BINDING_TABLE_RECORD_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxShaderBindingTableRecordIndex"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		RAY_TRACING_INVOCATION_REORDER_REORDERING_HINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rayTracingInvocationReorderReorderingHint"));
		MAX_SHADER_BINDING_TABLE_RECORD_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxShaderBindingTableRecordIndex"));
		//@formatter:on
	}

	public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #rayTracingInvocationReorderReorderingHint()
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT rayTracingInvocationReorderReorderingHint(int rayTracingInvocationReorderReorderingHint) {
    	RAY_TRACING_INVOCATION_REORDER_REORDERING_HINT_HANDLE.set(segment, 0L, rayTracingInvocationReorderReorderingHint);
    	return this;
    }
    
    public int rayTracingInvocationReorderReorderingHint() {
    	return (int) RAY_TRACING_INVOCATION_REORDER_REORDERING_HINT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxShaderBindingTableRecordIndex()
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT maxShaderBindingTableRecordIndex(int maxShaderBindingTableRecordIndex) {
    	MAX_SHADER_BINDING_TABLE_RECORD_INDEX_HANDLE.set(segment, 0L, maxShaderBindingTableRecordIndex);
    	return this;
    }
    
    public int maxShaderBindingTableRecordIndex() {
    	return (int) MAX_SHADER_BINDING_TABLE_RECORD_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT set(VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(segment)
        );
    }

}