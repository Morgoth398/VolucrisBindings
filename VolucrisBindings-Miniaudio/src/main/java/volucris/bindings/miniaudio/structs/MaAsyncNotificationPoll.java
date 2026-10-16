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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaAsyncNotificationPoll
		implements Struct<MaAsyncNotificationPoll> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SIGNALLED_HANDLE;

	public static final long CB_BYTE_OFFSET;
	public static final long SIGNALLED_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaAsyncNotificationCallbacks cb;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaAsyncNotificationCallbacks.LAYOUT.withName("cb"),
		    JAVA_INT.withName("signalled"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_async_notification_poll").withByteAlignment(8);
		
		SIGNALLED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("signalled"));
		
		CB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cb"));
		SIGNALLED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("signalled"));
		//@formatter:on
	}

	public MaAsyncNotificationPoll() {
	    this(Arena.ofAuto());
	}
	
	public MaAsyncNotificationPoll(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaAsyncNotificationPoll(MemorySegment segment) {
	    this.segment = segment;
	
	    cb = new MaAsyncNotificationCallbacks(segment.asSlice(CB_BYTE_OFFSET, MaAsyncNotificationCallbacks.LAYOUT));
	}

    /// @see #cb()
    public MaAsyncNotificationPoll cb(Consumer<MaAsyncNotificationCallbacks> consumer) {
    	consumer.accept(cb);
    	return this;
    }
    
    /// @see #cb()
    public MaAsyncNotificationPoll cb(MaAsyncNotificationCallbacks other) {
    	cb.set(other);
    	return this;
    }
    
    public MaAsyncNotificationCallbacks cb() {
    	return cb;
    }
    
    /// @see #signalled()
    public MaAsyncNotificationPoll signalled(int signalled) {
    	SIGNALLED_HANDLE.set(segment, 0L, signalled);
    	return this;
    }
    
    public int signalled() {
    	return (int) SIGNALLED_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaAsyncNotificationPoll set(MaAsyncNotificationPoll other) {
        return set(other.segment);
    }
    
    @Override
    public MaAsyncNotificationPoll set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaAsyncNotificationPoll> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaAsyncNotificationPoll> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaAsyncNotificationPoll(segment),
            count
        );
    }
    
    public static NativeStructArray<MaAsyncNotificationPoll> array(Arena arena, MaAsyncNotificationPoll... structs) {
        NativeStructArray<MaAsyncNotificationPoll> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaAsyncNotificationPoll(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaAsyncNotificationPoll> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaAsyncNotificationPoll(segment)
        );
    }

}