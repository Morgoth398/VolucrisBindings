cmake_minimum_required(VERSION 4.0)

set(CMAKE_INTERMEDIATE_DIR_STRATEGY "HASH")

project(glad CXX)

add_library(glad SHARED Glad.cpp)

target_include_directories(glad PRIVATE
        include
        src
)

install(TARGETS glad
    LIBRARY DESTINATION lib
    RUNTIME DESTINATION bin
    ARCHIVE DESTINATION lib
)