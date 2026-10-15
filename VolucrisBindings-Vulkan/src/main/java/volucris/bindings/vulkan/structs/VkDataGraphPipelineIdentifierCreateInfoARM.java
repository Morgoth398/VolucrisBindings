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
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkDataGraphPipelineIdentifierCreateInfoARM
		implements Struct<VkDataGraphPipelineIdentifierCreateInfoARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle IDENTIFIER_SIZE_HANDLE;
	public static final VarHandle P_IDENTIFIER_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long IDENTIFIER_SIZE_BYTE_OFFSET;
	public static final long P_IDENTIFIER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("identifierSize"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pIdentifier")
		).withName("VkDataGraphPipelineIdentifierCreateInfoARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		IDENTIFIER_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("identifierSize"));
		P_IDENTIFIER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pIdentifier"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		IDENTIFIER_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("identifierSize"));
		P_IDENTIFIER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pIdentifier"));
		//@formatter:on
	}

	public VkDataGraphPipelineIdentifierCreateInfoARM() {
	    this(Arena.ofAuto());
	}
	
	public VkDataGraphPipelineIdentifierCreateInfoARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDataGraphPipelineIdentifierCreateInfoARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDataGraphPipelineIdentifierCreateInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDataGraphPipelineIdentifierCreateInfoARM pNext(MemorySegment pNext) {
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
    public VkDataGraphPipelineIdentifierCreateInfoARM identifierSize(int identifierSize) {
    	IDENTIFIER_SIZE_HANDLE.set(segment, 0L, identifierSize);
    	return this;
    }
    
    public int identifierSize() {
    	return (int) IDENTIFIER_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pIdentifier()
    public VkDataGraphPipelineIdentifierCreateInfoARM pIdentifier(NativeByteArray pIdentifier) {
    	P_IDENTIFIER_HANDLE.set(segment, 0L, pIdentifier.memorySegment());
    	return this;
    }
    
    public @Nullable NativeByteArray pIdentifier() {
    	MemorySegment segment = (MemorySegment) P_IDENTIFIER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    @Override
    public VkDataGraphPipelineIdentifierCreateInfoARM set(VkDataGraphPipelineIdentifierCreateInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkDataGraphPipelineIdentifierCreateInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDataGraphPipelineIdentifierCreateInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDataGraphPipelineIdentifierCreateInfoARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelineIdentifierCreateInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDataGraphPipelineIdentifierCreateInfoARM> array(Arena arena, VkDataGraphPipelineIdentifierCreateInfoARM... structs) {
        NativeStructArray<VkDataGraphPipelineIdentifierCreateInfoARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDataGraphPipelineIdentifierCreateInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDataGraphPipelineIdentifierCreateInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDataGraphPipelineIdentifierCreateInfoARM(segment)
        );
    }

}