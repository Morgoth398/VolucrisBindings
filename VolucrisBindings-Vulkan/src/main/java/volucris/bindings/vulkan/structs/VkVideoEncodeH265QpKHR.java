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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkVideoEncodeH265QpKHR
		implements Struct<VkVideoEncodeH265QpKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle QP_I_HANDLE;
	public static final VarHandle QP_P_HANDLE;
	public static final VarHandle QP_B_HANDLE;

	public static final long QP_I_BYTE_OFFSET;
	public static final long QP_P_BYTE_OFFSET;
	public static final long QP_B_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("qpI"),
		    JAVA_INT.withName("qpP"),
		    JAVA_INT.withName("qpB")
		).withName("VkVideoEncodeH265QpKHR").withByteAlignment(4);
		
		QP_I_HANDLE = LAYOUT.varHandle(PathElement.groupElement("qpI"));
		QP_P_HANDLE = LAYOUT.varHandle(PathElement.groupElement("qpP"));
		QP_B_HANDLE = LAYOUT.varHandle(PathElement.groupElement("qpB"));
		
		QP_I_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("qpI"));
		QP_P_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("qpP"));
		QP_B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("qpB"));
		//@formatter:on
	}

	public VkVideoEncodeH265QpKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeH265QpKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoEncodeH265QpKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #qpI()
    public VkVideoEncodeH265QpKHR qpI(int qpI) {
    	QP_I_HANDLE.set(segment, 0L, qpI);
    	return this;
    }
    
    public int qpI() {
    	return (int) QP_I_HANDLE.get(segment, 0L);
    }
    
    /// @see #qpP()
    public VkVideoEncodeH265QpKHR qpP(int qpP) {
    	QP_P_HANDLE.set(segment, 0L, qpP);
    	return this;
    }
    
    public int qpP() {
    	return (int) QP_P_HANDLE.get(segment, 0L);
    }
    
    /// @see #qpB()
    public VkVideoEncodeH265QpKHR qpB(int qpB) {
    	QP_B_HANDLE.set(segment, 0L, qpB);
    	return this;
    }
    
    public int qpB() {
    	return (int) QP_B_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeH265QpKHR set(VkVideoEncodeH265QpKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeH265QpKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeH265QpKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeH265QpKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeH265QpKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeH265QpKHR> array(SegmentAllocator allocator, VkVideoEncodeH265QpKHR... structs) {
        NativeStructArray<VkVideoEncodeH265QpKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeH265QpKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeH265QpKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeH265QpKHR(segment)
        );
    }

}