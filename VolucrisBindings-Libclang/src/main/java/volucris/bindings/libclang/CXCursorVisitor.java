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
/// Visitor invoked for each cursor found by a traversal.
/// 
/// This visitor function will be invoked for each cursor found by
/// clang_visitCursorChildren(). Its first argument is the cursor being
/// visited, its second argument is the parent visitor for that cursor,
/// and its third argument is the client data provided to
/// clang_visitCursorChildren().
/// 
/// The visitor should return one of the \c CXChildVisitResult values
/// to direct clang_visitCursorChildren().
/// ```
public abstract class CXCursorVisitor {

    private static final Map<Long, WeakReference<CXCursorVisitor>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            CXCursor.LAYOUT, 
            CXCursor.LAYOUT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(CXCursorVisitor.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CXCursorVisitor() {
        this(Arena.ofAuto());
    }

    public CXCursorVisitor(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment cursor,
        MemorySegment parent,
        MemorySegment client_data
    ) {
        return invoke(
            new CXCursor(cursor),
            new CXCursor(parent),
            client_data
        );
    }

    public int invoke(
        CXCursor cursor,
        CXCursor parent,
        MemorySegment client_data
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CXCursorVisitor."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable CXCursorVisitor get(MemorySegment segment) {
        WeakReference<CXCursorVisitor> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}