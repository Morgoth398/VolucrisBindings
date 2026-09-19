/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// 
/// @brief  Type to store a in-memory data buffer.
/// ```
public final class AiBuffer
		implements Struct<AiBuffer> {

    public static final StructLayout LAYOUT;

    public static final VarHandle DATA_HANDLE;
    public static final VarHandle END_HANDLE;

    public static final long DATA_BYTE_OFFSET;
    public static final long END_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("data"),
            UNBOUNDED_ADDRESS.withName("end")
        ).withName("aiBuffer").withByteAlignment(8);
        
        DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("data"));
        END_HANDLE = LAYOUT.varHandle(PathElement.groupElement("end"));
        
        DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
        END_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("end"));
        //@formatter:on
    }

    public AiBuffer() {
        this(Arena.ofAuto());
    }
    
    public AiBuffer(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public AiBuffer(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #data()
    public AiBuffer data(NativeByteArray data) {
    	DATA_HANDLE.set(segment, 0L, data.memorySegment());
    	return this;
    }
    
    /// ```
    /// Begin poiner
    /// ```
    public @Nullable NativeByteArray data() {
    	MemorySegment segment = (MemorySegment) DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #end()
    public AiBuffer end(NativeByteArray end) {
    	END_HANDLE.set(segment, 0L, end.memorySegment());
    	return this;
    }
    
    /// ```
    /// End pointer
    /// ```
    public @Nullable NativeByteArray end() {
    	MemorySegment segment = (MemorySegment) END_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    @Override
    public AiBuffer set(AiBuffer other) {
        return set(other.segment);
    }
    
    @Override
    public AiBuffer set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiBuffer> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiBuffer> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiBuffer(segment),
            count
        );
    }
    
    public static NativeStructArray<AiBuffer> array(Arena arena, AiBuffer... structs) {
        NativeStructArray<AiBuffer> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiBuffer(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiBuffer> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiBuffer(segment)
        );
    }
    
}