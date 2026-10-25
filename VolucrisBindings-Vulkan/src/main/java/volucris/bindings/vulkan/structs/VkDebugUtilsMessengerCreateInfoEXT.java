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

public final class VkDebugUtilsMessengerCreateInfoEXT
		implements Struct<VkDebugUtilsMessengerCreateInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle MESSAGE_SEVERITY_HANDLE;
	public static final VarHandle MESSAGE_TYPE_HANDLE;
	public static final VarHandle PFN_USER_CALLBACK_HANDLE;
	public static final VarHandle P_USER_DATA_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long MESSAGE_SEVERITY_BYTE_OFFSET;
	public static final long MESSAGE_TYPE_BYTE_OFFSET;
	public static final long PFN_USER_CALLBACK_BYTE_OFFSET;
	public static final long P_USER_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("messageSeverity"),
		    JAVA_INT.withName("messageType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pfnUserCallback"),
		    UNBOUNDED_ADDRESS.withName("pUserData")
		).withName("VkDebugUtilsMessengerCreateInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		MESSAGE_SEVERITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("messageSeverity"));
		MESSAGE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("messageType"));
		PFN_USER_CALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pfnUserCallback"));
		P_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUserData"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		MESSAGE_SEVERITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("messageSeverity"));
		MESSAGE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("messageType"));
		PFN_USER_CALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pfnUserCallback"));
		P_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
		//@formatter:on
	}

	public VkDebugUtilsMessengerCreateInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDebugUtilsMessengerCreateInfoEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDebugUtilsMessengerCreateInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDebugUtilsMessengerCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDebugUtilsMessengerCreateInfoEXT pNext(MemorySegment pNext) {
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
    public VkDebugUtilsMessengerCreateInfoEXT flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #messageSeverity()
    public VkDebugUtilsMessengerCreateInfoEXT messageSeverity(int messageSeverity) {
    	MESSAGE_SEVERITY_HANDLE.set(segment, 0L, messageSeverity);
    	return this;
    }
    
    public int messageSeverity() {
    	return (int) MESSAGE_SEVERITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #messageType()
    public VkDebugUtilsMessengerCreateInfoEXT messageType(int messageType) {
    	MESSAGE_TYPE_HANDLE.set(segment, 0L, messageType);
    	return this;
    }
    
    public int messageType() {
    	return (int) MESSAGE_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pfnUserCallback()
    public VkDebugUtilsMessengerCreateInfoEXT pfnUserCallback(VkDebugUtilsMessengerCallbackEXT pfnUserCallback) {
    	PFN_USER_CALLBACK_HANDLE.set(segment, 0L, pfnUserCallback.memorySegment());
    	return this;
    }
    
    public @Nullable VkDebugUtilsMessengerCallbackEXT pfnUserCallback() {
    	MemorySegment segment = (MemorySegment) PFN_USER_CALLBACK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return VkDebugUtilsMessengerCallbackEXT.get(segment);
    }
    
    /// @see #pUserData()
    public VkDebugUtilsMessengerCreateInfoEXT pUserData(MemorySegment pUserData) {
    	P_USER_DATA_HANDLE.set(segment, 0L, pUserData);
    	return this;
    }
    
    public @Nullable MemorySegment pUserData() {
    	MemorySegment segment = (MemorySegment) P_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VkDebugUtilsMessengerCreateInfoEXT set(VkDebugUtilsMessengerCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDebugUtilsMessengerCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDebugUtilsMessengerCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDebugUtilsMessengerCreateInfoEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDebugUtilsMessengerCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDebugUtilsMessengerCreateInfoEXT> array(SegmentAllocator allocator, VkDebugUtilsMessengerCreateInfoEXT... structs) {
        NativeStructArray<VkDebugUtilsMessengerCreateInfoEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDebugUtilsMessengerCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDebugUtilsMessengerCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDebugUtilsMessengerCreateInfoEXT(segment)
        );
    }

}