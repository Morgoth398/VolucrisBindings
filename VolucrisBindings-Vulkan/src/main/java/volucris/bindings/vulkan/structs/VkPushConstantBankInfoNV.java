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

public final class VkPushConstantBankInfoNV
		implements Struct<VkPushConstantBankInfoNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle BANK_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long BANK_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("bank"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPushConstantBankInfoNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        BANK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bank"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        BANK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bank"));
        //@formatter:on
    }

    public VkPushConstantBankInfoNV() {
        this(Arena.ofAuto());
    }
    
    public VkPushConstantBankInfoNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPushConstantBankInfoNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPushConstantBankInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPushConstantBankInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #bank()
    public VkPushConstantBankInfoNV bank(int bank) {
    	BANK_HANDLE.set(segment, 0L, bank);
    	return this;
    }
    
    public int bank() {
    	return (int) BANK_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPushConstantBankInfoNV set(VkPushConstantBankInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPushConstantBankInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPushConstantBankInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPushConstantBankInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPushConstantBankInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPushConstantBankInfoNV> array(Arena arena, VkPushConstantBankInfoNV... structs) {
        NativeStructArray<VkPushConstantBankInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPushConstantBankInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPushConstantBankInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPushConstantBankInfoNV(segment)
        );
    }
    
}