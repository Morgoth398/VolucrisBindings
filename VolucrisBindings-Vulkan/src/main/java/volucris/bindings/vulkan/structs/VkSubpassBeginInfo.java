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

public final class VkSubpassBeginInfo
		implements Struct<VkSubpassBeginInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle CONTENTS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long CONTENTS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("contents"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkSubpassBeginInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        CONTENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("contents"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        CONTENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contents"));
        //@formatter:on
    }

    public VkSubpassBeginInfo() {
        this(Arena.ofAuto());
    }
    
    public VkSubpassBeginInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkSubpassBeginInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkSubpassBeginInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSubpassBeginInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #contents()
    public VkSubpassBeginInfo contents(int contents) {
    	CONTENTS_HANDLE.set(segment, 0L, contents);
    	return this;
    }
    
    public int contents() {
    	return (int) CONTENTS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSubpassBeginInfo set(VkSubpassBeginInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkSubpassBeginInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSubpassBeginInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSubpassBeginInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSubpassBeginInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSubpassBeginInfo> array(Arena arena, VkSubpassBeginInfo... structs) {
        NativeStructArray<VkSubpassBeginInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSubpassBeginInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSubpassBeginInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSubpassBeginInfo(segment)
        );
    }
    
}