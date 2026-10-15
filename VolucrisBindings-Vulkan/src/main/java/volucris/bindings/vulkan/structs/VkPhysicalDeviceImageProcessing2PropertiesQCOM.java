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

public final class VkPhysicalDeviceImageProcessing2PropertiesQCOM
		implements Struct<VkPhysicalDeviceImageProcessing2PropertiesQCOM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAX_BLOCK_MATCH_WINDOW_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent2D maxBlockMatchWindow;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkExtent2D.LAYOUT.withName("maxBlockMatchWindow")
		).withName("VkPhysicalDeviceImageProcessing2PropertiesQCOM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAX_BLOCK_MATCH_WINDOW_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxBlockMatchWindow"));
		//@formatter:on
	}

	public VkPhysicalDeviceImageProcessing2PropertiesQCOM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceImageProcessing2PropertiesQCOM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceImageProcessing2PropertiesQCOM(MemorySegment segment) {
	    this.segment = segment;
	
	    maxBlockMatchWindow = new VkExtent2D(segment.asSlice(MAX_BLOCK_MATCH_WINDOW_BYTE_OFFSET, VkExtent2D.LAYOUT));
	}

    /// @see #sType()
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxBlockMatchWindow()
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM maxBlockMatchWindow(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxBlockMatchWindow);
    	return this;
    }
    
    /// @see #maxBlockMatchWindow()
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM maxBlockMatchWindow(VkExtent2D other) {
    	maxBlockMatchWindow.set(other);
    	return this;
    }
    
    public VkExtent2D maxBlockMatchWindow() {
    	return maxBlockMatchWindow;
    }
    
    @Override
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM set(VkPhysicalDeviceImageProcessing2PropertiesQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceImageProcessing2PropertiesQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageProcessing2PropertiesQCOM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageProcessing2PropertiesQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageProcessing2PropertiesQCOM> array(Arena arena, VkPhysicalDeviceImageProcessing2PropertiesQCOM... structs) {
        NativeStructArray<VkPhysicalDeviceImageProcessing2PropertiesQCOM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageProcessing2PropertiesQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageProcessing2PropertiesQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageProcessing2PropertiesQCOM(segment)
        );
    }

}