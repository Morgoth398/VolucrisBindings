/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
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

public final class VkRenderPassTileShadingCreateInfoQCOM
		implements Struct<VkRenderPassTileShadingCreateInfoQCOM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long TILE_APRON_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent2D tileApronSize;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    VkExtent2D.LAYOUT.withName("tileApronSize"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkRenderPassTileShadingCreateInfoQCOM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		TILE_APRON_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tileApronSize"));
		//@formatter:on
	}

	public VkRenderPassTileShadingCreateInfoQCOM() {
	    this(Arena.ofAuto());
	}
	
	public VkRenderPassTileShadingCreateInfoQCOM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkRenderPassTileShadingCreateInfoQCOM(MemorySegment segment) {
	    this.segment = segment;
	
	    tileApronSize = new VkExtent2D(segment.asSlice(TILE_APRON_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
	}

    /// @see #sType()
    public VkRenderPassTileShadingCreateInfoQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRenderPassTileShadingCreateInfoQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkRenderPassTileShadingCreateInfoQCOM flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #tileApronSize()
    public VkRenderPassTileShadingCreateInfoQCOM tileApronSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(tileApronSize);
    	return this;
    }
    
    /// @see #tileApronSize()
    public VkRenderPassTileShadingCreateInfoQCOM tileApronSize(VkExtent2D other) {
    	tileApronSize.set(other);
    	return this;
    }
    
    public VkExtent2D tileApronSize() {
    	return tileApronSize;
    }
    
    @Override
    public VkRenderPassTileShadingCreateInfoQCOM set(VkRenderPassTileShadingCreateInfoQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderPassTileShadingCreateInfoQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderPassTileShadingCreateInfoQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderPassTileShadingCreateInfoQCOM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderPassTileShadingCreateInfoQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderPassTileShadingCreateInfoQCOM> array(Arena arena, VkRenderPassTileShadingCreateInfoQCOM... structs) {
        NativeStructArray<VkRenderPassTileShadingCreateInfoQCOM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderPassTileShadingCreateInfoQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderPassTileShadingCreateInfoQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderPassTileShadingCreateInfoQCOM(segment)
        );
    }

}