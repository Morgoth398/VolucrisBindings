@Override
public ${className} set(${className} other) {
    return set(other.segment);
}

@Override
public ${className} set(MemorySegment src) {
    MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
    return this;
}

@Override
public MemorySegment memorySegment() {
    return segment;
}

public NativeStructArray<${className}> asArray() {
    return new NativeStructArray<>(this);
}

public static NativeStructArray<${className}> array(SegmentAllocator allocator, int count) {
    return new NativeStructArray<>(
        allocator,
        LAYOUT,
        segment -> new ${className}(segment),
        count
    );
}

public static NativeStructArray<${className}> array(SegmentAllocator allocator, ${className}... structs) {
    NativeStructArray<${className}> array = new NativeStructArray<>(
        allocator,
        LAYOUT,
        segment -> new ${className}(segment),
        structs.length
    );

    for (int i = 0; i < structs.length; i++) {
        array.set(i, structs[i]);
    }

    return array;
}

public static NativeStructArray<${className}> array(MemorySegment array) {
    return new NativeStructArray<>(
        array,
        LAYOUT,
        segment -> new ${className}(segment)
    );
}