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
import volucris.bindings.miniaudio.structs.MaBackendCallbacks;
import volucris.bindings.miniaudio.structs.MaContext;
import volucris.bindings.miniaudio.structs.MaContextConfig;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class MaOnContextInit {

    private static final Map<Long, WeakReference<MaOnContextInit>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(MaOnContextInit.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaOnContextInit() {
        this(Arena.ofAuto());
    }

    public MaOnContextInit(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment pContext,
        MemorySegment pConfig,
        MemorySegment pCallbacks
    ) {
        return invoke(
            new MaContext(pContext),
            new MaContextConfig(pConfig),
            new MaBackendCallbacks(pCallbacks)
        );
    }

    public int invoke(
        MaContext pContext,
        MaContextConfig pConfig,
        MaBackendCallbacks pCallbacks
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaOnContextInit."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaOnContextInit get(MemorySegment segment) {
        WeakReference<MaOnContextInit> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}