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

public final class VkVideoEncodeProfileRgbConversionInfoVALVE
		implements Struct<VkVideoEncodeProfileRgbConversionInfoVALVE> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PERFORM_ENCODE_RGB_CONVERSION_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PERFORM_ENCODE_RGB_CONVERSION_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("performEncodeRgbConversion"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkVideoEncodeProfileRgbConversionInfoVALVE").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PERFORM_ENCODE_RGB_CONVERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("performEncodeRgbConversion"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PERFORM_ENCODE_RGB_CONVERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("performEncodeRgbConversion"));
		//@formatter:on
	}

	public VkVideoEncodeProfileRgbConversionInfoVALVE() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeProfileRgbConversionInfoVALVE(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoEncodeProfileRgbConversionInfoVALVE(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeProfileRgbConversionInfoVALVE sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeProfileRgbConversionInfoVALVE pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #performEncodeRgbConversion()
    public VkVideoEncodeProfileRgbConversionInfoVALVE performEncodeRgbConversion(int performEncodeRgbConversion) {
    	PERFORM_ENCODE_RGB_CONVERSION_HANDLE.set(segment, 0L, performEncodeRgbConversion);
    	return this;
    }
    
    public int performEncodeRgbConversion() {
    	return (int) PERFORM_ENCODE_RGB_CONVERSION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeProfileRgbConversionInfoVALVE set(VkVideoEncodeProfileRgbConversionInfoVALVE other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeProfileRgbConversionInfoVALVE set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeProfileRgbConversionInfoVALVE> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeProfileRgbConversionInfoVALVE> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeProfileRgbConversionInfoVALVE(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeProfileRgbConversionInfoVALVE> array(Arena arena, VkVideoEncodeProfileRgbConversionInfoVALVE... structs) {
        NativeStructArray<VkVideoEncodeProfileRgbConversionInfoVALVE> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeProfileRgbConversionInfoVALVE(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeProfileRgbConversionInfoVALVE> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeProfileRgbConversionInfoVALVE(segment)
        );
    }

}