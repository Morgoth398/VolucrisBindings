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

public final class VkPhysicalDeviceDrmPropertiesEXT
		implements Struct<VkPhysicalDeviceDrmPropertiesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle HAS_PRIMARY_HANDLE;
    public static final VarHandle HAS_RENDER_HANDLE;
    public static final VarHandle PRIMARY_MAJOR_HANDLE;
    public static final VarHandle PRIMARY_MINOR_HANDLE;
    public static final VarHandle RENDER_MAJOR_HANDLE;
    public static final VarHandle RENDER_MINOR_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long HAS_PRIMARY_BYTE_OFFSET;
    public static final long HAS_RENDER_BYTE_OFFSET;
    public static final long PRIMARY_MAJOR_BYTE_OFFSET;
    public static final long PRIMARY_MINOR_BYTE_OFFSET;
    public static final long RENDER_MAJOR_BYTE_OFFSET;
    public static final long RENDER_MINOR_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("hasPrimary"),
            JAVA_INT.withName("hasRender"),
            JAVA_LONG.withName("primaryMajor"),
            JAVA_LONG.withName("primaryMinor"),
            JAVA_LONG.withName("renderMajor"),
            JAVA_LONG.withName("renderMinor")
        ).withName("VkPhysicalDeviceDrmPropertiesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        HAS_PRIMARY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hasPrimary"));
        HAS_RENDER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hasRender"));
        PRIMARY_MAJOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("primaryMajor"));
        PRIMARY_MINOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("primaryMinor"));
        RENDER_MAJOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("renderMajor"));
        RENDER_MINOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("renderMinor"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        HAS_PRIMARY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hasPrimary"));
        HAS_RENDER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hasRender"));
        PRIMARY_MAJOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("primaryMajor"));
        PRIMARY_MINOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("primaryMinor"));
        RENDER_MAJOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("renderMajor"));
        RENDER_MINOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("renderMinor"));
        //@formatter:on
    }

    public VkPhysicalDeviceDrmPropertiesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceDrmPropertiesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceDrmPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceDrmPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDrmPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #hasPrimary()
    public VkPhysicalDeviceDrmPropertiesEXT hasPrimary(int hasPrimary) {
    	HAS_PRIMARY_HANDLE.set(segment, 0L, hasPrimary);
    	return this;
    }
    
    public int hasPrimary() {
    	return (int) HAS_PRIMARY_HANDLE.get(segment, 0L);
    }
    
    /// @see #hasRender()
    public VkPhysicalDeviceDrmPropertiesEXT hasRender(int hasRender) {
    	HAS_RENDER_HANDLE.set(segment, 0L, hasRender);
    	return this;
    }
    
    public int hasRender() {
    	return (int) HAS_RENDER_HANDLE.get(segment, 0L);
    }
    
    /// @see #primaryMajor()
    public VkPhysicalDeviceDrmPropertiesEXT primaryMajor(long primaryMajor) {
    	PRIMARY_MAJOR_HANDLE.set(segment, 0L, primaryMajor);
    	return this;
    }
    
    public long primaryMajor() {
    	return (long) PRIMARY_MAJOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #primaryMinor()
    public VkPhysicalDeviceDrmPropertiesEXT primaryMinor(long primaryMinor) {
    	PRIMARY_MINOR_HANDLE.set(segment, 0L, primaryMinor);
    	return this;
    }
    
    public long primaryMinor() {
    	return (long) PRIMARY_MINOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #renderMajor()
    public VkPhysicalDeviceDrmPropertiesEXT renderMajor(long renderMajor) {
    	RENDER_MAJOR_HANDLE.set(segment, 0L, renderMajor);
    	return this;
    }
    
    public long renderMajor() {
    	return (long) RENDER_MAJOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #renderMinor()
    public VkPhysicalDeviceDrmPropertiesEXT renderMinor(long renderMinor) {
    	RENDER_MINOR_HANDLE.set(segment, 0L, renderMinor);
    	return this;
    }
    
    public long renderMinor() {
    	return (long) RENDER_MINOR_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDrmPropertiesEXT set(VkPhysicalDeviceDrmPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDrmPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDrmPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDrmPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDrmPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDrmPropertiesEXT> array(Arena arena, VkPhysicalDeviceDrmPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceDrmPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDrmPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDrmPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDrmPropertiesEXT(segment)
        );
    }
    
}