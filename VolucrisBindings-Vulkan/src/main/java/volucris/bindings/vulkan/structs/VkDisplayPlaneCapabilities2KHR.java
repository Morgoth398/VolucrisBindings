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

public final class VkDisplayPlaneCapabilities2KHR
		implements Struct<VkDisplayPlaneCapabilities2KHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long CAPABILITIES_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkDisplayPlaneCapabilitiesKHR capabilities;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkDisplayPlaneCapabilitiesKHR.LAYOUT.withName("capabilities"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDisplayPlaneCapabilities2KHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		CAPABILITIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("capabilities"));
		//@formatter:on
	}

	public VkDisplayPlaneCapabilities2KHR() {
	    this(Arena.ofAuto());
	}
	
	public VkDisplayPlaneCapabilities2KHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDisplayPlaneCapabilities2KHR(MemorySegment segment) {
	    this.segment = segment;
	
	    capabilities = new VkDisplayPlaneCapabilitiesKHR(segment.asSlice(CAPABILITIES_BYTE_OFFSET, VkDisplayPlaneCapabilitiesKHR.LAYOUT));
	}

    /// @see #sType()
    public VkDisplayPlaneCapabilities2KHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDisplayPlaneCapabilities2KHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #capabilities()
    public VkDisplayPlaneCapabilities2KHR capabilities(Consumer<VkDisplayPlaneCapabilitiesKHR> consumer) {
    	consumer.accept(capabilities);
    	return this;
    }
    
    /// @see #capabilities()
    public VkDisplayPlaneCapabilities2KHR capabilities(VkDisplayPlaneCapabilitiesKHR other) {
    	capabilities.set(other);
    	return this;
    }
    
    public VkDisplayPlaneCapabilitiesKHR capabilities() {
    	return capabilities;
    }
    
    @Override
    public VkDisplayPlaneCapabilities2KHR set(VkDisplayPlaneCapabilities2KHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDisplayPlaneCapabilities2KHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDisplayPlaneCapabilities2KHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDisplayPlaneCapabilities2KHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplayPlaneCapabilities2KHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDisplayPlaneCapabilities2KHR> array(Arena arena, VkDisplayPlaneCapabilities2KHR... structs) {
        NativeStructArray<VkDisplayPlaneCapabilities2KHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplayPlaneCapabilities2KHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDisplayPlaneCapabilities2KHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDisplayPlaneCapabilities2KHR(segment)
        );
    }

}