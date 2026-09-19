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

public final class VkPhysicalDeviceImageViewImageFormatInfoEXT
		implements Struct<VkPhysicalDeviceImageViewImageFormatInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle IMAGE_VIEW_TYPE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long IMAGE_VIEW_TYPE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("imageViewType"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceImageViewImageFormatInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        IMAGE_VIEW_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageViewType"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        IMAGE_VIEW_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageViewType"));
        //@formatter:on
    }

    public VkPhysicalDeviceImageViewImageFormatInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceImageViewImageFormatInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceImageViewImageFormatInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceImageViewImageFormatInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceImageViewImageFormatInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #imageViewType()
    public VkPhysicalDeviceImageViewImageFormatInfoEXT imageViewType(int imageViewType) {
    	IMAGE_VIEW_TYPE_HANDLE.set(segment, 0L, imageViewType);
    	return this;
    }
    
    public int imageViewType() {
    	return (int) IMAGE_VIEW_TYPE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceImageViewImageFormatInfoEXT set(VkPhysicalDeviceImageViewImageFormatInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceImageViewImageFormatInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceImageViewImageFormatInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageViewImageFormatInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageViewImageFormatInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageViewImageFormatInfoEXT> array(Arena arena, VkPhysicalDeviceImageViewImageFormatInfoEXT... structs) {
        NativeStructArray<VkPhysicalDeviceImageViewImageFormatInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageViewImageFormatInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageViewImageFormatInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageViewImageFormatInfoEXT(segment)
        );
    }
    
}