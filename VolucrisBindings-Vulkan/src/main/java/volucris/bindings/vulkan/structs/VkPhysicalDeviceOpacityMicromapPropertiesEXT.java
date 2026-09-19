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

public final class VkPhysicalDeviceOpacityMicromapPropertiesEXT
		implements Struct<VkPhysicalDeviceOpacityMicromapPropertiesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_OPACITY2_STATE_SUBDIVISION_LEVEL_HANDLE;
    public static final VarHandle MAX_OPACITY4_STATE_SUBDIVISION_LEVEL_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_OPACITY2_STATE_SUBDIVISION_LEVEL_BYTE_OFFSET;
    public static final long MAX_OPACITY4_STATE_SUBDIVISION_LEVEL_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maxOpacity2StateSubdivisionLevel"),
            JAVA_INT.withName("maxOpacity4StateSubdivisionLevel")
        ).withName("VkPhysicalDeviceOpacityMicromapPropertiesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_OPACITY2_STATE_SUBDIVISION_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxOpacity2StateSubdivisionLevel"));
        MAX_OPACITY4_STATE_SUBDIVISION_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxOpacity4StateSubdivisionLevel"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_OPACITY2_STATE_SUBDIVISION_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxOpacity2StateSubdivisionLevel"));
        MAX_OPACITY4_STATE_SUBDIVISION_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxOpacity4StateSubdivisionLevel"));
        //@formatter:on
    }

    public VkPhysicalDeviceOpacityMicromapPropertiesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT pNext(MemorySegment pNext) {
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
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT maxOpacity2StateSubdivisionLevel(int maxOpacity2StateSubdivisionLevel) {
    	MAX_OPACITY2_STATE_SUBDIVISION_LEVEL_HANDLE.set(segment, 0L, maxOpacity2StateSubdivisionLevel);
    	return this;
    }
    
    public int maxOpacity2StateSubdivisionLevel() {
    	return (int) MAX_OPACITY2_STATE_SUBDIVISION_LEVEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxOpacity4StateSubdivisionLevel()
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT maxOpacity4StateSubdivisionLevel(int maxOpacity4StateSubdivisionLevel) {
    	MAX_OPACITY4_STATE_SUBDIVISION_LEVEL_HANDLE.set(segment, 0L, maxOpacity4StateSubdivisionLevel);
    	return this;
    }
    
    public int maxOpacity4StateSubdivisionLevel() {
    	return (int) MAX_OPACITY4_STATE_SUBDIVISION_LEVEL_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT set(VkPhysicalDeviceOpacityMicromapPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceOpacityMicromapPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceOpacityMicromapPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceOpacityMicromapPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceOpacityMicromapPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceOpacityMicromapPropertiesEXT> array(Arena arena, VkPhysicalDeviceOpacityMicromapPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceOpacityMicromapPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceOpacityMicromapPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceOpacityMicromapPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceOpacityMicromapPropertiesEXT(segment)
        );
    }
    
}