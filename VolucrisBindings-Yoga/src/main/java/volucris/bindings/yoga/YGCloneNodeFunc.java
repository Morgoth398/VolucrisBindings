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
/// Function pointer type for YGConfigSetCloneNodeFunc.
/// ```
public abstract class YGCloneNodeFunc {

    private static final Map<Long, WeakReference<YGCloneNodeFunc>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_LONG
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(YGCloneNodeFunc.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public YGCloneNodeFunc() {
        this(Arena.ofAuto());
    }

    public YGCloneNodeFunc(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public MemorySegment invoke(
        MemorySegment oldNode,
        MemorySegment owner,
        long childIndex
    ) {
        return invoke(
            new YGNode(oldNode),
            new YGNode(owner),
            childIndex
        ).memorySegment();
    }

    public YGNode invoke(
        YGNode oldNode,
        YGNode owner,
        long childIndex
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in YGCloneNodeFunc."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable YGCloneNodeFunc get(MemorySegment segment) {
        WeakReference<YGCloneNodeFunc> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}