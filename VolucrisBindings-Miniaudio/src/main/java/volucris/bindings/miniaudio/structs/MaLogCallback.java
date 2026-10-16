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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.miniaudio.callbacks.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaLogCallback
		implements Struct<MaLogCallback> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ON_LOG_HANDLE;
	public static final VarHandle P_USER_DATA_HANDLE;

	public static final long ON_LOG_BYTE_OFFSET;
	public static final long P_USER_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("onLog"),
		    UNBOUNDED_ADDRESS.withName("pUserData")
		).withName("ma_log_callback").withByteAlignment(8);
		
		ON_LOG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onLog"));
		P_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUserData"));
		
		ON_LOG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onLog"));
		P_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
		//@formatter:on
	}

	public MaLogCallback() {
	    this(Arena.ofAuto());
	}
	
	public MaLogCallback(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaLogCallback(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #onLog()
    public MaLogCallback onLog(MaLogCallbackProc onLog) {
    	ON_LOG_HANDLE.set(segment, 0L, onLog.memorySegment());
    	return this;
    }
    
    public @Nullable MaLogCallbackProc onLog() {
    	MemorySegment segment = (MemorySegment) ON_LOG_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaLogCallbackProc.get(segment);
    }
    
    /// @see #pUserData()
    public MaLogCallback pUserData(MemorySegment pUserData) {
    	P_USER_DATA_HANDLE.set(segment, 0L, pUserData);
    	return this;
    }
    
    public @Nullable MemorySegment pUserData() {
    	MemorySegment segment = (MemorySegment) P_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public MaLogCallback set(MaLogCallback other) {
        return set(other.segment);
    }
    
    @Override
    public MaLogCallback set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaLogCallback> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaLogCallback> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaLogCallback(segment),
            count
        );
    }
    
    public static NativeStructArray<MaLogCallback> array(Arena arena, MaLogCallback... structs) {
        NativeStructArray<MaLogCallback> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaLogCallback(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaLogCallback> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaLogCallback(segment)
        );
    }

}