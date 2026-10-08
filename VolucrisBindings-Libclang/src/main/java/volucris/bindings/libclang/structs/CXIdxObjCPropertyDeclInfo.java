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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CXIdxObjCPropertyDeclInfo
		implements Struct<CXIdxObjCPropertyDeclInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle DECL_INFO_HANDLE;
    public static final VarHandle GETTER_HANDLE;
    public static final VarHandle SETTER_HANDLE;

    public static final long DECL_INFO_BYTE_OFFSET;
    public static final long GETTER_BYTE_OFFSET;
    public static final long SETTER_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("declInfo"),
            UNBOUNDED_ADDRESS.withName("getter"),
            UNBOUNDED_ADDRESS.withName("setter")
        ).withName("CXIdxObjCPropertyDeclInfo").withByteAlignment(8);
        
        DECL_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("declInfo"));
        GETTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("getter"));
        SETTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("setter"));
        
        DECL_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("declInfo"));
        GETTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("getter"));
        SETTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("setter"));
        //@formatter:on
    }

    public CXIdxObjCPropertyDeclInfo() {
        this(Arena.ofAuto());
    }
    
    public CXIdxObjCPropertyDeclInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CXIdxObjCPropertyDeclInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #declInfo()
    public CXIdxObjCPropertyDeclInfo declInfo(CXIdxDeclInfo declInfo) {
    	DECL_INFO_HANDLE.set(segment, 0L, declInfo.memorySegment());
    	return this;
    }
    
    public @Nullable CXIdxDeclInfo declInfo() {
    	MemorySegment segment = (MemorySegment) DECL_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxDeclInfo(segment);
    }
    
    /// @see #getter()
    public CXIdxObjCPropertyDeclInfo getter(CXIdxEntityInfo getter) {
    	GETTER_HANDLE.set(segment, 0L, getter.memorySegment());
    	return this;
    }
    
    public @Nullable CXIdxEntityInfo getter() {
    	MemorySegment segment = (MemorySegment) GETTER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxEntityInfo(segment);
    }
    
    /// @see #setter()
    public CXIdxObjCPropertyDeclInfo setter(CXIdxEntityInfo setter) {
    	SETTER_HANDLE.set(segment, 0L, setter.memorySegment());
    	return this;
    }
    
    public @Nullable CXIdxEntityInfo setter() {
    	MemorySegment segment = (MemorySegment) SETTER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxEntityInfo(segment);
    }
    
    @Override
    public CXIdxObjCPropertyDeclInfo set(CXIdxObjCPropertyDeclInfo other) {
        return set(other.segment);
    }
    
    @Override
    public CXIdxObjCPropertyDeclInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXIdxObjCPropertyDeclInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXIdxObjCPropertyDeclInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxObjCPropertyDeclInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<CXIdxObjCPropertyDeclInfo> array(Arena arena, CXIdxObjCPropertyDeclInfo... structs) {
        NativeStructArray<CXIdxObjCPropertyDeclInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxObjCPropertyDeclInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXIdxObjCPropertyDeclInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXIdxObjCPropertyDeclInfo(segment)
        );
    }
    
}