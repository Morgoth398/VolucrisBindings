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

public final class VkStencilOpState
		implements Struct<VkStencilOpState> {

    public static final StructLayout LAYOUT;

    public static final VarHandle FAIL_OP_HANDLE;
    public static final VarHandle PASS_OP_HANDLE;
    public static final VarHandle DEPTH_FAIL_OP_HANDLE;
    public static final VarHandle COMPARE_OP_HANDLE;
    public static final VarHandle COMPARE_MASK_HANDLE;
    public static final VarHandle WRITE_MASK_HANDLE;
    public static final VarHandle REFERENCE_HANDLE;

    public static final long FAIL_OP_BYTE_OFFSET;
    public static final long PASS_OP_BYTE_OFFSET;
    public static final long DEPTH_FAIL_OP_BYTE_OFFSET;
    public static final long COMPARE_OP_BYTE_OFFSET;
    public static final long COMPARE_MASK_BYTE_OFFSET;
    public static final long WRITE_MASK_BYTE_OFFSET;
    public static final long REFERENCE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("failOp"),
            JAVA_INT.withName("passOp"),
            JAVA_INT.withName("depthFailOp"),
            JAVA_INT.withName("compareOp"),
            JAVA_INT.withName("compareMask"),
            JAVA_INT.withName("writeMask"),
            JAVA_INT.withName("reference")
        ).withName("VkStencilOpState").withByteAlignment(4);
        
        FAIL_OP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("failOp"));
        PASS_OP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("passOp"));
        DEPTH_FAIL_OP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthFailOp"));
        COMPARE_OP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("compareOp"));
        COMPARE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("compareMask"));
        WRITE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("writeMask"));
        REFERENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reference"));
        
        FAIL_OP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("failOp"));
        PASS_OP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("passOp"));
        DEPTH_FAIL_OP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthFailOp"));
        COMPARE_OP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("compareOp"));
        COMPARE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("compareMask"));
        WRITE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("writeMask"));
        REFERENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reference"));
        //@formatter:on
    }

    public VkStencilOpState() {
        this(Arena.ofAuto());
    }
    
    public VkStencilOpState(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkStencilOpState(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #failOp()
    public VkStencilOpState failOp(int failOp) {
    	FAIL_OP_HANDLE.set(segment, 0L, failOp);
    	return this;
    }
    
    public int failOp() {
    	return (int) FAIL_OP_HANDLE.get(segment, 0L);
    }
    
    /// @see #passOp()
    public VkStencilOpState passOp(int passOp) {
    	PASS_OP_HANDLE.set(segment, 0L, passOp);
    	return this;
    }
    
    public int passOp() {
    	return (int) PASS_OP_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthFailOp()
    public VkStencilOpState depthFailOp(int depthFailOp) {
    	DEPTH_FAIL_OP_HANDLE.set(segment, 0L, depthFailOp);
    	return this;
    }
    
    public int depthFailOp() {
    	return (int) DEPTH_FAIL_OP_HANDLE.get(segment, 0L);
    }
    
    /// @see #compareOp()
    public VkStencilOpState compareOp(int compareOp) {
    	COMPARE_OP_HANDLE.set(segment, 0L, compareOp);
    	return this;
    }
    
    public int compareOp() {
    	return (int) COMPARE_OP_HANDLE.get(segment, 0L);
    }
    
    /// @see #compareMask()
    public VkStencilOpState compareMask(int compareMask) {
    	COMPARE_MASK_HANDLE.set(segment, 0L, compareMask);
    	return this;
    }
    
    public int compareMask() {
    	return (int) COMPARE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #writeMask()
    public VkStencilOpState writeMask(int writeMask) {
    	WRITE_MASK_HANDLE.set(segment, 0L, writeMask);
    	return this;
    }
    
    public int writeMask() {
    	return (int) WRITE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #reference()
    public VkStencilOpState reference(int reference) {
    	REFERENCE_HANDLE.set(segment, 0L, reference);
    	return this;
    }
    
    public int reference() {
    	return (int) REFERENCE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkStencilOpState set(VkStencilOpState other) {
        return set(other.segment);
    }
    
    @Override
    public VkStencilOpState set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkStencilOpState> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkStencilOpState> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkStencilOpState(segment),
            count
        );
    }
    
    public static NativeStructArray<VkStencilOpState> array(Arena arena, VkStencilOpState... structs) {
        NativeStructArray<VkStencilOpState> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkStencilOpState(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkStencilOpState> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkStencilOpState(segment)
        );
    }
    
}