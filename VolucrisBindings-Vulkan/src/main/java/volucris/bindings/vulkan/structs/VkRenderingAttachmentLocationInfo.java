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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkRenderingAttachmentLocationInfo
		implements Struct<VkRenderingAttachmentLocationInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle COLOR_ATTACHMENT_COUNT_HANDLE;
    public static final VarHandle P_COLOR_ATTACHMENT_LOCATIONS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long COLOR_ATTACHMENT_COUNT_BYTE_OFFSET;
    public static final long P_COLOR_ATTACHMENT_LOCATIONS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("colorAttachmentCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pColorAttachmentLocations")
        ).withName("VkRenderingAttachmentLocationInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        COLOR_ATTACHMENT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("colorAttachmentCount"));
        P_COLOR_ATTACHMENT_LOCATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pColorAttachmentLocations"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        COLOR_ATTACHMENT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
        P_COLOR_ATTACHMENT_LOCATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachmentLocations"));
        //@formatter:on
    }

    public VkRenderingAttachmentLocationInfo() {
        this(Arena.ofAuto());
    }
    
    public VkRenderingAttachmentLocationInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkRenderingAttachmentLocationInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkRenderingAttachmentLocationInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRenderingAttachmentLocationInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #colorAttachmentCount()
    public VkRenderingAttachmentLocationInfo colorAttachmentCount(int colorAttachmentCount) {
    	COLOR_ATTACHMENT_COUNT_HANDLE.set(segment, 0L, colorAttachmentCount);
    	return this;
    }
    
    public int colorAttachmentCount() {
    	return (int) COLOR_ATTACHMENT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pColorAttachmentLocations()
    public VkRenderingAttachmentLocationInfo pColorAttachmentLocations(NativeIntArray pColorAttachmentLocations) {
    	P_COLOR_ATTACHMENT_LOCATIONS_HANDLE.set(segment, 0L, pColorAttachmentLocations.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pColorAttachmentLocations() {
    	MemorySegment segment = (MemorySegment) P_COLOR_ATTACHMENT_LOCATIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkRenderingAttachmentLocationInfo set(VkRenderingAttachmentLocationInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderingAttachmentLocationInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderingAttachmentLocationInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderingAttachmentLocationInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderingAttachmentLocationInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderingAttachmentLocationInfo> array(Arena arena, VkRenderingAttachmentLocationInfo... structs) {
        NativeStructArray<VkRenderingAttachmentLocationInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderingAttachmentLocationInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderingAttachmentLocationInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderingAttachmentLocationInfo(segment)
        );
    }
    
}