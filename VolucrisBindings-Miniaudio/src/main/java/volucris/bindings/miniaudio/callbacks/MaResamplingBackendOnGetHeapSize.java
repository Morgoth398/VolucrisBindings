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
import volucris.bindings.miniaudio.structs.MaResamplerConfig;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class MaResamplingBackendOnGetHeapSize {

    private static final Map<Long, WeakReference<MaResamplingBackendOnGetHeapSize>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(MaResamplingBackendOnGetHeapSize.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaResamplingBackendOnGetHeapSize() {
        this(Arena.ofAuto());
    }

    public MaResamplingBackendOnGetHeapSize(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment pUserData,
        MemorySegment pConfig,
        MemorySegment pHeapSizeInBytes
    ) {
        return invoke(
            pUserData,
            new MaResamplerConfig(pConfig),
            new NativeLongArray(pHeapSizeInBytes)
        );
    }

    public int invoke(
        MemorySegment pUserData,
        MaResamplerConfig pConfig,
        NativeLongArray pHeapSizeInBytes
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaResamplingBackendOnGetHeapSize."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaResamplingBackendOnGetHeapSize get(MemorySegment segment) {
        WeakReference<MaResamplingBackendOnGetHeapSize> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}