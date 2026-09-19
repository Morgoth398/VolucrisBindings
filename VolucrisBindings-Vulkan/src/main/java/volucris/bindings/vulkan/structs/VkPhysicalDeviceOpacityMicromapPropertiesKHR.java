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

public final class VkPhysicalDeviceOpacityMicromapPropertiesKHR
		implements Struct<VkPhysicalDeviceOpacityMicromapPropertiesKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_OPACITY2_STATE_SUBDIVISION_LEVEL_HANDLE;
    public static final VarHandle MAX_OPACITY4_STATE_SUBDIVISION_LEVEL_HANDLE;
    public static final VarHandle MAX_OPACITY_LOSSY4_STATE_SUBDIVISION_LEVEL_HANDLE;
    public static final VarHandle MAX_MICROMAP_TRIANGLES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_OPACITY2_STATE_SUBDIVISION_LEVEL_BYTE_OFFSET;
    public static final long MAX_OPACITY4_STATE_SUBDIVISION_LEVEL_BYTE_OFFSET;
    public static final long MAX_OPACITY_LOSSY4_STATE_SUBDIVISION_LEVEL_BYTE_OFFSET;
    public static final long MAX_MICROMAP_TRIANGLES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maxOpacity2StateSubdivisionLevel"),
            JAVA_INT.withName("maxOpacity4StateSubdivisionLevel"),
            JAVA_INT.withName("maxOpacityLossy4StateSubdivisionLevel"),
            MemoryLayout.paddingLayout(4),
            JAVA_LONG.withName("maxMicromapTriangles")
        ).withName("VkPhysicalDeviceOpacityMicromapPropertiesKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_OPACITY2_STATE_SUBDIVISION_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxOpacity2StateSubdivisionLevel"));
        MAX_OPACITY4_STATE_SUBDIVISION_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxOpacity4StateSubdivisionLevel"));
        MAX_OPACITY_LOSSY4_STATE_SUBDIVISION_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxOpacityLossy4StateSubdivisionLevel"));
        MAX_MICROMAP_TRIANGLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMicromapTriangles"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_OPACITY2_STATE_SUBDIVISION_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxOpacity2StateSubdivisionLevel"));
        MAX_OPACITY4_STATE_SUBDIVISION_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxOpacity4StateSubdivisionLevel"));
        MAX_OPACITY_LOSSY4_STATE_SUBDIVISION_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxOpacityLossy4StateSubdivisionLevel"));
        MAX_MICROMAP_TRIANGLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMicromapTriangles"));
        //@formatter:on
    }

    public VkPhysicalDeviceOpacityMicromapPropertiesKHR() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceOpacityMicromapPropertiesKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceOpacityMicromapPropertiesKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceOpacityMicromapPropertiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceOpacityMicromapPropertiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxOpacity2StateSubdivisionLevel()
    public VkPhysicalDeviceOpacityMicromapPropertiesKHR maxOpacity2StateSubdivisionLevel(int maxOpacity2StateSubdivisionLevel) {
    	MAX_OPACITY2_STATE_SUBDIVISION_LEVEL_HANDLE.set(segment, 0L, maxOpacity2StateSubdivisionLevel);
    	return this;
    }
    
    public int maxOpacity2StateSubdivisionLevel() {
    	return (int) MAX_OPACITY2_STATE_SUBDIVISION_LEVEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxOpacity4StateSubdivisionLevel()
    public VkPhysicalDeviceOpacityMicromapPropertiesKHR maxOpacity4StateSubdivisionLevel(int maxOpacity4StateSubdivisionLevel) {
    	MAX_OPACITY4_STATE_SUBDIVISION_LEVEL_HANDLE.set(segment, 0L, maxOpacity4StateSubdivisionLevel);
    	return this;
    }
    
    public int maxOpacity4StateSubdivisionLevel() {
    	return (int) MAX_OPACITY4_STATE_SUBDIVISION_LEVEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxOpacityLossy4StateSubdivisionLevel()
    public VkPhysicalDeviceOpacityMicromapPropertiesKHR maxOpacityLossy4StateSubdivisionLevel(int maxOpacityLossy4StateSubdivisionLevel) {
    	MAX_OPACITY_LOSSY4_STATE_SUBDIVISION_LEVEL_HANDLE.set(segment, 0L, maxOpacityLossy4StateSubdivisionLevel);
    	return this;
    }
    
    public int maxOpacityLossy4StateSubdivisionLevel() {
    	return (int) MAX_OPACITY_LOSSY4_STATE_SUBDIVISION_LEVEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMicromapTriangles()
    public VkPhysicalDeviceOpacityMicromapPropertiesKHR maxMicromapTriangles(long maxMicromapTriangles) {
    	MAX_MICROMAP_TRIANGLES_HANDLE.set(segment, 0L, maxMicromapTriangles);
    	return this;
    }
    
    public long maxMicromapTriangles() {
    	return (long) MAX_MICROMAP_TRIANGLES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceOpacityMicromapPropertiesKHR set(VkPhysicalDeviceOpacityMicromapPropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceOpacityMicromapPropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceOpacityMicromapPropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceOpacityMicromapPropertiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceOpacityMicromapPropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceOpacityMicromapPropertiesKHR> array(Arena arena, VkPhysicalDeviceOpacityMicromapPropertiesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceOpacityMicromapPropertiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceOpacityMicromapPropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceOpacityMicromapPropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceOpacityMicromapPropertiesKHR(segment)
        );
    }
    
}