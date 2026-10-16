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
import volucris.bindings.miniaudio.structs.MaEncoder;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class MaEncoderWritePcmFrameProc {

    private static final Map<Long, WeakReference<MaEncoderWritePcmFrameProc>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(MaEncoderWritePcmFrameProc.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaEncoderWritePcmFrameProc() {
        this(Arena.ofAuto());
    }

    public MaEncoderWritePcmFrameProc(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment pEncoder,
        MemorySegment pFramesIn,
        long frameCount,
        MemorySegment pFramesWritten
    ) {
        return invoke(
            new MaEncoder(pEncoder),
            pFramesIn,
            frameCount,
            new NativeLongArray(pFramesWritten)
        );
    }

    public int invoke(
        MaEncoder pEncoder,
        MemorySegment pFramesIn,
        long frameCount,
        NativeLongArray pFramesWritten
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaEncoderWritePcmFrameProc."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaEncoderWritePcmFrameProc get(MemorySegment segment) {
        WeakReference<MaEncoderWritePcmFrameProc> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}