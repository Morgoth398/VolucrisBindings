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
/// Called when a AST file (PCH or module) gets imported.
/// 
/// AST files will not get indexed (there will not be callbacks to index all
/// the entities in an AST file). The recommended action is that, if the AST
/// file is not already indexed, to initiate a new indexing job specific to
/// the AST file.
/// ```
public abstract class ImportedASTFileFunction {

    private static final Map<Long, WeakReference<ImportedASTFileFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(ImportedASTFileFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ImportedASTFileFunction() {
        this(Arena.ofAuto());
    }

    public ImportedASTFileFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public MemorySegment invoke(
        MemorySegment client_data,
        MemorySegment param1
    ) {
        return invoke(
            client_data,
            new CXIdxImportedASTFileInfo(param1)
        );
    }

    public MemorySegment invoke(
        MemorySegment client_data,
        CXIdxImportedASTFileInfo param1
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in ImportedASTFileFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable ImportedASTFileFunction get(MemorySegment segment) {
        WeakReference<ImportedASTFileFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}