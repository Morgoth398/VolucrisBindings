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

public final class VkShaderModuleIdentifierEXT
		implements Struct<VkShaderModuleIdentifierEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle IDENTIFIER_SIZE_HANDLE;
	public static final VarHandle IDENTIFIER_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long IDENTIFIER_SIZE_BYTE_OFFSET;
	public static final long IDENTIFIER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("identifierSize"),
		    MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("identifier"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkShaderModuleIdentifierEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		IDENTIFIER_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("identifierSize"));
		IDENTIFIER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("identifier"), PathElement.sequenceElement());
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		IDENTIFIER_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("identifierSize"));
		IDENTIFIER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("identifier"));
		//@formatter:on
	}

	public VkShaderModuleIdentifierEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkShaderModuleIdentifierEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkShaderModuleIdentifierEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkShaderModuleIdentifierEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkShaderModuleIdentifierEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #identifierSize()
    public VkShaderModuleIdentifierEXT identifierSize(int identifierSize) {
    	IDENTIFIER_SIZE_HANDLE.set(segment, 0L, identifierSize);
    	return this;
    }
    
    public int identifierSize() {
    	return (int) IDENTIFIER_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #identifier(int)
    public VkShaderModuleIdentifierEXT identifier(byte identifier, int index0) {
    	IDENTIFIER_HANDLE.set(segment, 0L, index0, identifier);
    	return this;
    }
    
    public byte identifier(int index0) {
    	return (byte) IDENTIFIER_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public VkShaderModuleIdentifierEXT set(VkShaderModuleIdentifierEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkShaderModuleIdentifierEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkShaderModuleIdentifierEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkShaderModuleIdentifierEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkShaderModuleIdentifierEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkShaderModuleIdentifierEXT> array(SegmentAllocator allocator, VkShaderModuleIdentifierEXT... structs) {
        NativeStructArray<VkShaderModuleIdentifierEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkShaderModuleIdentifierEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkShaderModuleIdentifierEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkShaderModuleIdentifierEXT(segment)
        );
    }

}