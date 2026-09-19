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

public final class VkLayerSettingsCreateInfoEXT
		implements Struct<VkLayerSettingsCreateInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SETTING_COUNT_HANDLE;
    public static final VarHandle P_SETTINGS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SETTING_COUNT_BYTE_OFFSET;
    public static final long P_SETTINGS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("settingCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pSettings")
        ).withName("VkLayerSettingsCreateInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SETTING_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("settingCount"));
        P_SETTINGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSettings"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SETTING_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("settingCount"));
        P_SETTINGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSettings"));
        //@formatter:on
    }

    public VkLayerSettingsCreateInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkLayerSettingsCreateInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkLayerSettingsCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkLayerSettingsCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkLayerSettingsCreateInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #settingCount()
    public VkLayerSettingsCreateInfoEXT settingCount(int settingCount) {
    	SETTING_COUNT_HANDLE.set(segment, 0L, settingCount);
    	return this;
    }
    
    public int settingCount() {
    	return (int) SETTING_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSettings()
    public VkLayerSettingsCreateInfoEXT pSettings(NativeStructArray<VkLayerSettingEXT> pSettings) {
    	P_SETTINGS_HANDLE.set(segment, 0L, pSettings.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkLayerSettingEXT> pSettings() {
    	MemorySegment segment = (MemorySegment) P_SETTINGS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkLayerSettingEXT.array(segment);
    }
    
    @Override
    public VkLayerSettingsCreateInfoEXT set(VkLayerSettingsCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkLayerSettingsCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkLayerSettingsCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkLayerSettingsCreateInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkLayerSettingsCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkLayerSettingsCreateInfoEXT> array(Arena arena, VkLayerSettingsCreateInfoEXT... structs) {
        NativeStructArray<VkLayerSettingsCreateInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkLayerSettingsCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkLayerSettingsCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkLayerSettingsCreateInfoEXT(segment)
        );
    }
    
}