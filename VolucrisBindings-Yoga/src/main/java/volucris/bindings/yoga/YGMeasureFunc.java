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
/// Returns the computed dimensions of the node, following the constraints of
/// `widthMode` and `heightMode`:
/// 
/// YGMeasureModeUndefined: The parent has not imposed any constraint on the
/// child. It can be whatever size it wants.
/// 
/// YGMeasureModeAtMost: The child can be as large as it wants up to the
/// specified size.
/// 
/// YGMeasureModeExactly: The parent has determined an exact size for the
/// child. The child is going to be given those bounds regardless of how big it
/// wants to be.
/// 
/// @returns the size of the leaf node, measured under the given constraints.
/// ```
public abstract class YGMeasureFunc {

    private static final Map<Long, WeakReference<YGMeasureFunc>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            YGSize.LAYOUT, 
            UNBOUNDED_ADDRESS, 
            JAVA_FLOAT, 
            JAVA_INT, 
            JAVA_FLOAT, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(YGMeasureFunc.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public YGMeasureFunc() {
        this(Arena.ofAuto());
    }

    public YGMeasureFunc(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public MemorySegment invoke(
        MemorySegment node,
        float width,
        int widthMode,
        float height,
        int heightMode
    ) {
        return invoke(
            new YGNode(node),
            width,
            widthMode,
            height,
            heightMode
        ).memorySegment();
    }

    public YGSize invoke(
        YGNode node,
        float width,
        int widthMode,
        float height,
        int heightMode
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in YGMeasureFunc."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable YGMeasureFunc get(MemorySegment segment) {
        WeakReference<YGMeasureFunc> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}