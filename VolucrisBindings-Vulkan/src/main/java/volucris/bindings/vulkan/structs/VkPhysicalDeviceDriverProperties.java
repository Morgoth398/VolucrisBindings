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

public final class VkPhysicalDeviceDriverProperties
		implements Struct<VkPhysicalDeviceDriverProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DRIVER_ID_HANDLE;
	public static final VarHandle DRIVER_NAME_HANDLE;
	public static final VarHandle DRIVER_INFO_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DRIVER_ID_BYTE_OFFSET;
	public static final long DRIVER_NAME_BYTE_OFFSET;
	public static final long DRIVER_INFO_BYTE_OFFSET;
	public static final long CONFORMANCE_VERSION_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkConformanceVersion conformanceVersion;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("driverID"),
		    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("driverName"),
		    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("driverInfo"),
		    VkConformanceVersion.LAYOUT.withName("conformanceVersion")
		).withName("VkPhysicalDeviceDriverProperties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DRIVER_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("driverID"));
		DRIVER_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("driverName"), PathElement.sequenceElement());
		DRIVER_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("driverInfo"), PathElement.sequenceElement());
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DRIVER_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("driverID"));
		DRIVER_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("driverName"));
		DRIVER_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("driverInfo"));
		CONFORMANCE_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("conformanceVersion"));
		//@formatter:on
	}

	public VkPhysicalDeviceDriverProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceDriverProperties(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceDriverProperties(MemorySegment segment) {
	    this.segment = segment;
	
	    conformanceVersion = new VkConformanceVersion(segment.asSlice(CONFORMANCE_VERSION_BYTE_OFFSET, VkConformanceVersion.LAYOUT));
	}

    /// @see #sType()
    public VkPhysicalDeviceDriverProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDriverProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #driverID()
    public VkPhysicalDeviceDriverProperties driverID(int driverID) {
    	DRIVER_ID_HANDLE.set(segment, 0L, driverID);
    	return this;
    }
    
    public int driverID() {
    	return (int) DRIVER_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #driverName(int)
    public VkPhysicalDeviceDriverProperties driverName(byte driverName, int index0) {
    	DRIVER_NAME_HANDLE.set(segment, 0L, index0, driverName);
    	return this;
    }
    
    public byte driverName(int index0) {
    	return (byte) DRIVER_NAME_HANDLE.get(segment, 0L, index0);
    }
    
    public String driverName() {
        return segment.getString(DRIVER_NAME_BYTE_OFFSET);
    }
    
    /// @see #driverInfo(int)
    public VkPhysicalDeviceDriverProperties driverInfo(byte driverInfo, int index0) {
    	DRIVER_INFO_HANDLE.set(segment, 0L, index0, driverInfo);
    	return this;
    }
    
    public byte driverInfo(int index0) {
    	return (byte) DRIVER_INFO_HANDLE.get(segment, 0L, index0);
    }
    
    public String driverInfo() {
        return segment.getString(DRIVER_INFO_BYTE_OFFSET);
    }
    
    /// @see #conformanceVersion()
    public VkPhysicalDeviceDriverProperties conformanceVersion(Consumer<VkConformanceVersion> consumer) {
    	consumer.accept(conformanceVersion);
    	return this;
    }
    
    /// @see #conformanceVersion()
    public VkPhysicalDeviceDriverProperties conformanceVersion(VkConformanceVersion other) {
    	conformanceVersion.set(other);
    	return this;
    }
    
    public VkConformanceVersion conformanceVersion() {
    	return conformanceVersion;
    }
    
    @Override
    public VkPhysicalDeviceDriverProperties set(VkPhysicalDeviceDriverProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDriverProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDriverProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDriverProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDriverProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDriverProperties> array(Arena arena, VkPhysicalDeviceDriverProperties... structs) {
        NativeStructArray<VkPhysicalDeviceDriverProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDriverProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDriverProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDriverProperties(segment)
        );
    }

}