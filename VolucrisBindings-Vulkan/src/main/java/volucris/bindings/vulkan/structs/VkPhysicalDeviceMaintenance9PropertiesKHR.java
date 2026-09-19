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

public final class VkPhysicalDeviceMaintenance9PropertiesKHR
		implements Struct<VkPhysicalDeviceMaintenance9PropertiesKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle IMAGE2_DVIEW_OF3_DSPARSE_HANDLE;
    public static final VarHandle DEFAULT_VERTEX_ATTRIBUTE_VALUE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long IMAGE2_DVIEW_OF3_DSPARSE_BYTE_OFFSET;
    public static final long DEFAULT_VERTEX_ATTRIBUTE_VALUE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("image2DViewOf3DSparse"),
            JAVA_INT.withName("defaultVertexAttributeValue")
        ).withName("VkPhysicalDeviceMaintenance9PropertiesKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        IMAGE2_DVIEW_OF3_DSPARSE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("image2DViewOf3DSparse"));
        DEFAULT_VERTEX_ATTRIBUTE_VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("defaultVertexAttributeValue"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        IMAGE2_DVIEW_OF3_DSPARSE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("image2DViewOf3DSparse"));
        DEFAULT_VERTEX_ATTRIBUTE_VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("defaultVertexAttributeValue"));
        //@formatter:on
    }

    public VkPhysicalDeviceMaintenance9PropertiesKHR() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceMaintenance9PropertiesKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceMaintenance9PropertiesKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceMaintenance9PropertiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMaintenance9PropertiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #image2DViewOf3DSparse()
    public VkPhysicalDeviceMaintenance9PropertiesKHR image2DViewOf3DSparse(int image2DViewOf3DSparse) {
    	IMAGE2_DVIEW_OF3_DSPARSE_HANDLE.set(segment, 0L, image2DViewOf3DSparse);
    	return this;
    }
    
    public int image2DViewOf3DSparse() {
    	return (int) IMAGE2_DVIEW_OF3_DSPARSE_HANDLE.get(segment, 0L);
    }
    
    /// @see #defaultVertexAttributeValue()
    public VkPhysicalDeviceMaintenance9PropertiesKHR defaultVertexAttributeValue(int defaultVertexAttributeValue) {
    	DEFAULT_VERTEX_ATTRIBUTE_VALUE_HANDLE.set(segment, 0L, defaultVertexAttributeValue);
    	return this;
    }
    
    public int defaultVertexAttributeValue() {
    	return (int) DEFAULT_VERTEX_ATTRIBUTE_VALUE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance9PropertiesKHR set(VkPhysicalDeviceMaintenance9PropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance9PropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMaintenance9PropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance9PropertiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance9PropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance9PropertiesKHR> array(Arena arena, VkPhysicalDeviceMaintenance9PropertiesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceMaintenance9PropertiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance9PropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance9PropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance9PropertiesKHR(segment)
        );
    }
    
}