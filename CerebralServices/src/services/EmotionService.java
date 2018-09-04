package services;

import domain.Emotion;

import java.util.HashMap;
import java.util.Map;

public class EmotionService {

    public static final String EMOTION_NEUTRAL = "EMOTION_NEUTRAL";

    public static final String PREDICTIVE_ENVIRONMENT_NEUTRAL = "PREDICTIVE_ENVIRONMENT_NEUTRAL";
    public static final String PREDICTIVE_EMOTION_NEUTRAL = "PREDICTIVE_EMOTION_NEUTRAL";
    public static final String PREDICTIVE_EMOTION_TYPE_NEUTRAL = "PREDICTIVE_EMOTION_TYPE_NEUTRAL";
    public static final String PREDICTIVE_INTERRUPT_NEUTRAL = "PREDICTIVE_INTERRUPT_NEUTRAL";
    public static final String PREDICTIVE_EMOTION_WEIGHT_NEUTRAL = String.valueOf(1.0);
    public static final String PREDICTIVE_EMOTION_INTERRUPT_WEIGHT_NEUTRAL = String.valueOf(1.0);

    public static final String PRESCRIPTIVE_ENVIRONMENT_NEUTRAL = "PRESCRIPTIVE_ENVIRONMENT_NEUTRAL";
    public static final String PRESCRIPTIVE_EMOTION_NEUTRAL = "PRESCRIPTIVE_EMOTION_NEUTRAL";
    public static final String PRESCRIPTIVE_EMOTION_TYPE_NEUTRAL = "PRESCRIPTIVE_EMOTION_TYPE_NEUTRAL";
    public static final String PRESCRIPTIVE_INTERRUPT_NEUTRAL = "PRESCRIPTIVE_INTERRUPT_NEUTRAL";
    public static final String PRESCRIPTIVE_EMOTION_WEIGHT_NEUTRAL = String.valueOf(1.0);
    public static final String PRESCRIPTIVE_EMOTION_INTERRUPT_WEIGHT_NEUTRAL = String.valueOf(1.0);

    public Map<String, Emotion> getNeutralEmotionParams(){
        Map<String, Emotion> emotionMap = new HashMap<>();
        Emotion emotion = new Emotion();

        /* SET EMOTION ID */
        emotion.setId(1);
        /* SET PREDICTIVE EMOTION PARAMS */
        // Set environment
        emotion.setPredictiveEnvironment(PREDICTIVE_ENVIRONMENT_NEUTRAL);
        // Set emotion
        emotion.setPredictiveEmotion(PREDICTIVE_EMOTION_NEUTRAL);
        emotion.setPredictiveEmotionType(PREDICTIVE_EMOTION_TYPE_NEUTRAL);
        // Set emotion interrupt
        emotion.setPredictiveEmotionInterrupt(Boolean.FALSE);
        emotion.setPredictiveEmotionInterruptType(PREDICTIVE_INTERRUPT_NEUTRAL);
        /* SET PRESCRIPTIVE EMOTION PARAMS */
        // Set environment
        emotion.setPrescriptiveEnvironment(PRESCRIPTIVE_ENVIRONMENT_NEUTRAL);
        // Set emotion
        emotion.setPrescriptiveEmotion(PRESCRIPTIVE_EMOTION_NEUTRAL);
        emotion.setPrescriptiveEmotionType(PRESCRIPTIVE_EMOTION_TYPE_NEUTRAL);
        // Set emotion interrupt
        emotion.setPrescriptiveEmotionInterrupt(Boolean.FALSE);
        emotion.setPrescriptiveEmotionInterruptType(PRESCRIPTIVE_INTERRUPT_NEUTRAL);


        emotionMap.put(EMOTION_NEUTRAL, emotion);

        return emotionMap;
    }

    public Map<String, Emotion> getNeutralEmotion(Map<String, Emotion> emotionMap){

        if(emotionMap.get(EMOTION_NEUTRAL) != null){
            Emotion emotion = emotionMap.get(EMOTION_NEUTRAL);
            emotion.setPredictiveEmotionWeight(PREDICTIVE_EMOTION_WEIGHT_NEUTRAL);
            emotion.setPredictiveEmotionInterruptWeight(PREDICTIVE_EMOTION_INTERRUPT_WEIGHT_NEUTRAL);
            emotion.setPrescriptiveEmotionWeight(PRESCRIPTIVE_EMOTION_WEIGHT_NEUTRAL);
            emotion.setPrescriptiveEmotionInterruptWeight(PRESCRIPTIVE_EMOTION_INTERRUPT_WEIGHT_NEUTRAL);
        }

        return emotionMap;
    }


}
