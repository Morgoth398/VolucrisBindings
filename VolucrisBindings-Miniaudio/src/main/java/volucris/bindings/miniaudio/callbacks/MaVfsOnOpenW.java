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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeShortArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class MaVfsOnOpenW {

    private static final Map<Long, WeakReference<MaVfsOnOpenW>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MaVfsOnOpenW.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaVfsOnOpenW() {
        this(Arena.ofAuto());
    }

    public MaVfsOnOpenW(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment pVFS,
        MemorySegment pFilePath,
        int openMode,
        MemorySegment pFile
    ) {
        return invoke(
            pVFS,
            new NativeShortArray(pFilePath),
            openMode,
            new NativePointerArray(pFile)
        );
    }

    public int invoke(
        MemorySegment pVFS,
        NativeShortArray pFilePath,
        int openMode,
        NativePointerArray pFile
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaVfsOnOpenW."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaVfsOnOpenW get(MemorySegment segment) {
        WeakReference<MaVfsOnOpenW> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}