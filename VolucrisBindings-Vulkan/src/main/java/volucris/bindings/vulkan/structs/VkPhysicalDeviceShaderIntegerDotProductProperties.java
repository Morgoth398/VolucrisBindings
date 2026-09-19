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

public final class VkPhysicalDeviceShaderIntegerDotProductProperties
		implements Struct<VkPhysicalDeviceShaderIntegerDotProductProperties> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT8_BIT_UNSIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT8_BIT_SIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT8_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT4X8_BIT_PACKED_UNSIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT4X8_BIT_PACKED_SIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT16_BIT_UNSIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT16_BIT_SIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT16_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT32_BIT_UNSIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT32_BIT_SIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT32_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT64_BIT_UNSIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT64_BIT_SIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT64_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_UNSIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_SIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_UNSIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_SIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_UNSIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_SIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_UNSIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_SIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_UNSIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_SIGNED_ACCELERATED_HANDLE;
    public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT8_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT8_BIT_SIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT8_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT4X8_BIT_PACKED_UNSIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT4X8_BIT_PACKED_SIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT16_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT16_BIT_SIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT16_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT32_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT32_BIT_SIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT32_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT64_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT64_BIT_SIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT64_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_SIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_UNSIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_SIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_SIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_SIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_SIGNED_ACCELERATED_BYTE_OFFSET;
    public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("integerDotProduct8BitUnsignedAccelerated"),
            JAVA_INT.withName("integerDotProduct8BitSignedAccelerated"),
            JAVA_INT.withName("integerDotProduct8BitMixedSignednessAccelerated"),
            JAVA_INT.withName("integerDotProduct4x8BitPackedUnsignedAccelerated"),
            JAVA_INT.withName("integerDotProduct4x8BitPackedSignedAccelerated"),
            JAVA_INT.withName("integerDotProduct4x8BitPackedMixedSignednessAccelerated"),
            JAVA_INT.withName("integerDotProduct16BitUnsignedAccelerated"),
            JAVA_INT.withName("integerDotProduct16BitSignedAccelerated"),
            JAVA_INT.withName("integerDotProduct16BitMixedSignednessAccelerated"),
            JAVA_INT.withName("integerDotProduct32BitUnsignedAccelerated"),
            JAVA_INT.withName("integerDotProduct32BitSignedAccelerated"),
            JAVA_INT.withName("integerDotProduct32BitMixedSignednessAccelerated"),
            JAVA_INT.withName("integerDotProduct64BitUnsignedAccelerated"),
            JAVA_INT.withName("integerDotProduct64BitSignedAccelerated"),
            JAVA_INT.withName("integerDotProduct64BitMixedSignednessAccelerated"),
            JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"),
            JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitSignedAccelerated"),
            JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"),
            JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"),
            JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"),
            JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"),
            JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"),
            JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitSignedAccelerated"),
            JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"),
            JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"),
            JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitSignedAccelerated"),
            JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"),
            JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"),
            JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitSignedAccelerated"),
            JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated")
        ).withName("VkPhysicalDeviceShaderIntegerDotProductProperties").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        INTEGER_DOT_PRODUCT8_BIT_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT8_BIT_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct8BitSignedAccelerated"));
        INTEGER_DOT_PRODUCT8_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated"));
        INTEGER_DOT_PRODUCT4X8_BIT_PACKED_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT4X8_BIT_PACKED_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated"));
        INTEGER_DOT_PRODUCT4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated"));
        INTEGER_DOT_PRODUCT16_BIT_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT16_BIT_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct16BitSignedAccelerated"));
        INTEGER_DOT_PRODUCT16_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated"));
        INTEGER_DOT_PRODUCT32_BIT_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT32_BIT_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct32BitSignedAccelerated"));
        INTEGER_DOT_PRODUCT32_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated"));
        INTEGER_DOT_PRODUCT64_BIT_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT64_BIT_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct64BitSignedAccelerated"));
        INTEGER_DOT_PRODUCT64_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        INTEGER_DOT_PRODUCT8_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT8_BIT_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct8BitSignedAccelerated"));
        INTEGER_DOT_PRODUCT8_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated"));
        INTEGER_DOT_PRODUCT4X8_BIT_PACKED_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT4X8_BIT_PACKED_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated"));
        INTEGER_DOT_PRODUCT4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated"));
        INTEGER_DOT_PRODUCT16_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT16_BIT_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct16BitSignedAccelerated"));
        INTEGER_DOT_PRODUCT16_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated"));
        INTEGER_DOT_PRODUCT32_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT32_BIT_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct32BitSignedAccelerated"));
        INTEGER_DOT_PRODUCT32_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated"));
        INTEGER_DOT_PRODUCT64_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT64_BIT_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct64BitSignedAccelerated"));
        INTEGER_DOT_PRODUCT64_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated"));
        INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"));
        //@formatter:on
    }

    public VkPhysicalDeviceShaderIntegerDotProductProperties() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceShaderIntegerDotProductProperties(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceShaderIntegerDotProductProperties(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceShaderIntegerDotProductProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShaderIntegerDotProductProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #integerDotProduct8BitUnsignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct8BitUnsignedAccelerated(int integerDotProduct8BitUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT8_BIT_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct8BitUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct8BitUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT8_BIT_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct8BitSignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct8BitSignedAccelerated(int integerDotProduct8BitSignedAccelerated) {
    	INTEGER_DOT_PRODUCT8_BIT_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct8BitSignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct8BitSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT8_BIT_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct8BitMixedSignednessAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct8BitMixedSignednessAccelerated(int integerDotProduct8BitMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT8_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct8BitMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProduct8BitMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT8_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct4x8BitPackedUnsignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct4x8BitPackedUnsignedAccelerated(int integerDotProduct4x8BitPackedUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT4X8_BIT_PACKED_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct4x8BitPackedUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct4x8BitPackedUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT4X8_BIT_PACKED_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct4x8BitPackedSignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct4x8BitPackedSignedAccelerated(int integerDotProduct4x8BitPackedSignedAccelerated) {
    	INTEGER_DOT_PRODUCT4X8_BIT_PACKED_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct4x8BitPackedSignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct4x8BitPackedSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT4X8_BIT_PACKED_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct4x8BitPackedMixedSignednessAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct4x8BitPackedMixedSignednessAccelerated(int integerDotProduct4x8BitPackedMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct4x8BitPackedMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProduct4x8BitPackedMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct16BitUnsignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct16BitUnsignedAccelerated(int integerDotProduct16BitUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT16_BIT_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct16BitUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct16BitUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT16_BIT_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct16BitSignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct16BitSignedAccelerated(int integerDotProduct16BitSignedAccelerated) {
    	INTEGER_DOT_PRODUCT16_BIT_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct16BitSignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct16BitSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT16_BIT_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct16BitMixedSignednessAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct16BitMixedSignednessAccelerated(int integerDotProduct16BitMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT16_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct16BitMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProduct16BitMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT16_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct32BitUnsignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct32BitUnsignedAccelerated(int integerDotProduct32BitUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT32_BIT_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct32BitUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct32BitUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT32_BIT_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct32BitSignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct32BitSignedAccelerated(int integerDotProduct32BitSignedAccelerated) {
    	INTEGER_DOT_PRODUCT32_BIT_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct32BitSignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct32BitSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT32_BIT_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct32BitMixedSignednessAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct32BitMixedSignednessAccelerated(int integerDotProduct32BitMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT32_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct32BitMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProduct32BitMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT32_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct64BitUnsignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct64BitUnsignedAccelerated(int integerDotProduct64BitUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT64_BIT_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct64BitUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct64BitUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT64_BIT_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct64BitSignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct64BitSignedAccelerated(int integerDotProduct64BitSignedAccelerated) {
    	INTEGER_DOT_PRODUCT64_BIT_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct64BitSignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct64BitSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT64_BIT_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct64BitMixedSignednessAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct64BitMixedSignednessAccelerated(int integerDotProduct64BitMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT64_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct64BitMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProduct64BitMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT64_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating8BitUnsignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(int integerDotProductAccumulatingSaturating8BitUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating8BitUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating8BitSignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating8BitSignedAccelerated(int integerDotProductAccumulatingSaturating8BitSignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating8BitSignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating8BitSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(int integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(int integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating16BitUnsignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(int integerDotProductAccumulatingSaturating16BitUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating16BitUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating16BitSignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating16BitSignedAccelerated(int integerDotProductAccumulatingSaturating16BitSignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating16BitSignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating16BitSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(int integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating32BitUnsignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(int integerDotProductAccumulatingSaturating32BitUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating32BitUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating32BitSignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating32BitSignedAccelerated(int integerDotProductAccumulatingSaturating32BitSignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating32BitSignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating32BitSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(int integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating64BitUnsignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(int integerDotProductAccumulatingSaturating64BitUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating64BitUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating64BitSignedAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating64BitSignedAccelerated(int integerDotProductAccumulatingSaturating64BitSignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating64BitSignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating64BitSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated()
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(int integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShaderIntegerDotProductProperties set(VkPhysicalDeviceShaderIntegerDotProductProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShaderIntegerDotProductProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShaderIntegerDotProductProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderIntegerDotProductProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderIntegerDotProductProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderIntegerDotProductProperties> array(Arena arena, VkPhysicalDeviceShaderIntegerDotProductProperties... structs) {
        NativeStructArray<VkPhysicalDeviceShaderIntegerDotProductProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderIntegerDotProductProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShaderIntegerDotProductProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShaderIntegerDotProductProperties(segment)
        );
    }
    
}