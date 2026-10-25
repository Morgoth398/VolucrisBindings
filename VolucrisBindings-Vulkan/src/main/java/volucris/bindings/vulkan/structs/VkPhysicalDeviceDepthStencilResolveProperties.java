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

public final class VkPhysicalDeviceDepthStencilResolveProperties
		implements Struct<VkPhysicalDeviceDepthStencilResolveProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SUPPORTED_DEPTH_RESOLVE_MODES_HANDLE;
	public static final VarHandle SUPPORTED_STENCIL_RESOLVE_MODES_HANDLE;
	public static final VarHandle INDEPENDENT_RESOLVE_NONE_HANDLE;
	public static final VarHandle INDEPENDENT_RESOLVE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SUPPORTED_DEPTH_RESOLVE_MODES_BYTE_OFFSET;
	public static final long SUPPORTED_STENCIL_RESOLVE_MODES_BYTE_OFFSET;
	public static final long INDEPENDENT_RESOLVE_NONE_BYTE_OFFSET;
	public static final long INDEPENDENT_RESOLVE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("supportedDepthResolveModes"),
		    JAVA_INT.withName("supportedStencilResolveModes"),
		    JAVA_INT.withName("independentResolveNone"),
		    JAVA_INT.withName("independentResolve")
		).withName("VkPhysicalDeviceDepthStencilResolveProperties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SUPPORTED_DEPTH_RESOLVE_MODES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedDepthResolveModes"));
		SUPPORTED_STENCIL_RESOLVE_MODES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedStencilResolveModes"));
		INDEPENDENT_RESOLVE_NONE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("independentResolveNone"));
		INDEPENDENT_RESOLVE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("independentResolve"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SUPPORTED_DEPTH_RESOLVE_MODES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedDepthResolveModes"));
		SUPPORTED_STENCIL_RESOLVE_MODES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedStencilResolveModes"));
		INDEPENDENT_RESOLVE_NONE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("independentResolveNone"));
		INDEPENDENT_RESOLVE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("independentResolve"));
		//@formatter:on
	}

	public VkPhysicalDeviceDepthStencilResolveProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceDepthStencilResolveProperties(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceDepthStencilResolveProperties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceDepthStencilResolveProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDepthStencilResolveProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #supportedDepthResolveModes()
    public VkPhysicalDeviceDepthStencilResolveProperties supportedDepthResolveModes(int supportedDepthResolveModes) {
    	SUPPORTED_DEPTH_RESOLVE_MODES_HANDLE.set(segment, 0L, supportedDepthResolveModes);
    	return this;
    }
    
    public int supportedDepthResolveModes() {
    	return (int) SUPPORTED_DEPTH_RESOLVE_MODES_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedStencilResolveModes()
    public VkPhysicalDeviceDepthStencilResolveProperties supportedStencilResolveModes(int supportedStencilResolveModes) {
    	SUPPORTED_STENCIL_RESOLVE_MODES_HANDLE.set(segment, 0L, supportedStencilResolveModes);
    	return this;
    }
    
    public int supportedStencilResolveModes() {
    	return (int) SUPPORTED_STENCIL_RESOLVE_MODES_HANDLE.get(segment, 0L);
    }
    
    /// @see #independentResolveNone()
    public VkPhysicalDeviceDepthStencilResolveProperties independentResolveNone(int independentResolveNone) {
    	INDEPENDENT_RESOLVE_NONE_HANDLE.set(segment, 0L, independentResolveNone);
    	return this;
    }
    
    public int independentResolveNone() {
    	return (int) INDEPENDENT_RESOLVE_NONE_HANDLE.get(segment, 0L);
    }
    
    /// @see #independentResolve()
    public VkPhysicalDeviceDepthStencilResolveProperties independentResolve(int independentResolve) {
    	INDEPENDENT_RESOLVE_HANDLE.set(segment, 0L, independentResolve);
    	return this;
    }
    
    public int independentResolve() {
    	return (int) INDEPENDENT_RESOLVE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDepthStencilResolveProperties set(VkPhysicalDeviceDepthStencilResolveProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDepthStencilResolveProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDepthStencilResolveProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDepthStencilResolveProperties> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceDepthStencilResolveProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDepthStencilResolveProperties> array(SegmentAllocator allocator, VkPhysicalDeviceDepthStencilResolveProperties... structs) {
        NativeStructArray<VkPhysicalDeviceDepthStencilResolveProperties> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceDepthStencilResolveProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDepthStencilResolveProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDepthStencilResolveProperties(segment)
        );
    }

}