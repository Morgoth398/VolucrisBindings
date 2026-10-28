cmake_minimum_required(VERSION 4.0)

project(rpmalloc C)

set(CMAKE_C_STANDARD 11)
set(CMAKE_C_STANDARD_REQUIRED ON)

add_library(rpmalloc SHARED rpmalloc/rpmalloc.c)

if(MSVC)
    target_compile_options(rpmalloc PRIVATE /experimental:c11atomics)
    target_sources(rpmalloc PRIVATE rpmalloc.def)
endif()

install(TARGETS rpmalloc
    LIBRARY DESTINATION lib
    RUNTIME DESTINATION bin
    ARCHIVE DESTINATION lib
)