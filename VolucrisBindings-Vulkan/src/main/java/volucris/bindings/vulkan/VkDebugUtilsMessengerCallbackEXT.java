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
import volucris.bindings.vulkan.structs.VkDebugUtilsMessengerCallbackDataEXT;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class VkDebugUtilsMessengerCallbackEXT {

    private static final Map<Long, WeakReference<VkDebugUtilsMessengerCallbackEXT>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            JAVA_INT, 
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(VkDebugUtilsMessengerCallbackEXT.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public VkDebugUtilsMessengerCallbackEXT() {
        this(Arena.ofAuto());
    }

    public VkDebugUtilsMessengerCallbackEXT(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        int messageSeverity,
        int messageTypes,
        MemorySegment pCallbackData,
        MemorySegment pUserData
    ) {
        return invoke(
            messageSeverity,
            messageTypes,
            new VkDebugUtilsMessengerCallbackDataEXT(pCallbackData),
            pUserData
        );
    }

    public int invoke(
        int messageSeverity,
        int messageTypes,
        VkDebugUtilsMessengerCallbackDataEXT pCallbackData,
        MemorySegment pUserData
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in VkDebugUtilsMessengerCallbackEXT."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable VkDebugUtilsMessengerCallbackEXT get(MemorySegment segment) {
        WeakReference<VkDebugUtilsMessengerCallbackEXT> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}