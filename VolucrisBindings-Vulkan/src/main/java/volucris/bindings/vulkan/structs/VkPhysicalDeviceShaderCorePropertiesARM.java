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

public final class VkPhysicalDeviceShaderCorePropertiesARM
		implements Struct<VkPhysicalDeviceShaderCorePropertiesARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PIXEL_RATE_HANDLE;
	public static final VarHandle TEXEL_RATE_HANDLE;
	public static final VarHandle FMA_RATE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PIXEL_RATE_BYTE_OFFSET;
	public static final long TEXEL_RATE_BYTE_OFFSET;
	public static final long FMA_RATE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("pixelRate"),
		    JAVA_INT.withName("texelRate"),
		    JAVA_INT.withName("fmaRate"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceShaderCorePropertiesARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PIXEL_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pixelRate"));
		TEXEL_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("texelRate"));
		FMA_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fmaRate"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PIXEL_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pixelRate"));
		TEXEL_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("texelRate"));
		FMA_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fmaRate"));
		//@formatter:on
	}

	public VkPhysicalDeviceShaderCorePropertiesARM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceShaderCorePropertiesARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceShaderCorePropertiesARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceShaderCorePropertiesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderCorePropertiesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pixelRate()
    public VkPhysicalDeviceShaderCorePropertiesARM pixelRate(int pixelRate) {
    	PIXEL_RATE_HANDLE.set(segment, 0L, pixelRate);
    	return this;
    }
    
    public int pixelRate() {
    	return (int) PIXEL_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #texelRate()
    public VkPhysicalDeviceShaderCorePropertiesARM texelRate(int texelRate) {
    	TEXEL_RATE_HANDLE.set(segment, 0L, texelRate);
    	return this;
    }
    
    public int texelRate() {
    	return (int) TEXEL_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #fmaRate()
    public VkPhysicalDeviceShaderCorePropertiesARM fmaRate(int fmaRate) {
    	FMA_RATE_HANDLE.set(segment, 0L, fmaRate);
    	return this;
    }
    
    public int fmaRate() {
    	return (int) FMA_RATE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderCorePropertiesARM set(VkPhysicalDeviceShaderCorePropertiesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderCorePropertiesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderCorePropertiesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderCorePropertiesARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderCorePropertiesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderCorePropertiesARM> array(Arena arena, VkPhysicalDeviceShaderCorePropertiesARM... structs) {
        NativeStructArray<VkPhysicalDeviceShaderCorePropertiesARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderCorePropertiesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderCorePropertiesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderCorePropertiesARM(segment)
        );
    }

}