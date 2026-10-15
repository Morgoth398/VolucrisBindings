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

public final class VkSubpassDependency2
		implements Struct<VkSubpassDependency2> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SRC_SUBPASS_HANDLE;
	public static final VarHandle DST_SUBPASS_HANDLE;
	public static final VarHandle SRC_STAGE_MASK_HANDLE;
	public static final VarHandle DST_STAGE_MASK_HANDLE;
	public static final VarHandle SRC_ACCESS_MASK_HANDLE;
	public static final VarHandle DST_ACCESS_MASK_HANDLE;
	public static final VarHandle DEPENDENCY_FLAGS_HANDLE;
	public static final VarHandle VIEW_OFFSET_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SRC_SUBPASS_BYTE_OFFSET;
	public static final long DST_SUBPASS_BYTE_OFFSET;
	public static final long SRC_STAGE_MASK_BYTE_OFFSET;
	public static final long DST_STAGE_MASK_BYTE_OFFSET;
	public static final long SRC_ACCESS_MASK_BYTE_OFFSET;
	public static final long DST_ACCESS_MASK_BYTE_OFFSET;
	public static final long DEPENDENCY_FLAGS_BYTE_OFFSET;
	public static final long VIEW_OFFSET_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("srcSubpass"),
		    JAVA_INT.withName("dstSubpass"),
		    JAVA_INT.withName("srcStageMask"),
		    JAVA_INT.withName("dstStageMask"),
		    JAVA_INT.withName("srcAccessMask"),
		    JAVA_INT.withName("dstAccessMask"),
		    JAVA_INT.withName("dependencyFlags"),
		    JAVA_INT.withName("viewOffset")
		).withName("VkSubpassDependency2").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SRC_SUBPASS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcSubpass"));
		DST_SUBPASS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstSubpass"));
		SRC_STAGE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcStageMask"));
		DST_STAGE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstStageMask"));
		SRC_ACCESS_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcAccessMask"));
		DST_ACCESS_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstAccessMask"));
		DEPENDENCY_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dependencyFlags"));
		VIEW_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("viewOffset"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SRC_SUBPASS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcSubpass"));
		DST_SUBPASS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstSubpass"));
		SRC_STAGE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcStageMask"));
		DST_STAGE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstStageMask"));
		SRC_ACCESS_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask"));
		DST_ACCESS_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask"));
		DEPENDENCY_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dependencyFlags"));
		VIEW_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("viewOffset"));
		//@formatter:on
	}

	public VkSubpassDependency2() {
	    this(Arena.ofAuto());
	}
	
	public VkSubpassDependency2(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkSubpassDependency2(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkSubpassDependency2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSubpassDependency2 pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #srcSubpass()
    public VkSubpassDependency2 srcSubpass(int srcSubpass) {
    	SRC_SUBPASS_HANDLE.set(segment, 0L, srcSubpass);
    	return this;
    }
    
    public int srcSubpass() {
    	return (int) SRC_SUBPASS_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstSubpass()
    public VkSubpassDependency2 dstSubpass(int dstSubpass) {
    	DST_SUBPASS_HANDLE.set(segment, 0L, dstSubpass);
    	return this;
    }
    
    public int dstSubpass() {
    	return (int) DST_SUBPASS_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcStageMask()
    public VkSubpassDependency2 srcStageMask(int srcStageMask) {
    	SRC_STAGE_MASK_HANDLE.set(segment, 0L, srcStageMask);
    	return this;
    }
    
    public int srcStageMask() {
    	return (int) SRC_STAGE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstStageMask()
    public VkSubpassDependency2 dstStageMask(int dstStageMask) {
    	DST_STAGE_MASK_HANDLE.set(segment, 0L, dstStageMask);
    	return this;
    }
    
    public int dstStageMask() {
    	return (int) DST_STAGE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcAccessMask()
    public VkSubpassDependency2 srcAccessMask(int srcAccessMask) {
    	SRC_ACCESS_MASK_HANDLE.set(segment, 0L, srcAccessMask);
    	return this;
    }
    
    public int srcAccessMask() {
    	return (int) SRC_ACCESS_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstAccessMask()
    public VkSubpassDependency2 dstAccessMask(int dstAccessMask) {
    	DST_ACCESS_MASK_HANDLE.set(segment, 0L, dstAccessMask);
    	return this;
    }
    
    public int dstAccessMask() {
    	return (int) DST_ACCESS_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #dependencyFlags()
    public VkSubpassDependency2 dependencyFlags(int dependencyFlags) {
    	DEPENDENCY_FLAGS_HANDLE.set(segment, 0L, dependencyFlags);
    	return this;
    }
    
    public int dependencyFlags() {
    	return (int) DEPENDENCY_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #viewOffset()
    public VkSubpassDependency2 viewOffset(int viewOffset) {
    	VIEW_OFFSET_HANDLE.set(segment, 0L, viewOffset);
    	return this;
    }
    
    public int viewOffset() {
    	return (int) VIEW_OFFSET_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSubpassDependency2 set(VkSubpassDependency2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkSubpassDependency2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSubpassDependency2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSubpassDependency2> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSubpassDependency2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSubpassDependency2> array(Arena arena, VkSubpassDependency2... structs) {
        NativeStructArray<VkSubpassDependency2> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSubpassDependency2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSubpassDependency2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSubpassDependency2(segment)
        );
    }

}