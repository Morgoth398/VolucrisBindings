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

public final class VkColorBlendAdvancedEXT
		implements Struct<VkColorBlendAdvancedEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ADVANCED_BLEND_OP_HANDLE;
	public static final VarHandle SRC_PREMULTIPLIED_HANDLE;
	public static final VarHandle DST_PREMULTIPLIED_HANDLE;
	public static final VarHandle BLEND_OVERLAP_HANDLE;
	public static final VarHandle CLAMP_RESULTS_HANDLE;

	public static final long ADVANCED_BLEND_OP_BYTE_OFFSET;
	public static final long SRC_PREMULTIPLIED_BYTE_OFFSET;
	public static final long DST_PREMULTIPLIED_BYTE_OFFSET;
	public static final long BLEND_OVERLAP_BYTE_OFFSET;
	public static final long CLAMP_RESULTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("advancedBlendOp"),
		    JAVA_INT.withName("srcPremultiplied"),
		    JAVA_INT.withName("dstPremultiplied"),
		    JAVA_INT.withName("blendOverlap"),
		    JAVA_INT.withName("clampResults")
		).withName("VkColorBlendAdvancedEXT").withByteAlignment(4);
		
		ADVANCED_BLEND_OP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("advancedBlendOp"));
		SRC_PREMULTIPLIED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcPremultiplied"));
		DST_PREMULTIPLIED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstPremultiplied"));
		BLEND_OVERLAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blendOverlap"));
		CLAMP_RESULTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clampResults"));
		
		ADVANCED_BLEND_OP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendOp"));
		SRC_PREMULTIPLIED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcPremultiplied"));
		DST_PREMULTIPLIED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstPremultiplied"));
		BLEND_OVERLAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blendOverlap"));
		CLAMP_RESULTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clampResults"));
		//@formatter:on
	}

	public VkColorBlendAdvancedEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkColorBlendAdvancedEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkColorBlendAdvancedEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #advancedBlendOp()
    public VkColorBlendAdvancedEXT advancedBlendOp(int advancedBlendOp) {
    	ADVANCED_BLEND_OP_HANDLE.set(segment, 0L, advancedBlendOp);
    	return this;
    }
    
    public int advancedBlendOp() {
    	return (int) ADVANCED_BLEND_OP_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcPremultiplied()
    public VkColorBlendAdvancedEXT srcPremultiplied(int srcPremultiplied) {
    	SRC_PREMULTIPLIED_HANDLE.set(segment, 0L, srcPremultiplied);
    	return this;
    }
    
    public int srcPremultiplied() {
    	return (int) SRC_PREMULTIPLIED_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstPremultiplied()
    public VkColorBlendAdvancedEXT dstPremultiplied(int dstPremultiplied) {
    	DST_PREMULTIPLIED_HANDLE.set(segment, 0L, dstPremultiplied);
    	return this;
    }
    
    public int dstPremultiplied() {
    	return (int) DST_PREMULTIPLIED_HANDLE.get(segment, 0L);
    }
    
    /// @see #blendOverlap()
    public VkColorBlendAdvancedEXT blendOverlap(int blendOverlap) {
    	BLEND_OVERLAP_HANDLE.set(segment, 0L, blendOverlap);
    	return this;
    }
    
    public int blendOverlap() {
    	return (int) BLEND_OVERLAP_HANDLE.get(segment, 0L);
    }
    
    /// @see #clampResults()
    public VkColorBlendAdvancedEXT clampResults(int clampResults) {
    	CLAMP_RESULTS_HANDLE.set(segment, 0L, clampResults);
    	return this;
    }
    
    public int clampResults() {
    	return (int) CLAMP_RESULTS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkColorBlendAdvancedEXT set(VkColorBlendAdvancedEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkColorBlendAdvancedEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkColorBlendAdvancedEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkColorBlendAdvancedEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkColorBlendAdvancedEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkColorBlendAdvancedEXT> array(Arena arena, VkColorBlendAdvancedEXT... structs) {
        NativeStructArray<VkColorBlendAdvancedEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkColorBlendAdvancedEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkColorBlendAdvancedEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkColorBlendAdvancedEXT(segment)
        );
    }

}