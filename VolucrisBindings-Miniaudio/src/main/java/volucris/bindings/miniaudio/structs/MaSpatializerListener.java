/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaSpatializerListener
		implements Struct<MaSpatializerListener> {

	public static final StructLayout LAYOUT;

	public static final VarHandle IS_ENABLED_HANDLE;
	public static final VarHandle _OWNS_HEAP_HANDLE;
	public static final VarHandle _P_HEAP_HANDLE;

	public static final long CONFIG_BYTE_OFFSET;
	public static final long POSITION_BYTE_OFFSET;
	public static final long DIRECTION_BYTE_OFFSET;
	public static final long VELOCITY_BYTE_OFFSET;
	public static final long IS_ENABLED_BYTE_OFFSET;
	public static final long _OWNS_HEAP_BYTE_OFFSET;
	public static final long _P_HEAP_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaSpatializerListenerConfig config;
	private final MaAtomicVec3f position;
	private final MaAtomicVec3f direction;
	private final MaAtomicVec3f velocity;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaSpatializerListenerConfig.LAYOUT.withName("config"),
		    MaAtomicVec3f.LAYOUT.withName("position"),
		    MaAtomicVec3f.LAYOUT.withName("direction"),
		    MaAtomicVec3f.LAYOUT.withName("velocity"),
		    JAVA_INT.withName("isEnabled"),
		    JAVA_INT.withName("_ownsHeap"),
		    UNBOUNDED_ADDRESS.withName("_pHeap")
		).withName("ma_spatializer_listener").withByteAlignment(8);
		
		IS_ENABLED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isEnabled"));
		_OWNS_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_ownsHeap"));
		_P_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_pHeap"));
		
		CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("config"));
		POSITION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("position"));
		DIRECTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("direction"));
		VELOCITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("velocity"));
		IS_ENABLED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isEnabled"));
		_OWNS_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_ownsHeap"));
		_P_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_pHeap"));
		//@formatter:on
	}

	public MaSpatializerListener() {
	    this(Arena.ofAuto());
	}
	
	public MaSpatializerListener(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaSpatializerListener(MemorySegment segment) {
	    this.segment = segment;
	
	    config = new MaSpatializerListenerConfig(segment.asSlice(CONFIG_BYTE_OFFSET, MaSpatializerListenerConfig.LAYOUT));
	    position = new MaAtomicVec3f(segment.asSlice(POSITION_BYTE_OFFSET, MaAtomicVec3f.LAYOUT));
	    direction = new MaAtomicVec3f(segment.asSlice(DIRECTION_BYTE_OFFSET, MaAtomicVec3f.LAYOUT));
	    velocity = new MaAtomicVec3f(segment.asSlice(VELOCITY_BYTE_OFFSET, MaAtomicVec3f.LAYOUT));
	}

    /// @see #config()
    public MaSpatializerListener config(Consumer<MaSpatializerListenerConfig> consumer) {
    	consumer.accept(config);
    	return this;
    }
    
    /// @see #config()
    public MaSpatializerListener config(MaSpatializerListenerConfig other) {
    	config.set(other);
    	return this;
    }
    
    public MaSpatializerListenerConfig config() {
    	return config;
    }
    
    /// @see #position()
    public MaSpatializerListener position(Consumer<MaAtomicVec3f> consumer) {
    	consumer.accept(position);
    	return this;
    }
    
    /// @see #position()
    public MaSpatializerListener position(MaAtomicVec3f other) {
    	position.set(other);
    	return this;
    }
    
    public MaAtomicVec3f position() {
    	return position;
    }
    
    /// @see #direction()
    public MaSpatializerListener direction(Consumer<MaAtomicVec3f> consumer) {
    	consumer.accept(direction);
    	return this;
    }
    
    /// @see #direction()
    public MaSpatializerListener direction(MaAtomicVec3f other) {
    	direction.set(other);
    	return this;
    }
    
    public MaAtomicVec3f direction() {
    	return direction;
    }
    
    /// @see #velocity()
    public MaSpatializerListener velocity(Consumer<MaAtomicVec3f> consumer) {
    	consumer.accept(velocity);
    	return this;
    }
    
    /// @see #velocity()
    public MaSpatializerListener velocity(MaAtomicVec3f other) {
    	velocity.set(other);
    	return this;
    }
    
    public MaAtomicVec3f velocity() {
    	return velocity;
    }
    
    /// @see #isEnabled()
    public MaSpatializerListener isEnabled(int isEnabled) {
    	IS_ENABLED_HANDLE.set(segment, 0L, isEnabled);
    	return this;
    }
    
    public int isEnabled() {
    	return (int) IS_ENABLED_HANDLE.get(segment, 0L);
    }
    
    /// @see #_ownsHeap()
    public MaSpatializerListener _ownsHeap(int _ownsHeap) {
    	_OWNS_HEAP_HANDLE.set(segment, 0L, _ownsHeap);
    	return this;
    }
    
    public int _ownsHeap() {
    	return (int) _OWNS_HEAP_HANDLE.get(segment, 0L);
    }
    
    /// @see #_pHeap()
    public MaSpatializerListener _pHeap(MemorySegment _pHeap) {
    	_P_HEAP_HANDLE.set(segment, 0L, _pHeap);
    	return this;
    }
    
    public @Nullable MemorySegment _pHeap() {
    	MemorySegment segment = (MemorySegment) _P_HEAP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public MaSpatializerListener set(MaSpatializerListener other) {
        return set(other.segment);
    }
    
    @Override
    public MaSpatializerListener set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaSpatializerListener> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaSpatializerListener> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaSpatializerListener(segment),
            count
        );
    }
    
    public static NativeStructArray<MaSpatializerListener> array(SegmentAllocator allocator, MaSpatializerListener... structs) {
        NativeStructArray<MaSpatializerListener> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaSpatializerListener(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaSpatializerListener> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaSpatializerListener(segment)
        );
    }

}