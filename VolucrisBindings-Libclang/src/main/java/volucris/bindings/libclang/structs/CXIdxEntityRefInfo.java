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

/// ```
/// 
/// Data for IndexerCallbacks#indexEntityReference.
/// ```
public final class CXIdxEntityRefInfo
		implements Struct<CXIdxEntityRefInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle KIND_HANDLE;
	public static final VarHandle REFERENCED_ENTITY_HANDLE;
	public static final VarHandle PARENT_ENTITY_HANDLE;
	public static final VarHandle CONTAINER_HANDLE;
	public static final VarHandle ROLE_HANDLE;

	public static final long KIND_BYTE_OFFSET;
	public static final long CURSOR_BYTE_OFFSET;
	public static final long LOC_BYTE_OFFSET;
	public static final long REFERENCED_ENTITY_BYTE_OFFSET;
	public static final long PARENT_ENTITY_BYTE_OFFSET;
	public static final long CONTAINER_BYTE_OFFSET;
	public static final long ROLE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final CXCursor cursor;
	private final CXIdxLoc loc;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("kind"),
		    MemoryLayout.paddingLayout(4),
		    CXCursor.LAYOUT.withName("cursor"),
		    CXIdxLoc.LAYOUT.withName("loc"),
		    UNBOUNDED_ADDRESS.withName("referencedEntity"),
		    UNBOUNDED_ADDRESS.withName("parentEntity"),
		    UNBOUNDED_ADDRESS.withName("container"),
		    JAVA_INT.withName("role"),
		    MemoryLayout.paddingLayout(4)
		).withName("CXIdxEntityRefInfo").withByteAlignment(8);
		
		KIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("kind"));
		REFERENCED_ENTITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("referencedEntity"));
		PARENT_ENTITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("parentEntity"));
		CONTAINER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("container"));
		ROLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("role"));
		
		KIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("kind"));
		CURSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cursor"));
		LOC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loc"));
		REFERENCED_ENTITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("referencedEntity"));
		PARENT_ENTITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("parentEntity"));
		CONTAINER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("container"));
		ROLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("role"));
		//@formatter:on
	}

	public CXIdxEntityRefInfo() {
	    this(Arena.ofAuto());
	}
	
	public CXIdxEntityRefInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public CXIdxEntityRefInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    cursor = new CXCursor(segment.asSlice(CURSOR_BYTE_OFFSET, CXCursor.LAYOUT));
	    loc = new CXIdxLoc(segment.asSlice(LOC_BYTE_OFFSET, CXIdxLoc.LAYOUT));
	}

    /// @see #kind()
    public CXIdxEntityRefInfo kind(int kind) {
    	KIND_HANDLE.set(segment, 0L, kind);
    	return this;
    }
    
    public int kind() {
    	return (int) KIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #cursor()
    public CXIdxEntityRefInfo cursor(Consumer<CXCursor> consumer) {
    	consumer.accept(cursor);
    	return this;
    }
    
    /// @see #cursor()
    public CXIdxEntityRefInfo cursor(CXCursor other) {
    	cursor.set(other);
    	return this;
    }
    
    /// ```
    /// 
    /// Reference cursor.
    /// ```
    public CXCursor cursor() {
    	return cursor;
    }
    
    /// @see #loc()
    public CXIdxEntityRefInfo loc(Consumer<CXIdxLoc> consumer) {
    	consumer.accept(loc);
    	return this;
    }
    
    /// @see #loc()
    public CXIdxEntityRefInfo loc(CXIdxLoc other) {
    	loc.set(other);
    	return this;
    }
    
    public CXIdxLoc loc() {
    	return loc;
    }
    
    /// @see #referencedEntity()
    public CXIdxEntityRefInfo referencedEntity(CXIdxEntityInfo referencedEntity) {
    	REFERENCED_ENTITY_HANDLE.set(segment, 0L, referencedEntity.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// The entity that gets referenced.
    /// ```
    public @Nullable CXIdxEntityInfo referencedEntity() {
    	MemorySegment segment = (MemorySegment) REFERENCED_ENTITY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxEntityInfo(segment);
    }
    
    /// @see #parentEntity()
    public CXIdxEntityRefInfo parentEntity(CXIdxEntityInfo parentEntity) {
    	PARENT_ENTITY_HANDLE.set(segment, 0L, parentEntity.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// Immediate "parent" of the reference. For example:
    /// 
    /// \code
    /// Foo *var;
    /// \endcode
    /// 
    /// The parent of reference of type 'Foo' is the variable 'var'.
    /// For references inside statement bodies of functions/methods,
    /// the parentEntity will be the function/method.
    /// ```
    public @Nullable CXIdxEntityInfo parentEntity() {
    	MemorySegment segment = (MemorySegment) PARENT_ENTITY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxEntityInfo(segment);
    }
    
    /// @see #container()
    public CXIdxEntityRefInfo container(CXIdxContainerInfo container) {
    	CONTAINER_HANDLE.set(segment, 0L, container.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// Lexical container context of the reference.
    /// ```
    public @Nullable CXIdxContainerInfo container() {
    	MemorySegment segment = (MemorySegment) CONTAINER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxContainerInfo(segment);
    }
    
    /// @see #role()
    public CXIdxEntityRefInfo role(int role) {
    	ROLE_HANDLE.set(segment, 0L, role);
    	return this;
    }
    
    /// ```
    /// 
    /// Sets of symbol roles of the reference.
    /// ```
    public int role() {
    	return (int) ROLE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public CXIdxEntityRefInfo set(CXIdxEntityRefInfo other) {
        return set(other.segment);
    }
    
    @Override
    public CXIdxEntityRefInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXIdxEntityRefInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXIdxEntityRefInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxEntityRefInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<CXIdxEntityRefInfo> array(Arena arena, CXIdxEntityRefInfo... structs) {
        NativeStructArray<CXIdxEntityRefInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxEntityRefInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXIdxEntityRefInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXIdxEntityRefInfo(segment)
        );
    }

}