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

public final class VkExternalImageFormatPropertiesNV
		implements Struct<VkExternalImageFormatPropertiesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle EXTERNAL_MEMORY_FEATURES_HANDLE;
	public static final VarHandle EXPORT_FROM_IMPORTED_HANDLE_TYPES_HANDLE;
	public static final VarHandle COMPATIBLE_HANDLE_TYPES_HANDLE;

	public static final long IMAGE_FORMAT_PROPERTIES_BYTE_OFFSET;
	public static final long EXTERNAL_MEMORY_FEATURES_BYTE_OFFSET;
	public static final long EXPORT_FROM_IMPORTED_HANDLE_TYPES_BYTE_OFFSET;
	public static final long COMPATIBLE_HANDLE_TYPES_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkImageFormatProperties imageFormatProperties;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    VkImageFormatProperties.LAYOUT.withName("imageFormatProperties"),
		    JAVA_INT.withName("externalMemoryFeatures"),
		    JAVA_INT.withName("exportFromImportedHandleTypes"),
		    JAVA_INT.withName("compatibleHandleTypes"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkExternalImageFormatPropertiesNV").withByteAlignment(8);
		
		EXTERNAL_MEMORY_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("externalMemoryFeatures"));
		EXPORT_FROM_IMPORTED_HANDLE_TYPES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("exportFromImportedHandleTypes"));
		COMPATIBLE_HANDLE_TYPES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("compatibleHandleTypes"));
		
		IMAGE_FORMAT_PROPERTIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageFormatProperties"));
		EXTERNAL_MEMORY_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("externalMemoryFeatures"));
		EXPORT_FROM_IMPORTED_HANDLE_TYPES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("exportFromImportedHandleTypes"));
		COMPATIBLE_HANDLE_TYPES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("compatibleHandleTypes"));
		//@formatter:on
	}

	public VkExternalImageFormatPropertiesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkExternalImageFormatPropertiesNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkExternalImageFormatPropertiesNV(MemorySegment segment) {
	    this.segment = segment;
	
	    imageFormatProperties = new VkImageFormatProperties(segment.asSlice(IMAGE_FORMAT_PROPERTIES_BYTE_OFFSET, VkImageFormatProperties.LAYOUT));
	}

    /// @see #imageFormatProperties()
    public VkExternalImageFormatPropertiesNV imageFormatProperties(Consumer<VkImageFormatProperties> consumer) {
    	consumer.accept(imageFormatProperties);
    	return this;
    }
    
    /// @see #imageFormatProperties()
    public VkExternalImageFormatPropertiesNV imageFormatProperties(VkImageFormatProperties other) {
    	imageFormatProperties.set(other);
    	return this;
    }
    
    public VkImageFormatProperties imageFormatProperties() {
    	return imageFormatProperties;
    }
    
    /// @see #externalMemoryFeatures()
    public VkExternalImageFormatPropertiesNV externalMemoryFeatures(int externalMemoryFeatures) {
    	EXTERNAL_MEMORY_FEATURES_HANDLE.set(segment, 0L, externalMemoryFeatures);
    	return this;
    }
    
    public int externalMemoryFeatures() {
    	return (int) EXTERNAL_MEMORY_FEATURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #exportFromImportedHandleTypes()
    public VkExternalImageFormatPropertiesNV exportFromImportedHandleTypes(int exportFromImportedHandleTypes) {
    	EXPORT_FROM_IMPORTED_HANDLE_TYPES_HANDLE.set(segment, 0L, exportFromImportedHandleTypes);
    	return this;
    }
    
    public int exportFromImportedHandleTypes() {
    	return (int) EXPORT_FROM_IMPORTED_HANDLE_TYPES_HANDLE.get(segment, 0L);
    }
    
    /// @see #compatibleHandleTypes()
    public VkExternalImageFormatPropertiesNV compatibleHandleTypes(int compatibleHandleTypes) {
    	COMPATIBLE_HANDLE_TYPES_HANDLE.set(segment, 0L, compatibleHandleTypes);
    	return this;
    }
    
    public int compatibleHandleTypes() {
    	return (int) COMPATIBLE_HANDLE_TYPES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkExternalImageFormatPropertiesNV set(VkExternalImageFormatPropertiesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkExternalImageFormatPropertiesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkExternalImageFormatPropertiesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkExternalImageFormatPropertiesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExternalImageFormatPropertiesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkExternalImageFormatPropertiesNV> array(Arena arena, VkExternalImageFormatPropertiesNV... structs) {
        NativeStructArray<VkExternalImageFormatPropertiesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExternalImageFormatPropertiesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkExternalImageFormatPropertiesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkExternalImageFormatPropertiesNV(segment)
        );
    }

}