/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// 
/// Describes a version number of the form major.minor.subminor.
/// ```
public final class CXVersion
		implements Struct<CXVersion> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MAJOR_HANDLE;
    public static final VarHandle MINOR_HANDLE;
    public static final VarHandle SUBMINOR_HANDLE;

    public static final long MAJOR_BYTE_OFFSET;
    public static final long MINOR_BYTE_OFFSET;
    public static final long SUBMINOR_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("Major"),
            JAVA_INT.withName("Minor"),
            JAVA_INT.withName("Subminor")
        ).withName("CXVersion").withByteAlignment(4);
        
        MAJOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("Major"));
        MINOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("Minor"));
        SUBMINOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("Subminor"));
        
        MAJOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Major"));
        MINOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Minor"));
        SUBMINOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Subminor"));
        //@formatter:on
    }

    public CXVersion() {
        this(Arena.ofAuto());
    }
    
    public CXVersion(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CXVersion(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #major()
    public CXVersion major(int major) {
    	MAJOR_HANDLE.set(segment, 0L, major);
    	return this;
    }
    
    /// ```
    /// 
    /// The major version number, e.g., the '10' in '10.7.3'. A negative
    /// value indicates that there is no version number at all.
    /// ```
    public int major() {
    	return (int) MAJOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #minor()
    public CXVersion minor(int minor) {
    	MINOR_HANDLE.set(segment, 0L, minor);
    	return this;
    }
    
    /// ```
    /// 
    /// The minor version number, e.g., the '7' in '10.7.3'. This value
    /// will be negative if no minor version number was provided, e.g., for
    /// version '10'.
    /// ```
    public int minor() {
    	return (int) MINOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #subminor()
    public CXVersion subminor(int subminor) {
    	SUBMINOR_HANDLE.set(segment, 0L, subminor);
    	return this;
    }
    
    /// ```
    /// 
    /// The subminor version number, e.g., the '3' in '10.7.3'. This value
    /// will be negative if no minor or subminor version number was provided,
    /// e.g., in version '10' or '10.7'.
    /// ```
    public int subminor() {
    	return (int) SUBMINOR_HANDLE.get(segment, 0L);
    }
    
    @Override
    public CXVersion set(CXVersion other) {
        return set(other.segment);
    }
    
    @Override
    public CXVersion set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXVersion> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXVersion> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXVersion(segment),
            count
        );
    }
    
    public static NativeStructArray<CXVersion> array(Arena arena, CXVersion... structs) {
        NativeStructArray<CXVersion> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXVersion(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXVersion> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXVersion(segment)
        );
    }
    
}