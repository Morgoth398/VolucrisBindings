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

public final class VkPhysicalDeviceVariablePointersFeatures
		implements Struct<VkPhysicalDeviceVariablePointersFeatures> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle VARIABLE_POINTERS_STORAGE_BUFFER_HANDLE;
	public static final VarHandle VARIABLE_POINTERS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long VARIABLE_POINTERS_STORAGE_BUFFER_BYTE_OFFSET;
	public static final long VARIABLE_POINTERS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("variablePointersStorageBuffer"),
		    JAVA_INT.withName("variablePointers")
		).withName("VkPhysicalDeviceVariablePointersFeatures").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		VARIABLE_POINTERS_STORAGE_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("variablePointersStorageBuffer"));
		VARIABLE_POINTERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("variablePointers"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		VARIABLE_POINTERS_STORAGE_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("variablePointersStorageBuffer"));
		VARIABLE_POINTERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("variablePointers"));
		//@formatter:on
	}

	public VkPhysicalDeviceVariablePointersFeatures() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceVariablePointersFeatures(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceVariablePointersFeatures(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceVariablePointersFeatures sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceVariablePointersFeatures pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #variablePointersStorageBuffer()
    public VkPhysicalDeviceVariablePointersFeatures variablePointersStorageBuffer(int variablePointersStorageBuffer) {
    	VARIABLE_POINTERS_STORAGE_BUFFER_HANDLE.set(segment, 0L, variablePointersStorageBuffer);
    	return this;
    }
    
    public int variablePointersStorageBuffer() {
    	return (int) VARIABLE_POINTERS_STORAGE_BUFFER_HANDLE.get(segment, 0L);
    }
    
    /// @see #variablePointers()
    public VkPhysicalDeviceVariablePointersFeatures variablePointers(int variablePointers) {
    	VARIABLE_POINTERS_HANDLE.set(segment, 0L, variablePointers);
    	return this;
    }
    
    public int variablePointers() {
    	return (int) VARIABLE_POINTERS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceVariablePointersFeatures set(VkPhysicalDeviceVariablePointersFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceVariablePointersFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceVariablePointersFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceVariablePointersFeatures> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceVariablePointersFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceVariablePointersFeatures> array(Arena arena, VkPhysicalDeviceVariablePointersFeatures... structs) {
        NativeStructArray<VkPhysicalDeviceVariablePointersFeatures> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceVariablePointersFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceVariablePointersFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceVariablePointersFeatures(segment)
        );
    }

}