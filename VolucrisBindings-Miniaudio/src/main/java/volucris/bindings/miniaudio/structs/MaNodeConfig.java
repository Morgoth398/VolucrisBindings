/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaNodeConfig
		implements Struct<MaNodeConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle VTABLE_HANDLE;
	public static final VarHandle INITIAL_STATE_HANDLE;
	public static final VarHandle INPUT_BUS_COUNT_HANDLE;
	public static final VarHandle OUTPUT_BUS_COUNT_HANDLE;
	public static final VarHandle P_INPUT_CHANNELS_HANDLE;
	public static final VarHandle P_OUTPUT_CHANNELS_HANDLE;

	public static final long VTABLE_BYTE_OFFSET;
	public static final long INITIAL_STATE_BYTE_OFFSET;
	public static final long INPUT_BUS_COUNT_BYTE_OFFSET;
	public static final long OUTPUT_BUS_COUNT_BYTE_OFFSET;
	public static final long P_INPUT_CHANNELS_BYTE_OFFSET;
	public static final long P_OUTPUT_CHANNELS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("vtable"),
		    JAVA_INT.withName("initialState"),
		    JAVA_INT.withName("inputBusCount"),
		    JAVA_INT.withName("outputBusCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pInputChannels"),
		    UNBOUNDED_ADDRESS.withName("pOutputChannels")
		).withName("ma_node_config").withByteAlignment(8);
		
		VTABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vtable"));
		INITIAL_STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("initialState"));
		INPUT_BUS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inputBusCount"));
		OUTPUT_BUS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("outputBusCount"));
		P_INPUT_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pInputChannels"));
		P_OUTPUT_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pOutputChannels"));
		
		VTABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vtable"));
		INITIAL_STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("initialState"));
		INPUT_BUS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inputBusCount"));
		OUTPUT_BUS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("outputBusCount"));
		P_INPUT_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pInputChannels"));
		P_OUTPUT_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pOutputChannels"));
		//@formatter:on
	}

	public MaNodeConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaNodeConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaNodeConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #vtable()
    public MaNodeConfig vtable(MaNodeVtable vtable) {
    	VTABLE_HANDLE.set(segment, 0L, vtable.memorySegment());
    	return this;
    }
    
    public @Nullable MaNodeVtable vtable() {
    	MemorySegment segment = (MemorySegment) VTABLE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaNodeVtable(segment);
    }
    
    /// @see #initialState()
    public MaNodeConfig initialState(int initialState) {
    	INITIAL_STATE_HANDLE.set(segment, 0L, initialState);
    	return this;
    }
    
    public int initialState() {
    	return (int) INITIAL_STATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #inputBusCount()
    public MaNodeConfig inputBusCount(int inputBusCount) {
    	INPUT_BUS_COUNT_HANDLE.set(segment, 0L, inputBusCount);
    	return this;
    }
    
    public int inputBusCount() {
    	return (int) INPUT_BUS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #outputBusCount()
    public MaNodeConfig outputBusCount(int outputBusCount) {
    	OUTPUT_BUS_COUNT_HANDLE.set(segment, 0L, outputBusCount);
    	return this;
    }
    
    public int outputBusCount() {
    	return (int) OUTPUT_BUS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pInputChannels()
    public MaNodeConfig pInputChannels(NativeIntArray pInputChannels) {
    	P_INPUT_CHANNELS_HANDLE.set(segment, 0L, pInputChannels.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pInputChannels() {
    	MemorySegment segment = (MemorySegment) P_INPUT_CHANNELS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #pOutputChannels()
    public MaNodeConfig pOutputChannels(NativeIntArray pOutputChannels) {
    	P_OUTPUT_CHANNELS_HANDLE.set(segment, 0L, pOutputChannels.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pOutputChannels() {
    	MemorySegment segment = (MemorySegment) P_OUTPUT_CHANNELS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public MaNodeConfig set(MaNodeConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaNodeConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaNodeConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaNodeConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaNodeConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaNodeConfig> array(Arena arena, MaNodeConfig... structs) {
        NativeStructArray<MaNodeConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaNodeConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaNodeConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaNodeConfig(segment)
        );
    }

}