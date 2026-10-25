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

public final class VkCuFunctionCreateInfoNVX
		implements Struct<VkCuFunctionCreateInfoNVX> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MODULE_HANDLE;
	public static final VarHandle P_NAME_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MODULE_BYTE_OFFSET;
	public static final long P_NAME_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("module"),
		    UNBOUNDED_ADDRESS.withName("pName")
		).withName("VkCuFunctionCreateInfoNVX").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MODULE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("module"));
		P_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pName"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MODULE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("module"));
		P_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pName"));
		//@formatter:on
	}

	public VkCuFunctionCreateInfoNVX() {
	    this(Arena.ofAuto());
	}
	
	public VkCuFunctionCreateInfoNVX(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkCuFunctionCreateInfoNVX(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkCuFunctionCreateInfoNVX sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCuFunctionCreateInfoNVX pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #module()
    public VkCuFunctionCreateInfoNVX module(VkCuModuleNVX module) {
    	MODULE_HANDLE.set(segment, 0L, module.memorySegment());
    	return this;
    }
    
    public @Nullable VkCuModuleNVX module() {
    	MemorySegment segment = (MemorySegment) MODULE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkCuModuleNVX(segment);
    }
    
    /// @see #pName()
    public VkCuFunctionCreateInfoNVX pName(SegmentAllocator allocator, String pName) {
    	P_NAME_HANDLE.set(segment, 0L, allocator.allocateFrom(pName));
    	return this;
    }
    
    public @Nullable String pName() {
    	MemorySegment segment = (MemorySegment) P_NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    @Override
    public VkCuFunctionCreateInfoNVX set(VkCuFunctionCreateInfoNVX other) {
        return set(other.segment);
    }
    
    @Override
    public VkCuFunctionCreateInfoNVX set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCuFunctionCreateInfoNVX> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCuFunctionCreateInfoNVX> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCuFunctionCreateInfoNVX(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCuFunctionCreateInfoNVX> array(SegmentAllocator allocator, VkCuFunctionCreateInfoNVX... structs) {
        NativeStructArray<VkCuFunctionCreateInfoNVX> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCuFunctionCreateInfoNVX(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCuFunctionCreateInfoNVX> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCuFunctionCreateInfoNVX(segment)
        );
    }

}