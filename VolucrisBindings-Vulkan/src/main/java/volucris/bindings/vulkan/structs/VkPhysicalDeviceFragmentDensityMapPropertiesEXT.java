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

public final class VkPhysicalDeviceFragmentDensityMapPropertiesEXT
		implements Struct<VkPhysicalDeviceFragmentDensityMapPropertiesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FRAGMENT_DENSITY_INVOCATIONS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MIN_FRAGMENT_DENSITY_TEXEL_SIZE_BYTE_OFFSET;
    public static final long MAX_FRAGMENT_DENSITY_TEXEL_SIZE_BYTE_OFFSET;
    public static final long FRAGMENT_DENSITY_INVOCATIONS_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkExtent2D minFragmentDensityTexelSize;
    private final VkExtent2D maxFragmentDensityTexelSize;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkExtent2D.LAYOUT.withName("minFragmentDensityTexelSize"),
            VkExtent2D.LAYOUT.withName("maxFragmentDensityTexelSize"),
            JAVA_INT.withName("fragmentDensityInvocations"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceFragmentDensityMapPropertiesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FRAGMENT_DENSITY_INVOCATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentDensityInvocations"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MIN_FRAGMENT_DENSITY_TEXEL_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minFragmentDensityTexelSize"));
        MAX_FRAGMENT_DENSITY_TEXEL_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentDensityTexelSize"));
        FRAGMENT_DENSITY_INVOCATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityInvocations"));
        //@formatter:on
    }

    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
    
        minFragmentDensityTexelSize = new VkExtent2D(segment.asSlice(MIN_FRAGMENT_DENSITY_TEXEL_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
        maxFragmentDensityTexelSize = new VkExtent2D(segment.asSlice(MAX_FRAGMENT_DENSITY_TEXEL_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
    }

    /// @see #sType()
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #fragmentDensityInvocations()
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT fragmentDensityInvocations(int fragmentDensityInvocations) {
    	FRAGMENT_DENSITY_INVOCATIONS_HANDLE.set(segment, 0L, fragmentDensityInvocations);
    	return this;
    }
    
    public int fragmentDensityInvocations() {
    	return (int) FRAGMENT_DENSITY_INVOCATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #minFragmentDensityTexelSize()
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT minFragmentDensityTexelSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(minFragmentDensityTexelSize);
    	return this;
    }
    
    /// @see #minFragmentDensityTexelSize()
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT minFragmentDensityTexelSize(VkExtent2D other) {
    	minFragmentDensityTexelSize.set(other);
    	return this;
    }
    
    public VkExtent2D minFragmentDensityTexelSize() {
    	return minFragmentDensityTexelSize;
    }
    
    /// @see #maxFragmentDensityTexelSize()
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT maxFragmentDensityTexelSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxFragmentDensityTexelSize);
    	return this;
    }
    
    /// @see #maxFragmentDensityTexelSize()
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT maxFragmentDensityTexelSize(VkExtent2D other) {
    	maxFragmentDensityTexelSize.set(other);
    	return this;
    }
    
    public VkExtent2D maxFragmentDensityTexelSize() {
    	return maxFragmentDensityTexelSize;
    }
    
    @Override
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT set(VkPhysicalDeviceFragmentDensityMapPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceFragmentDensityMapPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentDensityMapPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentDensityMapPropertiesEXT> array(Arena arena, VkPhysicalDeviceFragmentDensityMapPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceFragmentDensityMapPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentDensityMapPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(segment)
        );
    }
    
}