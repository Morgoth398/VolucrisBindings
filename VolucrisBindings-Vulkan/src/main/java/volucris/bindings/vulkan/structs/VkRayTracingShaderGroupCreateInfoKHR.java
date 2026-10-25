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

public final class VkRayTracingShaderGroupCreateInfoKHR
		implements Struct<VkRayTracingShaderGroupCreateInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle TYPE_HANDLE;
	public static final VarHandle GENERAL_SHADER_HANDLE;
	public static final VarHandle CLOSEST_HIT_SHADER_HANDLE;
	public static final VarHandle ANY_HIT_SHADER_HANDLE;
	public static final VarHandle INTERSECTION_SHADER_HANDLE;
	public static final VarHandle P_SHADER_GROUP_CAPTURE_REPLAY_HANDLE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TYPE_BYTE_OFFSET;
	public static final long GENERAL_SHADER_BYTE_OFFSET;
	public static final long CLOSEST_HIT_SHADER_BYTE_OFFSET;
	public static final long ANY_HIT_SHADER_BYTE_OFFSET;
	public static final long INTERSECTION_SHADER_BYTE_OFFSET;
	public static final long P_SHADER_GROUP_CAPTURE_REPLAY_HANDLE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("type"),
		    JAVA_INT.withName("generalShader"),
		    JAVA_INT.withName("closestHitShader"),
		    JAVA_INT.withName("anyHitShader"),
		    JAVA_INT.withName("intersectionShader"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pShaderGroupCaptureReplayHandle")
		).withName("VkRayTracingShaderGroupCreateInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
		GENERAL_SHADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("generalShader"));
		CLOSEST_HIT_SHADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("closestHitShader"));
		ANY_HIT_SHADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("anyHitShader"));
		INTERSECTION_SHADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("intersectionShader"));
		P_SHADER_GROUP_CAPTURE_REPLAY_HANDLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pShaderGroupCaptureReplayHandle"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
		GENERAL_SHADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("generalShader"));
		CLOSEST_HIT_SHADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("closestHitShader"));
		ANY_HIT_SHADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("anyHitShader"));
		INTERSECTION_SHADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("intersectionShader"));
		P_SHADER_GROUP_CAPTURE_REPLAY_HANDLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pShaderGroupCaptureReplayHandle"));
		//@formatter:on
	}

	public VkRayTracingShaderGroupCreateInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkRayTracingShaderGroupCreateInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkRayTracingShaderGroupCreateInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkRayTracingShaderGroupCreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRayTracingShaderGroupCreateInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #type()
    public VkRayTracingShaderGroupCreateInfoKHR type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #generalShader()
    public VkRayTracingShaderGroupCreateInfoKHR generalShader(int generalShader) {
    	GENERAL_SHADER_HANDLE.set(segment, 0L, generalShader);
    	return this;
    }
    
    public int generalShader() {
    	return (int) GENERAL_SHADER_HANDLE.get(segment, 0L);
    }
    
    /// @see #closestHitShader()
    public VkRayTracingShaderGroupCreateInfoKHR closestHitShader(int closestHitShader) {
    	CLOSEST_HIT_SHADER_HANDLE.set(segment, 0L, closestHitShader);
    	return this;
    }
    
    public int closestHitShader() {
    	return (int) CLOSEST_HIT_SHADER_HANDLE.get(segment, 0L);
    }
    
    /// @see #anyHitShader()
    public VkRayTracingShaderGroupCreateInfoKHR anyHitShader(int anyHitShader) {
    	ANY_HIT_SHADER_HANDLE.set(segment, 0L, anyHitShader);
    	return this;
    }
    
    public int anyHitShader() {
    	return (int) ANY_HIT_SHADER_HANDLE.get(segment, 0L);
    }
    
    /// @see #intersectionShader()
    public VkRayTracingShaderGroupCreateInfoKHR intersectionShader(int intersectionShader) {
    	INTERSECTION_SHADER_HANDLE.set(segment, 0L, intersectionShader);
    	return this;
    }
    
    public int intersectionShader() {
    	return (int) INTERSECTION_SHADER_HANDLE.get(segment, 0L);
    }
    
    /// @see #pShaderGroupCaptureReplayHandle()
    public VkRayTracingShaderGroupCreateInfoKHR pShaderGroupCaptureReplayHandle(MemorySegment pShaderGroupCaptureReplayHandle) {
    	P_SHADER_GROUP_CAPTURE_REPLAY_HANDLE_HANDLE.set(segment, 0L, pShaderGroupCaptureReplayHandle);
    	return this;
    }
    
    public @Nullable MemorySegment pShaderGroupCaptureReplayHandle() {
    	MemorySegment segment = (MemorySegment) P_SHADER_GROUP_CAPTURE_REPLAY_HANDLE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VkRayTracingShaderGroupCreateInfoKHR set(VkRayTracingShaderGroupCreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkRayTracingShaderGroupCreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRayTracingShaderGroupCreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRayTracingShaderGroupCreateInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkRayTracingShaderGroupCreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRayTracingShaderGroupCreateInfoKHR> array(SegmentAllocator allocator, VkRayTracingShaderGroupCreateInfoKHR... structs) {
        NativeStructArray<VkRayTracingShaderGroupCreateInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkRayTracingShaderGroupCreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRayTracingShaderGroupCreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRayTracingShaderGroupCreateInfoKHR(segment)
        );
    }

}