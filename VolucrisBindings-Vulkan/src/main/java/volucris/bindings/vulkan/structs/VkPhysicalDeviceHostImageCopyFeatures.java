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

public final class VkPhysicalDeviceHostImageCopyFeatures
		implements Struct<VkPhysicalDeviceHostImageCopyFeatures> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle HOST_IMAGE_COPY_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long HOST_IMAGE_COPY_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("hostImageCopy"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceHostImageCopyFeatures").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        HOST_IMAGE_COPY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hostImageCopy"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        HOST_IMAGE_COPY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hostImageCopy"));
        //@formatter:on
    }

    public VkPhysicalDeviceHostImageCopyFeatures() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceHostImageCopyFeatures(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceHostImageCopyFeatures(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceHostImageCopyFeatures sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceHostImageCopyFeatures pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #hostImageCopy()
    public VkPhysicalDeviceHostImageCopyFeatures hostImageCopy(int hostImageCopy) {
    	HOST_IMAGE_COPY_HANDLE.set(segment, 0L, hostImageCopy);
    	return this;
    }
    
    public int hostImageCopy() {
    	return (int) HOST_IMAGE_COPY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceHostImageCopyFeatures set(VkPhysicalDeviceHostImageCopyFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceHostImageCopyFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceHostImageCopyFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceHostImageCopyFeatures> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceHostImageCopyFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceHostImageCopyFeatures> array(Arena arena, VkPhysicalDeviceHostImageCopyFeatures... structs) {
        NativeStructArray<VkPhysicalDeviceHostImageCopyFeatures> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceHostImageCopyFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceHostImageCopyFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceHostImageCopyFeatures(segment)
        );
    }
    
}