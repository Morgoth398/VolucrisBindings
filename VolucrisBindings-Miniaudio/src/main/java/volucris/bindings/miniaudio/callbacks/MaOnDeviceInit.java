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
import volucris.bindings.miniaudio.structs.MaDevice;
import volucris.bindings.miniaudio.structs.MaDeviceConfig;
import volucris.bindings.miniaudio.structs.MaDeviceDescriptor;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class MaOnDeviceInit {

    private static final Map<Long, WeakReference<MaOnDeviceInit>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MaOnDeviceInit.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaOnDeviceInit() {
        this(Arena.ofAuto());
    }

    public MaOnDeviceInit(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment pDevice,
        MemorySegment pConfig,
        MemorySegment pDescriptorPlayback,
        MemorySegment pDescriptorCapture
    ) {
        return invoke(
            new MaDevice(pDevice),
            new MaDeviceConfig(pConfig),
            new MaDeviceDescriptor(pDescriptorPlayback),
            new MaDeviceDescriptor(pDescriptorCapture)
        );
    }

    public int invoke(
        MaDevice pDevice,
        MaDeviceConfig pConfig,
        MaDeviceDescriptor pDescriptorPlayback,
        MaDeviceDescriptor pDescriptorCapture
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaOnDeviceInit."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaOnDeviceInit get(MemorySegment segment) {
        WeakReference<MaOnDeviceInit> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}