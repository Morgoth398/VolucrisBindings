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
import volucris.bindings.core.NativeByteArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// 
/// Function pointer type for YGConfigSetLogger.
/// ```
public abstract class YGLogger {

    private static final Map<Long, WeakReference<YGLogger>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(YGLogger.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public YGLogger() {
        this(Arena.ofAuto());
    }

    public YGLogger(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment config,
        MemorySegment node,
        int level,
        MemorySegment format,
        MemorySegment args
    ) {
        return invoke(
            new YGConfig(config),
            new YGNode(node),
            level,
            new NativeByteArray(format),
            new NativeByteArray(args)
        );
    }

    public int invoke(
        YGConfig config,
        YGNode node,
        int level,
        NativeByteArray format,
        NativeByteArray args
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in YGLogger."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable YGLogger get(MemorySegment segment) {
        WeakReference<YGLogger> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}