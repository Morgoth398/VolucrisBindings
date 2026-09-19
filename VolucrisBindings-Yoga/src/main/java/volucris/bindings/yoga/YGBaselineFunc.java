/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.yoga;

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

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// 
/// @returns a defined offset to baseline (ascent).
/// ```
public abstract class YGBaselineFunc {

    private static final Map<Long, WeakReference<YGBaselineFunc>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_FLOAT, 
            UNBOUNDED_ADDRESS, 
            JAVA_FLOAT, 
            JAVA_FLOAT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(YGBaselineFunc.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public YGBaselineFunc() {
        this(Arena.ofAuto());
    }

    public YGBaselineFunc(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public float invoke(
        MemorySegment node,
        float width,
        float height
    ) {
        return invoke(
            new YGNode(node),
            width,
            height
        );
    }

    public float invoke(
        YGNode node,
        float width,
        float height
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in YGBaselineFunc."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable YGBaselineFunc get(MemorySegment segment) {
        WeakReference<YGBaselineFunc> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}