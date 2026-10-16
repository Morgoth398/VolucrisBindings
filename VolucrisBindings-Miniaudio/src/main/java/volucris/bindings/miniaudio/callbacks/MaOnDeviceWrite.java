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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.miniaudio.structs.MaDevice;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class MaOnDeviceWrite {

    private static final Map<Long, WeakReference<MaOnDeviceWrite>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MaOnDeviceWrite.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaOnDeviceWrite() {
        this(Arena.ofAuto());
    }

    public MaOnDeviceWrite(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment pDevice,
        MemorySegment pFrames,
        int frameCount,
        MemorySegment pFramesWritten
    ) {
        return invoke(
            new MaDevice(pDevice),
            pFrames,
            frameCount,
            new NativeIntArray(pFramesWritten)
        );
    }

    public int invoke(
        MaDevice pDevice,
        MemorySegment pFrames,
        int frameCount,
        NativeIntArray pFramesWritten
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaOnDeviceWrite."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaOnDeviceWrite get(MemorySegment segment) {
        WeakReference<MaOnDeviceWrite> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}