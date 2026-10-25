/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Helper structure to describe a virtual camera.
/// 
/// Cameras have a representation in the node graph and can be animated.
/// An important aspect is that the camera itself is also part of the
/// scene-graph. This means, any values such as the look-at vector are not
/// *absolute*, they're <b>relative</b> to the coordinate system defined
/// by the node which corresponds to the camera. This allows for camera
/// animations. For static cameras parameters like the 'look-at' or 'up' vectors
/// are usually specified directly in aiCamera, but beware, they could also
/// be encoded in the node transformation. The following (pseudo)code sample
/// shows how to do it: <br><br>
/// @code
/// // Get the camera matrix for a camera at a specific time
/// // if the node hierarchy for the camera does not contain
/// // at least one animated node this is a static computation
/// get-camera-matrix (node sceneRoot, camera cam) : matrix
/// {
/// node   cnd = find-node-for-camera(cam)
/// matrix cmt = identity()
/// 
/// // as usual - get the absolute camera transformation for this frame
/// for each node nd in hierarchy from sceneRoot to cnd
/// matrix cur
/// if (is-animated(nd))
/// cur = eval-animation(nd)
/// else cur = nd->mTransformation;
/// cmt = mult-matrices( cmt, cur )
/// end for
/// 
/// // now multiply with the camera's own local transform
/// cam = mult-matrices (cam, get-camera-matrix(cmt) )
/// }
/// @endcode
/// 
/// @note some file formats (such as 3DS, ASE) export a "target point" -
/// the point the camera is looking at (it can even be animated). Assimp
/// writes the target point as a subnode of the camera's main node,
/// called "<camName>.Target". However this is just additional information
/// then the transformation tracks of the camera main node make the
/// camera already look in the right direction.
/// 
/// ```
public final class AiCamera
		implements Struct<AiCamera> {

	public static final StructLayout LAYOUT;

	public static final VarHandle M_HORIZONTAL_FOV_HANDLE;
	public static final VarHandle M_CLIP_PLANE_NEAR_HANDLE;
	public static final VarHandle M_CLIP_PLANE_FAR_HANDLE;
	public static final VarHandle M_ASPECT_HANDLE;
	public static final VarHandle M_ORTHOGRAPHIC_WIDTH_HANDLE;

	public static final long M_NAME_BYTE_OFFSET;
	public static final long M_POSITION_BYTE_OFFSET;
	public static final long M_UP_BYTE_OFFSET;
	public static final long M_LOOK_AT_BYTE_OFFSET;
	public static final long M_HORIZONTAL_FOV_BYTE_OFFSET;
	public static final long M_CLIP_PLANE_NEAR_BYTE_OFFSET;
	public static final long M_CLIP_PLANE_FAR_BYTE_OFFSET;
	public static final long M_ASPECT_BYTE_OFFSET;
	public static final long M_ORTHOGRAPHIC_WIDTH_BYTE_OFFSET;

	private final MemorySegment segment;

	private final AiString mName;
	private final AiVector3D mPosition;
	private final AiVector3D mUp;
	private final AiVector3D mLookAt;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    AiString.LAYOUT.withName("mName"),
		    AiVector3D.LAYOUT.withName("mPosition"),
		    AiVector3D.LAYOUT.withName("mUp"),
		    AiVector3D.LAYOUT.withName("mLookAt"),
		    JAVA_FLOAT.withName("mHorizontalFOV"),
		    JAVA_FLOAT.withName("mClipPlaneNear"),
		    JAVA_FLOAT.withName("mClipPlaneFar"),
		    JAVA_FLOAT.withName("mAspect"),
		    JAVA_FLOAT.withName("mOrthographicWidth")
		).withName("aiCamera").withByteAlignment(4);
		
		M_HORIZONTAL_FOV_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mHorizontalFOV"));
		M_CLIP_PLANE_NEAR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mClipPlaneNear"));
		M_CLIP_PLANE_FAR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mClipPlaneFar"));
		M_ASPECT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mAspect"));
		M_ORTHOGRAPHIC_WIDTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mOrthographicWidth"));
		
		M_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mName"));
		M_POSITION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mPosition"));
		M_UP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mUp"));
		M_LOOK_AT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mLookAt"));
		M_HORIZONTAL_FOV_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mHorizontalFOV"));
		M_CLIP_PLANE_NEAR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mClipPlaneNear"));
		M_CLIP_PLANE_FAR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mClipPlaneFar"));
		M_ASPECT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mAspect"));
		M_ORTHOGRAPHIC_WIDTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mOrthographicWidth"));
		//@formatter:on
	}

	public AiCamera() {
	    this(Arena.ofAuto());
	}
	
	public AiCamera(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public AiCamera(MemorySegment segment) {
	    this.segment = segment;
	
	    mName = new AiString(segment.asSlice(M_NAME_BYTE_OFFSET, AiString.LAYOUT));
	    mPosition = new AiVector3D(segment.asSlice(M_POSITION_BYTE_OFFSET, AiVector3D.LAYOUT));
	    mUp = new AiVector3D(segment.asSlice(M_UP_BYTE_OFFSET, AiVector3D.LAYOUT));
	    mLookAt = new AiVector3D(segment.asSlice(M_LOOK_AT_BYTE_OFFSET, AiVector3D.LAYOUT));
	}

    /// @see #mName()
    public AiCamera mName(Consumer<AiString> consumer) {
    	consumer.accept(mName);
    	return this;
    }
    
    /// @see #mName()
    public AiCamera mName(AiString other) {
    	mName.set(other);
    	return this;
    }
    
    /// ```
    /// The name of the camera.
    /// 
    /// There must be a node in the scenegraph with the same name.
    /// This node specifies the position of the camera in the scene
    /// hierarchy and can be animated.
    /// ```
    public AiString mName() {
    	return mName;
    }
    
    /// @see #mPosition()
    public AiCamera mPosition(Consumer<AiVector3D> consumer) {
    	consumer.accept(mPosition);
    	return this;
    }
    
    /// @see #mPosition()
    public AiCamera mPosition(AiVector3D other) {
    	mPosition.set(other);
    	return this;
    }
    
    /// ```
    /// Position of the camera relative to the coordinate space
    /// defined by the corresponding node.
    /// 
    /// The default value is 0|0|0.
    /// ```
    public AiVector3D mPosition() {
    	return mPosition;
    }
    
    /// @see #mUp()
    public AiCamera mUp(Consumer<AiVector3D> consumer) {
    	consumer.accept(mUp);
    	return this;
    }
    
    /// @see #mUp()
    public AiCamera mUp(AiVector3D other) {
    	mUp.set(other);
    	return this;
    }
    
    /// ```
    /// 'Up' - vector of the camera coordinate system relative to
    /// the coordinate space defined by the corresponding node.
    /// 
    /// The 'right' vector of the camera coordinate system is
    /// the cross product of  the up and lookAt vectors.
    /// The default value is 0|1|0. The vector
    /// may be normalized, but it needn't.
    /// ```
    public AiVector3D mUp() {
    	return mUp;
    }
    
    /// @see #mLookAt()
    public AiCamera mLookAt(Consumer<AiVector3D> consumer) {
    	consumer.accept(mLookAt);
    	return this;
    }
    
    /// @see #mLookAt()
    public AiCamera mLookAt(AiVector3D other) {
    	mLookAt.set(other);
    	return this;
    }
    
    /// ```
    /// 'LookAt' - vector of the camera coordinate system relative to
    /// the coordinate space defined by the corresponding node.
    /// 
    /// This is the viewing direction of the user.
    /// The default value is 0|0|1. The vector
    /// may be normalized, but it needn't.
    /// ```
    public AiVector3D mLookAt() {
    	return mLookAt;
    }
    
    /// @see #mHorizontalFOV()
    public AiCamera mHorizontalFOV(float mHorizontalFOV) {
    	M_HORIZONTAL_FOV_HANDLE.set(segment, 0L, mHorizontalFOV);
    	return this;
    }
    
    /// ```
    /// Horizontal field of view angle, in radians.
    /// 
    /// The field of view angle is the angle between the center
    /// line of the screen and the left or right border.
    /// The default value is 1/4PI.
    /// ```
    public float mHorizontalFOV() {
    	return (float) M_HORIZONTAL_FOV_HANDLE.get(segment, 0L);
    }
    
    /// @see #mClipPlaneNear()
    public AiCamera mClipPlaneNear(float mClipPlaneNear) {
    	M_CLIP_PLANE_NEAR_HANDLE.set(segment, 0L, mClipPlaneNear);
    	return this;
    }
    
    /// ```
    /// Distance of the near clipping plane from the camera.
    /// 
    /// The value may not be 0.f (for arithmetic reasons to prevent
    /// a division through zero). The default value is 0.1f.
    /// ```
    public float mClipPlaneNear() {
    	return (float) M_CLIP_PLANE_NEAR_HANDLE.get(segment, 0L);
    }
    
    /// @see #mClipPlaneFar()
    public AiCamera mClipPlaneFar(float mClipPlaneFar) {
    	M_CLIP_PLANE_FAR_HANDLE.set(segment, 0L, mClipPlaneFar);
    	return this;
    }
    
    /// ```
    /// Distance of the far clipping plane from the camera.
    /// 
    /// The far clipping plane must, of course, be further away than the
    /// near clipping plane. The default value is 1000.f. The ratio
    /// between the near and the far plane should not be too
    /// large (between 1000-10000 should be ok) to avoid floating-point
    /// inaccuracies which could lead to z-fighting.
    /// ```
    public float mClipPlaneFar() {
    	return (float) M_CLIP_PLANE_FAR_HANDLE.get(segment, 0L);
    }
    
    /// @see #mAspect()
    public AiCamera mAspect(float mAspect) {
    	M_ASPECT_HANDLE.set(segment, 0L, mAspect);
    	return this;
    }
    
    /// ```
    /// Screen aspect ratio.
    /// 
    /// This is the ration between the width and the height of the
    /// screen. Typical values are 4/3, 1/2 or 1/1. This value is
    /// 0 if the aspect ratio is not defined in the source file.
    /// 0 is also the default value.
    /// ```
    public float mAspect() {
    	return (float) M_ASPECT_HANDLE.get(segment, 0L);
    }
    
    /// @see #mOrthographicWidth()
    public AiCamera mOrthographicWidth(float mOrthographicWidth) {
    	M_ORTHOGRAPHIC_WIDTH_HANDLE.set(segment, 0L, mOrthographicWidth);
    	return this;
    }
    
    /// ```
    /// Half horizontal orthographic width, in scene units.
    /// 
    /// The orthographic width specifies the half width of the
    /// orthographic view box. If non-zero the camera is
    /// orthographic and the mAspect should define to the
    /// ratio between the orthographic width and height
    /// and mHorizontalFOV should be set to 0.
    /// The default value is 0 (not orthographic).
    /// ```
    public float mOrthographicWidth() {
    	return (float) M_ORTHOGRAPHIC_WIDTH_HANDLE.get(segment, 0L);
    }
    
    @Override
    public AiCamera set(AiCamera other) {
        return set(other.segment);
    }
    
    @Override
    public AiCamera set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiCamera> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiCamera> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiCamera(segment),
            count
        );
    }
    
    public static NativeStructArray<AiCamera> array(Arena arena, AiCamera... structs) {
        NativeStructArray<AiCamera> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiCamera(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiCamera> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiCamera(segment)
        );
    }

}