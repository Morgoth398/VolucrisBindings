/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
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

public final class VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM
		implements Struct<VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ENABLE_YDEGAMMA_HANDLE;
	public static final VarHandle ENABLE_CB_CR_DEGAMMA_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ENABLE_YDEGAMMA_BYTE_OFFSET;
	public static final long ENABLE_CB_CR_DEGAMMA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("enableYDegamma"),
		    JAVA_INT.withName("enableCbCrDegamma")
		).withName("VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ENABLE_YDEGAMMA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableYDegamma"));
		ENABLE_CB_CR_DEGAMMA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableCbCrDegamma"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ENABLE_YDEGAMMA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableYDegamma"));
		ENABLE_CB_CR_DEGAMMA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableCbCrDegamma"));
		//@formatter:on
	}

	public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM() {
	    this(Arena.ofAuto());
	}
	
	public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #enableYDegamma()
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM enableYDegamma(int enableYDegamma) {
    	ENABLE_YDEGAMMA_HANDLE.set(segment, 0L, enableYDegamma);
    	return this;
    }
    
    public int enableYDegamma() {
    	return (int) ENABLE_YDEGAMMA_HANDLE.get(segment, 0L);
    }
    
    /// @see #enableCbCrDegamma()
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM enableCbCrDegamma(int enableCbCrDegamma) {
    	ENABLE_CB_CR_DEGAMMA_HANDLE.set(segment, 0L, enableCbCrDegamma);
    	return this;
    }
    
    public int enableCbCrDegamma() {
    	return (int) ENABLE_CB_CR_DEGAMMA_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM set(VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM> array(SegmentAllocator allocator, VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM... structs) {
        NativeStructArray<VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(segment)
        );
    }

}