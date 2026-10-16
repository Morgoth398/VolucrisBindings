#define MINIAUDIO_IMPLEMENTATION

#if defined(_WIN32)
#define MA_API __declspec(dllexport)
#elif defined(__GNUC__) && __GNUC__ >= 4
#define  MA_API __attribute__((visibility("default")))
#else
#define MA_API
#endif

#include "miniaudio.h"
