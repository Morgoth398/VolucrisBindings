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

public final class VkComponentMapping
		implements Struct<VkComponentMapping> {

    public static final StructLayout LAYOUT;

    public static final VarHandle R_HANDLE;
    public static final VarHandle G_HANDLE;
    public static final VarHandle B_HANDLE;
    public static final VarHandle A_HANDLE;

    public static final long R_BYTE_OFFSET;
    public static final long G_BYTE_OFFSET;
    public static final long B_BYTE_OFFSET;
    public static final long A_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("r"),
            JAVA_INT.withName("g"),
            JAVA_INT.withName("b"),
            JAVA_INT.withName("a")
        ).withName("VkComponentMapping").withByteAlignment(4);
        
        R_HANDLE = LAYOUT.varHandle(PathElement.groupElement("r"));
        G_HANDLE = LAYOUT.varHandle(PathElement.groupElement("g"));
        B_HANDLE = LAYOUT.varHandle(PathElement.groupElement("b"));
        A_HANDLE = LAYOUT.varHandle(PathElement.groupElement("a"));
        
        R_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("r"));
        G_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("g"));
        B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b"));
        A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("a"));
        //@formatter:on
    }

    public VkComponentMapping() {
        this(Arena.ofAuto());
    }
    
    public VkComponentMapping(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkComponentMapping(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #r()
    public VkComponentMapping r(int r) {
    	R_HANDLE.set(segment, 0L, r);
    	return this;
    }
    
    public int r() {
    	return (int) R_HANDLE.get(segment, 0L);
    }
    
    /// @see #g()
    public VkComponentMapping g(int g) {
    	G_HANDLE.set(segment, 0L, g);
    	return this;
    }
    
    public int g() {
    	return (int) G_HANDLE.get(segment, 0L);
    }
    
    /// @see #b()
    public VkComponentMapping b(int b) {
    	B_HANDLE.set(segment, 0L, b);
    	return this;
    }
    
    public int b() {
    	return (int) B_HANDLE.get(segment, 0L);
    }
    
    /// @see #a()
    public VkComponentMapping a(int a) {
    	A_HANDLE.set(segment, 0L, a);
    	return this;
    }
    
    public int a() {
    	return (int) A_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkComponentMapping set(VkComponentMapping other) {
        return set(other.segment);
    }
    
    @Override
    public VkComponentMapping set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkComponentMapping> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkComponentMapping> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkComponentMapping(segment),
            count
        );
    }
    
    public static NativeStructArray<VkComponentMapping> array(Arena arena, VkComponentMapping... structs) {
        NativeStructArray<VkComponentMapping> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkComponentMapping(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkComponentMapping> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkComponentMapping(segment)
        );
    }
    
}