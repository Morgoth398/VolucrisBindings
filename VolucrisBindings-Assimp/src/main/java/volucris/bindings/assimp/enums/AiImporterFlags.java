/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.enums;

public final class AiImporterFlags {

    /// ```
    /// Indicates that there is a textual encoding of the
    /// file format; and that it is supported.
    /// ```
    public static final int AI_IMPORTER_FLAGS_SUPPORT_TEXT_FLAVOUR = 1;
    /// ```
    /// Indicates that there is a binary encoding of the
    /// file format; and that it is supported.
    /// ```
    public static final int AI_IMPORTER_FLAGS_SUPPORT_BINARY_FLAVOUR = 2;
    /// ```
    /// Indicates that there is a compressed encoding of the
    /// file format; and that it is supported.
    /// ```
    public static final int AI_IMPORTER_FLAGS_SUPPORT_COMPRESSED_FLAVOUR = 4;
    /// ```
    /// Indicates that the importer reads only a very particular
    /// subset of the file format. This happens commonly for
    /// declarative or procedural formats which cannot easily
    /// be mapped to #aiScene
    /// ```
    public static final int AI_IMPORTER_FLAGS_LIMITED_SUPPORT = 8;
    /// ```
    /// Indicates that the importer is highly experimental and
    /// should be used with care. This only happens for trunk
    /// (i.e. SVN) versions, experimental code is not included
    /// in releases.
    /// ```
    public static final int AI_IMPORTER_FLAGS_EXPERIMENTAL = 16;

}