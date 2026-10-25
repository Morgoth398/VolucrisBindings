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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.miniaudio.callbacks.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaBackendCallbacks
		implements Struct<MaBackendCallbacks> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ON_CONTEXT_INIT_HANDLE;
	public static final VarHandle ON_CONTEXT_UNINIT_HANDLE;
	public static final VarHandle ON_CONTEXT_ENUMERATE_DEVICES_HANDLE;
	public static final VarHandle ON_CONTEXT_GET_DEVICE_INFO_HANDLE;
	public static final VarHandle ON_DEVICE_INIT_HANDLE;
	public static final VarHandle ON_DEVICE_UNINIT_HANDLE;
	public static final VarHandle ON_DEVICE_START_HANDLE;
	public static final VarHandle ON_DEVICE_STOP_HANDLE;
	public static final VarHandle ON_DEVICE_READ_HANDLE;
	public static final VarHandle ON_DEVICE_WRITE_HANDLE;
	public static final VarHandle ON_DEVICE_DATA_LOOP_HANDLE;
	public static final VarHandle ON_DEVICE_DATA_LOOP_WAKEUP_HANDLE;
	public static final VarHandle ON_DEVICE_GET_INFO_HANDLE;

	public static final long ON_CONTEXT_INIT_BYTE_OFFSET;
	public static final long ON_CONTEXT_UNINIT_BYTE_OFFSET;
	public static final long ON_CONTEXT_ENUMERATE_DEVICES_BYTE_OFFSET;
	public static final long ON_CONTEXT_GET_DEVICE_INFO_BYTE_OFFSET;
	public static final long ON_DEVICE_INIT_BYTE_OFFSET;
	public static final long ON_DEVICE_UNINIT_BYTE_OFFSET;
	public static final long ON_DEVICE_START_BYTE_OFFSET;
	public static final long ON_DEVICE_STOP_BYTE_OFFSET;
	public static final long ON_DEVICE_READ_BYTE_OFFSET;
	public static final long ON_DEVICE_WRITE_BYTE_OFFSET;
	public static final long ON_DEVICE_DATA_LOOP_BYTE_OFFSET;
	public static final long ON_DEVICE_DATA_LOOP_WAKEUP_BYTE_OFFSET;
	public static final long ON_DEVICE_GET_INFO_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("onContextInit"),
		    UNBOUNDED_ADDRESS.withName("onContextUninit"),
		    UNBOUNDED_ADDRESS.withName("onContextEnumerateDevices"),
		    UNBOUNDED_ADDRESS.withName("onContextGetDeviceInfo"),
		    UNBOUNDED_ADDRESS.withName("onDeviceInit"),
		    UNBOUNDED_ADDRESS.withName("onDeviceUninit"),
		    UNBOUNDED_ADDRESS.withName("onDeviceStart"),
		    UNBOUNDED_ADDRESS.withName("onDeviceStop"),
		    UNBOUNDED_ADDRESS.withName("onDeviceRead"),
		    UNBOUNDED_ADDRESS.withName("onDeviceWrite"),
		    UNBOUNDED_ADDRESS.withName("onDeviceDataLoop"),
		    UNBOUNDED_ADDRESS.withName("onDeviceDataLoopWakeup"),
		    UNBOUNDED_ADDRESS.withName("onDeviceGetInfo")
		).withName("ma_backend_callbacks").withByteAlignment(8);
		
		ON_CONTEXT_INIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onContextInit"));
		ON_CONTEXT_UNINIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onContextUninit"));
		ON_CONTEXT_ENUMERATE_DEVICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onContextEnumerateDevices"));
		ON_CONTEXT_GET_DEVICE_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onContextGetDeviceInfo"));
		ON_DEVICE_INIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onDeviceInit"));
		ON_DEVICE_UNINIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onDeviceUninit"));
		ON_DEVICE_START_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onDeviceStart"));
		ON_DEVICE_STOP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onDeviceStop"));
		ON_DEVICE_READ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onDeviceRead"));
		ON_DEVICE_WRITE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onDeviceWrite"));
		ON_DEVICE_DATA_LOOP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onDeviceDataLoop"));
		ON_DEVICE_DATA_LOOP_WAKEUP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onDeviceDataLoopWakeup"));
		ON_DEVICE_GET_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onDeviceGetInfo"));
		
		ON_CONTEXT_INIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onContextInit"));
		ON_CONTEXT_UNINIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onContextUninit"));
		ON_CONTEXT_ENUMERATE_DEVICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onContextEnumerateDevices"));
		ON_CONTEXT_GET_DEVICE_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onContextGetDeviceInfo"));
		ON_DEVICE_INIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onDeviceInit"));
		ON_DEVICE_UNINIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onDeviceUninit"));
		ON_DEVICE_START_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onDeviceStart"));
		ON_DEVICE_STOP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onDeviceStop"));
		ON_DEVICE_READ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onDeviceRead"));
		ON_DEVICE_WRITE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onDeviceWrite"));
		ON_DEVICE_DATA_LOOP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onDeviceDataLoop"));
		ON_DEVICE_DATA_LOOP_WAKEUP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onDeviceDataLoopWakeup"));
		ON_DEVICE_GET_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onDeviceGetInfo"));
		//@formatter:on
	}

	public MaBackendCallbacks() {
	    this(Arena.ofAuto());
	}
	
	public MaBackendCallbacks(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaBackendCallbacks(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #onContextInit()
    public MaBackendCallbacks onContextInit(MaOnContextInit onContextInit) {
    	ON_CONTEXT_INIT_HANDLE.set(segment, 0L, onContextInit.memorySegment());
    	return this;
    }
    
    public @Nullable MaOnContextInit onContextInit() {
    	MemorySegment segment = (MemorySegment) ON_CONTEXT_INIT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaOnContextInit.get(segment);
    }
    
    /// @see #onContextUninit()
    public MaBackendCallbacks onContextUninit(MaOnContextUninit onContextUninit) {
    	ON_CONTEXT_UNINIT_HANDLE.set(segment, 0L, onContextUninit.memorySegment());
    	return this;
    }
    
    public @Nullable MaOnContextUninit onContextUninit() {
    	MemorySegment segment = (MemorySegment) ON_CONTEXT_UNINIT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaOnContextUninit.get(segment);
    }
    
    /// @see #onContextEnumerateDevices()
    public MaBackendCallbacks onContextEnumerateDevices(MaOnContextEnumerateDevices onContextEnumerateDevices) {
    	ON_CONTEXT_ENUMERATE_DEVICES_HANDLE.set(segment, 0L, onContextEnumerateDevices.memorySegment());
    	return this;
    }
    
    public @Nullable MaOnContextEnumerateDevices onContextEnumerateDevices() {
    	MemorySegment segment = (MemorySegment) ON_CONTEXT_ENUMERATE_DEVICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaOnContextEnumerateDevices.get(segment);
    }
    
    /// @see #onContextGetDeviceInfo()
    public MaBackendCallbacks onContextGetDeviceInfo(MaOnContextGetDeviceInfo onContextGetDeviceInfo) {
    	ON_CONTEXT_GET_DEVICE_INFO_HANDLE.set(segment, 0L, onContextGetDeviceInfo.memorySegment());
    	return this;
    }
    
    public @Nullable MaOnContextGetDeviceInfo onContextGetDeviceInfo() {
    	MemorySegment segment = (MemorySegment) ON_CONTEXT_GET_DEVICE_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaOnContextGetDeviceInfo.get(segment);
    }
    
    /// @see #onDeviceInit()
    public MaBackendCallbacks onDeviceInit(MaOnDeviceInit onDeviceInit) {
    	ON_DEVICE_INIT_HANDLE.set(segment, 0L, onDeviceInit.memorySegment());
    	return this;
    }
    
    public @Nullable MaOnDeviceInit onDeviceInit() {
    	MemorySegment segment = (MemorySegment) ON_DEVICE_INIT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaOnDeviceInit.get(segment);
    }
    
    /// @see #onDeviceUninit()
    public MaBackendCallbacks onDeviceUninit(MaOnDeviceUninit onDeviceUninit) {
    	ON_DEVICE_UNINIT_HANDLE.set(segment, 0L, onDeviceUninit.memorySegment());
    	return this;
    }
    
    public @Nullable MaOnDeviceUninit onDeviceUninit() {
    	MemorySegment segment = (MemorySegment) ON_DEVICE_UNINIT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaOnDeviceUninit.get(segment);
    }
    
    /// @see #onDeviceStart()
    public MaBackendCallbacks onDeviceStart(MaOnDeviceStart onDeviceStart) {
    	ON_DEVICE_START_HANDLE.set(segment, 0L, onDeviceStart.memorySegment());
    	return this;
    }
    
    public @Nullable MaOnDeviceStart onDeviceStart() {
    	MemorySegment segment = (MemorySegment) ON_DEVICE_START_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaOnDeviceStart.get(segment);
    }
    
    /// @see #onDeviceStop()
    public MaBackendCallbacks onDeviceStop(MaOnDeviceStop onDeviceStop) {
    	ON_DEVICE_STOP_HANDLE.set(segment, 0L, onDeviceStop.memorySegment());
    	return this;
    }
    
    public @Nullable MaOnDeviceStop onDeviceStop() {
    	MemorySegment segment = (MemorySegment) ON_DEVICE_STOP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaOnDeviceStop.get(segment);
    }
    
    /// @see #onDeviceRead()
    public MaBackendCallbacks onDeviceRead(MaOnDeviceRead onDeviceRead) {
    	ON_DEVICE_READ_HANDLE.set(segment, 0L, onDeviceRead.memorySegment());
    	return this;
    }
    
    public @Nullable MaOnDeviceRead onDeviceRead() {
    	MemorySegment segment = (MemorySegment) ON_DEVICE_READ_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaOnDeviceRead.get(segment);
    }
    
    /// @see #onDeviceWrite()
    public MaBackendCallbacks onDeviceWrite(MaOnDeviceWrite onDeviceWrite) {
    	ON_DEVICE_WRITE_HANDLE.set(segment, 0L, onDeviceWrite.memorySegment());
    	return this;
    }
    
    public @Nullable MaOnDeviceWrite onDeviceWrite() {
    	MemorySegment segment = (MemorySegment) ON_DEVICE_WRITE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaOnDeviceWrite.get(segment);
    }
    
    /// @see #onDeviceDataLoop()
    public MaBackendCallbacks onDeviceDataLoop(MaOnDeviceDataLoop onDeviceDataLoop) {
    	ON_DEVICE_DATA_LOOP_HANDLE.set(segment, 0L, onDeviceDataLoop.memorySegment());
    	return this;
    }
    
    public @Nullable MaOnDeviceDataLoop onDeviceDataLoop() {
    	MemorySegment segment = (MemorySegment) ON_DEVICE_DATA_LOOP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaOnDeviceDataLoop.get(segment);
    }
    
    /// @see #onDeviceDataLoopWakeup()
    public MaBackendCallbacks onDeviceDataLoopWakeup(MaOnDeviceDataLoopWakeup onDeviceDataLoopWakeup) {
    	ON_DEVICE_DATA_LOOP_WAKEUP_HANDLE.set(segment, 0L, onDeviceDataLoopWakeup.memorySegment());
    	return this;
    }
    
    public @Nullable MaOnDeviceDataLoopWakeup onDeviceDataLoopWakeup() {
    	MemorySegment segment = (MemorySegment) ON_DEVICE_DATA_LOOP_WAKEUP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaOnDeviceDataLoopWakeup.get(segment);
    }
    
    /// @see #onDeviceGetInfo()
    public MaBackendCallbacks onDeviceGetInfo(MaOnDeviceGetInfo onDeviceGetInfo) {
    	ON_DEVICE_GET_INFO_HANDLE.set(segment, 0L, onDeviceGetInfo.memorySegment());
    	return this;
    }
    
    public @Nullable MaOnDeviceGetInfo onDeviceGetInfo() {
    	MemorySegment segment = (MemorySegment) ON_DEVICE_GET_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaOnDeviceGetInfo.get(segment);
    }
    
    @Override
    public MaBackendCallbacks set(MaBackendCallbacks other) {
        return set(other.segment);
    }
    
    @Override
    public MaBackendCallbacks set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaBackendCallbacks> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaBackendCallbacks> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaBackendCallbacks(segment),
            count
        );
    }
    
    public static NativeStructArray<MaBackendCallbacks> array(SegmentAllocator allocator, MaBackendCallbacks... structs) {
        NativeStructArray<MaBackendCallbacks> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaBackendCallbacks(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaBackendCallbacks> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaBackendCallbacks(segment)
        );
    }

}