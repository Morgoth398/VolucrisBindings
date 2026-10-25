/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkSRTDataNV
		implements Struct<VkSRTDataNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SX_HANDLE;
	public static final VarHandle A_HANDLE;
	public static final VarHandle B_HANDLE;
	public static final VarHandle PVX_HANDLE;
	public static final VarHandle SY_HANDLE;
	public static final VarHandle C_HANDLE;
	public static final VarHandle PVY_HANDLE;
	public static final VarHandle SZ_HANDLE;
	public static final VarHandle PVZ_HANDLE;
	public static final VarHandle QX_HANDLE;
	public static final VarHandle QY_HANDLE;
	public static final VarHandle QZ_HANDLE;
	public static final VarHandle QW_HANDLE;
	public static final VarHandle TX_HANDLE;
	public static final VarHandle TY_HANDLE;
	public static final VarHandle TZ_HANDLE;

	public static final long SX_BYTE_OFFSET;
	public static final long A_BYTE_OFFSET;
	public static final long B_BYTE_OFFSET;
	public static final long PVX_BYTE_OFFSET;
	public static final long SY_BYTE_OFFSET;
	public static final long C_BYTE_OFFSET;
	public static final long PVY_BYTE_OFFSET;
	public static final long SZ_BYTE_OFFSET;
	public static final long PVZ_BYTE_OFFSET;
	public static final long QX_BYTE_OFFSET;
	public static final long QY_BYTE_OFFSET;
	public static final long QZ_BYTE_OFFSET;
	public static final long QW_BYTE_OFFSET;
	public static final long TX_BYTE_OFFSET;
	public static final long TY_BYTE_OFFSET;
	public static final long TZ_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_FLOAT.withName("sx"),
		    JAVA_FLOAT.withName("a"),
		    JAVA_FLOAT.withName("b"),
		    JAVA_FLOAT.withName("pvx"),
		    JAVA_FLOAT.withName("sy"),
		    JAVA_FLOAT.withName("c"),
		    JAVA_FLOAT.withName("pvy"),
		    JAVA_FLOAT.withName("sz"),
		    JAVA_FLOAT.withName("pvz"),
		    JAVA_FLOAT.withName("qx"),
		    JAVA_FLOAT.withName("qy"),
		    JAVA_FLOAT.withName("qz"),
		    JAVA_FLOAT.withName("qw"),
		    JAVA_FLOAT.withName("tx"),
		    JAVA_FLOAT.withName("ty"),
		    JAVA_FLOAT.withName("tz")
		).withName("VkSRTDataNV").withByteAlignment(4);
		
		SX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sx"));
		A_HANDLE = LAYOUT.varHandle(PathElement.groupElement("a"));
		B_HANDLE = LAYOUT.varHandle(PathElement.groupElement("b"));
		PVX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pvx"));
		SY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sy"));
		C_HANDLE = LAYOUT.varHandle(PathElement.groupElement("c"));
		PVY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pvy"));
		SZ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sz"));
		PVZ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pvz"));
		QX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("qx"));
		QY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("qy"));
		QZ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("qz"));
		QW_HANDLE = LAYOUT.varHandle(PathElement.groupElement("qw"));
		TX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tx"));
		TY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ty"));
		TZ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tz"));
		
		SX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sx"));
		A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("a"));
		B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b"));
		PVX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pvx"));
		SY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sy"));
		C_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("c"));
		PVY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pvy"));
		SZ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sz"));
		PVZ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pvz"));
		QX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("qx"));
		QY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("qy"));
		QZ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("qz"));
		QW_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("qw"));
		TX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tx"));
		TY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ty"));
		TZ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tz"));
		//@formatter:on
	}

	public VkSRTDataNV() {
	    this(Arena.ofAuto());
	}
	
	public VkSRTDataNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkSRTDataNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sx()
    public VkSRTDataNV sx(float sx) {
    	SX_HANDLE.set(segment, 0L, sx);
    	return this;
    }
    
    public float sx() {
    	return (float) SX_HANDLE.get(segment, 0L);
    }
    
    /// @see #a()
    public VkSRTDataNV a(float a) {
    	A_HANDLE.set(segment, 0L, a);
    	return this;
    }
    
    public float a() {
    	return (float) A_HANDLE.get(segment, 0L);
    }
    
    /// @see #b()
    public VkSRTDataNV b(float b) {
    	B_HANDLE.set(segment, 0L, b);
    	return this;
    }
    
    public float b() {
    	return (float) B_HANDLE.get(segment, 0L);
    }
    
    /// @see #pvx()
    public VkSRTDataNV pvx(float pvx) {
    	PVX_HANDLE.set(segment, 0L, pvx);
    	return this;
    }
    
    public float pvx() {
    	return (float) PVX_HANDLE.get(segment, 0L);
    }
    
    /// @see #sy()
    public VkSRTDataNV sy(float sy) {
    	SY_HANDLE.set(segment, 0L, sy);
    	return this;
    }
    
    public float sy() {
    	return (float) SY_HANDLE.get(segment, 0L);
    }
    
    /// @see #c()
    public VkSRTDataNV c(float c) {
    	C_HANDLE.set(segment, 0L, c);
    	return this;
    }
    
    public float c() {
    	return (float) C_HANDLE.get(segment, 0L);
    }
    
    /// @see #pvy()
    public VkSRTDataNV pvy(float pvy) {
    	PVY_HANDLE.set(segment, 0L, pvy);
    	return this;
    }
    
    public float pvy() {
    	return (float) PVY_HANDLE.get(segment, 0L);
    }
    
    /// @see #sz()
    public VkSRTDataNV sz(float sz) {
    	SZ_HANDLE.set(segment, 0L, sz);
    	return this;
    }
    
    public float sz() {
    	return (float) SZ_HANDLE.get(segment, 0L);
    }
    
    /// @see #pvz()
    public VkSRTDataNV pvz(float pvz) {
    	PVZ_HANDLE.set(segment, 0L, pvz);
    	return this;
    }
    
    public float pvz() {
    	return (float) PVZ_HANDLE.get(segment, 0L);
    }
    
    /// @see #qx()
    public VkSRTDataNV qx(float qx) {
    	QX_HANDLE.set(segment, 0L, qx);
    	return this;
    }
    
    public float qx() {
    	return (float) QX_HANDLE.get(segment, 0L);
    }
    
    /// @see #qy()
    public VkSRTDataNV qy(float qy) {
    	QY_HANDLE.set(segment, 0L, qy);
    	return this;
    }
    
    public float qy() {
    	return (float) QY_HANDLE.get(segment, 0L);
    }
    
    /// @see #qz()
    public VkSRTDataNV qz(float qz) {
    	QZ_HANDLE.set(segment, 0L, qz);
    	return this;
    }
    
    public float qz() {
    	return (float) QZ_HANDLE.get(segment, 0L);
    }
    
    /// @see #qw()
    public VkSRTDataNV qw(float qw) {
    	QW_HANDLE.set(segment, 0L, qw);
    	return this;
    }
    
    public float qw() {
    	return (float) QW_HANDLE.get(segment, 0L);
    }
    
    /// @see #tx()
    public VkSRTDataNV tx(float tx) {
    	TX_HANDLE.set(segment, 0L, tx);
    	return this;
    }
    
    public float tx() {
    	return (float) TX_HANDLE.get(segment, 0L);
    }
    
    /// @see #ty()
    public VkSRTDataNV ty(float ty) {
    	TY_HANDLE.set(segment, 0L, ty);
    	return this;
    }
    
    public float ty() {
    	return (float) TY_HANDLE.get(segment, 0L);
    }
    
    /// @see #tz()
    public VkSRTDataNV tz(float tz) {
    	TZ_HANDLE.set(segment, 0L, tz);
    	return this;
    }
    
    public float tz() {
    	return (float) TZ_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSRTDataNV set(VkSRTDataNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkSRTDataNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSRTDataNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSRTDataNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSRTDataNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSRTDataNV> array(SegmentAllocator allocator, VkSRTDataNV... structs) {
        NativeStructArray<VkSRTDataNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSRTDataNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSRTDataNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSRTDataNV(segment)
        );
    }

}