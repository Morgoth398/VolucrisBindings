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

public final class VkLayerSettingEXT
		implements Struct<VkLayerSettingEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle P_LAYER_NAME_HANDLE;
    public static final VarHandle P_SETTING_NAME_HANDLE;
    public static final VarHandle TYPE_HANDLE;
    public static final VarHandle VALUE_COUNT_HANDLE;
    public static final VarHandle P_VALUES_HANDLE;

    public static final long P_LAYER_NAME_BYTE_OFFSET;
    public static final long P_SETTING_NAME_BYTE_OFFSET;
    public static final long TYPE_BYTE_OFFSET;
    public static final long VALUE_COUNT_BYTE_OFFSET;
    public static final long P_VALUES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("pLayerName"),
            UNBOUNDED_ADDRESS.withName("pSettingName"),
            JAVA_INT.withName("type"),
            JAVA_INT.withName("valueCount"),
            UNBOUNDED_ADDRESS.withName("pValues")
        ).withName("VkLayerSettingEXT").withByteAlignment(8);
        
        P_LAYER_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLayerName"));
        P_SETTING_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSettingName"));
        TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
        VALUE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("valueCount"));
        P_VALUES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pValues"));
        
        P_LAYER_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLayerName"));
        P_SETTING_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSettingName"));
        TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
        VALUE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("valueCount"));
        P_VALUES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pValues"));
        //@formatter:on
    }

    public VkLayerSettingEXT() {
        this(Arena.ofAuto());
    }
    
    public VkLayerSettingEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkLayerSettingEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #pLayerName()
    public VkLayerSettingEXT pLayerName(Arena arena, String pLayerName) {
    	P_LAYER_NAME_HANDLE.set(segment, 0L, arena.allocateFrom(pLayerName));
    	return this;
    }
    
    public @Nullable String pLayerName() {
    	MemorySegment segment = (MemorySegment) P_LAYER_NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// @see #pSettingName()
    public VkLayerSettingEXT pSettingName(Arena arena, String pSettingName) {
    	P_SETTING_NAME_HANDLE.set(segment, 0L, arena.allocateFrom(pSettingName));
    	return this;
    }
    
    public @Nullable String pSettingName() {
    	MemorySegment segment = (MemorySegment) P_SETTING_NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// @see #type()
    public VkLayerSettingEXT type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #valueCount()
    public VkLayerSettingEXT valueCount(int valueCount) {
    	VALUE_COUNT_HANDLE.set(segment, 0L, valueCount);
    	return this;
    }
    
    public int valueCount() {
    	return (int) VALUE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pValues()
    public VkLayerSettingEXT pValues(MemorySegment pValues) {
    	P_VALUES_HANDLE.set(segment, 0L, pValues);
    	return this;
    }
    
    public @Nullable MemorySegment pValues() {
    	MemorySegment segment = (MemorySegment) P_VALUES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VkLayerSettingEXT set(VkLayerSettingEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkLayerSettingEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkLayerSettingEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkLayerSettingEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkLayerSettingEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkLayerSettingEXT> array(Arena arena, VkLayerSettingEXT... structs) {
        NativeStructArray<VkLayerSettingEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkLayerSettingEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkLayerSettingEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkLayerSettingEXT(segment)
        );
    }
    
}