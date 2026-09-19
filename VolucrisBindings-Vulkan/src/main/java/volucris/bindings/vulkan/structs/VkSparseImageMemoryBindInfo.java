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

public final class VkSparseImageMemoryBindInfo
		implements Struct<VkSparseImageMemoryBindInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle IMAGE_HANDLE;
    public static final VarHandle BIND_COUNT_HANDLE;
    public static final VarHandle P_BINDS_HANDLE;

    public static final long IMAGE_BYTE_OFFSET;
    public static final long BIND_COUNT_BYTE_OFFSET;
    public static final long P_BINDS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("image"),
            JAVA_INT.withName("bindCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pBinds")
        ).withName("VkSparseImageMemoryBindInfo").withByteAlignment(8);
        
        IMAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("image"));
        BIND_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bindCount"));
        P_BINDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBinds"));
        
        IMAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("image"));
        BIND_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bindCount"));
        P_BINDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBinds"));
        //@formatter:on
    }

    public VkSparseImageMemoryBindInfo() {
        this(Arena.ofAuto());
    }
    
    public VkSparseImageMemoryBindInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkSparseImageMemoryBindInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #image()
    public VkSparseImageMemoryBindInfo image(VkImage image) {
    	IMAGE_HANDLE.set(segment, 0L, image.memorySegment());
    	return this;
    }
    
    public @Nullable VkImage image() {
    	MemorySegment segment = (MemorySegment) IMAGE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImage(segment);
    }
    
    /// @see #bindCount()
    public VkSparseImageMemoryBindInfo bindCount(int bindCount) {
    	BIND_COUNT_HANDLE.set(segment, 0L, bindCount);
    	return this;
    }
    
    public int bindCount() {
    	return (int) BIND_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pBinds()
    public VkSparseImageMemoryBindInfo pBinds(NativeStructArray<VkSparseImageMemoryBind> pBinds) {
    	P_BINDS_HANDLE.set(segment, 0L, pBinds.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkSparseImageMemoryBind> pBinds() {
    	MemorySegment segment = (MemorySegment) P_BINDS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkSparseImageMemoryBind.array(segment);
    }
    
    @Override
    public VkSparseImageMemoryBindInfo set(VkSparseImageMemoryBindInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkSparseImageMemoryBindInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSparseImageMemoryBindInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSparseImageMemoryBindInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSparseImageMemoryBindInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSparseImageMemoryBindInfo> array(Arena arena, VkSparseImageMemoryBindInfo... structs) {
        NativeStructArray<VkSparseImageMemoryBindInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSparseImageMemoryBindInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSparseImageMemoryBindInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSparseImageMemoryBindInfo(segment)
        );
    }
    
}