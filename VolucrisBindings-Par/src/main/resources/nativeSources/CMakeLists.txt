cmake_minimum_required(VERSION 4.0)

project(par CXX)

add_library(par SHARED par_octasphere.cpp par_shapes.cpp)

install(TARGETS par
    LIBRARY DESTINATION lib
    RUNTIME DESTINATION bin
    ARCHIVE DESTINATION lib
)