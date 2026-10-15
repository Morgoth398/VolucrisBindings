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
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPipelineCoverageModulationStateCreateInfoNV
		implements Struct<VkPipelineCoverageModulationStateCreateInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle COVERAGE_MODULATION_MODE_HANDLE;
	public static final VarHandle COVERAGE_MODULATION_TABLE_ENABLE_HANDLE;
	public static final VarHandle COVERAGE_MODULATION_TABLE_COUNT_HANDLE;
	public static final VarHandle P_COVERAGE_MODULATION_TABLE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long COVERAGE_MODULATION_MODE_BYTE_OFFSET;
	public static final long COVERAGE_MODULATION_TABLE_ENABLE_BYTE_OFFSET;
	public static final long COVERAGE_MODULATION_TABLE_COUNT_BYTE_OFFSET;
	public static final long P_COVERAGE_MODULATION_TABLE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("coverageModulationMode"),
		    JAVA_INT.withName("coverageModulationTableEnable"),
		    JAVA_INT.withName("coverageModulationTableCount"),
		    UNBOUNDED_ADDRESS.withName("pCoverageModulationTable")
		).withName("VkPipelineCoverageModulationStateCreateInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		COVERAGE_MODULATION_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("coverageModulationMode"));
		COVERAGE_MODULATION_TABLE_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("coverageModulationTableEnable"));
		COVERAGE_MODULATION_TABLE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("coverageModulationTableCount"));
		P_COVERAGE_MODULATION_TABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCoverageModulationTable"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		COVERAGE_MODULATION_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coverageModulationMode"));
		COVERAGE_MODULATION_TABLE_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coverageModulationTableEnable"));
		COVERAGE_MODULATION_TABLE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coverageModulationTableCount"));
		P_COVERAGE_MODULATION_TABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCoverageModulationTable"));
		//@formatter:on
	}

	public VkPipelineCoverageModulationStateCreateInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineCoverageModulationStateCreateInfoNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPipelineCoverageModulationStateCreateInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineCoverageModulationStateCreateInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineCoverageModulationStateCreateInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkPipelineCoverageModulationStateCreateInfoNV flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #coverageModulationMode()
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationMode(int coverageModulationMode) {
    	COVERAGE_MODULATION_MODE_HANDLE.set(segment, 0L, coverageModulationMode);
    	return this;
    }
    
    public int coverageModulationMode() {
    	return (int) COVERAGE_MODULATION_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #coverageModulationTableEnable()
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationTableEnable(int coverageModulationTableEnable) {
    	COVERAGE_MODULATION_TABLE_ENABLE_HANDLE.set(segment, 0L, coverageModulationTableEnable);
    	return this;
    }
    
    public int coverageModulationTableEnable() {
    	return (int) COVERAGE_MODULATION_TABLE_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #coverageModulationTableCount()
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationTableCount(int coverageModulationTableCount) {
    	COVERAGE_MODULATION_TABLE_COUNT_HANDLE.set(segment, 0L, coverageModulationTableCount);
    	return this;
    }
    
    public int coverageModulationTableCount() {
    	return (int) COVERAGE_MODULATION_TABLE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pCoverageModulationTable()
    public VkPipelineCoverageModulationStateCreateInfoNV pCoverageModulationTable(NativeFloatArray pCoverageModulationTable) {
    	P_COVERAGE_MODULATION_TABLE_HANDLE.set(segment, 0L, pCoverageModulationTable.memorySegment());
    	return this;
    }
    
    public @Nullable NativeFloatArray pCoverageModulationTable() {
    	MemorySegment segment = (MemorySegment) P_COVERAGE_MODULATION_TABLE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeFloatArray(segment);
    }
    
    @Override
    public VkPipelineCoverageModulationStateCreateInfoNV set(VkPipelineCoverageModulationStateCreateInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineCoverageModulationStateCreateInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineCoverageModulationStateCreateInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineCoverageModulationStateCreateInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineCoverageModulationStateCreateInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineCoverageModulationStateCreateInfoNV> array(Arena arena, VkPipelineCoverageModulationStateCreateInfoNV... structs) {
        NativeStructArray<VkPipelineCoverageModulationStateCreateInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineCoverageModulationStateCreateInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineCoverageModulationStateCreateInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineCoverageModulationStateCreateInfoNV(segment)
        );
    }

}