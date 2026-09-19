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

public final class VkCopyMemoryToAccelerationStructureInfoKHR
		implements Struct<VkCopyMemoryToAccelerationStructureInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle DST_HANDLE;
    public static final VarHandle MODE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SRC_BYTE_OFFSET;
    public static final long DST_BYTE_OFFSET;
    public static final long MODE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkDeviceOrHostAddressConstKHR src;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkDeviceOrHostAddressConstKHR.LAYOUT.withName("src"),
            UNBOUNDED_ADDRESS.withName("dst"),
            JAVA_INT.withName("mode"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkCopyMemoryToAccelerationStructureInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        DST_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dst"));
        MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mode"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SRC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("src"));
        DST_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dst"));
        MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mode"));
        //@formatter:on
    }

    public VkCopyMemoryToAccelerationStructureInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkCopyMemoryToAccelerationStructureInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkCopyMemoryToAccelerationStructureInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
        src = new VkDeviceOrHostAddressConstKHR(segment.asSlice(SRC_BYTE_OFFSET, VkDeviceOrHostAddressConstKHR.LAYOUT));
    }

    /// @see #sType()
    public VkCopyMemoryToAccelerationStructureInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCopyMemoryToAccelerationStructureInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #dst()
    public VkCopyMemoryToAccelerationStructureInfoKHR dst(VkAccelerationStructureKHR dst) {
    	DST_HANDLE.set(segment, 0L, dst.memorySegment());
    	return this;
    }
    
    public @Nullable VkAccelerationStructureKHR dst() {
    	MemorySegment segment = (MemorySegment) DST_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkAccelerationStructureKHR(segment);
    }
    
    /// @see #mode()
    public VkCopyMemoryToAccelerationStructureInfoKHR mode(int mode) {
    	MODE_HANDLE.set(segment, 0L, mode);
    	return this;
    }
    
    public int mode() {
    	return (int) MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #src()
    public VkCopyMemoryToAccelerationStructureInfoKHR src(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
    	consumer.accept(src);
    	return this;
    }
    
    /// @see #src()
    public VkCopyMemoryToAccelerationStructureInfoKHR src(VkDeviceOrHostAddressConstKHR other) {
    	src.set(other);
    	return this;
    }
    
    public VkDeviceOrHostAddressConstKHR src() {
    	return src;
    }
    
    @Override
    public VkCopyMemoryToAccelerationStructureInfoKHR set(VkCopyMemoryToAccelerationStructureInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkCopyMemoryToAccelerationStructureInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCopyMemoryToAccelerationStructureInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCopyMemoryToAccelerationStructureInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCopyMemoryToAccelerationStructureInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCopyMemoryToAccelerationStructureInfoKHR> array(Arena arena, VkCopyMemoryToAccelerationStructureInfoKHR... structs) {
        NativeStructArray<VkCopyMemoryToAccelerationStructureInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCopyMemoryToAccelerationStructureInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCopyMemoryToAccelerationStructureInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCopyMemoryToAccelerationStructureInfoKHR(segment)
        );
    }
    
}