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
import volucris.bindings.core.NativeLongArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class MaDataSourceOnGetCursor {

    private static final Map<Long, WeakReference<MaDataSourceOnGetCursor>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MaDataSourceOnGetCursor.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaDataSourceOnGetCursor() {
        this(Arena.ofAuto());
    }

    public MaDataSourceOnGetCursor(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment pDataSource,
        MemorySegment pCursor
    ) {
        return invoke(
            pDataSource,
            new NativeLongArray(pCursor)
        );
    }

    public int invoke(
        MemorySegment pDataSource,
        NativeLongArray pCursor
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaDataSourceOnGetCursor."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaDataSourceOnGetCursor get(MemorySegment segment) {
        WeakReference<MaDataSourceOnGetCursor> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}