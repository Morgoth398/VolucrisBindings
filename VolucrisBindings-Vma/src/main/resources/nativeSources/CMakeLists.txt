cmake_minimum_required(VERSION 4.0)

project(vma CXX)

find_package(Vulkan REQUIRED)

add_library(vma SHARED Vma.cpp)

target_include_directories(vma PRIVATE
        VulkanMemoryAllocator-3.3.0/include
        ${Vulkan_INCLUDE_DIRS}
)

target_link_libraries(vma PRIVATE Vulkan::Vulkan)

add_subdirectory(VulkanMemoryAllocator-3.3.0)
target_link_libraries(vma PRIVATE VulkanMemoryAllocator)

install(TARGETS vma
    LIBRARY DESTINATION lib
    RUNTIME DESTINATION bin
    ARCHIVE DESTINATION lib
)