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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkSwapchainTimeDomainPropertiesEXT
		implements Struct<VkSwapchainTimeDomainPropertiesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle TIME_DOMAIN_COUNT_HANDLE;
    public static final VarHandle P_TIME_DOMAINS_HANDLE;
    public static final VarHandle P_TIME_DOMAIN_IDS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long TIME_DOMAIN_COUNT_BYTE_OFFSET;
    public static final long P_TIME_DOMAINS_BYTE_OFFSET;
    public static final long P_TIME_DOMAIN_IDS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("timeDomainCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pTimeDomains"),
            UNBOUNDED_ADDRESS.withName("pTimeDomainIds")
        ).withName("VkSwapchainTimeDomainPropertiesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        TIME_DOMAIN_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("timeDomainCount"));
        P_TIME_DOMAINS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTimeDomains"));
        P_TIME_DOMAIN_IDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTimeDomainIds"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        TIME_DOMAIN_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("timeDomainCount"));
        P_TIME_DOMAINS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTimeDomains"));
        P_TIME_DOMAIN_IDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTimeDomainIds"));
        //@formatter:on
    }

    public VkSwapchainTimeDomainPropertiesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkSwapchainTimeDomainPropertiesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkSwapchainTimeDomainPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkSwapchainTimeDomainPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSwapchainTimeDomainPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #timeDomainCount()
    public VkSwapchainTimeDomainPropertiesEXT timeDomainCount(int timeDomainCount) {
    	TIME_DOMAIN_COUNT_HANDLE.set(segment, 0L, timeDomainCount);
    	return this;
    }
    
    public int timeDomainCount() {
    	return (int) TIME_DOMAIN_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pTimeDomains()
    public VkSwapchainTimeDomainPropertiesEXT pTimeDomains(NativeIntArray pTimeDomains) {
    	P_TIME_DOMAINS_HANDLE.set(segment, 0L, pTimeDomains.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pTimeDomains() {
    	MemorySegment segment = (MemorySegment) P_TIME_DOMAINS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #pTimeDomainIds()
    public VkSwapchainTimeDomainPropertiesEXT pTimeDomainIds(NativeLongArray pTimeDomainIds) {
    	P_TIME_DOMAIN_IDS_HANDLE.set(segment, 0L, pTimeDomainIds.memorySegment());
    	return this;
    }
    
    public @Nullable NativeLongArray pTimeDomainIds() {
    	MemorySegment segment = (MemorySegment) P_TIME_DOMAIN_IDS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeLongArray(segment);
    }
    
    @Override
    public VkSwapchainTimeDomainPropertiesEXT set(VkSwapchainTimeDomainPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkSwapchainTimeDomainPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSwapchainTimeDomainPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSwapchainTimeDomainPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSwapchainTimeDomainPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSwapchainTimeDomainPropertiesEXT> array(Arena arena, VkSwapchainTimeDomainPropertiesEXT... structs) {
        NativeStructArray<VkSwapchainTimeDomainPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSwapchainTimeDomainPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSwapchainTimeDomainPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSwapchainTimeDomainPropertiesEXT(segment)
        );
    }
    
}