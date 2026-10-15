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

public final class VkPhysicalDeviceImagelessFramebufferFeatures
		implements Struct<VkPhysicalDeviceImagelessFramebufferFeatures> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle IMAGELESS_FRAMEBUFFER_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long IMAGELESS_FRAMEBUFFER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("imagelessFramebuffer"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceImagelessFramebufferFeatures").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		IMAGELESS_FRAMEBUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imagelessFramebuffer"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		IMAGELESS_FRAMEBUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imagelessFramebuffer"));
		//@formatter:on
	}

	public VkPhysicalDeviceImagelessFramebufferFeatures() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceImagelessFramebufferFeatures(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceImagelessFramebufferFeatures(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceImagelessFramebufferFeatures sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceImagelessFramebufferFeatures pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #imagelessFramebuffer()
    public VkPhysicalDeviceImagelessFramebufferFeatures imagelessFramebuffer(int imagelessFramebuffer) {
    	IMAGELESS_FRAMEBUFFER_HANDLE.set(segment, 0L, imagelessFramebuffer);
    	return this;
    }
    
    public int imagelessFramebuffer() {
    	return (int) IMAGELESS_FRAMEBUFFER_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceImagelessFramebufferFeatures set(VkPhysicalDeviceImagelessFramebufferFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceImagelessFramebufferFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceImagelessFramebufferFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceImagelessFramebufferFeatures> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceImagelessFramebufferFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceImagelessFramebufferFeatures> array(Arena arena, VkPhysicalDeviceImagelessFramebufferFeatures... structs) {
        NativeStructArray<VkPhysicalDeviceImagelessFramebufferFeatures> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceImagelessFramebufferFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceImagelessFramebufferFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceImagelessFramebufferFeatures(segment)
        );
    }

}