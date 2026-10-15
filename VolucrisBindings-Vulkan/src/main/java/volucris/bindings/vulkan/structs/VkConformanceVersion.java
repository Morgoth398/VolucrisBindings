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

public final class VkConformanceVersion
		implements Struct<VkConformanceVersion> {

	public static final StructLayout LAYOUT;

	public static final VarHandle MAJOR_HANDLE;
	public static final VarHandle MINOR_HANDLE;
	public static final VarHandle SUBMINOR_HANDLE;
	public static final VarHandle PATCH_HANDLE;

	public static final long MAJOR_BYTE_OFFSET;
	public static final long MINOR_BYTE_OFFSET;
	public static final long SUBMINOR_BYTE_OFFSET;
	public static final long PATCH_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_BYTE.withName("major"),
		    JAVA_BYTE.withName("minor"),
		    JAVA_BYTE.withName("subminor"),
		    JAVA_BYTE.withName("patch")
		).withName("VkConformanceVersion").withByteAlignment(1);
		
		MAJOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("major"));
		MINOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minor"));
		SUBMINOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subminor"));
		PATCH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("patch"));
		
		MAJOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("major"));
		MINOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minor"));
		SUBMINOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subminor"));
		PATCH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("patch"));
		//@formatter:on
	}

	public VkConformanceVersion() {
	    this(Arena.ofAuto());
	}
	
	public VkConformanceVersion(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkConformanceVersion(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #major()
    public VkConformanceVersion major(byte major) {
    	MAJOR_HANDLE.set(segment, 0L, major);
    	return this;
    }
    
    public byte major() {
    	return (byte) MAJOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #minor()
    public VkConformanceVersion minor(byte minor) {
    	MINOR_HANDLE.set(segment, 0L, minor);
    	return this;
    }
    
    public byte minor() {
    	return (byte) MINOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #subminor()
    public VkConformanceVersion subminor(byte subminor) {
    	SUBMINOR_HANDLE.set(segment, 0L, subminor);
    	return this;
    }
    
    public byte subminor() {
    	return (byte) SUBMINOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #patch()
    public VkConformanceVersion patch(byte patch) {
    	PATCH_HANDLE.set(segment, 0L, patch);
    	return this;
    }
    
    public byte patch() {
    	return (byte) PATCH_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkConformanceVersion set(VkConformanceVersion other) {
        return set(other.segment);
    }
    
    @Override
    public VkConformanceVersion set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkConformanceVersion> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkConformanceVersion> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkConformanceVersion(segment),
            count
        );
    }
    
    public static NativeStructArray<VkConformanceVersion> array(Arena arena, VkConformanceVersion... structs) {
        NativeStructArray<VkConformanceVersion> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkConformanceVersion(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkConformanceVersion> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkConformanceVersion(segment)
        );
    }

}