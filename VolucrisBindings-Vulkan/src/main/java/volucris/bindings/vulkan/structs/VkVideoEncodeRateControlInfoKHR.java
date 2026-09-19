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

public final class VkVideoEncodeRateControlInfoKHR
		implements Struct<VkVideoEncodeRateControlInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle RATE_CONTROL_MODE_HANDLE;
    public static final VarHandle LAYER_COUNT_HANDLE;
    public static final VarHandle P_LAYERS_HANDLE;
    public static final VarHandle VIRTUAL_BUFFER_SIZE_IN_MS_HANDLE;
    public static final VarHandle INITIAL_VIRTUAL_BUFFER_SIZE_IN_MS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long RATE_CONTROL_MODE_BYTE_OFFSET;
    public static final long LAYER_COUNT_BYTE_OFFSET;
    public static final long P_LAYERS_BYTE_OFFSET;
    public static final long VIRTUAL_BUFFER_SIZE_IN_MS_BYTE_OFFSET;
    public static final long INITIAL_VIRTUAL_BUFFER_SIZE_IN_MS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            JAVA_INT.withName("rateControlMode"),
            JAVA_INT.withName("layerCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pLayers"),
            JAVA_INT.withName("virtualBufferSizeInMs"),
            JAVA_INT.withName("initialVirtualBufferSizeInMs")
        ).withName("VkVideoEncodeRateControlInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        RATE_CONTROL_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rateControlMode"));
        LAYER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layerCount"));
        P_LAYERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLayers"));
        VIRTUAL_BUFFER_SIZE_IN_MS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("virtualBufferSizeInMs"));
        INITIAL_VIRTUAL_BUFFER_SIZE_IN_MS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("initialVirtualBufferSizeInMs"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        RATE_CONTROL_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rateControlMode"));
        LAYER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layerCount"));
        P_LAYERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLayers"));
        VIRTUAL_BUFFER_SIZE_IN_MS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("virtualBufferSizeInMs"));
        INITIAL_VIRTUAL_BUFFER_SIZE_IN_MS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("initialVirtualBufferSizeInMs"));
        //@formatter:on
    }

    public VkVideoEncodeRateControlInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoEncodeRateControlInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoEncodeRateControlInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkVideoEncodeRateControlInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeRateControlInfoKHR pNext(MemorySegment pNext) {
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
    public VkVideoEncodeRateControlInfoKHR flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #rateControlMode()
    public VkVideoEncodeRateControlInfoKHR rateControlMode(int rateControlMode) {
    	RATE_CONTROL_MODE_HANDLE.set(segment, 0L, rateControlMode);
    	return this;
    }
    
    public int rateControlMode() {
    	return (int) RATE_CONTROL_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #layerCount()
    public VkVideoEncodeRateControlInfoKHR layerCount(int layerCount) {
    	LAYER_COUNT_HANDLE.set(segment, 0L, layerCount);
    	return this;
    }
    
    public int layerCount() {
    	return (int) LAYER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pLayers()
    public VkVideoEncodeRateControlInfoKHR pLayers(NativeStructArray<VkVideoEncodeRateControlLayerInfoKHR> pLayers) {
    	P_LAYERS_HANDLE.set(segment, 0L, pLayers.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkVideoEncodeRateControlLayerInfoKHR> pLayers() {
    	MemorySegment segment = (MemorySegment) P_LAYERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkVideoEncodeRateControlLayerInfoKHR.array(segment);
    }
    
    /// @see #virtualBufferSizeInMs()
    public VkVideoEncodeRateControlInfoKHR virtualBufferSizeInMs(int virtualBufferSizeInMs) {
    	VIRTUAL_BUFFER_SIZE_IN_MS_HANDLE.set(segment, 0L, virtualBufferSizeInMs);
    	return this;
    }
    
    public int virtualBufferSizeInMs() {
    	return (int) VIRTUAL_BUFFER_SIZE_IN_MS_HANDLE.get(segment, 0L);
    }
    
    /// @see #initialVirtualBufferSizeInMs()
    public VkVideoEncodeRateControlInfoKHR initialVirtualBufferSizeInMs(int initialVirtualBufferSizeInMs) {
    	INITIAL_VIRTUAL_BUFFER_SIZE_IN_MS_HANDLE.set(segment, 0L, initialVirtualBufferSizeInMs);
    	return this;
    }
    
    public int initialVirtualBufferSizeInMs() {
    	return (int) INITIAL_VIRTUAL_BUFFER_SIZE_IN_MS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeRateControlInfoKHR set(VkVideoEncodeRateControlInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeRateControlInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeRateControlInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeRateControlInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeRateControlInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeRateControlInfoKHR> array(Arena arena, VkVideoEncodeRateControlInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeRateControlInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeRateControlInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeRateControlInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeRateControlInfoKHR(segment)
        );
    }
    
}