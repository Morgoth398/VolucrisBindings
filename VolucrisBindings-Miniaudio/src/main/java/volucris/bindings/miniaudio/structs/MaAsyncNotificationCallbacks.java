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

public final class MaAsyncNotificationCallbacks
		implements Struct<MaAsyncNotificationCallbacks> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ON_SIGNAL_HANDLE;

	public static final long ON_SIGNAL_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("onSignal")
		).withName("ma_async_notification_callbacks").withByteAlignment(8);
		
		ON_SIGNAL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onSignal"));
		
		ON_SIGNAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onSignal"));
		//@formatter:on
	}

	public MaAsyncNotificationCallbacks() {
	    this(Arena.ofAuto());
	}
	
	public MaAsyncNotificationCallbacks(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaAsyncNotificationCallbacks(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #onSignal()
    public MaAsyncNotificationCallbacks onSignal(MaOnSignal onSignal) {
    	ON_SIGNAL_HANDLE.set(segment, 0L, onSignal.memorySegment());
    	return this;
    }
    
    public @Nullable MaOnSignal onSignal() {
    	MemorySegment segment = (MemorySegment) ON_SIGNAL_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaOnSignal.get(segment);
    }
    
    @Override
    public MaAsyncNotificationCallbacks set(MaAsyncNotificationCallbacks other) {
        return set(other.segment);
    }
    
    @Override
    public MaAsyncNotificationCallbacks set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaAsyncNotificationCallbacks> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaAsyncNotificationCallbacks> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaAsyncNotificationCallbacks(segment),
            count
        );
    }
    
    public static NativeStructArray<MaAsyncNotificationCallbacks> array(Arena arena, MaAsyncNotificationCallbacks... structs) {
        NativeStructArray<MaAsyncNotificationCallbacks> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaAsyncNotificationCallbacks(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaAsyncNotificationCallbacks> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaAsyncNotificationCallbacks(segment)
        );
    }

}