/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkVideoSessionMemoryRequirementsKHR
		implements Struct<VkVideoSessionMemoryRequirementsKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MEMORY_BIND_INDEX_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MEMORY_BIND_INDEX_BYTE_OFFSET;
    public static final long MEMORY_REQUIREMENTS_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkMemoryRequirements memoryRequirements;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("memoryBindIndex"),
            MemoryLayout.paddingLayout(4),
            VkMemoryRequirements.LAYOUT.withName("memoryRequirements")
        ).withName("VkVideoSessionMemoryRequirementsKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MEMORY_BIND_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryBindIndex"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MEMORY_BIND_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryBindIndex"));
        MEMORY_REQUIREMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryRequirements"));
        //@formatter:on
    }

    public VkVideoSessionMemoryRequirementsKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoSessionMemoryRequirementsKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoSessionMemoryRequirementsKHR(MemorySegment segment) {
        this.segment = segment;
    
        memoryRequirements = new VkMemoryRequirements(segment.asSlice(MEMORY_REQUIREMENTS_BYTE_OFFSET, VkMemoryRequirements.LAYOUT));
    }

    /// @see #sType()
    public VkVideoSessionMemoryRequirementsKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoSessionMemoryRequirementsKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #memoryBindIndex()
    public VkVideoSessionMemoryRequirementsKHR memoryBindIndex(int memoryBindIndex) {
    	MEMORY_BIND_INDEX_HANDLE.set(segment, 0L, memoryBindIndex);
    	return this;
    }
    
    public int memoryBindIndex() {
    	return (int) MEMORY_BIND_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #memoryRequirements()
    public VkVideoSessionMemoryRequirementsKHR memoryRequirements(Consumer<VkMemoryRequirements> consumer) {
    	consumer.accept(memoryRequirements);
    	return this;
    }
    
    /// @see #memoryRequirements()
    public VkVideoSessionMemoryRequirementsKHR memoryRequirements(VkMemoryRequirements other) {
    	memoryRequirements.set(other);
    	return this;
    }
    
    public VkMemoryRequirements memoryRequirements() {
    	return memoryRequirements;
    }
    
    @Override
    public VkVideoSessionMemoryRequirementsKHR set(VkVideoSessionMemoryRequirementsKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoSessionMemoryRequirementsKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoSessionMemoryRequirementsKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoSessionMemoryRequirementsKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoSessionMemoryRequirementsKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoSessionMemoryRequirementsKHR> array(Arena arena, VkVideoSessionMemoryRequirementsKHR... structs) {
        NativeStructArray<VkVideoSessionMemoryRequirementsKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoSessionMemoryRequirementsKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoSessionMemoryRequirementsKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoSessionMemoryRequirementsKHR(segment)
        );
    }
    
}