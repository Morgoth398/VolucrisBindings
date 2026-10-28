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

/// ```
/// Called when a call to map memory pages fails (out of memory). If this callback is not set or returns zero the
/// library will return a null pointer in the allocation call. If this callback returns non-zero the map call will
/// be retried. The argument passed is the number of bytes that was requested in the map call. Only used if the
/// default system memory map function is used (memory_map callback is not set).
/// ```
public abstract class RpmallocFailCallback {

    private static final Map<Long, WeakReference<RpmallocFailCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            JAVA_LONG
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(RpmallocFailCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public RpmallocFailCallback() {
        this(Arena.ofAuto());
    }

    public RpmallocFailCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        long size
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in RpmallocFailCallback."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable RpmallocFailCallback get(MemorySegment segment) {
        WeakReference<RpmallocFailCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}