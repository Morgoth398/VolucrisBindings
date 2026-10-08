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

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class CXCursorAndRangeVisitorFunction {

    private static final Map<Long, WeakReference<CXCursorAndRangeVisitorFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            CXCursor.LAYOUT, 
            CXSourceRange.LAYOUT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(CXCursorAndRangeVisitorFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CXCursorAndRangeVisitorFunction() {
        this(Arena.ofAuto());
    }

    public CXCursorAndRangeVisitorFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment context,
        MemorySegment param1,
        MemorySegment param2
    ) {
        return invoke(
            context,
            new CXCursor(param1),
            new CXSourceRange(param2)
        );
    }

    public int invoke(
        MemorySegment context,
        CXCursor param1,
        CXSourceRange param2
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CXCursorAndRangeVisitorFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable CXCursorAndRangeVisitorFunction get(MemorySegment segment) {
        WeakReference<CXCursorAndRangeVisitorFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}