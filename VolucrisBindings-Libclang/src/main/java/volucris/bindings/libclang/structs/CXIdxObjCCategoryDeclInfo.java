/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CXIdxObjCCategoryDeclInfo
		implements Struct<CXIdxObjCCategoryDeclInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CONTAINER_INFO_HANDLE;
	public static final VarHandle OBJC_CLASS_HANDLE;
	public static final VarHandle PROTOCOLS_HANDLE;

	public static final long CONTAINER_INFO_BYTE_OFFSET;
	public static final long OBJC_CLASS_BYTE_OFFSET;
	public static final long CLASS_CURSOR_BYTE_OFFSET;
	public static final long CLASS_LOC_BYTE_OFFSET;
	public static final long PROTOCOLS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final CXCursor classCursor;
	private final CXIdxLoc classLoc;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("containerInfo"),
		    UNBOUNDED_ADDRESS.withName("objcClass"),
		    CXCursor.LAYOUT.withName("classCursor"),
		    CXIdxLoc.LAYOUT.withName("classLoc"),
		    UNBOUNDED_ADDRESS.withName("protocols")
		).withName("CXIdxObjCCategoryDeclInfo").withByteAlignment(8);
		
		CONTAINER_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("containerInfo"));
		OBJC_CLASS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("objcClass"));
		PROTOCOLS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("protocols"));
		
		CONTAINER_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("containerInfo"));
		OBJC_CLASS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("objcClass"));
		CLASS_CURSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("classCursor"));
		CLASS_LOC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("classLoc"));
		PROTOCOLS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("protocols"));
		//@formatter:on
	}

	public CXIdxObjCCategoryDeclInfo() {
	    this(Arena.ofAuto());
	}
	
	public CXIdxObjCCategoryDeclInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public CXIdxObjCCategoryDeclInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    classCursor = new CXCursor(segment.asSlice(CLASS_CURSOR_BYTE_OFFSET, CXCursor.LAYOUT));
	    classLoc = new CXIdxLoc(segment.asSlice(CLASS_LOC_BYTE_OFFSET, CXIdxLoc.LAYOUT));
	}

    /// @see #containerInfo()
    public CXIdxObjCCategoryDeclInfo containerInfo(CXIdxObjCContainerDeclInfo containerInfo) {
    	CONTAINER_INFO_HANDLE.set(segment, 0L, containerInfo.memorySegment());
    	return this;
    }
    
    public @Nullable CXIdxObjCContainerDeclInfo containerInfo() {
    	MemorySegment segment = (MemorySegment) CONTAINER_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxObjCContainerDeclInfo(segment);
    }
    
    /// @see #objcClass()
    public CXIdxObjCCategoryDeclInfo objcClass(CXIdxEntityInfo objcClass) {
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
    public CXIdxObjCCategoryDeclInfo classCursor(Consumer<CXCursor> consumer) {
    	consumer.accept(classCursor);
    	return this;
    }
    
    /// @see #classCursor()
    public CXIdxObjCCategoryDeclInfo classCursor(CXCursor other) {
    	classCursor.set(other);
    	return this;
    }
    
    public CXCursor classCursor() {
    	return classCursor;
    }
    
    /// @see #classLoc()
    public CXIdxObjCCategoryDeclInfo classLoc(Consumer<CXIdxLoc> consumer) {
    	consumer.accept(classLoc);
    	return this;
    }
    
    /// @see #classLoc()
    public CXIdxObjCCategoryDeclInfo classLoc(CXIdxLoc other) {
    	classLoc.set(other);
    	return this;
    }
    
    public CXIdxLoc classLoc() {
    	return classLoc;
    }
    
    /// @see #protocols()
    public CXIdxObjCCategoryDeclInfo protocols(CXIdxObjCProtocolRefListInfo protocols) {
    	PROTOCOLS_HANDLE.set(segment, 0L, protocols.memorySegment());
    	return this;
    }
    
    public @Nullable CXIdxObjCProtocolRefListInfo protocols() {
    	MemorySegment segment = (MemorySegment) PROTOCOLS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxObjCProtocolRefListInfo(segment);
    }
    
    @Override
    public CXIdxObjCCategoryDeclInfo set(CXIdxObjCCategoryDeclInfo other) {
        return set(other.segment);
    }
    
    @Override
    public CXIdxObjCCategoryDeclInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXIdxObjCCategoryDeclInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXIdxObjCCategoryDeclInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxObjCCategoryDeclInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<CXIdxObjCCategoryDeclInfo> array(Arena arena, CXIdxObjCCategoryDeclInfo... structs) {
        NativeStructArray<CXIdxObjCCategoryDeclInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxObjCCategoryDeclInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXIdxObjCCategoryDeclInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXIdxObjCCategoryDeclInfo(segment)
        );
    }

}