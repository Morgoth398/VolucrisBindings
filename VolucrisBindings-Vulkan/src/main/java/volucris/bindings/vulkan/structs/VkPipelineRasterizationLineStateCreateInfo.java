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

public final class VkPipelineRasterizationLineStateCreateInfo
		implements Struct<VkPipelineRasterizationLineStateCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle LINE_RASTERIZATION_MODE_HANDLE;
	public static final VarHandle STIPPLED_LINE_ENABLE_HANDLE;
	public static final VarHandle LINE_STIPPLE_FACTOR_HANDLE;
	public static final VarHandle LINE_STIPPLE_PATTERN_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long LINE_RASTERIZATION_MODE_BYTE_OFFSET;
	public static final long STIPPLED_LINE_ENABLE_BYTE_OFFSET;
	public static final long LINE_STIPPLE_FACTOR_BYTE_OFFSET;
	public static final long LINE_STIPPLE_PATTERN_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("lineRasterizationMode"),
		    JAVA_INT.withName("stippledLineEnable"),
		    JAVA_INT.withName("lineStippleFactor"),
		    JAVA_SHORT.withName("lineStipplePattern"),
		    MemoryLayout.paddingLayout(2)
		).withName("VkPipelineRasterizationLineStateCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		LINE_RASTERIZATION_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lineRasterizationMode"));
		STIPPLED_LINE_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stippledLineEnable"));
		LINE_STIPPLE_FACTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lineStippleFactor"));
		LINE_STIPPLE_PATTERN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lineStipplePattern"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		LINE_RASTERIZATION_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lineRasterizationMode"));
		STIPPLED_LINE_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stippledLineEnable"));
		LINE_STIPPLE_FACTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lineStippleFactor"));
		LINE_STIPPLE_PATTERN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lineStipplePattern"));
		//@formatter:on
	}

	public VkPipelineRasterizationLineStateCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineRasterizationLineStateCreateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPipelineRasterizationLineStateCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineRasterizationLineStateCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineRasterizationLineStateCreateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #lineRasterizationMode()
    public VkPipelineRasterizationLineStateCreateInfo lineRasterizationMode(int lineRasterizationMode) {
    	LINE_RASTERIZATION_MODE_HANDLE.set(segment, 0L, lineRasterizationMode);
    	return this;
    }
    
    public int lineRasterizationMode() {
    	return (int) LINE_RASTERIZATION_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #stippledLineEnable()
    public VkPipelineRasterizationLineStateCreateInfo stippledLineEnable(int stippledLineEnable) {
    	STIPPLED_LINE_ENABLE_HANDLE.set(segment, 0L, stippledLineEnable);
    	return this;
    }
    
    public int stippledLineEnable() {
    	return (int) STIPPLED_LINE_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #lineStippleFactor()
    public VkPipelineRasterizationLineStateCreateInfo lineStippleFactor(int lineStippleFactor) {
    	LINE_STIPPLE_FACTOR_HANDLE.set(segment, 0L, lineStippleFactor);
    	return this;
    }
    
    public int lineStippleFactor() {
    	return (int) LINE_STIPPLE_FACTOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #lineStipplePattern()
    public VkPipelineRasterizationLineStateCreateInfo lineStipplePattern(short lineStipplePattern) {
    	LINE_STIPPLE_PATTERN_HANDLE.set(segment, 0L, lineStipplePattern);
    	return this;
    }
    
    public short lineStipplePattern() {
    	return (short) LINE_STIPPLE_PATTERN_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPipelineRasterizationLineStateCreateInfo set(VkPipelineRasterizationLineStateCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineRasterizationLineStateCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineRasterizationLineStateCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineRasterizationLineStateCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineRasterizationLineStateCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineRasterizationLineStateCreateInfo> array(Arena arena, VkPipelineRasterizationLineStateCreateInfo... structs) {
        NativeStructArray<VkPipelineRasterizationLineStateCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineRasterizationLineStateCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineRasterizationLineStateCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineRasterizationLineStateCreateInfo(segment)
        );
    }

}