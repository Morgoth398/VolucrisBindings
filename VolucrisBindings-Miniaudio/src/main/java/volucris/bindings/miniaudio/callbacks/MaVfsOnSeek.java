/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.callbacks;

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

public abstract class MaVfsOnSeek {

    private static final Map<Long, WeakReference<MaVfsOnSeek>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_LONG, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MaVfsOnSeek.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaVfsOnSeek() {
        this(Arena.ofAuto());
    }

    public MaVfsOnSeek(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment pVFS,
        MemorySegment file,
        long offset,
        int origin
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaVfsOnSeek."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaVfsOnSeek get(MemorySegment segment) {
        WeakReference<MaVfsOnSeek> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}