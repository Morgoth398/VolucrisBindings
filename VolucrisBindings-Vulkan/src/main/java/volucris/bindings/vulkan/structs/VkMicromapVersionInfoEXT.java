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

public final class VkMicromapVersionInfoEXT
		implements Struct<VkMicromapVersionInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_VERSION_DATA_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_VERSION_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pVersionData")
		).withName("VkMicromapVersionInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_VERSION_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pVersionData"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_VERSION_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pVersionData"));
		//@formatter:on
	}

	public VkMicromapVersionInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkMicromapVersionInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkMicromapVersionInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkMicromapVersionInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkMicromapVersionInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pVersionData()
    public VkMicromapVersionInfoEXT pVersionData(NativeByteArray pVersionData) {
    	P_VERSION_DATA_HANDLE.set(segment, 0L, pVersionData.memorySegment());
    	return this;
    }
    
    public @Nullable NativeByteArray pVersionData() {
    	MemorySegment segment = (MemorySegment) P_VERSION_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    @Override
    public VkMicromapVersionInfoEXT set(VkMicromapVersionInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkMicromapVersionInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMicromapVersionInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMicromapVersionInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMicromapVersionInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMicromapVersionInfoEXT> array(Arena arena, VkMicromapVersionInfoEXT... structs) {
        NativeStructArray<VkMicromapVersionInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMicromapVersionInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMicromapVersionInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMicromapVersionInfoEXT(segment)
        );
    }

}