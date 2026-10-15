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

public final class VkDataGraphPipelineCreateInfoARM
		implements Struct<VkDataGraphPipelineCreateInfoARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle LAYOUT_HANDLE;
	public static final VarHandle RESOURCE_INFO_COUNT_HANDLE;
	public static final VarHandle P_RESOURCE_INFOS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long LAYOUT_BYTE_OFFSET;
	public static final long RESOURCE_INFO_COUNT_BYTE_OFFSET;
	public static final long P_RESOURCE_INFOS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("flags"),
		    UNBOUNDED_ADDRESS.withName("layout"),
		    JAVA_INT.withName("resourceInfoCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pResourceInfos")
		).withName("VkDataGraphPipelineCreateInfoARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layout"));
		RESOURCE_INFO_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("resourceInfoCount"));
		P_RESOURCE_INFOS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pResourceInfos"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layout"));
		RESOURCE_INFO_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resourceInfoCount"));
		P_RESOURCE_INFOS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pResourceInfos"));
		//@formatter:on
	}

	public VkDataGraphPipelineCreateInfoARM() {
	    this(Arena.ofAuto());
	}
	
	public VkDataGraphPipelineCreateInfoARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDataGraphPipelineCreateInfoARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDataGraphPipelineCreateInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDataGraphPipelineCreateInfoARM pNext(MemorySegment pNext) {
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
    public VkDataGraphPipelineCreateInfoARM flags(long flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public long flags() {
    	return (long) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #layout()
    public VkDataGraphPipelineCreateInfoARM layout(VkPipelineLayout layout) {
    	LAYOUT_HANDLE.set(segment, 0L, layout.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineLayout layout() {
    	MemorySegment segment = (MemorySegment) LAYOUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineLayout(segment);
    }
    
    /// @see #resourceInfoCount()
    public VkDataGraphPipelineCreateInfoARM resourceInfoCount(int resourceInfoCount) {
    	RESOURCE_INFO_COUNT_HANDLE.set(segment, 0L, resourceInfoCount);
    	return this;
    }
    
    public int resourceInfoCount() {
    	return (int) RESOURCE_INFO_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pResourceInfos()
    public VkDataGraphPipelineCreateInfoARM pResourceInfos(NativeStructArray<VkDataGraphPipelineResourceInfoARM> pResourceInfos) {
    	P_RESOURCE_INFOS_HANDLE.set(segment, 0L, pResourceInfos.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkDataGraphPipelineResourceInfoARM> pResourceInfos() {
    	MemorySegment segment = (MemorySegment) P_RESOURCE_INFOS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkDataGraphPipelineResourceInfoARM.array(segment);
    }
    
    @Override
    public VkDataGraphPipelineCreateInfoARM set(VkDataGraphPipelineCreateInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDataGraphPipelineCreateInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDataGraphPipelineCreateInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDataGraphPipelineCreateInfoARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelineCreateInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDataGraphPipelineCreateInfoARM> array(Arena arena, VkDataGraphPipelineCreateInfoARM... structs) {
        NativeStructArray<VkDataGraphPipelineCreateInfoARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelineCreateInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDataGraphPipelineCreateInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDataGraphPipelineCreateInfoARM(segment)
        );
    }

}