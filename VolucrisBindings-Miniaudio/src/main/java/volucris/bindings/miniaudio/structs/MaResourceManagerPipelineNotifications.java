/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaResourceManagerPipelineNotifications
		implements Struct<MaResourceManagerPipelineNotifications> {

	public static final StructLayout LAYOUT;

	public static final long INIT_BYTE_OFFSET;
	public static final long DONE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaResourceManagerPipelineStageNotification init;
	private final MaResourceManagerPipelineStageNotification done;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaResourceManagerPipelineStageNotification.LAYOUT.withName("init"),
		    MaResourceManagerPipelineStageNotification.LAYOUT.withName("done")
		).withName("ma_resource_manager_pipeline_notifications").withByteAlignment(8);
		
		INIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("init"));
		DONE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("done"));
		//@formatter:on
	}

	public MaResourceManagerPipelineNotifications() {
	    this(Arena.ofAuto());
	}
	
	public MaResourceManagerPipelineNotifications(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaResourceManagerPipelineNotifications(MemorySegment segment) {
	    this.segment = segment;
	
	    init = new MaResourceManagerPipelineStageNotification(segment.asSlice(INIT_BYTE_OFFSET, MaResourceManagerPipelineStageNotification.LAYOUT));
	    done = new MaResourceManagerPipelineStageNotification(segment.asSlice(DONE_BYTE_OFFSET, MaResourceManagerPipelineStageNotification.LAYOUT));
	}

    /// @see #init()
    public MaResourceManagerPipelineNotifications init(Consumer<MaResourceManagerPipelineStageNotification> consumer) {
    	consumer.accept(init);
    	return this;
    }
    
    /// @see #init()
    public MaResourceManagerPipelineNotifications init(MaResourceManagerPipelineStageNotification other) {
    	init.set(other);
    	return this;
    }
    
    public MaResourceManagerPipelineStageNotification init() {
    	return init;
    }
    
    /// @see #done()
    public MaResourceManagerPipelineNotifications done(Consumer<MaResourceManagerPipelineStageNotification> consumer) {
    	consumer.accept(done);
    	return this;
    }
    
    /// @see #done()
    public MaResourceManagerPipelineNotifications done(MaResourceManagerPipelineStageNotification other) {
    	done.set(other);
    	return this;
    }
    
    public MaResourceManagerPipelineStageNotification done() {
    	return done;
    }
    
    @Override
    public MaResourceManagerPipelineNotifications set(MaResourceManagerPipelineNotifications other) {
        return set(other.segment);
    }
    
    @Override
    public MaResourceManagerPipelineNotifications set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaResourceManagerPipelineNotifications> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaResourceManagerPipelineNotifications> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaResourceManagerPipelineNotifications(segment),
            count
        );
    }
    
    public static NativeStructArray<MaResourceManagerPipelineNotifications> array(SegmentAllocator allocator, MaResourceManagerPipelineNotifications... structs) {
        NativeStructArray<MaResourceManagerPipelineNotifications> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaResourceManagerPipelineNotifications(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaResourceManagerPipelineNotifications> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaResourceManagerPipelineNotifications(segment)
        );
    }

}