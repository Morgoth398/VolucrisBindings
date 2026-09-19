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

public final class VkMultisamplePropertiesEXT
		implements Struct<VkMultisamplePropertiesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_SAMPLE_LOCATION_GRID_SIZE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkExtent2D maxSampleLocationGridSize;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkExtent2D.LAYOUT.withName("maxSampleLocationGridSize")
        ).withName("VkMultisamplePropertiesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_SAMPLE_LOCATION_GRID_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSampleLocationGridSize"));
        //@formatter:on
    }

    public VkMultisamplePropertiesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkMultisamplePropertiesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkMultisamplePropertiesEXT(MemorySegment segment) {
        this.segment = segment;
    
        maxSampleLocationGridSize = new VkExtent2D(segment.asSlice(MAX_SAMPLE_LOCATION_GRID_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
    }

    /// @see #sType()
    public VkMultisamplePropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkMultisamplePropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxSampleLocationGridSize()
    public VkMultisamplePropertiesEXT maxSampleLocationGridSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxSampleLocationGridSize);
    	return this;
    }
    
    /// @see #maxSampleLocationGridSize()
    public VkMultisamplePropertiesEXT maxSampleLocationGridSize(VkExtent2D other) {
    	maxSampleLocationGridSize.set(other);
    	return this;
    }
    
    public VkExtent2D maxSampleLocationGridSize() {
    	return maxSampleLocationGridSize;
    }
    
    @Override
    public VkMultisamplePropertiesEXT set(VkMultisamplePropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkMultisamplePropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMultisamplePropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMultisamplePropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMultisamplePropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMultisamplePropertiesEXT> array(Arena arena, VkMultisamplePropertiesEXT... structs) {
        NativeStructArray<VkMultisamplePropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMultisamplePropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMultisamplePropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMultisamplePropertiesEXT(segment)
        );
    }
    
}