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

public final class VkDisplaySurfaceCreateInfoKHR
		implements Struct<VkDisplaySurfaceCreateInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle DISPLAY_MODE_HANDLE;
    public static final VarHandle PLANE_INDEX_HANDLE;
    public static final VarHandle PLANE_STACK_INDEX_HANDLE;
    public static final VarHandle TRANSFORM_HANDLE;
    public static final VarHandle GLOBAL_ALPHA_HANDLE;
    public static final VarHandle ALPHA_MODE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long DISPLAY_MODE_BYTE_OFFSET;
    public static final long PLANE_INDEX_BYTE_OFFSET;
    public static final long PLANE_STACK_INDEX_BYTE_OFFSET;
    public static final long TRANSFORM_BYTE_OFFSET;
    public static final long GLOBAL_ALPHA_BYTE_OFFSET;
    public static final long ALPHA_MODE_BYTE_OFFSET;
    public static final long IMAGE_EXTENT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkExtent2D imageExtent;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("displayMode"),
            JAVA_INT.withName("planeIndex"),
            JAVA_INT.withName("planeStackIndex"),
            JAVA_INT.withName("transform"),
            JAVA_FLOAT.withName("globalAlpha"),
            JAVA_INT.withName("alphaMode"),
            VkExtent2D.LAYOUT.withName("imageExtent"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkDisplaySurfaceCreateInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        DISPLAY_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("displayMode"));
        PLANE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("planeIndex"));
        PLANE_STACK_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("planeStackIndex"));
        TRANSFORM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("transform"));
        GLOBAL_ALPHA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("globalAlpha"));
        ALPHA_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("alphaMode"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        DISPLAY_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("displayMode"));
        PLANE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("planeIndex"));
        PLANE_STACK_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("planeStackIndex"));
        TRANSFORM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transform"));
        GLOBAL_ALPHA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("globalAlpha"));
        ALPHA_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("alphaMode"));
        IMAGE_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
        //@formatter:on
    }

    public VkDisplaySurfaceCreateInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkDisplaySurfaceCreateInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDisplaySurfaceCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
        imageExtent = new VkExtent2D(segment.asSlice(IMAGE_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
    }

    /// @see #sType()
    public VkDisplaySurfaceCreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDisplaySurfaceCreateInfoKHR pNext(MemorySegment pNext) {
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
    public VkDisplaySurfaceCreateInfoKHR flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #displayMode()
    public VkDisplaySurfaceCreateInfoKHR displayMode(VkDisplayModeKHR displayMode) {
    	DISPLAY_MODE_HANDLE.set(segment, 0L, displayMode.memorySegment());
    	return this;
    }
    
    public @Nullable VkDisplayModeKHR displayMode() {
    	MemorySegment segment = (MemorySegment) DISPLAY_MODE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDisplayModeKHR(segment);
    }
    
    /// @see #planeIndex()
    public VkDisplaySurfaceCreateInfoKHR planeIndex(int planeIndex) {
    	PLANE_INDEX_HANDLE.set(segment, 0L, planeIndex);
    	return this;
    }
    
    public int planeIndex() {
    	return (int) PLANE_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #planeStackIndex()
    public VkDisplaySurfaceCreateInfoKHR planeStackIndex(int planeStackIndex) {
    	PLANE_STACK_INDEX_HANDLE.set(segment, 0L, planeStackIndex);
    	return this;
    }
    
    public int planeStackIndex() {
    	return (int) PLANE_STACK_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #transform()
    public VkDisplaySurfaceCreateInfoKHR transform(int transform) {
    	TRANSFORM_HANDLE.set(segment, 0L, transform);
    	return this;
    }
    
    public int transform() {
    	return (int) TRANSFORM_HANDLE.get(segment, 0L);
    }
    
    /// @see #globalAlpha()
    public VkDisplaySurfaceCreateInfoKHR globalAlpha(float globalAlpha) {
    	GLOBAL_ALPHA_HANDLE.set(segment, 0L, globalAlpha);
    	return this;
    }
    
    public float globalAlpha() {
    	return (float) GLOBAL_ALPHA_HANDLE.get(segment, 0L);
    }
    
    /// @see #alphaMode()
    public VkDisplaySurfaceCreateInfoKHR alphaMode(int alphaMode) {
    	ALPHA_MODE_HANDLE.set(segment, 0L, alphaMode);
    	return this;
    }
    
    public int alphaMode() {
    	return (int) ALPHA_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageExtent()
    public VkDisplaySurfaceCreateInfoKHR imageExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(imageExtent);
    	return this;
    }
    
    /// @see #imageExtent()
    public VkDisplaySurfaceCreateInfoKHR imageExtent(VkExtent2D other) {
    	imageExtent.set(other);
    	return this;
    }
    
    public VkExtent2D imageExtent() {
    	return imageExtent;
    }
    
    @Override
    public VkDisplaySurfaceCreateInfoKHR set(VkDisplaySurfaceCreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDisplaySurfaceCreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDisplaySurfaceCreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDisplaySurfaceCreateInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplaySurfaceCreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDisplaySurfaceCreateInfoKHR> array(Arena arena, VkDisplaySurfaceCreateInfoKHR... structs) {
        NativeStructArray<VkDisplaySurfaceCreateInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplaySurfaceCreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDisplaySurfaceCreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDisplaySurfaceCreateInfoKHR(segment)
        );
    }
    
}