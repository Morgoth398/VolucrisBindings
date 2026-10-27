/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.mimalloc;

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

public abstract class MiBlockVisitFun {

    private static final Map<Long, WeakReference<MiBlockVisitFun>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_BOOLEAN, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_LONG, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MiBlockVisitFun.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MiBlockVisitFun() {
        this(Arena.ofAuto());
    }

    public MiBlockVisitFun(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        MemorySegment heap,
        MemorySegment area,
        MemorySegment block,
        long block_size,
        MemorySegment arg
    ) {
        return invoke(
            new MiHeap(heap),
            new MiHeapArea(area),
            block,
            block_size,
            arg
        );
    }

    public boolean invoke(
        MiHeap heap,
        MiHeapArea area,
        MemorySegment block,
        long block_size,
        MemorySegment arg
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MiBlockVisitFun."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MiBlockVisitFun get(MemorySegment segment) {
        WeakReference<MiBlockVisitFun> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}