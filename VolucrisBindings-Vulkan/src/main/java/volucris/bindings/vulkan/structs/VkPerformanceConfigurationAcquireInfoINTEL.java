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

public final class VkPerformanceConfigurationAcquireInfoINTEL
		implements Struct<VkPerformanceConfigurationAcquireInfoINTEL> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle TYPE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long TYPE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPerformanceConfigurationAcquireInfoINTEL").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
        //@formatter:on
    }

    public VkPerformanceConfigurationAcquireInfoINTEL() {
        this(Arena.ofAuto());
    }
    
    public VkPerformanceConfigurationAcquireInfoINTEL(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPerformanceConfigurationAcquireInfoINTEL(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPerformanceConfigurationAcquireInfoINTEL sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPerformanceConfigurationAcquireInfoINTEL pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #type()
    public VkPerformanceConfigurationAcquireInfoINTEL type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPerformanceConfigurationAcquireInfoINTEL set(VkPerformanceConfigurationAcquireInfoINTEL other) {
        return set(other.segment);
    }
    
    @Override
    public VkPerformanceConfigurationAcquireInfoINTEL set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPerformanceConfigurationAcquireInfoINTEL> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPerformanceConfigurationAcquireInfoINTEL> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPerformanceConfigurationAcquireInfoINTEL(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPerformanceConfigurationAcquireInfoINTEL> array(Arena arena, VkPerformanceConfigurationAcquireInfoINTEL... structs) {
        NativeStructArray<VkPerformanceConfigurationAcquireInfoINTEL> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPerformanceConfigurationAcquireInfoINTEL(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPerformanceConfigurationAcquireInfoINTEL> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPerformanceConfigurationAcquireInfoINTEL(segment)
        );
    }
    
}