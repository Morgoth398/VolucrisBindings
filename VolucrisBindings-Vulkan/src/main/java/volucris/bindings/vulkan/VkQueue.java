/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

public final class VkQueue {

    private final LazyConstant<MethodHandle> VK_QUEUE_SUBMIT;
    private final LazyConstant<MethodHandle> VK_QUEUE_WAIT_IDLE;
    private final LazyConstant<MethodHandle> VK_QUEUE_BIND_SPARSE;
    private final LazyConstant<MethodHandle> VK_QUEUE_SUBMIT2;
    private final LazyConstant<MethodHandle> VK_QUEUE_PRESENT_KHR;
    private final LazyConstant<MethodHandle> VK_QUEUE_BEGIN_DEBUG_UTILS_LABEL_EXT;
    private final LazyConstant<MethodHandle> VK_QUEUE_END_DEBUG_UTILS_LABEL_EXT;
    private final LazyConstant<MethodHandle> VK_QUEUE_INSERT_DEBUG_UTILS_LABEL_EXT;
    private final LazyConstant<MethodHandle> VK_GET_QUEUE_CHECKPOINT_DATA_NV;
    private final LazyConstant<MethodHandle> VK_GET_QUEUE_CHECKPOINT_DATA2_NV;
    private final LazyConstant<MethodHandle> VK_QUEUE_SET_PERFORMANCE_CONFIGURATION_INTEL;
    private final LazyConstant<MethodHandle> VK_QUEUE_SET_PERF_HINT_QCOM;
    private final LazyConstant<MethodHandle> VK_QUEUE_NOTIFY_OUT_OF_BAND_LEGACY_NV;
    private final LazyConstant<MethodHandle> VK_QUEUE_NOTIFY_OUT_OF_BAND_NV;

    private final MemorySegment segment;

    static {

    }

    /**
     * This constructor must not be used. It will always throw an UnsupportedOperationException.
     * The constructor only exists to fix some compiler errors caused by generating all sources.
     * If a struct contains an address to a queue (e.g. VkExternalComputeQueueCreateInfoNV) the getter
     * for this field must not be used as it will call this constructor.
     */
    public VkQueue(MemorySegment segment) {
        throw new UnsupportedOperationException(
            "Cannot create a VkQueue this way. Fetch the segment and create the queue manually."
        );
    }

    public VkQueue(MemorySegment segment, VkDevice vkDevice) {
        this.segment = segment;

        VK_QUEUE_SUBMIT = vkDevice.VK_QUEUE_SUBMIT();
        VK_QUEUE_WAIT_IDLE = vkDevice.VK_QUEUE_WAIT_IDLE();
        VK_QUEUE_BIND_SPARSE = vkDevice.VK_QUEUE_BIND_SPARSE();
        VK_QUEUE_SUBMIT2 = vkDevice.VK_QUEUE_SUBMIT2();
        VK_QUEUE_PRESENT_KHR = vkDevice.VK_QUEUE_PRESENT_KHR();
        VK_QUEUE_BEGIN_DEBUG_UTILS_LABEL_EXT = vkDevice.VK_QUEUE_BEGIN_DEBUG_UTILS_LABEL_EXT();
        VK_QUEUE_END_DEBUG_UTILS_LABEL_EXT = vkDevice.VK_QUEUE_END_DEBUG_UTILS_LABEL_EXT();
        VK_QUEUE_INSERT_DEBUG_UTILS_LABEL_EXT = vkDevice.VK_QUEUE_INSERT_DEBUG_UTILS_LABEL_EXT();
        VK_GET_QUEUE_CHECKPOINT_DATA_NV = vkDevice.VK_GET_QUEUE_CHECKPOINT_DATA_NV();
        VK_GET_QUEUE_CHECKPOINT_DATA2_NV = vkDevice.VK_GET_QUEUE_CHECKPOINT_DATA2_NV();
        VK_QUEUE_SET_PERFORMANCE_CONFIGURATION_INTEL = vkDevice.VK_QUEUE_SET_PERFORMANCE_CONFIGURATION_INTEL();
        VK_QUEUE_SET_PERF_HINT_QCOM = vkDevice.VK_QUEUE_SET_PERF_HINT_QCOM();
        VK_QUEUE_NOTIFY_OUT_OF_BAND_LEGACY_NV = vkDevice.VK_QUEUE_NOTIFY_OUT_OF_BAND_LEGACY_NV();
        VK_QUEUE_NOTIFY_OUT_OF_BAND_NV = vkDevice.VK_QUEUE_NOTIFY_OUT_OF_BAND_NV();
    }
    
    public final LazyConstant<MethodHandle> VK_QUEUE_SUBMIT() {
        return VK_QUEUE_SUBMIT;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_WAIT_IDLE() {
        return VK_QUEUE_WAIT_IDLE;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_BIND_SPARSE() {
        return VK_QUEUE_BIND_SPARSE;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_SUBMIT2() {
        return VK_QUEUE_SUBMIT2;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_PRESENT_KHR() {
        return VK_QUEUE_PRESENT_KHR;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_BEGIN_DEBUG_UTILS_LABEL_EXT() {
        return VK_QUEUE_BEGIN_DEBUG_UTILS_LABEL_EXT;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_END_DEBUG_UTILS_LABEL_EXT() {
        return VK_QUEUE_END_DEBUG_UTILS_LABEL_EXT;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_INSERT_DEBUG_UTILS_LABEL_EXT() {
        return VK_QUEUE_INSERT_DEBUG_UTILS_LABEL_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_QUEUE_CHECKPOINT_DATA_NV() {
        return VK_GET_QUEUE_CHECKPOINT_DATA_NV;
    }

    public final LazyConstant<MethodHandle> VK_GET_QUEUE_CHECKPOINT_DATA2_NV() {
        return VK_GET_QUEUE_CHECKPOINT_DATA2_NV;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_SET_PERFORMANCE_CONFIGURATION_INTEL() {
        return VK_QUEUE_SET_PERFORMANCE_CONFIGURATION_INTEL;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_SET_PERF_HINT_QCOM() {
        return VK_QUEUE_SET_PERF_HINT_QCOM;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_NOTIFY_OUT_OF_BAND_LEGACY_NV() {
        return VK_QUEUE_NOTIFY_OUT_OF_BAND_LEGACY_NV;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_NOTIFY_OUT_OF_BAND_NV() {
        return VK_QUEUE_NOTIFY_OUT_OF_BAND_NV;
    }

    public MemorySegment memorySegment() {
        return segment;
    }

}