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

public final class VkQueueFamilyDataGraphTOSAPropertiesARM
		implements Struct<VkQueueFamilyDataGraphTOSAPropertiesARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PROFILE_COUNT_HANDLE;
	public static final VarHandle P_PROFILES_HANDLE;
	public static final VarHandle EXTENSION_COUNT_HANDLE;
	public static final VarHandle P_EXTENSIONS_HANDLE;
	public static final VarHandle LEVEL_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PROFILE_COUNT_BYTE_OFFSET;
	public static final long P_PROFILES_BYTE_OFFSET;
	public static final long EXTENSION_COUNT_BYTE_OFFSET;
	public static final long P_EXTENSIONS_BYTE_OFFSET;
	public static final long LEVEL_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("profileCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pProfiles"),
		    JAVA_INT.withName("extensionCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pExtensions"),
		    JAVA_INT.withName("level"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkQueueFamilyDataGraphTOSAPropertiesARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PROFILE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("profileCount"));
		P_PROFILES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pProfiles"));
		EXTENSION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extensionCount"));
		P_EXTENSIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pExtensions"));
		LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("level"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PROFILE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("profileCount"));
		P_PROFILES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pProfiles"));
		EXTENSION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extensionCount"));
		P_EXTENSIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pExtensions"));
		LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("level"));
		//@formatter:on
	}

	public VkQueueFamilyDataGraphTOSAPropertiesARM() {
	    this(Arena.ofAuto());
	}
	
	public VkQueueFamilyDataGraphTOSAPropertiesARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkQueueFamilyDataGraphTOSAPropertiesARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkQueueFamilyDataGraphTOSAPropertiesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkQueueFamilyDataGraphTOSAPropertiesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #profileCount()
    public VkQueueFamilyDataGraphTOSAPropertiesARM profileCount(int profileCount) {
    	PROFILE_COUNT_HANDLE.set(segment, 0L, profileCount);
    	return this;
    }
    
    public int profileCount() {
    	return (int) PROFILE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pProfiles()
    public VkQueueFamilyDataGraphTOSAPropertiesARM pProfiles(NativeStructArray<VkDataGraphTOSANameQualityARM> pProfiles) {
    	P_PROFILES_HANDLE.set(segment, 0L, pProfiles.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkDataGraphTOSANameQualityARM> pProfiles() {
    	MemorySegment segment = (MemorySegment) P_PROFILES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkDataGraphTOSANameQualityARM.array(segment);
    }
    
    /// @see #extensionCount()
    public VkQueueFamilyDataGraphTOSAPropertiesARM extensionCount(int extensionCount) {
    	EXTENSION_COUNT_HANDLE.set(segment, 0L, extensionCount);
    	return this;
    }
    
    public int extensionCount() {
    	return (int) EXTENSION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pExtensions()
    public VkQueueFamilyDataGraphTOSAPropertiesARM pExtensions(NativeStructArray<VkDataGraphTOSANameQualityARM> pExtensions) {
    	P_EXTENSIONS_HANDLE.set(segment, 0L, pExtensions.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkDataGraphTOSANameQualityARM> pExtensions() {
    	MemorySegment segment = (MemorySegment) P_EXTENSIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkDataGraphTOSANameQualityARM.array(segment);
    }
    
    /// @see #level()
    public VkQueueFamilyDataGraphTOSAPropertiesARM level(int level) {
    	LEVEL_HANDLE.set(segment, 0L, level);
    	return this;
    }
    
    public int level() {
    	return (int) LEVEL_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkQueueFamilyDataGraphTOSAPropertiesARM set(VkQueueFamilyDataGraphTOSAPropertiesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkQueueFamilyDataGraphTOSAPropertiesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkQueueFamilyDataGraphTOSAPropertiesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkQueueFamilyDataGraphTOSAPropertiesARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkQueueFamilyDataGraphTOSAPropertiesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkQueueFamilyDataGraphTOSAPropertiesARM> array(Arena arena, VkQueueFamilyDataGraphTOSAPropertiesARM... structs) {
        NativeStructArray<VkQueueFamilyDataGraphTOSAPropertiesARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkQueueFamilyDataGraphTOSAPropertiesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkQueueFamilyDataGraphTOSAPropertiesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkQueueFamilyDataGraphTOSAPropertiesARM(segment)
        );
    }

}