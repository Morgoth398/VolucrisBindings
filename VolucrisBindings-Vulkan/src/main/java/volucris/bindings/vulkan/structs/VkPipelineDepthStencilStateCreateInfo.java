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

public final class VkPipelineDepthStencilStateCreateInfo
		implements Struct<VkPipelineDepthStencilStateCreateInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle DEPTH_TEST_ENABLE_HANDLE;
    public static final VarHandle DEPTH_WRITE_ENABLE_HANDLE;
    public static final VarHandle DEPTH_COMPARE_OP_HANDLE;
    public static final VarHandle DEPTH_BOUNDS_TEST_ENABLE_HANDLE;
    public static final VarHandle STENCIL_TEST_ENABLE_HANDLE;
    public static final VarHandle MIN_DEPTH_BOUNDS_HANDLE;
    public static final VarHandle MAX_DEPTH_BOUNDS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long DEPTH_TEST_ENABLE_BYTE_OFFSET;
    public static final long DEPTH_WRITE_ENABLE_BYTE_OFFSET;
    public static final long DEPTH_COMPARE_OP_BYTE_OFFSET;
    public static final long DEPTH_BOUNDS_TEST_ENABLE_BYTE_OFFSET;
    public static final long STENCIL_TEST_ENABLE_BYTE_OFFSET;
    public static final long FRONT_BYTE_OFFSET;
    public static final long BACK_BYTE_OFFSET;
    public static final long MIN_DEPTH_BOUNDS_BYTE_OFFSET;
    public static final long MAX_DEPTH_BOUNDS_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkStencilOpState front;
    private final VkStencilOpState back;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            JAVA_INT.withName("depthTestEnable"),
            JAVA_INT.withName("depthWriteEnable"),
            JAVA_INT.withName("depthCompareOp"),
            JAVA_INT.withName("depthBoundsTestEnable"),
            JAVA_INT.withName("stencilTestEnable"),
            VkStencilOpState.LAYOUT.withName("front"),
            VkStencilOpState.LAYOUT.withName("back"),
            JAVA_FLOAT.withName("minDepthBounds"),
            JAVA_FLOAT.withName("maxDepthBounds")
        ).withName("VkPipelineDepthStencilStateCreateInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        DEPTH_TEST_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthTestEnable"));
        DEPTH_WRITE_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthWriteEnable"));
        DEPTH_COMPARE_OP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthCompareOp"));
        DEPTH_BOUNDS_TEST_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthBoundsTestEnable"));
        STENCIL_TEST_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stencilTestEnable"));
        MIN_DEPTH_BOUNDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minDepthBounds"));
        MAX_DEPTH_BOUNDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDepthBounds"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        DEPTH_TEST_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthTestEnable"));
        DEPTH_WRITE_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthWriteEnable"));
        DEPTH_COMPARE_OP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthCompareOp"));
        DEPTH_BOUNDS_TEST_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthBoundsTestEnable"));
        STENCIL_TEST_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stencilTestEnable"));
        FRONT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("front"));
        BACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("back"));
        MIN_DEPTH_BOUNDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minDepthBounds"));
        MAX_DEPTH_BOUNDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDepthBounds"));
        //@formatter:on
    }

    public VkPipelineDepthStencilStateCreateInfo() {
        this(Arena.ofAuto());
    }
    
    public VkPipelineDepthStencilStateCreateInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPipelineDepthStencilStateCreateInfo(MemorySegment segment) {
        this.segment = segment;
    
        front = new VkStencilOpState(segment.asSlice(FRONT_BYTE_OFFSET, VkStencilOpState.LAYOUT));
        back = new VkStencilOpState(segment.asSlice(BACK_BYTE_OFFSET, VkStencilOpState.LAYOUT));
    }

    /// @see #sType()
    public VkPipelineDepthStencilStateCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineDepthStencilStateCreateInfo pNext(MemorySegment pNext) {
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
    public VkPipelineDepthStencilStateCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthTestEnable()
    public VkPipelineDepthStencilStateCreateInfo depthTestEnable(int depthTestEnable) {
    	DEPTH_TEST_ENABLE_HANDLE.set(segment, 0L, depthTestEnable);
    	return this;
    }
    
    public int depthTestEnable() {
    	return (int) DEPTH_TEST_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthWriteEnable()
    public VkPipelineDepthStencilStateCreateInfo depthWriteEnable(int depthWriteEnable) {
    	DEPTH_WRITE_ENABLE_HANDLE.set(segment, 0L, depthWriteEnable);
    	return this;
    }
    
    public int depthWriteEnable() {
    	return (int) DEPTH_WRITE_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthCompareOp()
    public VkPipelineDepthStencilStateCreateInfo depthCompareOp(int depthCompareOp) {
    	DEPTH_COMPARE_OP_HANDLE.set(segment, 0L, depthCompareOp);
    	return this;
    }
    
    public int depthCompareOp() {
    	return (int) DEPTH_COMPARE_OP_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthBoundsTestEnable()
    public VkPipelineDepthStencilStateCreateInfo depthBoundsTestEnable(int depthBoundsTestEnable) {
    	DEPTH_BOUNDS_TEST_ENABLE_HANDLE.set(segment, 0L, depthBoundsTestEnable);
    	return this;
    }
    
    public int depthBoundsTestEnable() {
    	return (int) DEPTH_BOUNDS_TEST_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #stencilTestEnable()
    public VkPipelineDepthStencilStateCreateInfo stencilTestEnable(int stencilTestEnable) {
    	STENCIL_TEST_ENABLE_HANDLE.set(segment, 0L, stencilTestEnable);
    	return this;
    }
    
    public int stencilTestEnable() {
    	return (int) STENCIL_TEST_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #minDepthBounds()
    public VkPipelineDepthStencilStateCreateInfo minDepthBounds(float minDepthBounds) {
    	MIN_DEPTH_BOUNDS_HANDLE.set(segment, 0L, minDepthBounds);
    	return this;
    }
    
    public float minDepthBounds() {
    	return (float) MIN_DEPTH_BOUNDS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDepthBounds()
    public VkPipelineDepthStencilStateCreateInfo maxDepthBounds(float maxDepthBounds) {
    	MAX_DEPTH_BOUNDS_HANDLE.set(segment, 0L, maxDepthBounds);
    	return this;
    }
    
    public float maxDepthBounds() {
    	return (float) MAX_DEPTH_BOUNDS_HANDLE.get(segment, 0L);
    }
    
    /// @see #front()
    public VkPipelineDepthStencilStateCreateInfo front(Consumer<VkStencilOpState> consumer) {
    	consumer.accept(front);
    	return this;
    }
    
    /// @see #front()
    public VkPipelineDepthStencilStateCreateInfo front(VkStencilOpState other) {
    	front.set(other);
    	return this;
    }
    
    public VkStencilOpState front() {
    	return front;
    }
    
    /// @see #back()
    public VkPipelineDepthStencilStateCreateInfo back(Consumer<VkStencilOpState> consumer) {
    	consumer.accept(back);
    	return this;
    }
    
    /// @see #back()
    public VkPipelineDepthStencilStateCreateInfo back(VkStencilOpState other) {
    	back.set(other);
    	return this;
    }
    
    public VkStencilOpState back() {
    	return back;
    }
    
    @Override
    public VkPipelineDepthStencilStateCreateInfo set(VkPipelineDepthStencilStateCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineDepthStencilStateCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineDepthStencilStateCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineDepthStencilStateCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineDepthStencilStateCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineDepthStencilStateCreateInfo> array(Arena arena, VkPipelineDepthStencilStateCreateInfo... structs) {
        NativeStructArray<VkPipelineDepthStencilStateCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineDepthStencilStateCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineDepthStencilStateCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineDepthStencilStateCreateInfo(segment)
        );
    }
    
}