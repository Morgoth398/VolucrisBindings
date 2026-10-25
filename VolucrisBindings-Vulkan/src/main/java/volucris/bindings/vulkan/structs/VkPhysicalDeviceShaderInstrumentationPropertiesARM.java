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

public final class VkPhysicalDeviceShaderInstrumentationPropertiesARM
		implements Struct<VkPhysicalDeviceShaderInstrumentationPropertiesARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle NUM_METRICS_HANDLE;
	public static final VarHandle PER_BASIC_BLOCK_GRANULARITY_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long NUM_METRICS_BYTE_OFFSET;
	public static final long PER_BASIC_BLOCK_GRANULARITY_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("numMetrics"),
		    JAVA_INT.withName("perBasicBlockGranularity")
		).withName("VkPhysicalDeviceShaderInstrumentationPropertiesARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		NUM_METRICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numMetrics"));
		PER_BASIC_BLOCK_GRANULARITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("perBasicBlockGranularity"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		NUM_METRICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numMetrics"));
		PER_BASIC_BLOCK_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("perBasicBlockGranularity"));
		//@formatter:on
	}

	public VkPhysicalDeviceShaderInstrumentationPropertiesARM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceShaderInstrumentationPropertiesARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceShaderInstrumentationPropertiesARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceShaderInstrumentationPropertiesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderInstrumentationPropertiesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #numMetrics()
    public VkPhysicalDeviceShaderInstrumentationPropertiesARM numMetrics(int numMetrics) {
    	NUM_METRICS_HANDLE.set(segment, 0L, numMetrics);
    	return this;
    }
    
    public int numMetrics() {
    	return (int) NUM_METRICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #perBasicBlockGranularity()
    public VkPhysicalDeviceShaderInstrumentationPropertiesARM perBasicBlockGranularity(int perBasicBlockGranularity) {
    	PER_BASIC_BLOCK_GRANULARITY_HANDLE.set(segment, 0L, perBasicBlockGranularity);
    	return this;
    }
    
    public int perBasicBlockGranularity() {
    	return (int) PER_BASIC_BLOCK_GRANULARITY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderInstrumentationPropertiesARM set(VkPhysicalDeviceShaderInstrumentationPropertiesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderInstrumentationPropertiesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderInstrumentationPropertiesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderInstrumentationPropertiesARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderInstrumentationPropertiesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderInstrumentationPropertiesARM> array(SegmentAllocator allocator, VkPhysicalDeviceShaderInstrumentationPropertiesARM... structs) {
        NativeStructArray<VkPhysicalDeviceShaderInstrumentationPropertiesARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderInstrumentationPropertiesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderInstrumentationPropertiesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderInstrumentationPropertiesARM(segment)
        );
    }

}