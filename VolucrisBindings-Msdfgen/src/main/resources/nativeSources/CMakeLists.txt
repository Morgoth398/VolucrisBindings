cmake_minimum_required(VERSION 4.0)

project(msdfgen CXX)

set(CMAKE_POSITION_INDEPENDENT_CODE ON)

file(GLOB_RECURSE MSDFGEN_SOURCES CONFIGURE_DEPENDS
        **/*.cpp
)

add_library(msdfgen SHARED ${MSDFGEN_SOURCES})

target_include_directories(msdfgen PRIVATE
        ${CMAKE_CURRENT_SOURCE_DIR}
        ext
        core
        freetype-2.14.3/include
)

add_subdirectory(freetype-2.14.3)
target_link_libraries(msdfgen PRIVATE freetype)

install(TARGETS msdfgen
    LIBRARY DESTINATION lib
    RUNTIME DESTINATION bin
    ARCHIVE DESTINATION lib
)

