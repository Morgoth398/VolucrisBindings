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

public final class VkPhysicalDeviceSynchronization2Features
		implements Struct<VkPhysicalDeviceSynchronization2Features> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SYNCHRONIZATION2_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SYNCHRONIZATION2_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("synchronization2"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceSynchronization2Features").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SYNCHRONIZATION2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("synchronization2"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SYNCHRONIZATION2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("synchronization2"));
        //@formatter:on
    }

    public VkPhysicalDeviceSynchronization2Features() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceSynchronization2Features(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceSynchronization2Features(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceSynchronization2Features sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceSynchronization2Features pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #synchronization2()
    public VkPhysicalDeviceSynchronization2Features synchronization2(int synchronization2) {
    	SYNCHRONIZATION2_HANDLE.set(segment, 0L, synchronization2);
    	return this;
    }
    
    public int synchronization2() {
    	return (int) SYNCHRONIZATION2_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceSynchronization2Features set(VkPhysicalDeviceSynchronization2Features other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceSynchronization2Features set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceSynchronization2Features> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceSynchronization2Features> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceSynchronization2Features(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceSynchronization2Features> array(Arena arena, VkPhysicalDeviceSynchronization2Features... structs) {
        NativeStructArray<VkPhysicalDeviceSynchronization2Features> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceSynchronization2Features(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceSynchronization2Features> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceSynchronization2Features(segment)
        );
    }
    
}