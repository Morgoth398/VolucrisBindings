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

public final class VkPhysicalDeviceAntiLagFeaturesAMD
		implements Struct<VkPhysicalDeviceAntiLagFeaturesAMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ANTI_LAG_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ANTI_LAG_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("antiLag"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceAntiLagFeaturesAMD").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ANTI_LAG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("antiLag"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ANTI_LAG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("antiLag"));
		//@formatter:on
	}

	public VkPhysicalDeviceAntiLagFeaturesAMD() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceAntiLagFeaturesAMD(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceAntiLagFeaturesAMD(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceAntiLagFeaturesAMD sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceAntiLagFeaturesAMD pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #antiLag()
    public VkPhysicalDeviceAntiLagFeaturesAMD antiLag(int antiLag) {
    	ANTI_LAG_HANDLE.set(segment, 0L, antiLag);
    	return this;
    }
    
    public int antiLag() {
    	return (int) ANTI_LAG_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceAntiLagFeaturesAMD set(VkPhysicalDeviceAntiLagFeaturesAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceAntiLagFeaturesAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceAntiLagFeaturesAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceAntiLagFeaturesAMD> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceAntiLagFeaturesAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceAntiLagFeaturesAMD> array(Arena arena, VkPhysicalDeviceAntiLagFeaturesAMD... structs) {
        NativeStructArray<VkPhysicalDeviceAntiLagFeaturesAMD> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceAntiLagFeaturesAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceAntiLagFeaturesAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceAntiLagFeaturesAMD(segment)
        );
    }

}