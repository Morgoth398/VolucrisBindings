/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkViewport
		implements Struct<VkViewport> {

	public static final StructLayout LAYOUT;

	public static final VarHandle X_HANDLE;
	public static final VarHandle Y_HANDLE;
	public static final VarHandle WIDTH_HANDLE;
	public static final VarHandle HEIGHT_HANDLE;
	public static final VarHandle MIN_DEPTH_HANDLE;
	public static final VarHandle MAX_DEPTH_HANDLE;

	public static final long X_BYTE_OFFSET;
	public static final long Y_BYTE_OFFSET;
	public static final long WIDTH_BYTE_OFFSET;
	public static final long HEIGHT_BYTE_OFFSET;
	public static final long MIN_DEPTH_BYTE_OFFSET;
	public static final long MAX_DEPTH_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_FLOAT.withName("x"),
		    JAVA_FLOAT.withName("y"),
		    JAVA_FLOAT.withName("width"),
		    JAVA_FLOAT.withName("height"),
		    JAVA_FLOAT.withName("minDepth"),
		    JAVA_FLOAT.withName("maxDepth")
		).withName("VkViewport").withByteAlignment(4);
		
		X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("x"));
		Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("y"));
		WIDTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("width"));
		HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("height"));
		MIN_DEPTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minDepth"));
		MAX_DEPTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDepth"));
		
		X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("x"));
		Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("y"));
		WIDTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("width"));
		HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("height"));
		MIN_DEPTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minDepth"));
		MAX_DEPTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDepth"));
		//@formatter:on
	}

	public VkViewport() {
	    this(Arena.ofAuto());
	}
	
	public VkViewport(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkViewport(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #x()
    public VkViewport x(float x) {
    	X_HANDLE.set(segment, 0L, x);
    	return this;
    }
    
    public float x() {
    	return (float) X_HANDLE.get(segment, 0L);
    }
    
    /// @see #y()
    public VkViewport y(float y) {
    	Y_HANDLE.set(segment, 0L, y);
    	return this;
    }
    
    public float y() {
    	return (float) Y_HANDLE.get(segment, 0L);
    }
    
    /// @see #width()
    public VkViewport width(float width) {
    	WIDTH_HANDLE.set(segment, 0L, width);
    	return this;
    }
    
    public float width() {
    	return (float) WIDTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #height()
    public VkViewport height(float height) {
    	HEIGHT_HANDLE.set(segment, 0L, height);
    	return this;
    }
    
    public float height() {
    	return (float) HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #minDepth()
    public VkViewport minDepth(float minDepth) {
    	MIN_DEPTH_HANDLE.set(segment, 0L, minDepth);
    	return this;
    }
    
    public float minDepth() {
    	return (float) MIN_DEPTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDepth()
    public VkViewport maxDepth(float maxDepth) {
    	MAX_DEPTH_HANDLE.set(segment, 0L, maxDepth);
    	return this;
    }
    
    public float maxDepth() {
    	return (float) MAX_DEPTH_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkViewport set(VkViewport other) {
        return set(other.segment);
    }
    
    @Override
    public VkViewport set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkViewport> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkViewport> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkViewport(segment),
            count
        );
    }
    
    public static NativeStructArray<VkViewport> array(Arena arena, VkViewport... structs) {
        NativeStructArray<VkViewport> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkViewport(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkViewport> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkViewport(segment)
        );
    }

}