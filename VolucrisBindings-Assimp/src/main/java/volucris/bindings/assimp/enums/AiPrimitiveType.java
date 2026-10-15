/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.enums;

public final class AiPrimitiveType {

    /// ```
    /// 
    /// @brief A point primitive.
    /// 
    /// This is just a single vertex in the virtual world,
    /// #aiFace contains just one index for such a primitive.
    /// ```
    public static final int AI_PRIMITIVE_TYPE_POINT = 1;
    /// ```
    /// 
    /// @brief A line primitive.
    /// 
    /// This is a line defined through a start and an end position.
    /// #aiFace contains exactly two indices for such a primitive.
    /// ```
    public static final int AI_PRIMITIVE_TYPE_LINE = 2;
    /// ```
    /// 
    /// @brief A triangular primitive.
    /// 
    /// A triangle consists of three indices.
    /// ```
    public static final int AI_PRIMITIVE_TYPE_TRIANGLE = 4;
    /// ```
    /// 
    /// @brief A higher-level polygon with more than 3 edges.
    /// 
    /// A triangle is a polygon, but polygon in this context means
    /// "all polygons that are not triangles". The "Triangulate"-Step
    /// is provided for your convenience, it splits all polygons in
    /// triangles (which are much easier to handle).
    /// ```
    public static final int AI_PRIMITIVE_TYPE_POLYGON = 8;
    /// ```
    /// 
    /// @brief A flag to determine whether this triangles only mesh is NGON encoded.
    /// 
    /// NGON encoding is a special encoding that tells whether 2 or more consecutive triangles
    /// should be considered as a triangle fan. This is identified by looking at the first vertex index.
    /// 2 consecutive triangles with the same 1st vertex index are part of the same
    /// NGON.
    /// 
    /// At the moment, only quads (concave or convex) are supported, meaning that polygons are 'seen' as
    /// triangles, as usual after a triangulation pass.
    /// 
    /// To get an NGON encoded mesh, please use the aiProcess_Triangulate post process.
    /// 
    /// @see aiProcess_Triangulate
    /// @link https://github.com/KhronosGroup/glTF/pull/1620
    /// ```
    public static final int AI_PRIMITIVE_TYPE_NGON_ENCODING_FLAG = 16;

}