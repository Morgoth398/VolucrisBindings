cmake_minimum_required(VERSION 4.0)

project(miniaudio CXX)

add_library(miniaudio SHARED miniaudio.cpp)

install(TARGETS miniaudio
    LIBRARY DESTINATION lib
    RUNTIME DESTINATION bin
    ARCHIVE DESTINATION lib
)