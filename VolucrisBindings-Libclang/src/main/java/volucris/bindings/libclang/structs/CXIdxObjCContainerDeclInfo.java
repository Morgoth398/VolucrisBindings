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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CXIdxObjCContainerDeclInfo
		implements Struct<CXIdxObjCContainerDeclInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle DECL_INFO_HANDLE;
	public static final VarHandle KIND_HANDLE;

	public static final long DECL_INFO_BYTE_OFFSET;
	public static final long KIND_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("declInfo"),
		    JAVA_INT.withName("kind"),
		    MemoryLayout.paddingLayout(4)
		).withName("CXIdxObjCContainerDeclInfo").withByteAlignment(8);
		
		DECL_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("declInfo"));
		KIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("kind"));
		
		DECL_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("declInfo"));
		KIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("kind"));
		//@formatter:on
	}

	public CXIdxObjCContainerDeclInfo() {
	    this(Arena.ofAuto());
	}
	
	public CXIdxObjCContainerDeclInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public CXIdxObjCContainerDeclInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #declInfo()
    public CXIdxObjCContainerDeclInfo declInfo(CXIdxDeclInfo declInfo) {
    	DECL_INFO_HANDLE.set(segment, 0L, declInfo.memorySegment());
    	return this;
    }
    
    public @Nullable CXIdxDeclInfo declInfo() {
    	MemorySegment segment = (MemorySegment) DECL_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxDeclInfo(segment);
    }
    
    /// @see #kind()
    public CXIdxObjCContainerDeclInfo kind(int kind) {
    	KIND_HANDLE.set(segment, 0L, kind);
    	return this;
    }
    
    public int kind() {
    	return (int) KIND_HANDLE.get(segment, 0L);
    }
    
    @Override
    public CXIdxObjCContainerDeclInfo set(CXIdxObjCContainerDeclInfo other) {
        return set(other.segment);
    }
    
    @Override
    public CXIdxObjCContainerDeclInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXIdxObjCContainerDeclInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXIdxObjCContainerDeclInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxObjCContainerDeclInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<CXIdxObjCContainerDeclInfo> array(Arena arena, CXIdxObjCContainerDeclInfo... structs) {
        NativeStructArray<CXIdxObjCContainerDeclInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxObjCContainerDeclInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXIdxObjCContainerDeclInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXIdxObjCContainerDeclInfo(segment)
        );
    }

}