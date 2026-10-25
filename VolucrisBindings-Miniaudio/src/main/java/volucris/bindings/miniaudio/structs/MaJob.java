/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeShortArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.miniaudio.callbacks.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaJob
		implements Struct<MaJob> {

	public static final StructLayout LAYOUT;

	public static final VarHandle NEXT_HANDLE;
	public static final VarHandle ORDER_HANDLE;

	public static final long TOC_BYTE_OFFSET;
	public static final long NEXT_BYTE_OFFSET;
	public static final long ORDER_BYTE_OFFSET;
	public static final long DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final Toc toc;
	private final Data data;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    Toc.LAYOUT.withName("toc"),
		    JAVA_LONG.withName("next"),
		    JAVA_INT.withName("order"),
		    MemoryLayout.paddingLayout(4),
		    Data.LAYOUT.withName("data")
		).withName("ma_job").withByteAlignment(8);
		
		NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("next"));
		ORDER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("order"));
		
		TOC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("toc"));
		NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("next"));
		ORDER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("order"));
		DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
		//@formatter:on
	}

	public MaJob() {
	    this(Arena.ofAuto());
	}
	
	public MaJob(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaJob(MemorySegment segment) {
	    this.segment = segment;
	
	    toc = new Toc(segment.asSlice(TOC_BYTE_OFFSET, Toc.LAYOUT));
	    data = new Data(segment.asSlice(DATA_BYTE_OFFSET, Data.LAYOUT));
	}

    /// @see #toc()
    public MaJob toc(Consumer<Toc> consumer) {
    	consumer.accept(toc);
    	return this;
    }
    
    /// @see #toc()
    public MaJob toc(Toc other) {
    	toc.set(other);
    	return this;
    }
    
    public Toc toc() {
    	return toc;
    }
    
    /// @see #next()
    public MaJob next(long next) {
    	NEXT_HANDLE.set(segment, 0L, next);
    	return this;
    }
    
    public long next() {
    	return (long) NEXT_HANDLE.get(segment, 0L);
    }
    
    /// @see #order()
    public MaJob order(int order) {
    	ORDER_HANDLE.set(segment, 0L, order);
    	return this;
    }
    
    public int order() {
    	return (int) ORDER_HANDLE.get(segment, 0L);
    }
    
    /// @see #data()
    public MaJob data(Consumer<Data> consumer) {
    	consumer.accept(data);
    	return this;
    }
    
    /// @see #data()
    public MaJob data(Data other) {
    	data.set(other);
    	return this;
    }
    
    public Data data() {
    	return data;
    }
    
    @Override
    public MaJob set(MaJob other) {
        return set(other.segment);
    }
    
    @Override
    public MaJob set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaJob> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaJob> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaJob(segment),
            count
        );
    }
    
    public static NativeStructArray<MaJob> array(SegmentAllocator allocator, MaJob... structs) {
        NativeStructArray<MaJob> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaJob(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaJob> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaJob(segment)
        );
    }

	public static class Toc implements Struct<Toc> {
	
		public static final UnionLayout LAYOUT;
	
		public static final VarHandle ALLOCATION_HANDLE;
	
		public static final long BREAKUP_BYTE_OFFSET;
		public static final long ALLOCATION_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		private final Breakup breakup;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.unionLayout(
			    Breakup.LAYOUT.withName("breakup"),
			    JAVA_LONG.withName("allocation")
			).withName("Toc").withByteAlignment(8);
			
			ALLOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("allocation"));
			
			BREAKUP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("breakup"));
			ALLOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocation"));
			//@formatter:on
		}
	
		public Toc() {
		    this(Arena.ofAuto());
		}
		
		public Toc(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Toc(MemorySegment segment) {
		    this.segment = segment;
		
		    breakup = new Breakup(segment.asSlice(BREAKUP_BYTE_OFFSET, Breakup.LAYOUT));
		}
	
	    /// @see #breakup()
	    public Toc breakup(Consumer<Breakup> consumer) {
	    	consumer.accept(breakup);
	    	return this;
	    }
	    
	    /// @see #breakup()
	    public Toc breakup(Breakup other) {
	    	breakup.set(other);
	    	return this;
	    }
	    
	    public Breakup breakup() {
	    	return breakup;
	    }
	    
	    /// @see #allocation()
	    public Toc allocation(long allocation) {
	    	ALLOCATION_HANDLE.set(segment, 0L, allocation);
	    	return this;
	    }
	    
	    public long allocation() {
	    	return (long) ALLOCATION_HANDLE.get(segment, 0L);
	    }
	    
	    @Override
	    public Toc set(Toc other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Toc set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Toc> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Toc> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Toc(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Toc> array(SegmentAllocator allocator, Toc... structs) {
	        NativeStructArray<Toc> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Toc(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Toc> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Toc(segment)
	        );
	    }
	
		public static class Breakup implements Struct<Breakup> {
		
			public static final StructLayout LAYOUT;
		
			public static final VarHandle CODE_HANDLE;
			public static final VarHandle SLOT_HANDLE;
			public static final VarHandle REFCOUNT_HANDLE;
		
			public static final long CODE_BYTE_OFFSET;
			public static final long SLOT_BYTE_OFFSET;
			public static final long REFCOUNT_BYTE_OFFSET;
		
			private final MemorySegment segment;
		
			static {
				//@formatter:off
				LAYOUT = MemoryLayout.structLayout(
				    JAVA_SHORT.withName("code"),
				    JAVA_SHORT.withName("slot"),
				    JAVA_INT.withName("refcount")
				).withName("Breakup").withByteAlignment(4);
				
				CODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("code"));
				SLOT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("slot"));
				REFCOUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("refcount"));
				
				CODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("code"));
				SLOT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("slot"));
				REFCOUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("refcount"));
				//@formatter:on
			}
		
			public Breakup() {
			    this(Arena.ofAuto());
			}
			
			public Breakup(SegmentAllocator allocator) {
			    this(allocator.allocate(LAYOUT));
			}
			
			public Breakup(MemorySegment segment) {
			    this.segment = segment;
			
			}
		
		    /// @see #code()
		    public Breakup code(short code) {
		    	CODE_HANDLE.set(segment, 0L, code);
		    	return this;
		    }
		    
		    public short code() {
		    	return (short) CODE_HANDLE.get(segment, 0L);
		    }
		    
		    /// @see #slot()
		    public Breakup slot(short slot) {
		    	SLOT_HANDLE.set(segment, 0L, slot);
		    	return this;
		    }
		    
		    public short slot() {
		    	return (short) SLOT_HANDLE.get(segment, 0L);
		    }
		    
		    /// @see #refcount()
		    public Breakup refcount(int refcount) {
		    	REFCOUNT_HANDLE.set(segment, 0L, refcount);
		    	return this;
		    }
		    
		    public int refcount() {
		    	return (int) REFCOUNT_HANDLE.get(segment, 0L);
		    }
		    
		    @Override
		    public Breakup set(Breakup other) {
		        return set(other.segment);
		    }
		    
		    @Override
		    public Breakup set(MemorySegment src) {
		        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
		        return this;
		    }
		    
		    @Override
		    public MemorySegment memorySegment() {
		        return segment;
		    }
		    
		    public NativeStructArray<Breakup> asArray() {
		        return new NativeStructArray<>(this);
		    }
		    
		    public static NativeStructArray<Breakup> array(SegmentAllocator allocator, int count) {
		        return new NativeStructArray<>(
		            allocator,
		            LAYOUT,
		            segment -> new Breakup(segment),
		            count
		        );
		    }
		    
		    public static NativeStructArray<Breakup> array(SegmentAllocator allocator, Breakup... structs) {
		        NativeStructArray<Breakup> array = new NativeStructArray<>(
		            allocator,
		            LAYOUT,
		            segment -> new Breakup(segment),
		            structs.length
		        );
		    
		        for (int i = 0; i < structs.length; i++) {
		            array.set(i, structs[i]);
		        }
		    
		        return array;
		    }
		    
		    public static NativeStructArray<Breakup> array(MemorySegment array) {
		        return new NativeStructArray<>(
		            array,
		            LAYOUT,
		            segment -> new Breakup(segment)
		        );
		    }
		
		}
	}
    
	public static class Data implements Struct<Data> {
	
		public static final UnionLayout LAYOUT;
	
		public static final long CUSTOM_BYTE_OFFSET;
		public static final long RESOURCE_MANAGER_BYTE_OFFSET;
		public static final long DEVICE_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		private final Custom custom;
		private final ResourceManager resourceManager;
		private final Device device;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.unionLayout(
			    Custom.LAYOUT.withName("custom"),
			    ResourceManager.LAYOUT.withName("resourceManager"),
			    Device.LAYOUT.withName("device")
			).withName("Data").withByteAlignment(8);
			
			CUSTOM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("custom"));
			RESOURCE_MANAGER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resourceManager"));
			DEVICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("device"));
			//@formatter:on
		}
	
		public Data() {
		    this(Arena.ofAuto());
		}
		
		public Data(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Data(MemorySegment segment) {
		    this.segment = segment;
		
		    custom = new Custom(segment.asSlice(CUSTOM_BYTE_OFFSET, Custom.LAYOUT));
		    resourceManager = new ResourceManager(segment.asSlice(RESOURCE_MANAGER_BYTE_OFFSET, ResourceManager.LAYOUT));
		    device = new Device(segment.asSlice(DEVICE_BYTE_OFFSET, Device.LAYOUT));
		}
	
	    /// @see #custom()
	    public Data custom(Consumer<Custom> consumer) {
	    	consumer.accept(custom);
	    	return this;
	    }
	    
	    /// @see #custom()
	    public Data custom(Custom other) {
	    	custom.set(other);
	    	return this;
	    }
	    
	    public Custom custom() {
	    	return custom;
	    }
	    
	    /// @see #resourceManager()
	    public Data resourceManager(Consumer<ResourceManager> consumer) {
	    	consumer.accept(resourceManager);
	    	return this;
	    }
	    
	    /// @see #resourceManager()
	    public Data resourceManager(ResourceManager other) {
	    	resourceManager.set(other);
	    	return this;
	    }
	    
	    public ResourceManager resourceManager() {
	    	return resourceManager;
	    }
	    
	    /// @see #device()
	    public Data device(Consumer<Device> consumer) {
	    	consumer.accept(device);
	    	return this;
	    }
	    
	    /// @see #device()
	    public Data device(Device other) {
	    	device.set(other);
	    	return this;
	    }
	    
	    public Device device() {
	    	return device;
	    }
	    
	    @Override
	    public Data set(Data other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Data set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Data> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Data> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Data(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Data> array(SegmentAllocator allocator, Data... structs) {
	        NativeStructArray<Data> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Data(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Data> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Data(segment)
	        );
	    }
	
		public static class Custom implements Struct<Custom> {
		
			public static final StructLayout LAYOUT;
		
			public static final VarHandle PROC_HANDLE;
			public static final VarHandle DATA0_HANDLE;
			public static final VarHandle DATA1_HANDLE;
		
			public static final long PROC_BYTE_OFFSET;
			public static final long DATA0_BYTE_OFFSET;
			public static final long DATA1_BYTE_OFFSET;
		
			private final MemorySegment segment;
		
			static {
				//@formatter:off
				LAYOUT = MemoryLayout.structLayout(
				    UNBOUNDED_ADDRESS.withName("proc"),
				    JAVA_LONG.withName("data0"),
				    JAVA_LONG.withName("data1")
				).withName("Custom").withByteAlignment(8);
				
				PROC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("proc"));
				DATA0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("data0"));
				DATA1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("data1"));
				
				PROC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("proc"));
				DATA0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data0"));
				DATA1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data1"));
				//@formatter:on
			}
		
			public Custom() {
			    this(Arena.ofAuto());
			}
			
			public Custom(SegmentAllocator allocator) {
			    this(allocator.allocate(LAYOUT));
			}
			
			public Custom(MemorySegment segment) {
			    this.segment = segment;
			
			}
		
		    /// @see #proc()
		    public Custom proc(MaJobProc proc) {
		    	PROC_HANDLE.set(segment, 0L, proc.memorySegment());
		    	return this;
		    }
		    
		    public @Nullable MaJobProc proc() {
		    	MemorySegment segment = (MemorySegment) PROC_HANDLE.get(this.segment, 0L);
		    
		    	if (segment.equals(MemorySegment.NULL))
		    		return null;
		    	
		    	return MaJobProc.get(segment);
		    }
		    
		    /// @see #data0()
		    public Custom data0(long data0) {
		    	DATA0_HANDLE.set(segment, 0L, data0);
		    	return this;
		    }
		    
		    public long data0() {
		    	return (long) DATA0_HANDLE.get(segment, 0L);
		    }
		    
		    /// @see #data1()
		    public Custom data1(long data1) {
		    	DATA1_HANDLE.set(segment, 0L, data1);
		    	return this;
		    }
		    
		    public long data1() {
		    	return (long) DATA1_HANDLE.get(segment, 0L);
		    }
		    
		    @Override
		    public Custom set(Custom other) {
		        return set(other.segment);
		    }
		    
		    @Override
		    public Custom set(MemorySegment src) {
		        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
		        return this;
		    }
		    
		    @Override
		    public MemorySegment memorySegment() {
		        return segment;
		    }
		    
		    public NativeStructArray<Custom> asArray() {
		        return new NativeStructArray<>(this);
		    }
		    
		    public static NativeStructArray<Custom> array(SegmentAllocator allocator, int count) {
		        return new NativeStructArray<>(
		            allocator,
		            LAYOUT,
		            segment -> new Custom(segment),
		            count
		        );
		    }
		    
		    public static NativeStructArray<Custom> array(SegmentAllocator allocator, Custom... structs) {
		        NativeStructArray<Custom> array = new NativeStructArray<>(
		            allocator,
		            LAYOUT,
		            segment -> new Custom(segment),
		            structs.length
		        );
		    
		        for (int i = 0; i < structs.length; i++) {
		            array.set(i, structs[i]);
		        }
		    
		        return array;
		    }
		    
		    public static NativeStructArray<Custom> array(MemorySegment array) {
		        return new NativeStructArray<>(
		            array,
		            LAYOUT,
		            segment -> new Custom(segment)
		        );
		    }
		
		}
	    
		public static class ResourceManager implements Struct<ResourceManager> {
		
			public static final UnionLayout LAYOUT;
		
			public static final long LOAD_DATA_BUFFER_NODE_BYTE_OFFSET;
			public static final long FREE_DATA_BUFFER_NODE_BYTE_OFFSET;
			public static final long PAGE_DATA_BUFFER_NODE_BYTE_OFFSET;
			public static final long LOAD_DATA_BUFFER_BYTE_OFFSET;
			public static final long FREE_DATA_BUFFER_BYTE_OFFSET;
			public static final long LOAD_DATA_STREAM_BYTE_OFFSET;
			public static final long FREE_DATA_STREAM_BYTE_OFFSET;
			public static final long PAGE_DATA_STREAM_BYTE_OFFSET;
			public static final long SEEK_DATA_STREAM_BYTE_OFFSET;
		
			private final MemorySegment segment;
		
			private final LoadDataBufferNode loadDataBufferNode;
			private final FreeDataBufferNode freeDataBufferNode;
			private final PageDataBufferNode pageDataBufferNode;
			private final LoadDataBuffer loadDataBuffer;
			private final FreeDataBuffer freeDataBuffer;
			private final LoadDataStream loadDataStream;
			private final FreeDataStream freeDataStream;
			private final PageDataStream pageDataStream;
			private final SeekDataStream seekDataStream;
		
			static {
				//@formatter:off
				LAYOUT = MemoryLayout.unionLayout(
				    LoadDataBufferNode.LAYOUT.withName("loadDataBufferNode"),
				    FreeDataBufferNode.LAYOUT.withName("freeDataBufferNode"),
				    PageDataBufferNode.LAYOUT.withName("pageDataBufferNode"),
				    LoadDataBuffer.LAYOUT.withName("loadDataBuffer"),
				    FreeDataBuffer.LAYOUT.withName("freeDataBuffer"),
				    LoadDataStream.LAYOUT.withName("loadDataStream"),
				    FreeDataStream.LAYOUT.withName("freeDataStream"),
				    PageDataStream.LAYOUT.withName("pageDataStream"),
				    SeekDataStream.LAYOUT.withName("seekDataStream")
				).withName("ResourceManager").withByteAlignment(8);
				
				LOAD_DATA_BUFFER_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loadDataBufferNode"));
				FREE_DATA_BUFFER_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("freeDataBufferNode"));
				PAGE_DATA_BUFFER_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pageDataBufferNode"));
				LOAD_DATA_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loadDataBuffer"));
				FREE_DATA_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("freeDataBuffer"));
				LOAD_DATA_STREAM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loadDataStream"));
				FREE_DATA_STREAM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("freeDataStream"));
				PAGE_DATA_STREAM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pageDataStream"));
				SEEK_DATA_STREAM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("seekDataStream"));
				//@formatter:on
			}
		
			public ResourceManager() {
			    this(Arena.ofAuto());
			}
			
			public ResourceManager(SegmentAllocator allocator) {
			    this(allocator.allocate(LAYOUT));
			}
			
			public ResourceManager(MemorySegment segment) {
			    this.segment = segment;
			
			    loadDataBufferNode = new LoadDataBufferNode(segment.asSlice(LOAD_DATA_BUFFER_NODE_BYTE_OFFSET, LoadDataBufferNode.LAYOUT));
			    freeDataBufferNode = new FreeDataBufferNode(segment.asSlice(FREE_DATA_BUFFER_NODE_BYTE_OFFSET, FreeDataBufferNode.LAYOUT));
			    pageDataBufferNode = new PageDataBufferNode(segment.asSlice(PAGE_DATA_BUFFER_NODE_BYTE_OFFSET, PageDataBufferNode.LAYOUT));
			    loadDataBuffer = new LoadDataBuffer(segment.asSlice(LOAD_DATA_BUFFER_BYTE_OFFSET, LoadDataBuffer.LAYOUT));
			    freeDataBuffer = new FreeDataBuffer(segment.asSlice(FREE_DATA_BUFFER_BYTE_OFFSET, FreeDataBuffer.LAYOUT));
			    loadDataStream = new LoadDataStream(segment.asSlice(LOAD_DATA_STREAM_BYTE_OFFSET, LoadDataStream.LAYOUT));
			    freeDataStream = new FreeDataStream(segment.asSlice(FREE_DATA_STREAM_BYTE_OFFSET, FreeDataStream.LAYOUT));
			    pageDataStream = new PageDataStream(segment.asSlice(PAGE_DATA_STREAM_BYTE_OFFSET, PageDataStream.LAYOUT));
			    seekDataStream = new SeekDataStream(segment.asSlice(SEEK_DATA_STREAM_BYTE_OFFSET, SeekDataStream.LAYOUT));
			}
		
		    /// @see #loadDataBufferNode()
		    public ResourceManager loadDataBufferNode(Consumer<LoadDataBufferNode> consumer) {
		    	consumer.accept(loadDataBufferNode);
		    	return this;
		    }
		    
		    /// @see #loadDataBufferNode()
		    public ResourceManager loadDataBufferNode(LoadDataBufferNode other) {
		    	loadDataBufferNode.set(other);
		    	return this;
		    }
		    
		    public LoadDataBufferNode loadDataBufferNode() {
		    	return loadDataBufferNode;
		    }
		    
		    /// @see #freeDataBufferNode()
		    public ResourceManager freeDataBufferNode(Consumer<FreeDataBufferNode> consumer) {
		    	consumer.accept(freeDataBufferNode);
		    	return this;
		    }
		    
		    /// @see #freeDataBufferNode()
		    public ResourceManager freeDataBufferNode(FreeDataBufferNode other) {
		    	freeDataBufferNode.set(other);
		    	return this;
		    }
		    
		    public FreeDataBufferNode freeDataBufferNode() {
		    	return freeDataBufferNode;
		    }
		    
		    /// @see #pageDataBufferNode()
		    public ResourceManager pageDataBufferNode(Consumer<PageDataBufferNode> consumer) {
		    	consumer.accept(pageDataBufferNode);
		    	return this;
		    }
		    
		    /// @see #pageDataBufferNode()
		    public ResourceManager pageDataBufferNode(PageDataBufferNode other) {
		    	pageDataBufferNode.set(other);
		    	return this;
		    }
		    
		    public PageDataBufferNode pageDataBufferNode() {
		    	return pageDataBufferNode;
		    }
		    
		    /// @see #loadDataBuffer()
		    public ResourceManager loadDataBuffer(Consumer<LoadDataBuffer> consumer) {
		    	consumer.accept(loadDataBuffer);
		    	return this;
		    }
		    
		    /// @see #loadDataBuffer()
		    public ResourceManager loadDataBuffer(LoadDataBuffer other) {
		    	loadDataBuffer.set(other);
		    	return this;
		    }
		    
		    public LoadDataBuffer loadDataBuffer() {
		    	return loadDataBuffer;
		    }
		    
		    /// @see #freeDataBuffer()
		    public ResourceManager freeDataBuffer(Consumer<FreeDataBuffer> consumer) {
		    	consumer.accept(freeDataBuffer);
		    	return this;
		    }
		    
		    /// @see #freeDataBuffer()
		    public ResourceManager freeDataBuffer(FreeDataBuffer other) {
		    	freeDataBuffer.set(other);
		    	return this;
		    }
		    
		    public FreeDataBuffer freeDataBuffer() {
		    	return freeDataBuffer;
		    }
		    
		    /// @see #loadDataStream()
		    public ResourceManager loadDataStream(Consumer<LoadDataStream> consumer) {
		    	consumer.accept(loadDataStream);
		    	return this;
		    }
		    
		    /// @see #loadDataStream()
		    public ResourceManager loadDataStream(LoadDataStream other) {
		    	loadDataStream.set(other);
		    	return this;
		    }
		    
		    public LoadDataStream loadDataStream() {
		    	return loadDataStream;
		    }
		    
		    /// @see #freeDataStream()
		    public ResourceManager freeDataStream(Consumer<FreeDataStream> consumer) {
		    	consumer.accept(freeDataStream);
		    	return this;
		    }
		    
		    /// @see #freeDataStream()
		    public ResourceManager freeDataStream(FreeDataStream other) {
		    	freeDataStream.set(other);
		    	return this;
		    }
		    
		    public FreeDataStream freeDataStream() {
		    	return freeDataStream;
		    }
		    
		    /// @see #pageDataStream()
		    public ResourceManager pageDataStream(Consumer<PageDataStream> consumer) {
		    	consumer.accept(pageDataStream);
		    	return this;
		    }
		    
		    /// @see #pageDataStream()
		    public ResourceManager pageDataStream(PageDataStream other) {
		    	pageDataStream.set(other);
		    	return this;
		    }
		    
		    public PageDataStream pageDataStream() {
		    	return pageDataStream;
		    }
		    
		    /// @see #seekDataStream()
		    public ResourceManager seekDataStream(Consumer<SeekDataStream> consumer) {
		    	consumer.accept(seekDataStream);
		    	return this;
		    }
		    
		    /// @see #seekDataStream()
		    public ResourceManager seekDataStream(SeekDataStream other) {
		    	seekDataStream.set(other);
		    	return this;
		    }
		    
		    public SeekDataStream seekDataStream() {
		    	return seekDataStream;
		    }
		    
		    @Override
		    public ResourceManager set(ResourceManager other) {
		        return set(other.segment);
		    }
		    
		    @Override
		    public ResourceManager set(MemorySegment src) {
		        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
		        return this;
		    }
		    
		    @Override
		    public MemorySegment memorySegment() {
		        return segment;
		    }
		    
		    public NativeStructArray<ResourceManager> asArray() {
		        return new NativeStructArray<>(this);
		    }
		    
		    public static NativeStructArray<ResourceManager> array(SegmentAllocator allocator, int count) {
		        return new NativeStructArray<>(
		            allocator,
		            LAYOUT,
		            segment -> new ResourceManager(segment),
		            count
		        );
		    }
		    
		    public static NativeStructArray<ResourceManager> array(SegmentAllocator allocator, ResourceManager... structs) {
		        NativeStructArray<ResourceManager> array = new NativeStructArray<>(
		            allocator,
		            LAYOUT,
		            segment -> new ResourceManager(segment),
		            structs.length
		        );
		    
		        for (int i = 0; i < structs.length; i++) {
		            array.set(i, structs[i]);
		        }
		    
		        return array;
		    }
		    
		    public static NativeStructArray<ResourceManager> array(MemorySegment array) {
		        return new NativeStructArray<>(
		            array,
		            LAYOUT,
		            segment -> new ResourceManager(segment)
		        );
		    }
		
			public static class LoadDataBufferNode implements Struct<LoadDataBufferNode> {
			
				public static final StructLayout LAYOUT;
			
				public static final VarHandle P_RESOURCE_MANAGER_HANDLE;
				public static final VarHandle P_DATA_BUFFER_NODE_HANDLE;
				public static final VarHandle P_FILE_PATH_HANDLE;
				public static final VarHandle P_FILE_PATH_W_HANDLE;
				public static final VarHandle FLAGS_HANDLE;
				public static final VarHandle P_INIT_NOTIFICATION_HANDLE;
				public static final VarHandle P_DONE_NOTIFICATION_HANDLE;
				public static final VarHandle P_INIT_FENCE_HANDLE;
				public static final VarHandle P_DONE_FENCE_HANDLE;
			
				public static final long P_RESOURCE_MANAGER_BYTE_OFFSET;
				public static final long P_DATA_BUFFER_NODE_BYTE_OFFSET;
				public static final long P_FILE_PATH_BYTE_OFFSET;
				public static final long P_FILE_PATH_W_BYTE_OFFSET;
				public static final long FLAGS_BYTE_OFFSET;
				public static final long P_INIT_NOTIFICATION_BYTE_OFFSET;
				public static final long P_DONE_NOTIFICATION_BYTE_OFFSET;
				public static final long P_INIT_FENCE_BYTE_OFFSET;
				public static final long P_DONE_FENCE_BYTE_OFFSET;
			
				private final MemorySegment segment;
			
				static {
					//@formatter:off
					LAYOUT = MemoryLayout.structLayout(
					    UNBOUNDED_ADDRESS.withName("pResourceManager"),
					    UNBOUNDED_ADDRESS.withName("pDataBufferNode"),
					    UNBOUNDED_ADDRESS.withName("pFilePath"),
					    UNBOUNDED_ADDRESS.withName("pFilePathW"),
					    JAVA_INT.withName("flags"),
					    MemoryLayout.paddingLayout(4),
					    UNBOUNDED_ADDRESS.withName("pInitNotification"),
					    UNBOUNDED_ADDRESS.withName("pDoneNotification"),
					    UNBOUNDED_ADDRESS.withName("pInitFence"),
					    UNBOUNDED_ADDRESS.withName("pDoneFence")
					).withName("LoadDataBufferNode").withByteAlignment(8);
					
					P_RESOURCE_MANAGER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pResourceManager"));
					P_DATA_BUFFER_NODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDataBufferNode"));
					P_FILE_PATH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pFilePath"));
					P_FILE_PATH_W_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pFilePathW"));
					FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
					P_INIT_NOTIFICATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pInitNotification"));
					P_DONE_NOTIFICATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDoneNotification"));
					P_INIT_FENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pInitFence"));
					P_DONE_FENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDoneFence"));
					
					P_RESOURCE_MANAGER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pResourceManager"));
					P_DATA_BUFFER_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDataBufferNode"));
					P_FILE_PATH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pFilePath"));
					P_FILE_PATH_W_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pFilePathW"));
					FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
					P_INIT_NOTIFICATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pInitNotification"));
					P_DONE_NOTIFICATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDoneNotification"));
					P_INIT_FENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pInitFence"));
					P_DONE_FENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDoneFence"));
					//@formatter:on
				}
			
				public LoadDataBufferNode() {
				    this(Arena.ofAuto());
				}
				
				public LoadDataBufferNode(SegmentAllocator allocator) {
				    this(allocator.allocate(LAYOUT));
				}
				
				public LoadDataBufferNode(MemorySegment segment) {
				    this.segment = segment;
				
				}
			
			    /// @see #pResourceManager()
			    public LoadDataBufferNode pResourceManager(MemorySegment pResourceManager) {
			    	P_RESOURCE_MANAGER_HANDLE.set(segment, 0L, pResourceManager);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pResourceManager() {
			    	MemorySegment segment = (MemorySegment) P_RESOURCE_MANAGER_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pDataBufferNode()
			    public LoadDataBufferNode pDataBufferNode(MemorySegment pDataBufferNode) {
			    	P_DATA_BUFFER_NODE_HANDLE.set(segment, 0L, pDataBufferNode);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pDataBufferNode() {
			    	MemorySegment segment = (MemorySegment) P_DATA_BUFFER_NODE_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pFilePath()
			    public LoadDataBufferNode pFilePath(NativeByteArray pFilePath) {
			    	P_FILE_PATH_HANDLE.set(segment, 0L, pFilePath.memorySegment());
			    	return this;
			    }
			    
			    public @Nullable NativeByteArray pFilePath() {
			    	MemorySegment segment = (MemorySegment) P_FILE_PATH_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return new NativeByteArray(segment);
			    }
			    
			    /// @see #pFilePathW()
			    public LoadDataBufferNode pFilePathW(NativeShortArray pFilePathW) {
			    	P_FILE_PATH_W_HANDLE.set(segment, 0L, pFilePathW.memorySegment());
			    	return this;
			    }
			    
			    public @Nullable NativeShortArray pFilePathW() {
			    	MemorySegment segment = (MemorySegment) P_FILE_PATH_W_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return new NativeShortArray(segment);
			    }
			    
			    /// @see #flags()
			    public LoadDataBufferNode flags(int flags) {
			    	FLAGS_HANDLE.set(segment, 0L, flags);
			    	return this;
			    }
			    
			    public int flags() {
			    	return (int) FLAGS_HANDLE.get(segment, 0L);
			    }
			    
			    /// @see #pInitNotification()
			    public LoadDataBufferNode pInitNotification(MemorySegment pInitNotification) {
			    	P_INIT_NOTIFICATION_HANDLE.set(segment, 0L, pInitNotification);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pInitNotification() {
			    	MemorySegment segment = (MemorySegment) P_INIT_NOTIFICATION_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pDoneNotification()
			    public LoadDataBufferNode pDoneNotification(MemorySegment pDoneNotification) {
			    	P_DONE_NOTIFICATION_HANDLE.set(segment, 0L, pDoneNotification);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pDoneNotification() {
			    	MemorySegment segment = (MemorySegment) P_DONE_NOTIFICATION_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pInitFence()
			    public LoadDataBufferNode pInitFence(MaFence pInitFence) {
			    	P_INIT_FENCE_HANDLE.set(segment, 0L, pInitFence.memorySegment());
			    	return this;
			    }
			    
			    public @Nullable MaFence pInitFence() {
			    	MemorySegment segment = (MemorySegment) P_INIT_FENCE_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return new MaFence(segment);
			    }
			    
			    /// @see #pDoneFence()
			    public LoadDataBufferNode pDoneFence(MaFence pDoneFence) {
			    	P_DONE_FENCE_HANDLE.set(segment, 0L, pDoneFence.memorySegment());
			    	return this;
			    }
			    
			    public @Nullable MaFence pDoneFence() {
			    	MemorySegment segment = (MemorySegment) P_DONE_FENCE_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return new MaFence(segment);
			    }
			    
			    @Override
			    public LoadDataBufferNode set(LoadDataBufferNode other) {
			        return set(other.segment);
			    }
			    
			    @Override
			    public LoadDataBufferNode set(MemorySegment src) {
			        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
			        return this;
			    }
			    
			    @Override
			    public MemorySegment memorySegment() {
			        return segment;
			    }
			    
			    public NativeStructArray<LoadDataBufferNode> asArray() {
			        return new NativeStructArray<>(this);
			    }
			    
			    public static NativeStructArray<LoadDataBufferNode> array(SegmentAllocator allocator, int count) {
			        return new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new LoadDataBufferNode(segment),
			            count
			        );
			    }
			    
			    public static NativeStructArray<LoadDataBufferNode> array(SegmentAllocator allocator, LoadDataBufferNode... structs) {
			        NativeStructArray<LoadDataBufferNode> array = new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new LoadDataBufferNode(segment),
			            structs.length
			        );
			    
			        for (int i = 0; i < structs.length; i++) {
			            array.set(i, structs[i]);
			        }
			    
			        return array;
			    }
			    
			    public static NativeStructArray<LoadDataBufferNode> array(MemorySegment array) {
			        return new NativeStructArray<>(
			            array,
			            LAYOUT,
			            segment -> new LoadDataBufferNode(segment)
			        );
			    }
			
			}
		    
			public static class FreeDataBufferNode implements Struct<FreeDataBufferNode> {
			
				public static final StructLayout LAYOUT;
			
				public static final VarHandle P_RESOURCE_MANAGER_HANDLE;
				public static final VarHandle P_DATA_BUFFER_NODE_HANDLE;
				public static final VarHandle P_DONE_NOTIFICATION_HANDLE;
				public static final VarHandle P_DONE_FENCE_HANDLE;
			
				public static final long P_RESOURCE_MANAGER_BYTE_OFFSET;
				public static final long P_DATA_BUFFER_NODE_BYTE_OFFSET;
				public static final long P_DONE_NOTIFICATION_BYTE_OFFSET;
				public static final long P_DONE_FENCE_BYTE_OFFSET;
			
				private final MemorySegment segment;
			
				static {
					//@formatter:off
					LAYOUT = MemoryLayout.structLayout(
					    UNBOUNDED_ADDRESS.withName("pResourceManager"),
					    UNBOUNDED_ADDRESS.withName("pDataBufferNode"),
					    UNBOUNDED_ADDRESS.withName("pDoneNotification"),
					    UNBOUNDED_ADDRESS.withName("pDoneFence")
					).withName("FreeDataBufferNode").withByteAlignment(8);
					
					P_RESOURCE_MANAGER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pResourceManager"));
					P_DATA_BUFFER_NODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDataBufferNode"));
					P_DONE_NOTIFICATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDoneNotification"));
					P_DONE_FENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDoneFence"));
					
					P_RESOURCE_MANAGER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pResourceManager"));
					P_DATA_BUFFER_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDataBufferNode"));
					P_DONE_NOTIFICATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDoneNotification"));
					P_DONE_FENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDoneFence"));
					//@formatter:on
				}
			
				public FreeDataBufferNode() {
				    this(Arena.ofAuto());
				}
				
				public FreeDataBufferNode(SegmentAllocator allocator) {
				    this(allocator.allocate(LAYOUT));
				}
				
				public FreeDataBufferNode(MemorySegment segment) {
				    this.segment = segment;
				
				}
			
			    /// @see #pResourceManager()
			    public FreeDataBufferNode pResourceManager(MemorySegment pResourceManager) {
			    	P_RESOURCE_MANAGER_HANDLE.set(segment, 0L, pResourceManager);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pResourceManager() {
			    	MemorySegment segment = (MemorySegment) P_RESOURCE_MANAGER_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pDataBufferNode()
			    public FreeDataBufferNode pDataBufferNode(MemorySegment pDataBufferNode) {
			    	P_DATA_BUFFER_NODE_HANDLE.set(segment, 0L, pDataBufferNode);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pDataBufferNode() {
			    	MemorySegment segment = (MemorySegment) P_DATA_BUFFER_NODE_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pDoneNotification()
			    public FreeDataBufferNode pDoneNotification(MemorySegment pDoneNotification) {
			    	P_DONE_NOTIFICATION_HANDLE.set(segment, 0L, pDoneNotification);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pDoneNotification() {
			    	MemorySegment segment = (MemorySegment) P_DONE_NOTIFICATION_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pDoneFence()
			    public FreeDataBufferNode pDoneFence(MaFence pDoneFence) {
			    	P_DONE_FENCE_HANDLE.set(segment, 0L, pDoneFence.memorySegment());
			    	return this;
			    }
			    
			    public @Nullable MaFence pDoneFence() {
			    	MemorySegment segment = (MemorySegment) P_DONE_FENCE_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return new MaFence(segment);
			    }
			    
			    @Override
			    public FreeDataBufferNode set(FreeDataBufferNode other) {
			        return set(other.segment);
			    }
			    
			    @Override
			    public FreeDataBufferNode set(MemorySegment src) {
			        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
			        return this;
			    }
			    
			    @Override
			    public MemorySegment memorySegment() {
			        return segment;
			    }
			    
			    public NativeStructArray<FreeDataBufferNode> asArray() {
			        return new NativeStructArray<>(this);
			    }
			    
			    public static NativeStructArray<FreeDataBufferNode> array(SegmentAllocator allocator, int count) {
			        return new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new FreeDataBufferNode(segment),
			            count
			        );
			    }
			    
			    public static NativeStructArray<FreeDataBufferNode> array(SegmentAllocator allocator, FreeDataBufferNode... structs) {
			        NativeStructArray<FreeDataBufferNode> array = new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new FreeDataBufferNode(segment),
			            structs.length
			        );
			    
			        for (int i = 0; i < structs.length; i++) {
			            array.set(i, structs[i]);
			        }
			    
			        return array;
			    }
			    
			    public static NativeStructArray<FreeDataBufferNode> array(MemorySegment array) {
			        return new NativeStructArray<>(
			            array,
			            LAYOUT,
			            segment -> new FreeDataBufferNode(segment)
			        );
			    }
			
			}
		    
			public static class PageDataBufferNode implements Struct<PageDataBufferNode> {
			
				public static final StructLayout LAYOUT;
			
				public static final VarHandle P_RESOURCE_MANAGER_HANDLE;
				public static final VarHandle P_DATA_BUFFER_NODE_HANDLE;
				public static final VarHandle P_DECODER_HANDLE;
				public static final VarHandle P_DONE_NOTIFICATION_HANDLE;
				public static final VarHandle P_DONE_FENCE_HANDLE;
			
				public static final long P_RESOURCE_MANAGER_BYTE_OFFSET;
				public static final long P_DATA_BUFFER_NODE_BYTE_OFFSET;
				public static final long P_DECODER_BYTE_OFFSET;
				public static final long P_DONE_NOTIFICATION_BYTE_OFFSET;
				public static final long P_DONE_FENCE_BYTE_OFFSET;
			
				private final MemorySegment segment;
			
				static {
					//@formatter:off
					LAYOUT = MemoryLayout.structLayout(
					    UNBOUNDED_ADDRESS.withName("pResourceManager"),
					    UNBOUNDED_ADDRESS.withName("pDataBufferNode"),
					    UNBOUNDED_ADDRESS.withName("pDecoder"),
					    UNBOUNDED_ADDRESS.withName("pDoneNotification"),
					    UNBOUNDED_ADDRESS.withName("pDoneFence")
					).withName("PageDataBufferNode").withByteAlignment(8);
					
					P_RESOURCE_MANAGER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pResourceManager"));
					P_DATA_BUFFER_NODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDataBufferNode"));
					P_DECODER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDecoder"));
					P_DONE_NOTIFICATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDoneNotification"));
					P_DONE_FENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDoneFence"));
					
					P_RESOURCE_MANAGER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pResourceManager"));
					P_DATA_BUFFER_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDataBufferNode"));
					P_DECODER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDecoder"));
					P_DONE_NOTIFICATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDoneNotification"));
					P_DONE_FENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDoneFence"));
					//@formatter:on
				}
			
				public PageDataBufferNode() {
				    this(Arena.ofAuto());
				}
				
				public PageDataBufferNode(SegmentAllocator allocator) {
				    this(allocator.allocate(LAYOUT));
				}
				
				public PageDataBufferNode(MemorySegment segment) {
				    this.segment = segment;
				
				}
			
			    /// @see #pResourceManager()
			    public PageDataBufferNode pResourceManager(MemorySegment pResourceManager) {
			    	P_RESOURCE_MANAGER_HANDLE.set(segment, 0L, pResourceManager);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pResourceManager() {
			    	MemorySegment segment = (MemorySegment) P_RESOURCE_MANAGER_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pDataBufferNode()
			    public PageDataBufferNode pDataBufferNode(MemorySegment pDataBufferNode) {
			    	P_DATA_BUFFER_NODE_HANDLE.set(segment, 0L, pDataBufferNode);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pDataBufferNode() {
			    	MemorySegment segment = (MemorySegment) P_DATA_BUFFER_NODE_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pDecoder()
			    public PageDataBufferNode pDecoder(MemorySegment pDecoder) {
			    	P_DECODER_HANDLE.set(segment, 0L, pDecoder);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pDecoder() {
			    	MemorySegment segment = (MemorySegment) P_DECODER_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pDoneNotification()
			    public PageDataBufferNode pDoneNotification(MemorySegment pDoneNotification) {
			    	P_DONE_NOTIFICATION_HANDLE.set(segment, 0L, pDoneNotification);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pDoneNotification() {
			    	MemorySegment segment = (MemorySegment) P_DONE_NOTIFICATION_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pDoneFence()
			    public PageDataBufferNode pDoneFence(MaFence pDoneFence) {
			    	P_DONE_FENCE_HANDLE.set(segment, 0L, pDoneFence.memorySegment());
			    	return this;
			    }
			    
			    public @Nullable MaFence pDoneFence() {
			    	MemorySegment segment = (MemorySegment) P_DONE_FENCE_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return new MaFence(segment);
			    }
			    
			    @Override
			    public PageDataBufferNode set(PageDataBufferNode other) {
			        return set(other.segment);
			    }
			    
			    @Override
			    public PageDataBufferNode set(MemorySegment src) {
			        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
			        return this;
			    }
			    
			    @Override
			    public MemorySegment memorySegment() {
			        return segment;
			    }
			    
			    public NativeStructArray<PageDataBufferNode> asArray() {
			        return new NativeStructArray<>(this);
			    }
			    
			    public static NativeStructArray<PageDataBufferNode> array(SegmentAllocator allocator, int count) {
			        return new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new PageDataBufferNode(segment),
			            count
			        );
			    }
			    
			    public static NativeStructArray<PageDataBufferNode> array(SegmentAllocator allocator, PageDataBufferNode... structs) {
			        NativeStructArray<PageDataBufferNode> array = new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new PageDataBufferNode(segment),
			            structs.length
			        );
			    
			        for (int i = 0; i < structs.length; i++) {
			            array.set(i, structs[i]);
			        }
			    
			        return array;
			    }
			    
			    public static NativeStructArray<PageDataBufferNode> array(MemorySegment array) {
			        return new NativeStructArray<>(
			            array,
			            LAYOUT,
			            segment -> new PageDataBufferNode(segment)
			        );
			    }
			
			}
		    
			public static class LoadDataBuffer implements Struct<LoadDataBuffer> {
			
				public static final StructLayout LAYOUT;
			
				public static final VarHandle P_DATA_BUFFER_HANDLE;
				public static final VarHandle P_INIT_NOTIFICATION_HANDLE;
				public static final VarHandle P_DONE_NOTIFICATION_HANDLE;
				public static final VarHandle P_INIT_FENCE_HANDLE;
				public static final VarHandle P_DONE_FENCE_HANDLE;
				public static final VarHandle RANGE_BEG_IN_PCMFRAMES_HANDLE;
				public static final VarHandle RANGE_END_IN_PCMFRAMES_HANDLE;
				public static final VarHandle LOOP_POINT_BEG_IN_PCMFRAMES_HANDLE;
				public static final VarHandle LOOP_POINT_END_IN_PCMFRAMES_HANDLE;
				public static final VarHandle IS_LOOPING_HANDLE;
			
				public static final long P_DATA_BUFFER_BYTE_OFFSET;
				public static final long P_INIT_NOTIFICATION_BYTE_OFFSET;
				public static final long P_DONE_NOTIFICATION_BYTE_OFFSET;
				public static final long P_INIT_FENCE_BYTE_OFFSET;
				public static final long P_DONE_FENCE_BYTE_OFFSET;
				public static final long RANGE_BEG_IN_PCMFRAMES_BYTE_OFFSET;
				public static final long RANGE_END_IN_PCMFRAMES_BYTE_OFFSET;
				public static final long LOOP_POINT_BEG_IN_PCMFRAMES_BYTE_OFFSET;
				public static final long LOOP_POINT_END_IN_PCMFRAMES_BYTE_OFFSET;
				public static final long IS_LOOPING_BYTE_OFFSET;
			
				private final MemorySegment segment;
			
				static {
					//@formatter:off
					LAYOUT = MemoryLayout.structLayout(
					    UNBOUNDED_ADDRESS.withName("pDataBuffer"),
					    UNBOUNDED_ADDRESS.withName("pInitNotification"),
					    UNBOUNDED_ADDRESS.withName("pDoneNotification"),
					    UNBOUNDED_ADDRESS.withName("pInitFence"),
					    UNBOUNDED_ADDRESS.withName("pDoneFence"),
					    JAVA_LONG.withName("rangeBegInPCMFrames"),
					    JAVA_LONG.withName("rangeEndInPCMFrames"),
					    JAVA_LONG.withName("loopPointBegInPCMFrames"),
					    JAVA_LONG.withName("loopPointEndInPCMFrames"),
					    JAVA_INT.withName("isLooping"),
					    MemoryLayout.paddingLayout(4)
					).withName("LoadDataBuffer").withByteAlignment(8);
					
					P_DATA_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDataBuffer"));
					P_INIT_NOTIFICATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pInitNotification"));
					P_DONE_NOTIFICATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDoneNotification"));
					P_INIT_FENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pInitFence"));
					P_DONE_FENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDoneFence"));
					RANGE_BEG_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rangeBegInPCMFrames"));
					RANGE_END_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rangeEndInPCMFrames"));
					LOOP_POINT_BEG_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("loopPointBegInPCMFrames"));
					LOOP_POINT_END_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("loopPointEndInPCMFrames"));
					IS_LOOPING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isLooping"));
					
					P_DATA_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDataBuffer"));
					P_INIT_NOTIFICATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pInitNotification"));
					P_DONE_NOTIFICATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDoneNotification"));
					P_INIT_FENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pInitFence"));
					P_DONE_FENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDoneFence"));
					RANGE_BEG_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rangeBegInPCMFrames"));
					RANGE_END_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rangeEndInPCMFrames"));
					LOOP_POINT_BEG_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loopPointBegInPCMFrames"));
					LOOP_POINT_END_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loopPointEndInPCMFrames"));
					IS_LOOPING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isLooping"));
					//@formatter:on
				}
			
				public LoadDataBuffer() {
				    this(Arena.ofAuto());
				}
				
				public LoadDataBuffer(SegmentAllocator allocator) {
				    this(allocator.allocate(LAYOUT));
				}
				
				public LoadDataBuffer(MemorySegment segment) {
				    this.segment = segment;
				
				}
			
			    /// @see #pDataBuffer()
			    public LoadDataBuffer pDataBuffer(MemorySegment pDataBuffer) {
			    	P_DATA_BUFFER_HANDLE.set(segment, 0L, pDataBuffer);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pDataBuffer() {
			    	MemorySegment segment = (MemorySegment) P_DATA_BUFFER_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pInitNotification()
			    public LoadDataBuffer pInitNotification(MemorySegment pInitNotification) {
			    	P_INIT_NOTIFICATION_HANDLE.set(segment, 0L, pInitNotification);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pInitNotification() {
			    	MemorySegment segment = (MemorySegment) P_INIT_NOTIFICATION_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pDoneNotification()
			    public LoadDataBuffer pDoneNotification(MemorySegment pDoneNotification) {
			    	P_DONE_NOTIFICATION_HANDLE.set(segment, 0L, pDoneNotification);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pDoneNotification() {
			    	MemorySegment segment = (MemorySegment) P_DONE_NOTIFICATION_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pInitFence()
			    public LoadDataBuffer pInitFence(MaFence pInitFence) {
			    	P_INIT_FENCE_HANDLE.set(segment, 0L, pInitFence.memorySegment());
			    	return this;
			    }
			    
			    public @Nullable MaFence pInitFence() {
			    	MemorySegment segment = (MemorySegment) P_INIT_FENCE_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return new MaFence(segment);
			    }
			    
			    /// @see #pDoneFence()
			    public LoadDataBuffer pDoneFence(MaFence pDoneFence) {
			    	P_DONE_FENCE_HANDLE.set(segment, 0L, pDoneFence.memorySegment());
			    	return this;
			    }
			    
			    public @Nullable MaFence pDoneFence() {
			    	MemorySegment segment = (MemorySegment) P_DONE_FENCE_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return new MaFence(segment);
			    }
			    
			    /// @see #rangeBegInPCMFrames()
			    public LoadDataBuffer rangeBegInPCMFrames(long rangeBegInPCMFrames) {
			    	RANGE_BEG_IN_PCMFRAMES_HANDLE.set(segment, 0L, rangeBegInPCMFrames);
			    	return this;
			    }
			    
			    public long rangeBegInPCMFrames() {
			    	return (long) RANGE_BEG_IN_PCMFRAMES_HANDLE.get(segment, 0L);
			    }
			    
			    /// @see #rangeEndInPCMFrames()
			    public LoadDataBuffer rangeEndInPCMFrames(long rangeEndInPCMFrames) {
			    	RANGE_END_IN_PCMFRAMES_HANDLE.set(segment, 0L, rangeEndInPCMFrames);
			    	return this;
			    }
			    
			    public long rangeEndInPCMFrames() {
			    	return (long) RANGE_END_IN_PCMFRAMES_HANDLE.get(segment, 0L);
			    }
			    
			    /// @see #loopPointBegInPCMFrames()
			    public LoadDataBuffer loopPointBegInPCMFrames(long loopPointBegInPCMFrames) {
			    	LOOP_POINT_BEG_IN_PCMFRAMES_HANDLE.set(segment, 0L, loopPointBegInPCMFrames);
			    	return this;
			    }
			    
			    public long loopPointBegInPCMFrames() {
			    	return (long) LOOP_POINT_BEG_IN_PCMFRAMES_HANDLE.get(segment, 0L);
			    }
			    
			    /// @see #loopPointEndInPCMFrames()
			    public LoadDataBuffer loopPointEndInPCMFrames(long loopPointEndInPCMFrames) {
			    	LOOP_POINT_END_IN_PCMFRAMES_HANDLE.set(segment, 0L, loopPointEndInPCMFrames);
			    	return this;
			    }
			    
			    public long loopPointEndInPCMFrames() {
			    	return (long) LOOP_POINT_END_IN_PCMFRAMES_HANDLE.get(segment, 0L);
			    }
			    
			    /// @see #isLooping()
			    public LoadDataBuffer isLooping(int isLooping) {
			    	IS_LOOPING_HANDLE.set(segment, 0L, isLooping);
			    	return this;
			    }
			    
			    public int isLooping() {
			    	return (int) IS_LOOPING_HANDLE.get(segment, 0L);
			    }
			    
			    @Override
			    public LoadDataBuffer set(LoadDataBuffer other) {
			        return set(other.segment);
			    }
			    
			    @Override
			    public LoadDataBuffer set(MemorySegment src) {
			        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
			        return this;
			    }
			    
			    @Override
			    public MemorySegment memorySegment() {
			        return segment;
			    }
			    
			    public NativeStructArray<LoadDataBuffer> asArray() {
			        return new NativeStructArray<>(this);
			    }
			    
			    public static NativeStructArray<LoadDataBuffer> array(SegmentAllocator allocator, int count) {
			        return new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new LoadDataBuffer(segment),
			            count
			        );
			    }
			    
			    public static NativeStructArray<LoadDataBuffer> array(SegmentAllocator allocator, LoadDataBuffer... structs) {
			        NativeStructArray<LoadDataBuffer> array = new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new LoadDataBuffer(segment),
			            structs.length
			        );
			    
			        for (int i = 0; i < structs.length; i++) {
			            array.set(i, structs[i]);
			        }
			    
			        return array;
			    }
			    
			    public static NativeStructArray<LoadDataBuffer> array(MemorySegment array) {
			        return new NativeStructArray<>(
			            array,
			            LAYOUT,
			            segment -> new LoadDataBuffer(segment)
			        );
			    }
			
			}
		    
			public static class FreeDataBuffer implements Struct<FreeDataBuffer> {
			
				public static final StructLayout LAYOUT;
			
				public static final VarHandle P_DATA_BUFFER_HANDLE;
				public static final VarHandle P_DONE_NOTIFICATION_HANDLE;
				public static final VarHandle P_DONE_FENCE_HANDLE;
			
				public static final long P_DATA_BUFFER_BYTE_OFFSET;
				public static final long P_DONE_NOTIFICATION_BYTE_OFFSET;
				public static final long P_DONE_FENCE_BYTE_OFFSET;
			
				private final MemorySegment segment;
			
				static {
					//@formatter:off
					LAYOUT = MemoryLayout.structLayout(
					    UNBOUNDED_ADDRESS.withName("pDataBuffer"),
					    UNBOUNDED_ADDRESS.withName("pDoneNotification"),
					    UNBOUNDED_ADDRESS.withName("pDoneFence")
					).withName("FreeDataBuffer").withByteAlignment(8);
					
					P_DATA_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDataBuffer"));
					P_DONE_NOTIFICATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDoneNotification"));
					P_DONE_FENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDoneFence"));
					
					P_DATA_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDataBuffer"));
					P_DONE_NOTIFICATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDoneNotification"));
					P_DONE_FENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDoneFence"));
					//@formatter:on
				}
			
				public FreeDataBuffer() {
				    this(Arena.ofAuto());
				}
				
				public FreeDataBuffer(SegmentAllocator allocator) {
				    this(allocator.allocate(LAYOUT));
				}
				
				public FreeDataBuffer(MemorySegment segment) {
				    this.segment = segment;
				
				}
			
			    /// @see #pDataBuffer()
			    public FreeDataBuffer pDataBuffer(MemorySegment pDataBuffer) {
			    	P_DATA_BUFFER_HANDLE.set(segment, 0L, pDataBuffer);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pDataBuffer() {
			    	MemorySegment segment = (MemorySegment) P_DATA_BUFFER_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pDoneNotification()
			    public FreeDataBuffer pDoneNotification(MemorySegment pDoneNotification) {
			    	P_DONE_NOTIFICATION_HANDLE.set(segment, 0L, pDoneNotification);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pDoneNotification() {
			    	MemorySegment segment = (MemorySegment) P_DONE_NOTIFICATION_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pDoneFence()
			    public FreeDataBuffer pDoneFence(MaFence pDoneFence) {
			    	P_DONE_FENCE_HANDLE.set(segment, 0L, pDoneFence.memorySegment());
			    	return this;
			    }
			    
			    public @Nullable MaFence pDoneFence() {
			    	MemorySegment segment = (MemorySegment) P_DONE_FENCE_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return new MaFence(segment);
			    }
			    
			    @Override
			    public FreeDataBuffer set(FreeDataBuffer other) {
			        return set(other.segment);
			    }
			    
			    @Override
			    public FreeDataBuffer set(MemorySegment src) {
			        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
			        return this;
			    }
			    
			    @Override
			    public MemorySegment memorySegment() {
			        return segment;
			    }
			    
			    public NativeStructArray<FreeDataBuffer> asArray() {
			        return new NativeStructArray<>(this);
			    }
			    
			    public static NativeStructArray<FreeDataBuffer> array(SegmentAllocator allocator, int count) {
			        return new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new FreeDataBuffer(segment),
			            count
			        );
			    }
			    
			    public static NativeStructArray<FreeDataBuffer> array(SegmentAllocator allocator, FreeDataBuffer... structs) {
			        NativeStructArray<FreeDataBuffer> array = new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new FreeDataBuffer(segment),
			            structs.length
			        );
			    
			        for (int i = 0; i < structs.length; i++) {
			            array.set(i, structs[i]);
			        }
			    
			        return array;
			    }
			    
			    public static NativeStructArray<FreeDataBuffer> array(MemorySegment array) {
			        return new NativeStructArray<>(
			            array,
			            LAYOUT,
			            segment -> new FreeDataBuffer(segment)
			        );
			    }
			
			}
		    
			public static class LoadDataStream implements Struct<LoadDataStream> {
			
				public static final StructLayout LAYOUT;
			
				public static final VarHandle P_DATA_STREAM_HANDLE;
				public static final VarHandle P_FILE_PATH_HANDLE;
				public static final VarHandle P_FILE_PATH_W_HANDLE;
				public static final VarHandle INITIAL_SEEK_POINT_HANDLE;
				public static final VarHandle P_INIT_NOTIFICATION_HANDLE;
				public static final VarHandle P_INIT_FENCE_HANDLE;
			
				public static final long P_DATA_STREAM_BYTE_OFFSET;
				public static final long P_FILE_PATH_BYTE_OFFSET;
				public static final long P_FILE_PATH_W_BYTE_OFFSET;
				public static final long INITIAL_SEEK_POINT_BYTE_OFFSET;
				public static final long P_INIT_NOTIFICATION_BYTE_OFFSET;
				public static final long P_INIT_FENCE_BYTE_OFFSET;
			
				private final MemorySegment segment;
			
				static {
					//@formatter:off
					LAYOUT = MemoryLayout.structLayout(
					    UNBOUNDED_ADDRESS.withName("pDataStream"),
					    UNBOUNDED_ADDRESS.withName("pFilePath"),
					    UNBOUNDED_ADDRESS.withName("pFilePathW"),
					    JAVA_LONG.withName("initialSeekPoint"),
					    UNBOUNDED_ADDRESS.withName("pInitNotification"),
					    UNBOUNDED_ADDRESS.withName("pInitFence")
					).withName("LoadDataStream").withByteAlignment(8);
					
					P_DATA_STREAM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDataStream"));
					P_FILE_PATH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pFilePath"));
					P_FILE_PATH_W_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pFilePathW"));
					INITIAL_SEEK_POINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("initialSeekPoint"));
					P_INIT_NOTIFICATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pInitNotification"));
					P_INIT_FENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pInitFence"));
					
					P_DATA_STREAM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDataStream"));
					P_FILE_PATH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pFilePath"));
					P_FILE_PATH_W_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pFilePathW"));
					INITIAL_SEEK_POINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("initialSeekPoint"));
					P_INIT_NOTIFICATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pInitNotification"));
					P_INIT_FENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pInitFence"));
					//@formatter:on
				}
			
				public LoadDataStream() {
				    this(Arena.ofAuto());
				}
				
				public LoadDataStream(SegmentAllocator allocator) {
				    this(allocator.allocate(LAYOUT));
				}
				
				public LoadDataStream(MemorySegment segment) {
				    this.segment = segment;
				
				}
			
			    /// @see #pDataStream()
			    public LoadDataStream pDataStream(MemorySegment pDataStream) {
			    	P_DATA_STREAM_HANDLE.set(segment, 0L, pDataStream);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pDataStream() {
			    	MemorySegment segment = (MemorySegment) P_DATA_STREAM_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pFilePath()
			    public LoadDataStream pFilePath(NativeByteArray pFilePath) {
			    	P_FILE_PATH_HANDLE.set(segment, 0L, pFilePath.memorySegment());
			    	return this;
			    }
			    
			    public @Nullable NativeByteArray pFilePath() {
			    	MemorySegment segment = (MemorySegment) P_FILE_PATH_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return new NativeByteArray(segment);
			    }
			    
			    /// @see #pFilePathW()
			    public LoadDataStream pFilePathW(NativeShortArray pFilePathW) {
			    	P_FILE_PATH_W_HANDLE.set(segment, 0L, pFilePathW.memorySegment());
			    	return this;
			    }
			    
			    public @Nullable NativeShortArray pFilePathW() {
			    	MemorySegment segment = (MemorySegment) P_FILE_PATH_W_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return new NativeShortArray(segment);
			    }
			    
			    /// @see #initialSeekPoint()
			    public LoadDataStream initialSeekPoint(long initialSeekPoint) {
			    	INITIAL_SEEK_POINT_HANDLE.set(segment, 0L, initialSeekPoint);
			    	return this;
			    }
			    
			    public long initialSeekPoint() {
			    	return (long) INITIAL_SEEK_POINT_HANDLE.get(segment, 0L);
			    }
			    
			    /// @see #pInitNotification()
			    public LoadDataStream pInitNotification(MemorySegment pInitNotification) {
			    	P_INIT_NOTIFICATION_HANDLE.set(segment, 0L, pInitNotification);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pInitNotification() {
			    	MemorySegment segment = (MemorySegment) P_INIT_NOTIFICATION_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pInitFence()
			    public LoadDataStream pInitFence(MaFence pInitFence) {
			    	P_INIT_FENCE_HANDLE.set(segment, 0L, pInitFence.memorySegment());
			    	return this;
			    }
			    
			    public @Nullable MaFence pInitFence() {
			    	MemorySegment segment = (MemorySegment) P_INIT_FENCE_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return new MaFence(segment);
			    }
			    
			    @Override
			    public LoadDataStream set(LoadDataStream other) {
			        return set(other.segment);
			    }
			    
			    @Override
			    public LoadDataStream set(MemorySegment src) {
			        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
			        return this;
			    }
			    
			    @Override
			    public MemorySegment memorySegment() {
			        return segment;
			    }
			    
			    public NativeStructArray<LoadDataStream> asArray() {
			        return new NativeStructArray<>(this);
			    }
			    
			    public static NativeStructArray<LoadDataStream> array(SegmentAllocator allocator, int count) {
			        return new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new LoadDataStream(segment),
			            count
			        );
			    }
			    
			    public static NativeStructArray<LoadDataStream> array(SegmentAllocator allocator, LoadDataStream... structs) {
			        NativeStructArray<LoadDataStream> array = new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new LoadDataStream(segment),
			            structs.length
			        );
			    
			        for (int i = 0; i < structs.length; i++) {
			            array.set(i, structs[i]);
			        }
			    
			        return array;
			    }
			    
			    public static NativeStructArray<LoadDataStream> array(MemorySegment array) {
			        return new NativeStructArray<>(
			            array,
			            LAYOUT,
			            segment -> new LoadDataStream(segment)
			        );
			    }
			
			}
		    
			public static class FreeDataStream implements Struct<FreeDataStream> {
			
				public static final StructLayout LAYOUT;
			
				public static final VarHandle P_DATA_STREAM_HANDLE;
				public static final VarHandle P_DONE_NOTIFICATION_HANDLE;
				public static final VarHandle P_DONE_FENCE_HANDLE;
			
				public static final long P_DATA_STREAM_BYTE_OFFSET;
				public static final long P_DONE_NOTIFICATION_BYTE_OFFSET;
				public static final long P_DONE_FENCE_BYTE_OFFSET;
			
				private final MemorySegment segment;
			
				static {
					//@formatter:off
					LAYOUT = MemoryLayout.structLayout(
					    UNBOUNDED_ADDRESS.withName("pDataStream"),
					    UNBOUNDED_ADDRESS.withName("pDoneNotification"),
					    UNBOUNDED_ADDRESS.withName("pDoneFence")
					).withName("FreeDataStream").withByteAlignment(8);
					
					P_DATA_STREAM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDataStream"));
					P_DONE_NOTIFICATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDoneNotification"));
					P_DONE_FENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDoneFence"));
					
					P_DATA_STREAM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDataStream"));
					P_DONE_NOTIFICATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDoneNotification"));
					P_DONE_FENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDoneFence"));
					//@formatter:on
				}
			
				public FreeDataStream() {
				    this(Arena.ofAuto());
				}
				
				public FreeDataStream(SegmentAllocator allocator) {
				    this(allocator.allocate(LAYOUT));
				}
				
				public FreeDataStream(MemorySegment segment) {
				    this.segment = segment;
				
				}
			
			    /// @see #pDataStream()
			    public FreeDataStream pDataStream(MemorySegment pDataStream) {
			    	P_DATA_STREAM_HANDLE.set(segment, 0L, pDataStream);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pDataStream() {
			    	MemorySegment segment = (MemorySegment) P_DATA_STREAM_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pDoneNotification()
			    public FreeDataStream pDoneNotification(MemorySegment pDoneNotification) {
			    	P_DONE_NOTIFICATION_HANDLE.set(segment, 0L, pDoneNotification);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pDoneNotification() {
			    	MemorySegment segment = (MemorySegment) P_DONE_NOTIFICATION_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pDoneFence()
			    public FreeDataStream pDoneFence(MaFence pDoneFence) {
			    	P_DONE_FENCE_HANDLE.set(segment, 0L, pDoneFence.memorySegment());
			    	return this;
			    }
			    
			    public @Nullable MaFence pDoneFence() {
			    	MemorySegment segment = (MemorySegment) P_DONE_FENCE_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return new MaFence(segment);
			    }
			    
			    @Override
			    public FreeDataStream set(FreeDataStream other) {
			        return set(other.segment);
			    }
			    
			    @Override
			    public FreeDataStream set(MemorySegment src) {
			        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
			        return this;
			    }
			    
			    @Override
			    public MemorySegment memorySegment() {
			        return segment;
			    }
			    
			    public NativeStructArray<FreeDataStream> asArray() {
			        return new NativeStructArray<>(this);
			    }
			    
			    public static NativeStructArray<FreeDataStream> array(SegmentAllocator allocator, int count) {
			        return new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new FreeDataStream(segment),
			            count
			        );
			    }
			    
			    public static NativeStructArray<FreeDataStream> array(SegmentAllocator allocator, FreeDataStream... structs) {
			        NativeStructArray<FreeDataStream> array = new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new FreeDataStream(segment),
			            structs.length
			        );
			    
			        for (int i = 0; i < structs.length; i++) {
			            array.set(i, structs[i]);
			        }
			    
			        return array;
			    }
			    
			    public static NativeStructArray<FreeDataStream> array(MemorySegment array) {
			        return new NativeStructArray<>(
			            array,
			            LAYOUT,
			            segment -> new FreeDataStream(segment)
			        );
			    }
			
			}
		    
			public static class PageDataStream implements Struct<PageDataStream> {
			
				public static final StructLayout LAYOUT;
			
				public static final VarHandle P_DATA_STREAM_HANDLE;
				public static final VarHandle PAGE_INDEX_HANDLE;
			
				public static final long P_DATA_STREAM_BYTE_OFFSET;
				public static final long PAGE_INDEX_BYTE_OFFSET;
			
				private final MemorySegment segment;
			
				static {
					//@formatter:off
					LAYOUT = MemoryLayout.structLayout(
					    UNBOUNDED_ADDRESS.withName("pDataStream"),
					    JAVA_INT.withName("pageIndex"),
					    MemoryLayout.paddingLayout(4)
					).withName("PageDataStream").withByteAlignment(8);
					
					P_DATA_STREAM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDataStream"));
					PAGE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pageIndex"));
					
					P_DATA_STREAM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDataStream"));
					PAGE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pageIndex"));
					//@formatter:on
				}
			
				public PageDataStream() {
				    this(Arena.ofAuto());
				}
				
				public PageDataStream(SegmentAllocator allocator) {
				    this(allocator.allocate(LAYOUT));
				}
				
				public PageDataStream(MemorySegment segment) {
				    this.segment = segment;
				
				}
			
			    /// @see #pDataStream()
			    public PageDataStream pDataStream(MemorySegment pDataStream) {
			    	P_DATA_STREAM_HANDLE.set(segment, 0L, pDataStream);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pDataStream() {
			    	MemorySegment segment = (MemorySegment) P_DATA_STREAM_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #pageIndex()
			    public PageDataStream pageIndex(int pageIndex) {
			    	PAGE_INDEX_HANDLE.set(segment, 0L, pageIndex);
			    	return this;
			    }
			    
			    public int pageIndex() {
			    	return (int) PAGE_INDEX_HANDLE.get(segment, 0L);
			    }
			    
			    @Override
			    public PageDataStream set(PageDataStream other) {
			        return set(other.segment);
			    }
			    
			    @Override
			    public PageDataStream set(MemorySegment src) {
			        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
			        return this;
			    }
			    
			    @Override
			    public MemorySegment memorySegment() {
			        return segment;
			    }
			    
			    public NativeStructArray<PageDataStream> asArray() {
			        return new NativeStructArray<>(this);
			    }
			    
			    public static NativeStructArray<PageDataStream> array(SegmentAllocator allocator, int count) {
			        return new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new PageDataStream(segment),
			            count
			        );
			    }
			    
			    public static NativeStructArray<PageDataStream> array(SegmentAllocator allocator, PageDataStream... structs) {
			        NativeStructArray<PageDataStream> array = new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new PageDataStream(segment),
			            structs.length
			        );
			    
			        for (int i = 0; i < structs.length; i++) {
			            array.set(i, structs[i]);
			        }
			    
			        return array;
			    }
			    
			    public static NativeStructArray<PageDataStream> array(MemorySegment array) {
			        return new NativeStructArray<>(
			            array,
			            LAYOUT,
			            segment -> new PageDataStream(segment)
			        );
			    }
			
			}
		    
			public static class SeekDataStream implements Struct<SeekDataStream> {
			
				public static final StructLayout LAYOUT;
			
				public static final VarHandle P_DATA_STREAM_HANDLE;
				public static final VarHandle FRAME_INDEX_HANDLE;
			
				public static final long P_DATA_STREAM_BYTE_OFFSET;
				public static final long FRAME_INDEX_BYTE_OFFSET;
			
				private final MemorySegment segment;
			
				static {
					//@formatter:off
					LAYOUT = MemoryLayout.structLayout(
					    UNBOUNDED_ADDRESS.withName("pDataStream"),
					    JAVA_LONG.withName("frameIndex")
					).withName("SeekDataStream").withByteAlignment(8);
					
					P_DATA_STREAM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDataStream"));
					FRAME_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frameIndex"));
					
					P_DATA_STREAM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDataStream"));
					FRAME_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frameIndex"));
					//@formatter:on
				}
			
				public SeekDataStream() {
				    this(Arena.ofAuto());
				}
				
				public SeekDataStream(SegmentAllocator allocator) {
				    this(allocator.allocate(LAYOUT));
				}
				
				public SeekDataStream(MemorySegment segment) {
				    this.segment = segment;
				
				}
			
			    /// @see #pDataStream()
			    public SeekDataStream pDataStream(MemorySegment pDataStream) {
			    	P_DATA_STREAM_HANDLE.set(segment, 0L, pDataStream);
			    	return this;
			    }
			    
			    public @Nullable MemorySegment pDataStream() {
			    	MemorySegment segment = (MemorySegment) P_DATA_STREAM_HANDLE.get(this.segment, 0L);
			    
			    	if (segment.equals(MemorySegment.NULL))
			    		return null;
			    	
			    	return segment;
			    }
			    
			    /// @see #frameIndex()
			    public SeekDataStream frameIndex(long frameIndex) {
			    	FRAME_INDEX_HANDLE.set(segment, 0L, frameIndex);
			    	return this;
			    }
			    
			    public long frameIndex() {
			    	return (long) FRAME_INDEX_HANDLE.get(segment, 0L);
			    }
			    
			    @Override
			    public SeekDataStream set(SeekDataStream other) {
			        return set(other.segment);
			    }
			    
			    @Override
			    public SeekDataStream set(MemorySegment src) {
			        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
			        return this;
			    }
			    
			    @Override
			    public MemorySegment memorySegment() {
			        return segment;
			    }
			    
			    public NativeStructArray<SeekDataStream> asArray() {
			        return new NativeStructArray<>(this);
			    }
			    
			    public static NativeStructArray<SeekDataStream> array(SegmentAllocator allocator, int count) {
			        return new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new SeekDataStream(segment),
			            count
			        );
			    }
			    
			    public static NativeStructArray<SeekDataStream> array(SegmentAllocator allocator, SeekDataStream... structs) {
			        NativeStructArray<SeekDataStream> array = new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new SeekDataStream(segment),
			            structs.length
			        );
			    
			        for (int i = 0; i < structs.length; i++) {
			            array.set(i, structs[i]);
			        }
			    
			        return array;
			    }
			    
			    public static NativeStructArray<SeekDataStream> array(MemorySegment array) {
			        return new NativeStructArray<>(
			            array,
			            LAYOUT,
			            segment -> new SeekDataStream(segment)
			        );
			    }
			
			}
		}
	    
		public static class Device implements Struct<Device> {
		
			public static final UnionLayout LAYOUT;
		
			public static final long AAUDIO_BYTE_OFFSET;
		
			private final MemorySegment segment;
		
			private final Aaudio aaudio;
		
			static {
				//@formatter:off
				LAYOUT = MemoryLayout.unionLayout(
				    Aaudio.LAYOUT.withName("aaudio")
				).withName("Device").withByteAlignment(8);
				
				AAUDIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aaudio"));
				//@formatter:on
			}
		
			public Device() {
			    this(Arena.ofAuto());
			}
			
			public Device(SegmentAllocator allocator) {
			    this(allocator.allocate(LAYOUT));
			}
			
			public Device(MemorySegment segment) {
			    this.segment = segment;
			
			    aaudio = new Aaudio(segment.asSlice(AAUDIO_BYTE_OFFSET, Aaudio.LAYOUT));
			}
		
		    /// @see #aaudio()
		    public Device aaudio(Consumer<Aaudio> consumer) {
		    	consumer.accept(aaudio);
		    	return this;
		    }
		    
		    /// @see #aaudio()
		    public Device aaudio(Aaudio other) {
		    	aaudio.set(other);
		    	return this;
		    }
		    
		    public Aaudio aaudio() {
		    	return aaudio;
		    }
		    
		    @Override
		    public Device set(Device other) {
		        return set(other.segment);
		    }
		    
		    @Override
		    public Device set(MemorySegment src) {
		        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
		        return this;
		    }
		    
		    @Override
		    public MemorySegment memorySegment() {
		        return segment;
		    }
		    
		    public NativeStructArray<Device> asArray() {
		        return new NativeStructArray<>(this);
		    }
		    
		    public static NativeStructArray<Device> array(SegmentAllocator allocator, int count) {
		        return new NativeStructArray<>(
		            allocator,
		            LAYOUT,
		            segment -> new Device(segment),
		            count
		        );
		    }
		    
		    public static NativeStructArray<Device> array(SegmentAllocator allocator, Device... structs) {
		        NativeStructArray<Device> array = new NativeStructArray<>(
		            allocator,
		            LAYOUT,
		            segment -> new Device(segment),
		            structs.length
		        );
		    
		        for (int i = 0; i < structs.length; i++) {
		            array.set(i, structs[i]);
		        }
		    
		        return array;
		    }
		    
		    public static NativeStructArray<Device> array(MemorySegment array) {
		        return new NativeStructArray<>(
		            array,
		            LAYOUT,
		            segment -> new Device(segment)
		        );
		    }
		
			public static class Aaudio implements Struct<Aaudio> {
			
				public static final UnionLayout LAYOUT;
			
				public static final long REROUTE_BYTE_OFFSET;
			
				private final MemorySegment segment;
			
				private final Reroute reroute;
			
				static {
					//@formatter:off
					LAYOUT = MemoryLayout.unionLayout(
					    Reroute.LAYOUT.withName("reroute")
					).withName("Aaudio").withByteAlignment(8);
					
					REROUTE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reroute"));
					//@formatter:on
				}
			
				public Aaudio() {
				    this(Arena.ofAuto());
				}
				
				public Aaudio(SegmentAllocator allocator) {
				    this(allocator.allocate(LAYOUT));
				}
				
				public Aaudio(MemorySegment segment) {
				    this.segment = segment;
				
				    reroute = new Reroute(segment.asSlice(REROUTE_BYTE_OFFSET, Reroute.LAYOUT));
				}
			
			    /// @see #reroute()
			    public Aaudio reroute(Consumer<Reroute> consumer) {
			    	consumer.accept(reroute);
			    	return this;
			    }
			    
			    /// @see #reroute()
			    public Aaudio reroute(Reroute other) {
			    	reroute.set(other);
			    	return this;
			    }
			    
			    public Reroute reroute() {
			    	return reroute;
			    }
			    
			    @Override
			    public Aaudio set(Aaudio other) {
			        return set(other.segment);
			    }
			    
			    @Override
			    public Aaudio set(MemorySegment src) {
			        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
			        return this;
			    }
			    
			    @Override
			    public MemorySegment memorySegment() {
			        return segment;
			    }
			    
			    public NativeStructArray<Aaudio> asArray() {
			        return new NativeStructArray<>(this);
			    }
			    
			    public static NativeStructArray<Aaudio> array(SegmentAllocator allocator, int count) {
			        return new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new Aaudio(segment),
			            count
			        );
			    }
			    
			    public static NativeStructArray<Aaudio> array(SegmentAllocator allocator, Aaudio... structs) {
			        NativeStructArray<Aaudio> array = new NativeStructArray<>(
			            allocator,
			            LAYOUT,
			            segment -> new Aaudio(segment),
			            structs.length
			        );
			    
			        for (int i = 0; i < structs.length; i++) {
			            array.set(i, structs[i]);
			        }
			    
			        return array;
			    }
			    
			    public static NativeStructArray<Aaudio> array(MemorySegment array) {
			        return new NativeStructArray<>(
			            array,
			            LAYOUT,
			            segment -> new Aaudio(segment)
			        );
			    }
			
				public static class Reroute implements Struct<Reroute> {
				
					public static final StructLayout LAYOUT;
				
					public static final VarHandle P_DEVICE_HANDLE;
					public static final VarHandle DEVICE_TYPE_HANDLE;
				
					public static final long P_DEVICE_BYTE_OFFSET;
					public static final long DEVICE_TYPE_BYTE_OFFSET;
				
					private final MemorySegment segment;
				
					static {
						//@formatter:off
						LAYOUT = MemoryLayout.structLayout(
						    UNBOUNDED_ADDRESS.withName("pDevice"),
						    JAVA_INT.withName("deviceType"),
						    MemoryLayout.paddingLayout(4)
						).withName("Reroute").withByteAlignment(8);
						
						P_DEVICE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDevice"));
						DEVICE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceType"));
						
						P_DEVICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDevice"));
						DEVICE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceType"));
						//@formatter:on
					}
				
					public Reroute() {
					    this(Arena.ofAuto());
					}
					
					public Reroute(SegmentAllocator allocator) {
					    this(allocator.allocate(LAYOUT));
					}
					
					public Reroute(MemorySegment segment) {
					    this.segment = segment;
					
					}
				
				    /// @see #pDevice()
				    public Reroute pDevice(MemorySegment pDevice) {
				    	P_DEVICE_HANDLE.set(segment, 0L, pDevice);
				    	return this;
				    }
				    
				    public @Nullable MemorySegment pDevice() {
				    	MemorySegment segment = (MemorySegment) P_DEVICE_HANDLE.get(this.segment, 0L);
				    
				    	if (segment.equals(MemorySegment.NULL))
				    		return null;
				    	
				    	return segment;
				    }
				    
				    /// @see #deviceType()
				    public Reroute deviceType(int deviceType) {
				    	DEVICE_TYPE_HANDLE.set(segment, 0L, deviceType);
				    	return this;
				    }
				    
				    public int deviceType() {
				    	return (int) DEVICE_TYPE_HANDLE.get(segment, 0L);
				    }
				    
				    @Override
				    public Reroute set(Reroute other) {
				        return set(other.segment);
				    }
				    
				    @Override
				    public Reroute set(MemorySegment src) {
				        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
				        return this;
				    }
				    
				    @Override
				    public MemorySegment memorySegment() {
				        return segment;
				    }
				    
				    public NativeStructArray<Reroute> asArray() {
				        return new NativeStructArray<>(this);
				    }
				    
				    public static NativeStructArray<Reroute> array(SegmentAllocator allocator, int count) {
				        return new NativeStructArray<>(
				            allocator,
				            LAYOUT,
				            segment -> new Reroute(segment),
				            count
				        );
				    }
				    
				    public static NativeStructArray<Reroute> array(SegmentAllocator allocator, Reroute... structs) {
				        NativeStructArray<Reroute> array = new NativeStructArray<>(
				            allocator,
				            LAYOUT,
				            segment -> new Reroute(segment),
				            structs.length
				        );
				    
				        for (int i = 0; i < structs.length; i++) {
				            array.set(i, structs[i]);
				        }
				    
				        return array;
				    }
				    
				    public static NativeStructArray<Reroute> array(MemorySegment array) {
				        return new NativeStructArray<>(
				            array,
				            LAYOUT,
				            segment -> new Reroute(segment)
				        );
				    }
				
				}
			}
		}
	}
}