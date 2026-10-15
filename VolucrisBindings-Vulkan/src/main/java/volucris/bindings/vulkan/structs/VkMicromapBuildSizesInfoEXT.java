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

public final class VkMicromapBuildSizesInfoEXT
		implements Struct<VkMicromapBuildSizesInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MICROMAP_SIZE_HANDLE;
	public static final VarHandle BUILD_SCRATCH_SIZE_HANDLE;
	public static final VarHandle DISCARDABLE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MICROMAP_SIZE_BYTE_OFFSET;
	public static final long BUILD_SCRATCH_SIZE_BYTE_OFFSET;
	public static final long DISCARDABLE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("micromapSize"),
		    JAVA_LONG.withName("buildScratchSize"),
		    JAVA_INT.withName("discardable"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkMicromapBuildSizesInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MICROMAP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("micromapSize"));
		BUILD_SCRATCH_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("buildScratchSize"));
		DISCARDABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("discardable"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MICROMAP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("micromapSize"));
		BUILD_SCRATCH_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("buildScratchSize"));
		DISCARDABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("discardable"));
		//@formatter:on
	}

	public VkMicromapBuildSizesInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkMicromapBuildSizesInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkMicromapBuildSizesInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkMicromapBuildSizesInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkMicromapBuildSizesInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #micromapSize()
    public VkMicromapBuildSizesInfoEXT micromapSize(long micromapSize) {
    	MICROMAP_SIZE_HANDLE.set(segment, 0L, micromapSize);
    	return this;
    }
    
    public long micromapSize() {
    	return (long) MICROMAP_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #buildScratchSize()
    public VkMicromapBuildSizesInfoEXT buildScratchSize(long buildScratchSize) {
    	BUILD_SCRATCH_SIZE_HANDLE.set(segment, 0L, buildScratchSize);
    	return this;
    }
    
    public long buildScratchSize() {
    	return (long) BUILD_SCRATCH_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #discardable()
    public VkMicromapBuildSizesInfoEXT discardable(int discardable) {
    	DISCARDABLE_HANDLE.set(segment, 0L, discardable);
    	return this;
    }
    
    public int discardable() {
    	return (int) DISCARDABLE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkMicromapBuildSizesInfoEXT set(VkMicromapBuildSizesInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkMicromapBuildSizesInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMicromapBuildSizesInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMicromapBuildSizesInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMicromapBuildSizesInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMicromapBuildSizesInfoEXT> array(Arena arena, VkMicromapBuildSizesInfoEXT... structs) {
        NativeStructArray<VkMicromapBuildSizesInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMicromapBuildSizesInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMicromapBuildSizesInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMicromapBuildSizesInfoEXT(segment)
        );
    }

}