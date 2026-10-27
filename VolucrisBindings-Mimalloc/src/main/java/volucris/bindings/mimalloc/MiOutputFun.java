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
import volucris.bindings.core.NativeByteArray;

import static volucris.bindings.core.FFMUtils.*;

public abstract class MiOutputFun {

    private static final Map<Long, WeakReference<MiOutputFun>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MiOutputFun.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MiOutputFun() {
        this(Arena.ofAuto());
    }

    public MiOutputFun(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment msg,
        MemorySegment arg
    ) {
        invoke(
            new NativeByteArray(msg),
            arg
        );
    }

    public void invoke(
        NativeByteArray msg,
        MemorySegment arg
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MiOutputFun."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MiOutputFun get(MemorySegment segment) {
        WeakReference<MiOutputFun> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}