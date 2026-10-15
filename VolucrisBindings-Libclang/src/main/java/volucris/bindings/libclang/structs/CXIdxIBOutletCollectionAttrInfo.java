/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.structs;

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

public final class CXIdxIBOutletCollectionAttrInfo
		implements Struct<CXIdxIBOutletCollectionAttrInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ATTR_INFO_HANDLE;
	public static final VarHandle OBJC_CLASS_HANDLE;

	public static final long ATTR_INFO_BYTE_OFFSET;
	public static final long OBJC_CLASS_BYTE_OFFSET;
	public static final long CLASS_CURSOR_BYTE_OFFSET;
	public static final long CLASS_LOC_BYTE_OFFSET;

	private final MemorySegment segment;

	private final CXCursor classCursor;
	private final CXIdxLoc classLoc;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("attrInfo"),
		    UNBOUNDED_ADDRESS.withName("objcClass"),
		    CXCursor.LAYOUT.withName("classCursor"),
		    CXIdxLoc.LAYOUT.withName("classLoc")
		).withName("CXIdxIBOutletCollectionAttrInfo").withByteAlignment(8);
		
		ATTR_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("attrInfo"));
		OBJC_CLASS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("objcClass"));
		
		ATTR_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("attrInfo"));
		OBJC_CLASS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("objcClass"));
		CLASS_CURSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("classCursor"));
		CLASS_LOC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("classLoc"));
		//@formatter:on
	}

	public CXIdxIBOutletCollectionAttrInfo() {
	    this(Arena.ofAuto());
	}
	
	public CXIdxIBOutletCollectionAttrInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public CXIdxIBOutletCollectionAttrInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    classCursor = new CXCursor(segment.asSlice(CLASS_CURSOR_BYTE_OFFSET, CXCursor.LAYOUT));
	    classLoc = new CXIdxLoc(segment.asSlice(CLASS_LOC_BYTE_OFFSET, CXIdxLoc.LAYOUT));
	}

    /// @see #attrInfo()
    public CXIdxIBOutletCollectionAttrInfo attrInfo(CXIdxAttrInfo attrInfo) {
    	ATTR_INFO_HANDLE.set(segment, 0L, attrInfo.memorySegment());
    	return this;
    }
    
    public @Nullable CXIdxAttrInfo attrInfo() {
    	MemorySegment segment = (MemorySegment) ATTR_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxAttrInfo(segment);
    }
    
    /// @see #objcClass()
    public CXIdxIBOutletCollectionAttrInfo objcClass(CXIdxEntityInfo objcClass) {
    	OBJC_CLASS_HANDLE.set(segment, 0L, objcClass.memorySegment());
    	return this;
    }
    
    public @Nullable CXIdxEntityInfo objcClass() {
    	MemorySegment segment = (MemorySegment) OBJC_CLASS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxEntityInfo(segment);
    }
    
    /// @see #classCursor()
    public CXIdxIBOutletCollectionAttrInfo classCursor(Consumer<CXCursor> consumer) {
    	consumer.accept(classCursor);
    	return this;
    }
    
    /// @see #classCursor()
    public CXIdxIBOutletCollectionAttrInfo classCursor(CXCursor other) {
    	classCursor.set(other);
    	return this;
    }
    
    public CXCursor classCursor() {
    	return classCursor;
    }
    
    /// @see #classLoc()
    public CXIdxIBOutletCollectionAttrInfo classLoc(Consumer<CXIdxLoc> consumer) {
    	consumer.accept(classLoc);
    	return this;
    }
    
    /// @see #classLoc()
    public CXIdxIBOutletCollectionAttrInfo classLoc(CXIdxLoc other) {
    	classLoc.set(other);
    	return this;
    }
    
    public CXIdxLoc classLoc() {
    	return classLoc;
    }
    
    @Override
    public CXIdxIBOutletCollectionAttrInfo set(CXIdxIBOutletCollectionAttrInfo other) {
        return set(other.segment);
    }
    
    @Override
    public CXIdxIBOutletCollectionAttrInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXIdxIBOutletCollectionAttrInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXIdxIBOutletCollectionAttrInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxIBOutletCollectionAttrInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<CXIdxIBOutletCollectionAttrInfo> array(Arena arena, CXIdxIBOutletCollectionAttrInfo... structs) {
        NativeStructArray<CXIdxIBOutletCollectionAttrInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxIBOutletCollectionAttrInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXIdxIBOutletCollectionAttrInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXIdxIBOutletCollectionAttrInfo(segment)
        );
    }

}