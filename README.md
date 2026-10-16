# VolucrisBindings
This project provides Java Bindings for various C/C++ libraries using the Java FFM API.

Each binding has a dependency on the Core-Module. It contains the utility class [FFMUtils](./VolucrisBindings-Core/src/main/java/volucris/bindings/core/FFMUtils.java) used for loading native functions and functions pointers as well as `Native*Array` classes as a replacement for the old buffer api.

# Supported Platforms
Windows (x64), Linux (x64 and arm64) and Mac (x64 and arm64) are directly supported. 

All native libraries were build using github workflows that can be found in this [folder](./.github/workflows/).

# Getting Started
All bindings require Java 26 and preview features enabled.

Due to the introduction of [restricted methods](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/doc-files/RestrictedMethods.html), it is recommended (and in later versions required) to run applications using these bindings with the VM argument ```--enable-native-access=ALL-UNNAMED```.

For examples on how to use each bindings see the `README.md` in the respective module.

# Building The Project
1. Download [Java 26](https://www.oracle.com/de/java/technologies/downloads/)
2. Download the sources or clone the repo

### Using The Terminal

3. Install [Maven](https://maven.apache.org/download.cgi)
4. Open the terminal in the directory of the downloaded project
5. Run the goal `mvn package`.
6. The output is in the `target/` folders of each module

### Using An IDE

3. Import the project in an IDE of your choice as a maven project
	- [IntelliJ](https://www.jetbrains.com/guide/java/tutorials/working-with-maven/importing-a-project/)
	- [Eclipse](https://www.lagomframework.com/documentation/1.6.x/java/EclipseMavenInt.html)
4. Create a new maven run configuration and add the goal `mvn package`
	- [IntelliJ](https://www.jetbrains.com/help/idea/run-debug-configuration-maven.html)
	- [Eclipse](https://www.genuitec.com/docs/assembly/setting-up-maven-launch-configurations/)
5. Run the created configuration
6. The output is also in the `target/` folders of each module

If you are using the Eclipse IDE, you do not need to build the project explicitly. You can import this project into a workspace and just add the Maven coordinates into the `pom.xml` file of any other Maven project in the same workspace. This works as Eclipse can resolve Maven dependencies directly from the workspace, without requiring the project to be installed into the local Maven repository.

# Available Bindings

| Library | Version | Notes |
|---|---|---|
| [Assimp](https://github.com/assimp/assimp) | 6.0.5 | Open Asset Import Library is a library that loads various 3D file formats into a shared, in-memory format. It supports more than 40 file formats for import and a growing selection of file formats for export. |
| [FastNoise2](https://github.com/Auburn/FastNoise2) | 1.1.1 | Modular node based noise generation library using SIMD, focused on performance [...] and designed with ease of use in mind. |
| [GLFW](https://github.com/glfw/glfw) | 3.4 | GLFW is an Open Source, multi-platform library for OpenGL, OpenGL ES and Vulkan application development. It provides a simple, platform-independent API for creating windows, contexts and surfaces, reading input, handling events, etc.|
| [Msdfgen](https://github.com/Chlumsky/msdfgen) | 1.13 | This is a utility for generating signed distance fields from vector shapes and font glyphs, which serve as a texture representation that can be used in real-time graphics to efficiently reproduce said shapes. The C wrapper was taken from [LWJGL](https://github.com/LWJGL/lwjgl3) |
| [OpenGL](https://www.khronos.org/opengl/) | - | OpenGL (Open Graphics Library) is a cross-language, cross-platform application programming interface (API) for rendering 2D and 3D vector graphics.|
| [ParShapes](https://github.com/prideout/par/blob/master/par_shapes.h) | - | Generate parametric surfaces and other simple shapes |
| [ParOctasphere](https://github.com/prideout/par/blob/master/par_octasphere.h) | - | Malloc-free mesh gen for spheres and rounded cuboids 	 |
| [StbImage](https://github.com/nothings/stb/blob/master/stb_image.h) | 2.30 | Image loading/decoding from file/memory: JPG, PNG, TGA, BMP, PSD, GIF, HDR, PIC |
| [StbImageWrite](https://github.com/nothings/stb/blob/master/stb_image_write.h) | 1.16 | Image writing to disk: PNG, TGA, BMP |
| [Vma](https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator) | 3.3.0 | Easy to integrate Vulkan memory allocation library. |
| [Vulkan](https://www.vulkan.org/) | 1.4.357.0 | Vulkan® is a modern cross-platform graphics and compute API that provides high-efficiency, cross-platform access to modern GPUs used in a wide variety of devices from PCs and consoles to mobile phones and embedded platforms.  |
| [Yoga](https://github.com/react/yoga) | 3.2.1 | Yoga is an embeddable and performant flexbox layout engine |
| [Libclang](https://github.com/llvm/llvm-project) | 23.1.3 | The C Interface to Clang provides a relatively small API that exposes facilities for parsing source code into an abstract syntax tree (AST), loading already-parsed ASTs, traversing the AST, associating physical source locations with elements within the AST, and other facilities that support Clang-based development tools. |
| [Miniaudio](https://github.com/mackron/miniaudio) | 0.11.25 | Audio playback and capture library written in C, in a single source file. |

# Other Bindings
| Library | Bindings | Version | Notes |
|---|---|---|---|
| [JoltPhysics](https://github.com/jrouwe/joltphysics) | [JoltPhysics-JavaFFM](https://github.com/Morgoth398/JoltPhysics-JavaFFM) | 5.6.0 | A multi core friendly rigid body physics and collision detection library. Suitable for games and VR applications. Used by Horizon Forbidden West and Death Stranding 2: On the Beach.
| [Box2D](https://github.com/erincatto/box2d) | [Box2D-JavaFFM](https://github.com/Morgoth398/Box2D-JavaFFM) | 3.1.1 | Box2D is a 2D physics engine for games.
| [Box3D](https://github.com/erincatto/box3d) | [Box3D-JavaFFM](https://github.com/Morgoth398/Box3D-JavaFFM) | 0.1.0 | Box3D is a 3D physics engine for games
