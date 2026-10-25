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

public final class VkPipelineCompilerControlCreateInfoAMD
		implements Struct<VkPipelineCompilerControlCreateInfoAMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle COMPILER_CONTROL_FLAGS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long COMPILER_CONTROL_FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("compilerControlFlags"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPipelineCompilerControlCreateInfoAMD").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		COMPILER_CONTROL_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("compilerControlFlags"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		COMPILER_CONTROL_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("compilerControlFlags"));
		//@formatter:on
	}

	public VkPipelineCompilerControlCreateInfoAMD() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineCompilerControlCreateInfoAMD(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPipelineCompilerControlCreateInfoAMD(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineCompilerControlCreateInfoAMD sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineCompilerControlCreateInfoAMD pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #compilerControlFlags()
    public VkPipelineCompilerControlCreateInfoAMD compilerControlFlags(int compilerControlFlags) {
    	COMPILER_CONTROL_FLAGS_HANDLE.set(segment, 0L, compilerControlFlags);
    	return this;
    }
    
    public int compilerControlFlags() {
    	return (int) COMPILER_CONTROL_FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPipelineCompilerControlCreateInfoAMD set(VkPipelineCompilerControlCreateInfoAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineCompilerControlCreateInfoAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineCompilerControlCreateInfoAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineCompilerControlCreateInfoAMD> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineCompilerControlCreateInfoAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineCompilerControlCreateInfoAMD> array(SegmentAllocator allocator, VkPipelineCompilerControlCreateInfoAMD... structs) {
        NativeStructArray<VkPipelineCompilerControlCreateInfoAMD> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineCompilerControlCreateInfoAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineCompilerControlCreateInfoAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineCompilerControlCreateInfoAMD(segment)
        );
    }

}