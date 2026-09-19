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

public final class VkSwapchainPresentScalingCreateInfoKHR
		implements Struct<VkSwapchainPresentScalingCreateInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SCALING_BEHAVIOR_HANDLE;
    public static final VarHandle PRESENT_GRAVITY_X_HANDLE;
    public static final VarHandle PRESENT_GRAVITY_Y_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SCALING_BEHAVIOR_BYTE_OFFSET;
    public static final long PRESENT_GRAVITY_X_BYTE_OFFSET;
    public static final long PRESENT_GRAVITY_Y_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("scalingBehavior"),
            JAVA_INT.withName("presentGravityX"),
            JAVA_INT.withName("presentGravityY"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkSwapchainPresentScalingCreateInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SCALING_BEHAVIOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("scalingBehavior"));
        PRESENT_GRAVITY_X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentGravityX"));
        PRESENT_GRAVITY_Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentGravityY"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SCALING_BEHAVIOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("scalingBehavior"));
        PRESENT_GRAVITY_X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentGravityX"));
        PRESENT_GRAVITY_Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentGravityY"));
        //@formatter:on
    }

    public VkSwapchainPresentScalingCreateInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkSwapchainPresentScalingCreateInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkSwapchainPresentScalingCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkSwapchainPresentScalingCreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSwapchainPresentScalingCreateInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #scalingBehavior()
    public VkSwapchainPresentScalingCreateInfoKHR scalingBehavior(int scalingBehavior) {
    	SCALING_BEHAVIOR_HANDLE.set(segment, 0L, scalingBehavior);
    	return this;
    }
    
    public int scalingBehavior() {
    	return (int) SCALING_BEHAVIOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #presentGravityX()
    public VkSwapchainPresentScalingCreateInfoKHR presentGravityX(int presentGravityX) {
    	PRESENT_GRAVITY_X_HANDLE.set(segment, 0L, presentGravityX);
    	return this;
    }
    
    public int presentGravityX() {
    	return (int) PRESENT_GRAVITY_X_HANDLE.get(segment, 0L);
    }
    
    /// @see #presentGravityY()
    public VkSwapchainPresentScalingCreateInfoKHR presentGravityY(int presentGravityY) {
    	PRESENT_GRAVITY_Y_HANDLE.set(segment, 0L, presentGravityY);
    	return this;
    }
    
    public int presentGravityY() {
    	return (int) PRESENT_GRAVITY_Y_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSwapchainPresentScalingCreateInfoKHR set(VkSwapchainPresentScalingCreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkSwapchainPresentScalingCreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSwapchainPresentScalingCreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSwapchainPresentScalingCreateInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSwapchainPresentScalingCreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSwapchainPresentScalingCreateInfoKHR> array(Arena arena, VkSwapchainPresentScalingCreateInfoKHR... structs) {
        NativeStructArray<VkSwapchainPresentScalingCreateInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSwapchainPresentScalingCreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSwapchainPresentScalingCreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSwapchainPresentScalingCreateInfoKHR(segment)
        );
    }
    
}