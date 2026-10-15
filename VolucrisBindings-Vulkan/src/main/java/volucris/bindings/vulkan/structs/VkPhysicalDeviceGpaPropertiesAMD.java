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

public final class VkPhysicalDeviceGpaPropertiesAMD
		implements Struct<VkPhysicalDeviceGpaPropertiesAMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle MAX_SQTT_SE_BUFFER_SIZE_HANDLE;
	public static final VarHandle SHADER_ENGINE_COUNT_HANDLE;
	public static final VarHandle PERF_BLOCK_COUNT_HANDLE;
	public static final VarHandle P_PERF_BLOCKS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long MAX_SQTT_SE_BUFFER_SIZE_BYTE_OFFSET;
	public static final long SHADER_ENGINE_COUNT_BYTE_OFFSET;
	public static final long PERF_BLOCK_COUNT_BYTE_OFFSET;
	public static final long P_PERF_BLOCKS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("maxSqttSeBufferSize"),
		    JAVA_INT.withName("shaderEngineCount"),
		    JAVA_INT.withName("perfBlockCount"),
		    UNBOUNDED_ADDRESS.withName("pPerfBlocks")
		).withName("VkPhysicalDeviceGpaPropertiesAMD").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		MAX_SQTT_SE_BUFFER_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSqttSeBufferSize"));
		SHADER_ENGINE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderEngineCount"));
		PERF_BLOCK_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("perfBlockCount"));
		P_PERF_BLOCKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPerfBlocks"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		MAX_SQTT_SE_BUFFER_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSqttSeBufferSize"));
		SHADER_ENGINE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderEngineCount"));
		PERF_BLOCK_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("perfBlockCount"));
		P_PERF_BLOCKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPerfBlocks"));
		//@formatter:on
	}

	public VkPhysicalDeviceGpaPropertiesAMD() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceGpaPropertiesAMD(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceGpaPropertiesAMD(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceGpaPropertiesAMD sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceGpaPropertiesAMD pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkPhysicalDeviceGpaPropertiesAMD flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSqttSeBufferSize()
    public VkPhysicalDeviceGpaPropertiesAMD maxSqttSeBufferSize(long maxSqttSeBufferSize) {
    	MAX_SQTT_SE_BUFFER_SIZE_HANDLE.set(segment, 0L, maxSqttSeBufferSize);
    	return this;
    }
    
    public long maxSqttSeBufferSize() {
    	return (long) MAX_SQTT_SE_BUFFER_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderEngineCount()
    public VkPhysicalDeviceGpaPropertiesAMD shaderEngineCount(int shaderEngineCount) {
    	SHADER_ENGINE_COUNT_HANDLE.set(segment, 0L, shaderEngineCount);
    	return this;
    }
    
    public int shaderEngineCount() {
    	return (int) SHADER_ENGINE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #perfBlockCount()
    public VkPhysicalDeviceGpaPropertiesAMD perfBlockCount(int perfBlockCount) {
    	PERF_BLOCK_COUNT_HANDLE.set(segment, 0L, perfBlockCount);
    	return this;
    }
    
    public int perfBlockCount() {
    	return (int) PERF_BLOCK_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPerfBlocks()
    public VkPhysicalDeviceGpaPropertiesAMD pPerfBlocks(NativeStructArray<VkGpaPerfBlockPropertiesAMD> pPerfBlocks) {
    	P_PERF_BLOCKS_HANDLE.set(segment, 0L, pPerfBlocks.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkGpaPerfBlockPropertiesAMD> pPerfBlocks() {
    	MemorySegment segment = (MemorySegment) P_PERF_BLOCKS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkGpaPerfBlockPropertiesAMD.array(segment);
    }
    
    @Override
    public VkPhysicalDeviceGpaPropertiesAMD set(VkPhysicalDeviceGpaPropertiesAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceGpaPropertiesAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceGpaPropertiesAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceGpaPropertiesAMD> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceGpaPropertiesAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceGpaPropertiesAMD> array(Arena arena, VkPhysicalDeviceGpaPropertiesAMD... structs) {
        NativeStructArray<VkPhysicalDeviceGpaPropertiesAMD> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceGpaPropertiesAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceGpaPropertiesAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceGpaPropertiesAMD(segment)
        );
    }

}