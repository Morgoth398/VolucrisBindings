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

public final class VkShaderInstrumentationMetricDataHeaderARM
		implements Struct<VkShaderInstrumentationMetricDataHeaderARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle RESULT_INDEX_HANDLE;
	public static final VarHandle RESULT_SUB_INDEX_HANDLE;
	public static final VarHandle STAGES_HANDLE;
	public static final VarHandle BASIC_BLOCK_INDEX_HANDLE;

	public static final long RESULT_INDEX_BYTE_OFFSET;
	public static final long RESULT_SUB_INDEX_BYTE_OFFSET;
	public static final long STAGES_BYTE_OFFSET;
	public static final long BASIC_BLOCK_INDEX_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("resultIndex"),
		    JAVA_INT.withName("resultSubIndex"),
		    JAVA_INT.withName("stages"),
		    JAVA_INT.withName("basicBlockIndex")
		).withName("VkShaderInstrumentationMetricDataHeaderARM").withByteAlignment(4);
		
		RESULT_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("resultIndex"));
		RESULT_SUB_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("resultSubIndex"));
		STAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stages"));
		BASIC_BLOCK_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("basicBlockIndex"));
		
		RESULT_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resultIndex"));
		RESULT_SUB_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resultSubIndex"));
		STAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stages"));
		BASIC_BLOCK_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("basicBlockIndex"));
		//@formatter:on
	}

	public VkShaderInstrumentationMetricDataHeaderARM() {
	    this(Arena.ofAuto());
	}
	
	public VkShaderInstrumentationMetricDataHeaderARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkShaderInstrumentationMetricDataHeaderARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #resultIndex()
    public VkShaderInstrumentationMetricDataHeaderARM resultIndex(int resultIndex) {
    	RESULT_INDEX_HANDLE.set(segment, 0L, resultIndex);
    	return this;
    }
    
    public int resultIndex() {
    	return (int) RESULT_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #resultSubIndex()
    public VkShaderInstrumentationMetricDataHeaderARM resultSubIndex(int resultSubIndex) {
    	RESULT_SUB_INDEX_HANDLE.set(segment, 0L, resultSubIndex);
    	return this;
    }
    
    public int resultSubIndex() {
    	return (int) RESULT_SUB_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #stages()
    public VkShaderInstrumentationMetricDataHeaderARM stages(int stages) {
    	STAGES_HANDLE.set(segment, 0L, stages);
    	return this;
    }
    
    public int stages() {
    	return (int) STAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #basicBlockIndex()
    public VkShaderInstrumentationMetricDataHeaderARM basicBlockIndex(int basicBlockIndex) {
    	BASIC_BLOCK_INDEX_HANDLE.set(segment, 0L, basicBlockIndex);
    	return this;
    }
    
    public int basicBlockIndex() {
    	return (int) BASIC_BLOCK_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkShaderInstrumentationMetricDataHeaderARM set(VkShaderInstrumentationMetricDataHeaderARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkShaderInstrumentationMetricDataHeaderARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkShaderInstrumentationMetricDataHeaderARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkShaderInstrumentationMetricDataHeaderARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkShaderInstrumentationMetricDataHeaderARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkShaderInstrumentationMetricDataHeaderARM> array(SegmentAllocator allocator, VkShaderInstrumentationMetricDataHeaderARM... structs) {
        NativeStructArray<VkShaderInstrumentationMetricDataHeaderARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkShaderInstrumentationMetricDataHeaderARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkShaderInstrumentationMetricDataHeaderARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkShaderInstrumentationMetricDataHeaderARM(segment)
        );
    }

}