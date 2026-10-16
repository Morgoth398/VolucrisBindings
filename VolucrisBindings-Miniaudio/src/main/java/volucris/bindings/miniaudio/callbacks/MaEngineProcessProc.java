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
import volucris.bindings.core.NativeFloatArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class MaEngineProcessProc {

    private static final Map<Long, WeakReference<MaEngineProcessProc>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_LONG
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MaEngineProcessProc.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaEngineProcessProc() {
        this(Arena.ofAuto());
    }

    public MaEngineProcessProc(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment pUserData,
        MemorySegment pFramesOut,
        long frameCount
    ) {
        invoke(
            pUserData,
            new NativeFloatArray(pFramesOut),
            frameCount
        );
    }

    public void invoke(
        MemorySegment pUserData,
        NativeFloatArray pFramesOut,
        long frameCount
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaEngineProcessProc."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaEngineProcessProc get(MemorySegment segment) {
        WeakReference<MaEngineProcessProc> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}