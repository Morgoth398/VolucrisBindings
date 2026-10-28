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

import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Called when an assert fails, if asserts are enabled. Will use the standard assert() if this is not set.
/// ```
public abstract class RpmallocErrorCallback {

    private static final Map<Long, WeakReference<RpmallocErrorCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(RpmallocErrorCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public RpmallocErrorCallback() {
        this(Arena.ofAuto());
    }

    public RpmallocErrorCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment message
    ) {
        invoke(
            message.getString(0)
        );
    }

    public void invoke(
        String message
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in RpmallocErrorCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable RpmallocErrorCallback get(MemorySegment segment) {
        WeakReference<RpmallocErrorCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}