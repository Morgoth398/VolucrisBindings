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
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkTilePropertiesQCOM
		implements Struct<VkTilePropertiesQCOM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TILE_SIZE_BYTE_OFFSET;
	public static final long APRON_SIZE_BYTE_OFFSET;
	public static final long ORIGIN_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent3D tileSize;
	private final VkExtent2D apronSize;
	private final VkOffset2D origin;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkExtent3D.LAYOUT.withName("tileSize"),
		    VkExtent2D.LAYOUT.withName("apronSize"),
		    VkOffset2D.LAYOUT.withName("origin"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkTilePropertiesQCOM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TILE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tileSize"));
		APRON_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("apronSize"));
		ORIGIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("origin"));
		//@formatter:on
	}

	public VkTilePropertiesQCOM() {
	    this(Arena.ofAuto());
	}
	
	public VkTilePropertiesQCOM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkTilePropertiesQCOM(MemorySegment segment) {
	    this.segment = segment;
	
	    tileSize = new VkExtent3D(segment.asSlice(TILE_SIZE_BYTE_OFFSET, VkExtent3D.LAYOUT));
	    apronSize = new VkExtent2D(segment.asSlice(APRON_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
	    origin = new VkOffset2D(segment.asSlice(ORIGIN_BYTE_OFFSET, VkOffset2D.LAYOUT));
	}

    /// @see #sType()
    public VkTilePropertiesQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkTilePropertiesQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #tileSize()
    public VkTilePropertiesQCOM tileSize(Consumer<VkExtent3D> consumer) {
    	consumer.accept(tileSize);
    	return this;
    }
    
    /// @see #tileSize()
    public VkTilePropertiesQCOM tileSize(VkExtent3D other) {
    	tileSize.set(other);
    	return this;
    }
    
    public VkExtent3D tileSize() {
    	return tileSize;
    }
    
    /// @see #apronSize()
    public VkTilePropertiesQCOM apronSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(apronSize);
    	return this;
    }
    
    /// @see #apronSize()
    public VkTilePropertiesQCOM apronSize(VkExtent2D other) {
    	apronSize.set(other);
    	return this;
    }
    
    public VkExtent2D apronSize() {
    	return apronSize;
    }
    
    /// @see #origin()
    public VkTilePropertiesQCOM origin(Consumer<VkOffset2D> consumer) {
    	consumer.accept(origin);
    	return this;
    }
    
    /// @see #origin()
    public VkTilePropertiesQCOM origin(VkOffset2D other) {
    	origin.set(other);
    	return this;
    }
    
    public VkOffset2D origin() {
    	return origin;
    }
    
    @Override
    public VkTilePropertiesQCOM set(VkTilePropertiesQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkTilePropertiesQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkTilePropertiesQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkTilePropertiesQCOM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkTilePropertiesQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkTilePropertiesQCOM> array(SegmentAllocator allocator, VkTilePropertiesQCOM... structs) {
        NativeStructArray<VkTilePropertiesQCOM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkTilePropertiesQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkTilePropertiesQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkTilePropertiesQCOM(segment)
        );
    }

}