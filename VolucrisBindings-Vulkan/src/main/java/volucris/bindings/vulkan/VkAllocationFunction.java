/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan;

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

public abstract class VkAllocationFunction {

    private static final Map<Long, WeakReference<VkAllocationFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_LONG, 
            JAVA_LONG, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(VkAllocationFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public VkAllocationFunction() {
        this(Arena.ofAuto());
    }

    public VkAllocationFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public MemorySegment invoke(
        MemorySegment pUserData,
        long size,
        long alignment,
        int allocationScope
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in VkAllocationFunction."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable VkAllocationFunction get(MemorySegment segment) {
        WeakReference<VkAllocationFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}