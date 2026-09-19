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

import static volucris.bindings.core.FFMUtils.*;

public abstract class AiFileOpenProc {

    private static final Map<Long, WeakReference<AiFileOpenProc>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(AiFileOpenProc.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AiFileOpenProc() {
        this(Arena.ofAuto());
    }

    public AiFileOpenProc(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public MemorySegment invoke(
        MemorySegment param0,
        MemorySegment param1,
        MemorySegment param2
    ) {
        return invoke(
            new AiFileIO(param0),
            param1.getString(0),
            new NativeByteArray(param2)
        ).memorySegment();
    }

    public AiFile invoke(
        AiFileIO param0,
        String param1,
        NativeByteArray param2
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in AiFileOpenProc."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable AiFileOpenProc get(MemorySegment segment) {
        WeakReference<AiFileOpenProc> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}