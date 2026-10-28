/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.rpmalloc;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeLongArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Map memory pages for the given number of bytes. The returned address MUST be aligned to the given alignment,
/// which will always be either 0 or the span size. The function can store an alignment offset in the offset
/// variable in case it performs alignment and the returned pointer is offset from the actual start of the memory
/// region due to this alignment. This alignment offset will be passed to the memory unmap function. The mapped size
/// can be stored in the mapped_size variable, which will also be passed to the memory unmap function as the release
/// parameter once the entire mapped region is ready to be released. If you set a memory_map function, you must also
/// set a memory_unmap function or else the default implementation will be used for both. This function must be
/// thread safe, it can be called by multiple threads simultaneously.
/// ```
public abstract class RpmallocMemoryMap {

    private static final Map<Long, WeakReference<RpmallocMemoryMap>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            UNBOUNDED_ADDRESS, 
            JAVA_LONG, 
            JAVA_LONG, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(RpmallocMemoryMap.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public RpmallocMemoryMap() {
        this(Arena.ofAuto());
    }

    public RpmallocMemoryMap(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public MemorySegment invoke(
        long size,
        long alignment,
        MemorySegment offset,
        MemorySegment mapped_size
    ) {
        return invoke(
            size,
            alignment,
            new NativeLongArray(offset),
            new NativeLongArray(mapped_size)
        );
    }

    public MemorySegment invoke(
        long size,
        long alignment,
        NativeLongArray offset,
        NativeLongArray mapped_size
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in RpmallocMemoryMap."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable RpmallocMemoryMap get(MemorySegment segment) {
        WeakReference<RpmallocMemoryMap> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}