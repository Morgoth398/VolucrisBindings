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

public final class VkDisplayPlanePropertiesKHR
		implements Struct<VkDisplayPlanePropertiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CURRENT_DISPLAY_HANDLE;
	public static final VarHandle CURRENT_STACK_INDEX_HANDLE;

	public static final long CURRENT_DISPLAY_BYTE_OFFSET;
	public static final long CURRENT_STACK_INDEX_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("currentDisplay"),
		    JAVA_INT.withName("currentStackIndex"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDisplayPlanePropertiesKHR").withByteAlignment(8);
		
		CURRENT_DISPLAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("currentDisplay"));
		CURRENT_STACK_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("currentStackIndex"));
		
		CURRENT_DISPLAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("currentDisplay"));
		CURRENT_STACK_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("currentStackIndex"));
		//@formatter:on
	}

	public VkDisplayPlanePropertiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkDisplayPlanePropertiesKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDisplayPlanePropertiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #currentDisplay()
    public VkDisplayPlanePropertiesKHR currentDisplay(VkDisplayKHR currentDisplay) {
    	CURRENT_DISPLAY_HANDLE.set(segment, 0L, currentDisplay.memorySegment());
    	return this;
    }
    
    public @Nullable VkDisplayKHR currentDisplay() {
    	MemorySegment segment = (MemorySegment) CURRENT_DISPLAY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDisplayKHR(segment);
    }
    
    /// @see #currentStackIndex()
    public VkDisplayPlanePropertiesKHR currentStackIndex(int currentStackIndex) {
    	CURRENT_STACK_INDEX_HANDLE.set(segment, 0L, currentStackIndex);
    	return this;
    }
    
    public int currentStackIndex() {
    	return (int) CURRENT_STACK_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDisplayPlanePropertiesKHR set(VkDisplayPlanePropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDisplayPlanePropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDisplayPlanePropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDisplayPlanePropertiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplayPlanePropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDisplayPlanePropertiesKHR> array(Arena arena, VkDisplayPlanePropertiesKHR... structs) {
        NativeStructArray<VkDisplayPlanePropertiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplayPlanePropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDisplayPlanePropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDisplayPlanePropertiesKHR(segment)
        );
    }

}