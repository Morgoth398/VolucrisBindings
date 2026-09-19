/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.par;

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
import volucris.bindings.core.NativeFloatArray;

import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Create a parametric surface from a callback function that consumes a 2D
/// point in [0,1] and produces a 3D point.
/// ```
public abstract class ParShapesFunction {

    private static final Map<Long, WeakReference<ParShapesFunction>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(ParShapesFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ParShapesFunction() {
        this(Arena.ofAuto());
    }

    public ParShapesFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment param0,
        MemorySegment param1,
        MemorySegment param2
    ) {
        invoke(
            new NativeFloatArray(param0),
            new NativeFloatArray(param1),
            param2
        );
    }

    public void invoke(
        NativeFloatArray param0,
        NativeFloatArray param1,
        MemorySegment param2
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in ParShapesFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable ParShapesFunction get(MemorySegment segment) {
        WeakReference<ParShapesFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}