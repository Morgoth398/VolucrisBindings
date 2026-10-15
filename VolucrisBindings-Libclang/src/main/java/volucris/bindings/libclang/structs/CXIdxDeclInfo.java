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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CXIdxDeclInfo
		implements Struct<CXIdxDeclInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ENTITY_INFO_HANDLE;
	public static final VarHandle SEMANTIC_CONTAINER_HANDLE;
	public static final VarHandle LEXICAL_CONTAINER_HANDLE;
	public static final VarHandle IS_REDECLARATION_HANDLE;
	public static final VarHandle IS_DEFINITION_HANDLE;
	public static final VarHandle IS_CONTAINER_HANDLE;
	public static final VarHandle DECL_AS_CONTAINER_HANDLE;
	public static final VarHandle IS_IMPLICIT_HANDLE;
	public static final VarHandle ATTRIBUTES_HANDLE;
	public static final VarHandle NUM_ATTRIBUTES_HANDLE;
	public static final VarHandle FLAGS_HANDLE;

	public static final long ENTITY_INFO_BYTE_OFFSET;
	public static final long CURSOR_BYTE_OFFSET;
	public static final long LOC_BYTE_OFFSET;
	public static final long SEMANTIC_CONTAINER_BYTE_OFFSET;
	public static final long LEXICAL_CONTAINER_BYTE_OFFSET;
	public static final long IS_REDECLARATION_BYTE_OFFSET;
	public static final long IS_DEFINITION_BYTE_OFFSET;
	public static final long IS_CONTAINER_BYTE_OFFSET;
	public static final long DECL_AS_CONTAINER_BYTE_OFFSET;
	public static final long IS_IMPLICIT_BYTE_OFFSET;
	public static final long ATTRIBUTES_BYTE_OFFSET;
	public static final long NUM_ATTRIBUTES_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final CXCursor cursor;
	private final CXIdxLoc loc;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("entityInfo"),
		    CXCursor.LAYOUT.withName("cursor"),
		    CXIdxLoc.LAYOUT.withName("loc"),
		    UNBOUNDED_ADDRESS.withName("semanticContainer"),
		    UNBOUNDED_ADDRESS.withName("lexicalContainer"),
		    JAVA_INT.withName("isRedeclaration"),
		    JAVA_INT.withName("isDefinition"),
		    JAVA_INT.withName("isContainer"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("declAsContainer"),
		    JAVA_INT.withName("isImplicit"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("attributes"),
		    JAVA_INT.withName("numAttributes"),
		    JAVA_INT.withName("flags")
		).withName("CXIdxDeclInfo").withByteAlignment(8);
		
		ENTITY_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("entityInfo"));
		SEMANTIC_CONTAINER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("semanticContainer"));
		LEXICAL_CONTAINER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lexicalContainer"));
		IS_REDECLARATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isRedeclaration"));
		IS_DEFINITION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isDefinition"));
		IS_CONTAINER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isContainer"));
		DECL_AS_CONTAINER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("declAsContainer"));
		IS_IMPLICIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isImplicit"));
		ATTRIBUTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("attributes"));
		NUM_ATTRIBUTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numAttributes"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		
		ENTITY_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("entityInfo"));
		CURSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cursor"));
		LOC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loc"));
		SEMANTIC_CONTAINER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("semanticContainer"));
		LEXICAL_CONTAINER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lexicalContainer"));
		IS_REDECLARATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isRedeclaration"));
		IS_DEFINITION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isDefinition"));
		IS_CONTAINER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isContainer"));
		DECL_AS_CONTAINER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("declAsContainer"));
		IS_IMPLICIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isImplicit"));
		ATTRIBUTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("attributes"));
		NUM_ATTRIBUTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numAttributes"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		//@formatter:on
	}

	public CXIdxDeclInfo() {
	    this(Arena.ofAuto());
	}
	
	public CXIdxDeclInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public CXIdxDeclInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    cursor = new CXCursor(segment.asSlice(CURSOR_BYTE_OFFSET, CXCursor.LAYOUT));
	    loc = new CXIdxLoc(segment.asSlice(LOC_BYTE_OFFSET, CXIdxLoc.LAYOUT));
	}

    /// @see #entityInfo()
    public CXIdxDeclInfo entityInfo(CXIdxEntityInfo entityInfo) {
    	ENTITY_INFO_HANDLE.set(segment, 0L, entityInfo.memorySegment());
    	return this;
    }
    
    public @Nullable CXIdxEntityInfo entityInfo() {
    	MemorySegment segment = (MemorySegment) ENTITY_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxEntityInfo(segment);
    }
    
    /// @see #cursor()
    public CXIdxDeclInfo cursor(Consumer<CXCursor> consumer) {
    	consumer.accept(cursor);
    	return this;
    }
    
    /// @see #cursor()
    public CXIdxDeclInfo cursor(CXCursor other) {
    	cursor.set(other);
    	return this;
    }
    
    public CXCursor cursor() {
    	return cursor;
    }
    
    /// @see #loc()
    public CXIdxDeclInfo loc(Consumer<CXIdxLoc> consumer) {
    	consumer.accept(loc);
    	return this;
    }
    
    /// @see #loc()
    public CXIdxDeclInfo loc(CXIdxLoc other) {
    	loc.set(other);
    	return this;
    }
    
    public CXIdxLoc loc() {
    	return loc;
    }
    
    /// @see #semanticContainer()
    public CXIdxDeclInfo semanticContainer(CXIdxContainerInfo semanticContainer) {
    	SEMANTIC_CONTAINER_HANDLE.set(segment, 0L, semanticContainer.memorySegment());
    	return this;
    }
    
    public @Nullable CXIdxContainerInfo semanticContainer() {
    	MemorySegment segment = (MemorySegment) SEMANTIC_CONTAINER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxContainerInfo(segment);
    }
    
    /// @see #lexicalContainer()
    public CXIdxDeclInfo lexicalContainer(CXIdxContainerInfo lexicalContainer) {
    	LEXICAL_CONTAINER_HANDLE.set(segment, 0L, lexicalContainer.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// Generally same as #semanticContainer but can be different in
    /// cases like out-of-line C++ member functions.
    /// ```
    public @Nullable CXIdxContainerInfo lexicalContainer() {
    	MemorySegment segment = (MemorySegment) LEXICAL_CONTAINER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxContainerInfo(segment);
    }
    
    /// @see #isRedeclaration()
    public CXIdxDeclInfo isRedeclaration(int isRedeclaration) {
    	IS_REDECLARATION_HANDLE.set(segment, 0L, isRedeclaration);
    	return this;
    }
    
    public int isRedeclaration() {
    	return (int) IS_REDECLARATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #isDefinition()
    public CXIdxDeclInfo isDefinition(int isDefinition) {
    	IS_DEFINITION_HANDLE.set(segment, 0L, isDefinition);
    	return this;
    }
    
    public int isDefinition() {
    	return (int) IS_DEFINITION_HANDLE.get(segment, 0L);
    }
    
    /// @see #isContainer()
    public CXIdxDeclInfo isContainer(int isContainer) {
    	IS_CONTAINER_HANDLE.set(segment, 0L, isContainer);
    	return this;
    }
    
    public int isContainer() {
    	return (int) IS_CONTAINER_HANDLE.get(segment, 0L);
    }
    
    /// @see #declAsContainer()
    public CXIdxDeclInfo declAsContainer(CXIdxContainerInfo declAsContainer) {
    	DECL_AS_CONTAINER_HANDLE.set(segment, 0L, declAsContainer.memorySegment());
    	return this;
    }
    
    public @Nullable CXIdxContainerInfo declAsContainer() {
    	MemorySegment segment = (MemorySegment) DECL_AS_CONTAINER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxContainerInfo(segment);
    }
    
    /// @see #isImplicit()
    public CXIdxDeclInfo isImplicit(int isImplicit) {
    	IS_IMPLICIT_HANDLE.set(segment, 0L, isImplicit);
    	return this;
    }
    
    /// ```
    /// 
    /// Whether the declaration exists in code or was created implicitly
    /// by the compiler, e.g. implicit Objective-C methods for properties.
    /// ```
    public int isImplicit() {
    	return (int) IS_IMPLICIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #attributes()
    public CXIdxDeclInfo attributes(NativePointerArray attributes) {
    	ATTRIBUTES_HANDLE.set(segment, 0L, attributes.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray attributes() {
    	MemorySegment segment = (MemorySegment) ATTRIBUTES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #numAttributes()
    public CXIdxDeclInfo numAttributes(int numAttributes) {
    	NUM_ATTRIBUTES_HANDLE.set(segment, 0L, numAttributes);
    	return this;
    }
    
    public int numAttributes() {
    	return (int) NUM_ATTRIBUTES_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public CXIdxDeclInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public CXIdxDeclInfo set(CXIdxDeclInfo other) {
        return set(other.segment);
    }
    
    @Override
    public CXIdxDeclInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXIdxDeclInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXIdxDeclInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxDeclInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<CXIdxDeclInfo> array(Arena arena, CXIdxDeclInfo... structs) {
        NativeStructArray<CXIdxDeclInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxDeclInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXIdxDeclInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXIdxDeclInfo(segment)
        );
    }

}