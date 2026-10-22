cmake_minimum_required(VERSION 4.0)

project(stb_vorbis C)

set(CMAKE_WINDOWS_EXPORT_ALL_SYMBOLS ON)
set(CMAKE_MSVC_RUNTIME_LIBRARY "MultiThreadedDLL")

add_library(stb_vorbis SHARED stb_vorbis.c)

install(TARGETS stb_vorbis
    LIBRARY DESTINATION lib
    RUNTIME DESTINATION bin
    ARCHIVE DESTINATION lib
)