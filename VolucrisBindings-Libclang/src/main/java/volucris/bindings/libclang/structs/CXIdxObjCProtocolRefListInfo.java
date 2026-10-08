/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CXIdxObjCProtocolRefListInfo
		implements Struct<CXIdxObjCProtocolRefListInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle PROTOCOLS_HANDLE;
    public static final VarHandle NUM_PROTOCOLS_HANDLE;

    public static final long PROTOCOLS_BYTE_OFFSET;
    public static final long NUM_PROTOCOLS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("protocols"),
            JAVA_INT.withName("numProtocols"),
            MemoryLayout.paddingLayout(4)
        ).withName("CXIdxObjCProtocolRefListInfo").withByteAlignment(8);
        
        PROTOCOLS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("protocols"));
        NUM_PROTOCOLS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numProtocols"));
        
        PROTOCOLS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("protocols"));
        NUM_PROTOCOLS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numProtocols"));
        //@formatter:on
    }

    public CXIdxObjCProtocolRefListInfo() {
        this(Arena.ofAuto());
    }
    
    public CXIdxObjCProtocolRefListInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CXIdxObjCProtocolRefListInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #protocols()
    public CXIdxObjCProtocolRefListInfo protocols(NativePointerArray protocols) {
    	PROTOCOLS_HANDLE.set(segment, 0L, protocols.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray protocols() {
    	MemorySegment segment = (MemorySegment) PROTOCOLS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #numProtocols()
    public CXIdxObjCProtocolRefListInfo numProtocols(int numProtocols) {
    	NUM_PROTOCOLS_HANDLE.set(segment, 0L, numProtocols);
    	return this;
    }
    
    public int numProtocols() {
    	return (int) NUM_PROTOCOLS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public CXIdxObjCProtocolRefListInfo set(CXIdxObjCProtocolRefListInfo other) {
        return set(other.segment);
    }
    
    @Override
    public CXIdxObjCProtocolRefListInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXIdxObjCProtocolRefListInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXIdxObjCProtocolRefListInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxObjCProtocolRefListInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<CXIdxObjCProtocolRefListInfo> array(Arena arena, CXIdxObjCProtocolRefListInfo... structs) {
        NativeStructArray<CXIdxObjCProtocolRefListInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxObjCProtocolRefListInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXIdxObjCProtocolRefListInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXIdxObjCProtocolRefListInfo(segment)
        );
    }
    
}