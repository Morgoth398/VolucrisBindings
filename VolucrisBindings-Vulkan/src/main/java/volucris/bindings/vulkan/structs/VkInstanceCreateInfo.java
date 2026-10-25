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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkInstanceCreateInfo
		implements Struct<VkInstanceCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle P_APPLICATION_INFO_HANDLE;
	public static final VarHandle ENABLED_LAYER_COUNT_HANDLE;
	public static final VarHandle PP_ENABLED_LAYER_NAMES_HANDLE;
	public static final VarHandle ENABLED_EXTENSION_COUNT_HANDLE;
	public static final VarHandle PP_ENABLED_EXTENSION_NAMES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long P_APPLICATION_INFO_BYTE_OFFSET;
	public static final long ENABLED_LAYER_COUNT_BYTE_OFFSET;
	public static final long PP_ENABLED_LAYER_NAMES_BYTE_OFFSET;
	public static final long ENABLED_EXTENSION_COUNT_BYTE_OFFSET;
	public static final long PP_ENABLED_EXTENSION_NAMES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pApplicationInfo"),
		    JAVA_INT.withName("enabledLayerCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("ppEnabledLayerNames"),
		    JAVA_INT.withName("enabledExtensionCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("ppEnabledExtensionNames")
		).withName("VkInstanceCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		P_APPLICATION_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pApplicationInfo"));
		ENABLED_LAYER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enabledLayerCount"));
		PP_ENABLED_LAYER_NAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ppEnabledLayerNames"));
		ENABLED_EXTENSION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enabledExtensionCount"));
		PP_ENABLED_EXTENSION_NAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ppEnabledExtensionNames"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		P_APPLICATION_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pApplicationInfo"));
		ENABLED_LAYER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enabledLayerCount"));
		PP_ENABLED_LAYER_NAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ppEnabledLayerNames"));
		ENABLED_EXTENSION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enabledExtensionCount"));
		PP_ENABLED_EXTENSION_NAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ppEnabledExtensionNames"));
		//@formatter:on
	}

	public VkInstanceCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkInstanceCreateInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkInstanceCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkInstanceCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkInstanceCreateInfo pNext(MemorySegment pNext) {
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
    public VkInstanceCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pApplicationInfo()
    public VkInstanceCreateInfo pApplicationInfo(VkApplicationInfo pApplicationInfo) {
    	P_APPLICATION_INFO_HANDLE.set(segment, 0L, pApplicationInfo.memorySegment());
    	return this;
    }
    
    public @Nullable VkApplicationInfo pApplicationInfo() {
    	MemorySegment segment = (MemorySegment) P_APPLICATION_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkApplicationInfo(segment);
    }
    
    /// @see #enabledLayerCount()
    public VkInstanceCreateInfo enabledLayerCount(int enabledLayerCount) {
    	ENABLED_LAYER_COUNT_HANDLE.set(segment, 0L, enabledLayerCount);
    	return this;
    }
    
    public int enabledLayerCount() {
    	return (int) ENABLED_LAYER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #ppEnabledLayerNames()
    public VkInstanceCreateInfo ppEnabledLayerNames(NativePointerArray ppEnabledLayerNames) {
    	PP_ENABLED_LAYER_NAMES_HANDLE.set(segment, 0L, ppEnabledLayerNames.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray ppEnabledLayerNames() {
    	MemorySegment segment = (MemorySegment) PP_ENABLED_LAYER_NAMES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #enabledExtensionCount()
    public VkInstanceCreateInfo enabledExtensionCount(int enabledExtensionCount) {
    	ENABLED_EXTENSION_COUNT_HANDLE.set(segment, 0L, enabledExtensionCount);
    	return this;
    }
    
    public int enabledExtensionCount() {
    	return (int) ENABLED_EXTENSION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #ppEnabledExtensionNames()
    public VkInstanceCreateInfo ppEnabledExtensionNames(NativePointerArray ppEnabledExtensionNames) {
    	PP_ENABLED_EXTENSION_NAMES_HANDLE.set(segment, 0L, ppEnabledExtensionNames.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray ppEnabledExtensionNames() {
    	MemorySegment segment = (MemorySegment) PP_ENABLED_EXTENSION_NAMES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    @Override
    public VkInstanceCreateInfo set(VkInstanceCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkInstanceCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkInstanceCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkInstanceCreateInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkInstanceCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkInstanceCreateInfo> array(SegmentAllocator allocator, VkInstanceCreateInfo... structs) {
        NativeStructArray<VkInstanceCreateInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkInstanceCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkInstanceCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkInstanceCreateInfo(segment)
        );
    }

}