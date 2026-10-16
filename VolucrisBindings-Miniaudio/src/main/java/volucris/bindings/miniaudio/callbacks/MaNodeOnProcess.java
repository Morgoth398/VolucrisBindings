/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.callbacks;

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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativePointerArray;

import static volucris.bindings.core.FFMUtils.*;

public abstract class MaNodeOnProcess {

    private static final Map<Long, WeakReference<MaNodeOnProcess>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MaNodeOnProcess.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaNodeOnProcess() {
        this(Arena.ofAuto());
    }

    public MaNodeOnProcess(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment pNode,
        MemorySegment ppFramesIn,
        MemorySegment pFrameCountIn,
        MemorySegment ppFramesOut,
        MemorySegment pFrameCountOut
    ) {
        invoke(
            pNode,
            new NativePointerArray(ppFramesIn),
            new NativeIntArray(pFrameCountIn),
            new NativePointerArray(ppFramesOut),
            new NativeIntArray(pFrameCountOut)
        );
    }

    public void invoke(
        MemorySegment pNode,
        NativePointerArray ppFramesIn,
        NativeIntArray pFrameCountIn,
        NativePointerArray ppFramesOut,
        NativeIntArray pFrameCountOut
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaNodeOnProcess."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaNodeOnProcess get(MemorySegment segment) {
        WeakReference<MaNodeOnProcess> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}