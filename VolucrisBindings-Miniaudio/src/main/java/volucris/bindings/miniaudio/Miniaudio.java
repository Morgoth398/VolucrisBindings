/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.MemoryStack;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeShortArray;
import volucris.bindings.miniaudio.callbacks.*;
import volucris.bindings.miniaudio.structs.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Miniaudio {

	public static final int MA_TRUE = 1;
	public static final int MA_FALSE = 0;

	private static final LazyConstant<MethodHandle> MA_VERSION;
	private static final LazyConstant<MethodHandle> MA_VERSION_STRING;
	private static final LazyConstant<MethodHandle> MA_LOG_CALLBACK_INIT;
	private static final LazyConstant<MethodHandle> MA_LOG_INIT;
	private static final LazyConstant<MethodHandle> MA_LOG_UNINIT;
	private static final LazyConstant<MethodHandle> MA_LOG_REGISTER_CALLBACK;
	private static final LazyConstant<MethodHandle> MA_LOG_UNREGISTER_CALLBACK;
	private static final LazyConstant<MethodHandle> MA_LOG_POST;
	private static final LazyConstant<MethodHandle> MA_LOG_POSTV;
	private static final LazyConstant<MethodHandle> MA_LOG_POSTF;
	private static final LazyConstant<MethodHandle> MA_BIQUAD_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_BIQUAD_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_BIQUAD_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_BIQUAD_INIT;
	private static final LazyConstant<MethodHandle> MA_BIQUAD_UNINIT;
	private static final LazyConstant<MethodHandle> MA_BIQUAD_REINIT;
	private static final LazyConstant<MethodHandle> MA_BIQUAD_CLEAR_CACHE;
	private static final LazyConstant<MethodHandle> MA_BIQUAD_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_BIQUAD_GET_LATENCY;
	private static final LazyConstant<MethodHandle> MA_LPF1_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_LPF2_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_LPF1_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_LPF1_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_LPF1_INIT;
	private static final LazyConstant<MethodHandle> MA_LPF1_UNINIT;
	private static final LazyConstant<MethodHandle> MA_LPF1_REINIT;
	private static final LazyConstant<MethodHandle> MA_LPF1_CLEAR_CACHE;
	private static final LazyConstant<MethodHandle> MA_LPF1_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_LPF1_GET_LATENCY;
	private static final LazyConstant<MethodHandle> MA_LPF2_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_LPF2_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_LPF2_INIT;
	private static final LazyConstant<MethodHandle> MA_LPF2_UNINIT;
	private static final LazyConstant<MethodHandle> MA_LPF2_REINIT;
	private static final LazyConstant<MethodHandle> MA_LPF2_CLEAR_CACHE;
	private static final LazyConstant<MethodHandle> MA_LPF2_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_LPF2_GET_LATENCY;
	private static final LazyConstant<MethodHandle> MA_LPF_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_LPF_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_LPF_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_LPF_INIT;
	private static final LazyConstant<MethodHandle> MA_LPF_UNINIT;
	private static final LazyConstant<MethodHandle> MA_LPF_REINIT;
	private static final LazyConstant<MethodHandle> MA_LPF_CLEAR_CACHE;
	private static final LazyConstant<MethodHandle> MA_LPF_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_LPF_GET_LATENCY;
	private static final LazyConstant<MethodHandle> MA_HPF1_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_HPF2_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_HPF1_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_HPF1_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_HPF1_INIT;
	private static final LazyConstant<MethodHandle> MA_HPF1_UNINIT;
	private static final LazyConstant<MethodHandle> MA_HPF1_REINIT;
	private static final LazyConstant<MethodHandle> MA_HPF1_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_HPF1_GET_LATENCY;
	private static final LazyConstant<MethodHandle> MA_HPF2_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_HPF2_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_HPF2_INIT;
	private static final LazyConstant<MethodHandle> MA_HPF2_UNINIT;
	private static final LazyConstant<MethodHandle> MA_HPF2_REINIT;
	private static final LazyConstant<MethodHandle> MA_HPF2_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_HPF2_GET_LATENCY;
	private static final LazyConstant<MethodHandle> MA_HPF_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_HPF_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_HPF_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_HPF_INIT;
	private static final LazyConstant<MethodHandle> MA_HPF_UNINIT;
	private static final LazyConstant<MethodHandle> MA_HPF_REINIT;
	private static final LazyConstant<MethodHandle> MA_HPF_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_HPF_GET_LATENCY;
	private static final LazyConstant<MethodHandle> MA_BPF2_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_BPF2_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_BPF2_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_BPF2_INIT;
	private static final LazyConstant<MethodHandle> MA_BPF2_UNINIT;
	private static final LazyConstant<MethodHandle> MA_BPF2_REINIT;
	private static final LazyConstant<MethodHandle> MA_BPF2_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_BPF2_GET_LATENCY;
	private static final LazyConstant<MethodHandle> MA_BPF_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_BPF_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_BPF_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_BPF_INIT;
	private static final LazyConstant<MethodHandle> MA_BPF_UNINIT;
	private static final LazyConstant<MethodHandle> MA_BPF_REINIT;
	private static final LazyConstant<MethodHandle> MA_BPF_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_BPF_GET_LATENCY;
	private static final LazyConstant<MethodHandle> MA_NOTCH2_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_NOTCH2_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_NOTCH2_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_NOTCH2_INIT;
	private static final LazyConstant<MethodHandle> MA_NOTCH2_UNINIT;
	private static final LazyConstant<MethodHandle> MA_NOTCH2_REINIT;
	private static final LazyConstant<MethodHandle> MA_NOTCH2_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_NOTCH2_GET_LATENCY;
	private static final LazyConstant<MethodHandle> MA_PEAK2_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_PEAK2_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_PEAK2_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_PEAK2_INIT;
	private static final LazyConstant<MethodHandle> MA_PEAK2_UNINIT;
	private static final LazyConstant<MethodHandle> MA_PEAK2_REINIT;
	private static final LazyConstant<MethodHandle> MA_PEAK2_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_PEAK2_GET_LATENCY;
	private static final LazyConstant<MethodHandle> MA_LOSHELF2_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_LOSHELF2_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_LOSHELF2_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_LOSHELF2_INIT;
	private static final LazyConstant<MethodHandle> MA_LOSHELF2_UNINIT;
	private static final LazyConstant<MethodHandle> MA_LOSHELF2_REINIT;
	private static final LazyConstant<MethodHandle> MA_LOSHELF2_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_LOSHELF2_GET_LATENCY;
	private static final LazyConstant<MethodHandle> MA_HISHELF2_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_HISHELF2_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_HISHELF2_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_HISHELF2_INIT;
	private static final LazyConstant<MethodHandle> MA_HISHELF2_UNINIT;
	private static final LazyConstant<MethodHandle> MA_HISHELF2_REINIT;
	private static final LazyConstant<MethodHandle> MA_HISHELF2_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_HISHELF2_GET_LATENCY;
	private static final LazyConstant<MethodHandle> MA_DELAY_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_DELAY_INIT;
	private static final LazyConstant<MethodHandle> MA_DELAY_UNINIT;
	private static final LazyConstant<MethodHandle> MA_DELAY_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_DELAY_SET_WET;
	private static final LazyConstant<MethodHandle> MA_DELAY_GET_WET;
	private static final LazyConstant<MethodHandle> MA_DELAY_SET_DRY;
	private static final LazyConstant<MethodHandle> MA_DELAY_GET_DRY;
	private static final LazyConstant<MethodHandle> MA_DELAY_SET_DECAY;
	private static final LazyConstant<MethodHandle> MA_DELAY_GET_DECAY;
	private static final LazyConstant<MethodHandle> MA_GAINER_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_GAINER_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_GAINER_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_GAINER_INIT;
	private static final LazyConstant<MethodHandle> MA_GAINER_UNINIT;
	private static final LazyConstant<MethodHandle> MA_GAINER_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_GAINER_SET_GAIN;
	private static final LazyConstant<MethodHandle> MA_GAINER_SET_GAINS;
	private static final LazyConstant<MethodHandle> MA_GAINER_SET_MASTER_VOLUME;
	private static final LazyConstant<MethodHandle> MA_GAINER_GET_MASTER_VOLUME;
	private static final LazyConstant<MethodHandle> MA_PANNER_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_PANNER_INIT;
	private static final LazyConstant<MethodHandle> MA_PANNER_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_PANNER_SET_MODE;
	private static final LazyConstant<MethodHandle> MA_PANNER_GET_MODE;
	private static final LazyConstant<MethodHandle> MA_PANNER_SET_PAN;
	private static final LazyConstant<MethodHandle> MA_PANNER_GET_PAN;
	private static final LazyConstant<MethodHandle> MA_FADER_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_FADER_INIT;
	private static final LazyConstant<MethodHandle> MA_FADER_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_FADER_GET_DATA_FORMAT;
	private static final LazyConstant<MethodHandle> MA_FADER_SET_FADE;
	private static final LazyConstant<MethodHandle> MA_FADER_SET_FADE_EX;
	private static final LazyConstant<MethodHandle> MA_FADER_GET_CURRENT_VOLUME;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_INIT;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_UNINIT;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_GET_CHANNEL_MAP;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_SET_CONE;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_GET_CONE;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_SET_POSITION;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_GET_POSITION;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_SET_DIRECTION;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_GET_DIRECTION;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_SET_VELOCITY;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_GET_VELOCITY;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_SET_SPEED_OF_SOUND;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_GET_SPEED_OF_SOUND;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_SET_WORLD_UP;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_GET_WORLD_UP;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_SET_ENABLED;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_LISTENER_IS_ENABLED;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_INIT;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_UNINIT;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_SET_MASTER_VOLUME;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_GET_MASTER_VOLUME;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_GET_INPUT_CHANNELS;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_GET_OUTPUT_CHANNELS;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_SET_ATTENUATION_MODEL;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_GET_ATTENUATION_MODEL;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_SET_POSITIONING;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_GET_POSITIONING;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_SET_ROLLOFF;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_GET_ROLLOFF;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_SET_MIN_GAIN;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_GET_MIN_GAIN;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_SET_MAX_GAIN;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_GET_MAX_GAIN;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_SET_MIN_DISTANCE;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_GET_MIN_DISTANCE;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_SET_MAX_DISTANCE;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_GET_MAX_DISTANCE;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_SET_CONE;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_GET_CONE;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_SET_DOPPLER_FACTOR;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_GET_DOPPLER_FACTOR;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_SET_DIRECTIONAL_ATTENUATION_FACTOR;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_GET_DIRECTIONAL_ATTENUATION_FACTOR;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_SET_POSITION;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_GET_POSITION;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_SET_DIRECTION;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_GET_DIRECTION;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_SET_VELOCITY;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_GET_VELOCITY;
	private static final LazyConstant<MethodHandle> MA_SPATIALIZER_GET_RELATIVE_POSITION_AND_DIRECTION;
	private static final LazyConstant<MethodHandle> MA_LINEAR_RESAMPLER_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_LINEAR_RESAMPLER_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_LINEAR_RESAMPLER_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_LINEAR_RESAMPLER_INIT;
	private static final LazyConstant<MethodHandle> MA_LINEAR_RESAMPLER_UNINIT;
	private static final LazyConstant<MethodHandle> MA_LINEAR_RESAMPLER_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_LINEAR_RESAMPLER_SET_RATE;
	private static final LazyConstant<MethodHandle> MA_LINEAR_RESAMPLER_SET_RATE_RATIO;
	private static final LazyConstant<MethodHandle> MA_LINEAR_RESAMPLER_GET_INPUT_LATENCY;
	private static final LazyConstant<MethodHandle> MA_LINEAR_RESAMPLER_GET_OUTPUT_LATENCY;
	private static final LazyConstant<MethodHandle> MA_LINEAR_RESAMPLER_GET_REQUIRED_INPUT_FRAME_COUNT;
	private static final LazyConstant<MethodHandle> MA_LINEAR_RESAMPLER_GET_EXPECTED_OUTPUT_FRAME_COUNT;
	private static final LazyConstant<MethodHandle> MA_LINEAR_RESAMPLER_RESET;
	private static final LazyConstant<MethodHandle> MA_RESAMPLER_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_RESAMPLER_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_RESAMPLER_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_RESAMPLER_INIT;
	private static final LazyConstant<MethodHandle> MA_RESAMPLER_UNINIT;
	private static final LazyConstant<MethodHandle> MA_RESAMPLER_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_RESAMPLER_SET_RATE;
	private static final LazyConstant<MethodHandle> MA_RESAMPLER_SET_RATE_RATIO;
	private static final LazyConstant<MethodHandle> MA_RESAMPLER_GET_INPUT_LATENCY;
	private static final LazyConstant<MethodHandle> MA_RESAMPLER_GET_OUTPUT_LATENCY;
	private static final LazyConstant<MethodHandle> MA_RESAMPLER_GET_REQUIRED_INPUT_FRAME_COUNT;
	private static final LazyConstant<MethodHandle> MA_RESAMPLER_GET_EXPECTED_OUTPUT_FRAME_COUNT;
	private static final LazyConstant<MethodHandle> MA_RESAMPLER_RESET;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_CONVERTER_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_CONVERTER_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_CONVERTER_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_CONVERTER_INIT;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_CONVERTER_UNINIT;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_CONVERTER_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_CONVERTER_GET_INPUT_CHANNEL_MAP;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_CONVERTER_GET_OUTPUT_CHANNEL_MAP;
	private static final LazyConstant<MethodHandle> MA_DATA_CONVERTER_CONFIG_INIT_DEFAULT;
	private static final LazyConstant<MethodHandle> MA_DATA_CONVERTER_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_DATA_CONVERTER_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_DATA_CONVERTER_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_DATA_CONVERTER_INIT;
	private static final LazyConstant<MethodHandle> MA_DATA_CONVERTER_UNINIT;
	private static final LazyConstant<MethodHandle> MA_DATA_CONVERTER_PROCESS_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_DATA_CONVERTER_SET_RATE;
	private static final LazyConstant<MethodHandle> MA_DATA_CONVERTER_SET_RATE_RATIO;
	private static final LazyConstant<MethodHandle> MA_DATA_CONVERTER_GET_INPUT_LATENCY;
	private static final LazyConstant<MethodHandle> MA_DATA_CONVERTER_GET_OUTPUT_LATENCY;
	private static final LazyConstant<MethodHandle> MA_DATA_CONVERTER_GET_REQUIRED_INPUT_FRAME_COUNT;
	private static final LazyConstant<MethodHandle> MA_DATA_CONVERTER_GET_EXPECTED_OUTPUT_FRAME_COUNT;
	private static final LazyConstant<MethodHandle> MA_DATA_CONVERTER_GET_INPUT_CHANNEL_MAP;
	private static final LazyConstant<MethodHandle> MA_DATA_CONVERTER_GET_OUTPUT_CHANNEL_MAP;
	private static final LazyConstant<MethodHandle> MA_DATA_CONVERTER_RESET;
	private static final LazyConstant<MethodHandle> MA_PCM_U8_TO_S16;
	private static final LazyConstant<MethodHandle> MA_PCM_U8_TO_S24;
	private static final LazyConstant<MethodHandle> MA_PCM_U8_TO_S32;
	private static final LazyConstant<MethodHandle> MA_PCM_U8_TO_F32;
	private static final LazyConstant<MethodHandle> MA_PCM_S16_TO_U8;
	private static final LazyConstant<MethodHandle> MA_PCM_S16_TO_S24;
	private static final LazyConstant<MethodHandle> MA_PCM_S16_TO_S32;
	private static final LazyConstant<MethodHandle> MA_PCM_S16_TO_F32;
	private static final LazyConstant<MethodHandle> MA_PCM_S24_TO_U8;
	private static final LazyConstant<MethodHandle> MA_PCM_S24_TO_S16;
	private static final LazyConstant<MethodHandle> MA_PCM_S24_TO_S32;
	private static final LazyConstant<MethodHandle> MA_PCM_S24_TO_F32;
	private static final LazyConstant<MethodHandle> MA_PCM_S32_TO_U8;
	private static final LazyConstant<MethodHandle> MA_PCM_S32_TO_S16;
	private static final LazyConstant<MethodHandle> MA_PCM_S32_TO_S24;
	private static final LazyConstant<MethodHandle> MA_PCM_S32_TO_F32;
	private static final LazyConstant<MethodHandle> MA_PCM_F32_TO_U8;
	private static final LazyConstant<MethodHandle> MA_PCM_F32_TO_S16;
	private static final LazyConstant<MethodHandle> MA_PCM_F32_TO_S24;
	private static final LazyConstant<MethodHandle> MA_PCM_F32_TO_S32;
	private static final LazyConstant<MethodHandle> MA_PCM_CONVERT;
	private static final LazyConstant<MethodHandle> MA_CONVERT_PCM_FRAMES_FORMAT;
	private static final LazyConstant<MethodHandle> MA_DEINTERLEAVE_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_INTERLEAVE_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_MAP_GET_CHANNEL;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_MAP_INIT_BLANK;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_MAP_INIT_STANDARD;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_MAP_COPY;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_MAP_COPY_OR_DEFAULT;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_MAP_IS_VALID;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_MAP_IS_EQUAL;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_MAP_IS_BLANK;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_MAP_CONTAINS_CHANNEL_POSITION;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_MAP_FIND_CHANNEL_POSITION;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_MAP_TO_STRING;
	private static final LazyConstant<MethodHandle> MA_CHANNEL_POSITION_TO_STRING;
	private static final LazyConstant<MethodHandle> MA_CONVERT_FRAMES;
	private static final LazyConstant<MethodHandle> MA_CONVERT_FRAMES_EX;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_INIT;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_READ_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_SEEK_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_SEEK_TO_PCM_FRAME;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_SEEK_SECONDS;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_SEEK_TO_SECOND;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_GET_DATA_FORMAT;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_GET_CURSOR_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_GET_LENGTH_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_GET_CURSOR_IN_SECONDS;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_GET_LENGTH_IN_SECONDS;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_SET_LOOPING;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_IS_LOOPING;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_SET_RANGE_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_GET_RANGE_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_SET_LOOP_POINT_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_GET_LOOP_POINT_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_SET_CURRENT;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_GET_CURRENT;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_SET_NEXT;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_GET_NEXT;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_SET_NEXT_CALLBACK;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_GET_NEXT_CALLBACK;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_REF_INIT;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_REF_UNINIT;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_REF_SET_DATA;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_REF_READ_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_REF_SEEK_TO_PCM_FRAME;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_REF_MAP;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_REF_UNMAP;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_REF_AT_END;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_REF_GET_CURSOR_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_REF_GET_LENGTH_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_REF_GET_AVAILABLE_FRAMES;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_INIT;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_INIT_COPY;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_ALLOC_AND_INIT;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_UNINIT;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_UNINIT_AND_FREE;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_READ_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_SEEK_TO_PCM_FRAME;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_MAP;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_UNMAP;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_AT_END;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_GET_CURSOR_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_GET_LENGTH_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_AUDIO_BUFFER_GET_AVAILABLE_FRAMES;
	private static final LazyConstant<MethodHandle> MA_PAGED_AUDIO_BUFFER_DATA_INIT;
	private static final LazyConstant<MethodHandle> MA_PAGED_AUDIO_BUFFER_DATA_UNINIT;
	private static final LazyConstant<MethodHandle> MA_PAGED_AUDIO_BUFFER_DATA_GET_HEAD;
	private static final LazyConstant<MethodHandle> MA_PAGED_AUDIO_BUFFER_DATA_GET_TAIL;
	private static final LazyConstant<MethodHandle> MA_PAGED_AUDIO_BUFFER_DATA_GET_LENGTH_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_PAGED_AUDIO_BUFFER_DATA_ALLOCATE_PAGE;
	private static final LazyConstant<MethodHandle> MA_PAGED_AUDIO_BUFFER_DATA_FREE_PAGE;
	private static final LazyConstant<MethodHandle> MA_PAGED_AUDIO_BUFFER_DATA_APPEND_PAGE;
	private static final LazyConstant<MethodHandle> MA_PAGED_AUDIO_BUFFER_DATA_ALLOCATE_AND_APPEND_PAGE;
	private static final LazyConstant<MethodHandle> MA_PAGED_AUDIO_BUFFER_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_PAGED_AUDIO_BUFFER_INIT;
	private static final LazyConstant<MethodHandle> MA_PAGED_AUDIO_BUFFER_UNINIT;
	private static final LazyConstant<MethodHandle> MA_PAGED_AUDIO_BUFFER_READ_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_PAGED_AUDIO_BUFFER_SEEK_TO_PCM_FRAME;
	private static final LazyConstant<MethodHandle> MA_PAGED_AUDIO_BUFFER_GET_CURSOR_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_PAGED_AUDIO_BUFFER_GET_LENGTH_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_RB_INIT_EX;
	private static final LazyConstant<MethodHandle> MA_RB_INIT;
	private static final LazyConstant<MethodHandle> MA_RB_UNINIT;
	private static final LazyConstant<MethodHandle> MA_RB_RESET;
	private static final LazyConstant<MethodHandle> MA_RB_ACQUIRE_READ;
	private static final LazyConstant<MethodHandle> MA_RB_COMMIT_READ;
	private static final LazyConstant<MethodHandle> MA_RB_ACQUIRE_WRITE;
	private static final LazyConstant<MethodHandle> MA_RB_COMMIT_WRITE;
	private static final LazyConstant<MethodHandle> MA_RB_SEEK_READ;
	private static final LazyConstant<MethodHandle> MA_RB_SEEK_WRITE;
	private static final LazyConstant<MethodHandle> MA_RB_POINTER_DISTANCE;
	private static final LazyConstant<MethodHandle> MA_RB_AVAILABLE_READ;
	private static final LazyConstant<MethodHandle> MA_RB_AVAILABLE_WRITE;
	private static final LazyConstant<MethodHandle> MA_RB_GET_SUBBUFFER_SIZE;
	private static final LazyConstant<MethodHandle> MA_RB_GET_SUBBUFFER_STRIDE;
	private static final LazyConstant<MethodHandle> MA_RB_GET_SUBBUFFER_OFFSET;
	private static final LazyConstant<MethodHandle> MA_RB_GET_SUBBUFFER_PTR;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_INIT_EX;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_INIT;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_UNINIT;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_RESET;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_ACQUIRE_READ;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_COMMIT_READ;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_ACQUIRE_WRITE;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_COMMIT_WRITE;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_SEEK_READ;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_SEEK_WRITE;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_POINTER_DISTANCE;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_AVAILABLE_READ;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_AVAILABLE_WRITE;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_GET_SUBBUFFER_SIZE;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_GET_SUBBUFFER_STRIDE;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_GET_SUBBUFFER_OFFSET;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_GET_SUBBUFFER_PTR;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_GET_FORMAT;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_GET_CHANNELS;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_GET_SAMPLE_RATE;
	private static final LazyConstant<MethodHandle> MA_PCM_RB_SET_SAMPLE_RATE;
	private static final LazyConstant<MethodHandle> MA_DUPLEX_RB_INIT;
	private static final LazyConstant<MethodHandle> MA_DUPLEX_RB_UNINIT;
	private static final LazyConstant<MethodHandle> MA_RESULT_DESCRIPTION;
	private static final LazyConstant<MethodHandle> MA_MALLOC;
	private static final LazyConstant<MethodHandle> MA_CALLOC;
	private static final LazyConstant<MethodHandle> MA_REALLOC;
	private static final LazyConstant<MethodHandle> MA_FREE;
	private static final LazyConstant<MethodHandle> MA_ALIGNED_MALLOC;
	private static final LazyConstant<MethodHandle> MA_ALIGNED_FREE;
	private static final LazyConstant<MethodHandle> MA_GET_FORMAT_NAME;
	private static final LazyConstant<MethodHandle> MA_BLEND_F32;
	private static final LazyConstant<MethodHandle> MA_GET_BYTES_PER_SAMPLE;
	private static final LazyConstant<MethodHandle> MA_LOG_LEVEL_TO_STRING;
	private static final LazyConstant<MethodHandle> MA_SPINLOCK_LOCK;
	private static final LazyConstant<MethodHandle> MA_SPINLOCK_LOCK_NOYIELD;
	private static final LazyConstant<MethodHandle> MA_SPINLOCK_UNLOCK;
	private static final LazyConstant<MethodHandle> MA_MUTEX_INIT;
	private static final LazyConstant<MethodHandle> MA_MUTEX_UNINIT;
	private static final LazyConstant<MethodHandle> MA_MUTEX_LOCK;
	private static final LazyConstant<MethodHandle> MA_MUTEX_UNLOCK;
	private static final LazyConstant<MethodHandle> MA_EVENT_INIT;
	private static final LazyConstant<MethodHandle> MA_EVENT_UNINIT;
	private static final LazyConstant<MethodHandle> MA_EVENT_WAIT;
	private static final LazyConstant<MethodHandle> MA_EVENT_SIGNAL;
	private static final LazyConstant<MethodHandle> MA_SEMAPHORE_INIT;
	private static final LazyConstant<MethodHandle> MA_SEMAPHORE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_SEMAPHORE_WAIT;
	private static final LazyConstant<MethodHandle> MA_SEMAPHORE_RELEASE;
	private static final LazyConstant<MethodHandle> MA_FENCE_INIT;
	private static final LazyConstant<MethodHandle> MA_FENCE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_FENCE_ACQUIRE;
	private static final LazyConstant<MethodHandle> MA_FENCE_RELEASE;
	private static final LazyConstant<MethodHandle> MA_FENCE_WAIT;
	private static final LazyConstant<MethodHandle> MA_ASYNC_NOTIFICATION_SIGNAL;
	private static final LazyConstant<MethodHandle> MA_ASYNC_NOTIFICATION_POLL_INIT;
	private static final LazyConstant<MethodHandle> MA_ASYNC_NOTIFICATION_POLL_IS_SIGNALLED;
	private static final LazyConstant<MethodHandle> MA_ASYNC_NOTIFICATION_EVENT_INIT;
	private static final LazyConstant<MethodHandle> MA_ASYNC_NOTIFICATION_EVENT_UNINIT;
	private static final LazyConstant<MethodHandle> MA_ASYNC_NOTIFICATION_EVENT_WAIT;
	private static final LazyConstant<MethodHandle> MA_ASYNC_NOTIFICATION_EVENT_SIGNAL;
	private static final LazyConstant<MethodHandle> MA_SLOT_ALLOCATOR_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_SLOT_ALLOCATOR_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_SLOT_ALLOCATOR_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_SLOT_ALLOCATOR_INIT;
	private static final LazyConstant<MethodHandle> MA_SLOT_ALLOCATOR_UNINIT;
	private static final LazyConstant<MethodHandle> MA_SLOT_ALLOCATOR_ALLOC;
	private static final LazyConstant<MethodHandle> MA_SLOT_ALLOCATOR_FREE;
	private static final LazyConstant<MethodHandle> MA_JOB_INIT;
	private static final LazyConstant<MethodHandle> MA_JOB_QUEUE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_JOB_QUEUE_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_JOB_QUEUE_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_JOB_QUEUE_INIT;
	private static final LazyConstant<MethodHandle> MA_JOB_QUEUE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_JOB_QUEUE_POST;
	private static final LazyConstant<MethodHandle> MA_JOB_QUEUE_NEXT;
	private static final LazyConstant<MethodHandle> MA_DEVICE_JOB_THREAD_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_DEVICE_JOB_THREAD_INIT;
	private static final LazyConstant<MethodHandle> MA_DEVICE_JOB_THREAD_UNINIT;
	private static final LazyConstant<MethodHandle> MA_DEVICE_JOB_THREAD_POST;
	private static final LazyConstant<MethodHandle> MA_DEVICE_JOB_THREAD_NEXT;
	private static final LazyConstant<MethodHandle> MA_DEVICE_ID_EQUAL;
	private static final LazyConstant<MethodHandle> MA_CONTEXT_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_CONTEXT_INIT;
	private static final LazyConstant<MethodHandle> MA_CONTEXT_UNINIT;
	private static final LazyConstant<MethodHandle> MA_CONTEXT_SIZEOF;
	private static final LazyConstant<MethodHandle> MA_CONTEXT_GET_LOG;
	private static final LazyConstant<MethodHandle> MA_CONTEXT_ENUMERATE_DEVICES;
	private static final LazyConstant<MethodHandle> MA_CONTEXT_GET_DEVICES;
	private static final LazyConstant<MethodHandle> MA_CONTEXT_GET_DEVICE_INFO;
	private static final LazyConstant<MethodHandle> MA_CONTEXT_IS_LOOPBACK_SUPPORTED;
	private static final LazyConstant<MethodHandle> MA_DEVICE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_DEVICE_INIT;
	private static final LazyConstant<MethodHandle> MA_DEVICE_INIT_EX;
	private static final LazyConstant<MethodHandle> MA_DEVICE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_DEVICE_GET_CONTEXT;
	private static final LazyConstant<MethodHandle> MA_DEVICE_GET_LOG;
	private static final LazyConstant<MethodHandle> MA_DEVICE_GET_INFO;
	private static final LazyConstant<MethodHandle> MA_DEVICE_GET_NAME;
	private static final LazyConstant<MethodHandle> MA_DEVICE_START;
	private static final LazyConstant<MethodHandle> MA_DEVICE_STOP;
	private static final LazyConstant<MethodHandle> MA_DEVICE_IS_STARTED;
	private static final LazyConstant<MethodHandle> MA_DEVICE_GET_STATE;
	private static final LazyConstant<MethodHandle> MA_DEVICE_POST_INIT;
	private static final LazyConstant<MethodHandle> MA_DEVICE_SET_MASTER_VOLUME;
	private static final LazyConstant<MethodHandle> MA_DEVICE_GET_MASTER_VOLUME;
	private static final LazyConstant<MethodHandle> MA_DEVICE_SET_MASTER_VOLUME_DB;
	private static final LazyConstant<MethodHandle> MA_DEVICE_GET_MASTER_VOLUME_DB;
	private static final LazyConstant<MethodHandle> MA_DEVICE_HANDLE_BACKEND_DATA_CALLBACK;
	private static final LazyConstant<MethodHandle> MA_CALCULATE_BUFFER_SIZE_IN_FRAMES_FROM_DESCRIPTOR;
	private static final LazyConstant<MethodHandle> MA_GET_BACKEND_NAME;
	private static final LazyConstant<MethodHandle> MA_GET_BACKEND_FROM_NAME;
	private static final LazyConstant<MethodHandle> MA_IS_BACKEND_ENABLED;
	private static final LazyConstant<MethodHandle> MA_GET_ENABLED_BACKENDS;
	private static final LazyConstant<MethodHandle> MA_IS_LOOPBACK_SUPPORTED;
	private static final LazyConstant<MethodHandle> MA_CALCULATE_BUFFER_SIZE_IN_MILLISECONDS_FROM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_CALCULATE_BUFFER_SIZE_IN_FRAMES_FROM_MILLISECONDS;
	private static final LazyConstant<MethodHandle> MA_COPY_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_SILENCE_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_OFFSET_PCM_FRAMES_PTR;
	private static final LazyConstant<MethodHandle> MA_OFFSET_PCM_FRAMES_CONST_PTR;
	private static final LazyConstant<MethodHandle> MA_CLIP_SAMPLES_U8;
	private static final LazyConstant<MethodHandle> MA_CLIP_SAMPLES_S16;
	private static final LazyConstant<MethodHandle> MA_CLIP_SAMPLES_S24;
	private static final LazyConstant<MethodHandle> MA_CLIP_SAMPLES_S32;
	private static final LazyConstant<MethodHandle> MA_CLIP_SAMPLES_F32;
	private static final LazyConstant<MethodHandle> MA_CLIP_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_COPY_AND_APPLY_VOLUME_FACTOR_U8;
	private static final LazyConstant<MethodHandle> MA_COPY_AND_APPLY_VOLUME_FACTOR_S16;
	private static final LazyConstant<MethodHandle> MA_COPY_AND_APPLY_VOLUME_FACTOR_S24;
	private static final LazyConstant<MethodHandle> MA_COPY_AND_APPLY_VOLUME_FACTOR_S32;
	private static final LazyConstant<MethodHandle> MA_COPY_AND_APPLY_VOLUME_FACTOR_F32;
	private static final LazyConstant<MethodHandle> MA_APPLY_VOLUME_FACTOR_U8;
	private static final LazyConstant<MethodHandle> MA_APPLY_VOLUME_FACTOR_S16;
	private static final LazyConstant<MethodHandle> MA_APPLY_VOLUME_FACTOR_S24;
	private static final LazyConstant<MethodHandle> MA_APPLY_VOLUME_FACTOR_S32;
	private static final LazyConstant<MethodHandle> MA_APPLY_VOLUME_FACTOR_F32;
	private static final LazyConstant<MethodHandle> MA_COPY_AND_APPLY_VOLUME_FACTOR_PCM_FRAMES_U8;
	private static final LazyConstant<MethodHandle> MA_COPY_AND_APPLY_VOLUME_FACTOR_PCM_FRAMES_S16;
	private static final LazyConstant<MethodHandle> MA_COPY_AND_APPLY_VOLUME_FACTOR_PCM_FRAMES_S24;
	private static final LazyConstant<MethodHandle> MA_COPY_AND_APPLY_VOLUME_FACTOR_PCM_FRAMES_S32;
	private static final LazyConstant<MethodHandle> MA_COPY_AND_APPLY_VOLUME_FACTOR_PCM_FRAMES_F32;
	private static final LazyConstant<MethodHandle> MA_COPY_AND_APPLY_VOLUME_FACTOR_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_APPLY_VOLUME_FACTOR_PCM_FRAMES_U8;
	private static final LazyConstant<MethodHandle> MA_APPLY_VOLUME_FACTOR_PCM_FRAMES_S16;
	private static final LazyConstant<MethodHandle> MA_APPLY_VOLUME_FACTOR_PCM_FRAMES_S24;
	private static final LazyConstant<MethodHandle> MA_APPLY_VOLUME_FACTOR_PCM_FRAMES_S32;
	private static final LazyConstant<MethodHandle> MA_APPLY_VOLUME_FACTOR_PCM_FRAMES_F32;
	private static final LazyConstant<MethodHandle> MA_APPLY_VOLUME_FACTOR_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_COPY_AND_APPLY_VOLUME_FACTOR_PER_CHANNEL_F32;
	private static final LazyConstant<MethodHandle> MA_COPY_AND_APPLY_VOLUME_AND_CLIP_SAMPLES_U8;
	private static final LazyConstant<MethodHandle> MA_COPY_AND_APPLY_VOLUME_AND_CLIP_SAMPLES_S16;
	private static final LazyConstant<MethodHandle> MA_COPY_AND_APPLY_VOLUME_AND_CLIP_SAMPLES_S24;
	private static final LazyConstant<MethodHandle> MA_COPY_AND_APPLY_VOLUME_AND_CLIP_SAMPLES_S32;
	private static final LazyConstant<MethodHandle> MA_COPY_AND_APPLY_VOLUME_AND_CLIP_SAMPLES_F32;
	private static final LazyConstant<MethodHandle> MA_COPY_AND_APPLY_VOLUME_AND_CLIP_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_VOLUME_LINEAR_TO_DB;
	private static final LazyConstant<MethodHandle> MA_VOLUME_DB_TO_LINEAR;
	private static final LazyConstant<MethodHandle> MA_MIX_PCM_FRAMES_F32;
	private static final LazyConstant<MethodHandle> MA_VFS_OPEN;
	private static final LazyConstant<MethodHandle> MA_VFS_OPEN_W;
	private static final LazyConstant<MethodHandle> MA_VFS_CLOSE;
	private static final LazyConstant<MethodHandle> MA_VFS_READ;
	private static final LazyConstant<MethodHandle> MA_VFS_WRITE;
	private static final LazyConstant<MethodHandle> MA_VFS_SEEK;
	private static final LazyConstant<MethodHandle> MA_VFS_TELL;
	private static final LazyConstant<MethodHandle> MA_VFS_INFO;
	private static final LazyConstant<MethodHandle> MA_VFS_OPEN_AND_READ_FILE;
	private static final LazyConstant<MethodHandle> MA_DEFAULT_VFS_INIT;
	private static final LazyConstant<MethodHandle> MA_DECODING_BACKEND_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_DECODER_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_DECODER_CONFIG_INIT_DEFAULT;
	private static final LazyConstant<MethodHandle> MA_DECODER_INIT;
	private static final LazyConstant<MethodHandle> MA_DECODER_INIT_MEMORY;
	private static final LazyConstant<MethodHandle> MA_DECODER_INIT_VFS;
	private static final LazyConstant<MethodHandle> MA_DECODER_INIT_VFS_W;
	private static final LazyConstant<MethodHandle> MA_DECODER_INIT_FILE;
	private static final LazyConstant<MethodHandle> MA_DECODER_INIT_FILE_W;
	private static final LazyConstant<MethodHandle> MA_DECODER_UNINIT;
	private static final LazyConstant<MethodHandle> MA_DECODER_READ_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_DECODER_SEEK_TO_PCM_FRAME;
	private static final LazyConstant<MethodHandle> MA_DECODER_GET_DATA_FORMAT;
	private static final LazyConstant<MethodHandle> MA_DECODER_GET_CURSOR_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_DECODER_GET_LENGTH_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_DECODER_GET_AVAILABLE_FRAMES;
	private static final LazyConstant<MethodHandle> MA_DECODE_FROM_VFS;
	private static final LazyConstant<MethodHandle> MA_DECODE_FILE;
	private static final LazyConstant<MethodHandle> MA_DECODE_MEMORY;
	private static final LazyConstant<MethodHandle> MA_ENCODER_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_ENCODER_INIT;
	private static final LazyConstant<MethodHandle> MA_ENCODER_INIT_VFS;
	private static final LazyConstant<MethodHandle> MA_ENCODER_INIT_VFS_W;
	private static final LazyConstant<MethodHandle> MA_ENCODER_INIT_FILE;
	private static final LazyConstant<MethodHandle> MA_ENCODER_INIT_FILE_W;
	private static final LazyConstant<MethodHandle> MA_ENCODER_UNINIT;
	private static final LazyConstant<MethodHandle> MA_ENCODER_WRITE_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_WAVEFORM_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_WAVEFORM_INIT;
	private static final LazyConstant<MethodHandle> MA_WAVEFORM_UNINIT;
	private static final LazyConstant<MethodHandle> MA_WAVEFORM_READ_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_WAVEFORM_SEEK_TO_PCM_FRAME;
	private static final LazyConstant<MethodHandle> MA_WAVEFORM_SET_AMPLITUDE;
	private static final LazyConstant<MethodHandle> MA_WAVEFORM_SET_FREQUENCY;
	private static final LazyConstant<MethodHandle> MA_WAVEFORM_SET_TYPE;
	private static final LazyConstant<MethodHandle> MA_WAVEFORM_SET_SAMPLE_RATE;
	private static final LazyConstant<MethodHandle> MA_PULSEWAVE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_PULSEWAVE_INIT;
	private static final LazyConstant<MethodHandle> MA_PULSEWAVE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_PULSEWAVE_READ_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_PULSEWAVE_SEEK_TO_PCM_FRAME;
	private static final LazyConstant<MethodHandle> MA_PULSEWAVE_SET_AMPLITUDE;
	private static final LazyConstant<MethodHandle> MA_PULSEWAVE_SET_FREQUENCY;
	private static final LazyConstant<MethodHandle> MA_PULSEWAVE_SET_SAMPLE_RATE;
	private static final LazyConstant<MethodHandle> MA_PULSEWAVE_SET_DUTY_CYCLE;
	private static final LazyConstant<MethodHandle> MA_NOISE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_NOISE_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_NOISE_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_NOISE_INIT;
	private static final LazyConstant<MethodHandle> MA_NOISE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_NOISE_READ_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_NOISE_SET_AMPLITUDE;
	private static final LazyConstant<MethodHandle> MA_NOISE_SET_SEED;
	private static final LazyConstant<MethodHandle> MA_NOISE_SET_TYPE;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_PIPELINE_NOTIFICATIONS_INIT;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_SOURCE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_INIT;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_UNINIT;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_GET_LOG;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_REGISTER_FILE;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_REGISTER_FILE_W;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_REGISTER_DECODED_DATA;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_REGISTER_DECODED_DATA_W;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_REGISTER_ENCODED_DATA;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_REGISTER_ENCODED_DATA_W;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_UNREGISTER_FILE;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_UNREGISTER_FILE_W;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_UNREGISTER_DATA;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_UNREGISTER_DATA_W;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_BUFFER_INIT_EX;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_BUFFER_INIT;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_BUFFER_INIT_W;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_BUFFER_INIT_COPY;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_BUFFER_UNINIT;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_BUFFER_READ_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_BUFFER_SEEK_TO_PCM_FRAME;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_BUFFER_GET_DATA_FORMAT;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_BUFFER_GET_CURSOR_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_BUFFER_GET_LENGTH_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_BUFFER_RESULT;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_BUFFER_SET_LOOPING;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_BUFFER_IS_LOOPING;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_BUFFER_GET_AVAILABLE_FRAMES;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_STREAM_INIT_EX;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_STREAM_INIT;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_STREAM_INIT_W;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_STREAM_UNINIT;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_STREAM_READ_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_STREAM_SEEK_TO_PCM_FRAME;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_STREAM_GET_DATA_FORMAT;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_STREAM_GET_CURSOR_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_STREAM_GET_LENGTH_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_STREAM_RESULT;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_STREAM_SET_LOOPING;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_STREAM_IS_LOOPING;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_STREAM_GET_AVAILABLE_FRAMES;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_SOURCE_INIT_EX;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_SOURCE_INIT;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_SOURCE_INIT_W;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_SOURCE_INIT_COPY;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_SOURCE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_SOURCE_READ_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_SOURCE_SEEK_TO_PCM_FRAME;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_SOURCE_GET_DATA_FORMAT;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_SOURCE_GET_CURSOR_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_SOURCE_GET_LENGTH_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_SOURCE_RESULT;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_SOURCE_SET_LOOPING;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_SOURCE_IS_LOOPING;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_DATA_SOURCE_GET_AVAILABLE_FRAMES;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_POST_JOB;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_POST_JOB_QUIT;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_NEXT_JOB;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_PROCESS_JOB;
	private static final LazyConstant<MethodHandle> MA_RESOURCE_MANAGER_PROCESS_NEXT_JOB;
	private static final LazyConstant<MethodHandle> MA_NODE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_NODE_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_NODE_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_NODE_INIT;
	private static final LazyConstant<MethodHandle> MA_NODE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_NODE_GET_NODE_GRAPH;
	private static final LazyConstant<MethodHandle> MA_NODE_GET_INPUT_BUS_COUNT;
	private static final LazyConstant<MethodHandle> MA_NODE_GET_OUTPUT_BUS_COUNT;
	private static final LazyConstant<MethodHandle> MA_NODE_GET_INPUT_CHANNELS;
	private static final LazyConstant<MethodHandle> MA_NODE_GET_OUTPUT_CHANNELS;
	private static final LazyConstant<MethodHandle> MA_NODE_ATTACH_OUTPUT_BUS;
	private static final LazyConstant<MethodHandle> MA_NODE_DETACH_OUTPUT_BUS;
	private static final LazyConstant<MethodHandle> MA_NODE_DETACH_ALL_OUTPUT_BUSES;
	private static final LazyConstant<MethodHandle> MA_NODE_SET_OUTPUT_BUS_VOLUME;
	private static final LazyConstant<MethodHandle> MA_NODE_GET_OUTPUT_BUS_VOLUME;
	private static final LazyConstant<MethodHandle> MA_NODE_SET_STATE;
	private static final LazyConstant<MethodHandle> MA_NODE_GET_STATE;
	private static final LazyConstant<MethodHandle> MA_NODE_SET_STATE_TIME;
	private static final LazyConstant<MethodHandle> MA_NODE_GET_STATE_TIME;
	private static final LazyConstant<MethodHandle> MA_NODE_GET_STATE_BY_TIME;
	private static final LazyConstant<MethodHandle> MA_NODE_GET_STATE_BY_TIME_RANGE;
	private static final LazyConstant<MethodHandle> MA_NODE_GET_TIME;
	private static final LazyConstant<MethodHandle> MA_NODE_SET_TIME;
	private static final LazyConstant<MethodHandle> MA_NODE_GRAPH_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_NODE_GRAPH_INIT;
	private static final LazyConstant<MethodHandle> MA_NODE_GRAPH_UNINIT;
	private static final LazyConstant<MethodHandle> MA_NODE_GRAPH_GET_ENDPOINT;
	private static final LazyConstant<MethodHandle> MA_NODE_GRAPH_READ_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_NODE_GRAPH_GET_CHANNELS;
	private static final LazyConstant<MethodHandle> MA_NODE_GRAPH_GET_TIME;
	private static final LazyConstant<MethodHandle> MA_NODE_GRAPH_SET_TIME;
	private static final LazyConstant<MethodHandle> MA_NODE_GRAPH_GET_PROCESSING_SIZE_IN_FRAMES;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_NODE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_NODE_INIT;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_NODE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_NODE_SET_LOOPING;
	private static final LazyConstant<MethodHandle> MA_DATA_SOURCE_NODE_IS_LOOPING;
	private static final LazyConstant<MethodHandle> MA_SPLITTER_NODE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_SPLITTER_NODE_INIT;
	private static final LazyConstant<MethodHandle> MA_SPLITTER_NODE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_BIQUAD_NODE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_BIQUAD_NODE_INIT;
	private static final LazyConstant<MethodHandle> MA_BIQUAD_NODE_REINIT;
	private static final LazyConstant<MethodHandle> MA_BIQUAD_NODE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_LPF_NODE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_LPF_NODE_INIT;
	private static final LazyConstant<MethodHandle> MA_LPF_NODE_REINIT;
	private static final LazyConstant<MethodHandle> MA_LPF_NODE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_HPF_NODE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_HPF_NODE_INIT;
	private static final LazyConstant<MethodHandle> MA_HPF_NODE_REINIT;
	private static final LazyConstant<MethodHandle> MA_HPF_NODE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_BPF_NODE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_BPF_NODE_INIT;
	private static final LazyConstant<MethodHandle> MA_BPF_NODE_REINIT;
	private static final LazyConstant<MethodHandle> MA_BPF_NODE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_NOTCH_NODE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_NOTCH_NODE_INIT;
	private static final LazyConstant<MethodHandle> MA_NOTCH_NODE_REINIT;
	private static final LazyConstant<MethodHandle> MA_NOTCH_NODE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_PEAK_NODE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_PEAK_NODE_INIT;
	private static final LazyConstant<MethodHandle> MA_PEAK_NODE_REINIT;
	private static final LazyConstant<MethodHandle> MA_PEAK_NODE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_LOSHELF_NODE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_LOSHELF_NODE_INIT;
	private static final LazyConstant<MethodHandle> MA_LOSHELF_NODE_REINIT;
	private static final LazyConstant<MethodHandle> MA_LOSHELF_NODE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_HISHELF_NODE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_HISHELF_NODE_INIT;
	private static final LazyConstant<MethodHandle> MA_HISHELF_NODE_REINIT;
	private static final LazyConstant<MethodHandle> MA_HISHELF_NODE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_DELAY_NODE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_DELAY_NODE_INIT;
	private static final LazyConstant<MethodHandle> MA_DELAY_NODE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_DELAY_NODE_SET_WET;
	private static final LazyConstant<MethodHandle> MA_DELAY_NODE_GET_WET;
	private static final LazyConstant<MethodHandle> MA_DELAY_NODE_SET_DRY;
	private static final LazyConstant<MethodHandle> MA_DELAY_NODE_GET_DRY;
	private static final LazyConstant<MethodHandle> MA_DELAY_NODE_SET_DECAY;
	private static final LazyConstant<MethodHandle> MA_DELAY_NODE_GET_DECAY;
	private static final LazyConstant<MethodHandle> MA_ENGINE_NODE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_ENGINE_NODE_GET_HEAP_SIZE;
	private static final LazyConstant<MethodHandle> MA_ENGINE_NODE_INIT_PREALLOCATED;
	private static final LazyConstant<MethodHandle> MA_ENGINE_NODE_INIT;
	private static final LazyConstant<MethodHandle> MA_ENGINE_NODE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_SOUND_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_SOUND_CONFIG_INIT_2;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_CONFIG_INIT_2;
	private static final LazyConstant<MethodHandle> MA_ENGINE_CONFIG_INIT;
	private static final LazyConstant<MethodHandle> MA_ENGINE_INIT;
	private static final LazyConstant<MethodHandle> MA_ENGINE_UNINIT;
	private static final LazyConstant<MethodHandle> MA_ENGINE_READ_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_ENGINE_GET_NODE_GRAPH;
	private static final LazyConstant<MethodHandle> MA_ENGINE_GET_RESOURCE_MANAGER;
	private static final LazyConstant<MethodHandle> MA_ENGINE_GET_DEVICE;
	private static final LazyConstant<MethodHandle> MA_ENGINE_GET_LOG;
	private static final LazyConstant<MethodHandle> MA_ENGINE_GET_ENDPOINT;
	private static final LazyConstant<MethodHandle> MA_ENGINE_GET_TIME_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_ENGINE_GET_TIME_IN_MILLISECONDS;
	private static final LazyConstant<MethodHandle> MA_ENGINE_SET_TIME_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_ENGINE_SET_TIME_IN_MILLISECONDS;
	private static final LazyConstant<MethodHandle> MA_ENGINE_GET_TIME;
	private static final LazyConstant<MethodHandle> MA_ENGINE_SET_TIME;
	private static final LazyConstant<MethodHandle> MA_ENGINE_GET_CHANNELS;
	private static final LazyConstant<MethodHandle> MA_ENGINE_GET_SAMPLE_RATE;
	private static final LazyConstant<MethodHandle> MA_ENGINE_START;
	private static final LazyConstant<MethodHandle> MA_ENGINE_STOP;
	private static final LazyConstant<MethodHandle> MA_ENGINE_SET_VOLUME;
	private static final LazyConstant<MethodHandle> MA_ENGINE_GET_VOLUME;
	private static final LazyConstant<MethodHandle> MA_ENGINE_SET_GAIN_DB;
	private static final LazyConstant<MethodHandle> MA_ENGINE_GET_GAIN_DB;
	private static final LazyConstant<MethodHandle> MA_ENGINE_GET_LISTENER_COUNT;
	private static final LazyConstant<MethodHandle> MA_ENGINE_FIND_CLOSEST_LISTENER;
	private static final LazyConstant<MethodHandle> MA_ENGINE_LISTENER_SET_POSITION;
	private static final LazyConstant<MethodHandle> MA_ENGINE_LISTENER_GET_POSITION;
	private static final LazyConstant<MethodHandle> MA_ENGINE_LISTENER_SET_DIRECTION;
	private static final LazyConstant<MethodHandle> MA_ENGINE_LISTENER_GET_DIRECTION;
	private static final LazyConstant<MethodHandle> MA_ENGINE_LISTENER_SET_VELOCITY;
	private static final LazyConstant<MethodHandle> MA_ENGINE_LISTENER_GET_VELOCITY;
	private static final LazyConstant<MethodHandle> MA_ENGINE_LISTENER_SET_CONE;
	private static final LazyConstant<MethodHandle> MA_ENGINE_LISTENER_GET_CONE;
	private static final LazyConstant<MethodHandle> MA_ENGINE_LISTENER_SET_WORLD_UP;
	private static final LazyConstant<MethodHandle> MA_ENGINE_LISTENER_GET_WORLD_UP;
	private static final LazyConstant<MethodHandle> MA_ENGINE_LISTENER_SET_ENABLED;
	private static final LazyConstant<MethodHandle> MA_ENGINE_LISTENER_IS_ENABLED;
	private static final LazyConstant<MethodHandle> MA_ENGINE_PLAY_SOUND_EX;
	private static final LazyConstant<MethodHandle> MA_ENGINE_PLAY_SOUND;
	private static final LazyConstant<MethodHandle> MA_SOUND_INIT_FROM_FILE;
	private static final LazyConstant<MethodHandle> MA_SOUND_INIT_FROM_FILE_W;
	private static final LazyConstant<MethodHandle> MA_SOUND_INIT_COPY;
	private static final LazyConstant<MethodHandle> MA_SOUND_INIT_FROM_DATA_SOURCE;
	private static final LazyConstant<MethodHandle> MA_SOUND_INIT_EX;
	private static final LazyConstant<MethodHandle> MA_SOUND_UNINIT;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_ENGINE;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_DATA_SOURCE;
	private static final LazyConstant<MethodHandle> MA_SOUND_START;
	private static final LazyConstant<MethodHandle> MA_SOUND_STOP;
	private static final LazyConstant<MethodHandle> MA_SOUND_STOP_WITH_FADE_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_SOUND_STOP_WITH_FADE_IN_MILLISECONDS;
	private static final LazyConstant<MethodHandle> MA_SOUND_RESET_START_TIME;
	private static final LazyConstant<MethodHandle> MA_SOUND_RESET_STOP_TIME;
	private static final LazyConstant<MethodHandle> MA_SOUND_RESET_FADE;
	private static final LazyConstant<MethodHandle> MA_SOUND_RESET_STOP_TIME_AND_FADE;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_VOLUME;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_VOLUME;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_PAN;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_PAN;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_PAN_MODE;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_PAN_MODE;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_PITCH;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_PITCH;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_SPATIALIZATION_ENABLED;
	private static final LazyConstant<MethodHandle> MA_SOUND_IS_SPATIALIZATION_ENABLED;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_PINNED_LISTENER_INDEX;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_PINNED_LISTENER_INDEX;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_LISTENER_INDEX;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_DIRECTION_TO_LISTENER;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_POSITION;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_POSITION;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_DIRECTION;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_DIRECTION;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_VELOCITY;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_VELOCITY;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_ATTENUATION_MODEL;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_ATTENUATION_MODEL;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_POSITIONING;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_POSITIONING;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_ROLLOFF;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_ROLLOFF;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_MIN_GAIN;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_MIN_GAIN;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_MAX_GAIN;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_MAX_GAIN;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_MIN_DISTANCE;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_MIN_DISTANCE;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_MAX_DISTANCE;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_MAX_DISTANCE;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_CONE;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_CONE;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_DOPPLER_FACTOR;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_DOPPLER_FACTOR;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_DIRECTIONAL_ATTENUATION_FACTOR;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_DIRECTIONAL_ATTENUATION_FACTOR;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_FADE_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_FADE_IN_MILLISECONDS;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_FADE_START_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_FADE_START_IN_MILLISECONDS;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_CURRENT_FADE_VOLUME;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_START_TIME_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_START_TIME_IN_MILLISECONDS;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_STOP_TIME_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_STOP_TIME_IN_MILLISECONDS;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_STOP_TIME_WITH_FADE_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_STOP_TIME_WITH_FADE_IN_MILLISECONDS;
	private static final LazyConstant<MethodHandle> MA_SOUND_IS_PLAYING;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_TIME_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_TIME_IN_MILLISECONDS;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_LOOPING;
	private static final LazyConstant<MethodHandle> MA_SOUND_IS_LOOPING;
	private static final LazyConstant<MethodHandle> MA_SOUND_AT_END;
	private static final LazyConstant<MethodHandle> MA_SOUND_SEEK_TO_PCM_FRAME;
	private static final LazyConstant<MethodHandle> MA_SOUND_SEEK_TO_SECOND;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_DATA_FORMAT;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_CURSOR_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_LENGTH_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_CURSOR_IN_SECONDS;
	private static final LazyConstant<MethodHandle> MA_SOUND_GET_LENGTH_IN_SECONDS;
	private static final LazyConstant<MethodHandle> MA_SOUND_SET_END_CALLBACK;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_INIT;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_INIT_EX;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_UNINIT;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_ENGINE;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_START;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_STOP;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_VOLUME;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_VOLUME;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_PAN;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_PAN;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_PAN_MODE;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_PAN_MODE;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_PITCH;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_PITCH;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_SPATIALIZATION_ENABLED;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_IS_SPATIALIZATION_ENABLED;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_PINNED_LISTENER_INDEX;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_PINNED_LISTENER_INDEX;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_LISTENER_INDEX;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_DIRECTION_TO_LISTENER;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_POSITION;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_POSITION;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_DIRECTION;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_DIRECTION;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_VELOCITY;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_VELOCITY;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_ATTENUATION_MODEL;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_ATTENUATION_MODEL;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_POSITIONING;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_POSITIONING;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_ROLLOFF;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_ROLLOFF;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_MIN_GAIN;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_MIN_GAIN;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_MAX_GAIN;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_MAX_GAIN;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_MIN_DISTANCE;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_MIN_DISTANCE;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_MAX_DISTANCE;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_MAX_DISTANCE;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_CONE;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_CONE;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_DOPPLER_FACTOR;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_DOPPLER_FACTOR;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_DIRECTIONAL_ATTENUATION_FACTOR;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_DIRECTIONAL_ATTENUATION_FACTOR;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_FADE_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_FADE_IN_MILLISECONDS;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_CURRENT_FADE_VOLUME;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_START_TIME_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_START_TIME_IN_MILLISECONDS;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_STOP_TIME_IN_PCM_FRAMES;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_SET_STOP_TIME_IN_MILLISECONDS;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_IS_PLAYING;
	private static final LazyConstant<MethodHandle> MA_SOUND_GROUP_GET_TIME_IN_PCM_FRAMES;

	static {
		//@formatter:off
		MA_VERSION = downcallHandleVoid("ma_version", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_VERSION_STRING = downcallHandle("ma_version_string", UNBOUNDED_ADDRESS);
		MA_LOG_CALLBACK_INIT = downcallHandle("ma_log_callback_init", MaLogCallback.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LOG_INIT = downcallHandle("ma_log_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LOG_UNINIT = downcallHandleVoid("ma_log_uninit", UNBOUNDED_ADDRESS);
		MA_LOG_REGISTER_CALLBACK = downcallHandle("ma_log_register_callback", JAVA_INT, UNBOUNDED_ADDRESS, MaLogCallback.LAYOUT);
		MA_LOG_UNREGISTER_CALLBACK = downcallHandle("ma_log_unregister_callback", JAVA_INT, UNBOUNDED_ADDRESS, MaLogCallback.LAYOUT);
		MA_LOG_POST = downcallHandle("ma_log_post", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		MA_LOG_POSTV = downcallHandle("ma_log_postv", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LOG_POSTF = downcallHandle("ma_log_postf", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		MA_BIQUAD_CONFIG_INIT = downcallHandle("ma_biquad_config_init", MaBiquadConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE);
		MA_BIQUAD_GET_HEAP_SIZE = downcallHandle("ma_biquad_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BIQUAD_INIT_PREALLOCATED = downcallHandle("ma_biquad_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BIQUAD_INIT = downcallHandle("ma_biquad_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BIQUAD_UNINIT = downcallHandleVoid("ma_biquad_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BIQUAD_REINIT = downcallHandle("ma_biquad_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BIQUAD_CLEAR_CACHE = downcallHandle("ma_biquad_clear_cache", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_BIQUAD_PROCESS_PCM_FRAMES = downcallHandle("ma_biquad_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_BIQUAD_GET_LATENCY = downcallHandle("ma_biquad_get_latency", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_LPF1_CONFIG_INIT = downcallHandle("ma_lpf1_config_init", MaLpf1Config.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_DOUBLE);
		MA_LPF2_CONFIG_INIT = downcallHandle("ma_lpf2_config_init", MaLpf1Config.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE);
		MA_LPF1_GET_HEAP_SIZE = downcallHandle("ma_lpf1_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LPF1_INIT_PREALLOCATED = downcallHandle("ma_lpf1_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LPF1_INIT = downcallHandle("ma_lpf1_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LPF1_UNINIT = downcallHandleVoid("ma_lpf1_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LPF1_REINIT = downcallHandle("ma_lpf1_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LPF1_CLEAR_CACHE = downcallHandle("ma_lpf1_clear_cache", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_LPF1_PROCESS_PCM_FRAMES = downcallHandle("ma_lpf1_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_LPF1_GET_LATENCY = downcallHandle("ma_lpf1_get_latency", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_LPF2_GET_HEAP_SIZE = downcallHandle("ma_lpf2_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LPF2_INIT_PREALLOCATED = downcallHandle("ma_lpf2_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LPF2_INIT = downcallHandle("ma_lpf2_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LPF2_UNINIT = downcallHandleVoid("ma_lpf2_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LPF2_REINIT = downcallHandle("ma_lpf2_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LPF2_CLEAR_CACHE = downcallHandle("ma_lpf2_clear_cache", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_LPF2_PROCESS_PCM_FRAMES = downcallHandle("ma_lpf2_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_LPF2_GET_LATENCY = downcallHandle("ma_lpf2_get_latency", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_LPF_CONFIG_INIT = downcallHandle("ma_lpf_config_init", MaLpfConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_INT);
		MA_LPF_GET_HEAP_SIZE = downcallHandle("ma_lpf_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LPF_INIT_PREALLOCATED = downcallHandle("ma_lpf_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LPF_INIT = downcallHandle("ma_lpf_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LPF_UNINIT = downcallHandleVoid("ma_lpf_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LPF_REINIT = downcallHandle("ma_lpf_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LPF_CLEAR_CACHE = downcallHandle("ma_lpf_clear_cache", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_LPF_PROCESS_PCM_FRAMES = downcallHandle("ma_lpf_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_LPF_GET_LATENCY = downcallHandle("ma_lpf_get_latency", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_HPF1_CONFIG_INIT = downcallHandle("ma_hpf1_config_init", MaHpf1Config.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_DOUBLE);
		MA_HPF2_CONFIG_INIT = downcallHandle("ma_hpf2_config_init", MaHpf1Config.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE);
		MA_HPF1_GET_HEAP_SIZE = downcallHandle("ma_hpf1_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HPF1_INIT_PREALLOCATED = downcallHandle("ma_hpf1_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HPF1_INIT = downcallHandle("ma_hpf1_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HPF1_UNINIT = downcallHandleVoid("ma_hpf1_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HPF1_REINIT = downcallHandle("ma_hpf1_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HPF1_PROCESS_PCM_FRAMES = downcallHandle("ma_hpf1_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_HPF1_GET_LATENCY = downcallHandle("ma_hpf1_get_latency", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_HPF2_GET_HEAP_SIZE = downcallHandle("ma_hpf2_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HPF2_INIT_PREALLOCATED = downcallHandle("ma_hpf2_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HPF2_INIT = downcallHandle("ma_hpf2_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HPF2_UNINIT = downcallHandleVoid("ma_hpf2_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HPF2_REINIT = downcallHandle("ma_hpf2_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HPF2_PROCESS_PCM_FRAMES = downcallHandle("ma_hpf2_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_HPF2_GET_LATENCY = downcallHandle("ma_hpf2_get_latency", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_HPF_CONFIG_INIT = downcallHandle("ma_hpf_config_init", MaHpfConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_INT);
		MA_HPF_GET_HEAP_SIZE = downcallHandle("ma_hpf_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HPF_INIT_PREALLOCATED = downcallHandle("ma_hpf_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HPF_INIT = downcallHandle("ma_hpf_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HPF_UNINIT = downcallHandleVoid("ma_hpf_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HPF_REINIT = downcallHandle("ma_hpf_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HPF_PROCESS_PCM_FRAMES = downcallHandle("ma_hpf_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_HPF_GET_LATENCY = downcallHandle("ma_hpf_get_latency", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_BPF2_CONFIG_INIT = downcallHandle("ma_bpf2_config_init", MaBpf2Config.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE);
		MA_BPF2_GET_HEAP_SIZE = downcallHandle("ma_bpf2_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BPF2_INIT_PREALLOCATED = downcallHandle("ma_bpf2_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BPF2_INIT = downcallHandle("ma_bpf2_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BPF2_UNINIT = downcallHandleVoid("ma_bpf2_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BPF2_REINIT = downcallHandle("ma_bpf2_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BPF2_PROCESS_PCM_FRAMES = downcallHandle("ma_bpf2_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_BPF2_GET_LATENCY = downcallHandle("ma_bpf2_get_latency", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_BPF_CONFIG_INIT = downcallHandle("ma_bpf_config_init", MaBpfConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_INT);
		MA_BPF_GET_HEAP_SIZE = downcallHandle("ma_bpf_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BPF_INIT_PREALLOCATED = downcallHandle("ma_bpf_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BPF_INIT = downcallHandle("ma_bpf_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BPF_UNINIT = downcallHandleVoid("ma_bpf_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BPF_REINIT = downcallHandle("ma_bpf_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BPF_PROCESS_PCM_FRAMES = downcallHandle("ma_bpf_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_BPF_GET_LATENCY = downcallHandle("ma_bpf_get_latency", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_NOTCH2_CONFIG_INIT = downcallHandle("ma_notch2_config_init", MaNotch2Config.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE);
		MA_NOTCH2_GET_HEAP_SIZE = downcallHandle("ma_notch2_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NOTCH2_INIT_PREALLOCATED = downcallHandle("ma_notch2_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NOTCH2_INIT = downcallHandle("ma_notch2_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NOTCH2_UNINIT = downcallHandleVoid("ma_notch2_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NOTCH2_REINIT = downcallHandle("ma_notch2_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NOTCH2_PROCESS_PCM_FRAMES = downcallHandle("ma_notch2_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_NOTCH2_GET_LATENCY = downcallHandle("ma_notch2_get_latency", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_PEAK2_CONFIG_INIT = downcallHandle("ma_peak2_config_init", MaPeak2Config.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE);
		MA_PEAK2_GET_HEAP_SIZE = downcallHandle("ma_peak2_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PEAK2_INIT_PREALLOCATED = downcallHandle("ma_peak2_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PEAK2_INIT = downcallHandle("ma_peak2_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PEAK2_UNINIT = downcallHandleVoid("ma_peak2_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PEAK2_REINIT = downcallHandle("ma_peak2_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PEAK2_PROCESS_PCM_FRAMES = downcallHandle("ma_peak2_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_PEAK2_GET_LATENCY = downcallHandle("ma_peak2_get_latency", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_LOSHELF2_CONFIG_INIT = downcallHandle("ma_loshelf2_config_init", MaLoshelf2Config.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE);
		MA_LOSHELF2_GET_HEAP_SIZE = downcallHandle("ma_loshelf2_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LOSHELF2_INIT_PREALLOCATED = downcallHandle("ma_loshelf2_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LOSHELF2_INIT = downcallHandle("ma_loshelf2_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LOSHELF2_UNINIT = downcallHandleVoid("ma_loshelf2_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LOSHELF2_REINIT = downcallHandle("ma_loshelf2_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LOSHELF2_PROCESS_PCM_FRAMES = downcallHandle("ma_loshelf2_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_LOSHELF2_GET_LATENCY = downcallHandle("ma_loshelf2_get_latency", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_HISHELF2_CONFIG_INIT = downcallHandle("ma_hishelf2_config_init", MaHishelf2Config.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE);
		MA_HISHELF2_GET_HEAP_SIZE = downcallHandle("ma_hishelf2_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HISHELF2_INIT_PREALLOCATED = downcallHandle("ma_hishelf2_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HISHELF2_INIT = downcallHandle("ma_hishelf2_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HISHELF2_UNINIT = downcallHandleVoid("ma_hishelf2_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HISHELF2_REINIT = downcallHandle("ma_hishelf2_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HISHELF2_PROCESS_PCM_FRAMES = downcallHandle("ma_hishelf2_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_HISHELF2_GET_LATENCY = downcallHandle("ma_hishelf2_get_latency", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_DELAY_CONFIG_INIT = downcallHandle("ma_delay_config_init", MaDelayConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_FLOAT);
		MA_DELAY_INIT = downcallHandle("ma_delay_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DELAY_UNINIT = downcallHandleVoid("ma_delay_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DELAY_PROCESS_PCM_FRAMES = downcallHandle("ma_delay_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_DELAY_SET_WET = downcallHandleVoid("ma_delay_set_wet", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_DELAY_GET_WET = downcallHandle("ma_delay_get_wet", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_DELAY_SET_DRY = downcallHandleVoid("ma_delay_set_dry", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_DELAY_GET_DRY = downcallHandle("ma_delay_get_dry", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_DELAY_SET_DECAY = downcallHandleVoid("ma_delay_set_decay", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_DELAY_GET_DECAY = downcallHandle("ma_delay_get_decay", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_GAINER_CONFIG_INIT = downcallHandle("ma_gainer_config_init", MaGainerConfig.LAYOUT, JAVA_INT, JAVA_INT);
		MA_GAINER_GET_HEAP_SIZE = downcallHandle("ma_gainer_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_GAINER_INIT_PREALLOCATED = downcallHandle("ma_gainer_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_GAINER_INIT = downcallHandle("ma_gainer_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_GAINER_UNINIT = downcallHandleVoid("ma_gainer_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_GAINER_PROCESS_PCM_FRAMES = downcallHandle("ma_gainer_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_GAINER_SET_GAIN = downcallHandle("ma_gainer_set_gain", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_GAINER_SET_GAINS = downcallHandle("ma_gainer_set_gains", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_GAINER_SET_MASTER_VOLUME = downcallHandle("ma_gainer_set_master_volume", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_GAINER_GET_MASTER_VOLUME = downcallHandle("ma_gainer_get_master_volume", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PANNER_CONFIG_INIT = downcallHandle("ma_panner_config_init", MaPannerConfig.LAYOUT, JAVA_INT, JAVA_INT);
		MA_PANNER_INIT = downcallHandle("ma_panner_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PANNER_PROCESS_PCM_FRAMES = downcallHandle("ma_panner_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_PANNER_SET_MODE = downcallHandleVoid("ma_panner_set_mode", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_PANNER_GET_MODE = downcallHandle("ma_panner_get_mode", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_PANNER_SET_PAN = downcallHandleVoid("ma_panner_set_pan", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_PANNER_GET_PAN = downcallHandle("ma_panner_get_pan", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_FADER_CONFIG_INIT = downcallHandle("ma_fader_config_init", MaFaderConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT);
		MA_FADER_INIT = downcallHandle("ma_fader_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_FADER_PROCESS_PCM_FRAMES = downcallHandle("ma_fader_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_FADER_GET_DATA_FORMAT = downcallHandleVoid("ma_fader_get_data_format", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_FADER_SET_FADE = downcallHandleVoid("ma_fader_set_fade", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_LONG);
		MA_FADER_SET_FADE_EX = downcallHandleVoid("ma_fader_set_fade_ex", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_LONG, JAVA_LONG);
		MA_FADER_GET_CURRENT_VOLUME = downcallHandle("ma_fader_get_current_volume", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_LISTENER_CONFIG_INIT = downcallHandle("ma_spatializer_listener_config_init", MaSpatializerListenerConfig.LAYOUT, JAVA_INT);
		MA_SPATIALIZER_LISTENER_GET_HEAP_SIZE = downcallHandle("ma_spatializer_listener_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_LISTENER_INIT_PREALLOCATED = downcallHandle("ma_spatializer_listener_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_LISTENER_INIT = downcallHandle("ma_spatializer_listener_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_LISTENER_UNINIT = downcallHandleVoid("ma_spatializer_listener_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_LISTENER_GET_CHANNEL_MAP = downcallHandle("ma_spatializer_listener_get_channel_map", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_LISTENER_SET_CONE = downcallHandleVoid("ma_spatializer_listener_set_cone", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_SPATIALIZER_LISTENER_GET_CONE = downcallHandleVoid("ma_spatializer_listener_get_cone", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_LISTENER_SET_POSITION = downcallHandleVoid("ma_spatializer_listener_set_position", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_SPATIALIZER_LISTENER_GET_POSITION = downcallHandle("ma_spatializer_listener_get_position", MaVec3f.LAYOUT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_LISTENER_SET_DIRECTION = downcallHandleVoid("ma_spatializer_listener_set_direction", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_SPATIALIZER_LISTENER_GET_DIRECTION = downcallHandle("ma_spatializer_listener_get_direction", MaVec3f.LAYOUT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_LISTENER_SET_VELOCITY = downcallHandleVoid("ma_spatializer_listener_set_velocity", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_SPATIALIZER_LISTENER_GET_VELOCITY = downcallHandle("ma_spatializer_listener_get_velocity", MaVec3f.LAYOUT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_LISTENER_SET_SPEED_OF_SOUND = downcallHandleVoid("ma_spatializer_listener_set_speed_of_sound", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SPATIALIZER_LISTENER_GET_SPEED_OF_SOUND = downcallHandle("ma_spatializer_listener_get_speed_of_sound", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_LISTENER_SET_WORLD_UP = downcallHandleVoid("ma_spatializer_listener_set_world_up", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_SPATIALIZER_LISTENER_GET_WORLD_UP = downcallHandle("ma_spatializer_listener_get_world_up", MaVec3f.LAYOUT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_LISTENER_SET_ENABLED = downcallHandleVoid("ma_spatializer_listener_set_enabled", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_SPATIALIZER_LISTENER_IS_ENABLED = downcallHandle("ma_spatializer_listener_is_enabled", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_CONFIG_INIT = downcallHandle("ma_spatializer_config_init", MaSpatializerConfig.LAYOUT, JAVA_INT, JAVA_INT);
		MA_SPATIALIZER_GET_HEAP_SIZE = downcallHandle("ma_spatializer_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_INIT_PREALLOCATED = downcallHandle("ma_spatializer_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_INIT = downcallHandle("ma_spatializer_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_UNINIT = downcallHandleVoid("ma_spatializer_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_PROCESS_PCM_FRAMES = downcallHandle("ma_spatializer_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_SPATIALIZER_SET_MASTER_VOLUME = downcallHandle("ma_spatializer_set_master_volume", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SPATIALIZER_GET_MASTER_VOLUME = downcallHandle("ma_spatializer_get_master_volume", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_GET_INPUT_CHANNELS = downcallHandle("ma_spatializer_get_input_channels", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_GET_OUTPUT_CHANNELS = downcallHandle("ma_spatializer_get_output_channels", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_SET_ATTENUATION_MODEL = downcallHandleVoid("ma_spatializer_set_attenuation_model", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_SPATIALIZER_GET_ATTENUATION_MODEL = downcallHandle("ma_spatializer_get_attenuation_model", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_SET_POSITIONING = downcallHandleVoid("ma_spatializer_set_positioning", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_SPATIALIZER_GET_POSITIONING = downcallHandle("ma_spatializer_get_positioning", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_SET_ROLLOFF = downcallHandleVoid("ma_spatializer_set_rolloff", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SPATIALIZER_GET_ROLLOFF = downcallHandle("ma_spatializer_get_rolloff", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_SET_MIN_GAIN = downcallHandleVoid("ma_spatializer_set_min_gain", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SPATIALIZER_GET_MIN_GAIN = downcallHandle("ma_spatializer_get_min_gain", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_SET_MAX_GAIN = downcallHandleVoid("ma_spatializer_set_max_gain", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SPATIALIZER_GET_MAX_GAIN = downcallHandle("ma_spatializer_get_max_gain", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_SET_MIN_DISTANCE = downcallHandleVoid("ma_spatializer_set_min_distance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SPATIALIZER_GET_MIN_DISTANCE = downcallHandle("ma_spatializer_get_min_distance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_SET_MAX_DISTANCE = downcallHandleVoid("ma_spatializer_set_max_distance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SPATIALIZER_GET_MAX_DISTANCE = downcallHandle("ma_spatializer_get_max_distance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_SET_CONE = downcallHandleVoid("ma_spatializer_set_cone", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_SPATIALIZER_GET_CONE = downcallHandleVoid("ma_spatializer_get_cone", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_SET_DOPPLER_FACTOR = downcallHandleVoid("ma_spatializer_set_doppler_factor", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SPATIALIZER_GET_DOPPLER_FACTOR = downcallHandle("ma_spatializer_get_doppler_factor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_SET_DIRECTIONAL_ATTENUATION_FACTOR = downcallHandleVoid("ma_spatializer_set_directional_attenuation_factor", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SPATIALIZER_GET_DIRECTIONAL_ATTENUATION_FACTOR = downcallHandle("ma_spatializer_get_directional_attenuation_factor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_SET_POSITION = downcallHandleVoid("ma_spatializer_set_position", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_SPATIALIZER_GET_POSITION = downcallHandle("ma_spatializer_get_position", MaVec3f.LAYOUT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_SET_DIRECTION = downcallHandleVoid("ma_spatializer_set_direction", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_SPATIALIZER_GET_DIRECTION = downcallHandle("ma_spatializer_get_direction", MaVec3f.LAYOUT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_SET_VELOCITY = downcallHandleVoid("ma_spatializer_set_velocity", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_SPATIALIZER_GET_VELOCITY = downcallHandle("ma_spatializer_get_velocity", MaVec3f.LAYOUT, UNBOUNDED_ADDRESS);
		MA_SPATIALIZER_GET_RELATIVE_POSITION_AND_DIRECTION = downcallHandleVoid("ma_spatializer_get_relative_position_and_direction", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LINEAR_RESAMPLER_CONFIG_INIT = downcallHandle("ma_linear_resampler_config_init", MaLinearResamplerConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		MA_LINEAR_RESAMPLER_GET_HEAP_SIZE = downcallHandle("ma_linear_resampler_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LINEAR_RESAMPLER_INIT_PREALLOCATED = downcallHandle("ma_linear_resampler_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LINEAR_RESAMPLER_INIT = downcallHandle("ma_linear_resampler_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LINEAR_RESAMPLER_UNINIT = downcallHandleVoid("ma_linear_resampler_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LINEAR_RESAMPLER_PROCESS_PCM_FRAMES = downcallHandle("ma_linear_resampler_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LINEAR_RESAMPLER_SET_RATE = downcallHandle("ma_linear_resampler_set_rate", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		MA_LINEAR_RESAMPLER_SET_RATE_RATIO = downcallHandle("ma_linear_resampler_set_rate_ratio", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_LINEAR_RESAMPLER_GET_INPUT_LATENCY = downcallHandle("ma_linear_resampler_get_input_latency", JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_LINEAR_RESAMPLER_GET_OUTPUT_LATENCY = downcallHandle("ma_linear_resampler_get_output_latency", JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_LINEAR_RESAMPLER_GET_REQUIRED_INPUT_FRAME_COUNT = downcallHandle("ma_linear_resampler_get_required_input_frame_count", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_LINEAR_RESAMPLER_GET_EXPECTED_OUTPUT_FRAME_COUNT = downcallHandle("ma_linear_resampler_get_expected_output_frame_count", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_LINEAR_RESAMPLER_RESET = downcallHandle("ma_linear_resampler_reset", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_RESAMPLER_CONFIG_INIT = downcallHandle("ma_resampler_config_init", MaResamplerConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		MA_RESAMPLER_GET_HEAP_SIZE = downcallHandle("ma_resampler_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESAMPLER_INIT_PREALLOCATED = downcallHandle("ma_resampler_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESAMPLER_INIT = downcallHandle("ma_resampler_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESAMPLER_UNINIT = downcallHandleVoid("ma_resampler_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESAMPLER_PROCESS_PCM_FRAMES = downcallHandle("ma_resampler_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESAMPLER_SET_RATE = downcallHandle("ma_resampler_set_rate", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		MA_RESAMPLER_SET_RATE_RATIO = downcallHandle("ma_resampler_set_rate_ratio", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_RESAMPLER_GET_INPUT_LATENCY = downcallHandle("ma_resampler_get_input_latency", JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_RESAMPLER_GET_OUTPUT_LATENCY = downcallHandle("ma_resampler_get_output_latency", JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_RESAMPLER_GET_REQUIRED_INPUT_FRAME_COUNT = downcallHandle("ma_resampler_get_required_input_frame_count", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_RESAMPLER_GET_EXPECTED_OUTPUT_FRAME_COUNT = downcallHandle("ma_resampler_get_expected_output_frame_count", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_RESAMPLER_RESET = downcallHandle("ma_resampler_reset", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_CHANNEL_CONVERTER_CONFIG_INIT = downcallHandle("ma_channel_converter_config_init", MaChannelConverterConfig.LAYOUT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_CHANNEL_CONVERTER_GET_HEAP_SIZE = downcallHandle("ma_channel_converter_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_CHANNEL_CONVERTER_INIT_PREALLOCATED = downcallHandle("ma_channel_converter_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_CHANNEL_CONVERTER_INIT = downcallHandle("ma_channel_converter_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_CHANNEL_CONVERTER_UNINIT = downcallHandleVoid("ma_channel_converter_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_CHANNEL_CONVERTER_PROCESS_PCM_FRAMES = downcallHandle("ma_channel_converter_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_CHANNEL_CONVERTER_GET_INPUT_CHANNEL_MAP = downcallHandle("ma_channel_converter_get_input_channel_map", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_CHANNEL_CONVERTER_GET_OUTPUT_CHANNEL_MAP = downcallHandle("ma_channel_converter_get_output_channel_map", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_DATA_CONVERTER_CONFIG_INIT_DEFAULT = downcallHandle("ma_data_converter_config_init_default", MaDataConverterConfig.LAYOUT);
		MA_DATA_CONVERTER_CONFIG_INIT = downcallHandle("ma_data_converter_config_init", MaDataConverterConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		MA_DATA_CONVERTER_GET_HEAP_SIZE = downcallHandle("ma_data_converter_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DATA_CONVERTER_INIT_PREALLOCATED = downcallHandle("ma_data_converter_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DATA_CONVERTER_INIT = downcallHandle("ma_data_converter_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DATA_CONVERTER_UNINIT = downcallHandleVoid("ma_data_converter_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DATA_CONVERTER_PROCESS_PCM_FRAMES = downcallHandle("ma_data_converter_process_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DATA_CONVERTER_SET_RATE = downcallHandle("ma_data_converter_set_rate", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		MA_DATA_CONVERTER_SET_RATE_RATIO = downcallHandle("ma_data_converter_set_rate_ratio", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_DATA_CONVERTER_GET_INPUT_LATENCY = downcallHandle("ma_data_converter_get_input_latency", JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_DATA_CONVERTER_GET_OUTPUT_LATENCY = downcallHandle("ma_data_converter_get_output_latency", JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_DATA_CONVERTER_GET_REQUIRED_INPUT_FRAME_COUNT = downcallHandle("ma_data_converter_get_required_input_frame_count", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_DATA_CONVERTER_GET_EXPECTED_OUTPUT_FRAME_COUNT = downcallHandle("ma_data_converter_get_expected_output_frame_count", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_DATA_CONVERTER_GET_INPUT_CHANNEL_MAP = downcallHandle("ma_data_converter_get_input_channel_map", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_DATA_CONVERTER_GET_OUTPUT_CHANNEL_MAP = downcallHandle("ma_data_converter_get_output_channel_map", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_DATA_CONVERTER_RESET = downcallHandle("ma_data_converter_reset", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_PCM_U8_TO_S16 = downcallHandleVoid("ma_pcm_u8_to_s16", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_U8_TO_S24 = downcallHandleVoid("ma_pcm_u8_to_s24", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_U8_TO_S32 = downcallHandleVoid("ma_pcm_u8_to_s32", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_U8_TO_F32 = downcallHandleVoid("ma_pcm_u8_to_f32", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_S16_TO_U8 = downcallHandleVoid("ma_pcm_s16_to_u8", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_S16_TO_S24 = downcallHandleVoid("ma_pcm_s16_to_s24", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_S16_TO_S32 = downcallHandleVoid("ma_pcm_s16_to_s32", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_S16_TO_F32 = downcallHandleVoid("ma_pcm_s16_to_f32", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_S24_TO_U8 = downcallHandleVoid("ma_pcm_s24_to_u8", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_S24_TO_S16 = downcallHandleVoid("ma_pcm_s24_to_s16", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_S24_TO_S32 = downcallHandleVoid("ma_pcm_s24_to_s32", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_S24_TO_F32 = downcallHandleVoid("ma_pcm_s24_to_f32", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_S32_TO_U8 = downcallHandleVoid("ma_pcm_s32_to_u8", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_S32_TO_S16 = downcallHandleVoid("ma_pcm_s32_to_s16", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_S32_TO_S24 = downcallHandleVoid("ma_pcm_s32_to_s24", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_S32_TO_F32 = downcallHandleVoid("ma_pcm_s32_to_f32", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_F32_TO_U8 = downcallHandleVoid("ma_pcm_f32_to_u8", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_F32_TO_S16 = downcallHandleVoid("ma_pcm_f32_to_s16", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_F32_TO_S24 = downcallHandleVoid("ma_pcm_f32_to_s24", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_F32_TO_S32 = downcallHandleVoid("ma_pcm_f32_to_s32", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_PCM_CONVERT = downcallHandleVoid("ma_pcm_convert", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_LONG, JAVA_INT);
		MA_CONVERT_PCM_FRAMES_FORMAT = downcallHandleVoid("ma_convert_pcm_frames_format", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_LONG, JAVA_INT, JAVA_INT);
		MA_DEINTERLEAVE_PCM_FRAMES = downcallHandleVoid("ma_deinterleave_pcm_frames", JAVA_INT, JAVA_INT, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_INTERLEAVE_PCM_FRAMES = downcallHandleVoid("ma_interleave_pcm_frames", JAVA_INT, JAVA_INT, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_CHANNEL_MAP_GET_CHANNEL = downcallHandle("ma_channel_map_get_channel", JAVA_BYTE, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		MA_CHANNEL_MAP_INIT_BLANK = downcallHandleVoid("ma_channel_map_init_blank", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_CHANNEL_MAP_INIT_STANDARD = downcallHandleVoid("ma_channel_map_init_standard", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_CHANNEL_MAP_COPY = downcallHandleVoid("ma_channel_map_copy", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_CHANNEL_MAP_COPY_OR_DEFAULT = downcallHandleVoid("ma_channel_map_copy_or_default", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_CHANNEL_MAP_IS_VALID = downcallHandle("ma_channel_map_is_valid", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_CHANNEL_MAP_IS_EQUAL = downcallHandle("ma_channel_map_is_equal", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_CHANNEL_MAP_IS_BLANK = downcallHandle("ma_channel_map_is_blank", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_CHANNEL_MAP_CONTAINS_CHANNEL_POSITION = downcallHandle("ma_channel_map_contains_channel_position", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_BYTE);
		MA_CHANNEL_MAP_FIND_CHANNEL_POSITION = downcallHandle("ma_channel_map_find_channel_position", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_BYTE, UNBOUNDED_ADDRESS);
		MA_CHANNEL_MAP_TO_STRING = downcallHandle("ma_channel_map_to_string", JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_CHANNEL_POSITION_TO_STRING = downcallHandle("ma_channel_position_to_string", UNBOUNDED_ADDRESS, JAVA_BYTE);
		MA_CONVERT_FRAMES = downcallHandle("ma_convert_frames", JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_INT);
		MA_CONVERT_FRAMES_EX = downcallHandle("ma_convert_frames_ex", JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_CONFIG_INIT = downcallHandle("ma_data_source_config_init", MaDataSourceConfig.LAYOUT);
		MA_DATA_SOURCE_INIT = downcallHandle("ma_data_source_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_UNINIT = downcallHandleVoid("ma_data_source_uninit", UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_READ_PCM_FRAMES = downcallHandle("ma_data_source_read_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_SEEK_PCM_FRAMES = downcallHandle("ma_data_source_seek_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_SEEK_TO_PCM_FRAME = downcallHandle("ma_data_source_seek_to_pcm_frame", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_DATA_SOURCE_SEEK_SECONDS = downcallHandle("ma_data_source_seek_seconds", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_SEEK_TO_SECOND = downcallHandle("ma_data_source_seek_to_second", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_DATA_SOURCE_GET_DATA_FORMAT = downcallHandle("ma_data_source_get_data_format", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_DATA_SOURCE_GET_CURSOR_IN_PCM_FRAMES = downcallHandle("ma_data_source_get_cursor_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_GET_LENGTH_IN_PCM_FRAMES = downcallHandle("ma_data_source_get_length_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_GET_CURSOR_IN_SECONDS = downcallHandle("ma_data_source_get_cursor_in_seconds", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_GET_LENGTH_IN_SECONDS = downcallHandle("ma_data_source_get_length_in_seconds", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_SET_LOOPING = downcallHandle("ma_data_source_set_looping", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_DATA_SOURCE_IS_LOOPING = downcallHandle("ma_data_source_is_looping", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_SET_RANGE_IN_PCM_FRAMES = downcallHandle("ma_data_source_set_range_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MA_DATA_SOURCE_GET_RANGE_IN_PCM_FRAMES = downcallHandleVoid("ma_data_source_get_range_in_pcm_frames", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_SET_LOOP_POINT_IN_PCM_FRAMES = downcallHandle("ma_data_source_set_loop_point_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MA_DATA_SOURCE_GET_LOOP_POINT_IN_PCM_FRAMES = downcallHandleVoid("ma_data_source_get_loop_point_in_pcm_frames", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_SET_CURRENT = downcallHandle("ma_data_source_set_current", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_GET_CURRENT = downcallHandle("ma_data_source_get_current", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_SET_NEXT = downcallHandle("ma_data_source_set_next", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_GET_NEXT = downcallHandle("ma_data_source_get_next", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_SET_NEXT_CALLBACK = downcallHandle("ma_data_source_set_next_callback", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_GET_NEXT_CALLBACK = downcallHandle("ma_data_source_get_next_callback", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_AUDIO_BUFFER_REF_INIT = downcallHandle("ma_audio_buffer_ref_init", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_AUDIO_BUFFER_REF_UNINIT = downcallHandleVoid("ma_audio_buffer_ref_uninit", UNBOUNDED_ADDRESS);
		MA_AUDIO_BUFFER_REF_SET_DATA = downcallHandle("ma_audio_buffer_ref_set_data", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_AUDIO_BUFFER_REF_READ_PCM_FRAMES = downcallHandle("ma_audio_buffer_ref_read_pcm_frames", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_AUDIO_BUFFER_REF_SEEK_TO_PCM_FRAME = downcallHandle("ma_audio_buffer_ref_seek_to_pcm_frame", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_AUDIO_BUFFER_REF_MAP = downcallHandle("ma_audio_buffer_ref_map", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_AUDIO_BUFFER_REF_UNMAP = downcallHandle("ma_audio_buffer_ref_unmap", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_AUDIO_BUFFER_REF_AT_END = downcallHandle("ma_audio_buffer_ref_at_end", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_AUDIO_BUFFER_REF_GET_CURSOR_IN_PCM_FRAMES = downcallHandle("ma_audio_buffer_ref_get_cursor_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_AUDIO_BUFFER_REF_GET_LENGTH_IN_PCM_FRAMES = downcallHandle("ma_audio_buffer_ref_get_length_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_AUDIO_BUFFER_REF_GET_AVAILABLE_FRAMES = downcallHandle("ma_audio_buffer_ref_get_available_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_AUDIO_BUFFER_CONFIG_INIT = downcallHandle("ma_audio_buffer_config_init", MaAudioBufferConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_AUDIO_BUFFER_INIT = downcallHandle("ma_audio_buffer_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_AUDIO_BUFFER_INIT_COPY = downcallHandle("ma_audio_buffer_init_copy", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_AUDIO_BUFFER_ALLOC_AND_INIT = downcallHandle("ma_audio_buffer_alloc_and_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_AUDIO_BUFFER_UNINIT = downcallHandleVoid("ma_audio_buffer_uninit", UNBOUNDED_ADDRESS);
		MA_AUDIO_BUFFER_UNINIT_AND_FREE = downcallHandleVoid("ma_audio_buffer_uninit_and_free", UNBOUNDED_ADDRESS);
		MA_AUDIO_BUFFER_READ_PCM_FRAMES = downcallHandle("ma_audio_buffer_read_pcm_frames", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_AUDIO_BUFFER_SEEK_TO_PCM_FRAME = downcallHandle("ma_audio_buffer_seek_to_pcm_frame", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_AUDIO_BUFFER_MAP = downcallHandle("ma_audio_buffer_map", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_AUDIO_BUFFER_UNMAP = downcallHandle("ma_audio_buffer_unmap", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_AUDIO_BUFFER_AT_END = downcallHandle("ma_audio_buffer_at_end", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_AUDIO_BUFFER_GET_CURSOR_IN_PCM_FRAMES = downcallHandle("ma_audio_buffer_get_cursor_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_AUDIO_BUFFER_GET_LENGTH_IN_PCM_FRAMES = downcallHandle("ma_audio_buffer_get_length_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_AUDIO_BUFFER_GET_AVAILABLE_FRAMES = downcallHandle("ma_audio_buffer_get_available_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PAGED_AUDIO_BUFFER_DATA_INIT = downcallHandle("ma_paged_audio_buffer_data_init", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		MA_PAGED_AUDIO_BUFFER_DATA_UNINIT = downcallHandleVoid("ma_paged_audio_buffer_data_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PAGED_AUDIO_BUFFER_DATA_GET_HEAD = downcallHandle("ma_paged_audio_buffer_data_get_head", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PAGED_AUDIO_BUFFER_DATA_GET_TAIL = downcallHandle("ma_paged_audio_buffer_data_get_tail", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PAGED_AUDIO_BUFFER_DATA_GET_LENGTH_IN_PCM_FRAMES = downcallHandle("ma_paged_audio_buffer_data_get_length_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PAGED_AUDIO_BUFFER_DATA_ALLOCATE_PAGE = downcallHandle("ma_paged_audio_buffer_data_allocate_page", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PAGED_AUDIO_BUFFER_DATA_FREE_PAGE = downcallHandle("ma_paged_audio_buffer_data_free_page", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PAGED_AUDIO_BUFFER_DATA_APPEND_PAGE = downcallHandle("ma_paged_audio_buffer_data_append_page", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PAGED_AUDIO_BUFFER_DATA_ALLOCATE_AND_APPEND_PAGE = downcallHandle("ma_paged_audio_buffer_data_allocate_and_append_page", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PAGED_AUDIO_BUFFER_CONFIG_INIT = downcallHandle("ma_paged_audio_buffer_config_init", MaPagedAudioBufferConfig.LAYOUT, UNBOUNDED_ADDRESS);
		MA_PAGED_AUDIO_BUFFER_INIT = downcallHandle("ma_paged_audio_buffer_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PAGED_AUDIO_BUFFER_UNINIT = downcallHandleVoid("ma_paged_audio_buffer_uninit", UNBOUNDED_ADDRESS);
		MA_PAGED_AUDIO_BUFFER_READ_PCM_FRAMES = downcallHandle("ma_paged_audio_buffer_read_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_PAGED_AUDIO_BUFFER_SEEK_TO_PCM_FRAME = downcallHandle("ma_paged_audio_buffer_seek_to_pcm_frame", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_PAGED_AUDIO_BUFFER_GET_CURSOR_IN_PCM_FRAMES = downcallHandle("ma_paged_audio_buffer_get_cursor_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PAGED_AUDIO_BUFFER_GET_LENGTH_IN_PCM_FRAMES = downcallHandle("ma_paged_audio_buffer_get_length_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RB_INIT_EX = downcallHandle("ma_rb_init_ex", JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RB_INIT = downcallHandle("ma_rb_init", JAVA_INT, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RB_UNINIT = downcallHandleVoid("ma_rb_uninit", UNBOUNDED_ADDRESS);
		MA_RB_RESET = downcallHandleVoid("ma_rb_reset", UNBOUNDED_ADDRESS);
		MA_RB_ACQUIRE_READ = downcallHandle("ma_rb_acquire_read", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RB_COMMIT_READ = downcallHandle("ma_rb_commit_read", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_RB_ACQUIRE_WRITE = downcallHandle("ma_rb_acquire_write", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RB_COMMIT_WRITE = downcallHandle("ma_rb_commit_write", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_RB_SEEK_READ = downcallHandle("ma_rb_seek_read", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_RB_SEEK_WRITE = downcallHandle("ma_rb_seek_write", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_RB_POINTER_DISTANCE = downcallHandle("ma_rb_pointer_distance", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_RB_AVAILABLE_READ = downcallHandle("ma_rb_available_read", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_RB_AVAILABLE_WRITE = downcallHandle("ma_rb_available_write", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_RB_GET_SUBBUFFER_SIZE = downcallHandle("ma_rb_get_subbuffer_size", JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_RB_GET_SUBBUFFER_STRIDE = downcallHandle("ma_rb_get_subbuffer_stride", JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_RB_GET_SUBBUFFER_OFFSET = downcallHandle("ma_rb_get_subbuffer_offset", JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_RB_GET_SUBBUFFER_PTR = downcallHandle("ma_rb_get_subbuffer_ptr", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_PCM_RB_INIT_EX = downcallHandle("ma_pcm_rb_init_ex", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PCM_RB_INIT = downcallHandle("ma_pcm_rb_init", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PCM_RB_UNINIT = downcallHandleVoid("ma_pcm_rb_uninit", UNBOUNDED_ADDRESS);
		MA_PCM_RB_RESET = downcallHandleVoid("ma_pcm_rb_reset", UNBOUNDED_ADDRESS);
		MA_PCM_RB_ACQUIRE_READ = downcallHandle("ma_pcm_rb_acquire_read", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PCM_RB_COMMIT_READ = downcallHandle("ma_pcm_rb_commit_read", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_PCM_RB_ACQUIRE_WRITE = downcallHandle("ma_pcm_rb_acquire_write", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PCM_RB_COMMIT_WRITE = downcallHandle("ma_pcm_rb_commit_write", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_PCM_RB_SEEK_READ = downcallHandle("ma_pcm_rb_seek_read", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_PCM_RB_SEEK_WRITE = downcallHandle("ma_pcm_rb_seek_write", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_PCM_RB_POINTER_DISTANCE = downcallHandle("ma_pcm_rb_pointer_distance", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_PCM_RB_AVAILABLE_READ = downcallHandle("ma_pcm_rb_available_read", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_PCM_RB_AVAILABLE_WRITE = downcallHandle("ma_pcm_rb_available_write", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_PCM_RB_GET_SUBBUFFER_SIZE = downcallHandle("ma_pcm_rb_get_subbuffer_size", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_PCM_RB_GET_SUBBUFFER_STRIDE = downcallHandle("ma_pcm_rb_get_subbuffer_stride", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_PCM_RB_GET_SUBBUFFER_OFFSET = downcallHandle("ma_pcm_rb_get_subbuffer_offset", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_PCM_RB_GET_SUBBUFFER_PTR = downcallHandle("ma_pcm_rb_get_subbuffer_ptr", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		MA_PCM_RB_GET_FORMAT = downcallHandle("ma_pcm_rb_get_format", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_PCM_RB_GET_CHANNELS = downcallHandle("ma_pcm_rb_get_channels", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_PCM_RB_GET_SAMPLE_RATE = downcallHandle("ma_pcm_rb_get_sample_rate", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_PCM_RB_SET_SAMPLE_RATE = downcallHandleVoid("ma_pcm_rb_set_sample_rate", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_DUPLEX_RB_INIT = downcallHandle("ma_duplex_rb_init", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DUPLEX_RB_UNINIT = downcallHandle("ma_duplex_rb_uninit", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_RESULT_DESCRIPTION = downcallHandle("ma_result_description", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_MALLOC = downcallHandle("ma_malloc", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_CALLOC = downcallHandle("ma_calloc", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_REALLOC = downcallHandle("ma_realloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_FREE = downcallHandleVoid("ma_free", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_ALIGNED_MALLOC = downcallHandle("ma_aligned_malloc", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_ALIGNED_FREE = downcallHandleVoid("ma_aligned_free", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_GET_FORMAT_NAME = downcallHandle("ma_get_format_name", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_BLEND_F32 = downcallHandleVoid("ma_blend_f32", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_INT);
		MA_GET_BYTES_PER_SAMPLE = downcallHandle("ma_get_bytes_per_sample", JAVA_INT, JAVA_INT);
		MA_LOG_LEVEL_TO_STRING = downcallHandle("ma_log_level_to_string", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_SPINLOCK_LOCK = downcallHandle("ma_spinlock_lock", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SPINLOCK_LOCK_NOYIELD = downcallHandle("ma_spinlock_lock_noyield", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SPINLOCK_UNLOCK = downcallHandle("ma_spinlock_unlock", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_MUTEX_INIT = downcallHandle("ma_mutex_init", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_MUTEX_UNINIT = downcallHandleVoid("ma_mutex_uninit", UNBOUNDED_ADDRESS);
		MA_MUTEX_LOCK = downcallHandleVoid("ma_mutex_lock", UNBOUNDED_ADDRESS);
		MA_MUTEX_UNLOCK = downcallHandleVoid("ma_mutex_unlock", UNBOUNDED_ADDRESS);
		MA_EVENT_INIT = downcallHandle("ma_event_init", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_EVENT_UNINIT = downcallHandleVoid("ma_event_uninit", UNBOUNDED_ADDRESS);
		MA_EVENT_WAIT = downcallHandle("ma_event_wait", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_EVENT_SIGNAL = downcallHandle("ma_event_signal", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SEMAPHORE_INIT = downcallHandle("ma_semaphore_init", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SEMAPHORE_UNINIT = downcallHandleVoid("ma_semaphore_uninit", UNBOUNDED_ADDRESS);
		MA_SEMAPHORE_WAIT = downcallHandle("ma_semaphore_wait", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SEMAPHORE_RELEASE = downcallHandle("ma_semaphore_release", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_FENCE_INIT = downcallHandle("ma_fence_init", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_FENCE_UNINIT = downcallHandleVoid("ma_fence_uninit", UNBOUNDED_ADDRESS);
		MA_FENCE_ACQUIRE = downcallHandle("ma_fence_acquire", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_FENCE_RELEASE = downcallHandle("ma_fence_release", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_FENCE_WAIT = downcallHandle("ma_fence_wait", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_ASYNC_NOTIFICATION_SIGNAL = downcallHandle("ma_async_notification_signal", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_ASYNC_NOTIFICATION_POLL_INIT = downcallHandle("ma_async_notification_poll_init", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_ASYNC_NOTIFICATION_POLL_IS_SIGNALLED = downcallHandle("ma_async_notification_poll_is_signalled", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_ASYNC_NOTIFICATION_EVENT_INIT = downcallHandle("ma_async_notification_event_init", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_ASYNC_NOTIFICATION_EVENT_UNINIT = downcallHandle("ma_async_notification_event_uninit", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_ASYNC_NOTIFICATION_EVENT_WAIT = downcallHandle("ma_async_notification_event_wait", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_ASYNC_NOTIFICATION_EVENT_SIGNAL = downcallHandle("ma_async_notification_event_signal", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SLOT_ALLOCATOR_CONFIG_INIT = downcallHandle("ma_slot_allocator_config_init", MaSlotAllocatorConfig.LAYOUT, JAVA_INT);
		MA_SLOT_ALLOCATOR_GET_HEAP_SIZE = downcallHandle("ma_slot_allocator_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SLOT_ALLOCATOR_INIT_PREALLOCATED = downcallHandle("ma_slot_allocator_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SLOT_ALLOCATOR_INIT = downcallHandle("ma_slot_allocator_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SLOT_ALLOCATOR_UNINIT = downcallHandleVoid("ma_slot_allocator_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SLOT_ALLOCATOR_ALLOC = downcallHandle("ma_slot_allocator_alloc", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SLOT_ALLOCATOR_FREE = downcallHandle("ma_slot_allocator_free", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_JOB_INIT = downcallHandle("ma_job_init", MaJob.LAYOUT, JAVA_SHORT);
		MA_JOB_QUEUE_CONFIG_INIT = downcallHandle("ma_job_queue_config_init", MaJobQueueConfig.LAYOUT, JAVA_INT, JAVA_INT);
		MA_JOB_QUEUE_GET_HEAP_SIZE = downcallHandle("ma_job_queue_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_JOB_QUEUE_INIT_PREALLOCATED = downcallHandle("ma_job_queue_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_JOB_QUEUE_INIT = downcallHandle("ma_job_queue_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_JOB_QUEUE_UNINIT = downcallHandleVoid("ma_job_queue_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_JOB_QUEUE_POST = downcallHandle("ma_job_queue_post", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_JOB_QUEUE_NEXT = downcallHandle("ma_job_queue_next", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DEVICE_JOB_THREAD_CONFIG_INIT = downcallHandle("ma_device_job_thread_config_init", MaDeviceJobThreadConfig.LAYOUT);
		MA_DEVICE_JOB_THREAD_INIT = downcallHandle("ma_device_job_thread_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DEVICE_JOB_THREAD_UNINIT = downcallHandleVoid("ma_device_job_thread_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DEVICE_JOB_THREAD_POST = downcallHandle("ma_device_job_thread_post", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DEVICE_JOB_THREAD_NEXT = downcallHandle("ma_device_job_thread_next", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DEVICE_ID_EQUAL = downcallHandle("ma_device_id_equal", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_CONTEXT_CONFIG_INIT = downcallHandle("ma_context_config_init", MaContextConfig.LAYOUT);
		MA_CONTEXT_INIT = downcallHandle("ma_context_init", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_CONTEXT_UNINIT = downcallHandle("ma_context_uninit", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_CONTEXT_SIZEOF = downcallHandle("ma_context_sizeof", JAVA_LONG);
		MA_CONTEXT_GET_LOG = downcallHandle("ma_context_get_log", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_CONTEXT_ENUMERATE_DEVICES = downcallHandle("ma_context_enumerate_devices", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_CONTEXT_GET_DEVICES = downcallHandle("ma_context_get_devices", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_CONTEXT_GET_DEVICE_INFO = downcallHandle("ma_context_get_device_info", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_CONTEXT_IS_LOOPBACK_SUPPORTED = downcallHandle("ma_context_is_loopback_supported", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_DEVICE_CONFIG_INIT = downcallHandle("ma_device_config_init", MaDeviceConfig.LAYOUT, JAVA_INT);
		MA_DEVICE_INIT = downcallHandle("ma_device_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DEVICE_INIT_EX = downcallHandle("ma_device_init_ex", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DEVICE_UNINIT = downcallHandleVoid("ma_device_uninit", UNBOUNDED_ADDRESS);
		MA_DEVICE_GET_CONTEXT = downcallHandle("ma_device_get_context", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DEVICE_GET_LOG = downcallHandle("ma_device_get_log", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DEVICE_GET_INFO = downcallHandle("ma_device_get_info", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		MA_DEVICE_GET_NAME = downcallHandle("ma_device_get_name", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_DEVICE_START = downcallHandle("ma_device_start", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_DEVICE_STOP = downcallHandle("ma_device_stop", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_DEVICE_IS_STARTED = downcallHandle("ma_device_is_started", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_DEVICE_GET_STATE = downcallHandle("ma_device_get_state", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_DEVICE_POST_INIT = downcallHandle("ma_device_post_init", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DEVICE_SET_MASTER_VOLUME = downcallHandle("ma_device_set_master_volume", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_DEVICE_GET_MASTER_VOLUME = downcallHandle("ma_device_get_master_volume", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DEVICE_SET_MASTER_VOLUME_DB = downcallHandle("ma_device_set_master_volume_db", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_DEVICE_GET_MASTER_VOLUME_DB = downcallHandle("ma_device_get_master_volume_db", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DEVICE_HANDLE_BACKEND_DATA_CALLBACK = downcallHandle("ma_device_handle_backend_data_callback", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_CALCULATE_BUFFER_SIZE_IN_FRAMES_FROM_DESCRIPTOR = downcallHandle("ma_calculate_buffer_size_in_frames_from_descriptor", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		MA_GET_BACKEND_NAME = downcallHandle("ma_get_backend_name", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_GET_BACKEND_FROM_NAME = downcallHandle("ma_get_backend_from_name", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_IS_BACKEND_ENABLED = downcallHandle("ma_is_backend_enabled", JAVA_INT, JAVA_INT);
		MA_GET_ENABLED_BACKENDS = downcallHandle("ma_get_enabled_backends", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_IS_LOOPBACK_SUPPORTED = downcallHandle("ma_is_loopback_supported", JAVA_INT, JAVA_INT);
		MA_CALCULATE_BUFFER_SIZE_IN_MILLISECONDS_FROM_FRAMES = downcallHandle("ma_calculate_buffer_size_in_milliseconds_from_frames", JAVA_INT, JAVA_INT, JAVA_INT);
		MA_CALCULATE_BUFFER_SIZE_IN_FRAMES_FROM_MILLISECONDS = downcallHandle("ma_calculate_buffer_size_in_frames_from_milliseconds", JAVA_INT, JAVA_INT, JAVA_INT);
		MA_COPY_PCM_FRAMES = downcallHandleVoid("ma_copy_pcm_frames", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT);
		MA_SILENCE_PCM_FRAMES = downcallHandleVoid("ma_silence_pcm_frames", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT);
		MA_OFFSET_PCM_FRAMES_PTR = downcallHandle("ma_offset_pcm_frames_ptr", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT);
		MA_OFFSET_PCM_FRAMES_CONST_PTR = downcallHandle("ma_offset_pcm_frames_const_ptr", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT);
		MA_CLIP_SAMPLES_U8 = downcallHandleVoid("ma_clip_samples_u8", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_CLIP_SAMPLES_S16 = downcallHandleVoid("ma_clip_samples_s16", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_CLIP_SAMPLES_S24 = downcallHandleVoid("ma_clip_samples_s24", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_CLIP_SAMPLES_S32 = downcallHandleVoid("ma_clip_samples_s32", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_CLIP_SAMPLES_F32 = downcallHandleVoid("ma_clip_samples_f32", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_CLIP_PCM_FRAMES = downcallHandleVoid("ma_clip_pcm_frames", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT);
		MA_COPY_AND_APPLY_VOLUME_FACTOR_U8 = downcallHandleVoid("ma_copy_and_apply_volume_factor_u8", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_FLOAT);
		MA_COPY_AND_APPLY_VOLUME_FACTOR_S16 = downcallHandleVoid("ma_copy_and_apply_volume_factor_s16", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_FLOAT);
		MA_COPY_AND_APPLY_VOLUME_FACTOR_S24 = downcallHandleVoid("ma_copy_and_apply_volume_factor_s24", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_FLOAT);
		MA_COPY_AND_APPLY_VOLUME_FACTOR_S32 = downcallHandleVoid("ma_copy_and_apply_volume_factor_s32", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_FLOAT);
		MA_COPY_AND_APPLY_VOLUME_FACTOR_F32 = downcallHandleVoid("ma_copy_and_apply_volume_factor_f32", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_FLOAT);
		MA_APPLY_VOLUME_FACTOR_U8 = downcallHandleVoid("ma_apply_volume_factor_u8", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_FLOAT);
		MA_APPLY_VOLUME_FACTOR_S16 = downcallHandleVoid("ma_apply_volume_factor_s16", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_FLOAT);
		MA_APPLY_VOLUME_FACTOR_S24 = downcallHandleVoid("ma_apply_volume_factor_s24", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_FLOAT);
		MA_APPLY_VOLUME_FACTOR_S32 = downcallHandleVoid("ma_apply_volume_factor_s32", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_FLOAT);
		MA_APPLY_VOLUME_FACTOR_F32 = downcallHandleVoid("ma_apply_volume_factor_f32", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_FLOAT);
		MA_COPY_AND_APPLY_VOLUME_FACTOR_PCM_FRAMES_U8 = downcallHandleVoid("ma_copy_and_apply_volume_factor_pcm_frames_u8", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_FLOAT);
		MA_COPY_AND_APPLY_VOLUME_FACTOR_PCM_FRAMES_S16 = downcallHandleVoid("ma_copy_and_apply_volume_factor_pcm_frames_s16", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_FLOAT);
		MA_COPY_AND_APPLY_VOLUME_FACTOR_PCM_FRAMES_S24 = downcallHandleVoid("ma_copy_and_apply_volume_factor_pcm_frames_s24", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_FLOAT);
		MA_COPY_AND_APPLY_VOLUME_FACTOR_PCM_FRAMES_S32 = downcallHandleVoid("ma_copy_and_apply_volume_factor_pcm_frames_s32", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_FLOAT);
		MA_COPY_AND_APPLY_VOLUME_FACTOR_PCM_FRAMES_F32 = downcallHandleVoid("ma_copy_and_apply_volume_factor_pcm_frames_f32", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_FLOAT);
		MA_COPY_AND_APPLY_VOLUME_FACTOR_PCM_FRAMES = downcallHandleVoid("ma_copy_and_apply_volume_factor_pcm_frames", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_FLOAT);
		MA_APPLY_VOLUME_FACTOR_PCM_FRAMES_U8 = downcallHandleVoid("ma_apply_volume_factor_pcm_frames_u8", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_FLOAT);
		MA_APPLY_VOLUME_FACTOR_PCM_FRAMES_S16 = downcallHandleVoid("ma_apply_volume_factor_pcm_frames_s16", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_FLOAT);
		MA_APPLY_VOLUME_FACTOR_PCM_FRAMES_S24 = downcallHandleVoid("ma_apply_volume_factor_pcm_frames_s24", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_FLOAT);
		MA_APPLY_VOLUME_FACTOR_PCM_FRAMES_S32 = downcallHandleVoid("ma_apply_volume_factor_pcm_frames_s32", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_FLOAT);
		MA_APPLY_VOLUME_FACTOR_PCM_FRAMES_F32 = downcallHandleVoid("ma_apply_volume_factor_pcm_frames_f32", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_FLOAT);
		MA_APPLY_VOLUME_FACTOR_PCM_FRAMES = downcallHandleVoid("ma_apply_volume_factor_pcm_frames", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_FLOAT);
		MA_COPY_AND_APPLY_VOLUME_FACTOR_PER_CHANNEL_F32 = downcallHandleVoid("ma_copy_and_apply_volume_factor_per_channel_f32", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, UNBOUNDED_ADDRESS);
		MA_COPY_AND_APPLY_VOLUME_AND_CLIP_SAMPLES_U8 = downcallHandleVoid("ma_copy_and_apply_volume_and_clip_samples_u8", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_FLOAT);
		MA_COPY_AND_APPLY_VOLUME_AND_CLIP_SAMPLES_S16 = downcallHandleVoid("ma_copy_and_apply_volume_and_clip_samples_s16", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_FLOAT);
		MA_COPY_AND_APPLY_VOLUME_AND_CLIP_SAMPLES_S24 = downcallHandleVoid("ma_copy_and_apply_volume_and_clip_samples_s24", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_FLOAT);
		MA_COPY_AND_APPLY_VOLUME_AND_CLIP_SAMPLES_S32 = downcallHandleVoid("ma_copy_and_apply_volume_and_clip_samples_s32", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_FLOAT);
		MA_COPY_AND_APPLY_VOLUME_AND_CLIP_SAMPLES_F32 = downcallHandleVoid("ma_copy_and_apply_volume_and_clip_samples_f32", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_FLOAT);
		MA_COPY_AND_APPLY_VOLUME_AND_CLIP_PCM_FRAMES = downcallHandleVoid("ma_copy_and_apply_volume_and_clip_pcm_frames", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_FLOAT);
		MA_VOLUME_LINEAR_TO_DB = downcallHandle("ma_volume_linear_to_db", JAVA_FLOAT, JAVA_FLOAT);
		MA_VOLUME_DB_TO_LINEAR = downcallHandle("ma_volume_db_to_linear", JAVA_FLOAT, JAVA_FLOAT);
		MA_MIX_PCM_FRAMES_F32 = downcallHandle("ma_mix_pcm_frames_f32", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_FLOAT);
		MA_VFS_OPEN = downcallHandle("ma_vfs_open", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		MA_VFS_OPEN_W = downcallHandle("ma_vfs_open_w", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		MA_VFS_CLOSE = downcallHandle("ma_vfs_close", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_VFS_READ = downcallHandle("ma_vfs_read", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_VFS_WRITE = downcallHandle("ma_vfs_write", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_VFS_SEEK = downcallHandle("ma_vfs_seek", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MA_VFS_TELL = downcallHandle("ma_vfs_tell", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_VFS_INFO = downcallHandle("ma_vfs_info", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_VFS_OPEN_AND_READ_FILE = downcallHandle("ma_vfs_open_and_read_file", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DEFAULT_VFS_INIT = downcallHandle("ma_default_vfs_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DECODING_BACKEND_CONFIG_INIT = downcallHandle("ma_decoding_backend_config_init", MaDecodingBackendConfig.LAYOUT, JAVA_INT, JAVA_INT);
		MA_DECODER_CONFIG_INIT = downcallHandle("ma_decoder_config_init", MaDecoderConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT);
		MA_DECODER_CONFIG_INIT_DEFAULT = downcallHandle("ma_decoder_config_init_default", MaDecoderConfig.LAYOUT);
		MA_DECODER_INIT = downcallHandle("ma_decoder_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DECODER_INIT_MEMORY = downcallHandle("ma_decoder_init_memory", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DECODER_INIT_VFS = downcallHandle("ma_decoder_init_vfs", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DECODER_INIT_VFS_W = downcallHandle("ma_decoder_init_vfs_w", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DECODER_INIT_FILE = downcallHandle("ma_decoder_init_file", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DECODER_INIT_FILE_W = downcallHandle("ma_decoder_init_file_w", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DECODER_UNINIT = downcallHandle("ma_decoder_uninit", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_DECODER_READ_PCM_FRAMES = downcallHandle("ma_decoder_read_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_DECODER_SEEK_TO_PCM_FRAME = downcallHandle("ma_decoder_seek_to_pcm_frame", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_DECODER_GET_DATA_FORMAT = downcallHandle("ma_decoder_get_data_format", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_DECODER_GET_CURSOR_IN_PCM_FRAMES = downcallHandle("ma_decoder_get_cursor_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DECODER_GET_LENGTH_IN_PCM_FRAMES = downcallHandle("ma_decoder_get_length_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DECODER_GET_AVAILABLE_FRAMES = downcallHandle("ma_decoder_get_available_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DECODE_FROM_VFS = downcallHandle("ma_decode_from_vfs", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DECODE_FILE = downcallHandle("ma_decode_file", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DECODE_MEMORY = downcallHandle("ma_decode_memory", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_ENCODER_CONFIG_INIT = downcallHandle("ma_encoder_config_init", MaEncoderConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		MA_ENCODER_INIT = downcallHandle("ma_encoder_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_ENCODER_INIT_VFS = downcallHandle("ma_encoder_init_vfs", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_ENCODER_INIT_VFS_W = downcallHandle("ma_encoder_init_vfs_w", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_ENCODER_INIT_FILE = downcallHandle("ma_encoder_init_file", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_ENCODER_INIT_FILE_W = downcallHandle("ma_encoder_init_file_w", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_ENCODER_UNINIT = downcallHandleVoid("ma_encoder_uninit", UNBOUNDED_ADDRESS);
		MA_ENCODER_WRITE_PCM_FRAMES = downcallHandle("ma_encoder_write_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_WAVEFORM_CONFIG_INIT = downcallHandle("ma_waveform_config_init", MaWaveformConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE);
		MA_WAVEFORM_INIT = downcallHandle("ma_waveform_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_WAVEFORM_UNINIT = downcallHandleVoid("ma_waveform_uninit", UNBOUNDED_ADDRESS);
		MA_WAVEFORM_READ_PCM_FRAMES = downcallHandle("ma_waveform_read_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_WAVEFORM_SEEK_TO_PCM_FRAME = downcallHandle("ma_waveform_seek_to_pcm_frame", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_WAVEFORM_SET_AMPLITUDE = downcallHandle("ma_waveform_set_amplitude", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_DOUBLE);
		MA_WAVEFORM_SET_FREQUENCY = downcallHandle("ma_waveform_set_frequency", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_DOUBLE);
		MA_WAVEFORM_SET_TYPE = downcallHandle("ma_waveform_set_type", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_WAVEFORM_SET_SAMPLE_RATE = downcallHandle("ma_waveform_set_sample_rate", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_PULSEWAVE_CONFIG_INIT = downcallHandle("ma_pulsewave_config_init", MaPulsewaveConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE);
		MA_PULSEWAVE_INIT = downcallHandle("ma_pulsewave_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PULSEWAVE_UNINIT = downcallHandleVoid("ma_pulsewave_uninit", UNBOUNDED_ADDRESS);
		MA_PULSEWAVE_READ_PCM_FRAMES = downcallHandle("ma_pulsewave_read_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_PULSEWAVE_SEEK_TO_PCM_FRAME = downcallHandle("ma_pulsewave_seek_to_pcm_frame", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_PULSEWAVE_SET_AMPLITUDE = downcallHandle("ma_pulsewave_set_amplitude", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_DOUBLE);
		MA_PULSEWAVE_SET_FREQUENCY = downcallHandle("ma_pulsewave_set_frequency", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_DOUBLE);
		MA_PULSEWAVE_SET_SAMPLE_RATE = downcallHandle("ma_pulsewave_set_sample_rate", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_PULSEWAVE_SET_DUTY_CYCLE = downcallHandle("ma_pulsewave_set_duty_cycle", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_DOUBLE);
		MA_NOISE_CONFIG_INIT = downcallHandle("ma_noise_config_init", MaNoiseConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_DOUBLE);
		MA_NOISE_GET_HEAP_SIZE = downcallHandle("ma_noise_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NOISE_INIT_PREALLOCATED = downcallHandle("ma_noise_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NOISE_INIT = downcallHandle("ma_noise_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NOISE_UNINIT = downcallHandleVoid("ma_noise_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NOISE_READ_PCM_FRAMES = downcallHandle("ma_noise_read_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_NOISE_SET_AMPLITUDE = downcallHandle("ma_noise_set_amplitude", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_DOUBLE);
		MA_NOISE_SET_SEED = downcallHandle("ma_noise_set_seed", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_NOISE_SET_TYPE = downcallHandle("ma_noise_set_type", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_RESOURCE_MANAGER_PIPELINE_NOTIFICATIONS_INIT = downcallHandle("ma_resource_manager_pipeline_notifications_init", MaResourceManagerPipelineNotifications.LAYOUT);
		MA_RESOURCE_MANAGER_DATA_SOURCE_CONFIG_INIT = downcallHandle("ma_resource_manager_data_source_config_init", MaResourceManagerDataSourceConfig.LAYOUT);
		MA_RESOURCE_MANAGER_CONFIG_INIT = downcallHandle("ma_resource_manager_config_init", MaResourceManagerConfig.LAYOUT);
		MA_RESOURCE_MANAGER_INIT = downcallHandle("ma_resource_manager_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_UNINIT = downcallHandleVoid("ma_resource_manager_uninit", UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_GET_LOG = downcallHandle("ma_resource_manager_get_log", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_REGISTER_FILE = downcallHandle("ma_resource_manager_register_file", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_RESOURCE_MANAGER_REGISTER_FILE_W = downcallHandle("ma_resource_manager_register_file_w", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_RESOURCE_MANAGER_REGISTER_DECODED_DATA = downcallHandle("ma_resource_manager_register_decoded_data", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_INT);
		MA_RESOURCE_MANAGER_REGISTER_DECODED_DATA_W = downcallHandle("ma_resource_manager_register_decoded_data_w", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_INT);
		MA_RESOURCE_MANAGER_REGISTER_ENCODED_DATA = downcallHandle("ma_resource_manager_register_encoded_data", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_RESOURCE_MANAGER_REGISTER_ENCODED_DATA_W = downcallHandle("ma_resource_manager_register_encoded_data_w", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_RESOURCE_MANAGER_UNREGISTER_FILE = downcallHandle("ma_resource_manager_unregister_file", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_UNREGISTER_FILE_W = downcallHandle("ma_resource_manager_unregister_file_w", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_UNREGISTER_DATA = downcallHandle("ma_resource_manager_unregister_data", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_UNREGISTER_DATA_W = downcallHandle("ma_resource_manager_unregister_data_w", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_BUFFER_INIT_EX = downcallHandle("ma_resource_manager_data_buffer_init_ex", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_BUFFER_INIT = downcallHandle("ma_resource_manager_data_buffer_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_BUFFER_INIT_W = downcallHandle("ma_resource_manager_data_buffer_init_w", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_BUFFER_INIT_COPY = downcallHandle("ma_resource_manager_data_buffer_init_copy", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_BUFFER_UNINIT = downcallHandle("ma_resource_manager_data_buffer_uninit", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_BUFFER_READ_PCM_FRAMES = downcallHandle("ma_resource_manager_data_buffer_read_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_BUFFER_SEEK_TO_PCM_FRAME = downcallHandle("ma_resource_manager_data_buffer_seek_to_pcm_frame", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_RESOURCE_MANAGER_DATA_BUFFER_GET_DATA_FORMAT = downcallHandle("ma_resource_manager_data_buffer_get_data_format", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_RESOURCE_MANAGER_DATA_BUFFER_GET_CURSOR_IN_PCM_FRAMES = downcallHandle("ma_resource_manager_data_buffer_get_cursor_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_BUFFER_GET_LENGTH_IN_PCM_FRAMES = downcallHandle("ma_resource_manager_data_buffer_get_length_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_BUFFER_RESULT = downcallHandle("ma_resource_manager_data_buffer_result", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_BUFFER_SET_LOOPING = downcallHandle("ma_resource_manager_data_buffer_set_looping", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_RESOURCE_MANAGER_DATA_BUFFER_IS_LOOPING = downcallHandle("ma_resource_manager_data_buffer_is_looping", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_BUFFER_GET_AVAILABLE_FRAMES = downcallHandle("ma_resource_manager_data_buffer_get_available_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_STREAM_INIT_EX = downcallHandle("ma_resource_manager_data_stream_init_ex", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_STREAM_INIT = downcallHandle("ma_resource_manager_data_stream_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_STREAM_INIT_W = downcallHandle("ma_resource_manager_data_stream_init_w", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_STREAM_UNINIT = downcallHandle("ma_resource_manager_data_stream_uninit", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_STREAM_READ_PCM_FRAMES = downcallHandle("ma_resource_manager_data_stream_read_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_STREAM_SEEK_TO_PCM_FRAME = downcallHandle("ma_resource_manager_data_stream_seek_to_pcm_frame", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_RESOURCE_MANAGER_DATA_STREAM_GET_DATA_FORMAT = downcallHandle("ma_resource_manager_data_stream_get_data_format", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_RESOURCE_MANAGER_DATA_STREAM_GET_CURSOR_IN_PCM_FRAMES = downcallHandle("ma_resource_manager_data_stream_get_cursor_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_STREAM_GET_LENGTH_IN_PCM_FRAMES = downcallHandle("ma_resource_manager_data_stream_get_length_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_STREAM_RESULT = downcallHandle("ma_resource_manager_data_stream_result", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_STREAM_SET_LOOPING = downcallHandle("ma_resource_manager_data_stream_set_looping", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_RESOURCE_MANAGER_DATA_STREAM_IS_LOOPING = downcallHandle("ma_resource_manager_data_stream_is_looping", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_STREAM_GET_AVAILABLE_FRAMES = downcallHandle("ma_resource_manager_data_stream_get_available_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_SOURCE_INIT_EX = downcallHandle("ma_resource_manager_data_source_init_ex", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_SOURCE_INIT = downcallHandle("ma_resource_manager_data_source_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_SOURCE_INIT_W = downcallHandle("ma_resource_manager_data_source_init_w", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_SOURCE_INIT_COPY = downcallHandle("ma_resource_manager_data_source_init_copy", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_SOURCE_UNINIT = downcallHandle("ma_resource_manager_data_source_uninit", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_SOURCE_READ_PCM_FRAMES = downcallHandle("ma_resource_manager_data_source_read_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_SOURCE_SEEK_TO_PCM_FRAME = downcallHandle("ma_resource_manager_data_source_seek_to_pcm_frame", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_RESOURCE_MANAGER_DATA_SOURCE_GET_DATA_FORMAT = downcallHandle("ma_resource_manager_data_source_get_data_format", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_RESOURCE_MANAGER_DATA_SOURCE_GET_CURSOR_IN_PCM_FRAMES = downcallHandle("ma_resource_manager_data_source_get_cursor_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_SOURCE_GET_LENGTH_IN_PCM_FRAMES = downcallHandle("ma_resource_manager_data_source_get_length_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_SOURCE_RESULT = downcallHandle("ma_resource_manager_data_source_result", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_SOURCE_SET_LOOPING = downcallHandle("ma_resource_manager_data_source_set_looping", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_RESOURCE_MANAGER_DATA_SOURCE_IS_LOOPING = downcallHandle("ma_resource_manager_data_source_is_looping", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_DATA_SOURCE_GET_AVAILABLE_FRAMES = downcallHandle("ma_resource_manager_data_source_get_available_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_POST_JOB = downcallHandle("ma_resource_manager_post_job", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_POST_JOB_QUIT = downcallHandle("ma_resource_manager_post_job_quit", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_NEXT_JOB = downcallHandle("ma_resource_manager_next_job", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_PROCESS_JOB = downcallHandle("ma_resource_manager_process_job", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_RESOURCE_MANAGER_PROCESS_NEXT_JOB = downcallHandle("ma_resource_manager_process_next_job", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_NODE_CONFIG_INIT = downcallHandle("ma_node_config_init", MaNodeConfig.LAYOUT);
		MA_NODE_GET_HEAP_SIZE = downcallHandle("ma_node_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NODE_INIT_PREALLOCATED = downcallHandle("ma_node_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NODE_INIT = downcallHandle("ma_node_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NODE_UNINIT = downcallHandleVoid("ma_node_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NODE_GET_NODE_GRAPH = downcallHandle("ma_node_get_node_graph", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NODE_GET_INPUT_BUS_COUNT = downcallHandle("ma_node_get_input_bus_count", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_NODE_GET_OUTPUT_BUS_COUNT = downcallHandle("ma_node_get_output_bus_count", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_NODE_GET_INPUT_CHANNELS = downcallHandle("ma_node_get_input_channels", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_NODE_GET_OUTPUT_CHANNELS = downcallHandle("ma_node_get_output_channels", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_NODE_ATTACH_OUTPUT_BUS = downcallHandle("ma_node_attach_output_bus", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_NODE_DETACH_OUTPUT_BUS = downcallHandle("ma_node_detach_output_bus", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_NODE_DETACH_ALL_OUTPUT_BUSES = downcallHandle("ma_node_detach_all_output_buses", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_NODE_SET_OUTPUT_BUS_VOLUME = downcallHandle("ma_node_set_output_bus_volume", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
		MA_NODE_GET_OUTPUT_BUS_VOLUME = downcallHandle("ma_node_get_output_bus_volume", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_NODE_SET_STATE = downcallHandle("ma_node_set_state", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_NODE_GET_STATE = downcallHandle("ma_node_get_state", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_NODE_SET_STATE_TIME = downcallHandle("ma_node_set_state_time", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_LONG);
		MA_NODE_GET_STATE_TIME = downcallHandle("ma_node_get_state_time", JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_NODE_GET_STATE_BY_TIME = downcallHandle("ma_node_get_state_by_time", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_NODE_GET_STATE_BY_TIME_RANGE = downcallHandle("ma_node_get_state_by_time_range", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MA_NODE_GET_TIME = downcallHandle("ma_node_get_time", JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_NODE_SET_TIME = downcallHandle("ma_node_set_time", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_NODE_GRAPH_CONFIG_INIT = downcallHandle("ma_node_graph_config_init", MaNodeGraphConfig.LAYOUT, JAVA_INT);
		MA_NODE_GRAPH_INIT = downcallHandle("ma_node_graph_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NODE_GRAPH_UNINIT = downcallHandleVoid("ma_node_graph_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NODE_GRAPH_GET_ENDPOINT = downcallHandle("ma_node_graph_get_endpoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NODE_GRAPH_READ_PCM_FRAMES = downcallHandle("ma_node_graph_read_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_NODE_GRAPH_GET_CHANNELS = downcallHandle("ma_node_graph_get_channels", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_NODE_GRAPH_GET_TIME = downcallHandle("ma_node_graph_get_time", JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_NODE_GRAPH_SET_TIME = downcallHandle("ma_node_graph_set_time", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_NODE_GRAPH_GET_PROCESSING_SIZE_IN_FRAMES = downcallHandle("ma_node_graph_get_processing_size_in_frames", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_NODE_CONFIG_INIT = downcallHandle("ma_data_source_node_config_init", MaDataSourceNodeConfig.LAYOUT, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_NODE_INIT = downcallHandle("ma_data_source_node_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_NODE_UNINIT = downcallHandleVoid("ma_data_source_node_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DATA_SOURCE_NODE_SET_LOOPING = downcallHandle("ma_data_source_node_set_looping", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_DATA_SOURCE_NODE_IS_LOOPING = downcallHandle("ma_data_source_node_is_looping", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SPLITTER_NODE_CONFIG_INIT = downcallHandle("ma_splitter_node_config_init", MaSplitterNodeConfig.LAYOUT, JAVA_INT);
		MA_SPLITTER_NODE_INIT = downcallHandle("ma_splitter_node_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SPLITTER_NODE_UNINIT = downcallHandleVoid("ma_splitter_node_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BIQUAD_NODE_CONFIG_INIT = downcallHandle("ma_biquad_node_config_init", MaBiquadNodeConfig.LAYOUT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_BIQUAD_NODE_INIT = downcallHandle("ma_biquad_node_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BIQUAD_NODE_REINIT = downcallHandle("ma_biquad_node_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BIQUAD_NODE_UNINIT = downcallHandleVoid("ma_biquad_node_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LPF_NODE_CONFIG_INIT = downcallHandle("ma_lpf_node_config_init", MaLpfNodeConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_INT);
		MA_LPF_NODE_INIT = downcallHandle("ma_lpf_node_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LPF_NODE_REINIT = downcallHandle("ma_lpf_node_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LPF_NODE_UNINIT = downcallHandleVoid("ma_lpf_node_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HPF_NODE_CONFIG_INIT = downcallHandle("ma_hpf_node_config_init", MaHpfNodeConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_INT);
		MA_HPF_NODE_INIT = downcallHandle("ma_hpf_node_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HPF_NODE_REINIT = downcallHandle("ma_hpf_node_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HPF_NODE_UNINIT = downcallHandleVoid("ma_hpf_node_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BPF_NODE_CONFIG_INIT = downcallHandle("ma_bpf_node_config_init", MaBpfNodeConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_INT);
		MA_BPF_NODE_INIT = downcallHandle("ma_bpf_node_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BPF_NODE_REINIT = downcallHandle("ma_bpf_node_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_BPF_NODE_UNINIT = downcallHandleVoid("ma_bpf_node_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NOTCH_NODE_CONFIG_INIT = downcallHandle("ma_notch_node_config_init", MaNotchNodeConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE);
		MA_NOTCH_NODE_INIT = downcallHandle("ma_notch_node_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NOTCH_NODE_REINIT = downcallHandle("ma_notch_node_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_NOTCH_NODE_UNINIT = downcallHandleVoid("ma_notch_node_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PEAK_NODE_CONFIG_INIT = downcallHandle("ma_peak_node_config_init", MaPeakNodeConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE);
		MA_PEAK_NODE_INIT = downcallHandle("ma_peak_node_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PEAK_NODE_REINIT = downcallHandle("ma_peak_node_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_PEAK_NODE_UNINIT = downcallHandleVoid("ma_peak_node_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LOSHELF_NODE_CONFIG_INIT = downcallHandle("ma_loshelf_node_config_init", MaLoshelfNodeConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE);
		MA_LOSHELF_NODE_INIT = downcallHandle("ma_loshelf_node_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LOSHELF_NODE_REINIT = downcallHandle("ma_loshelf_node_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_LOSHELF_NODE_UNINIT = downcallHandleVoid("ma_loshelf_node_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HISHELF_NODE_CONFIG_INIT = downcallHandle("ma_hishelf_node_config_init", MaHishelfNodeConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE);
		MA_HISHELF_NODE_INIT = downcallHandle("ma_hishelf_node_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HISHELF_NODE_REINIT = downcallHandle("ma_hishelf_node_reinit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_HISHELF_NODE_UNINIT = downcallHandleVoid("ma_hishelf_node_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DELAY_NODE_CONFIG_INIT = downcallHandle("ma_delay_node_config_init", MaDelayNodeConfig.LAYOUT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_FLOAT);
		MA_DELAY_NODE_INIT = downcallHandle("ma_delay_node_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DELAY_NODE_UNINIT = downcallHandleVoid("ma_delay_node_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_DELAY_NODE_SET_WET = downcallHandleVoid("ma_delay_node_set_wet", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_DELAY_NODE_GET_WET = downcallHandle("ma_delay_node_get_wet", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_DELAY_NODE_SET_DRY = downcallHandleVoid("ma_delay_node_set_dry", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_DELAY_NODE_GET_DRY = downcallHandle("ma_delay_node_get_dry", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_DELAY_NODE_SET_DECAY = downcallHandleVoid("ma_delay_node_set_decay", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_DELAY_NODE_GET_DECAY = downcallHandle("ma_delay_node_get_decay", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_ENGINE_NODE_CONFIG_INIT = downcallHandle("ma_engine_node_config_init", MaEngineNodeConfig.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		MA_ENGINE_NODE_GET_HEAP_SIZE = downcallHandle("ma_engine_node_get_heap_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_ENGINE_NODE_INIT_PREALLOCATED = downcallHandle("ma_engine_node_init_preallocated", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_ENGINE_NODE_INIT = downcallHandle("ma_engine_node_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_ENGINE_NODE_UNINIT = downcallHandleVoid("ma_engine_node_uninit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SOUND_CONFIG_INIT = downcallHandle("ma_sound_config_init", MaSoundConfig.LAYOUT);
		MA_SOUND_CONFIG_INIT_2 = downcallHandle("ma_sound_config_init_2", MaSoundConfig.LAYOUT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_CONFIG_INIT = downcallHandle("ma_sound_group_config_init", MaSoundConfig.LAYOUT);
		MA_SOUND_GROUP_CONFIG_INIT_2 = downcallHandle("ma_sound_group_config_init_2", MaSoundConfig.LAYOUT, UNBOUNDED_ADDRESS);
		MA_ENGINE_CONFIG_INIT = downcallHandle("ma_engine_config_init", MaEngineConfig.LAYOUT);
		MA_ENGINE_INIT = downcallHandle("ma_engine_init", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_ENGINE_UNINIT = downcallHandleVoid("ma_engine_uninit", UNBOUNDED_ADDRESS);
		MA_ENGINE_READ_PCM_FRAMES = downcallHandle("ma_engine_read_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_ENGINE_GET_NODE_GRAPH = downcallHandle("ma_engine_get_node_graph", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_ENGINE_GET_RESOURCE_MANAGER = downcallHandle("ma_engine_get_resource_manager", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_ENGINE_GET_DEVICE = downcallHandle("ma_engine_get_device", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_ENGINE_GET_LOG = downcallHandle("ma_engine_get_log", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_ENGINE_GET_ENDPOINT = downcallHandle("ma_engine_get_endpoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_ENGINE_GET_TIME_IN_PCM_FRAMES = downcallHandle("ma_engine_get_time_in_pcm_frames", JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_ENGINE_GET_TIME_IN_MILLISECONDS = downcallHandle("ma_engine_get_time_in_milliseconds", JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_ENGINE_SET_TIME_IN_PCM_FRAMES = downcallHandle("ma_engine_set_time_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_ENGINE_SET_TIME_IN_MILLISECONDS = downcallHandle("ma_engine_set_time_in_milliseconds", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_ENGINE_GET_TIME = downcallHandle("ma_engine_get_time", JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_ENGINE_SET_TIME = downcallHandle("ma_engine_set_time", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_ENGINE_GET_CHANNELS = downcallHandle("ma_engine_get_channels", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_ENGINE_GET_SAMPLE_RATE = downcallHandle("ma_engine_get_sample_rate", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_ENGINE_START = downcallHandle("ma_engine_start", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_ENGINE_STOP = downcallHandle("ma_engine_stop", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_ENGINE_SET_VOLUME = downcallHandle("ma_engine_set_volume", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_ENGINE_GET_VOLUME = downcallHandle("ma_engine_get_volume", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_ENGINE_SET_GAIN_DB = downcallHandle("ma_engine_set_gain_db", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_ENGINE_GET_GAIN_DB = downcallHandle("ma_engine_get_gain_db", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_ENGINE_GET_LISTENER_COUNT = downcallHandle("ma_engine_get_listener_count", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_ENGINE_FIND_CLOSEST_LISTENER = downcallHandle("ma_engine_find_closest_listener", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_ENGINE_LISTENER_SET_POSITION = downcallHandleVoid("ma_engine_listener_set_position", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_ENGINE_LISTENER_GET_POSITION = downcallHandle("ma_engine_listener_get_position", MaVec3f.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_ENGINE_LISTENER_SET_DIRECTION = downcallHandleVoid("ma_engine_listener_set_direction", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_ENGINE_LISTENER_GET_DIRECTION = downcallHandle("ma_engine_listener_get_direction", MaVec3f.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_ENGINE_LISTENER_SET_VELOCITY = downcallHandleVoid("ma_engine_listener_set_velocity", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_ENGINE_LISTENER_GET_VELOCITY = downcallHandle("ma_engine_listener_get_velocity", MaVec3f.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_ENGINE_LISTENER_SET_CONE = downcallHandleVoid("ma_engine_listener_set_cone", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_ENGINE_LISTENER_GET_CONE = downcallHandleVoid("ma_engine_listener_get_cone", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_ENGINE_LISTENER_SET_WORLD_UP = downcallHandleVoid("ma_engine_listener_set_world_up", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_ENGINE_LISTENER_GET_WORLD_UP = downcallHandle("ma_engine_listener_get_world_up", MaVec3f.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_ENGINE_LISTENER_SET_ENABLED = downcallHandleVoid("ma_engine_listener_set_enabled", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		MA_ENGINE_LISTENER_IS_ENABLED = downcallHandle("ma_engine_listener_is_enabled", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_ENGINE_PLAY_SOUND_EX = downcallHandle("ma_engine_play_sound_ex", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		MA_ENGINE_PLAY_SOUND = downcallHandle("ma_engine_play_sound", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SOUND_INIT_FROM_FILE = downcallHandle("ma_sound_init_from_file", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SOUND_INIT_FROM_FILE_W = downcallHandle("ma_sound_init_from_file_w", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SOUND_INIT_COPY = downcallHandle("ma_sound_init_copy", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SOUND_INIT_FROM_DATA_SOURCE = downcallHandle("ma_sound_init_from_data_source", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SOUND_INIT_EX = downcallHandle("ma_sound_init_ex", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SOUND_UNINIT = downcallHandleVoid("ma_sound_uninit", UNBOUNDED_ADDRESS);
		MA_SOUND_GET_ENGINE = downcallHandle("ma_sound_get_engine", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SOUND_GET_DATA_SOURCE = downcallHandle("ma_sound_get_data_source", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SOUND_START = downcallHandle("ma_sound_start", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_STOP = downcallHandle("ma_sound_stop", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_STOP_WITH_FADE_IN_PCM_FRAMES = downcallHandle("ma_sound_stop_with_fade_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_SOUND_STOP_WITH_FADE_IN_MILLISECONDS = downcallHandle("ma_sound_stop_with_fade_in_milliseconds", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_SOUND_RESET_START_TIME = downcallHandleVoid("ma_sound_reset_start_time", UNBOUNDED_ADDRESS);
		MA_SOUND_RESET_STOP_TIME = downcallHandleVoid("ma_sound_reset_stop_time", UNBOUNDED_ADDRESS);
		MA_SOUND_RESET_FADE = downcallHandleVoid("ma_sound_reset_fade", UNBOUNDED_ADDRESS);
		MA_SOUND_RESET_STOP_TIME_AND_FADE = downcallHandleVoid("ma_sound_reset_stop_time_and_fade", UNBOUNDED_ADDRESS);
		MA_SOUND_SET_VOLUME = downcallHandleVoid("ma_sound_set_volume", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GET_VOLUME = downcallHandle("ma_sound_get_volume", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_PAN = downcallHandleVoid("ma_sound_set_pan", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GET_PAN = downcallHandle("ma_sound_get_pan", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_PAN_MODE = downcallHandleVoid("ma_sound_set_pan_mode", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_SOUND_GET_PAN_MODE = downcallHandle("ma_sound_get_pan_mode", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_PITCH = downcallHandleVoid("ma_sound_set_pitch", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GET_PITCH = downcallHandle("ma_sound_get_pitch", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_SPATIALIZATION_ENABLED = downcallHandleVoid("ma_sound_set_spatialization_enabled", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_SOUND_IS_SPATIALIZATION_ENABLED = downcallHandle("ma_sound_is_spatialization_enabled", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_PINNED_LISTENER_INDEX = downcallHandleVoid("ma_sound_set_pinned_listener_index", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_SOUND_GET_PINNED_LISTENER_INDEX = downcallHandle("ma_sound_get_pinned_listener_index", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_GET_LISTENER_INDEX = downcallHandle("ma_sound_get_listener_index", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_GET_DIRECTION_TO_LISTENER = downcallHandle("ma_sound_get_direction_to_listener", MaVec3f.LAYOUT, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_POSITION = downcallHandleVoid("ma_sound_set_position", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_SOUND_GET_POSITION = downcallHandle("ma_sound_get_position", MaVec3f.LAYOUT, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_DIRECTION = downcallHandleVoid("ma_sound_set_direction", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_SOUND_GET_DIRECTION = downcallHandle("ma_sound_get_direction", MaVec3f.LAYOUT, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_VELOCITY = downcallHandleVoid("ma_sound_set_velocity", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_SOUND_GET_VELOCITY = downcallHandle("ma_sound_get_velocity", MaVec3f.LAYOUT, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_ATTENUATION_MODEL = downcallHandleVoid("ma_sound_set_attenuation_model", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_SOUND_GET_ATTENUATION_MODEL = downcallHandle("ma_sound_get_attenuation_model", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_POSITIONING = downcallHandleVoid("ma_sound_set_positioning", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_SOUND_GET_POSITIONING = downcallHandle("ma_sound_get_positioning", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_ROLLOFF = downcallHandleVoid("ma_sound_set_rolloff", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GET_ROLLOFF = downcallHandle("ma_sound_get_rolloff", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_MIN_GAIN = downcallHandleVoid("ma_sound_set_min_gain", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GET_MIN_GAIN = downcallHandle("ma_sound_get_min_gain", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_MAX_GAIN = downcallHandleVoid("ma_sound_set_max_gain", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GET_MAX_GAIN = downcallHandle("ma_sound_get_max_gain", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_MIN_DISTANCE = downcallHandleVoid("ma_sound_set_min_distance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GET_MIN_DISTANCE = downcallHandle("ma_sound_get_min_distance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_MAX_DISTANCE = downcallHandleVoid("ma_sound_set_max_distance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GET_MAX_DISTANCE = downcallHandle("ma_sound_get_max_distance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_CONE = downcallHandleVoid("ma_sound_set_cone", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_SOUND_GET_CONE = downcallHandleVoid("ma_sound_get_cone", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_DOPPLER_FACTOR = downcallHandleVoid("ma_sound_set_doppler_factor", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GET_DOPPLER_FACTOR = downcallHandle("ma_sound_get_doppler_factor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_DIRECTIONAL_ATTENUATION_FACTOR = downcallHandleVoid("ma_sound_set_directional_attenuation_factor", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GET_DIRECTIONAL_ATTENUATION_FACTOR = downcallHandle("ma_sound_get_directional_attenuation_factor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_FADE_IN_PCM_FRAMES = downcallHandleVoid("ma_sound_set_fade_in_pcm_frames", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_LONG);
		MA_SOUND_SET_FADE_IN_MILLISECONDS = downcallHandleVoid("ma_sound_set_fade_in_milliseconds", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_LONG);
		MA_SOUND_SET_FADE_START_IN_PCM_FRAMES = downcallHandleVoid("ma_sound_set_fade_start_in_pcm_frames", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_LONG, JAVA_LONG);
		MA_SOUND_SET_FADE_START_IN_MILLISECONDS = downcallHandleVoid("ma_sound_set_fade_start_in_milliseconds", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_LONG, JAVA_LONG);
		MA_SOUND_GET_CURRENT_FADE_VOLUME = downcallHandle("ma_sound_get_current_fade_volume", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_START_TIME_IN_PCM_FRAMES = downcallHandleVoid("ma_sound_set_start_time_in_pcm_frames", UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_SOUND_SET_START_TIME_IN_MILLISECONDS = downcallHandleVoid("ma_sound_set_start_time_in_milliseconds", UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_SOUND_SET_STOP_TIME_IN_PCM_FRAMES = downcallHandleVoid("ma_sound_set_stop_time_in_pcm_frames", UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_SOUND_SET_STOP_TIME_IN_MILLISECONDS = downcallHandleVoid("ma_sound_set_stop_time_in_milliseconds", UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_SOUND_SET_STOP_TIME_WITH_FADE_IN_PCM_FRAMES = downcallHandleVoid("ma_sound_set_stop_time_with_fade_in_pcm_frames", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MA_SOUND_SET_STOP_TIME_WITH_FADE_IN_MILLISECONDS = downcallHandleVoid("ma_sound_set_stop_time_with_fade_in_milliseconds", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MA_SOUND_IS_PLAYING = downcallHandle("ma_sound_is_playing", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_GET_TIME_IN_PCM_FRAMES = downcallHandle("ma_sound_get_time_in_pcm_frames", JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_SOUND_GET_TIME_IN_MILLISECONDS = downcallHandle("ma_sound_get_time_in_milliseconds", JAVA_LONG, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_LOOPING = downcallHandleVoid("ma_sound_set_looping", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_SOUND_IS_LOOPING = downcallHandle("ma_sound_is_looping", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_AT_END = downcallHandle("ma_sound_at_end", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_SEEK_TO_PCM_FRAME = downcallHandle("ma_sound_seek_to_pcm_frame", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_SOUND_SEEK_TO_SECOND = downcallHandle("ma_sound_seek_to_second", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GET_DATA_FORMAT = downcallHandle("ma_sound_get_data_format", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_SOUND_GET_CURSOR_IN_PCM_FRAMES = downcallHandle("ma_sound_get_cursor_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SOUND_GET_LENGTH_IN_PCM_FRAMES = downcallHandle("ma_sound_get_length_in_pcm_frames", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SOUND_GET_CURSOR_IN_SECONDS = downcallHandle("ma_sound_get_cursor_in_seconds", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SOUND_GET_LENGTH_IN_SECONDS = downcallHandle("ma_sound_get_length_in_seconds", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SOUND_SET_END_CALLBACK = downcallHandle("ma_sound_set_end_callback", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_INIT = downcallHandle("ma_sound_group_init", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_INIT_EX = downcallHandle("ma_sound_group_init_ex", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_UNINIT = downcallHandleVoid("ma_sound_group_uninit", UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_GET_ENGINE = downcallHandle("ma_sound_group_get_engine", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_START = downcallHandle("ma_sound_group_start", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_STOP = downcallHandle("ma_sound_group_stop", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_VOLUME = downcallHandleVoid("ma_sound_group_set_volume", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GROUP_GET_VOLUME = downcallHandle("ma_sound_group_get_volume", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_PAN = downcallHandleVoid("ma_sound_group_set_pan", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GROUP_GET_PAN = downcallHandle("ma_sound_group_get_pan", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_PAN_MODE = downcallHandleVoid("ma_sound_group_set_pan_mode", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_SOUND_GROUP_GET_PAN_MODE = downcallHandle("ma_sound_group_get_pan_mode", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_PITCH = downcallHandleVoid("ma_sound_group_set_pitch", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GROUP_GET_PITCH = downcallHandle("ma_sound_group_get_pitch", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_SPATIALIZATION_ENABLED = downcallHandleVoid("ma_sound_group_set_spatialization_enabled", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_SOUND_GROUP_IS_SPATIALIZATION_ENABLED = downcallHandle("ma_sound_group_is_spatialization_enabled", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_PINNED_LISTENER_INDEX = downcallHandleVoid("ma_sound_group_set_pinned_listener_index", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_SOUND_GROUP_GET_PINNED_LISTENER_INDEX = downcallHandle("ma_sound_group_get_pinned_listener_index", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_GET_LISTENER_INDEX = downcallHandle("ma_sound_group_get_listener_index", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_GET_DIRECTION_TO_LISTENER = downcallHandle("ma_sound_group_get_direction_to_listener", MaVec3f.LAYOUT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_POSITION = downcallHandleVoid("ma_sound_group_set_position", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_SOUND_GROUP_GET_POSITION = downcallHandle("ma_sound_group_get_position", MaVec3f.LAYOUT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_DIRECTION = downcallHandleVoid("ma_sound_group_set_direction", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_SOUND_GROUP_GET_DIRECTION = downcallHandle("ma_sound_group_get_direction", MaVec3f.LAYOUT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_VELOCITY = downcallHandleVoid("ma_sound_group_set_velocity", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_SOUND_GROUP_GET_VELOCITY = downcallHandle("ma_sound_group_get_velocity", MaVec3f.LAYOUT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_ATTENUATION_MODEL = downcallHandleVoid("ma_sound_group_set_attenuation_model", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_SOUND_GROUP_GET_ATTENUATION_MODEL = downcallHandle("ma_sound_group_get_attenuation_model", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_POSITIONING = downcallHandleVoid("ma_sound_group_set_positioning", UNBOUNDED_ADDRESS, JAVA_INT);
		MA_SOUND_GROUP_GET_POSITIONING = downcallHandle("ma_sound_group_get_positioning", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_ROLLOFF = downcallHandleVoid("ma_sound_group_set_rolloff", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GROUP_GET_ROLLOFF = downcallHandle("ma_sound_group_get_rolloff", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_MIN_GAIN = downcallHandleVoid("ma_sound_group_set_min_gain", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GROUP_GET_MIN_GAIN = downcallHandle("ma_sound_group_get_min_gain", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_MAX_GAIN = downcallHandleVoid("ma_sound_group_set_max_gain", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GROUP_GET_MAX_GAIN = downcallHandle("ma_sound_group_get_max_gain", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_MIN_DISTANCE = downcallHandleVoid("ma_sound_group_set_min_distance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GROUP_GET_MIN_DISTANCE = downcallHandle("ma_sound_group_get_min_distance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_MAX_DISTANCE = downcallHandleVoid("ma_sound_group_set_max_distance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GROUP_GET_MAX_DISTANCE = downcallHandle("ma_sound_group_get_max_distance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_CONE = downcallHandleVoid("ma_sound_group_set_cone", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		MA_SOUND_GROUP_GET_CONE = downcallHandleVoid("ma_sound_group_get_cone", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_DOPPLER_FACTOR = downcallHandleVoid("ma_sound_group_set_doppler_factor", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GROUP_GET_DOPPLER_FACTOR = downcallHandle("ma_sound_group_get_doppler_factor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_DIRECTIONAL_ATTENUATION_FACTOR = downcallHandleVoid("ma_sound_group_set_directional_attenuation_factor", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		MA_SOUND_GROUP_GET_DIRECTIONAL_ATTENUATION_FACTOR = downcallHandle("ma_sound_group_get_directional_attenuation_factor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_FADE_IN_PCM_FRAMES = downcallHandleVoid("ma_sound_group_set_fade_in_pcm_frames", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_LONG);
		MA_SOUND_GROUP_SET_FADE_IN_MILLISECONDS = downcallHandleVoid("ma_sound_group_set_fade_in_milliseconds", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_LONG);
		MA_SOUND_GROUP_GET_CURRENT_FADE_VOLUME = downcallHandle("ma_sound_group_get_current_fade_volume", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_SET_START_TIME_IN_PCM_FRAMES = downcallHandleVoid("ma_sound_group_set_start_time_in_pcm_frames", UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_SOUND_GROUP_SET_START_TIME_IN_MILLISECONDS = downcallHandleVoid("ma_sound_group_set_start_time_in_milliseconds", UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_SOUND_GROUP_SET_STOP_TIME_IN_PCM_FRAMES = downcallHandleVoid("ma_sound_group_set_stop_time_in_pcm_frames", UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_SOUND_GROUP_SET_STOP_TIME_IN_MILLISECONDS = downcallHandleVoid("ma_sound_group_set_stop_time_in_milliseconds", UNBOUNDED_ADDRESS, JAVA_LONG);
		MA_SOUND_GROUP_IS_PLAYING = downcallHandle("ma_sound_group_is_playing", JAVA_INT, UNBOUNDED_ADDRESS);
		MA_SOUND_GROUP_GET_TIME_IN_PCM_FRAMES = downcallHandle("ma_sound_group_get_time_in_pcm_frames", JAVA_LONG, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	private Miniaudio() {
	}

    public static void ma_version(
    	MemorySegment pMajor,
    	MemorySegment pMinor,
    	MemorySegment pRevision
    ) {
    	MethodHandle method = MA_VERSION.get();
    	try {
    		 method.invokeExact(
    			pMajor,
    			pMinor,
    			pRevision
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_version].
    public static void ma_version(
    	NativeIntArray pMajor,
    	NativeIntArray pMinor,
    	NativeIntArray pRevision
    ) {
    	ma_version(
    		pMajor.memorySegment(),
    		pMinor.memorySegment(),
    		pRevision.memorySegment()
    	);
    }
    
    public static MemorySegment nma_version_string() {
    	MethodHandle method = MA_VERSION_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_version_string].
    public static @Nullable String ma_version_string() {
    	MemorySegment segment = nma_version_string();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return segment.getString(0);
    }
    
    public static MemorySegment ma_log_callback_init(
    	SegmentAllocator allocator,
    	MemorySegment onLog,
    	MemorySegment pUserData
    ) {
    	MethodHandle method = MA_LOG_CALLBACK_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			onLog,
    			pUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_log_callback_init].
    public static @Nullable MaLogCallback ma_log_callback_init(
    	SegmentAllocator allocator,
    	MaLogCallbackProc onLog,
    	MemorySegment pUserData
    ) {
    	MemorySegment segment = ma_log_callback_init(
    		allocator,
    		onLog.memorySegment(),
    		pUserData
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaLogCallback(segment);
    }
    
    public static int ma_log_init(
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pLog
    ) {
    	MethodHandle method = MA_LOG_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pAllocationCallbacks,
    			pLog
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_log_init].
    public static int ma_log_init(
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaLog pLog
    ) {
    	return ma_log_init(
    		pAllocationCallbacks.memorySegment(),
    		pLog.memorySegment()
    	);
    }
    
    public static void ma_log_uninit(
    	MemorySegment pLog
    ) {
    	MethodHandle method = MA_LOG_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pLog
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_log_uninit].
    public static void ma_log_uninit(
    	MaLog pLog
    ) {
    	ma_log_uninit(
    		pLog.memorySegment()
    	);
    }
    
    public static int ma_log_register_callback(
    	MemorySegment pLog,
    	MemorySegment callback
    ) {
    	MethodHandle method = MA_LOG_REGISTER_CALLBACK.get();
    	try {
    		return (int) method.invokeExact(
    			pLog,
    			callback
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_log_register_callback].
    public static int ma_log_register_callback(
    	MaLog pLog,
    	MaLogCallback callback
    ) {
    	return ma_log_register_callback(
    		pLog.memorySegment(),
    		callback.memorySegment()
    	);
    }
    
    public static int ma_log_unregister_callback(
    	MemorySegment pLog,
    	MemorySegment callback
    ) {
    	MethodHandle method = MA_LOG_UNREGISTER_CALLBACK.get();
    	try {
    		return (int) method.invokeExact(
    			pLog,
    			callback
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_log_unregister_callback].
    public static int ma_log_unregister_callback(
    	MaLog pLog,
    	MaLogCallback callback
    ) {
    	return ma_log_unregister_callback(
    		pLog.memorySegment(),
    		callback.memorySegment()
    	);
    }
    
    public static int ma_log_post(
    	MemorySegment pLog,
    	int level,
    	MemorySegment pMessage
    ) {
    	MethodHandle method = MA_LOG_POST.get();
    	try {
    		return (int) method.invokeExact(
    			pLog,
    			level,
    			pMessage
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_log_post].
    public static int ma_log_post(
    	MaLog pLog,
    	int level,
    	String pMessage
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_log_post(
    			pLog.memorySegment(),
    			level,
    			arena.allocateFrom(pMessage)
    		);
    	}
    }
    
    public static int ma_log_postv(
    	MemorySegment pLog,
    	int level,
    	MemorySegment pFormat,
    	MemorySegment args
    ) {
    	MethodHandle method = MA_LOG_POSTV.get();
    	try {
    		return (int) method.invokeExact(
    			pLog,
    			level,
    			pFormat,
    			args
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_log_postv].
    public static int ma_log_postv(
    	MaLog pLog,
    	int level,
    	NativeByteArray pFormat,
    	NativeByteArray args
    ) {
    	return ma_log_postv(
    		pLog.memorySegment(),
    		level,
    		pFormat.memorySegment(),
    		args.memorySegment()
    	);
    }
    
    public static int ma_log_postf(
    	MemorySegment pLog,
    	int level,
    	MemorySegment pFormat
    ) {
    	MethodHandle method = MA_LOG_POSTF.get();
    	try {
    		return (int) method.invokeExact(
    			pLog,
    			level,
    			pFormat
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_log_postf].
    public static int ma_log_postf(
    	MaLog pLog,
    	int level,
    	NativeByteArray pFormat
    ) {
    	return ma_log_postf(
    		pLog.memorySegment(),
    		level,
    		pFormat.memorySegment()
    	);
    }
    
    public static MemorySegment nma_biquad_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	double b0,
    	double b1,
    	double b2,
    	double a0,
    	double a1,
    	double a2
    ) {
    	MethodHandle method = MA_BIQUAD_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			b0,
    			b1,
    			b2,
    			a0,
    			a1,
    			a2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_biquad_config_init].
    public static @Nullable MaBiquadConfig ma_biquad_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	double b0,
    	double b1,
    	double b2,
    	double a0,
    	double a1,
    	double a2
    ) {
    	MemorySegment segment = nma_biquad_config_init(
    		allocator,
    		format,
    		channels,
    		b0,
    		b1,
    		b2,
    		a0,
    		a1,
    		a2
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaBiquadConfig(segment);
    }
    
    public static int ma_biquad_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_BIQUAD_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_biquad_get_heap_size].
    public static int ma_biquad_get_heap_size(
    	MaBiquadConfig pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_biquad_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_biquad_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pBQ
    ) {
    	MethodHandle method = MA_BIQUAD_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pBQ
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_biquad_init_preallocated].
    public static int ma_biquad_init_preallocated(
    	MaBiquadConfig pConfig,
    	MemorySegment pHeap,
    	MaBiquad pBQ
    ) {
    	return ma_biquad_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pBQ.memorySegment()
    	);
    }
    
    public static int ma_biquad_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pBQ
    ) {
    	MethodHandle method = MA_BIQUAD_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pBQ
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_biquad_init].
    public static int ma_biquad_init(
    	MaBiquadConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaBiquad pBQ
    ) {
    	return ma_biquad_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pBQ.memorySegment()
    	);
    }
    
    public static void ma_biquad_uninit(
    	MemorySegment pBQ,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_BIQUAD_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pBQ,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_biquad_uninit].
    public static void ma_biquad_uninit(
    	MaBiquad pBQ,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_biquad_uninit(
    		pBQ.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_biquad_reinit(
    	MemorySegment pConfig,
    	MemorySegment pBQ
    ) {
    	MethodHandle method = MA_BIQUAD_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pBQ
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_biquad_reinit].
    public static int ma_biquad_reinit(
    	MaBiquadConfig pConfig,
    	MaBiquad pBQ
    ) {
    	return ma_biquad_reinit(
    		pConfig.memorySegment(),
    		pBQ.memorySegment()
    	);
    }
    
    public static int ma_biquad_clear_cache(
    	MemorySegment pBQ
    ) {
    	MethodHandle method = MA_BIQUAD_CLEAR_CACHE.get();
    	try {
    		return (int) method.invokeExact(
    			pBQ
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_biquad_clear_cache].
    public static int ma_biquad_clear_cache(
    	MaBiquad pBQ
    ) {
    	return ma_biquad_clear_cache(
    		pBQ.memorySegment()
    	);
    }
    
    public static int ma_biquad_process_pcm_frames(
    	MemorySegment pBQ,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	MethodHandle method = MA_BIQUAD_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pBQ,
    			pFramesOut,
    			pFramesIn,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_biquad_process_pcm_frames].
    public static int ma_biquad_process_pcm_frames(
    	MaBiquad pBQ,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	return ma_biquad_process_pcm_frames(
    		pBQ.memorySegment(),
    		pFramesOut,
    		pFramesIn,
    		frameCount
    	);
    }
    
    public static int ma_biquad_get_latency(
    	MemorySegment pBQ
    ) {
    	MethodHandle method = MA_BIQUAD_GET_LATENCY.get();
    	try {
    		return (int) method.invokeExact(
    			pBQ
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_biquad_get_latency].
    public static int ma_biquad_get_latency(
    	MaBiquad pBQ
    ) {
    	return ma_biquad_get_latency(
    		pBQ.memorySegment()
    	);
    }
    
    public static MemorySegment nma_lpf1_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency
    ) {
    	MethodHandle method = MA_LPF1_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			sampleRate,
    			cutoffFrequency
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_lpf1_config_init].
    public static @Nullable MaLpf1Config ma_lpf1_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency
    ) {
    	MemorySegment segment = nma_lpf1_config_init(
    		allocator,
    		format,
    		channels,
    		sampleRate,
    		cutoffFrequency
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaLpf1Config(segment);
    }
    
    public static MemorySegment nma_lpf2_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency,
    	double q
    ) {
    	MethodHandle method = MA_LPF2_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			sampleRate,
    			cutoffFrequency,
    			q
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_lpf2_config_init].
    public static @Nullable MaLpf1Config ma_lpf2_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency,
    	double q
    ) {
    	MemorySegment segment = nma_lpf2_config_init(
    		allocator,
    		format,
    		channels,
    		sampleRate,
    		cutoffFrequency,
    		q
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaLpf1Config(segment);
    }
    
    public static int ma_lpf1_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_LPF1_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf1_get_heap_size].
    public static int ma_lpf1_get_heap_size(
    	MaLpf1Config pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_lpf1_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_lpf1_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pLPF
    ) {
    	MethodHandle method = MA_LPF1_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pLPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf1_init_preallocated].
    public static int ma_lpf1_init_preallocated(
    	MaLpf1Config pConfig,
    	MemorySegment pHeap,
    	MaLpf1 pLPF
    ) {
    	return ma_lpf1_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pLPF.memorySegment()
    	);
    }
    
    public static int ma_lpf1_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pLPF
    ) {
    	MethodHandle method = MA_LPF1_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pLPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf1_init].
    public static int ma_lpf1_init(
    	MaLpf1Config pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaLpf1 pLPF
    ) {
    	return ma_lpf1_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pLPF.memorySegment()
    	);
    }
    
    public static void ma_lpf1_uninit(
    	MemorySegment pLPF,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_LPF1_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pLPF,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf1_uninit].
    public static void ma_lpf1_uninit(
    	MaLpf1 pLPF,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_lpf1_uninit(
    		pLPF.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_lpf1_reinit(
    	MemorySegment pConfig,
    	MemorySegment pLPF
    ) {
    	MethodHandle method = MA_LPF1_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pLPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf1_reinit].
    public static int ma_lpf1_reinit(
    	MaLpf1Config pConfig,
    	MaLpf1 pLPF
    ) {
    	return ma_lpf1_reinit(
    		pConfig.memorySegment(),
    		pLPF.memorySegment()
    	);
    }
    
    public static int ma_lpf1_clear_cache(
    	MemorySegment pLPF
    ) {
    	MethodHandle method = MA_LPF1_CLEAR_CACHE.get();
    	try {
    		return (int) method.invokeExact(
    			pLPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf1_clear_cache].
    public static int ma_lpf1_clear_cache(
    	MaLpf1 pLPF
    ) {
    	return ma_lpf1_clear_cache(
    		pLPF.memorySegment()
    	);
    }
    
    public static int ma_lpf1_process_pcm_frames(
    	MemorySegment pLPF,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	MethodHandle method = MA_LPF1_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pLPF,
    			pFramesOut,
    			pFramesIn,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf1_process_pcm_frames].
    public static int ma_lpf1_process_pcm_frames(
    	MaLpf1 pLPF,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	return ma_lpf1_process_pcm_frames(
    		pLPF.memorySegment(),
    		pFramesOut,
    		pFramesIn,
    		frameCount
    	);
    }
    
    public static int ma_lpf1_get_latency(
    	MemorySegment pLPF
    ) {
    	MethodHandle method = MA_LPF1_GET_LATENCY.get();
    	try {
    		return (int) method.invokeExact(
    			pLPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf1_get_latency].
    public static int ma_lpf1_get_latency(
    	MaLpf1 pLPF
    ) {
    	return ma_lpf1_get_latency(
    		pLPF.memorySegment()
    	);
    }
    
    public static int ma_lpf2_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_LPF2_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf2_get_heap_size].
    public static int ma_lpf2_get_heap_size(
    	MaLpf1Config pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_lpf2_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_lpf2_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pHPF
    ) {
    	MethodHandle method = MA_LPF2_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pHPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf2_init_preallocated].
    public static int ma_lpf2_init_preallocated(
    	MaLpf1Config pConfig,
    	MemorySegment pHeap,
    	MaLpf2 pHPF
    ) {
    	return ma_lpf2_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pHPF.memorySegment()
    	);
    }
    
    public static int ma_lpf2_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pLPF
    ) {
    	MethodHandle method = MA_LPF2_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pLPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf2_init].
    public static int ma_lpf2_init(
    	MaLpf1Config pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaLpf2 pLPF
    ) {
    	return ma_lpf2_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pLPF.memorySegment()
    	);
    }
    
    public static void ma_lpf2_uninit(
    	MemorySegment pLPF,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_LPF2_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pLPF,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf2_uninit].
    public static void ma_lpf2_uninit(
    	MaLpf2 pLPF,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_lpf2_uninit(
    		pLPF.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_lpf2_reinit(
    	MemorySegment pConfig,
    	MemorySegment pLPF
    ) {
    	MethodHandle method = MA_LPF2_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pLPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf2_reinit].
    public static int ma_lpf2_reinit(
    	MaLpf1Config pConfig,
    	MaLpf2 pLPF
    ) {
    	return ma_lpf2_reinit(
    		pConfig.memorySegment(),
    		pLPF.memorySegment()
    	);
    }
    
    public static int ma_lpf2_clear_cache(
    	MemorySegment pLPF
    ) {
    	MethodHandle method = MA_LPF2_CLEAR_CACHE.get();
    	try {
    		return (int) method.invokeExact(
    			pLPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf2_clear_cache].
    public static int ma_lpf2_clear_cache(
    	MaLpf2 pLPF
    ) {
    	return ma_lpf2_clear_cache(
    		pLPF.memorySegment()
    	);
    }
    
    public static int ma_lpf2_process_pcm_frames(
    	MemorySegment pLPF,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	MethodHandle method = MA_LPF2_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pLPF,
    			pFramesOut,
    			pFramesIn,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf2_process_pcm_frames].
    public static int ma_lpf2_process_pcm_frames(
    	MaLpf2 pLPF,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	return ma_lpf2_process_pcm_frames(
    		pLPF.memorySegment(),
    		pFramesOut,
    		pFramesIn,
    		frameCount
    	);
    }
    
    public static int ma_lpf2_get_latency(
    	MemorySegment pLPF
    ) {
    	MethodHandle method = MA_LPF2_GET_LATENCY.get();
    	try {
    		return (int) method.invokeExact(
    			pLPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf2_get_latency].
    public static int ma_lpf2_get_latency(
    	MaLpf2 pLPF
    ) {
    	return ma_lpf2_get_latency(
    		pLPF.memorySegment()
    	);
    }
    
    public static MemorySegment nma_lpf_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency,
    	int order
    ) {
    	MethodHandle method = MA_LPF_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			sampleRate,
    			cutoffFrequency,
    			order
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_lpf_config_init].
    public static @Nullable MaLpfConfig ma_lpf_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency,
    	int order
    ) {
    	MemorySegment segment = nma_lpf_config_init(
    		allocator,
    		format,
    		channels,
    		sampleRate,
    		cutoffFrequency,
    		order
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaLpfConfig(segment);
    }
    
    public static int ma_lpf_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_LPF_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf_get_heap_size].
    public static int ma_lpf_get_heap_size(
    	MaLpfConfig pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_lpf_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_lpf_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pLPF
    ) {
    	MethodHandle method = MA_LPF_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pLPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf_init_preallocated].
    public static int ma_lpf_init_preallocated(
    	MaLpfConfig pConfig,
    	MemorySegment pHeap,
    	MaLpf pLPF
    ) {
    	return ma_lpf_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pLPF.memorySegment()
    	);
    }
    
    public static int ma_lpf_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pLPF
    ) {
    	MethodHandle method = MA_LPF_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pLPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf_init].
    public static int ma_lpf_init(
    	MaLpfConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaLpf pLPF
    ) {
    	return ma_lpf_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pLPF.memorySegment()
    	);
    }
    
    public static void ma_lpf_uninit(
    	MemorySegment pLPF,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_LPF_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pLPF,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf_uninit].
    public static void ma_lpf_uninit(
    	MaLpf pLPF,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_lpf_uninit(
    		pLPF.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_lpf_reinit(
    	MemorySegment pConfig,
    	MemorySegment pLPF
    ) {
    	MethodHandle method = MA_LPF_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pLPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf_reinit].
    public static int ma_lpf_reinit(
    	MaLpfConfig pConfig,
    	MaLpf pLPF
    ) {
    	return ma_lpf_reinit(
    		pConfig.memorySegment(),
    		pLPF.memorySegment()
    	);
    }
    
    public static int ma_lpf_clear_cache(
    	MemorySegment pLPF
    ) {
    	MethodHandle method = MA_LPF_CLEAR_CACHE.get();
    	try {
    		return (int) method.invokeExact(
    			pLPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf_clear_cache].
    public static int ma_lpf_clear_cache(
    	MaLpf pLPF
    ) {
    	return ma_lpf_clear_cache(
    		pLPF.memorySegment()
    	);
    }
    
    public static int ma_lpf_process_pcm_frames(
    	MemorySegment pLPF,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	MethodHandle method = MA_LPF_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pLPF,
    			pFramesOut,
    			pFramesIn,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf_process_pcm_frames].
    public static int ma_lpf_process_pcm_frames(
    	MaLpf pLPF,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	return ma_lpf_process_pcm_frames(
    		pLPF.memorySegment(),
    		pFramesOut,
    		pFramesIn,
    		frameCount
    	);
    }
    
    public static int ma_lpf_get_latency(
    	MemorySegment pLPF
    ) {
    	MethodHandle method = MA_LPF_GET_LATENCY.get();
    	try {
    		return (int) method.invokeExact(
    			pLPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf_get_latency].
    public static int ma_lpf_get_latency(
    	MaLpf pLPF
    ) {
    	return ma_lpf_get_latency(
    		pLPF.memorySegment()
    	);
    }
    
    public static MemorySegment nma_hpf1_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency
    ) {
    	MethodHandle method = MA_HPF1_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			sampleRate,
    			cutoffFrequency
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_hpf1_config_init].
    public static @Nullable MaHpf1Config ma_hpf1_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency
    ) {
    	MemorySegment segment = nma_hpf1_config_init(
    		allocator,
    		format,
    		channels,
    		sampleRate,
    		cutoffFrequency
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaHpf1Config(segment);
    }
    
    public static MemorySegment nma_hpf2_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency,
    	double q
    ) {
    	MethodHandle method = MA_HPF2_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			sampleRate,
    			cutoffFrequency,
    			q
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_hpf2_config_init].
    public static @Nullable MaHpf1Config ma_hpf2_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency,
    	double q
    ) {
    	MemorySegment segment = nma_hpf2_config_init(
    		allocator,
    		format,
    		channels,
    		sampleRate,
    		cutoffFrequency,
    		q
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaHpf1Config(segment);
    }
    
    public static int ma_hpf1_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_HPF1_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf1_get_heap_size].
    public static int ma_hpf1_get_heap_size(
    	MaHpf1Config pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_hpf1_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_hpf1_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pLPF
    ) {
    	MethodHandle method = MA_HPF1_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pLPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf1_init_preallocated].
    public static int ma_hpf1_init_preallocated(
    	MaHpf1Config pConfig,
    	MemorySegment pHeap,
    	MaHpf1 pLPF
    ) {
    	return ma_hpf1_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pLPF.memorySegment()
    	);
    }
    
    public static int ma_hpf1_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pHPF
    ) {
    	MethodHandle method = MA_HPF1_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pHPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf1_init].
    public static int ma_hpf1_init(
    	MaHpf1Config pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaHpf1 pHPF
    ) {
    	return ma_hpf1_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pHPF.memorySegment()
    	);
    }
    
    public static void ma_hpf1_uninit(
    	MemorySegment pHPF,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_HPF1_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pHPF,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf1_uninit].
    public static void ma_hpf1_uninit(
    	MaHpf1 pHPF,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_hpf1_uninit(
    		pHPF.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_hpf1_reinit(
    	MemorySegment pConfig,
    	MemorySegment pHPF
    ) {
    	MethodHandle method = MA_HPF1_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf1_reinit].
    public static int ma_hpf1_reinit(
    	MaHpf1Config pConfig,
    	MaHpf1 pHPF
    ) {
    	return ma_hpf1_reinit(
    		pConfig.memorySegment(),
    		pHPF.memorySegment()
    	);
    }
    
    public static int ma_hpf1_process_pcm_frames(
    	MemorySegment pHPF,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	MethodHandle method = MA_HPF1_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pHPF,
    			pFramesOut,
    			pFramesIn,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf1_process_pcm_frames].
    public static int ma_hpf1_process_pcm_frames(
    	MaHpf1 pHPF,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	return ma_hpf1_process_pcm_frames(
    		pHPF.memorySegment(),
    		pFramesOut,
    		pFramesIn,
    		frameCount
    	);
    }
    
    public static int ma_hpf1_get_latency(
    	MemorySegment pHPF
    ) {
    	MethodHandle method = MA_HPF1_GET_LATENCY.get();
    	try {
    		return (int) method.invokeExact(
    			pHPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf1_get_latency].
    public static int ma_hpf1_get_latency(
    	MaHpf1 pHPF
    ) {
    	return ma_hpf1_get_latency(
    		pHPF.memorySegment()
    	);
    }
    
    public static int ma_hpf2_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_HPF2_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf2_get_heap_size].
    public static int ma_hpf2_get_heap_size(
    	MaHpf1Config pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_hpf2_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_hpf2_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pHPF
    ) {
    	MethodHandle method = MA_HPF2_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pHPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf2_init_preallocated].
    public static int ma_hpf2_init_preallocated(
    	MaHpf1Config pConfig,
    	MemorySegment pHeap,
    	MaHpf2 pHPF
    ) {
    	return ma_hpf2_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pHPF.memorySegment()
    	);
    }
    
    public static int ma_hpf2_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pHPF
    ) {
    	MethodHandle method = MA_HPF2_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pHPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf2_init].
    public static int ma_hpf2_init(
    	MaHpf1Config pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaHpf2 pHPF
    ) {
    	return ma_hpf2_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pHPF.memorySegment()
    	);
    }
    
    public static void ma_hpf2_uninit(
    	MemorySegment pHPF,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_HPF2_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pHPF,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf2_uninit].
    public static void ma_hpf2_uninit(
    	MaHpf2 pHPF,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_hpf2_uninit(
    		pHPF.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_hpf2_reinit(
    	MemorySegment pConfig,
    	MemorySegment pHPF
    ) {
    	MethodHandle method = MA_HPF2_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf2_reinit].
    public static int ma_hpf2_reinit(
    	MaHpf1Config pConfig,
    	MaHpf2 pHPF
    ) {
    	return ma_hpf2_reinit(
    		pConfig.memorySegment(),
    		pHPF.memorySegment()
    	);
    }
    
    public static int ma_hpf2_process_pcm_frames(
    	MemorySegment pHPF,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	MethodHandle method = MA_HPF2_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pHPF,
    			pFramesOut,
    			pFramesIn,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf2_process_pcm_frames].
    public static int ma_hpf2_process_pcm_frames(
    	MaHpf2 pHPF,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	return ma_hpf2_process_pcm_frames(
    		pHPF.memorySegment(),
    		pFramesOut,
    		pFramesIn,
    		frameCount
    	);
    }
    
    public static int ma_hpf2_get_latency(
    	MemorySegment pHPF
    ) {
    	MethodHandle method = MA_HPF2_GET_LATENCY.get();
    	try {
    		return (int) method.invokeExact(
    			pHPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf2_get_latency].
    public static int ma_hpf2_get_latency(
    	MaHpf2 pHPF
    ) {
    	return ma_hpf2_get_latency(
    		pHPF.memorySegment()
    	);
    }
    
    public static MemorySegment nma_hpf_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency,
    	int order
    ) {
    	MethodHandle method = MA_HPF_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			sampleRate,
    			cutoffFrequency,
    			order
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_hpf_config_init].
    public static @Nullable MaHpfConfig ma_hpf_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency,
    	int order
    ) {
    	MemorySegment segment = nma_hpf_config_init(
    		allocator,
    		format,
    		channels,
    		sampleRate,
    		cutoffFrequency,
    		order
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaHpfConfig(segment);
    }
    
    public static int ma_hpf_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_HPF_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf_get_heap_size].
    public static int ma_hpf_get_heap_size(
    	MaHpfConfig pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_hpf_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_hpf_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pLPF
    ) {
    	MethodHandle method = MA_HPF_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pLPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf_init_preallocated].
    public static int ma_hpf_init_preallocated(
    	MaHpfConfig pConfig,
    	MemorySegment pHeap,
    	MaHpf pLPF
    ) {
    	return ma_hpf_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pLPF.memorySegment()
    	);
    }
    
    public static int ma_hpf_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pHPF
    ) {
    	MethodHandle method = MA_HPF_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pHPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf_init].
    public static int ma_hpf_init(
    	MaHpfConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaHpf pHPF
    ) {
    	return ma_hpf_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pHPF.memorySegment()
    	);
    }
    
    public static void ma_hpf_uninit(
    	MemorySegment pHPF,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_HPF_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pHPF,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf_uninit].
    public static void ma_hpf_uninit(
    	MaHpf pHPF,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_hpf_uninit(
    		pHPF.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_hpf_reinit(
    	MemorySegment pConfig,
    	MemorySegment pHPF
    ) {
    	MethodHandle method = MA_HPF_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf_reinit].
    public static int ma_hpf_reinit(
    	MaHpfConfig pConfig,
    	MaHpf pHPF
    ) {
    	return ma_hpf_reinit(
    		pConfig.memorySegment(),
    		pHPF.memorySegment()
    	);
    }
    
    public static int ma_hpf_process_pcm_frames(
    	MemorySegment pHPF,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	MethodHandle method = MA_HPF_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pHPF,
    			pFramesOut,
    			pFramesIn,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf_process_pcm_frames].
    public static int ma_hpf_process_pcm_frames(
    	MaHpf pHPF,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	return ma_hpf_process_pcm_frames(
    		pHPF.memorySegment(),
    		pFramesOut,
    		pFramesIn,
    		frameCount
    	);
    }
    
    public static int ma_hpf_get_latency(
    	MemorySegment pHPF
    ) {
    	MethodHandle method = MA_HPF_GET_LATENCY.get();
    	try {
    		return (int) method.invokeExact(
    			pHPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf_get_latency].
    public static int ma_hpf_get_latency(
    	MaHpf pHPF
    ) {
    	return ma_hpf_get_latency(
    		pHPF.memorySegment()
    	);
    }
    
    public static MemorySegment nma_bpf2_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency,
    	double q
    ) {
    	MethodHandle method = MA_BPF2_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			sampleRate,
    			cutoffFrequency,
    			q
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_bpf2_config_init].
    public static @Nullable MaBpf2Config ma_bpf2_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency,
    	double q
    ) {
    	MemorySegment segment = nma_bpf2_config_init(
    		allocator,
    		format,
    		channels,
    		sampleRate,
    		cutoffFrequency,
    		q
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaBpf2Config(segment);
    }
    
    public static int ma_bpf2_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_BPF2_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_bpf2_get_heap_size].
    public static int ma_bpf2_get_heap_size(
    	MaBpf2Config pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_bpf2_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_bpf2_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pBPF
    ) {
    	MethodHandle method = MA_BPF2_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pBPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_bpf2_init_preallocated].
    public static int ma_bpf2_init_preallocated(
    	MaBpf2Config pConfig,
    	MemorySegment pHeap,
    	MaBpf2 pBPF
    ) {
    	return ma_bpf2_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pBPF.memorySegment()
    	);
    }
    
    public static int ma_bpf2_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pBPF
    ) {
    	MethodHandle method = MA_BPF2_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pBPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_bpf2_init].
    public static int ma_bpf2_init(
    	MaBpf2Config pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaBpf2 pBPF
    ) {
    	return ma_bpf2_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pBPF.memorySegment()
    	);
    }
    
    public static void ma_bpf2_uninit(
    	MemorySegment pBPF,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_BPF2_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pBPF,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_bpf2_uninit].
    public static void ma_bpf2_uninit(
    	MaBpf2 pBPF,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_bpf2_uninit(
    		pBPF.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_bpf2_reinit(
    	MemorySegment pConfig,
    	MemorySegment pBPF
    ) {
    	MethodHandle method = MA_BPF2_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pBPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_bpf2_reinit].
    public static int ma_bpf2_reinit(
    	MaBpf2Config pConfig,
    	MaBpf2 pBPF
    ) {
    	return ma_bpf2_reinit(
    		pConfig.memorySegment(),
    		pBPF.memorySegment()
    	);
    }
    
    public static int ma_bpf2_process_pcm_frames(
    	MemorySegment pBPF,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	MethodHandle method = MA_BPF2_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pBPF,
    			pFramesOut,
    			pFramesIn,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_bpf2_process_pcm_frames].
    public static int ma_bpf2_process_pcm_frames(
    	MaBpf2 pBPF,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	return ma_bpf2_process_pcm_frames(
    		pBPF.memorySegment(),
    		pFramesOut,
    		pFramesIn,
    		frameCount
    	);
    }
    
    public static int ma_bpf2_get_latency(
    	MemorySegment pBPF
    ) {
    	MethodHandle method = MA_BPF2_GET_LATENCY.get();
    	try {
    		return (int) method.invokeExact(
    			pBPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_bpf2_get_latency].
    public static int ma_bpf2_get_latency(
    	MaBpf2 pBPF
    ) {
    	return ma_bpf2_get_latency(
    		pBPF.memorySegment()
    	);
    }
    
    public static MemorySegment nma_bpf_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency,
    	int order
    ) {
    	MethodHandle method = MA_BPF_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			sampleRate,
    			cutoffFrequency,
    			order
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_bpf_config_init].
    public static @Nullable MaBpfConfig ma_bpf_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency,
    	int order
    ) {
    	MemorySegment segment = nma_bpf_config_init(
    		allocator,
    		format,
    		channels,
    		sampleRate,
    		cutoffFrequency,
    		order
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaBpfConfig(segment);
    }
    
    public static int ma_bpf_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_BPF_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_bpf_get_heap_size].
    public static int ma_bpf_get_heap_size(
    	MaBpfConfig pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_bpf_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_bpf_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pBPF
    ) {
    	MethodHandle method = MA_BPF_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pBPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_bpf_init_preallocated].
    public static int ma_bpf_init_preallocated(
    	MaBpfConfig pConfig,
    	MemorySegment pHeap,
    	MaBpf pBPF
    ) {
    	return ma_bpf_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pBPF.memorySegment()
    	);
    }
    
    public static int ma_bpf_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pBPF
    ) {
    	MethodHandle method = MA_BPF_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pBPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_bpf_init].
    public static int ma_bpf_init(
    	MaBpfConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaBpf pBPF
    ) {
    	return ma_bpf_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pBPF.memorySegment()
    	);
    }
    
    public static void ma_bpf_uninit(
    	MemorySegment pBPF,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_BPF_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pBPF,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_bpf_uninit].
    public static void ma_bpf_uninit(
    	MaBpf pBPF,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_bpf_uninit(
    		pBPF.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_bpf_reinit(
    	MemorySegment pConfig,
    	MemorySegment pBPF
    ) {
    	MethodHandle method = MA_BPF_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pBPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_bpf_reinit].
    public static int ma_bpf_reinit(
    	MaBpfConfig pConfig,
    	MaBpf pBPF
    ) {
    	return ma_bpf_reinit(
    		pConfig.memorySegment(),
    		pBPF.memorySegment()
    	);
    }
    
    public static int ma_bpf_process_pcm_frames(
    	MemorySegment pBPF,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	MethodHandle method = MA_BPF_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pBPF,
    			pFramesOut,
    			pFramesIn,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_bpf_process_pcm_frames].
    public static int ma_bpf_process_pcm_frames(
    	MaBpf pBPF,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	return ma_bpf_process_pcm_frames(
    		pBPF.memorySegment(),
    		pFramesOut,
    		pFramesIn,
    		frameCount
    	);
    }
    
    public static int ma_bpf_get_latency(
    	MemorySegment pBPF
    ) {
    	MethodHandle method = MA_BPF_GET_LATENCY.get();
    	try {
    		return (int) method.invokeExact(
    			pBPF
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_bpf_get_latency].
    public static int ma_bpf_get_latency(
    	MaBpf pBPF
    ) {
    	return ma_bpf_get_latency(
    		pBPF.memorySegment()
    	);
    }
    
    public static MemorySegment nma_notch2_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double q,
    	double frequency
    ) {
    	MethodHandle method = MA_NOTCH2_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			sampleRate,
    			q,
    			frequency
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_notch2_config_init].
    public static @Nullable MaNotch2Config ma_notch2_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double q,
    	double frequency
    ) {
    	MemorySegment segment = nma_notch2_config_init(
    		allocator,
    		format,
    		channels,
    		sampleRate,
    		q,
    		frequency
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaNotch2Config(segment);
    }
    
    public static int ma_notch2_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_NOTCH2_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_notch2_get_heap_size].
    public static int ma_notch2_get_heap_size(
    	MaNotch2Config pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_notch2_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_notch2_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pFilter
    ) {
    	MethodHandle method = MA_NOTCH2_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_notch2_init_preallocated].
    public static int ma_notch2_init_preallocated(
    	MaNotch2Config pConfig,
    	MemorySegment pHeap,
    	MaNotch2 pFilter
    ) {
    	return ma_notch2_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pFilter.memorySegment()
    	);
    }
    
    public static int ma_notch2_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pFilter
    ) {
    	MethodHandle method = MA_NOTCH2_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_notch2_init].
    public static int ma_notch2_init(
    	MaNotch2Config pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaNotch2 pFilter
    ) {
    	return ma_notch2_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pFilter.memorySegment()
    	);
    }
    
    public static void ma_notch2_uninit(
    	MemorySegment pFilter,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_NOTCH2_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pFilter,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_notch2_uninit].
    public static void ma_notch2_uninit(
    	MaNotch2 pFilter,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_notch2_uninit(
    		pFilter.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_notch2_reinit(
    	MemorySegment pConfig,
    	MemorySegment pFilter
    ) {
    	MethodHandle method = MA_NOTCH2_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_notch2_reinit].
    public static int ma_notch2_reinit(
    	MaNotch2Config pConfig,
    	MaNotch2 pFilter
    ) {
    	return ma_notch2_reinit(
    		pConfig.memorySegment(),
    		pFilter.memorySegment()
    	);
    }
    
    public static int ma_notch2_process_pcm_frames(
    	MemorySegment pFilter,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	MethodHandle method = MA_NOTCH2_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pFilter,
    			pFramesOut,
    			pFramesIn,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_notch2_process_pcm_frames].
    public static int ma_notch2_process_pcm_frames(
    	MaNotch2 pFilter,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	return ma_notch2_process_pcm_frames(
    		pFilter.memorySegment(),
    		pFramesOut,
    		pFramesIn,
    		frameCount
    	);
    }
    
    public static int ma_notch2_get_latency(
    	MemorySegment pFilter
    ) {
    	MethodHandle method = MA_NOTCH2_GET_LATENCY.get();
    	try {
    		return (int) method.invokeExact(
    			pFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_notch2_get_latency].
    public static int ma_notch2_get_latency(
    	MaNotch2 pFilter
    ) {
    	return ma_notch2_get_latency(
    		pFilter.memorySegment()
    	);
    }
    
    public static MemorySegment nma_peak2_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double gainDB,
    	double q,
    	double frequency
    ) {
    	MethodHandle method = MA_PEAK2_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			sampleRate,
    			gainDB,
    			q,
    			frequency
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_peak2_config_init].
    public static @Nullable MaPeak2Config ma_peak2_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double gainDB,
    	double q,
    	double frequency
    ) {
    	MemorySegment segment = nma_peak2_config_init(
    		allocator,
    		format,
    		channels,
    		sampleRate,
    		gainDB,
    		q,
    		frequency
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaPeak2Config(segment);
    }
    
    public static int ma_peak2_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_PEAK2_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_peak2_get_heap_size].
    public static int ma_peak2_get_heap_size(
    	MaPeak2Config pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_peak2_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_peak2_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pFilter
    ) {
    	MethodHandle method = MA_PEAK2_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_peak2_init_preallocated].
    public static int ma_peak2_init_preallocated(
    	MaPeak2Config pConfig,
    	MemorySegment pHeap,
    	MaPeak2 pFilter
    ) {
    	return ma_peak2_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pFilter.memorySegment()
    	);
    }
    
    public static int ma_peak2_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pFilter
    ) {
    	MethodHandle method = MA_PEAK2_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_peak2_init].
    public static int ma_peak2_init(
    	MaPeak2Config pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaPeak2 pFilter
    ) {
    	return ma_peak2_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pFilter.memorySegment()
    	);
    }
    
    public static void ma_peak2_uninit(
    	MemorySegment pFilter,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_PEAK2_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pFilter,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_peak2_uninit].
    public static void ma_peak2_uninit(
    	MaPeak2 pFilter,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_peak2_uninit(
    		pFilter.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_peak2_reinit(
    	MemorySegment pConfig,
    	MemorySegment pFilter
    ) {
    	MethodHandle method = MA_PEAK2_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_peak2_reinit].
    public static int ma_peak2_reinit(
    	MaPeak2Config pConfig,
    	MaPeak2 pFilter
    ) {
    	return ma_peak2_reinit(
    		pConfig.memorySegment(),
    		pFilter.memorySegment()
    	);
    }
    
    public static int ma_peak2_process_pcm_frames(
    	MemorySegment pFilter,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	MethodHandle method = MA_PEAK2_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pFilter,
    			pFramesOut,
    			pFramesIn,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_peak2_process_pcm_frames].
    public static int ma_peak2_process_pcm_frames(
    	MaPeak2 pFilter,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	return ma_peak2_process_pcm_frames(
    		pFilter.memorySegment(),
    		pFramesOut,
    		pFramesIn,
    		frameCount
    	);
    }
    
    public static int ma_peak2_get_latency(
    	MemorySegment pFilter
    ) {
    	MethodHandle method = MA_PEAK2_GET_LATENCY.get();
    	try {
    		return (int) method.invokeExact(
    			pFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_peak2_get_latency].
    public static int ma_peak2_get_latency(
    	MaPeak2 pFilter
    ) {
    	return ma_peak2_get_latency(
    		pFilter.memorySegment()
    	);
    }
    
    public static MemorySegment nma_loshelf2_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double gainDB,
    	double shelfSlope,
    	double frequency
    ) {
    	MethodHandle method = MA_LOSHELF2_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			sampleRate,
    			gainDB,
    			shelfSlope,
    			frequency
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_loshelf2_config_init].
    public static @Nullable MaLoshelf2Config ma_loshelf2_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double gainDB,
    	double shelfSlope,
    	double frequency
    ) {
    	MemorySegment segment = nma_loshelf2_config_init(
    		allocator,
    		format,
    		channels,
    		sampleRate,
    		gainDB,
    		shelfSlope,
    		frequency
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaLoshelf2Config(segment);
    }
    
    public static int ma_loshelf2_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_LOSHELF2_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_loshelf2_get_heap_size].
    public static int ma_loshelf2_get_heap_size(
    	MaLoshelf2Config pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_loshelf2_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_loshelf2_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pFilter
    ) {
    	MethodHandle method = MA_LOSHELF2_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_loshelf2_init_preallocated].
    public static int ma_loshelf2_init_preallocated(
    	MaLoshelf2Config pConfig,
    	MemorySegment pHeap,
    	MaLoshelf2 pFilter
    ) {
    	return ma_loshelf2_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pFilter.memorySegment()
    	);
    }
    
    public static int ma_loshelf2_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pFilter
    ) {
    	MethodHandle method = MA_LOSHELF2_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_loshelf2_init].
    public static int ma_loshelf2_init(
    	MaLoshelf2Config pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaLoshelf2 pFilter
    ) {
    	return ma_loshelf2_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pFilter.memorySegment()
    	);
    }
    
    public static void ma_loshelf2_uninit(
    	MemorySegment pFilter,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_LOSHELF2_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pFilter,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_loshelf2_uninit].
    public static void ma_loshelf2_uninit(
    	MaLoshelf2 pFilter,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_loshelf2_uninit(
    		pFilter.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_loshelf2_reinit(
    	MemorySegment pConfig,
    	MemorySegment pFilter
    ) {
    	MethodHandle method = MA_LOSHELF2_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_loshelf2_reinit].
    public static int ma_loshelf2_reinit(
    	MaLoshelf2Config pConfig,
    	MaLoshelf2 pFilter
    ) {
    	return ma_loshelf2_reinit(
    		pConfig.memorySegment(),
    		pFilter.memorySegment()
    	);
    }
    
    public static int ma_loshelf2_process_pcm_frames(
    	MemorySegment pFilter,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	MethodHandle method = MA_LOSHELF2_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pFilter,
    			pFramesOut,
    			pFramesIn,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_loshelf2_process_pcm_frames].
    public static int ma_loshelf2_process_pcm_frames(
    	MaLoshelf2 pFilter,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	return ma_loshelf2_process_pcm_frames(
    		pFilter.memorySegment(),
    		pFramesOut,
    		pFramesIn,
    		frameCount
    	);
    }
    
    public static int ma_loshelf2_get_latency(
    	MemorySegment pFilter
    ) {
    	MethodHandle method = MA_LOSHELF2_GET_LATENCY.get();
    	try {
    		return (int) method.invokeExact(
    			pFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_loshelf2_get_latency].
    public static int ma_loshelf2_get_latency(
    	MaLoshelf2 pFilter
    ) {
    	return ma_loshelf2_get_latency(
    		pFilter.memorySegment()
    	);
    }
    
    public static MemorySegment nma_hishelf2_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double gainDB,
    	double shelfSlope,
    	double frequency
    ) {
    	MethodHandle method = MA_HISHELF2_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			sampleRate,
    			gainDB,
    			shelfSlope,
    			frequency
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_hishelf2_config_init].
    public static @Nullable MaHishelf2Config ma_hishelf2_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double gainDB,
    	double shelfSlope,
    	double frequency
    ) {
    	MemorySegment segment = nma_hishelf2_config_init(
    		allocator,
    		format,
    		channels,
    		sampleRate,
    		gainDB,
    		shelfSlope,
    		frequency
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaHishelf2Config(segment);
    }
    
    public static int ma_hishelf2_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_HISHELF2_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hishelf2_get_heap_size].
    public static int ma_hishelf2_get_heap_size(
    	MaHishelf2Config pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_hishelf2_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_hishelf2_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pFilter
    ) {
    	MethodHandle method = MA_HISHELF2_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hishelf2_init_preallocated].
    public static int ma_hishelf2_init_preallocated(
    	MaHishelf2Config pConfig,
    	MemorySegment pHeap,
    	MaHishelf2 pFilter
    ) {
    	return ma_hishelf2_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pFilter.memorySegment()
    	);
    }
    
    public static int ma_hishelf2_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pFilter
    ) {
    	MethodHandle method = MA_HISHELF2_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hishelf2_init].
    public static int ma_hishelf2_init(
    	MaHishelf2Config pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaHishelf2 pFilter
    ) {
    	return ma_hishelf2_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pFilter.memorySegment()
    	);
    }
    
    public static void ma_hishelf2_uninit(
    	MemorySegment pFilter,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_HISHELF2_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pFilter,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hishelf2_uninit].
    public static void ma_hishelf2_uninit(
    	MaHishelf2 pFilter,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_hishelf2_uninit(
    		pFilter.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_hishelf2_reinit(
    	MemorySegment pConfig,
    	MemorySegment pFilter
    ) {
    	MethodHandle method = MA_HISHELF2_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hishelf2_reinit].
    public static int ma_hishelf2_reinit(
    	MaHishelf2Config pConfig,
    	MaHishelf2 pFilter
    ) {
    	return ma_hishelf2_reinit(
    		pConfig.memorySegment(),
    		pFilter.memorySegment()
    	);
    }
    
    public static int ma_hishelf2_process_pcm_frames(
    	MemorySegment pFilter,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	MethodHandle method = MA_HISHELF2_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pFilter,
    			pFramesOut,
    			pFramesIn,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hishelf2_process_pcm_frames].
    public static int ma_hishelf2_process_pcm_frames(
    	MaHishelf2 pFilter,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	return ma_hishelf2_process_pcm_frames(
    		pFilter.memorySegment(),
    		pFramesOut,
    		pFramesIn,
    		frameCount
    	);
    }
    
    public static int ma_hishelf2_get_latency(
    	MemorySegment pFilter
    ) {
    	MethodHandle method = MA_HISHELF2_GET_LATENCY.get();
    	try {
    		return (int) method.invokeExact(
    			pFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hishelf2_get_latency].
    public static int ma_hishelf2_get_latency(
    	MaHishelf2 pFilter
    ) {
    	return ma_hishelf2_get_latency(
    		pFilter.memorySegment()
    	);
    }
    
    public static MemorySegment nma_delay_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int sampleRate,
    	int delayInFrames,
    	float decay
    ) {
    	MethodHandle method = MA_DELAY_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			channels,
    			sampleRate,
    			delayInFrames,
    			decay
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_delay_config_init].
    public static @Nullable MaDelayConfig ma_delay_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int sampleRate,
    	int delayInFrames,
    	float decay
    ) {
    	MemorySegment segment = nma_delay_config_init(
    		allocator,
    		channels,
    		sampleRate,
    		delayInFrames,
    		decay
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDelayConfig(segment);
    }
    
    public static int ma_delay_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pDelay
    ) {
    	MethodHandle method = MA_DELAY_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pDelay
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_delay_init].
    public static int ma_delay_init(
    	MaDelayConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaDelay pDelay
    ) {
    	return ma_delay_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pDelay.memorySegment()
    	);
    }
    
    public static void ma_delay_uninit(
    	MemorySegment pDelay,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_DELAY_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pDelay,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_delay_uninit].
    public static void ma_delay_uninit(
    	MaDelay pDelay,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_delay_uninit(
    		pDelay.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_delay_process_pcm_frames(
    	MemorySegment pDelay,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	int frameCount
    ) {
    	MethodHandle method = MA_DELAY_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDelay,
    			pFramesOut,
    			pFramesIn,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_delay_process_pcm_frames].
    public static int ma_delay_process_pcm_frames(
    	MaDelay pDelay,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	int frameCount
    ) {
    	return ma_delay_process_pcm_frames(
    		pDelay.memorySegment(),
    		pFramesOut,
    		pFramesIn,
    		frameCount
    	);
    }
    
    public static void ma_delay_set_wet(
    	MemorySegment pDelay,
    	float value
    ) {
    	MethodHandle method = MA_DELAY_SET_WET.get();
    	try {
    		 method.invokeExact(
    			pDelay,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_delay_set_wet].
    public static void ma_delay_set_wet(
    	MaDelay pDelay,
    	float value
    ) {
    	ma_delay_set_wet(
    		pDelay.memorySegment(),
    		value
    	);
    }
    
    public static float ma_delay_get_wet(
    	MemorySegment pDelay
    ) {
    	MethodHandle method = MA_DELAY_GET_WET.get();
    	try {
    		return (float) method.invokeExact(
    			pDelay
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_delay_get_wet].
    public static float ma_delay_get_wet(
    	MaDelay pDelay
    ) {
    	return ma_delay_get_wet(
    		pDelay.memorySegment()
    	);
    }
    
    public static void ma_delay_set_dry(
    	MemorySegment pDelay,
    	float value
    ) {
    	MethodHandle method = MA_DELAY_SET_DRY.get();
    	try {
    		 method.invokeExact(
    			pDelay,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_delay_set_dry].
    public static void ma_delay_set_dry(
    	MaDelay pDelay,
    	float value
    ) {
    	ma_delay_set_dry(
    		pDelay.memorySegment(),
    		value
    	);
    }
    
    public static float ma_delay_get_dry(
    	MemorySegment pDelay
    ) {
    	MethodHandle method = MA_DELAY_GET_DRY.get();
    	try {
    		return (float) method.invokeExact(
    			pDelay
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_delay_get_dry].
    public static float ma_delay_get_dry(
    	MaDelay pDelay
    ) {
    	return ma_delay_get_dry(
    		pDelay.memorySegment()
    	);
    }
    
    public static void ma_delay_set_decay(
    	MemorySegment pDelay,
    	float value
    ) {
    	MethodHandle method = MA_DELAY_SET_DECAY.get();
    	try {
    		 method.invokeExact(
    			pDelay,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_delay_set_decay].
    public static void ma_delay_set_decay(
    	MaDelay pDelay,
    	float value
    ) {
    	ma_delay_set_decay(
    		pDelay.memorySegment(),
    		value
    	);
    }
    
    public static float ma_delay_get_decay(
    	MemorySegment pDelay
    ) {
    	MethodHandle method = MA_DELAY_GET_DECAY.get();
    	try {
    		return (float) method.invokeExact(
    			pDelay
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_delay_get_decay].
    public static float ma_delay_get_decay(
    	MaDelay pDelay
    ) {
    	return ma_delay_get_decay(
    		pDelay.memorySegment()
    	);
    }
    
    public static MemorySegment nma_gainer_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int smoothTimeInFrames
    ) {
    	MethodHandle method = MA_GAINER_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			channels,
    			smoothTimeInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_gainer_config_init].
    public static @Nullable MaGainerConfig ma_gainer_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int smoothTimeInFrames
    ) {
    	MemorySegment segment = nma_gainer_config_init(
    		allocator,
    		channels,
    		smoothTimeInFrames
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaGainerConfig(segment);
    }
    
    public static int ma_gainer_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_GAINER_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_gainer_get_heap_size].
    public static int ma_gainer_get_heap_size(
    	MaGainerConfig pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_gainer_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_gainer_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pGainer
    ) {
    	MethodHandle method = MA_GAINER_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pGainer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_gainer_init_preallocated].
    public static int ma_gainer_init_preallocated(
    	MaGainerConfig pConfig,
    	MemorySegment pHeap,
    	MaGainer pGainer
    ) {
    	return ma_gainer_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pGainer.memorySegment()
    	);
    }
    
    public static int ma_gainer_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pGainer
    ) {
    	MethodHandle method = MA_GAINER_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pGainer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_gainer_init].
    public static int ma_gainer_init(
    	MaGainerConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaGainer pGainer
    ) {
    	return ma_gainer_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pGainer.memorySegment()
    	);
    }
    
    public static void ma_gainer_uninit(
    	MemorySegment pGainer,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_GAINER_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pGainer,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_gainer_uninit].
    public static void ma_gainer_uninit(
    	MaGainer pGainer,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_gainer_uninit(
    		pGainer.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_gainer_process_pcm_frames(
    	MemorySegment pGainer,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	MethodHandle method = MA_GAINER_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pGainer,
    			pFramesOut,
    			pFramesIn,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_gainer_process_pcm_frames].
    public static int ma_gainer_process_pcm_frames(
    	MaGainer pGainer,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	return ma_gainer_process_pcm_frames(
    		pGainer.memorySegment(),
    		pFramesOut,
    		pFramesIn,
    		frameCount
    	);
    }
    
    public static int ma_gainer_set_gain(
    	MemorySegment pGainer,
    	float newGain
    ) {
    	MethodHandle method = MA_GAINER_SET_GAIN.get();
    	try {
    		return (int) method.invokeExact(
    			pGainer,
    			newGain
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_gainer_set_gain].
    public static int ma_gainer_set_gain(
    	MaGainer pGainer,
    	float newGain
    ) {
    	return ma_gainer_set_gain(
    		pGainer.memorySegment(),
    		newGain
    	);
    }
    
    public static int ma_gainer_set_gains(
    	MemorySegment pGainer,
    	MemorySegment pNewGains
    ) {
    	MethodHandle method = MA_GAINER_SET_GAINS.get();
    	try {
    		return (int) method.invokeExact(
    			pGainer,
    			pNewGains
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_gainer_set_gains].
    public static int ma_gainer_set_gains(
    	MaGainer pGainer,
    	NativeFloatArray pNewGains
    ) {
    	return ma_gainer_set_gains(
    		pGainer.memorySegment(),
    		pNewGains.memorySegment()
    	);
    }
    
    public static int ma_gainer_set_master_volume(
    	MemorySegment pGainer,
    	float volume
    ) {
    	MethodHandle method = MA_GAINER_SET_MASTER_VOLUME.get();
    	try {
    		return (int) method.invokeExact(
    			pGainer,
    			volume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_gainer_set_master_volume].
    public static int ma_gainer_set_master_volume(
    	MaGainer pGainer,
    	float volume
    ) {
    	return ma_gainer_set_master_volume(
    		pGainer.memorySegment(),
    		volume
    	);
    }
    
    public static int ma_gainer_get_master_volume(
    	MemorySegment pGainer,
    	MemorySegment pVolume
    ) {
    	MethodHandle method = MA_GAINER_GET_MASTER_VOLUME.get();
    	try {
    		return (int) method.invokeExact(
    			pGainer,
    			pVolume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_gainer_get_master_volume].
    public static int ma_gainer_get_master_volume(
    	MaGainer pGainer,
    	NativeFloatArray pVolume
    ) {
    	return ma_gainer_get_master_volume(
    		pGainer.memorySegment(),
    		pVolume.memorySegment()
    	);
    }
    
    public static MemorySegment nma_panner_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels
    ) {
    	MethodHandle method = MA_PANNER_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_panner_config_init].
    public static @Nullable MaPannerConfig ma_panner_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels
    ) {
    	MemorySegment segment = nma_panner_config_init(
    		allocator,
    		format,
    		channels
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaPannerConfig(segment);
    }
    
    public static int ma_panner_init(
    	MemorySegment pConfig,
    	MemorySegment pPanner
    ) {
    	MethodHandle method = MA_PANNER_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pPanner
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_panner_init].
    public static int ma_panner_init(
    	MaPannerConfig pConfig,
    	MaPanner pPanner
    ) {
    	return ma_panner_init(
    		pConfig.memorySegment(),
    		pPanner.memorySegment()
    	);
    }
    
    public static int ma_panner_process_pcm_frames(
    	MemorySegment pPanner,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	MethodHandle method = MA_PANNER_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pPanner,
    			pFramesOut,
    			pFramesIn,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_panner_process_pcm_frames].
    public static int ma_panner_process_pcm_frames(
    	MaPanner pPanner,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	return ma_panner_process_pcm_frames(
    		pPanner.memorySegment(),
    		pFramesOut,
    		pFramesIn,
    		frameCount
    	);
    }
    
    public static void ma_panner_set_mode(
    	MemorySegment pPanner,
    	int mode
    ) {
    	MethodHandle method = MA_PANNER_SET_MODE.get();
    	try {
    		 method.invokeExact(
    			pPanner,
    			mode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_panner_set_mode].
    public static void ma_panner_set_mode(
    	MaPanner pPanner,
    	int mode
    ) {
    	ma_panner_set_mode(
    		pPanner.memorySegment(),
    		mode
    	);
    }
    
    public static int ma_panner_get_mode(
    	MemorySegment pPanner
    ) {
    	MethodHandle method = MA_PANNER_GET_MODE.get();
    	try {
    		return (int) method.invokeExact(
    			pPanner
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_panner_get_mode].
    public static int ma_panner_get_mode(
    	MaPanner pPanner
    ) {
    	return ma_panner_get_mode(
    		pPanner.memorySegment()
    	);
    }
    
    public static void ma_panner_set_pan(
    	MemorySegment pPanner,
    	float pan
    ) {
    	MethodHandle method = MA_PANNER_SET_PAN.get();
    	try {
    		 method.invokeExact(
    			pPanner,
    			pan
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_panner_set_pan].
    public static void ma_panner_set_pan(
    	MaPanner pPanner,
    	float pan
    ) {
    	ma_panner_set_pan(
    		pPanner.memorySegment(),
    		pan
    	);
    }
    
    public static float ma_panner_get_pan(
    	MemorySegment pPanner
    ) {
    	MethodHandle method = MA_PANNER_GET_PAN.get();
    	try {
    		return (float) method.invokeExact(
    			pPanner
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_panner_get_pan].
    public static float ma_panner_get_pan(
    	MaPanner pPanner
    ) {
    	return ma_panner_get_pan(
    		pPanner.memorySegment()
    	);
    }
    
    public static MemorySegment nma_fader_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate
    ) {
    	MethodHandle method = MA_FADER_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			sampleRate
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_fader_config_init].
    public static @Nullable MaFaderConfig ma_fader_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate
    ) {
    	MemorySegment segment = nma_fader_config_init(
    		allocator,
    		format,
    		channels,
    		sampleRate
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaFaderConfig(segment);
    }
    
    public static int ma_fader_init(
    	MemorySegment pConfig,
    	MemorySegment pFader
    ) {
    	MethodHandle method = MA_FADER_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pFader
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_fader_init].
    public static int ma_fader_init(
    	MaFaderConfig pConfig,
    	MaFader pFader
    ) {
    	return ma_fader_init(
    		pConfig.memorySegment(),
    		pFader.memorySegment()
    	);
    }
    
    public static int ma_fader_process_pcm_frames(
    	MemorySegment pFader,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	MethodHandle method = MA_FADER_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pFader,
    			pFramesOut,
    			pFramesIn,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_fader_process_pcm_frames].
    public static int ma_fader_process_pcm_frames(
    	MaFader pFader,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	return ma_fader_process_pcm_frames(
    		pFader.memorySegment(),
    		pFramesOut,
    		pFramesIn,
    		frameCount
    	);
    }
    
    public static void ma_fader_get_data_format(
    	MemorySegment pFader,
    	MemorySegment pFormat,
    	MemorySegment pChannels,
    	MemorySegment pSampleRate
    ) {
    	MethodHandle method = MA_FADER_GET_DATA_FORMAT.get();
    	try {
    		 method.invokeExact(
    			pFader,
    			pFormat,
    			pChannels,
    			pSampleRate
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_fader_get_data_format].
    public static void ma_fader_get_data_format(
    	MaFader pFader,
    	NativeIntArray pFormat,
    	NativeIntArray pChannels,
    	NativeIntArray pSampleRate
    ) {
    	ma_fader_get_data_format(
    		pFader.memorySegment(),
    		pFormat.memorySegment(),
    		pChannels.memorySegment(),
    		pSampleRate.memorySegment()
    	);
    }
    
    public static void ma_fader_set_fade(
    	MemorySegment pFader,
    	float volumeBeg,
    	float volumeEnd,
    	long lengthInFrames
    ) {
    	MethodHandle method = MA_FADER_SET_FADE.get();
    	try {
    		 method.invokeExact(
    			pFader,
    			volumeBeg,
    			volumeEnd,
    			lengthInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_fader_set_fade].
    public static void ma_fader_set_fade(
    	MaFader pFader,
    	float volumeBeg,
    	float volumeEnd,
    	long lengthInFrames
    ) {
    	ma_fader_set_fade(
    		pFader.memorySegment(),
    		volumeBeg,
    		volumeEnd,
    		lengthInFrames
    	);
    }
    
    public static void ma_fader_set_fade_ex(
    	MemorySegment pFader,
    	float volumeBeg,
    	float volumeEnd,
    	long lengthInFrames,
    	long startOffsetInFrames
    ) {
    	MethodHandle method = MA_FADER_SET_FADE_EX.get();
    	try {
    		 method.invokeExact(
    			pFader,
    			volumeBeg,
    			volumeEnd,
    			lengthInFrames,
    			startOffsetInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_fader_set_fade_ex].
    public static void ma_fader_set_fade_ex(
    	MaFader pFader,
    	float volumeBeg,
    	float volumeEnd,
    	long lengthInFrames,
    	long startOffsetInFrames
    ) {
    	ma_fader_set_fade_ex(
    		pFader.memorySegment(),
    		volumeBeg,
    		volumeEnd,
    		lengthInFrames,
    		startOffsetInFrames
    	);
    }
    
    public static float ma_fader_get_current_volume(
    	MemorySegment pFader
    ) {
    	MethodHandle method = MA_FADER_GET_CURRENT_VOLUME.get();
    	try {
    		return (float) method.invokeExact(
    			pFader
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_fader_get_current_volume].
    public static float ma_fader_get_current_volume(
    	MaFader pFader
    ) {
    	return ma_fader_get_current_volume(
    		pFader.memorySegment()
    	);
    }
    
    public static MemorySegment nma_spatializer_listener_config_init(
    	SegmentAllocator allocator,
    	int channelsOut
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			channelsOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_spatializer_listener_config_init].
    public static @Nullable MaSpatializerListenerConfig ma_spatializer_listener_config_init(
    	SegmentAllocator allocator,
    	int channelsOut
    ) {
    	MemorySegment segment = nma_spatializer_listener_config_init(
    		allocator,
    		channelsOut
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaSpatializerListenerConfig(segment);
    }
    
    public static int ma_spatializer_listener_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_listener_get_heap_size].
    public static int ma_spatializer_listener_get_heap_size(
    	MaSpatializerListenerConfig pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_spatializer_listener_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_spatializer_listener_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pListener
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pListener
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_listener_init_preallocated].
    public static int ma_spatializer_listener_init_preallocated(
    	MaSpatializerListenerConfig pConfig,
    	MemorySegment pHeap,
    	MaSpatializerListener pListener
    ) {
    	return ma_spatializer_listener_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pListener.memorySegment()
    	);
    }
    
    public static int ma_spatializer_listener_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pListener
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pListener
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_listener_init].
    public static int ma_spatializer_listener_init(
    	MaSpatializerListenerConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaSpatializerListener pListener
    ) {
    	return ma_spatializer_listener_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pListener.memorySegment()
    	);
    }
    
    public static void ma_spatializer_listener_uninit(
    	MemorySegment pListener,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pListener,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_listener_uninit].
    public static void ma_spatializer_listener_uninit(
    	MaSpatializerListener pListener,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_spatializer_listener_uninit(
    		pListener.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static MemorySegment ma_spatializer_listener_get_channel_map(
    	MemorySegment pListener
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_GET_CHANNEL_MAP.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pListener
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_listener_get_channel_map].
    public static @Nullable NativeByteArray ma_spatializer_listener_get_channel_map(
    	MaSpatializerListener pListener
    ) {
    	MemorySegment segment = ma_spatializer_listener_get_channel_map(
    		pListener.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static void ma_spatializer_listener_set_cone(
    	MemorySegment pListener,
    	float innerAngleInRadians,
    	float outerAngleInRadians,
    	float outerGain
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_SET_CONE.get();
    	try {
    		 method.invokeExact(
    			pListener,
    			innerAngleInRadians,
    			outerAngleInRadians,
    			outerGain
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_listener_set_cone].
    public static void ma_spatializer_listener_set_cone(
    	MaSpatializerListener pListener,
    	float innerAngleInRadians,
    	float outerAngleInRadians,
    	float outerGain
    ) {
    	ma_spatializer_listener_set_cone(
    		pListener.memorySegment(),
    		innerAngleInRadians,
    		outerAngleInRadians,
    		outerGain
    	);
    }
    
    public static void ma_spatializer_listener_get_cone(
    	MemorySegment pListener,
    	MemorySegment pInnerAngleInRadians,
    	MemorySegment pOuterAngleInRadians,
    	MemorySegment pOuterGain
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_GET_CONE.get();
    	try {
    		 method.invokeExact(
    			pListener,
    			pInnerAngleInRadians,
    			pOuterAngleInRadians,
    			pOuterGain
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_listener_get_cone].
    public static void ma_spatializer_listener_get_cone(
    	MaSpatializerListener pListener,
    	NativeFloatArray pInnerAngleInRadians,
    	NativeFloatArray pOuterAngleInRadians,
    	NativeFloatArray pOuterGain
    ) {
    	ma_spatializer_listener_get_cone(
    		pListener.memorySegment(),
    		pInnerAngleInRadians.memorySegment(),
    		pOuterAngleInRadians.memorySegment(),
    		pOuterGain.memorySegment()
    	);
    }
    
    public static void ma_spatializer_listener_set_position(
    	MemorySegment pListener,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_SET_POSITION.get();
    	try {
    		 method.invokeExact(
    			pListener,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_listener_set_position].
    public static void ma_spatializer_listener_set_position(
    	MaSpatializerListener pListener,
    	float x,
    	float y,
    	float z
    ) {
    	ma_spatializer_listener_set_position(
    		pListener.memorySegment(),
    		x,
    		y,
    		z
    	);
    }
    
    public static MemorySegment ma_spatializer_listener_get_position(
    	SegmentAllocator allocator,
    	MemorySegment pListener
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_GET_POSITION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pListener
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_listener_get_position].
    public static @Nullable MaVec3f ma_spatializer_listener_get_position(
    	SegmentAllocator allocator,
    	MaSpatializerListener pListener
    ) {
    	MemorySegment segment = ma_spatializer_listener_get_position(
    		allocator,
    		pListener.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaVec3f(segment);
    }
    
    public static void ma_spatializer_listener_set_direction(
    	MemorySegment pListener,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_SET_DIRECTION.get();
    	try {
    		 method.invokeExact(
    			pListener,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_listener_set_direction].
    public static void ma_spatializer_listener_set_direction(
    	MaSpatializerListener pListener,
    	float x,
    	float y,
    	float z
    ) {
    	ma_spatializer_listener_set_direction(
    		pListener.memorySegment(),
    		x,
    		y,
    		z
    	);
    }
    
    public static MemorySegment ma_spatializer_listener_get_direction(
    	SegmentAllocator allocator,
    	MemorySegment pListener
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_GET_DIRECTION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pListener
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_listener_get_direction].
    public static @Nullable MaVec3f ma_spatializer_listener_get_direction(
    	SegmentAllocator allocator,
    	MaSpatializerListener pListener
    ) {
    	MemorySegment segment = ma_spatializer_listener_get_direction(
    		allocator,
    		pListener.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaVec3f(segment);
    }
    
    public static void ma_spatializer_listener_set_velocity(
    	MemorySegment pListener,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_SET_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			pListener,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_listener_set_velocity].
    public static void ma_spatializer_listener_set_velocity(
    	MaSpatializerListener pListener,
    	float x,
    	float y,
    	float z
    ) {
    	ma_spatializer_listener_set_velocity(
    		pListener.memorySegment(),
    		x,
    		y,
    		z
    	);
    }
    
    public static MemorySegment ma_spatializer_listener_get_velocity(
    	SegmentAllocator allocator,
    	MemorySegment pListener
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_GET_VELOCITY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pListener
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_listener_get_velocity].
    public static @Nullable MaVec3f ma_spatializer_listener_get_velocity(
    	SegmentAllocator allocator,
    	MaSpatializerListener pListener
    ) {
    	MemorySegment segment = ma_spatializer_listener_get_velocity(
    		allocator,
    		pListener.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaVec3f(segment);
    }
    
    public static void ma_spatializer_listener_set_speed_of_sound(
    	MemorySegment pListener,
    	float speedOfSound
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_SET_SPEED_OF_SOUND.get();
    	try {
    		 method.invokeExact(
    			pListener,
    			speedOfSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_listener_set_speed_of_sound].
    public static void ma_spatializer_listener_set_speed_of_sound(
    	MaSpatializerListener pListener,
    	float speedOfSound
    ) {
    	ma_spatializer_listener_set_speed_of_sound(
    		pListener.memorySegment(),
    		speedOfSound
    	);
    }
    
    public static float ma_spatializer_listener_get_speed_of_sound(
    	MemorySegment pListener
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_GET_SPEED_OF_SOUND.get();
    	try {
    		return (float) method.invokeExact(
    			pListener
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_listener_get_speed_of_sound].
    public static float ma_spatializer_listener_get_speed_of_sound(
    	MaSpatializerListener pListener
    ) {
    	return ma_spatializer_listener_get_speed_of_sound(
    		pListener.memorySegment()
    	);
    }
    
    public static void ma_spatializer_listener_set_world_up(
    	MemorySegment pListener,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_SET_WORLD_UP.get();
    	try {
    		 method.invokeExact(
    			pListener,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_listener_set_world_up].
    public static void ma_spatializer_listener_set_world_up(
    	MaSpatializerListener pListener,
    	float x,
    	float y,
    	float z
    ) {
    	ma_spatializer_listener_set_world_up(
    		pListener.memorySegment(),
    		x,
    		y,
    		z
    	);
    }
    
    public static MemorySegment ma_spatializer_listener_get_world_up(
    	SegmentAllocator allocator,
    	MemorySegment pListener
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_GET_WORLD_UP.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pListener
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_listener_get_world_up].
    public static @Nullable MaVec3f ma_spatializer_listener_get_world_up(
    	SegmentAllocator allocator,
    	MaSpatializerListener pListener
    ) {
    	MemorySegment segment = ma_spatializer_listener_get_world_up(
    		allocator,
    		pListener.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaVec3f(segment);
    }
    
    public static void ma_spatializer_listener_set_enabled(
    	MemorySegment pListener,
    	int isEnabled
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_SET_ENABLED.get();
    	try {
    		 method.invokeExact(
    			pListener,
    			isEnabled
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_listener_set_enabled].
    public static void ma_spatializer_listener_set_enabled(
    	MaSpatializerListener pListener,
    	int isEnabled
    ) {
    	ma_spatializer_listener_set_enabled(
    		pListener.memorySegment(),
    		isEnabled
    	);
    }
    
    public static int ma_spatializer_listener_is_enabled(
    	MemorySegment pListener
    ) {
    	MethodHandle method = MA_SPATIALIZER_LISTENER_IS_ENABLED.get();
    	try {
    		return (int) method.invokeExact(
    			pListener
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_listener_is_enabled].
    public static int ma_spatializer_listener_is_enabled(
    	MaSpatializerListener pListener
    ) {
    	return ma_spatializer_listener_is_enabled(
    		pListener.memorySegment()
    	);
    }
    
    public static MemorySegment nma_spatializer_config_init(
    	SegmentAllocator allocator,
    	int channelsIn,
    	int channelsOut
    ) {
    	MethodHandle method = MA_SPATIALIZER_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			channelsIn,
    			channelsOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_spatializer_config_init].
    public static @Nullable MaSpatializerConfig ma_spatializer_config_init(
    	SegmentAllocator allocator,
    	int channelsIn,
    	int channelsOut
    ) {
    	MemorySegment segment = nma_spatializer_config_init(
    		allocator,
    		channelsIn,
    		channelsOut
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaSpatializerConfig(segment);
    }
    
    public static int ma_spatializer_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_SPATIALIZER_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_get_heap_size].
    public static int ma_spatializer_get_heap_size(
    	MaSpatializerConfig pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_spatializer_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_spatializer_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pSpatializer
    ) {
    	MethodHandle method = MA_SPATIALIZER_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pSpatializer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_init_preallocated].
    public static int ma_spatializer_init_preallocated(
    	MaSpatializerConfig pConfig,
    	MemorySegment pHeap,
    	MaSpatializer pSpatializer
    ) {
    	return ma_spatializer_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pSpatializer.memorySegment()
    	);
    }
    
    public static int ma_spatializer_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pSpatializer
    ) {
    	MethodHandle method = MA_SPATIALIZER_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pSpatializer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_init].
    public static int ma_spatializer_init(
    	MaSpatializerConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaSpatializer pSpatializer
    ) {
    	return ma_spatializer_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pSpatializer.memorySegment()
    	);
    }
    
    public static void ma_spatializer_uninit(
    	MemorySegment pSpatializer,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_SPATIALIZER_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pSpatializer,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_uninit].
    public static void ma_spatializer_uninit(
    	MaSpatializer pSpatializer,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_spatializer_uninit(
    		pSpatializer.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_spatializer_process_pcm_frames(
    	MemorySegment pSpatializer,
    	MemorySegment pListener,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	MethodHandle method = MA_SPATIALIZER_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pSpatializer,
    			pListener,
    			pFramesOut,
    			pFramesIn,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_process_pcm_frames].
    public static int ma_spatializer_process_pcm_frames(
    	MaSpatializer pSpatializer,
    	MaSpatializerListener pListener,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	return ma_spatializer_process_pcm_frames(
    		pSpatializer.memorySegment(),
    		pListener.memorySegment(),
    		pFramesOut,
    		pFramesIn,
    		frameCount
    	);
    }
    
    public static int ma_spatializer_set_master_volume(
    	MemorySegment pSpatializer,
    	float volume
    ) {
    	MethodHandle method = MA_SPATIALIZER_SET_MASTER_VOLUME.get();
    	try {
    		return (int) method.invokeExact(
    			pSpatializer,
    			volume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_set_master_volume].
    public static int ma_spatializer_set_master_volume(
    	MaSpatializer pSpatializer,
    	float volume
    ) {
    	return ma_spatializer_set_master_volume(
    		pSpatializer.memorySegment(),
    		volume
    	);
    }
    
    public static int ma_spatializer_get_master_volume(
    	MemorySegment pSpatializer,
    	MemorySegment pVolume
    ) {
    	MethodHandle method = MA_SPATIALIZER_GET_MASTER_VOLUME.get();
    	try {
    		return (int) method.invokeExact(
    			pSpatializer,
    			pVolume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_get_master_volume].
    public static int ma_spatializer_get_master_volume(
    	MaSpatializer pSpatializer,
    	NativeFloatArray pVolume
    ) {
    	return ma_spatializer_get_master_volume(
    		pSpatializer.memorySegment(),
    		pVolume.memorySegment()
    	);
    }
    
    public static int ma_spatializer_get_input_channels(
    	MemorySegment pSpatializer
    ) {
    	MethodHandle method = MA_SPATIALIZER_GET_INPUT_CHANNELS.get();
    	try {
    		return (int) method.invokeExact(
    			pSpatializer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_get_input_channels].
    public static int ma_spatializer_get_input_channels(
    	MaSpatializer pSpatializer
    ) {
    	return ma_spatializer_get_input_channels(
    		pSpatializer.memorySegment()
    	);
    }
    
    public static int ma_spatializer_get_output_channels(
    	MemorySegment pSpatializer
    ) {
    	MethodHandle method = MA_SPATIALIZER_GET_OUTPUT_CHANNELS.get();
    	try {
    		return (int) method.invokeExact(
    			pSpatializer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_get_output_channels].
    public static int ma_spatializer_get_output_channels(
    	MaSpatializer pSpatializer
    ) {
    	return ma_spatializer_get_output_channels(
    		pSpatializer.memorySegment()
    	);
    }
    
    public static void ma_spatializer_set_attenuation_model(
    	MemorySegment pSpatializer,
    	int attenuationModel
    ) {
    	MethodHandle method = MA_SPATIALIZER_SET_ATTENUATION_MODEL.get();
    	try {
    		 method.invokeExact(
    			pSpatializer,
    			attenuationModel
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_set_attenuation_model].
    public static void ma_spatializer_set_attenuation_model(
    	MaSpatializer pSpatializer,
    	int attenuationModel
    ) {
    	ma_spatializer_set_attenuation_model(
    		pSpatializer.memorySegment(),
    		attenuationModel
    	);
    }
    
    public static int ma_spatializer_get_attenuation_model(
    	MemorySegment pSpatializer
    ) {
    	MethodHandle method = MA_SPATIALIZER_GET_ATTENUATION_MODEL.get();
    	try {
    		return (int) method.invokeExact(
    			pSpatializer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_get_attenuation_model].
    public static int ma_spatializer_get_attenuation_model(
    	MaSpatializer pSpatializer
    ) {
    	return ma_spatializer_get_attenuation_model(
    		pSpatializer.memorySegment()
    	);
    }
    
    public static void ma_spatializer_set_positioning(
    	MemorySegment pSpatializer,
    	int positioning
    ) {
    	MethodHandle method = MA_SPATIALIZER_SET_POSITIONING.get();
    	try {
    		 method.invokeExact(
    			pSpatializer,
    			positioning
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_set_positioning].
    public static void ma_spatializer_set_positioning(
    	MaSpatializer pSpatializer,
    	int positioning
    ) {
    	ma_spatializer_set_positioning(
    		pSpatializer.memorySegment(),
    		positioning
    	);
    }
    
    public static int ma_spatializer_get_positioning(
    	MemorySegment pSpatializer
    ) {
    	MethodHandle method = MA_SPATIALIZER_GET_POSITIONING.get();
    	try {
    		return (int) method.invokeExact(
    			pSpatializer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_get_positioning].
    public static int ma_spatializer_get_positioning(
    	MaSpatializer pSpatializer
    ) {
    	return ma_spatializer_get_positioning(
    		pSpatializer.memorySegment()
    	);
    }
    
    public static void ma_spatializer_set_rolloff(
    	MemorySegment pSpatializer,
    	float rolloff
    ) {
    	MethodHandle method = MA_SPATIALIZER_SET_ROLLOFF.get();
    	try {
    		 method.invokeExact(
    			pSpatializer,
    			rolloff
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_set_rolloff].
    public static void ma_spatializer_set_rolloff(
    	MaSpatializer pSpatializer,
    	float rolloff
    ) {
    	ma_spatializer_set_rolloff(
    		pSpatializer.memorySegment(),
    		rolloff
    	);
    }
    
    public static float ma_spatializer_get_rolloff(
    	MemorySegment pSpatializer
    ) {
    	MethodHandle method = MA_SPATIALIZER_GET_ROLLOFF.get();
    	try {
    		return (float) method.invokeExact(
    			pSpatializer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_get_rolloff].
    public static float ma_spatializer_get_rolloff(
    	MaSpatializer pSpatializer
    ) {
    	return ma_spatializer_get_rolloff(
    		pSpatializer.memorySegment()
    	);
    }
    
    public static void ma_spatializer_set_min_gain(
    	MemorySegment pSpatializer,
    	float minGain
    ) {
    	MethodHandle method = MA_SPATIALIZER_SET_MIN_GAIN.get();
    	try {
    		 method.invokeExact(
    			pSpatializer,
    			minGain
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_set_min_gain].
    public static void ma_spatializer_set_min_gain(
    	MaSpatializer pSpatializer,
    	float minGain
    ) {
    	ma_spatializer_set_min_gain(
    		pSpatializer.memorySegment(),
    		minGain
    	);
    }
    
    public static float ma_spatializer_get_min_gain(
    	MemorySegment pSpatializer
    ) {
    	MethodHandle method = MA_SPATIALIZER_GET_MIN_GAIN.get();
    	try {
    		return (float) method.invokeExact(
    			pSpatializer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_get_min_gain].
    public static float ma_spatializer_get_min_gain(
    	MaSpatializer pSpatializer
    ) {
    	return ma_spatializer_get_min_gain(
    		pSpatializer.memorySegment()
    	);
    }
    
    public static void ma_spatializer_set_max_gain(
    	MemorySegment pSpatializer,
    	float maxGain
    ) {
    	MethodHandle method = MA_SPATIALIZER_SET_MAX_GAIN.get();
    	try {
    		 method.invokeExact(
    			pSpatializer,
    			maxGain
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_set_max_gain].
    public static void ma_spatializer_set_max_gain(
    	MaSpatializer pSpatializer,
    	float maxGain
    ) {
    	ma_spatializer_set_max_gain(
    		pSpatializer.memorySegment(),
    		maxGain
    	);
    }
    
    public static float ma_spatializer_get_max_gain(
    	MemorySegment pSpatializer
    ) {
    	MethodHandle method = MA_SPATIALIZER_GET_MAX_GAIN.get();
    	try {
    		return (float) method.invokeExact(
    			pSpatializer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_get_max_gain].
    public static float ma_spatializer_get_max_gain(
    	MaSpatializer pSpatializer
    ) {
    	return ma_spatializer_get_max_gain(
    		pSpatializer.memorySegment()
    	);
    }
    
    public static void ma_spatializer_set_min_distance(
    	MemorySegment pSpatializer,
    	float minDistance
    ) {
    	MethodHandle method = MA_SPATIALIZER_SET_MIN_DISTANCE.get();
    	try {
    		 method.invokeExact(
    			pSpatializer,
    			minDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_set_min_distance].
    public static void ma_spatializer_set_min_distance(
    	MaSpatializer pSpatializer,
    	float minDistance
    ) {
    	ma_spatializer_set_min_distance(
    		pSpatializer.memorySegment(),
    		minDistance
    	);
    }
    
    public static float ma_spatializer_get_min_distance(
    	MemorySegment pSpatializer
    ) {
    	MethodHandle method = MA_SPATIALIZER_GET_MIN_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			pSpatializer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_get_min_distance].
    public static float ma_spatializer_get_min_distance(
    	MaSpatializer pSpatializer
    ) {
    	return ma_spatializer_get_min_distance(
    		pSpatializer.memorySegment()
    	);
    }
    
    public static void ma_spatializer_set_max_distance(
    	MemorySegment pSpatializer,
    	float maxDistance
    ) {
    	MethodHandle method = MA_SPATIALIZER_SET_MAX_DISTANCE.get();
    	try {
    		 method.invokeExact(
    			pSpatializer,
    			maxDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_set_max_distance].
    public static void ma_spatializer_set_max_distance(
    	MaSpatializer pSpatializer,
    	float maxDistance
    ) {
    	ma_spatializer_set_max_distance(
    		pSpatializer.memorySegment(),
    		maxDistance
    	);
    }
    
    public static float ma_spatializer_get_max_distance(
    	MemorySegment pSpatializer
    ) {
    	MethodHandle method = MA_SPATIALIZER_GET_MAX_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			pSpatializer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_get_max_distance].
    public static float ma_spatializer_get_max_distance(
    	MaSpatializer pSpatializer
    ) {
    	return ma_spatializer_get_max_distance(
    		pSpatializer.memorySegment()
    	);
    }
    
    public static void ma_spatializer_set_cone(
    	MemorySegment pSpatializer,
    	float innerAngleInRadians,
    	float outerAngleInRadians,
    	float outerGain
    ) {
    	MethodHandle method = MA_SPATIALIZER_SET_CONE.get();
    	try {
    		 method.invokeExact(
    			pSpatializer,
    			innerAngleInRadians,
    			outerAngleInRadians,
    			outerGain
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_set_cone].
    public static void ma_spatializer_set_cone(
    	MaSpatializer pSpatializer,
    	float innerAngleInRadians,
    	float outerAngleInRadians,
    	float outerGain
    ) {
    	ma_spatializer_set_cone(
    		pSpatializer.memorySegment(),
    		innerAngleInRadians,
    		outerAngleInRadians,
    		outerGain
    	);
    }
    
    public static void ma_spatializer_get_cone(
    	MemorySegment pSpatializer,
    	MemorySegment pInnerAngleInRadians,
    	MemorySegment pOuterAngleInRadians,
    	MemorySegment pOuterGain
    ) {
    	MethodHandle method = MA_SPATIALIZER_GET_CONE.get();
    	try {
    		 method.invokeExact(
    			pSpatializer,
    			pInnerAngleInRadians,
    			pOuterAngleInRadians,
    			pOuterGain
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_get_cone].
    public static void ma_spatializer_get_cone(
    	MaSpatializer pSpatializer,
    	NativeFloatArray pInnerAngleInRadians,
    	NativeFloatArray pOuterAngleInRadians,
    	NativeFloatArray pOuterGain
    ) {
    	ma_spatializer_get_cone(
    		pSpatializer.memorySegment(),
    		pInnerAngleInRadians.memorySegment(),
    		pOuterAngleInRadians.memorySegment(),
    		pOuterGain.memorySegment()
    	);
    }
    
    public static void ma_spatializer_set_doppler_factor(
    	MemorySegment pSpatializer,
    	float dopplerFactor
    ) {
    	MethodHandle method = MA_SPATIALIZER_SET_DOPPLER_FACTOR.get();
    	try {
    		 method.invokeExact(
    			pSpatializer,
    			dopplerFactor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_set_doppler_factor].
    public static void ma_spatializer_set_doppler_factor(
    	MaSpatializer pSpatializer,
    	float dopplerFactor
    ) {
    	ma_spatializer_set_doppler_factor(
    		pSpatializer.memorySegment(),
    		dopplerFactor
    	);
    }
    
    public static float ma_spatializer_get_doppler_factor(
    	MemorySegment pSpatializer
    ) {
    	MethodHandle method = MA_SPATIALIZER_GET_DOPPLER_FACTOR.get();
    	try {
    		return (float) method.invokeExact(
    			pSpatializer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_get_doppler_factor].
    public static float ma_spatializer_get_doppler_factor(
    	MaSpatializer pSpatializer
    ) {
    	return ma_spatializer_get_doppler_factor(
    		pSpatializer.memorySegment()
    	);
    }
    
    public static void ma_spatializer_set_directional_attenuation_factor(
    	MemorySegment pSpatializer,
    	float directionalAttenuationFactor
    ) {
    	MethodHandle method = MA_SPATIALIZER_SET_DIRECTIONAL_ATTENUATION_FACTOR.get();
    	try {
    		 method.invokeExact(
    			pSpatializer,
    			directionalAttenuationFactor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_set_directional_attenuation_factor].
    public static void ma_spatializer_set_directional_attenuation_factor(
    	MaSpatializer pSpatializer,
    	float directionalAttenuationFactor
    ) {
    	ma_spatializer_set_directional_attenuation_factor(
    		pSpatializer.memorySegment(),
    		directionalAttenuationFactor
    	);
    }
    
    public static float ma_spatializer_get_directional_attenuation_factor(
    	MemorySegment pSpatializer
    ) {
    	MethodHandle method = MA_SPATIALIZER_GET_DIRECTIONAL_ATTENUATION_FACTOR.get();
    	try {
    		return (float) method.invokeExact(
    			pSpatializer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_get_directional_attenuation_factor].
    public static float ma_spatializer_get_directional_attenuation_factor(
    	MaSpatializer pSpatializer
    ) {
    	return ma_spatializer_get_directional_attenuation_factor(
    		pSpatializer.memorySegment()
    	);
    }
    
    public static void ma_spatializer_set_position(
    	MemorySegment pSpatializer,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = MA_SPATIALIZER_SET_POSITION.get();
    	try {
    		 method.invokeExact(
    			pSpatializer,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_set_position].
    public static void ma_spatializer_set_position(
    	MaSpatializer pSpatializer,
    	float x,
    	float y,
    	float z
    ) {
    	ma_spatializer_set_position(
    		pSpatializer.memorySegment(),
    		x,
    		y,
    		z
    	);
    }
    
    public static MemorySegment ma_spatializer_get_position(
    	SegmentAllocator allocator,
    	MemorySegment pSpatializer
    ) {
    	MethodHandle method = MA_SPATIALIZER_GET_POSITION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pSpatializer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_get_position].
    public static @Nullable MaVec3f ma_spatializer_get_position(
    	SegmentAllocator allocator,
    	MaSpatializer pSpatializer
    ) {
    	MemorySegment segment = ma_spatializer_get_position(
    		allocator,
    		pSpatializer.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaVec3f(segment);
    }
    
    public static void ma_spatializer_set_direction(
    	MemorySegment pSpatializer,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = MA_SPATIALIZER_SET_DIRECTION.get();
    	try {
    		 method.invokeExact(
    			pSpatializer,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_set_direction].
    public static void ma_spatializer_set_direction(
    	MaSpatializer pSpatializer,
    	float x,
    	float y,
    	float z
    ) {
    	ma_spatializer_set_direction(
    		pSpatializer.memorySegment(),
    		x,
    		y,
    		z
    	);
    }
    
    public static MemorySegment ma_spatializer_get_direction(
    	SegmentAllocator allocator,
    	MemorySegment pSpatializer
    ) {
    	MethodHandle method = MA_SPATIALIZER_GET_DIRECTION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pSpatializer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_get_direction].
    public static @Nullable MaVec3f ma_spatializer_get_direction(
    	SegmentAllocator allocator,
    	MaSpatializer pSpatializer
    ) {
    	MemorySegment segment = ma_spatializer_get_direction(
    		allocator,
    		pSpatializer.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaVec3f(segment);
    }
    
    public static void ma_spatializer_set_velocity(
    	MemorySegment pSpatializer,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = MA_SPATIALIZER_SET_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			pSpatializer,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_set_velocity].
    public static void ma_spatializer_set_velocity(
    	MaSpatializer pSpatializer,
    	float x,
    	float y,
    	float z
    ) {
    	ma_spatializer_set_velocity(
    		pSpatializer.memorySegment(),
    		x,
    		y,
    		z
    	);
    }
    
    public static MemorySegment ma_spatializer_get_velocity(
    	SegmentAllocator allocator,
    	MemorySegment pSpatializer
    ) {
    	MethodHandle method = MA_SPATIALIZER_GET_VELOCITY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pSpatializer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_get_velocity].
    public static @Nullable MaVec3f ma_spatializer_get_velocity(
    	SegmentAllocator allocator,
    	MaSpatializer pSpatializer
    ) {
    	MemorySegment segment = ma_spatializer_get_velocity(
    		allocator,
    		pSpatializer.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaVec3f(segment);
    }
    
    public static void ma_spatializer_get_relative_position_and_direction(
    	MemorySegment pSpatializer,
    	MemorySegment pListener,
    	MemorySegment pRelativePos,
    	MemorySegment pRelativeDir
    ) {
    	MethodHandle method = MA_SPATIALIZER_GET_RELATIVE_POSITION_AND_DIRECTION.get();
    	try {
    		 method.invokeExact(
    			pSpatializer,
    			pListener,
    			pRelativePos,
    			pRelativeDir
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spatializer_get_relative_position_and_direction].
    public static void ma_spatializer_get_relative_position_and_direction(
    	MaSpatializer pSpatializer,
    	MaSpatializerListener pListener,
    	MaVec3f pRelativePos,
    	MaVec3f pRelativeDir
    ) {
    	ma_spatializer_get_relative_position_and_direction(
    		pSpatializer.memorySegment(),
    		pListener.memorySegment(),
    		pRelativePos.memorySegment(),
    		pRelativeDir.memorySegment()
    	);
    }
    
    public static MemorySegment nma_linear_resampler_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRateIn,
    	int sampleRateOut
    ) {
    	MethodHandle method = MA_LINEAR_RESAMPLER_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			sampleRateIn,
    			sampleRateOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_linear_resampler_config_init].
    public static @Nullable MaLinearResamplerConfig ma_linear_resampler_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRateIn,
    	int sampleRateOut
    ) {
    	MemorySegment segment = nma_linear_resampler_config_init(
    		allocator,
    		format,
    		channels,
    		sampleRateIn,
    		sampleRateOut
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaLinearResamplerConfig(segment);
    }
    
    public static int ma_linear_resampler_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_LINEAR_RESAMPLER_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_linear_resampler_get_heap_size].
    public static int ma_linear_resampler_get_heap_size(
    	MaLinearResamplerConfig pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_linear_resampler_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_linear_resampler_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pResampler
    ) {
    	MethodHandle method = MA_LINEAR_RESAMPLER_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pResampler
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_linear_resampler_init_preallocated].
    public static int ma_linear_resampler_init_preallocated(
    	MaLinearResamplerConfig pConfig,
    	MemorySegment pHeap,
    	MaLinearResampler pResampler
    ) {
    	return ma_linear_resampler_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pResampler.memorySegment()
    	);
    }
    
    public static int ma_linear_resampler_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pResampler
    ) {
    	MethodHandle method = MA_LINEAR_RESAMPLER_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pResampler
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_linear_resampler_init].
    public static int ma_linear_resampler_init(
    	MaLinearResamplerConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaLinearResampler pResampler
    ) {
    	return ma_linear_resampler_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pResampler.memorySegment()
    	);
    }
    
    public static void ma_linear_resampler_uninit(
    	MemorySegment pResampler,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_LINEAR_RESAMPLER_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pResampler,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_linear_resampler_uninit].
    public static void ma_linear_resampler_uninit(
    	MaLinearResampler pResampler,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_linear_resampler_uninit(
    		pResampler.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_linear_resampler_process_pcm_frames(
    	MemorySegment pResampler,
    	MemorySegment pFramesIn,
    	MemorySegment pFrameCountIn,
    	MemorySegment pFramesOut,
    	MemorySegment pFrameCountOut
    ) {
    	MethodHandle method = MA_LINEAR_RESAMPLER_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pResampler,
    			pFramesIn,
    			pFrameCountIn,
    			pFramesOut,
    			pFrameCountOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_linear_resampler_process_pcm_frames].
    public static int ma_linear_resampler_process_pcm_frames(
    	MaLinearResampler pResampler,
    	MemorySegment pFramesIn,
    	NativeLongArray pFrameCountIn,
    	MemorySegment pFramesOut,
    	NativeLongArray pFrameCountOut
    ) {
    	return ma_linear_resampler_process_pcm_frames(
    		pResampler.memorySegment(),
    		pFramesIn,
    		pFrameCountIn.memorySegment(),
    		pFramesOut,
    		pFrameCountOut.memorySegment()
    	);
    }
    
    public static int ma_linear_resampler_set_rate(
    	MemorySegment pResampler,
    	int sampleRateIn,
    	int sampleRateOut
    ) {
    	MethodHandle method = MA_LINEAR_RESAMPLER_SET_RATE.get();
    	try {
    		return (int) method.invokeExact(
    			pResampler,
    			sampleRateIn,
    			sampleRateOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_linear_resampler_set_rate].
    public static int ma_linear_resampler_set_rate(
    	MaLinearResampler pResampler,
    	int sampleRateIn,
    	int sampleRateOut
    ) {
    	return ma_linear_resampler_set_rate(
    		pResampler.memorySegment(),
    		sampleRateIn,
    		sampleRateOut
    	);
    }
    
    public static int ma_linear_resampler_set_rate_ratio(
    	MemorySegment pResampler,
    	float ratioInOut
    ) {
    	MethodHandle method = MA_LINEAR_RESAMPLER_SET_RATE_RATIO.get();
    	try {
    		return (int) method.invokeExact(
    			pResampler,
    			ratioInOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_linear_resampler_set_rate_ratio].
    public static int ma_linear_resampler_set_rate_ratio(
    	MaLinearResampler pResampler,
    	float ratioInOut
    ) {
    	return ma_linear_resampler_set_rate_ratio(
    		pResampler.memorySegment(),
    		ratioInOut
    	);
    }
    
    public static long ma_linear_resampler_get_input_latency(
    	MemorySegment pResampler
    ) {
    	MethodHandle method = MA_LINEAR_RESAMPLER_GET_INPUT_LATENCY.get();
    	try {
    		return (long) method.invokeExact(
    			pResampler
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_linear_resampler_get_input_latency].
    public static long ma_linear_resampler_get_input_latency(
    	MaLinearResampler pResampler
    ) {
    	return ma_linear_resampler_get_input_latency(
    		pResampler.memorySegment()
    	);
    }
    
    public static long ma_linear_resampler_get_output_latency(
    	MemorySegment pResampler
    ) {
    	MethodHandle method = MA_LINEAR_RESAMPLER_GET_OUTPUT_LATENCY.get();
    	try {
    		return (long) method.invokeExact(
    			pResampler
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_linear_resampler_get_output_latency].
    public static long ma_linear_resampler_get_output_latency(
    	MaLinearResampler pResampler
    ) {
    	return ma_linear_resampler_get_output_latency(
    		pResampler.memorySegment()
    	);
    }
    
    public static int ma_linear_resampler_get_required_input_frame_count(
    	MemorySegment pResampler,
    	long outputFrameCount,
    	MemorySegment pInputFrameCount
    ) {
    	MethodHandle method = MA_LINEAR_RESAMPLER_GET_REQUIRED_INPUT_FRAME_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			pResampler,
    			outputFrameCount,
    			pInputFrameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_linear_resampler_get_required_input_frame_count].
    public static int ma_linear_resampler_get_required_input_frame_count(
    	MaLinearResampler pResampler,
    	long outputFrameCount,
    	NativeLongArray pInputFrameCount
    ) {
    	return ma_linear_resampler_get_required_input_frame_count(
    		pResampler.memorySegment(),
    		outputFrameCount,
    		pInputFrameCount.memorySegment()
    	);
    }
    
    public static int ma_linear_resampler_get_expected_output_frame_count(
    	MemorySegment pResampler,
    	long inputFrameCount,
    	MemorySegment pOutputFrameCount
    ) {
    	MethodHandle method = MA_LINEAR_RESAMPLER_GET_EXPECTED_OUTPUT_FRAME_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			pResampler,
    			inputFrameCount,
    			pOutputFrameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_linear_resampler_get_expected_output_frame_count].
    public static int ma_linear_resampler_get_expected_output_frame_count(
    	MaLinearResampler pResampler,
    	long inputFrameCount,
    	NativeLongArray pOutputFrameCount
    ) {
    	return ma_linear_resampler_get_expected_output_frame_count(
    		pResampler.memorySegment(),
    		inputFrameCount,
    		pOutputFrameCount.memorySegment()
    	);
    }
    
    public static int ma_linear_resampler_reset(
    	MemorySegment pResampler
    ) {
    	MethodHandle method = MA_LINEAR_RESAMPLER_RESET.get();
    	try {
    		return (int) method.invokeExact(
    			pResampler
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_linear_resampler_reset].
    public static int ma_linear_resampler_reset(
    	MaLinearResampler pResampler
    ) {
    	return ma_linear_resampler_reset(
    		pResampler.memorySegment()
    	);
    }
    
    public static MemorySegment nma_resampler_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRateIn,
    	int sampleRateOut,
    	int algorithm
    ) {
    	MethodHandle method = MA_RESAMPLER_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			sampleRateIn,
    			sampleRateOut,
    			algorithm
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_resampler_config_init].
    public static @Nullable MaResamplerConfig ma_resampler_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRateIn,
    	int sampleRateOut,
    	int algorithm
    ) {
    	MemorySegment segment = nma_resampler_config_init(
    		allocator,
    		format,
    		channels,
    		sampleRateIn,
    		sampleRateOut,
    		algorithm
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaResamplerConfig(segment);
    }
    
    public static int ma_resampler_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_RESAMPLER_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resampler_get_heap_size].
    public static int ma_resampler_get_heap_size(
    	MaResamplerConfig pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_resampler_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_resampler_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pResampler
    ) {
    	MethodHandle method = MA_RESAMPLER_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pResampler
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resampler_init_preallocated].
    public static int ma_resampler_init_preallocated(
    	MaResamplerConfig pConfig,
    	MemorySegment pHeap,
    	MaResampler pResampler
    ) {
    	return ma_resampler_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pResampler.memorySegment()
    	);
    }
    
    public static int ma_resampler_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pResampler
    ) {
    	MethodHandle method = MA_RESAMPLER_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pResampler
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resampler_init].
    public static int ma_resampler_init(
    	MaResamplerConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaResampler pResampler
    ) {
    	return ma_resampler_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pResampler.memorySegment()
    	);
    }
    
    public static void ma_resampler_uninit(
    	MemorySegment pResampler,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_RESAMPLER_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pResampler,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resampler_uninit].
    public static void ma_resampler_uninit(
    	MaResampler pResampler,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_resampler_uninit(
    		pResampler.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_resampler_process_pcm_frames(
    	MemorySegment pResampler,
    	MemorySegment pFramesIn,
    	MemorySegment pFrameCountIn,
    	MemorySegment pFramesOut,
    	MemorySegment pFrameCountOut
    ) {
    	MethodHandle method = MA_RESAMPLER_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pResampler,
    			pFramesIn,
    			pFrameCountIn,
    			pFramesOut,
    			pFrameCountOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resampler_process_pcm_frames].
    public static int ma_resampler_process_pcm_frames(
    	MaResampler pResampler,
    	MemorySegment pFramesIn,
    	NativeLongArray pFrameCountIn,
    	MemorySegment pFramesOut,
    	NativeLongArray pFrameCountOut
    ) {
    	return ma_resampler_process_pcm_frames(
    		pResampler.memorySegment(),
    		pFramesIn,
    		pFrameCountIn.memorySegment(),
    		pFramesOut,
    		pFrameCountOut.memorySegment()
    	);
    }
    
    public static int ma_resampler_set_rate(
    	MemorySegment pResampler,
    	int sampleRateIn,
    	int sampleRateOut
    ) {
    	MethodHandle method = MA_RESAMPLER_SET_RATE.get();
    	try {
    		return (int) method.invokeExact(
    			pResampler,
    			sampleRateIn,
    			sampleRateOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resampler_set_rate].
    public static int ma_resampler_set_rate(
    	MaResampler pResampler,
    	int sampleRateIn,
    	int sampleRateOut
    ) {
    	return ma_resampler_set_rate(
    		pResampler.memorySegment(),
    		sampleRateIn,
    		sampleRateOut
    	);
    }
    
    public static int ma_resampler_set_rate_ratio(
    	MemorySegment pResampler,
    	float ratio
    ) {
    	MethodHandle method = MA_RESAMPLER_SET_RATE_RATIO.get();
    	try {
    		return (int) method.invokeExact(
    			pResampler,
    			ratio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resampler_set_rate_ratio].
    public static int ma_resampler_set_rate_ratio(
    	MaResampler pResampler,
    	float ratio
    ) {
    	return ma_resampler_set_rate_ratio(
    		pResampler.memorySegment(),
    		ratio
    	);
    }
    
    public static long ma_resampler_get_input_latency(
    	MemorySegment pResampler
    ) {
    	MethodHandle method = MA_RESAMPLER_GET_INPUT_LATENCY.get();
    	try {
    		return (long) method.invokeExact(
    			pResampler
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resampler_get_input_latency].
    public static long ma_resampler_get_input_latency(
    	MaResampler pResampler
    ) {
    	return ma_resampler_get_input_latency(
    		pResampler.memorySegment()
    	);
    }
    
    public static long ma_resampler_get_output_latency(
    	MemorySegment pResampler
    ) {
    	MethodHandle method = MA_RESAMPLER_GET_OUTPUT_LATENCY.get();
    	try {
    		return (long) method.invokeExact(
    			pResampler
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resampler_get_output_latency].
    public static long ma_resampler_get_output_latency(
    	MaResampler pResampler
    ) {
    	return ma_resampler_get_output_latency(
    		pResampler.memorySegment()
    	);
    }
    
    public static int ma_resampler_get_required_input_frame_count(
    	MemorySegment pResampler,
    	long outputFrameCount,
    	MemorySegment pInputFrameCount
    ) {
    	MethodHandle method = MA_RESAMPLER_GET_REQUIRED_INPUT_FRAME_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			pResampler,
    			outputFrameCount,
    			pInputFrameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resampler_get_required_input_frame_count].
    public static int ma_resampler_get_required_input_frame_count(
    	MaResampler pResampler,
    	long outputFrameCount,
    	NativeLongArray pInputFrameCount
    ) {
    	return ma_resampler_get_required_input_frame_count(
    		pResampler.memorySegment(),
    		outputFrameCount,
    		pInputFrameCount.memorySegment()
    	);
    }
    
    public static int ma_resampler_get_expected_output_frame_count(
    	MemorySegment pResampler,
    	long inputFrameCount,
    	MemorySegment pOutputFrameCount
    ) {
    	MethodHandle method = MA_RESAMPLER_GET_EXPECTED_OUTPUT_FRAME_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			pResampler,
    			inputFrameCount,
    			pOutputFrameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resampler_get_expected_output_frame_count].
    public static int ma_resampler_get_expected_output_frame_count(
    	MaResampler pResampler,
    	long inputFrameCount,
    	NativeLongArray pOutputFrameCount
    ) {
    	return ma_resampler_get_expected_output_frame_count(
    		pResampler.memorySegment(),
    		inputFrameCount,
    		pOutputFrameCount.memorySegment()
    	);
    }
    
    public static int ma_resampler_reset(
    	MemorySegment pResampler
    ) {
    	MethodHandle method = MA_RESAMPLER_RESET.get();
    	try {
    		return (int) method.invokeExact(
    			pResampler
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resampler_reset].
    public static int ma_resampler_reset(
    	MaResampler pResampler
    ) {
    	return ma_resampler_reset(
    		pResampler.memorySegment()
    	);
    }
    
    public static MemorySegment ma_channel_converter_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channelsIn,
    	MemorySegment pChannelMapIn,
    	int channelsOut,
    	MemorySegment pChannelMapOut,
    	int mixingMode
    ) {
    	MethodHandle method = MA_CHANNEL_CONVERTER_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channelsIn,
    			pChannelMapIn,
    			channelsOut,
    			pChannelMapOut,
    			mixingMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_channel_converter_config_init].
    public static @Nullable MaChannelConverterConfig ma_channel_converter_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channelsIn,
    	NativeByteArray pChannelMapIn,
    	int channelsOut,
    	NativeByteArray pChannelMapOut,
    	int mixingMode
    ) {
    	MemorySegment segment = ma_channel_converter_config_init(
    		allocator,
    		format,
    		channelsIn,
    		pChannelMapIn.memorySegment(),
    		channelsOut,
    		pChannelMapOut.memorySegment(),
    		mixingMode
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaChannelConverterConfig(segment);
    }
    
    public static int ma_channel_converter_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_CHANNEL_CONVERTER_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_channel_converter_get_heap_size].
    public static int ma_channel_converter_get_heap_size(
    	MaChannelConverterConfig pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_channel_converter_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_channel_converter_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pConverter
    ) {
    	MethodHandle method = MA_CHANNEL_CONVERTER_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pConverter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_channel_converter_init_preallocated].
    public static int ma_channel_converter_init_preallocated(
    	MaChannelConverterConfig pConfig,
    	MemorySegment pHeap,
    	MaChannelConverter pConverter
    ) {
    	return ma_channel_converter_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pConverter.memorySegment()
    	);
    }
    
    public static int ma_channel_converter_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pConverter
    ) {
    	MethodHandle method = MA_CHANNEL_CONVERTER_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pConverter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_channel_converter_init].
    public static int ma_channel_converter_init(
    	MaChannelConverterConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaChannelConverter pConverter
    ) {
    	return ma_channel_converter_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pConverter.memorySegment()
    	);
    }
    
    public static void ma_channel_converter_uninit(
    	MemorySegment pConverter,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_CHANNEL_CONVERTER_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pConverter,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_channel_converter_uninit].
    public static void ma_channel_converter_uninit(
    	MaChannelConverter pConverter,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_channel_converter_uninit(
    		pConverter.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_channel_converter_process_pcm_frames(
    	MemorySegment pConverter,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	MethodHandle method = MA_CHANNEL_CONVERTER_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pConverter,
    			pFramesOut,
    			pFramesIn,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_channel_converter_process_pcm_frames].
    public static int ma_channel_converter_process_pcm_frames(
    	MaChannelConverter pConverter,
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount
    ) {
    	return ma_channel_converter_process_pcm_frames(
    		pConverter.memorySegment(),
    		pFramesOut,
    		pFramesIn,
    		frameCount
    	);
    }
    
    public static int ma_channel_converter_get_input_channel_map(
    	MemorySegment pConverter,
    	MemorySegment pChannelMap,
    	long channelMapCap
    ) {
    	MethodHandle method = MA_CHANNEL_CONVERTER_GET_INPUT_CHANNEL_MAP.get();
    	try {
    		return (int) method.invokeExact(
    			pConverter,
    			pChannelMap,
    			channelMapCap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_channel_converter_get_input_channel_map].
    public static int ma_channel_converter_get_input_channel_map(
    	MaChannelConverter pConverter,
    	NativeByteArray pChannelMap,
    	long channelMapCap
    ) {
    	return ma_channel_converter_get_input_channel_map(
    		pConverter.memorySegment(),
    		pChannelMap.memorySegment(),
    		channelMapCap
    	);
    }
    
    public static int ma_channel_converter_get_output_channel_map(
    	MemorySegment pConverter,
    	MemorySegment pChannelMap,
    	long channelMapCap
    ) {
    	MethodHandle method = MA_CHANNEL_CONVERTER_GET_OUTPUT_CHANNEL_MAP.get();
    	try {
    		return (int) method.invokeExact(
    			pConverter,
    			pChannelMap,
    			channelMapCap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_channel_converter_get_output_channel_map].
    public static int ma_channel_converter_get_output_channel_map(
    	MaChannelConverter pConverter,
    	NativeByteArray pChannelMap,
    	long channelMapCap
    ) {
    	return ma_channel_converter_get_output_channel_map(
    		pConverter.memorySegment(),
    		pChannelMap.memorySegment(),
    		channelMapCap
    	);
    }
    
    public static MemorySegment nma_data_converter_config_init_default(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = MA_DATA_CONVERTER_CONFIG_INIT_DEFAULT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_data_converter_config_init_default].
    public static @Nullable MaDataConverterConfig ma_data_converter_config_init_default(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = nma_data_converter_config_init_default(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDataConverterConfig(segment);
    }
    
    public static MemorySegment nma_data_converter_config_init(
    	SegmentAllocator allocator,
    	int formatIn,
    	int formatOut,
    	int channelsIn,
    	int channelsOut,
    	int sampleRateIn,
    	int sampleRateOut
    ) {
    	MethodHandle method = MA_DATA_CONVERTER_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			formatIn,
    			formatOut,
    			channelsIn,
    			channelsOut,
    			sampleRateIn,
    			sampleRateOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_data_converter_config_init].
    public static @Nullable MaDataConverterConfig ma_data_converter_config_init(
    	SegmentAllocator allocator,
    	int formatIn,
    	int formatOut,
    	int channelsIn,
    	int channelsOut,
    	int sampleRateIn,
    	int sampleRateOut
    ) {
    	MemorySegment segment = nma_data_converter_config_init(
    		allocator,
    		formatIn,
    		formatOut,
    		channelsIn,
    		channelsOut,
    		sampleRateIn,
    		sampleRateOut
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDataConverterConfig(segment);
    }
    
    public static int ma_data_converter_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_DATA_CONVERTER_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_converter_get_heap_size].
    public static int ma_data_converter_get_heap_size(
    	MaDataConverterConfig pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_data_converter_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_data_converter_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pConverter
    ) {
    	MethodHandle method = MA_DATA_CONVERTER_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pConverter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_converter_init_preallocated].
    public static int ma_data_converter_init_preallocated(
    	MaDataConverterConfig pConfig,
    	MemorySegment pHeap,
    	MaDataConverter pConverter
    ) {
    	return ma_data_converter_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pConverter.memorySegment()
    	);
    }
    
    public static int ma_data_converter_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pConverter
    ) {
    	MethodHandle method = MA_DATA_CONVERTER_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pConverter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_converter_init].
    public static int ma_data_converter_init(
    	MaDataConverterConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaDataConverter pConverter
    ) {
    	return ma_data_converter_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pConverter.memorySegment()
    	);
    }
    
    public static void ma_data_converter_uninit(
    	MemorySegment pConverter,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_DATA_CONVERTER_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pConverter,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_converter_uninit].
    public static void ma_data_converter_uninit(
    	MaDataConverter pConverter,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_data_converter_uninit(
    		pConverter.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_data_converter_process_pcm_frames(
    	MemorySegment pConverter,
    	MemorySegment pFramesIn,
    	MemorySegment pFrameCountIn,
    	MemorySegment pFramesOut,
    	MemorySegment pFrameCountOut
    ) {
    	MethodHandle method = MA_DATA_CONVERTER_PROCESS_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pConverter,
    			pFramesIn,
    			pFrameCountIn,
    			pFramesOut,
    			pFrameCountOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_converter_process_pcm_frames].
    public static int ma_data_converter_process_pcm_frames(
    	MaDataConverter pConverter,
    	MemorySegment pFramesIn,
    	NativeLongArray pFrameCountIn,
    	MemorySegment pFramesOut,
    	NativeLongArray pFrameCountOut
    ) {
    	return ma_data_converter_process_pcm_frames(
    		pConverter.memorySegment(),
    		pFramesIn,
    		pFrameCountIn.memorySegment(),
    		pFramesOut,
    		pFrameCountOut.memorySegment()
    	);
    }
    
    public static int ma_data_converter_set_rate(
    	MemorySegment pConverter,
    	int sampleRateIn,
    	int sampleRateOut
    ) {
    	MethodHandle method = MA_DATA_CONVERTER_SET_RATE.get();
    	try {
    		return (int) method.invokeExact(
    			pConverter,
    			sampleRateIn,
    			sampleRateOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_converter_set_rate].
    public static int ma_data_converter_set_rate(
    	MaDataConverter pConverter,
    	int sampleRateIn,
    	int sampleRateOut
    ) {
    	return ma_data_converter_set_rate(
    		pConverter.memorySegment(),
    		sampleRateIn,
    		sampleRateOut
    	);
    }
    
    public static int ma_data_converter_set_rate_ratio(
    	MemorySegment pConverter,
    	float ratioInOut
    ) {
    	MethodHandle method = MA_DATA_CONVERTER_SET_RATE_RATIO.get();
    	try {
    		return (int) method.invokeExact(
    			pConverter,
    			ratioInOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_converter_set_rate_ratio].
    public static int ma_data_converter_set_rate_ratio(
    	MaDataConverter pConverter,
    	float ratioInOut
    ) {
    	return ma_data_converter_set_rate_ratio(
    		pConverter.memorySegment(),
    		ratioInOut
    	);
    }
    
    public static long ma_data_converter_get_input_latency(
    	MemorySegment pConverter
    ) {
    	MethodHandle method = MA_DATA_CONVERTER_GET_INPUT_LATENCY.get();
    	try {
    		return (long) method.invokeExact(
    			pConverter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_converter_get_input_latency].
    public static long ma_data_converter_get_input_latency(
    	MaDataConverter pConverter
    ) {
    	return ma_data_converter_get_input_latency(
    		pConverter.memorySegment()
    	);
    }
    
    public static long ma_data_converter_get_output_latency(
    	MemorySegment pConverter
    ) {
    	MethodHandle method = MA_DATA_CONVERTER_GET_OUTPUT_LATENCY.get();
    	try {
    		return (long) method.invokeExact(
    			pConverter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_converter_get_output_latency].
    public static long ma_data_converter_get_output_latency(
    	MaDataConverter pConverter
    ) {
    	return ma_data_converter_get_output_latency(
    		pConverter.memorySegment()
    	);
    }
    
    public static int ma_data_converter_get_required_input_frame_count(
    	MemorySegment pConverter,
    	long outputFrameCount,
    	MemorySegment pInputFrameCount
    ) {
    	MethodHandle method = MA_DATA_CONVERTER_GET_REQUIRED_INPUT_FRAME_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			pConverter,
    			outputFrameCount,
    			pInputFrameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_converter_get_required_input_frame_count].
    public static int ma_data_converter_get_required_input_frame_count(
    	MaDataConverter pConverter,
    	long outputFrameCount,
    	NativeLongArray pInputFrameCount
    ) {
    	return ma_data_converter_get_required_input_frame_count(
    		pConverter.memorySegment(),
    		outputFrameCount,
    		pInputFrameCount.memorySegment()
    	);
    }
    
    public static int ma_data_converter_get_expected_output_frame_count(
    	MemorySegment pConverter,
    	long inputFrameCount,
    	MemorySegment pOutputFrameCount
    ) {
    	MethodHandle method = MA_DATA_CONVERTER_GET_EXPECTED_OUTPUT_FRAME_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			pConverter,
    			inputFrameCount,
    			pOutputFrameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_converter_get_expected_output_frame_count].
    public static int ma_data_converter_get_expected_output_frame_count(
    	MaDataConverter pConverter,
    	long inputFrameCount,
    	NativeLongArray pOutputFrameCount
    ) {
    	return ma_data_converter_get_expected_output_frame_count(
    		pConverter.memorySegment(),
    		inputFrameCount,
    		pOutputFrameCount.memorySegment()
    	);
    }
    
    public static int ma_data_converter_get_input_channel_map(
    	MemorySegment pConverter,
    	MemorySegment pChannelMap,
    	long channelMapCap
    ) {
    	MethodHandle method = MA_DATA_CONVERTER_GET_INPUT_CHANNEL_MAP.get();
    	try {
    		return (int) method.invokeExact(
    			pConverter,
    			pChannelMap,
    			channelMapCap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_converter_get_input_channel_map].
    public static int ma_data_converter_get_input_channel_map(
    	MaDataConverter pConverter,
    	NativeByteArray pChannelMap,
    	long channelMapCap
    ) {
    	return ma_data_converter_get_input_channel_map(
    		pConverter.memorySegment(),
    		pChannelMap.memorySegment(),
    		channelMapCap
    	);
    }
    
    public static int ma_data_converter_get_output_channel_map(
    	MemorySegment pConverter,
    	MemorySegment pChannelMap,
    	long channelMapCap
    ) {
    	MethodHandle method = MA_DATA_CONVERTER_GET_OUTPUT_CHANNEL_MAP.get();
    	try {
    		return (int) method.invokeExact(
    			pConverter,
    			pChannelMap,
    			channelMapCap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_converter_get_output_channel_map].
    public static int ma_data_converter_get_output_channel_map(
    	MaDataConverter pConverter,
    	NativeByteArray pChannelMap,
    	long channelMapCap
    ) {
    	return ma_data_converter_get_output_channel_map(
    		pConverter.memorySegment(),
    		pChannelMap.memorySegment(),
    		channelMapCap
    	);
    }
    
    public static int ma_data_converter_reset(
    	MemorySegment pConverter
    ) {
    	MethodHandle method = MA_DATA_CONVERTER_RESET.get();
    	try {
    		return (int) method.invokeExact(
    			pConverter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_converter_reset].
    public static int ma_data_converter_reset(
    	MaDataConverter pConverter
    ) {
    	return ma_data_converter_reset(
    		pConverter.memorySegment()
    	);
    }
    
    /// ```
    /// *********************************************************************************************************************************************************
    /// 
    /// Format Conversion
    /// 
    /// **********************************************************************************************************************************************************
    /// ```
    public static void ma_pcm_u8_to_s16(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_U8_TO_S16.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_u8_to_s24(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_U8_TO_S24.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_u8_to_s32(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_U8_TO_S32.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_u8_to_f32(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_U8_TO_F32.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_s16_to_u8(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_S16_TO_U8.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_s16_to_s24(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_S16_TO_S24.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_s16_to_s32(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_S16_TO_S32.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_s16_to_f32(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_S16_TO_F32.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_s24_to_u8(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_S24_TO_U8.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_s24_to_s16(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_S24_TO_S16.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_s24_to_s32(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_S24_TO_S32.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_s24_to_f32(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_S24_TO_F32.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_s32_to_u8(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_S32_TO_U8.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_s32_to_s16(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_S32_TO_S16.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_s32_to_s24(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_S32_TO_S24.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_s32_to_f32(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_S32_TO_F32.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_f32_to_u8(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_F32_TO_U8.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_f32_to_s16(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_F32_TO_S16.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_f32_to_s24(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_F32_TO_S24.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_f32_to_s32(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	long count,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_F32_TO_S32.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			count,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_pcm_convert(
    	MemorySegment pOut,
    	int formatOut,
    	MemorySegment pIn,
    	int formatIn,
    	long sampleCount,
    	int ditherMode
    ) {
    	MethodHandle method = MA_PCM_CONVERT.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			formatOut,
    			pIn,
    			formatIn,
    			sampleCount,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_convert_pcm_frames_format(
    	MemorySegment pOut,
    	int formatOut,
    	MemorySegment pIn,
    	int formatIn,
    	long frameCount,
    	int channels,
    	int ditherMode
    ) {
    	MethodHandle method = MA_CONVERT_PCM_FRAMES_FORMAT.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			formatOut,
    			pIn,
    			formatIn,
    			frameCount,
    			channels,
    			ditherMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_deinterleave_pcm_frames(
    	int format,
    	int channels,
    	long frameCount,
    	MemorySegment pInterleavedPCMFrames,
    	MemorySegment ppDeinterleavedPCMFrames
    ) {
    	MethodHandle method = MA_DEINTERLEAVE_PCM_FRAMES.get();
    	try {
    		 method.invokeExact(
    			format,
    			channels,
    			frameCount,
    			pInterleavedPCMFrames,
    			ppDeinterleavedPCMFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_deinterleave_pcm_frames].
    public static void ma_deinterleave_pcm_frames(
    	int format,
    	int channels,
    	long frameCount,
    	MemorySegment pInterleavedPCMFrames,
    	NativePointerArray ppDeinterleavedPCMFrames
    ) {
    	ma_deinterleave_pcm_frames(
    		format,
    		channels,
    		frameCount,
    		pInterleavedPCMFrames,
    		ppDeinterleavedPCMFrames.memorySegment()
    	);
    }
    
    public static void ma_interleave_pcm_frames(
    	int format,
    	int channels,
    	long frameCount,
    	MemorySegment ppDeinterleavedPCMFrames,
    	MemorySegment pInterleavedPCMFrames
    ) {
    	MethodHandle method = MA_INTERLEAVE_PCM_FRAMES.get();
    	try {
    		 method.invokeExact(
    			format,
    			channels,
    			frameCount,
    			ppDeinterleavedPCMFrames,
    			pInterleavedPCMFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_interleave_pcm_frames].
    public static void ma_interleave_pcm_frames(
    	int format,
    	int channels,
    	long frameCount,
    	NativePointerArray ppDeinterleavedPCMFrames,
    	MemorySegment pInterleavedPCMFrames
    ) {
    	ma_interleave_pcm_frames(
    		format,
    		channels,
    		frameCount,
    		ppDeinterleavedPCMFrames.memorySegment(),
    		pInterleavedPCMFrames
    	);
    }
    
    public static byte ma_channel_map_get_channel(
    	MemorySegment pChannelMap,
    	int channelCount,
    	int channelIndex
    ) {
    	MethodHandle method = MA_CHANNEL_MAP_GET_CHANNEL.get();
    	try {
    		return (byte) method.invokeExact(
    			pChannelMap,
    			channelCount,
    			channelIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_channel_map_get_channel].
    public static byte ma_channel_map_get_channel(
    	NativeByteArray pChannelMap,
    	int channelCount,
    	int channelIndex
    ) {
    	return ma_channel_map_get_channel(
    		pChannelMap.memorySegment(),
    		channelCount,
    		channelIndex
    	);
    }
    
    public static void ma_channel_map_init_blank(
    	MemorySegment pChannelMap,
    	int channels
    ) {
    	MethodHandle method = MA_CHANNEL_MAP_INIT_BLANK.get();
    	try {
    		 method.invokeExact(
    			pChannelMap,
    			channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_channel_map_init_blank].
    public static void ma_channel_map_init_blank(
    	NativeByteArray pChannelMap,
    	int channels
    ) {
    	ma_channel_map_init_blank(
    		pChannelMap.memorySegment(),
    		channels
    	);
    }
    
    public static void ma_channel_map_init_standard(
    	int standardChannelMap,
    	MemorySegment pChannelMap,
    	long channelMapCap,
    	int channels
    ) {
    	MethodHandle method = MA_CHANNEL_MAP_INIT_STANDARD.get();
    	try {
    		 method.invokeExact(
    			standardChannelMap,
    			pChannelMap,
    			channelMapCap,
    			channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_channel_map_init_standard].
    public static void ma_channel_map_init_standard(
    	int standardChannelMap,
    	NativeByteArray pChannelMap,
    	long channelMapCap,
    	int channels
    ) {
    	ma_channel_map_init_standard(
    		standardChannelMap,
    		pChannelMap.memorySegment(),
    		channelMapCap,
    		channels
    	);
    }
    
    public static void ma_channel_map_copy(
    	MemorySegment pOut,
    	MemorySegment pIn,
    	int channels
    ) {
    	MethodHandle method = MA_CHANNEL_MAP_COPY.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pIn,
    			channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_channel_map_copy].
    public static void ma_channel_map_copy(
    	NativeByteArray pOut,
    	NativeByteArray pIn,
    	int channels
    ) {
    	ma_channel_map_copy(
    		pOut.memorySegment(),
    		pIn.memorySegment(),
    		channels
    	);
    }
    
    public static void ma_channel_map_copy_or_default(
    	MemorySegment pOut,
    	long channelMapCapOut,
    	MemorySegment pIn,
    	int channels
    ) {
    	MethodHandle method = MA_CHANNEL_MAP_COPY_OR_DEFAULT.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			channelMapCapOut,
    			pIn,
    			channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_channel_map_copy_or_default].
    public static void ma_channel_map_copy_or_default(
    	NativeByteArray pOut,
    	long channelMapCapOut,
    	NativeByteArray pIn,
    	int channels
    ) {
    	ma_channel_map_copy_or_default(
    		pOut.memorySegment(),
    		channelMapCapOut,
    		pIn.memorySegment(),
    		channels
    	);
    }
    
    public static int ma_channel_map_is_valid(
    	MemorySegment pChannelMap,
    	int channels
    ) {
    	MethodHandle method = MA_CHANNEL_MAP_IS_VALID.get();
    	try {
    		return (int) method.invokeExact(
    			pChannelMap,
    			channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_channel_map_is_valid].
    public static int ma_channel_map_is_valid(
    	NativeByteArray pChannelMap,
    	int channels
    ) {
    	return ma_channel_map_is_valid(
    		pChannelMap.memorySegment(),
    		channels
    	);
    }
    
    public static int ma_channel_map_is_equal(
    	MemorySegment pChannelMapA,
    	MemorySegment pChannelMapB,
    	int channels
    ) {
    	MethodHandle method = MA_CHANNEL_MAP_IS_EQUAL.get();
    	try {
    		return (int) method.invokeExact(
    			pChannelMapA,
    			pChannelMapB,
    			channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_channel_map_is_equal].
    public static int ma_channel_map_is_equal(
    	NativeByteArray pChannelMapA,
    	NativeByteArray pChannelMapB,
    	int channels
    ) {
    	return ma_channel_map_is_equal(
    		pChannelMapA.memorySegment(),
    		pChannelMapB.memorySegment(),
    		channels
    	);
    }
    
    public static int ma_channel_map_is_blank(
    	MemorySegment pChannelMap,
    	int channels
    ) {
    	MethodHandle method = MA_CHANNEL_MAP_IS_BLANK.get();
    	try {
    		return (int) method.invokeExact(
    			pChannelMap,
    			channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_channel_map_is_blank].
    public static int ma_channel_map_is_blank(
    	NativeByteArray pChannelMap,
    	int channels
    ) {
    	return ma_channel_map_is_blank(
    		pChannelMap.memorySegment(),
    		channels
    	);
    }
    
    public static int ma_channel_map_contains_channel_position(
    	int channels,
    	MemorySegment pChannelMap,
    	byte channelPosition
    ) {
    	MethodHandle method = MA_CHANNEL_MAP_CONTAINS_CHANNEL_POSITION.get();
    	try {
    		return (int) method.invokeExact(
    			channels,
    			pChannelMap,
    			channelPosition
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_channel_map_contains_channel_position].
    public static int ma_channel_map_contains_channel_position(
    	int channels,
    	NativeByteArray pChannelMap,
    	byte channelPosition
    ) {
    	return ma_channel_map_contains_channel_position(
    		channels,
    		pChannelMap.memorySegment(),
    		channelPosition
    	);
    }
    
    public static int ma_channel_map_find_channel_position(
    	int channels,
    	MemorySegment pChannelMap,
    	byte channelPosition,
    	MemorySegment pChannelIndex
    ) {
    	MethodHandle method = MA_CHANNEL_MAP_FIND_CHANNEL_POSITION.get();
    	try {
    		return (int) method.invokeExact(
    			channels,
    			pChannelMap,
    			channelPosition,
    			pChannelIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_channel_map_find_channel_position].
    public static int ma_channel_map_find_channel_position(
    	int channels,
    	NativeByteArray pChannelMap,
    	byte channelPosition,
    	NativeIntArray pChannelIndex
    ) {
    	return ma_channel_map_find_channel_position(
    		channels,
    		pChannelMap.memorySegment(),
    		channelPosition,
    		pChannelIndex.memorySegment()
    	);
    }
    
    public static long ma_channel_map_to_string(
    	MemorySegment pChannelMap,
    	int channels,
    	MemorySegment pBufferOut,
    	long bufferCap
    ) {
    	MethodHandle method = MA_CHANNEL_MAP_TO_STRING.get();
    	try {
    		return (long) method.invokeExact(
    			pChannelMap,
    			channels,
    			pBufferOut,
    			bufferCap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_channel_map_to_string].
    public static long ma_channel_map_to_string(
    	NativeByteArray pChannelMap,
    	int channels,
    	NativeByteArray pBufferOut,
    	long bufferCap
    ) {
    	return ma_channel_map_to_string(
    		pChannelMap.memorySegment(),
    		channels,
    		pBufferOut.memorySegment(),
    		bufferCap
    	);
    }
    
    public static MemorySegment nma_channel_position_to_string(
    	byte channel
    ) {
    	MethodHandle method = MA_CHANNEL_POSITION_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			channel
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_channel_position_to_string].
    public static @Nullable String ma_channel_position_to_string(
    	byte channel
    ) {
    	MemorySegment segment = nma_channel_position_to_string(
    		channel
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// ```
    /// *********************************************************************************************************************************************************
    /// 
    /// Conversion Helpers
    /// 
    /// **********************************************************************************************************************************************************
    /// ```
    public static long ma_convert_frames(
    	MemorySegment pOut,
    	long frameCountOut,
    	int formatOut,
    	int channelsOut,
    	int sampleRateOut,
    	MemorySegment pIn,
    	long frameCountIn,
    	int formatIn,
    	int channelsIn,
    	int sampleRateIn
    ) {
    	MethodHandle method = MA_CONVERT_FRAMES.get();
    	try {
    		return (long) method.invokeExact(
    			pOut,
    			frameCountOut,
    			formatOut,
    			channelsOut,
    			sampleRateOut,
    			pIn,
    			frameCountIn,
    			formatIn,
    			channelsIn,
    			sampleRateIn
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static long ma_convert_frames_ex(
    	MemorySegment pOut,
    	long frameCountOut,
    	MemorySegment pIn,
    	long frameCountIn,
    	MemorySegment pConfig
    ) {
    	MethodHandle method = MA_CONVERT_FRAMES_EX.get();
    	try {
    		return (long) method.invokeExact(
    			pOut,
    			frameCountOut,
    			pIn,
    			frameCountIn,
    			pConfig
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_convert_frames_ex].
    public static long ma_convert_frames_ex(
    	MemorySegment pOut,
    	long frameCountOut,
    	MemorySegment pIn,
    	long frameCountIn,
    	MaDataConverterConfig pConfig
    ) {
    	return ma_convert_frames_ex(
    		pOut,
    		frameCountOut,
    		pIn,
    		frameCountIn,
    		pConfig.memorySegment()
    	);
    }
    
    public static MemorySegment nma_data_source_config_init(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = MA_DATA_SOURCE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_data_source_config_init].
    public static @Nullable MaDataSourceConfig ma_data_source_config_init(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = nma_data_source_config_init(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDataSourceConfig(segment);
    }
    
    public static int ma_data_source_init(
    	MemorySegment pConfig,
    	MemorySegment pDataSource
    ) {
    	MethodHandle method = MA_DATA_SOURCE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pDataSource
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_source_init].
    public static int ma_data_source_init(
    	MaDataSourceConfig pConfig,
    	MemorySegment pDataSource
    ) {
    	return ma_data_source_init(
    		pConfig.memorySegment(),
    		pDataSource
    	);
    }
    
    public static void ma_data_source_uninit(
    	MemorySegment pDataSource
    ) {
    	MethodHandle method = MA_DATA_SOURCE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pDataSource
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_data_source_read_pcm_frames(
    	MemorySegment pDataSource,
    	MemorySegment pFramesOut,
    	long frameCount,
    	MemorySegment pFramesRead
    ) {
    	MethodHandle method = MA_DATA_SOURCE_READ_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			pFramesOut,
    			frameCount,
    			pFramesRead
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_source_read_pcm_frames].
    public static int ma_data_source_read_pcm_frames(
    	MemorySegment pDataSource,
    	MemorySegment pFramesOut,
    	long frameCount,
    	NativeLongArray pFramesRead
    ) {
    	return ma_data_source_read_pcm_frames(
    		pDataSource,
    		pFramesOut,
    		frameCount,
    		pFramesRead.memorySegment()
    	);
    }
    
    public static int ma_data_source_seek_pcm_frames(
    	MemorySegment pDataSource,
    	long frameCount,
    	MemorySegment pFramesSeeked
    ) {
    	MethodHandle method = MA_DATA_SOURCE_SEEK_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			frameCount,
    			pFramesSeeked
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_source_seek_pcm_frames].
    public static int ma_data_source_seek_pcm_frames(
    	MemorySegment pDataSource,
    	long frameCount,
    	NativeLongArray pFramesSeeked
    ) {
    	return ma_data_source_seek_pcm_frames(
    		pDataSource,
    		frameCount,
    		pFramesSeeked.memorySegment()
    	);
    }
    
    public static int ma_data_source_seek_to_pcm_frame(
    	MemorySegment pDataSource,
    	long frameIndex
    ) {
    	MethodHandle method = MA_DATA_SOURCE_SEEK_TO_PCM_FRAME.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			frameIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_data_source_seek_seconds(
    	MemorySegment pDataSource,
    	float secondCount,
    	MemorySegment pSecondsSeeked
    ) {
    	MethodHandle method = MA_DATA_SOURCE_SEEK_SECONDS.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			secondCount,
    			pSecondsSeeked
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_source_seek_seconds].
    public static int ma_data_source_seek_seconds(
    	MemorySegment pDataSource,
    	float secondCount,
    	NativeFloatArray pSecondsSeeked
    ) {
    	return ma_data_source_seek_seconds(
    		pDataSource,
    		secondCount,
    		pSecondsSeeked.memorySegment()
    	);
    }
    
    public static int ma_data_source_seek_to_second(
    	MemorySegment pDataSource,
    	float seekPointInSeconds
    ) {
    	MethodHandle method = MA_DATA_SOURCE_SEEK_TO_SECOND.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			seekPointInSeconds
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_data_source_get_data_format(
    	MemorySegment pDataSource,
    	MemorySegment pFormat,
    	MemorySegment pChannels,
    	MemorySegment pSampleRate,
    	MemorySegment pChannelMap,
    	long channelMapCap
    ) {
    	MethodHandle method = MA_DATA_SOURCE_GET_DATA_FORMAT.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			pFormat,
    			pChannels,
    			pSampleRate,
    			pChannelMap,
    			channelMapCap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_source_get_data_format].
    public static int ma_data_source_get_data_format(
    	MemorySegment pDataSource,
    	NativeIntArray pFormat,
    	NativeIntArray pChannels,
    	NativeIntArray pSampleRate,
    	NativeByteArray pChannelMap,
    	long channelMapCap
    ) {
    	return ma_data_source_get_data_format(
    		pDataSource,
    		pFormat.memorySegment(),
    		pChannels.memorySegment(),
    		pSampleRate.memorySegment(),
    		pChannelMap.memorySegment(),
    		channelMapCap
    	);
    }
    
    public static int ma_data_source_get_cursor_in_pcm_frames(
    	MemorySegment pDataSource,
    	MemorySegment pCursor
    ) {
    	MethodHandle method = MA_DATA_SOURCE_GET_CURSOR_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			pCursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_source_get_cursor_in_pcm_frames].
    public static int ma_data_source_get_cursor_in_pcm_frames(
    	MemorySegment pDataSource,
    	NativeLongArray pCursor
    ) {
    	return ma_data_source_get_cursor_in_pcm_frames(
    		pDataSource,
    		pCursor.memorySegment()
    	);
    }
    
    public static int ma_data_source_get_length_in_pcm_frames(
    	MemorySegment pDataSource,
    	MemorySegment pLength
    ) {
    	MethodHandle method = MA_DATA_SOURCE_GET_LENGTH_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			pLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_source_get_length_in_pcm_frames].
    public static int ma_data_source_get_length_in_pcm_frames(
    	MemorySegment pDataSource,
    	NativeLongArray pLength
    ) {
    	return ma_data_source_get_length_in_pcm_frames(
    		pDataSource,
    		pLength.memorySegment()
    	);
    }
    
    public static int ma_data_source_get_cursor_in_seconds(
    	MemorySegment pDataSource,
    	MemorySegment pCursor
    ) {
    	MethodHandle method = MA_DATA_SOURCE_GET_CURSOR_IN_SECONDS.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			pCursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_source_get_cursor_in_seconds].
    public static int ma_data_source_get_cursor_in_seconds(
    	MemorySegment pDataSource,
    	NativeFloatArray pCursor
    ) {
    	return ma_data_source_get_cursor_in_seconds(
    		pDataSource,
    		pCursor.memorySegment()
    	);
    }
    
    public static int ma_data_source_get_length_in_seconds(
    	MemorySegment pDataSource,
    	MemorySegment pLength
    ) {
    	MethodHandle method = MA_DATA_SOURCE_GET_LENGTH_IN_SECONDS.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			pLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_source_get_length_in_seconds].
    public static int ma_data_source_get_length_in_seconds(
    	MemorySegment pDataSource,
    	NativeFloatArray pLength
    ) {
    	return ma_data_source_get_length_in_seconds(
    		pDataSource,
    		pLength.memorySegment()
    	);
    }
    
    public static int ma_data_source_set_looping(
    	MemorySegment pDataSource,
    	int isLooping
    ) {
    	MethodHandle method = MA_DATA_SOURCE_SET_LOOPING.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			isLooping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_data_source_is_looping(
    	MemorySegment pDataSource
    ) {
    	MethodHandle method = MA_DATA_SOURCE_IS_LOOPING.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_data_source_set_range_in_pcm_frames(
    	MemorySegment pDataSource,
    	long rangeBegInFrames,
    	long rangeEndInFrames
    ) {
    	MethodHandle method = MA_DATA_SOURCE_SET_RANGE_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			rangeBegInFrames,
    			rangeEndInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_data_source_get_range_in_pcm_frames(
    	MemorySegment pDataSource,
    	MemorySegment pRangeBegInFrames,
    	MemorySegment pRangeEndInFrames
    ) {
    	MethodHandle method = MA_DATA_SOURCE_GET_RANGE_IN_PCM_FRAMES.get();
    	try {
    		 method.invokeExact(
    			pDataSource,
    			pRangeBegInFrames,
    			pRangeEndInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_source_get_range_in_pcm_frames].
    public static void ma_data_source_get_range_in_pcm_frames(
    	MemorySegment pDataSource,
    	NativeLongArray pRangeBegInFrames,
    	NativeLongArray pRangeEndInFrames
    ) {
    	ma_data_source_get_range_in_pcm_frames(
    		pDataSource,
    		pRangeBegInFrames.memorySegment(),
    		pRangeEndInFrames.memorySegment()
    	);
    }
    
    public static int ma_data_source_set_loop_point_in_pcm_frames(
    	MemorySegment pDataSource,
    	long loopBegInFrames,
    	long loopEndInFrames
    ) {
    	MethodHandle method = MA_DATA_SOURCE_SET_LOOP_POINT_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			loopBegInFrames,
    			loopEndInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_data_source_get_loop_point_in_pcm_frames(
    	MemorySegment pDataSource,
    	MemorySegment pLoopBegInFrames,
    	MemorySegment pLoopEndInFrames
    ) {
    	MethodHandle method = MA_DATA_SOURCE_GET_LOOP_POINT_IN_PCM_FRAMES.get();
    	try {
    		 method.invokeExact(
    			pDataSource,
    			pLoopBegInFrames,
    			pLoopEndInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_source_get_loop_point_in_pcm_frames].
    public static void ma_data_source_get_loop_point_in_pcm_frames(
    	MemorySegment pDataSource,
    	NativeLongArray pLoopBegInFrames,
    	NativeLongArray pLoopEndInFrames
    ) {
    	ma_data_source_get_loop_point_in_pcm_frames(
    		pDataSource,
    		pLoopBegInFrames.memorySegment(),
    		pLoopEndInFrames.memorySegment()
    	);
    }
    
    public static int ma_data_source_set_current(
    	MemorySegment pDataSource,
    	MemorySegment pCurrentDataSource
    ) {
    	MethodHandle method = MA_DATA_SOURCE_SET_CURRENT.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			pCurrentDataSource
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment ma_data_source_get_current(
    	MemorySegment pDataSource
    ) {
    	MethodHandle method = MA_DATA_SOURCE_GET_CURRENT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pDataSource
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_data_source_set_next(
    	MemorySegment pDataSource,
    	MemorySegment pNextDataSource
    ) {
    	MethodHandle method = MA_DATA_SOURCE_SET_NEXT.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			pNextDataSource
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment ma_data_source_get_next(
    	MemorySegment pDataSource
    ) {
    	MethodHandle method = MA_DATA_SOURCE_GET_NEXT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pDataSource
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_data_source_set_next_callback(
    	MemorySegment pDataSource,
    	MemorySegment onGetNext
    ) {
    	MethodHandle method = MA_DATA_SOURCE_SET_NEXT_CALLBACK.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			onGetNext
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_source_set_next_callback].
    public static int ma_data_source_set_next_callback(
    	MemorySegment pDataSource,
    	MaDataSourceGetNextProc onGetNext
    ) {
    	return ma_data_source_set_next_callback(
    		pDataSource,
    		onGetNext.memorySegment()
    	);
    }
    
    public static MemorySegment nma_data_source_get_next_callback(
    	MemorySegment pDataSource
    ) {
    	MethodHandle method = MA_DATA_SOURCE_GET_NEXT_CALLBACK.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pDataSource
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_data_source_get_next_callback].
    public static @Nullable MaDataSourceGetNextProc ma_data_source_get_next_callback(
    	MemorySegment pDataSource
    ) {
    	MemorySegment segment = nma_data_source_get_next_callback(
    		pDataSource
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDataSourceGetNextProc.get(segment);
    }
    
    public static int ma_audio_buffer_ref_init(
    	int format,
    	int channels,
    	MemorySegment pData,
    	long sizeInFrames,
    	MemorySegment pAudioBufferRef
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_REF_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			format,
    			channels,
    			pData,
    			sizeInFrames,
    			pAudioBufferRef
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_ref_init].
    public static int ma_audio_buffer_ref_init(
    	int format,
    	int channels,
    	MemorySegment pData,
    	long sizeInFrames,
    	MaAudioBufferRef pAudioBufferRef
    ) {
    	return ma_audio_buffer_ref_init(
    		format,
    		channels,
    		pData,
    		sizeInFrames,
    		pAudioBufferRef.memorySegment()
    	);
    }
    
    public static void ma_audio_buffer_ref_uninit(
    	MemorySegment pAudioBufferRef
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_REF_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pAudioBufferRef
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_ref_uninit].
    public static void ma_audio_buffer_ref_uninit(
    	MaAudioBufferRef pAudioBufferRef
    ) {
    	ma_audio_buffer_ref_uninit(
    		pAudioBufferRef.memorySegment()
    	);
    }
    
    public static int ma_audio_buffer_ref_set_data(
    	MemorySegment pAudioBufferRef,
    	MemorySegment pData,
    	long sizeInFrames
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_REF_SET_DATA.get();
    	try {
    		return (int) method.invokeExact(
    			pAudioBufferRef,
    			pData,
    			sizeInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_ref_set_data].
    public static int ma_audio_buffer_ref_set_data(
    	MaAudioBufferRef pAudioBufferRef,
    	MemorySegment pData,
    	long sizeInFrames
    ) {
    	return ma_audio_buffer_ref_set_data(
    		pAudioBufferRef.memorySegment(),
    		pData,
    		sizeInFrames
    	);
    }
    
    public static long ma_audio_buffer_ref_read_pcm_frames(
    	MemorySegment pAudioBufferRef,
    	MemorySegment pFramesOut,
    	long frameCount,
    	int loop
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_REF_READ_PCM_FRAMES.get();
    	try {
    		return (long) method.invokeExact(
    			pAudioBufferRef,
    			pFramesOut,
    			frameCount,
    			loop
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_ref_read_pcm_frames].
    public static long ma_audio_buffer_ref_read_pcm_frames(
    	MaAudioBufferRef pAudioBufferRef,
    	MemorySegment pFramesOut,
    	long frameCount,
    	int loop
    ) {
    	return ma_audio_buffer_ref_read_pcm_frames(
    		pAudioBufferRef.memorySegment(),
    		pFramesOut,
    		frameCount,
    		loop
    	);
    }
    
    public static int ma_audio_buffer_ref_seek_to_pcm_frame(
    	MemorySegment pAudioBufferRef,
    	long frameIndex
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_REF_SEEK_TO_PCM_FRAME.get();
    	try {
    		return (int) method.invokeExact(
    			pAudioBufferRef,
    			frameIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_ref_seek_to_pcm_frame].
    public static int ma_audio_buffer_ref_seek_to_pcm_frame(
    	MaAudioBufferRef pAudioBufferRef,
    	long frameIndex
    ) {
    	return ma_audio_buffer_ref_seek_to_pcm_frame(
    		pAudioBufferRef.memorySegment(),
    		frameIndex
    	);
    }
    
    public static int ma_audio_buffer_ref_map(
    	MemorySegment pAudioBufferRef,
    	MemorySegment ppFramesOut,
    	MemorySegment pFrameCount
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_REF_MAP.get();
    	try {
    		return (int) method.invokeExact(
    			pAudioBufferRef,
    			ppFramesOut,
    			pFrameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_ref_map].
    public static int ma_audio_buffer_ref_map(
    	MaAudioBufferRef pAudioBufferRef,
    	NativePointerArray ppFramesOut,
    	NativeLongArray pFrameCount
    ) {
    	return ma_audio_buffer_ref_map(
    		pAudioBufferRef.memorySegment(),
    		ppFramesOut.memorySegment(),
    		pFrameCount.memorySegment()
    	);
    }
    
    public static int ma_audio_buffer_ref_unmap(
    	MemorySegment pAudioBufferRef,
    	long frameCount
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_REF_UNMAP.get();
    	try {
    		return (int) method.invokeExact(
    			pAudioBufferRef,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_ref_unmap].
    public static int ma_audio_buffer_ref_unmap(
    	MaAudioBufferRef pAudioBufferRef,
    	long frameCount
    ) {
    	return ma_audio_buffer_ref_unmap(
    		pAudioBufferRef.memorySegment(),
    		frameCount
    	);
    }
    
    public static int ma_audio_buffer_ref_at_end(
    	MemorySegment pAudioBufferRef
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_REF_AT_END.get();
    	try {
    		return (int) method.invokeExact(
    			pAudioBufferRef
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_ref_at_end].
    public static int ma_audio_buffer_ref_at_end(
    	MaAudioBufferRef pAudioBufferRef
    ) {
    	return ma_audio_buffer_ref_at_end(
    		pAudioBufferRef.memorySegment()
    	);
    }
    
    public static int ma_audio_buffer_ref_get_cursor_in_pcm_frames(
    	MemorySegment pAudioBufferRef,
    	MemorySegment pCursor
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_REF_GET_CURSOR_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pAudioBufferRef,
    			pCursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_ref_get_cursor_in_pcm_frames].
    public static int ma_audio_buffer_ref_get_cursor_in_pcm_frames(
    	MaAudioBufferRef pAudioBufferRef,
    	NativeLongArray pCursor
    ) {
    	return ma_audio_buffer_ref_get_cursor_in_pcm_frames(
    		pAudioBufferRef.memorySegment(),
    		pCursor.memorySegment()
    	);
    }
    
    public static int ma_audio_buffer_ref_get_length_in_pcm_frames(
    	MemorySegment pAudioBufferRef,
    	MemorySegment pLength
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_REF_GET_LENGTH_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pAudioBufferRef,
    			pLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_ref_get_length_in_pcm_frames].
    public static int ma_audio_buffer_ref_get_length_in_pcm_frames(
    	MaAudioBufferRef pAudioBufferRef,
    	NativeLongArray pLength
    ) {
    	return ma_audio_buffer_ref_get_length_in_pcm_frames(
    		pAudioBufferRef.memorySegment(),
    		pLength.memorySegment()
    	);
    }
    
    public static int ma_audio_buffer_ref_get_available_frames(
    	MemorySegment pAudioBufferRef,
    	MemorySegment pAvailableFrames
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_REF_GET_AVAILABLE_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pAudioBufferRef,
    			pAvailableFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_ref_get_available_frames].
    public static int ma_audio_buffer_ref_get_available_frames(
    	MaAudioBufferRef pAudioBufferRef,
    	NativeLongArray pAvailableFrames
    ) {
    	return ma_audio_buffer_ref_get_available_frames(
    		pAudioBufferRef.memorySegment(),
    		pAvailableFrames.memorySegment()
    	);
    }
    
    public static MemorySegment ma_audio_buffer_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	long sizeInFrames,
    	MemorySegment pData,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			sizeInFrames,
    			pData,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_config_init].
    public static @Nullable MaAudioBufferConfig ma_audio_buffer_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	long sizeInFrames,
    	MemorySegment pData,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	MemorySegment segment = ma_audio_buffer_config_init(
    		allocator,
    		format,
    		channels,
    		sizeInFrames,
    		pData,
    		pAllocationCallbacks.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaAudioBufferConfig(segment);
    }
    
    public static int ma_audio_buffer_init(
    	MemorySegment pConfig,
    	MemorySegment pAudioBuffer
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAudioBuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_init].
    public static int ma_audio_buffer_init(
    	MaAudioBufferConfig pConfig,
    	MaAudioBuffer pAudioBuffer
    ) {
    	return ma_audio_buffer_init(
    		pConfig.memorySegment(),
    		pAudioBuffer.memorySegment()
    	);
    }
    
    public static int ma_audio_buffer_init_copy(
    	MemorySegment pConfig,
    	MemorySegment pAudioBuffer
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_INIT_COPY.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAudioBuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_init_copy].
    public static int ma_audio_buffer_init_copy(
    	MaAudioBufferConfig pConfig,
    	MaAudioBuffer pAudioBuffer
    ) {
    	return ma_audio_buffer_init_copy(
    		pConfig.memorySegment(),
    		pAudioBuffer.memorySegment()
    	);
    }
    
    public static int ma_audio_buffer_alloc_and_init(
    	MemorySegment pConfig,
    	MemorySegment ppAudioBuffer
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_ALLOC_AND_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			ppAudioBuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_alloc_and_init].
    public static int ma_audio_buffer_alloc_and_init(
    	MaAudioBufferConfig pConfig,
    	NativePointerArray ppAudioBuffer
    ) {
    	return ma_audio_buffer_alloc_and_init(
    		pConfig.memorySegment(),
    		ppAudioBuffer.memorySegment()
    	);
    }
    
    public static void ma_audio_buffer_uninit(
    	MemorySegment pAudioBuffer
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pAudioBuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_uninit].
    public static void ma_audio_buffer_uninit(
    	MaAudioBuffer pAudioBuffer
    ) {
    	ma_audio_buffer_uninit(
    		pAudioBuffer.memorySegment()
    	);
    }
    
    public static void ma_audio_buffer_uninit_and_free(
    	MemorySegment pAudioBuffer
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_UNINIT_AND_FREE.get();
    	try {
    		 method.invokeExact(
    			pAudioBuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_uninit_and_free].
    public static void ma_audio_buffer_uninit_and_free(
    	MaAudioBuffer pAudioBuffer
    ) {
    	ma_audio_buffer_uninit_and_free(
    		pAudioBuffer.memorySegment()
    	);
    }
    
    public static long ma_audio_buffer_read_pcm_frames(
    	MemorySegment pAudioBuffer,
    	MemorySegment pFramesOut,
    	long frameCount,
    	int loop
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_READ_PCM_FRAMES.get();
    	try {
    		return (long) method.invokeExact(
    			pAudioBuffer,
    			pFramesOut,
    			frameCount,
    			loop
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_read_pcm_frames].
    public static long ma_audio_buffer_read_pcm_frames(
    	MaAudioBuffer pAudioBuffer,
    	MemorySegment pFramesOut,
    	long frameCount,
    	int loop
    ) {
    	return ma_audio_buffer_read_pcm_frames(
    		pAudioBuffer.memorySegment(),
    		pFramesOut,
    		frameCount,
    		loop
    	);
    }
    
    public static int ma_audio_buffer_seek_to_pcm_frame(
    	MemorySegment pAudioBuffer,
    	long frameIndex
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_SEEK_TO_PCM_FRAME.get();
    	try {
    		return (int) method.invokeExact(
    			pAudioBuffer,
    			frameIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_seek_to_pcm_frame].
    public static int ma_audio_buffer_seek_to_pcm_frame(
    	MaAudioBuffer pAudioBuffer,
    	long frameIndex
    ) {
    	return ma_audio_buffer_seek_to_pcm_frame(
    		pAudioBuffer.memorySegment(),
    		frameIndex
    	);
    }
    
    public static int ma_audio_buffer_map(
    	MemorySegment pAudioBuffer,
    	MemorySegment ppFramesOut,
    	MemorySegment pFrameCount
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_MAP.get();
    	try {
    		return (int) method.invokeExact(
    			pAudioBuffer,
    			ppFramesOut,
    			pFrameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_map].
    public static int ma_audio_buffer_map(
    	MaAudioBuffer pAudioBuffer,
    	NativePointerArray ppFramesOut,
    	NativeLongArray pFrameCount
    ) {
    	return ma_audio_buffer_map(
    		pAudioBuffer.memorySegment(),
    		ppFramesOut.memorySegment(),
    		pFrameCount.memorySegment()
    	);
    }
    
    public static int ma_audio_buffer_unmap(
    	MemorySegment pAudioBuffer,
    	long frameCount
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_UNMAP.get();
    	try {
    		return (int) method.invokeExact(
    			pAudioBuffer,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_unmap].
    public static int ma_audio_buffer_unmap(
    	MaAudioBuffer pAudioBuffer,
    	long frameCount
    ) {
    	return ma_audio_buffer_unmap(
    		pAudioBuffer.memorySegment(),
    		frameCount
    	);
    }
    
    public static int ma_audio_buffer_at_end(
    	MemorySegment pAudioBuffer
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_AT_END.get();
    	try {
    		return (int) method.invokeExact(
    			pAudioBuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_at_end].
    public static int ma_audio_buffer_at_end(
    	MaAudioBuffer pAudioBuffer
    ) {
    	return ma_audio_buffer_at_end(
    		pAudioBuffer.memorySegment()
    	);
    }
    
    public static int ma_audio_buffer_get_cursor_in_pcm_frames(
    	MemorySegment pAudioBuffer,
    	MemorySegment pCursor
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_GET_CURSOR_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pAudioBuffer,
    			pCursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_get_cursor_in_pcm_frames].
    public static int ma_audio_buffer_get_cursor_in_pcm_frames(
    	MaAudioBuffer pAudioBuffer,
    	NativeLongArray pCursor
    ) {
    	return ma_audio_buffer_get_cursor_in_pcm_frames(
    		pAudioBuffer.memorySegment(),
    		pCursor.memorySegment()
    	);
    }
    
    public static int ma_audio_buffer_get_length_in_pcm_frames(
    	MemorySegment pAudioBuffer,
    	MemorySegment pLength
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_GET_LENGTH_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pAudioBuffer,
    			pLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_get_length_in_pcm_frames].
    public static int ma_audio_buffer_get_length_in_pcm_frames(
    	MaAudioBuffer pAudioBuffer,
    	NativeLongArray pLength
    ) {
    	return ma_audio_buffer_get_length_in_pcm_frames(
    		pAudioBuffer.memorySegment(),
    		pLength.memorySegment()
    	);
    }
    
    public static int ma_audio_buffer_get_available_frames(
    	MemorySegment pAudioBuffer,
    	MemorySegment pAvailableFrames
    ) {
    	MethodHandle method = MA_AUDIO_BUFFER_GET_AVAILABLE_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pAudioBuffer,
    			pAvailableFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_audio_buffer_get_available_frames].
    public static int ma_audio_buffer_get_available_frames(
    	MaAudioBuffer pAudioBuffer,
    	NativeLongArray pAvailableFrames
    ) {
    	return ma_audio_buffer_get_available_frames(
    		pAudioBuffer.memorySegment(),
    		pAvailableFrames.memorySegment()
    	);
    }
    
    public static int ma_paged_audio_buffer_data_init(
    	int format,
    	int channels,
    	MemorySegment pData
    ) {
    	MethodHandle method = MA_PAGED_AUDIO_BUFFER_DATA_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			format,
    			channels,
    			pData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_paged_audio_buffer_data_init].
    public static int ma_paged_audio_buffer_data_init(
    	int format,
    	int channels,
    	MaPagedAudioBufferData pData
    ) {
    	return ma_paged_audio_buffer_data_init(
    		format,
    		channels,
    		pData.memorySegment()
    	);
    }
    
    public static void ma_paged_audio_buffer_data_uninit(
    	MemorySegment pData,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_PAGED_AUDIO_BUFFER_DATA_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pData,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_paged_audio_buffer_data_uninit].
    public static void ma_paged_audio_buffer_data_uninit(
    	MaPagedAudioBufferData pData,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_paged_audio_buffer_data_uninit(
    		pData.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static MemorySegment ma_paged_audio_buffer_data_get_head(
    	MemorySegment pData
    ) {
    	MethodHandle method = MA_PAGED_AUDIO_BUFFER_DATA_GET_HEAD.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_paged_audio_buffer_data_get_head].
    public static @Nullable MaPagedAudioBufferPage ma_paged_audio_buffer_data_get_head(
    	MaPagedAudioBufferData pData
    ) {
    	MemorySegment segment = ma_paged_audio_buffer_data_get_head(
    		pData.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaPagedAudioBufferPage(segment);
    }
    
    public static MemorySegment ma_paged_audio_buffer_data_get_tail(
    	MemorySegment pData
    ) {
    	MethodHandle method = MA_PAGED_AUDIO_BUFFER_DATA_GET_TAIL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_paged_audio_buffer_data_get_tail].
    public static @Nullable MaPagedAudioBufferPage ma_paged_audio_buffer_data_get_tail(
    	MaPagedAudioBufferData pData
    ) {
    	MemorySegment segment = ma_paged_audio_buffer_data_get_tail(
    		pData.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaPagedAudioBufferPage(segment);
    }
    
    public static int ma_paged_audio_buffer_data_get_length_in_pcm_frames(
    	MemorySegment pData,
    	MemorySegment pLength
    ) {
    	MethodHandle method = MA_PAGED_AUDIO_BUFFER_DATA_GET_LENGTH_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pData,
    			pLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_paged_audio_buffer_data_get_length_in_pcm_frames].
    public static int ma_paged_audio_buffer_data_get_length_in_pcm_frames(
    	MaPagedAudioBufferData pData,
    	NativeLongArray pLength
    ) {
    	return ma_paged_audio_buffer_data_get_length_in_pcm_frames(
    		pData.memorySegment(),
    		pLength.memorySegment()
    	);
    }
    
    public static int ma_paged_audio_buffer_data_allocate_page(
    	MemorySegment pData,
    	long pageSizeInFrames,
    	MemorySegment pInitialData,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment ppPage
    ) {
    	MethodHandle method = MA_PAGED_AUDIO_BUFFER_DATA_ALLOCATE_PAGE.get();
    	try {
    		return (int) method.invokeExact(
    			pData,
    			pageSizeInFrames,
    			pInitialData,
    			pAllocationCallbacks,
    			ppPage
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_paged_audio_buffer_data_allocate_page].
    public static int ma_paged_audio_buffer_data_allocate_page(
    	MaPagedAudioBufferData pData,
    	long pageSizeInFrames,
    	MemorySegment pInitialData,
    	MaAllocationCallbacks pAllocationCallbacks,
    	NativePointerArray ppPage
    ) {
    	return ma_paged_audio_buffer_data_allocate_page(
    		pData.memorySegment(),
    		pageSizeInFrames,
    		pInitialData,
    		pAllocationCallbacks.memorySegment(),
    		ppPage.memorySegment()
    	);
    }
    
    public static int ma_paged_audio_buffer_data_free_page(
    	MemorySegment pData,
    	MemorySegment pPage,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_PAGED_AUDIO_BUFFER_DATA_FREE_PAGE.get();
    	try {
    		return (int) method.invokeExact(
    			pData,
    			pPage,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_paged_audio_buffer_data_free_page].
    public static int ma_paged_audio_buffer_data_free_page(
    	MaPagedAudioBufferData pData,
    	MaPagedAudioBufferPage pPage,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	return ma_paged_audio_buffer_data_free_page(
    		pData.memorySegment(),
    		pPage.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_paged_audio_buffer_data_append_page(
    	MemorySegment pData,
    	MemorySegment pPage
    ) {
    	MethodHandle method = MA_PAGED_AUDIO_BUFFER_DATA_APPEND_PAGE.get();
    	try {
    		return (int) method.invokeExact(
    			pData,
    			pPage
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_paged_audio_buffer_data_append_page].
    public static int ma_paged_audio_buffer_data_append_page(
    	MaPagedAudioBufferData pData,
    	MaPagedAudioBufferPage pPage
    ) {
    	return ma_paged_audio_buffer_data_append_page(
    		pData.memorySegment(),
    		pPage.memorySegment()
    	);
    }
    
    public static int ma_paged_audio_buffer_data_allocate_and_append_page(
    	MemorySegment pData,
    	int pageSizeInFrames,
    	MemorySegment pInitialData,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_PAGED_AUDIO_BUFFER_DATA_ALLOCATE_AND_APPEND_PAGE.get();
    	try {
    		return (int) method.invokeExact(
    			pData,
    			pageSizeInFrames,
    			pInitialData,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_paged_audio_buffer_data_allocate_and_append_page].
    public static int ma_paged_audio_buffer_data_allocate_and_append_page(
    	MaPagedAudioBufferData pData,
    	int pageSizeInFrames,
    	MemorySegment pInitialData,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	return ma_paged_audio_buffer_data_allocate_and_append_page(
    		pData.memorySegment(),
    		pageSizeInFrames,
    		pInitialData,
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static MemorySegment ma_paged_audio_buffer_config_init(
    	SegmentAllocator allocator,
    	MemorySegment pData
    ) {
    	MethodHandle method = MA_PAGED_AUDIO_BUFFER_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_paged_audio_buffer_config_init].
    public static @Nullable MaPagedAudioBufferConfig ma_paged_audio_buffer_config_init(
    	SegmentAllocator allocator,
    	MaPagedAudioBufferData pData
    ) {
    	MemorySegment segment = ma_paged_audio_buffer_config_init(
    		allocator,
    		pData.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaPagedAudioBufferConfig(segment);
    }
    
    public static int ma_paged_audio_buffer_init(
    	MemorySegment pConfig,
    	MemorySegment pPagedAudioBuffer
    ) {
    	MethodHandle method = MA_PAGED_AUDIO_BUFFER_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pPagedAudioBuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_paged_audio_buffer_init].
    public static int ma_paged_audio_buffer_init(
    	MaPagedAudioBufferConfig pConfig,
    	MaPagedAudioBuffer pPagedAudioBuffer
    ) {
    	return ma_paged_audio_buffer_init(
    		pConfig.memorySegment(),
    		pPagedAudioBuffer.memorySegment()
    	);
    }
    
    public static void ma_paged_audio_buffer_uninit(
    	MemorySegment pPagedAudioBuffer
    ) {
    	MethodHandle method = MA_PAGED_AUDIO_BUFFER_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pPagedAudioBuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_paged_audio_buffer_uninit].
    public static void ma_paged_audio_buffer_uninit(
    	MaPagedAudioBuffer pPagedAudioBuffer
    ) {
    	ma_paged_audio_buffer_uninit(
    		pPagedAudioBuffer.memorySegment()
    	);
    }
    
    public static int ma_paged_audio_buffer_read_pcm_frames(
    	MemorySegment pPagedAudioBuffer,
    	MemorySegment pFramesOut,
    	long frameCount,
    	MemorySegment pFramesRead
    ) {
    	MethodHandle method = MA_PAGED_AUDIO_BUFFER_READ_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pPagedAudioBuffer,
    			pFramesOut,
    			frameCount,
    			pFramesRead
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_paged_audio_buffer_read_pcm_frames].
    public static int ma_paged_audio_buffer_read_pcm_frames(
    	MaPagedAudioBuffer pPagedAudioBuffer,
    	MemorySegment pFramesOut,
    	long frameCount,
    	NativeLongArray pFramesRead
    ) {
    	return ma_paged_audio_buffer_read_pcm_frames(
    		pPagedAudioBuffer.memorySegment(),
    		pFramesOut,
    		frameCount,
    		pFramesRead.memorySegment()
    	);
    }
    
    public static int ma_paged_audio_buffer_seek_to_pcm_frame(
    	MemorySegment pPagedAudioBuffer,
    	long frameIndex
    ) {
    	MethodHandle method = MA_PAGED_AUDIO_BUFFER_SEEK_TO_PCM_FRAME.get();
    	try {
    		return (int) method.invokeExact(
    			pPagedAudioBuffer,
    			frameIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_paged_audio_buffer_seek_to_pcm_frame].
    public static int ma_paged_audio_buffer_seek_to_pcm_frame(
    	MaPagedAudioBuffer pPagedAudioBuffer,
    	long frameIndex
    ) {
    	return ma_paged_audio_buffer_seek_to_pcm_frame(
    		pPagedAudioBuffer.memorySegment(),
    		frameIndex
    	);
    }
    
    public static int ma_paged_audio_buffer_get_cursor_in_pcm_frames(
    	MemorySegment pPagedAudioBuffer,
    	MemorySegment pCursor
    ) {
    	MethodHandle method = MA_PAGED_AUDIO_BUFFER_GET_CURSOR_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pPagedAudioBuffer,
    			pCursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_paged_audio_buffer_get_cursor_in_pcm_frames].
    public static int ma_paged_audio_buffer_get_cursor_in_pcm_frames(
    	MaPagedAudioBuffer pPagedAudioBuffer,
    	NativeLongArray pCursor
    ) {
    	return ma_paged_audio_buffer_get_cursor_in_pcm_frames(
    		pPagedAudioBuffer.memorySegment(),
    		pCursor.memorySegment()
    	);
    }
    
    public static int ma_paged_audio_buffer_get_length_in_pcm_frames(
    	MemorySegment pPagedAudioBuffer,
    	MemorySegment pLength
    ) {
    	MethodHandle method = MA_PAGED_AUDIO_BUFFER_GET_LENGTH_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pPagedAudioBuffer,
    			pLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_paged_audio_buffer_get_length_in_pcm_frames].
    public static int ma_paged_audio_buffer_get_length_in_pcm_frames(
    	MaPagedAudioBuffer pPagedAudioBuffer,
    	NativeLongArray pLength
    ) {
    	return ma_paged_audio_buffer_get_length_in_pcm_frames(
    		pPagedAudioBuffer.memorySegment(),
    		pLength.memorySegment()
    	);
    }
    
    public static int ma_rb_init_ex(
    	long subbufferSizeInBytes,
    	long subbufferCount,
    	long subbufferStrideInBytes,
    	MemorySegment pOptionalPreallocatedBuffer,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_RB_INIT_EX.get();
    	try {
    		return (int) method.invokeExact(
    			subbufferSizeInBytes,
    			subbufferCount,
    			subbufferStrideInBytes,
    			pOptionalPreallocatedBuffer,
    			pAllocationCallbacks,
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_rb_init_ex].
    public static int ma_rb_init_ex(
    	long subbufferSizeInBytes,
    	long subbufferCount,
    	long subbufferStrideInBytes,
    	MemorySegment pOptionalPreallocatedBuffer,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaRb pRB
    ) {
    	return ma_rb_init_ex(
    		subbufferSizeInBytes,
    		subbufferCount,
    		subbufferStrideInBytes,
    		pOptionalPreallocatedBuffer,
    		pAllocationCallbacks.memorySegment(),
    		pRB.memorySegment()
    	);
    }
    
    public static int ma_rb_init(
    	long bufferSizeInBytes,
    	MemorySegment pOptionalPreallocatedBuffer,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_RB_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			bufferSizeInBytes,
    			pOptionalPreallocatedBuffer,
    			pAllocationCallbacks,
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_rb_init].
    public static int ma_rb_init(
    	long bufferSizeInBytes,
    	MemorySegment pOptionalPreallocatedBuffer,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaRb pRB
    ) {
    	return ma_rb_init(
    		bufferSizeInBytes,
    		pOptionalPreallocatedBuffer,
    		pAllocationCallbacks.memorySegment(),
    		pRB.memorySegment()
    	);
    }
    
    public static void ma_rb_uninit(
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_RB_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_rb_uninit].
    public static void ma_rb_uninit(
    	MaRb pRB
    ) {
    	ma_rb_uninit(
    		pRB.memorySegment()
    	);
    }
    
    public static void ma_rb_reset(
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_RB_RESET.get();
    	try {
    		 method.invokeExact(
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_rb_reset].
    public static void ma_rb_reset(
    	MaRb pRB
    ) {
    	ma_rb_reset(
    		pRB.memorySegment()
    	);
    }
    
    public static int ma_rb_acquire_read(
    	MemorySegment pRB,
    	MemorySegment pSizeInBytes,
    	MemorySegment ppBufferOut
    ) {
    	MethodHandle method = MA_RB_ACQUIRE_READ.get();
    	try {
    		return (int) method.invokeExact(
    			pRB,
    			pSizeInBytes,
    			ppBufferOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_rb_acquire_read].
    public static int ma_rb_acquire_read(
    	MaRb pRB,
    	NativeLongArray pSizeInBytes,
    	NativePointerArray ppBufferOut
    ) {
    	return ma_rb_acquire_read(
    		pRB.memorySegment(),
    		pSizeInBytes.memorySegment(),
    		ppBufferOut.memorySegment()
    	);
    }
    
    public static int ma_rb_commit_read(
    	MemorySegment pRB,
    	long sizeInBytes
    ) {
    	MethodHandle method = MA_RB_COMMIT_READ.get();
    	try {
    		return (int) method.invokeExact(
    			pRB,
    			sizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_rb_commit_read].
    public static int ma_rb_commit_read(
    	MaRb pRB,
    	long sizeInBytes
    ) {
    	return ma_rb_commit_read(
    		pRB.memorySegment(),
    		sizeInBytes
    	);
    }
    
    public static int ma_rb_acquire_write(
    	MemorySegment pRB,
    	MemorySegment pSizeInBytes,
    	MemorySegment ppBufferOut
    ) {
    	MethodHandle method = MA_RB_ACQUIRE_WRITE.get();
    	try {
    		return (int) method.invokeExact(
    			pRB,
    			pSizeInBytes,
    			ppBufferOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_rb_acquire_write].
    public static int ma_rb_acquire_write(
    	MaRb pRB,
    	NativeLongArray pSizeInBytes,
    	NativePointerArray ppBufferOut
    ) {
    	return ma_rb_acquire_write(
    		pRB.memorySegment(),
    		pSizeInBytes.memorySegment(),
    		ppBufferOut.memorySegment()
    	);
    }
    
    public static int ma_rb_commit_write(
    	MemorySegment pRB,
    	long sizeInBytes
    ) {
    	MethodHandle method = MA_RB_COMMIT_WRITE.get();
    	try {
    		return (int) method.invokeExact(
    			pRB,
    			sizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_rb_commit_write].
    public static int ma_rb_commit_write(
    	MaRb pRB,
    	long sizeInBytes
    ) {
    	return ma_rb_commit_write(
    		pRB.memorySegment(),
    		sizeInBytes
    	);
    }
    
    public static int ma_rb_seek_read(
    	MemorySegment pRB,
    	long offsetInBytes
    ) {
    	MethodHandle method = MA_RB_SEEK_READ.get();
    	try {
    		return (int) method.invokeExact(
    			pRB,
    			offsetInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_rb_seek_read].
    public static int ma_rb_seek_read(
    	MaRb pRB,
    	long offsetInBytes
    ) {
    	return ma_rb_seek_read(
    		pRB.memorySegment(),
    		offsetInBytes
    	);
    }
    
    public static int ma_rb_seek_write(
    	MemorySegment pRB,
    	long offsetInBytes
    ) {
    	MethodHandle method = MA_RB_SEEK_WRITE.get();
    	try {
    		return (int) method.invokeExact(
    			pRB,
    			offsetInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_rb_seek_write].
    public static int ma_rb_seek_write(
    	MaRb pRB,
    	long offsetInBytes
    ) {
    	return ma_rb_seek_write(
    		pRB.memorySegment(),
    		offsetInBytes
    	);
    }
    
    public static int ma_rb_pointer_distance(
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_RB_POINTER_DISTANCE.get();
    	try {
    		return (int) method.invokeExact(
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_rb_pointer_distance].
    public static int ma_rb_pointer_distance(
    	MaRb pRB
    ) {
    	return ma_rb_pointer_distance(
    		pRB.memorySegment()
    	);
    }
    
    public static int ma_rb_available_read(
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_RB_AVAILABLE_READ.get();
    	try {
    		return (int) method.invokeExact(
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_rb_available_read].
    public static int ma_rb_available_read(
    	MaRb pRB
    ) {
    	return ma_rb_available_read(
    		pRB.memorySegment()
    	);
    }
    
    public static int ma_rb_available_write(
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_RB_AVAILABLE_WRITE.get();
    	try {
    		return (int) method.invokeExact(
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_rb_available_write].
    public static int ma_rb_available_write(
    	MaRb pRB
    ) {
    	return ma_rb_available_write(
    		pRB.memorySegment()
    	);
    }
    
    public static long ma_rb_get_subbuffer_size(
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_RB_GET_SUBBUFFER_SIZE.get();
    	try {
    		return (long) method.invokeExact(
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_rb_get_subbuffer_size].
    public static long ma_rb_get_subbuffer_size(
    	MaRb pRB
    ) {
    	return ma_rb_get_subbuffer_size(
    		pRB.memorySegment()
    	);
    }
    
    public static long ma_rb_get_subbuffer_stride(
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_RB_GET_SUBBUFFER_STRIDE.get();
    	try {
    		return (long) method.invokeExact(
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_rb_get_subbuffer_stride].
    public static long ma_rb_get_subbuffer_stride(
    	MaRb pRB
    ) {
    	return ma_rb_get_subbuffer_stride(
    		pRB.memorySegment()
    	);
    }
    
    public static long ma_rb_get_subbuffer_offset(
    	MemorySegment pRB,
    	long subbufferIndex
    ) {
    	MethodHandle method = MA_RB_GET_SUBBUFFER_OFFSET.get();
    	try {
    		return (long) method.invokeExact(
    			pRB,
    			subbufferIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_rb_get_subbuffer_offset].
    public static long ma_rb_get_subbuffer_offset(
    	MaRb pRB,
    	long subbufferIndex
    ) {
    	return ma_rb_get_subbuffer_offset(
    		pRB.memorySegment(),
    		subbufferIndex
    	);
    }
    
    public static MemorySegment ma_rb_get_subbuffer_ptr(
    	MemorySegment pRB,
    	long subbufferIndex,
    	MemorySegment pBuffer
    ) {
    	MethodHandle method = MA_RB_GET_SUBBUFFER_PTR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pRB,
    			subbufferIndex,
    			pBuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_rb_get_subbuffer_ptr].
    public static @Nullable MemorySegment ma_rb_get_subbuffer_ptr(
    	MaRb pRB,
    	long subbufferIndex,
    	MemorySegment pBuffer
    ) {
    	MemorySegment segment = ma_rb_get_subbuffer_ptr(
    		pRB.memorySegment(),
    		subbufferIndex,
    		pBuffer
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static int ma_pcm_rb_init_ex(
    	int format,
    	int channels,
    	int subbufferSizeInFrames,
    	int subbufferCount,
    	int subbufferStrideInFrames,
    	MemorySegment pOptionalPreallocatedBuffer,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_PCM_RB_INIT_EX.get();
    	try {
    		return (int) method.invokeExact(
    			format,
    			channels,
    			subbufferSizeInFrames,
    			subbufferCount,
    			subbufferStrideInFrames,
    			pOptionalPreallocatedBuffer,
    			pAllocationCallbacks,
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_init_ex].
    public static int ma_pcm_rb_init_ex(
    	int format,
    	int channels,
    	int subbufferSizeInFrames,
    	int subbufferCount,
    	int subbufferStrideInFrames,
    	MemorySegment pOptionalPreallocatedBuffer,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaPcmRb pRB
    ) {
    	return ma_pcm_rb_init_ex(
    		format,
    		channels,
    		subbufferSizeInFrames,
    		subbufferCount,
    		subbufferStrideInFrames,
    		pOptionalPreallocatedBuffer,
    		pAllocationCallbacks.memorySegment(),
    		pRB.memorySegment()
    	);
    }
    
    public static int ma_pcm_rb_init(
    	int format,
    	int channels,
    	int bufferSizeInFrames,
    	MemorySegment pOptionalPreallocatedBuffer,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_PCM_RB_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			format,
    			channels,
    			bufferSizeInFrames,
    			pOptionalPreallocatedBuffer,
    			pAllocationCallbacks,
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_init].
    public static int ma_pcm_rb_init(
    	int format,
    	int channels,
    	int bufferSizeInFrames,
    	MemorySegment pOptionalPreallocatedBuffer,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaPcmRb pRB
    ) {
    	return ma_pcm_rb_init(
    		format,
    		channels,
    		bufferSizeInFrames,
    		pOptionalPreallocatedBuffer,
    		pAllocationCallbacks.memorySegment(),
    		pRB.memorySegment()
    	);
    }
    
    public static void ma_pcm_rb_uninit(
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_PCM_RB_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_uninit].
    public static void ma_pcm_rb_uninit(
    	MaPcmRb pRB
    ) {
    	ma_pcm_rb_uninit(
    		pRB.memorySegment()
    	);
    }
    
    public static void ma_pcm_rb_reset(
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_PCM_RB_RESET.get();
    	try {
    		 method.invokeExact(
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_reset].
    public static void ma_pcm_rb_reset(
    	MaPcmRb pRB
    ) {
    	ma_pcm_rb_reset(
    		pRB.memorySegment()
    	);
    }
    
    public static int ma_pcm_rb_acquire_read(
    	MemorySegment pRB,
    	MemorySegment pSizeInFrames,
    	MemorySegment ppBufferOut
    ) {
    	MethodHandle method = MA_PCM_RB_ACQUIRE_READ.get();
    	try {
    		return (int) method.invokeExact(
    			pRB,
    			pSizeInFrames,
    			ppBufferOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_acquire_read].
    public static int ma_pcm_rb_acquire_read(
    	MaPcmRb pRB,
    	NativeIntArray pSizeInFrames,
    	NativePointerArray ppBufferOut
    ) {
    	return ma_pcm_rb_acquire_read(
    		pRB.memorySegment(),
    		pSizeInFrames.memorySegment(),
    		ppBufferOut.memorySegment()
    	);
    }
    
    public static int ma_pcm_rb_commit_read(
    	MemorySegment pRB,
    	int sizeInFrames
    ) {
    	MethodHandle method = MA_PCM_RB_COMMIT_READ.get();
    	try {
    		return (int) method.invokeExact(
    			pRB,
    			sizeInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_commit_read].
    public static int ma_pcm_rb_commit_read(
    	MaPcmRb pRB,
    	int sizeInFrames
    ) {
    	return ma_pcm_rb_commit_read(
    		pRB.memorySegment(),
    		sizeInFrames
    	);
    }
    
    public static int ma_pcm_rb_acquire_write(
    	MemorySegment pRB,
    	MemorySegment pSizeInFrames,
    	MemorySegment ppBufferOut
    ) {
    	MethodHandle method = MA_PCM_RB_ACQUIRE_WRITE.get();
    	try {
    		return (int) method.invokeExact(
    			pRB,
    			pSizeInFrames,
    			ppBufferOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_acquire_write].
    public static int ma_pcm_rb_acquire_write(
    	MaPcmRb pRB,
    	NativeIntArray pSizeInFrames,
    	NativePointerArray ppBufferOut
    ) {
    	return ma_pcm_rb_acquire_write(
    		pRB.memorySegment(),
    		pSizeInFrames.memorySegment(),
    		ppBufferOut.memorySegment()
    	);
    }
    
    public static int ma_pcm_rb_commit_write(
    	MemorySegment pRB,
    	int sizeInFrames
    ) {
    	MethodHandle method = MA_PCM_RB_COMMIT_WRITE.get();
    	try {
    		return (int) method.invokeExact(
    			pRB,
    			sizeInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_commit_write].
    public static int ma_pcm_rb_commit_write(
    	MaPcmRb pRB,
    	int sizeInFrames
    ) {
    	return ma_pcm_rb_commit_write(
    		pRB.memorySegment(),
    		sizeInFrames
    	);
    }
    
    public static int ma_pcm_rb_seek_read(
    	MemorySegment pRB,
    	int offsetInFrames
    ) {
    	MethodHandle method = MA_PCM_RB_SEEK_READ.get();
    	try {
    		return (int) method.invokeExact(
    			pRB,
    			offsetInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_seek_read].
    public static int ma_pcm_rb_seek_read(
    	MaPcmRb pRB,
    	int offsetInFrames
    ) {
    	return ma_pcm_rb_seek_read(
    		pRB.memorySegment(),
    		offsetInFrames
    	);
    }
    
    public static int ma_pcm_rb_seek_write(
    	MemorySegment pRB,
    	int offsetInFrames
    ) {
    	MethodHandle method = MA_PCM_RB_SEEK_WRITE.get();
    	try {
    		return (int) method.invokeExact(
    			pRB,
    			offsetInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_seek_write].
    public static int ma_pcm_rb_seek_write(
    	MaPcmRb pRB,
    	int offsetInFrames
    ) {
    	return ma_pcm_rb_seek_write(
    		pRB.memorySegment(),
    		offsetInFrames
    	);
    }
    
    public static int ma_pcm_rb_pointer_distance(
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_PCM_RB_POINTER_DISTANCE.get();
    	try {
    		return (int) method.invokeExact(
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_pointer_distance].
    public static int ma_pcm_rb_pointer_distance(
    	MaPcmRb pRB
    ) {
    	return ma_pcm_rb_pointer_distance(
    		pRB.memorySegment()
    	);
    }
    
    public static int ma_pcm_rb_available_read(
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_PCM_RB_AVAILABLE_READ.get();
    	try {
    		return (int) method.invokeExact(
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_available_read].
    public static int ma_pcm_rb_available_read(
    	MaPcmRb pRB
    ) {
    	return ma_pcm_rb_available_read(
    		pRB.memorySegment()
    	);
    }
    
    public static int ma_pcm_rb_available_write(
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_PCM_RB_AVAILABLE_WRITE.get();
    	try {
    		return (int) method.invokeExact(
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_available_write].
    public static int ma_pcm_rb_available_write(
    	MaPcmRb pRB
    ) {
    	return ma_pcm_rb_available_write(
    		pRB.memorySegment()
    	);
    }
    
    public static int ma_pcm_rb_get_subbuffer_size(
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_PCM_RB_GET_SUBBUFFER_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_get_subbuffer_size].
    public static int ma_pcm_rb_get_subbuffer_size(
    	MaPcmRb pRB
    ) {
    	return ma_pcm_rb_get_subbuffer_size(
    		pRB.memorySegment()
    	);
    }
    
    public static int ma_pcm_rb_get_subbuffer_stride(
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_PCM_RB_GET_SUBBUFFER_STRIDE.get();
    	try {
    		return (int) method.invokeExact(
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_get_subbuffer_stride].
    public static int ma_pcm_rb_get_subbuffer_stride(
    	MaPcmRb pRB
    ) {
    	return ma_pcm_rb_get_subbuffer_stride(
    		pRB.memorySegment()
    	);
    }
    
    public static int ma_pcm_rb_get_subbuffer_offset(
    	MemorySegment pRB,
    	int subbufferIndex
    ) {
    	MethodHandle method = MA_PCM_RB_GET_SUBBUFFER_OFFSET.get();
    	try {
    		return (int) method.invokeExact(
    			pRB,
    			subbufferIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_get_subbuffer_offset].
    public static int ma_pcm_rb_get_subbuffer_offset(
    	MaPcmRb pRB,
    	int subbufferIndex
    ) {
    	return ma_pcm_rb_get_subbuffer_offset(
    		pRB.memorySegment(),
    		subbufferIndex
    	);
    }
    
    public static MemorySegment ma_pcm_rb_get_subbuffer_ptr(
    	MemorySegment pRB,
    	int subbufferIndex,
    	MemorySegment pBuffer
    ) {
    	MethodHandle method = MA_PCM_RB_GET_SUBBUFFER_PTR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pRB,
    			subbufferIndex,
    			pBuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_get_subbuffer_ptr].
    public static @Nullable MemorySegment ma_pcm_rb_get_subbuffer_ptr(
    	MaPcmRb pRB,
    	int subbufferIndex,
    	MemorySegment pBuffer
    ) {
    	MemorySegment segment = ma_pcm_rb_get_subbuffer_ptr(
    		pRB.memorySegment(),
    		subbufferIndex,
    		pBuffer
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static int ma_pcm_rb_get_format(
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_PCM_RB_GET_FORMAT.get();
    	try {
    		return (int) method.invokeExact(
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_get_format].
    public static int ma_pcm_rb_get_format(
    	MaPcmRb pRB
    ) {
    	return ma_pcm_rb_get_format(
    		pRB.memorySegment()
    	);
    }
    
    public static int ma_pcm_rb_get_channels(
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_PCM_RB_GET_CHANNELS.get();
    	try {
    		return (int) method.invokeExact(
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_get_channels].
    public static int ma_pcm_rb_get_channels(
    	MaPcmRb pRB
    ) {
    	return ma_pcm_rb_get_channels(
    		pRB.memorySegment()
    	);
    }
    
    public static int ma_pcm_rb_get_sample_rate(
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_PCM_RB_GET_SAMPLE_RATE.get();
    	try {
    		return (int) method.invokeExact(
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_get_sample_rate].
    public static int ma_pcm_rb_get_sample_rate(
    	MaPcmRb pRB
    ) {
    	return ma_pcm_rb_get_sample_rate(
    		pRB.memorySegment()
    	);
    }
    
    public static void ma_pcm_rb_set_sample_rate(
    	MemorySegment pRB,
    	int sampleRate
    ) {
    	MethodHandle method = MA_PCM_RB_SET_SAMPLE_RATE.get();
    	try {
    		 method.invokeExact(
    			pRB,
    			sampleRate
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pcm_rb_set_sample_rate].
    public static void ma_pcm_rb_set_sample_rate(
    	MaPcmRb pRB,
    	int sampleRate
    ) {
    	ma_pcm_rb_set_sample_rate(
    		pRB.memorySegment(),
    		sampleRate
    	);
    }
    
    public static int ma_duplex_rb_init(
    	int captureFormat,
    	int captureChannels,
    	int sampleRate,
    	int captureInternalSampleRate,
    	int captureInternalPeriodSizeInFrames,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_DUPLEX_RB_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			captureFormat,
    			captureChannels,
    			sampleRate,
    			captureInternalSampleRate,
    			captureInternalPeriodSizeInFrames,
    			pAllocationCallbacks,
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_duplex_rb_init].
    public static int ma_duplex_rb_init(
    	int captureFormat,
    	int captureChannels,
    	int sampleRate,
    	int captureInternalSampleRate,
    	int captureInternalPeriodSizeInFrames,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaDuplexRb pRB
    ) {
    	return ma_duplex_rb_init(
    		captureFormat,
    		captureChannels,
    		sampleRate,
    		captureInternalSampleRate,
    		captureInternalPeriodSizeInFrames,
    		pAllocationCallbacks.memorySegment(),
    		pRB.memorySegment()
    	);
    }
    
    public static int ma_duplex_rb_uninit(
    	MemorySegment pRB
    ) {
    	MethodHandle method = MA_DUPLEX_RB_UNINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pRB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_duplex_rb_uninit].
    public static int ma_duplex_rb_uninit(
    	MaDuplexRb pRB
    ) {
    	return ma_duplex_rb_uninit(
    		pRB.memorySegment()
    	);
    }
    
    /// ```
    /// *********************************************************************************************************************************************************
    /// 
    /// Miscellaneous Helpers
    /// 
    /// **********************************************************************************************************************************************************
    /// ```
    public static MemorySegment nma_result_description(
    	int result
    ) {
    	MethodHandle method = MA_RESULT_DESCRIPTION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			result
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_result_description].
    public static @Nullable String ma_result_description(
    	int result
    ) {
    	MemorySegment segment = nma_result_description(
    		result
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    public static MemorySegment ma_malloc(
    	long sz,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_MALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			sz,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_malloc].
    public static @Nullable MemorySegment ma_malloc(
    	long sz,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	MemorySegment segment = ma_malloc(
    		sz,
    		pAllocationCallbacks.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment ma_calloc(
    	long sz,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_CALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			sz,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_calloc].
    public static @Nullable MemorySegment ma_calloc(
    	long sz,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	MemorySegment segment = ma_calloc(
    		sz,
    		pAllocationCallbacks.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment ma_realloc(
    	MemorySegment p,
    	long sz,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_REALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			sz,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_realloc].
    public static @Nullable MemorySegment ma_realloc(
    	MemorySegment p,
    	long sz,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	MemorySegment segment = ma_realloc(
    		p,
    		sz,
    		pAllocationCallbacks.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static void ma_free(
    	MemorySegment p,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_FREE.get();
    	try {
    		 method.invokeExact(
    			p,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_free].
    public static void ma_free(
    	MemorySegment p,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_free(
    		p,
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static MemorySegment ma_aligned_malloc(
    	long sz,
    	long alignment,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_ALIGNED_MALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			sz,
    			alignment,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_aligned_malloc].
    public static @Nullable MemorySegment ma_aligned_malloc(
    	long sz,
    	long alignment,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	MemorySegment segment = ma_aligned_malloc(
    		sz,
    		alignment,
    		pAllocationCallbacks.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static void ma_aligned_free(
    	MemorySegment p,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_ALIGNED_FREE.get();
    	try {
    		 method.invokeExact(
    			p,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_aligned_free].
    public static void ma_aligned_free(
    	MemorySegment p,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_aligned_free(
    		p,
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static MemorySegment nma_get_format_name(
    	int format
    ) {
    	MethodHandle method = MA_GET_FORMAT_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			format
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_get_format_name].
    public static @Nullable String ma_get_format_name(
    	int format
    ) {
    	MemorySegment segment = nma_get_format_name(
    		format
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    public static void ma_blend_f32(
    	MemorySegment pOut,
    	MemorySegment pInA,
    	MemorySegment pInB,
    	float factor,
    	int channels
    ) {
    	MethodHandle method = MA_BLEND_F32.get();
    	try {
    		 method.invokeExact(
    			pOut,
    			pInA,
    			pInB,
    			factor,
    			channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_blend_f32].
    public static void ma_blend_f32(
    	NativeFloatArray pOut,
    	NativeFloatArray pInA,
    	NativeFloatArray pInB,
    	float factor,
    	int channels
    ) {
    	ma_blend_f32(
    		pOut.memorySegment(),
    		pInA.memorySegment(),
    		pInB.memorySegment(),
    		factor,
    		channels
    	);
    }
    
    public static int ma_get_bytes_per_sample(
    	int format
    ) {
    	MethodHandle method = MA_GET_BYTES_PER_SAMPLE.get();
    	try {
    		return (int) method.invokeExact(
    			format
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment nma_log_level_to_string(
    	int logLevel
    ) {
    	MethodHandle method = MA_LOG_LEVEL_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			logLevel
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_log_level_to_string].
    public static @Nullable String ma_log_level_to_string(
    	int logLevel
    ) {
    	MemorySegment segment = nma_log_level_to_string(
    		logLevel
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// ```
    /// *********************************************************************************************************************************************************
    /// 
    /// Synchronization
    /// 
    /// **********************************************************************************************************************************************************
    /// ```
    public static int ma_spinlock_lock(
    	MemorySegment pSpinlock
    ) {
    	MethodHandle method = MA_SPINLOCK_LOCK.get();
    	try {
    		return (int) method.invokeExact(
    			pSpinlock
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spinlock_lock].
    public static int ma_spinlock_lock(
    	NativeIntArray pSpinlock
    ) {
    	return ma_spinlock_lock(
    		pSpinlock.memorySegment()
    	);
    }
    
    public static int ma_spinlock_lock_noyield(
    	MemorySegment pSpinlock
    ) {
    	MethodHandle method = MA_SPINLOCK_LOCK_NOYIELD.get();
    	try {
    		return (int) method.invokeExact(
    			pSpinlock
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spinlock_lock_noyield].
    public static int ma_spinlock_lock_noyield(
    	NativeIntArray pSpinlock
    ) {
    	return ma_spinlock_lock_noyield(
    		pSpinlock.memorySegment()
    	);
    }
    
    public static int ma_spinlock_unlock(
    	MemorySegment pSpinlock
    ) {
    	MethodHandle method = MA_SPINLOCK_UNLOCK.get();
    	try {
    		return (int) method.invokeExact(
    			pSpinlock
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_spinlock_unlock].
    public static int ma_spinlock_unlock(
    	NativeIntArray pSpinlock
    ) {
    	return ma_spinlock_unlock(
    		pSpinlock.memorySegment()
    	);
    }
    
    public static int ma_mutex_init(
    	MemorySegment pMutex
    ) {
    	MethodHandle method = MA_MUTEX_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pMutex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_mutex_init].
    public static int ma_mutex_init(
    	NativePointerArray pMutex
    ) {
    	return ma_mutex_init(
    		pMutex.memorySegment()
    	);
    }
    
    public static void ma_mutex_uninit(
    	MemorySegment pMutex
    ) {
    	MethodHandle method = MA_MUTEX_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pMutex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_mutex_uninit].
    public static void ma_mutex_uninit(
    	NativePointerArray pMutex
    ) {
    	ma_mutex_uninit(
    		pMutex.memorySegment()
    	);
    }
    
    public static void ma_mutex_lock(
    	MemorySegment pMutex
    ) {
    	MethodHandle method = MA_MUTEX_LOCK.get();
    	try {
    		 method.invokeExact(
    			pMutex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_mutex_lock].
    public static void ma_mutex_lock(
    	NativePointerArray pMutex
    ) {
    	ma_mutex_lock(
    		pMutex.memorySegment()
    	);
    }
    
    public static void ma_mutex_unlock(
    	MemorySegment pMutex
    ) {
    	MethodHandle method = MA_MUTEX_UNLOCK.get();
    	try {
    		 method.invokeExact(
    			pMutex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_mutex_unlock].
    public static void ma_mutex_unlock(
    	NativePointerArray pMutex
    ) {
    	ma_mutex_unlock(
    		pMutex.memorySegment()
    	);
    }
    
    public static int ma_event_init(
    	MemorySegment pEvent
    ) {
    	MethodHandle method = MA_EVENT_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pEvent
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_event_init].
    public static int ma_event_init(
    	NativePointerArray pEvent
    ) {
    	return ma_event_init(
    		pEvent.memorySegment()
    	);
    }
    
    public static void ma_event_uninit(
    	MemorySegment pEvent
    ) {
    	MethodHandle method = MA_EVENT_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pEvent
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_event_uninit].
    public static void ma_event_uninit(
    	NativePointerArray pEvent
    ) {
    	ma_event_uninit(
    		pEvent.memorySegment()
    	);
    }
    
    public static int ma_event_wait(
    	MemorySegment pEvent
    ) {
    	MethodHandle method = MA_EVENT_WAIT.get();
    	try {
    		return (int) method.invokeExact(
    			pEvent
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_event_wait].
    public static int ma_event_wait(
    	NativePointerArray pEvent
    ) {
    	return ma_event_wait(
    		pEvent.memorySegment()
    	);
    }
    
    public static int ma_event_signal(
    	MemorySegment pEvent
    ) {
    	MethodHandle method = MA_EVENT_SIGNAL.get();
    	try {
    		return (int) method.invokeExact(
    			pEvent
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_event_signal].
    public static int ma_event_signal(
    	NativePointerArray pEvent
    ) {
    	return ma_event_signal(
    		pEvent.memorySegment()
    	);
    }
    
    public static int ma_semaphore_init(
    	int initialValue,
    	MemorySegment pSemaphore
    ) {
    	MethodHandle method = MA_SEMAPHORE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			initialValue,
    			pSemaphore
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_semaphore_init].
    public static int ma_semaphore_init(
    	int initialValue,
    	NativePointerArray pSemaphore
    ) {
    	return ma_semaphore_init(
    		initialValue,
    		pSemaphore.memorySegment()
    	);
    }
    
    public static void ma_semaphore_uninit(
    	MemorySegment pSemaphore
    ) {
    	MethodHandle method = MA_SEMAPHORE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pSemaphore
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_semaphore_uninit].
    public static void ma_semaphore_uninit(
    	NativePointerArray pSemaphore
    ) {
    	ma_semaphore_uninit(
    		pSemaphore.memorySegment()
    	);
    }
    
    public static int ma_semaphore_wait(
    	MemorySegment pSemaphore
    ) {
    	MethodHandle method = MA_SEMAPHORE_WAIT.get();
    	try {
    		return (int) method.invokeExact(
    			pSemaphore
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_semaphore_wait].
    public static int ma_semaphore_wait(
    	NativePointerArray pSemaphore
    ) {
    	return ma_semaphore_wait(
    		pSemaphore.memorySegment()
    	);
    }
    
    public static int ma_semaphore_release(
    	MemorySegment pSemaphore
    ) {
    	MethodHandle method = MA_SEMAPHORE_RELEASE.get();
    	try {
    		return (int) method.invokeExact(
    			pSemaphore
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_semaphore_release].
    public static int ma_semaphore_release(
    	NativePointerArray pSemaphore
    ) {
    	return ma_semaphore_release(
    		pSemaphore.memorySegment()
    	);
    }
    
    public static int ma_fence_init(
    	MemorySegment pFence
    ) {
    	MethodHandle method = MA_FENCE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pFence
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_fence_init].
    public static int ma_fence_init(
    	MaFence pFence
    ) {
    	return ma_fence_init(
    		pFence.memorySegment()
    	);
    }
    
    public static void ma_fence_uninit(
    	MemorySegment pFence
    ) {
    	MethodHandle method = MA_FENCE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pFence
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_fence_uninit].
    public static void ma_fence_uninit(
    	MaFence pFence
    ) {
    	ma_fence_uninit(
    		pFence.memorySegment()
    	);
    }
    
    public static int ma_fence_acquire(
    	MemorySegment pFence
    ) {
    	MethodHandle method = MA_FENCE_ACQUIRE.get();
    	try {
    		return (int) method.invokeExact(
    			pFence
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_fence_acquire].
    public static int ma_fence_acquire(
    	MaFence pFence
    ) {
    	return ma_fence_acquire(
    		pFence.memorySegment()
    	);
    }
    
    public static int ma_fence_release(
    	MemorySegment pFence
    ) {
    	MethodHandle method = MA_FENCE_RELEASE.get();
    	try {
    		return (int) method.invokeExact(
    			pFence
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_fence_release].
    public static int ma_fence_release(
    	MaFence pFence
    ) {
    	return ma_fence_release(
    		pFence.memorySegment()
    	);
    }
    
    public static int ma_fence_wait(
    	MemorySegment pFence
    ) {
    	MethodHandle method = MA_FENCE_WAIT.get();
    	try {
    		return (int) method.invokeExact(
    			pFence
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_fence_wait].
    public static int ma_fence_wait(
    	MaFence pFence
    ) {
    	return ma_fence_wait(
    		pFence.memorySegment()
    	);
    }
    
    public static int ma_async_notification_signal(
    	MemorySegment pNotification
    ) {
    	MethodHandle method = MA_ASYNC_NOTIFICATION_SIGNAL.get();
    	try {
    		return (int) method.invokeExact(
    			pNotification
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_async_notification_poll_init(
    	MemorySegment pNotificationPoll
    ) {
    	MethodHandle method = MA_ASYNC_NOTIFICATION_POLL_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pNotificationPoll
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_async_notification_poll_init].
    public static int ma_async_notification_poll_init(
    	MaAsyncNotificationPoll pNotificationPoll
    ) {
    	return ma_async_notification_poll_init(
    		pNotificationPoll.memorySegment()
    	);
    }
    
    public static int ma_async_notification_poll_is_signalled(
    	MemorySegment pNotificationPoll
    ) {
    	MethodHandle method = MA_ASYNC_NOTIFICATION_POLL_IS_SIGNALLED.get();
    	try {
    		return (int) method.invokeExact(
    			pNotificationPoll
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_async_notification_poll_is_signalled].
    public static int ma_async_notification_poll_is_signalled(
    	MaAsyncNotificationPoll pNotificationPoll
    ) {
    	return ma_async_notification_poll_is_signalled(
    		pNotificationPoll.memorySegment()
    	);
    }
    
    public static int ma_async_notification_event_init(
    	MemorySegment pNotificationEvent
    ) {
    	MethodHandle method = MA_ASYNC_NOTIFICATION_EVENT_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pNotificationEvent
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_async_notification_event_init].
    public static int ma_async_notification_event_init(
    	MaAsyncNotificationEvent pNotificationEvent
    ) {
    	return ma_async_notification_event_init(
    		pNotificationEvent.memorySegment()
    	);
    }
    
    public static int ma_async_notification_event_uninit(
    	MemorySegment pNotificationEvent
    ) {
    	MethodHandle method = MA_ASYNC_NOTIFICATION_EVENT_UNINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pNotificationEvent
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_async_notification_event_uninit].
    public static int ma_async_notification_event_uninit(
    	MaAsyncNotificationEvent pNotificationEvent
    ) {
    	return ma_async_notification_event_uninit(
    		pNotificationEvent.memorySegment()
    	);
    }
    
    public static int ma_async_notification_event_wait(
    	MemorySegment pNotificationEvent
    ) {
    	MethodHandle method = MA_ASYNC_NOTIFICATION_EVENT_WAIT.get();
    	try {
    		return (int) method.invokeExact(
    			pNotificationEvent
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_async_notification_event_wait].
    public static int ma_async_notification_event_wait(
    	MaAsyncNotificationEvent pNotificationEvent
    ) {
    	return ma_async_notification_event_wait(
    		pNotificationEvent.memorySegment()
    	);
    }
    
    public static int ma_async_notification_event_signal(
    	MemorySegment pNotificationEvent
    ) {
    	MethodHandle method = MA_ASYNC_NOTIFICATION_EVENT_SIGNAL.get();
    	try {
    		return (int) method.invokeExact(
    			pNotificationEvent
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_async_notification_event_signal].
    public static int ma_async_notification_event_signal(
    	MaAsyncNotificationEvent pNotificationEvent
    ) {
    	return ma_async_notification_event_signal(
    		pNotificationEvent.memorySegment()
    	);
    }
    
    public static MemorySegment nma_slot_allocator_config_init(
    	SegmentAllocator allocator,
    	int capacity
    ) {
    	MethodHandle method = MA_SLOT_ALLOCATOR_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			capacity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_slot_allocator_config_init].
    public static @Nullable MaSlotAllocatorConfig ma_slot_allocator_config_init(
    	SegmentAllocator allocator,
    	int capacity
    ) {
    	MemorySegment segment = nma_slot_allocator_config_init(
    		allocator,
    		capacity
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaSlotAllocatorConfig(segment);
    }
    
    public static int ma_slot_allocator_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_SLOT_ALLOCATOR_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_slot_allocator_get_heap_size].
    public static int ma_slot_allocator_get_heap_size(
    	MaSlotAllocatorConfig pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_slot_allocator_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_slot_allocator_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pAllocator
    ) {
    	MethodHandle method = MA_SLOT_ALLOCATOR_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pAllocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_slot_allocator_init_preallocated].
    public static int ma_slot_allocator_init_preallocated(
    	MaSlotAllocatorConfig pConfig,
    	MemorySegment pHeap,
    	MaSlotAllocator pAllocator
    ) {
    	return ma_slot_allocator_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pAllocator.memorySegment()
    	);
    }
    
    public static int ma_slot_allocator_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pAllocator
    ) {
    	MethodHandle method = MA_SLOT_ALLOCATOR_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pAllocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_slot_allocator_init].
    public static int ma_slot_allocator_init(
    	MaSlotAllocatorConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaSlotAllocator pAllocator
    ) {
    	return ma_slot_allocator_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pAllocator.memorySegment()
    	);
    }
    
    public static void ma_slot_allocator_uninit(
    	MemorySegment pAllocator,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_SLOT_ALLOCATOR_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pAllocator,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_slot_allocator_uninit].
    public static void ma_slot_allocator_uninit(
    	MaSlotAllocator pAllocator,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_slot_allocator_uninit(
    		pAllocator.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_slot_allocator_alloc(
    	MemorySegment pAllocator,
    	MemorySegment pSlot
    ) {
    	MethodHandle method = MA_SLOT_ALLOCATOR_ALLOC.get();
    	try {
    		return (int) method.invokeExact(
    			pAllocator,
    			pSlot
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_slot_allocator_alloc].
    public static int ma_slot_allocator_alloc(
    	MaSlotAllocator pAllocator,
    	NativeLongArray pSlot
    ) {
    	return ma_slot_allocator_alloc(
    		pAllocator.memorySegment(),
    		pSlot.memorySegment()
    	);
    }
    
    public static int ma_slot_allocator_free(
    	MemorySegment pAllocator,
    	long slot
    ) {
    	MethodHandle method = MA_SLOT_ALLOCATOR_FREE.get();
    	try {
    		return (int) method.invokeExact(
    			pAllocator,
    			slot
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_slot_allocator_free].
    public static int ma_slot_allocator_free(
    	MaSlotAllocator pAllocator,
    	long slot
    ) {
    	return ma_slot_allocator_free(
    		pAllocator.memorySegment(),
    		slot
    	);
    }
    
    public static MemorySegment nma_job_init(
    	SegmentAllocator allocator,
    	short code
    ) {
    	MethodHandle method = MA_JOB_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			code
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_job_init].
    public static @Nullable MaJob ma_job_init(
    	SegmentAllocator allocator,
    	short code
    ) {
    	MemorySegment segment = nma_job_init(
    		allocator,
    		code
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaJob(segment);
    }
    
    public static MemorySegment nma_job_queue_config_init(
    	SegmentAllocator allocator,
    	int flags,
    	int capacity
    ) {
    	MethodHandle method = MA_JOB_QUEUE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			flags,
    			capacity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_job_queue_config_init].
    public static @Nullable MaJobQueueConfig ma_job_queue_config_init(
    	SegmentAllocator allocator,
    	int flags,
    	int capacity
    ) {
    	MemorySegment segment = nma_job_queue_config_init(
    		allocator,
    		flags,
    		capacity
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaJobQueueConfig(segment);
    }
    
    public static int ma_job_queue_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_JOB_QUEUE_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_job_queue_get_heap_size].
    public static int ma_job_queue_get_heap_size(
    	MaJobQueueConfig pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_job_queue_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_job_queue_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pQueue
    ) {
    	MethodHandle method = MA_JOB_QUEUE_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pQueue
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_job_queue_init_preallocated].
    public static int ma_job_queue_init_preallocated(
    	MaJobQueueConfig pConfig,
    	MemorySegment pHeap,
    	MaJobQueue pQueue
    ) {
    	return ma_job_queue_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pQueue.memorySegment()
    	);
    }
    
    public static int ma_job_queue_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pQueue
    ) {
    	MethodHandle method = MA_JOB_QUEUE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pQueue
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_job_queue_init].
    public static int ma_job_queue_init(
    	MaJobQueueConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaJobQueue pQueue
    ) {
    	return ma_job_queue_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pQueue.memorySegment()
    	);
    }
    
    public static void ma_job_queue_uninit(
    	MemorySegment pQueue,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_JOB_QUEUE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pQueue,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_job_queue_uninit].
    public static void ma_job_queue_uninit(
    	MaJobQueue pQueue,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_job_queue_uninit(
    		pQueue.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_job_queue_post(
    	MemorySegment pQueue,
    	MemorySegment pJob
    ) {
    	MethodHandle method = MA_JOB_QUEUE_POST.get();
    	try {
    		return (int) method.invokeExact(
    			pQueue,
    			pJob
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_job_queue_post].
    public static int ma_job_queue_post(
    	MaJobQueue pQueue,
    	MaJob pJob
    ) {
    	return ma_job_queue_post(
    		pQueue.memorySegment(),
    		pJob.memorySegment()
    	);
    }
    
    public static int ma_job_queue_next(
    	MemorySegment pQueue,
    	MemorySegment pJob
    ) {
    	MethodHandle method = MA_JOB_QUEUE_NEXT.get();
    	try {
    		return (int) method.invokeExact(
    			pQueue,
    			pJob
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_job_queue_next].
    public static int ma_job_queue_next(
    	MaJobQueue pQueue,
    	MaJob pJob
    ) {
    	return ma_job_queue_next(
    		pQueue.memorySegment(),
    		pJob.memorySegment()
    	);
    }
    
    public static MemorySegment nma_device_job_thread_config_init(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = MA_DEVICE_JOB_THREAD_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_device_job_thread_config_init].
    public static @Nullable MaDeviceJobThreadConfig ma_device_job_thread_config_init(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = nma_device_job_thread_config_init(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDeviceJobThreadConfig(segment);
    }
    
    public static int ma_device_job_thread_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pJobThread
    ) {
    	MethodHandle method = MA_DEVICE_JOB_THREAD_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pJobThread
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_job_thread_init].
    public static int ma_device_job_thread_init(
    	MaDeviceJobThreadConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaDeviceJobThread pJobThread
    ) {
    	return ma_device_job_thread_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pJobThread.memorySegment()
    	);
    }
    
    public static void ma_device_job_thread_uninit(
    	MemorySegment pJobThread,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_DEVICE_JOB_THREAD_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pJobThread,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_job_thread_uninit].
    public static void ma_device_job_thread_uninit(
    	MaDeviceJobThread pJobThread,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_device_job_thread_uninit(
    		pJobThread.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_device_job_thread_post(
    	MemorySegment pJobThread,
    	MemorySegment pJob
    ) {
    	MethodHandle method = MA_DEVICE_JOB_THREAD_POST.get();
    	try {
    		return (int) method.invokeExact(
    			pJobThread,
    			pJob
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_job_thread_post].
    public static int ma_device_job_thread_post(
    	MaDeviceJobThread pJobThread,
    	MaJob pJob
    ) {
    	return ma_device_job_thread_post(
    		pJobThread.memorySegment(),
    		pJob.memorySegment()
    	);
    }
    
    public static int ma_device_job_thread_next(
    	MemorySegment pJobThread,
    	MemorySegment pJob
    ) {
    	MethodHandle method = MA_DEVICE_JOB_THREAD_NEXT.get();
    	try {
    		return (int) method.invokeExact(
    			pJobThread,
    			pJob
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_job_thread_next].
    public static int ma_device_job_thread_next(
    	MaDeviceJobThread pJobThread,
    	MaJob pJob
    ) {
    	return ma_device_job_thread_next(
    		pJobThread.memorySegment(),
    		pJob.memorySegment()
    	);
    }
    
    public static int ma_device_id_equal(
    	MemorySegment pA,
    	MemorySegment pB
    ) {
    	MethodHandle method = MA_DEVICE_ID_EQUAL.get();
    	try {
    		return (int) method.invokeExact(
    			pA,
    			pB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_id_equal].
    public static int ma_device_id_equal(
    	MaDeviceId pA,
    	MaDeviceId pB
    ) {
    	return ma_device_id_equal(
    		pA.memorySegment(),
    		pB.memorySegment()
    	);
    }
    
    public static MemorySegment nma_context_config_init(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = MA_CONTEXT_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_context_config_init].
    public static @Nullable MaContextConfig ma_context_config_init(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = nma_context_config_init(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaContextConfig(segment);
    }
    
    public static int ma_context_init(
    	MemorySegment backends,
    	int backendCount,
    	MemorySegment pConfig,
    	MemorySegment pContext
    ) {
    	MethodHandle method = MA_CONTEXT_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			backends,
    			backendCount,
    			pConfig,
    			pContext
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_context_init].
    public static int ma_context_init(
    	MemorySegment backends,
    	int backendCount,
    	MaContextConfig pConfig,
    	MaContext pContext
    ) {
    	return ma_context_init(
    		backends,
    		backendCount,
    		pConfig.memorySegment(),
    		pContext.memorySegment()
    	);
    }
    
    public static int ma_context_uninit(
    	MemorySegment pContext
    ) {
    	MethodHandle method = MA_CONTEXT_UNINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pContext
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_context_uninit].
    public static int ma_context_uninit(
    	MaContext pContext
    ) {
    	return ma_context_uninit(
    		pContext.memorySegment()
    	);
    }
    
    public static long ma_context_sizeof() {
    	MethodHandle method = MA_CONTEXT_SIZEOF.get();
    	try {
    		return (long) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment ma_context_get_log(
    	MemorySegment pContext
    ) {
    	MethodHandle method = MA_CONTEXT_GET_LOG.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pContext
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_context_get_log].
    public static @Nullable MaLog ma_context_get_log(
    	MaContext pContext
    ) {
    	MemorySegment segment = ma_context_get_log(
    		pContext.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaLog(segment);
    }
    
    public static int ma_context_enumerate_devices(
    	MemorySegment pContext,
    	MemorySegment callback,
    	MemorySegment pUserData
    ) {
    	MethodHandle method = MA_CONTEXT_ENUMERATE_DEVICES.get();
    	try {
    		return (int) method.invokeExact(
    			pContext,
    			callback,
    			pUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_context_enumerate_devices].
    public static int ma_context_enumerate_devices(
    	MaContext pContext,
    	MaEnumDevicesCallbackProc callback,
    	MemorySegment pUserData
    ) {
    	return ma_context_enumerate_devices(
    		pContext.memorySegment(),
    		callback.memorySegment(),
    		pUserData
    	);
    }
    
    public static int ma_context_get_devices(
    	MemorySegment pContext,
    	MemorySegment ppPlaybackDeviceInfos,
    	MemorySegment pPlaybackDeviceCount,
    	MemorySegment ppCaptureDeviceInfos,
    	MemorySegment pCaptureDeviceCount
    ) {
    	MethodHandle method = MA_CONTEXT_GET_DEVICES.get();
    	try {
    		return (int) method.invokeExact(
    			pContext,
    			ppPlaybackDeviceInfos,
    			pPlaybackDeviceCount,
    			ppCaptureDeviceInfos,
    			pCaptureDeviceCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_context_get_devices].
    public static int ma_context_get_devices(
    	MaContext pContext,
    	NativePointerArray ppPlaybackDeviceInfos,
    	NativeIntArray pPlaybackDeviceCount,
    	NativePointerArray ppCaptureDeviceInfos,
    	NativeIntArray pCaptureDeviceCount
    ) {
    	return ma_context_get_devices(
    		pContext.memorySegment(),
    		ppPlaybackDeviceInfos.memorySegment(),
    		pPlaybackDeviceCount.memorySegment(),
    		ppCaptureDeviceInfos.memorySegment(),
    		pCaptureDeviceCount.memorySegment()
    	);
    }
    
    public static int ma_context_get_device_info(
    	MemorySegment pContext,
    	int deviceType,
    	MemorySegment pDeviceID,
    	MemorySegment pDeviceInfo
    ) {
    	MethodHandle method = MA_CONTEXT_GET_DEVICE_INFO.get();
    	try {
    		return (int) method.invokeExact(
    			pContext,
    			deviceType,
    			pDeviceID,
    			pDeviceInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_context_get_device_info].
    public static int ma_context_get_device_info(
    	MaContext pContext,
    	int deviceType,
    	MaDeviceId pDeviceID,
    	MaDeviceInfo pDeviceInfo
    ) {
    	return ma_context_get_device_info(
    		pContext.memorySegment(),
    		deviceType,
    		pDeviceID.memorySegment(),
    		pDeviceInfo.memorySegment()
    	);
    }
    
    public static int ma_context_is_loopback_supported(
    	MemorySegment pContext
    ) {
    	MethodHandle method = MA_CONTEXT_IS_LOOPBACK_SUPPORTED.get();
    	try {
    		return (int) method.invokeExact(
    			pContext
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_context_is_loopback_supported].
    public static int ma_context_is_loopback_supported(
    	MaContext pContext
    ) {
    	return ma_context_is_loopback_supported(
    		pContext.memorySegment()
    	);
    }
    
    public static MemorySegment nma_device_config_init(
    	SegmentAllocator allocator,
    	int deviceType
    ) {
    	MethodHandle method = MA_DEVICE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			deviceType
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_device_config_init].
    public static @Nullable MaDeviceConfig ma_device_config_init(
    	SegmentAllocator allocator,
    	int deviceType
    ) {
    	MemorySegment segment = nma_device_config_init(
    		allocator,
    		deviceType
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDeviceConfig(segment);
    }
    
    public static int ma_device_init(
    	MemorySegment pContext,
    	MemorySegment pConfig,
    	MemorySegment pDevice
    ) {
    	MethodHandle method = MA_DEVICE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pContext,
    			pConfig,
    			pDevice
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_init].
    public static int ma_device_init(
    	MaContext pContext,
    	MaDeviceConfig pConfig,
    	MaDevice pDevice
    ) {
    	return ma_device_init(
    		pContext.memorySegment(),
    		pConfig.memorySegment(),
    		pDevice.memorySegment()
    	);
    }
    
    public static int ma_device_init_ex(
    	MemorySegment backends,
    	int backendCount,
    	MemorySegment pContextConfig,
    	MemorySegment pConfig,
    	MemorySegment pDevice
    ) {
    	MethodHandle method = MA_DEVICE_INIT_EX.get();
    	try {
    		return (int) method.invokeExact(
    			backends,
    			backendCount,
    			pContextConfig,
    			pConfig,
    			pDevice
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_init_ex].
    public static int ma_device_init_ex(
    	MemorySegment backends,
    	int backendCount,
    	MaContextConfig pContextConfig,
    	MaDeviceConfig pConfig,
    	MaDevice pDevice
    ) {
    	return ma_device_init_ex(
    		backends,
    		backendCount,
    		pContextConfig.memorySegment(),
    		pConfig.memorySegment(),
    		pDevice.memorySegment()
    	);
    }
    
    public static void ma_device_uninit(
    	MemorySegment pDevice
    ) {
    	MethodHandle method = MA_DEVICE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pDevice
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_uninit].
    public static void ma_device_uninit(
    	MaDevice pDevice
    ) {
    	ma_device_uninit(
    		pDevice.memorySegment()
    	);
    }
    
    public static MemorySegment ma_device_get_context(
    	MemorySegment pDevice
    ) {
    	MethodHandle method = MA_DEVICE_GET_CONTEXT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pDevice
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_get_context].
    public static @Nullable MaContext ma_device_get_context(
    	MaDevice pDevice
    ) {
    	MemorySegment segment = ma_device_get_context(
    		pDevice.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaContext(segment);
    }
    
    public static MemorySegment ma_device_get_log(
    	MemorySegment pDevice
    ) {
    	MethodHandle method = MA_DEVICE_GET_LOG.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pDevice
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_get_log].
    public static @Nullable MaLog ma_device_get_log(
    	MaDevice pDevice
    ) {
    	MemorySegment segment = ma_device_get_log(
    		pDevice.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaLog(segment);
    }
    
    public static int ma_device_get_info(
    	MemorySegment pDevice,
    	int type,
    	MemorySegment pDeviceInfo
    ) {
    	MethodHandle method = MA_DEVICE_GET_INFO.get();
    	try {
    		return (int) method.invokeExact(
    			pDevice,
    			type,
    			pDeviceInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_get_info].
    public static int ma_device_get_info(
    	MaDevice pDevice,
    	int type,
    	MaDeviceInfo pDeviceInfo
    ) {
    	return ma_device_get_info(
    		pDevice.memorySegment(),
    		type,
    		pDeviceInfo.memorySegment()
    	);
    }
    
    public static int ma_device_get_name(
    	MemorySegment pDevice,
    	int type,
    	MemorySegment pName,
    	long nameCap,
    	MemorySegment pLengthNotIncludingNullTerminator
    ) {
    	MethodHandle method = MA_DEVICE_GET_NAME.get();
    	try {
    		return (int) method.invokeExact(
    			pDevice,
    			type,
    			pName,
    			nameCap,
    			pLengthNotIncludingNullTerminator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_get_name].
    public static int ma_device_get_name(
    	MaDevice pDevice,
    	int type,
    	NativeByteArray pName,
    	long nameCap,
    	NativeLongArray pLengthNotIncludingNullTerminator
    ) {
    	return ma_device_get_name(
    		pDevice.memorySegment(),
    		type,
    		pName.memorySegment(),
    		nameCap,
    		pLengthNotIncludingNullTerminator.memorySegment()
    	);
    }
    
    public static int ma_device_start(
    	MemorySegment pDevice
    ) {
    	MethodHandle method = MA_DEVICE_START.get();
    	try {
    		return (int) method.invokeExact(
    			pDevice
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_start].
    public static int ma_device_start(
    	MaDevice pDevice
    ) {
    	return ma_device_start(
    		pDevice.memorySegment()
    	);
    }
    
    public static int ma_device_stop(
    	MemorySegment pDevice
    ) {
    	MethodHandle method = MA_DEVICE_STOP.get();
    	try {
    		return (int) method.invokeExact(
    			pDevice
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_stop].
    public static int ma_device_stop(
    	MaDevice pDevice
    ) {
    	return ma_device_stop(
    		pDevice.memorySegment()
    	);
    }
    
    public static int ma_device_is_started(
    	MemorySegment pDevice
    ) {
    	MethodHandle method = MA_DEVICE_IS_STARTED.get();
    	try {
    		return (int) method.invokeExact(
    			pDevice
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_is_started].
    public static int ma_device_is_started(
    	MaDevice pDevice
    ) {
    	return ma_device_is_started(
    		pDevice.memorySegment()
    	);
    }
    
    public static int ma_device_get_state(
    	MemorySegment pDevice
    ) {
    	MethodHandle method = MA_DEVICE_GET_STATE.get();
    	try {
    		return (int) method.invokeExact(
    			pDevice
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_get_state].
    public static int ma_device_get_state(
    	MaDevice pDevice
    ) {
    	return ma_device_get_state(
    		pDevice.memorySegment()
    	);
    }
    
    public static int ma_device_post_init(
    	MemorySegment pDevice,
    	int deviceType,
    	MemorySegment pPlaybackDescriptor,
    	MemorySegment pCaptureDescriptor
    ) {
    	MethodHandle method = MA_DEVICE_POST_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pDevice,
    			deviceType,
    			pPlaybackDescriptor,
    			pCaptureDescriptor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_post_init].
    public static int ma_device_post_init(
    	MaDevice pDevice,
    	int deviceType,
    	MaDeviceDescriptor pPlaybackDescriptor,
    	MaDeviceDescriptor pCaptureDescriptor
    ) {
    	return ma_device_post_init(
    		pDevice.memorySegment(),
    		deviceType,
    		pPlaybackDescriptor.memorySegment(),
    		pCaptureDescriptor.memorySegment()
    	);
    }
    
    public static int ma_device_set_master_volume(
    	MemorySegment pDevice,
    	float volume
    ) {
    	MethodHandle method = MA_DEVICE_SET_MASTER_VOLUME.get();
    	try {
    		return (int) method.invokeExact(
    			pDevice,
    			volume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_set_master_volume].
    public static int ma_device_set_master_volume(
    	MaDevice pDevice,
    	float volume
    ) {
    	return ma_device_set_master_volume(
    		pDevice.memorySegment(),
    		volume
    	);
    }
    
    public static int ma_device_get_master_volume(
    	MemorySegment pDevice,
    	MemorySegment pVolume
    ) {
    	MethodHandle method = MA_DEVICE_GET_MASTER_VOLUME.get();
    	try {
    		return (int) method.invokeExact(
    			pDevice,
    			pVolume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_get_master_volume].
    public static int ma_device_get_master_volume(
    	MaDevice pDevice,
    	NativeFloatArray pVolume
    ) {
    	return ma_device_get_master_volume(
    		pDevice.memorySegment(),
    		pVolume.memorySegment()
    	);
    }
    
    public static int ma_device_set_master_volume_db(
    	MemorySegment pDevice,
    	float gainDB
    ) {
    	MethodHandle method = MA_DEVICE_SET_MASTER_VOLUME_DB.get();
    	try {
    		return (int) method.invokeExact(
    			pDevice,
    			gainDB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_set_master_volume_db].
    public static int ma_device_set_master_volume_db(
    	MaDevice pDevice,
    	float gainDB
    ) {
    	return ma_device_set_master_volume_db(
    		pDevice.memorySegment(),
    		gainDB
    	);
    }
    
    public static int ma_device_get_master_volume_db(
    	MemorySegment pDevice,
    	MemorySegment pGainDB
    ) {
    	MethodHandle method = MA_DEVICE_GET_MASTER_VOLUME_DB.get();
    	try {
    		return (int) method.invokeExact(
    			pDevice,
    			pGainDB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_get_master_volume_db].
    public static int ma_device_get_master_volume_db(
    	MaDevice pDevice,
    	NativeFloatArray pGainDB
    ) {
    	return ma_device_get_master_volume_db(
    		pDevice.memorySegment(),
    		pGainDB.memorySegment()
    	);
    }
    
    public static int ma_device_handle_backend_data_callback(
    	MemorySegment pDevice,
    	MemorySegment pOutput,
    	MemorySegment pInput,
    	int frameCount
    ) {
    	MethodHandle method = MA_DEVICE_HANDLE_BACKEND_DATA_CALLBACK.get();
    	try {
    		return (int) method.invokeExact(
    			pDevice,
    			pOutput,
    			pInput,
    			frameCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_device_handle_backend_data_callback].
    public static int ma_device_handle_backend_data_callback(
    	MaDevice pDevice,
    	MemorySegment pOutput,
    	MemorySegment pInput,
    	int frameCount
    ) {
    	return ma_device_handle_backend_data_callback(
    		pDevice.memorySegment(),
    		pOutput,
    		pInput,
    		frameCount
    	);
    }
    
    public static int ma_calculate_buffer_size_in_frames_from_descriptor(
    	MemorySegment pDescriptor,
    	int nativeSampleRate,
    	int performanceProfile
    ) {
    	MethodHandle method = MA_CALCULATE_BUFFER_SIZE_IN_FRAMES_FROM_DESCRIPTOR.get();
    	try {
    		return (int) method.invokeExact(
    			pDescriptor,
    			nativeSampleRate,
    			performanceProfile
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_calculate_buffer_size_in_frames_from_descriptor].
    public static int ma_calculate_buffer_size_in_frames_from_descriptor(
    	MaDeviceDescriptor pDescriptor,
    	int nativeSampleRate,
    	int performanceProfile
    ) {
    	return ma_calculate_buffer_size_in_frames_from_descriptor(
    		pDescriptor.memorySegment(),
    		nativeSampleRate,
    		performanceProfile
    	);
    }
    
    public static MemorySegment nma_get_backend_name(
    	int backend
    ) {
    	MethodHandle method = MA_GET_BACKEND_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			backend
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_get_backend_name].
    public static @Nullable String ma_get_backend_name(
    	int backend
    ) {
    	MemorySegment segment = nma_get_backend_name(
    		backend
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    public static int ma_get_backend_from_name(
    	MemorySegment pBackendName,
    	MemorySegment pBackend
    ) {
    	MethodHandle method = MA_GET_BACKEND_FROM_NAME.get();
    	try {
    		return (int) method.invokeExact(
    			pBackendName,
    			pBackend
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_get_backend_from_name].
    public static int ma_get_backend_from_name(
    	String pBackendName,
    	NativeIntArray pBackend
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_get_backend_from_name(
    			arena.allocateFrom(pBackendName),
    			pBackend.memorySegment()
    		);
    	}
    }
    
    public static int ma_is_backend_enabled(
    	int backend
    ) {
    	MethodHandle method = MA_IS_BACKEND_ENABLED.get();
    	try {
    		return (int) method.invokeExact(
    			backend
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_get_enabled_backends(
    	MemorySegment pBackends,
    	long backendCap,
    	MemorySegment pBackendCount
    ) {
    	MethodHandle method = MA_GET_ENABLED_BACKENDS.get();
    	try {
    		return (int) method.invokeExact(
    			pBackends,
    			backendCap,
    			pBackendCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_get_enabled_backends].
    public static int ma_get_enabled_backends(
    	NativeIntArray pBackends,
    	long backendCap,
    	NativeLongArray pBackendCount
    ) {
    	return ma_get_enabled_backends(
    		pBackends.memorySegment(),
    		backendCap,
    		pBackendCount.memorySegment()
    	);
    }
    
    public static int ma_is_loopback_supported(
    	int backend
    ) {
    	MethodHandle method = MA_IS_LOOPBACK_SUPPORTED.get();
    	try {
    		return (int) method.invokeExact(
    			backend
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// *********************************************************************************************************************************************************
    /// 
    /// Utilities
    /// 
    /// **********************************************************************************************************************************************************
    /// ```
    public static int ma_calculate_buffer_size_in_milliseconds_from_frames(
    	int bufferSizeInFrames,
    	int sampleRate
    ) {
    	MethodHandle method = MA_CALCULATE_BUFFER_SIZE_IN_MILLISECONDS_FROM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			bufferSizeInFrames,
    			sampleRate
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_calculate_buffer_size_in_frames_from_milliseconds(
    	int bufferSizeInMilliseconds,
    	int sampleRate
    ) {
    	MethodHandle method = MA_CALCULATE_BUFFER_SIZE_IN_FRAMES_FROM_MILLISECONDS.get();
    	try {
    		return (int) method.invokeExact(
    			bufferSizeInMilliseconds,
    			sampleRate
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_copy_pcm_frames(
    	MemorySegment dst,
    	MemorySegment src,
    	long frameCount,
    	int format,
    	int channels
    ) {
    	MethodHandle method = MA_COPY_PCM_FRAMES.get();
    	try {
    		 method.invokeExact(
    			dst,
    			src,
    			frameCount,
    			format,
    			channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_silence_pcm_frames(
    	MemorySegment p,
    	long frameCount,
    	int format,
    	int channels
    ) {
    	MethodHandle method = MA_SILENCE_PCM_FRAMES.get();
    	try {
    		 method.invokeExact(
    			p,
    			frameCount,
    			format,
    			channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment ma_offset_pcm_frames_ptr(
    	MemorySegment p,
    	long offsetInFrames,
    	int format,
    	int channels
    ) {
    	MethodHandle method = MA_OFFSET_PCM_FRAMES_PTR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			offsetInFrames,
    			format,
    			channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment ma_offset_pcm_frames_const_ptr(
    	MemorySegment p,
    	long offsetInFrames,
    	int format,
    	int channels
    ) {
    	MethodHandle method = MA_OFFSET_PCM_FRAMES_CONST_PTR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			p,
    			offsetInFrames,
    			format,
    			channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_clip_samples_u8(
    	MemorySegment pDst,
    	MemorySegment pSrc,
    	long count
    ) {
    	MethodHandle method = MA_CLIP_SAMPLES_U8.get();
    	try {
    		 method.invokeExact(
    			pDst,
    			pSrc,
    			count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_clip_samples_u8].
    public static void ma_clip_samples_u8(
    	NativeByteArray pDst,
    	NativeShortArray pSrc,
    	long count
    ) {
    	ma_clip_samples_u8(
    		pDst.memorySegment(),
    		pSrc.memorySegment(),
    		count
    	);
    }
    
    public static void ma_clip_samples_s16(
    	MemorySegment pDst,
    	MemorySegment pSrc,
    	long count
    ) {
    	MethodHandle method = MA_CLIP_SAMPLES_S16.get();
    	try {
    		 method.invokeExact(
    			pDst,
    			pSrc,
    			count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_clip_samples_s16].
    public static void ma_clip_samples_s16(
    	NativeShortArray pDst,
    	NativeIntArray pSrc,
    	long count
    ) {
    	ma_clip_samples_s16(
    		pDst.memorySegment(),
    		pSrc.memorySegment(),
    		count
    	);
    }
    
    public static void ma_clip_samples_s24(
    	MemorySegment pDst,
    	MemorySegment pSrc,
    	long count
    ) {
    	MethodHandle method = MA_CLIP_SAMPLES_S24.get();
    	try {
    		 method.invokeExact(
    			pDst,
    			pSrc,
    			count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_clip_samples_s24].
    public static void ma_clip_samples_s24(
    	NativeByteArray pDst,
    	NativeLongArray pSrc,
    	long count
    ) {
    	ma_clip_samples_s24(
    		pDst.memorySegment(),
    		pSrc.memorySegment(),
    		count
    	);
    }
    
    public static void ma_clip_samples_s32(
    	MemorySegment pDst,
    	MemorySegment pSrc,
    	long count
    ) {
    	MethodHandle method = MA_CLIP_SAMPLES_S32.get();
    	try {
    		 method.invokeExact(
    			pDst,
    			pSrc,
    			count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_clip_samples_s32].
    public static void ma_clip_samples_s32(
    	NativeIntArray pDst,
    	NativeLongArray pSrc,
    	long count
    ) {
    	ma_clip_samples_s32(
    		pDst.memorySegment(),
    		pSrc.memorySegment(),
    		count
    	);
    }
    
    public static void ma_clip_samples_f32(
    	MemorySegment pDst,
    	MemorySegment pSrc,
    	long count
    ) {
    	MethodHandle method = MA_CLIP_SAMPLES_F32.get();
    	try {
    		 method.invokeExact(
    			pDst,
    			pSrc,
    			count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_clip_samples_f32].
    public static void ma_clip_samples_f32(
    	NativeFloatArray pDst,
    	NativeFloatArray pSrc,
    	long count
    ) {
    	ma_clip_samples_f32(
    		pDst.memorySegment(),
    		pSrc.memorySegment(),
    		count
    	);
    }
    
    public static void ma_clip_pcm_frames(
    	MemorySegment pDst,
    	MemorySegment pSrc,
    	long frameCount,
    	int format,
    	int channels
    ) {
    	MethodHandle method = MA_CLIP_PCM_FRAMES.get();
    	try {
    		 method.invokeExact(
    			pDst,
    			pSrc,
    			frameCount,
    			format,
    			channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_copy_and_apply_volume_factor_u8(
    	MemorySegment pSamplesOut,
    	MemorySegment pSamplesIn,
    	long sampleCount,
    	float factor
    ) {
    	MethodHandle method = MA_COPY_AND_APPLY_VOLUME_FACTOR_U8.get();
    	try {
    		 method.invokeExact(
    			pSamplesOut,
    			pSamplesIn,
    			sampleCount,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_copy_and_apply_volume_factor_u8].
    public static void ma_copy_and_apply_volume_factor_u8(
    	NativeByteArray pSamplesOut,
    	NativeByteArray pSamplesIn,
    	long sampleCount,
    	float factor
    ) {
    	ma_copy_and_apply_volume_factor_u8(
    		pSamplesOut.memorySegment(),
    		pSamplesIn.memorySegment(),
    		sampleCount,
    		factor
    	);
    }
    
    public static void ma_copy_and_apply_volume_factor_s16(
    	MemorySegment pSamplesOut,
    	MemorySegment pSamplesIn,
    	long sampleCount,
    	float factor
    ) {
    	MethodHandle method = MA_COPY_AND_APPLY_VOLUME_FACTOR_S16.get();
    	try {
    		 method.invokeExact(
    			pSamplesOut,
    			pSamplesIn,
    			sampleCount,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_copy_and_apply_volume_factor_s16].
    public static void ma_copy_and_apply_volume_factor_s16(
    	NativeShortArray pSamplesOut,
    	NativeShortArray pSamplesIn,
    	long sampleCount,
    	float factor
    ) {
    	ma_copy_and_apply_volume_factor_s16(
    		pSamplesOut.memorySegment(),
    		pSamplesIn.memorySegment(),
    		sampleCount,
    		factor
    	);
    }
    
    public static void ma_copy_and_apply_volume_factor_s24(
    	MemorySegment pSamplesOut,
    	MemorySegment pSamplesIn,
    	long sampleCount,
    	float factor
    ) {
    	MethodHandle method = MA_COPY_AND_APPLY_VOLUME_FACTOR_S24.get();
    	try {
    		 method.invokeExact(
    			pSamplesOut,
    			pSamplesIn,
    			sampleCount,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_copy_and_apply_volume_factor_s32(
    	MemorySegment pSamplesOut,
    	MemorySegment pSamplesIn,
    	long sampleCount,
    	float factor
    ) {
    	MethodHandle method = MA_COPY_AND_APPLY_VOLUME_FACTOR_S32.get();
    	try {
    		 method.invokeExact(
    			pSamplesOut,
    			pSamplesIn,
    			sampleCount,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_copy_and_apply_volume_factor_s32].
    public static void ma_copy_and_apply_volume_factor_s32(
    	NativeIntArray pSamplesOut,
    	NativeIntArray pSamplesIn,
    	long sampleCount,
    	float factor
    ) {
    	ma_copy_and_apply_volume_factor_s32(
    		pSamplesOut.memorySegment(),
    		pSamplesIn.memorySegment(),
    		sampleCount,
    		factor
    	);
    }
    
    public static void ma_copy_and_apply_volume_factor_f32(
    	MemorySegment pSamplesOut,
    	MemorySegment pSamplesIn,
    	long sampleCount,
    	float factor
    ) {
    	MethodHandle method = MA_COPY_AND_APPLY_VOLUME_FACTOR_F32.get();
    	try {
    		 method.invokeExact(
    			pSamplesOut,
    			pSamplesIn,
    			sampleCount,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_copy_and_apply_volume_factor_f32].
    public static void ma_copy_and_apply_volume_factor_f32(
    	NativeFloatArray pSamplesOut,
    	NativeFloatArray pSamplesIn,
    	long sampleCount,
    	float factor
    ) {
    	ma_copy_and_apply_volume_factor_f32(
    		pSamplesOut.memorySegment(),
    		pSamplesIn.memorySegment(),
    		sampleCount,
    		factor
    	);
    }
    
    public static void ma_apply_volume_factor_u8(
    	MemorySegment pSamples,
    	long sampleCount,
    	float factor
    ) {
    	MethodHandle method = MA_APPLY_VOLUME_FACTOR_U8.get();
    	try {
    		 method.invokeExact(
    			pSamples,
    			sampleCount,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_apply_volume_factor_u8].
    public static void ma_apply_volume_factor_u8(
    	NativeByteArray pSamples,
    	long sampleCount,
    	float factor
    ) {
    	ma_apply_volume_factor_u8(
    		pSamples.memorySegment(),
    		sampleCount,
    		factor
    	);
    }
    
    public static void ma_apply_volume_factor_s16(
    	MemorySegment pSamples,
    	long sampleCount,
    	float factor
    ) {
    	MethodHandle method = MA_APPLY_VOLUME_FACTOR_S16.get();
    	try {
    		 method.invokeExact(
    			pSamples,
    			sampleCount,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_apply_volume_factor_s16].
    public static void ma_apply_volume_factor_s16(
    	NativeShortArray pSamples,
    	long sampleCount,
    	float factor
    ) {
    	ma_apply_volume_factor_s16(
    		pSamples.memorySegment(),
    		sampleCount,
    		factor
    	);
    }
    
    public static void ma_apply_volume_factor_s24(
    	MemorySegment pSamples,
    	long sampleCount,
    	float factor
    ) {
    	MethodHandle method = MA_APPLY_VOLUME_FACTOR_S24.get();
    	try {
    		 method.invokeExact(
    			pSamples,
    			sampleCount,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_apply_volume_factor_s32(
    	MemorySegment pSamples,
    	long sampleCount,
    	float factor
    ) {
    	MethodHandle method = MA_APPLY_VOLUME_FACTOR_S32.get();
    	try {
    		 method.invokeExact(
    			pSamples,
    			sampleCount,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_apply_volume_factor_s32].
    public static void ma_apply_volume_factor_s32(
    	NativeIntArray pSamples,
    	long sampleCount,
    	float factor
    ) {
    	ma_apply_volume_factor_s32(
    		pSamples.memorySegment(),
    		sampleCount,
    		factor
    	);
    }
    
    public static void ma_apply_volume_factor_f32(
    	MemorySegment pSamples,
    	long sampleCount,
    	float factor
    ) {
    	MethodHandle method = MA_APPLY_VOLUME_FACTOR_F32.get();
    	try {
    		 method.invokeExact(
    			pSamples,
    			sampleCount,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_apply_volume_factor_f32].
    public static void ma_apply_volume_factor_f32(
    	NativeFloatArray pSamples,
    	long sampleCount,
    	float factor
    ) {
    	ma_apply_volume_factor_f32(
    		pSamples.memorySegment(),
    		sampleCount,
    		factor
    	);
    }
    
    public static void ma_copy_and_apply_volume_factor_pcm_frames_u8(
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount,
    	int channels,
    	float factor
    ) {
    	MethodHandle method = MA_COPY_AND_APPLY_VOLUME_FACTOR_PCM_FRAMES_U8.get();
    	try {
    		 method.invokeExact(
    			pFramesOut,
    			pFramesIn,
    			frameCount,
    			channels,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_copy_and_apply_volume_factor_pcm_frames_u8].
    public static void ma_copy_and_apply_volume_factor_pcm_frames_u8(
    	NativeByteArray pFramesOut,
    	NativeByteArray pFramesIn,
    	long frameCount,
    	int channels,
    	float factor
    ) {
    	ma_copy_and_apply_volume_factor_pcm_frames_u8(
    		pFramesOut.memorySegment(),
    		pFramesIn.memorySegment(),
    		frameCount,
    		channels,
    		factor
    	);
    }
    
    public static void ma_copy_and_apply_volume_factor_pcm_frames_s16(
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount,
    	int channels,
    	float factor
    ) {
    	MethodHandle method = MA_COPY_AND_APPLY_VOLUME_FACTOR_PCM_FRAMES_S16.get();
    	try {
    		 method.invokeExact(
    			pFramesOut,
    			pFramesIn,
    			frameCount,
    			channels,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_copy_and_apply_volume_factor_pcm_frames_s16].
    public static void ma_copy_and_apply_volume_factor_pcm_frames_s16(
    	NativeShortArray pFramesOut,
    	NativeShortArray pFramesIn,
    	long frameCount,
    	int channels,
    	float factor
    ) {
    	ma_copy_and_apply_volume_factor_pcm_frames_s16(
    		pFramesOut.memorySegment(),
    		pFramesIn.memorySegment(),
    		frameCount,
    		channels,
    		factor
    	);
    }
    
    public static void ma_copy_and_apply_volume_factor_pcm_frames_s24(
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount,
    	int channels,
    	float factor
    ) {
    	MethodHandle method = MA_COPY_AND_APPLY_VOLUME_FACTOR_PCM_FRAMES_S24.get();
    	try {
    		 method.invokeExact(
    			pFramesOut,
    			pFramesIn,
    			frameCount,
    			channels,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_copy_and_apply_volume_factor_pcm_frames_s32(
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount,
    	int channels,
    	float factor
    ) {
    	MethodHandle method = MA_COPY_AND_APPLY_VOLUME_FACTOR_PCM_FRAMES_S32.get();
    	try {
    		 method.invokeExact(
    			pFramesOut,
    			pFramesIn,
    			frameCount,
    			channels,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_copy_and_apply_volume_factor_pcm_frames_s32].
    public static void ma_copy_and_apply_volume_factor_pcm_frames_s32(
    	NativeIntArray pFramesOut,
    	NativeIntArray pFramesIn,
    	long frameCount,
    	int channels,
    	float factor
    ) {
    	ma_copy_and_apply_volume_factor_pcm_frames_s32(
    		pFramesOut.memorySegment(),
    		pFramesIn.memorySegment(),
    		frameCount,
    		channels,
    		factor
    	);
    }
    
    public static void ma_copy_and_apply_volume_factor_pcm_frames_f32(
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount,
    	int channels,
    	float factor
    ) {
    	MethodHandle method = MA_COPY_AND_APPLY_VOLUME_FACTOR_PCM_FRAMES_F32.get();
    	try {
    		 method.invokeExact(
    			pFramesOut,
    			pFramesIn,
    			frameCount,
    			channels,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_copy_and_apply_volume_factor_pcm_frames_f32].
    public static void ma_copy_and_apply_volume_factor_pcm_frames_f32(
    	NativeFloatArray pFramesOut,
    	NativeFloatArray pFramesIn,
    	long frameCount,
    	int channels,
    	float factor
    ) {
    	ma_copy_and_apply_volume_factor_pcm_frames_f32(
    		pFramesOut.memorySegment(),
    		pFramesIn.memorySegment(),
    		frameCount,
    		channels,
    		factor
    	);
    }
    
    public static void ma_copy_and_apply_volume_factor_pcm_frames(
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount,
    	int format,
    	int channels,
    	float factor
    ) {
    	MethodHandle method = MA_COPY_AND_APPLY_VOLUME_FACTOR_PCM_FRAMES.get();
    	try {
    		 method.invokeExact(
    			pFramesOut,
    			pFramesIn,
    			frameCount,
    			format,
    			channels,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_apply_volume_factor_pcm_frames_u8(
    	MemorySegment pFrames,
    	long frameCount,
    	int channels,
    	float factor
    ) {
    	MethodHandle method = MA_APPLY_VOLUME_FACTOR_PCM_FRAMES_U8.get();
    	try {
    		 method.invokeExact(
    			pFrames,
    			frameCount,
    			channels,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_apply_volume_factor_pcm_frames_u8].
    public static void ma_apply_volume_factor_pcm_frames_u8(
    	NativeByteArray pFrames,
    	long frameCount,
    	int channels,
    	float factor
    ) {
    	ma_apply_volume_factor_pcm_frames_u8(
    		pFrames.memorySegment(),
    		frameCount,
    		channels,
    		factor
    	);
    }
    
    public static void ma_apply_volume_factor_pcm_frames_s16(
    	MemorySegment pFrames,
    	long frameCount,
    	int channels,
    	float factor
    ) {
    	MethodHandle method = MA_APPLY_VOLUME_FACTOR_PCM_FRAMES_S16.get();
    	try {
    		 method.invokeExact(
    			pFrames,
    			frameCount,
    			channels,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_apply_volume_factor_pcm_frames_s16].
    public static void ma_apply_volume_factor_pcm_frames_s16(
    	NativeShortArray pFrames,
    	long frameCount,
    	int channels,
    	float factor
    ) {
    	ma_apply_volume_factor_pcm_frames_s16(
    		pFrames.memorySegment(),
    		frameCount,
    		channels,
    		factor
    	);
    }
    
    public static void ma_apply_volume_factor_pcm_frames_s24(
    	MemorySegment pFrames,
    	long frameCount,
    	int channels,
    	float factor
    ) {
    	MethodHandle method = MA_APPLY_VOLUME_FACTOR_PCM_FRAMES_S24.get();
    	try {
    		 method.invokeExact(
    			pFrames,
    			frameCount,
    			channels,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_apply_volume_factor_pcm_frames_s32(
    	MemorySegment pFrames,
    	long frameCount,
    	int channels,
    	float factor
    ) {
    	MethodHandle method = MA_APPLY_VOLUME_FACTOR_PCM_FRAMES_S32.get();
    	try {
    		 method.invokeExact(
    			pFrames,
    			frameCount,
    			channels,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_apply_volume_factor_pcm_frames_s32].
    public static void ma_apply_volume_factor_pcm_frames_s32(
    	NativeIntArray pFrames,
    	long frameCount,
    	int channels,
    	float factor
    ) {
    	ma_apply_volume_factor_pcm_frames_s32(
    		pFrames.memorySegment(),
    		frameCount,
    		channels,
    		factor
    	);
    }
    
    public static void ma_apply_volume_factor_pcm_frames_f32(
    	MemorySegment pFrames,
    	long frameCount,
    	int channels,
    	float factor
    ) {
    	MethodHandle method = MA_APPLY_VOLUME_FACTOR_PCM_FRAMES_F32.get();
    	try {
    		 method.invokeExact(
    			pFrames,
    			frameCount,
    			channels,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_apply_volume_factor_pcm_frames_f32].
    public static void ma_apply_volume_factor_pcm_frames_f32(
    	NativeFloatArray pFrames,
    	long frameCount,
    	int channels,
    	float factor
    ) {
    	ma_apply_volume_factor_pcm_frames_f32(
    		pFrames.memorySegment(),
    		frameCount,
    		channels,
    		factor
    	);
    }
    
    public static void ma_apply_volume_factor_pcm_frames(
    	MemorySegment pFrames,
    	long frameCount,
    	int format,
    	int channels,
    	float factor
    ) {
    	MethodHandle method = MA_APPLY_VOLUME_FACTOR_PCM_FRAMES.get();
    	try {
    		 method.invokeExact(
    			pFrames,
    			frameCount,
    			format,
    			channels,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void ma_copy_and_apply_volume_factor_per_channel_f32(
    	MemorySegment pFramesOut,
    	MemorySegment pFramesIn,
    	long frameCount,
    	int channels,
    	MemorySegment pChannelGains
    ) {
    	MethodHandle method = MA_COPY_AND_APPLY_VOLUME_FACTOR_PER_CHANNEL_F32.get();
    	try {
    		 method.invokeExact(
    			pFramesOut,
    			pFramesIn,
    			frameCount,
    			channels,
    			pChannelGains
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_copy_and_apply_volume_factor_per_channel_f32].
    public static void ma_copy_and_apply_volume_factor_per_channel_f32(
    	NativeFloatArray pFramesOut,
    	NativeFloatArray pFramesIn,
    	long frameCount,
    	int channels,
    	NativeFloatArray pChannelGains
    ) {
    	ma_copy_and_apply_volume_factor_per_channel_f32(
    		pFramesOut.memorySegment(),
    		pFramesIn.memorySegment(),
    		frameCount,
    		channels,
    		pChannelGains.memorySegment()
    	);
    }
    
    public static void ma_copy_and_apply_volume_and_clip_samples_u8(
    	MemorySegment pDst,
    	MemorySegment pSrc,
    	long count,
    	float volume
    ) {
    	MethodHandle method = MA_COPY_AND_APPLY_VOLUME_AND_CLIP_SAMPLES_U8.get();
    	try {
    		 method.invokeExact(
    			pDst,
    			pSrc,
    			count,
    			volume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_copy_and_apply_volume_and_clip_samples_u8].
    public static void ma_copy_and_apply_volume_and_clip_samples_u8(
    	NativeByteArray pDst,
    	NativeShortArray pSrc,
    	long count,
    	float volume
    ) {
    	ma_copy_and_apply_volume_and_clip_samples_u8(
    		pDst.memorySegment(),
    		pSrc.memorySegment(),
    		count,
    		volume
    	);
    }
    
    public static void ma_copy_and_apply_volume_and_clip_samples_s16(
    	MemorySegment pDst,
    	MemorySegment pSrc,
    	long count,
    	float volume
    ) {
    	MethodHandle method = MA_COPY_AND_APPLY_VOLUME_AND_CLIP_SAMPLES_S16.get();
    	try {
    		 method.invokeExact(
    			pDst,
    			pSrc,
    			count,
    			volume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_copy_and_apply_volume_and_clip_samples_s16].
    public static void ma_copy_and_apply_volume_and_clip_samples_s16(
    	NativeShortArray pDst,
    	NativeIntArray pSrc,
    	long count,
    	float volume
    ) {
    	ma_copy_and_apply_volume_and_clip_samples_s16(
    		pDst.memorySegment(),
    		pSrc.memorySegment(),
    		count,
    		volume
    	);
    }
    
    public static void ma_copy_and_apply_volume_and_clip_samples_s24(
    	MemorySegment pDst,
    	MemorySegment pSrc,
    	long count,
    	float volume
    ) {
    	MethodHandle method = MA_COPY_AND_APPLY_VOLUME_AND_CLIP_SAMPLES_S24.get();
    	try {
    		 method.invokeExact(
    			pDst,
    			pSrc,
    			count,
    			volume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_copy_and_apply_volume_and_clip_samples_s24].
    public static void ma_copy_and_apply_volume_and_clip_samples_s24(
    	NativeByteArray pDst,
    	NativeLongArray pSrc,
    	long count,
    	float volume
    ) {
    	ma_copy_and_apply_volume_and_clip_samples_s24(
    		pDst.memorySegment(),
    		pSrc.memorySegment(),
    		count,
    		volume
    	);
    }
    
    public static void ma_copy_and_apply_volume_and_clip_samples_s32(
    	MemorySegment pDst,
    	MemorySegment pSrc,
    	long count,
    	float volume
    ) {
    	MethodHandle method = MA_COPY_AND_APPLY_VOLUME_AND_CLIP_SAMPLES_S32.get();
    	try {
    		 method.invokeExact(
    			pDst,
    			pSrc,
    			count,
    			volume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_copy_and_apply_volume_and_clip_samples_s32].
    public static void ma_copy_and_apply_volume_and_clip_samples_s32(
    	NativeIntArray pDst,
    	NativeLongArray pSrc,
    	long count,
    	float volume
    ) {
    	ma_copy_and_apply_volume_and_clip_samples_s32(
    		pDst.memorySegment(),
    		pSrc.memorySegment(),
    		count,
    		volume
    	);
    }
    
    public static void ma_copy_and_apply_volume_and_clip_samples_f32(
    	MemorySegment pDst,
    	MemorySegment pSrc,
    	long count,
    	float volume
    ) {
    	MethodHandle method = MA_COPY_AND_APPLY_VOLUME_AND_CLIP_SAMPLES_F32.get();
    	try {
    		 method.invokeExact(
    			pDst,
    			pSrc,
    			count,
    			volume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_copy_and_apply_volume_and_clip_samples_f32].
    public static void ma_copy_and_apply_volume_and_clip_samples_f32(
    	NativeFloatArray pDst,
    	NativeFloatArray pSrc,
    	long count,
    	float volume
    ) {
    	ma_copy_and_apply_volume_and_clip_samples_f32(
    		pDst.memorySegment(),
    		pSrc.memorySegment(),
    		count,
    		volume
    	);
    }
    
    public static void ma_copy_and_apply_volume_and_clip_pcm_frames(
    	MemorySegment pDst,
    	MemorySegment pSrc,
    	long frameCount,
    	int format,
    	int channels,
    	float volume
    ) {
    	MethodHandle method = MA_COPY_AND_APPLY_VOLUME_AND_CLIP_PCM_FRAMES.get();
    	try {
    		 method.invokeExact(
    			pDst,
    			pSrc,
    			frameCount,
    			format,
    			channels,
    			volume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static float ma_volume_linear_to_db(
    	float factor
    ) {
    	MethodHandle method = MA_VOLUME_LINEAR_TO_DB.get();
    	try {
    		return (float) method.invokeExact(
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static float ma_volume_db_to_linear(
    	float gain
    ) {
    	MethodHandle method = MA_VOLUME_DB_TO_LINEAR.get();
    	try {
    		return (float) method.invokeExact(
    			gain
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_mix_pcm_frames_f32(
    	MemorySegment pDst,
    	MemorySegment pSrc,
    	long frameCount,
    	int channels,
    	float volume
    ) {
    	MethodHandle method = MA_MIX_PCM_FRAMES_F32.get();
    	try {
    		return (int) method.invokeExact(
    			pDst,
    			pSrc,
    			frameCount,
    			channels,
    			volume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_mix_pcm_frames_f32].
    public static int ma_mix_pcm_frames_f32(
    	NativeFloatArray pDst,
    	NativeFloatArray pSrc,
    	long frameCount,
    	int channels,
    	float volume
    ) {
    	return ma_mix_pcm_frames_f32(
    		pDst.memorySegment(),
    		pSrc.memorySegment(),
    		frameCount,
    		channels,
    		volume
    	);
    }
    
    public static int ma_vfs_open(
    	MemorySegment pVFS,
    	MemorySegment pFilePath,
    	int openMode,
    	MemorySegment pFile
    ) {
    	MethodHandle method = MA_VFS_OPEN.get();
    	try {
    		return (int) method.invokeExact(
    			pVFS,
    			pFilePath,
    			openMode,
    			pFile
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_vfs_open].
    public static int ma_vfs_open(
    	MemorySegment pVFS,
    	String pFilePath,
    	int openMode,
    	NativePointerArray pFile
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_vfs_open(
    			pVFS,
    			arena.allocateFrom(pFilePath),
    			openMode,
    			pFile.memorySegment()
    		);
    	}
    }
    
    public static int ma_vfs_open_w(
    	MemorySegment pVFS,
    	MemorySegment pFilePath,
    	int openMode,
    	MemorySegment pFile
    ) {
    	MethodHandle method = MA_VFS_OPEN_W.get();
    	try {
    		return (int) method.invokeExact(
    			pVFS,
    			pFilePath,
    			openMode,
    			pFile
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_vfs_open_w].
    public static int ma_vfs_open_w(
    	MemorySegment pVFS,
    	NativeShortArray pFilePath,
    	int openMode,
    	NativePointerArray pFile
    ) {
    	return ma_vfs_open_w(
    		pVFS,
    		pFilePath.memorySegment(),
    		openMode,
    		pFile.memorySegment()
    	);
    }
    
    public static int ma_vfs_close(
    	MemorySegment pVFS,
    	MemorySegment file
    ) {
    	MethodHandle method = MA_VFS_CLOSE.get();
    	try {
    		return (int) method.invokeExact(
    			pVFS,
    			file
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_vfs_read(
    	MemorySegment pVFS,
    	MemorySegment file,
    	MemorySegment pDst,
    	long sizeInBytes,
    	MemorySegment pBytesRead
    ) {
    	MethodHandle method = MA_VFS_READ.get();
    	try {
    		return (int) method.invokeExact(
    			pVFS,
    			file,
    			pDst,
    			sizeInBytes,
    			pBytesRead
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_vfs_read].
    public static int ma_vfs_read(
    	MemorySegment pVFS,
    	MemorySegment file,
    	MemorySegment pDst,
    	long sizeInBytes,
    	NativeLongArray pBytesRead
    ) {
    	return ma_vfs_read(
    		pVFS,
    		file,
    		pDst,
    		sizeInBytes,
    		pBytesRead.memorySegment()
    	);
    }
    
    public static int ma_vfs_write(
    	MemorySegment pVFS,
    	MemorySegment file,
    	MemorySegment pSrc,
    	long sizeInBytes,
    	MemorySegment pBytesWritten
    ) {
    	MethodHandle method = MA_VFS_WRITE.get();
    	try {
    		return (int) method.invokeExact(
    			pVFS,
    			file,
    			pSrc,
    			sizeInBytes,
    			pBytesWritten
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_vfs_write].
    public static int ma_vfs_write(
    	MemorySegment pVFS,
    	MemorySegment file,
    	MemorySegment pSrc,
    	long sizeInBytes,
    	NativeLongArray pBytesWritten
    ) {
    	return ma_vfs_write(
    		pVFS,
    		file,
    		pSrc,
    		sizeInBytes,
    		pBytesWritten.memorySegment()
    	);
    }
    
    public static int ma_vfs_seek(
    	MemorySegment pVFS,
    	MemorySegment file,
    	long offset,
    	int origin
    ) {
    	MethodHandle method = MA_VFS_SEEK.get();
    	try {
    		return (int) method.invokeExact(
    			pVFS,
    			file,
    			offset,
    			origin
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_vfs_tell(
    	MemorySegment pVFS,
    	MemorySegment file,
    	MemorySegment pCursor
    ) {
    	MethodHandle method = MA_VFS_TELL.get();
    	try {
    		return (int) method.invokeExact(
    			pVFS,
    			file,
    			pCursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_vfs_tell].
    public static int ma_vfs_tell(
    	MemorySegment pVFS,
    	MemorySegment file,
    	NativeLongArray pCursor
    ) {
    	return ma_vfs_tell(
    		pVFS,
    		file,
    		pCursor.memorySegment()
    	);
    }
    
    public static int ma_vfs_info(
    	MemorySegment pVFS,
    	MemorySegment file,
    	MemorySegment pInfo
    ) {
    	MethodHandle method = MA_VFS_INFO.get();
    	try {
    		return (int) method.invokeExact(
    			pVFS,
    			file,
    			pInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_vfs_info].
    public static int ma_vfs_info(
    	MemorySegment pVFS,
    	MemorySegment file,
    	MaFileInfo pInfo
    ) {
    	return ma_vfs_info(
    		pVFS,
    		file,
    		pInfo.memorySegment()
    	);
    }
    
    public static int ma_vfs_open_and_read_file(
    	MemorySegment pVFS,
    	MemorySegment pFilePath,
    	MemorySegment ppData,
    	MemorySegment pSize,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_VFS_OPEN_AND_READ_FILE.get();
    	try {
    		return (int) method.invokeExact(
    			pVFS,
    			pFilePath,
    			ppData,
    			pSize,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_vfs_open_and_read_file].
    public static int ma_vfs_open_and_read_file(
    	MemorySegment pVFS,
    	String pFilePath,
    	NativePointerArray ppData,
    	NativeLongArray pSize,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_vfs_open_and_read_file(
    			pVFS,
    			arena.allocateFrom(pFilePath),
    			ppData.memorySegment(),
    			pSize.memorySegment(),
    			pAllocationCallbacks.memorySegment()
    		);
    	}
    }
    
    public static int ma_default_vfs_init(
    	MemorySegment pVFS,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_DEFAULT_VFS_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pVFS,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_default_vfs_init].
    public static int ma_default_vfs_init(
    	MaDefaultVfs pVFS,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	return ma_default_vfs_init(
    		pVFS.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static MemorySegment nma_decoding_backend_config_init(
    	SegmentAllocator allocator,
    	int preferredFormat,
    	int seekPointCount
    ) {
    	MethodHandle method = MA_DECODING_BACKEND_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			preferredFormat,
    			seekPointCount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_decoding_backend_config_init].
    public static @Nullable MaDecodingBackendConfig ma_decoding_backend_config_init(
    	SegmentAllocator allocator,
    	int preferredFormat,
    	int seekPointCount
    ) {
    	MemorySegment segment = nma_decoding_backend_config_init(
    		allocator,
    		preferredFormat,
    		seekPointCount
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDecodingBackendConfig(segment);
    }
    
    public static MemorySegment nma_decoder_config_init(
    	SegmentAllocator allocator,
    	int outputFormat,
    	int outputChannels,
    	int outputSampleRate
    ) {
    	MethodHandle method = MA_DECODER_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			outputFormat,
    			outputChannels,
    			outputSampleRate
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_decoder_config_init].
    public static @Nullable MaDecoderConfig ma_decoder_config_init(
    	SegmentAllocator allocator,
    	int outputFormat,
    	int outputChannels,
    	int outputSampleRate
    ) {
    	MemorySegment segment = nma_decoder_config_init(
    		allocator,
    		outputFormat,
    		outputChannels,
    		outputSampleRate
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDecoderConfig(segment);
    }
    
    public static MemorySegment nma_decoder_config_init_default(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = MA_DECODER_CONFIG_INIT_DEFAULT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_decoder_config_init_default].
    public static @Nullable MaDecoderConfig ma_decoder_config_init_default(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = nma_decoder_config_init_default(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDecoderConfig(segment);
    }
    
    public static int ma_decoder_init(
    	MemorySegment onRead,
    	MemorySegment onSeek,
    	MemorySegment pUserData,
    	MemorySegment pConfig,
    	MemorySegment pDecoder
    ) {
    	MethodHandle method = MA_DECODER_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			onRead,
    			onSeek,
    			pUserData,
    			pConfig,
    			pDecoder
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_decoder_init].
    public static int ma_decoder_init(
    	MaDecoderReadProc onRead,
    	MaDecoderSeekProc onSeek,
    	MemorySegment pUserData,
    	MaDecoderConfig pConfig,
    	MaDecoder pDecoder
    ) {
    	return ma_decoder_init(
    		onRead.memorySegment(),
    		onSeek.memorySegment(),
    		pUserData,
    		pConfig.memorySegment(),
    		pDecoder.memorySegment()
    	);
    }
    
    public static int ma_decoder_init_memory(
    	MemorySegment pData,
    	long dataSize,
    	MemorySegment pConfig,
    	MemorySegment pDecoder
    ) {
    	MethodHandle method = MA_DECODER_INIT_MEMORY.get();
    	try {
    		return (int) method.invokeExact(
    			pData,
    			dataSize,
    			pConfig,
    			pDecoder
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_decoder_init_memory].
    public static int ma_decoder_init_memory(
    	MemorySegment pData,
    	long dataSize,
    	MaDecoderConfig pConfig,
    	MaDecoder pDecoder
    ) {
    	return ma_decoder_init_memory(
    		pData,
    		dataSize,
    		pConfig.memorySegment(),
    		pDecoder.memorySegment()
    	);
    }
    
    public static int ma_decoder_init_vfs(
    	MemorySegment pVFS,
    	MemorySegment pFilePath,
    	MemorySegment pConfig,
    	MemorySegment pDecoder
    ) {
    	MethodHandle method = MA_DECODER_INIT_VFS.get();
    	try {
    		return (int) method.invokeExact(
    			pVFS,
    			pFilePath,
    			pConfig,
    			pDecoder
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_decoder_init_vfs].
    public static int ma_decoder_init_vfs(
    	MemorySegment pVFS,
    	String pFilePath,
    	MaDecoderConfig pConfig,
    	MaDecoder pDecoder
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_decoder_init_vfs(
    			pVFS,
    			arena.allocateFrom(pFilePath),
    			pConfig.memorySegment(),
    			pDecoder.memorySegment()
    		);
    	}
    }
    
    public static int ma_decoder_init_vfs_w(
    	MemorySegment pVFS,
    	MemorySegment pFilePath,
    	MemorySegment pConfig,
    	MemorySegment pDecoder
    ) {
    	MethodHandle method = MA_DECODER_INIT_VFS_W.get();
    	try {
    		return (int) method.invokeExact(
    			pVFS,
    			pFilePath,
    			pConfig,
    			pDecoder
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_decoder_init_vfs_w].
    public static int ma_decoder_init_vfs_w(
    	MemorySegment pVFS,
    	NativeShortArray pFilePath,
    	MaDecoderConfig pConfig,
    	MaDecoder pDecoder
    ) {
    	return ma_decoder_init_vfs_w(
    		pVFS,
    		pFilePath.memorySegment(),
    		pConfig.memorySegment(),
    		pDecoder.memorySegment()
    	);
    }
    
    public static int ma_decoder_init_file(
    	MemorySegment pFilePath,
    	MemorySegment pConfig,
    	MemorySegment pDecoder
    ) {
    	MethodHandle method = MA_DECODER_INIT_FILE.get();
    	try {
    		return (int) method.invokeExact(
    			pFilePath,
    			pConfig,
    			pDecoder
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_decoder_init_file].
    public static int ma_decoder_init_file(
    	String pFilePath,
    	MaDecoderConfig pConfig,
    	MaDecoder pDecoder
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_decoder_init_file(
    			arena.allocateFrom(pFilePath),
    			pConfig.memorySegment(),
    			pDecoder.memorySegment()
    		);
    	}
    }
    
    public static int ma_decoder_init_file_w(
    	MemorySegment pFilePath,
    	MemorySegment pConfig,
    	MemorySegment pDecoder
    ) {
    	MethodHandle method = MA_DECODER_INIT_FILE_W.get();
    	try {
    		return (int) method.invokeExact(
    			pFilePath,
    			pConfig,
    			pDecoder
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_decoder_init_file_w].
    public static int ma_decoder_init_file_w(
    	NativeShortArray pFilePath,
    	MaDecoderConfig pConfig,
    	MaDecoder pDecoder
    ) {
    	return ma_decoder_init_file_w(
    		pFilePath.memorySegment(),
    		pConfig.memorySegment(),
    		pDecoder.memorySegment()
    	);
    }
    
    public static int ma_decoder_uninit(
    	MemorySegment pDecoder
    ) {
    	MethodHandle method = MA_DECODER_UNINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pDecoder
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_decoder_uninit].
    public static int ma_decoder_uninit(
    	MaDecoder pDecoder
    ) {
    	return ma_decoder_uninit(
    		pDecoder.memorySegment()
    	);
    }
    
    public static int ma_decoder_read_pcm_frames(
    	MemorySegment pDecoder,
    	MemorySegment pFramesOut,
    	long frameCount,
    	MemorySegment pFramesRead
    ) {
    	MethodHandle method = MA_DECODER_READ_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDecoder,
    			pFramesOut,
    			frameCount,
    			pFramesRead
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_decoder_read_pcm_frames].
    public static int ma_decoder_read_pcm_frames(
    	MaDecoder pDecoder,
    	MemorySegment pFramesOut,
    	long frameCount,
    	NativeLongArray pFramesRead
    ) {
    	return ma_decoder_read_pcm_frames(
    		pDecoder.memorySegment(),
    		pFramesOut,
    		frameCount,
    		pFramesRead.memorySegment()
    	);
    }
    
    public static int ma_decoder_seek_to_pcm_frame(
    	MemorySegment pDecoder,
    	long frameIndex
    ) {
    	MethodHandle method = MA_DECODER_SEEK_TO_PCM_FRAME.get();
    	try {
    		return (int) method.invokeExact(
    			pDecoder,
    			frameIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_decoder_seek_to_pcm_frame].
    public static int ma_decoder_seek_to_pcm_frame(
    	MaDecoder pDecoder,
    	long frameIndex
    ) {
    	return ma_decoder_seek_to_pcm_frame(
    		pDecoder.memorySegment(),
    		frameIndex
    	);
    }
    
    public static int ma_decoder_get_data_format(
    	MemorySegment pDecoder,
    	MemorySegment pFormat,
    	MemorySegment pChannels,
    	MemorySegment pSampleRate,
    	MemorySegment pChannelMap,
    	long channelMapCap
    ) {
    	MethodHandle method = MA_DECODER_GET_DATA_FORMAT.get();
    	try {
    		return (int) method.invokeExact(
    			pDecoder,
    			pFormat,
    			pChannels,
    			pSampleRate,
    			pChannelMap,
    			channelMapCap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_decoder_get_data_format].
    public static int ma_decoder_get_data_format(
    	MaDecoder pDecoder,
    	NativeIntArray pFormat,
    	NativeIntArray pChannels,
    	NativeIntArray pSampleRate,
    	NativeByteArray pChannelMap,
    	long channelMapCap
    ) {
    	return ma_decoder_get_data_format(
    		pDecoder.memorySegment(),
    		pFormat.memorySegment(),
    		pChannels.memorySegment(),
    		pSampleRate.memorySegment(),
    		pChannelMap.memorySegment(),
    		channelMapCap
    	);
    }
    
    public static int ma_decoder_get_cursor_in_pcm_frames(
    	MemorySegment pDecoder,
    	MemorySegment pCursor
    ) {
    	MethodHandle method = MA_DECODER_GET_CURSOR_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDecoder,
    			pCursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_decoder_get_cursor_in_pcm_frames].
    public static int ma_decoder_get_cursor_in_pcm_frames(
    	MaDecoder pDecoder,
    	NativeLongArray pCursor
    ) {
    	return ma_decoder_get_cursor_in_pcm_frames(
    		pDecoder.memorySegment(),
    		pCursor.memorySegment()
    	);
    }
    
    public static int ma_decoder_get_length_in_pcm_frames(
    	MemorySegment pDecoder,
    	MemorySegment pLength
    ) {
    	MethodHandle method = MA_DECODER_GET_LENGTH_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDecoder,
    			pLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_decoder_get_length_in_pcm_frames].
    public static int ma_decoder_get_length_in_pcm_frames(
    	MaDecoder pDecoder,
    	NativeLongArray pLength
    ) {
    	return ma_decoder_get_length_in_pcm_frames(
    		pDecoder.memorySegment(),
    		pLength.memorySegment()
    	);
    }
    
    public static int ma_decoder_get_available_frames(
    	MemorySegment pDecoder,
    	MemorySegment pAvailableFrames
    ) {
    	MethodHandle method = MA_DECODER_GET_AVAILABLE_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDecoder,
    			pAvailableFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_decoder_get_available_frames].
    public static int ma_decoder_get_available_frames(
    	MaDecoder pDecoder,
    	NativeLongArray pAvailableFrames
    ) {
    	return ma_decoder_get_available_frames(
    		pDecoder.memorySegment(),
    		pAvailableFrames.memorySegment()
    	);
    }
    
    public static int ma_decode_from_vfs(
    	MemorySegment pVFS,
    	MemorySegment pFilePath,
    	MemorySegment pConfig,
    	MemorySegment pFrameCountOut,
    	MemorySegment ppPCMFramesOut
    ) {
    	MethodHandle method = MA_DECODE_FROM_VFS.get();
    	try {
    		return (int) method.invokeExact(
    			pVFS,
    			pFilePath,
    			pConfig,
    			pFrameCountOut,
    			ppPCMFramesOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_decode_from_vfs].
    public static int ma_decode_from_vfs(
    	MemorySegment pVFS,
    	String pFilePath,
    	MaDecoderConfig pConfig,
    	NativeLongArray pFrameCountOut,
    	NativePointerArray ppPCMFramesOut
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_decode_from_vfs(
    			pVFS,
    			arena.allocateFrom(pFilePath),
    			pConfig.memorySegment(),
    			pFrameCountOut.memorySegment(),
    			ppPCMFramesOut.memorySegment()
    		);
    	}
    }
    
    public static int ma_decode_file(
    	MemorySegment pFilePath,
    	MemorySegment pConfig,
    	MemorySegment pFrameCountOut,
    	MemorySegment ppPCMFramesOut
    ) {
    	MethodHandle method = MA_DECODE_FILE.get();
    	try {
    		return (int) method.invokeExact(
    			pFilePath,
    			pConfig,
    			pFrameCountOut,
    			ppPCMFramesOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_decode_file].
    public static int ma_decode_file(
    	String pFilePath,
    	MaDecoderConfig pConfig,
    	NativeLongArray pFrameCountOut,
    	NativePointerArray ppPCMFramesOut
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_decode_file(
    			arena.allocateFrom(pFilePath),
    			pConfig.memorySegment(),
    			pFrameCountOut.memorySegment(),
    			ppPCMFramesOut.memorySegment()
    		);
    	}
    }
    
    public static int ma_decode_memory(
    	MemorySegment pData,
    	long dataSize,
    	MemorySegment pConfig,
    	MemorySegment pFrameCountOut,
    	MemorySegment ppPCMFramesOut
    ) {
    	MethodHandle method = MA_DECODE_MEMORY.get();
    	try {
    		return (int) method.invokeExact(
    			pData,
    			dataSize,
    			pConfig,
    			pFrameCountOut,
    			ppPCMFramesOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_decode_memory].
    public static int ma_decode_memory(
    	MemorySegment pData,
    	long dataSize,
    	MaDecoderConfig pConfig,
    	NativeLongArray pFrameCountOut,
    	NativePointerArray ppPCMFramesOut
    ) {
    	return ma_decode_memory(
    		pData,
    		dataSize,
    		pConfig.memorySegment(),
    		pFrameCountOut.memorySegment(),
    		ppPCMFramesOut.memorySegment()
    	);
    }
    
    public static MemorySegment nma_encoder_config_init(
    	SegmentAllocator allocator,
    	int encodingFormat,
    	int format,
    	int channels,
    	int sampleRate
    ) {
    	MethodHandle method = MA_ENCODER_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			encodingFormat,
    			format,
    			channels,
    			sampleRate
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_encoder_config_init].
    public static @Nullable MaEncoderConfig ma_encoder_config_init(
    	SegmentAllocator allocator,
    	int encodingFormat,
    	int format,
    	int channels,
    	int sampleRate
    ) {
    	MemorySegment segment = nma_encoder_config_init(
    		allocator,
    		encodingFormat,
    		format,
    		channels,
    		sampleRate
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaEncoderConfig(segment);
    }
    
    public static int ma_encoder_init(
    	MemorySegment onWrite,
    	MemorySegment onSeek,
    	MemorySegment pUserData,
    	MemorySegment pConfig,
    	MemorySegment pEncoder
    ) {
    	MethodHandle method = MA_ENCODER_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			onWrite,
    			onSeek,
    			pUserData,
    			pConfig,
    			pEncoder
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_encoder_init].
    public static int ma_encoder_init(
    	MaEncoderWriteProc onWrite,
    	MaEncoderSeekProc onSeek,
    	MemorySegment pUserData,
    	MaEncoderConfig pConfig,
    	MaEncoder pEncoder
    ) {
    	return ma_encoder_init(
    		onWrite.memorySegment(),
    		onSeek.memorySegment(),
    		pUserData,
    		pConfig.memorySegment(),
    		pEncoder.memorySegment()
    	);
    }
    
    public static int ma_encoder_init_vfs(
    	MemorySegment pVFS,
    	MemorySegment pFilePath,
    	MemorySegment pConfig,
    	MemorySegment pEncoder
    ) {
    	MethodHandle method = MA_ENCODER_INIT_VFS.get();
    	try {
    		return (int) method.invokeExact(
    			pVFS,
    			pFilePath,
    			pConfig,
    			pEncoder
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_encoder_init_vfs].
    public static int ma_encoder_init_vfs(
    	MemorySegment pVFS,
    	String pFilePath,
    	MaEncoderConfig pConfig,
    	MaEncoder pEncoder
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_encoder_init_vfs(
    			pVFS,
    			arena.allocateFrom(pFilePath),
    			pConfig.memorySegment(),
    			pEncoder.memorySegment()
    		);
    	}
    }
    
    public static int ma_encoder_init_vfs_w(
    	MemorySegment pVFS,
    	MemorySegment pFilePath,
    	MemorySegment pConfig,
    	MemorySegment pEncoder
    ) {
    	MethodHandle method = MA_ENCODER_INIT_VFS_W.get();
    	try {
    		return (int) method.invokeExact(
    			pVFS,
    			pFilePath,
    			pConfig,
    			pEncoder
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_encoder_init_vfs_w].
    public static int ma_encoder_init_vfs_w(
    	MemorySegment pVFS,
    	NativeShortArray pFilePath,
    	MaEncoderConfig pConfig,
    	MaEncoder pEncoder
    ) {
    	return ma_encoder_init_vfs_w(
    		pVFS,
    		pFilePath.memorySegment(),
    		pConfig.memorySegment(),
    		pEncoder.memorySegment()
    	);
    }
    
    public static int ma_encoder_init_file(
    	MemorySegment pFilePath,
    	MemorySegment pConfig,
    	MemorySegment pEncoder
    ) {
    	MethodHandle method = MA_ENCODER_INIT_FILE.get();
    	try {
    		return (int) method.invokeExact(
    			pFilePath,
    			pConfig,
    			pEncoder
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_encoder_init_file].
    public static int ma_encoder_init_file(
    	String pFilePath,
    	MaEncoderConfig pConfig,
    	MaEncoder pEncoder
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_encoder_init_file(
    			arena.allocateFrom(pFilePath),
    			pConfig.memorySegment(),
    			pEncoder.memorySegment()
    		);
    	}
    }
    
    public static int ma_encoder_init_file_w(
    	MemorySegment pFilePath,
    	MemorySegment pConfig,
    	MemorySegment pEncoder
    ) {
    	MethodHandle method = MA_ENCODER_INIT_FILE_W.get();
    	try {
    		return (int) method.invokeExact(
    			pFilePath,
    			pConfig,
    			pEncoder
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_encoder_init_file_w].
    public static int ma_encoder_init_file_w(
    	NativeShortArray pFilePath,
    	MaEncoderConfig pConfig,
    	MaEncoder pEncoder
    ) {
    	return ma_encoder_init_file_w(
    		pFilePath.memorySegment(),
    		pConfig.memorySegment(),
    		pEncoder.memorySegment()
    	);
    }
    
    public static void ma_encoder_uninit(
    	MemorySegment pEncoder
    ) {
    	MethodHandle method = MA_ENCODER_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pEncoder
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_encoder_uninit].
    public static void ma_encoder_uninit(
    	MaEncoder pEncoder
    ) {
    	ma_encoder_uninit(
    		pEncoder.memorySegment()
    	);
    }
    
    public static int ma_encoder_write_pcm_frames(
    	MemorySegment pEncoder,
    	MemorySegment pFramesIn,
    	long frameCount,
    	MemorySegment pFramesWritten
    ) {
    	MethodHandle method = MA_ENCODER_WRITE_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pEncoder,
    			pFramesIn,
    			frameCount,
    			pFramesWritten
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_encoder_write_pcm_frames].
    public static int ma_encoder_write_pcm_frames(
    	MaEncoder pEncoder,
    	MemorySegment pFramesIn,
    	long frameCount,
    	NativeLongArray pFramesWritten
    ) {
    	return ma_encoder_write_pcm_frames(
    		pEncoder.memorySegment(),
    		pFramesIn,
    		frameCount,
    		pFramesWritten.memorySegment()
    	);
    }
    
    public static MemorySegment nma_waveform_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	int type,
    	double amplitude,
    	double frequency
    ) {
    	MethodHandle method = MA_WAVEFORM_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			sampleRate,
    			type,
    			amplitude,
    			frequency
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_waveform_config_init].
    public static @Nullable MaWaveformConfig ma_waveform_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	int type,
    	double amplitude,
    	double frequency
    ) {
    	MemorySegment segment = nma_waveform_config_init(
    		allocator,
    		format,
    		channels,
    		sampleRate,
    		type,
    		amplitude,
    		frequency
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaWaveformConfig(segment);
    }
    
    public static int ma_waveform_init(
    	MemorySegment pConfig,
    	MemorySegment pWaveform
    ) {
    	MethodHandle method = MA_WAVEFORM_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pWaveform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_waveform_init].
    public static int ma_waveform_init(
    	MaWaveformConfig pConfig,
    	MaWaveform pWaveform
    ) {
    	return ma_waveform_init(
    		pConfig.memorySegment(),
    		pWaveform.memorySegment()
    	);
    }
    
    public static void ma_waveform_uninit(
    	MemorySegment pWaveform
    ) {
    	MethodHandle method = MA_WAVEFORM_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pWaveform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_waveform_uninit].
    public static void ma_waveform_uninit(
    	MaWaveform pWaveform
    ) {
    	ma_waveform_uninit(
    		pWaveform.memorySegment()
    	);
    }
    
    public static int ma_waveform_read_pcm_frames(
    	MemorySegment pWaveform,
    	MemorySegment pFramesOut,
    	long frameCount,
    	MemorySegment pFramesRead
    ) {
    	MethodHandle method = MA_WAVEFORM_READ_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pWaveform,
    			pFramesOut,
    			frameCount,
    			pFramesRead
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_waveform_read_pcm_frames].
    public static int ma_waveform_read_pcm_frames(
    	MaWaveform pWaveform,
    	MemorySegment pFramesOut,
    	long frameCount,
    	NativeLongArray pFramesRead
    ) {
    	return ma_waveform_read_pcm_frames(
    		pWaveform.memorySegment(),
    		pFramesOut,
    		frameCount,
    		pFramesRead.memorySegment()
    	);
    }
    
    public static int ma_waveform_seek_to_pcm_frame(
    	MemorySegment pWaveform,
    	long frameIndex
    ) {
    	MethodHandle method = MA_WAVEFORM_SEEK_TO_PCM_FRAME.get();
    	try {
    		return (int) method.invokeExact(
    			pWaveform,
    			frameIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_waveform_seek_to_pcm_frame].
    public static int ma_waveform_seek_to_pcm_frame(
    	MaWaveform pWaveform,
    	long frameIndex
    ) {
    	return ma_waveform_seek_to_pcm_frame(
    		pWaveform.memorySegment(),
    		frameIndex
    	);
    }
    
    public static int ma_waveform_set_amplitude(
    	MemorySegment pWaveform,
    	double amplitude
    ) {
    	MethodHandle method = MA_WAVEFORM_SET_AMPLITUDE.get();
    	try {
    		return (int) method.invokeExact(
    			pWaveform,
    			amplitude
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_waveform_set_amplitude].
    public static int ma_waveform_set_amplitude(
    	MaWaveform pWaveform,
    	double amplitude
    ) {
    	return ma_waveform_set_amplitude(
    		pWaveform.memorySegment(),
    		amplitude
    	);
    }
    
    public static int ma_waveform_set_frequency(
    	MemorySegment pWaveform,
    	double frequency
    ) {
    	MethodHandle method = MA_WAVEFORM_SET_FREQUENCY.get();
    	try {
    		return (int) method.invokeExact(
    			pWaveform,
    			frequency
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_waveform_set_frequency].
    public static int ma_waveform_set_frequency(
    	MaWaveform pWaveform,
    	double frequency
    ) {
    	return ma_waveform_set_frequency(
    		pWaveform.memorySegment(),
    		frequency
    	);
    }
    
    public static int ma_waveform_set_type(
    	MemorySegment pWaveform,
    	int type
    ) {
    	MethodHandle method = MA_WAVEFORM_SET_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			pWaveform,
    			type
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_waveform_set_type].
    public static int ma_waveform_set_type(
    	MaWaveform pWaveform,
    	int type
    ) {
    	return ma_waveform_set_type(
    		pWaveform.memorySegment(),
    		type
    	);
    }
    
    public static int ma_waveform_set_sample_rate(
    	MemorySegment pWaveform,
    	int sampleRate
    ) {
    	MethodHandle method = MA_WAVEFORM_SET_SAMPLE_RATE.get();
    	try {
    		return (int) method.invokeExact(
    			pWaveform,
    			sampleRate
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_waveform_set_sample_rate].
    public static int ma_waveform_set_sample_rate(
    	MaWaveform pWaveform,
    	int sampleRate
    ) {
    	return ma_waveform_set_sample_rate(
    		pWaveform.memorySegment(),
    		sampleRate
    	);
    }
    
    public static MemorySegment nma_pulsewave_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double dutyCycle,
    	double amplitude,
    	double frequency
    ) {
    	MethodHandle method = MA_PULSEWAVE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			sampleRate,
    			dutyCycle,
    			amplitude,
    			frequency
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_pulsewave_config_init].
    public static @Nullable MaPulsewaveConfig ma_pulsewave_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int sampleRate,
    	double dutyCycle,
    	double amplitude,
    	double frequency
    ) {
    	MemorySegment segment = nma_pulsewave_config_init(
    		allocator,
    		format,
    		channels,
    		sampleRate,
    		dutyCycle,
    		amplitude,
    		frequency
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaPulsewaveConfig(segment);
    }
    
    public static int ma_pulsewave_init(
    	MemorySegment pConfig,
    	MemorySegment pWaveform
    ) {
    	MethodHandle method = MA_PULSEWAVE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pWaveform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pulsewave_init].
    public static int ma_pulsewave_init(
    	MaPulsewaveConfig pConfig,
    	MaPulsewave pWaveform
    ) {
    	return ma_pulsewave_init(
    		pConfig.memorySegment(),
    		pWaveform.memorySegment()
    	);
    }
    
    public static void ma_pulsewave_uninit(
    	MemorySegment pWaveform
    ) {
    	MethodHandle method = MA_PULSEWAVE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pWaveform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pulsewave_uninit].
    public static void ma_pulsewave_uninit(
    	MaPulsewave pWaveform
    ) {
    	ma_pulsewave_uninit(
    		pWaveform.memorySegment()
    	);
    }
    
    public static int ma_pulsewave_read_pcm_frames(
    	MemorySegment pWaveform,
    	MemorySegment pFramesOut,
    	long frameCount,
    	MemorySegment pFramesRead
    ) {
    	MethodHandle method = MA_PULSEWAVE_READ_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pWaveform,
    			pFramesOut,
    			frameCount,
    			pFramesRead
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pulsewave_read_pcm_frames].
    public static int ma_pulsewave_read_pcm_frames(
    	MaPulsewave pWaveform,
    	MemorySegment pFramesOut,
    	long frameCount,
    	NativeLongArray pFramesRead
    ) {
    	return ma_pulsewave_read_pcm_frames(
    		pWaveform.memorySegment(),
    		pFramesOut,
    		frameCount,
    		pFramesRead.memorySegment()
    	);
    }
    
    public static int ma_pulsewave_seek_to_pcm_frame(
    	MemorySegment pWaveform,
    	long frameIndex
    ) {
    	MethodHandle method = MA_PULSEWAVE_SEEK_TO_PCM_FRAME.get();
    	try {
    		return (int) method.invokeExact(
    			pWaveform,
    			frameIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pulsewave_seek_to_pcm_frame].
    public static int ma_pulsewave_seek_to_pcm_frame(
    	MaPulsewave pWaveform,
    	long frameIndex
    ) {
    	return ma_pulsewave_seek_to_pcm_frame(
    		pWaveform.memorySegment(),
    		frameIndex
    	);
    }
    
    public static int ma_pulsewave_set_amplitude(
    	MemorySegment pWaveform,
    	double amplitude
    ) {
    	MethodHandle method = MA_PULSEWAVE_SET_AMPLITUDE.get();
    	try {
    		return (int) method.invokeExact(
    			pWaveform,
    			amplitude
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pulsewave_set_amplitude].
    public static int ma_pulsewave_set_amplitude(
    	MaPulsewave pWaveform,
    	double amplitude
    ) {
    	return ma_pulsewave_set_amplitude(
    		pWaveform.memorySegment(),
    		amplitude
    	);
    }
    
    public static int ma_pulsewave_set_frequency(
    	MemorySegment pWaveform,
    	double frequency
    ) {
    	MethodHandle method = MA_PULSEWAVE_SET_FREQUENCY.get();
    	try {
    		return (int) method.invokeExact(
    			pWaveform,
    			frequency
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pulsewave_set_frequency].
    public static int ma_pulsewave_set_frequency(
    	MaPulsewave pWaveform,
    	double frequency
    ) {
    	return ma_pulsewave_set_frequency(
    		pWaveform.memorySegment(),
    		frequency
    	);
    }
    
    public static int ma_pulsewave_set_sample_rate(
    	MemorySegment pWaveform,
    	int sampleRate
    ) {
    	MethodHandle method = MA_PULSEWAVE_SET_SAMPLE_RATE.get();
    	try {
    		return (int) method.invokeExact(
    			pWaveform,
    			sampleRate
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pulsewave_set_sample_rate].
    public static int ma_pulsewave_set_sample_rate(
    	MaPulsewave pWaveform,
    	int sampleRate
    ) {
    	return ma_pulsewave_set_sample_rate(
    		pWaveform.memorySegment(),
    		sampleRate
    	);
    }
    
    public static int ma_pulsewave_set_duty_cycle(
    	MemorySegment pWaveform,
    	double dutyCycle
    ) {
    	MethodHandle method = MA_PULSEWAVE_SET_DUTY_CYCLE.get();
    	try {
    		return (int) method.invokeExact(
    			pWaveform,
    			dutyCycle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_pulsewave_set_duty_cycle].
    public static int ma_pulsewave_set_duty_cycle(
    	MaPulsewave pWaveform,
    	double dutyCycle
    ) {
    	return ma_pulsewave_set_duty_cycle(
    		pWaveform.memorySegment(),
    		dutyCycle
    	);
    }
    
    public static MemorySegment nma_noise_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int type,
    	int seed,
    	double amplitude
    ) {
    	MethodHandle method = MA_NOISE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			format,
    			channels,
    			type,
    			seed,
    			amplitude
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_noise_config_init].
    public static @Nullable MaNoiseConfig ma_noise_config_init(
    	SegmentAllocator allocator,
    	int format,
    	int channels,
    	int type,
    	int seed,
    	double amplitude
    ) {
    	MemorySegment segment = nma_noise_config_init(
    		allocator,
    		format,
    		channels,
    		type,
    		seed,
    		amplitude
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaNoiseConfig(segment);
    }
    
    public static int ma_noise_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_NOISE_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_noise_get_heap_size].
    public static int ma_noise_get_heap_size(
    	MaNoiseConfig pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_noise_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_noise_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pNoise
    ) {
    	MethodHandle method = MA_NOISE_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pNoise
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_noise_init_preallocated].
    public static int ma_noise_init_preallocated(
    	MaNoiseConfig pConfig,
    	MemorySegment pHeap,
    	MaNoise pNoise
    ) {
    	return ma_noise_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pNoise.memorySegment()
    	);
    }
    
    public static int ma_noise_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pNoise
    ) {
    	MethodHandle method = MA_NOISE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pNoise
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_noise_init].
    public static int ma_noise_init(
    	MaNoiseConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaNoise pNoise
    ) {
    	return ma_noise_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pNoise.memorySegment()
    	);
    }
    
    public static void ma_noise_uninit(
    	MemorySegment pNoise,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_NOISE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pNoise,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_noise_uninit].
    public static void ma_noise_uninit(
    	MaNoise pNoise,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_noise_uninit(
    		pNoise.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_noise_read_pcm_frames(
    	MemorySegment pNoise,
    	MemorySegment pFramesOut,
    	long frameCount,
    	MemorySegment pFramesRead
    ) {
    	MethodHandle method = MA_NOISE_READ_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pNoise,
    			pFramesOut,
    			frameCount,
    			pFramesRead
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_noise_read_pcm_frames].
    public static int ma_noise_read_pcm_frames(
    	MaNoise pNoise,
    	MemorySegment pFramesOut,
    	long frameCount,
    	NativeLongArray pFramesRead
    ) {
    	return ma_noise_read_pcm_frames(
    		pNoise.memorySegment(),
    		pFramesOut,
    		frameCount,
    		pFramesRead.memorySegment()
    	);
    }
    
    public static int ma_noise_set_amplitude(
    	MemorySegment pNoise,
    	double amplitude
    ) {
    	MethodHandle method = MA_NOISE_SET_AMPLITUDE.get();
    	try {
    		return (int) method.invokeExact(
    			pNoise,
    			amplitude
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_noise_set_amplitude].
    public static int ma_noise_set_amplitude(
    	MaNoise pNoise,
    	double amplitude
    ) {
    	return ma_noise_set_amplitude(
    		pNoise.memorySegment(),
    		amplitude
    	);
    }
    
    public static int ma_noise_set_seed(
    	MemorySegment pNoise,
    	int seed
    ) {
    	MethodHandle method = MA_NOISE_SET_SEED.get();
    	try {
    		return (int) method.invokeExact(
    			pNoise,
    			seed
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_noise_set_seed].
    public static int ma_noise_set_seed(
    	MaNoise pNoise,
    	int seed
    ) {
    	return ma_noise_set_seed(
    		pNoise.memorySegment(),
    		seed
    	);
    }
    
    public static int ma_noise_set_type(
    	MemorySegment pNoise,
    	int type
    ) {
    	MethodHandle method = MA_NOISE_SET_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			pNoise,
    			type
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_noise_set_type].
    public static int ma_noise_set_type(
    	MaNoise pNoise,
    	int type
    ) {
    	return ma_noise_set_type(
    		pNoise.memorySegment(),
    		type
    	);
    }
    
    public static MemorySegment nma_resource_manager_pipeline_notifications_init(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_PIPELINE_NOTIFICATIONS_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_resource_manager_pipeline_notifications_init].
    public static @Nullable MaResourceManagerPipelineNotifications ma_resource_manager_pipeline_notifications_init(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = nma_resource_manager_pipeline_notifications_init(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaResourceManagerPipelineNotifications(segment);
    }
    
    public static MemorySegment nma_resource_manager_data_source_config_init(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_SOURCE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_resource_manager_data_source_config_init].
    public static @Nullable MaResourceManagerDataSourceConfig ma_resource_manager_data_source_config_init(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = nma_resource_manager_data_source_config_init(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaResourceManagerDataSourceConfig(segment);
    }
    
    public static MemorySegment nma_resource_manager_config_init(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_resource_manager_config_init].
    public static @Nullable MaResourceManagerConfig ma_resource_manager_config_init(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = nma_resource_manager_config_init(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaResourceManagerConfig(segment);
    }
    
    public static int ma_resource_manager_init(
    	MemorySegment pConfig,
    	MemorySegment pResourceManager
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pResourceManager
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_init].
    public static int ma_resource_manager_init(
    	MaResourceManagerConfig pConfig,
    	MaResourceManager pResourceManager
    ) {
    	return ma_resource_manager_init(
    		pConfig.memorySegment(),
    		pResourceManager.memorySegment()
    	);
    }
    
    public static void ma_resource_manager_uninit(
    	MemorySegment pResourceManager
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pResourceManager
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_uninit].
    public static void ma_resource_manager_uninit(
    	MaResourceManager pResourceManager
    ) {
    	ma_resource_manager_uninit(
    		pResourceManager.memorySegment()
    	);
    }
    
    public static MemorySegment ma_resource_manager_get_log(
    	MemorySegment pResourceManager
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_GET_LOG.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pResourceManager
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_get_log].
    public static @Nullable MaLog ma_resource_manager_get_log(
    	MaResourceManager pResourceManager
    ) {
    	MemorySegment segment = ma_resource_manager_get_log(
    		pResourceManager.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaLog(segment);
    }
    
    public static int ma_resource_manager_register_file(
    	MemorySegment pResourceManager,
    	MemorySegment pFilePath,
    	int flags
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_REGISTER_FILE.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pFilePath,
    			flags
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_register_file].
    public static int ma_resource_manager_register_file(
    	MaResourceManager pResourceManager,
    	String pFilePath,
    	int flags
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_resource_manager_register_file(
    			pResourceManager.memorySegment(),
    			arena.allocateFrom(pFilePath),
    			flags
    		);
    	}
    }
    
    public static int ma_resource_manager_register_file_w(
    	MemorySegment pResourceManager,
    	MemorySegment pFilePath,
    	int flags
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_REGISTER_FILE_W.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pFilePath,
    			flags
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_register_file_w].
    public static int ma_resource_manager_register_file_w(
    	MaResourceManager pResourceManager,
    	NativeShortArray pFilePath,
    	int flags
    ) {
    	return ma_resource_manager_register_file_w(
    		pResourceManager.memorySegment(),
    		pFilePath.memorySegment(),
    		flags
    	);
    }
    
    public static int ma_resource_manager_register_decoded_data(
    	MemorySegment pResourceManager,
    	MemorySegment pName,
    	MemorySegment pData,
    	long frameCount,
    	int format,
    	int channels,
    	int sampleRate
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_REGISTER_DECODED_DATA.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pName,
    			pData,
    			frameCount,
    			format,
    			channels,
    			sampleRate
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_register_decoded_data].
    public static int ma_resource_manager_register_decoded_data(
    	MaResourceManager pResourceManager,
    	String pName,
    	MemorySegment pData,
    	long frameCount,
    	int format,
    	int channels,
    	int sampleRate
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_resource_manager_register_decoded_data(
    			pResourceManager.memorySegment(),
    			arena.allocateFrom(pName),
    			pData,
    			frameCount,
    			format,
    			channels,
    			sampleRate
    		);
    	}
    }
    
    public static int ma_resource_manager_register_decoded_data_w(
    	MemorySegment pResourceManager,
    	MemorySegment pName,
    	MemorySegment pData,
    	long frameCount,
    	int format,
    	int channels,
    	int sampleRate
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_REGISTER_DECODED_DATA_W.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pName,
    			pData,
    			frameCount,
    			format,
    			channels,
    			sampleRate
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_register_decoded_data_w].
    public static int ma_resource_manager_register_decoded_data_w(
    	MaResourceManager pResourceManager,
    	NativeShortArray pName,
    	MemorySegment pData,
    	long frameCount,
    	int format,
    	int channels,
    	int sampleRate
    ) {
    	return ma_resource_manager_register_decoded_data_w(
    		pResourceManager.memorySegment(),
    		pName.memorySegment(),
    		pData,
    		frameCount,
    		format,
    		channels,
    		sampleRate
    	);
    }
    
    public static int ma_resource_manager_register_encoded_data(
    	MemorySegment pResourceManager,
    	MemorySegment pName,
    	MemorySegment pData,
    	long sizeInBytes
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_REGISTER_ENCODED_DATA.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pName,
    			pData,
    			sizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_register_encoded_data].
    public static int ma_resource_manager_register_encoded_data(
    	MaResourceManager pResourceManager,
    	String pName,
    	MemorySegment pData,
    	long sizeInBytes
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_resource_manager_register_encoded_data(
    			pResourceManager.memorySegment(),
    			arena.allocateFrom(pName),
    			pData,
    			sizeInBytes
    		);
    	}
    }
    
    public static int ma_resource_manager_register_encoded_data_w(
    	MemorySegment pResourceManager,
    	MemorySegment pName,
    	MemorySegment pData,
    	long sizeInBytes
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_REGISTER_ENCODED_DATA_W.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pName,
    			pData,
    			sizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_register_encoded_data_w].
    public static int ma_resource_manager_register_encoded_data_w(
    	MaResourceManager pResourceManager,
    	NativeShortArray pName,
    	MemorySegment pData,
    	long sizeInBytes
    ) {
    	return ma_resource_manager_register_encoded_data_w(
    		pResourceManager.memorySegment(),
    		pName.memorySegment(),
    		pData,
    		sizeInBytes
    	);
    }
    
    public static int ma_resource_manager_unregister_file(
    	MemorySegment pResourceManager,
    	MemorySegment pFilePath
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_UNREGISTER_FILE.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pFilePath
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_unregister_file].
    public static int ma_resource_manager_unregister_file(
    	MaResourceManager pResourceManager,
    	String pFilePath
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_resource_manager_unregister_file(
    			pResourceManager.memorySegment(),
    			arena.allocateFrom(pFilePath)
    		);
    	}
    }
    
    public static int ma_resource_manager_unregister_file_w(
    	MemorySegment pResourceManager,
    	MemorySegment pFilePath
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_UNREGISTER_FILE_W.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pFilePath
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_unregister_file_w].
    public static int ma_resource_manager_unregister_file_w(
    	MaResourceManager pResourceManager,
    	NativeShortArray pFilePath
    ) {
    	return ma_resource_manager_unregister_file_w(
    		pResourceManager.memorySegment(),
    		pFilePath.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_unregister_data(
    	MemorySegment pResourceManager,
    	MemorySegment pName
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_UNREGISTER_DATA.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pName
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_unregister_data].
    public static int ma_resource_manager_unregister_data(
    	MaResourceManager pResourceManager,
    	String pName
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_resource_manager_unregister_data(
    			pResourceManager.memorySegment(),
    			arena.allocateFrom(pName)
    		);
    	}
    }
    
    public static int ma_resource_manager_unregister_data_w(
    	MemorySegment pResourceManager,
    	MemorySegment pName
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_UNREGISTER_DATA_W.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pName
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_unregister_data_w].
    public static int ma_resource_manager_unregister_data_w(
    	MaResourceManager pResourceManager,
    	NativeShortArray pName
    ) {
    	return ma_resource_manager_unregister_data_w(
    		pResourceManager.memorySegment(),
    		pName.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_buffer_init_ex(
    	MemorySegment pResourceManager,
    	MemorySegment pConfig,
    	MemorySegment pDataBuffer
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_BUFFER_INIT_EX.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pConfig,
    			pDataBuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_buffer_init_ex].
    public static int ma_resource_manager_data_buffer_init_ex(
    	MaResourceManager pResourceManager,
    	MaResourceManagerDataSourceConfig pConfig,
    	MaResourceManagerDataBuffer pDataBuffer
    ) {
    	return ma_resource_manager_data_buffer_init_ex(
    		pResourceManager.memorySegment(),
    		pConfig.memorySegment(),
    		pDataBuffer.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_buffer_init(
    	MemorySegment pResourceManager,
    	MemorySegment pFilePath,
    	int flags,
    	MemorySegment pNotifications,
    	MemorySegment pDataBuffer
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_BUFFER_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pFilePath,
    			flags,
    			pNotifications,
    			pDataBuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_buffer_init].
    public static int ma_resource_manager_data_buffer_init(
    	MaResourceManager pResourceManager,
    	String pFilePath,
    	int flags,
    	MaResourceManagerPipelineNotifications pNotifications,
    	MaResourceManagerDataBuffer pDataBuffer
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_resource_manager_data_buffer_init(
    			pResourceManager.memorySegment(),
    			arena.allocateFrom(pFilePath),
    			flags,
    			pNotifications.memorySegment(),
    			pDataBuffer.memorySegment()
    		);
    	}
    }
    
    public static int ma_resource_manager_data_buffer_init_w(
    	MemorySegment pResourceManager,
    	MemorySegment pFilePath,
    	int flags,
    	MemorySegment pNotifications,
    	MemorySegment pDataBuffer
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_BUFFER_INIT_W.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pFilePath,
    			flags,
    			pNotifications,
    			pDataBuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_buffer_init_w].
    public static int ma_resource_manager_data_buffer_init_w(
    	MaResourceManager pResourceManager,
    	NativeShortArray pFilePath,
    	int flags,
    	MaResourceManagerPipelineNotifications pNotifications,
    	MaResourceManagerDataBuffer pDataBuffer
    ) {
    	return ma_resource_manager_data_buffer_init_w(
    		pResourceManager.memorySegment(),
    		pFilePath.memorySegment(),
    		flags,
    		pNotifications.memorySegment(),
    		pDataBuffer.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_buffer_init_copy(
    	MemorySegment pResourceManager,
    	MemorySegment pExistingDataBuffer,
    	MemorySegment pDataBuffer
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_BUFFER_INIT_COPY.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pExistingDataBuffer,
    			pDataBuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_buffer_init_copy].
    public static int ma_resource_manager_data_buffer_init_copy(
    	MaResourceManager pResourceManager,
    	MaResourceManagerDataBuffer pExistingDataBuffer,
    	MaResourceManagerDataBuffer pDataBuffer
    ) {
    	return ma_resource_manager_data_buffer_init_copy(
    		pResourceManager.memorySegment(),
    		pExistingDataBuffer.memorySegment(),
    		pDataBuffer.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_buffer_uninit(
    	MemorySegment pDataBuffer
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_BUFFER_UNINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pDataBuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_buffer_uninit].
    public static int ma_resource_manager_data_buffer_uninit(
    	MaResourceManagerDataBuffer pDataBuffer
    ) {
    	return ma_resource_manager_data_buffer_uninit(
    		pDataBuffer.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_buffer_read_pcm_frames(
    	MemorySegment pDataBuffer,
    	MemorySegment pFramesOut,
    	long frameCount,
    	MemorySegment pFramesRead
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_BUFFER_READ_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDataBuffer,
    			pFramesOut,
    			frameCount,
    			pFramesRead
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_buffer_read_pcm_frames].
    public static int ma_resource_manager_data_buffer_read_pcm_frames(
    	MaResourceManagerDataBuffer pDataBuffer,
    	MemorySegment pFramesOut,
    	long frameCount,
    	NativeLongArray pFramesRead
    ) {
    	return ma_resource_manager_data_buffer_read_pcm_frames(
    		pDataBuffer.memorySegment(),
    		pFramesOut,
    		frameCount,
    		pFramesRead.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_buffer_seek_to_pcm_frame(
    	MemorySegment pDataBuffer,
    	long frameIndex
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_BUFFER_SEEK_TO_PCM_FRAME.get();
    	try {
    		return (int) method.invokeExact(
    			pDataBuffer,
    			frameIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_buffer_seek_to_pcm_frame].
    public static int ma_resource_manager_data_buffer_seek_to_pcm_frame(
    	MaResourceManagerDataBuffer pDataBuffer,
    	long frameIndex
    ) {
    	return ma_resource_manager_data_buffer_seek_to_pcm_frame(
    		pDataBuffer.memorySegment(),
    		frameIndex
    	);
    }
    
    public static int ma_resource_manager_data_buffer_get_data_format(
    	MemorySegment pDataBuffer,
    	MemorySegment pFormat,
    	MemorySegment pChannels,
    	MemorySegment pSampleRate,
    	MemorySegment pChannelMap,
    	long channelMapCap
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_BUFFER_GET_DATA_FORMAT.get();
    	try {
    		return (int) method.invokeExact(
    			pDataBuffer,
    			pFormat,
    			pChannels,
    			pSampleRate,
    			pChannelMap,
    			channelMapCap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_buffer_get_data_format].
    public static int ma_resource_manager_data_buffer_get_data_format(
    	MaResourceManagerDataBuffer pDataBuffer,
    	NativeIntArray pFormat,
    	NativeIntArray pChannels,
    	NativeIntArray pSampleRate,
    	NativeByteArray pChannelMap,
    	long channelMapCap
    ) {
    	return ma_resource_manager_data_buffer_get_data_format(
    		pDataBuffer.memorySegment(),
    		pFormat.memorySegment(),
    		pChannels.memorySegment(),
    		pSampleRate.memorySegment(),
    		pChannelMap.memorySegment(),
    		channelMapCap
    	);
    }
    
    public static int ma_resource_manager_data_buffer_get_cursor_in_pcm_frames(
    	MemorySegment pDataBuffer,
    	MemorySegment pCursor
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_BUFFER_GET_CURSOR_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDataBuffer,
    			pCursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_buffer_get_cursor_in_pcm_frames].
    public static int ma_resource_manager_data_buffer_get_cursor_in_pcm_frames(
    	MaResourceManagerDataBuffer pDataBuffer,
    	NativeLongArray pCursor
    ) {
    	return ma_resource_manager_data_buffer_get_cursor_in_pcm_frames(
    		pDataBuffer.memorySegment(),
    		pCursor.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_buffer_get_length_in_pcm_frames(
    	MemorySegment pDataBuffer,
    	MemorySegment pLength
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_BUFFER_GET_LENGTH_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDataBuffer,
    			pLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_buffer_get_length_in_pcm_frames].
    public static int ma_resource_manager_data_buffer_get_length_in_pcm_frames(
    	MaResourceManagerDataBuffer pDataBuffer,
    	NativeLongArray pLength
    ) {
    	return ma_resource_manager_data_buffer_get_length_in_pcm_frames(
    		pDataBuffer.memorySegment(),
    		pLength.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_buffer_result(
    	MemorySegment pDataBuffer
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_BUFFER_RESULT.get();
    	try {
    		return (int) method.invokeExact(
    			pDataBuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_buffer_result].
    public static int ma_resource_manager_data_buffer_result(
    	MaResourceManagerDataBuffer pDataBuffer
    ) {
    	return ma_resource_manager_data_buffer_result(
    		pDataBuffer.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_buffer_set_looping(
    	MemorySegment pDataBuffer,
    	int isLooping
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_BUFFER_SET_LOOPING.get();
    	try {
    		return (int) method.invokeExact(
    			pDataBuffer,
    			isLooping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_buffer_set_looping].
    public static int ma_resource_manager_data_buffer_set_looping(
    	MaResourceManagerDataBuffer pDataBuffer,
    	int isLooping
    ) {
    	return ma_resource_manager_data_buffer_set_looping(
    		pDataBuffer.memorySegment(),
    		isLooping
    	);
    }
    
    public static int ma_resource_manager_data_buffer_is_looping(
    	MemorySegment pDataBuffer
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_BUFFER_IS_LOOPING.get();
    	try {
    		return (int) method.invokeExact(
    			pDataBuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_buffer_is_looping].
    public static int ma_resource_manager_data_buffer_is_looping(
    	MaResourceManagerDataBuffer pDataBuffer
    ) {
    	return ma_resource_manager_data_buffer_is_looping(
    		pDataBuffer.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_buffer_get_available_frames(
    	MemorySegment pDataBuffer,
    	MemorySegment pAvailableFrames
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_BUFFER_GET_AVAILABLE_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDataBuffer,
    			pAvailableFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_buffer_get_available_frames].
    public static int ma_resource_manager_data_buffer_get_available_frames(
    	MaResourceManagerDataBuffer pDataBuffer,
    	NativeLongArray pAvailableFrames
    ) {
    	return ma_resource_manager_data_buffer_get_available_frames(
    		pDataBuffer.memorySegment(),
    		pAvailableFrames.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_stream_init_ex(
    	MemorySegment pResourceManager,
    	MemorySegment pConfig,
    	MemorySegment pDataStream
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_STREAM_INIT_EX.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pConfig,
    			pDataStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_stream_init_ex].
    public static int ma_resource_manager_data_stream_init_ex(
    	MaResourceManager pResourceManager,
    	MaResourceManagerDataSourceConfig pConfig,
    	MaResourceManagerDataStream pDataStream
    ) {
    	return ma_resource_manager_data_stream_init_ex(
    		pResourceManager.memorySegment(),
    		pConfig.memorySegment(),
    		pDataStream.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_stream_init(
    	MemorySegment pResourceManager,
    	MemorySegment pFilePath,
    	int flags,
    	MemorySegment pNotifications,
    	MemorySegment pDataStream
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_STREAM_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pFilePath,
    			flags,
    			pNotifications,
    			pDataStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_stream_init].
    public static int ma_resource_manager_data_stream_init(
    	MaResourceManager pResourceManager,
    	String pFilePath,
    	int flags,
    	MaResourceManagerPipelineNotifications pNotifications,
    	MaResourceManagerDataStream pDataStream
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_resource_manager_data_stream_init(
    			pResourceManager.memorySegment(),
    			arena.allocateFrom(pFilePath),
    			flags,
    			pNotifications.memorySegment(),
    			pDataStream.memorySegment()
    		);
    	}
    }
    
    public static int ma_resource_manager_data_stream_init_w(
    	MemorySegment pResourceManager,
    	MemorySegment pFilePath,
    	int flags,
    	MemorySegment pNotifications,
    	MemorySegment pDataStream
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_STREAM_INIT_W.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pFilePath,
    			flags,
    			pNotifications,
    			pDataStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_stream_init_w].
    public static int ma_resource_manager_data_stream_init_w(
    	MaResourceManager pResourceManager,
    	NativeShortArray pFilePath,
    	int flags,
    	MaResourceManagerPipelineNotifications pNotifications,
    	MaResourceManagerDataStream pDataStream
    ) {
    	return ma_resource_manager_data_stream_init_w(
    		pResourceManager.memorySegment(),
    		pFilePath.memorySegment(),
    		flags,
    		pNotifications.memorySegment(),
    		pDataStream.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_stream_uninit(
    	MemorySegment pDataStream
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_STREAM_UNINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pDataStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_stream_uninit].
    public static int ma_resource_manager_data_stream_uninit(
    	MaResourceManagerDataStream pDataStream
    ) {
    	return ma_resource_manager_data_stream_uninit(
    		pDataStream.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_stream_read_pcm_frames(
    	MemorySegment pDataStream,
    	MemorySegment pFramesOut,
    	long frameCount,
    	MemorySegment pFramesRead
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_STREAM_READ_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDataStream,
    			pFramesOut,
    			frameCount,
    			pFramesRead
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_stream_read_pcm_frames].
    public static int ma_resource_manager_data_stream_read_pcm_frames(
    	MaResourceManagerDataStream pDataStream,
    	MemorySegment pFramesOut,
    	long frameCount,
    	NativeLongArray pFramesRead
    ) {
    	return ma_resource_manager_data_stream_read_pcm_frames(
    		pDataStream.memorySegment(),
    		pFramesOut,
    		frameCount,
    		pFramesRead.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_stream_seek_to_pcm_frame(
    	MemorySegment pDataStream,
    	long frameIndex
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_STREAM_SEEK_TO_PCM_FRAME.get();
    	try {
    		return (int) method.invokeExact(
    			pDataStream,
    			frameIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_stream_seek_to_pcm_frame].
    public static int ma_resource_manager_data_stream_seek_to_pcm_frame(
    	MaResourceManagerDataStream pDataStream,
    	long frameIndex
    ) {
    	return ma_resource_manager_data_stream_seek_to_pcm_frame(
    		pDataStream.memorySegment(),
    		frameIndex
    	);
    }
    
    public static int ma_resource_manager_data_stream_get_data_format(
    	MemorySegment pDataStream,
    	MemorySegment pFormat,
    	MemorySegment pChannels,
    	MemorySegment pSampleRate,
    	MemorySegment pChannelMap,
    	long channelMapCap
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_STREAM_GET_DATA_FORMAT.get();
    	try {
    		return (int) method.invokeExact(
    			pDataStream,
    			pFormat,
    			pChannels,
    			pSampleRate,
    			pChannelMap,
    			channelMapCap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_stream_get_data_format].
    public static int ma_resource_manager_data_stream_get_data_format(
    	MaResourceManagerDataStream pDataStream,
    	NativeIntArray pFormat,
    	NativeIntArray pChannels,
    	NativeIntArray pSampleRate,
    	NativeByteArray pChannelMap,
    	long channelMapCap
    ) {
    	return ma_resource_manager_data_stream_get_data_format(
    		pDataStream.memorySegment(),
    		pFormat.memorySegment(),
    		pChannels.memorySegment(),
    		pSampleRate.memorySegment(),
    		pChannelMap.memorySegment(),
    		channelMapCap
    	);
    }
    
    public static int ma_resource_manager_data_stream_get_cursor_in_pcm_frames(
    	MemorySegment pDataStream,
    	MemorySegment pCursor
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_STREAM_GET_CURSOR_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDataStream,
    			pCursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_stream_get_cursor_in_pcm_frames].
    public static int ma_resource_manager_data_stream_get_cursor_in_pcm_frames(
    	MaResourceManagerDataStream pDataStream,
    	NativeLongArray pCursor
    ) {
    	return ma_resource_manager_data_stream_get_cursor_in_pcm_frames(
    		pDataStream.memorySegment(),
    		pCursor.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_stream_get_length_in_pcm_frames(
    	MemorySegment pDataStream,
    	MemorySegment pLength
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_STREAM_GET_LENGTH_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDataStream,
    			pLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_stream_get_length_in_pcm_frames].
    public static int ma_resource_manager_data_stream_get_length_in_pcm_frames(
    	MaResourceManagerDataStream pDataStream,
    	NativeLongArray pLength
    ) {
    	return ma_resource_manager_data_stream_get_length_in_pcm_frames(
    		pDataStream.memorySegment(),
    		pLength.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_stream_result(
    	MemorySegment pDataStream
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_STREAM_RESULT.get();
    	try {
    		return (int) method.invokeExact(
    			pDataStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_stream_result].
    public static int ma_resource_manager_data_stream_result(
    	MaResourceManagerDataStream pDataStream
    ) {
    	return ma_resource_manager_data_stream_result(
    		pDataStream.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_stream_set_looping(
    	MemorySegment pDataStream,
    	int isLooping
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_STREAM_SET_LOOPING.get();
    	try {
    		return (int) method.invokeExact(
    			pDataStream,
    			isLooping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_stream_set_looping].
    public static int ma_resource_manager_data_stream_set_looping(
    	MaResourceManagerDataStream pDataStream,
    	int isLooping
    ) {
    	return ma_resource_manager_data_stream_set_looping(
    		pDataStream.memorySegment(),
    		isLooping
    	);
    }
    
    public static int ma_resource_manager_data_stream_is_looping(
    	MemorySegment pDataStream
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_STREAM_IS_LOOPING.get();
    	try {
    		return (int) method.invokeExact(
    			pDataStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_stream_is_looping].
    public static int ma_resource_manager_data_stream_is_looping(
    	MaResourceManagerDataStream pDataStream
    ) {
    	return ma_resource_manager_data_stream_is_looping(
    		pDataStream.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_stream_get_available_frames(
    	MemorySegment pDataStream,
    	MemorySegment pAvailableFrames
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_STREAM_GET_AVAILABLE_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDataStream,
    			pAvailableFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_stream_get_available_frames].
    public static int ma_resource_manager_data_stream_get_available_frames(
    	MaResourceManagerDataStream pDataStream,
    	NativeLongArray pAvailableFrames
    ) {
    	return ma_resource_manager_data_stream_get_available_frames(
    		pDataStream.memorySegment(),
    		pAvailableFrames.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_source_init_ex(
    	MemorySegment pResourceManager,
    	MemorySegment pConfig,
    	MemorySegment pDataSource
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_SOURCE_INIT_EX.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pConfig,
    			pDataSource
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_source_init_ex].
    public static int ma_resource_manager_data_source_init_ex(
    	MaResourceManager pResourceManager,
    	MaResourceManagerDataSourceConfig pConfig,
    	MaResourceManagerDataSource pDataSource
    ) {
    	return ma_resource_manager_data_source_init_ex(
    		pResourceManager.memorySegment(),
    		pConfig.memorySegment(),
    		pDataSource.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_source_init(
    	MemorySegment pResourceManager,
    	MemorySegment pName,
    	int flags,
    	MemorySegment pNotifications,
    	MemorySegment pDataSource
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_SOURCE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pName,
    			flags,
    			pNotifications,
    			pDataSource
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_source_init].
    public static int ma_resource_manager_data_source_init(
    	MaResourceManager pResourceManager,
    	String pName,
    	int flags,
    	MaResourceManagerPipelineNotifications pNotifications,
    	MaResourceManagerDataSource pDataSource
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_resource_manager_data_source_init(
    			pResourceManager.memorySegment(),
    			arena.allocateFrom(pName),
    			flags,
    			pNotifications.memorySegment(),
    			pDataSource.memorySegment()
    		);
    	}
    }
    
    public static int ma_resource_manager_data_source_init_w(
    	MemorySegment pResourceManager,
    	MemorySegment pName,
    	int flags,
    	MemorySegment pNotifications,
    	MemorySegment pDataSource
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_SOURCE_INIT_W.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pName,
    			flags,
    			pNotifications,
    			pDataSource
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_source_init_w].
    public static int ma_resource_manager_data_source_init_w(
    	MaResourceManager pResourceManager,
    	NativeShortArray pName,
    	int flags,
    	MaResourceManagerPipelineNotifications pNotifications,
    	MaResourceManagerDataSource pDataSource
    ) {
    	return ma_resource_manager_data_source_init_w(
    		pResourceManager.memorySegment(),
    		pName.memorySegment(),
    		flags,
    		pNotifications.memorySegment(),
    		pDataSource.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_source_init_copy(
    	MemorySegment pResourceManager,
    	MemorySegment pExistingDataSource,
    	MemorySegment pDataSource
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_SOURCE_INIT_COPY.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pExistingDataSource,
    			pDataSource
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_source_init_copy].
    public static int ma_resource_manager_data_source_init_copy(
    	MaResourceManager pResourceManager,
    	MaResourceManagerDataSource pExistingDataSource,
    	MaResourceManagerDataSource pDataSource
    ) {
    	return ma_resource_manager_data_source_init_copy(
    		pResourceManager.memorySegment(),
    		pExistingDataSource.memorySegment(),
    		pDataSource.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_source_uninit(
    	MemorySegment pDataSource
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_SOURCE_UNINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_source_uninit].
    public static int ma_resource_manager_data_source_uninit(
    	MaResourceManagerDataSource pDataSource
    ) {
    	return ma_resource_manager_data_source_uninit(
    		pDataSource.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_source_read_pcm_frames(
    	MemorySegment pDataSource,
    	MemorySegment pFramesOut,
    	long frameCount,
    	MemorySegment pFramesRead
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_SOURCE_READ_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			pFramesOut,
    			frameCount,
    			pFramesRead
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_source_read_pcm_frames].
    public static int ma_resource_manager_data_source_read_pcm_frames(
    	MaResourceManagerDataSource pDataSource,
    	MemorySegment pFramesOut,
    	long frameCount,
    	NativeLongArray pFramesRead
    ) {
    	return ma_resource_manager_data_source_read_pcm_frames(
    		pDataSource.memorySegment(),
    		pFramesOut,
    		frameCount,
    		pFramesRead.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_source_seek_to_pcm_frame(
    	MemorySegment pDataSource,
    	long frameIndex
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_SOURCE_SEEK_TO_PCM_FRAME.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			frameIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_source_seek_to_pcm_frame].
    public static int ma_resource_manager_data_source_seek_to_pcm_frame(
    	MaResourceManagerDataSource pDataSource,
    	long frameIndex
    ) {
    	return ma_resource_manager_data_source_seek_to_pcm_frame(
    		pDataSource.memorySegment(),
    		frameIndex
    	);
    }
    
    public static int ma_resource_manager_data_source_get_data_format(
    	MemorySegment pDataSource,
    	MemorySegment pFormat,
    	MemorySegment pChannels,
    	MemorySegment pSampleRate,
    	MemorySegment pChannelMap,
    	long channelMapCap
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_SOURCE_GET_DATA_FORMAT.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			pFormat,
    			pChannels,
    			pSampleRate,
    			pChannelMap,
    			channelMapCap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_source_get_data_format].
    public static int ma_resource_manager_data_source_get_data_format(
    	MaResourceManagerDataSource pDataSource,
    	NativeIntArray pFormat,
    	NativeIntArray pChannels,
    	NativeIntArray pSampleRate,
    	NativeByteArray pChannelMap,
    	long channelMapCap
    ) {
    	return ma_resource_manager_data_source_get_data_format(
    		pDataSource.memorySegment(),
    		pFormat.memorySegment(),
    		pChannels.memorySegment(),
    		pSampleRate.memorySegment(),
    		pChannelMap.memorySegment(),
    		channelMapCap
    	);
    }
    
    public static int ma_resource_manager_data_source_get_cursor_in_pcm_frames(
    	MemorySegment pDataSource,
    	MemorySegment pCursor
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_SOURCE_GET_CURSOR_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			pCursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_source_get_cursor_in_pcm_frames].
    public static int ma_resource_manager_data_source_get_cursor_in_pcm_frames(
    	MaResourceManagerDataSource pDataSource,
    	NativeLongArray pCursor
    ) {
    	return ma_resource_manager_data_source_get_cursor_in_pcm_frames(
    		pDataSource.memorySegment(),
    		pCursor.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_source_get_length_in_pcm_frames(
    	MemorySegment pDataSource,
    	MemorySegment pLength
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_SOURCE_GET_LENGTH_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			pLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_source_get_length_in_pcm_frames].
    public static int ma_resource_manager_data_source_get_length_in_pcm_frames(
    	MaResourceManagerDataSource pDataSource,
    	NativeLongArray pLength
    ) {
    	return ma_resource_manager_data_source_get_length_in_pcm_frames(
    		pDataSource.memorySegment(),
    		pLength.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_source_result(
    	MemorySegment pDataSource
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_SOURCE_RESULT.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_source_result].
    public static int ma_resource_manager_data_source_result(
    	MaResourceManagerDataSource pDataSource
    ) {
    	return ma_resource_manager_data_source_result(
    		pDataSource.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_source_set_looping(
    	MemorySegment pDataSource,
    	int isLooping
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_SOURCE_SET_LOOPING.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			isLooping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_source_set_looping].
    public static int ma_resource_manager_data_source_set_looping(
    	MaResourceManagerDataSource pDataSource,
    	int isLooping
    ) {
    	return ma_resource_manager_data_source_set_looping(
    		pDataSource.memorySegment(),
    		isLooping
    	);
    }
    
    public static int ma_resource_manager_data_source_is_looping(
    	MemorySegment pDataSource
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_SOURCE_IS_LOOPING.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_source_is_looping].
    public static int ma_resource_manager_data_source_is_looping(
    	MaResourceManagerDataSource pDataSource
    ) {
    	return ma_resource_manager_data_source_is_looping(
    		pDataSource.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_data_source_get_available_frames(
    	MemorySegment pDataSource,
    	MemorySegment pAvailableFrames
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_DATA_SOURCE_GET_AVAILABLE_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSource,
    			pAvailableFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_data_source_get_available_frames].
    public static int ma_resource_manager_data_source_get_available_frames(
    	MaResourceManagerDataSource pDataSource,
    	NativeLongArray pAvailableFrames
    ) {
    	return ma_resource_manager_data_source_get_available_frames(
    		pDataSource.memorySegment(),
    		pAvailableFrames.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_post_job(
    	MemorySegment pResourceManager,
    	MemorySegment pJob
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_POST_JOB.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pJob
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_post_job].
    public static int ma_resource_manager_post_job(
    	MaResourceManager pResourceManager,
    	MaJob pJob
    ) {
    	return ma_resource_manager_post_job(
    		pResourceManager.memorySegment(),
    		pJob.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_post_job_quit(
    	MemorySegment pResourceManager
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_POST_JOB_QUIT.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_post_job_quit].
    public static int ma_resource_manager_post_job_quit(
    	MaResourceManager pResourceManager
    ) {
    	return ma_resource_manager_post_job_quit(
    		pResourceManager.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_next_job(
    	MemorySegment pResourceManager,
    	MemorySegment pJob
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_NEXT_JOB.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pJob
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_next_job].
    public static int ma_resource_manager_next_job(
    	MaResourceManager pResourceManager,
    	MaJob pJob
    ) {
    	return ma_resource_manager_next_job(
    		pResourceManager.memorySegment(),
    		pJob.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_process_job(
    	MemorySegment pResourceManager,
    	MemorySegment pJob
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_PROCESS_JOB.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager,
    			pJob
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_process_job].
    public static int ma_resource_manager_process_job(
    	MaResourceManager pResourceManager,
    	MaJob pJob
    ) {
    	return ma_resource_manager_process_job(
    		pResourceManager.memorySegment(),
    		pJob.memorySegment()
    	);
    }
    
    public static int ma_resource_manager_process_next_job(
    	MemorySegment pResourceManager
    ) {
    	MethodHandle method = MA_RESOURCE_MANAGER_PROCESS_NEXT_JOB.get();
    	try {
    		return (int) method.invokeExact(
    			pResourceManager
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_resource_manager_process_next_job].
    public static int ma_resource_manager_process_next_job(
    	MaResourceManager pResourceManager
    ) {
    	return ma_resource_manager_process_next_job(
    		pResourceManager.memorySegment()
    	);
    }
    
    public static MemorySegment nma_node_config_init(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = MA_NODE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_node_config_init].
    public static @Nullable MaNodeConfig ma_node_config_init(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = nma_node_config_init(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaNodeConfig(segment);
    }
    
    public static int ma_node_get_heap_size(
    	MemorySegment pNodeGraph,
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_NODE_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pNodeGraph,
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_node_get_heap_size].
    public static int ma_node_get_heap_size(
    	MaNodeGraph pNodeGraph,
    	MaNodeConfig pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_node_get_heap_size(
    		pNodeGraph.memorySegment(),
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_node_init_preallocated(
    	MemorySegment pNodeGraph,
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_NODE_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pNodeGraph,
    			pConfig,
    			pHeap,
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_node_init_preallocated].
    public static int ma_node_init_preallocated(
    	MaNodeGraph pNodeGraph,
    	MaNodeConfig pConfig,
    	MemorySegment pHeap,
    	MemorySegment pNode
    ) {
    	return ma_node_init_preallocated(
    		pNodeGraph.memorySegment(),
    		pConfig.memorySegment(),
    		pHeap,
    		pNode
    	);
    }
    
    public static int ma_node_init(
    	MemorySegment pNodeGraph,
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_NODE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pNodeGraph,
    			pConfig,
    			pAllocationCallbacks,
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_node_init].
    public static int ma_node_init(
    	MaNodeGraph pNodeGraph,
    	MaNodeConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MemorySegment pNode
    ) {
    	return ma_node_init(
    		pNodeGraph.memorySegment(),
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pNode
    	);
    }
    
    public static void ma_node_uninit(
    	MemorySegment pNode,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_NODE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pNode,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_node_uninit].
    public static void ma_node_uninit(
    	MemorySegment pNode,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_node_uninit(
    		pNode,
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static MemorySegment nma_node_get_node_graph(
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_NODE_GET_NODE_GRAPH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_node_get_node_graph].
    public static @Nullable MaNodeGraph ma_node_get_node_graph(
    	MemorySegment pNode
    ) {
    	MemorySegment segment = nma_node_get_node_graph(
    		pNode
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaNodeGraph(segment);
    }
    
    public static int ma_node_get_input_bus_count(
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_NODE_GET_INPUT_BUS_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_node_get_output_bus_count(
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_NODE_GET_OUTPUT_BUS_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_node_get_input_channels(
    	MemorySegment pNode,
    	int inputBusIndex
    ) {
    	MethodHandle method = MA_NODE_GET_INPUT_CHANNELS.get();
    	try {
    		return (int) method.invokeExact(
    			pNode,
    			inputBusIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_node_get_output_channels(
    	MemorySegment pNode,
    	int outputBusIndex
    ) {
    	MethodHandle method = MA_NODE_GET_OUTPUT_CHANNELS.get();
    	try {
    		return (int) method.invokeExact(
    			pNode,
    			outputBusIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_node_attach_output_bus(
    	MemorySegment pNode,
    	int outputBusIndex,
    	MemorySegment pOtherNode,
    	int otherNodeInputBusIndex
    ) {
    	MethodHandle method = MA_NODE_ATTACH_OUTPUT_BUS.get();
    	try {
    		return (int) method.invokeExact(
    			pNode,
    			outputBusIndex,
    			pOtherNode,
    			otherNodeInputBusIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_node_detach_output_bus(
    	MemorySegment pNode,
    	int outputBusIndex
    ) {
    	MethodHandle method = MA_NODE_DETACH_OUTPUT_BUS.get();
    	try {
    		return (int) method.invokeExact(
    			pNode,
    			outputBusIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_node_detach_all_output_buses(
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_NODE_DETACH_ALL_OUTPUT_BUSES.get();
    	try {
    		return (int) method.invokeExact(
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_node_set_output_bus_volume(
    	MemorySegment pNode,
    	int outputBusIndex,
    	float volume
    ) {
    	MethodHandle method = MA_NODE_SET_OUTPUT_BUS_VOLUME.get();
    	try {
    		return (int) method.invokeExact(
    			pNode,
    			outputBusIndex,
    			volume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static float ma_node_get_output_bus_volume(
    	MemorySegment pNode,
    	int outputBusIndex
    ) {
    	MethodHandle method = MA_NODE_GET_OUTPUT_BUS_VOLUME.get();
    	try {
    		return (float) method.invokeExact(
    			pNode,
    			outputBusIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_node_set_state(
    	MemorySegment pNode,
    	int state
    ) {
    	MethodHandle method = MA_NODE_SET_STATE.get();
    	try {
    		return (int) method.invokeExact(
    			pNode,
    			state
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_node_get_state(
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_NODE_GET_STATE.get();
    	try {
    		return (int) method.invokeExact(
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_node_set_state_time(
    	MemorySegment pNode,
    	int state,
    	long globalTime
    ) {
    	MethodHandle method = MA_NODE_SET_STATE_TIME.get();
    	try {
    		return (int) method.invokeExact(
    			pNode,
    			state,
    			globalTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static long ma_node_get_state_time(
    	MemorySegment pNode,
    	int state
    ) {
    	MethodHandle method = MA_NODE_GET_STATE_TIME.get();
    	try {
    		return (long) method.invokeExact(
    			pNode,
    			state
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_node_get_state_by_time(
    	MemorySegment pNode,
    	long globalTime
    ) {
    	MethodHandle method = MA_NODE_GET_STATE_BY_TIME.get();
    	try {
    		return (int) method.invokeExact(
    			pNode,
    			globalTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_node_get_state_by_time_range(
    	MemorySegment pNode,
    	long globalTimeBeg,
    	long globalTimeEnd
    ) {
    	MethodHandle method = MA_NODE_GET_STATE_BY_TIME_RANGE.get();
    	try {
    		return (int) method.invokeExact(
    			pNode,
    			globalTimeBeg,
    			globalTimeEnd
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static long ma_node_get_time(
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_NODE_GET_TIME.get();
    	try {
    		return (long) method.invokeExact(
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int ma_node_set_time(
    	MemorySegment pNode,
    	long localTime
    ) {
    	MethodHandle method = MA_NODE_SET_TIME.get();
    	try {
    		return (int) method.invokeExact(
    			pNode,
    			localTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment nma_node_graph_config_init(
    	SegmentAllocator allocator,
    	int channels
    ) {
    	MethodHandle method = MA_NODE_GRAPH_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_node_graph_config_init].
    public static @Nullable MaNodeGraphConfig ma_node_graph_config_init(
    	SegmentAllocator allocator,
    	int channels
    ) {
    	MemorySegment segment = nma_node_graph_config_init(
    		allocator,
    		channels
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaNodeGraphConfig(segment);
    }
    
    public static int ma_node_graph_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pNodeGraph
    ) {
    	MethodHandle method = MA_NODE_GRAPH_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pNodeGraph
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_node_graph_init].
    public static int ma_node_graph_init(
    	MaNodeGraphConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaNodeGraph pNodeGraph
    ) {
    	return ma_node_graph_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pNodeGraph.memorySegment()
    	);
    }
    
    public static void ma_node_graph_uninit(
    	MemorySegment pNodeGraph,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_NODE_GRAPH_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pNodeGraph,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_node_graph_uninit].
    public static void ma_node_graph_uninit(
    	MaNodeGraph pNodeGraph,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_node_graph_uninit(
    		pNodeGraph.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static MemorySegment ma_node_graph_get_endpoint(
    	MemorySegment pNodeGraph
    ) {
    	MethodHandle method = MA_NODE_GRAPH_GET_ENDPOINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pNodeGraph
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_node_graph_get_endpoint].
    public static @Nullable MemorySegment ma_node_graph_get_endpoint(
    	MaNodeGraph pNodeGraph
    ) {
    	MemorySegment segment = ma_node_graph_get_endpoint(
    		pNodeGraph.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static int ma_node_graph_read_pcm_frames(
    	MemorySegment pNodeGraph,
    	MemorySegment pFramesOut,
    	long frameCount,
    	MemorySegment pFramesRead
    ) {
    	MethodHandle method = MA_NODE_GRAPH_READ_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pNodeGraph,
    			pFramesOut,
    			frameCount,
    			pFramesRead
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_node_graph_read_pcm_frames].
    public static int ma_node_graph_read_pcm_frames(
    	MaNodeGraph pNodeGraph,
    	MemorySegment pFramesOut,
    	long frameCount,
    	NativeLongArray pFramesRead
    ) {
    	return ma_node_graph_read_pcm_frames(
    		pNodeGraph.memorySegment(),
    		pFramesOut,
    		frameCount,
    		pFramesRead.memorySegment()
    	);
    }
    
    public static int ma_node_graph_get_channels(
    	MemorySegment pNodeGraph
    ) {
    	MethodHandle method = MA_NODE_GRAPH_GET_CHANNELS.get();
    	try {
    		return (int) method.invokeExact(
    			pNodeGraph
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_node_graph_get_channels].
    public static int ma_node_graph_get_channels(
    	MaNodeGraph pNodeGraph
    ) {
    	return ma_node_graph_get_channels(
    		pNodeGraph.memorySegment()
    	);
    }
    
    public static long ma_node_graph_get_time(
    	MemorySegment pNodeGraph
    ) {
    	MethodHandle method = MA_NODE_GRAPH_GET_TIME.get();
    	try {
    		return (long) method.invokeExact(
    			pNodeGraph
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_node_graph_get_time].
    public static long ma_node_graph_get_time(
    	MaNodeGraph pNodeGraph
    ) {
    	return ma_node_graph_get_time(
    		pNodeGraph.memorySegment()
    	);
    }
    
    public static int ma_node_graph_set_time(
    	MemorySegment pNodeGraph,
    	long globalTime
    ) {
    	MethodHandle method = MA_NODE_GRAPH_SET_TIME.get();
    	try {
    		return (int) method.invokeExact(
    			pNodeGraph,
    			globalTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_node_graph_set_time].
    public static int ma_node_graph_set_time(
    	MaNodeGraph pNodeGraph,
    	long globalTime
    ) {
    	return ma_node_graph_set_time(
    		pNodeGraph.memorySegment(),
    		globalTime
    	);
    }
    
    public static int ma_node_graph_get_processing_size_in_frames(
    	MemorySegment pNodeGraph
    ) {
    	MethodHandle method = MA_NODE_GRAPH_GET_PROCESSING_SIZE_IN_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pNodeGraph
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_node_graph_get_processing_size_in_frames].
    public static int ma_node_graph_get_processing_size_in_frames(
    	MaNodeGraph pNodeGraph
    ) {
    	return ma_node_graph_get_processing_size_in_frames(
    		pNodeGraph.memorySegment()
    	);
    }
    
    public static MemorySegment nma_data_source_node_config_init(
    	SegmentAllocator allocator,
    	MemorySegment pDataSource
    ) {
    	MethodHandle method = MA_DATA_SOURCE_NODE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pDataSource
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_data_source_node_config_init].
    public static @Nullable MaDataSourceNodeConfig ma_data_source_node_config_init(
    	SegmentAllocator allocator,
    	MemorySegment pDataSource
    ) {
    	MemorySegment segment = nma_data_source_node_config_init(
    		allocator,
    		pDataSource
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDataSourceNodeConfig(segment);
    }
    
    public static int ma_data_source_node_init(
    	MemorySegment pNodeGraph,
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pDataSourceNode
    ) {
    	MethodHandle method = MA_DATA_SOURCE_NODE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pNodeGraph,
    			pConfig,
    			pAllocationCallbacks,
    			pDataSourceNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_source_node_init].
    public static int ma_data_source_node_init(
    	MaNodeGraph pNodeGraph,
    	MaDataSourceNodeConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaDataSourceNode pDataSourceNode
    ) {
    	return ma_data_source_node_init(
    		pNodeGraph.memorySegment(),
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pDataSourceNode.memorySegment()
    	);
    }
    
    public static void ma_data_source_node_uninit(
    	MemorySegment pDataSourceNode,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_DATA_SOURCE_NODE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pDataSourceNode,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_source_node_uninit].
    public static void ma_data_source_node_uninit(
    	MaDataSourceNode pDataSourceNode,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_data_source_node_uninit(
    		pDataSourceNode.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static int ma_data_source_node_set_looping(
    	MemorySegment pDataSourceNode,
    	int isLooping
    ) {
    	MethodHandle method = MA_DATA_SOURCE_NODE_SET_LOOPING.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSourceNode,
    			isLooping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_source_node_set_looping].
    public static int ma_data_source_node_set_looping(
    	MaDataSourceNode pDataSourceNode,
    	int isLooping
    ) {
    	return ma_data_source_node_set_looping(
    		pDataSourceNode.memorySegment(),
    		isLooping
    	);
    }
    
    public static int ma_data_source_node_is_looping(
    	MemorySegment pDataSourceNode
    ) {
    	MethodHandle method = MA_DATA_SOURCE_NODE_IS_LOOPING.get();
    	try {
    		return (int) method.invokeExact(
    			pDataSourceNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_data_source_node_is_looping].
    public static int ma_data_source_node_is_looping(
    	MaDataSourceNode pDataSourceNode
    ) {
    	return ma_data_source_node_is_looping(
    		pDataSourceNode.memorySegment()
    	);
    }
    
    public static MemorySegment nma_splitter_node_config_init(
    	SegmentAllocator allocator,
    	int channels
    ) {
    	MethodHandle method = MA_SPLITTER_NODE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			channels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_splitter_node_config_init].
    public static @Nullable MaSplitterNodeConfig ma_splitter_node_config_init(
    	SegmentAllocator allocator,
    	int channels
    ) {
    	MemorySegment segment = nma_splitter_node_config_init(
    		allocator,
    		channels
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaSplitterNodeConfig(segment);
    }
    
    public static int ma_splitter_node_init(
    	MemorySegment pNodeGraph,
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pSplitterNode
    ) {
    	MethodHandle method = MA_SPLITTER_NODE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pNodeGraph,
    			pConfig,
    			pAllocationCallbacks,
    			pSplitterNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_splitter_node_init].
    public static int ma_splitter_node_init(
    	MaNodeGraph pNodeGraph,
    	MaSplitterNodeConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaSplitterNode pSplitterNode
    ) {
    	return ma_splitter_node_init(
    		pNodeGraph.memorySegment(),
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pSplitterNode.memorySegment()
    	);
    }
    
    public static void ma_splitter_node_uninit(
    	MemorySegment pSplitterNode,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_SPLITTER_NODE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pSplitterNode,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_splitter_node_uninit].
    public static void ma_splitter_node_uninit(
    	MaSplitterNode pSplitterNode,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_splitter_node_uninit(
    		pSplitterNode.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static MemorySegment nma_biquad_node_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	float b0,
    	float b1,
    	float b2,
    	float a0,
    	float a1,
    	float a2
    ) {
    	MethodHandle method = MA_BIQUAD_NODE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			channels,
    			b0,
    			b1,
    			b2,
    			a0,
    			a1,
    			a2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_biquad_node_config_init].
    public static @Nullable MaBiquadNodeConfig ma_biquad_node_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	float b0,
    	float b1,
    	float b2,
    	float a0,
    	float a1,
    	float a2
    ) {
    	MemorySegment segment = nma_biquad_node_config_init(
    		allocator,
    		channels,
    		b0,
    		b1,
    		b2,
    		a0,
    		a1,
    		a2
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaBiquadNodeConfig(segment);
    }
    
    public static int ma_biquad_node_init(
    	MemorySegment pNodeGraph,
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_BIQUAD_NODE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pNodeGraph,
    			pConfig,
    			pAllocationCallbacks,
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_biquad_node_init].
    public static int ma_biquad_node_init(
    	MaNodeGraph pNodeGraph,
    	MaBiquadNodeConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaBiquadNode pNode
    ) {
    	return ma_biquad_node_init(
    		pNodeGraph.memorySegment(),
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pNode.memorySegment()
    	);
    }
    
    public static int ma_biquad_node_reinit(
    	MemorySegment pConfig,
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_BIQUAD_NODE_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_biquad_node_reinit].
    public static int ma_biquad_node_reinit(
    	MaBiquadConfig pConfig,
    	MaBiquadNode pNode
    ) {
    	return ma_biquad_node_reinit(
    		pConfig.memorySegment(),
    		pNode.memorySegment()
    	);
    }
    
    public static void ma_biquad_node_uninit(
    	MemorySegment pNode,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_BIQUAD_NODE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pNode,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_biquad_node_uninit].
    public static void ma_biquad_node_uninit(
    	MaBiquadNode pNode,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_biquad_node_uninit(
    		pNode.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static MemorySegment nma_lpf_node_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency,
    	int order
    ) {
    	MethodHandle method = MA_LPF_NODE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			channels,
    			sampleRate,
    			cutoffFrequency,
    			order
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_lpf_node_config_init].
    public static @Nullable MaLpfNodeConfig ma_lpf_node_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency,
    	int order
    ) {
    	MemorySegment segment = nma_lpf_node_config_init(
    		allocator,
    		channels,
    		sampleRate,
    		cutoffFrequency,
    		order
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaLpfNodeConfig(segment);
    }
    
    public static int ma_lpf_node_init(
    	MemorySegment pNodeGraph,
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_LPF_NODE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pNodeGraph,
    			pConfig,
    			pAllocationCallbacks,
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf_node_init].
    public static int ma_lpf_node_init(
    	MaNodeGraph pNodeGraph,
    	MaLpfNodeConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaLpfNode pNode
    ) {
    	return ma_lpf_node_init(
    		pNodeGraph.memorySegment(),
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pNode.memorySegment()
    	);
    }
    
    public static int ma_lpf_node_reinit(
    	MemorySegment pConfig,
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_LPF_NODE_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf_node_reinit].
    public static int ma_lpf_node_reinit(
    	MaLpfConfig pConfig,
    	MaLpfNode pNode
    ) {
    	return ma_lpf_node_reinit(
    		pConfig.memorySegment(),
    		pNode.memorySegment()
    	);
    }
    
    public static void ma_lpf_node_uninit(
    	MemorySegment pNode,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_LPF_NODE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pNode,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_lpf_node_uninit].
    public static void ma_lpf_node_uninit(
    	MaLpfNode pNode,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_lpf_node_uninit(
    		pNode.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static MemorySegment nma_hpf_node_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency,
    	int order
    ) {
    	MethodHandle method = MA_HPF_NODE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			channels,
    			sampleRate,
    			cutoffFrequency,
    			order
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_hpf_node_config_init].
    public static @Nullable MaHpfNodeConfig ma_hpf_node_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency,
    	int order
    ) {
    	MemorySegment segment = nma_hpf_node_config_init(
    		allocator,
    		channels,
    		sampleRate,
    		cutoffFrequency,
    		order
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaHpfNodeConfig(segment);
    }
    
    public static int ma_hpf_node_init(
    	MemorySegment pNodeGraph,
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_HPF_NODE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pNodeGraph,
    			pConfig,
    			pAllocationCallbacks,
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf_node_init].
    public static int ma_hpf_node_init(
    	MaNodeGraph pNodeGraph,
    	MaHpfNodeConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaHpfNode pNode
    ) {
    	return ma_hpf_node_init(
    		pNodeGraph.memorySegment(),
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pNode.memorySegment()
    	);
    }
    
    public static int ma_hpf_node_reinit(
    	MemorySegment pConfig,
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_HPF_NODE_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf_node_reinit].
    public static int ma_hpf_node_reinit(
    	MaHpfConfig pConfig,
    	MaHpfNode pNode
    ) {
    	return ma_hpf_node_reinit(
    		pConfig.memorySegment(),
    		pNode.memorySegment()
    	);
    }
    
    public static void ma_hpf_node_uninit(
    	MemorySegment pNode,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_HPF_NODE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pNode,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hpf_node_uninit].
    public static void ma_hpf_node_uninit(
    	MaHpfNode pNode,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_hpf_node_uninit(
    		pNode.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static MemorySegment nma_bpf_node_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency,
    	int order
    ) {
    	MethodHandle method = MA_BPF_NODE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			channels,
    			sampleRate,
    			cutoffFrequency,
    			order
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_bpf_node_config_init].
    public static @Nullable MaBpfNodeConfig ma_bpf_node_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int sampleRate,
    	double cutoffFrequency,
    	int order
    ) {
    	MemorySegment segment = nma_bpf_node_config_init(
    		allocator,
    		channels,
    		sampleRate,
    		cutoffFrequency,
    		order
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaBpfNodeConfig(segment);
    }
    
    public static int ma_bpf_node_init(
    	MemorySegment pNodeGraph,
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_BPF_NODE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pNodeGraph,
    			pConfig,
    			pAllocationCallbacks,
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_bpf_node_init].
    public static int ma_bpf_node_init(
    	MaNodeGraph pNodeGraph,
    	MaBpfNodeConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaBpfNode pNode
    ) {
    	return ma_bpf_node_init(
    		pNodeGraph.memorySegment(),
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pNode.memorySegment()
    	);
    }
    
    public static int ma_bpf_node_reinit(
    	MemorySegment pConfig,
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_BPF_NODE_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_bpf_node_reinit].
    public static int ma_bpf_node_reinit(
    	MaBpfConfig pConfig,
    	MaBpfNode pNode
    ) {
    	return ma_bpf_node_reinit(
    		pConfig.memorySegment(),
    		pNode.memorySegment()
    	);
    }
    
    public static void ma_bpf_node_uninit(
    	MemorySegment pNode,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_BPF_NODE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pNode,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_bpf_node_uninit].
    public static void ma_bpf_node_uninit(
    	MaBpfNode pNode,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_bpf_node_uninit(
    		pNode.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static MemorySegment nma_notch_node_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int sampleRate,
    	double q,
    	double frequency
    ) {
    	MethodHandle method = MA_NOTCH_NODE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			channels,
    			sampleRate,
    			q,
    			frequency
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_notch_node_config_init].
    public static @Nullable MaNotchNodeConfig ma_notch_node_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int sampleRate,
    	double q,
    	double frequency
    ) {
    	MemorySegment segment = nma_notch_node_config_init(
    		allocator,
    		channels,
    		sampleRate,
    		q,
    		frequency
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaNotchNodeConfig(segment);
    }
    
    public static int ma_notch_node_init(
    	MemorySegment pNodeGraph,
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_NOTCH_NODE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pNodeGraph,
    			pConfig,
    			pAllocationCallbacks,
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_notch_node_init].
    public static int ma_notch_node_init(
    	MaNodeGraph pNodeGraph,
    	MaNotchNodeConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaNotchNode pNode
    ) {
    	return ma_notch_node_init(
    		pNodeGraph.memorySegment(),
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pNode.memorySegment()
    	);
    }
    
    public static int ma_notch_node_reinit(
    	MemorySegment pConfig,
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_NOTCH_NODE_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_notch_node_reinit].
    public static int ma_notch_node_reinit(
    	MaNotch2Config pConfig,
    	MaNotchNode pNode
    ) {
    	return ma_notch_node_reinit(
    		pConfig.memorySegment(),
    		pNode.memorySegment()
    	);
    }
    
    public static void ma_notch_node_uninit(
    	MemorySegment pNode,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_NOTCH_NODE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pNode,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_notch_node_uninit].
    public static void ma_notch_node_uninit(
    	MaNotchNode pNode,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_notch_node_uninit(
    		pNode.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static MemorySegment nma_peak_node_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int sampleRate,
    	double gainDB,
    	double q,
    	double frequency
    ) {
    	MethodHandle method = MA_PEAK_NODE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			channels,
    			sampleRate,
    			gainDB,
    			q,
    			frequency
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_peak_node_config_init].
    public static @Nullable MaPeakNodeConfig ma_peak_node_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int sampleRate,
    	double gainDB,
    	double q,
    	double frequency
    ) {
    	MemorySegment segment = nma_peak_node_config_init(
    		allocator,
    		channels,
    		sampleRate,
    		gainDB,
    		q,
    		frequency
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaPeakNodeConfig(segment);
    }
    
    public static int ma_peak_node_init(
    	MemorySegment pNodeGraph,
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_PEAK_NODE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pNodeGraph,
    			pConfig,
    			pAllocationCallbacks,
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_peak_node_init].
    public static int ma_peak_node_init(
    	MaNodeGraph pNodeGraph,
    	MaPeakNodeConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaPeakNode pNode
    ) {
    	return ma_peak_node_init(
    		pNodeGraph.memorySegment(),
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pNode.memorySegment()
    	);
    }
    
    public static int ma_peak_node_reinit(
    	MemorySegment pConfig,
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_PEAK_NODE_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_peak_node_reinit].
    public static int ma_peak_node_reinit(
    	MaPeak2Config pConfig,
    	MaPeakNode pNode
    ) {
    	return ma_peak_node_reinit(
    		pConfig.memorySegment(),
    		pNode.memorySegment()
    	);
    }
    
    public static void ma_peak_node_uninit(
    	MemorySegment pNode,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_PEAK_NODE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pNode,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_peak_node_uninit].
    public static void ma_peak_node_uninit(
    	MaPeakNode pNode,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_peak_node_uninit(
    		pNode.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static MemorySegment nma_loshelf_node_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int sampleRate,
    	double gainDB,
    	double q,
    	double frequency
    ) {
    	MethodHandle method = MA_LOSHELF_NODE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			channels,
    			sampleRate,
    			gainDB,
    			q,
    			frequency
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_loshelf_node_config_init].
    public static @Nullable MaLoshelfNodeConfig ma_loshelf_node_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int sampleRate,
    	double gainDB,
    	double q,
    	double frequency
    ) {
    	MemorySegment segment = nma_loshelf_node_config_init(
    		allocator,
    		channels,
    		sampleRate,
    		gainDB,
    		q,
    		frequency
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaLoshelfNodeConfig(segment);
    }
    
    public static int ma_loshelf_node_init(
    	MemorySegment pNodeGraph,
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_LOSHELF_NODE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pNodeGraph,
    			pConfig,
    			pAllocationCallbacks,
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_loshelf_node_init].
    public static int ma_loshelf_node_init(
    	MaNodeGraph pNodeGraph,
    	MaLoshelfNodeConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaLoshelfNode pNode
    ) {
    	return ma_loshelf_node_init(
    		pNodeGraph.memorySegment(),
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pNode.memorySegment()
    	);
    }
    
    public static int ma_loshelf_node_reinit(
    	MemorySegment pConfig,
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_LOSHELF_NODE_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_loshelf_node_reinit].
    public static int ma_loshelf_node_reinit(
    	MaLoshelf2Config pConfig,
    	MaLoshelfNode pNode
    ) {
    	return ma_loshelf_node_reinit(
    		pConfig.memorySegment(),
    		pNode.memorySegment()
    	);
    }
    
    public static void ma_loshelf_node_uninit(
    	MemorySegment pNode,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_LOSHELF_NODE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pNode,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_loshelf_node_uninit].
    public static void ma_loshelf_node_uninit(
    	MaLoshelfNode pNode,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_loshelf_node_uninit(
    		pNode.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static MemorySegment nma_hishelf_node_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int sampleRate,
    	double gainDB,
    	double q,
    	double frequency
    ) {
    	MethodHandle method = MA_HISHELF_NODE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			channels,
    			sampleRate,
    			gainDB,
    			q,
    			frequency
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_hishelf_node_config_init].
    public static @Nullable MaHishelfNodeConfig ma_hishelf_node_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int sampleRate,
    	double gainDB,
    	double q,
    	double frequency
    ) {
    	MemorySegment segment = nma_hishelf_node_config_init(
    		allocator,
    		channels,
    		sampleRate,
    		gainDB,
    		q,
    		frequency
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaHishelfNodeConfig(segment);
    }
    
    public static int ma_hishelf_node_init(
    	MemorySegment pNodeGraph,
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_HISHELF_NODE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pNodeGraph,
    			pConfig,
    			pAllocationCallbacks,
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hishelf_node_init].
    public static int ma_hishelf_node_init(
    	MaNodeGraph pNodeGraph,
    	MaHishelfNodeConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaHishelfNode pNode
    ) {
    	return ma_hishelf_node_init(
    		pNodeGraph.memorySegment(),
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pNode.memorySegment()
    	);
    }
    
    public static int ma_hishelf_node_reinit(
    	MemorySegment pConfig,
    	MemorySegment pNode
    ) {
    	MethodHandle method = MA_HISHELF_NODE_REINIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hishelf_node_reinit].
    public static int ma_hishelf_node_reinit(
    	MaHishelf2Config pConfig,
    	MaHishelfNode pNode
    ) {
    	return ma_hishelf_node_reinit(
    		pConfig.memorySegment(),
    		pNode.memorySegment()
    	);
    }
    
    public static void ma_hishelf_node_uninit(
    	MemorySegment pNode,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_HISHELF_NODE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pNode,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_hishelf_node_uninit].
    public static void ma_hishelf_node_uninit(
    	MaHishelfNode pNode,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_hishelf_node_uninit(
    		pNode.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static MemorySegment nma_delay_node_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int sampleRate,
    	int delayInFrames,
    	float decay
    ) {
    	MethodHandle method = MA_DELAY_NODE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			channels,
    			sampleRate,
    			delayInFrames,
    			decay
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_delay_node_config_init].
    public static @Nullable MaDelayNodeConfig ma_delay_node_config_init(
    	SegmentAllocator allocator,
    	int channels,
    	int sampleRate,
    	int delayInFrames,
    	float decay
    ) {
    	MemorySegment segment = nma_delay_node_config_init(
    		allocator,
    		channels,
    		sampleRate,
    		delayInFrames,
    		decay
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDelayNodeConfig(segment);
    }
    
    public static int ma_delay_node_init(
    	MemorySegment pNodeGraph,
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pDelayNode
    ) {
    	MethodHandle method = MA_DELAY_NODE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pNodeGraph,
    			pConfig,
    			pAllocationCallbacks,
    			pDelayNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_delay_node_init].
    public static int ma_delay_node_init(
    	MaNodeGraph pNodeGraph,
    	MaDelayNodeConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaDelayNode pDelayNode
    ) {
    	return ma_delay_node_init(
    		pNodeGraph.memorySegment(),
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pDelayNode.memorySegment()
    	);
    }
    
    public static void ma_delay_node_uninit(
    	MemorySegment pDelayNode,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_DELAY_NODE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pDelayNode,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_delay_node_uninit].
    public static void ma_delay_node_uninit(
    	MaDelayNode pDelayNode,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_delay_node_uninit(
    		pDelayNode.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static void ma_delay_node_set_wet(
    	MemorySegment pDelayNode,
    	float value
    ) {
    	MethodHandle method = MA_DELAY_NODE_SET_WET.get();
    	try {
    		 method.invokeExact(
    			pDelayNode,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_delay_node_set_wet].
    public static void ma_delay_node_set_wet(
    	MaDelayNode pDelayNode,
    	float value
    ) {
    	ma_delay_node_set_wet(
    		pDelayNode.memorySegment(),
    		value
    	);
    }
    
    public static float ma_delay_node_get_wet(
    	MemorySegment pDelayNode
    ) {
    	MethodHandle method = MA_DELAY_NODE_GET_WET.get();
    	try {
    		return (float) method.invokeExact(
    			pDelayNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_delay_node_get_wet].
    public static float ma_delay_node_get_wet(
    	MaDelayNode pDelayNode
    ) {
    	return ma_delay_node_get_wet(
    		pDelayNode.memorySegment()
    	);
    }
    
    public static void ma_delay_node_set_dry(
    	MemorySegment pDelayNode,
    	float value
    ) {
    	MethodHandle method = MA_DELAY_NODE_SET_DRY.get();
    	try {
    		 method.invokeExact(
    			pDelayNode,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_delay_node_set_dry].
    public static void ma_delay_node_set_dry(
    	MaDelayNode pDelayNode,
    	float value
    ) {
    	ma_delay_node_set_dry(
    		pDelayNode.memorySegment(),
    		value
    	);
    }
    
    public static float ma_delay_node_get_dry(
    	MemorySegment pDelayNode
    ) {
    	MethodHandle method = MA_DELAY_NODE_GET_DRY.get();
    	try {
    		return (float) method.invokeExact(
    			pDelayNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_delay_node_get_dry].
    public static float ma_delay_node_get_dry(
    	MaDelayNode pDelayNode
    ) {
    	return ma_delay_node_get_dry(
    		pDelayNode.memorySegment()
    	);
    }
    
    public static void ma_delay_node_set_decay(
    	MemorySegment pDelayNode,
    	float value
    ) {
    	MethodHandle method = MA_DELAY_NODE_SET_DECAY.get();
    	try {
    		 method.invokeExact(
    			pDelayNode,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_delay_node_set_decay].
    public static void ma_delay_node_set_decay(
    	MaDelayNode pDelayNode,
    	float value
    ) {
    	ma_delay_node_set_decay(
    		pDelayNode.memorySegment(),
    		value
    	);
    }
    
    public static float ma_delay_node_get_decay(
    	MemorySegment pDelayNode
    ) {
    	MethodHandle method = MA_DELAY_NODE_GET_DECAY.get();
    	try {
    		return (float) method.invokeExact(
    			pDelayNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_delay_node_get_decay].
    public static float ma_delay_node_get_decay(
    	MaDelayNode pDelayNode
    ) {
    	return ma_delay_node_get_decay(
    		pDelayNode.memorySegment()
    	);
    }
    
    public static MemorySegment ma_engine_node_config_init(
    	SegmentAllocator allocator,
    	MemorySegment pEngine,
    	int type,
    	int flags
    ) {
    	MethodHandle method = MA_ENGINE_NODE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pEngine,
    			type,
    			flags
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_node_config_init].
    public static @Nullable MaEngineNodeConfig ma_engine_node_config_init(
    	SegmentAllocator allocator,
    	MaEngine pEngine,
    	int type,
    	int flags
    ) {
    	MemorySegment segment = ma_engine_node_config_init(
    		allocator,
    		pEngine.memorySegment(),
    		type,
    		flags
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaEngineNodeConfig(segment);
    }
    
    public static int ma_engine_node_get_heap_size(
    	MemorySegment pConfig,
    	MemorySegment pHeapSizeInBytes
    ) {
    	MethodHandle method = MA_ENGINE_NODE_GET_HEAP_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeapSizeInBytes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_node_get_heap_size].
    public static int ma_engine_node_get_heap_size(
    	MaEngineNodeConfig pConfig,
    	NativeLongArray pHeapSizeInBytes
    ) {
    	return ma_engine_node_get_heap_size(
    		pConfig.memorySegment(),
    		pHeapSizeInBytes.memorySegment()
    	);
    }
    
    public static int ma_engine_node_init_preallocated(
    	MemorySegment pConfig,
    	MemorySegment pHeap,
    	MemorySegment pEngineNode
    ) {
    	MethodHandle method = MA_ENGINE_NODE_INIT_PREALLOCATED.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pHeap,
    			pEngineNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_node_init_preallocated].
    public static int ma_engine_node_init_preallocated(
    	MaEngineNodeConfig pConfig,
    	MemorySegment pHeap,
    	MaEngineNode pEngineNode
    ) {
    	return ma_engine_node_init_preallocated(
    		pConfig.memorySegment(),
    		pHeap,
    		pEngineNode.memorySegment()
    	);
    }
    
    public static int ma_engine_node_init(
    	MemorySegment pConfig,
    	MemorySegment pAllocationCallbacks,
    	MemorySegment pEngineNode
    ) {
    	MethodHandle method = MA_ENGINE_NODE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pAllocationCallbacks,
    			pEngineNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_node_init].
    public static int ma_engine_node_init(
    	MaEngineNodeConfig pConfig,
    	MaAllocationCallbacks pAllocationCallbacks,
    	MaEngineNode pEngineNode
    ) {
    	return ma_engine_node_init(
    		pConfig.memorySegment(),
    		pAllocationCallbacks.memorySegment(),
    		pEngineNode.memorySegment()
    	);
    }
    
    public static void ma_engine_node_uninit(
    	MemorySegment pEngineNode,
    	MemorySegment pAllocationCallbacks
    ) {
    	MethodHandle method = MA_ENGINE_NODE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pEngineNode,
    			pAllocationCallbacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_node_uninit].
    public static void ma_engine_node_uninit(
    	MaEngineNode pEngineNode,
    	MaAllocationCallbacks pAllocationCallbacks
    ) {
    	ma_engine_node_uninit(
    		pEngineNode.memorySegment(),
    		pAllocationCallbacks.memorySegment()
    	);
    }
    
    public static MemorySegment nma_sound_config_init(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = MA_SOUND_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_sound_config_init].
    public static @Nullable MaSoundConfig ma_sound_config_init(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = nma_sound_config_init(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaSoundConfig(segment);
    }
    
    public static MemorySegment ma_sound_config_init_2(
    	SegmentAllocator allocator,
    	MemorySegment pEngine
    ) {
    	MethodHandle method = MA_SOUND_CONFIG_INIT_2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_config_init_2].
    public static @Nullable MaSoundConfig ma_sound_config_init_2(
    	SegmentAllocator allocator,
    	MaEngine pEngine
    ) {
    	MemorySegment segment = ma_sound_config_init_2(
    		allocator,
    		pEngine.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaSoundConfig(segment);
    }
    
    public static MemorySegment nma_sound_group_config_init(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = MA_SOUND_GROUP_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_sound_group_config_init].
    public static @Nullable MaSoundConfig ma_sound_group_config_init(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = nma_sound_group_config_init(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaSoundConfig(segment);
    }
    
    public static MemorySegment ma_sound_group_config_init_2(
    	SegmentAllocator allocator,
    	MemorySegment pEngine
    ) {
    	MethodHandle method = MA_SOUND_GROUP_CONFIG_INIT_2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_config_init_2].
    public static @Nullable MaSoundConfig ma_sound_group_config_init_2(
    	SegmentAllocator allocator,
    	MaEngine pEngine
    ) {
    	MemorySegment segment = ma_sound_group_config_init_2(
    		allocator,
    		pEngine.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaSoundConfig(segment);
    }
    
    public static MemorySegment nma_engine_config_init(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = MA_ENGINE_CONFIG_INIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nma_engine_config_init].
    public static @Nullable MaEngineConfig ma_engine_config_init(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = nma_engine_config_init(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaEngineConfig(segment);
    }
    
    public static int ma_engine_init(
    	MemorySegment pConfig,
    	MemorySegment pEngine
    ) {
    	MethodHandle method = MA_ENGINE_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pConfig,
    			pEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_init].
    public static int ma_engine_init(
    	@Nullable MaEngineConfig pConfig,
    	MaEngine pEngine
    ) {
    	return ma_engine_init(
    		pConfig == null ? MemorySegment.NULL : pConfig.memorySegment(),
    		pEngine.memorySegment()
    	);
    }
    
    public static void ma_engine_uninit(
    	MemorySegment pEngine
    ) {
    	MethodHandle method = MA_ENGINE_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_uninit].
    public static void ma_engine_uninit(
    	MaEngine pEngine
    ) {
    	ma_engine_uninit(
    		pEngine.memorySegment()
    	);
    }
    
    public static int ma_engine_read_pcm_frames(
    	MemorySegment pEngine,
    	MemorySegment pFramesOut,
    	long frameCount,
    	MemorySegment pFramesRead
    ) {
    	MethodHandle method = MA_ENGINE_READ_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine,
    			pFramesOut,
    			frameCount,
    			pFramesRead
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_read_pcm_frames].
    public static int ma_engine_read_pcm_frames(
    	MaEngine pEngine,
    	MemorySegment pFramesOut,
    	long frameCount,
    	NativeLongArray pFramesRead
    ) {
    	return ma_engine_read_pcm_frames(
    		pEngine.memorySegment(),
    		pFramesOut,
    		frameCount,
    		pFramesRead.memorySegment()
    	);
    }
    
    public static MemorySegment ma_engine_get_node_graph(
    	MemorySegment pEngine
    ) {
    	MethodHandle method = MA_ENGINE_GET_NODE_GRAPH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_get_node_graph].
    public static @Nullable MaNodeGraph ma_engine_get_node_graph(
    	MaEngine pEngine
    ) {
    	MemorySegment segment = ma_engine_get_node_graph(
    		pEngine.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaNodeGraph(segment);
    }
    
    public static MemorySegment ma_engine_get_resource_manager(
    	MemorySegment pEngine
    ) {
    	MethodHandle method = MA_ENGINE_GET_RESOURCE_MANAGER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_get_resource_manager].
    public static @Nullable MaResourceManager ma_engine_get_resource_manager(
    	MaEngine pEngine
    ) {
    	MemorySegment segment = ma_engine_get_resource_manager(
    		pEngine.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaResourceManager(segment);
    }
    
    public static MemorySegment ma_engine_get_device(
    	MemorySegment pEngine
    ) {
    	MethodHandle method = MA_ENGINE_GET_DEVICE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_get_device].
    public static @Nullable MaDevice ma_engine_get_device(
    	MaEngine pEngine
    ) {
    	MemorySegment segment = ma_engine_get_device(
    		pEngine.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDevice(segment);
    }
    
    public static MemorySegment ma_engine_get_log(
    	MemorySegment pEngine
    ) {
    	MethodHandle method = MA_ENGINE_GET_LOG.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_get_log].
    public static @Nullable MaLog ma_engine_get_log(
    	MaEngine pEngine
    ) {
    	MemorySegment segment = ma_engine_get_log(
    		pEngine.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaLog(segment);
    }
    
    public static MemorySegment ma_engine_get_endpoint(
    	MemorySegment pEngine
    ) {
    	MethodHandle method = MA_ENGINE_GET_ENDPOINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_get_endpoint].
    public static @Nullable MemorySegment ma_engine_get_endpoint(
    	MaEngine pEngine
    ) {
    	MemorySegment segment = ma_engine_get_endpoint(
    		pEngine.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static long ma_engine_get_time_in_pcm_frames(
    	MemorySegment pEngine
    ) {
    	MethodHandle method = MA_ENGINE_GET_TIME_IN_PCM_FRAMES.get();
    	try {
    		return (long) method.invokeExact(
    			pEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_get_time_in_pcm_frames].
    public static long ma_engine_get_time_in_pcm_frames(
    	MaEngine pEngine
    ) {
    	return ma_engine_get_time_in_pcm_frames(
    		pEngine.memorySegment()
    	);
    }
    
    public static long ma_engine_get_time_in_milliseconds(
    	MemorySegment pEngine
    ) {
    	MethodHandle method = MA_ENGINE_GET_TIME_IN_MILLISECONDS.get();
    	try {
    		return (long) method.invokeExact(
    			pEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_get_time_in_milliseconds].
    public static long ma_engine_get_time_in_milliseconds(
    	MaEngine pEngine
    ) {
    	return ma_engine_get_time_in_milliseconds(
    		pEngine.memorySegment()
    	);
    }
    
    public static int ma_engine_set_time_in_pcm_frames(
    	MemorySegment pEngine,
    	long globalTime
    ) {
    	MethodHandle method = MA_ENGINE_SET_TIME_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine,
    			globalTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_set_time_in_pcm_frames].
    public static int ma_engine_set_time_in_pcm_frames(
    	MaEngine pEngine,
    	long globalTime
    ) {
    	return ma_engine_set_time_in_pcm_frames(
    		pEngine.memorySegment(),
    		globalTime
    	);
    }
    
    public static int ma_engine_set_time_in_milliseconds(
    	MemorySegment pEngine,
    	long globalTime
    ) {
    	MethodHandle method = MA_ENGINE_SET_TIME_IN_MILLISECONDS.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine,
    			globalTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_set_time_in_milliseconds].
    public static int ma_engine_set_time_in_milliseconds(
    	MaEngine pEngine,
    	long globalTime
    ) {
    	return ma_engine_set_time_in_milliseconds(
    		pEngine.memorySegment(),
    		globalTime
    	);
    }
    
    public static long ma_engine_get_time(
    	MemorySegment pEngine
    ) {
    	MethodHandle method = MA_ENGINE_GET_TIME.get();
    	try {
    		return (long) method.invokeExact(
    			pEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_get_time].
    public static long ma_engine_get_time(
    	MaEngine pEngine
    ) {
    	return ma_engine_get_time(
    		pEngine.memorySegment()
    	);
    }
    
    public static int ma_engine_set_time(
    	MemorySegment pEngine,
    	long globalTime
    ) {
    	MethodHandle method = MA_ENGINE_SET_TIME.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine,
    			globalTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_set_time].
    public static int ma_engine_set_time(
    	MaEngine pEngine,
    	long globalTime
    ) {
    	return ma_engine_set_time(
    		pEngine.memorySegment(),
    		globalTime
    	);
    }
    
    public static int ma_engine_get_channels(
    	MemorySegment pEngine
    ) {
    	MethodHandle method = MA_ENGINE_GET_CHANNELS.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_get_channels].
    public static int ma_engine_get_channels(
    	MaEngine pEngine
    ) {
    	return ma_engine_get_channels(
    		pEngine.memorySegment()
    	);
    }
    
    public static int ma_engine_get_sample_rate(
    	MemorySegment pEngine
    ) {
    	MethodHandle method = MA_ENGINE_GET_SAMPLE_RATE.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_get_sample_rate].
    public static int ma_engine_get_sample_rate(
    	MaEngine pEngine
    ) {
    	return ma_engine_get_sample_rate(
    		pEngine.memorySegment()
    	);
    }
    
    public static int ma_engine_start(
    	MemorySegment pEngine
    ) {
    	MethodHandle method = MA_ENGINE_START.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_start].
    public static int ma_engine_start(
    	MaEngine pEngine
    ) {
    	return ma_engine_start(
    		pEngine.memorySegment()
    	);
    }
    
    public static int ma_engine_stop(
    	MemorySegment pEngine
    ) {
    	MethodHandle method = MA_ENGINE_STOP.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_stop].
    public static int ma_engine_stop(
    	MaEngine pEngine
    ) {
    	return ma_engine_stop(
    		pEngine.memorySegment()
    	);
    }
    
    public static int ma_engine_set_volume(
    	MemorySegment pEngine,
    	float volume
    ) {
    	MethodHandle method = MA_ENGINE_SET_VOLUME.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine,
    			volume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_set_volume].
    public static int ma_engine_set_volume(
    	MaEngine pEngine,
    	float volume
    ) {
    	return ma_engine_set_volume(
    		pEngine.memorySegment(),
    		volume
    	);
    }
    
    public static float ma_engine_get_volume(
    	MemorySegment pEngine
    ) {
    	MethodHandle method = MA_ENGINE_GET_VOLUME.get();
    	try {
    		return (float) method.invokeExact(
    			pEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_get_volume].
    public static float ma_engine_get_volume(
    	MaEngine pEngine
    ) {
    	return ma_engine_get_volume(
    		pEngine.memorySegment()
    	);
    }
    
    public static int ma_engine_set_gain_db(
    	MemorySegment pEngine,
    	float gainDB
    ) {
    	MethodHandle method = MA_ENGINE_SET_GAIN_DB.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine,
    			gainDB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_set_gain_db].
    public static int ma_engine_set_gain_db(
    	MaEngine pEngine,
    	float gainDB
    ) {
    	return ma_engine_set_gain_db(
    		pEngine.memorySegment(),
    		gainDB
    	);
    }
    
    public static float ma_engine_get_gain_db(
    	MemorySegment pEngine
    ) {
    	MethodHandle method = MA_ENGINE_GET_GAIN_DB.get();
    	try {
    		return (float) method.invokeExact(
    			pEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_get_gain_db].
    public static float ma_engine_get_gain_db(
    	MaEngine pEngine
    ) {
    	return ma_engine_get_gain_db(
    		pEngine.memorySegment()
    	);
    }
    
    public static int ma_engine_get_listener_count(
    	MemorySegment pEngine
    ) {
    	MethodHandle method = MA_ENGINE_GET_LISTENER_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_get_listener_count].
    public static int ma_engine_get_listener_count(
    	MaEngine pEngine
    ) {
    	return ma_engine_get_listener_count(
    		pEngine.memorySegment()
    	);
    }
    
    public static int ma_engine_find_closest_listener(
    	MemorySegment pEngine,
    	float absolutePosX,
    	float absolutePosY,
    	float absolutePosZ
    ) {
    	MethodHandle method = MA_ENGINE_FIND_CLOSEST_LISTENER.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine,
    			absolutePosX,
    			absolutePosY,
    			absolutePosZ
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_find_closest_listener].
    public static int ma_engine_find_closest_listener(
    	MaEngine pEngine,
    	float absolutePosX,
    	float absolutePosY,
    	float absolutePosZ
    ) {
    	return ma_engine_find_closest_listener(
    		pEngine.memorySegment(),
    		absolutePosX,
    		absolutePosY,
    		absolutePosZ
    	);
    }
    
    public static void ma_engine_listener_set_position(
    	MemorySegment pEngine,
    	int listenerIndex,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = MA_ENGINE_LISTENER_SET_POSITION.get();
    	try {
    		 method.invokeExact(
    			pEngine,
    			listenerIndex,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_listener_set_position].
    public static void ma_engine_listener_set_position(
    	MaEngine pEngine,
    	int listenerIndex,
    	float x,
    	float y,
    	float z
    ) {
    	ma_engine_listener_set_position(
    		pEngine.memorySegment(),
    		listenerIndex,
    		x,
    		y,
    		z
    	);
    }
    
    public static MemorySegment ma_engine_listener_get_position(
    	SegmentAllocator allocator,
    	MemorySegment pEngine,
    	int listenerIndex
    ) {
    	MethodHandle method = MA_ENGINE_LISTENER_GET_POSITION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pEngine,
    			listenerIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_listener_get_position].
    public static @Nullable MaVec3f ma_engine_listener_get_position(
    	SegmentAllocator allocator,
    	MaEngine pEngine,
    	int listenerIndex
    ) {
    	MemorySegment segment = ma_engine_listener_get_position(
    		allocator,
    		pEngine.memorySegment(),
    		listenerIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaVec3f(segment);
    }
    
    public static void ma_engine_listener_set_direction(
    	MemorySegment pEngine,
    	int listenerIndex,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = MA_ENGINE_LISTENER_SET_DIRECTION.get();
    	try {
    		 method.invokeExact(
    			pEngine,
    			listenerIndex,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_listener_set_direction].
    public static void ma_engine_listener_set_direction(
    	MaEngine pEngine,
    	int listenerIndex,
    	float x,
    	float y,
    	float z
    ) {
    	ma_engine_listener_set_direction(
    		pEngine.memorySegment(),
    		listenerIndex,
    		x,
    		y,
    		z
    	);
    }
    
    public static MemorySegment ma_engine_listener_get_direction(
    	SegmentAllocator allocator,
    	MemorySegment pEngine,
    	int listenerIndex
    ) {
    	MethodHandle method = MA_ENGINE_LISTENER_GET_DIRECTION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pEngine,
    			listenerIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_listener_get_direction].
    public static @Nullable MaVec3f ma_engine_listener_get_direction(
    	SegmentAllocator allocator,
    	MaEngine pEngine,
    	int listenerIndex
    ) {
    	MemorySegment segment = ma_engine_listener_get_direction(
    		allocator,
    		pEngine.memorySegment(),
    		listenerIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaVec3f(segment);
    }
    
    public static void ma_engine_listener_set_velocity(
    	MemorySegment pEngine,
    	int listenerIndex,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = MA_ENGINE_LISTENER_SET_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			pEngine,
    			listenerIndex,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_listener_set_velocity].
    public static void ma_engine_listener_set_velocity(
    	MaEngine pEngine,
    	int listenerIndex,
    	float x,
    	float y,
    	float z
    ) {
    	ma_engine_listener_set_velocity(
    		pEngine.memorySegment(),
    		listenerIndex,
    		x,
    		y,
    		z
    	);
    }
    
    public static MemorySegment ma_engine_listener_get_velocity(
    	SegmentAllocator allocator,
    	MemorySegment pEngine,
    	int listenerIndex
    ) {
    	MethodHandle method = MA_ENGINE_LISTENER_GET_VELOCITY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pEngine,
    			listenerIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_listener_get_velocity].
    public static @Nullable MaVec3f ma_engine_listener_get_velocity(
    	SegmentAllocator allocator,
    	MaEngine pEngine,
    	int listenerIndex
    ) {
    	MemorySegment segment = ma_engine_listener_get_velocity(
    		allocator,
    		pEngine.memorySegment(),
    		listenerIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaVec3f(segment);
    }
    
    public static void ma_engine_listener_set_cone(
    	MemorySegment pEngine,
    	int listenerIndex,
    	float innerAngleInRadians,
    	float outerAngleInRadians,
    	float outerGain
    ) {
    	MethodHandle method = MA_ENGINE_LISTENER_SET_CONE.get();
    	try {
    		 method.invokeExact(
    			pEngine,
    			listenerIndex,
    			innerAngleInRadians,
    			outerAngleInRadians,
    			outerGain
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_listener_set_cone].
    public static void ma_engine_listener_set_cone(
    	MaEngine pEngine,
    	int listenerIndex,
    	float innerAngleInRadians,
    	float outerAngleInRadians,
    	float outerGain
    ) {
    	ma_engine_listener_set_cone(
    		pEngine.memorySegment(),
    		listenerIndex,
    		innerAngleInRadians,
    		outerAngleInRadians,
    		outerGain
    	);
    }
    
    public static void ma_engine_listener_get_cone(
    	MemorySegment pEngine,
    	int listenerIndex,
    	MemorySegment pInnerAngleInRadians,
    	MemorySegment pOuterAngleInRadians,
    	MemorySegment pOuterGain
    ) {
    	MethodHandle method = MA_ENGINE_LISTENER_GET_CONE.get();
    	try {
    		 method.invokeExact(
    			pEngine,
    			listenerIndex,
    			pInnerAngleInRadians,
    			pOuterAngleInRadians,
    			pOuterGain
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_listener_get_cone].
    public static void ma_engine_listener_get_cone(
    	MaEngine pEngine,
    	int listenerIndex,
    	NativeFloatArray pInnerAngleInRadians,
    	NativeFloatArray pOuterAngleInRadians,
    	NativeFloatArray pOuterGain
    ) {
    	ma_engine_listener_get_cone(
    		pEngine.memorySegment(),
    		listenerIndex,
    		pInnerAngleInRadians.memorySegment(),
    		pOuterAngleInRadians.memorySegment(),
    		pOuterGain.memorySegment()
    	);
    }
    
    public static void ma_engine_listener_set_world_up(
    	MemorySegment pEngine,
    	int listenerIndex,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = MA_ENGINE_LISTENER_SET_WORLD_UP.get();
    	try {
    		 method.invokeExact(
    			pEngine,
    			listenerIndex,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_listener_set_world_up].
    public static void ma_engine_listener_set_world_up(
    	MaEngine pEngine,
    	int listenerIndex,
    	float x,
    	float y,
    	float z
    ) {
    	ma_engine_listener_set_world_up(
    		pEngine.memorySegment(),
    		listenerIndex,
    		x,
    		y,
    		z
    	);
    }
    
    public static MemorySegment ma_engine_listener_get_world_up(
    	SegmentAllocator allocator,
    	MemorySegment pEngine,
    	int listenerIndex
    ) {
    	MethodHandle method = MA_ENGINE_LISTENER_GET_WORLD_UP.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pEngine,
    			listenerIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_listener_get_world_up].
    public static @Nullable MaVec3f ma_engine_listener_get_world_up(
    	SegmentAllocator allocator,
    	MaEngine pEngine,
    	int listenerIndex
    ) {
    	MemorySegment segment = ma_engine_listener_get_world_up(
    		allocator,
    		pEngine.memorySegment(),
    		listenerIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaVec3f(segment);
    }
    
    public static void ma_engine_listener_set_enabled(
    	MemorySegment pEngine,
    	int listenerIndex,
    	int isEnabled
    ) {
    	MethodHandle method = MA_ENGINE_LISTENER_SET_ENABLED.get();
    	try {
    		 method.invokeExact(
    			pEngine,
    			listenerIndex,
    			isEnabled
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_listener_set_enabled].
    public static void ma_engine_listener_set_enabled(
    	MaEngine pEngine,
    	int listenerIndex,
    	int isEnabled
    ) {
    	ma_engine_listener_set_enabled(
    		pEngine.memorySegment(),
    		listenerIndex,
    		isEnabled
    	);
    }
    
    public static int ma_engine_listener_is_enabled(
    	MemorySegment pEngine,
    	int listenerIndex
    ) {
    	MethodHandle method = MA_ENGINE_LISTENER_IS_ENABLED.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine,
    			listenerIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_listener_is_enabled].
    public static int ma_engine_listener_is_enabled(
    	MaEngine pEngine,
    	int listenerIndex
    ) {
    	return ma_engine_listener_is_enabled(
    		pEngine.memorySegment(),
    		listenerIndex
    	);
    }
    
    public static int ma_engine_play_sound_ex(
    	MemorySegment pEngine,
    	MemorySegment pFilePath,
    	MemorySegment pNode,
    	int nodeInputBusIndex
    ) {
    	MethodHandle method = MA_ENGINE_PLAY_SOUND_EX.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine,
    			pFilePath,
    			pNode,
    			nodeInputBusIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_play_sound_ex].
    public static int ma_engine_play_sound_ex(
    	MaEngine pEngine,
    	String pFilePath,
    	MemorySegment pNode,
    	int nodeInputBusIndex
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_engine_play_sound_ex(
    			pEngine.memorySegment(),
    			arena.allocateFrom(pFilePath),
    			pNode,
    			nodeInputBusIndex
    		);
    	}
    }
    
    public static int ma_engine_play_sound(
    	MemorySegment pEngine,
    	MemorySegment pFilePath,
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_ENGINE_PLAY_SOUND.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine,
    			pFilePath,
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_engine_play_sound].
    public static int ma_engine_play_sound(
    	MaEngine pEngine,
    	String pFilePath,
    	@Nullable MaSound pGroup
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_engine_play_sound(
    			pEngine.memorySegment(),
    			arena.allocateFrom(pFilePath),
    			pGroup == null ? MemorySegment.NULL : pGroup.memorySegment()
    		);
    	}
    }
    
    public static int ma_sound_init_from_file(
    	MemorySegment pEngine,
    	MemorySegment pFilePath,
    	int flags,
    	MemorySegment pGroup,
    	MemorySegment pDoneFence,
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_INIT_FROM_FILE.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine,
    			pFilePath,
    			flags,
    			pGroup,
    			pDoneFence,
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_init_from_file].
    public static int ma_sound_init_from_file(
    	MaEngine pEngine,
    	String pFilePath,
    	int flags,
    	@Nullable MaSound pGroup,
    	@Nullable MaFence pDoneFence,
    	MaSound pSound
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ma_sound_init_from_file(
    			pEngine.memorySegment(),
    			arena.allocateFrom(pFilePath),
    			flags,
    			pGroup == null ? MemorySegment.NULL : pGroup.memorySegment(),
    			pDoneFence == null ? MemorySegment.NULL : pDoneFence.memorySegment(),
    			pSound.memorySegment()
    		);
    	}
    }
    
    public static int ma_sound_init_from_file_w(
    	MemorySegment pEngine,
    	MemorySegment pFilePath,
    	int flags,
    	MemorySegment pGroup,
    	MemorySegment pDoneFence,
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_INIT_FROM_FILE_W.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine,
    			pFilePath,
    			flags,
    			pGroup,
    			pDoneFence,
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_init_from_file_w].
    public static int ma_sound_init_from_file_w(
    	MaEngine pEngine,
    	NativeShortArray pFilePath,
    	int flags,
    	MaSound pGroup,
    	MaFence pDoneFence,
    	MaSound pSound
    ) {
    	return ma_sound_init_from_file_w(
    		pEngine.memorySegment(),
    		pFilePath.memorySegment(),
    		flags,
    		pGroup.memorySegment(),
    		pDoneFence.memorySegment(),
    		pSound.memorySegment()
    	);
    }
    
    public static int ma_sound_init_copy(
    	MemorySegment pEngine,
    	MemorySegment pExistingSound,
    	int flags,
    	MemorySegment pGroup,
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_INIT_COPY.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine,
    			pExistingSound,
    			flags,
    			pGroup,
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_init_copy].
    public static int ma_sound_init_copy(
    	MaEngine pEngine,
    	MaSound pExistingSound,
    	int flags,
    	MaSound pGroup,
    	MaSound pSound
    ) {
    	return ma_sound_init_copy(
    		pEngine.memorySegment(),
    		pExistingSound.memorySegment(),
    		flags,
    		pGroup.memorySegment(),
    		pSound.memorySegment()
    	);
    }
    
    public static int ma_sound_init_from_data_source(
    	MemorySegment pEngine,
    	MemorySegment pDataSource,
    	int flags,
    	MemorySegment pGroup,
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_INIT_FROM_DATA_SOURCE.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine,
    			pDataSource,
    			flags,
    			pGroup,
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_init_from_data_source].
    public static int ma_sound_init_from_data_source(
    	MaEngine pEngine,
    	MemorySegment pDataSource,
    	int flags,
    	MaSound pGroup,
    	MaSound pSound
    ) {
    	return ma_sound_init_from_data_source(
    		pEngine.memorySegment(),
    		pDataSource,
    		flags,
    		pGroup.memorySegment(),
    		pSound.memorySegment()
    	);
    }
    
    public static int ma_sound_init_ex(
    	MemorySegment pEngine,
    	MemorySegment pConfig,
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_INIT_EX.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine,
    			pConfig,
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_init_ex].
    public static int ma_sound_init_ex(
    	MaEngine pEngine,
    	MaSoundConfig pConfig,
    	MaSound pSound
    ) {
    	return ma_sound_init_ex(
    		pEngine.memorySegment(),
    		pConfig.memorySegment(),
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_uninit(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_uninit].
    public static void ma_sound_uninit(
    	MaSound pSound
    ) {
    	ma_sound_uninit(
    		pSound.memorySegment()
    	);
    }
    
    public static MemorySegment ma_sound_get_engine(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_ENGINE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_engine].
    public static @Nullable MaEngine ma_sound_get_engine(
    	MaSound pSound
    ) {
    	MemorySegment segment = ma_sound_get_engine(
    		pSound.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaEngine(segment);
    }
    
    public static MemorySegment ma_sound_get_data_source(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_DATA_SOURCE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_data_source].
    public static @Nullable MemorySegment ma_sound_get_data_source(
    	MaSound pSound
    ) {
    	MemorySegment segment = ma_sound_get_data_source(
    		pSound.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static int ma_sound_start(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_START.get();
    	try {
    		return (int) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_start].
    public static int ma_sound_start(
    	MaSound pSound
    ) {
    	return ma_sound_start(
    		pSound.memorySegment()
    	);
    }
    
    public static int ma_sound_stop(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_STOP.get();
    	try {
    		return (int) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_stop].
    public static int ma_sound_stop(
    	MaSound pSound
    ) {
    	return ma_sound_stop(
    		pSound.memorySegment()
    	);
    }
    
    public static int ma_sound_stop_with_fade_in_pcm_frames(
    	MemorySegment pSound,
    	long fadeLengthInFrames
    ) {
    	MethodHandle method = MA_SOUND_STOP_WITH_FADE_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pSound,
    			fadeLengthInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_stop_with_fade_in_pcm_frames].
    public static int ma_sound_stop_with_fade_in_pcm_frames(
    	MaSound pSound,
    	long fadeLengthInFrames
    ) {
    	return ma_sound_stop_with_fade_in_pcm_frames(
    		pSound.memorySegment(),
    		fadeLengthInFrames
    	);
    }
    
    public static int ma_sound_stop_with_fade_in_milliseconds(
    	MemorySegment pSound,
    	long fadeLengthInFrames
    ) {
    	MethodHandle method = MA_SOUND_STOP_WITH_FADE_IN_MILLISECONDS.get();
    	try {
    		return (int) method.invokeExact(
    			pSound,
    			fadeLengthInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_stop_with_fade_in_milliseconds].
    public static int ma_sound_stop_with_fade_in_milliseconds(
    	MaSound pSound,
    	long fadeLengthInFrames
    ) {
    	return ma_sound_stop_with_fade_in_milliseconds(
    		pSound.memorySegment(),
    		fadeLengthInFrames
    	);
    }
    
    public static void ma_sound_reset_start_time(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_RESET_START_TIME.get();
    	try {
    		 method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_reset_start_time].
    public static void ma_sound_reset_start_time(
    	MaSound pSound
    ) {
    	ma_sound_reset_start_time(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_reset_stop_time(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_RESET_STOP_TIME.get();
    	try {
    		 method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_reset_stop_time].
    public static void ma_sound_reset_stop_time(
    	MaSound pSound
    ) {
    	ma_sound_reset_stop_time(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_reset_fade(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_RESET_FADE.get();
    	try {
    		 method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_reset_fade].
    public static void ma_sound_reset_fade(
    	MaSound pSound
    ) {
    	ma_sound_reset_fade(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_reset_stop_time_and_fade(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_RESET_STOP_TIME_AND_FADE.get();
    	try {
    		 method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_reset_stop_time_and_fade].
    public static void ma_sound_reset_stop_time_and_fade(
    	MaSound pSound
    ) {
    	ma_sound_reset_stop_time_and_fade(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_set_volume(
    	MemorySegment pSound,
    	float volume
    ) {
    	MethodHandle method = MA_SOUND_SET_VOLUME.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			volume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_volume].
    public static void ma_sound_set_volume(
    	MaSound pSound,
    	float volume
    ) {
    	ma_sound_set_volume(
    		pSound.memorySegment(),
    		volume
    	);
    }
    
    public static float ma_sound_get_volume(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_VOLUME.get();
    	try {
    		return (float) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_volume].
    public static float ma_sound_get_volume(
    	MaSound pSound
    ) {
    	return ma_sound_get_volume(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_set_pan(
    	MemorySegment pSound,
    	float pan
    ) {
    	MethodHandle method = MA_SOUND_SET_PAN.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			pan
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_pan].
    public static void ma_sound_set_pan(
    	MaSound pSound,
    	float pan
    ) {
    	ma_sound_set_pan(
    		pSound.memorySegment(),
    		pan
    	);
    }
    
    public static float ma_sound_get_pan(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_PAN.get();
    	try {
    		return (float) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_pan].
    public static float ma_sound_get_pan(
    	MaSound pSound
    ) {
    	return ma_sound_get_pan(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_set_pan_mode(
    	MemorySegment pSound,
    	int panMode
    ) {
    	MethodHandle method = MA_SOUND_SET_PAN_MODE.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			panMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_pan_mode].
    public static void ma_sound_set_pan_mode(
    	MaSound pSound,
    	int panMode
    ) {
    	ma_sound_set_pan_mode(
    		pSound.memorySegment(),
    		panMode
    	);
    }
    
    public static int ma_sound_get_pan_mode(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_PAN_MODE.get();
    	try {
    		return (int) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_pan_mode].
    public static int ma_sound_get_pan_mode(
    	MaSound pSound
    ) {
    	return ma_sound_get_pan_mode(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_set_pitch(
    	MemorySegment pSound,
    	float pitch
    ) {
    	MethodHandle method = MA_SOUND_SET_PITCH.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			pitch
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_pitch].
    public static void ma_sound_set_pitch(
    	MaSound pSound,
    	float pitch
    ) {
    	ma_sound_set_pitch(
    		pSound.memorySegment(),
    		pitch
    	);
    }
    
    public static float ma_sound_get_pitch(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_PITCH.get();
    	try {
    		return (float) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_pitch].
    public static float ma_sound_get_pitch(
    	MaSound pSound
    ) {
    	return ma_sound_get_pitch(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_set_spatialization_enabled(
    	MemorySegment pSound,
    	int enabled
    ) {
    	MethodHandle method = MA_SOUND_SET_SPATIALIZATION_ENABLED.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			enabled
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_spatialization_enabled].
    public static void ma_sound_set_spatialization_enabled(
    	MaSound pSound,
    	int enabled
    ) {
    	ma_sound_set_spatialization_enabled(
    		pSound.memorySegment(),
    		enabled
    	);
    }
    
    public static int ma_sound_is_spatialization_enabled(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_IS_SPATIALIZATION_ENABLED.get();
    	try {
    		return (int) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_is_spatialization_enabled].
    public static int ma_sound_is_spatialization_enabled(
    	MaSound pSound
    ) {
    	return ma_sound_is_spatialization_enabled(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_set_pinned_listener_index(
    	MemorySegment pSound,
    	int listenerIndex
    ) {
    	MethodHandle method = MA_SOUND_SET_PINNED_LISTENER_INDEX.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			listenerIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_pinned_listener_index].
    public static void ma_sound_set_pinned_listener_index(
    	MaSound pSound,
    	int listenerIndex
    ) {
    	ma_sound_set_pinned_listener_index(
    		pSound.memorySegment(),
    		listenerIndex
    	);
    }
    
    public static int ma_sound_get_pinned_listener_index(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_PINNED_LISTENER_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_pinned_listener_index].
    public static int ma_sound_get_pinned_listener_index(
    	MaSound pSound
    ) {
    	return ma_sound_get_pinned_listener_index(
    		pSound.memorySegment()
    	);
    }
    
    public static int ma_sound_get_listener_index(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_LISTENER_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_listener_index].
    public static int ma_sound_get_listener_index(
    	MaSound pSound
    ) {
    	return ma_sound_get_listener_index(
    		pSound.memorySegment()
    	);
    }
    
    public static MemorySegment ma_sound_get_direction_to_listener(
    	SegmentAllocator allocator,
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_DIRECTION_TO_LISTENER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_direction_to_listener].
    public static @Nullable MaVec3f ma_sound_get_direction_to_listener(
    	SegmentAllocator allocator,
    	MaSound pSound
    ) {
    	MemorySegment segment = ma_sound_get_direction_to_listener(
    		allocator,
    		pSound.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaVec3f(segment);
    }
    
    public static void ma_sound_set_position(
    	MemorySegment pSound,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = MA_SOUND_SET_POSITION.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_position].
    public static void ma_sound_set_position(
    	MaSound pSound,
    	float x,
    	float y,
    	float z
    ) {
    	ma_sound_set_position(
    		pSound.memorySegment(),
    		x,
    		y,
    		z
    	);
    }
    
    public static MemorySegment ma_sound_get_position(
    	SegmentAllocator allocator,
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_POSITION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_position].
    public static @Nullable MaVec3f ma_sound_get_position(
    	SegmentAllocator allocator,
    	MaSound pSound
    ) {
    	MemorySegment segment = ma_sound_get_position(
    		allocator,
    		pSound.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaVec3f(segment);
    }
    
    public static void ma_sound_set_direction(
    	MemorySegment pSound,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = MA_SOUND_SET_DIRECTION.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_direction].
    public static void ma_sound_set_direction(
    	MaSound pSound,
    	float x,
    	float y,
    	float z
    ) {
    	ma_sound_set_direction(
    		pSound.memorySegment(),
    		x,
    		y,
    		z
    	);
    }
    
    public static MemorySegment ma_sound_get_direction(
    	SegmentAllocator allocator,
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_DIRECTION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_direction].
    public static @Nullable MaVec3f ma_sound_get_direction(
    	SegmentAllocator allocator,
    	MaSound pSound
    ) {
    	MemorySegment segment = ma_sound_get_direction(
    		allocator,
    		pSound.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaVec3f(segment);
    }
    
    public static void ma_sound_set_velocity(
    	MemorySegment pSound,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = MA_SOUND_SET_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_velocity].
    public static void ma_sound_set_velocity(
    	MaSound pSound,
    	float x,
    	float y,
    	float z
    ) {
    	ma_sound_set_velocity(
    		pSound.memorySegment(),
    		x,
    		y,
    		z
    	);
    }
    
    public static MemorySegment ma_sound_get_velocity(
    	SegmentAllocator allocator,
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_VELOCITY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_velocity].
    public static @Nullable MaVec3f ma_sound_get_velocity(
    	SegmentAllocator allocator,
    	MaSound pSound
    ) {
    	MemorySegment segment = ma_sound_get_velocity(
    		allocator,
    		pSound.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaVec3f(segment);
    }
    
    public static void ma_sound_set_attenuation_model(
    	MemorySegment pSound,
    	int attenuationModel
    ) {
    	MethodHandle method = MA_SOUND_SET_ATTENUATION_MODEL.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			attenuationModel
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_attenuation_model].
    public static void ma_sound_set_attenuation_model(
    	MaSound pSound,
    	int attenuationModel
    ) {
    	ma_sound_set_attenuation_model(
    		pSound.memorySegment(),
    		attenuationModel
    	);
    }
    
    public static int ma_sound_get_attenuation_model(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_ATTENUATION_MODEL.get();
    	try {
    		return (int) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_attenuation_model].
    public static int ma_sound_get_attenuation_model(
    	MaSound pSound
    ) {
    	return ma_sound_get_attenuation_model(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_set_positioning(
    	MemorySegment pSound,
    	int positioning
    ) {
    	MethodHandle method = MA_SOUND_SET_POSITIONING.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			positioning
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_positioning].
    public static void ma_sound_set_positioning(
    	MaSound pSound,
    	int positioning
    ) {
    	ma_sound_set_positioning(
    		pSound.memorySegment(),
    		positioning
    	);
    }
    
    public static int ma_sound_get_positioning(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_POSITIONING.get();
    	try {
    		return (int) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_positioning].
    public static int ma_sound_get_positioning(
    	MaSound pSound
    ) {
    	return ma_sound_get_positioning(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_set_rolloff(
    	MemorySegment pSound,
    	float rolloff
    ) {
    	MethodHandle method = MA_SOUND_SET_ROLLOFF.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			rolloff
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_rolloff].
    public static void ma_sound_set_rolloff(
    	MaSound pSound,
    	float rolloff
    ) {
    	ma_sound_set_rolloff(
    		pSound.memorySegment(),
    		rolloff
    	);
    }
    
    public static float ma_sound_get_rolloff(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_ROLLOFF.get();
    	try {
    		return (float) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_rolloff].
    public static float ma_sound_get_rolloff(
    	MaSound pSound
    ) {
    	return ma_sound_get_rolloff(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_set_min_gain(
    	MemorySegment pSound,
    	float minGain
    ) {
    	MethodHandle method = MA_SOUND_SET_MIN_GAIN.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			minGain
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_min_gain].
    public static void ma_sound_set_min_gain(
    	MaSound pSound,
    	float minGain
    ) {
    	ma_sound_set_min_gain(
    		pSound.memorySegment(),
    		minGain
    	);
    }
    
    public static float ma_sound_get_min_gain(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_MIN_GAIN.get();
    	try {
    		return (float) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_min_gain].
    public static float ma_sound_get_min_gain(
    	MaSound pSound
    ) {
    	return ma_sound_get_min_gain(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_set_max_gain(
    	MemorySegment pSound,
    	float maxGain
    ) {
    	MethodHandle method = MA_SOUND_SET_MAX_GAIN.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			maxGain
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_max_gain].
    public static void ma_sound_set_max_gain(
    	MaSound pSound,
    	float maxGain
    ) {
    	ma_sound_set_max_gain(
    		pSound.memorySegment(),
    		maxGain
    	);
    }
    
    public static float ma_sound_get_max_gain(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_MAX_GAIN.get();
    	try {
    		return (float) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_max_gain].
    public static float ma_sound_get_max_gain(
    	MaSound pSound
    ) {
    	return ma_sound_get_max_gain(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_set_min_distance(
    	MemorySegment pSound,
    	float minDistance
    ) {
    	MethodHandle method = MA_SOUND_SET_MIN_DISTANCE.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			minDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_min_distance].
    public static void ma_sound_set_min_distance(
    	MaSound pSound,
    	float minDistance
    ) {
    	ma_sound_set_min_distance(
    		pSound.memorySegment(),
    		minDistance
    	);
    }
    
    public static float ma_sound_get_min_distance(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_MIN_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_min_distance].
    public static float ma_sound_get_min_distance(
    	MaSound pSound
    ) {
    	return ma_sound_get_min_distance(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_set_max_distance(
    	MemorySegment pSound,
    	float maxDistance
    ) {
    	MethodHandle method = MA_SOUND_SET_MAX_DISTANCE.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			maxDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_max_distance].
    public static void ma_sound_set_max_distance(
    	MaSound pSound,
    	float maxDistance
    ) {
    	ma_sound_set_max_distance(
    		pSound.memorySegment(),
    		maxDistance
    	);
    }
    
    public static float ma_sound_get_max_distance(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_MAX_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_max_distance].
    public static float ma_sound_get_max_distance(
    	MaSound pSound
    ) {
    	return ma_sound_get_max_distance(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_set_cone(
    	MemorySegment pSound,
    	float innerAngleInRadians,
    	float outerAngleInRadians,
    	float outerGain
    ) {
    	MethodHandle method = MA_SOUND_SET_CONE.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			innerAngleInRadians,
    			outerAngleInRadians,
    			outerGain
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_cone].
    public static void ma_sound_set_cone(
    	MaSound pSound,
    	float innerAngleInRadians,
    	float outerAngleInRadians,
    	float outerGain
    ) {
    	ma_sound_set_cone(
    		pSound.memorySegment(),
    		innerAngleInRadians,
    		outerAngleInRadians,
    		outerGain
    	);
    }
    
    public static void ma_sound_get_cone(
    	MemorySegment pSound,
    	MemorySegment pInnerAngleInRadians,
    	MemorySegment pOuterAngleInRadians,
    	MemorySegment pOuterGain
    ) {
    	MethodHandle method = MA_SOUND_GET_CONE.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			pInnerAngleInRadians,
    			pOuterAngleInRadians,
    			pOuterGain
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_cone].
    public static void ma_sound_get_cone(
    	MaSound pSound,
    	NativeFloatArray pInnerAngleInRadians,
    	NativeFloatArray pOuterAngleInRadians,
    	NativeFloatArray pOuterGain
    ) {
    	ma_sound_get_cone(
    		pSound.memorySegment(),
    		pInnerAngleInRadians.memorySegment(),
    		pOuterAngleInRadians.memorySegment(),
    		pOuterGain.memorySegment()
    	);
    }
    
    public static void ma_sound_set_doppler_factor(
    	MemorySegment pSound,
    	float dopplerFactor
    ) {
    	MethodHandle method = MA_SOUND_SET_DOPPLER_FACTOR.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			dopplerFactor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_doppler_factor].
    public static void ma_sound_set_doppler_factor(
    	MaSound pSound,
    	float dopplerFactor
    ) {
    	ma_sound_set_doppler_factor(
    		pSound.memorySegment(),
    		dopplerFactor
    	);
    }
    
    public static float ma_sound_get_doppler_factor(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_DOPPLER_FACTOR.get();
    	try {
    		return (float) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_doppler_factor].
    public static float ma_sound_get_doppler_factor(
    	MaSound pSound
    ) {
    	return ma_sound_get_doppler_factor(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_set_directional_attenuation_factor(
    	MemorySegment pSound,
    	float directionalAttenuationFactor
    ) {
    	MethodHandle method = MA_SOUND_SET_DIRECTIONAL_ATTENUATION_FACTOR.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			directionalAttenuationFactor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_directional_attenuation_factor].
    public static void ma_sound_set_directional_attenuation_factor(
    	MaSound pSound,
    	float directionalAttenuationFactor
    ) {
    	ma_sound_set_directional_attenuation_factor(
    		pSound.memorySegment(),
    		directionalAttenuationFactor
    	);
    }
    
    public static float ma_sound_get_directional_attenuation_factor(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_DIRECTIONAL_ATTENUATION_FACTOR.get();
    	try {
    		return (float) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_directional_attenuation_factor].
    public static float ma_sound_get_directional_attenuation_factor(
    	MaSound pSound
    ) {
    	return ma_sound_get_directional_attenuation_factor(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_set_fade_in_pcm_frames(
    	MemorySegment pSound,
    	float volumeBeg,
    	float volumeEnd,
    	long fadeLengthInFrames
    ) {
    	MethodHandle method = MA_SOUND_SET_FADE_IN_PCM_FRAMES.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			volumeBeg,
    			volumeEnd,
    			fadeLengthInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_fade_in_pcm_frames].
    public static void ma_sound_set_fade_in_pcm_frames(
    	MaSound pSound,
    	float volumeBeg,
    	float volumeEnd,
    	long fadeLengthInFrames
    ) {
    	ma_sound_set_fade_in_pcm_frames(
    		pSound.memorySegment(),
    		volumeBeg,
    		volumeEnd,
    		fadeLengthInFrames
    	);
    }
    
    public static void ma_sound_set_fade_in_milliseconds(
    	MemorySegment pSound,
    	float volumeBeg,
    	float volumeEnd,
    	long fadeLengthInMilliseconds
    ) {
    	MethodHandle method = MA_SOUND_SET_FADE_IN_MILLISECONDS.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			volumeBeg,
    			volumeEnd,
    			fadeLengthInMilliseconds
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_fade_in_milliseconds].
    public static void ma_sound_set_fade_in_milliseconds(
    	MaSound pSound,
    	float volumeBeg,
    	float volumeEnd,
    	long fadeLengthInMilliseconds
    ) {
    	ma_sound_set_fade_in_milliseconds(
    		pSound.memorySegment(),
    		volumeBeg,
    		volumeEnd,
    		fadeLengthInMilliseconds
    	);
    }
    
    public static void ma_sound_set_fade_start_in_pcm_frames(
    	MemorySegment pSound,
    	float volumeBeg,
    	float volumeEnd,
    	long fadeLengthInFrames,
    	long absoluteGlobalTimeInFrames
    ) {
    	MethodHandle method = MA_SOUND_SET_FADE_START_IN_PCM_FRAMES.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			volumeBeg,
    			volumeEnd,
    			fadeLengthInFrames,
    			absoluteGlobalTimeInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_fade_start_in_pcm_frames].
    public static void ma_sound_set_fade_start_in_pcm_frames(
    	MaSound pSound,
    	float volumeBeg,
    	float volumeEnd,
    	long fadeLengthInFrames,
    	long absoluteGlobalTimeInFrames
    ) {
    	ma_sound_set_fade_start_in_pcm_frames(
    		pSound.memorySegment(),
    		volumeBeg,
    		volumeEnd,
    		fadeLengthInFrames,
    		absoluteGlobalTimeInFrames
    	);
    }
    
    public static void ma_sound_set_fade_start_in_milliseconds(
    	MemorySegment pSound,
    	float volumeBeg,
    	float volumeEnd,
    	long fadeLengthInMilliseconds,
    	long absoluteGlobalTimeInMilliseconds
    ) {
    	MethodHandle method = MA_SOUND_SET_FADE_START_IN_MILLISECONDS.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			volumeBeg,
    			volumeEnd,
    			fadeLengthInMilliseconds,
    			absoluteGlobalTimeInMilliseconds
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_fade_start_in_milliseconds].
    public static void ma_sound_set_fade_start_in_milliseconds(
    	MaSound pSound,
    	float volumeBeg,
    	float volumeEnd,
    	long fadeLengthInMilliseconds,
    	long absoluteGlobalTimeInMilliseconds
    ) {
    	ma_sound_set_fade_start_in_milliseconds(
    		pSound.memorySegment(),
    		volumeBeg,
    		volumeEnd,
    		fadeLengthInMilliseconds,
    		absoluteGlobalTimeInMilliseconds
    	);
    }
    
    public static float ma_sound_get_current_fade_volume(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_CURRENT_FADE_VOLUME.get();
    	try {
    		return (float) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_current_fade_volume].
    public static float ma_sound_get_current_fade_volume(
    	MaSound pSound
    ) {
    	return ma_sound_get_current_fade_volume(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_set_start_time_in_pcm_frames(
    	MemorySegment pSound,
    	long absoluteGlobalTimeInFrames
    ) {
    	MethodHandle method = MA_SOUND_SET_START_TIME_IN_PCM_FRAMES.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			absoluteGlobalTimeInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_start_time_in_pcm_frames].
    public static void ma_sound_set_start_time_in_pcm_frames(
    	MaSound pSound,
    	long absoluteGlobalTimeInFrames
    ) {
    	ma_sound_set_start_time_in_pcm_frames(
    		pSound.memorySegment(),
    		absoluteGlobalTimeInFrames
    	);
    }
    
    public static void ma_sound_set_start_time_in_milliseconds(
    	MemorySegment pSound,
    	long absoluteGlobalTimeInMilliseconds
    ) {
    	MethodHandle method = MA_SOUND_SET_START_TIME_IN_MILLISECONDS.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			absoluteGlobalTimeInMilliseconds
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_start_time_in_milliseconds].
    public static void ma_sound_set_start_time_in_milliseconds(
    	MaSound pSound,
    	long absoluteGlobalTimeInMilliseconds
    ) {
    	ma_sound_set_start_time_in_milliseconds(
    		pSound.memorySegment(),
    		absoluteGlobalTimeInMilliseconds
    	);
    }
    
    public static void ma_sound_set_stop_time_in_pcm_frames(
    	MemorySegment pSound,
    	long absoluteGlobalTimeInFrames
    ) {
    	MethodHandle method = MA_SOUND_SET_STOP_TIME_IN_PCM_FRAMES.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			absoluteGlobalTimeInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_stop_time_in_pcm_frames].
    public static void ma_sound_set_stop_time_in_pcm_frames(
    	MaSound pSound,
    	long absoluteGlobalTimeInFrames
    ) {
    	ma_sound_set_stop_time_in_pcm_frames(
    		pSound.memorySegment(),
    		absoluteGlobalTimeInFrames
    	);
    }
    
    public static void ma_sound_set_stop_time_in_milliseconds(
    	MemorySegment pSound,
    	long absoluteGlobalTimeInMilliseconds
    ) {
    	MethodHandle method = MA_SOUND_SET_STOP_TIME_IN_MILLISECONDS.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			absoluteGlobalTimeInMilliseconds
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_stop_time_in_milliseconds].
    public static void ma_sound_set_stop_time_in_milliseconds(
    	MaSound pSound,
    	long absoluteGlobalTimeInMilliseconds
    ) {
    	ma_sound_set_stop_time_in_milliseconds(
    		pSound.memorySegment(),
    		absoluteGlobalTimeInMilliseconds
    	);
    }
    
    public static void ma_sound_set_stop_time_with_fade_in_pcm_frames(
    	MemorySegment pSound,
    	long stopAbsoluteGlobalTimeInFrames,
    	long fadeLengthInFrames
    ) {
    	MethodHandle method = MA_SOUND_SET_STOP_TIME_WITH_FADE_IN_PCM_FRAMES.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			stopAbsoluteGlobalTimeInFrames,
    			fadeLengthInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_stop_time_with_fade_in_pcm_frames].
    public static void ma_sound_set_stop_time_with_fade_in_pcm_frames(
    	MaSound pSound,
    	long stopAbsoluteGlobalTimeInFrames,
    	long fadeLengthInFrames
    ) {
    	ma_sound_set_stop_time_with_fade_in_pcm_frames(
    		pSound.memorySegment(),
    		stopAbsoluteGlobalTimeInFrames,
    		fadeLengthInFrames
    	);
    }
    
    public static void ma_sound_set_stop_time_with_fade_in_milliseconds(
    	MemorySegment pSound,
    	long stopAbsoluteGlobalTimeInMilliseconds,
    	long fadeLengthInMilliseconds
    ) {
    	MethodHandle method = MA_SOUND_SET_STOP_TIME_WITH_FADE_IN_MILLISECONDS.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			stopAbsoluteGlobalTimeInMilliseconds,
    			fadeLengthInMilliseconds
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_stop_time_with_fade_in_milliseconds].
    public static void ma_sound_set_stop_time_with_fade_in_milliseconds(
    	MaSound pSound,
    	long stopAbsoluteGlobalTimeInMilliseconds,
    	long fadeLengthInMilliseconds
    ) {
    	ma_sound_set_stop_time_with_fade_in_milliseconds(
    		pSound.memorySegment(),
    		stopAbsoluteGlobalTimeInMilliseconds,
    		fadeLengthInMilliseconds
    	);
    }
    
    public static int ma_sound_is_playing(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_IS_PLAYING.get();
    	try {
    		return (int) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_is_playing].
    public static int ma_sound_is_playing(
    	MaSound pSound
    ) {
    	return ma_sound_is_playing(
    		pSound.memorySegment()
    	);
    }
    
    public static long ma_sound_get_time_in_pcm_frames(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_TIME_IN_PCM_FRAMES.get();
    	try {
    		return (long) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_time_in_pcm_frames].
    public static long ma_sound_get_time_in_pcm_frames(
    	MaSound pSound
    ) {
    	return ma_sound_get_time_in_pcm_frames(
    		pSound.memorySegment()
    	);
    }
    
    public static long ma_sound_get_time_in_milliseconds(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_GET_TIME_IN_MILLISECONDS.get();
    	try {
    		return (long) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_time_in_milliseconds].
    public static long ma_sound_get_time_in_milliseconds(
    	MaSound pSound
    ) {
    	return ma_sound_get_time_in_milliseconds(
    		pSound.memorySegment()
    	);
    }
    
    public static void ma_sound_set_looping(
    	MemorySegment pSound,
    	int isLooping
    ) {
    	MethodHandle method = MA_SOUND_SET_LOOPING.get();
    	try {
    		 method.invokeExact(
    			pSound,
    			isLooping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_looping].
    public static void ma_sound_set_looping(
    	MaSound pSound,
    	int isLooping
    ) {
    	ma_sound_set_looping(
    		pSound.memorySegment(),
    		isLooping
    	);
    }
    
    public static int ma_sound_is_looping(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_IS_LOOPING.get();
    	try {
    		return (int) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_is_looping].
    public static int ma_sound_is_looping(
    	MaSound pSound
    ) {
    	return ma_sound_is_looping(
    		pSound.memorySegment()
    	);
    }
    
    public static int ma_sound_at_end(
    	MemorySegment pSound
    ) {
    	MethodHandle method = MA_SOUND_AT_END.get();
    	try {
    		return (int) method.invokeExact(
    			pSound
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_at_end].
    public static int ma_sound_at_end(
    	MaSound pSound
    ) {
    	return ma_sound_at_end(
    		pSound.memorySegment()
    	);
    }
    
    public static int ma_sound_seek_to_pcm_frame(
    	MemorySegment pSound,
    	long frameIndex
    ) {
    	MethodHandle method = MA_SOUND_SEEK_TO_PCM_FRAME.get();
    	try {
    		return (int) method.invokeExact(
    			pSound,
    			frameIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_seek_to_pcm_frame].
    public static int ma_sound_seek_to_pcm_frame(
    	MaSound pSound,
    	long frameIndex
    ) {
    	return ma_sound_seek_to_pcm_frame(
    		pSound.memorySegment(),
    		frameIndex
    	);
    }
    
    public static int ma_sound_seek_to_second(
    	MemorySegment pSound,
    	float seekPointInSeconds
    ) {
    	MethodHandle method = MA_SOUND_SEEK_TO_SECOND.get();
    	try {
    		return (int) method.invokeExact(
    			pSound,
    			seekPointInSeconds
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_seek_to_second].
    public static int ma_sound_seek_to_second(
    	MaSound pSound,
    	float seekPointInSeconds
    ) {
    	return ma_sound_seek_to_second(
    		pSound.memorySegment(),
    		seekPointInSeconds
    	);
    }
    
    public static int ma_sound_get_data_format(
    	MemorySegment pSound,
    	MemorySegment pFormat,
    	MemorySegment pChannels,
    	MemorySegment pSampleRate,
    	MemorySegment pChannelMap,
    	long channelMapCap
    ) {
    	MethodHandle method = MA_SOUND_GET_DATA_FORMAT.get();
    	try {
    		return (int) method.invokeExact(
    			pSound,
    			pFormat,
    			pChannels,
    			pSampleRate,
    			pChannelMap,
    			channelMapCap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_data_format].
    public static int ma_sound_get_data_format(
    	MaSound pSound,
    	NativeIntArray pFormat,
    	NativeIntArray pChannels,
    	NativeIntArray pSampleRate,
    	NativeByteArray pChannelMap,
    	long channelMapCap
    ) {
    	return ma_sound_get_data_format(
    		pSound.memorySegment(),
    		pFormat.memorySegment(),
    		pChannels.memorySegment(),
    		pSampleRate.memorySegment(),
    		pChannelMap.memorySegment(),
    		channelMapCap
    	);
    }
    
    public static int ma_sound_get_cursor_in_pcm_frames(
    	MemorySegment pSound,
    	MemorySegment pCursor
    ) {
    	MethodHandle method = MA_SOUND_GET_CURSOR_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pSound,
    			pCursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_cursor_in_pcm_frames].
    public static int ma_sound_get_cursor_in_pcm_frames(
    	MaSound pSound,
    	NativeLongArray pCursor
    ) {
    	return ma_sound_get_cursor_in_pcm_frames(
    		pSound.memorySegment(),
    		pCursor.memorySegment()
    	);
    }
    
    public static int ma_sound_get_length_in_pcm_frames(
    	MemorySegment pSound,
    	MemorySegment pLength
    ) {
    	MethodHandle method = MA_SOUND_GET_LENGTH_IN_PCM_FRAMES.get();
    	try {
    		return (int) method.invokeExact(
    			pSound,
    			pLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_length_in_pcm_frames].
    public static int ma_sound_get_length_in_pcm_frames(
    	MaSound pSound,
    	NativeLongArray pLength
    ) {
    	return ma_sound_get_length_in_pcm_frames(
    		pSound.memorySegment(),
    		pLength.memorySegment()
    	);
    }
    
    public static int ma_sound_get_cursor_in_seconds(
    	MemorySegment pSound,
    	MemorySegment pCursor
    ) {
    	MethodHandle method = MA_SOUND_GET_CURSOR_IN_SECONDS.get();
    	try {
    		return (int) method.invokeExact(
    			pSound,
    			pCursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_cursor_in_seconds].
    public static int ma_sound_get_cursor_in_seconds(
    	MaSound pSound,
    	NativeFloatArray pCursor
    ) {
    	return ma_sound_get_cursor_in_seconds(
    		pSound.memorySegment(),
    		pCursor.memorySegment()
    	);
    }
    
    public static int ma_sound_get_length_in_seconds(
    	MemorySegment pSound,
    	MemorySegment pLength
    ) {
    	MethodHandle method = MA_SOUND_GET_LENGTH_IN_SECONDS.get();
    	try {
    		return (int) method.invokeExact(
    			pSound,
    			pLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_get_length_in_seconds].
    public static int ma_sound_get_length_in_seconds(
    	MaSound pSound,
    	NativeFloatArray pLength
    ) {
    	return ma_sound_get_length_in_seconds(
    		pSound.memorySegment(),
    		pLength.memorySegment()
    	);
    }
    
    public static int ma_sound_set_end_callback(
    	MemorySegment pSound,
    	MemorySegment callback,
    	MemorySegment pUserData
    ) {
    	MethodHandle method = MA_SOUND_SET_END_CALLBACK.get();
    	try {
    		return (int) method.invokeExact(
    			pSound,
    			callback,
    			pUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_set_end_callback].
    public static int ma_sound_set_end_callback(
    	MaSound pSound,
    	MaSoundEndProc callback,
    	MemorySegment pUserData
    ) {
    	return ma_sound_set_end_callback(
    		pSound.memorySegment(),
    		callback.memorySegment(),
    		pUserData
    	);
    }
    
    public static int ma_sound_group_init(
    	MemorySegment pEngine,
    	int flags,
    	MemorySegment pParentGroup,
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine,
    			flags,
    			pParentGroup,
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_init].
    public static int ma_sound_group_init(
    	MaEngine pEngine,
    	int flags,
    	MaSound pParentGroup,
    	MaSound pGroup
    ) {
    	return ma_sound_group_init(
    		pEngine.memorySegment(),
    		flags,
    		pParentGroup.memorySegment(),
    		pGroup.memorySegment()
    	);
    }
    
    public static int ma_sound_group_init_ex(
    	MemorySegment pEngine,
    	MemorySegment pConfig,
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_INIT_EX.get();
    	try {
    		return (int) method.invokeExact(
    			pEngine,
    			pConfig,
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_init_ex].
    public static int ma_sound_group_init_ex(
    	MaEngine pEngine,
    	MaSoundConfig pConfig,
    	MaSound pGroup
    ) {
    	return ma_sound_group_init_ex(
    		pEngine.memorySegment(),
    		pConfig.memorySegment(),
    		pGroup.memorySegment()
    	);
    }
    
    public static void ma_sound_group_uninit(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_UNINIT.get();
    	try {
    		 method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_uninit].
    public static void ma_sound_group_uninit(
    	MaSound pGroup
    ) {
    	ma_sound_group_uninit(
    		pGroup.memorySegment()
    	);
    }
    
    public static MemorySegment ma_sound_group_get_engine(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_ENGINE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_engine].
    public static @Nullable MaEngine ma_sound_group_get_engine(
    	MaSound pGroup
    ) {
    	MemorySegment segment = ma_sound_group_get_engine(
    		pGroup.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaEngine(segment);
    }
    
    public static int ma_sound_group_start(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_START.get();
    	try {
    		return (int) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_start].
    public static int ma_sound_group_start(
    	MaSound pGroup
    ) {
    	return ma_sound_group_start(
    		pGroup.memorySegment()
    	);
    }
    
    public static int ma_sound_group_stop(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_STOP.get();
    	try {
    		return (int) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_stop].
    public static int ma_sound_group_stop(
    	MaSound pGroup
    ) {
    	return ma_sound_group_stop(
    		pGroup.memorySegment()
    	);
    }
    
    public static void ma_sound_group_set_volume(
    	MemorySegment pGroup,
    	float volume
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_VOLUME.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			volume
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_volume].
    public static void ma_sound_group_set_volume(
    	MaSound pGroup,
    	float volume
    ) {
    	ma_sound_group_set_volume(
    		pGroup.memorySegment(),
    		volume
    	);
    }
    
    public static float ma_sound_group_get_volume(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_VOLUME.get();
    	try {
    		return (float) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_volume].
    public static float ma_sound_group_get_volume(
    	MaSound pGroup
    ) {
    	return ma_sound_group_get_volume(
    		pGroup.memorySegment()
    	);
    }
    
    public static void ma_sound_group_set_pan(
    	MemorySegment pGroup,
    	float pan
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_PAN.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			pan
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_pan].
    public static void ma_sound_group_set_pan(
    	MaSound pGroup,
    	float pan
    ) {
    	ma_sound_group_set_pan(
    		pGroup.memorySegment(),
    		pan
    	);
    }
    
    public static float ma_sound_group_get_pan(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_PAN.get();
    	try {
    		return (float) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_pan].
    public static float ma_sound_group_get_pan(
    	MaSound pGroup
    ) {
    	return ma_sound_group_get_pan(
    		pGroup.memorySegment()
    	);
    }
    
    public static void ma_sound_group_set_pan_mode(
    	MemorySegment pGroup,
    	int panMode
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_PAN_MODE.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			panMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_pan_mode].
    public static void ma_sound_group_set_pan_mode(
    	MaSound pGroup,
    	int panMode
    ) {
    	ma_sound_group_set_pan_mode(
    		pGroup.memorySegment(),
    		panMode
    	);
    }
    
    public static int ma_sound_group_get_pan_mode(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_PAN_MODE.get();
    	try {
    		return (int) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_pan_mode].
    public static int ma_sound_group_get_pan_mode(
    	MaSound pGroup
    ) {
    	return ma_sound_group_get_pan_mode(
    		pGroup.memorySegment()
    	);
    }
    
    public static void ma_sound_group_set_pitch(
    	MemorySegment pGroup,
    	float pitch
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_PITCH.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			pitch
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_pitch].
    public static void ma_sound_group_set_pitch(
    	MaSound pGroup,
    	float pitch
    ) {
    	ma_sound_group_set_pitch(
    		pGroup.memorySegment(),
    		pitch
    	);
    }
    
    public static float ma_sound_group_get_pitch(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_PITCH.get();
    	try {
    		return (float) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_pitch].
    public static float ma_sound_group_get_pitch(
    	MaSound pGroup
    ) {
    	return ma_sound_group_get_pitch(
    		pGroup.memorySegment()
    	);
    }
    
    public static void ma_sound_group_set_spatialization_enabled(
    	MemorySegment pGroup,
    	int enabled
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_SPATIALIZATION_ENABLED.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			enabled
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_spatialization_enabled].
    public static void ma_sound_group_set_spatialization_enabled(
    	MaSound pGroup,
    	int enabled
    ) {
    	ma_sound_group_set_spatialization_enabled(
    		pGroup.memorySegment(),
    		enabled
    	);
    }
    
    public static int ma_sound_group_is_spatialization_enabled(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_IS_SPATIALIZATION_ENABLED.get();
    	try {
    		return (int) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_is_spatialization_enabled].
    public static int ma_sound_group_is_spatialization_enabled(
    	MaSound pGroup
    ) {
    	return ma_sound_group_is_spatialization_enabled(
    		pGroup.memorySegment()
    	);
    }
    
    public static void ma_sound_group_set_pinned_listener_index(
    	MemorySegment pGroup,
    	int listenerIndex
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_PINNED_LISTENER_INDEX.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			listenerIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_pinned_listener_index].
    public static void ma_sound_group_set_pinned_listener_index(
    	MaSound pGroup,
    	int listenerIndex
    ) {
    	ma_sound_group_set_pinned_listener_index(
    		pGroup.memorySegment(),
    		listenerIndex
    	);
    }
    
    public static int ma_sound_group_get_pinned_listener_index(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_PINNED_LISTENER_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_pinned_listener_index].
    public static int ma_sound_group_get_pinned_listener_index(
    	MaSound pGroup
    ) {
    	return ma_sound_group_get_pinned_listener_index(
    		pGroup.memorySegment()
    	);
    }
    
    public static int ma_sound_group_get_listener_index(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_LISTENER_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_listener_index].
    public static int ma_sound_group_get_listener_index(
    	MaSound pGroup
    ) {
    	return ma_sound_group_get_listener_index(
    		pGroup.memorySegment()
    	);
    }
    
    public static MemorySegment ma_sound_group_get_direction_to_listener(
    	SegmentAllocator allocator,
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_DIRECTION_TO_LISTENER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_direction_to_listener].
    public static @Nullable MaVec3f ma_sound_group_get_direction_to_listener(
    	SegmentAllocator allocator,
    	MaSound pGroup
    ) {
    	MemorySegment segment = ma_sound_group_get_direction_to_listener(
    		allocator,
    		pGroup.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaVec3f(segment);
    }
    
    public static void ma_sound_group_set_position(
    	MemorySegment pGroup,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_POSITION.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_position].
    public static void ma_sound_group_set_position(
    	MaSound pGroup,
    	float x,
    	float y,
    	float z
    ) {
    	ma_sound_group_set_position(
    		pGroup.memorySegment(),
    		x,
    		y,
    		z
    	);
    }
    
    public static MemorySegment ma_sound_group_get_position(
    	SegmentAllocator allocator,
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_POSITION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_position].
    public static @Nullable MaVec3f ma_sound_group_get_position(
    	SegmentAllocator allocator,
    	MaSound pGroup
    ) {
    	MemorySegment segment = ma_sound_group_get_position(
    		allocator,
    		pGroup.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaVec3f(segment);
    }
    
    public static void ma_sound_group_set_direction(
    	MemorySegment pGroup,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_DIRECTION.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_direction].
    public static void ma_sound_group_set_direction(
    	MaSound pGroup,
    	float x,
    	float y,
    	float z
    ) {
    	ma_sound_group_set_direction(
    		pGroup.memorySegment(),
    		x,
    		y,
    		z
    	);
    }
    
    public static MemorySegment ma_sound_group_get_direction(
    	SegmentAllocator allocator,
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_DIRECTION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_direction].
    public static @Nullable MaVec3f ma_sound_group_get_direction(
    	SegmentAllocator allocator,
    	MaSound pGroup
    ) {
    	MemorySegment segment = ma_sound_group_get_direction(
    		allocator,
    		pGroup.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaVec3f(segment);
    }
    
    public static void ma_sound_group_set_velocity(
    	MemorySegment pGroup,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_velocity].
    public static void ma_sound_group_set_velocity(
    	MaSound pGroup,
    	float x,
    	float y,
    	float z
    ) {
    	ma_sound_group_set_velocity(
    		pGroup.memorySegment(),
    		x,
    		y,
    		z
    	);
    }
    
    public static MemorySegment ma_sound_group_get_velocity(
    	SegmentAllocator allocator,
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_VELOCITY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_velocity].
    public static @Nullable MaVec3f ma_sound_group_get_velocity(
    	SegmentAllocator allocator,
    	MaSound pGroup
    ) {
    	MemorySegment segment = ma_sound_group_get_velocity(
    		allocator,
    		pGroup.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaVec3f(segment);
    }
    
    public static void ma_sound_group_set_attenuation_model(
    	MemorySegment pGroup,
    	int attenuationModel
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_ATTENUATION_MODEL.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			attenuationModel
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_attenuation_model].
    public static void ma_sound_group_set_attenuation_model(
    	MaSound pGroup,
    	int attenuationModel
    ) {
    	ma_sound_group_set_attenuation_model(
    		pGroup.memorySegment(),
    		attenuationModel
    	);
    }
    
    public static int ma_sound_group_get_attenuation_model(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_ATTENUATION_MODEL.get();
    	try {
    		return (int) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_attenuation_model].
    public static int ma_sound_group_get_attenuation_model(
    	MaSound pGroup
    ) {
    	return ma_sound_group_get_attenuation_model(
    		pGroup.memorySegment()
    	);
    }
    
    public static void ma_sound_group_set_positioning(
    	MemorySegment pGroup,
    	int positioning
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_POSITIONING.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			positioning
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_positioning].
    public static void ma_sound_group_set_positioning(
    	MaSound pGroup,
    	int positioning
    ) {
    	ma_sound_group_set_positioning(
    		pGroup.memorySegment(),
    		positioning
    	);
    }
    
    public static int ma_sound_group_get_positioning(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_POSITIONING.get();
    	try {
    		return (int) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_positioning].
    public static int ma_sound_group_get_positioning(
    	MaSound pGroup
    ) {
    	return ma_sound_group_get_positioning(
    		pGroup.memorySegment()
    	);
    }
    
    public static void ma_sound_group_set_rolloff(
    	MemorySegment pGroup,
    	float rolloff
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_ROLLOFF.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			rolloff
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_rolloff].
    public static void ma_sound_group_set_rolloff(
    	MaSound pGroup,
    	float rolloff
    ) {
    	ma_sound_group_set_rolloff(
    		pGroup.memorySegment(),
    		rolloff
    	);
    }
    
    public static float ma_sound_group_get_rolloff(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_ROLLOFF.get();
    	try {
    		return (float) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_rolloff].
    public static float ma_sound_group_get_rolloff(
    	MaSound pGroup
    ) {
    	return ma_sound_group_get_rolloff(
    		pGroup.memorySegment()
    	);
    }
    
    public static void ma_sound_group_set_min_gain(
    	MemorySegment pGroup,
    	float minGain
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_MIN_GAIN.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			minGain
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_min_gain].
    public static void ma_sound_group_set_min_gain(
    	MaSound pGroup,
    	float minGain
    ) {
    	ma_sound_group_set_min_gain(
    		pGroup.memorySegment(),
    		minGain
    	);
    }
    
    public static float ma_sound_group_get_min_gain(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_MIN_GAIN.get();
    	try {
    		return (float) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_min_gain].
    public static float ma_sound_group_get_min_gain(
    	MaSound pGroup
    ) {
    	return ma_sound_group_get_min_gain(
    		pGroup.memorySegment()
    	);
    }
    
    public static void ma_sound_group_set_max_gain(
    	MemorySegment pGroup,
    	float maxGain
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_MAX_GAIN.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			maxGain
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_max_gain].
    public static void ma_sound_group_set_max_gain(
    	MaSound pGroup,
    	float maxGain
    ) {
    	ma_sound_group_set_max_gain(
    		pGroup.memorySegment(),
    		maxGain
    	);
    }
    
    public static float ma_sound_group_get_max_gain(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_MAX_GAIN.get();
    	try {
    		return (float) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_max_gain].
    public static float ma_sound_group_get_max_gain(
    	MaSound pGroup
    ) {
    	return ma_sound_group_get_max_gain(
    		pGroup.memorySegment()
    	);
    }
    
    public static void ma_sound_group_set_min_distance(
    	MemorySegment pGroup,
    	float minDistance
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_MIN_DISTANCE.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			minDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_min_distance].
    public static void ma_sound_group_set_min_distance(
    	MaSound pGroup,
    	float minDistance
    ) {
    	ma_sound_group_set_min_distance(
    		pGroup.memorySegment(),
    		minDistance
    	);
    }
    
    public static float ma_sound_group_get_min_distance(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_MIN_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_min_distance].
    public static float ma_sound_group_get_min_distance(
    	MaSound pGroup
    ) {
    	return ma_sound_group_get_min_distance(
    		pGroup.memorySegment()
    	);
    }
    
    public static void ma_sound_group_set_max_distance(
    	MemorySegment pGroup,
    	float maxDistance
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_MAX_DISTANCE.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			maxDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_max_distance].
    public static void ma_sound_group_set_max_distance(
    	MaSound pGroup,
    	float maxDistance
    ) {
    	ma_sound_group_set_max_distance(
    		pGroup.memorySegment(),
    		maxDistance
    	);
    }
    
    public static float ma_sound_group_get_max_distance(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_MAX_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_max_distance].
    public static float ma_sound_group_get_max_distance(
    	MaSound pGroup
    ) {
    	return ma_sound_group_get_max_distance(
    		pGroup.memorySegment()
    	);
    }
    
    public static void ma_sound_group_set_cone(
    	MemorySegment pGroup,
    	float innerAngleInRadians,
    	float outerAngleInRadians,
    	float outerGain
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_CONE.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			innerAngleInRadians,
    			outerAngleInRadians,
    			outerGain
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_cone].
    public static void ma_sound_group_set_cone(
    	MaSound pGroup,
    	float innerAngleInRadians,
    	float outerAngleInRadians,
    	float outerGain
    ) {
    	ma_sound_group_set_cone(
    		pGroup.memorySegment(),
    		innerAngleInRadians,
    		outerAngleInRadians,
    		outerGain
    	);
    }
    
    public static void ma_sound_group_get_cone(
    	MemorySegment pGroup,
    	MemorySegment pInnerAngleInRadians,
    	MemorySegment pOuterAngleInRadians,
    	MemorySegment pOuterGain
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_CONE.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			pInnerAngleInRadians,
    			pOuterAngleInRadians,
    			pOuterGain
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_cone].
    public static void ma_sound_group_get_cone(
    	MaSound pGroup,
    	NativeFloatArray pInnerAngleInRadians,
    	NativeFloatArray pOuterAngleInRadians,
    	NativeFloatArray pOuterGain
    ) {
    	ma_sound_group_get_cone(
    		pGroup.memorySegment(),
    		pInnerAngleInRadians.memorySegment(),
    		pOuterAngleInRadians.memorySegment(),
    		pOuterGain.memorySegment()
    	);
    }
    
    public static void ma_sound_group_set_doppler_factor(
    	MemorySegment pGroup,
    	float dopplerFactor
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_DOPPLER_FACTOR.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			dopplerFactor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_doppler_factor].
    public static void ma_sound_group_set_doppler_factor(
    	MaSound pGroup,
    	float dopplerFactor
    ) {
    	ma_sound_group_set_doppler_factor(
    		pGroup.memorySegment(),
    		dopplerFactor
    	);
    }
    
    public static float ma_sound_group_get_doppler_factor(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_DOPPLER_FACTOR.get();
    	try {
    		return (float) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_doppler_factor].
    public static float ma_sound_group_get_doppler_factor(
    	MaSound pGroup
    ) {
    	return ma_sound_group_get_doppler_factor(
    		pGroup.memorySegment()
    	);
    }
    
    public static void ma_sound_group_set_directional_attenuation_factor(
    	MemorySegment pGroup,
    	float directionalAttenuationFactor
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_DIRECTIONAL_ATTENUATION_FACTOR.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			directionalAttenuationFactor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_directional_attenuation_factor].
    public static void ma_sound_group_set_directional_attenuation_factor(
    	MaSound pGroup,
    	float directionalAttenuationFactor
    ) {
    	ma_sound_group_set_directional_attenuation_factor(
    		pGroup.memorySegment(),
    		directionalAttenuationFactor
    	);
    }
    
    public static float ma_sound_group_get_directional_attenuation_factor(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_DIRECTIONAL_ATTENUATION_FACTOR.get();
    	try {
    		return (float) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_directional_attenuation_factor].
    public static float ma_sound_group_get_directional_attenuation_factor(
    	MaSound pGroup
    ) {
    	return ma_sound_group_get_directional_attenuation_factor(
    		pGroup.memorySegment()
    	);
    }
    
    public static void ma_sound_group_set_fade_in_pcm_frames(
    	MemorySegment pGroup,
    	float volumeBeg,
    	float volumeEnd,
    	long fadeLengthInFrames
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_FADE_IN_PCM_FRAMES.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			volumeBeg,
    			volumeEnd,
    			fadeLengthInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_fade_in_pcm_frames].
    public static void ma_sound_group_set_fade_in_pcm_frames(
    	MaSound pGroup,
    	float volumeBeg,
    	float volumeEnd,
    	long fadeLengthInFrames
    ) {
    	ma_sound_group_set_fade_in_pcm_frames(
    		pGroup.memorySegment(),
    		volumeBeg,
    		volumeEnd,
    		fadeLengthInFrames
    	);
    }
    
    public static void ma_sound_group_set_fade_in_milliseconds(
    	MemorySegment pGroup,
    	float volumeBeg,
    	float volumeEnd,
    	long fadeLengthInMilliseconds
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_FADE_IN_MILLISECONDS.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			volumeBeg,
    			volumeEnd,
    			fadeLengthInMilliseconds
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_fade_in_milliseconds].
    public static void ma_sound_group_set_fade_in_milliseconds(
    	MaSound pGroup,
    	float volumeBeg,
    	float volumeEnd,
    	long fadeLengthInMilliseconds
    ) {
    	ma_sound_group_set_fade_in_milliseconds(
    		pGroup.memorySegment(),
    		volumeBeg,
    		volumeEnd,
    		fadeLengthInMilliseconds
    	);
    }
    
    public static float ma_sound_group_get_current_fade_volume(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_CURRENT_FADE_VOLUME.get();
    	try {
    		return (float) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_current_fade_volume].
    public static float ma_sound_group_get_current_fade_volume(
    	MaSound pGroup
    ) {
    	return ma_sound_group_get_current_fade_volume(
    		pGroup.memorySegment()
    	);
    }
    
    public static void ma_sound_group_set_start_time_in_pcm_frames(
    	MemorySegment pGroup,
    	long absoluteGlobalTimeInFrames
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_START_TIME_IN_PCM_FRAMES.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			absoluteGlobalTimeInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_start_time_in_pcm_frames].
    public static void ma_sound_group_set_start_time_in_pcm_frames(
    	MaSound pGroup,
    	long absoluteGlobalTimeInFrames
    ) {
    	ma_sound_group_set_start_time_in_pcm_frames(
    		pGroup.memorySegment(),
    		absoluteGlobalTimeInFrames
    	);
    }
    
    public static void ma_sound_group_set_start_time_in_milliseconds(
    	MemorySegment pGroup,
    	long absoluteGlobalTimeInMilliseconds
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_START_TIME_IN_MILLISECONDS.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			absoluteGlobalTimeInMilliseconds
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_start_time_in_milliseconds].
    public static void ma_sound_group_set_start_time_in_milliseconds(
    	MaSound pGroup,
    	long absoluteGlobalTimeInMilliseconds
    ) {
    	ma_sound_group_set_start_time_in_milliseconds(
    		pGroup.memorySegment(),
    		absoluteGlobalTimeInMilliseconds
    	);
    }
    
    public static void ma_sound_group_set_stop_time_in_pcm_frames(
    	MemorySegment pGroup,
    	long absoluteGlobalTimeInFrames
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_STOP_TIME_IN_PCM_FRAMES.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			absoluteGlobalTimeInFrames
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_stop_time_in_pcm_frames].
    public static void ma_sound_group_set_stop_time_in_pcm_frames(
    	MaSound pGroup,
    	long absoluteGlobalTimeInFrames
    ) {
    	ma_sound_group_set_stop_time_in_pcm_frames(
    		pGroup.memorySegment(),
    		absoluteGlobalTimeInFrames
    	);
    }
    
    public static void ma_sound_group_set_stop_time_in_milliseconds(
    	MemorySegment pGroup,
    	long absoluteGlobalTimeInMilliseconds
    ) {
    	MethodHandle method = MA_SOUND_GROUP_SET_STOP_TIME_IN_MILLISECONDS.get();
    	try {
    		 method.invokeExact(
    			pGroup,
    			absoluteGlobalTimeInMilliseconds
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_set_stop_time_in_milliseconds].
    public static void ma_sound_group_set_stop_time_in_milliseconds(
    	MaSound pGroup,
    	long absoluteGlobalTimeInMilliseconds
    ) {
    	ma_sound_group_set_stop_time_in_milliseconds(
    		pGroup.memorySegment(),
    		absoluteGlobalTimeInMilliseconds
    	);
    }
    
    public static int ma_sound_group_is_playing(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_IS_PLAYING.get();
    	try {
    		return (int) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_is_playing].
    public static int ma_sound_group_is_playing(
    	MaSound pGroup
    ) {
    	return ma_sound_group_is_playing(
    		pGroup.memorySegment()
    	);
    }
    
    public static long ma_sound_group_get_time_in_pcm_frames(
    	MemorySegment pGroup
    ) {
    	MethodHandle method = MA_SOUND_GROUP_GET_TIME_IN_PCM_FRAMES.get();
    	try {
    		return (long) method.invokeExact(
    			pGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ma_sound_group_get_time_in_pcm_frames].
    public static long ma_sound_group_get_time_in_pcm_frames(
    	MaSound pGroup
    ) {
    	return ma_sound_group_get_time_in_pcm_frames(
    		pGroup.memorySegment()
    	);
    }

}