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

public final class VkShaderModuleValidationCacheCreateInfoEXT
		implements Struct<VkShaderModuleValidationCacheCreateInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle VALIDATION_CACHE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long VALIDATION_CACHE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("validationCache")
		).withName("VkShaderModuleValidationCacheCreateInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		VALIDATION_CACHE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("validationCache"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		VALIDATION_CACHE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("validationCache"));
		//@formatter:on
	}

	public VkShaderModuleValidationCacheCreateInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkShaderModuleValidationCacheCreateInfoEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkShaderModuleValidationCacheCreateInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkShaderModuleValidationCacheCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkShaderModuleValidationCacheCreateInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #validationCache()
    public VkShaderModuleValidationCacheCreateInfoEXT validationCache(VkValidationCacheEXT validationCache) {
    	VALIDATION_CACHE_HANDLE.set(segment, 0L, validationCache.memorySegment());
    	return this;
    }
    
    public @Nullable VkValidationCacheEXT validationCache() {
    	MemorySegment segment = (MemorySegment) VALIDATION_CACHE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkValidationCacheEXT(segment);
    }
    
    @Override
    public VkShaderModuleValidationCacheCreateInfoEXT set(VkShaderModuleValidationCacheCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkShaderModuleValidationCacheCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkShaderModuleValidationCacheCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkShaderModuleValidationCacheCreateInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkShaderModuleValidationCacheCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkShaderModuleValidationCacheCreateInfoEXT> array(Arena arena, VkShaderModuleValidationCacheCreateInfoEXT... structs) {
        NativeStructArray<VkShaderModuleValidationCacheCreateInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkShaderModuleValidationCacheCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkShaderModuleValidationCacheCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkShaderModuleValidationCacheCreateInfoEXT(segment)
        );
    }

}