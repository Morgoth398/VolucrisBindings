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

public final class VkVideoProfileListInfoKHR
		implements Struct<VkVideoProfileListInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PROFILE_COUNT_HANDLE;
    public static final VarHandle P_PROFILES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PROFILE_COUNT_BYTE_OFFSET;
    public static final long P_PROFILES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("profileCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pProfiles")
        ).withName("VkVideoProfileListInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PROFILE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("profileCount"));
        P_PROFILES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pProfiles"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PROFILE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("profileCount"));
        P_PROFILES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pProfiles"));
        //@formatter:on
    }

    public VkVideoProfileListInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoProfileListInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoProfileListInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkVideoProfileListInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoProfileListInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #profileCount()
    public VkVideoProfileListInfoKHR profileCount(int profileCount) {
    	PROFILE_COUNT_HANDLE.set(segment, 0L, profileCount);
    	return this;
    }
    
    public int profileCount() {
    	return (int) PROFILE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pProfiles()
    public VkVideoProfileListInfoKHR pProfiles(NativeStructArray<VkVideoProfileInfoKHR> pProfiles) {
    	P_PROFILES_HANDLE.set(segment, 0L, pProfiles.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkVideoProfileInfoKHR> pProfiles() {
    	MemorySegment segment = (MemorySegment) P_PROFILES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkVideoProfileInfoKHR.array(segment);
    }
    
    @Override
    public VkVideoProfileListInfoKHR set(VkVideoProfileListInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoProfileListInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoProfileListInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoProfileListInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoProfileListInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoProfileListInfoKHR> array(Arena arena, VkVideoProfileListInfoKHR... structs) {
        NativeStructArray<VkVideoProfileListInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoProfileListInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoProfileListInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoProfileListInfoKHR(segment)
        );
    }
    
}