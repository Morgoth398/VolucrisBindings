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

public final class VkVideoSessionParametersCreateInfoKHR
		implements Struct<VkVideoSessionParametersCreateInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle VIDEO_SESSION_PARAMETERS_TEMPLATE_HANDLE;
	public static final VarHandle VIDEO_SESSION_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long VIDEO_SESSION_PARAMETERS_TEMPLATE_BYTE_OFFSET;
	public static final long VIDEO_SESSION_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("videoSessionParametersTemplate"),
		    UNBOUNDED_ADDRESS.withName("videoSession")
		).withName("VkVideoSessionParametersCreateInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		VIDEO_SESSION_PARAMETERS_TEMPLATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("videoSessionParametersTemplate"));
		VIDEO_SESSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("videoSession"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		VIDEO_SESSION_PARAMETERS_TEMPLATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("videoSessionParametersTemplate"));
		VIDEO_SESSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("videoSession"));
		//@formatter:on
	}

	public VkVideoSessionParametersCreateInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoSessionParametersCreateInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoSessionParametersCreateInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoSessionParametersCreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoSessionParametersCreateInfoKHR pNext(MemorySegment pNext) {
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
    public VkVideoSessionParametersCreateInfoKHR flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #videoSessionParametersTemplate()
    public VkVideoSessionParametersCreateInfoKHR videoSessionParametersTemplate(VkVideoSessionParametersKHR videoSessionParametersTemplate) {
    	VIDEO_SESSION_PARAMETERS_TEMPLATE_HANDLE.set(segment, 0L, videoSessionParametersTemplate.memorySegment());
    	return this;
    }
    
    public @Nullable VkVideoSessionParametersKHR videoSessionParametersTemplate() {
    	MemorySegment segment = (MemorySegment) VIDEO_SESSION_PARAMETERS_TEMPLATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkVideoSessionParametersKHR(segment);
    }
    
    /// @see #videoSession()
    public VkVideoSessionParametersCreateInfoKHR videoSession(VkVideoSessionKHR videoSession) {
    	VIDEO_SESSION_HANDLE.set(segment, 0L, videoSession.memorySegment());
    	return this;
    }
    
    public @Nullable VkVideoSessionKHR videoSession() {
    	MemorySegment segment = (MemorySegment) VIDEO_SESSION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkVideoSessionKHR(segment);
    }
    
    @Override
    public VkVideoSessionParametersCreateInfoKHR set(VkVideoSessionParametersCreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoSessionParametersCreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoSessionParametersCreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoSessionParametersCreateInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoSessionParametersCreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoSessionParametersCreateInfoKHR> array(Arena arena, VkVideoSessionParametersCreateInfoKHR... structs) {
        NativeStructArray<VkVideoSessionParametersCreateInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoSessionParametersCreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoSessionParametersCreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoSessionParametersCreateInfoKHR(segment)
        );
    }

}