/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
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

public final class VkExternalSemaphoreProperties
		implements Struct<VkExternalSemaphoreProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle EXPORT_FROM_IMPORTED_HANDLE_TYPES_HANDLE;
	public static final VarHandle COMPATIBLE_HANDLE_TYPES_HANDLE;
	public static final VarHandle EXTERNAL_SEMAPHORE_FEATURES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long EXPORT_FROM_IMPORTED_HANDLE_TYPES_BYTE_OFFSET;
	public static final long COMPATIBLE_HANDLE_TYPES_BYTE_OFFSET;
	public static final long EXTERNAL_SEMAPHORE_FEATURES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("exportFromImportedHandleTypes"),
		    JAVA_INT.withName("compatibleHandleTypes"),
		    JAVA_INT.withName("externalSemaphoreFeatures"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkExternalSemaphoreProperties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		EXPORT_FROM_IMPORTED_HANDLE_TYPES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("exportFromImportedHandleTypes"));
		COMPATIBLE_HANDLE_TYPES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("compatibleHandleTypes"));
		EXTERNAL_SEMAPHORE_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("externalSemaphoreFeatures"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		EXPORT_FROM_IMPORTED_HANDLE_TYPES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("exportFromImportedHandleTypes"));
		COMPATIBLE_HANDLE_TYPES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("compatibleHandleTypes"));
		EXTERNAL_SEMAPHORE_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("externalSemaphoreFeatures"));
		//@formatter:on
	}

	public VkExternalSemaphoreProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkExternalSemaphoreProperties(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkExternalSemaphoreProperties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkExternalSemaphoreProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkExternalSemaphoreProperties pNext(MemorySegment pNext) {
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
    public VkExternalSemaphoreProperties exportFromImportedHandleTypes(int exportFromImportedHandleTypes) {
    	EXPORT_FROM_IMPORTED_HANDLE_TYPES_HANDLE.set(segment, 0L, exportFromImportedHandleTypes);
    	return this;
    }
    
    public int exportFromImportedHandleTypes() {
    	return (int) EXPORT_FROM_IMPORTED_HANDLE_TYPES_HANDLE.get(segment, 0L);
    }
    
    /// @see #compatibleHandleTypes()
    public VkExternalSemaphoreProperties compatibleHandleTypes(int compatibleHandleTypes) {
    	COMPATIBLE_HANDLE_TYPES_HANDLE.set(segment, 0L, compatibleHandleTypes);
    	return this;
    }
    
    public int compatibleHandleTypes() {
    	return (int) COMPATIBLE_HANDLE_TYPES_HANDLE.get(segment, 0L);
    }
    
    /// @see #externalSemaphoreFeatures()
    public VkExternalSemaphoreProperties externalSemaphoreFeatures(int externalSemaphoreFeatures) {
    	EXTERNAL_SEMAPHORE_FEATURES_HANDLE.set(segment, 0L, externalSemaphoreFeatures);
    	return this;
    }
    
    public int externalSemaphoreFeatures() {
    	return (int) EXTERNAL_SEMAPHORE_FEATURES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkExternalSemaphoreProperties set(VkExternalSemaphoreProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkExternalSemaphoreProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkExternalSemaphoreProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkExternalSemaphoreProperties> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkExternalSemaphoreProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkExternalSemaphoreProperties> array(SegmentAllocator allocator, VkExternalSemaphoreProperties... structs) {
        NativeStructArray<VkExternalSemaphoreProperties> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkExternalSemaphoreProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkExternalSemaphoreProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkExternalSemaphoreProperties(segment)
        );
    }

}