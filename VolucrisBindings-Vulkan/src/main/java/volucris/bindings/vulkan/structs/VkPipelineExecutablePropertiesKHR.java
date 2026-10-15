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

public final class VkPipelineExecutablePropertiesKHR
		implements Struct<VkPipelineExecutablePropertiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle STAGES_HANDLE;
	public static final VarHandle NAME_HANDLE;
	public static final VarHandle DESCRIPTION_HANDLE;
	public static final VarHandle SUBGROUP_SIZE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long STAGES_BYTE_OFFSET;
	public static final long NAME_BYTE_OFFSET;
	public static final long DESCRIPTION_BYTE_OFFSET;
	public static final long SUBGROUP_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("stages"),
		    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("name"),
		    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("description"),
		    JAVA_INT.withName("subgroupSize")
		).withName("VkPipelineExecutablePropertiesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		STAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stages"));
		NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("name"), PathElement.sequenceElement());
		DESCRIPTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
		SUBGROUP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subgroupSize"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		STAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stages"));
		NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("name"));
		DESCRIPTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("description"));
		SUBGROUP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subgroupSize"));
		//@formatter:on
	}

	public VkPipelineExecutablePropertiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineExecutablePropertiesKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPipelineExecutablePropertiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineExecutablePropertiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineExecutablePropertiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #stages()
    public VkPipelineExecutablePropertiesKHR stages(int stages) {
    	STAGES_HANDLE.set(segment, 0L, stages);
    	return this;
    }
    
    public int stages() {
    	return (int) STAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #name(int)
    public VkPipelineExecutablePropertiesKHR name(byte name, int index0) {
    	NAME_HANDLE.set(segment, 0L, index0, name);
    	return this;
    }
    
    public byte name(int index0) {
    	return (byte) NAME_HANDLE.get(segment, 0L, index0);
    }
    
    public String name() {
        return segment.getString(NAME_BYTE_OFFSET);
    }
    
    /// @see #description(int)
    public VkPipelineExecutablePropertiesKHR description(byte description, int index0) {
    	DESCRIPTION_HANDLE.set(segment, 0L, index0, description);
    	return this;
    }
    
    public byte description(int index0) {
    	return (byte) DESCRIPTION_HANDLE.get(segment, 0L, index0);
    }
    
    public String description() {
        return segment.getString(DESCRIPTION_BYTE_OFFSET);
    }
    
    /// @see #subgroupSize()
    public VkPipelineExecutablePropertiesKHR subgroupSize(int subgroupSize) {
    	SUBGROUP_SIZE_HANDLE.set(segment, 0L, subgroupSize);
    	return this;
    }
    
    public int subgroupSize() {
    	return (int) SUBGROUP_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPipelineExecutablePropertiesKHR set(VkPipelineExecutablePropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineExecutablePropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineExecutablePropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineExecutablePropertiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineExecutablePropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineExecutablePropertiesKHR> array(Arena arena, VkPipelineExecutablePropertiesKHR... structs) {
        NativeStructArray<VkPipelineExecutablePropertiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineExecutablePropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineExecutablePropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineExecutablePropertiesKHR(segment)
        );
    }

}