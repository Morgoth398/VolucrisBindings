/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.rpmalloc;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class RpmallocConfig
		implements Struct<RpmallocConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle PAGE_SIZE_HANDLE;
	public static final VarHandle ENABLE_HUGE_PAGES_HANDLE;
	public static final VarHandle ENABLE_THP_HANDLE;
	public static final VarHandle DISABLE_DECOMMIT_HANDLE;
	public static final VarHandle PAGE_NAME_HANDLE;
	public static final VarHandle HUGE_PAGE_NAME_HANDLE;
	public static final VarHandle UNMAP_ON_FINALIZE_HANDLE;

	public static final long PAGE_SIZE_BYTE_OFFSET;
	public static final long ENABLE_HUGE_PAGES_BYTE_OFFSET;
	public static final long ENABLE_THP_BYTE_OFFSET;
	public static final long DISABLE_DECOMMIT_BYTE_OFFSET;
	public static final long PAGE_NAME_BYTE_OFFSET;
	public static final long HUGE_PAGE_NAME_BYTE_OFFSET;
	public static final long UNMAP_ON_FINALIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_LONG.withName("page_size"),
		    JAVA_INT.withName("enable_huge_pages"),
		    JAVA_INT.withName("enable_thp"),
		    JAVA_INT.withName("disable_decommit"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("page_name"),
		    UNBOUNDED_ADDRESS.withName("huge_page_name"),
		    JAVA_INT.withName("unmap_on_finalize"),
		    MemoryLayout.paddingLayout(4)
		).withName("rpmalloc_config_t").withByteAlignment(8);
		
		PAGE_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("page_size"));
		ENABLE_HUGE_PAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enable_huge_pages"));
		ENABLE_THP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enable_thp"));
		DISABLE_DECOMMIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("disable_decommit"));
		PAGE_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("page_name"));
		HUGE_PAGE_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("huge_page_name"));
		UNMAP_ON_FINALIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("unmap_on_finalize"));
		
		PAGE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("page_size"));
		ENABLE_HUGE_PAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enable_huge_pages"));
		ENABLE_THP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enable_thp"));
		DISABLE_DECOMMIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("disable_decommit"));
		PAGE_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("page_name"));
		HUGE_PAGE_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("huge_page_name"));
		UNMAP_ON_FINALIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("unmap_on_finalize"));
		//@formatter:on
	}

	public RpmallocConfig() {
	    this(Arena.ofAuto());
	}
	
	public RpmallocConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public RpmallocConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #page_size()
    public RpmallocConfig page_size(long page_size) {
    	PAGE_SIZE_HANDLE.set(segment, 0L, page_size);
    	return this;
    }
    
    /// ```
    /// Size of memory pages. The page size MUST be a power of two. All memory mapping
    /// ```
    public long page_size() {
    	return (long) PAGE_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #enable_huge_pages()
    public RpmallocConfig enable_huge_pages(int enable_huge_pages) {
    	ENABLE_HUGE_PAGES_HANDLE.set(segment, 0L, enable_huge_pages);
    	return this;
    }
    
    /// ```
    /// Enable use of large/huge pages. If this flag is set to non-zero and page size is
    /// ```
    public int enable_huge_pages() {
    	return (int) ENABLE_HUGE_PAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #enable_thp()
    public RpmallocConfig enable_thp(int enable_thp) {
    	ENABLE_THP_HANDLE.set(segment, 0L, enable_thp);
    	return this;
    }
    
    /// ```
    /// Enable use of transparent huge pages, advising the kernel to back large memory
    /// ```
    public int enable_thp() {
    	return (int) ENABLE_THP_HANDLE.get(segment, 0L);
    }
    
    /// @see #disable_decommit()
    public RpmallocConfig disable_decommit(int disable_decommit) {
    	DISABLE_DECOMMIT_HANDLE.set(segment, 0L, disable_decommit);
    	return this;
    }
    
    /// ```
    /// Disable decommitting unused pages when allocator determines the memory pressure
    /// ```
    public int disable_decommit() {
    	return (int) DISABLE_DECOMMIT_HANDLE.get(segment, 0L);
    }
    
    /// @see #page_name()
    public RpmallocConfig page_name(NativeByteArray page_name) {
    	PAGE_NAME_HANDLE.set(segment, 0L, page_name.memorySegment());
    	return this;
    }
    
    /// ```
    /// Allocated pages names for systems supporting it to be able to distinguish among anonymous regions.
    /// ```
    public @Nullable NativeByteArray page_name() {
    	MemorySegment segment = (MemorySegment) PAGE_NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #huge_page_name()
    public RpmallocConfig huge_page_name(NativeByteArray huge_page_name) {
    	HUGE_PAGE_NAME_HANDLE.set(segment, 0L, huge_page_name.memorySegment());
    	return this;
    }
    
    /// ```
    /// Allocated huge pages names for systems supporting it to be able to distinguish among anonymous regions.
    /// ```
    public @Nullable NativeByteArray huge_page_name() {
    	MemorySegment segment = (MemorySegment) HUGE_PAGE_NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #unmap_on_finalize()
    public RpmallocConfig unmap_on_finalize(int unmap_on_finalize) {
    	UNMAP_ON_FINALIZE_HANDLE.set(segment, 0L, unmap_on_finalize);
    	return this;
    }
    
    /// ```
    /// Unmap all memory on finalize if set to 1. Normally you can let the OS unmap all pages
    /// ```
    public int unmap_on_finalize() {
    	return (int) UNMAP_ON_FINALIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public RpmallocConfig set(RpmallocConfig other) {
        return set(other.segment);
    }
    
    @Override
    public RpmallocConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<RpmallocConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<RpmallocConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new RpmallocConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<RpmallocConfig> array(SegmentAllocator allocator, RpmallocConfig... structs) {
        NativeStructArray<RpmallocConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new RpmallocConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<RpmallocConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new RpmallocConfig(segment)
        );
    }

}