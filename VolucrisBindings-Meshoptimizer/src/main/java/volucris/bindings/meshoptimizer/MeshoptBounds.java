/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.meshoptimizer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MeshoptBounds
		implements Struct<MeshoptBounds> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CENTER_HANDLE;
	public static final VarHandle RADIUS_HANDLE;
	public static final VarHandle CONE_APEX_HANDLE;
	public static final VarHandle CONE_AXIS_HANDLE;
	public static final VarHandle CONE_CUTOFF_HANDLE;
	public static final VarHandle CONE_AXIS_S8_HANDLE;
	public static final VarHandle CONE_CUTOFF_S8_HANDLE;

	public static final long CENTER_BYTE_OFFSET;
	public static final long RADIUS_BYTE_OFFSET;
	public static final long CONE_APEX_BYTE_OFFSET;
	public static final long CONE_AXIS_BYTE_OFFSET;
	public static final long CONE_CUTOFF_BYTE_OFFSET;
	public static final long CONE_AXIS_S8_BYTE_OFFSET;
	public static final long CONE_CUTOFF_S8_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MemoryLayout.sequenceLayout(3, JAVA_FLOAT).withName("center"),
		    JAVA_FLOAT.withName("radius"),
		    MemoryLayout.sequenceLayout(3, JAVA_FLOAT).withName("cone_apex"),
		    MemoryLayout.sequenceLayout(3, JAVA_FLOAT).withName("cone_axis"),
		    JAVA_FLOAT.withName("cone_cutoff"),
		    MemoryLayout.sequenceLayout(3, JAVA_BYTE).withName("cone_axis_s8"),
		    JAVA_BYTE.withName("cone_cutoff_s8")
		).withName("meshopt_Bounds").withByteAlignment(4);
		
		CENTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("center"), PathElement.sequenceElement());
		RADIUS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("radius"));
		CONE_APEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cone_apex"), PathElement.sequenceElement());
		CONE_AXIS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cone_axis"), PathElement.sequenceElement());
		CONE_CUTOFF_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cone_cutoff"));
		CONE_AXIS_S8_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cone_axis_s8"), PathElement.sequenceElement());
		CONE_CUTOFF_S8_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cone_cutoff_s8"));
		
		CENTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("center"));
		RADIUS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("radius"));
		CONE_APEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cone_apex"));
		CONE_AXIS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cone_axis"));
		CONE_CUTOFF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cone_cutoff"));
		CONE_AXIS_S8_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cone_axis_s8"));
		CONE_CUTOFF_S8_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cone_cutoff_s8"));
		//@formatter:on
	}

	public MeshoptBounds() {
	    this(Arena.ofAuto());
	}
	
	public MeshoptBounds(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MeshoptBounds(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #center(int)
    public MeshoptBounds center(float center, int index0) {
    	CENTER_HANDLE.set(segment, 0L, index0, center);
    	return this;
    }
    
    public float center(int index0) {
    	return (float) CENTER_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #radius()
    public MeshoptBounds radius(float radius) {
    	RADIUS_HANDLE.set(segment, 0L, radius);
    	return this;
    }
    
    public float radius() {
    	return (float) RADIUS_HANDLE.get(segment, 0L);
    }
    
    /// @see #cone_apex(int)
    public MeshoptBounds cone_apex(float cone_apex, int index0) {
    	CONE_APEX_HANDLE.set(segment, 0L, index0, cone_apex);
    	return this;
    }
    
    public float cone_apex(int index0) {
    	return (float) CONE_APEX_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #cone_axis(int)
    public MeshoptBounds cone_axis(float cone_axis, int index0) {
    	CONE_AXIS_HANDLE.set(segment, 0L, index0, cone_axis);
    	return this;
    }
    
    public float cone_axis(int index0) {
    	return (float) CONE_AXIS_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #cone_cutoff()
    public MeshoptBounds cone_cutoff(float cone_cutoff) {
    	CONE_CUTOFF_HANDLE.set(segment, 0L, cone_cutoff);
    	return this;
    }
    
    public float cone_cutoff() {
    	return (float) CONE_CUTOFF_HANDLE.get(segment, 0L);
    }
    
    /// @see #cone_axis_s8(int)
    public MeshoptBounds cone_axis_s8(byte cone_axis_s8, int index0) {
    	CONE_AXIS_S8_HANDLE.set(segment, 0L, index0, cone_axis_s8);
    	return this;
    }
    
    public byte cone_axis_s8(int index0) {
    	return (byte) CONE_AXIS_S8_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #cone_cutoff_s8()
    public MeshoptBounds cone_cutoff_s8(byte cone_cutoff_s8) {
    	CONE_CUTOFF_S8_HANDLE.set(segment, 0L, cone_cutoff_s8);
    	return this;
    }
    
    public byte cone_cutoff_s8() {
    	return (byte) CONE_CUTOFF_S8_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MeshoptBounds set(MeshoptBounds other) {
        return set(other.segment);
    }
    
    @Override
    public MeshoptBounds set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MeshoptBounds> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MeshoptBounds> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MeshoptBounds(segment),
            count
        );
    }
    
    public static NativeStructArray<MeshoptBounds> array(SegmentAllocator allocator, MeshoptBounds... structs) {
        NativeStructArray<MeshoptBounds> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MeshoptBounds(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MeshoptBounds> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MeshoptBounds(segment)
        );
    }

}