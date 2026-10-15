/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPipelineSampleLocationsStateCreateInfoEXT
		implements Struct<VkPipelineSampleLocationsStateCreateInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SAMPLE_LOCATIONS_ENABLE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SAMPLE_LOCATIONS_ENABLE_BYTE_OFFSET;
	public static final long SAMPLE_LOCATIONS_INFO_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkSampleLocationsInfoEXT sampleLocationsInfo;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("sampleLocationsEnable"),
		    MemoryLayout.paddingLayout(4),
		    VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
		).withName("VkPipelineSampleLocationsStateCreateInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SAMPLE_LOCATIONS_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleLocationsEnable"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SAMPLE_LOCATIONS_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsEnable"));
		SAMPLE_LOCATIONS_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationsInfo"));
		//@formatter:on
	}

	public VkPipelineSampleLocationsStateCreateInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineSampleLocationsStateCreateInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPipelineSampleLocationsStateCreateInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	    sampleLocationsInfo = new VkSampleLocationsInfoEXT(segment.asSlice(SAMPLE_LOCATIONS_INFO_BYTE_OFFSET, VkSampleLocationsInfoEXT.LAYOUT));
	}

    /// @see #sType()
    public VkPipelineSampleLocationsStateCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineSampleLocationsStateCreateInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #sampleLocationsEnable()
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsEnable(int sampleLocationsEnable) {
    	SAMPLE_LOCATIONS_ENABLE_HANDLE.set(segment, 0L, sampleLocationsEnable);
    	return this;
    }
    
    public int sampleLocationsEnable() {
    	return (int) SAMPLE_LOCATIONS_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleLocationsInfo()
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo(Consumer<VkSampleLocationsInfoEXT> consumer) {
    	consumer.accept(sampleLocationsInfo);
    	return this;
    }
    
    /// @see #sampleLocationsInfo()
    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo(VkSampleLocationsInfoEXT other) {
    	sampleLocationsInfo.set(other);
    	return this;
    }
    
    public VkSampleLocationsInfoEXT sampleLocationsInfo() {
    	return sampleLocationsInfo;
    }
    
    @Override
    public VkPipelineSampleLocationsStateCreateInfoEXT set(VkPipelineSampleLocationsStateCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineSampleLocationsStateCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineSampleLocationsStateCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineSampleLocationsStateCreateInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineSampleLocationsStateCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineSampleLocationsStateCreateInfoEXT> array(Arena arena, VkPipelineSampleLocationsStateCreateInfoEXT... structs) {
        NativeStructArray<VkPipelineSampleLocationsStateCreateInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineSampleLocationsStateCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineSampleLocationsStateCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineSampleLocationsStateCreateInfoEXT(segment)
        );
    }

}