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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkSubpassSampleLocationsEXT
		implements Struct<VkSubpassSampleLocationsEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle SUBPASS_INDEX_HANDLE;

    public static final long SUBPASS_INDEX_BYTE_OFFSET;
    public static final long SAMPLE_LOCATIONS_INFO_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkSampleLocationsInfoEXT sampleLocationsInfo;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("subpassIndex"),
            MemoryLayout.paddingLayout(4),
            VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
        ).withName("VkSubpassSampleLocationsEXT").withByteAlignment(8);
        
        SUBPASS_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subpassIndex"));
        
        SUBPASS_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subpassIndex"));
        SAMPLE_LOCATIONS_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsInfo"));
        //@formatter:on
    }

    public VkSubpassSampleLocationsEXT() {
        this(Arena.ofAuto());
    }
    
    public VkSubpassSampleLocationsEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkSubpassSampleLocationsEXT(MemorySegment segment) {
        this.segment = segment;
    
        sampleLocationsInfo = new VkSampleLocationsInfoEXT(segment.asSlice(SAMPLE_LOCATIONS_INFO_BYTE_OFFSET, VkSampleLocationsInfoEXT.LAYOUT));
    }

    /// @see #subpassIndex()
    public VkSubpassSampleLocationsEXT subpassIndex(int subpassIndex) {
    	SUBPASS_INDEX_HANDLE.set(segment, 0L, subpassIndex);
    	return this;
    }
    
    public int subpassIndex() {
    	return (int) SUBPASS_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleLocationsInfo()
    public VkSubpassSampleLocationsEXT sampleLocationsInfo(Consumer<VkSampleLocationsInfoEXT> consumer) {
    	consumer.accept(sampleLocationsInfo);
    	return this;
    }
    
    /// @see #sampleLocationsInfo()
    public VkSubpassSampleLocationsEXT sampleLocationsInfo(VkSampleLocationsInfoEXT other) {
    	sampleLocationsInfo.set(other);
    	return this;
    }
    
    public VkSampleLocationsInfoEXT sampleLocationsInfo() {
    	return sampleLocationsInfo;
    }
    
    @Override
    public VkSubpassSampleLocationsEXT set(VkSubpassSampleLocationsEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkSubpassSampleLocationsEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSubpassSampleLocationsEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSubpassSampleLocationsEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSubpassSampleLocationsEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSubpassSampleLocationsEXT> array(Arena arena, VkSubpassSampleLocationsEXT... structs) {
        NativeStructArray<VkSubpassSampleLocationsEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSubpassSampleLocationsEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSubpassSampleLocationsEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSubpassSampleLocationsEXT(segment)
        );
    }
    
}