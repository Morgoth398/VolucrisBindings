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

public final class CXIdxObjCInterfaceDeclInfo
		implements Struct<CXIdxObjCInterfaceDeclInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CONTAINER_INFO_HANDLE;
	public static final VarHandle SUPER_INFO_HANDLE;
	public static final VarHandle PROTOCOLS_HANDLE;

	public static final long CONTAINER_INFO_BYTE_OFFSET;
	public static final long SUPER_INFO_BYTE_OFFSET;
	public static final long PROTOCOLS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("containerInfo"),
		    UNBOUNDED_ADDRESS.withName("superInfo"),
		    UNBOUNDED_ADDRESS.withName("protocols")
		).withName("CXIdxObjCInterfaceDeclInfo").withByteAlignment(8);
		
		CONTAINER_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("containerInfo"));
		SUPER_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("superInfo"));
		PROTOCOLS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("protocols"));
		
		CONTAINER_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("containerInfo"));
		SUPER_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("superInfo"));
		PROTOCOLS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("protocols"));
		//@formatter:on
	}

	public CXIdxObjCInterfaceDeclInfo() {
	    this(Arena.ofAuto());
	}
	
	public CXIdxObjCInterfaceDeclInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public CXIdxObjCInterfaceDeclInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #containerInfo()
    public CXIdxObjCInterfaceDeclInfo containerInfo(CXIdxObjCContainerDeclInfo containerInfo) {
    	CONTAINER_INFO_HANDLE.set(segment, 0L, containerInfo.memorySegment());
    	return this;
    }
    
    public @Nullable CXIdxObjCContainerDeclInfo containerInfo() {
    	MemorySegment segment = (MemorySegment) CONTAINER_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxObjCContainerDeclInfo(segment);
    }
    
    /// @see #superInfo()
    public CXIdxObjCInterfaceDeclInfo superInfo(CXIdxBaseClassInfo superInfo) {
    	SUPER_INFO_HANDLE.set(segment, 0L, superInfo.memorySegment());
    	return this;
    }
    
    public @Nullable CXIdxBaseClassInfo superInfo() {
    	MemorySegment segment = (MemorySegment) SUPER_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxBaseClassInfo(segment);
    }
    
    /// @see #protocols()
    public CXIdxObjCInterfaceDeclInfo protocols(CXIdxObjCProtocolRefListInfo protocols) {
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
    public CXIdxObjCInterfaceDeclInfo set(CXIdxObjCInterfaceDeclInfo other) {
        return set(other.segment);
    }
    
    @Override
    public CXIdxObjCInterfaceDeclInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXIdxObjCInterfaceDeclInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXIdxObjCInterfaceDeclInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxObjCInterfaceDeclInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<CXIdxObjCInterfaceDeclInfo> array(Arena arena, CXIdxObjCInterfaceDeclInfo... structs) {
        NativeStructArray<CXIdxObjCInterfaceDeclInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxObjCInterfaceDeclInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXIdxObjCInterfaceDeclInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXIdxObjCInterfaceDeclInfo(segment)
        );
    }

}