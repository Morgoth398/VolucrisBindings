/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.structs;

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
/// @brief Represents an UTF-8 string, zero byte terminated.
/// 
/// The character set of an aiString is explicitly defined to be UTF-8. This Unicode
/// transformation was chosen in the belief that most strings in 3d files are limited
/// to ASCII, thus the character set needed to be strictly ASCII compatible.
/// 
/// Most text file loaders provide proper Unicode input file handling, special unicode
/// characters are correctly transcoded to UTF8 and are kept throughout the libraries'
/// import pipeline.
/// 
/// For most applications, it will be absolutely sufficient to interpret the
/// aiString as ASCII data and work with it as one would work with a plain char*.
/// Windows users in need of proper support for i.e asian characters can use the
/// MultiByteToWideChar(), WideCharToMultiByte() WinAPI functionality to convert the
/// UTF-8 strings to their working character set (i.e. MBCS, WideChar).
/// 
/// We use this representation instead of std::string to be C-compatible. The
/// (binary) length of such a string is limited to AI_MAXLEN characters (including the
/// the terminating zero).
/// ```
public final class AiString
		implements Struct<AiString> {

    public static final StructLayout LAYOUT;

    public static final VarHandle LENGTH_HANDLE;
    public static final VarHandle DATA_HANDLE;

    public static final long LENGTH_BYTE_OFFSET;
    public static final long DATA_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("length"),
            MemoryLayout.sequenceLayout(1024, JAVA_BYTE).withName("data")
        ).withName("aiString").withByteAlignment(4);
        
        LENGTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("length"));
        DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("data"), PathElement.sequenceElement());
        
        LENGTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("length"));
        DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
        //@formatter:on
    }

    public AiString() {
        this(Arena.ofAuto());
    }
    
    public AiString(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public AiString(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #length()
    public AiString length(int length) {
    	LENGTH_HANDLE.set(segment, 0L, length);
    	return this;
    }
    
    /// ```
    /// Binary length of the string excluding the terminal 0. This is NOT the
    /// logical length of strings containing UTF-8 multi-byte sequences! It's
    /// the number of bytes from the beginning of the string to its end.
    /// ```
    public int length() {
    	return (int) LENGTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #data(int)
    public AiString data(byte data, int index0) {
    	DATA_HANDLE.set(segment, 0L, index0, data);
    	return this;
    }
    
    /// ```
    /// String buffer. Size limit is AI_MAXLEN
    /// ```
    public byte data(int index0) {
    	return (byte) DATA_HANDLE.get(segment, 0L, index0);
    }
    
    public String data() {
        return segment.getString(DATA_BYTE_OFFSET);
    }
    
    @Override
    public AiString set(AiString other) {
        return set(other.segment);
    }
    
    @Override
    public AiString set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiString> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiString> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiString(segment),
            count
        );
    }
    
    public static NativeStructArray<AiString> array(Arena arena, AiString... structs) {
        NativeStructArray<AiString> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiString(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiString> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiString(segment)
        );
    }
    
}