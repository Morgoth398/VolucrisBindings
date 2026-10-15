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

public final class VkApplicationInfo
		implements Struct<VkApplicationInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_APPLICATION_NAME_HANDLE;
	public static final VarHandle APPLICATION_VERSION_HANDLE;
	public static final VarHandle P_ENGINE_NAME_HANDLE;
	public static final VarHandle ENGINE_VERSION_HANDLE;
	public static final VarHandle API_VERSION_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_APPLICATION_NAME_BYTE_OFFSET;
	public static final long APPLICATION_VERSION_BYTE_OFFSET;
	public static final long P_ENGINE_NAME_BYTE_OFFSET;
	public static final long ENGINE_VERSION_BYTE_OFFSET;
	public static final long API_VERSION_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pApplicationName"),
		    JAVA_INT.withName("applicationVersion"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pEngineName"),
		    JAVA_INT.withName("engineVersion"),
		    JAVA_INT.withName("apiVersion")
		).withName("VkApplicationInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_APPLICATION_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pApplicationName"));
		APPLICATION_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("applicationVersion"));
		P_ENGINE_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pEngineName"));
		ENGINE_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("engineVersion"));
		API_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("apiVersion"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_APPLICATION_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pApplicationName"));
		APPLICATION_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("applicationVersion"));
		P_ENGINE_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pEngineName"));
		ENGINE_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("engineVersion"));
		API_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("apiVersion"));
		//@formatter:on
	}

	public VkApplicationInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkApplicationInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkApplicationInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkApplicationInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkApplicationInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pApplicationName()
    public VkApplicationInfo pApplicationName(Arena arena, String pApplicationName) {
    	P_APPLICATION_NAME_HANDLE.set(segment, 0L, arena.allocateFrom(pApplicationName));
    	return this;
    }
    
    public @Nullable String pApplicationName() {
    	MemorySegment segment = (MemorySegment) P_APPLICATION_NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// @see #applicationVersion()
    public VkApplicationInfo applicationVersion(int applicationVersion) {
    	APPLICATION_VERSION_HANDLE.set(segment, 0L, applicationVersion);
    	return this;
    }
    
    public int applicationVersion() {
    	return (int) APPLICATION_VERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #pEngineName()
    public VkApplicationInfo pEngineName(Arena arena, String pEngineName) {
    	P_ENGINE_NAME_HANDLE.set(segment, 0L, arena.allocateFrom(pEngineName));
    	return this;
    }
    
    public @Nullable String pEngineName() {
    	MemorySegment segment = (MemorySegment) P_ENGINE_NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// @see #engineVersion()
    public VkApplicationInfo engineVersion(int engineVersion) {
    	ENGINE_VERSION_HANDLE.set(segment, 0L, engineVersion);
    	return this;
    }
    
    public int engineVersion() {
    	return (int) ENGINE_VERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #apiVersion()
    public VkApplicationInfo apiVersion(int apiVersion) {
    	API_VERSION_HANDLE.set(segment, 0L, apiVersion);
    	return this;
    }
    
    public int apiVersion() {
    	return (int) API_VERSION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkApplicationInfo set(VkApplicationInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkApplicationInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkApplicationInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkApplicationInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkApplicationInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkApplicationInfo> array(Arena arena, VkApplicationInfo... structs) {
        NativeStructArray<VkApplicationInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkApplicationInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkApplicationInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkApplicationInfo(segment)
        );
    }

}