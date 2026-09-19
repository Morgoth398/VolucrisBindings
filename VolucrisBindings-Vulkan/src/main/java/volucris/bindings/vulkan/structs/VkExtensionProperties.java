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

public final class VkExtensionProperties
		implements Struct<VkExtensionProperties> {

    public static final StructLayout LAYOUT;

    public static final VarHandle EXTENSION_NAME_HANDLE;
    public static final VarHandle SPEC_VERSION_HANDLE;

    public static final long EXTENSION_NAME_BYTE_OFFSET;
    public static final long SPEC_VERSION_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("extensionName"),
            JAVA_INT.withName("specVersion")
        ).withName("VkExtensionProperties").withByteAlignment(4);
        
        EXTENSION_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extensionName"), PathElement.sequenceElement());
        SPEC_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("specVersion"));
        
        EXTENSION_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extensionName"));
        SPEC_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("specVersion"));
        //@formatter:on
    }

    public VkExtensionProperties() {
        this(Arena.ofAuto());
    }
    
    public VkExtensionProperties(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkExtensionProperties(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #extensionName(int)
    public VkExtensionProperties extensionName(byte extensionName, int index0) {
    	EXTENSION_NAME_HANDLE.set(segment, 0L, index0, extensionName);
    	return this;
    }
    
    public byte extensionName(int index0) {
    	return (byte) EXTENSION_NAME_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #specVersion()
    public VkExtensionProperties specVersion(int specVersion) {
    	SPEC_VERSION_HANDLE.set(segment, 0L, specVersion);
    	return this;
    }
    
    public int specVersion() {
    	return (int) SPEC_VERSION_HANDLE.get(segment, 0L);
    }
    
    public String extensionName() {
        return segment.getString(EXTENSION_NAME_BYTE_OFFSET);
    }
    
    @Override
    public VkExtensionProperties set(VkExtensionProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkExtensionProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkExtensionProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkExtensionProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExtensionProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkExtensionProperties> array(Arena arena, VkExtensionProperties... structs) {
        NativeStructArray<VkExtensionProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExtensionProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkExtensionProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkExtensionProperties(segment)
        );
    }
    
}