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

public final class VkPhysicalDeviceDiagnosticsConfigFeaturesNV
		implements Struct<VkPhysicalDeviceDiagnosticsConfigFeaturesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DIAGNOSTICS_CONFIG_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DIAGNOSTICS_CONFIG_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("diagnosticsConfig"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceDiagnosticsConfigFeaturesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DIAGNOSTICS_CONFIG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("diagnosticsConfig"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DIAGNOSTICS_CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("diagnosticsConfig"));
		//@formatter:on
	}

	public VkPhysicalDeviceDiagnosticsConfigFeaturesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceDiagnosticsConfigFeaturesNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceDiagnosticsConfigFeaturesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #diagnosticsConfig()
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV diagnosticsConfig(int diagnosticsConfig) {
    	DIAGNOSTICS_CONFIG_HANDLE.set(segment, 0L, diagnosticsConfig);
    	return this;
    }
    
    public int diagnosticsConfig() {
    	return (int) DIAGNOSTICS_CONFIG_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV set(VkPhysicalDeviceDiagnosticsConfigFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDiagnosticsConfigFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDiagnosticsConfigFeaturesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDiagnosticsConfigFeaturesNV> array(Arena arena, VkPhysicalDeviceDiagnosticsConfigFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceDiagnosticsConfigFeaturesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDiagnosticsConfigFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(segment)
        );
    }

}