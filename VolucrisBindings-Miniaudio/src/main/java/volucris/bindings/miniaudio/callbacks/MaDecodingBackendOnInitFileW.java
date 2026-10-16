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
import volucris.bindings.core.NativeShortArray;
import volucris.bindings.miniaudio.structs.MaAllocationCallbacks;
import volucris.bindings.miniaudio.structs.MaDecodingBackendConfig;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class MaDecodingBackendOnInitFileW {

    private static final Map<Long, WeakReference<MaDecodingBackendOnInitFileW>> CACHE;

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
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MaDecodingBackendOnInitFileW.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaDecodingBackendOnInitFileW() {
        this(Arena.ofAuto());
    }

    public MaDecodingBackendOnInitFileW(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment pUserData,
        MemorySegment pFilePath,
        MemorySegment pConfig,
        MemorySegment pAllocationCallbacks,
        MemorySegment ppBackend
    ) {
        return invoke(
            pUserData,
            new NativeShortArray(pFilePath),
            new MaDecodingBackendConfig(pConfig),
            new MaAllocationCallbacks(pAllocationCallbacks),
            new NativePointerArray(ppBackend)
        );
    }

    public int invoke(
        MemorySegment pUserData,
        NativeShortArray pFilePath,
        MaDecodingBackendConfig pConfig,
        MaAllocationCallbacks pAllocationCallbacks,
        NativePointerArray ppBackend
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaDecodingBackendOnInitFileW."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaDecodingBackendOnInitFileW get(MemorySegment segment) {
        WeakReference<MaDecodingBackendOnInitFileW> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}