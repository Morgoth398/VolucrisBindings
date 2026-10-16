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
import volucris.bindings.miniaudio.structs.MaDeviceInfo;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class MaOnDeviceGetInfo {

    private static final Map<Long, WeakReference<MaOnDeviceGetInfo>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MaOnDeviceGetInfo.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaOnDeviceGetInfo() {
        this(Arena.ofAuto());
    }

    public MaOnDeviceGetInfo(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment pDevice,
        int type,
        MemorySegment pDeviceInfo
    ) {
        return invoke(
            new MaDevice(pDevice),
            type,
            new MaDeviceInfo(pDeviceInfo)
        );
    }

    public int invoke(
        MaDevice pDevice,
        int type,
        MaDeviceInfo pDeviceInfo
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaOnDeviceGetInfo."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaOnDeviceGetInfo get(MemorySegment segment) {
        WeakReference<MaOnDeviceGetInfo> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}