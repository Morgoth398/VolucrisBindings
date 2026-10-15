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

public final class VkPhysicalDeviceMaintenance6Features
		implements Struct<VkPhysicalDeviceMaintenance6Features> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAINTENANCE6_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAINTENANCE6_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("maintenance6"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceMaintenance6Features").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAINTENANCE6_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maintenance6"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAINTENANCE6_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maintenance6"));
		//@formatter:on
	}

	public VkPhysicalDeviceMaintenance6Features() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceMaintenance6Features(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceMaintenance6Features(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceMaintenance6Features sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMaintenance6Features pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maintenance6()
    public VkPhysicalDeviceMaintenance6Features maintenance6(int maintenance6) {
    	MAINTENANCE6_HANDLE.set(segment, 0L, maintenance6);
    	return this;
    }
    
    public int maintenance6() {
    	return (int) MAINTENANCE6_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance6Features set(VkPhysicalDeviceMaintenance6Features other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance6Features set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMaintenance6Features> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance6Features> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance6Features(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance6Features> array(Arena arena, VkPhysicalDeviceMaintenance6Features... structs) {
        NativeStructArray<VkPhysicalDeviceMaintenance6Features> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance6Features(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance6Features> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance6Features(segment)
        );
    }

}