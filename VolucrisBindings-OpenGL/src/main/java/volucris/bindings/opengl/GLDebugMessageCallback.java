/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.opengl;

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

public abstract class GLDebugMessageCallback {

    private static final Map<Long, WeakReference<GLDebugMessageCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            JAVA_INT, 
            JAVA_INT, 
            JAVA_INT, 
            JAVA_INT, 
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(GLDebugMessageCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GLDebugMessageCallback() {
        this(Arena.ofAuto());
    }

    public GLDebugMessageCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        int source,
        int type,
        int id,
        int severity,
        int length,
        MemorySegment message,
        MemorySegment userParam
    ) {
        invoke(
            source,
            type,
            id,
            severity,
            length,
            message.getString(0),
            userParam
        );
    }

    public void invoke(
        int source,
        int type,
        int id,
        int severity,
        int length,
        String message,
        MemorySegment userParam
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GLDebugMessageCallback."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GLDebugMessageCallback get(MemorySegment segment) {
        WeakReference<GLDebugMessageCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}