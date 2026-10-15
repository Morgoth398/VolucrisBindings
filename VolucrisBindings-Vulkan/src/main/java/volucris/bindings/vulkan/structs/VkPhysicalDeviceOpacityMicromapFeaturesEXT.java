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

public final class VkPhysicalDeviceOpacityMicromapFeaturesEXT
		implements Struct<VkPhysicalDeviceOpacityMicromapFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MICROMAP_HANDLE;
	public static final VarHandle MICROMAP_CAPTURE_REPLAY_HANDLE;
	public static final VarHandle MICROMAP_HOST_COMMANDS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MICROMAP_BYTE_OFFSET;
	public static final long MICROMAP_CAPTURE_REPLAY_BYTE_OFFSET;
	public static final long MICROMAP_HOST_COMMANDS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("micromap"),
		    JAVA_INT.withName("micromapCaptureReplay"),
		    JAVA_INT.withName("micromapHostCommands"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceOpacityMicromapFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MICROMAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("micromap"));
		MICROMAP_CAPTURE_REPLAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("micromapCaptureReplay"));
		MICROMAP_HOST_COMMANDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("micromapHostCommands"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MICROMAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("micromap"));
		MICROMAP_CAPTURE_REPLAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("micromapCaptureReplay"));
		MICROMAP_HOST_COMMANDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("micromapHostCommands"));
		//@formatter:on
	}

	public VkPhysicalDeviceOpacityMicromapFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceOpacityMicromapFeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceOpacityMicromapFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #micromap()
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromap(int micromap) {
    	MICROMAP_HANDLE.set(segment, 0L, micromap);
    	return this;
    }
    
    public int micromap() {
    	return (int) MICROMAP_HANDLE.get(segment, 0L);
    }
    
    /// @see #micromapCaptureReplay()
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapCaptureReplay(int micromapCaptureReplay) {
    	MICROMAP_CAPTURE_REPLAY_HANDLE.set(segment, 0L, micromapCaptureReplay);
    	return this;
    }
    
    public int micromapCaptureReplay() {
    	return (int) MICROMAP_CAPTURE_REPLAY_HANDLE.get(segment, 0L);
    }
    
    /// @see #micromapHostCommands()
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapHostCommands(int micromapHostCommands) {
    	MICROMAP_HOST_COMMANDS_HANDLE.set(segment, 0L, micromapHostCommands);
    	return this;
    }
    
    public int micromapHostCommands() {
    	return (int) MICROMAP_HOST_COMMANDS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT set(VkPhysicalDeviceOpacityMicromapFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceOpacityMicromapFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceOpacityMicromapFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceOpacityMicromapFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceOpacityMicromapFeaturesEXT> array(Arena arena, VkPhysicalDeviceOpacityMicromapFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceOpacityMicromapFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceOpacityMicromapFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceOpacityMicromapFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceOpacityMicromapFeaturesEXT(segment)
        );
    }

}