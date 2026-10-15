/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkSamplerCreateInfo
		implements Struct<VkSamplerCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle MAG_FILTER_HANDLE;
	public static final VarHandle MIN_FILTER_HANDLE;
	public static final VarHandle MIPMAP_MODE_HANDLE;
	public static final VarHandle ADDRESS_MODE_U_HANDLE;
	public static final VarHandle ADDRESS_MODE_V_HANDLE;
	public static final VarHandle ADDRESS_MODE_W_HANDLE;
	public static final VarHandle MIP_LOD_BIAS_HANDLE;
	public static final VarHandle ANISOTROPY_ENABLE_HANDLE;
	public static final VarHandle MAX_ANISOTROPY_HANDLE;
	public static final VarHandle COMPARE_ENABLE_HANDLE;
	public static final VarHandle COMPARE_OP_HANDLE;
	public static final VarHandle MIN_LOD_HANDLE;
	public static final VarHandle MAX_LOD_HANDLE;
	public static final VarHandle BORDER_COLOR_HANDLE;
	public static final VarHandle UNNORMALIZED_COORDINATES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long MAG_FILTER_BYTE_OFFSET;
	public static final long MIN_FILTER_BYTE_OFFSET;
	public static final long MIPMAP_MODE_BYTE_OFFSET;
	public static final long ADDRESS_MODE_U_BYTE_OFFSET;
	public static final long ADDRESS_MODE_V_BYTE_OFFSET;
	public static final long ADDRESS_MODE_W_BYTE_OFFSET;
	public static final long MIP_LOD_BIAS_BYTE_OFFSET;
	public static final long ANISOTROPY_ENABLE_BYTE_OFFSET;
	public static final long MAX_ANISOTROPY_BYTE_OFFSET;
	public static final long COMPARE_ENABLE_BYTE_OFFSET;
	public static final long COMPARE_OP_BYTE_OFFSET;
	public static final long MIN_LOD_BYTE_OFFSET;
	public static final long MAX_LOD_BYTE_OFFSET;
	public static final long BORDER_COLOR_BYTE_OFFSET;
	public static final long UNNORMALIZED_COORDINATES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("magFilter"),
		    JAVA_INT.withName("minFilter"),
		    JAVA_INT.withName("mipmapMode"),
		    JAVA_INT.withName("addressModeU"),
		    JAVA_INT.withName("addressModeV"),
		    JAVA_INT.withName("addressModeW"),
		    JAVA_FLOAT.withName("mipLodBias"),
		    JAVA_INT.withName("anisotropyEnable"),
		    JAVA_FLOAT.withName("maxAnisotropy"),
		    JAVA_INT.withName("compareEnable"),
		    JAVA_INT.withName("compareOp"),
		    JAVA_FLOAT.withName("minLod"),
		    JAVA_FLOAT.withName("maxLod"),
		    JAVA_INT.withName("borderColor"),
		    JAVA_INT.withName("unnormalizedCoordinates")
		).withName("VkSamplerCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		MAG_FILTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("magFilter"));
		MIN_FILTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minFilter"));
		MIPMAP_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mipmapMode"));
		ADDRESS_MODE_U_HANDLE = LAYOUT.varHandle(PathElement.groupElement("addressModeU"));
		ADDRESS_MODE_V_HANDLE = LAYOUT.varHandle(PathElement.groupElement("addressModeV"));
		ADDRESS_MODE_W_HANDLE = LAYOUT.varHandle(PathElement.groupElement("addressModeW"));
		MIP_LOD_BIAS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mipLodBias"));
		ANISOTROPY_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("anisotropyEnable"));
		MAX_ANISOTROPY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxAnisotropy"));
		COMPARE_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("compareEnable"));
		COMPARE_OP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("compareOp"));
		MIN_LOD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minLod"));
		MAX_LOD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxLod"));
		BORDER_COLOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("borderColor"));
		UNNORMALIZED_COORDINATES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("unnormalizedCoordinates"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		MAG_FILTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("magFilter"));
		MIN_FILTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minFilter"));
		MIPMAP_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mipmapMode"));
		ADDRESS_MODE_U_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressModeU"));
		ADDRESS_MODE_V_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressModeV"));
		ADDRESS_MODE_W_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressModeW"));
		MIP_LOD_BIAS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mipLodBias"));
		ANISOTROPY_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("anisotropyEnable"));
		MAX_ANISOTROPY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxAnisotropy"));
		COMPARE_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("compareEnable"));
		COMPARE_OP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("compareOp"));
		MIN_LOD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minLod"));
		MAX_LOD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxLod"));
		BORDER_COLOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("borderColor"));
		UNNORMALIZED_COORDINATES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("unnormalizedCoordinates"));
		//@formatter:on
	}

	public VkSamplerCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkSamplerCreateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkSamplerCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkSamplerCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSamplerCreateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkSamplerCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #magFilter()
    public VkSamplerCreateInfo magFilter(int magFilter) {
    	MAG_FILTER_HANDLE.set(segment, 0L, magFilter);
    	return this;
    }
    
    public int magFilter() {
    	return (int) MAG_FILTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #minFilter()
    public VkSamplerCreateInfo minFilter(int minFilter) {
    	MIN_FILTER_HANDLE.set(segment, 0L, minFilter);
    	return this;
    }
    
    public int minFilter() {
    	return (int) MIN_FILTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #mipmapMode()
    public VkSamplerCreateInfo mipmapMode(int mipmapMode) {
    	MIPMAP_MODE_HANDLE.set(segment, 0L, mipmapMode);
    	return this;
    }
    
    public int mipmapMode() {
    	return (int) MIPMAP_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #addressModeU()
    public VkSamplerCreateInfo addressModeU(int addressModeU) {
    	ADDRESS_MODE_U_HANDLE.set(segment, 0L, addressModeU);
    	return this;
    }
    
    public int addressModeU() {
    	return (int) ADDRESS_MODE_U_HANDLE.get(segment, 0L);
    }
    
    /// @see #addressModeV()
    public VkSamplerCreateInfo addressModeV(int addressModeV) {
    	ADDRESS_MODE_V_HANDLE.set(segment, 0L, addressModeV);
    	return this;
    }
    
    public int addressModeV() {
    	return (int) ADDRESS_MODE_V_HANDLE.get(segment, 0L);
    }
    
    /// @see #addressModeW()
    public VkSamplerCreateInfo addressModeW(int addressModeW) {
    	ADDRESS_MODE_W_HANDLE.set(segment, 0L, addressModeW);
    	return this;
    }
    
    public int addressModeW() {
    	return (int) ADDRESS_MODE_W_HANDLE.get(segment, 0L);
    }
    
    /// @see #mipLodBias()
    public VkSamplerCreateInfo mipLodBias(float mipLodBias) {
    	MIP_LOD_BIAS_HANDLE.set(segment, 0L, mipLodBias);
    	return this;
    }
    
    public float mipLodBias() {
    	return (float) MIP_LOD_BIAS_HANDLE.get(segment, 0L);
    }
    
    /// @see #anisotropyEnable()
    public VkSamplerCreateInfo anisotropyEnable(int anisotropyEnable) {
    	ANISOTROPY_ENABLE_HANDLE.set(segment, 0L, anisotropyEnable);
    	return this;
    }
    
    public int anisotropyEnable() {
    	return (int) ANISOTROPY_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxAnisotropy()
    public VkSamplerCreateInfo maxAnisotropy(float maxAnisotropy) {
    	MAX_ANISOTROPY_HANDLE.set(segment, 0L, maxAnisotropy);
    	return this;
    }
    
    public float maxAnisotropy() {
    	return (float) MAX_ANISOTROPY_HANDLE.get(segment, 0L);
    }
    
    /// @see #compareEnable()
    public VkSamplerCreateInfo compareEnable(int compareEnable) {
    	COMPARE_ENABLE_HANDLE.set(segment, 0L, compareEnable);
    	return this;
    }
    
    public int compareEnable() {
    	return (int) COMPARE_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #compareOp()
    public VkSamplerCreateInfo compareOp(int compareOp) {
    	COMPARE_OP_HANDLE.set(segment, 0L, compareOp);
    	return this;
    }
    
    public int compareOp() {
    	return (int) COMPARE_OP_HANDLE.get(segment, 0L);
    }
    
    /// @see #minLod()
    public VkSamplerCreateInfo minLod(float minLod) {
    	MIN_LOD_HANDLE.set(segment, 0L, minLod);
    	return this;
    }
    
    public float minLod() {
    	return (float) MIN_LOD_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxLod()
    public VkSamplerCreateInfo maxLod(float maxLod) {
    	MAX_LOD_HANDLE.set(segment, 0L, maxLod);
    	return this;
    }
    
    public float maxLod() {
    	return (float) MAX_LOD_HANDLE.get(segment, 0L);
    }
    
    /// @see #borderColor()
    public VkSamplerCreateInfo borderColor(int borderColor) {
    	BORDER_COLOR_HANDLE.set(segment, 0L, borderColor);
    	return this;
    }
    
    public int borderColor() {
    	return (int) BORDER_COLOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #unnormalizedCoordinates()
    public VkSamplerCreateInfo unnormalizedCoordinates(int unnormalizedCoordinates) {
    	UNNORMALIZED_COORDINATES_HANDLE.set(segment, 0L, unnormalizedCoordinates);
    	return this;
    }
    
    public int unnormalizedCoordinates() {
    	return (int) UNNORMALIZED_COORDINATES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSamplerCreateInfo set(VkSamplerCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkSamplerCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSamplerCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSamplerCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSamplerCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSamplerCreateInfo> array(Arena arena, VkSamplerCreateInfo... structs) {
        NativeStructArray<VkSamplerCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSamplerCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSamplerCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSamplerCreateInfo(segment)
        );
    }

}