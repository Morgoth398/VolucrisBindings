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

public final class VkDescriptorImageInfo
		implements Struct<VkDescriptorImageInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SAMPLER_HANDLE;
	public static final VarHandle IMAGE_VIEW_HANDLE;
	public static final VarHandle IMAGE_LAYOUT_HANDLE;

	public static final long SAMPLER_BYTE_OFFSET;
	public static final long IMAGE_VIEW_BYTE_OFFSET;
	public static final long IMAGE_LAYOUT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("sampler"),
		    UNBOUNDED_ADDRESS.withName("imageView"),
		    JAVA_INT.withName("imageLayout"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDescriptorImageInfo").withByteAlignment(8);
		
		SAMPLER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampler"));
		IMAGE_VIEW_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageView"));
		IMAGE_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageLayout"));
		
		SAMPLER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampler"));
		IMAGE_VIEW_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageView"));
		IMAGE_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageLayout"));
		//@formatter:on
	}

	public VkDescriptorImageInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkDescriptorImageInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDescriptorImageInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sampler()
    public VkDescriptorImageInfo sampler(VkSampler sampler) {
    	SAMPLER_HANDLE.set(segment, 0L, sampler.memorySegment());
    	return this;
    }
    
    public @Nullable VkSampler sampler() {
    	MemorySegment segment = (MemorySegment) SAMPLER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkSampler(segment);
    }
    
    /// @see #imageView()
    public VkDescriptorImageInfo imageView(VkImageView imageView) {
    	IMAGE_VIEW_HANDLE.set(segment, 0L, imageView.memorySegment());
    	return this;
    }
    
    public @Nullable VkImageView imageView() {
    	MemorySegment segment = (MemorySegment) IMAGE_VIEW_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImageView(segment);
    }
    
    /// @see #imageLayout()
    public VkDescriptorImageInfo imageLayout(int imageLayout) {
    	IMAGE_LAYOUT_HANDLE.set(segment, 0L, imageLayout);
    	return this;
    }
    
    public int imageLayout() {
    	return (int) IMAGE_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDescriptorImageInfo set(VkDescriptorImageInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorImageInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorImageInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorImageInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorImageInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorImageInfo> array(Arena arena, VkDescriptorImageInfo... structs) {
        NativeStructArray<VkDescriptorImageInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorImageInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorImageInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorImageInfo(segment)
        );
    }

}