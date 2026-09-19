/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Helper structure to describe a light source.
/// 
/// Assimp supports multiple sorts of light sources, including
/// directional, point and spot lights. All of them are defined with just
/// a single structure and distinguished by their parameters.
/// Note - some file formats (such as 3DS, ASE) export a "target point" -
/// the point a spot light is looking at (it can even be animated). Assimp
/// writes the target point as a sub-node of a spot-lights's main node,
/// called "<spotName>.Target". However, this is just additional information
/// then, the transformation tracks of the main node make the
/// spot light already point in the right direction.
/// ```
public final class AiLight
		implements Struct<AiLight> {

    public static final StructLayout LAYOUT;

    public static final VarHandle M_TYPE_HANDLE;
    public static final VarHandle M_ATTENUATION_CONSTANT_HANDLE;
    public static final VarHandle M_ATTENUATION_LINEAR_HANDLE;
    public static final VarHandle M_ATTENUATION_QUADRATIC_HANDLE;
    public static final VarHandle M_ANGLE_INNER_CONE_HANDLE;
    public static final VarHandle M_ANGLE_OUTER_CONE_HANDLE;

    public static final long M_NAME_BYTE_OFFSET;
    public static final long M_TYPE_BYTE_OFFSET;
    public static final long M_POSITION_BYTE_OFFSET;
    public static final long M_DIRECTION_BYTE_OFFSET;
    public static final long M_UP_BYTE_OFFSET;
    public static final long M_ATTENUATION_CONSTANT_BYTE_OFFSET;
    public static final long M_ATTENUATION_LINEAR_BYTE_OFFSET;
    public static final long M_ATTENUATION_QUADRATIC_BYTE_OFFSET;
    public static final long M_COLOR_DIFFUSE_BYTE_OFFSET;
    public static final long M_COLOR_SPECULAR_BYTE_OFFSET;
    public static final long M_COLOR_AMBIENT_BYTE_OFFSET;
    public static final long M_ANGLE_INNER_CONE_BYTE_OFFSET;
    public static final long M_ANGLE_OUTER_CONE_BYTE_OFFSET;
    public static final long M_SIZE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final AiString mName;
    private final AiVector3D mPosition;
    private final AiVector3D mDirection;
    private final AiVector3D mUp;
    private final AiColor3D mColorDiffuse;
    private final AiColor3D mColorSpecular;
    private final AiColor3D mColorAmbient;
    private final AiVector2D mSize;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            AiString.LAYOUT.withName("mName"),
            JAVA_INT.withName("mType"),
            AiVector3D.LAYOUT.withName("mPosition"),
            AiVector3D.LAYOUT.withName("mDirection"),
            AiVector3D.LAYOUT.withName("mUp"),
            JAVA_FLOAT.withName("mAttenuationConstant"),
            JAVA_FLOAT.withName("mAttenuationLinear"),
            JAVA_FLOAT.withName("mAttenuationQuadratic"),
            AiColor3D.LAYOUT.withName("mColorDiffuse"),
            AiColor3D.LAYOUT.withName("mColorSpecular"),
            AiColor3D.LAYOUT.withName("mColorAmbient"),
            JAVA_FLOAT.withName("mAngleInnerCone"),
            JAVA_FLOAT.withName("mAngleOuterCone"),
            AiVector2D.LAYOUT.withName("mSize")
        ).withName("aiLight").withByteAlignment(4);
        
        M_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mType"));
        M_ATTENUATION_CONSTANT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mAttenuationConstant"));
        M_ATTENUATION_LINEAR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mAttenuationLinear"));
        M_ATTENUATION_QUADRATIC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mAttenuationQuadratic"));
        M_ANGLE_INNER_CONE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mAngleInnerCone"));
        M_ANGLE_OUTER_CONE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mAngleOuterCone"));
        
        M_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mName"));
        M_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mType"));
        M_POSITION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mPosition"));
        M_DIRECTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mDirection"));
        M_UP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mUp"));
        M_ATTENUATION_CONSTANT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mAttenuationConstant"));
        M_ATTENUATION_LINEAR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mAttenuationLinear"));
        M_ATTENUATION_QUADRATIC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mAttenuationQuadratic"));
        M_COLOR_DIFFUSE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mColorDiffuse"));
        M_COLOR_SPECULAR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mColorSpecular"));
        M_COLOR_AMBIENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mColorAmbient"));
        M_ANGLE_INNER_CONE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mAngleInnerCone"));
        M_ANGLE_OUTER_CONE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mAngleOuterCone"));
        M_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mSize"));
        //@formatter:on
    }

    public AiLight() {
        this(Arena.ofAuto());
    }
    
    public AiLight(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public AiLight(MemorySegment segment) {
        this.segment = segment;
    
        mName = new AiString(segment.asSlice(M_NAME_BYTE_OFFSET, AiString.LAYOUT));
        mPosition = new AiVector3D(segment.asSlice(M_POSITION_BYTE_OFFSET, AiVector3D.LAYOUT));
        mDirection = new AiVector3D(segment.asSlice(M_DIRECTION_BYTE_OFFSET, AiVector3D.LAYOUT));
        mUp = new AiVector3D(segment.asSlice(M_UP_BYTE_OFFSET, AiVector3D.LAYOUT));
        mColorDiffuse = new AiColor3D(segment.asSlice(M_COLOR_DIFFUSE_BYTE_OFFSET, AiColor3D.LAYOUT));
        mColorSpecular = new AiColor3D(segment.asSlice(M_COLOR_SPECULAR_BYTE_OFFSET, AiColor3D.LAYOUT));
        mColorAmbient = new AiColor3D(segment.asSlice(M_COLOR_AMBIENT_BYTE_OFFSET, AiColor3D.LAYOUT));
        mSize = new AiVector2D(segment.asSlice(M_SIZE_BYTE_OFFSET, AiVector2D.LAYOUT));
    }

    /// @see #mType()
    public AiLight mType(int mType) {
    	M_TYPE_HANDLE.set(segment, 0L, mType);
    	return this;
    }
    
    /// ```
    /// The type of the light source.
    /// 
    /// aiLightSource_UNDEFINED is not a valid value for this member.
    /// ```
    public int mType() {
    	return (int) M_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #mAttenuationConstant()
    public AiLight mAttenuationConstant(float mAttenuationConstant) {
    	M_ATTENUATION_CONSTANT_HANDLE.set(segment, 0L, mAttenuationConstant);
    	return this;
    }
    
    /// ```
    /// Constant light attenuation factor.
    /// 
    /// The intensity of the light source at a given distance 'd' from
    /// the light's position is
    /// @code
    /// Atten = 1/( att0 + att1 * d + att2 * d*d)
    /// @endcode
    /// This member corresponds to the att0 variable in the equation.
    /// Naturally undefined for directional lights.
    /// ```
    public float mAttenuationConstant() {
    	return (float) M_ATTENUATION_CONSTANT_HANDLE.get(segment, 0L);
    }
    
    /// @see #mAttenuationLinear()
    public AiLight mAttenuationLinear(float mAttenuationLinear) {
    	M_ATTENUATION_LINEAR_HANDLE.set(segment, 0L, mAttenuationLinear);
    	return this;
    }
    
    /// ```
    /// Linear light attenuation factor.
    /// 
    /// The intensity of the light source at a given distance 'd' from
    /// the light's position is
    /// @code
    /// Atten = 1/( att0 + att1 * d + att2 * d*d)
    /// @endcode
    /// This member corresponds to the att1 variable in the equation.
    /// Naturally undefined for directional lights.
    /// ```
    public float mAttenuationLinear() {
    	return (float) M_ATTENUATION_LINEAR_HANDLE.get(segment, 0L);
    }
    
    /// @see #mAttenuationQuadratic()
    public AiLight mAttenuationQuadratic(float mAttenuationQuadratic) {
    	M_ATTENUATION_QUADRATIC_HANDLE.set(segment, 0L, mAttenuationQuadratic);
    	return this;
    }
    
    /// ```
    /// Quadratic light attenuation factor.
    /// 
    /// The intensity of the light source at a given distance 'd' from
    /// the light's position is
    /// @code
    /// Atten = 1/( att0 + att1 * d + att2 * d*d)
    /// @endcode
    /// This member corresponds to the att2 variable in the equation.
    /// Naturally undefined for directional lights.
    /// ```
    public float mAttenuationQuadratic() {
    	return (float) M_ATTENUATION_QUADRATIC_HANDLE.get(segment, 0L);
    }
    
    /// @see #mAngleInnerCone()
    public AiLight mAngleInnerCone(float mAngleInnerCone) {
    	M_ANGLE_INNER_CONE_HANDLE.set(segment, 0L, mAngleInnerCone);
    	return this;
    }
    
    /// ```
    /// Inner angle of a spot light's light cone.
    /// 
    /// The spot light has maximum influence on objects inside this
    /// angle. The angle is given in radians. It is 2PI for point
    /// lights and undefined for directional lights.
    /// ```
    public float mAngleInnerCone() {
    	return (float) M_ANGLE_INNER_CONE_HANDLE.get(segment, 0L);
    }
    
    /// @see #mAngleOuterCone()
    public AiLight mAngleOuterCone(float mAngleOuterCone) {
    	M_ANGLE_OUTER_CONE_HANDLE.set(segment, 0L, mAngleOuterCone);
    	return this;
    }
    
    /// ```
    /// Outer angle of a spot light's light cone.
    /// 
    /// The spot light does not affect objects outside this angle.
    /// The angle is given in radians. It is 2PI for point lights and
    /// undefined for directional lights. The outer angle must be
    /// greater than or equal to the inner angle.
    /// It is assumed that the application uses a smooth
    /// interpolation between the inner and the outer cone of the
    /// spot light.
    /// ```
    public float mAngleOuterCone() {
    	return (float) M_ANGLE_OUTER_CONE_HANDLE.get(segment, 0L);
    }
    
    /// @see #mName()
    public AiLight mName(Consumer<AiString> consumer) {
    	consumer.accept(mName);
    	return this;
    }
    
    /// @see #mName()
    public AiLight mName(AiString other) {
    	mName.set(other);
    	return this;
    }
    
    /// ```
    /// The name of the light source.
    /// 
    /// There must be a node in the scene-graph with the same name.
    /// This node specifies the position of the light in the scene
    /// hierarchy and can be animated.
    /// ```
    public AiString mName() {
    	return mName;
    }
    
    /// @see #mPosition()
    public AiLight mPosition(Consumer<AiVector3D> consumer) {
    	consumer.accept(mPosition);
    	return this;
    }
    
    /// @see #mPosition()
    public AiLight mPosition(AiVector3D other) {
    	mPosition.set(other);
    	return this;
    }
    
    /// ```
    /// Position of the light source in space. Relative to the
    /// transformation of the node corresponding to the light.
    /// 
    /// The position is undefined for directional lights.
    /// ```
    public AiVector3D mPosition() {
    	return mPosition;
    }
    
    /// @see #mDirection()
    public AiLight mDirection(Consumer<AiVector3D> consumer) {
    	consumer.accept(mDirection);
    	return this;
    }
    
    /// @see #mDirection()
    public AiLight mDirection(AiVector3D other) {
    	mDirection.set(other);
    	return this;
    }
    
    /// ```
    /// Direction of the light source in space. Relative to the
    /// transformation of the node corresponding to the light.
    /// 
    /// The direction is undefined for point lights. The vector
    /// may be normalized, but it needn't.
    /// ```
    public AiVector3D mDirection() {
    	return mDirection;
    }
    
    /// @see #mUp()
    public AiLight mUp(Consumer<AiVector3D> consumer) {
    	consumer.accept(mUp);
    	return this;
    }
    
    /// @see #mUp()
    public AiLight mUp(AiVector3D other) {
    	mUp.set(other);
    	return this;
    }
    
    /// ```
    /// Up direction of the light source in space. Relative to the
    /// transformation of the node corresponding to the light.
    /// 
    /// The direction is undefined for point lights. The vector
    /// may be normalized, but it needn't.
    /// ```
    public AiVector3D mUp() {
    	return mUp;
    }
    
    /// @see #mColorDiffuse()
    public AiLight mColorDiffuse(Consumer<AiColor3D> consumer) {
    	consumer.accept(mColorDiffuse);
    	return this;
    }
    
    /// @see #mColorDiffuse()
    public AiLight mColorDiffuse(AiColor3D other) {
    	mColorDiffuse.set(other);
    	return this;
    }
    
    /// ```
    /// Diffuse color of the light source
    /// 
    /// The diffuse light color is multiplied with the diffuse
    /// material color to obtain the final color that contributes
    /// to the diffuse shading term.
    /// ```
    public AiColor3D mColorDiffuse() {
    	return mColorDiffuse;
    }
    
    /// @see #mColorSpecular()
    public AiLight mColorSpecular(Consumer<AiColor3D> consumer) {
    	consumer.accept(mColorSpecular);
    	return this;
    }
    
    /// @see #mColorSpecular()
    public AiLight mColorSpecular(AiColor3D other) {
    	mColorSpecular.set(other);
    	return this;
    }
    
    /// ```
    /// Specular color of the light source
    /// 
    /// The specular light color is multiplied with the specular
    /// material color to obtain the final color that contributes
    /// to the specular shading term.
    /// ```
    public AiColor3D mColorSpecular() {
    	return mColorSpecular;
    }
    
    /// @see #mColorAmbient()
    public AiLight mColorAmbient(Consumer<AiColor3D> consumer) {
    	consumer.accept(mColorAmbient);
    	return this;
    }
    
    /// @see #mColorAmbient()
    public AiLight mColorAmbient(AiColor3D other) {
    	mColorAmbient.set(other);
    	return this;
    }
    
    /// ```
    /// Ambient color of the light source
    /// 
    /// The ambient light color is multiplied with the ambient
    /// material color to obtain the final color that contributes
    /// to the ambient shading term. Most renderers will ignore
    /// this value it, is just a remaining of the fixed-function pipeline
    /// that is still supported by quite many file formats.
    /// ```
    public AiColor3D mColorAmbient() {
    	return mColorAmbient;
    }
    
    /// @see #mSize()
    public AiLight mSize(Consumer<AiVector2D> consumer) {
    	consumer.accept(mSize);
    	return this;
    }
    
    /// @see #mSize()
    public AiLight mSize(AiVector2D other) {
    	mSize.set(other);
    	return this;
    }
    
    /// ```
    /// Size of area light source.
    /// ```
    public AiVector2D mSize() {
    	return mSize;
    }
    
    @Override
    public AiLight set(AiLight other) {
        return set(other.segment);
    }
    
    @Override
    public AiLight set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiLight> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiLight> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiLight(segment),
            count
        );
    }
    
    public static NativeStructArray<AiLight> array(Arena arena, AiLight... structs) {
        NativeStructArray<AiLight> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiLight(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiLight> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiLight(segment)
        );
    }
    
}