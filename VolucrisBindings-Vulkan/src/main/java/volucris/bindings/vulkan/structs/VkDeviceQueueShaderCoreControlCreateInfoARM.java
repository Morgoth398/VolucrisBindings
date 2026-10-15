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

public final class VkDeviceQueueShaderCoreControlCreateInfoARM
		implements Struct<VkDeviceQueueShaderCoreControlCreateInfoARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SHADER_CORE_COUNT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SHADER_CORE_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("shaderCoreCount"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDeviceQueueShaderCoreControlCreateInfoARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SHADER_CORE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderCoreCount"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SHADER_CORE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderCoreCount"));
		//@formatter:on
	}

	public VkDeviceQueueShaderCoreControlCreateInfoARM() {
	    this(Arena.ofAuto());
	}
	
	public VkDeviceQueueShaderCoreControlCreateInfoARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDeviceQueueShaderCoreControlCreateInfoARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDeviceQueueShaderCoreControlCreateInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceQueueShaderCoreControlCreateInfoARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderCoreCount()
    public VkDeviceQueueShaderCoreControlCreateInfoARM shaderCoreCount(int shaderCoreCount) {
    	SHADER_CORE_COUNT_HANDLE.set(segment, 0L, shaderCoreCount);
    	return this;
    }
    
    public int shaderCoreCount() {
    	return (int) SHADER_CORE_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDeviceQueueShaderCoreControlCreateInfoARM set(VkDeviceQueueShaderCoreControlCreateInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceQueueShaderCoreControlCreateInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceQueueShaderCoreControlCreateInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceQueueShaderCoreControlCreateInfoARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceQueueShaderCoreControlCreateInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceQueueShaderCoreControlCreateInfoARM> array(Arena arena, VkDeviceQueueShaderCoreControlCreateInfoARM... structs) {
        NativeStructArray<VkDeviceQueueShaderCoreControlCreateInfoARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceQueueShaderCoreControlCreateInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceQueueShaderCoreControlCreateInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceQueueShaderCoreControlCreateInfoARM(segment)
        );
    }

}