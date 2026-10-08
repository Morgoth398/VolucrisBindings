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
import volucris.bindings.libclang.structs.CXSourceLocation;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// 
/// Visitor invoked for each file in a translation unit
/// (used with clang_getInclusions()).
/// 
/// This visitor function will be invoked by clang_getInclusions() for each
/// file included (either at the top-level or by \#include directives) within
/// a translation unit.  The first argument is the file being included, and
/// the second and third arguments provide the inclusion stack.  The
/// array is sorted in order of immediate inclusion.  For example,
/// the first element refers to the location that included 'included_file'.
/// ```
public abstract class CXInclusionVisitor {

    private static final Map<Long, WeakReference<CXInclusionVisitor>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(CXInclusionVisitor.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CXInclusionVisitor() {
        this(Arena.ofAuto());
    }

    public CXInclusionVisitor(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment included_file,
        MemorySegment inclusion_stack,
        int include_len,
        MemorySegment client_data
    ) {
        invoke(
            included_file,
            new CXSourceLocation(inclusion_stack),
            include_len,
            client_data
        );
    }

    public void invoke(
        MemorySegment included_file,
        CXSourceLocation inclusion_stack,
        int include_len,
        MemorySegment client_data
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CXInclusionVisitor."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable CXInclusionVisitor get(MemorySegment segment) {
        WeakReference<CXInclusionVisitor> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}