/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.miniaudio.callbacks.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaDecodingBackendVtable
		implements Struct<MaDecodingBackendVtable> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ON_INIT_HANDLE;
	public static final VarHandle ON_INIT_FILE_HANDLE;
	public static final VarHandle ON_INIT_FILE_W_HANDLE;
	public static final VarHandle ON_INIT_MEMORY_HANDLE;
	public static final VarHandle ON_UNINIT_HANDLE;

	public static final long ON_INIT_BYTE_OFFSET;
	public static final long ON_INIT_FILE_BYTE_OFFSET;
	public static final long ON_INIT_FILE_W_BYTE_OFFSET;
	public static final long ON_INIT_MEMORY_BYTE_OFFSET;
	public static final long ON_UNINIT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("onInit"),
		    UNBOUNDED_ADDRESS.withName("onInitFile"),
		    UNBOUNDED_ADDRESS.withName("onInitFileW"),
		    UNBOUNDED_ADDRESS.withName("onInitMemory"),
		    UNBOUNDED_ADDRESS.withName("onUninit")
		).withName("ma_decoding_backend_vtable").withByteAlignment(8);
		
		ON_INIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onInit"));
		ON_INIT_FILE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onInitFile"));
		ON_INIT_FILE_W_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onInitFileW"));
		ON_INIT_MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onInitMemory"));
		ON_UNINIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onUninit"));
		
		ON_INIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onInit"));
		ON_INIT_FILE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onInitFile"));
		ON_INIT_FILE_W_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onInitFileW"));
		ON_INIT_MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onInitMemory"));
		ON_UNINIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onUninit"));
		//@formatter:on
	}

	public MaDecodingBackendVtable() {
	    this(Arena.ofAuto());
	}
	
	public MaDecodingBackendVtable(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaDecodingBackendVtable(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #onInit()
    public MaDecodingBackendVtable onInit(MaDecodingBackendOnInit onInit) {
    	ON_INIT_HANDLE.set(segment, 0L, onInit.memorySegment());
    	return this;
    }
    
    public @Nullable MaDecodingBackendOnInit onInit() {
    	MemorySegment segment = (MemorySegment) ON_INIT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDecodingBackendOnInit.get(segment);
    }
    
    /// @see #onInitFile()
    public MaDecodingBackendVtable onInitFile(MaDecodingBackendOnInitFile onInitFile) {
    	ON_INIT_FILE_HANDLE.set(segment, 0L, onInitFile.memorySegment());
    	return this;
    }
    
    public @Nullable MaDecodingBackendOnInitFile onInitFile() {
    	MemorySegment segment = (MemorySegment) ON_INIT_FILE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDecodingBackendOnInitFile.get(segment);
    }
    
    /// @see #onInitFileW()
    public MaDecodingBackendVtable onInitFileW(MaDecodingBackendOnInitFileW onInitFileW) {
    	ON_INIT_FILE_W_HANDLE.set(segment, 0L, onInitFileW.memorySegment());
    	return this;
    }
    
    public @Nullable MaDecodingBackendOnInitFileW onInitFileW() {
    	MemorySegment segment = (MemorySegment) ON_INIT_FILE_W_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDecodingBackendOnInitFileW.get(segment);
    }
    
    /// @see #onInitMemory()
    public MaDecodingBackendVtable onInitMemory(MaDecodingBackendOnInitMemory onInitMemory) {
    	ON_INIT_MEMORY_HANDLE.set(segment, 0L, onInitMemory.memorySegment());
    	return this;
    }
    
    public @Nullable MaDecodingBackendOnInitMemory onInitMemory() {
    	MemorySegment segment = (MemorySegment) ON_INIT_MEMORY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDecodingBackendOnInitMemory.get(segment);
    }
    
    /// @see #onUninit()
    public MaDecodingBackendVtable onUninit(MaDecodingBackendOnUninit onUninit) {
    	ON_UNINIT_HANDLE.set(segment, 0L, onUninit.memorySegment());
    	return this;
    }
    
    public @Nullable MaDecodingBackendOnUninit onUninit() {
    	MemorySegment segment = (MemorySegment) ON_UNINIT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDecodingBackendOnUninit.get(segment);
    }
    
    @Override
    public MaDecodingBackendVtable set(MaDecodingBackendVtable other) {
        return set(other.segment);
    }
    
    @Override
    public MaDecodingBackendVtable set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDecodingBackendVtable> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDecodingBackendVtable> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDecodingBackendVtable(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDecodingBackendVtable> array(SegmentAllocator allocator, MaDecodingBackendVtable... structs) {
        NativeStructArray<MaDecodingBackendVtable> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDecodingBackendVtable(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDecodingBackendVtable> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDecodingBackendVtable(segment)
        );
    }

}