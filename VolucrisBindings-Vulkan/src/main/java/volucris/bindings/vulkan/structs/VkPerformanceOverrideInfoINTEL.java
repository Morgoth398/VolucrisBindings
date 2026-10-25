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

public final class VkPerformanceOverrideInfoINTEL
		implements Struct<VkPerformanceOverrideInfoINTEL> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle TYPE_HANDLE;
	public static final VarHandle ENABLE_HANDLE;
	public static final VarHandle PARAMETER_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TYPE_BYTE_OFFSET;
	public static final long ENABLE_BYTE_OFFSET;
	public static final long PARAMETER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("type"),
		    JAVA_INT.withName("enable"),
		    JAVA_LONG.withName("parameter")
		).withName("VkPerformanceOverrideInfoINTEL").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
		ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enable"));
		PARAMETER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("parameter"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
		ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enable"));
		PARAMETER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("parameter"));
		//@formatter:on
	}

	public VkPerformanceOverrideInfoINTEL() {
	    this(Arena.ofAuto());
	}
	
	public VkPerformanceOverrideInfoINTEL(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPerformanceOverrideInfoINTEL(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPerformanceOverrideInfoINTEL sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPerformanceOverrideInfoINTEL pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #type()
    public VkPerformanceOverrideInfoINTEL type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #enable()
    public VkPerformanceOverrideInfoINTEL enable(int enable) {
    	ENABLE_HANDLE.set(segment, 0L, enable);
    	return this;
    }
    
    public int enable() {
    	return (int) ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #parameter()
    public VkPerformanceOverrideInfoINTEL parameter(long parameter) {
    	PARAMETER_HANDLE.set(segment, 0L, parameter);
    	return this;
    }
    
    public long parameter() {
    	return (long) PARAMETER_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPerformanceOverrideInfoINTEL set(VkPerformanceOverrideInfoINTEL other) {
        return set(other.segment);
    }
    
    @Override
    public VkPerformanceOverrideInfoINTEL set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPerformanceOverrideInfoINTEL> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPerformanceOverrideInfoINTEL> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPerformanceOverrideInfoINTEL(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPerformanceOverrideInfoINTEL> array(SegmentAllocator allocator, VkPerformanceOverrideInfoINTEL... structs) {
        NativeStructArray<VkPerformanceOverrideInfoINTEL> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPerformanceOverrideInfoINTEL(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPerformanceOverrideInfoINTEL> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPerformanceOverrideInfoINTEL(segment)
        );
    }

}