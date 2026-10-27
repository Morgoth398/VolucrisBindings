/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.mimalloc;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeShortArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Mimalloc {

	private static final LazyConstant<MethodHandle> MI_MALLOC;
	private static final LazyConstant<MethodHandle> MI_CALLOC;
	private static final LazyConstant<MethodHandle> MI_REALLOC;
	private static final LazyConstant<MethodHandle> MI_EXPAND;
	private static final LazyConstant<MethodHandle> MI_FREE;
	private static final LazyConstant<MethodHandle> MI_STRDUP;
	private static final LazyConstant<MethodHandle> MI_STRNDUP;
	private static final LazyConstant<MethodHandle> MI_REALPATH;
	private static final LazyConstant<MethodHandle> MI_MALLOC_SMALL;
	private static final LazyConstant<MethodHandle> MI_ZALLOC_SMALL;
	private static final LazyConstant<MethodHandle> MI_ZALLOC;
	private static final LazyConstant<MethodHandle> MI_MALLOCN;
	private static final LazyConstant<MethodHandle> MI_REALLOCN;
	private static final LazyConstant<MethodHandle> MI_REALLOCF;
	private static final LazyConstant<MethodHandle> MI_USABLE_SIZE;
	private static final LazyConstant<MethodHandle> MI_GOOD_SIZE;
	private static final LazyConstant<MethodHandle> MI_FREE_SIZE;
	private static final LazyConstant<MethodHandle> MI_FREE_SMALL;
	private static final LazyConstant<MethodHandle> MI_FREE_SMALL_NONNULL;
	private static final LazyConstant<MethodHandle> MI_THREAD_ID_OF;
	private static final LazyConstant<MethodHandle> MI_MALLOC_ALIGNED;
	private static final LazyConstant<MethodHandle> MI_MALLOC_ALIGNED_AT;
	private static final LazyConstant<MethodHandle> MI_ZALLOC_ALIGNED;
	private static final LazyConstant<MethodHandle> MI_ZALLOC_ALIGNED_AT;
	private static final LazyConstant<MethodHandle> MI_CALLOC_ALIGNED;
	private static final LazyConstant<MethodHandle> MI_CALLOC_ALIGNED_AT;
	private static final LazyConstant<MethodHandle> MI_REALLOC_ALIGNED;
	private static final LazyConstant<MethodHandle> MI_REALLOC_ALIGNED_AT;
	private static final LazyConstant<MethodHandle> MI_REGISTER_DEFERRED_FREE;
	private static final LazyConstant<MethodHandle> MI_REGISTER_OUTPUT;
	private static final LazyConstant<MethodHandle> MI_REGISTER_ERROR;
	private static final LazyConstant<MethodHandle> MI_COLLECT;
	private static final LazyConstant<MethodHandle> MI_VERSION;
	private static final LazyConstant<MethodHandle> MI_OPTIONS_PRINT;
	private static final LazyConstant<MethodHandle> MI_PROCESS_INFO_PRINT;
	private static final LazyConstant<MethodHandle> MI_OPTIONS_PRINT_OUT;
	private static final LazyConstant<MethodHandle> MI_PROCESS_INFO_PRINT_OUT;
	private static final LazyConstant<MethodHandle> MI_PROCESS_INFO;
	private static final LazyConstant<MethodHandle> MI_PROCESS_INIT;
	private static final LazyConstant<MethodHandle> MI_PROCESS_DONE;
	private static final LazyConstant<MethodHandle> MI_THREAD_INIT;
	private static final LazyConstant<MethodHandle> MI_THREAD_DONE;
	private static final LazyConstant<MethodHandle> MI_THREAD_SET_IN_THREADPOOL;
	private static final LazyConstant<MethodHandle> MI_UMALLOC;
	private static final LazyConstant<MethodHandle> MI_UCALLOC;
	private static final LazyConstant<MethodHandle> MI_UREALLOC;
	private static final LazyConstant<MethodHandle> MI_UFREE;
	private static final LazyConstant<MethodHandle> MI_UMALLOC_ALIGNED;
	private static final LazyConstant<MethodHandle> MI_UZALLOC_ALIGNED;
	private static final LazyConstant<MethodHandle> MI_UMALLOC_SMALL;
	private static final LazyConstant<MethodHandle> MI_UZALLOC_SMALL;
	private static final LazyConstant<MethodHandle> MI_HEAP_NEW;
	private static final LazyConstant<MethodHandle> MI_HEAP_DELETE;
	private static final LazyConstant<MethodHandle> MI_HEAP_DESTROY;
	private static final LazyConstant<MethodHandle> MI_HEAP_SET_NUMA_AFFINITY;
	private static final LazyConstant<MethodHandle> MI_HEAP_SET_DEBUG_FILL_PRESERVE;
	private static final LazyConstant<MethodHandle> MI_HEAP_COLLECT;
	private static final LazyConstant<MethodHandle> MI_HEAP_MAIN;
	private static final LazyConstant<MethodHandle> MI_HEAP_OF;
	private static final LazyConstant<MethodHandle> MI_HEAP_CONTAINS;
	private static final LazyConstant<MethodHandle> MI_ANY_HEAP_CONTAINS;
	private static final LazyConstant<MethodHandle> MI_HEAP_MALLOC;
	private static final LazyConstant<MethodHandle> MI_HEAP_ZALLOC;
	private static final LazyConstant<MethodHandle> MI_HEAP_CALLOC;
	private static final LazyConstant<MethodHandle> MI_HEAP_MALLOCN;
	private static final LazyConstant<MethodHandle> MI_HEAP_MALLOC_SMALL;
	private static final LazyConstant<MethodHandle> MI_HEAP_ZALLOC_SMALL;
	private static final LazyConstant<MethodHandle> MI_HEAP_REALLOC;
	private static final LazyConstant<MethodHandle> MI_HEAP_REALLOCN;
	private static final LazyConstant<MethodHandle> MI_HEAP_REALLOCF;
	private static final LazyConstant<MethodHandle> MI_HEAP_STRDUP;
	private static final LazyConstant<MethodHandle> MI_HEAP_STRNDUP;
	private static final LazyConstant<MethodHandle> MI_HEAP_REALPATH;
	private static final LazyConstant<MethodHandle> MI_HEAP_MALLOC_ALIGNED;
	private static final LazyConstant<MethodHandle> MI_HEAP_MALLOC_ALIGNED_AT;
	private static final LazyConstant<MethodHandle> MI_HEAP_ZALLOC_ALIGNED;
	private static final LazyConstant<MethodHandle> MI_HEAP_ZALLOC_ALIGNED_AT;
	private static final LazyConstant<MethodHandle> MI_HEAP_CALLOC_ALIGNED;
	private static final LazyConstant<MethodHandle> MI_HEAP_CALLOC_ALIGNED_AT;
	private static final LazyConstant<MethodHandle> MI_HEAP_REALLOC_ALIGNED;
	private static final LazyConstant<MethodHandle> MI_HEAP_REALLOC_ALIGNED_AT;
	private static final LazyConstant<MethodHandle> MI_REZALLOC;
	private static final LazyConstant<MethodHandle> MI_RECALLOC;
	private static final LazyConstant<MethodHandle> MI_REZALLOC_ALIGNED;
	private static final LazyConstant<MethodHandle> MI_REZALLOC_ALIGNED_AT;
	private static final LazyConstant<MethodHandle> MI_RECALLOC_ALIGNED;
	private static final LazyConstant<MethodHandle> MI_RECALLOC_ALIGNED_AT;
	private static final LazyConstant<MethodHandle> MI_HEAP_REZALLOC;
	private static final LazyConstant<MethodHandle> MI_HEAP_RECALLOC;
	private static final LazyConstant<MethodHandle> MI_HEAP_REZALLOC_ALIGNED;
	private static final LazyConstant<MethodHandle> MI_HEAP_REZALLOC_ALIGNED_AT;
	private static final LazyConstant<MethodHandle> MI_HEAP_RECALLOC_ALIGNED;
	private static final LazyConstant<MethodHandle> MI_HEAP_RECALLOC_ALIGNED_AT;
	private static final LazyConstant<MethodHandle> MI_HEAP_VISIT_BLOCKS;
	private static final LazyConstant<MethodHandle> MI_HEAP_VISIT_ABANDONED_BLOCKS;
	private static final LazyConstant<MethodHandle> MI_IS_REDIRECTED;
	private static final LazyConstant<MethodHandle> MI_RESERVE_HUGE_OS_PAGES_INTERLEAVE;
	private static final LazyConstant<MethodHandle> MI_RESERVE_HUGE_OS_PAGES_AT;
	private static final LazyConstant<MethodHandle> MI_RESERVE_OS_MEMORY;
	private static final LazyConstant<MethodHandle> MI_MANAGE_OS_MEMORY;
	private static final LazyConstant<MethodHandle> MI_DEBUG_SHOW_ARENAS;
	private static final LazyConstant<MethodHandle> MI_ARENAS_PRINT;
	private static final LazyConstant<MethodHandle> MI_ARENAS_PURGE;
	private static final LazyConstant<MethodHandle> MI_ARENA_MIN_ALIGNMENT;
	private static final LazyConstant<MethodHandle> MI_ARENA_MIN_SIZE;
	private static final LazyConstant<MethodHandle> MI_ARENA_MAX_OBJECT_SIZE;
	private static final LazyConstant<MethodHandle> MI_ARENA_AREA;
	private static final LazyConstant<MethodHandle> MI_RESERVE_HUGE_OS_PAGES_AT_EX;
	private static final LazyConstant<MethodHandle> MI_RESERVE_OS_MEMORY_EX;
	private static final LazyConstant<MethodHandle> MI_MANAGE_OS_MEMORY_EX;
	private static final LazyConstant<MethodHandle> MI_ARENA_CONTAINS;
	private static final LazyConstant<MethodHandle> MI_HEAP_NEW_IN_ARENA;
	private static final LazyConstant<MethodHandle> MI_SUBPROC_MAIN;
	private static final LazyConstant<MethodHandle> MI_SUBPROC_CURRENT;
	private static final LazyConstant<MethodHandle> MI_SUBPROC_NEW;
	private static final LazyConstant<MethodHandle> MI_SUBPROC_DESTROY;
	private static final LazyConstant<MethodHandle> MI_SUBPROC_ADD_CURRENT_THREAD;
	private static final LazyConstant<MethodHandle> MI_SUBPROC_VISIT_HEAPS;
	private static final LazyConstant<MethodHandle> MI_HEAP_THEAP;
	private static final LazyConstant<MethodHandle> MI_THEAP_SET_DEFAULT;
	private static final LazyConstant<MethodHandle> MI_THEAP_GET_DEFAULT;
	private static final LazyConstant<MethodHandle> MI_THEAP_COLLECT;
	private static final LazyConstant<MethodHandle> MI_THEAP_MALLOC;
	private static final LazyConstant<MethodHandle> MI_THEAP_ZALLOC;
	private static final LazyConstant<MethodHandle> MI_THEAP_CALLOC;
	private static final LazyConstant<MethodHandle> MI_THEAP_MALLOC_SMALL;
	private static final LazyConstant<MethodHandle> MI_THEAP_ZALLOC_SMALL;
	private static final LazyConstant<MethodHandle> MI_THEAP_MALLOC_ALIGNED;
	private static final LazyConstant<MethodHandle> MI_THEAP_ZALLOC_ALIGNED;
	private static final LazyConstant<MethodHandle> MI_THEAP_REALLOC;
	private static final LazyConstant<MethodHandle> MI_THEAP_REZALLOC;
	private static final LazyConstant<MethodHandle> MI_THEAP_GUARDED_SET_SAMPLE_RATE;
	private static final LazyConstant<MethodHandle> MI_THEAP_GUARDED_SET_SIZE_BOUND;
	private static final LazyConstant<MethodHandle> MI_MANAGE_MEMORY;
	private static final LazyConstant<MethodHandle> MI_UNSAFE_HEAP_PAGE_IS_UNDER_UTILIZED;
	private static final LazyConstant<MethodHandle> MI_THEAP_DELETE;
	private static final LazyConstant<MethodHandle> MI_THEAP_QUIESCENT_ABANDON;
	private static final LazyConstant<MethodHandle> MI_CHECK_OWNED;
	private static final LazyConstant<MethodHandle> MI_THREAD_STATS_PRINT_OUT;
	private static final LazyConstant<MethodHandle> MI_IS_IN_HEAP_REGION;
	private static final LazyConstant<MethodHandle> MI_THEAP_VISIT_BLOCKS;
	private static final LazyConstant<MethodHandle> MI_RESERVE_HUGE_OS_PAGES;
	private static final LazyConstant<MethodHandle> MI_COLLECT_REDUCE;
	private static final LazyConstant<MethodHandle> MI_STATS_RESET;
	private static final LazyConstant<MethodHandle> MI_STATS_MERGE;
	private static final LazyConstant<MethodHandle> MI_STATS_PRINT;
	private static final LazyConstant<MethodHandle> MI_STATS_PRINT_OUT;
	private static final LazyConstant<MethodHandle> MI_OPTION_IS_ENABLED;
	private static final LazyConstant<MethodHandle> MI_OPTION_ENABLE;
	private static final LazyConstant<MethodHandle> MI_OPTION_DISABLE;
	private static final LazyConstant<MethodHandle> MI_CFREE;
	private static final LazyConstant<MethodHandle> MI__EXPAND;
	private static final LazyConstant<MethodHandle> MI_MALLOC_SIZE;
	private static final LazyConstant<MethodHandle> MI_MALLOC_GOOD_SIZE;
	private static final LazyConstant<MethodHandle> MI_MALLOC_USABLE_SIZE;
	private static final LazyConstant<MethodHandle> MI_POSIX_MEMALIGN;
	private static final LazyConstant<MethodHandle> MI_MEMALIGN;
	private static final LazyConstant<MethodHandle> MI_VALLOC;
	private static final LazyConstant<MethodHandle> MI_PVALLOC;
	private static final LazyConstant<MethodHandle> MI_ALIGNED_ALLOC;
	private static final LazyConstant<MethodHandle> MI_REALLOCARRAY;
	private static final LazyConstant<MethodHandle> MI_REALLOCARR;
	private static final LazyConstant<MethodHandle> MI_ALIGNED_RECALLOC;
	private static final LazyConstant<MethodHandle> MI_ALIGNED_OFFSET_RECALLOC;
	private static final LazyConstant<MethodHandle> MI_FREE_SIZE_ALIGNED;
	private static final LazyConstant<MethodHandle> MI_FREE_ALIGNED;
	private static final LazyConstant<MethodHandle> MI_DUPENV_S;
	private static final LazyConstant<MethodHandle> MI_WDUPENV_S;
	private static final LazyConstant<MethodHandle> MI_WCSDUP;
	private static final LazyConstant<MethodHandle> MI_MBSDUP;
	private static final LazyConstant<MethodHandle> MI_NEW;
	private static final LazyConstant<MethodHandle> MI_NEW_ALIGNED;
	private static final LazyConstant<MethodHandle> MI_NEW_NOTHROW;
	private static final LazyConstant<MethodHandle> MI_NEW_ALIGNED_NOTHROW;
	private static final LazyConstant<MethodHandle> MI_NEW_N;
	private static final LazyConstant<MethodHandle> MI_NEW_REALLOC;
	private static final LazyConstant<MethodHandle> MI_NEW_REALLOCN;
	private static final LazyConstant<MethodHandle> MI_HEAP_ALLOC_NEW;
	private static final LazyConstant<MethodHandle> MI_HEAP_ALLOC_NEW_N;
	private static final LazyConstant<MethodHandle> MI_THEAP_ALLOC_NEW;
	private static final LazyConstant<MethodHandle> MI_THEAP_ALLOC_NEW_N;
	private static final LazyConstant<MethodHandle> MI_THEAP_ALLOC_NEW_NOTHROW;
	private static final LazyConstant<MethodHandle> MI_WZALLOC_SMALL;
	private static final LazyConstant<MethodHandle> MI_WMALLOC_SMALL;
	private static final LazyConstant<MethodHandle> MI_THEAP_WMALLOC_SMALL;
	private static final LazyConstant<MethodHandle> MI_THEAP_WZALLOC_SMALL;
	private static final LazyConstant<MethodHandle> MI_FREE_SMALL_LOCAL;
	private static final LazyConstant<MethodHandle> MI_FREE_SMALL_LOCAL_NONNULL;

	static {
		//@formatter:off
		MI_MALLOC = downcallHandle("mi_malloc", UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_CALLOC = downcallHandle("mi_calloc", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_REALLOC = downcallHandle("mi_realloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_EXPAND = downcallHandle("mi_expand", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_FREE = downcallHandleVoid("mi_free", UNBOUNDED_ADDRESS);
		MI_STRDUP = downcallHandle("mi_strdup", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_STRNDUP = downcallHandle("mi_strndup", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_REALPATH = downcallHandle("mi_realpath", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_MALLOC_SMALL = downcallHandle("mi_malloc_small", UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_ZALLOC_SMALL = downcallHandle("mi_zalloc_small", UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_ZALLOC = downcallHandle("mi_zalloc", UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_MALLOCN = downcallHandle("mi_mallocn", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_REALLOCN = downcallHandle("mi_reallocn", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_REALLOCF = downcallHandle("mi_reallocf", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_USABLE_SIZE = downcallHandle("mi_usable_size", JAVA_LONG, UNBOUNDED_ADDRESS);
		MI_GOOD_SIZE = downcallHandle("mi_good_size", JAVA_LONG, JAVA_LONG);
		MI_FREE_SIZE = downcallHandleVoid("mi_free_size", UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_FREE_SMALL = downcallHandleVoid("mi_free_small", UNBOUNDED_ADDRESS);
		MI_FREE_SMALL_NONNULL = downcallHandleVoid("mi_free_small_nonnull", UNBOUNDED_ADDRESS);
		MI_THREAD_ID_OF = downcallHandle("mi_thread_id_of", JAVA_LONG, UNBOUNDED_ADDRESS);
		MI_MALLOC_ALIGNED = downcallHandle("mi_malloc_aligned", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_MALLOC_ALIGNED_AT = downcallHandle("mi_malloc_aligned_at", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MI_ZALLOC_ALIGNED = downcallHandle("mi_zalloc_aligned", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_ZALLOC_ALIGNED_AT = downcallHandle("mi_zalloc_aligned_at", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MI_CALLOC_ALIGNED = downcallHandle("mi_calloc_aligned", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MI_CALLOC_ALIGNED_AT = downcallHandle("mi_calloc_aligned_at", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MI_REALLOC_ALIGNED = downcallHandle("mi_realloc_aligned", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_REALLOC_ALIGNED_AT = downcallHandle("mi_realloc_aligned_at", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MI_REGISTER_DEFERRED_FREE = downcallHandleVoid("mi_register_deferred_free", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_REGISTER_OUTPUT = downcallHandleVoid("mi_register_output", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_REGISTER_ERROR = downcallHandleVoid("mi_register_error", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_COLLECT = downcallHandleVoid("mi_collect", JAVA_BOOLEAN);
		MI_VERSION = downcallHandle("mi_version", JAVA_INT);
		MI_OPTIONS_PRINT = downcallHandleVoid("mi_options_print");
		MI_PROCESS_INFO_PRINT = downcallHandleVoid("mi_process_info_print");
		MI_OPTIONS_PRINT_OUT = downcallHandleVoid("mi_options_print_out", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_PROCESS_INFO_PRINT_OUT = downcallHandleVoid("mi_process_info_print_out", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_PROCESS_INFO = downcallHandleVoid("mi_process_info", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_PROCESS_INIT = downcallHandleVoid("mi_process_init");
		MI_PROCESS_DONE = downcallHandleVoid("mi_process_done");
		MI_THREAD_INIT = downcallHandleVoid("mi_thread_init");
		MI_THREAD_DONE = downcallHandleVoid("mi_thread_done");
		MI_THREAD_SET_IN_THREADPOOL = downcallHandleVoid("mi_thread_set_in_threadpool");
		MI_UMALLOC = downcallHandle("mi_umalloc", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MI_UCALLOC = downcallHandle("mi_ucalloc", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS);
		MI_UREALLOC = downcallHandle("mi_urealloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_UFREE = downcallHandleVoid("mi_ufree", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_UMALLOC_ALIGNED = downcallHandle("mi_umalloc_aligned", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS);
		MI_UZALLOC_ALIGNED = downcallHandle("mi_uzalloc_aligned", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS);
		MI_UMALLOC_SMALL = downcallHandle("mi_umalloc_small", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MI_UZALLOC_SMALL = downcallHandle("mi_uzalloc_small", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MI_HEAP_NEW = downcallHandle("mi_heap_new", UNBOUNDED_ADDRESS);
		MI_HEAP_DELETE = downcallHandleVoid("mi_heap_delete", UNBOUNDED_ADDRESS);
		MI_HEAP_DESTROY = downcallHandleVoid("mi_heap_destroy", UNBOUNDED_ADDRESS);
		MI_HEAP_SET_NUMA_AFFINITY = downcallHandleVoid("mi_heap_set_numa_affinity", UNBOUNDED_ADDRESS, JAVA_INT);
		MI_HEAP_SET_DEBUG_FILL_PRESERVE = downcallHandleVoid("mi_heap_set_debug_fill_preserve", UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_HEAP_COLLECT = downcallHandleVoid("mi_heap_collect", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		MI_HEAP_MAIN = downcallHandle("mi_heap_main", UNBOUNDED_ADDRESS);
		MI_HEAP_OF = downcallHandle("mi_heap_of", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_HEAP_CONTAINS = downcallHandle("mi_heap_contains", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_ANY_HEAP_CONTAINS = downcallHandle("mi_any_heap_contains", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		MI_HEAP_MALLOC = downcallHandle("mi_heap_malloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_HEAP_ZALLOC = downcallHandle("mi_heap_zalloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_HEAP_CALLOC = downcallHandle("mi_heap_calloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_HEAP_MALLOCN = downcallHandle("mi_heap_mallocn", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_HEAP_MALLOC_SMALL = downcallHandle("mi_heap_malloc_small", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_HEAP_ZALLOC_SMALL = downcallHandle("mi_heap_zalloc_small", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_HEAP_REALLOC = downcallHandle("mi_heap_realloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_HEAP_REALLOCN = downcallHandle("mi_heap_reallocn", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_HEAP_REALLOCF = downcallHandle("mi_heap_reallocf", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_HEAP_STRDUP = downcallHandle("mi_heap_strdup", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_HEAP_STRNDUP = downcallHandle("mi_heap_strndup", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_HEAP_REALPATH = downcallHandle("mi_heap_realpath", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_HEAP_MALLOC_ALIGNED = downcallHandle("mi_heap_malloc_aligned", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_HEAP_MALLOC_ALIGNED_AT = downcallHandle("mi_heap_malloc_aligned_at", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MI_HEAP_ZALLOC_ALIGNED = downcallHandle("mi_heap_zalloc_aligned", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_HEAP_ZALLOC_ALIGNED_AT = downcallHandle("mi_heap_zalloc_aligned_at", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MI_HEAP_CALLOC_ALIGNED = downcallHandle("mi_heap_calloc_aligned", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MI_HEAP_CALLOC_ALIGNED_AT = downcallHandle("mi_heap_calloc_aligned_at", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MI_HEAP_REALLOC_ALIGNED = downcallHandle("mi_heap_realloc_aligned", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_HEAP_REALLOC_ALIGNED_AT = downcallHandle("mi_heap_realloc_aligned_at", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MI_REZALLOC = downcallHandle("mi_rezalloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_RECALLOC = downcallHandle("mi_recalloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_REZALLOC_ALIGNED = downcallHandle("mi_rezalloc_aligned", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_REZALLOC_ALIGNED_AT = downcallHandle("mi_rezalloc_aligned_at", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MI_RECALLOC_ALIGNED = downcallHandle("mi_recalloc_aligned", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MI_RECALLOC_ALIGNED_AT = downcallHandle("mi_recalloc_aligned_at", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MI_HEAP_REZALLOC = downcallHandle("mi_heap_rezalloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_HEAP_RECALLOC = downcallHandle("mi_heap_recalloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_HEAP_REZALLOC_ALIGNED = downcallHandle("mi_heap_rezalloc_aligned", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_HEAP_REZALLOC_ALIGNED_AT = downcallHandle("mi_heap_rezalloc_aligned_at", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MI_HEAP_RECALLOC_ALIGNED = downcallHandle("mi_heap_recalloc_aligned", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MI_HEAP_RECALLOC_ALIGNED_AT = downcallHandle("mi_heap_recalloc_aligned_at", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MI_HEAP_VISIT_BLOCKS = downcallHandle("mi_heap_visit_blocks", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_HEAP_VISIT_ABANDONED_BLOCKS = downcallHandle("mi_heap_visit_abandoned_blocks", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_IS_REDIRECTED = downcallHandle("mi_is_redirected", JAVA_BOOLEAN);
		MI_RESERVE_HUGE_OS_PAGES_INTERLEAVE = downcallHandle("mi_reserve_huge_os_pages_interleave", JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MI_RESERVE_HUGE_OS_PAGES_AT = downcallHandle("mi_reserve_huge_os_pages_at", JAVA_INT, JAVA_LONG, JAVA_INT, JAVA_LONG);
		MI_RESERVE_OS_MEMORY = downcallHandle("mi_reserve_os_memory", JAVA_INT, JAVA_LONG, JAVA_BOOLEAN, JAVA_BOOLEAN);
		MI_MANAGE_OS_MEMORY = downcallHandle("mi_manage_os_memory", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_BOOLEAN, JAVA_BOOLEAN, JAVA_BOOLEAN, JAVA_INT);
		MI_DEBUG_SHOW_ARENAS = downcallHandleVoid("mi_debug_show_arenas");
		MI_ARENAS_PRINT = downcallHandleVoid("mi_arenas_print");
		MI_ARENAS_PURGE = downcallHandleVoid("mi_arenas_purge");
		MI_ARENA_MIN_ALIGNMENT = downcallHandle("mi_arena_min_alignment", JAVA_LONG);
		MI_ARENA_MIN_SIZE = downcallHandle("mi_arena_min_size", JAVA_LONG);
		MI_ARENA_MAX_OBJECT_SIZE = downcallHandle("mi_arena_max_object_size", JAVA_LONG);
		MI_ARENA_AREA = downcallHandle("mi_arena_area", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_RESERVE_HUGE_OS_PAGES_AT_EX = downcallHandle("mi_reserve_huge_os_pages_at_ex", JAVA_INT, JAVA_LONG, JAVA_INT, JAVA_LONG, JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		MI_RESERVE_OS_MEMORY_EX = downcallHandle("mi_reserve_os_memory_ex", JAVA_INT, JAVA_LONG, JAVA_BOOLEAN, JAVA_BOOLEAN, JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		MI_MANAGE_OS_MEMORY_EX = downcallHandle("mi_manage_os_memory_ex", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_BOOLEAN, JAVA_BOOLEAN, JAVA_BOOLEAN, JAVA_INT, JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		MI_ARENA_CONTAINS = downcallHandle("mi_arena_contains", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_HEAP_NEW_IN_ARENA = downcallHandle("mi_heap_new_in_arena", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_SUBPROC_MAIN = downcallHandle("mi_subproc_main", MiSubprocId.LAYOUT);
		MI_SUBPROC_CURRENT = downcallHandle("mi_subproc_current", MiSubprocId.LAYOUT);
		MI_SUBPROC_NEW = downcallHandle("mi_subproc_new", MiSubprocId.LAYOUT);
		MI_SUBPROC_DESTROY = downcallHandleVoid("mi_subproc_destroy", MiSubprocId.LAYOUT);
		MI_SUBPROC_ADD_CURRENT_THREAD = downcallHandleVoid("mi_subproc_add_current_thread", MiSubprocId.LAYOUT);
		MI_SUBPROC_VISIT_HEAPS = downcallHandle("mi_subproc_visit_heaps", JAVA_BOOLEAN, MiSubprocId.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_HEAP_THEAP = downcallHandle("mi_heap_theap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_THEAP_SET_DEFAULT = downcallHandle("mi_theap_set_default", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_THEAP_GET_DEFAULT = downcallHandle("mi_theap_get_default", UNBOUNDED_ADDRESS);
		MI_THEAP_COLLECT = downcallHandleVoid("mi_theap_collect", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		MI_THEAP_MALLOC = downcallHandle("mi_theap_malloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_THEAP_ZALLOC = downcallHandle("mi_theap_zalloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_THEAP_CALLOC = downcallHandle("mi_theap_calloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_THEAP_MALLOC_SMALL = downcallHandle("mi_theap_malloc_small", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_THEAP_ZALLOC_SMALL = downcallHandle("mi_theap_zalloc_small", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_THEAP_MALLOC_ALIGNED = downcallHandle("mi_theap_malloc_aligned", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_THEAP_ZALLOC_ALIGNED = downcallHandle("mi_theap_zalloc_aligned", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_THEAP_REALLOC = downcallHandle("mi_theap_realloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_THEAP_REZALLOC = downcallHandle("mi_theap_rezalloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_THEAP_GUARDED_SET_SAMPLE_RATE = downcallHandleVoid("mi_theap_guarded_set_sample_rate", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_THEAP_GUARDED_SET_SIZE_BOUND = downcallHandleVoid("mi_theap_guarded_set_size_bound", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_MANAGE_MEMORY = downcallHandle("mi_manage_memory", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_BOOLEAN, JAVA_BOOLEAN, JAVA_BOOLEAN, JAVA_INT, JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_UNSAFE_HEAP_PAGE_IS_UNDER_UTILIZED = downcallHandle("mi_unsafe_heap_page_is_under_utilized", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_THEAP_DELETE = downcallHandleVoid("mi_theap_delete", UNBOUNDED_ADDRESS);
		MI_THEAP_QUIESCENT_ABANDON = downcallHandleVoid("mi_theap_quiescent_abandon", UNBOUNDED_ADDRESS);
		MI_CHECK_OWNED = downcallHandle("mi_check_owned", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		MI_THREAD_STATS_PRINT_OUT = downcallHandleVoid("mi_thread_stats_print_out", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_IS_IN_HEAP_REGION = downcallHandle("mi_is_in_heap_region", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		MI_THEAP_VISIT_BLOCKS = downcallHandle("mi_theap_visit_blocks", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_RESERVE_HUGE_OS_PAGES = downcallHandle("mi_reserve_huge_os_pages", JAVA_INT, JAVA_LONG, JAVA_DOUBLE, UNBOUNDED_ADDRESS);
		MI_COLLECT_REDUCE = downcallHandleVoid("mi_collect_reduce", JAVA_LONG);
		MI_STATS_RESET = downcallHandleVoid("mi_stats_reset");
		MI_STATS_MERGE = downcallHandleVoid("mi_stats_merge");
		MI_STATS_PRINT = downcallHandleVoid("mi_stats_print", UNBOUNDED_ADDRESS);
		MI_STATS_PRINT_OUT = downcallHandleVoid("mi_stats_print_out", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_OPTION_IS_ENABLED = downcallHandle("mi_option_is_enabled", JAVA_BOOLEAN, JAVA_INT);
		MI_OPTION_ENABLE = downcallHandleVoid("mi_option_enable", JAVA_INT);
		MI_OPTION_DISABLE = downcallHandleVoid("mi_option_disable", JAVA_INT);
		MI_CFREE = downcallHandle("mi_cfree", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		MI__EXPAND = downcallHandle("mi__expand", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_MALLOC_SIZE = downcallHandle("mi_malloc_size", JAVA_LONG, UNBOUNDED_ADDRESS);
		MI_MALLOC_GOOD_SIZE = downcallHandle("mi_malloc_good_size", JAVA_LONG, JAVA_LONG);
		MI_MALLOC_USABLE_SIZE = downcallHandle("mi_malloc_usable_size", JAVA_LONG, UNBOUNDED_ADDRESS);
		MI_POSIX_MEMALIGN = downcallHandle("mi_posix_memalign", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_MEMALIGN = downcallHandle("mi_memalign", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_VALLOC = downcallHandle("mi_valloc", UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_PVALLOC = downcallHandle("mi_pvalloc", UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_ALIGNED_ALLOC = downcallHandle("mi_aligned_alloc", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_REALLOCARRAY = downcallHandle("mi_reallocarray", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_REALLOCARR = downcallHandle("mi_reallocarr", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_ALIGNED_RECALLOC = downcallHandle("mi_aligned_recalloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MI_ALIGNED_OFFSET_RECALLOC = downcallHandle("mi_aligned_offset_recalloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MI_FREE_SIZE_ALIGNED = downcallHandleVoid("mi_free_size_aligned", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_FREE_ALIGNED = downcallHandleVoid("mi_free_aligned", UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_DUPENV_S = downcallHandle("mi_dupenv_s", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_WDUPENV_S = downcallHandle("mi_wdupenv_s", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_WCSDUP = downcallHandle("mi_wcsdup", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_MBSDUP = downcallHandle("mi_mbsdup", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MI_NEW = downcallHandle("mi_new", UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_NEW_ALIGNED = downcallHandle("mi_new_aligned", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_NEW_NOTHROW = downcallHandle("mi_new_nothrow", UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_NEW_ALIGNED_NOTHROW = downcallHandle("mi_new_aligned_nothrow", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_NEW_N = downcallHandle("mi_new_n", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_NEW_REALLOC = downcallHandle("mi_new_realloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_NEW_REALLOCN = downcallHandle("mi_new_reallocn", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_HEAP_ALLOC_NEW = downcallHandle("mi_heap_alloc_new", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_HEAP_ALLOC_NEW_N = downcallHandle("mi_heap_alloc_new_n", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_THEAP_ALLOC_NEW = downcallHandle("mi_theap_alloc_new", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_THEAP_ALLOC_NEW_N = downcallHandle("mi_theap_alloc_new_n", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MI_THEAP_ALLOC_NEW_NOTHROW = downcallHandle("mi_theap_alloc_new_nothrow", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_WZALLOC_SMALL = downcallHandle("mi_wzalloc_small", UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_WMALLOC_SMALL = downcallHandle("mi_wmalloc_small", UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_THEAP_WMALLOC_SMALL = downcallHandle("mi_theap_wmalloc_small", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_THEAP_WZALLOC_SMALL = downcallHandle("mi_theap_wzalloc_small", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MI_FREE_SMALL_LOCAL = downcallHandleVoid("mi_free_small_local", UNBOUNDED_ADDRESS);
		MI_FREE_SMALL_LOCAL_NONNULL = downcallHandleVoid("mi_free_small_local_nonnull", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	private Mimalloc() {
	}

    public static MemorySegment mi_malloc(
    	long size
    ) {
    	MethodHandle method = MI_MALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_calloc(
    	long count,
    	long size
    ) {
    	MethodHandle method = MI_CALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			count,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_realloc(
    	MemorySegment p,
    	long newsize
    ) {
    	MethodHandle method = MI_REALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			newsize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_expand(
    	MemorySegment p,
    	long newsize
    ) {
    	MethodHandle method = MI_EXPAND.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			newsize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_free(
    	MemorySegment p
    ) {
    	MethodHandle method = MI_FREE.get();
    	try {
    		 method.invokeExact(
    			p
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_strdup(
    	MemorySegment s
    ) {
    	MethodHandle method = MI_STRDUP.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			s
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_strdup].
    public static @Nullable NativeByteArray mi_strdup(
    	NativeByteArray s
    ) {
    	MemorySegment segment = mi_strdup(
    		s.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment mi_strndup(
    	MemorySegment s,
    	long n
    ) {
    	MethodHandle method = MI_STRNDUP.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			s,
    			n
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_strndup].
    public static @Nullable NativeByteArray mi_strndup(
    	NativeByteArray s,
    	long n
    ) {
    	MemorySegment segment = mi_strndup(
    		s.memorySegment(),
    		n
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment mi_realpath(
    	MemorySegment fname,
    	MemorySegment resolved_name
    ) {
    	MethodHandle method = MI_REALPATH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			fname,
    			resolved_name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_realpath].
    public static @Nullable NativeByteArray mi_realpath(
    	NativeByteArray fname,
    	NativeByteArray resolved_name
    ) {
    	MemorySegment segment = mi_realpath(
    		fname.memorySegment(),
    		resolved_name.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment mi_malloc_small(
    	long size
    ) {
    	MethodHandle method = MI_MALLOC_SMALL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_zalloc_small(
    	long size
    ) {
    	MethodHandle method = MI_ZALLOC_SMALL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_zalloc(
    	long size
    ) {
    	MethodHandle method = MI_ZALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_mallocn(
    	long count,
    	long size
    ) {
    	MethodHandle method = MI_MALLOCN.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			count,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_reallocn(
    	MemorySegment p,
    	long count,
    	long size
    ) {
    	MethodHandle method = MI_REALLOCN.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			count,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_reallocf(
    	MemorySegment p,
    	long newsize
    ) {
    	MethodHandle method = MI_REALLOCF.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			newsize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static long mi_usable_size(
    	MemorySegment p
    ) {
    	MethodHandle method = MI_USABLE_SIZE.get();
    	try {
    		return (long) method.invokeExact(
    			p
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static long mi_good_size(
    	long size
    ) {
    	MethodHandle method = MI_GOOD_SIZE.get();
    	try {
    		return (long) method.invokeExact(
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_free_size(
    	MemorySegment p,
    	long size
    ) {
    	MethodHandle method = MI_FREE_SIZE.get();
    	try {
    		 method.invokeExact(
    			p,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_free_small(
    	MemorySegment p
    ) {
    	MethodHandle method = MI_FREE_SMALL.get();
    	try {
    		 method.invokeExact(
    			p
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_free_small_nonnull(
    	MemorySegment p
    ) {
    	MethodHandle method = MI_FREE_SMALL_NONNULL.get();
    	try {
    		 method.invokeExact(
    			p
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static long mi_thread_id_of(
    	MemorySegment p
    ) {
    	MethodHandle method = MI_THREAD_ID_OF.get();
    	try {
    		return (long) method.invokeExact(
    			p
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_malloc_aligned(
    	long size,
    	long alignment
    ) {
    	MethodHandle method = MI_MALLOC_ALIGNED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size,
    			alignment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_malloc_aligned_at(
    	long size,
    	long alignment,
    	long offset
    ) {
    	MethodHandle method = MI_MALLOC_ALIGNED_AT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size,
    			alignment,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_zalloc_aligned(
    	long size,
    	long alignment
    ) {
    	MethodHandle method = MI_ZALLOC_ALIGNED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size,
    			alignment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_zalloc_aligned_at(
    	long size,
    	long alignment,
    	long offset
    ) {
    	MethodHandle method = MI_ZALLOC_ALIGNED_AT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size,
    			alignment,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_calloc_aligned(
    	long count,
    	long size,
    	long alignment
    ) {
    	MethodHandle method = MI_CALLOC_ALIGNED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			count,
    			size,
    			alignment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_calloc_aligned_at(
    	long count,
    	long size,
    	long alignment,
    	long offset
    ) {
    	MethodHandle method = MI_CALLOC_ALIGNED_AT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			count,
    			size,
    			alignment,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_realloc_aligned(
    	MemorySegment p,
    	long newsize,
    	long alignment
    ) {
    	MethodHandle method = MI_REALLOC_ALIGNED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			newsize,
    			alignment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_realloc_aligned_at(
    	MemorySegment p,
    	long newsize,
    	long alignment,
    	long offset
    ) {
    	MethodHandle method = MI_REALLOC_ALIGNED_AT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			newsize,
    			alignment,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_register_deferred_free(
    	MemorySegment deferred_free,
    	MemorySegment arg
    ) {
    	MethodHandle method = MI_REGISTER_DEFERRED_FREE.get();
    	try {
    		 method.invokeExact(
    			deferred_free,
    			arg
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_register_deferred_free].
    public static void mi_register_deferred_free(
    	MiDeferredFreeFun deferred_free,
    	MemorySegment arg
    ) {
    	mi_register_deferred_free(
    		deferred_free.memorySegment(),
    		arg
    	);
    }
    
    public static void mi_register_output(
    	MemorySegment out,
    	MemorySegment arg
    ) {
    	MethodHandle method = MI_REGISTER_OUTPUT.get();
    	try {
    		 method.invokeExact(
    			out,
    			arg
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_register_output].
    public static void mi_register_output(
    	MiOutputFun out,
    	MemorySegment arg
    ) {
    	mi_register_output(
    		out.memorySegment(),
    		arg
    	);
    }
    
    public static void mi_register_error(
    	MemorySegment fun,
    	MemorySegment arg
    ) {
    	MethodHandle method = MI_REGISTER_ERROR.get();
    	try {
    		 method.invokeExact(
    			fun,
    			arg
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_register_error].
    public static void mi_register_error(
    	MiErrorFun fun,
    	MemorySegment arg
    ) {
    	mi_register_error(
    		fun.memorySegment(),
    		arg
    	);
    }
    
    public static void mi_collect(
    	boolean force
    ) {
    	MethodHandle method = MI_COLLECT.get();
    	try {
    		 method.invokeExact(
    			force
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int mi_version() {
    	MethodHandle method = MI_VERSION.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_options_print() {
    	MethodHandle method = MI_OPTIONS_PRINT.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_process_info_print() {
    	MethodHandle method = MI_PROCESS_INFO_PRINT.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_options_print_out(
    	MemorySegment out,
    	MemorySegment arg
    ) {
    	MethodHandle method = MI_OPTIONS_PRINT_OUT.get();
    	try {
    		 method.invokeExact(
    			out,
    			arg
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_options_print_out].
    public static void mi_options_print_out(
    	MiOutputFun out,
    	MemorySegment arg
    ) {
    	mi_options_print_out(
    		out.memorySegment(),
    		arg
    	);
    }
    
    public static void mi_process_info_print_out(
    	MemorySegment out,
    	MemorySegment arg
    ) {
    	MethodHandle method = MI_PROCESS_INFO_PRINT_OUT.get();
    	try {
    		 method.invokeExact(
    			out,
    			arg
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_process_info_print_out].
    public static void mi_process_info_print_out(
    	MiOutputFun out,
    	MemorySegment arg
    ) {
    	mi_process_info_print_out(
    		out.memorySegment(),
    		arg
    	);
    }
    
    public static void mi_process_info(
    	MemorySegment elapsed_msecs,
    	MemorySegment user_msecs,
    	MemorySegment system_msecs,
    	MemorySegment current_rss,
    	MemorySegment peak_rss,
    	MemorySegment current_commit,
    	MemorySegment peak_commit,
    	MemorySegment page_faults
    ) {
    	MethodHandle method = MI_PROCESS_INFO.get();
    	try {
    		 method.invokeExact(
    			elapsed_msecs,
    			user_msecs,
    			system_msecs,
    			current_rss,
    			peak_rss,
    			current_commit,
    			peak_commit,
    			page_faults
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_process_info].
    public static void mi_process_info(
    	NativeLongArray elapsed_msecs,
    	NativeLongArray user_msecs,
    	NativeLongArray system_msecs,
    	NativeLongArray current_rss,
    	NativeLongArray peak_rss,
    	NativeLongArray current_commit,
    	NativeLongArray peak_commit,
    	NativeLongArray page_faults
    ) {
    	mi_process_info(
    		elapsed_msecs.memorySegment(),
    		user_msecs.memorySegment(),
    		system_msecs.memorySegment(),
    		current_rss.memorySegment(),
    		peak_rss.memorySegment(),
    		current_commit.memorySegment(),
    		peak_commit.memorySegment(),
    		page_faults.memorySegment()
    	);
    }
    
    public static void mi_process_init() {
    	MethodHandle method = MI_PROCESS_INIT.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_process_done() {
    	MethodHandle method = MI_PROCESS_DONE.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_thread_init() {
    	MethodHandle method = MI_THREAD_INIT.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_thread_done() {
    	MethodHandle method = MI_THREAD_DONE.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_thread_set_in_threadpool() {
    	MethodHandle method = MI_THREAD_SET_IN_THREADPOOL.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_umalloc(
    	long size,
    	MemorySegment block_size
    ) {
    	MethodHandle method = MI_UMALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size,
    			block_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_umalloc].
    public static @Nullable MemorySegment mi_umalloc(
    	long size,
    	NativeLongArray block_size
    ) {
    	MemorySegment segment = mi_umalloc(
    		size,
    		block_size.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_ucalloc(
    	long count,
    	long size,
    	MemorySegment block_size
    ) {
    	MethodHandle method = MI_UCALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			count,
    			size,
    			block_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_ucalloc].
    public static @Nullable MemorySegment mi_ucalloc(
    	long count,
    	long size,
    	NativeLongArray block_size
    ) {
    	MemorySegment segment = mi_ucalloc(
    		count,
    		size,
    		block_size.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_urealloc(
    	MemorySegment p,
    	long newsize,
    	MemorySegment block_size_pre,
    	MemorySegment block_size_post
    ) {
    	MethodHandle method = MI_UREALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			newsize,
    			block_size_pre,
    			block_size_post
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_urealloc].
    public static @Nullable MemorySegment mi_urealloc(
    	MemorySegment p,
    	long newsize,
    	NativeLongArray block_size_pre,
    	NativeLongArray block_size_post
    ) {
    	MemorySegment segment = mi_urealloc(
    		p,
    		newsize,
    		block_size_pre.memorySegment(),
    		block_size_post.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static void mi_ufree(
    	MemorySegment p,
    	MemorySegment block_size
    ) {
    	MethodHandle method = MI_UFREE.get();
    	try {
    		 method.invokeExact(
    			p,
    			block_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_ufree].
    public static void mi_ufree(
    	MemorySegment p,
    	NativeLongArray block_size
    ) {
    	mi_ufree(
    		p,
    		block_size.memorySegment()
    	);
    }
    
    public static MemorySegment mi_umalloc_aligned(
    	long size,
    	long alignment,
    	MemorySegment block_size
    ) {
    	MethodHandle method = MI_UMALLOC_ALIGNED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size,
    			alignment,
    			block_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_umalloc_aligned].
    public static @Nullable MemorySegment mi_umalloc_aligned(
    	long size,
    	long alignment,
    	NativeLongArray block_size
    ) {
    	MemorySegment segment = mi_umalloc_aligned(
    		size,
    		alignment,
    		block_size.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_uzalloc_aligned(
    	long size,
    	long alignment,
    	MemorySegment block_size
    ) {
    	MethodHandle method = MI_UZALLOC_ALIGNED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size,
    			alignment,
    			block_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_uzalloc_aligned].
    public static @Nullable MemorySegment mi_uzalloc_aligned(
    	long size,
    	long alignment,
    	NativeLongArray block_size
    ) {
    	MemorySegment segment = mi_uzalloc_aligned(
    		size,
    		alignment,
    		block_size.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_umalloc_small(
    	long size,
    	MemorySegment block_size
    ) {
    	MethodHandle method = MI_UMALLOC_SMALL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size,
    			block_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_umalloc_small].
    public static @Nullable MemorySegment mi_umalloc_small(
    	long size,
    	NativeLongArray block_size
    ) {
    	MemorySegment segment = mi_umalloc_small(
    		size,
    		block_size.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_uzalloc_small(
    	long size,
    	MemorySegment block_size
    ) {
    	MethodHandle method = MI_UZALLOC_SMALL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size,
    			block_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_uzalloc_small].
    public static @Nullable MemorySegment mi_uzalloc_small(
    	long size,
    	NativeLongArray block_size
    ) {
    	MemorySegment segment = mi_uzalloc_small(
    		size,
    		block_size.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment nmi_heap_new() {
    	MethodHandle method = MI_HEAP_NEW.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nmi_heap_new].
    public static @Nullable MiHeap mi_heap_new() {
    	MemorySegment segment = nmi_heap_new();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return new MiHeap(segment);
    }
    
    public static void mi_heap_delete(
    	MemorySegment heap
    ) {
    	MethodHandle method = MI_HEAP_DELETE.get();
    	try {
    		 method.invokeExact(
    			heap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_delete].
    public static void mi_heap_delete(
    	MiHeap heap
    ) {
    	mi_heap_delete(
    		heap.memorySegment()
    	);
    }
    
    public static void mi_heap_destroy(
    	MemorySegment heap
    ) {
    	MethodHandle method = MI_HEAP_DESTROY.get();
    	try {
    		 method.invokeExact(
    			heap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_destroy].
    public static void mi_heap_destroy(
    	MiHeap heap
    ) {
    	mi_heap_destroy(
    		heap.memorySegment()
    	);
    }
    
    public static void mi_heap_set_numa_affinity(
    	MemorySegment heap,
    	int numa_node
    ) {
    	MethodHandle method = MI_HEAP_SET_NUMA_AFFINITY.get();
    	try {
    		 method.invokeExact(
    			heap,
    			numa_node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_set_numa_affinity].
    public static void mi_heap_set_numa_affinity(
    	MiHeap heap,
    	int numa_node
    ) {
    	mi_heap_set_numa_affinity(
    		heap.memorySegment(),
    		numa_node
    	);
    }
    
    public static void mi_heap_set_debug_fill_preserve(
    	MemorySegment heap,
    	long preserve
    ) {
    	MethodHandle method = MI_HEAP_SET_DEBUG_FILL_PRESERVE.get();
    	try {
    		 method.invokeExact(
    			heap,
    			preserve
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_set_debug_fill_preserve].
    public static void mi_heap_set_debug_fill_preserve(
    	MiHeap heap,
    	long preserve
    ) {
    	mi_heap_set_debug_fill_preserve(
    		heap.memorySegment(),
    		preserve
    	);
    }
    
    public static void mi_heap_collect(
    	MemorySegment heap,
    	boolean force
    ) {
    	MethodHandle method = MI_HEAP_COLLECT.get();
    	try {
    		 method.invokeExact(
    			heap,
    			force
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_collect].
    public static void mi_heap_collect(
    	MiHeap heap,
    	boolean force
    ) {
    	mi_heap_collect(
    		heap.memorySegment(),
    		force
    	);
    }
    
    public static MemorySegment nmi_heap_main() {
    	MethodHandle method = MI_HEAP_MAIN.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nmi_heap_main].
    public static @Nullable MiHeap mi_heap_main() {
    	MemorySegment segment = nmi_heap_main();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return new MiHeap(segment);
    }
    
    public static MemorySegment nmi_heap_of(
    	MemorySegment p
    ) {
    	MethodHandle method = MI_HEAP_OF.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nmi_heap_of].
    public static @Nullable MiHeap mi_heap_of(
    	MemorySegment p
    ) {
    	MemorySegment segment = nmi_heap_of(
    		p
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MiHeap(segment);
    }
    
    public static boolean mi_heap_contains(
    	MemorySegment heap,
    	MemorySegment p
    ) {
    	MethodHandle method = MI_HEAP_CONTAINS.get();
    	try {
    		return (boolean) method.invokeExact(
    			heap,
    			p
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_contains].
    public static boolean mi_heap_contains(
    	MiHeap heap,
    	MemorySegment p
    ) {
    	return mi_heap_contains(
    		heap.memorySegment(),
    		p
    	);
    }
    
    public static boolean mi_any_heap_contains(
    	MemorySegment p
    ) {
    	MethodHandle method = MI_ANY_HEAP_CONTAINS.get();
    	try {
    		return (boolean) method.invokeExact(
    			p
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_heap_malloc(
    	MemorySegment theap,
    	long size
    ) {
    	MethodHandle method = MI_HEAP_MALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			theap,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_malloc].
    public static @Nullable MemorySegment mi_heap_malloc(
    	MiHeap theap,
    	long size
    ) {
    	MemorySegment segment = mi_heap_malloc(
    		theap.memorySegment(),
    		size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_zalloc(
    	MemorySegment heap,
    	long size
    ) {
    	MethodHandle method = MI_HEAP_ZALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_zalloc].
    public static @Nullable MemorySegment mi_heap_zalloc(
    	MiHeap heap,
    	long size
    ) {
    	MemorySegment segment = mi_heap_zalloc(
    		heap.memorySegment(),
    		size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_calloc(
    	MemorySegment heap,
    	long count,
    	long size
    ) {
    	MethodHandle method = MI_HEAP_CALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			count,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_calloc].
    public static @Nullable MemorySegment mi_heap_calloc(
    	MiHeap heap,
    	long count,
    	long size
    ) {
    	MemorySegment segment = mi_heap_calloc(
    		heap.memorySegment(),
    		count,
    		size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_mallocn(
    	MemorySegment heap,
    	long count,
    	long size
    ) {
    	MethodHandle method = MI_HEAP_MALLOCN.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			count,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_mallocn].
    public static @Nullable MemorySegment mi_heap_mallocn(
    	MiHeap heap,
    	long count,
    	long size
    ) {
    	MemorySegment segment = mi_heap_mallocn(
    		heap.memorySegment(),
    		count,
    		size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_malloc_small(
    	MemorySegment heap,
    	long size
    ) {
    	MethodHandle method = MI_HEAP_MALLOC_SMALL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_malloc_small].
    public static @Nullable MemorySegment mi_heap_malloc_small(
    	MiHeap heap,
    	long size
    ) {
    	MemorySegment segment = mi_heap_malloc_small(
    		heap.memorySegment(),
    		size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_zalloc_small(
    	MemorySegment heap,
    	long size
    ) {
    	MethodHandle method = MI_HEAP_ZALLOC_SMALL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_zalloc_small].
    public static @Nullable MemorySegment mi_heap_zalloc_small(
    	MiHeap heap,
    	long size
    ) {
    	MemorySegment segment = mi_heap_zalloc_small(
    		heap.memorySegment(),
    		size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_realloc(
    	MemorySegment heap,
    	MemorySegment p,
    	long newsize
    ) {
    	MethodHandle method = MI_HEAP_REALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			p,
    			newsize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_realloc].
    public static @Nullable MemorySegment mi_heap_realloc(
    	MiHeap heap,
    	MemorySegment p,
    	long newsize
    ) {
    	MemorySegment segment = mi_heap_realloc(
    		heap.memorySegment(),
    		p,
    		newsize
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_reallocn(
    	MemorySegment heap,
    	MemorySegment p,
    	long count,
    	long size
    ) {
    	MethodHandle method = MI_HEAP_REALLOCN.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			p,
    			count,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_reallocn].
    public static @Nullable MemorySegment mi_heap_reallocn(
    	MiHeap heap,
    	MemorySegment p,
    	long count,
    	long size
    ) {
    	MemorySegment segment = mi_heap_reallocn(
    		heap.memorySegment(),
    		p,
    		count,
    		size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_reallocf(
    	MemorySegment theap,
    	MemorySegment p,
    	long newsize
    ) {
    	MethodHandle method = MI_HEAP_REALLOCF.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			theap,
    			p,
    			newsize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_reallocf].
    public static @Nullable MemorySegment mi_heap_reallocf(
    	MiHeap theap,
    	MemorySegment p,
    	long newsize
    ) {
    	MemorySegment segment = mi_heap_reallocf(
    		theap.memorySegment(),
    		p,
    		newsize
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_strdup(
    	MemorySegment heap,
    	MemorySegment s
    ) {
    	MethodHandle method = MI_HEAP_STRDUP.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			s
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_strdup].
    public static @Nullable NativeByteArray mi_heap_strdup(
    	MiHeap heap,
    	NativeByteArray s
    ) {
    	MemorySegment segment = mi_heap_strdup(
    		heap.memorySegment(),
    		s.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment mi_heap_strndup(
    	MemorySegment heap,
    	MemorySegment s,
    	long n
    ) {
    	MethodHandle method = MI_HEAP_STRNDUP.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			s,
    			n
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_strndup].
    public static @Nullable NativeByteArray mi_heap_strndup(
    	MiHeap heap,
    	NativeByteArray s,
    	long n
    ) {
    	MemorySegment segment = mi_heap_strndup(
    		heap.memorySegment(),
    		s.memorySegment(),
    		n
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment mi_heap_realpath(
    	MemorySegment heap,
    	MemorySegment fname,
    	MemorySegment resolved_name
    ) {
    	MethodHandle method = MI_HEAP_REALPATH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			fname,
    			resolved_name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_realpath].
    public static @Nullable NativeByteArray mi_heap_realpath(
    	MiHeap heap,
    	NativeByteArray fname,
    	NativeByteArray resolved_name
    ) {
    	MemorySegment segment = mi_heap_realpath(
    		heap.memorySegment(),
    		fname.memorySegment(),
    		resolved_name.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment mi_heap_malloc_aligned(
    	MemorySegment heap,
    	long size,
    	long alignment
    ) {
    	MethodHandle method = MI_HEAP_MALLOC_ALIGNED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			size,
    			alignment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_malloc_aligned].
    public static @Nullable MemorySegment mi_heap_malloc_aligned(
    	MiHeap heap,
    	long size,
    	long alignment
    ) {
    	MemorySegment segment = mi_heap_malloc_aligned(
    		heap.memorySegment(),
    		size,
    		alignment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_malloc_aligned_at(
    	MemorySegment heap,
    	long size,
    	long alignment,
    	long offset
    ) {
    	MethodHandle method = MI_HEAP_MALLOC_ALIGNED_AT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			size,
    			alignment,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_malloc_aligned_at].
    public static @Nullable MemorySegment mi_heap_malloc_aligned_at(
    	MiHeap heap,
    	long size,
    	long alignment,
    	long offset
    ) {
    	MemorySegment segment = mi_heap_malloc_aligned_at(
    		heap.memorySegment(),
    		size,
    		alignment,
    		offset
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_zalloc_aligned(
    	MemorySegment heap,
    	long size,
    	long alignment
    ) {
    	MethodHandle method = MI_HEAP_ZALLOC_ALIGNED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			size,
    			alignment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_zalloc_aligned].
    public static @Nullable MemorySegment mi_heap_zalloc_aligned(
    	MiHeap heap,
    	long size,
    	long alignment
    ) {
    	MemorySegment segment = mi_heap_zalloc_aligned(
    		heap.memorySegment(),
    		size,
    		alignment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_zalloc_aligned_at(
    	MemorySegment heap,
    	long size,
    	long alignment,
    	long offset
    ) {
    	MethodHandle method = MI_HEAP_ZALLOC_ALIGNED_AT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			size,
    			alignment,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_zalloc_aligned_at].
    public static @Nullable MemorySegment mi_heap_zalloc_aligned_at(
    	MiHeap heap,
    	long size,
    	long alignment,
    	long offset
    ) {
    	MemorySegment segment = mi_heap_zalloc_aligned_at(
    		heap.memorySegment(),
    		size,
    		alignment,
    		offset
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_calloc_aligned(
    	MemorySegment heap,
    	long count,
    	long size,
    	long alignment
    ) {
    	MethodHandle method = MI_HEAP_CALLOC_ALIGNED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			count,
    			size,
    			alignment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_calloc_aligned].
    public static @Nullable MemorySegment mi_heap_calloc_aligned(
    	MiHeap heap,
    	long count,
    	long size,
    	long alignment
    ) {
    	MemorySegment segment = mi_heap_calloc_aligned(
    		heap.memorySegment(),
    		count,
    		size,
    		alignment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_calloc_aligned_at(
    	MemorySegment heap,
    	long count,
    	long size,
    	long alignment,
    	long offset
    ) {
    	MethodHandle method = MI_HEAP_CALLOC_ALIGNED_AT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			count,
    			size,
    			alignment,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_calloc_aligned_at].
    public static @Nullable MemorySegment mi_heap_calloc_aligned_at(
    	MiHeap heap,
    	long count,
    	long size,
    	long alignment,
    	long offset
    ) {
    	MemorySegment segment = mi_heap_calloc_aligned_at(
    		heap.memorySegment(),
    		count,
    		size,
    		alignment,
    		offset
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_realloc_aligned(
    	MemorySegment heap,
    	MemorySegment p,
    	long newsize,
    	long alignment
    ) {
    	MethodHandle method = MI_HEAP_REALLOC_ALIGNED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			p,
    			newsize,
    			alignment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_realloc_aligned].
    public static @Nullable MemorySegment mi_heap_realloc_aligned(
    	MiHeap heap,
    	MemorySegment p,
    	long newsize,
    	long alignment
    ) {
    	MemorySegment segment = mi_heap_realloc_aligned(
    		heap.memorySegment(),
    		p,
    		newsize,
    		alignment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_realloc_aligned_at(
    	MemorySegment heap,
    	MemorySegment p,
    	long newsize,
    	long alignment,
    	long offset
    ) {
    	MethodHandle method = MI_HEAP_REALLOC_ALIGNED_AT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			p,
    			newsize,
    			alignment,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_realloc_aligned_at].
    public static @Nullable MemorySegment mi_heap_realloc_aligned_at(
    	MiHeap heap,
    	MemorySegment p,
    	long newsize,
    	long alignment,
    	long offset
    ) {
    	MemorySegment segment = mi_heap_realloc_aligned_at(
    		heap.memorySegment(),
    		p,
    		newsize,
    		alignment,
    		offset
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_rezalloc(
    	MemorySegment p,
    	long newsize
    ) {
    	MethodHandle method = MI_REZALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			newsize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_recalloc(
    	MemorySegment p,
    	long newcount,
    	long size
    ) {
    	MethodHandle method = MI_RECALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			newcount,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_rezalloc_aligned(
    	MemorySegment p,
    	long newsize,
    	long alignment
    ) {
    	MethodHandle method = MI_REZALLOC_ALIGNED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			newsize,
    			alignment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_rezalloc_aligned_at(
    	MemorySegment p,
    	long newsize,
    	long alignment,
    	long offset
    ) {
    	MethodHandle method = MI_REZALLOC_ALIGNED_AT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			newsize,
    			alignment,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_recalloc_aligned(
    	MemorySegment p,
    	long newcount,
    	long size,
    	long alignment
    ) {
    	MethodHandle method = MI_RECALLOC_ALIGNED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			newcount,
    			size,
    			alignment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_recalloc_aligned_at(
    	MemorySegment p,
    	long newcount,
    	long size,
    	long alignment,
    	long offset
    ) {
    	MethodHandle method = MI_RECALLOC_ALIGNED_AT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			newcount,
    			size,
    			alignment,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_heap_rezalloc(
    	MemorySegment heap,
    	MemorySegment p,
    	long newsize
    ) {
    	MethodHandle method = MI_HEAP_REZALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			p,
    			newsize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_rezalloc].
    public static @Nullable MemorySegment mi_heap_rezalloc(
    	MiHeap heap,
    	MemorySegment p,
    	long newsize
    ) {
    	MemorySegment segment = mi_heap_rezalloc(
    		heap.memorySegment(),
    		p,
    		newsize
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_recalloc(
    	MemorySegment heap,
    	MemorySegment p,
    	long newcount,
    	long size
    ) {
    	MethodHandle method = MI_HEAP_RECALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			p,
    			newcount,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_recalloc].
    public static @Nullable MemorySegment mi_heap_recalloc(
    	MiHeap heap,
    	MemorySegment p,
    	long newcount,
    	long size
    ) {
    	MemorySegment segment = mi_heap_recalloc(
    		heap.memorySegment(),
    		p,
    		newcount,
    		size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_rezalloc_aligned(
    	MemorySegment heap,
    	MemorySegment p,
    	long newsize,
    	long alignment
    ) {
    	MethodHandle method = MI_HEAP_REZALLOC_ALIGNED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			p,
    			newsize,
    			alignment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_rezalloc_aligned].
    public static @Nullable MemorySegment mi_heap_rezalloc_aligned(
    	MiHeap heap,
    	MemorySegment p,
    	long newsize,
    	long alignment
    ) {
    	MemorySegment segment = mi_heap_rezalloc_aligned(
    		heap.memorySegment(),
    		p,
    		newsize,
    		alignment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_rezalloc_aligned_at(
    	MemorySegment heap,
    	MemorySegment p,
    	long newsize,
    	long alignment,
    	long offset
    ) {
    	MethodHandle method = MI_HEAP_REZALLOC_ALIGNED_AT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			p,
    			newsize,
    			alignment,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_rezalloc_aligned_at].
    public static @Nullable MemorySegment mi_heap_rezalloc_aligned_at(
    	MiHeap heap,
    	MemorySegment p,
    	long newsize,
    	long alignment,
    	long offset
    ) {
    	MemorySegment segment = mi_heap_rezalloc_aligned_at(
    		heap.memorySegment(),
    		p,
    		newsize,
    		alignment,
    		offset
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_recalloc_aligned(
    	MemorySegment heap,
    	MemorySegment p,
    	long newcount,
    	long size,
    	long alignment
    ) {
    	MethodHandle method = MI_HEAP_RECALLOC_ALIGNED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			p,
    			newcount,
    			size,
    			alignment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_recalloc_aligned].
    public static @Nullable MemorySegment mi_heap_recalloc_aligned(
    	MiHeap heap,
    	MemorySegment p,
    	long newcount,
    	long size,
    	long alignment
    ) {
    	MemorySegment segment = mi_heap_recalloc_aligned(
    		heap.memorySegment(),
    		p,
    		newcount,
    		size,
    		alignment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_recalloc_aligned_at(
    	MemorySegment heap,
    	MemorySegment p,
    	long newcount,
    	long size,
    	long alignment,
    	long offset
    ) {
    	MethodHandle method = MI_HEAP_RECALLOC_ALIGNED_AT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			p,
    			newcount,
    			size,
    			alignment,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_recalloc_aligned_at].
    public static @Nullable MemorySegment mi_heap_recalloc_aligned_at(
    	MiHeap heap,
    	MemorySegment p,
    	long newcount,
    	long size,
    	long alignment,
    	long offset
    ) {
    	MemorySegment segment = mi_heap_recalloc_aligned_at(
    		heap.memorySegment(),
    		p,
    		newcount,
    		size,
    		alignment,
    		offset
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static boolean mi_heap_visit_blocks(
    	MemorySegment heap,
    	boolean visit_blocks,
    	MemorySegment visitor,
    	MemorySegment arg
    ) {
    	MethodHandle method = MI_HEAP_VISIT_BLOCKS.get();
    	try {
    		return (boolean) method.invokeExact(
    			heap,
    			visit_blocks,
    			visitor,
    			arg
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_visit_blocks].
    public static boolean mi_heap_visit_blocks(
    	MiHeap heap,
    	boolean visit_blocks,
    	MiBlockVisitFun visitor,
    	MemorySegment arg
    ) {
    	return mi_heap_visit_blocks(
    		heap.memorySegment(),
    		visit_blocks,
    		visitor.memorySegment(),
    		arg
    	);
    }
    
    public static boolean mi_heap_visit_abandoned_blocks(
    	MemorySegment heap,
    	boolean visit_blocks,
    	MemorySegment visitor,
    	MemorySegment arg
    ) {
    	MethodHandle method = MI_HEAP_VISIT_ABANDONED_BLOCKS.get();
    	try {
    		return (boolean) method.invokeExact(
    			heap,
    			visit_blocks,
    			visitor,
    			arg
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_visit_abandoned_blocks].
    public static boolean mi_heap_visit_abandoned_blocks(
    	MiHeap heap,
    	boolean visit_blocks,
    	MiBlockVisitFun visitor,
    	MemorySegment arg
    ) {
    	return mi_heap_visit_abandoned_blocks(
    		heap.memorySegment(),
    		visit_blocks,
    		visitor.memorySegment(),
    		arg
    	);
    }
    
    public static boolean mi_is_redirected() {
    	MethodHandle method = MI_IS_REDIRECTED.get();
    	try {
    		return (boolean) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int mi_reserve_huge_os_pages_interleave(
    	long pages,
    	long numa_nodes,
    	long timeout_msecs
    ) {
    	MethodHandle method = MI_RESERVE_HUGE_OS_PAGES_INTERLEAVE.get();
    	try {
    		return (int) method.invokeExact(
    			pages,
    			numa_nodes,
    			timeout_msecs
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int mi_reserve_huge_os_pages_at(
    	long pages,
    	int numa_node,
    	long timeout_msecs
    ) {
    	MethodHandle method = MI_RESERVE_HUGE_OS_PAGES_AT.get();
    	try {
    		return (int) method.invokeExact(
    			pages,
    			numa_node,
    			timeout_msecs
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int mi_reserve_os_memory(
    	long size,
    	boolean commit,
    	boolean allow_large
    ) {
    	MethodHandle method = MI_RESERVE_OS_MEMORY.get();
    	try {
    		return (int) method.invokeExact(
    			size,
    			commit,
    			allow_large
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static boolean mi_manage_os_memory(
    	MemorySegment start,
    	long size,
    	boolean is_committed,
    	boolean is_pinned,
    	boolean is_zero,
    	int numa_node
    ) {
    	MethodHandle method = MI_MANAGE_OS_MEMORY.get();
    	try {
    		return (boolean) method.invokeExact(
    			start,
    			size,
    			is_committed,
    			is_pinned,
    			is_zero,
    			numa_node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_debug_show_arenas() {
    	MethodHandle method = MI_DEBUG_SHOW_ARENAS.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_arenas_print() {
    	MethodHandle method = MI_ARENAS_PRINT.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_arenas_purge() {
    	MethodHandle method = MI_ARENAS_PURGE.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static long mi_arena_min_alignment() {
    	MethodHandle method = MI_ARENA_MIN_ALIGNMENT.get();
    	try {
    		return (long) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static long mi_arena_min_size() {
    	MethodHandle method = MI_ARENA_MIN_SIZE.get();
    	try {
    		return (long) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static long mi_arena_max_object_size() {
    	MethodHandle method = MI_ARENA_MAX_OBJECT_SIZE.get();
    	try {
    		return (long) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_arena_area(
    	MemorySegment arena_id,
    	MemorySegment size
    ) {
    	MethodHandle method = MI_ARENA_AREA.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			arena_id,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_arena_area].
    public static @Nullable MemorySegment mi_arena_area(
    	MemorySegment arena_id,
    	NativeLongArray size
    ) {
    	MemorySegment segment = mi_arena_area(
    		arena_id,
    		size.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static int mi_reserve_huge_os_pages_at_ex(
    	long pages,
    	int numa_node,
    	long timeout_msecs,
    	boolean exclusive,
    	MemorySegment arena_id
    ) {
    	MethodHandle method = MI_RESERVE_HUGE_OS_PAGES_AT_EX.get();
    	try {
    		return (int) method.invokeExact(
    			pages,
    			numa_node,
    			timeout_msecs,
    			exclusive,
    			arena_id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_reserve_huge_os_pages_at_ex].
    public static int mi_reserve_huge_os_pages_at_ex(
    	long pages,
    	int numa_node,
    	long timeout_msecs,
    	boolean exclusive,
    	NativePointerArray arena_id
    ) {
    	return mi_reserve_huge_os_pages_at_ex(
    		pages,
    		numa_node,
    		timeout_msecs,
    		exclusive,
    		arena_id.memorySegment()
    	);
    }
    
    public static int mi_reserve_os_memory_ex(
    	long size,
    	boolean commit,
    	boolean allow_large,
    	boolean exclusive,
    	MemorySegment arena_id
    ) {
    	MethodHandle method = MI_RESERVE_OS_MEMORY_EX.get();
    	try {
    		return (int) method.invokeExact(
    			size,
    			commit,
    			allow_large,
    			exclusive,
    			arena_id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_reserve_os_memory_ex].
    public static int mi_reserve_os_memory_ex(
    	long size,
    	boolean commit,
    	boolean allow_large,
    	boolean exclusive,
    	NativePointerArray arena_id
    ) {
    	return mi_reserve_os_memory_ex(
    		size,
    		commit,
    		allow_large,
    		exclusive,
    		arena_id.memorySegment()
    	);
    }
    
    public static boolean mi_manage_os_memory_ex(
    	MemorySegment start,
    	long size,
    	boolean is_committed,
    	boolean is_pinned,
    	boolean is_zero,
    	int numa_node,
    	boolean exclusive,
    	MemorySegment arena_id
    ) {
    	MethodHandle method = MI_MANAGE_OS_MEMORY_EX.get();
    	try {
    		return (boolean) method.invokeExact(
    			start,
    			size,
    			is_committed,
    			is_pinned,
    			is_zero,
    			numa_node,
    			exclusive,
    			arena_id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_manage_os_memory_ex].
    public static boolean mi_manage_os_memory_ex(
    	MemorySegment start,
    	long size,
    	boolean is_committed,
    	boolean is_pinned,
    	boolean is_zero,
    	int numa_node,
    	boolean exclusive,
    	NativePointerArray arena_id
    ) {
    	return mi_manage_os_memory_ex(
    		start,
    		size,
    		is_committed,
    		is_pinned,
    		is_zero,
    		numa_node,
    		exclusive,
    		arena_id.memorySegment()
    	);
    }
    
    public static boolean mi_arena_contains(
    	MemorySegment arena_id,
    	MemorySegment p
    ) {
    	MethodHandle method = MI_ARENA_CONTAINS.get();
    	try {
    		return (boolean) method.invokeExact(
    			arena_id,
    			p
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment nmi_heap_new_in_arena(
    	MemorySegment arena_id
    ) {
    	MethodHandle method = MI_HEAP_NEW_IN_ARENA.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			arena_id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nmi_heap_new_in_arena].
    public static @Nullable MiHeap mi_heap_new_in_arena(
    	MemorySegment arena_id
    ) {
    	MemorySegment segment = nmi_heap_new_in_arena(
    		arena_id
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MiHeap(segment);
    }
    
    public static MemorySegment nmi_subproc_main(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = MI_SUBPROC_MAIN.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nmi_subproc_main].
    public static @Nullable MiSubprocId mi_subproc_main(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = nmi_subproc_main(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MiSubprocId(segment);
    }
    
    public static MemorySegment nmi_subproc_current(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = MI_SUBPROC_CURRENT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nmi_subproc_current].
    public static @Nullable MiSubprocId mi_subproc_current(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = nmi_subproc_current(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MiSubprocId(segment);
    }
    
    public static MemorySegment nmi_subproc_new(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = MI_SUBPROC_NEW.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nmi_subproc_new].
    public static @Nullable MiSubprocId mi_subproc_new(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = nmi_subproc_new(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MiSubprocId(segment);
    }
    
    public static void mi_subproc_destroy(
    	MemorySegment subproc
    ) {
    	MethodHandle method = MI_SUBPROC_DESTROY.get();
    	try {
    		 method.invokeExact(
    			subproc
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_subproc_destroy].
    public static void mi_subproc_destroy(
    	MiSubprocId subproc
    ) {
    	mi_subproc_destroy(
    		subproc.memorySegment()
    	);
    }
    
    public static void mi_subproc_add_current_thread(
    	MemorySegment subproc
    ) {
    	MethodHandle method = MI_SUBPROC_ADD_CURRENT_THREAD.get();
    	try {
    		 method.invokeExact(
    			subproc
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_subproc_add_current_thread].
    public static void mi_subproc_add_current_thread(
    	MiSubprocId subproc
    ) {
    	mi_subproc_add_current_thread(
    		subproc.memorySegment()
    	);
    }
    
    public static boolean mi_subproc_visit_heaps(
    	MemorySegment subproc,
    	MemorySegment visitor,
    	MemorySegment arg
    ) {
    	MethodHandle method = MI_SUBPROC_VISIT_HEAPS.get();
    	try {
    		return (boolean) method.invokeExact(
    			subproc,
    			visitor,
    			arg
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_subproc_visit_heaps].
    public static boolean mi_subproc_visit_heaps(
    	MiSubprocId subproc,
    	MiHeapVisitFun visitor,
    	MemorySegment arg
    ) {
    	return mi_subproc_visit_heaps(
    		subproc.memorySegment(),
    		visitor.memorySegment(),
    		arg
    	);
    }
    
    public static MemorySegment mi_heap_theap(
    	MemorySegment heap
    ) {
    	MethodHandle method = MI_HEAP_THEAP.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_theap].
    public static @Nullable MiTHeap mi_heap_theap(
    	MiHeap heap
    ) {
    	MemorySegment segment = mi_heap_theap(
    		heap.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MiTHeap(segment);
    }
    
    public static MemorySegment mi_theap_set_default(
    	MemorySegment theap
    ) {
    	MethodHandle method = MI_THEAP_SET_DEFAULT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			theap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_set_default].
    public static @Nullable MiTHeap mi_theap_set_default(
    	MiTHeap theap
    ) {
    	MemorySegment segment = mi_theap_set_default(
    		theap.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MiTHeap(segment);
    }
    
    public static MemorySegment nmi_theap_get_default() {
    	MethodHandle method = MI_THEAP_GET_DEFAULT.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nmi_theap_get_default].
    public static @Nullable MiTHeap mi_theap_get_default() {
    	MemorySegment segment = nmi_theap_get_default();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return new MiTHeap(segment);
    }
    
    public static void mi_theap_collect(
    	MemorySegment theap,
    	boolean force
    ) {
    	MethodHandle method = MI_THEAP_COLLECT.get();
    	try {
    		 method.invokeExact(
    			theap,
    			force
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_collect].
    public static void mi_theap_collect(
    	MiTHeap theap,
    	boolean force
    ) {
    	mi_theap_collect(
    		theap.memorySegment(),
    		force
    	);
    }
    
    public static MemorySegment mi_theap_malloc(
    	MemorySegment theap,
    	long size
    ) {
    	MethodHandle method = MI_THEAP_MALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			theap,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_malloc].
    public static @Nullable MemorySegment mi_theap_malloc(
    	MiTHeap theap,
    	long size
    ) {
    	MemorySegment segment = mi_theap_malloc(
    		theap.memorySegment(),
    		size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_theap_zalloc(
    	MemorySegment theap,
    	long size
    ) {
    	MethodHandle method = MI_THEAP_ZALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			theap,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_zalloc].
    public static @Nullable MemorySegment mi_theap_zalloc(
    	MiTHeap theap,
    	long size
    ) {
    	MemorySegment segment = mi_theap_zalloc(
    		theap.memorySegment(),
    		size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_theap_calloc(
    	MemorySegment theap,
    	long count,
    	long size
    ) {
    	MethodHandle method = MI_THEAP_CALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			theap,
    			count,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_calloc].
    public static @Nullable MemorySegment mi_theap_calloc(
    	MiTHeap theap,
    	long count,
    	long size
    ) {
    	MemorySegment segment = mi_theap_calloc(
    		theap.memorySegment(),
    		count,
    		size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_theap_malloc_small(
    	MemorySegment theap,
    	long size
    ) {
    	MethodHandle method = MI_THEAP_MALLOC_SMALL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			theap,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_malloc_small].
    public static @Nullable MemorySegment mi_theap_malloc_small(
    	MiTHeap theap,
    	long size
    ) {
    	MemorySegment segment = mi_theap_malloc_small(
    		theap.memorySegment(),
    		size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_theap_zalloc_small(
    	MemorySegment theap,
    	long size
    ) {
    	MethodHandle method = MI_THEAP_ZALLOC_SMALL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			theap,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_zalloc_small].
    public static @Nullable MemorySegment mi_theap_zalloc_small(
    	MiTHeap theap,
    	long size
    ) {
    	MemorySegment segment = mi_theap_zalloc_small(
    		theap.memorySegment(),
    		size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_theap_malloc_aligned(
    	MemorySegment theap,
    	long size,
    	long alignment
    ) {
    	MethodHandle method = MI_THEAP_MALLOC_ALIGNED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			theap,
    			size,
    			alignment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_malloc_aligned].
    public static @Nullable MemorySegment mi_theap_malloc_aligned(
    	MiTHeap theap,
    	long size,
    	long alignment
    ) {
    	MemorySegment segment = mi_theap_malloc_aligned(
    		theap.memorySegment(),
    		size,
    		alignment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_theap_zalloc_aligned(
    	MemorySegment theap,
    	long size,
    	long alignment
    ) {
    	MethodHandle method = MI_THEAP_ZALLOC_ALIGNED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			theap,
    			size,
    			alignment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_zalloc_aligned].
    public static @Nullable MemorySegment mi_theap_zalloc_aligned(
    	MiTHeap theap,
    	long size,
    	long alignment
    ) {
    	MemorySegment segment = mi_theap_zalloc_aligned(
    		theap.memorySegment(),
    		size,
    		alignment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_theap_realloc(
    	MemorySegment theap,
    	MemorySegment p,
    	long newsize
    ) {
    	MethodHandle method = MI_THEAP_REALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			theap,
    			p,
    			newsize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_realloc].
    public static @Nullable MemorySegment mi_theap_realloc(
    	MiTHeap theap,
    	MemorySegment p,
    	long newsize
    ) {
    	MemorySegment segment = mi_theap_realloc(
    		theap.memorySegment(),
    		p,
    		newsize
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_theap_rezalloc(
    	MemorySegment theap,
    	MemorySegment p,
    	long newsize
    ) {
    	MethodHandle method = MI_THEAP_REZALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			theap,
    			p,
    			newsize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_rezalloc].
    public static @Nullable MemorySegment mi_theap_rezalloc(
    	MiTHeap theap,
    	MemorySegment p,
    	long newsize
    ) {
    	MemorySegment segment = mi_theap_rezalloc(
    		theap.memorySegment(),
    		p,
    		newsize
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static void mi_theap_guarded_set_sample_rate(
    	MemorySegment theap,
    	long sample_rate,
    	long seed
    ) {
    	MethodHandle method = MI_THEAP_GUARDED_SET_SAMPLE_RATE.get();
    	try {
    		 method.invokeExact(
    			theap,
    			sample_rate,
    			seed
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_guarded_set_sample_rate].
    public static void mi_theap_guarded_set_sample_rate(
    	MiTHeap theap,
    	long sample_rate,
    	long seed
    ) {
    	mi_theap_guarded_set_sample_rate(
    		theap.memorySegment(),
    		sample_rate,
    		seed
    	);
    }
    
    public static void mi_theap_guarded_set_size_bound(
    	MemorySegment theap,
    	long min,
    	long max
    ) {
    	MethodHandle method = MI_THEAP_GUARDED_SET_SIZE_BOUND.get();
    	try {
    		 method.invokeExact(
    			theap,
    			min,
    			max
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_guarded_set_size_bound].
    public static void mi_theap_guarded_set_size_bound(
    	MiTHeap theap,
    	long min,
    	long max
    ) {
    	mi_theap_guarded_set_size_bound(
    		theap.memorySegment(),
    		min,
    		max
    	);
    }
    
    public static boolean mi_manage_memory(
    	MemorySegment start,
    	long size,
    	boolean is_committed,
    	boolean is_pinned,
    	boolean is_zero,
    	int numa_node,
    	boolean exclusive,
    	MemorySegment commit_fun,
    	MemorySegment commit_fun_arg,
    	MemorySegment arena_id
    ) {
    	MethodHandle method = MI_MANAGE_MEMORY.get();
    	try {
    		return (boolean) method.invokeExact(
    			start,
    			size,
    			is_committed,
    			is_pinned,
    			is_zero,
    			numa_node,
    			exclusive,
    			commit_fun,
    			commit_fun_arg,
    			arena_id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_manage_memory].
    public static boolean mi_manage_memory(
    	MemorySegment start,
    	long size,
    	boolean is_committed,
    	boolean is_pinned,
    	boolean is_zero,
    	int numa_node,
    	boolean exclusive,
    	MiCommitFunT commit_fun,
    	MemorySegment commit_fun_arg,
    	NativePointerArray arena_id
    ) {
    	return mi_manage_memory(
    		start,
    		size,
    		is_committed,
    		is_pinned,
    		is_zero,
    		numa_node,
    		exclusive,
    		commit_fun.memorySegment(),
    		commit_fun_arg,
    		arena_id.memorySegment()
    	);
    }
    
    public static boolean mi_unsafe_heap_page_is_under_utilized(
    	MemorySegment heap,
    	MemorySegment p,
    	long perc_threshold
    ) {
    	MethodHandle method = MI_UNSAFE_HEAP_PAGE_IS_UNDER_UTILIZED.get();
    	try {
    		return (boolean) method.invokeExact(
    			heap,
    			p,
    			perc_threshold
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_unsafe_heap_page_is_under_utilized].
    public static boolean mi_unsafe_heap_page_is_under_utilized(
    	MiHeap heap,
    	MemorySegment p,
    	long perc_threshold
    ) {
    	return mi_unsafe_heap_page_is_under_utilized(
    		heap.memorySegment(),
    		p,
    		perc_threshold
    	);
    }
    
    public static void mi_theap_delete(
    	MemorySegment theap
    ) {
    	MethodHandle method = MI_THEAP_DELETE.get();
    	try {
    		 method.invokeExact(
    			theap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_delete].
    public static void mi_theap_delete(
    	MiTHeap theap
    ) {
    	mi_theap_delete(
    		theap.memorySegment()
    	);
    }
    
    public static void mi_theap_quiescent_abandon(
    	MemorySegment theap
    ) {
    	MethodHandle method = MI_THEAP_QUIESCENT_ABANDON.get();
    	try {
    		 method.invokeExact(
    			theap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_quiescent_abandon].
    public static void mi_theap_quiescent_abandon(
    	MiTHeap theap
    ) {
    	mi_theap_quiescent_abandon(
    		theap.memorySegment()
    	);
    }
    
    public static boolean mi_check_owned(
    	MemorySegment p
    ) {
    	MethodHandle method = MI_CHECK_OWNED.get();
    	try {
    		return (boolean) method.invokeExact(
    			p
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_thread_stats_print_out(
    	MemorySegment out,
    	MemorySegment arg
    ) {
    	MethodHandle method = MI_THREAD_STATS_PRINT_OUT.get();
    	try {
    		 method.invokeExact(
    			out,
    			arg
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_thread_stats_print_out].
    public static void mi_thread_stats_print_out(
    	MiOutputFun out,
    	MemorySegment arg
    ) {
    	mi_thread_stats_print_out(
    		out.memorySegment(),
    		arg
    	);
    }
    
    public static boolean mi_is_in_heap_region(
    	MemorySegment p
    ) {
    	MethodHandle method = MI_IS_IN_HEAP_REGION.get();
    	try {
    		return (boolean) method.invokeExact(
    			p
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static boolean mi_theap_visit_blocks(
    	MemorySegment theap,
    	boolean visit_blocks,
    	MemorySegment visitor,
    	MemorySegment arg
    ) {
    	MethodHandle method = MI_THEAP_VISIT_BLOCKS.get();
    	try {
    		return (boolean) method.invokeExact(
    			theap,
    			visit_blocks,
    			visitor,
    			arg
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_visit_blocks].
    public static boolean mi_theap_visit_blocks(
    	MiTHeap theap,
    	boolean visit_blocks,
    	MiBlockVisitFun visitor,
    	MemorySegment arg
    ) {
    	return mi_theap_visit_blocks(
    		theap.memorySegment(),
    		visit_blocks,
    		visitor.memorySegment(),
    		arg
    	);
    }
    
    public static int mi_reserve_huge_os_pages(
    	long pages,
    	double max_secs,
    	MemorySegment pages_reserved
    ) {
    	MethodHandle method = MI_RESERVE_HUGE_OS_PAGES.get();
    	try {
    		return (int) method.invokeExact(
    			pages,
    			max_secs,
    			pages_reserved
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_reserve_huge_os_pages].
    public static int mi_reserve_huge_os_pages(
    	long pages,
    	double max_secs,
    	NativeLongArray pages_reserved
    ) {
    	return mi_reserve_huge_os_pages(
    		pages,
    		max_secs,
    		pages_reserved.memorySegment()
    	);
    }
    
    public static void mi_collect_reduce(
    	long target_thread_owned
    ) {
    	MethodHandle method = MI_COLLECT_REDUCE.get();
    	try {
    		 method.invokeExact(
    			target_thread_owned
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_stats_reset() {
    	MethodHandle method = MI_STATS_RESET.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_stats_merge() {
    	MethodHandle method = MI_STATS_MERGE.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_stats_print(
    	MemorySegment out
    ) {
    	MethodHandle method = MI_STATS_PRINT.get();
    	try {
    		 method.invokeExact(
    			out
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_stats_print_out(
    	MemorySegment out,
    	MemorySegment arg
    ) {
    	MethodHandle method = MI_STATS_PRINT_OUT.get();
    	try {
    		 method.invokeExact(
    			out,
    			arg
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_stats_print_out].
    public static void mi_stats_print_out(
    	MiOutputFun out,
    	MemorySegment arg
    ) {
    	mi_stats_print_out(
    		out.memorySegment(),
    		arg
    	);
    }
    
    public static boolean mi_option_is_enabled(
    	int option
    ) {
    	MethodHandle method = MI_OPTION_IS_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			option
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_option_enable(
    	int option
    ) {
    	MethodHandle method = MI_OPTION_ENABLE.get();
    	try {
    		 method.invokeExact(
    			option
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_option_disable(
    	int option
    ) {
    	MethodHandle method = MI_OPTION_DISABLE.get();
    	try {
    		 method.invokeExact(
    			option
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static boolean mi_cfree(
    	MemorySegment p
    ) {
    	MethodHandle method = MI_CFREE.get();
    	try {
    		return (boolean) method.invokeExact(
    			p
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi__expand(
    	MemorySegment p,
    	long newsize
    ) {
    	MethodHandle method = MI__EXPAND.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			newsize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static long mi_malloc_size(
    	MemorySegment p
    ) {
    	MethodHandle method = MI_MALLOC_SIZE.get();
    	try {
    		return (long) method.invokeExact(
    			p
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static long mi_malloc_good_size(
    	long size
    ) {
    	MethodHandle method = MI_MALLOC_GOOD_SIZE.get();
    	try {
    		return (long) method.invokeExact(
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static long mi_malloc_usable_size(
    	MemorySegment p
    ) {
    	MethodHandle method = MI_MALLOC_USABLE_SIZE.get();
    	try {
    		return (long) method.invokeExact(
    			p
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int mi_posix_memalign(
    	MemorySegment p,
    	long alignment,
    	long size
    ) {
    	MethodHandle method = MI_POSIX_MEMALIGN.get();
    	try {
    		return (int) method.invokeExact(
    			p,
    			alignment,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_posix_memalign].
    public static int mi_posix_memalign(
    	NativePointerArray p,
    	long alignment,
    	long size
    ) {
    	return mi_posix_memalign(
    		p.memorySegment(),
    		alignment,
    		size
    	);
    }
    
    public static MemorySegment mi_memalign(
    	long alignment,
    	long size
    ) {
    	MethodHandle method = MI_MEMALIGN.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			alignment,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_valloc(
    	long size
    ) {
    	MethodHandle method = MI_VALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_pvalloc(
    	long size
    ) {
    	MethodHandle method = MI_PVALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_aligned_alloc(
    	long alignment,
    	long size
    ) {
    	MethodHandle method = MI_ALIGNED_ALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			alignment,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_reallocarray(
    	MemorySegment p,
    	long count,
    	long size
    ) {
    	MethodHandle method = MI_REALLOCARRAY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			count,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int mi_reallocarr(
    	MemorySegment ptrp,
    	long count,
    	long size
    ) {
    	MethodHandle method = MI_REALLOCARR.get();
    	try {
    		return (int) method.invokeExact(
    			ptrp,
    			count,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_aligned_recalloc(
    	MemorySegment p,
    	long newcount,
    	long size,
    	long alignment
    ) {
    	MethodHandle method = MI_ALIGNED_RECALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			newcount,
    			size,
    			alignment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_aligned_offset_recalloc(
    	MemorySegment p,
    	long newcount,
    	long size,
    	long alignment,
    	long offset
    ) {
    	MethodHandle method = MI_ALIGNED_OFFSET_RECALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			newcount,
    			size,
    			alignment,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_free_size_aligned(
    	MemorySegment p,
    	long size,
    	long alignment
    ) {
    	MethodHandle method = MI_FREE_SIZE_ALIGNED.get();
    	try {
    		 method.invokeExact(
    			p,
    			size,
    			alignment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_free_aligned(
    	MemorySegment p,
    	long alignment
    ) {
    	MethodHandle method = MI_FREE_ALIGNED.get();
    	try {
    		 method.invokeExact(
    			p,
    			alignment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int mi_dupenv_s(
    	MemorySegment buf,
    	MemorySegment size,
    	MemorySegment name
    ) {
    	MethodHandle method = MI_DUPENV_S.get();
    	try {
    		return (int) method.invokeExact(
    			buf,
    			size,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_dupenv_s].
    public static int mi_dupenv_s(
    	NativePointerArray buf,
    	NativeLongArray size,
    	NativeByteArray name
    ) {
    	return mi_dupenv_s(
    		buf.memorySegment(),
    		size.memorySegment(),
    		name.memorySegment()
    	);
    }
    
    public static int mi_wdupenv_s(
    	MemorySegment buf,
    	MemorySegment size,
    	MemorySegment name
    ) {
    	MethodHandle method = MI_WDUPENV_S.get();
    	try {
    		return (int) method.invokeExact(
    			buf,
    			size,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_wdupenv_s].
    public static int mi_wdupenv_s(
    	NativePointerArray buf,
    	NativeLongArray size,
    	NativeShortArray name
    ) {
    	return mi_wdupenv_s(
    		buf.memorySegment(),
    		size.memorySegment(),
    		name.memorySegment()
    	);
    }
    
    public static MemorySegment mi_wcsdup(
    	MemorySegment s
    ) {
    	MethodHandle method = MI_WCSDUP.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			s
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_wcsdup].
    public static @Nullable NativeShortArray mi_wcsdup(
    	NativeShortArray s
    ) {
    	MemorySegment segment = mi_wcsdup(
    		s.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeShortArray(segment);
    }
    
    public static MemorySegment mi_mbsdup(
    	MemorySegment s
    ) {
    	MethodHandle method = MI_MBSDUP.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			s
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_mbsdup].
    public static @Nullable NativeByteArray mi_mbsdup(
    	NativeByteArray s
    ) {
    	MemorySegment segment = mi_mbsdup(
    		s.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment mi_new(
    	long size
    ) {
    	MethodHandle method = MI_NEW.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_new_aligned(
    	long size,
    	long alignment
    ) {
    	MethodHandle method = MI_NEW_ALIGNED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size,
    			alignment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_new_nothrow(
    	long size
    ) {
    	MethodHandle method = MI_NEW_NOTHROW.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_new_aligned_nothrow(
    	long size,
    	long alignment
    ) {
    	MethodHandle method = MI_NEW_ALIGNED_NOTHROW.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size,
    			alignment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_new_n(
    	long count,
    	long size
    ) {
    	MethodHandle method = MI_NEW_N.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			count,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_new_realloc(
    	MemorySegment p,
    	long newsize
    ) {
    	MethodHandle method = MI_NEW_REALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			newsize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_new_reallocn(
    	MemorySegment p,
    	long newcount,
    	long size
    ) {
    	MethodHandle method = MI_NEW_REALLOCN.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			newcount,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_heap_alloc_new(
    	MemorySegment heap,
    	long size
    ) {
    	MethodHandle method = MI_HEAP_ALLOC_NEW.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_alloc_new].
    public static @Nullable MemorySegment mi_heap_alloc_new(
    	MiHeap heap,
    	long size
    ) {
    	MemorySegment segment = mi_heap_alloc_new(
    		heap.memorySegment(),
    		size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_heap_alloc_new_n(
    	MemorySegment heap,
    	long count,
    	long size
    ) {
    	MethodHandle method = MI_HEAP_ALLOC_NEW_N.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			heap,
    			count,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_heap_alloc_new_n].
    public static @Nullable MemorySegment mi_heap_alloc_new_n(
    	MiHeap heap,
    	long count,
    	long size
    ) {
    	MemorySegment segment = mi_heap_alloc_new_n(
    		heap.memorySegment(),
    		count,
    		size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_theap_alloc_new(
    	MemorySegment theap,
    	long size
    ) {
    	MethodHandle method = MI_THEAP_ALLOC_NEW.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			theap,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_alloc_new].
    public static @Nullable MemorySegment mi_theap_alloc_new(
    	MiTHeap theap,
    	long size
    ) {
    	MemorySegment segment = mi_theap_alloc_new(
    		theap.memorySegment(),
    		size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_theap_alloc_new_n(
    	MemorySegment theap,
    	long count,
    	long size
    ) {
    	MethodHandle method = MI_THEAP_ALLOC_NEW_N.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			theap,
    			count,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_alloc_new_n].
    public static @Nullable MemorySegment mi_theap_alloc_new_n(
    	MiTHeap theap,
    	long count,
    	long size
    ) {
    	MemorySegment segment = mi_theap_alloc_new_n(
    		theap.memorySegment(),
    		count,
    		size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_theap_alloc_new_nothrow(
    	MemorySegment theap,
    	long size
    ) {
    	MethodHandle method = MI_THEAP_ALLOC_NEW_NOTHROW.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			theap,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_alloc_new_nothrow].
    public static @Nullable MemorySegment mi_theap_alloc_new_nothrow(
    	MiTHeap theap,
    	long size
    ) {
    	MemorySegment segment = mi_theap_alloc_new_nothrow(
    		theap.memorySegment(),
    		size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_wzalloc_small(
    	long wsize
    ) {
    	MethodHandle method = MI_WZALLOC_SMALL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			wsize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_wmalloc_small(
    	long wsize
    ) {
    	MethodHandle method = MI_WMALLOC_SMALL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			wsize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment mi_theap_wmalloc_small(
    	MemorySegment theap,
    	long wsize
    ) {
    	MethodHandle method = MI_THEAP_WMALLOC_SMALL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			theap,
    			wsize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_wmalloc_small].
    public static @Nullable MemorySegment mi_theap_wmalloc_small(
    	MiTHeap theap,
    	long wsize
    ) {
    	MemorySegment segment = mi_theap_wmalloc_small(
    		theap.memorySegment(),
    		wsize
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment mi_theap_wzalloc_small(
    	MemorySegment theap,
    	long wsize
    ) {
    	MethodHandle method = MI_THEAP_WZALLOC_SMALL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			theap,
    			wsize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mi_theap_wzalloc_small].
    public static @Nullable MemorySegment mi_theap_wzalloc_small(
    	MiTHeap theap,
    	long wsize
    ) {
    	MemorySegment segment = mi_theap_wzalloc_small(
    		theap.memorySegment(),
    		wsize
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static void mi_free_small_local(
    	MemorySegment p
    ) {
    	MethodHandle method = MI_FREE_SMALL_LOCAL.get();
    	try {
    		 method.invokeExact(
    			p
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mi_free_small_local_nonnull(
    	MemorySegment p
    ) {
    	MethodHandle method = MI_FREE_SMALL_LOCAL_NONNULL.get();
    	try {
    		 method.invokeExact(
    			p
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }

}