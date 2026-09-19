/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.msdfgen;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MsdfTransform
		implements Struct<MsdfTransform> {

    public static final StructLayout LAYOUT;

    public static final long SCALE_BYTE_OFFSET;
    public static final long TRANSLATION_BYTE_OFFSET;
    public static final long DISTANCE_MAPPING_BYTE_OFFSET;

    private final MemorySegment segment;

    private final MsdfVector2 scale;
    private final MsdfVector2 translation;
    private final MsdfRange distance_mapping;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            MsdfVector2.LAYOUT.withName("scale"),
            MsdfVector2.LAYOUT.withName("translation"),
            MsdfRange.LAYOUT.withName("distance_mapping")
        ).withName("msdf_transform").withByteAlignment(8);
        
        SCALE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("scale"));
        TRANSLATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("translation"));
        DISTANCE_MAPPING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("distance_mapping"));
        //@formatter:on
    }

    public MsdfTransform() {
        this(Arena.ofAuto());
    }
    
    public MsdfTransform(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public MsdfTransform(MemorySegment segment) {
        this.segment = segment;
    
        scale = new MsdfVector2(segment.asSlice(SCALE_BYTE_OFFSET, MsdfVector2.LAYOUT));
        translation = new MsdfVector2(segment.asSlice(TRANSLATION_BYTE_OFFSET, MsdfVector2.LAYOUT));
        distance_mapping = new MsdfRange(segment.asSlice(DISTANCE_MAPPING_BYTE_OFFSET, MsdfRange.LAYOUT));
    }

    /// @see #scale()
    public MsdfTransform scale(Consumer<MsdfVector2> consumer) {
    	consumer.accept(scale);
    	return this;
    }
    
    /// @see #scale()
    public MsdfTransform scale(MsdfVector2 other) {
    	scale.set(other);
    	return this;
    }
    
    public MsdfVector2 scale() {
    	return scale;
    }
    
    /// @see #translation()
    public MsdfTransform translation(Consumer<MsdfVector2> consumer) {
    	consumer.accept(translation);
    	return this;
    }
    
    /// @see #translation()
    public MsdfTransform translation(MsdfVector2 other) {
    	translation.set(other);
    	return this;
    }
    
    public MsdfVector2 translation() {
    	return translation;
    }
    
    /// @see #distance_mapping()
    public MsdfTransform distance_mapping(Consumer<MsdfRange> consumer) {
    	consumer.accept(distance_mapping);
    	return this;
    }
    
    /// @see #distance_mapping()
    public MsdfTransform distance_mapping(MsdfRange other) {
    	distance_mapping.set(other);
    	return this;
    }
    
    public MsdfRange distance_mapping() {
    	return distance_mapping;
    }
    
    @Override
    public MsdfTransform set(MsdfTransform other) {
        return set(other.segment);
    }
    
    @Override
    public MsdfTransform set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MsdfTransform> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MsdfTransform> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MsdfTransform(segment),
            count
        );
    }
    
    public static NativeStructArray<MsdfTransform> array(Arena arena, MsdfTransform... structs) {
        NativeStructArray<MsdfTransform> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MsdfTransform(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MsdfTransform> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MsdfTransform(segment)
        );
    }
    
}