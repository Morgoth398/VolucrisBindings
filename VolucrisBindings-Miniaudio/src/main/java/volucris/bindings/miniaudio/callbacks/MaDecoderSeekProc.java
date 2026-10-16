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
import volucris.bindings.miniaudio.structs.MaDecoder;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class MaDecoderSeekProc {

    private static final Map<Long, WeakReference<MaDecoderSeekProc>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(MaDecoderSeekProc.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaDecoderSeekProc() {
        this(Arena.ofAuto());
    }

    public MaDecoderSeekProc(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment pDecoder,
        long byteOffset,
        int origin
    ) {
        return invoke(
            new MaDecoder(pDecoder),
            byteOffset,
            origin
        );
    }

    public int invoke(
        MaDecoder pDecoder,
        long byteOffset,
        int origin
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaDecoderSeekProc."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaDecoderSeekProc get(MemorySegment segment) {
        WeakReference<MaDecoderSeekProc> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}