/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma;

public final class VmaDefragmentationMoveOperation {

    /// ```Buffer/image has been recreated at `dstTmpAllocation`, data has been copied, old buffer/image has been destroyed. `srcAllocation` should be changed to point to the new place. This is the default value set by vmaBeginDefragmentationPass().```
    public static final int VMA_DEFRAGMENTATION_MOVE_OPERATION_COPY = 0;
    /// ```Set this value if you cannot move the allocation. New place reserved at `dstTmpAllocation` will be freed. `srcAllocation` will remain unchanged.```
    public static final int VMA_DEFRAGMENTATION_MOVE_OPERATION_IGNORE = 1;
    /// ```Set this value if you decide to abandon the allocation and you destroyed the buffer/image. New place reserved at `dstTmpAllocation` will be freed, along with `srcAllocation`, which will be destroyed.```
    public static final int VMA_DEFRAGMENTATION_MOVE_OPERATION_DESTROY = 2;

}