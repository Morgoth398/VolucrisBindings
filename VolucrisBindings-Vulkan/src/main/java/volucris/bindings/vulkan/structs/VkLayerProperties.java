/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkLayerProperties
		implements Struct<VkLayerProperties> {

    public static final StructLayout LAYOUT;

    public static final VarHandle LAYER_NAME_HANDLE;
    public static final VarHandle SPEC_VERSION_HANDLE;
    public static final VarHandle IMPLEMENTATION_VERSION_HANDLE;
    public static final VarHandle DESCRIPTION_HANDLE;

    public static final long LAYER_NAME_BYTE_OFFSET;
    public static final long SPEC_VERSION_BYTE_OFFSET;
    public static final long IMPLEMENTATION_VERSION_BYTE_OFFSET;
    public static final long DESCRIPTION_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("layerName"),
            JAVA_INT.withName("specVersion"),
            JAVA_INT.withName("implementationVersion"),
            MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("description")
        ).withName("VkLayerProperties").withByteAlignment(4);
        
        LAYER_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layerName"), PathElement.sequenceElement());
        SPEC_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("specVersion"));
        IMPLEMENTATION_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("implementationVersion"));
        DESCRIPTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
        
        LAYER_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layerName"));
        SPEC_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("specVersion"));
        IMPLEMENTATION_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("implementationVersion"));
        DESCRIPTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("description"));
        //@formatter:on
    }

    public VkLayerProperties() {
        this(Arena.ofAuto());
    }
    
    public VkLayerProperties(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkLayerProperties(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #layerName(int)
    public VkLayerProperties layerName(byte layerName, int index0) {
    	LAYER_NAME_HANDLE.set(segment, 0L, index0, layerName);
    	return this;
    }
    
    public byte layerName(int index0) {
    	return (byte) LAYER_NAME_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #specVersion()
    public VkLayerProperties specVersion(int specVersion) {
    	SPEC_VERSION_HANDLE.set(segment, 0L, specVersion);
    	return this;
    }
    
    public int specVersion() {
    	return (int) SPEC_VERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #implementationVersion()
    public VkLayerProperties implementationVersion(int implementationVersion) {
    	IMPLEMENTATION_VERSION_HANDLE.set(segment, 0L, implementationVersion);
    	return this;
    }
    
    public int implementationVersion() {
    	return (int) IMPLEMENTATION_VERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #description(int)
    public VkLayerProperties description(byte description, int index0) {
    	DESCRIPTION_HANDLE.set(segment, 0L, index0, description);
    	return this;
    }
    
    public byte description(int index0) {
    	return (byte) DESCRIPTION_HANDLE.get(segment, 0L, index0);
    }
    
    public String layerName() {
        return segment.getString(LAYER_NAME_BYTE_OFFSET);
    }
    
    public String description() {
        return segment.getString(DESCRIPTION_BYTE_OFFSET);
    }
    
    @Override
    public VkLayerProperties set(VkLayerProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkLayerProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkLayerProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkLayerProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkLayerProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkLayerProperties> array(Arena arena, VkLayerProperties... structs) {
        NativeStructArray<VkLayerProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkLayerProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkLayerProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkLayerProperties(segment)
        );
    }
    
}