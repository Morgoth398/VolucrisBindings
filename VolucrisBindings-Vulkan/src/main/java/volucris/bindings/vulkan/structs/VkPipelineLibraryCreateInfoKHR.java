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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPipelineLibraryCreateInfoKHR
		implements Struct<VkPipelineLibraryCreateInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle LIBRARY_COUNT_HANDLE;
    public static final VarHandle P_LIBRARIES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long LIBRARY_COUNT_BYTE_OFFSET;
    public static final long P_LIBRARIES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("libraryCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pLibraries")
        ).withName("VkPipelineLibraryCreateInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        LIBRARY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("libraryCount"));
        P_LIBRARIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLibraries"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        LIBRARY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("libraryCount"));
        P_LIBRARIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLibraries"));
        //@formatter:on
    }

    public VkPipelineLibraryCreateInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkPipelineLibraryCreateInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPipelineLibraryCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPipelineLibraryCreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineLibraryCreateInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #libraryCount()
    public VkPipelineLibraryCreateInfoKHR libraryCount(int libraryCount) {
    	LIBRARY_COUNT_HANDLE.set(segment, 0L, libraryCount);
    	return this;
    }
    
    public int libraryCount() {
    	return (int) LIBRARY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pLibraries()
    public VkPipelineLibraryCreateInfoKHR pLibraries(NativePointerArray pLibraries) {
    	P_LIBRARIES_HANDLE.set(segment, 0L, pLibraries.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pLibraries() {
    	MemorySegment segment = (MemorySegment) P_LIBRARIES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    @Override
    public VkPipelineLibraryCreateInfoKHR set(VkPipelineLibraryCreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineLibraryCreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineLibraryCreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineLibraryCreateInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineLibraryCreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineLibraryCreateInfoKHR> array(Arena arena, VkPipelineLibraryCreateInfoKHR... structs) {
        NativeStructArray<VkPipelineLibraryCreateInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineLibraryCreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineLibraryCreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineLibraryCreateInfoKHR(segment)
        );
    }
    
}