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

public final class VkVideoEncodeQualityLevelPropertiesKHR
		implements Struct<VkVideoEncodeQualityLevelPropertiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PREFERRED_RATE_CONTROL_MODE_HANDLE;
	public static final VarHandle PREFERRED_RATE_CONTROL_LAYER_COUNT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PREFERRED_RATE_CONTROL_MODE_BYTE_OFFSET;
	public static final long PREFERRED_RATE_CONTROL_LAYER_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("preferredRateControlMode"),
		    JAVA_INT.withName("preferredRateControlLayerCount")
		).withName("VkVideoEncodeQualityLevelPropertiesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PREFERRED_RATE_CONTROL_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredRateControlMode"));
		PREFERRED_RATE_CONTROL_LAYER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredRateControlLayerCount"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PREFERRED_RATE_CONTROL_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredRateControlMode"));
		PREFERRED_RATE_CONTROL_LAYER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredRateControlLayerCount"));
		//@formatter:on
	}

	public VkVideoEncodeQualityLevelPropertiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeQualityLevelPropertiesKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoEncodeQualityLevelPropertiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeQualityLevelPropertiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeQualityLevelPropertiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #preferredRateControlMode()
    public VkVideoEncodeQualityLevelPropertiesKHR preferredRateControlMode(int preferredRateControlMode) {
    	PREFERRED_RATE_CONTROL_MODE_HANDLE.set(segment, 0L, preferredRateControlMode);
    	return this;
    }
    
    public int preferredRateControlMode() {
    	return (int) PREFERRED_RATE_CONTROL_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredRateControlLayerCount()
    public VkVideoEncodeQualityLevelPropertiesKHR preferredRateControlLayerCount(int preferredRateControlLayerCount) {
    	PREFERRED_RATE_CONTROL_LAYER_COUNT_HANDLE.set(segment, 0L, preferredRateControlLayerCount);
    	return this;
    }
    
    public int preferredRateControlLayerCount() {
    	return (int) PREFERRED_RATE_CONTROL_LAYER_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeQualityLevelPropertiesKHR set(VkVideoEncodeQualityLevelPropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeQualityLevelPropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeQualityLevelPropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeQualityLevelPropertiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeQualityLevelPropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeQualityLevelPropertiesKHR> array(Arena arena, VkVideoEncodeQualityLevelPropertiesKHR... structs) {
        NativeStructArray<VkVideoEncodeQualityLevelPropertiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeQualityLevelPropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeQualityLevelPropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeQualityLevelPropertiesKHR(segment)
        );
    }

}