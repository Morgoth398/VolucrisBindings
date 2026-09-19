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

public final class VkPushConstantsInfo
		implements Struct<VkPushConstantsInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle LAYOUT_HANDLE;
    public static final VarHandle STAGE_FLAGS_HANDLE;
    public static final VarHandle OFFSET_HANDLE;
    public static final VarHandle SIZE_HANDLE;
    public static final VarHandle P_VALUES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long LAYOUT_BYTE_OFFSET;
    public static final long STAGE_FLAGS_BYTE_OFFSET;
    public static final long OFFSET_BYTE_OFFSET;
    public static final long SIZE_BYTE_OFFSET;
    public static final long P_VALUES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("layout"),
            JAVA_INT.withName("stageFlags"),
            JAVA_INT.withName("offset"),
            JAVA_INT.withName("size"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pValues")
        ).withName("VkPushConstantsInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layout"));
        STAGE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stageFlags"));
        OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
        SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
        P_VALUES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pValues"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layout"));
        STAGE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stageFlags"));
        OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
        SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
        P_VALUES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pValues"));
        //@formatter:on
    }

    public VkPushConstantsInfo() {
        this(Arena.ofAuto());
    }
    
    public VkPushConstantsInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPushConstantsInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPushConstantsInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPushConstantsInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #layout()
    public VkPushConstantsInfo layout(VkPipelineLayout layout) {
    	LAYOUT_HANDLE.set(segment, 0L, layout.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineLayout layout() {
    	MemorySegment segment = (MemorySegment) LAYOUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineLayout(segment);
    }
    
    /// @see #stageFlags()
    public VkPushConstantsInfo stageFlags(int stageFlags) {
    	STAGE_FLAGS_HANDLE.set(segment, 0L, stageFlags);
    	return this;
    }
    
    public int stageFlags() {
    	return (int) STAGE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #offset()
    public VkPushConstantsInfo offset(int offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public int offset() {
    	return (int) OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkPushConstantsInfo size(int size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public int size() {
    	return (int) SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pValues()
    public VkPushConstantsInfo pValues(MemorySegment pValues) {
    	P_VALUES_HANDLE.set(segment, 0L, pValues);
    	return this;
    }
    
    public @Nullable MemorySegment pValues() {
    	MemorySegment segment = (MemorySegment) P_VALUES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VkPushConstantsInfo set(VkPushConstantsInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkPushConstantsInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPushConstantsInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPushConstantsInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPushConstantsInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPushConstantsInfo> array(Arena arena, VkPushConstantsInfo... structs) {
        NativeStructArray<VkPushConstantsInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPushConstantsInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPushConstantsInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPushConstantsInfo(segment)
        );
    }
    
}