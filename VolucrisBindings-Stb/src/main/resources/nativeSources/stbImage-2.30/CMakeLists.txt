cmake_minimum_required(VERSION 4.0)

project(stb_image CXX)

add_library(stb_image SHARED StbImage.cpp)

install(TARGETS stb_image
    LIBRARY DESTINATION lib
    RUNTIME DESTINATION bin
    ARCHIVE DESTINATION lib
)
