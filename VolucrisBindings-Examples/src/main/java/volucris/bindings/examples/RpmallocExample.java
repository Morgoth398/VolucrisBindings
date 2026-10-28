package volucris.bindings.examples;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import volucris.bindings.rpmalloc.Rpmalloc;
import volucris.bindings.rpmalloc.RpmallocLoader;

public class RpmallocExample implements Runnable {

	public RpmallocExample() {
		
	}
	
	@Override
	public void run() {
		
		RpmallocLoader.loadNativeLibrary();
		
		malloc();
		zalloc();
		calloc();
		realloc();
		allocAligned();
		
		Rpmalloc.rpmalloc_finalize();
	}
	
	private void malloc() {
		MemorySegment mallocSegment = Rpmalloc.rpmalloc(100);
		
		if (mallocSegment.equals(MemorySegment.NULL))
			throw new RuntimeException("Null segment returned.");
		
		if (Rpmalloc.rpmalloc_usable_size(mallocSegment) < 100)
			throw new RuntimeException("Invalid usable size");
		
		Rpmalloc.rpfree(mallocSegment);
	}
	
	private void zalloc() {
		MemorySegment zallocSegment = Rpmalloc.rpzalloc(100);
		
		if (zallocSegment.equals(MemorySegment.NULL))
			throw new RuntimeException("Null segment returned.");
		
		if (Rpmalloc.rpmalloc_usable_size(zallocSegment) < 100)
			throw new RuntimeException("Invalid usable size");
		
		for (int i = 0; i < 100; i++) {
			if (zallocSegment.getAtIndex(ValueLayout.JAVA_BYTE, i) != 0)
				throw new RuntimeException("Not every byte is zero.");
		}
		
		Rpmalloc.rpfree(zallocSegment);
	}
	
	private void calloc() {
		MemorySegment callocSegment = Rpmalloc.rpcalloc(100, 1);
		
		if (callocSegment.equals(MemorySegment.NULL))
			throw new RuntimeException("Null segment returned.");
		
		if (Rpmalloc.rpmalloc_usable_size(callocSegment) < 100)
			throw new RuntimeException("Invalid usable size");
		
		for (int i = 0; i < 100; i++) {
			if (callocSegment.getAtIndex(ValueLayout.JAVA_BYTE, i) != 0)
				throw new RuntimeException("Not every byte is zero.");
		}
		
		Rpmalloc.rpfree(callocSegment);
	}
	
	private void realloc() {
		MemorySegment callocSegment = Rpmalloc.rpcalloc(16, 1);
		
		if (callocSegment.equals(MemorySegment.NULL))
			throw new RuntimeException("Null segment returned.");

		for (byte i = 0; i < 16; i++)
			callocSegment.setAtIndex(ValueLayout.JAVA_BYTE, i, i);

		MemorySegment reallocSegment = Rpmalloc.rprealloc(callocSegment, 100);
		
		if (reallocSegment.equals(MemorySegment.NULL))
			throw new RuntimeException("Null segment returned.");

		for (byte i = 0; i < 16; i++) {
			if (reallocSegment.getAtIndex(ValueLayout.JAVA_BYTE, i) != i)
				throw new RuntimeException("Data missmatch.");
		}

		Rpmalloc.rpfree(reallocSegment);
	}
	
	private void allocAligned() {
		MemorySegment allocAlignedSegment = Rpmalloc.rpaligned_alloc(64, 100);
		
		if (allocAlignedSegment.equals(MemorySegment.NULL))
			throw new RuntimeException("Null segment returned.");
		
		if (allocAlignedSegment.address() % 64 != 0)
			throw new RuntimeException("Invalid alignment.");
		
		Rpmalloc.rpfree(allocAlignedSegment);
	}
	
}
