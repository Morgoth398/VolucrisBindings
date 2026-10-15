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

public final class VkPhysicalDeviceMaintenance4Features
		implements Struct<VkPhysicalDeviceMaintenance4Features> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAINTENANCE4_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAINTENANCE4_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("maintenance4"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceMaintenance4Features").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAINTENANCE4_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maintenance4"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAINTENANCE4_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maintenance4"));
		//@formatter:on
	}

	public VkPhysicalDeviceMaintenance4Features() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceMaintenance4Features(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceMaintenance4Features(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceMaintenance4Features sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMaintenance4Features pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maintenance4()
    public VkPhysicalDeviceMaintenance4Features maintenance4(int maintenance4) {
    	MAINTENANCE4_HANDLE.set(segment, 0L, maintenance4);
    	return this;
    }
    
    public int maintenance4() {
    	return (int) MAINTENANCE4_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance4Features set(VkPhysicalDeviceMaintenance4Features other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance4Features set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMaintenance4Features> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance4Features> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance4Features(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance4Features> array(Arena arena, VkPhysicalDeviceMaintenance4Features... structs) {
        NativeStructArray<VkPhysicalDeviceMaintenance4Features> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance4Features(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance4Features> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance4Features(segment)
        );
    }

}