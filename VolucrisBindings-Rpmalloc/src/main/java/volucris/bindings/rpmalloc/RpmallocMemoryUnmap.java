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

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Unmap the memory pages starting at address and spanning the given number of bytes. If you set a memory_unmap
/// function, you must also set a memory_map function or else the default implementation will be used for both. This
/// function must be thread safe, it can be called by multiple threads simultaneously.
/// ```
public abstract class RpmallocMemoryUnmap {

    private static final Map<Long, WeakReference<RpmallocMemoryUnmap>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            JAVA_LONG, 
            JAVA_LONG
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(RpmallocMemoryUnmap.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public RpmallocMemoryUnmap() {
        this(Arena.ofAuto());
    }

    public RpmallocMemoryUnmap(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment address,
        long offset,
        long mapped_size
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in RpmallocMemoryUnmap."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable RpmallocMemoryUnmap get(MemorySegment segment) {
        WeakReference<RpmallocMemoryUnmap> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}