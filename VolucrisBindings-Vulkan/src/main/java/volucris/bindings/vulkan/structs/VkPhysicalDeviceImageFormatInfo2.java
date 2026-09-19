/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPhysicalDeviceImageFormatInfo2
		implements Struct<VkPhysicalDeviceImageFormatInfo2> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FORMAT_HANDLE;
    public static final VarHandle TYPE_HANDLE;
    public static final VarHandle TILING_HANDLE;
    public static final VarHandle USAGE_HANDLE;
    public static final VarHandle FLAGS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FORMAT_BYTE_OFFSET;
    public static final long TYPE_BYTE_OFFSET;
    public static final long TILING_BYTE_OFFSET;
    public static final long USAGE_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("format"),
            JAVA_INT.withName("type"),
            JAVA_INT.withName("tiling"),
            JAVA_INT.withName("usage"),
            JAVA_INT.withName("flags"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceImageFormatInfo2").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
        TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
        TILING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tiling"));
        USAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("usage"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
        TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
        TILING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tiling"));
        USAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("usage"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        //@formatter:on
    }

    public VkPhysicalDeviceImageFormatInfo2() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceImageFormatInfo2(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceImageFormatInfo2(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceImageFormatInfo2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceImageFormatInfo2 pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #format()
    public VkPhysicalDeviceImageFormatInfo2 format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #type()
    public VkPhysicalDeviceImageFormatInfo2 type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #tiling()
    public VkPhysicalDeviceImageFormatInfo2 tiling(int tiling) {
    	TILING_HANDLE.set(segment, 0L, tiling);
    	return this;
    }
    
    public int tiling() {
    	return (int) TILING_HANDLE.get(segment, 0L);
    }
    
    /// @see #usage()
    public VkPhysicalDeviceImageFormatInfo2 usage(int usage) {
    	USAGE_HANDLE.set(segment, 0L, usage);
    	return this;
    }
    
    public int usage() {
    	return (int) USAGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VkPhysicalDeviceImageFormatInfo2 flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceImageFormatInfo2 set(VkPhysicalDeviceImageFormatInfo2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceImageFormatInfo2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceImageFormatInfo2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageFormatInfo2> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageFormatInfo2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageFormatInfo2> array(Arena arena, VkPhysicalDeviceImageFormatInfo2... structs) {
        NativeStructArray<VkPhysicalDeviceImageFormatInfo2> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageFormatInfo2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageFormatInfo2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageFormatInfo2(segment)
        );
    }
    
}