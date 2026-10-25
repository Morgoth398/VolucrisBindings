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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkValidationFeaturesEXT
		implements Struct<VkValidationFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ENABLED_VALIDATION_FEATURE_COUNT_HANDLE;
	public static final VarHandle P_ENABLED_VALIDATION_FEATURES_HANDLE;
	public static final VarHandle DISABLED_VALIDATION_FEATURE_COUNT_HANDLE;
	public static final VarHandle P_DISABLED_VALIDATION_FEATURES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ENABLED_VALIDATION_FEATURE_COUNT_BYTE_OFFSET;
	public static final long P_ENABLED_VALIDATION_FEATURES_BYTE_OFFSET;
	public static final long DISABLED_VALIDATION_FEATURE_COUNT_BYTE_OFFSET;
	public static final long P_DISABLED_VALIDATION_FEATURES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("enabledValidationFeatureCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pEnabledValidationFeatures"),
		    JAVA_INT.withName("disabledValidationFeatureCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pDisabledValidationFeatures")
		).withName("VkValidationFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ENABLED_VALIDATION_FEATURE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enabledValidationFeatureCount"));
		P_ENABLED_VALIDATION_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pEnabledValidationFeatures"));
		DISABLED_VALIDATION_FEATURE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("disabledValidationFeatureCount"));
		P_DISABLED_VALIDATION_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDisabledValidationFeatures"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ENABLED_VALIDATION_FEATURE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enabledValidationFeatureCount"));
		P_ENABLED_VALIDATION_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pEnabledValidationFeatures"));
		DISABLED_VALIDATION_FEATURE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("disabledValidationFeatureCount"));
		P_DISABLED_VALIDATION_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDisabledValidationFeatures"));
		//@formatter:on
	}

	public VkValidationFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkValidationFeaturesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkValidationFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkValidationFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkValidationFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #enabledValidationFeatureCount()
    public VkValidationFeaturesEXT enabledValidationFeatureCount(int enabledValidationFeatureCount) {
    	ENABLED_VALIDATION_FEATURE_COUNT_HANDLE.set(segment, 0L, enabledValidationFeatureCount);
    	return this;
    }
    
    public int enabledValidationFeatureCount() {
    	return (int) ENABLED_VALIDATION_FEATURE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pEnabledValidationFeatures()
    public VkValidationFeaturesEXT pEnabledValidationFeatures(NativeIntArray pEnabledValidationFeatures) {
    	P_ENABLED_VALIDATION_FEATURES_HANDLE.set(segment, 0L, pEnabledValidationFeatures.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pEnabledValidationFeatures() {
    	MemorySegment segment = (MemorySegment) P_ENABLED_VALIDATION_FEATURES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #disabledValidationFeatureCount()
    public VkValidationFeaturesEXT disabledValidationFeatureCount(int disabledValidationFeatureCount) {
    	DISABLED_VALIDATION_FEATURE_COUNT_HANDLE.set(segment, 0L, disabledValidationFeatureCount);
    	return this;
    }
    
    public int disabledValidationFeatureCount() {
    	return (int) DISABLED_VALIDATION_FEATURE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDisabledValidationFeatures()
    public VkValidationFeaturesEXT pDisabledValidationFeatures(NativeIntArray pDisabledValidationFeatures) {
    	P_DISABLED_VALIDATION_FEATURES_HANDLE.set(segment, 0L, pDisabledValidationFeatures.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pDisabledValidationFeatures() {
    	MemorySegment segment = (MemorySegment) P_DISABLED_VALIDATION_FEATURES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkValidationFeaturesEXT set(VkValidationFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkValidationFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkValidationFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkValidationFeaturesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkValidationFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkValidationFeaturesEXT> array(SegmentAllocator allocator, VkValidationFeaturesEXT... structs) {
        NativeStructArray<VkValidationFeaturesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkValidationFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkValidationFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkValidationFeaturesEXT(segment)
        );
    }

}