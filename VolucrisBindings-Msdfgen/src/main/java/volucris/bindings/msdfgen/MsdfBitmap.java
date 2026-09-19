/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.msdfgen;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MsdfBitmap
		implements Struct<MsdfBitmap> {

    public static final StructLayout LAYOUT;

    public static final VarHandle TYPE_HANDLE;
    public static final VarHandle WIDTH_HANDLE;
    public static final VarHandle HEIGHT_HANDLE;
    public static final VarHandle HANDLE_HANDLE;

    public static final long TYPE_BYTE_OFFSET;
    public static final long WIDTH_BYTE_OFFSET;
    public static final long HEIGHT_BYTE_OFFSET;
    public static final long HANDLE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("handle")
        ).withName("msdf_bitmap").withByteAlignment(8);
        
        TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
        WIDTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("width"));
        HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("height"));
        HANDLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("handle"));
        
        TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
        WIDTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("width"));
        HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("height"));
        HANDLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("handle"));
        //@formatter:on
    }

    public MsdfBitmap() {
        this(Arena.ofAuto());
    }
    
    public MsdfBitmap(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public MsdfBitmap(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #type()
    public MsdfBitmap type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #width()
    public MsdfBitmap width(int width) {
    	WIDTH_HANDLE.set(segment, 0L, width);
    	return this;
    }
    
    public int width() {
    	return (int) WIDTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #height()
    public MsdfBitmap height(int height) {
    	HEIGHT_HANDLE.set(segment, 0L, height);
    	return this;
    }
    
    public int height() {
    	return (int) HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #handle()
    public MsdfBitmap handle(MemorySegment handle) {
    	HANDLE_HANDLE.set(segment, 0L, handle);
    	return this;
    }
    
    public @Nullable MemorySegment handle() {
    	MemorySegment segment = (MemorySegment) HANDLE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public MsdfBitmap set(MsdfBitmap other) {
        return set(other.segment);
    }
    
    @Override
    public MsdfBitmap set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MsdfBitmap> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MsdfBitmap> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MsdfBitmap(segment),
            count
        );
    }
    
    public static NativeStructArray<MsdfBitmap> array(Arena arena, MsdfBitmap... structs) {
        NativeStructArray<MsdfBitmap> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MsdfBitmap(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MsdfBitmap> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MsdfBitmap(segment)
        );
    }
    
}