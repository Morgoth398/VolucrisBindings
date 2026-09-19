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
import volucris.bindings.assimp.structs.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class AiFileSeek {

    private static final Map<Long, WeakReference<AiFileSeek>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            JAVA_LONG, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(AiFileSeek.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AiFileSeek() {
        this(Arena.ofAuto());
    }

    public AiFileSeek(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment param0,
        long param1,
        int param2
    ) {
        return invoke(
            new AiFile(param0),
            param1,
            param2
        );
    }

    public int invoke(
        AiFile param0,
        long param1,
        int param2
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in AiFileSeek."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable AiFileSeek get(MemorySegment segment) {
        WeakReference<AiFileSeek> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}