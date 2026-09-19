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

public abstract class PFNVkDebugReportCallbackEXT {

    private static final Map<Long, WeakReference<PFNVkDebugReportCallbackEXT>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            JAVA_INT, 
            JAVA_INT, 
            JAVA_LONG, 
            JAVA_LONG, 
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(PFNVkDebugReportCallbackEXT.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public PFNVkDebugReportCallbackEXT() {
        this(Arena.ofAuto());
    }

    public PFNVkDebugReportCallbackEXT(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        int flags,
        int objectType,
        long object,
        long location,
        int messageCode,
        MemorySegment pLayerPrefix,
        MemorySegment pMessage,
        MemorySegment pUserData
    ) {
        return invoke(
            flags,
            objectType,
            object,
            location,
            messageCode,
            pLayerPrefix.getString(0),
            pMessage.getString(0),
            pUserData
        );
    }

    public int invoke(
        int flags,
        int objectType,
        long object,
        long location,
        int messageCode,
        String pLayerPrefix,
        String pMessage,
        MemorySegment pUserData
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in PFNVkDebugReportCallbackEXT."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable PFNVkDebugReportCallbackEXT get(MemorySegment segment) {
        WeakReference<PFNVkDebugReportCallbackEXT> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}