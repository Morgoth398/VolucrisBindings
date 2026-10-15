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

public final class VkExternalFenceProperties
		implements Struct<VkExternalFenceProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle EXPORT_FROM_IMPORTED_HANDLE_TYPES_HANDLE;
	public static final VarHandle COMPATIBLE_HANDLE_TYPES_HANDLE;
	public static final VarHandle EXTERNAL_FENCE_FEATURES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long EXPORT_FROM_IMPORTED_HANDLE_TYPES_BYTE_OFFSET;
	public static final long COMPATIBLE_HANDLE_TYPES_BYTE_OFFSET;
	public static final long EXTERNAL_FENCE_FEATURES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("exportFromImportedHandleTypes"),
		    JAVA_INT.withName("compatibleHandleTypes"),
		    JAVA_INT.withName("externalFenceFeatures"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkExternalFenceProperties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		EXPORT_FROM_IMPORTED_HANDLE_TYPES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("exportFromImportedHandleTypes"));
		COMPATIBLE_HANDLE_TYPES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("compatibleHandleTypes"));
		EXTERNAL_FENCE_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("externalFenceFeatures"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		EXPORT_FROM_IMPORTED_HANDLE_TYPES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("exportFromImportedHandleTypes"));
		COMPATIBLE_HANDLE_TYPES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("compatibleHandleTypes"));
		EXTERNAL_FENCE_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("externalFenceFeatures"));
		//@formatter:on
	}

	public VkExternalFenceProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkExternalFenceProperties(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkExternalFenceProperties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkExternalFenceProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkExternalFenceProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #exportFromImportedHandleTypes()
    public VkExternalFenceProperties exportFromImportedHandleTypes(int exportFromImportedHandleTypes) {
    	EXPORT_FROM_IMPORTED_HANDLE_TYPES_HANDLE.set(segment, 0L, exportFromImportedHandleTypes);
    	return this;
    }
    
    public int exportFromImportedHandleTypes() {
    	return (int) EXPORT_FROM_IMPORTED_HANDLE_TYPES_HANDLE.get(segment, 0L);
    }
    
    /// @see #compatibleHandleTypes()
    public VkExternalFenceProperties compatibleHandleTypes(int compatibleHandleTypes) {
    	COMPATIBLE_HANDLE_TYPES_HANDLE.set(segment, 0L, compatibleHandleTypes);
    	return this;
    }
    
    public int compatibleHandleTypes() {
    	return (int) COMPATIBLE_HANDLE_TYPES_HANDLE.get(segment, 0L);
    }
    
    /// @see #externalFenceFeatures()
    public VkExternalFenceProperties externalFenceFeatures(int externalFenceFeatures) {
    	EXTERNAL_FENCE_FEATURES_HANDLE.set(segment, 0L, externalFenceFeatures);
    	return this;
    }
    
    public int externalFenceFeatures() {
    	return (int) EXTERNAL_FENCE_FEATURES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkExternalFenceProperties set(VkExternalFenceProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkExternalFenceProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkExternalFenceProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkExternalFenceProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExternalFenceProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkExternalFenceProperties> array(Arena arena, VkExternalFenceProperties... structs) {
        NativeStructArray<VkExternalFenceProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExternalFenceProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkExternalFenceProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkExternalFenceProperties(segment)
        );
    }

}