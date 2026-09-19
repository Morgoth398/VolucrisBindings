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

public final class VkVideoDecodeAV1CapabilitiesKHR
		implements Struct<VkVideoDecodeAV1CapabilitiesKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_LEVEL_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_LEVEL_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maxLevel"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkVideoDecodeAV1CapabilitiesKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxLevel"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxLevel"));
        //@formatter:on
    }

    public VkVideoDecodeAV1CapabilitiesKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoDecodeAV1CapabilitiesKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoDecodeAV1CapabilitiesKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkVideoDecodeAV1CapabilitiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoDecodeAV1CapabilitiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxLevel()
    public VkVideoDecodeAV1CapabilitiesKHR maxLevel(int maxLevel) {
    	MAX_LEVEL_HANDLE.set(segment, 0L, maxLevel);
    	return this;
    }
    
    public int maxLevel() {
    	return (int) MAX_LEVEL_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoDecodeAV1CapabilitiesKHR set(VkVideoDecodeAV1CapabilitiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoDecodeAV1CapabilitiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoDecodeAV1CapabilitiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoDecodeAV1CapabilitiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoDecodeAV1CapabilitiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoDecodeAV1CapabilitiesKHR> array(Arena arena, VkVideoDecodeAV1CapabilitiesKHR... structs) {
        NativeStructArray<VkVideoDecodeAV1CapabilitiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoDecodeAV1CapabilitiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoDecodeAV1CapabilitiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoDecodeAV1CapabilitiesKHR(segment)
        );
    }
    
}