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

public final class VkImageViewMinLodCreateInfoEXT
		implements Struct<VkImageViewMinLodCreateInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MIN_LOD_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MIN_LOD_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_FLOAT.withName("minLod"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkImageViewMinLodCreateInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MIN_LOD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minLod"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MIN_LOD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minLod"));
        //@formatter:on
    }

    public VkImageViewMinLodCreateInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkImageViewMinLodCreateInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkImageViewMinLodCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkImageViewMinLodCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImageViewMinLodCreateInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #minLod()
    public VkImageViewMinLodCreateInfoEXT minLod(float minLod) {
    	MIN_LOD_HANDLE.set(segment, 0L, minLod);
    	return this;
    }
    
    public float minLod() {
    	return (float) MIN_LOD_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkImageViewMinLodCreateInfoEXT set(VkImageViewMinLodCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageViewMinLodCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageViewMinLodCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageViewMinLodCreateInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageViewMinLodCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageViewMinLodCreateInfoEXT> array(Arena arena, VkImageViewMinLodCreateInfoEXT... structs) {
        NativeStructArray<VkImageViewMinLodCreateInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageViewMinLodCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageViewMinLodCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageViewMinLodCreateInfoEXT(segment)
        );
    }
    
}