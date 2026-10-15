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

public final class VkPhysicalDevice8BitStorageFeatures
		implements Struct<VkPhysicalDevice8BitStorageFeatures> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle STORAGE_BUFFER8_BIT_ACCESS_HANDLE;
	public static final VarHandle UNIFORM_AND_STORAGE_BUFFER8_BIT_ACCESS_HANDLE;
	public static final VarHandle STORAGE_PUSH_CONSTANT8_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long STORAGE_BUFFER8_BIT_ACCESS_BYTE_OFFSET;
	public static final long UNIFORM_AND_STORAGE_BUFFER8_BIT_ACCESS_BYTE_OFFSET;
	public static final long STORAGE_PUSH_CONSTANT8_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("storageBuffer8BitAccess"),
		    JAVA_INT.withName("uniformAndStorageBuffer8BitAccess"),
		    JAVA_INT.withName("storagePushConstant8"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDevice8BitStorageFeatures").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		STORAGE_BUFFER8_BIT_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storageBuffer8BitAccess"));
		UNIFORM_AND_STORAGE_BUFFER8_BIT_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("uniformAndStorageBuffer8BitAccess"));
		STORAGE_PUSH_CONSTANT8_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storagePushConstant8"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		STORAGE_BUFFER8_BIT_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storageBuffer8BitAccess"));
		UNIFORM_AND_STORAGE_BUFFER8_BIT_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("uniformAndStorageBuffer8BitAccess"));
		STORAGE_PUSH_CONSTANT8_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storagePushConstant8"));
		//@formatter:on
	}

	public VkPhysicalDevice8BitStorageFeatures() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDevice8BitStorageFeatures(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDevice8BitStorageFeatures(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDevice8BitStorageFeatures sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDevice8BitStorageFeatures pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #storageBuffer8BitAccess()
    public VkPhysicalDevice8BitStorageFeatures storageBuffer8BitAccess(int storageBuffer8BitAccess) {
    	STORAGE_BUFFER8_BIT_ACCESS_HANDLE.set(segment, 0L, storageBuffer8BitAccess);
    	return this;
    }
    
    public int storageBuffer8BitAccess() {
    	return (int) STORAGE_BUFFER8_BIT_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #uniformAndStorageBuffer8BitAccess()
    public VkPhysicalDevice8BitStorageFeatures uniformAndStorageBuffer8BitAccess(int uniformAndStorageBuffer8BitAccess) {
    	UNIFORM_AND_STORAGE_BUFFER8_BIT_ACCESS_HANDLE.set(segment, 0L, uniformAndStorageBuffer8BitAccess);
    	return this;
    }
    
    public int uniformAndStorageBuffer8BitAccess() {
    	return (int) UNIFORM_AND_STORAGE_BUFFER8_BIT_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #storagePushConstant8()
    public VkPhysicalDevice8BitStorageFeatures storagePushConstant8(int storagePushConstant8) {
    	STORAGE_PUSH_CONSTANT8_HANDLE.set(segment, 0L, storagePushConstant8);
    	return this;
    }
    
    public int storagePushConstant8() {
    	return (int) STORAGE_PUSH_CONSTANT8_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDevice8BitStorageFeatures set(VkPhysicalDevice8BitStorageFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDevice8BitStorageFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDevice8BitStorageFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDevice8BitStorageFeatures> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevice8BitStorageFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDevice8BitStorageFeatures> array(Arena arena, VkPhysicalDevice8BitStorageFeatures... structs) {
        NativeStructArray<VkPhysicalDevice8BitStorageFeatures> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevice8BitStorageFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDevice8BitStorageFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDevice8BitStorageFeatures(segment)
        );
    }

}