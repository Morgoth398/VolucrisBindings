/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang;

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

/// ```
/// 
/// Callback invoked by \c clang_ModuleCache_pruneWithCallback() once for each
/// file or directory removed from the module cache.
/// 
/// \param Path the absolute path of the file or directory that was pruned.
/// The pointer is only valid for the duration of the callback.
/// 
/// \param UserData the opaque pointer passed to
/// \c clang_ModuleCache_pruneWithCallback().
/// ```
public abstract class CXModuleCachePruneCallback {

    private static final Map<Long, WeakReference<CXModuleCachePruneCallback>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(CXModuleCachePruneCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CXModuleCachePruneCallback() {
        this(Arena.ofAuto());
    }

    public CXModuleCachePruneCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment Path,
        MemorySegment UserData
    ) {
        invoke(
            new NativeByteArray(Path),
            UserData
        );
    }

    public void invoke(
        NativeByteArray Path,
        MemorySegment UserData
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CXModuleCachePruneCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable CXModuleCachePruneCallback get(MemorySegment segment) {
        WeakReference<CXModuleCachePruneCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}