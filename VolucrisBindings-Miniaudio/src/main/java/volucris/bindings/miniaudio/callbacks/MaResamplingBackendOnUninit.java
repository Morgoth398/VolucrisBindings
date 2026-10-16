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
import volucris.bindings.miniaudio.structs.MaAllocationCallbacks;

import static volucris.bindings.core.FFMUtils.*;

public abstract class MaResamplingBackendOnUninit {

    private static final Map<Long, WeakReference<MaResamplingBackendOnUninit>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MaResamplingBackendOnUninit.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaResamplingBackendOnUninit() {
        this(Arena.ofAuto());
    }

    public MaResamplingBackendOnUninit(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment pUserData,
        MemorySegment pBackend,
        MemorySegment pAllocationCallbacks
    ) {
        invoke(
            pUserData,
            pBackend,
            new MaAllocationCallbacks(pAllocationCallbacks)
        );
    }

    public void invoke(
        MemorySegment pUserData,
        MemorySegment pBackend,
        MaAllocationCallbacks pAllocationCallbacks
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaResamplingBackendOnUninit."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaResamplingBackendOnUninit get(MemorySegment segment) {
        WeakReference<MaResamplingBackendOnUninit> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}