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

public final class MaVfsCallbacks
		implements Struct<MaVfsCallbacks> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ON_OPEN_HANDLE;
	public static final VarHandle ON_OPEN_W_HANDLE;
	public static final VarHandle ON_CLOSE_HANDLE;
	public static final VarHandle ON_READ_HANDLE;
	public static final VarHandle ON_WRITE_HANDLE;
	public static final VarHandle ON_SEEK_HANDLE;
	public static final VarHandle ON_TELL_HANDLE;
	public static final VarHandle ON_INFO_HANDLE;

	public static final long ON_OPEN_BYTE_OFFSET;
	public static final long ON_OPEN_W_BYTE_OFFSET;
	public static final long ON_CLOSE_BYTE_OFFSET;
	public static final long ON_READ_BYTE_OFFSET;
	public static final long ON_WRITE_BYTE_OFFSET;
	public static final long ON_SEEK_BYTE_OFFSET;
	public static final long ON_TELL_BYTE_OFFSET;
	public static final long ON_INFO_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("onOpen"),
		    UNBOUNDED_ADDRESS.withName("onOpenW"),
		    UNBOUNDED_ADDRESS.withName("onClose"),
		    UNBOUNDED_ADDRESS.withName("onRead"),
		    UNBOUNDED_ADDRESS.withName("onWrite"),
		    UNBOUNDED_ADDRESS.withName("onSeek"),
		    UNBOUNDED_ADDRESS.withName("onTell"),
		    UNBOUNDED_ADDRESS.withName("onInfo")
		).withName("ma_vfs_callbacks").withByteAlignment(8);
		
		ON_OPEN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onOpen"));
		ON_OPEN_W_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onOpenW"));
		ON_CLOSE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onClose"));
		ON_READ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onRead"));
		ON_WRITE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onWrite"));
		ON_SEEK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onSeek"));
		ON_TELL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onTell"));
		ON_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onInfo"));
		
		ON_OPEN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onOpen"));
		ON_OPEN_W_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onOpenW"));
		ON_CLOSE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onClose"));
		ON_READ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onRead"));
		ON_WRITE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onWrite"));
		ON_SEEK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onSeek"));
		ON_TELL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onTell"));
		ON_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onInfo"));
		//@formatter:on
	}

	public MaVfsCallbacks() {
	    this(Arena.ofAuto());
	}
	
	public MaVfsCallbacks(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaVfsCallbacks(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #onOpen()
    public MaVfsCallbacks onOpen(MaVfsOnOpen onOpen) {
    	ON_OPEN_HANDLE.set(segment, 0L, onOpen.memorySegment());
    	return this;
    }
    
    public @Nullable MaVfsOnOpen onOpen() {
    	MemorySegment segment = (MemorySegment) ON_OPEN_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaVfsOnOpen.get(segment);
    }
    
    /// @see #onOpenW()
    public MaVfsCallbacks onOpenW(MaVfsOnOpenW onOpenW) {
    	ON_OPEN_W_HANDLE.set(segment, 0L, onOpenW.memorySegment());
    	return this;
    }
    
    public @Nullable MaVfsOnOpenW onOpenW() {
    	MemorySegment segment = (MemorySegment) ON_OPEN_W_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaVfsOnOpenW.get(segment);
    }
    
    /// @see #onClose()
    public MaVfsCallbacks onClose(MaVfsOnClose onClose) {
    	ON_CLOSE_HANDLE.set(segment, 0L, onClose.memorySegment());
    	return this;
    }
    
    public @Nullable MaVfsOnClose onClose() {
    	MemorySegment segment = (MemorySegment) ON_CLOSE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaVfsOnClose.get(segment);
    }
    
    /// @see #onRead()
    public MaVfsCallbacks onRead(MaVfsOnRead onRead) {
    	ON_READ_HANDLE.set(segment, 0L, onRead.memorySegment());
    	return this;
    }
    
    public @Nullable MaVfsOnRead onRead() {
    	MemorySegment segment = (MemorySegment) ON_READ_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaVfsOnRead.get(segment);
    }
    
    /// @see #onWrite()
    public MaVfsCallbacks onWrite(MaVfsOnWrite onWrite) {
    	ON_WRITE_HANDLE.set(segment, 0L, onWrite.memorySegment());
    	return this;
    }
    
    public @Nullable MaVfsOnWrite onWrite() {
    	MemorySegment segment = (MemorySegment) ON_WRITE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaVfsOnWrite.get(segment);
    }
    
    /// @see #onSeek()
    public MaVfsCallbacks onSeek(MaVfsOnSeek onSeek) {
    	ON_SEEK_HANDLE.set(segment, 0L, onSeek.memorySegment());
    	return this;
    }
    
    public @Nullable MaVfsOnSeek onSeek() {
    	MemorySegment segment = (MemorySegment) ON_SEEK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaVfsOnSeek.get(segment);
    }
    
    /// @see #onTell()
    public MaVfsCallbacks onTell(MaVfsOnTell onTell) {
    	ON_TELL_HANDLE.set(segment, 0L, onTell.memorySegment());
    	return this;
    }
    
    public @Nullable MaVfsOnTell onTell() {
    	MemorySegment segment = (MemorySegment) ON_TELL_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaVfsOnTell.get(segment);
    }
    
    /// @see #onInfo()
    public MaVfsCallbacks onInfo(MaVfsOnInfo onInfo) {
    	ON_INFO_HANDLE.set(segment, 0L, onInfo.memorySegment());
    	return this;
    }
    
    public @Nullable MaVfsOnInfo onInfo() {
    	MemorySegment segment = (MemorySegment) ON_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaVfsOnInfo.get(segment);
    }
    
    @Override
    public MaVfsCallbacks set(MaVfsCallbacks other) {
        return set(other.segment);
    }
    
    @Override
    public MaVfsCallbacks set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaVfsCallbacks> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaVfsCallbacks> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaVfsCallbacks(segment),
            count
        );
    }
    
    public static NativeStructArray<MaVfsCallbacks> array(Arena arena, MaVfsCallbacks... structs) {
        NativeStructArray<MaVfsCallbacks> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaVfsCallbacks(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaVfsCallbacks> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaVfsCallbacks(segment)
        );
    }

}