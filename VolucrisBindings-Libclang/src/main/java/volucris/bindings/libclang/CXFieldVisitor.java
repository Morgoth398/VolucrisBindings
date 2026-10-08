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
import volucris.bindings.libclang.structs.CXCursor;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// 
/// Visitor invoked for each field found by a traversal.
/// 
/// This visitor function will be invoked for each field found by
/// \c clang_Type_visitFields. Its first argument is the cursor being
/// visited, its second argument is the client data provided to
/// \c clang_Type_visitFields.
/// 
/// The visitor should return one of the \c CXVisitorResult values
/// to direct \c clang_Type_visitFields.
/// ```
public abstract class CXFieldVisitor {

    private static final Map<Long, WeakReference<CXFieldVisitor>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            CXCursor.LAYOUT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(CXFieldVisitor.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CXFieldVisitor() {
        this(Arena.ofAuto());
    }

    public CXFieldVisitor(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment C,
        MemorySegment client_data
    ) {
        return invoke(
            new CXCursor(C),
            client_data
        );
    }

    public int invoke(
        CXCursor C,
        MemorySegment client_data
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CXFieldVisitor."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable CXFieldVisitor get(MemorySegment segment) {
        WeakReference<CXFieldVisitor> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}