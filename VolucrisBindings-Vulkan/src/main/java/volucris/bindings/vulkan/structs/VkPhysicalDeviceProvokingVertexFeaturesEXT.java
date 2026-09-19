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

public final class VkPhysicalDeviceProvokingVertexFeaturesEXT
		implements Struct<VkPhysicalDeviceProvokingVertexFeaturesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PROVOKING_VERTEX_LAST_HANDLE;
    public static final VarHandle TRANSFORM_FEEDBACK_PRESERVES_PROVOKING_VERTEX_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PROVOKING_VERTEX_LAST_BYTE_OFFSET;
    public static final long TRANSFORM_FEEDBACK_PRESERVES_PROVOKING_VERTEX_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("provokingVertexLast"),
            JAVA_INT.withName("transformFeedbackPreservesProvokingVertex")
        ).withName("VkPhysicalDeviceProvokingVertexFeaturesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PROVOKING_VERTEX_LAST_HANDLE = LAYOUT.varHandle(PathElement.groupElement("provokingVertexLast"));
        TRANSFORM_FEEDBACK_PRESERVES_PROVOKING_VERTEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("transformFeedbackPreservesProvokingVertex"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PROVOKING_VERTEX_LAST_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("provokingVertexLast"));
        TRANSFORM_FEEDBACK_PRESERVES_PROVOKING_VERTEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transformFeedbackPreservesProvokingVertex"));
        //@formatter:on
    }

    public VkPhysicalDeviceProvokingVertexFeaturesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceProvokingVertexFeaturesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceProvokingVertexFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceProvokingVertexFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceProvokingVertexFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #provokingVertexLast()
    public VkPhysicalDeviceProvokingVertexFeaturesEXT provokingVertexLast(int provokingVertexLast) {
    	PROVOKING_VERTEX_LAST_HANDLE.set(segment, 0L, provokingVertexLast);
    	return this;
    }
    
    public int provokingVertexLast() {
    	return (int) PROVOKING_VERTEX_LAST_HANDLE.get(segment, 0L);
    }
    
    /// @see #transformFeedbackPreservesProvokingVertex()
    public VkPhysicalDeviceProvokingVertexFeaturesEXT transformFeedbackPreservesProvokingVertex(int transformFeedbackPreservesProvokingVertex) {
    	TRANSFORM_FEEDBACK_PRESERVES_PROVOKING_VERTEX_HANDLE.set(segment, 0L, transformFeedbackPreservesProvokingVertex);
    	return this;
    }
    
    public int transformFeedbackPreservesProvokingVertex() {
    	return (int) TRANSFORM_FEEDBACK_PRESERVES_PROVOKING_VERTEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceProvokingVertexFeaturesEXT set(VkPhysicalDeviceProvokingVertexFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceProvokingVertexFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceProvokingVertexFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceProvokingVertexFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceProvokingVertexFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceProvokingVertexFeaturesEXT> array(Arena arena, VkPhysicalDeviceProvokingVertexFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceProvokingVertexFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceProvokingVertexFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceProvokingVertexFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceProvokingVertexFeaturesEXT(segment)
        );
    }
    
}