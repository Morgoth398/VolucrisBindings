# Miniaudio
```Java
public static void main(String[] args) {

	MiniaudioLoader.loadNativeLibrary();

	try (Arena arena = Arena.ofConfined()) {
		MaEngine maEngine = new MaEngine(arena);

		int result = Miniaudio.ma_engine_init(null, maEngine);

		if (result != MaResult.MA_SUCCESS)
			throw new RuntimeException("Failed to initialize the engine: " + result);

		MaSound maSound = new MaSound(arena);

		result = Miniaudio.ma_sound_init_from_file(
				maEngine, "some_sound.wav", 0, null, null, maSound
		);

		if (result != MaResult.MA_SUCCESS)
			throw new RuntimeException("Failed to create sound: " + result);

		result = Miniaudio.ma_sound_start(maSound);

		if (result != MaResult.MA_SUCCESS)
			throw new RuntimeException("Failed to play sound: " + result);

		while (Miniaudio.ma_sound_is_playing(maSound) == Miniaudio.MA_TRUE) {

		}

		Miniaudio.ma_engine_uninit(maEngine);
	}
}
```