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

public final class VkCooperativeMatrixPropertiesNV
		implements Struct<VkCooperativeMatrixPropertiesNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MSIZE_HANDLE;
    public static final VarHandle NSIZE_HANDLE;
    public static final VarHandle KSIZE_HANDLE;
    public static final VarHandle ATYPE_HANDLE;
    public static final VarHandle BTYPE_HANDLE;
    public static final VarHandle CTYPE_HANDLE;
    public static final VarHandle DTYPE_HANDLE;
    public static final VarHandle SCOPE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MSIZE_BYTE_OFFSET;
    public static final long NSIZE_BYTE_OFFSET;
    public static final long KSIZE_BYTE_OFFSET;
    public static final long ATYPE_BYTE_OFFSET;
    public static final long BTYPE_BYTE_OFFSET;
    public static final long CTYPE_BYTE_OFFSET;
    public static final long DTYPE_BYTE_OFFSET;
    public static final long SCOPE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("MSize"),
            JAVA_INT.withName("NSize"),
            JAVA_INT.withName("KSize"),
            JAVA_INT.withName("AType"),
            JAVA_INT.withName("BType"),
            JAVA_INT.withName("CType"),
            JAVA_INT.withName("DType"),
            JAVA_INT.withName("scope")
        ).withName("VkCooperativeMatrixPropertiesNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MSIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("MSize"));
        NSIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("NSize"));
        KSIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("KSize"));
        ATYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("AType"));
        BTYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("BType"));
        CTYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CType"));
        DTYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("DType"));
        SCOPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("scope"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MSIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("MSize"));
        NSIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("NSize"));
        KSIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("KSize"));
        ATYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("AType"));
        BTYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("BType"));
        CTYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CType"));
        DTYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("DType"));
        SCOPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("scope"));
        //@formatter:on
    }

    public VkCooperativeMatrixPropertiesNV() {
        this(Arena.ofAuto());
    }
    
    public VkCooperativeMatrixPropertiesNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkCooperativeMatrixPropertiesNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkCooperativeMatrixPropertiesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCooperativeMatrixPropertiesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #mSize()
    public VkCooperativeMatrixPropertiesNV mSize(int mSize) {
    	MSIZE_HANDLE.set(segment, 0L, mSize);
    	return this;
    }
    
    public int mSize() {
    	return (int) MSIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #nSize()
    public VkCooperativeMatrixPropertiesNV nSize(int nSize) {
    	NSIZE_HANDLE.set(segment, 0L, nSize);
    	return this;
    }
    
    public int nSize() {
    	return (int) NSIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #kSize()
    public VkCooperativeMatrixPropertiesNV kSize(int kSize) {
    	KSIZE_HANDLE.set(segment, 0L, kSize);
    	return this;
    }
    
    public int kSize() {
    	return (int) KSIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #aType()
    public VkCooperativeMatrixPropertiesNV aType(int aType) {
    	ATYPE_HANDLE.set(segment, 0L, aType);
    	return this;
    }
    
    public int aType() {
    	return (int) ATYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #bType()
    public VkCooperativeMatrixPropertiesNV bType(int bType) {
    	BTYPE_HANDLE.set(segment, 0L, bType);
    	return this;
    }
    
    public int bType() {
    	return (int) BTYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #cType()
    public VkCooperativeMatrixPropertiesNV cType(int cType) {
    	CTYPE_HANDLE.set(segment, 0L, cType);
    	return this;
    }
    
    public int cType() {
    	return (int) CTYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #dType()
    public VkCooperativeMatrixPropertiesNV dType(int dType) {
    	DTYPE_HANDLE.set(segment, 0L, dType);
    	return this;
    }
    
    public int dType() {
    	return (int) DTYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #scope()
    public VkCooperativeMatrixPropertiesNV scope(int scope) {
    	SCOPE_HANDLE.set(segment, 0L, scope);
    	return this;
    }
    
    public int scope() {
    	return (int) SCOPE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkCooperativeMatrixPropertiesNV set(VkCooperativeMatrixPropertiesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkCooperativeMatrixPropertiesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCooperativeMatrixPropertiesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCooperativeMatrixPropertiesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCooperativeMatrixPropertiesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCooperativeMatrixPropertiesNV> array(Arena arena, VkCooperativeMatrixPropertiesNV... structs) {
        NativeStructArray<VkCooperativeMatrixPropertiesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCooperativeMatrixPropertiesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCooperativeMatrixPropertiesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCooperativeMatrixPropertiesNV(segment)
        );
    }
    
}