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

public final class VkDisplayPlaneCapabilitiesKHR
		implements Struct<VkDisplayPlaneCapabilitiesKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle SUPPORTED_ALPHA_HANDLE;

    public static final long SUPPORTED_ALPHA_BYTE_OFFSET;
    public static final long MIN_SRC_POSITION_BYTE_OFFSET;
    public static final long MAX_SRC_POSITION_BYTE_OFFSET;
    public static final long MIN_SRC_EXTENT_BYTE_OFFSET;
    public static final long MAX_SRC_EXTENT_BYTE_OFFSET;
    public static final long MIN_DST_POSITION_BYTE_OFFSET;
    public static final long MAX_DST_POSITION_BYTE_OFFSET;
    public static final long MIN_DST_EXTENT_BYTE_OFFSET;
    public static final long MAX_DST_EXTENT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkOffset2D minSrcPosition;
    private final VkOffset2D maxSrcPosition;
    private final VkExtent2D minSrcExtent;
    private final VkExtent2D maxSrcExtent;
    private final VkOffset2D minDstPosition;
    private final VkOffset2D maxDstPosition;
    private final VkExtent2D minDstExtent;
    private final VkExtent2D maxDstExtent;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("supportedAlpha"),
            VkOffset2D.LAYOUT.withName("minSrcPosition"),
            VkOffset2D.LAYOUT.withName("maxSrcPosition"),
            VkExtent2D.LAYOUT.withName("minSrcExtent"),
            VkExtent2D.LAYOUT.withName("maxSrcExtent"),
            VkOffset2D.LAYOUT.withName("minDstPosition"),
            VkOffset2D.LAYOUT.withName("maxDstPosition"),
            VkExtent2D.LAYOUT.withName("minDstExtent"),
            VkExtent2D.LAYOUT.withName("maxDstExtent")
        ).withName("VkDisplayPlaneCapabilitiesKHR").withByteAlignment(4);
        
        SUPPORTED_ALPHA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedAlpha"));
        
        SUPPORTED_ALPHA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedAlpha"));
        MIN_SRC_POSITION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minSrcPosition"));
        MAX_SRC_POSITION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSrcPosition"));
        MIN_SRC_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minSrcExtent"));
        MAX_SRC_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSrcExtent"));
        MIN_DST_POSITION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minDstPosition"));
        MAX_DST_POSITION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDstPosition"));
        MIN_DST_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minDstExtent"));
        MAX_DST_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDstExtent"));
        //@formatter:on
    }

    public VkDisplayPlaneCapabilitiesKHR() {
        this(Arena.ofAuto());
    }
    
    public VkDisplayPlaneCapabilitiesKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDisplayPlaneCapabilitiesKHR(MemorySegment segment) {
        this.segment = segment;
    
        minSrcPosition = new VkOffset2D(segment.asSlice(MIN_SRC_POSITION_BYTE_OFFSET, VkOffset2D.LAYOUT));
        maxSrcPosition = new VkOffset2D(segment.asSlice(MAX_SRC_POSITION_BYTE_OFFSET, VkOffset2D.LAYOUT));
        minSrcExtent = new VkExtent2D(segment.asSlice(MIN_SRC_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
        maxSrcExtent = new VkExtent2D(segment.asSlice(MAX_SRC_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
        minDstPosition = new VkOffset2D(segment.asSlice(MIN_DST_POSITION_BYTE_OFFSET, VkOffset2D.LAYOUT));
        maxDstPosition = new VkOffset2D(segment.asSlice(MAX_DST_POSITION_BYTE_OFFSET, VkOffset2D.LAYOUT));
        minDstExtent = new VkExtent2D(segment.asSlice(MIN_DST_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
        maxDstExtent = new VkExtent2D(segment.asSlice(MAX_DST_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
    }

    /// @see #supportedAlpha()
    public VkDisplayPlaneCapabilitiesKHR supportedAlpha(int supportedAlpha) {
    	SUPPORTED_ALPHA_HANDLE.set(segment, 0L, supportedAlpha);
    	return this;
    }
    
    public int supportedAlpha() {
    	return (int) SUPPORTED_ALPHA_HANDLE.get(segment, 0L);
    }
    
    /// @see #minSrcPosition()
    public VkDisplayPlaneCapabilitiesKHR minSrcPosition(Consumer<VkOffset2D> consumer) {
    	consumer.accept(minSrcPosition);
    	return this;
    }
    
    /// @see #minSrcPosition()
    public VkDisplayPlaneCapabilitiesKHR minSrcPosition(VkOffset2D other) {
    	minSrcPosition.set(other);
    	return this;
    }
    
    public VkOffset2D minSrcPosition() {
    	return minSrcPosition;
    }
    
    /// @see #maxSrcPosition()
    public VkDisplayPlaneCapabilitiesKHR maxSrcPosition(Consumer<VkOffset2D> consumer) {
    	consumer.accept(maxSrcPosition);
    	return this;
    }
    
    /// @see #maxSrcPosition()
    public VkDisplayPlaneCapabilitiesKHR maxSrcPosition(VkOffset2D other) {
    	maxSrcPosition.set(other);
    	return this;
    }
    
    public VkOffset2D maxSrcPosition() {
    	return maxSrcPosition;
    }
    
    /// @see #minSrcExtent()
    public VkDisplayPlaneCapabilitiesKHR minSrcExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(minSrcExtent);
    	return this;
    }
    
    /// @see #minSrcExtent()
    public VkDisplayPlaneCapabilitiesKHR minSrcExtent(VkExtent2D other) {
    	minSrcExtent.set(other);
    	return this;
    }
    
    public VkExtent2D minSrcExtent() {
    	return minSrcExtent;
    }
    
    /// @see #maxSrcExtent()
    public VkDisplayPlaneCapabilitiesKHR maxSrcExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxSrcExtent);
    	return this;
    }
    
    /// @see #maxSrcExtent()
    public VkDisplayPlaneCapabilitiesKHR maxSrcExtent(VkExtent2D other) {
    	maxSrcExtent.set(other);
    	return this;
    }
    
    public VkExtent2D maxSrcExtent() {
    	return maxSrcExtent;
    }
    
    /// @see #minDstPosition()
    public VkDisplayPlaneCapabilitiesKHR minDstPosition(Consumer<VkOffset2D> consumer) {
    	consumer.accept(minDstPosition);
    	return this;
    }
    
    /// @see #minDstPosition()
    public VkDisplayPlaneCapabilitiesKHR minDstPosition(VkOffset2D other) {
    	minDstPosition.set(other);
    	return this;
    }
    
    public VkOffset2D minDstPosition() {
    	return minDstPosition;
    }
    
    /// @see #maxDstPosition()
    public VkDisplayPlaneCapabilitiesKHR maxDstPosition(Consumer<VkOffset2D> consumer) {
    	consumer.accept(maxDstPosition);
    	return this;
    }
    
    /// @see #maxDstPosition()
    public VkDisplayPlaneCapabilitiesKHR maxDstPosition(VkOffset2D other) {
    	maxDstPosition.set(other);
    	return this;
    }
    
    public VkOffset2D maxDstPosition() {
    	return maxDstPosition;
    }
    
    /// @see #minDstExtent()
    public VkDisplayPlaneCapabilitiesKHR minDstExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(minDstExtent);
    	return this;
    }
    
    /// @see #minDstExtent()
    public VkDisplayPlaneCapabilitiesKHR minDstExtent(VkExtent2D other) {
    	minDstExtent.set(other);
    	return this;
    }
    
    public VkExtent2D minDstExtent() {
    	return minDstExtent;
    }
    
    /// @see #maxDstExtent()
    public VkDisplayPlaneCapabilitiesKHR maxDstExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxDstExtent);
    	return this;
    }
    
    /// @see #maxDstExtent()
    public VkDisplayPlaneCapabilitiesKHR maxDstExtent(VkExtent2D other) {
    	maxDstExtent.set(other);
    	return this;
    }
    
    public VkExtent2D maxDstExtent() {
    	return maxDstExtent;
    }
    
    @Override
    public VkDisplayPlaneCapabilitiesKHR set(VkDisplayPlaneCapabilitiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDisplayPlaneCapabilitiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDisplayPlaneCapabilitiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDisplayPlaneCapabilitiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplayPlaneCapabilitiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDisplayPlaneCapabilitiesKHR> array(Arena arena, VkDisplayPlaneCapabilitiesKHR... structs) {
        NativeStructArray<VkDisplayPlaneCapabilitiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDisplayPlaneCapabilitiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDisplayPlaneCapabilitiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDisplayPlaneCapabilitiesKHR(segment)
        );
    }
    
}