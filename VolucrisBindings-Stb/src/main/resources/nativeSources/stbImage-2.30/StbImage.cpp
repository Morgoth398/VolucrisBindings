#define STB_IMAGE_IMPLEMENTATION

#if defined(_WIN32)
#define STBIDEF __declspec(dllexport)
#elif defined(__GNUC__) && __GNUC__ >= 4
#define  STBIDEF __attribute__((visibility("default")))
#else
#define STBIDEF
#endif

#include "stb_image.h"