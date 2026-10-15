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

public final class VkDescriptorSetLayoutCreateInfo
		implements Struct<VkDescriptorSetLayoutCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle BINDING_COUNT_HANDLE;
	public static final VarHandle P_BINDINGS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long BINDING_COUNT_BYTE_OFFSET;
	public static final long P_BINDINGS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("bindingCount"),
		    UNBOUNDED_ADDRESS.withName("pBindings")
		).withName("VkDescriptorSetLayoutCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		BINDING_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bindingCount"));
		P_BINDINGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBindings"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		BINDING_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bindingCount"));
		P_BINDINGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBindings"));
		//@formatter:on
	}

	public VkDescriptorSetLayoutCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkDescriptorSetLayoutCreateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDescriptorSetLayoutCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDescriptorSetLayoutCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDescriptorSetLayoutCreateInfo pNext(MemorySegment pNext) {
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
    public VkDescriptorSetLayoutCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #bindingCount()
    public VkDescriptorSetLayoutCreateInfo bindingCount(int bindingCount) {
    	BINDING_COUNT_HANDLE.set(segment, 0L, bindingCount);
    	return this;
    }
    
    public int bindingCount() {
    	return (int) BINDING_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pBindings()
    public VkDescriptorSetLayoutCreateInfo pBindings(NativeStructArray<VkDescriptorSetLayoutBinding> pBindings) {
    	P_BINDINGS_HANDLE.set(segment, 0L, pBindings.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkDescriptorSetLayoutBinding> pBindings() {
    	MemorySegment segment = (MemorySegment) P_BINDINGS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkDescriptorSetLayoutBinding.array(segment);
    }
    
    @Override
    public VkDescriptorSetLayoutCreateInfo set(VkDescriptorSetLayoutCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorSetLayoutCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorSetLayoutCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorSetLayoutCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorSetLayoutCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorSetLayoutCreateInfo> array(Arena arena, VkDescriptorSetLayoutCreateInfo... structs) {
        NativeStructArray<VkDescriptorSetLayoutCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorSetLayoutCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorSetLayoutCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorSetLayoutCreateInfo(segment)
        );
    }

}