/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class StdVideoH265ProfileTierLevel
		implements Struct<StdVideoH265ProfileTierLevel> {

	public static final StructLayout LAYOUT;

	public static final VarHandle GENERAL_PROFILE_IDC_HANDLE;
	public static final VarHandle GENERAL_LEVEL_IDC_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long GENERAL_PROFILE_IDC_BYTE_OFFSET;
	public static final long GENERAL_LEVEL_IDC_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoH265ProfileTierLevelFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoH265ProfileTierLevelFlags.LAYOUT.withName("flags"),
		    JAVA_INT.withName("general_profile_idc"),
		    JAVA_INT.withName("general_level_idc")
		).withName("StdVideoH265ProfileTierLevel").withByteAlignment(4);
		
		GENERAL_PROFILE_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("general_profile_idc"));
		GENERAL_LEVEL_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("general_level_idc"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		GENERAL_PROFILE_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("general_profile_idc"));
		GENERAL_LEVEL_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("general_level_idc"));
		//@formatter:on
	}

	public StdVideoH265ProfileTierLevel() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoH265ProfileTierLevel(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoH265ProfileTierLevel(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoH265ProfileTierLevelFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoH265ProfileTierLevelFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoH265ProfileTierLevel flags(Consumer<StdVideoH265ProfileTierLevelFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoH265ProfileTierLevel flags(StdVideoH265ProfileTierLevelFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoH265ProfileTierLevelFlags flags() {
    	return flags;
    }
    
    /// @see #general_profile_idc()
    public StdVideoH265ProfileTierLevel general_profile_idc(int general_profile_idc) {
    	GENERAL_PROFILE_IDC_HANDLE.set(segment, 0L, general_profile_idc);
    	return this;
    }
    
    public int general_profile_idc() {
    	return (int) GENERAL_PROFILE_IDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #general_level_idc()
    public StdVideoH265ProfileTierLevel general_level_idc(int general_level_idc) {
    	GENERAL_LEVEL_IDC_HANDLE.set(segment, 0L, general_level_idc);
    	return this;
    }
    
    public int general_level_idc() {
    	return (int) GENERAL_LEVEL_IDC_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoH265ProfileTierLevel set(StdVideoH265ProfileTierLevel other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH265ProfileTierLevel set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH265ProfileTierLevel> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH265ProfileTierLevel> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265ProfileTierLevel(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH265ProfileTierLevel> array(Arena arena, StdVideoH265ProfileTierLevel... structs) {
        NativeStructArray<StdVideoH265ProfileTierLevel> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265ProfileTierLevel(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH265ProfileTierLevel> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH265ProfileTierLevel(segment)
        );
    }

}