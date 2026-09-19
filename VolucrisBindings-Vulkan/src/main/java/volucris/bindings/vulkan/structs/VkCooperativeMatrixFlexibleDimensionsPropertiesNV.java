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

public final class VkCooperativeMatrixFlexibleDimensionsPropertiesNV
		implements Struct<VkCooperativeMatrixFlexibleDimensionsPropertiesNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MGRANULARITY_HANDLE;
    public static final VarHandle NGRANULARITY_HANDLE;
    public static final VarHandle KGRANULARITY_HANDLE;
    public static final VarHandle ATYPE_HANDLE;
    public static final VarHandle BTYPE_HANDLE;
    public static final VarHandle CTYPE_HANDLE;
    public static final VarHandle RESULT_TYPE_HANDLE;
    public static final VarHandle SATURATING_ACCUMULATION_HANDLE;
    public static final VarHandle SCOPE_HANDLE;
    public static final VarHandle WORKGROUP_INVOCATIONS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MGRANULARITY_BYTE_OFFSET;
    public static final long NGRANULARITY_BYTE_OFFSET;
    public static final long KGRANULARITY_BYTE_OFFSET;
    public static final long ATYPE_BYTE_OFFSET;
    public static final long BTYPE_BYTE_OFFSET;
    public static final long CTYPE_BYTE_OFFSET;
    public static final long RESULT_TYPE_BYTE_OFFSET;
    public static final long SATURATING_ACCUMULATION_BYTE_OFFSET;
    public static final long SCOPE_BYTE_OFFSET;
    public static final long WORKGROUP_INVOCATIONS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("MGranularity"),
            JAVA_INT.withName("NGranularity"),
            JAVA_INT.withName("KGranularity"),
            JAVA_INT.withName("AType"),
            JAVA_INT.withName("BType"),
            JAVA_INT.withName("CType"),
            JAVA_INT.withName("ResultType"),
            JAVA_INT.withName("saturatingAccumulation"),
            JAVA_INT.withName("scope"),
            JAVA_INT.withName("workgroupInvocations")
        ).withName("VkCooperativeMatrixFlexibleDimensionsPropertiesNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MGRANULARITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("MGranularity"));
        NGRANULARITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("NGranularity"));
        KGRANULARITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("KGranularity"));
        ATYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("AType"));
        BTYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("BType"));
        CTYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CType"));
        RESULT_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ResultType"));
        SATURATING_ACCUMULATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("saturatingAccumulation"));
        SCOPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("scope"));
        WORKGROUP_INVOCATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("workgroupInvocations"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MGRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("MGranularity"));
        NGRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("NGranularity"));
        KGRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("KGranularity"));
        ATYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("AType"));
        BTYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("BType"));
        CTYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CType"));
        RESULT_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ResultType"));
        SATURATING_ACCUMULATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("saturatingAccumulation"));
        SCOPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("scope"));
        WORKGROUP_INVOCATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("workgroupInvocations"));
        //@formatter:on
    }

    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV() {
        this(Arena.ofAuto());
    }
    
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #mGranularity()
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV mGranularity(int mGranularity) {
    	MGRANULARITY_HANDLE.set(segment, 0L, mGranularity);
    	return this;
    }
    
    public int mGranularity() {
    	return (int) MGRANULARITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #nGranularity()
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV nGranularity(int nGranularity) {
    	NGRANULARITY_HANDLE.set(segment, 0L, nGranularity);
    	return this;
    }
    
    public int nGranularity() {
    	return (int) NGRANULARITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #kGranularity()
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV kGranularity(int kGranularity) {
    	KGRANULARITY_HANDLE.set(segment, 0L, kGranularity);
    	return this;
    }
    
    public int kGranularity() {
    	return (int) KGRANULARITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #aType()
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV aType(int aType) {
    	ATYPE_HANDLE.set(segment, 0L, aType);
    	return this;
    }
    
    public int aType() {
    	return (int) ATYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #bType()
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV bType(int bType) {
    	BTYPE_HANDLE.set(segment, 0L, bType);
    	return this;
    }
    
    public int bType() {
    	return (int) BTYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #cType()
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV cType(int cType) {
    	CTYPE_HANDLE.set(segment, 0L, cType);
    	return this;
    }
    
    public int cType() {
    	return (int) CTYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #resultType()
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV resultType(int resultType) {
    	RESULT_TYPE_HANDLE.set(segment, 0L, resultType);
    	return this;
    }
    
    public int resultType() {
    	return (int) RESULT_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #saturatingAccumulation()
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV saturatingAccumulation(int saturatingAccumulation) {
    	SATURATING_ACCUMULATION_HANDLE.set(segment, 0L, saturatingAccumulation);
    	return this;
    }
    
    public int saturatingAccumulation() {
    	return (int) SATURATING_ACCUMULATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #scope()
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV scope(int scope) {
    	SCOPE_HANDLE.set(segment, 0L, scope);
    	return this;
    }
    
    public int scope() {
    	return (int) SCOPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #workgroupInvocations()
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV workgroupInvocations(int workgroupInvocations) {
    	WORKGROUP_INVOCATIONS_HANDLE.set(segment, 0L, workgroupInvocations);
    	return this;
    }
    
    public int workgroupInvocations() {
    	return (int) WORKGROUP_INVOCATIONS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV set(VkCooperativeMatrixFlexibleDimensionsPropertiesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCooperativeMatrixFlexibleDimensionsPropertiesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCooperativeMatrixFlexibleDimensionsPropertiesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCooperativeMatrixFlexibleDimensionsPropertiesNV> array(Arena arena, VkCooperativeMatrixFlexibleDimensionsPropertiesNV... structs) {
        NativeStructArray<VkCooperativeMatrixFlexibleDimensionsPropertiesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCooperativeMatrixFlexibleDimensionsPropertiesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(segment)
        );
    }
    
}