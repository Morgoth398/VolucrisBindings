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

public final class MaAsyncNotificationEvent
		implements Struct<MaAsyncNotificationEvent> {

	public static final StructLayout LAYOUT;

	public static final VarHandle E_HANDLE;

	public static final long CB_BYTE_OFFSET;
	public static final long E_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaAsyncNotificationCallbacks cb;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaAsyncNotificationCallbacks.LAYOUT.withName("cb"),
		    UNBOUNDED_ADDRESS.withName("e")
		).withName("ma_async_notification_event").withByteAlignment(8);
		
		E_HANDLE = LAYOUT.varHandle(PathElement.groupElement("e"));
		
		CB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cb"));
		E_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("e"));
		//@formatter:on
	}

	public MaAsyncNotificationEvent() {
	    this(Arena.ofAuto());
	}
	
	public MaAsyncNotificationEvent(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaAsyncNotificationEvent(MemorySegment segment) {
	    this.segment = segment;
	
	    cb = new MaAsyncNotificationCallbacks(segment.asSlice(CB_BYTE_OFFSET, MaAsyncNotificationCallbacks.LAYOUT));
	}

    /// @see #cb()
    public MaAsyncNotificationEvent cb(Consumer<MaAsyncNotificationCallbacks> consumer) {
    	consumer.accept(cb);
    	return this;
    }
    
    /// @see #cb()
    public MaAsyncNotificationEvent cb(MaAsyncNotificationCallbacks other) {
    	cb.set(other);
    	return this;
    }
    
    public MaAsyncNotificationCallbacks cb() {
    	return cb;
    }
    
    /// @see #e()
    public MaAsyncNotificationEvent e(MemorySegment e) {
    	E_HANDLE.set(segment, 0L, e);
    	return this;
    }
    
    public @Nullable MemorySegment e() {
    	MemorySegment segment = (MemorySegment) E_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public MaAsyncNotificationEvent set(MaAsyncNotificationEvent other) {
        return set(other.segment);
    }
    
    @Override
    public MaAsyncNotificationEvent set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaAsyncNotificationEvent> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaAsyncNotificationEvent> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaAsyncNotificationEvent(segment),
            count
        );
    }
    
    public static NativeStructArray<MaAsyncNotificationEvent> array(Arena arena, MaAsyncNotificationEvent... structs) {
        NativeStructArray<MaAsyncNotificationEvent> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaAsyncNotificationEvent(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaAsyncNotificationEvent> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaAsyncNotificationEvent(segment)
        );
    }

}