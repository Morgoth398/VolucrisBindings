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
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.miniaudio.structs.MaDecoder;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class MaDecoderReadProc {

    private static final Map<Long, WeakReference<MaDecoderReadProc>> CACHE;

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
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MaDecoderReadProc.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaDecoderReadProc() {
        this(Arena.ofAuto());
    }

    public MaDecoderReadProc(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment pDecoder,
        MemorySegment pBufferOut,
        long bytesToRead,
        MemorySegment pBytesRead
    ) {
        return invoke(
            new MaDecoder(pDecoder),
            pBufferOut,
            bytesToRead,
            new NativeLongArray(pBytesRead)
        );
    }

    public int invoke(
        MaDecoder pDecoder,
        MemorySegment pBufferOut,
        long bytesToRead,
        NativeLongArray pBytesRead
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaDecoderReadProc."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaDecoderReadProc get(MemorySegment segment) {
        WeakReference<MaDecoderReadProc> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}