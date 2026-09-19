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

public final class VkPhysicalDeviceDataGraphOperationSupportARM
		implements Struct<VkPhysicalDeviceDataGraphOperationSupportARM> {

    public static final StructLayout LAYOUT;

    public static final VarHandle OPERATION_TYPE_HANDLE;
    public static final VarHandle NAME_HANDLE;
    public static final VarHandle VERSION_HANDLE;

    public static final long OPERATION_TYPE_BYTE_OFFSET;
    public static final long NAME_BYTE_OFFSET;
    public static final long VERSION_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("operationType"),
            MemoryLayout.sequenceLayout(128, JAVA_BYTE).withName("name"),
            JAVA_INT.withName("version")
        ).withName("VkPhysicalDeviceDataGraphOperationSupportARM").withByteAlignment(4);
        
        OPERATION_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("operationType"));
        NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("name"), PathElement.sequenceElement());
        VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("version"));
        
        OPERATION_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("operationType"));
        NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("name"));
        VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("version"));
        //@formatter:on
    }

    public VkPhysicalDeviceDataGraphOperationSupportARM() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceDataGraphOperationSupportARM(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceDataGraphOperationSupportARM(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #operationType()
    public VkPhysicalDeviceDataGraphOperationSupportARM operationType(int operationType) {
    	OPERATION_TYPE_HANDLE.set(segment, 0L, operationType);
    	return this;
    }
    
    public int operationType() {
    	return (int) OPERATION_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #name(int)
    public VkPhysicalDeviceDataGraphOperationSupportARM name(byte name, int index0) {
    	NAME_HANDLE.set(segment, 0L, index0, name);
    	return this;
    }
    
    public byte name(int index0) {
    	return (byte) NAME_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #version()
    public VkPhysicalDeviceDataGraphOperationSupportARM version(int version) {
    	VERSION_HANDLE.set(segment, 0L, version);
    	return this;
    }
    
    public int version() {
    	return (int) VERSION_HANDLE.get(segment, 0L);
    }
    
    public String name() {
        return segment.getString(NAME_BYTE_OFFSET);
    }
    
    @Override
    public VkPhysicalDeviceDataGraphOperationSupportARM set(VkPhysicalDeviceDataGraphOperationSupportARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDataGraphOperationSupportARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDataGraphOperationSupportARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDataGraphOperationSupportARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDataGraphOperationSupportARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDataGraphOperationSupportARM> array(Arena arena, VkPhysicalDeviceDataGraphOperationSupportARM... structs) {
        NativeStructArray<VkPhysicalDeviceDataGraphOperationSupportARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDataGraphOperationSupportARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDataGraphOperationSupportARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDataGraphOperationSupportARM(segment)
        );
    }
    
}