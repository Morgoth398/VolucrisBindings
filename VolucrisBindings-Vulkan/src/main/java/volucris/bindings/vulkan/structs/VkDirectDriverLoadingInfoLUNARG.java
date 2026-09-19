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

public final class VkDirectDriverLoadingInfoLUNARG
		implements Struct<VkDirectDriverLoadingInfoLUNARG> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle PFN_GET_INSTANCE_PROC_ADDR_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long PFN_GET_INSTANCE_PROC_ADDR_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pfnGetInstanceProcAddr")
        ).withName("VkDirectDriverLoadingInfoLUNARG").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        PFN_GET_INSTANCE_PROC_ADDR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pfnGetInstanceProcAddr"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        PFN_GET_INSTANCE_PROC_ADDR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pfnGetInstanceProcAddr"));
        //@formatter:on
    }

    public VkDirectDriverLoadingInfoLUNARG() {
        this(Arena.ofAuto());
    }
    
    public VkDirectDriverLoadingInfoLUNARG(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDirectDriverLoadingInfoLUNARG(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDirectDriverLoadingInfoLUNARG sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDirectDriverLoadingInfoLUNARG pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkDirectDriverLoadingInfoLUNARG flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pfnGetInstanceProcAddr()
    public VkDirectDriverLoadingInfoLUNARG pfnGetInstanceProcAddr(VkGetInstanceProcAddrLUNARG pfnGetInstanceProcAddr) {
    	PFN_GET_INSTANCE_PROC_ADDR_HANDLE.set(segment, 0L, pfnGetInstanceProcAddr.memorySegment());
    	return this;
    }
    
    public @Nullable VkGetInstanceProcAddrLUNARG pfnGetInstanceProcAddr() {
    	MemorySegment segment = (MemorySegment) PFN_GET_INSTANCE_PROC_ADDR_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return VkGetInstanceProcAddrLUNARG.get(segment);
    }
    
    @Override
    public VkDirectDriverLoadingInfoLUNARG set(VkDirectDriverLoadingInfoLUNARG other) {
        return set(other.segment);
    }
    
    @Override
    public VkDirectDriverLoadingInfoLUNARG set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDirectDriverLoadingInfoLUNARG> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDirectDriverLoadingInfoLUNARG> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDirectDriverLoadingInfoLUNARG(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDirectDriverLoadingInfoLUNARG> array(Arena arena, VkDirectDriverLoadingInfoLUNARG... structs) {
        NativeStructArray<VkDirectDriverLoadingInfoLUNARG> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDirectDriverLoadingInfoLUNARG(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDirectDriverLoadingInfoLUNARG> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDirectDriverLoadingInfoLUNARG(segment)
        );
    }
    
}