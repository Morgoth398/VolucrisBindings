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

public final class VkCooperativeVectorPropertiesNV
		implements Struct<VkCooperativeVectorPropertiesNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle INPUT_TYPE_HANDLE;
    public static final VarHandle INPUT_INTERPRETATION_HANDLE;
    public static final VarHandle MATRIX_INTERPRETATION_HANDLE;
    public static final VarHandle BIAS_INTERPRETATION_HANDLE;
    public static final VarHandle RESULT_TYPE_HANDLE;
    public static final VarHandle TRANSPOSE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long INPUT_TYPE_BYTE_OFFSET;
    public static final long INPUT_INTERPRETATION_BYTE_OFFSET;
    public static final long MATRIX_INTERPRETATION_BYTE_OFFSET;
    public static final long BIAS_INTERPRETATION_BYTE_OFFSET;
    public static final long RESULT_TYPE_BYTE_OFFSET;
    public static final long TRANSPOSE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("inputType"),
            JAVA_INT.withName("inputInterpretation"),
            JAVA_INT.withName("matrixInterpretation"),
            JAVA_INT.withName("biasInterpretation"),
            JAVA_INT.withName("resultType"),
            JAVA_INT.withName("transpose")
        ).withName("VkCooperativeVectorPropertiesNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        INPUT_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inputType"));
        INPUT_INTERPRETATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inputInterpretation"));
        MATRIX_INTERPRETATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("matrixInterpretation"));
        BIAS_INTERPRETATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("biasInterpretation"));
        RESULT_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("resultType"));
        TRANSPOSE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("transpose"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        INPUT_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inputType"));
        INPUT_INTERPRETATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inputInterpretation"));
        MATRIX_INTERPRETATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("matrixInterpretation"));
        BIAS_INTERPRETATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("biasInterpretation"));
        RESULT_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resultType"));
        TRANSPOSE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transpose"));
        //@formatter:on
    }

    public VkCooperativeVectorPropertiesNV() {
        this(Arena.ofAuto());
    }
    
    public VkCooperativeVectorPropertiesNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkCooperativeVectorPropertiesNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkCooperativeVectorPropertiesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCooperativeVectorPropertiesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #inputType()
    public VkCooperativeVectorPropertiesNV inputType(int inputType) {
    	INPUT_TYPE_HANDLE.set(segment, 0L, inputType);
    	return this;
    }
    
    public int inputType() {
    	return (int) INPUT_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #inputInterpretation()
    public VkCooperativeVectorPropertiesNV inputInterpretation(int inputInterpretation) {
    	INPUT_INTERPRETATION_HANDLE.set(segment, 0L, inputInterpretation);
    	return this;
    }
    
    public int inputInterpretation() {
    	return (int) INPUT_INTERPRETATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #matrixInterpretation()
    public VkCooperativeVectorPropertiesNV matrixInterpretation(int matrixInterpretation) {
    	MATRIX_INTERPRETATION_HANDLE.set(segment, 0L, matrixInterpretation);
    	return this;
    }
    
    public int matrixInterpretation() {
    	return (int) MATRIX_INTERPRETATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #biasInterpretation()
    public VkCooperativeVectorPropertiesNV biasInterpretation(int biasInterpretation) {
    	BIAS_INTERPRETATION_HANDLE.set(segment, 0L, biasInterpretation);
    	return this;
    }
    
    public int biasInterpretation() {
    	return (int) BIAS_INTERPRETATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #resultType()
    public VkCooperativeVectorPropertiesNV resultType(int resultType) {
    	RESULT_TYPE_HANDLE.set(segment, 0L, resultType);
    	return this;
    }
    
    public int resultType() {
    	return (int) RESULT_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #transpose()
    public VkCooperativeVectorPropertiesNV transpose(int transpose) {
    	TRANSPOSE_HANDLE.set(segment, 0L, transpose);
    	return this;
    }
    
    public int transpose() {
    	return (int) TRANSPOSE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkCooperativeVectorPropertiesNV set(VkCooperativeVectorPropertiesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkCooperativeVectorPropertiesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCooperativeVectorPropertiesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCooperativeVectorPropertiesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCooperativeVectorPropertiesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCooperativeVectorPropertiesNV> array(Arena arena, VkCooperativeVectorPropertiesNV... structs) {
        NativeStructArray<VkCooperativeVectorPropertiesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCooperativeVectorPropertiesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCooperativeVectorPropertiesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCooperativeVectorPropertiesNV(segment)
        );
    }
    
}