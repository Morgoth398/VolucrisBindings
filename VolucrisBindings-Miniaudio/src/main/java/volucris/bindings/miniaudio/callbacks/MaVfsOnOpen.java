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
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativePointerArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class MaVfsOnOpen {

    private static final Map<Long, WeakReference<MaVfsOnOpen>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(MaVfsOnOpen.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaVfsOnOpen() {
        this(Arena.ofAuto());
    }

    public MaVfsOnOpen(Arena arena) {
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
            new NativeByteArray(pFilePath),
            openMode,
            new NativePointerArray(pFile)
        );
    }

    public int invoke(
        MemorySegment pVFS,
        NativeByteArray pFilePath,
        int openMode,
        NativePointerArray pFile
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaVfsOnOpen."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaVfsOnOpen get(MemorySegment segment) {
        WeakReference<MaVfsOnOpen> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}