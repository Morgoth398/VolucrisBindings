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

public final class VkPhysicalDeviceLayeredDriverPropertiesMSFT
		implements Struct<VkPhysicalDeviceLayeredDriverPropertiesMSFT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle UNDERLYING_API_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long UNDERLYING_API_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("underlyingAPI"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceLayeredDriverPropertiesMSFT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        UNDERLYING_API_HANDLE = LAYOUT.varHandle(PathElement.groupElement("underlyingAPI"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        UNDERLYING_API_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("underlyingAPI"));
        //@formatter:on
    }

    public VkPhysicalDeviceLayeredDriverPropertiesMSFT() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #underlyingAPI()
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT underlyingAPI(int underlyingAPI) {
    	UNDERLYING_API_HANDLE.set(segment, 0L, underlyingAPI);
    	return this;
    }
    
    public int underlyingAPI() {
    	return (int) UNDERLYING_API_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT set(VkPhysicalDeviceLayeredDriverPropertiesMSFT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceLayeredDriverPropertiesMSFT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceLayeredDriverPropertiesMSFT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceLayeredDriverPropertiesMSFT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceLayeredDriverPropertiesMSFT> array(Arena arena, VkPhysicalDeviceLayeredDriverPropertiesMSFT... structs) {
        NativeStructArray<VkPhysicalDeviceLayeredDriverPropertiesMSFT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceLayeredDriverPropertiesMSFT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceLayeredDriverPropertiesMSFT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceLayeredDriverPropertiesMSFT(segment)
        );
    }
    
}