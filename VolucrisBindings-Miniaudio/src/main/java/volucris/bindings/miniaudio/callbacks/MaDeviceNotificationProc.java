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
import volucris.bindings.miniaudio.structs.MaDeviceNotification;

import static volucris.bindings.core.FFMUtils.*;

public abstract class MaDeviceNotificationProc {

    private static final Map<Long, WeakReference<MaDeviceNotificationProc>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MaDeviceNotificationProc.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaDeviceNotificationProc() {
        this(Arena.ofAuto());
    }

    public MaDeviceNotificationProc(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment pNotification
    ) {
        invoke(
            new MaDeviceNotification(pNotification)
        );
    }

    public void invoke(
        MaDeviceNotification pNotification
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaDeviceNotificationProc."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaDeviceNotificationProc get(MemorySegment segment) {
        WeakReference<MaDeviceNotificationProc> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}