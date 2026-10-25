/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
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

public final class VkPhysicalDeviceToolProperties
		implements Struct<VkPhysicalDeviceToolProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle NAME_HANDLE;
	public static final VarHandle VERSION_HANDLE;
	public static final VarHandle PURPOSES_HANDLE;
	public static final VarHandle DESCRIPTION_HANDLE;
	public static final VarHandle LAYER_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long NAME_BYTE_OFFSET;
	public static final long VERSION_BYTE_OFFSET;
	public static final long PURPOSES_BYTE_OFFSET;
	public static final long DESCRIPTION_BYTE_OFFSET;
	public static final long LAYER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("name"),
		    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("version"),
		    JAVA_INT.withName("purposes"),
		    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("description"),
		    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("layer"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceToolProperties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("name"), PathElement.sequenceElement());
		VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("version"), PathElement.sequenceElement());
		PURPOSES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("purposes"));
		DESCRIPTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
		LAYER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layer"), PathElement.sequenceElement());
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("name"));
		VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("version"));
		PURPOSES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("purposes"));
		DESCRIPTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("description"));
		LAYER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layer"));
		//@formatter:on
	}

	public VkPhysicalDeviceToolProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceToolProperties(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceToolProperties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceToolProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceToolProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #name(int)
    public VkPhysicalDeviceToolProperties name(byte name, int index0) {
    	NAME_HANDLE.set(segment, 0L, index0, name);
    	return this;
    }
    
    public byte name(int index0) {
    	return (byte) NAME_HANDLE.get(segment, 0L, index0);
    }
    
    public String name() {
        return segment.getString(NAME_BYTE_OFFSET);
    }
    
    /// @see #version(int)
    public VkPhysicalDeviceToolProperties version(byte version, int index0) {
    	VERSION_HANDLE.set(segment, 0L, index0, version);
    	return this;
    }
    
    public byte version(int index0) {
    	return (byte) VERSION_HANDLE.get(segment, 0L, index0);
    }
    
    public String version() {
        return segment.getString(VERSION_BYTE_OFFSET);
    }
    
    /// @see #purposes()
    public VkPhysicalDeviceToolProperties purposes(int purposes) {
    	PURPOSES_HANDLE.set(segment, 0L, purposes);
    	return this;
    }
    
    public int purposes() {
    	return (int) PURPOSES_HANDLE.get(segment, 0L);
    }
    
    /// @see #description(int)
    public VkPhysicalDeviceToolProperties description(byte description, int index0) {
    	DESCRIPTION_HANDLE.set(segment, 0L, index0, description);
    	return this;
    }
    
    public byte description(int index0) {
    	return (byte) DESCRIPTION_HANDLE.get(segment, 0L, index0);
    }
    
    public String description() {
        return segment.getString(DESCRIPTION_BYTE_OFFSET);
    }
    
    /// @see #layer(int)
    public VkPhysicalDeviceToolProperties layer(byte layer, int index0) {
    	LAYER_HANDLE.set(segment, 0L, index0, layer);
    	return this;
    }
    
    public byte layer(int index0) {
    	return (byte) LAYER_HANDLE.get(segment, 0L, index0);
    }
    
    public String layer() {
        return segment.getString(LAYER_BYTE_OFFSET);
    }
    
    @Override
    public VkPhysicalDeviceToolProperties set(VkPhysicalDeviceToolProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceToolProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceToolProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceToolProperties> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceToolProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceToolProperties> array(SegmentAllocator allocator, VkPhysicalDeviceToolProperties... structs) {
        NativeStructArray<VkPhysicalDeviceToolProperties> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceToolProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceToolProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceToolProperties(segment)
        );
    }

}