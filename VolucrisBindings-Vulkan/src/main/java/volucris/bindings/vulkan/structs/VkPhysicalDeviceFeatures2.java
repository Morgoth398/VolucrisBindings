/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPhysicalDeviceFeatures2
		implements Struct<VkPhysicalDeviceFeatures2> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FEATURES_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkPhysicalDeviceFeatures features;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkPhysicalDeviceFeatures.LAYOUT.withName("features"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceFeatures2").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("features"));
        //@formatter:on
    }

    public VkPhysicalDeviceFeatures2() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceFeatures2(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceFeatures2(MemorySegment segment) {
        this.segment = segment;
    
        features = new VkPhysicalDeviceFeatures(segment.asSlice(FEATURES_BYTE_OFFSET, VkPhysicalDeviceFeatures.LAYOUT));
    }

    /// @see #sType()
    public VkPhysicalDeviceFeatures2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceFeatures2 pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #features()
    public VkPhysicalDeviceFeatures2 features(Consumer<VkPhysicalDeviceFeatures> consumer) {
    	consumer.accept(features);
    	return this;
    }
    
    /// @see #features()
    public VkPhysicalDeviceFeatures2 features(VkPhysicalDeviceFeatures other) {
    	features.set(other);
    	return this;
    }
    
    public VkPhysicalDeviceFeatures features() {
    	return features;
    }
    
    @Override
    public VkPhysicalDeviceFeatures2 set(VkPhysicalDeviceFeatures2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceFeatures2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceFeatures2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceFeatures2> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFeatures2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceFeatures2> array(Arena arena, VkPhysicalDeviceFeatures2... structs) {
        NativeStructArray<VkPhysicalDeviceFeatures2> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFeatures2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceFeatures2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceFeatures2(segment)
        );
    }
    
}