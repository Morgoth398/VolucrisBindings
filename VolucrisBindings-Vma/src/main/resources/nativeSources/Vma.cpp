#if defined(_WIN32)
#define VMA_CALL_PRE  __declspec(dllexport)
#define VMA_CALL_POST __cdecl
#elif defined(__GNUC__) && __GNUC__ >= 4
#define VMA_CALL_PRE  __attribute__((visibility("default")))
#define VMA_CALL_POST
#else
#define VMA_CALL_PRE
#define VMA_CALL_POST
#endif

#define VMA_IMPLEMENTATION
#include "vk_mem_alloc.h"