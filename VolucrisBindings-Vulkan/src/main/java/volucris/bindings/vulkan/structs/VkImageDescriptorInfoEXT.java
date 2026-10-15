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

public final class VkImageDescriptorInfoEXT
		implements Struct<VkImageDescriptorInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_VIEW_HANDLE;
	public static final VarHandle LAYOUT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_VIEW_BYTE_OFFSET;
	public static final long LAYOUT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pView"),
		    JAVA_INT.withName("layout"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkImageDescriptorInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_VIEW_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pView"));
		LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layout"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_VIEW_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pView"));
		LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layout"));
		//@formatter:on
	}

	public VkImageDescriptorInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkImageDescriptorInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkImageDescriptorInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkImageDescriptorInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImageDescriptorInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pView()
    public VkImageDescriptorInfoEXT pView(VkImageViewCreateInfo pView) {
    	P_VIEW_HANDLE.set(segment, 0L, pView.memorySegment());
    	return this;
    }
    
    public @Nullable VkImageViewCreateInfo pView() {
    	MemorySegment segment = (MemorySegment) P_VIEW_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImageViewCreateInfo(segment);
    }
    
    /// @see #layout()
    public VkImageDescriptorInfoEXT layout(int layout) {
    	LAYOUT_HANDLE.set(segment, 0L, layout);
    	return this;
    }
    
    public int layout() {
    	return (int) LAYOUT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkImageDescriptorInfoEXT set(VkImageDescriptorInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageDescriptorInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageDescriptorInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageDescriptorInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageDescriptorInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageDescriptorInfoEXT> array(Arena arena, VkImageDescriptorInfoEXT... structs) {
        NativeStructArray<VkImageDescriptorInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageDescriptorInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageDescriptorInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageDescriptorInfoEXT(segment)
        );
    }

}