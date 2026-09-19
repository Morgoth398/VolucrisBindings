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
import volucris.bindings.vulkan.handles.VkDeviceMemory;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Callback function called after successful vkAllocateMemory.
/// ```
public abstract class VmaAllocateDeviceMemoryFunction {

    private static final Map<Long, WeakReference<VmaAllocateDeviceMemoryFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            JAVA_LONG, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(VmaAllocateDeviceMemoryFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public VmaAllocateDeviceMemoryFunction() {
        this(Arena.ofAuto());
    }

    public VmaAllocateDeviceMemoryFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment allocator,
        int memoryType,
        MemorySegment memory,
        long size,
        MemorySegment pUserData
    ) {
        invoke(
            new VmaAllocator(allocator),
            memoryType,
            new VkDeviceMemory(memory),
            size,
            pUserData
        );
    }

    public void invoke(
        VmaAllocator allocator,
        int memoryType,
        VkDeviceMemory memory,
        long size,
        MemorySegment pUserData
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in VmaAllocateDeviceMemoryFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable VmaAllocateDeviceMemoryFunction get(MemorySegment segment) {
        WeakReference<VmaAllocateDeviceMemoryFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}