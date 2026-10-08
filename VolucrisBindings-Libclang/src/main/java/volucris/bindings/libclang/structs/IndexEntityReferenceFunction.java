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
/// Called to index a reference of an entity.
/// ```
public abstract class IndexEntityReferenceFunction {

    private static final Map<Long, WeakReference<IndexEntityReferenceFunction>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(IndexEntityReferenceFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public IndexEntityReferenceFunction() {
        this(Arena.ofAuto());
    }

    public IndexEntityReferenceFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment client_data,
        MemorySegment param1
    ) {
        invoke(
            client_data,
            new CXIdxEntityRefInfo(param1)
        );
    }

    public void invoke(
        MemorySegment client_data,
        CXIdxEntityRefInfo param1
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in IndexEntityReferenceFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable IndexEntityReferenceFunction get(MemorySegment segment) {
        WeakReference<IndexEntityReferenceFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}