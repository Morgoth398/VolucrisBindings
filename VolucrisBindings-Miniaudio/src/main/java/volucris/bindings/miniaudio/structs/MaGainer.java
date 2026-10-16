/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaGainer
		implements Struct<MaGainer> {

	public static final StructLayout LAYOUT;

	public static final VarHandle T_HANDLE;
	public static final VarHandle MASTER_VOLUME_HANDLE;
	public static final VarHandle P_OLD_GAINS_HANDLE;
	public static final VarHandle P_NEW_GAINS_HANDLE;
	public static final VarHandle _P_HEAP_HANDLE;
	public static final VarHandle _OWNS_HEAP_HANDLE;

	public static final long CONFIG_BYTE_OFFSET;
	public static final long T_BYTE_OFFSET;
	public static final long MASTER_VOLUME_BYTE_OFFSET;
	public static final long P_OLD_GAINS_BYTE_OFFSET;
	public static final long P_NEW_GAINS_BYTE_OFFSET;
	public static final long _P_HEAP_BYTE_OFFSET;
	public static final long _OWNS_HEAP_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaGainerConfig config;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaGainerConfig.LAYOUT.withName("config"),
		    JAVA_INT.withName("t"),
		    JAVA_FLOAT.withName("masterVolume"),
		    UNBOUNDED_ADDRESS.withName("pOldGains"),
		    UNBOUNDED_ADDRESS.withName("pNewGains"),
		    UNBOUNDED_ADDRESS.withName("_pHeap"),
		    JAVA_INT.withName("_ownsHeap"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_gainer").withByteAlignment(8);
		
		T_HANDLE = LAYOUT.varHandle(PathElement.groupElement("t"));
		MASTER_VOLUME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("masterVolume"));
		P_OLD_GAINS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pOldGains"));
		P_NEW_GAINS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNewGains"));
		_P_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_ownsHeap"));
		
		CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("config"));
		T_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("t"));
		MASTER_VOLUME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("masterVolume"));
		P_OLD_GAINS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pOldGains"));
		P_NEW_GAINS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNewGains"));
		_P_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_ownsHeap"));
		//@formatter:on
	}

	public MaGainer() {
	    this(Arena.ofAuto());
	}
	
	public MaGainer(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaGainer(MemorySegment segment) {
	    this.segment = segment;
	
	    config = new MaGainerConfig(segment.asSlice(CONFIG_BYTE_OFFSET, MaGainerConfig.LAYOUT));
	}

    /// @see #config()
    public MaGainer config(Consumer<MaGainerConfig> consumer) {
    	consumer.accept(config);
    	return this;
    }
    
    /// @see #config()
    public MaGainer config(MaGainerConfig other) {
    	config.set(other);
    	return this;
    }
    
    public MaGainerConfig config() {
    	return config;
    }
    
    /// @see #t()
    public MaGainer t(int t) {
    	T_HANDLE.set(segment, 0L, t);
    	return this;
    }
    
    public int t() {
    	return (int) T_HANDLE.get(segment, 0L);
    }
    
    /// @see #masterVolume()
    public MaGainer masterVolume(float masterVolume) {
    	MASTER_VOLUME_HANDLE.set(segment, 0L, masterVolume);
    	return this;
    }
    
    public float masterVolume() {
    	return (float) MASTER_VOLUME_HANDLE.get(segment, 0L);
    }
    
    /// @see #pOldGains()
    public MaGainer pOldGains(NativeFloatArray pOldGains) {
    	P_OLD_GAINS_HANDLE.set(segment, 0L, pOldGains.memorySegment());
    	return this;
    }
    
    public @Nullable NativeFloatArray pOldGains() {
    	MemorySegment segment = (MemorySegment) P_OLD_GAINS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeFloatArray(segment);
    }
    
    /// @see #pNewGains()
    public MaGainer pNewGains(NativeFloatArray pNewGains) {
    	P_NEW_GAINS_HANDLE.set(segment, 0L, pNewGains.memorySegment());
    	return this;
    }
    
    public @Nullable NativeFloatArray pNewGains() {
    	MemorySegment segment = (MemorySegment) P_NEW_GAINS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeFloatArray(segment);
    }
    
    /// @see #_pHeap()
    public MaGainer _pHeap(MemorySegment _pHeap) {
    	_P_HEAP_HANDLE.set(segment, 0L, _pHeap);
    	return this;
    }
    
    public @Nullable MemorySegment _pHeap() {
    	MemorySegment segment = (MemorySegment) _P_HEAP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #_ownsHeap()
    public MaGainer _ownsHeap(int _ownsHeap) {
    	_OWNS_HEAP_HANDLE.set(segment, 0L, _ownsHeap);
    	return this;
    }
    
    public int _ownsHeap() {
    	return (int) _OWNS_HEAP_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaGainer set(MaGainer other) {
        return set(other.segment);
    }
    
    @Override
    public MaGainer set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaGainer> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaGainer> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaGainer(segment),
            count
        );
    }
    
    public static NativeStructArray<MaGainer> array(Arena arena, MaGainer... structs) {
        NativeStructArray<MaGainer> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaGainer(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaGainer> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaGainer(segment)
        );
    }

}