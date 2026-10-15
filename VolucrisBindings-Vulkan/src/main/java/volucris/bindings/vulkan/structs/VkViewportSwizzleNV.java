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

public final class VkViewportSwizzleNV
		implements Struct<VkViewportSwizzleNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle X_HANDLE;
	public static final VarHandle Y_HANDLE;
	public static final VarHandle Z_HANDLE;
	public static final VarHandle W_HANDLE;

	public static final long X_BYTE_OFFSET;
	public static final long Y_BYTE_OFFSET;
	public static final long Z_BYTE_OFFSET;
	public static final long W_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("x"),
		    JAVA_INT.withName("y"),
		    JAVA_INT.withName("z"),
		    JAVA_INT.withName("w")
		).withName("VkViewportSwizzleNV").withByteAlignment(4);
		
		X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("x"));
		Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("y"));
		Z_HANDLE = LAYOUT.varHandle(PathElement.groupElement("z"));
		W_HANDLE = LAYOUT.varHandle(PathElement.groupElement("w"));
		
		X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("x"));
		Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("y"));
		Z_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("z"));
		W_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("w"));
		//@formatter:on
	}

	public VkViewportSwizzleNV() {
	    this(Arena.ofAuto());
	}
	
	public VkViewportSwizzleNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkViewportSwizzleNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #x()
    public VkViewportSwizzleNV x(int x) {
    	X_HANDLE.set(segment, 0L, x);
    	return this;
    }
    
    public int x() {
    	return (int) X_HANDLE.get(segment, 0L);
    }
    
    /// @see #y()
    public VkViewportSwizzleNV y(int y) {
    	Y_HANDLE.set(segment, 0L, y);
    	return this;
    }
    
    public int y() {
    	return (int) Y_HANDLE.get(segment, 0L);
    }
    
    /// @see #z()
    public VkViewportSwizzleNV z(int z) {
    	Z_HANDLE.set(segment, 0L, z);
    	return this;
    }
    
    public int z() {
    	return (int) Z_HANDLE.get(segment, 0L);
    }
    
    /// @see #w()
    public VkViewportSwizzleNV w(int w) {
    	W_HANDLE.set(segment, 0L, w);
    	return this;
    }
    
    public int w() {
    	return (int) W_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkViewportSwizzleNV set(VkViewportSwizzleNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkViewportSwizzleNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkViewportSwizzleNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkViewportSwizzleNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkViewportSwizzleNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkViewportSwizzleNV> array(Arena arena, VkViewportSwizzleNV... structs) {
        NativeStructArray<VkViewportSwizzleNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkViewportSwizzleNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkViewportSwizzleNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkViewportSwizzleNV(segment)
        );
    }

}