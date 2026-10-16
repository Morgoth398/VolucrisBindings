/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaResourceManagerDataBufferNode
		implements Struct<MaResourceManagerDataBufferNode> {

	public static final StructLayout LAYOUT;

	public static final VarHandle HASHED_NAME32_HANDLE;
	public static final VarHandle REF_COUNT_HANDLE;
	public static final VarHandle RESULT_HANDLE;
	public static final VarHandle EXECUTION_COUNTER_HANDLE;
	public static final VarHandle EXECUTION_POINTER_HANDLE;
	public static final VarHandle IS_DATA_OWNED_BY_RESOURCE_MANAGER_HANDLE;
	public static final VarHandle P_PARENT_HANDLE;
	public static final VarHandle P_CHILD_LO_HANDLE;
	public static final VarHandle P_CHILD_HI_HANDLE;

	public static final long HASHED_NAME32_BYTE_OFFSET;
	public static final long REF_COUNT_BYTE_OFFSET;
	public static final long RESULT_BYTE_OFFSET;
	public static final long EXECUTION_COUNTER_BYTE_OFFSET;
	public static final long EXECUTION_POINTER_BYTE_OFFSET;
	public static final long IS_DATA_OWNED_BY_RESOURCE_MANAGER_BYTE_OFFSET;
	public static final long DATA_BYTE_OFFSET;
	public static final long P_PARENT_BYTE_OFFSET;
	public static final long P_CHILD_LO_BYTE_OFFSET;
	public static final long P_CHILD_HI_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaResourceManagerDataSupply data;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("hashedName32"),
		    JAVA_INT.withName("refCount"),
		    JAVA_INT.withName("result"),
		    JAVA_INT.withName("executionCounter"),
		    JAVA_INT.withName("executionPointer"),
		    JAVA_INT.withName("isDataOwnedByResourceManager"),
		    MaResourceManagerDataSupply.LAYOUT.withName("data"),
		    UNBOUNDED_ADDRESS.withName("pParent"),
		    UNBOUNDED_ADDRESS.withName("pChildLo"),
		    UNBOUNDED_ADDRESS.withName("pChildHi")
		).withName("ma_resource_manager_data_buffer_node").withByteAlignment(8);
		
		HASHED_NAME32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hashedName32"));
		REF_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("refCount"));
		RESULT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("result"));
		EXECUTION_COUNTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("executionCounter"));
		EXECUTION_POINTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("executionPointer"));
		IS_DATA_OWNED_BY_RESOURCE_MANAGER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isDataOwnedByResourceManager"));
		P_PARENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pParent"));
		P_CHILD_LO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pChildLo"));
		P_CHILD_HI_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pChildHi"));
		
		HASHED_NAME32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hashedName32"));
		REF_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("refCount"));
		RESULT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("result"));
		EXECUTION_COUNTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("executionCounter"));
		EXECUTION_POINTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("executionPointer"));
		IS_DATA_OWNED_BY_RESOURCE_MANAGER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isDataOwnedByResourceManager"));
		DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
		P_PARENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pParent"));
		P_CHILD_LO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pChildLo"));
		P_CHILD_HI_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pChildHi"));
		//@formatter:on
	}

	public MaResourceManagerDataBufferNode() {
	    this(Arena.ofAuto());
	}
	
	public MaResourceManagerDataBufferNode(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaResourceManagerDataBufferNode(MemorySegment segment) {
	    this.segment = segment;
	
	    data = new MaResourceManagerDataSupply(segment.asSlice(DATA_BYTE_OFFSET, MaResourceManagerDataSupply.LAYOUT));
	}

    /// @see #hashedName32()
    public MaResourceManagerDataBufferNode hashedName32(int hashedName32) {
    	HASHED_NAME32_HANDLE.set(segment, 0L, hashedName32);
    	return this;
    }
    
    public int hashedName32() {
    	return (int) HASHED_NAME32_HANDLE.get(segment, 0L);
    }
    
    /// @see #refCount()
    public MaResourceManagerDataBufferNode refCount(int refCount) {
    	REF_COUNT_HANDLE.set(segment, 0L, refCount);
    	return this;
    }
    
    public int refCount() {
    	return (int) REF_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #result()
    public MaResourceManagerDataBufferNode result(int result) {
    	RESULT_HANDLE.set(segment, 0L, result);
    	return this;
    }
    
    public int result() {
    	return (int) RESULT_HANDLE.get(segment, 0L);
    }
    
    /// @see #executionCounter()
    public MaResourceManagerDataBufferNode executionCounter(int executionCounter) {
    	EXECUTION_COUNTER_HANDLE.set(segment, 0L, executionCounter);
    	return this;
    }
    
    public int executionCounter() {
    	return (int) EXECUTION_COUNTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #executionPointer()
    public MaResourceManagerDataBufferNode executionPointer(int executionPointer) {
    	EXECUTION_POINTER_HANDLE.set(segment, 0L, executionPointer);
    	return this;
    }
    
    public int executionPointer() {
    	return (int) EXECUTION_POINTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #isDataOwnedByResourceManager()
    public MaResourceManagerDataBufferNode isDataOwnedByResourceManager(int isDataOwnedByResourceManager) {
    	IS_DATA_OWNED_BY_RESOURCE_MANAGER_HANDLE.set(segment, 0L, isDataOwnedByResourceManager);
    	return this;
    }
    
    public int isDataOwnedByResourceManager() {
    	return (int) IS_DATA_OWNED_BY_RESOURCE_MANAGER_HANDLE.get(segment, 0L);
    }
    
    /// @see #data()
    public MaResourceManagerDataBufferNode data(Consumer<MaResourceManagerDataSupply> consumer) {
    	consumer.accept(data);
    	return this;
    }
    
    /// @see #data()
    public MaResourceManagerDataBufferNode data(MaResourceManagerDataSupply other) {
    	data.set(other);
    	return this;
    }
    
    public MaResourceManagerDataSupply data() {
    	return data;
    }
    
    /// @see #pParent()
    public MaResourceManagerDataBufferNode pParent(MaResourceManagerDataBufferNode pParent) {
    	P_PARENT_HANDLE.set(segment, 0L, pParent.memorySegment());
    	return this;
    }
    
    public @Nullable MaResourceManagerDataBufferNode pParent() {
    	MemorySegment segment = (MemorySegment) P_PARENT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaResourceManagerDataBufferNode(segment);
    }
    
    /// @see #pChildLo()
    public MaResourceManagerDataBufferNode pChildLo(MaResourceManagerDataBufferNode pChildLo) {
    	P_CHILD_LO_HANDLE.set(segment, 0L, pChildLo.memorySegment());
    	return this;
    }
    
    public @Nullable MaResourceManagerDataBufferNode pChildLo() {
    	MemorySegment segment = (MemorySegment) P_CHILD_LO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaResourceManagerDataBufferNode(segment);
    }
    
    /// @see #pChildHi()
    public MaResourceManagerDataBufferNode pChildHi(MaResourceManagerDataBufferNode pChildHi) {
    	P_CHILD_HI_HANDLE.set(segment, 0L, pChildHi.memorySegment());
    	return this;
    }
    
    public @Nullable MaResourceManagerDataBufferNode pChildHi() {
    	MemorySegment segment = (MemorySegment) P_CHILD_HI_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaResourceManagerDataBufferNode(segment);
    }
    
    @Override
    public MaResourceManagerDataBufferNode set(MaResourceManagerDataBufferNode other) {
        return set(other.segment);
    }
    
    @Override
    public MaResourceManagerDataBufferNode set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaResourceManagerDataBufferNode> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaResourceManagerDataBufferNode> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResourceManagerDataBufferNode(segment),
            count
        );
    }
    
    public static NativeStructArray<MaResourceManagerDataBufferNode> array(Arena arena, MaResourceManagerDataBufferNode... structs) {
        NativeStructArray<MaResourceManagerDataBufferNode> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResourceManagerDataBufferNode(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaResourceManagerDataBufferNode> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaResourceManagerDataBufferNode(segment)
        );
    }

}