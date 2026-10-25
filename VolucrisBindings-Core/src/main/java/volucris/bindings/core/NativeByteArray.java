package volucris.bindings.core;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

public class NativeByteArray {

	private final MemorySegment segment;

	public NativeByteArray(SegmentAllocator allocator, byte... values) {
		segment = allocator.allocateFrom(ValueLayout.JAVA_BYTE, values);
	}

	public NativeByteArray(SegmentAllocator allocator, int count) {
		segment = allocator.allocate(ValueLayout.JAVA_BYTE, count);
	}

	public NativeByteArray(SegmentAllocator allocator, String string) {
		segment = allocator.allocateFrom(string);
	}

	public NativeByteArray(MemorySegment segment) {
		this.segment = segment;
	}

	public byte get(int index) {
		return segment.getAtIndex(ValueLayout.JAVA_BYTE, index);
	}

	public NativeByteArray set(int index, byte value) {
		segment.setAtIndex(ValueLayout.JAVA_BYTE, index, value);
		return this;
	}

	public NativeByteArray set(int dstIndex, int srcIndex, int count, NativeByteArray values) {
		MemorySegment.copy(
				values.memorySegment(), ValueLayout.JAVA_BYTE,
				srcIndex,
				segment, ValueLayout.JAVA_BYTE,
				dstIndex,
				count
		);
		return this;
	}

	public NativeByteArray fill(int index, int count, byte value) {
		for (int i = 0; i < count; i++)
			set(index + i, value);
		return this;
	}

	public NativeByteArray set(int dstIndex, int srcIndex, int count, byte... values) {
		long dstOffset = dstIndex * ValueLayout.JAVA_BYTE.byteSize();
		MemorySegment.copy(values, srcIndex, segment, ValueLayout.JAVA_BYTE, dstOffset, count);
		return this;
	}

	public byte[] get(int dstIndex, int srcIndex, int count, byte[] target) {
		long srcOffset = srcIndex * ValueLayout.JAVA_BYTE.byteSize();
		MemorySegment.copy(segment, ValueLayout.JAVA_BYTE, srcOffset, target, dstIndex, count);
		return target;
	}

	public byte[] toArray() {
		return segment.toArray(ValueLayout.JAVA_BYTE);
	}

	public String getString() {
		return segment.getString(0);
	}

	public MemorySegment memorySegment() {
		return segment;
	}

}
