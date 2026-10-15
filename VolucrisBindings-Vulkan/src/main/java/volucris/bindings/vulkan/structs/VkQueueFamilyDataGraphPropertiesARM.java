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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkQueueFamilyDataGraphPropertiesARM
		implements Struct<VkQueueFamilyDataGraphPropertiesARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ENGINE_BYTE_OFFSET;
	public static final long OPERATION_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkPhysicalDeviceDataGraphProcessingEngineARM engine;
	private final VkPhysicalDeviceDataGraphOperationSupportARM operation;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkPhysicalDeviceDataGraphProcessingEngineARM.LAYOUT.withName("engine"),
		    VkPhysicalDeviceDataGraphOperationSupportARM.LAYOUT.withName("operation")
		).withName("VkQueueFamilyDataGraphPropertiesARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ENGINE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("engine"));
		OPERATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("operation"));
		//@formatter:on
	}

	public VkQueueFamilyDataGraphPropertiesARM() {
	    this(Arena.ofAuto());
	}
	
	public VkQueueFamilyDataGraphPropertiesARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkQueueFamilyDataGraphPropertiesARM(MemorySegment segment) {
	    this.segment = segment;
	
	    engine = new VkPhysicalDeviceDataGraphProcessingEngineARM(segment.asSlice(ENGINE_BYTE_OFFSET, VkPhysicalDeviceDataGraphProcessingEngineARM.LAYOUT));
	    operation = new VkPhysicalDeviceDataGraphOperationSupportARM(segment.asSlice(OPERATION_BYTE_OFFSET, VkPhysicalDeviceDataGraphOperationSupportARM.LAYOUT));
	}

    /// @see #sType()
    public VkQueueFamilyDataGraphPropertiesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkQueueFamilyDataGraphPropertiesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #engine()
    public VkQueueFamilyDataGraphPropertiesARM engine(Consumer<VkPhysicalDeviceDataGraphProcessingEngineARM> consumer) {
    	consumer.accept(engine);
    	return this;
    }
    
    /// @see #engine()
    public VkQueueFamilyDataGraphPropertiesARM engine(VkPhysicalDeviceDataGraphProcessingEngineARM other) {
    	engine.set(other);
    	return this;
    }
    
    public VkPhysicalDeviceDataGraphProcessingEngineARM engine() {
    	return engine;
    }
    
    /// @see #operation()
    public VkQueueFamilyDataGraphPropertiesARM operation(Consumer<VkPhysicalDeviceDataGraphOperationSupportARM> consumer) {
    	consumer.accept(operation);
    	return this;
    }
    
    /// @see #operation()
    public VkQueueFamilyDataGraphPropertiesARM operation(VkPhysicalDeviceDataGraphOperationSupportARM other) {
    	operation.set(other);
    	return this;
    }
    
    public VkPhysicalDeviceDataGraphOperationSupportARM operation() {
    	return operation;
    }
    
    @Override
    public VkQueueFamilyDataGraphPropertiesARM set(VkQueueFamilyDataGraphPropertiesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkQueueFamilyDataGraphPropertiesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkQueueFamilyDataGraphPropertiesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkQueueFamilyDataGraphPropertiesARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkQueueFamilyDataGraphPropertiesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkQueueFamilyDataGraphPropertiesARM> array(Arena arena, VkQueueFamilyDataGraphPropertiesARM... structs) {
        NativeStructArray<VkQueueFamilyDataGraphPropertiesARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkQueueFamilyDataGraphPropertiesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkQueueFamilyDataGraphPropertiesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkQueueFamilyDataGraphPropertiesARM(segment)
        );
    }

}