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

public final class VkDeviceDeviceMemoryReportCreateInfoEXT
		implements Struct<VkDeviceDeviceMemoryReportCreateInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle PFN_USER_CALLBACK_HANDLE;
	public static final VarHandle P_USER_DATA_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
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
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pfnUserCallback"),
		    UNBOUNDED_ADDRESS.withName("pUserData")
		).withName("VkDeviceDeviceMemoryReportCreateInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		PFN_USER_CALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pfnUserCallback"));
		P_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUserData"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		PFN_USER_CALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pfnUserCallback"));
		P_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
		//@formatter:on
	}

	public VkDeviceDeviceMemoryReportCreateInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDeviceDeviceMemoryReportCreateInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDeviceDeviceMemoryReportCreateInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDeviceDeviceMemoryReportCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceDeviceMemoryReportCreateInfoEXT pNext(MemorySegment pNext) {
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
    public VkDeviceDeviceMemoryReportCreateInfoEXT flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pfnUserCallback()
    public VkDeviceDeviceMemoryReportCreateInfoEXT pfnUserCallback(VkDeviceMemoryReportCallbackEXT pfnUserCallback) {
    	PFN_USER_CALLBACK_HANDLE.set(segment, 0L, pfnUserCallback.memorySegment());
    	return this;
    }
    
    public @Nullable VkDeviceMemoryReportCallbackEXT pfnUserCallback() {
    	MemorySegment segment = (MemorySegment) PFN_USER_CALLBACK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return VkDeviceMemoryReportCallbackEXT.get(segment);
    }
    
    /// @see #pUserData()
    public VkDeviceDeviceMemoryReportCreateInfoEXT pUserData(MemorySegment pUserData) {
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
    public VkDeviceDeviceMemoryReportCreateInfoEXT set(VkDeviceDeviceMemoryReportCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceDeviceMemoryReportCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceDeviceMemoryReportCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceDeviceMemoryReportCreateInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceDeviceMemoryReportCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceDeviceMemoryReportCreateInfoEXT> array(Arena arena, VkDeviceDeviceMemoryReportCreateInfoEXT... structs) {
        NativeStructArray<VkDeviceDeviceMemoryReportCreateInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceDeviceMemoryReportCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceDeviceMemoryReportCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceDeviceMemoryReportCreateInfoEXT(segment)
        );
    }

}