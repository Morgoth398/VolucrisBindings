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

public final class VkExternalMemoryProperties
		implements Struct<VkExternalMemoryProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle EXTERNAL_MEMORY_FEATURES_HANDLE;
	public static final VarHandle EXPORT_FROM_IMPORTED_HANDLE_TYPES_HANDLE;
	public static final VarHandle COMPATIBLE_HANDLE_TYPES_HANDLE;

	public static final long EXTERNAL_MEMORY_FEATURES_BYTE_OFFSET;
	public static final long EXPORT_FROM_IMPORTED_HANDLE_TYPES_BYTE_OFFSET;
	public static final long COMPATIBLE_HANDLE_TYPES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("externalMemoryFeatures"),
		    JAVA_INT.withName("exportFromImportedHandleTypes"),
		    JAVA_INT.withName("compatibleHandleTypes")
		).withName("VkExternalMemoryProperties").withByteAlignment(4);
		
		EXTERNAL_MEMORY_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("externalMemoryFeatures"));
		EXPORT_FROM_IMPORTED_HANDLE_TYPES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("exportFromImportedHandleTypes"));
		COMPATIBLE_HANDLE_TYPES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("compatibleHandleTypes"));
		
		EXTERNAL_MEMORY_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("externalMemoryFeatures"));
		EXPORT_FROM_IMPORTED_HANDLE_TYPES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("exportFromImportedHandleTypes"));
		COMPATIBLE_HANDLE_TYPES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("compatibleHandleTypes"));
		//@formatter:on
	}

	public VkExternalMemoryProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkExternalMemoryProperties(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkExternalMemoryProperties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #externalMemoryFeatures()
    public VkExternalMemoryProperties externalMemoryFeatures(int externalMemoryFeatures) {
    	EXTERNAL_MEMORY_FEATURES_HANDLE.set(segment, 0L, externalMemoryFeatures);
    	return this;
    }
    
    public int externalMemoryFeatures() {
    	return (int) EXTERNAL_MEMORY_FEATURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #exportFromImportedHandleTypes()
    public VkExternalMemoryProperties exportFromImportedHandleTypes(int exportFromImportedHandleTypes) {
    	EXPORT_FROM_IMPORTED_HANDLE_TYPES_HANDLE.set(segment, 0L, exportFromImportedHandleTypes);
    	return this;
    }
    
    public int exportFromImportedHandleTypes() {
    	return (int) EXPORT_FROM_IMPORTED_HANDLE_TYPES_HANDLE.get(segment, 0L);
    }
    
    /// @see #compatibleHandleTypes()
    public VkExternalMemoryProperties compatibleHandleTypes(int compatibleHandleTypes) {
    	COMPATIBLE_HANDLE_TYPES_HANDLE.set(segment, 0L, compatibleHandleTypes);
    	return this;
    }
    
    public int compatibleHandleTypes() {
    	return (int) COMPATIBLE_HANDLE_TYPES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkExternalMemoryProperties set(VkExternalMemoryProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkExternalMemoryProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkExternalMemoryProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkExternalMemoryProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExternalMemoryProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkExternalMemoryProperties> array(Arena arena, VkExternalMemoryProperties... structs) {
        NativeStructArray<VkExternalMemoryProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExternalMemoryProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkExternalMemoryProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkExternalMemoryProperties(segment)
        );
    }

}