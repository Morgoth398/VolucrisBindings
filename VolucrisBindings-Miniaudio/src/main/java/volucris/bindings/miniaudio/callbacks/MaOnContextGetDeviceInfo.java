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
import volucris.bindings.miniaudio.structs.MaContext;
import volucris.bindings.miniaudio.structs.MaDeviceId;
import volucris.bindings.miniaudio.structs.MaDeviceInfo;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class MaOnContextGetDeviceInfo {

    private static final Map<Long, WeakReference<MaOnContextGetDeviceInfo>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MaOnContextGetDeviceInfo.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaOnContextGetDeviceInfo() {
        this(Arena.ofAuto());
    }

    public MaOnContextGetDeviceInfo(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment pContext,
        int deviceType,
        MemorySegment pDeviceID,
        MemorySegment pDeviceInfo
    ) {
        return invoke(
            new MaContext(pContext),
            deviceType,
            new MaDeviceId(pDeviceID),
            new MaDeviceInfo(pDeviceInfo)
        );
    }

    public int invoke(
        MaContext pContext,
        int deviceType,
        MaDeviceId pDeviceID,
        MaDeviceInfo pDeviceInfo
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaOnContextGetDeviceInfo."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaOnContextGetDeviceInfo get(MemorySegment segment) {
        WeakReference<MaOnContextGetDeviceInfo> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}