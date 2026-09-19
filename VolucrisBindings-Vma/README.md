# VMA
This example can only be used together with vulkan.
```Java
public static void main(String[] args) {

	VMALoader.loadNativeLibrary();

	try (Arena arena = MemoryStack.stackPush()) {
		/// Create the allocator
		VmaVulkanFunctions vmaVulkanFunctions = new VmaVulkanFunctions(arena)
				.populate(VULKAN_INSTANCE); // Pass your vulkan instance

		VmaAllocatorCreateInfo vmaAllocatorCreateInfo = new VmaAllocatorCreateInfo(arena)
				.flags(VmaAllocatorCreateFlagBits.VMA_ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT)
				.vulkanApiVersion(VULKAN_API_VERSION) // Pass your vulkan api version
				.physicalDevice(PHYSICAL_DEVICE) // Pass the physical device you selected on startup
				.device(LOGICAL_DEVICE) // Pass the logical device created from the selected physical device
				.instance(VULKAN_INSTANCE) // Pass your vulkan instance
				.pVulkanFunctions(vmaVulkanFunctions);

		NativePointerArray vmaAllocatorPointer = new NativePointerArray(arena, 1);

		if (VMA.vmaCreateAllocator(vmaAllocatorCreateInfo, vmaAllocatorPointer) != VkResult.VK_SUCCESS)
			throw new RuntimeException("Failed to create vma allocator.");

		VmaAllocator vmaAllocator = new VmaAllocator(vmaAllocatorPointer.get(0));

		/// Create a buffer
		VkBufferCreateInfo vkBufferCreateInfo = new VkBufferCreateInfo(arena)
				.sType(VkStructureType.VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO)
				.size(BUFFER_SIZE) /// Some buffer size. Must never be 0.
				.usage(BUFFER_USGAE) /// The usage of the buffer. See VkBufferUsageFlagBits
				.sharingMode(VkSharingMode.VK_SHARING_MODE_EXCLUSIVE) /// Most of the time this is sufficient
				.queueFamilyIndexCount(1)
				.pQueueFamilyIndices(
						new NativeIntArray(
								arena,
								GRAPHICS_QUEUE_FAMILY_INDEX /// The index of the graphics queue of the application
						)
				);

		VmaAllocationCreateInfo vmaAllocationCreateInfo = new VmaAllocationCreateInfo(arena)
				.usage(VmaMemoryUsage.VMA_MEMORY_USAGE_AUTO)
				.flags(VMA_FLAGS); /// See VmaAllocationCreateFlagBits

		VmaAllocationInfo vmaAllocationInfo = new VmaAllocationInfo(arena);

		NativePointerArray bufferPointer = new NativePointerArray(arena, 1);
		NativePointerArray allocationPointer = new NativePointerArray(arena, 1);

		int errorCode = VMA.vmaCreateBuffer(
				vmaAllocator,
				vkBufferCreateInfo,
				vmaAllocationCreateInfo,
				bufferPointer,
				allocationPointer,
				vmaAllocationInfo
		);
		
		if (errorCode != VkResult.VK_SUCCESS)
			throw new RuntimeException("Failed to create vulkan buffer.");

		VkBuffer vkBuffer = new VkBuffer(bufferPointer.get(0));
		VmaAllocation vmaAllocation = new VmaAllocation(allocationPointer.get(0));
		
		/// Do something with it

		/// Destroy the buffer when no longer needed
		VMA.vmaDestroyBuffer(vmaAllocator, vkBuffer, vmaAllocation);
	}
}
```