package volucris.bindings.core;

import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public class LibC {

	private static final SymbolLookup SYMBOL_LOOKUP = Linker.nativeLinker().defaultLookup();

	private static final LazyConstant<MethodHandle> MALLOC;
	private static final LazyConstant<MethodHandle> CALLOC;
	private static final LazyConstant<MethodHandle> REALLOC;
	private static final LazyConstant<MethodHandle> FREE;

	static {
		MALLOC = downcallHandle(SYMBOL_LOOKUP, "malloc", UNBOUNDED_ADDRESS, JAVA_LONG);
		CALLOC = downcallHandle(SYMBOL_LOOKUP, "calloc", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		REALLOC = downcallHandle(SYMBOL_LOOKUP, "realloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		FREE = downcallHandleVoid(SYMBOL_LOOKUP, "free", UNBOUNDED_ADDRESS);
	}

	private LibC() {

	}

	public static MemorySegment malloc(long size) {
		MethodHandle method = MALLOC.get();
		try {
			return (MemorySegment) method.invokeExact(
					size
			);
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}

	public static MemorySegment calloc(long numberOfElements, long size) {
		MethodHandle method = CALLOC.get();
		try {
			return (MemorySegment) method.invokeExact(
					numberOfElements,
					size
			);
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}

	public static MemorySegment realloc(MemorySegment pointer, long newSize) {
		MethodHandle method = REALLOC.get();
		try {
			return (MemorySegment) method.invokeExact(
					pointer,
					newSize
			);
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}

	public static void free(MemorySegment pointer) {
		MethodHandle method = FREE.get();
		try {
			method.invokeExact(
					pointer
			);
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}

}