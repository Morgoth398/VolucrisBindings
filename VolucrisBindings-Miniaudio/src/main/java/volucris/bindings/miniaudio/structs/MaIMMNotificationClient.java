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

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaIMMNotificationClient
		implements Struct<MaIMMNotificationClient> {

	public static final StructLayout LAYOUT;

	public static final VarHandle LP_VTBL_HANDLE;
	public static final VarHandle COUNTER_HANDLE;
	public static final VarHandle P_DEVICE_HANDLE;

	public static final long LP_VTBL_BYTE_OFFSET;
	public static final long COUNTER_BYTE_OFFSET;
	public static final long P_DEVICE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("lpVtbl"),
		    JAVA_INT.withName("counter"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pDevice")
		).withName("ma_IMMNotificationClient").withByteAlignment(8);
		
		LP_VTBL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lpVtbl"));
		COUNTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("counter"));
		P_DEVICE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDevice"));
		
		LP_VTBL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lpVtbl"));
		COUNTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("counter"));
		P_DEVICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDevice"));
		//@formatter:on
	}

	public MaIMMNotificationClient() {
	    this(Arena.ofAuto());
	}
	
	public MaIMMNotificationClient(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaIMMNotificationClient(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #lpVtbl()
    public MaIMMNotificationClient lpVtbl(MemorySegment lpVtbl) {
    	LP_VTBL_HANDLE.set(segment, 0L, lpVtbl);
    	return this;
    }
    
    public @Nullable MemorySegment lpVtbl() {
    	MemorySegment segment = (MemorySegment) LP_VTBL_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #counter()
    public MaIMMNotificationClient counter(int counter) {
    	COUNTER_HANDLE.set(segment, 0L, counter);
    	return this;
    }
    
    public int counter() {
    	return (int) COUNTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDevice()
    public MaIMMNotificationClient pDevice(MaDevice pDevice) {
    	P_DEVICE_HANDLE.set(segment, 0L, pDevice.memorySegment());
    	return this;
    }
    
    public @Nullable MaDevice pDevice() {
    	MemorySegment segment = (MemorySegment) P_DEVICE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDevice(segment);
    }
    
    @Override
    public MaIMMNotificationClient set(MaIMMNotificationClient other) {
        return set(other.segment);
    }
    
    @Override
    public MaIMMNotificationClient set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaIMMNotificationClient> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaIMMNotificationClient> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaIMMNotificationClient(segment),
            count
        );
    }
    
    public static NativeStructArray<MaIMMNotificationClient> array(SegmentAllocator allocator, MaIMMNotificationClient... structs) {
        NativeStructArray<MaIMMNotificationClient> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaIMMNotificationClient(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaIMMNotificationClient> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaIMMNotificationClient(segment)
        );
    }

}