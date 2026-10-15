/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkClusterAccelerationStructureInputInfoNV
		implements Struct<VkClusterAccelerationStructureInputInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAX_ACCELERATION_STRUCTURE_COUNT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle OP_TYPE_HANDLE;
	public static final VarHandle OP_MODE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAX_ACCELERATION_STRUCTURE_COUNT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long OP_TYPE_BYTE_OFFSET;
	public static final long OP_MODE_BYTE_OFFSET;
	public static final long OP_INPUT_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkClusterAccelerationStructureOpInputNV opInput;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("maxAccelerationStructureCount"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("opType"),
		    JAVA_INT.withName("opMode"),
		    VkClusterAccelerationStructureOpInputNV.LAYOUT.withName("opInput")
		).withName("VkClusterAccelerationStructureInputInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAX_ACCELERATION_STRUCTURE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxAccelerationStructureCount"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		OP_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("opType"));
		OP_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("opMode"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAX_ACCELERATION_STRUCTURE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxAccelerationStructureCount"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		OP_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("opType"));
		OP_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("opMode"));
		OP_INPUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("opInput"));
		//@formatter:on
	}

	public VkClusterAccelerationStructureInputInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkClusterAccelerationStructureInputInfoNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkClusterAccelerationStructureInputInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	    opInput = new VkClusterAccelerationStructureOpInputNV(segment.asSlice(OP_INPUT_BYTE_OFFSET, VkClusterAccelerationStructureOpInputNV.LAYOUT));
	}

    /// @see #sType()
    public VkClusterAccelerationStructureInputInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkClusterAccelerationStructureInputInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxAccelerationStructureCount()
    public VkClusterAccelerationStructureInputInfoNV maxAccelerationStructureCount(int maxAccelerationStructureCount) {
    	MAX_ACCELERATION_STRUCTURE_COUNT_HANDLE.set(segment, 0L, maxAccelerationStructureCount);
    	return this;
    }
    
    public int maxAccelerationStructureCount() {
    	return (int) MAX_ACCELERATION_STRUCTURE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VkClusterAccelerationStructureInputInfoNV flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #opType()
    public VkClusterAccelerationStructureInputInfoNV opType(int opType) {
    	OP_TYPE_HANDLE.set(segment, 0L, opType);
    	return this;
    }
    
    public int opType() {
    	return (int) OP_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #opMode()
    public VkClusterAccelerationStructureInputInfoNV opMode(int opMode) {
    	OP_MODE_HANDLE.set(segment, 0L, opMode);
    	return this;
    }
    
    public int opMode() {
    	return (int) OP_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #opInput()
    public VkClusterAccelerationStructureInputInfoNV opInput(Consumer<VkClusterAccelerationStructureOpInputNV> consumer) {
    	consumer.accept(opInput);
    	return this;
    }
    
    /// @see #opInput()
    public VkClusterAccelerationStructureInputInfoNV opInput(VkClusterAccelerationStructureOpInputNV other) {
    	opInput.set(other);
    	return this;
    }
    
    public VkClusterAccelerationStructureOpInputNV opInput() {
    	return opInput;
    }
    
    @Override
    public VkClusterAccelerationStructureInputInfoNV set(VkClusterAccelerationStructureInputInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkClusterAccelerationStructureInputInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkClusterAccelerationStructureInputInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureInputInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureInputInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureInputInfoNV> array(Arena arena, VkClusterAccelerationStructureInputInfoNV... structs) {
        NativeStructArray<VkClusterAccelerationStructureInputInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureInputInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureInputInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureInputInfoNV(segment)
        );
    }

}