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

public final class VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT
		implements Struct<VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PRIMITIVES_GENERATED_QUERY_HANDLE;
    public static final VarHandle PRIMITIVES_GENERATED_QUERY_WITH_RASTERIZER_DISCARD_HANDLE;
    public static final VarHandle PRIMITIVES_GENERATED_QUERY_WITH_NON_ZERO_STREAMS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PRIMITIVES_GENERATED_QUERY_BYTE_OFFSET;
    public static final long PRIMITIVES_GENERATED_QUERY_WITH_RASTERIZER_DISCARD_BYTE_OFFSET;
    public static final long PRIMITIVES_GENERATED_QUERY_WITH_NON_ZERO_STREAMS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("primitivesGeneratedQuery"),
            JAVA_INT.withName("primitivesGeneratedQueryWithRasterizerDiscard"),
            JAVA_INT.withName("primitivesGeneratedQueryWithNonZeroStreams"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PRIMITIVES_GENERATED_QUERY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("primitivesGeneratedQuery"));
        PRIMITIVES_GENERATED_QUERY_WITH_RASTERIZER_DISCARD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("primitivesGeneratedQueryWithRasterizerDiscard"));
        PRIMITIVES_GENERATED_QUERY_WITH_NON_ZERO_STREAMS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("primitivesGeneratedQueryWithNonZeroStreams"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PRIMITIVES_GENERATED_QUERY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("primitivesGeneratedQuery"));
        PRIMITIVES_GENERATED_QUERY_WITH_RASTERIZER_DISCARD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("primitivesGeneratedQueryWithRasterizerDiscard"));
        PRIMITIVES_GENERATED_QUERY_WITH_NON_ZERO_STREAMS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("primitivesGeneratedQueryWithNonZeroStreams"));
        //@formatter:on
    }

    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #primitivesGeneratedQuery()
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQuery(int primitivesGeneratedQuery) {
    	PRIMITIVES_GENERATED_QUERY_HANDLE.set(segment, 0L, primitivesGeneratedQuery);
    	return this;
    }
    
    public int primitivesGeneratedQuery() {
    	return (int) PRIMITIVES_GENERATED_QUERY_HANDLE.get(segment, 0L);
    }
    
    /// @see #primitivesGeneratedQueryWithRasterizerDiscard()
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQueryWithRasterizerDiscard(int primitivesGeneratedQueryWithRasterizerDiscard) {
    	PRIMITIVES_GENERATED_QUERY_WITH_RASTERIZER_DISCARD_HANDLE.set(segment, 0L, primitivesGeneratedQueryWithRasterizerDiscard);
    	return this;
    }
    
    public int primitivesGeneratedQueryWithRasterizerDiscard() {
    	return (int) PRIMITIVES_GENERATED_QUERY_WITH_RASTERIZER_DISCARD_HANDLE.get(segment, 0L);
    }
    
    /// @see #primitivesGeneratedQueryWithNonZeroStreams()
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQueryWithNonZeroStreams(int primitivesGeneratedQueryWithNonZeroStreams) {
    	PRIMITIVES_GENERATED_QUERY_WITH_NON_ZERO_STREAMS_HANDLE.set(segment, 0L, primitivesGeneratedQueryWithNonZeroStreams);
    	return this;
    }
    
    public int primitivesGeneratedQueryWithNonZeroStreams() {
    	return (int) PRIMITIVES_GENERATED_QUERY_WITH_NON_ZERO_STREAMS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT set(VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT> array(Arena arena, VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(segment)
        );
    }
    
}