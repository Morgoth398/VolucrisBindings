package volucris.bindings.examples;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import volucris.bindings.mimalloc.MiHeap;
import volucris.bindings.mimalloc.Mimalloc;
import volucris.bindings.mimalloc.MimallocLoader;

public class MimallocExample implements Runnable {

	public MimallocExample() {

	}

	@Override
	public void run() {

		MimallocLoader.loadNativeLibrary();

		malloc();
		zalloc();
		calloc();
		realloc();

		mallocAligned();

		heap();
	}

	private void malloc() {
		MemorySegment mallocSegment = Mimalloc.mi_malloc(100);

		if (Mimalloc.mi_usable_size(mallocSegment) < 100)
			throw new RuntimeException("Invalid usable size");

		Mimalloc.mi_free(mallocSegment);
	}

	private void zalloc() {
		MemorySegment zallocSegment = Mimalloc.mi_zalloc(100);

		if (Mimalloc.mi_usable_size(zallocSegment) < 100)
			throw new RuntimeException("Invalid usable size");

		for (int i = 0; i < 100; i++) {
			if (zallocSegment.getAtIndex(ValueLayout.JAVA_BYTE, i) != 0)
				throw new RuntimeException("Not every byte is zero.");
		}

		Mimalloc.mi_free(zallocSegment);
	}

	private void calloc() {
		MemorySegment callocSegment = Mimalloc.mi_calloc(100, 1);

		if (Mimalloc.mi_usable_size(callocSegment) < 100)
			throw new RuntimeException("Invalid usable size.");

		for (int i = 0; i < 100; i++) {
			if (callocSegment.getAtIndex(ValueLayout.JAVA_BYTE, i) != 0)
				throw new RuntimeException("Not every byte is zero.");
		}

		Mimalloc.mi_free(callocSegment);
	}

	private void realloc() {
		MemorySegment callocSegment = Mimalloc.mi_calloc(16, 1);

		for (byte i = 0; i < 16; i++)
			callocSegment.setAtIndex(ValueLayout.JAVA_BYTE, i, i);

		MemorySegment reallocSegment = Mimalloc.mi_realloc(callocSegment, 100);

		for (byte i = 0; i < 16; i++) {
			if (reallocSegment.getAtIndex(ValueLayout.JAVA_BYTE, i) != i)
				throw new RuntimeException("Data missmatch.");
		}

		Mimalloc.mi_free(reallocSegment);
	}

	private void mallocAligned() {
		MemorySegment mallocAlignedSegment = Mimalloc.mi_malloc_aligned(100, 64);

		if (mallocAlignedSegment.address() % 64 != 0)
			throw new RuntimeException("Invalid alignment.");

		Mimalloc.mi_free(mallocAlignedSegment);
	}

	private void heap() {
		MiHeap miHeap = Mimalloc.mi_heap_new();

		MemorySegment mallocSegment = Mimalloc.mi_heap_malloc(miHeap, 100);

		if (!Mimalloc.mi_heap_contains(miHeap, mallocSegment))
			throw new RuntimeException("Heap does not contain segment.");

		Mimalloc.mi_heap_destroy(miHeap);
	}

}
