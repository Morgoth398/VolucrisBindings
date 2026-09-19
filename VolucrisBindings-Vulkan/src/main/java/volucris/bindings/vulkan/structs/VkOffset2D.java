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

public final class VkOffset2D
		implements Struct<VkOffset2D> {

    public static final StructLayout LAYOUT;

    public static final VarHandle X_HANDLE;
    public static final VarHandle Y_HANDLE;

    public static final long X_BYTE_OFFSET;
    public static final long Y_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("x"),
            JAVA_INT.withName("y")
        ).withName("VkOffset2D").withByteAlignment(4);
        
        X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("x"));
        Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("y"));
        
        X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("x"));
        Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("y"));
        //@formatter:on
    }

    public VkOffset2D() {
        this(Arena.ofAuto());
    }
    
    public VkOffset2D(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkOffset2D(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #x()
    public VkOffset2D x(int x) {
    	X_HANDLE.set(segment, 0L, x);
    	return this;
    }
    
    public int x() {
    	return (int) X_HANDLE.get(segment, 0L);
    }
    
    /// @see #y()
    public VkOffset2D y(int y) {
    	Y_HANDLE.set(segment, 0L, y);
    	return this;
    }
    
    public int y() {
    	return (int) Y_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkOffset2D set(VkOffset2D other) {
        return set(other.segment);
    }
    
    @Override
    public VkOffset2D set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkOffset2D> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkOffset2D> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkOffset2D(segment),
            count
        );
    }
    
    public static NativeStructArray<VkOffset2D> array(Arena arena, VkOffset2D... structs) {
        NativeStructArray<VkOffset2D> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkOffset2D(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkOffset2D> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkOffset2D(segment)
        );
    }
    
}