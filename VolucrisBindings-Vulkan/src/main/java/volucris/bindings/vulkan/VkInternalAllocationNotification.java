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

public abstract class VkInternalAllocationNotification {

    private static final Map<Long, WeakReference<VkInternalAllocationNotification>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            JAVA_LONG, 
            JAVA_INT, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(VkInternalAllocationNotification.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public VkInternalAllocationNotification() {
        this(Arena.ofAuto());
    }

    public VkInternalAllocationNotification(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment pUserData,
        long size,
        int allocationType,
        int allocationScope
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in VkInternalAllocationNotification."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable VkInternalAllocationNotification get(MemorySegment segment) {
        WeakReference<VkInternalAllocationNotification> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}