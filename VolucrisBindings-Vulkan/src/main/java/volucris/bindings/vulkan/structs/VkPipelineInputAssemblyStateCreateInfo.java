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

public final class VkPipelineInputAssemblyStateCreateInfo
		implements Struct<VkPipelineInputAssemblyStateCreateInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle TOPOLOGY_HANDLE;
    public static final VarHandle PRIMITIVE_RESTART_ENABLE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long TOPOLOGY_BYTE_OFFSET;
    public static final long PRIMITIVE_RESTART_ENABLE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            JAVA_INT.withName("topology"),
            JAVA_INT.withName("primitiveRestartEnable"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPipelineInputAssemblyStateCreateInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        TOPOLOGY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("topology"));
        PRIMITIVE_RESTART_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("primitiveRestartEnable"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        TOPOLOGY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("topology"));
        PRIMITIVE_RESTART_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("primitiveRestartEnable"));
        //@formatter:on
    }

    public VkPipelineInputAssemblyStateCreateInfo() {
        this(Arena.ofAuto());
    }
    
    public VkPipelineInputAssemblyStateCreateInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPipelineInputAssemblyStateCreateInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPipelineInputAssemblyStateCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineInputAssemblyStateCreateInfo pNext(MemorySegment pNext) {
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
    public VkPipelineInputAssemblyStateCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #topology()
    public VkPipelineInputAssemblyStateCreateInfo topology(int topology) {
    	TOPOLOGY_HANDLE.set(segment, 0L, topology);
    	return this;
    }
    
    public int topology() {
    	return (int) TOPOLOGY_HANDLE.get(segment, 0L);
    }
    
    /// @see #primitiveRestartEnable()
    public VkPipelineInputAssemblyStateCreateInfo primitiveRestartEnable(int primitiveRestartEnable) {
    	PRIMITIVE_RESTART_ENABLE_HANDLE.set(segment, 0L, primitiveRestartEnable);
    	return this;
    }
    
    public int primitiveRestartEnable() {
    	return (int) PRIMITIVE_RESTART_ENABLE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPipelineInputAssemblyStateCreateInfo set(VkPipelineInputAssemblyStateCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineInputAssemblyStateCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineInputAssemblyStateCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineInputAssemblyStateCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineInputAssemblyStateCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineInputAssemblyStateCreateInfo> array(Arena arena, VkPipelineInputAssemblyStateCreateInfo... structs) {
        NativeStructArray<VkPipelineInputAssemblyStateCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineInputAssemblyStateCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineInputAssemblyStateCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineInputAssemblyStateCreateInfo(segment)
        );
    }
    
}