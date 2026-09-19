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

public final class VkProtectedSubmitInfo
		implements Struct<VkProtectedSubmitInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PROTECTED_SUBMIT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PROTECTED_SUBMIT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("protectedSubmit"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkProtectedSubmitInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PROTECTED_SUBMIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("protectedSubmit"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PROTECTED_SUBMIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("protectedSubmit"));
        //@formatter:on
    }

    public VkProtectedSubmitInfo() {
        this(Arena.ofAuto());
    }
    
    public VkProtectedSubmitInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkProtectedSubmitInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkProtectedSubmitInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkProtectedSubmitInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #protectedSubmit()
    public VkProtectedSubmitInfo protectedSubmit(int protectedSubmit) {
    	PROTECTED_SUBMIT_HANDLE.set(segment, 0L, protectedSubmit);
    	return this;
    }
    
    public int protectedSubmit() {
    	return (int) PROTECTED_SUBMIT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkProtectedSubmitInfo set(VkProtectedSubmitInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkProtectedSubmitInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkProtectedSubmitInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkProtectedSubmitInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkProtectedSubmitInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkProtectedSubmitInfo> array(Arena arena, VkProtectedSubmitInfo... structs) {
        NativeStructArray<VkProtectedSubmitInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkProtectedSubmitInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkProtectedSubmitInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkProtectedSubmitInfo(segment)
        );
    }
    
}