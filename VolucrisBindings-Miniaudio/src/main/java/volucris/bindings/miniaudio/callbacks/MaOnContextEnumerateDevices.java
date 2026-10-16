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

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class MaOnContextEnumerateDevices {

    private static final Map<Long, WeakReference<MaOnContextEnumerateDevices>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MaOnContextEnumerateDevices.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaOnContextEnumerateDevices() {
        this(Arena.ofAuto());
    }

    public MaOnContextEnumerateDevices(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment pContext,
        MemorySegment callback,
        MemorySegment pUserData
    ) {
        return invoke(
            new MaContext(pContext),
            MaEnumDevicesCallbackProc.get(callback),
            pUserData
        );
    }

    public int invoke(
        MaContext pContext,
        MaEnumDevicesCallbackProc callback,
        MemorySegment pUserData
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaOnContextEnumerateDevices."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaOnContextEnumerateDevices get(MemorySegment segment) {
        WeakReference<MaOnContextEnumerateDevices> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}