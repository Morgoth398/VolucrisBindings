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

import static volucris.bindings.core.FFMUtils.*;

public abstract class AiFileCloseProc {

    private static final Map<Long, WeakReference<AiFileCloseProc>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(AiFileCloseProc.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AiFileCloseProc() {
        this(Arena.ofAuto());
    }

    public AiFileCloseProc(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment param0,
        MemorySegment param1
    ) {
        invoke(
            new AiFileIO(param0),
            new AiFile(param1)
        );
    }

    public void invoke(
        AiFileIO param0,
        AiFile param1
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in AiFileCloseProc."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable AiFileCloseProc get(MemorySegment segment) {
        WeakReference<AiFileCloseProc> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}