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

public final class VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM
		implements Struct<VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADER_CORE_MASK_HANDLE;
	public static final VarHandle SHADER_CORE_COUNT_HANDLE;
	public static final VarHandle SHADER_WARPS_PER_CORE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADER_CORE_MASK_BYTE_OFFSET;
	public static final long SHADER_CORE_COUNT_BYTE_OFFSET;
	public static final long SHADER_WARPS_PER_CORE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("shaderCoreMask"),
		    JAVA_INT.withName("shaderCoreCount"),
		    JAVA_INT.withName("shaderWarpsPerCore")
		).withName("VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADER_CORE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderCoreMask"));
		SHADER_CORE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderCoreCount"));
		SHADER_WARPS_PER_CORE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderWarpsPerCore"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADER_CORE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderCoreMask"));
		SHADER_CORE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderCoreCount"));
		SHADER_WARPS_PER_CORE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderWarpsPerCore"));
		//@formatter:on
	}

	public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderCoreMask()
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM shaderCoreMask(long shaderCoreMask) {
    	SHADER_CORE_MASK_HANDLE.set(segment, 0L, shaderCoreMask);
    	return this;
    }
    
    public long shaderCoreMask() {
    	return (long) SHADER_CORE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderCoreCount()
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM shaderCoreCount(int shaderCoreCount) {
    	SHADER_CORE_COUNT_HANDLE.set(segment, 0L, shaderCoreCount);
    	return this;
    }
    
    public int shaderCoreCount() {
    	return (int) SHADER_CORE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderWarpsPerCore()
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM shaderWarpsPerCore(int shaderWarpsPerCore) {
    	SHADER_WARPS_PER_CORE_HANDLE.set(segment, 0L, shaderWarpsPerCore);
    	return this;
    }
    
    public int shaderWarpsPerCore() {
    	return (int) SHADER_WARPS_PER_CORE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM set(VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM> array(Arena arena, VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM... structs) {
        NativeStructArray<VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(segment)
        );
    }

}