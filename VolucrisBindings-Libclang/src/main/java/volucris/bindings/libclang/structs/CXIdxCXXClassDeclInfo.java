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

public final class CXIdxCXXClassDeclInfo
		implements Struct<CXIdxCXXClassDeclInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle DECL_INFO_HANDLE;
	public static final VarHandle BASES_HANDLE;
	public static final VarHandle NUM_BASES_HANDLE;

	public static final long DECL_INFO_BYTE_OFFSET;
	public static final long BASES_BYTE_OFFSET;
	public static final long NUM_BASES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("declInfo"),
		    UNBOUNDED_ADDRESS.withName("bases"),
		    JAVA_INT.withName("numBases"),
		    MemoryLayout.paddingLayout(4)
		).withName("CXIdxCXXClassDeclInfo").withByteAlignment(8);
		
		DECL_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("declInfo"));
		BASES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bases"));
		NUM_BASES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numBases"));
		
		DECL_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("declInfo"));
		BASES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bases"));
		NUM_BASES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numBases"));
		//@formatter:on
	}

	public CXIdxCXXClassDeclInfo() {
	    this(Arena.ofAuto());
	}
	
	public CXIdxCXXClassDeclInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public CXIdxCXXClassDeclInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #declInfo()
    public CXIdxCXXClassDeclInfo declInfo(CXIdxDeclInfo declInfo) {
    	DECL_INFO_HANDLE.set(segment, 0L, declInfo.memorySegment());
    	return this;
    }
    
    public @Nullable CXIdxDeclInfo declInfo() {
    	MemorySegment segment = (MemorySegment) DECL_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxDeclInfo(segment);
    }
    
    /// @see #bases()
    public CXIdxCXXClassDeclInfo bases(NativePointerArray bases) {
    	BASES_HANDLE.set(segment, 0L, bases.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray bases() {
    	MemorySegment segment = (MemorySegment) BASES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #numBases()
    public CXIdxCXXClassDeclInfo numBases(int numBases) {
    	NUM_BASES_HANDLE.set(segment, 0L, numBases);
    	return this;
    }
    
    public int numBases() {
    	return (int) NUM_BASES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public CXIdxCXXClassDeclInfo set(CXIdxCXXClassDeclInfo other) {
        return set(other.segment);
    }
    
    @Override
    public CXIdxCXXClassDeclInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXIdxCXXClassDeclInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXIdxCXXClassDeclInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxCXXClassDeclInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<CXIdxCXXClassDeclInfo> array(Arena arena, CXIdxCXXClassDeclInfo... structs) {
        NativeStructArray<CXIdxCXXClassDeclInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxCXXClassDeclInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXIdxCXXClassDeclInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXIdxCXXClassDeclInfo(segment)
        );
    }

}