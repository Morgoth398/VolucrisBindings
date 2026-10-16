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
import volucris.bindings.core.NativeIntArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class MaDataSourceOnGetDataFormat {

    private static final Map<Long, WeakReference<MaDataSourceOnGetDataFormat>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_LONG
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(MaDataSourceOnGetDataFormat.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MaDataSourceOnGetDataFormat() {
        this(Arena.ofAuto());
    }

    public MaDataSourceOnGetDataFormat(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment pDataSource,
        MemorySegment pFormat,
        MemorySegment pChannels,
        MemorySegment pSampleRate,
        MemorySegment pChannelMap,
        long channelMapCap
    ) {
        return invoke(
            pDataSource,
            new NativeIntArray(pFormat),
            new NativeIntArray(pChannels),
            new NativeIntArray(pSampleRate),
            new NativeByteArray(pChannelMap),
            channelMapCap
        );
    }

    public int invoke(
        MemorySegment pDataSource,
        NativeIntArray pFormat,
        NativeIntArray pChannels,
        NativeIntArray pSampleRate,
        NativeByteArray pChannelMap,
        long channelMapCap
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in MaDataSourceOnGetDataFormat."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable MaDataSourceOnGetDataFormat get(MemorySegment segment) {
        WeakReference<MaDataSourceOnGetDataFormat> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}