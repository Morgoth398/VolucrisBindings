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

public final class VkPhysicalDeviceImageProcessing2FeaturesQCOM
		implements Struct<VkPhysicalDeviceImageProcessing2FeaturesQCOM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle TEXTURE_BLOCK_MATCH2_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long TEXTURE_BLOCK_MATCH2_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("textureBlockMatch2"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceImageProcessing2FeaturesQCOM").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        TEXTURE_BLOCK_MATCH2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("textureBlockMatch2"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        TEXTURE_BLOCK_MATCH2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("textureBlockMatch2"));
        //@formatter:on
    }

    public VkPhysicalDeviceImageProcessing2FeaturesQCOM() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #textureBlockMatch2()
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM textureBlockMatch2(int textureBlockMatch2) {
    	TEXTURE_BLOCK_MATCH2_HANDLE.set(segment, 0L, textureBlockMatch2);
    	return this;
    }
    
    public int textureBlockMatch2() {
    	return (int) TEXTURE_BLOCK_MATCH2_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM set(VkPhysicalDeviceImageProcessing2FeaturesQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceImageProcessing2FeaturesQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageProcessing2FeaturesQCOM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageProcessing2FeaturesQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageProcessing2FeaturesQCOM> array(Arena arena, VkPhysicalDeviceImageProcessing2FeaturesQCOM... structs) {
        NativeStructArray<VkPhysicalDeviceImageProcessing2FeaturesQCOM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageProcessing2FeaturesQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageProcessing2FeaturesQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageProcessing2FeaturesQCOM(segment)
        );
    }
    
}