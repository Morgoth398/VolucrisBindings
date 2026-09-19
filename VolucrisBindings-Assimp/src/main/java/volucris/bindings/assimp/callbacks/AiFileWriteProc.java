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
import volucris.bindings.core.NativeByteArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class AiFileWriteProc {

    private static final Map<Long, WeakReference<AiFileWriteProc>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_LONG, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_LONG, 
            JAVA_LONG
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(AiFileWriteProc.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AiFileWriteProc() {
        this(Arena.ofAuto());
    }

    public AiFileWriteProc(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public long invoke(
        MemorySegment param0,
        MemorySegment param1,
        long param2,
        long param3
    ) {
        return invoke(
            new AiFile(param0),
            new NativeByteArray(param1),
            param2,
            param3
        );
    }

    public long invoke(
        AiFile param0,
        NativeByteArray param1,
        long param2,
        long param3
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in AiFileWriteProc."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable AiFileWriteProc get(MemorySegment segment) {
        WeakReference<AiFileWriteProc> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}