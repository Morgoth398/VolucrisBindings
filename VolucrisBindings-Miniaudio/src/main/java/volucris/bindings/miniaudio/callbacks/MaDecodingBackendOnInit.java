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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.miniaudio.structs.MaAllocationCallbacks;
import volucris.bindings.miniaudio.structs.MaDecodingBackendConfig;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class MaDecodingBackendOnInit {

    private static final Map<Long, WeakReference<MaDecodingBackendOnInit>> CACHE;

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
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MaDecodingBackendOnInit.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaDecodingBackendOnInit() {
        this(Arena.ofAuto());
    }

    public MaDecodingBackendOnInit(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment pUserData,
        MemorySegment onRead,
        MemorySegment onSeek,
        MemorySegment onTell,
        MemorySegment pReadSeekTellUserData,
        MemorySegment pConfig,
        MemorySegment pAllocationCallbacks,
        MemorySegment ppBackend
    ) {
        return invoke(
            pUserData,
            MaReadProc.get(onRead),
            MaSeekProc.get(onSeek),
            MaTellProc.get(onTell),
            pReadSeekTellUserData,
            new MaDecodingBackendConfig(pConfig),
            new MaAllocationCallbacks(pAllocationCallbacks),
            new NativePointerArray(ppBackend)
        );
    }

    public int invoke(
        MemorySegment pUserData,
        MaReadProc onRead,
        MaSeekProc onSeek,
        MaTellProc onTell,
        MemorySegment pReadSeekTellUserData,
        MaDecodingBackendConfig pConfig,
        MaAllocationCallbacks pAllocationCallbacks,
        NativePointerArray ppBackend
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaDecodingBackendOnInit."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaDecodingBackendOnInit get(MemorySegment segment) {
        WeakReference<MaDecodingBackendOnInit> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}