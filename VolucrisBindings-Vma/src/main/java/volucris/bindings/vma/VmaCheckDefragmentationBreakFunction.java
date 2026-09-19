/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma;

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
/// Callback function called during vmaBeginDefragmentation() to check custom criterion about ending current defragmentation pass.
/// 
/// Should return true if the defragmentation needs to stop current pass.
/// ```
public abstract class VmaCheckDefragmentationBreakFunction {

    private static final Map<Long, WeakReference<VmaCheckDefragmentationBreakFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(VmaCheckDefragmentationBreakFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public VmaCheckDefragmentationBreakFunction() {
        this(Arena.ofAuto());
    }

    public VmaCheckDefragmentationBreakFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment pUserData
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in VmaCheckDefragmentationBreakFunction."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable VmaCheckDefragmentationBreakFunction get(MemorySegment segment) {
        WeakReference<VmaCheckDefragmentationBreakFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}