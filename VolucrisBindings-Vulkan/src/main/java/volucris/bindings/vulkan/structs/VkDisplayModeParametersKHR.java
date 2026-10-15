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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkDisplayModeParametersKHR
		implements Struct<VkDisplayModeParametersKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle REFRESH_RATE_HANDLE;

	public static final long VISIBLE_REGION_BYTE_OFFSET;
	public static final long REFRESH_RATE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent2D visibleRegion;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    VkExtent2D.LAYOUT.withName("visibleRegion"),
		    JAVA_INT.withName("refreshRate")
		).withName("VkDisplayModeParametersKHR").withByteAlignment(4);
		
		REFRESH_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("refreshRate"));
		
		VISIBLE_REGION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("visibleRegion"));
		REFRESH_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("refreshRate"));
		//@formatter:on
	}

	public VkDisplayModeParametersKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkDisplayModeParametersKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDisplayModeParametersKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    visibleRegion = new VkExtent2D(segment.asSlice(VISIBLE_REGION_BYTE_OFFSET, VkExtent2D.LAYOUT));
	}

    /// @see #visibleRegion()
    public VkDisplayModeParametersKHR visibleRegion(Consumer<VkExtent2D> consumer) {
    	consumer.accept(visibleRegion);
    	return this;
    }
    
    /// @see #visibleRegion()
    public VkDisplayModeParametersKHR visibleRegion(VkExtent2D other) {
    	visibleRegion.set(other);
    	return this;
    }
    
    public VkExtent2D visibleRegion() {
    	return visibleRegion;
    }
    
    /// @see #refreshRate()
    public VkDisplayModeParametersKHR refreshRate(int refreshRate) {
    	REFRESH_RATE_HANDLE.set(segment, 0L, refreshRate);
    	return this;
    }
    
    public int refreshRate() {
    	return (int) REFRESH_RATE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDisplayModeParametersKHR set(VkDisplayModeParametersKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDisplayModeParametersKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDisplayModeParametersKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDisplayModeParametersKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplayModeParametersKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDisplayModeParametersKHR> array(Arena arena, VkDisplayModeParametersKHR... structs) {
        NativeStructArray<VkDisplayModeParametersKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplayModeParametersKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDisplayModeParametersKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDisplayModeParametersKHR(segment)
        );
    }

}