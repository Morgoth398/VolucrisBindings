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

public final class VkDataGraphPipelineCompilerControlCreateInfoARM
		implements Struct<VkDataGraphPipelineCompilerControlCreateInfoARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_VENDOR_OPTIONS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_VENDOR_OPTIONS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pVendorOptions")
		).withName("VkDataGraphPipelineCompilerControlCreateInfoARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_VENDOR_OPTIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pVendorOptions"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_VENDOR_OPTIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pVendorOptions"));
		//@formatter:on
	}

	public VkDataGraphPipelineCompilerControlCreateInfoARM() {
	    this(Arena.ofAuto());
	}
	
	public VkDataGraphPipelineCompilerControlCreateInfoARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDataGraphPipelineCompilerControlCreateInfoARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDataGraphPipelineCompilerControlCreateInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDataGraphPipelineCompilerControlCreateInfoARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pVendorOptions()
    public VkDataGraphPipelineCompilerControlCreateInfoARM pVendorOptions(Arena arena, String pVendorOptions) {
    	P_VENDOR_OPTIONS_HANDLE.set(segment, 0L, arena.allocateFrom(pVendorOptions));
    	return this;
    }
    
    public @Nullable String pVendorOptions() {
    	MemorySegment segment = (MemorySegment) P_VENDOR_OPTIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    @Override
    public VkDataGraphPipelineCompilerControlCreateInfoARM set(VkDataGraphPipelineCompilerControlCreateInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDataGraphPipelineCompilerControlCreateInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDataGraphPipelineCompilerControlCreateInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDataGraphPipelineCompilerControlCreateInfoARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelineCompilerControlCreateInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDataGraphPipelineCompilerControlCreateInfoARM> array(Arena arena, VkDataGraphPipelineCompilerControlCreateInfoARM... structs) {
        NativeStructArray<VkDataGraphPipelineCompilerControlCreateInfoARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelineCompilerControlCreateInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDataGraphPipelineCompilerControlCreateInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDataGraphPipelineCompilerControlCreateInfoARM(segment)
        );
    }

}