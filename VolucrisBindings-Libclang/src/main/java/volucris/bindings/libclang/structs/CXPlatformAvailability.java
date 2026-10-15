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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// 
/// Describes the availability of a given entity on a particular platform, e.g.,
/// a particular class might only be available on Mac OS 10.7 or newer.
/// ```
public final class CXPlatformAvailability
		implements Struct<CXPlatformAvailability> {

	public static final StructLayout LAYOUT;

	public static final VarHandle UNAVAILABLE_HANDLE;

	public static final long PLATFORM_BYTE_OFFSET;
	public static final long INTRODUCED_BYTE_OFFSET;
	public static final long DEPRECATED_BYTE_OFFSET;
	public static final long OBSOLETED_BYTE_OFFSET;
	public static final long UNAVAILABLE_BYTE_OFFSET;
	public static final long MESSAGE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final CXString platform;
	private final CXVersion introduced;
	private final CXVersion deprecated;
	private final CXVersion obsoleted;
	private final CXString message;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    CXString.LAYOUT.withName("Platform"),
		    CXVersion.LAYOUT.withName("Introduced"),
		    CXVersion.LAYOUT.withName("Deprecated"),
		    CXVersion.LAYOUT.withName("Obsoleted"),
		    JAVA_INT.withName("Unavailable"),
		    CXString.LAYOUT.withName("Message")
		).withName("CXPlatformAvailability").withByteAlignment(8);
		
		UNAVAILABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("Unavailable"));
		
		PLATFORM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Platform"));
		INTRODUCED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Introduced"));
		DEPRECATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Deprecated"));
		OBSOLETED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Obsoleted"));
		UNAVAILABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Unavailable"));
		MESSAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Message"));
		//@formatter:on
	}

	public CXPlatformAvailability() {
	    this(Arena.ofAuto());
	}
	
	public CXPlatformAvailability(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public CXPlatformAvailability(MemorySegment segment) {
	    this.segment = segment;
	
	    platform = new CXString(segment.asSlice(PLATFORM_BYTE_OFFSET, CXString.LAYOUT));
	    introduced = new CXVersion(segment.asSlice(INTRODUCED_BYTE_OFFSET, CXVersion.LAYOUT));
	    deprecated = new CXVersion(segment.asSlice(DEPRECATED_BYTE_OFFSET, CXVersion.LAYOUT));
	    obsoleted = new CXVersion(segment.asSlice(OBSOLETED_BYTE_OFFSET, CXVersion.LAYOUT));
	    message = new CXString(segment.asSlice(MESSAGE_BYTE_OFFSET, CXString.LAYOUT));
	}

    /// @see #platform()
    public CXPlatformAvailability platform(Consumer<CXString> consumer) {
    	consumer.accept(platform);
    	return this;
    }
    
    /// @see #platform()
    public CXPlatformAvailability platform(CXString other) {
    	platform.set(other);
    	return this;
    }
    
    /// ```
    /// 
    /// A string that describes the platform for which this structure
    /// provides availability information.
    /// 
    /// Possible values are "ios" or "macos".
    /// ```
    public CXString platform() {
    	return platform;
    }
    
    /// @see #introduced()
    public CXPlatformAvailability introduced(Consumer<CXVersion> consumer) {
    	consumer.accept(introduced);
    	return this;
    }
    
    /// @see #introduced()
    public CXPlatformAvailability introduced(CXVersion other) {
    	introduced.set(other);
    	return this;
    }
    
    /// ```
    /// 
    /// The version number in which this entity was introduced.
    /// ```
    public CXVersion introduced() {
    	return introduced;
    }
    
    /// @see #deprecated()
    public CXPlatformAvailability deprecated(Consumer<CXVersion> consumer) {
    	consumer.accept(deprecated);
    	return this;
    }
    
    /// @see #deprecated()
    public CXPlatformAvailability deprecated(CXVersion other) {
    	deprecated.set(other);
    	return this;
    }
    
    /// ```
    /// 
    /// The version number in which this entity was deprecated (but is
    /// still available).
    /// ```
    public CXVersion deprecated() {
    	return deprecated;
    }
    
    /// @see #obsoleted()
    public CXPlatformAvailability obsoleted(Consumer<CXVersion> consumer) {
    	consumer.accept(obsoleted);
    	return this;
    }
    
    /// @see #obsoleted()
    public CXPlatformAvailability obsoleted(CXVersion other) {
    	obsoleted.set(other);
    	return this;
    }
    
    /// ```
    /// 
    /// The version number in which this entity was obsoleted, and therefore
    /// is no longer available.
    /// ```
    public CXVersion obsoleted() {
    	return obsoleted;
    }
    
    /// @see #unavailable()
    public CXPlatformAvailability unavailable(int unavailable) {
    	UNAVAILABLE_HANDLE.set(segment, 0L, unavailable);
    	return this;
    }
    
    /// ```
    /// 
    /// Whether the entity is unconditionally unavailable on this platform.
    /// ```
    public int unavailable() {
    	return (int) UNAVAILABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #message()
    public CXPlatformAvailability message(Consumer<CXString> consumer) {
    	consumer.accept(message);
    	return this;
    }
    
    /// @see #message()
    public CXPlatformAvailability message(CXString other) {
    	message.set(other);
    	return this;
    }
    
    /// ```
    /// 
    /// An optional message to provide to a user of this API, e.g., to
    /// suggest replacement APIs.
    /// ```
    public CXString message() {
    	return message;
    }
    
    @Override
    public CXPlatformAvailability set(CXPlatformAvailability other) {
        return set(other.segment);
    }
    
    @Override
    public CXPlatformAvailability set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXPlatformAvailability> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXPlatformAvailability> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXPlatformAvailability(segment),
            count
        );
    }
    
    public static NativeStructArray<CXPlatformAvailability> array(Arena arena, CXPlatformAvailability... structs) {
        NativeStructArray<CXPlatformAvailability> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXPlatformAvailability(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXPlatformAvailability> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXPlatformAvailability(segment)
        );
    }

}