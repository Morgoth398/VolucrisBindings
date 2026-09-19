/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.callbacks;

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
import volucris.bindings.core.NativeByteArray;

import static volucris.bindings.core.FFMUtils.*;

public abstract class AiLogStreamCallback {

    private static final Map<Long, WeakReference<AiLogStreamCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(AiLogStreamCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AiLogStreamCallback() {
        this(Arena.ofAuto());
    }

    public AiLogStreamCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment param0,
        MemorySegment param1
    ) {
        invoke(
            new NativeByteArray(param0),
            new NativeByteArray(param1)
        );
    }

    public void invoke(
        NativeByteArray param0,
        NativeByteArray param1
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in AiLogStreamCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable AiLogStreamCallback get(MemorySegment segment) {
        WeakReference<AiLogStreamCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}