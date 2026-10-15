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

public final class VkPhysicalDeviceMemoryBudgetPropertiesEXT
		implements Struct<VkPhysicalDeviceMemoryBudgetPropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle HEAP_BUDGET_HANDLE;
	public static final VarHandle HEAP_USAGE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long HEAP_BUDGET_BYTE_OFFSET;
	public static final long HEAP_USAGE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    MemoryLayout.sequenceLayout(16, JAVA_LONG).withName("heapBudget"),
		    MemoryLayout.sequenceLayout(16, JAVA_LONG).withName("heapUsage")
		).withName("VkPhysicalDeviceMemoryBudgetPropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		HEAP_BUDGET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heapBudget"), PathElement.sequenceElement());
		HEAP_USAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heapUsage"), PathElement.sequenceElement());
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		HEAP_BUDGET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heapBudget"));
		HEAP_USAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heapUsage"));
		//@formatter:on
	}

	public VkPhysicalDeviceMemoryBudgetPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceMemoryBudgetPropertiesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceMemoryBudgetPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #heapBudget(int)
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT heapBudget(long heapBudget, int index0) {
    	HEAP_BUDGET_HANDLE.set(segment, 0L, index0, heapBudget);
    	return this;
    }
    
    public long heapBudget(int index0) {
    	return (long) HEAP_BUDGET_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #heapUsage(int)
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT heapUsage(long heapUsage, int index0) {
    	HEAP_USAGE_HANDLE.set(segment, 0L, index0, heapUsage);
    	return this;
    }
    
    public long heapUsage(int index0) {
    	return (long) HEAP_USAGE_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT set(VkPhysicalDeviceMemoryBudgetPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMemoryBudgetPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMemoryBudgetPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMemoryBudgetPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMemoryBudgetPropertiesEXT> array(Arena arena, VkPhysicalDeviceMemoryBudgetPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceMemoryBudgetPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMemoryBudgetPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMemoryBudgetPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMemoryBudgetPropertiesEXT(segment)
        );
    }

}