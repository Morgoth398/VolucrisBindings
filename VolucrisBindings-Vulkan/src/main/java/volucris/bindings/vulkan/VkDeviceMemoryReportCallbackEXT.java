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
import volucris.bindings.vulkan.structs.VkDeviceMemoryReportCallbackDataEXT;

import static volucris.bindings.core.FFMUtils.*;

public abstract class VkDeviceMemoryReportCallbackEXT {

    private static final Map<Long, WeakReference<VkDeviceMemoryReportCallbackEXT>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(VkDeviceMemoryReportCallbackEXT.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public VkDeviceMemoryReportCallbackEXT() {
        this(Arena.ofAuto());
    }

    public VkDeviceMemoryReportCallbackEXT(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment pCallbackData,
        MemorySegment pUserData
    ) {
        invoke(
            new VkDeviceMemoryReportCallbackDataEXT(pCallbackData),
            pUserData
        );
    }

    public void invoke(
        VkDeviceMemoryReportCallbackDataEXT pCallbackData,
        MemorySegment pUserData
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in VkDeviceMemoryReportCallbackEXT."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable VkDeviceMemoryReportCallbackEXT get(MemorySegment segment) {
        WeakReference<VkDeviceMemoryReportCallbackEXT> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}