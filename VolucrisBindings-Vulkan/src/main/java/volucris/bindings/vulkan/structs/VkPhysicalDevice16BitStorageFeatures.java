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

public final class VkPhysicalDevice16BitStorageFeatures
		implements Struct<VkPhysicalDevice16BitStorageFeatures> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle STORAGE_BUFFER16_BIT_ACCESS_HANDLE;
	public static final VarHandle UNIFORM_AND_STORAGE_BUFFER16_BIT_ACCESS_HANDLE;
	public static final VarHandle STORAGE_PUSH_CONSTANT16_HANDLE;
	public static final VarHandle STORAGE_INPUT_OUTPUT16_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long STORAGE_BUFFER16_BIT_ACCESS_BYTE_OFFSET;
	public static final long UNIFORM_AND_STORAGE_BUFFER16_BIT_ACCESS_BYTE_OFFSET;
	public static final long STORAGE_PUSH_CONSTANT16_BYTE_OFFSET;
	public static final long STORAGE_INPUT_OUTPUT16_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("storageBuffer16BitAccess"),
		    JAVA_INT.withName("uniformAndStorageBuffer16BitAccess"),
		    JAVA_INT.withName("storagePushConstant16"),
		    JAVA_INT.withName("storageInputOutput16")
		).withName("VkPhysicalDevice16BitStorageFeatures").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		STORAGE_BUFFER16_BIT_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storageBuffer16BitAccess"));
		UNIFORM_AND_STORAGE_BUFFER16_BIT_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("uniformAndStorageBuffer16BitAccess"));
		STORAGE_PUSH_CONSTANT16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storagePushConstant16"));
		STORAGE_INPUT_OUTPUT16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storageInputOutput16"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		STORAGE_BUFFER16_BIT_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storageBuffer16BitAccess"));
		UNIFORM_AND_STORAGE_BUFFER16_BIT_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("uniformAndStorageBuffer16BitAccess"));
		STORAGE_PUSH_CONSTANT16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storagePushConstant16"));
		STORAGE_INPUT_OUTPUT16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storageInputOutput16"));
		//@formatter:on
	}

	public VkPhysicalDevice16BitStorageFeatures() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDevice16BitStorageFeatures(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDevice16BitStorageFeatures(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDevice16BitStorageFeatures sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDevice16BitStorageFeatures pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #storageBuffer16BitAccess()
    public VkPhysicalDevice16BitStorageFeatures storageBuffer16BitAccess(int storageBuffer16BitAccess) {
    	STORAGE_BUFFER16_BIT_ACCESS_HANDLE.set(segment, 0L, storageBuffer16BitAccess);
    	return this;
    }
    
    public int storageBuffer16BitAccess() {
    	return (int) STORAGE_BUFFER16_BIT_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #uniformAndStorageBuffer16BitAccess()
    public VkPhysicalDevice16BitStorageFeatures uniformAndStorageBuffer16BitAccess(int uniformAndStorageBuffer16BitAccess) {
    	UNIFORM_AND_STORAGE_BUFFER16_BIT_ACCESS_HANDLE.set(segment, 0L, uniformAndStorageBuffer16BitAccess);
    	return this;
    }
    
    public int uniformAndStorageBuffer16BitAccess() {
    	return (int) UNIFORM_AND_STORAGE_BUFFER16_BIT_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #storagePushConstant16()
    public VkPhysicalDevice16BitStorageFeatures storagePushConstant16(int storagePushConstant16) {
    	STORAGE_PUSH_CONSTANT16_HANDLE.set(segment, 0L, storagePushConstant16);
    	return this;
    }
    
    public int storagePushConstant16() {
    	return (int) STORAGE_PUSH_CONSTANT16_HANDLE.get(segment, 0L);
    }
    
    /// @see #storageInputOutput16()
    public VkPhysicalDevice16BitStorageFeatures storageInputOutput16(int storageInputOutput16) {
    	STORAGE_INPUT_OUTPUT16_HANDLE.set(segment, 0L, storageInputOutput16);
    	return this;
    }
    
    public int storageInputOutput16() {
    	return (int) STORAGE_INPUT_OUTPUT16_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDevice16BitStorageFeatures set(VkPhysicalDevice16BitStorageFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDevice16BitStorageFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDevice16BitStorageFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDevice16BitStorageFeatures> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevice16BitStorageFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDevice16BitStorageFeatures> array(Arena arena, VkPhysicalDevice16BitStorageFeatures... structs) {
        NativeStructArray<VkPhysicalDevice16BitStorageFeatures> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevice16BitStorageFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDevice16BitStorageFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDevice16BitStorageFeatures(segment)
        );
    }

}