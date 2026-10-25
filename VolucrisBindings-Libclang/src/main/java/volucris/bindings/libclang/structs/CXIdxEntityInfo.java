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
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CXIdxEntityInfo
		implements Struct<CXIdxEntityInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle KIND_HANDLE;
	public static final VarHandle TEMPLATE_KIND_HANDLE;
	public static final VarHandle LANG_HANDLE;
	public static final VarHandle NAME_HANDLE;
	public static final VarHandle USR_HANDLE;
	public static final VarHandle ATTRIBUTES_HANDLE;
	public static final VarHandle NUM_ATTRIBUTES_HANDLE;

	public static final long KIND_BYTE_OFFSET;
	public static final long TEMPLATE_KIND_BYTE_OFFSET;
	public static final long LANG_BYTE_OFFSET;
	public static final long NAME_BYTE_OFFSET;
	public static final long USR_BYTE_OFFSET;
	public static final long CURSOR_BYTE_OFFSET;
	public static final long ATTRIBUTES_BYTE_OFFSET;
	public static final long NUM_ATTRIBUTES_BYTE_OFFSET;

	private final MemorySegment segment;

	private final CXCursor cursor;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("kind"),
		    JAVA_INT.withName("templateKind"),
		    JAVA_INT.withName("lang"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("name"),
		    UNBOUNDED_ADDRESS.withName("USR"),
		    CXCursor.LAYOUT.withName("cursor"),
		    UNBOUNDED_ADDRESS.withName("attributes"),
		    JAVA_INT.withName("numAttributes"),
		    MemoryLayout.paddingLayout(4)
		).withName("CXIdxEntityInfo").withByteAlignment(8);
		
		KIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("kind"));
		TEMPLATE_KIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("templateKind"));
		LANG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lang"));
		NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("name"));
		USR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("USR"));
		ATTRIBUTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("attributes"));
		NUM_ATTRIBUTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numAttributes"));
		
		KIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("kind"));
		TEMPLATE_KIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("templateKind"));
		LANG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lang"));
		NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("name"));
		USR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("USR"));
		CURSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cursor"));
		ATTRIBUTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("attributes"));
		NUM_ATTRIBUTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numAttributes"));
		//@formatter:on
	}

	public CXIdxEntityInfo() {
	    this(Arena.ofAuto());
	}
	
	public CXIdxEntityInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public CXIdxEntityInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    cursor = new CXCursor(segment.asSlice(CURSOR_BYTE_OFFSET, CXCursor.LAYOUT));
	}

    /// @see #kind()
    public CXIdxEntityInfo kind(int kind) {
    	KIND_HANDLE.set(segment, 0L, kind);
    	return this;
    }
    
    public int kind() {
    	return (int) KIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #templateKind()
    public CXIdxEntityInfo templateKind(int templateKind) {
    	TEMPLATE_KIND_HANDLE.set(segment, 0L, templateKind);
    	return this;
    }
    
    public int templateKind() {
    	return (int) TEMPLATE_KIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #lang()
    public CXIdxEntityInfo lang(int lang) {
    	LANG_HANDLE.set(segment, 0L, lang);
    	return this;
    }
    
    public int lang() {
    	return (int) LANG_HANDLE.get(segment, 0L);
    }
    
    /// @see #name()
    public CXIdxEntityInfo name(NativeByteArray name) {
    	NAME_HANDLE.set(segment, 0L, name.memorySegment());
    	return this;
    }
    
    public @Nullable NativeByteArray name() {
    	MemorySegment segment = (MemorySegment) NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #uSR()
    public CXIdxEntityInfo uSR(NativeByteArray uSR) {
    	USR_HANDLE.set(segment, 0L, uSR.memorySegment());
    	return this;
    }
    
    public @Nullable NativeByteArray uSR() {
    	MemorySegment segment = (MemorySegment) USR_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #cursor()
    public CXIdxEntityInfo cursor(Consumer<CXCursor> consumer) {
    	consumer.accept(cursor);
    	return this;
    }
    
    /// @see #cursor()
    public CXIdxEntityInfo cursor(CXCursor other) {
    	cursor.set(other);
    	return this;
    }
    
    public CXCursor cursor() {
    	return cursor;
    }
    
    /// @see #attributes()
    public CXIdxEntityInfo attributes(NativePointerArray attributes) {
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
    public CXIdxEntityInfo numAttributes(int numAttributes) {
    	NUM_ATTRIBUTES_HANDLE.set(segment, 0L, numAttributes);
    	return this;
    }
    
    public int numAttributes() {
    	return (int) NUM_ATTRIBUTES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public CXIdxEntityInfo set(CXIdxEntityInfo other) {
        return set(other.segment);
    }
    
    @Override
    public CXIdxEntityInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXIdxEntityInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXIdxEntityInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxEntityInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<CXIdxEntityInfo> array(Arena arena, CXIdxEntityInfo... structs) {
        NativeStructArray<CXIdxEntityInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxEntityInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXIdxEntityInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXIdxEntityInfo(segment)
        );
    }

}