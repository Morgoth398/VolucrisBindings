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

public final class VkPhysicalDeviceRenderPassStripedFeaturesARM
		implements Struct<VkPhysicalDeviceRenderPassStripedFeaturesARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle RENDER_PASS_STRIPED_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long RENDER_PASS_STRIPED_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("renderPassStriped"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceRenderPassStripedFeaturesARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		RENDER_PASS_STRIPED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("renderPassStriped"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		RENDER_PASS_STRIPED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("renderPassStriped"));
		//@formatter:on
	}

	public VkPhysicalDeviceRenderPassStripedFeaturesARM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceRenderPassStripedFeaturesARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceRenderPassStripedFeaturesARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceRenderPassStripedFeaturesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceRenderPassStripedFeaturesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #renderPassStriped()
    public VkPhysicalDeviceRenderPassStripedFeaturesARM renderPassStriped(int renderPassStriped) {
    	RENDER_PASS_STRIPED_HANDLE.set(segment, 0L, renderPassStriped);
    	return this;
    }
    
    public int renderPassStriped() {
    	return (int) RENDER_PASS_STRIPED_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceRenderPassStripedFeaturesARM set(VkPhysicalDeviceRenderPassStripedFeaturesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceRenderPassStripedFeaturesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceRenderPassStripedFeaturesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceRenderPassStripedFeaturesARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceRenderPassStripedFeaturesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceRenderPassStripedFeaturesARM> array(Arena arena, VkPhysicalDeviceRenderPassStripedFeaturesARM... structs) {
        NativeStructArray<VkPhysicalDeviceRenderPassStripedFeaturesARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceRenderPassStripedFeaturesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceRenderPassStripedFeaturesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceRenderPassStripedFeaturesARM(segment)
        );
    }

}