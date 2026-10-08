/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.structs;

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

import static volucris.bindings.core.FFMUtils.*;

/// ```
/// 
/// Called when a file gets \#included/\#imported.
/// ```
public abstract class PpIncludedFileFunction {

    private static final Map<Long, WeakReference<PpIncludedFileFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(PpIncludedFileFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public PpIncludedFileFunction() {
        this(Arena.ofAuto());
    }

    public PpIncludedFileFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public MemorySegment invoke(
        MemorySegment client_data,
        MemorySegment param1
    ) {
        return invoke(
            client_data,
            new CXIdxIncludedFileInfo(param1)
        );
    }

    public MemorySegment invoke(
        MemorySegment client_data,
        CXIdxIncludedFileInfo param1
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in PpIncludedFileFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable PpIncludedFileFunction get(MemorySegment segment) {
        WeakReference<PpIncludedFileFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}