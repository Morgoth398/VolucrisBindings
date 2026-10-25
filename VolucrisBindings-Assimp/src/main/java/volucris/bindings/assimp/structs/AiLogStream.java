/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.assimp.callbacks.AiLogStreamCallback;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// C-API: Represents a log stream. A log stream receives all log messages and
/// streams them _somewhere_.
/// @see aiGetPredefinedLogStream
/// @see aiAttachLogStream
/// @see aiDetachLogStream
/// ```
public final class AiLogStream
		implements Struct<AiLogStream> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CALLBACK_HANDLE;
	public static final VarHandle USER_HANDLE;

	public static final long CALLBACK_BYTE_OFFSET;
	public static final long USER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("callback"),
		    UNBOUNDED_ADDRESS.withName("user")
		).withName("aiLogStream").withByteAlignment(8);
		
		CALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("callback"));
		USER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("user"));
		
		CALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("callback"));
		USER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("user"));
		//@formatter:on
	}

	public AiLogStream() {
	    this(Arena.ofAuto());
	}
	
	public AiLogStream(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public AiLogStream(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #callback()
    public AiLogStream callback(AiLogStreamCallback callback) {
    	CALLBACK_HANDLE.set(segment, 0L, callback.memorySegment());
    	return this;
    }
    
    /// ```
    /// callback to be called
    /// ```
    public @Nullable AiLogStreamCallback callback() {
    	MemorySegment segment = (MemorySegment) CALLBACK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return AiLogStreamCallback.get(segment);
    }
    
    /// @see #user()
    public AiLogStream user(NativeByteArray user) {
    	USER_HANDLE.set(segment, 0L, user.memorySegment());
    	return this;
    }
    
    /// ```
    /// user data to be passed to the callback
    /// ```
    public @Nullable NativeByteArray user() {
    	MemorySegment segment = (MemorySegment) USER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    @Override
    public AiLogStream set(AiLogStream other) {
        return set(other.segment);
    }
    
    @Override
    public AiLogStream set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiLogStream> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiLogStream> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiLogStream(segment),
            count
        );
    }
    
    public static NativeStructArray<AiLogStream> array(Arena arena, AiLogStream... structs) {
        NativeStructArray<AiLogStream> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiLogStream(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiLogStream> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiLogStream(segment)
        );
    }

}