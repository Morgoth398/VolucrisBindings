#if defined(_WIN32)
#define STBIWDEF extern "C" __declspec(dllexport)
#elif defined(__GNUC__) && __GNUC__ >= 4
#define  STBIWDEF extern "C" __attribute__((visibility("default")))
#else
#define STBIWDEF extern "C"
#endif

#define STB_IMAGE_WRITE_IMPLEMENTATION
#include "stb_image_write.h"