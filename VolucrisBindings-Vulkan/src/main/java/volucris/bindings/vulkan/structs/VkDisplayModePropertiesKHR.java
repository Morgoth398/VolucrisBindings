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

public final class VkDisplayModePropertiesKHR
		implements Struct<VkDisplayModePropertiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle DISPLAY_MODE_HANDLE;

	public static final long DISPLAY_MODE_BYTE_OFFSET;
	public static final long PARAMETERS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkDisplayModeParametersKHR parameters;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("displayMode"),
		    VkDisplayModeParametersKHR.LAYOUT.withName("parameters"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDisplayModePropertiesKHR").withByteAlignment(8);
		
		DISPLAY_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("displayMode"));
		
		DISPLAY_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("displayMode"));
		PARAMETERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("parameters"));
		//@formatter:on
	}

	public VkDisplayModePropertiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkDisplayModePropertiesKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDisplayModePropertiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    parameters = new VkDisplayModeParametersKHR(segment.asSlice(PARAMETERS_BYTE_OFFSET, VkDisplayModeParametersKHR.LAYOUT));
	}

    /// @see #displayMode()
    public VkDisplayModePropertiesKHR displayMode(VkDisplayModeKHR displayMode) {
    	DISPLAY_MODE_HANDLE.set(segment, 0L, displayMode.memorySegment());
    	return this;
    }
    
    public @Nullable VkDisplayModeKHR displayMode() {
    	MemorySegment segment = (MemorySegment) DISPLAY_MODE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDisplayModeKHR(segment);
    }
    
    /// @see #parameters()
    public VkDisplayModePropertiesKHR parameters(Consumer<VkDisplayModeParametersKHR> consumer) {
    	consumer.accept(parameters);
    	return this;
    }
    
    /// @see #parameters()
    public VkDisplayModePropertiesKHR parameters(VkDisplayModeParametersKHR other) {
    	parameters.set(other);
    	return this;
    }
    
    public VkDisplayModeParametersKHR parameters() {
    	return parameters;
    }
    
    @Override
    public VkDisplayModePropertiesKHR set(VkDisplayModePropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDisplayModePropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDisplayModePropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDisplayModePropertiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplayModePropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDisplayModePropertiesKHR> array(Arena arena, VkDisplayModePropertiesKHR... structs) {
        NativeStructArray<VkDisplayModePropertiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplayModePropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDisplayModePropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDisplayModePropertiesKHR(segment)
        );
    }

}