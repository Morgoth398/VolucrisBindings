/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Stores the memory requirements for different components (e.g. meshes, materials,
/// animations) of an import. All sizes are in bytes.
/// @see Importer::GetMemoryRequirements()
/// ```
public final class AiMemoryInfo
		implements Struct<AiMemoryInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle TEXTURES_HANDLE;
    public static final VarHandle MATERIALS_HANDLE;
    public static final VarHandle MESHES_HANDLE;
    public static final VarHandle NODES_HANDLE;
    public static final VarHandle ANIMATIONS_HANDLE;
    public static final VarHandle CAMERAS_HANDLE;
    public static final VarHandle LIGHTS_HANDLE;
    public static final VarHandle TOTAL_HANDLE;

    public static final long TEXTURES_BYTE_OFFSET;
    public static final long MATERIALS_BYTE_OFFSET;
    public static final long MESHES_BYTE_OFFSET;
    public static final long NODES_BYTE_OFFSET;
    public static final long ANIMATIONS_BYTE_OFFSET;
    public static final long CAMERAS_BYTE_OFFSET;
    public static final long LIGHTS_BYTE_OFFSET;
    public static final long TOTAL_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("textures"),
            JAVA_INT.withName("materials"),
            JAVA_INT.withName("meshes"),
            JAVA_INT.withName("nodes"),
            JAVA_INT.withName("animations"),
            JAVA_INT.withName("cameras"),
            JAVA_INT.withName("lights"),
            JAVA_INT.withName("total")
        ).withName("aiMemoryInfo").withByteAlignment(4);
        
        TEXTURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("textures"));
        MATERIALS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("materials"));
        MESHES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("meshes"));
        NODES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nodes"));
        ANIMATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("animations"));
        CAMERAS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cameras"));
        LIGHTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lights"));
        TOTAL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("total"));
        
        TEXTURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("textures"));
        MATERIALS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materials"));
        MESHES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("meshes"));
        NODES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nodes"));
        ANIMATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("animations"));
        CAMERAS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cameras"));
        LIGHTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lights"));
        TOTAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("total"));
        //@formatter:on
    }

    public AiMemoryInfo() {
        this(Arena.ofAuto());
    }
    
    public AiMemoryInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public AiMemoryInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #textures()
    public AiMemoryInfo textures(int textures) {
    	TEXTURES_HANDLE.set(segment, 0L, textures);
    	return this;
    }
    
    /// ```
    /// Storage allocated for texture data
    /// ```
    public int textures() {
    	return (int) TEXTURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #materials()
    public AiMemoryInfo materials(int materials) {
    	MATERIALS_HANDLE.set(segment, 0L, materials);
    	return this;
    }
    
    /// ```
    /// Storage allocated for material data
    /// ```
    public int materials() {
    	return (int) MATERIALS_HANDLE.get(segment, 0L);
    }
    
    /// @see #meshes()
    public AiMemoryInfo meshes(int meshes) {
    	MESHES_HANDLE.set(segment, 0L, meshes);
    	return this;
    }
    
    /// ```
    /// Storage allocated for mesh data
    /// ```
    public int meshes() {
    	return (int) MESHES_HANDLE.get(segment, 0L);
    }
    
    /// @see #nodes()
    public AiMemoryInfo nodes(int nodes) {
    	NODES_HANDLE.set(segment, 0L, nodes);
    	return this;
    }
    
    /// ```
    /// Storage allocated for node data
    /// ```
    public int nodes() {
    	return (int) NODES_HANDLE.get(segment, 0L);
    }
    
    /// @see #animations()
    public AiMemoryInfo animations(int animations) {
    	ANIMATIONS_HANDLE.set(segment, 0L, animations);
    	return this;
    }
    
    /// ```
    /// Storage allocated for animation data
    /// ```
    public int animations() {
    	return (int) ANIMATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #cameras()
    public AiMemoryInfo cameras(int cameras) {
    	CAMERAS_HANDLE.set(segment, 0L, cameras);
    	return this;
    }
    
    /// ```
    /// Storage allocated for camera data
    /// ```
    public int cameras() {
    	return (int) CAMERAS_HANDLE.get(segment, 0L);
    }
    
    /// @see #lights()
    public AiMemoryInfo lights(int lights) {
    	LIGHTS_HANDLE.set(segment, 0L, lights);
    	return this;
    }
    
    /// ```
    /// Storage allocated for light data
    /// ```
    public int lights() {
    	return (int) LIGHTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #total()
    public AiMemoryInfo total(int total) {
    	TOTAL_HANDLE.set(segment, 0L, total);
    	return this;
    }
    
    /// ```
    /// Total storage allocated for the full import.
    /// ```
    public int total() {
    	return (int) TOTAL_HANDLE.get(segment, 0L);
    }
    
    @Override
    public AiMemoryInfo set(AiMemoryInfo other) {
        return set(other.segment);
    }
    
    @Override
    public AiMemoryInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiMemoryInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiMemoryInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMemoryInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<AiMemoryInfo> array(Arena arena, AiMemoryInfo... structs) {
        NativeStructArray<AiMemoryInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMemoryInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiMemoryInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiMemoryInfo(segment)
        );
    }
    
}