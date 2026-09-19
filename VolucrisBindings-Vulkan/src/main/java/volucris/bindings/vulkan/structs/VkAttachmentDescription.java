/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkAttachmentDescription
		implements Struct<VkAttachmentDescription> {

    public static final StructLayout LAYOUT;

    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle FORMAT_HANDLE;
    public static final VarHandle SAMPLES_HANDLE;
    public static final VarHandle LOAD_OP_HANDLE;
    public static final VarHandle STORE_OP_HANDLE;
    public static final VarHandle STENCIL_LOAD_OP_HANDLE;
    public static final VarHandle STENCIL_STORE_OP_HANDLE;
    public static final VarHandle INITIAL_LAYOUT_HANDLE;
    public static final VarHandle FINAL_LAYOUT_HANDLE;

    public static final long FLAGS_BYTE_OFFSET;
    public static final long FORMAT_BYTE_OFFSET;
    public static final long SAMPLES_BYTE_OFFSET;
    public static final long LOAD_OP_BYTE_OFFSET;
    public static final long STORE_OP_BYTE_OFFSET;
    public static final long STENCIL_LOAD_OP_BYTE_OFFSET;
    public static final long STENCIL_STORE_OP_BYTE_OFFSET;
    public static final long INITIAL_LAYOUT_BYTE_OFFSET;
    public static final long FINAL_LAYOUT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("flags"),
            JAVA_INT.withName("format"),
            JAVA_INT.withName("samples"),
            JAVA_INT.withName("loadOp"),
            JAVA_INT.withName("storeOp"),
            JAVA_INT.withName("stencilLoadOp"),
            JAVA_INT.withName("stencilStoreOp"),
            JAVA_INT.withName("initialLayout"),
            JAVA_INT.withName("finalLayout")
        ).withName("VkAttachmentDescription").withByteAlignment(4);
        
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
        SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samples"));
        LOAD_OP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("loadOp"));
        STORE_OP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storeOp"));
        STENCIL_LOAD_OP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stencilLoadOp"));
        STENCIL_STORE_OP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stencilStoreOp"));
        INITIAL_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("initialLayout"));
        FINAL_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("finalLayout"));
        
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
        SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samples"));
        LOAD_OP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loadOp"));
        STORE_OP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storeOp"));
        STENCIL_LOAD_OP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stencilLoadOp"));
        STENCIL_STORE_OP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stencilStoreOp"));
        INITIAL_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("initialLayout"));
        FINAL_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("finalLayout"));
        //@formatter:on
    }

    public VkAttachmentDescription() {
        this(Arena.ofAuto());
    }
    
    public VkAttachmentDescription(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkAttachmentDescription(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #flags()
    public VkAttachmentDescription flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #format()
    public VkAttachmentDescription format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #samples()
    public VkAttachmentDescription samples(int samples) {
    	SAMPLES_HANDLE.set(segment, 0L, samples);
    	return this;
    }
    
    public int samples() {
    	return (int) SAMPLES_HANDLE.get(segment, 0L);
    }
    
    /// @see #loadOp()
    public VkAttachmentDescription loadOp(int loadOp) {
    	LOAD_OP_HANDLE.set(segment, 0L, loadOp);
    	return this;
    }
    
    public int loadOp() {
    	return (int) LOAD_OP_HANDLE.get(segment, 0L);
    }
    
    /// @see #storeOp()
    public VkAttachmentDescription storeOp(int storeOp) {
    	STORE_OP_HANDLE.set(segment, 0L, storeOp);
    	return this;
    }
    
    public int storeOp() {
    	return (int) STORE_OP_HANDLE.get(segment, 0L);
    }
    
    /// @see #stencilLoadOp()
    public VkAttachmentDescription stencilLoadOp(int stencilLoadOp) {
    	STENCIL_LOAD_OP_HANDLE.set(segment, 0L, stencilLoadOp);
    	return this;
    }
    
    public int stencilLoadOp() {
    	return (int) STENCIL_LOAD_OP_HANDLE.get(segment, 0L);
    }
    
    /// @see #stencilStoreOp()
    public VkAttachmentDescription stencilStoreOp(int stencilStoreOp) {
    	STENCIL_STORE_OP_HANDLE.set(segment, 0L, stencilStoreOp);
    	return this;
    }
    
    public int stencilStoreOp() {
    	return (int) STENCIL_STORE_OP_HANDLE.get(segment, 0L);
    }
    
    /// @see #initialLayout()
    public VkAttachmentDescription initialLayout(int initialLayout) {
    	INITIAL_LAYOUT_HANDLE.set(segment, 0L, initialLayout);
    	return this;
    }
    
    public int initialLayout() {
    	return (int) INITIAL_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #finalLayout()
    public VkAttachmentDescription finalLayout(int finalLayout) {
    	FINAL_LAYOUT_HANDLE.set(segment, 0L, finalLayout);
    	return this;
    }
    
    public int finalLayout() {
    	return (int) FINAL_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkAttachmentDescription set(VkAttachmentDescription other) {
        return set(other.segment);
    }
    
    @Override
    public VkAttachmentDescription set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAttachmentDescription> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAttachmentDescription> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAttachmentDescription(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAttachmentDescription> array(Arena arena, VkAttachmentDescription... structs) {
        NativeStructArray<VkAttachmentDescription> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAttachmentDescription(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAttachmentDescription> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAttachmentDescription(segment)
        );
    }
    
}