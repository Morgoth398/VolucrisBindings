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

public final class VkPhysicalDeviceMaintenance7FeaturesKHR
		implements Struct<VkPhysicalDeviceMaintenance7FeaturesKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAINTENANCE7_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAINTENANCE7_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maintenance7"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceMaintenance7FeaturesKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAINTENANCE7_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maintenance7"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAINTENANCE7_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maintenance7"));
        //@formatter:on
    }

    public VkPhysicalDeviceMaintenance7FeaturesKHR() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceMaintenance7FeaturesKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceMaintenance7FeaturesKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceMaintenance7FeaturesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMaintenance7FeaturesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maintenance7()
    public VkPhysicalDeviceMaintenance7FeaturesKHR maintenance7(int maintenance7) {
    	MAINTENANCE7_HANDLE.set(segment, 0L, maintenance7);
    	return this;
    }
    
    public int maintenance7() {
    	return (int) MAINTENANCE7_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance7FeaturesKHR set(VkPhysicalDeviceMaintenance7FeaturesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance7FeaturesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMaintenance7FeaturesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance7FeaturesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance7FeaturesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance7FeaturesKHR> array(Arena arena, VkPhysicalDeviceMaintenance7FeaturesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceMaintenance7FeaturesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance7FeaturesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance7FeaturesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance7FeaturesKHR(segment)
        );
    }
    
}