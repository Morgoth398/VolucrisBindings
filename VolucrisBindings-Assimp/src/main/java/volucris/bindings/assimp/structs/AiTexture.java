/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.structs;

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
/// Helper structure to describe an embedded texture
/// 
/// Normally textures are contained in external files but some file formats embed
/// them directly in the model file. There are two types of embedded textures:
/// 1. Uncompressed textures. The color data is given in an uncompressed format.
/// 2. Compressed textures stored in a file format like png or jpg. The raw file
/// bytes are given so the application must utilize an image decoder (e.g. DevIL) to
/// get access to the actual color data.
/// 
/// Embedded textures are referenced from materials using strings like "*0", "*1", etc.
/// as the texture paths (a single asterisk character followed by the
/// zero-based index of the texture in the aiScene::mTextures array).
/// ```
public final class AiTexture
		implements Struct<AiTexture> {

    public static final StructLayout LAYOUT;

    public static final VarHandle M_WIDTH_HANDLE;
    public static final VarHandle M_HEIGHT_HANDLE;
    public static final VarHandle ACH_FORMAT_HINT_HANDLE;
    public static final VarHandle PC_DATA_HANDLE;

    public static final long M_WIDTH_BYTE_OFFSET;
    public static final long M_HEIGHT_BYTE_OFFSET;
    public static final long ACH_FORMAT_HINT_BYTE_OFFSET;
    public static final long PC_DATA_BYTE_OFFSET;
    public static final long M_FILENAME_BYTE_OFFSET;

    private final MemorySegment segment;

    private final AiString mFilename;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("mWidth"),
            JAVA_INT.withName("mHeight"),
            MemoryLayout.sequenceLayout(9, JAVA_BYTE).withName("achFormatHint"),
            MemoryLayout.paddingLayout(7),
            UNBOUNDED_ADDRESS.withName("pcData"),
            AiString.LAYOUT.withName("mFilename"),
            MemoryLayout.paddingLayout(4)
        ).withName("aiTexture").withByteAlignment(8);
        
        M_WIDTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mWidth"));
        M_HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mHeight"));
        ACH_FORMAT_HINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("achFormatHint"), PathElement.sequenceElement());
        PC_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pcData"));
        
        M_WIDTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mWidth"));
        M_HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mHeight"));
        ACH_FORMAT_HINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("achFormatHint"));
        PC_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pcData"));
        M_FILENAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mFilename"));
        //@formatter:on
    }

    public AiTexture() {
        this(Arena.ofAuto());
    }
    
    public AiTexture(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public AiTexture(MemorySegment segment) {
        this.segment = segment;
    
        mFilename = new AiString(segment.asSlice(M_FILENAME_BYTE_OFFSET, AiString.LAYOUT));
    }

    /// @see #mWidth()
    public AiTexture mWidth(int mWidth) {
    	M_WIDTH_HANDLE.set(segment, 0L, mWidth);
    	return this;
    }
    
    /// ```
    /// Width of the texture, in pixels
    /// 
    /// If mHeight is zero the texture is compressed in a format
    /// like JPEG. In this case mWidth specifies the size of the
    /// memory area pcData is pointing to, in bytes.
    /// ```
    public int mWidth() {
    	return (int) M_WIDTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #mHeight()
    public AiTexture mHeight(int mHeight) {
    	M_HEIGHT_HANDLE.set(segment, 0L, mHeight);
    	return this;
    }
    
    /// ```
    /// Height of the texture, in pixels
    /// 
    /// If this value is zero, pcData points to an compressed texture
    /// in any format (e.g. JPEG).
    /// ```
    public int mHeight() {
    	return (int) M_HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #achFormatHint(int)
    public AiTexture achFormatHint(byte achFormatHint, int index0) {
    	ACH_FORMAT_HINT_HANDLE.set(segment, 0L, index0, achFormatHint);
    	return this;
    }
    
    /// ```
    /// A hint from the loader to make it easier for applications
    /// to determine the type of embedded textures.
    /// 
    /// If mHeight != 0 this member is show how data is packed. Hint will consist of
    /// two parts: channel order and channel bitness (count of the bits for every
    /// color channel). For simple parsing by the viewer it's better to not omit
    /// absent color channel and just use 0 for bitness. For example:
    /// 1. Image contain RGBA and 8 bit per channel, achFormatHint == "rgba8888";
    /// 2. Image contain ARGB and 8 bit per channel, achFormatHint == "argb8888";
    /// 3. Image contain RGB and 5 bit for R and B channels and 6 bit for G channel, achFormatHint == "rgba5650";
    /// 4. One color image with B channel and 1 bit for it, achFormatHint == "rgba0010";
    /// If mHeight == 0 then achFormatHint is set set to '\\0\\0\\0\\0' if the loader has no additional
    /// information about the texture file format used OR the
    /// file extension of the format without a trailing dot. If there
    /// are multiple file extensions for a format, the shortest
    /// extension is chosen (JPEG maps to 'jpg', not to 'jpeg').
    /// E.g. 'dds\\0', 'pcx\\0', 'jpg\\0'.  All characters are lower-case.
    /// The fourth character will always be '\\0'.
    /// ```
    public byte achFormatHint(int index0) {
    	return (byte) ACH_FORMAT_HINT_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #pcData()
    public AiTexture pcData(NativeStructArray<AiTexel> pcData) {
    	PC_DATA_HANDLE.set(segment, 0L, pcData.memorySegment());
    	return this;
    }
    
    /// ```
    /// Data of the texture.
    /// 
    /// Points to an array of mWidth * mHeight aiTexel's.
    /// The format of the texture data shall always be ARGB8888 if the texture-hint of the type is empty.
    /// If the hint is not empty you can interpret the format by looking into this hint.
    /// make the implementation for user of the library as easy
    /// as possible. If mHeight = 0 this is a pointer to a memory
    /// buffer of size mWidth containing the compressed texture
    /// data. Good luck, have fun!
    /// ```
    public @Nullable NativeStructArray<AiTexel> pcData() {
    	MemorySegment segment = (MemorySegment) PC_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiTexel.array(segment);
    }
    
    /// @see #mFilename()
    public AiTexture mFilename(Consumer<AiString> consumer) {
    	consumer.accept(mFilename);
    	return this;
    }
    
    /// @see #mFilename()
    public AiTexture mFilename(AiString other) {
    	mFilename.set(other);
    	return this;
    }
    
    /// ```
    /// Texture original filename
    /// 
    /// Used to get the texture reference
    /// ```
    public AiString mFilename() {
    	return mFilename;
    }
    
    @Override
    public AiTexture set(AiTexture other) {
        return set(other.segment);
    }
    
    @Override
    public AiTexture set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiTexture> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiTexture> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiTexture(segment),
            count
        );
    }
    
    public static NativeStructArray<AiTexture> array(Arena arena, AiTexture... structs) {
        NativeStructArray<AiTexture> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiTexture(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiTexture> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiTexture(segment)
        );
    }
    
}