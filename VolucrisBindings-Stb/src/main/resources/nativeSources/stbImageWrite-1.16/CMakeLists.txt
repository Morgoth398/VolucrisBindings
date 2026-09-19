cmake_minimum_required(VERSION 4.0)

project(stb_image_write CXX)

add_library(stb_image_write SHARED StbImageWrite.cpp)

install(TARGETS stb_image_write
    LIBRARY DESTINATION lib
    RUNTIME DESTINATION bin
    ARCHIVE DESTINATION lib
)