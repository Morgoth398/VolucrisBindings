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

public final class VkPhysicalDeviceInlineUniformBlockFeatures
		implements Struct<VkPhysicalDeviceInlineUniformBlockFeatures> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle INLINE_UNIFORM_BLOCK_HANDLE;
    public static final VarHandle DESCRIPTOR_BINDING_INLINE_UNIFORM_BLOCK_UPDATE_AFTER_BIND_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long INLINE_UNIFORM_BLOCK_BYTE_OFFSET;
    public static final long DESCRIPTOR_BINDING_INLINE_UNIFORM_BLOCK_UPDATE_AFTER_BIND_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("inlineUniformBlock"),
            JAVA_INT.withName("descriptorBindingInlineUniformBlockUpdateAfterBind")
        ).withName("VkPhysicalDeviceInlineUniformBlockFeatures").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        INLINE_UNIFORM_BLOCK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inlineUniformBlock"));
        DESCRIPTOR_BINDING_INLINE_UNIFORM_BLOCK_UPDATE_AFTER_BIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        INLINE_UNIFORM_BLOCK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inlineUniformBlock"));
        DESCRIPTOR_BINDING_INLINE_UNIFORM_BLOCK_UPDATE_AFTER_BIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind"));
        //@formatter:on
    }

    public VkPhysicalDeviceInlineUniformBlockFeatures() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceInlineUniformBlockFeatures(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceInlineUniformBlockFeatures(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceInlineUniformBlockFeatures sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceInlineUniformBlockFeatures pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #inlineUniformBlock()
    public VkPhysicalDeviceInlineUniformBlockFeatures inlineUniformBlock(int inlineUniformBlock) {
    	INLINE_UNIFORM_BLOCK_HANDLE.set(segment, 0L, inlineUniformBlock);
    	return this;
    }
    
    public int inlineUniformBlock() {
    	return (int) INLINE_UNIFORM_BLOCK_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingInlineUniformBlockUpdateAfterBind()
    public VkPhysicalDeviceInlineUniformBlockFeatures descriptorBindingInlineUniformBlockUpdateAfterBind(int descriptorBindingInlineUniformBlockUpdateAfterBind) {
    	DESCRIPTOR_BINDING_INLINE_UNIFORM_BLOCK_UPDATE_AFTER_BIND_HANDLE.set(segment, 0L, descriptorBindingInlineUniformBlockUpdateAfterBind);
    	return this;
    }
    
    public int descriptorBindingInlineUniformBlockUpdateAfterBind() {
    	return (int) DESCRIPTOR_BINDING_INLINE_UNIFORM_BLOCK_UPDATE_AFTER_BIND_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceInlineUniformBlockFeatures set(VkPhysicalDeviceInlineUniformBlockFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceInlineUniformBlockFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceInlineUniformBlockFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceInlineUniformBlockFeatures> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceInlineUniformBlockFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceInlineUniformBlockFeatures> array(Arena arena, VkPhysicalDeviceInlineUniformBlockFeatures... structs) {
        NativeStructArray<VkPhysicalDeviceInlineUniformBlockFeatures> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceInlineUniformBlockFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceInlineUniformBlockFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceInlineUniformBlockFeatures(segment)
        );
    }
    
}