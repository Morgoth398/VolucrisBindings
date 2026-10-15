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

public final class VkPerformanceCounterKHR
		implements Struct<VkPerformanceCounterKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle UNIT_HANDLE;
	public static final VarHandle SCOPE_HANDLE;
	public static final VarHandle STORAGE_HANDLE;
	public static final VarHandle UUID_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long UNIT_BYTE_OFFSET;
	public static final long SCOPE_BYTE_OFFSET;
	public static final long STORAGE_BYTE_OFFSET;
	public static final long UUID_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("unit"),
		    JAVA_INT.withName("scope"),
		    JAVA_INT.withName("storage"),
		    MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("uuid"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPerformanceCounterKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		UNIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("unit"));
		SCOPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("scope"));
		STORAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storage"));
		UUID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("uuid"), PathElement.sequenceElement());
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		UNIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("unit"));
		SCOPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("scope"));
		STORAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storage"));
		UUID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("uuid"));
		//@formatter:on
	}

	public VkPerformanceCounterKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPerformanceCounterKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPerformanceCounterKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPerformanceCounterKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPerformanceCounterKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #unit()
    public VkPerformanceCounterKHR unit(int unit) {
    	UNIT_HANDLE.set(segment, 0L, unit);
    	return this;
    }
    
    public int unit() {
    	return (int) UNIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #scope()
    public VkPerformanceCounterKHR scope(int scope) {
    	SCOPE_HANDLE.set(segment, 0L, scope);
    	return this;
    }
    
    public int scope() {
    	return (int) SCOPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #storage()
    public VkPerformanceCounterKHR storage(int storage) {
    	STORAGE_HANDLE.set(segment, 0L, storage);
    	return this;
    }
    
    public int storage() {
    	return (int) STORAGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #uuid(int)
    public VkPerformanceCounterKHR uuid(byte uuid, int index0) {
    	UUID_HANDLE.set(segment, 0L, index0, uuid);
    	return this;
    }
    
    public byte uuid(int index0) {
    	return (byte) UUID_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public VkPerformanceCounterKHR set(VkPerformanceCounterKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPerformanceCounterKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPerformanceCounterKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPerformanceCounterKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPerformanceCounterKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPerformanceCounterKHR> array(Arena arena, VkPerformanceCounterKHR... structs) {
        NativeStructArray<VkPerformanceCounterKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPerformanceCounterKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPerformanceCounterKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPerformanceCounterKHR(segment)
        );
    }

}