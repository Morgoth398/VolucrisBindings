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
import volucris.bindings.miniaudio.structs.MaEncoder;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class MaEncoderSeekProc {

    private static final Map<Long, WeakReference<MaEncoderSeekProc>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            JAVA_LONG, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MaEncoderSeekProc.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaEncoderSeekProc() {
        this(Arena.ofAuto());
    }

    public MaEncoderSeekProc(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment pEncoder,
        long offset,
        int origin
    ) {
        return invoke(
            new MaEncoder(pEncoder),
            offset,
            origin
        );
    }

    public int invoke(
        MaEncoder pEncoder,
        long offset,
        int origin
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaEncoderSeekProc."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaEncoderSeekProc get(MemorySegment segment) {
        WeakReference<MaEncoderSeekProc> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}