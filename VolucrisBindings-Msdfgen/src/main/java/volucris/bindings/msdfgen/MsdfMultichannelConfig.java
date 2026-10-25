/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.msdfgen;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MsdfMultichannelConfig
		implements Struct<MsdfMultichannelConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle OVERLAP_SUPPORT_HANDLE;
	public static final VarHandle MODE_HANDLE;
	public static final VarHandle DISTANCE_CHECK_MODE_HANDLE;
	public static final VarHandle MIN_DEVIATION_RATIO_HANDLE;
	public static final VarHandle MIN_IMPROVE_RATIO_HANDLE;

	public static final long OVERLAP_SUPPORT_BYTE_OFFSET;
	public static final long MODE_BYTE_OFFSET;
	public static final long DISTANCE_CHECK_MODE_BYTE_OFFSET;
	public static final long MIN_DEVIATION_RATIO_BYTE_OFFSET;
	public static final long MIN_IMPROVE_RATIO_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("overlap_support"),
		    JAVA_INT.withName("mode"),
		    JAVA_INT.withName("distance_check_mode"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_DOUBLE.withName("min_deviation_ratio"),
		    JAVA_DOUBLE.withName("min_improve_ratio")
		).withName("msdf_multichannel_config").withByteAlignment(8);
		
		OVERLAP_SUPPORT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("overlap_support"));
		MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mode"));
		DISTANCE_CHECK_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("distance_check_mode"));
		MIN_DEVIATION_RATIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("min_deviation_ratio"));
		MIN_IMPROVE_RATIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("min_improve_ratio"));
		
		OVERLAP_SUPPORT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("overlap_support"));
		MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mode"));
		DISTANCE_CHECK_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("distance_check_mode"));
		MIN_DEVIATION_RATIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("min_deviation_ratio"));
		MIN_IMPROVE_RATIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("min_improve_ratio"));
		//@formatter:on
	}

	public MsdfMultichannelConfig() {
	    this(Arena.ofAuto());
	}
	
	public MsdfMultichannelConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MsdfMultichannelConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #overlap_support()
    public MsdfMultichannelConfig overlap_support(int overlap_support) {
    	OVERLAP_SUPPORT_HANDLE.set(segment, 0L, overlap_support);
    	return this;
    }
    
    public int overlap_support() {
    	return (int) OVERLAP_SUPPORT_HANDLE.get(segment, 0L);
    }
    
    /// @see #mode()
    public MsdfMultichannelConfig mode(int mode) {
    	MODE_HANDLE.set(segment, 0L, mode);
    	return this;
    }
    
    public int mode() {
    	return (int) MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #distance_check_mode()
    public MsdfMultichannelConfig distance_check_mode(int distance_check_mode) {
    	DISTANCE_CHECK_MODE_HANDLE.set(segment, 0L, distance_check_mode);
    	return this;
    }
    
    public int distance_check_mode() {
    	return (int) DISTANCE_CHECK_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #min_deviation_ratio()
    public MsdfMultichannelConfig min_deviation_ratio(double min_deviation_ratio) {
    	MIN_DEVIATION_RATIO_HANDLE.set(segment, 0L, min_deviation_ratio);
    	return this;
    }
    
    public double min_deviation_ratio() {
    	return (double) MIN_DEVIATION_RATIO_HANDLE.get(segment, 0L);
    }
    
    /// @see #min_improve_ratio()
    public MsdfMultichannelConfig min_improve_ratio(double min_improve_ratio) {
    	MIN_IMPROVE_RATIO_HANDLE.set(segment, 0L, min_improve_ratio);
    	return this;
    }
    
    public double min_improve_ratio() {
    	return (double) MIN_IMPROVE_RATIO_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MsdfMultichannelConfig set(MsdfMultichannelConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MsdfMultichannelConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MsdfMultichannelConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MsdfMultichannelConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MsdfMultichannelConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MsdfMultichannelConfig> array(SegmentAllocator allocator, MsdfMultichannelConfig... structs) {
        NativeStructArray<MsdfMultichannelConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MsdfMultichannelConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MsdfMultichannelConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MsdfMultichannelConfig(segment)
        );
    }

}